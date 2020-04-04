package dev.andyiscool5463.magicalcrops.items.Infusionstones;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class InfusionstoneStrong extends InfusionstoneBase {

	public InfusionstoneStrong(CreativeTabs tab) {
		super("infusionstone_strong", tab);
		super.setMaxDamage(1024);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void	addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add("Weak -> Strong");
	}
}