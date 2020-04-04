package dev.andyiscool5463.magicalcrops.items.Infusionstones;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class InfusionstoneExtreme extends InfusionstoneBase {

	public InfusionstoneExtreme(CreativeTabs tab) {
		super("infusionstone_extreme", tab);
		super.setMaxDamage(2048);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void	addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add("Strong -> Extreme");
	}

}