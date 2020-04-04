package dev.andyiscool5463.magicalcrops.items.Infusionstones;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class InfusionstoneRegular extends InfusionstoneBase {

	public InfusionstoneRegular(CreativeTabs tab) {
		super("infusionstone_regular", tab);
		super.setMaxDamage(512);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void	addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add("Weak -> Regular");
	}
}