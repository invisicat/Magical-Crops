package dev.andyiscool5463.magicalcrops.blocks.furnace.accio;

import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IContainerListener;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.util.math.MathHelper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ContainerFurnaceAccio extends Container {
	
	private final TileEntityFurnaceAccio tileentity;
	
	private int cookTime;
	private int totalCookTime;
	private int burnTime;
	private int currentBurnTime;
	public static final int INPUT_1 = 0, FUEL = 1, OUTPUT = 2;
	public ContainerFurnaceAccio(InventoryPlayer player, TileEntityFurnaceAccio tileentity) {
		this.tileentity = tileentity;
		this.addSlotToContainer(new Slot(tileentity, 0, 56, 17));
		this.addSlotToContainer(new SlotDualFurnaceFuel(tileentity, 2, 56, 53));
		this.addSlotToContainer(new SlotDualFurnaceOutput(player.player, tileentity, 3, 116, 35));
		// Player Inventory, Slot 9-35, Slot IDs 4-30
	    for (int y = 0; y < 3; ++y) {
	        for (int x = 0; x < 9; ++x) {
	            this.addSlotToContainer(new Slot(player, x + y * 9 + 9, 8 + x 	* 18, 84 + y * 18));
	        }
	    }

	    // Player Inventory, Slot 0-8, Slot IDs 31-39
	    for (int x = 0; x < 9; ++x) {
	        this.addSlotToContainer(new Slot(player, x, 8 + x * 18, 142));
	    }
	}
	
	@Override
	public void addListener(IContainerListener listener) {
		super.addListener(listener);
		listener.sendAllWindowProperties(this, this.tileentity);
	}
	
	@Override
	public void detectAndSendChanges() {
		super.detectAndSendChanges();
		
		for(int i = 0; i < this.listeners.size(); ++i) {
			IContainerListener listener = (IContainerListener)this.listeners.get(i);
			
			if(this.cookTime != this.tileentity.getField(2))
				listener.sendWindowProperty(this, 2, this.tileentity.getField(2));
			if(this.burnTime != this.tileentity.getField(0))
				listener.sendWindowProperty(this, 0, this.tileentity.getField(0));
			if(this.currentBurnTime != this.tileentity.getField(1))
				listener.sendWindowProperty(this, 1, this.tileentity.getField(1));
			if(this.totalCookTime != this.tileentity.getField(3))
				listener.sendWindowProperty(this, 3, this.tileentity.getField(3));
		}
		
		this.cookTime = this.tileentity.getField(2);
		this.burnTime = this.tileentity.getField(0);
		this.currentBurnTime = this.tileentity.getField(1);
		this.totalCookTime = this.tileentity.getField(3);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void updateProgressBar(int id, int data) {
		this.tileentity.setField(id, data);
	}
	
	@Override
	public boolean canInteractWith(EntityPlayer playerIn) {
		return this.tileentity.isUsableByPlayer(playerIn);
	}
	
	/**
	* Called when a player shift-clicks on a slot. You must override this or you will crash when someone does that.
	*/
	@Override
    public ItemStack transferStackInSlot(EntityPlayer playerIn, int slotIndex) {
		ItemStack itemStack1 = ItemStack.EMPTY; // make the first stack null; we will copy it later
		Slot slot = inventorySlots.get(slotIndex); // get the slots from GUI
		if(slot != null && slot.getHasStack()) { // this checks to make sure the slot isnt null or empty
			/*DEBUG*/ 
			ItemStack itemStack2 = slot.getStack(); // this gets the stack that the user has grabbed
			// System.out.println(mergeItemStack(itemStack2, sizeInventory, sizeInventory + 36, false)); 	DO NOT UNCOMMIT THIS SHIT FUCKING CRASHES SHIT FUCK FUCK
			itemStack1 = itemStack2.copy(); // this copies the user's stack and puts it into the slot 
			
			if(slotIndex == INPUT_1 && !mergeItemStack(itemStack2, 3, 39, false)) { // THIS IS FOR INPUT -> INVENTORY
				return ItemStack.EMPTY;
			}
			if(slotIndex == FUEL && !mergeItemStack(itemStack2, 3, 39, false)) { // THIS IS FOR FUEL -> Inventory
				return ItemStack.EMPTY;
			}
			if(slotIndex == OUTPUT) { // if the slot is the output
				
				if(!mergeItemStack(itemStack2, OUTPUT+1, 39, true)) { // this merges the stack that the user grabbed
																						   // and puts it into our inventory in reverse order
					                                                                       // though this checks for if it is NOT
					return ItemStack.EMPTY; // nothing happens
				}
				
				slot.onSlotChange(itemStack2, itemStack1);
			}
			else if(slotIndex != INPUT_1) { // checks if the index is not in the input
				if(FurnaceRecipes.instance().getSmeltingResult(itemStack2) != ItemStack.EMPTY) { // checks if the user's stack is smeltable
					if(!mergeItemStack(itemStack2,INPUT_1,INPUT_1+1,false)) { // if it cant merge into the input slot
						return ItemStack.EMPTY;
					}
				} else if(TileEntityFurnaceAccio.isItemFuel(itemStack2)) {
					if(!mergeItemStack(itemStack2, FUEL,FUEL+1, false)) { 
						return ItemStack.EMPTY;
					} /* Player Inventory Slots */
				} else if(slotIndex >= 3 && slotIndex < 29) { // if the slot clicked is in the inventory not hotbar
					 if (!mergeItemStack(itemStack2, 30, 38, false)) {
	                        return ItemStack.EMPTY;
	                 } //hot bar slot
				} else if (slotIndex >= 30 && !mergeItemStack(itemStack2, 3, 29, false)) {
					return ItemStack.EMPTY;
                } else if (!mergeItemStack(itemStack2, 30, 38, false)) {
                    return ItemStack.EMPTY;
                }
				
				if (itemStack2.getCount() == 0) {
                    slot.putStack(ItemStack.EMPTY);
                }
                else {
                    slot.onSlotChanged();
                }

                if (itemStack2.getCount() == itemStack1.getCount()) {
                    return ItemStack.EMPTY;
                }
			}
			if(itemStack1.isEmpty())
				slot.putStack(ItemStack.EMPTY);
			else
				slot.onSlotChanged();
			if(itemStack1.getCount() == itemStack2.getCount())
				return ItemStack.EMPTY;
			slot.onTake(playerIn, itemStack1);
		}
		
		return itemStack1;
		
    }
}
class SlotDualFurnaceFuel extends Slot {

	public SlotDualFurnaceFuel(IInventory inventoryIn, int index, int xPosition, int yPosition) {
		super(inventoryIn, index, xPosition, yPosition);
	}
	
	@Override
	public boolean isItemValid(ItemStack stack) {
		return TileEntityFurnaceAccio.isItemFuel(stack);
	}
	
	@Override
	public int getItemStackLimit(ItemStack stack) {
		return super.getItemStackLimit(stack);
	}
}

class SlotDualFurnaceOutput extends Slot {
	
	private final EntityPlayer player;
	private int removeCount;
	
	public SlotDualFurnaceOutput(EntityPlayer player, IInventory inventoryIn, int index, int xPosition, int yPosition) {
		super(inventoryIn, index, xPosition, yPosition);
		this.player = player;
	}
	
	@Override
	public boolean isItemValid(ItemStack stack) {
		return false;
	}
	
	@Override
	public ItemStack decrStackSize(int amount) {
		if(this.getHasStack())
			this.removeCount += Math.min(amount, this.getStack().getCount());
		return super.decrStackSize(amount);
	}
	
	@Override
	public ItemStack onTake(EntityPlayer player, ItemStack stack) {
		this.onCrafting(stack);
		super.onTake(player, stack);
		return stack;
	}
	
	@Override
	protected void onCrafting(ItemStack stack, int amount) {
		this.removeCount += amount;
		this.onCrafting(stack);
	}
	
	@Override
	protected void onCrafting(ItemStack stack) {
		stack.onCrafting(this.player.world, this.player, this.removeCount);
		
		if(!this.player.world.isRemote) {
			int i = this.removeCount;
			float f = FurnaceRecipes.instance().getSmeltingExperience(stack);
			
			if(f == 0.0F)
				i = 0;
			else if(f < 1.0F) {
				int j = MathHelper.floor((float)i * f);
				
				if(j < MathHelper.ceil((float)i * f) && Math.random() < (double)((float)i * f - (float)j))
					++j;
				i = j;
			}
			
			while (i > 0) {
				int k = EntityXPOrb.getXPSplit(i);
				i -= k;
				this.player.world.spawnEntity(new EntityXPOrb(this.player.world, this.player.posX, this.player.posY + 0.5D, this.player.posZ + 0.5D, k));
			}
		}
		
		this.removeCount = 0;
	}
}