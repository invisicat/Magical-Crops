package dev.andyiscool5463.magicalcrops.blocks.furnace;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class TutorialGuiHandler implements IGuiHandler{
	
	public static final int DUAL_FURNACE_GUI = 0;
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch(ID) {
		case DUAL_FURNACE_GUI:
			return new ContainerDualFurnace(player.inventory, ((TileEntityFurnace)world.getTileEntity(new BlockPos(x, y, z))));
		default:
			return null;
		}
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch(ID) {
		case DUAL_FURNACE_GUI:
			return new GuiDualFurnace(player.inventory, ((TileEntityFurnace)world.getTileEntity(new BlockPos(x, y, z))));
		default:
			return null;
		}
	}
}