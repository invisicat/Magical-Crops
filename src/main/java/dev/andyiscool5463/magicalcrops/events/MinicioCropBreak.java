package dev.andyiscool5463.magicalcrops.events;

import dev.andyiscool5463.magicalcrops.init.ModBlocks;
import dev.andyiscool5463.magicalcrops.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class MinicioCropBreak {
	static Block MinicioCrop = ModBlocks.BlockCropMinicio;
	
	@SubscribeEvent
	   public static void onCropBreak(HarvestDropsEvent event) {
	      if (event.getHarvester() != null && event.getHarvester().getHeldItemMainhand() != null && event.getState().getBlock() == MinicioCrop && event.getState().getBlock().getMetaFromState(event.getState()) == 7) {
	         if (event.getHarvester().getHeldItemMainhand().getItem() == ModItems.ItemToolAccioHoe) {
	            event.getDrops().add(new ItemStack(ModItems.ItemEssenceMinicio, 1));
	         }

	         if (event.getHarvester().getHeldItemMainhand().getItem() == ModItems.ItemToolCrucioHoe) {
	            event.getDrops().add(new ItemStack(ModItems.ItemEssenceMinicio, 2));
	         }

	         if (event.getHarvester().getHeldItemMainhand().getItem() == ModItems.ItemToolImperioHoe) {
	            event.getDrops().add(new ItemStack(ModItems.ItemEssenceMinicio, 4));
	         }

	         if (event.getHarvester().getHeldItemMainhand().getItem() == ModItems.ItemToolZivicioHoe) {
	            event.getDrops().add(new ItemStack(ModItems.ItemEssenceMinicio, 8));
	         }
	      }

	   }

}
