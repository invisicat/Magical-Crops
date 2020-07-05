package dev.andyiscool5463.magicalcrops.items.armor;

import java.util.List;
import org.lwjgl.input.Keyboard;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import dev.andyiscool5463.magicalcrops.items.ItemEssenceArmor;
import dev.andyiscool5463.magicalcrops.registry.ArmorRegistry;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemZivicioArmor extends ItemEssenceArmor {


	private TextFormatting ChatFormatting;

	public ItemZivicioArmor(ArmorMaterial materialIn, int armorType, EntityEquipmentSlot slot, String name) {
		super(materialIn, armorType, slot);
		setUnlocalizedName(name);
		setRegistryName(name);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(ChatFormatting.WHITE + "Hold " + ChatFormatting.YELLOW + "SHIFT" + ChatFormatting.WHITE + " for more info:");
		if(Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54)) {
			tooltip.add(ChatFormatting.ITALIC + "- 96% Damage Reduction.");
			//TODO: CONFIGURATION PLEASE.
			tooltip.add(ChatFormatting.ITALIC + "- Negates fall damage");
			tooltip.add(ChatFormatting.ITALIC + "- Flight");
		}
		tooltip.add(ChatFormatting.WHITE + "Infusion");
		
		if(stack.getItem() == ArmorRegistry.ItemArmorZivicioHelmet || stack.getItem() == ArmorRegistry.ItemArmorZivicioChestplate || stack.getItem() == ArmorRegistry.ItemArmorZivicioLeggings || stack.getItem() == ArmorRegistry.ItemArmorZivicioBoots) {
			tooltip.add(ChatFormatting.ITALIC + "- No Infusion");
		}
		if(stack.getItem() == ArmorRegistry.ItemArmorZivicioHelmetFeed) {
			tooltip.add(ChatFormatting.ITALIC + "- Saturation");
		}
		if(stack.getItem() == ArmorRegistry.ItemArmorZivicioHelmetNight) {
			tooltip.add(ChatFormatting.ITALIC + "- Night Vision");
		}
		if(stack.getItem() == ArmorRegistry.ItemArmorZivicioHelmetWater) {
			tooltip.add(ChatFormatting.ITALIC + "- Water Breathing");
		}
		if(stack.getItem() == ArmorRegistry.ItemArmorZivicioChestplateFire) {
			tooltip.add(ChatFormatting.ITALIC + "- Fire Protection");
		}
		if(stack.getItem() == ArmorRegistry.ItemArmorZivicioChestplateWither) {
			tooltip.add(ChatFormatting.ITALIC + "- Wither Protection");
		}
		if(stack.getItem() == ArmorRegistry.ItemArmorZivicioChestplatePoison) {
			tooltip.add(ChatFormatting.ITALIC + "- Poison Protection");
		}
		if(stack.getItem() == ArmorRegistry.ItemArmorZivicioLeggingsWeak) {
			tooltip.add(ChatFormatting.ITALIC + "- Weakness Protection");
		}
		if(stack.getItem() == ArmorRegistry.ItemArmorZivicioLeggingsConfusion) {
			tooltip.add(ChatFormatting.ITALIC + "- Confusion Protection");
		}
		if(stack.getItem() == ArmorRegistry.ItemArmorZivicioLeggingsBlind) {
			tooltip.add(ChatFormatting.ITALIC + "- Blindness Protection");
		}
		if(stack.getItem() == ArmorRegistry.ItemArmorZivicioBootsSpeed) {
			tooltip.add(ChatFormatting.ITALIC + "- Speed Increase");
		}
		if(stack.getItem() == ArmorRegistry.ItemArmorZivicioBootsStep) {
			tooltip.add(ChatFormatting.ITALIC + "- Step Assist");
		}
		if(stack.getItem() == ArmorRegistry.ItemArmorZivicioBootsJump) {
			tooltip.add(ChatFormatting.ITALIC + "- Jump Boost");
		}
	}
	@Override
	public void onArmorTick(World worldIn, EntityPlayer player, ItemStack stack) {
		
		ItemStack getBoots = player.getItemStackFromSlot(EntityEquipmentSlot.FEET);
		ItemStack getLegs = player.getItemStackFromSlot(EntityEquipmentSlot.LEGS);
		ItemStack getChest = player.getItemStackFromSlot(EntityEquipmentSlot.CHEST);
		ItemStack getHead = player.getItemStackFromSlot(EntityEquipmentSlot.HEAD);
		
		if(getBoots != null && getLegs != null && getChest != null && getHead != null) {
			if(getBoots.getItem() instanceof ItemZivicioArmor && getLegs.getItem() instanceof ItemZivicioArmor && getChest.getItem() instanceof ItemZivicioArmor && getHead.getItem() == ArmorRegistry.ItemArmorZivicioHelmetFeed && player.getFoodStats().getFoodLevel() != 20) {
				 player.getFoodStats().setFoodLevel(1);
			}
			if(getBoots.getItem() instanceof ItemZivicioArmor && getLegs.getItem() instanceof ItemZivicioArmor && getChest.getItem() instanceof ItemZivicioArmor && getHead.getItem() == ArmorRegistry.ItemArmorZivicioHelmetWater && player.isInWater()) {
				player.setAir(300);
			}
			if (getBoots.getItem() instanceof ItemZivicioArmor && getLegs.getItem() instanceof ItemZivicioArmor && getChest.getItem() instanceof ItemZivicioArmor && getHead.getItem() == ArmorRegistry.ItemArmorZivicioHelmetNight) {
				player.addPotionEffect(new PotionEffect(Potion.getPotionById(16), 300, 0, true, false));
			}
			if (getBoots.getItem() instanceof ItemZivicioArmor && getLegs.getItem() instanceof ItemZivicioArmor && getChest.getItem() == ArmorRegistry.ItemArmorZivicioChestplateWither && getHead.getItem() instanceof ItemZivicioArmor && player.isPotionActive(Potion.getPotionById(20))) {
				player.removePotionEffect(Potion.getPotionById(20));
			}
			if (getBoots.getItem() instanceof ItemZivicioArmor && getLegs.getItem() instanceof ItemZivicioArmor && getChest.getItem() == ArmorRegistry.ItemArmorZivicioChestplatePoison && getHead.getItem() instanceof ItemZivicioArmor && player.isPotionActive(Potion.getPotionById(19))) {
				player.removePotionEffect(Potion.getPotionById(19));
			}
			// https://forums.minecraftforge.net/topic/60252-112-where-is-entitylivingbasemoveentitywithheading-method-from-1102-solved/
			if (getBoots.getItem() == ArmorRegistry.ItemArmorZivicioBootsSpeed && getLegs.getItem() instanceof ItemZivicioArmor && getChest.getItem() instanceof ItemZivicioArmor && getHead.getItem() instanceof ItemZivicioArmor) {
				if (!player.isInWater() && !player.capabilities.isFlying) {
					player.travel(player.moveStrafing * 0.4F,player.moveForward * 0.4F,player.moveForward * 0.4F);
				} else if (!player.isInWater() && player.isAirBorne) {
					player.travel(player.moveStrafing * 0.1F, player.moveForward * 0.1F,player.moveForward * 0.1F);
				}
			}
			if (getBoots.getItem() == ArmorRegistry.ItemArmorZivicioBootsJump && getLegs.getItem() instanceof ItemZivicioArmor && getChest.getItem() instanceof ItemZivicioArmor && getHead.getItem() instanceof ItemZivicioArmor) {
				if (player.isSneaking()) {
					return;
				}

				player.addPotionEffect(new PotionEffect(Potion.getPotionById(8), 15, 2, true, false));
			}
			if (getBoots.getItem() instanceof ItemZivicioArmor && getLegs.getItem() == ArmorRegistry.ItemArmorZivicioLeggingsBlind && getChest.getItem() instanceof ItemZivicioArmor && getHead.getItem() instanceof ItemZivicioArmor && player.isPotionActive(Potion.getPotionById(15))) {
				player.removePotionEffect(Potion.getPotionById(15));
			}

			if (getBoots.getItem() instanceof ItemZivicioArmor && getLegs.getItem() == ArmorRegistry.ItemArmorZivicioLeggingsWeak && getChest.getItem() instanceof ItemZivicioArmor && getHead.getItem() instanceof ItemZivicioArmor && player.isPotionActive(Potion.getPotionById(18))) {
				player.removePotionEffect(Potion.getPotionById(18));
			}

			if (getBoots.getItem() instanceof ItemZivicioArmor && getLegs.getItem() == ArmorRegistry.ItemArmorZivicioLeggingsConfusion && getChest.getItem() instanceof ItemZivicioArmor && getHead.getItem() instanceof ItemZivicioArmor && player.isPotionActive(Potion.getPotionById(9))) {
				player.removePotionEffect(Potion.getPotionById(9));
			}
			if (getBoots != null && getLegs != null && getChest != null && getHead != null) {
				if (getBoots.getItem() instanceof ItemZivicioArmor && getLegs.getItem() instanceof ItemZivicioArmor && getChest.getItem() instanceof ItemZivicioArmor && getHead.getItem() instanceof ItemZivicioArmor) {
					player.capabilities.allowFlying = true;
				}
			} else if (!player.capabilities.isCreativeMode) {
				player.capabilities.allowFlying = false;
				player.capabilities.isFlying = false;
				player.sendPlayerAbilities();
			}
			if (getBoots != null && getLegs != null && getChest != null && getHead != null) {
				if (getBoots.getItem() == ArmorRegistry.ItemArmorZivicioBootsStep && getLegs.getItem() instanceof ItemZivicioArmor && getChest.getItem() instanceof ItemZivicioArmor && getHead.getItem() instanceof ItemZivicioArmor) {
					player.stepHeight = 1.0F;
				}
			} else {
				player.stepHeight = 0.5F;
			}


		}
	}
}
