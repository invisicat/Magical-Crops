package dev.andyiscool5463.magicalcrops;

import dev.andyiscool5463.magicalcrops.blocks.furnace.accio.ContainerFurnaceAccio;
import dev.andyiscool5463.magicalcrops.blocks.furnace.accio.ContainerFurnaceCrucio;
import dev.andyiscool5463.magicalcrops.blocks.furnace.accio.ContainerFurnaceImperio;
import dev.andyiscool5463.magicalcrops.blocks.furnace.accio.ContainerFurnaceUltimate;
import dev.andyiscool5463.magicalcrops.blocks.furnace.accio.ContainerFurnaceZivicio;
import dev.andyiscool5463.magicalcrops.blocks.furnace.accio.GuiFurnaceAccio;
import dev.andyiscool5463.magicalcrops.blocks.furnace.accio.GuiFurnaceCrucio;
import dev.andyiscool5463.magicalcrops.blocks.furnace.accio.GuiFurnaceImperio;
import dev.andyiscool5463.magicalcrops.blocks.furnace.accio.GuiFurnaceUltimate;
import dev.andyiscool5463.magicalcrops.blocks.furnace.accio.GuiFurnaceZivicio;
import dev.andyiscool5463.magicalcrops.blocks.furnace.accio.TileEntityFurnaceAccio;
import dev.andyiscool5463.magicalcrops.blocks.furnace.accio.TileEntityFurnaceCrucio;
import dev.andyiscool5463.magicalcrops.blocks.furnace.accio.TileEntityFurnaceImperio;
import dev.andyiscool5463.magicalcrops.blocks.furnace.accio.TileEntityFurnaceUltimate;
import dev.andyiscool5463.magicalcrops.blocks.furnace.accio.TileEntityFurnaceZivicio;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class TutorialGuiHandler implements IGuiHandler{
	
	public static final int DUAL_FURNACE_GUI = 0;
	public static final int FURNACE_ACCIO = 0;
	public static final int FURNACE_CRUCIO = 1;
	public static final int FURNACE_IMPERIO = 2;
	public static final int FURNACE_ULTIMATE = 3;
	public static final int FURNACE_ZIVICIO = 4;
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch(ID) {
		case DUAL_FURNACE_GUI:
			return new ContainerFurnaceAccio(player.inventory, ((TileEntityFurnaceAccio)world.getTileEntity(new BlockPos(x, y, z))));
		case FURNACE_CRUCIO:
			return new ContainerFurnaceCrucio(player.inventory, ((TileEntityFurnaceCrucio)world.getTileEntity(new BlockPos(x, y, z))));
		case FURNACE_IMPERIO:
			return new ContainerFurnaceImperio(player.inventory, ((TileEntityFurnaceImperio)world.getTileEntity(new BlockPos(x, y, z))));
		case FURNACE_ULTIMATE:
			return new ContainerFurnaceUltimate(player.inventory, ((TileEntityFurnaceUltimate)world.getTileEntity(new BlockPos(x, y, z))));
		case FURNACE_ZIVICIO:
			return new ContainerFurnaceZivicio(player.inventory, ((TileEntityFurnaceZivicio)world.getTileEntity(new BlockPos(x, y, z))));
		default:
			return null;
		}
	}
	
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		switch(ID) {
		case DUAL_FURNACE_GUI:
			return new GuiFurnaceAccio(player.inventory, ((TileEntityFurnaceAccio)world.getTileEntity(new BlockPos(x, y, z))));
		case FURNACE_CRUCIO:
			return new GuiFurnaceCrucio(player.inventory, ((TileEntityFurnaceCrucio)world.getTileEntity(new BlockPos(x, y, z))));
		case FURNACE_IMPERIO:
			return new GuiFurnaceImperio(player.inventory, ((TileEntityFurnaceImperio)world.getTileEntity(new BlockPos(x, y, z))));
		case FURNACE_ULTIMATE:
			return new GuiFurnaceUltimate(player.inventory, ((TileEntityFurnaceUltimate)world.getTileEntity(new BlockPos(x, y, z))));
		case FURNACE_ZIVICIO:
			return new GuiFurnaceZivicio(player.inventory, ((TileEntityFurnaceZivicio)world.getTileEntity(new BlockPos(x, y, z))));
				
		default:
			return null;
		}
	}
}