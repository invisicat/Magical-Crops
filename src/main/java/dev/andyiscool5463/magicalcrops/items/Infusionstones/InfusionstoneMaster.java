package dev.andyiscool5463.magicalcrops.items.Infusionstones;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class InfusionstoneMaster extends InfusionstoneBase {

	public InfusionstoneMaster(CreativeTabs tab) {
		super("infusionstone_master", tab);
		super.setMaxDamage(-1);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void	addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add("Extreme -> Master");
	}
}