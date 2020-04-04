package dev.andyiscool5463.magicalcrops.items.essence;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EssenceZivicio extends EssenceBase {
	public EssenceZivicio(CreativeTabs tab) {
		super("essence_zivicio", tab);
	}
	@Override
	public void	addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add("Imperio -> Zivicio");
	}
}
