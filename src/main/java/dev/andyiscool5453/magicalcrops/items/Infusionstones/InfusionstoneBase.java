package dev.andyiscool5453.magicalcrops.items.Infusionstones;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class InfusionstoneBase extends Item {
	public InfusionstoneBase(String name, CreativeTabs tab) {
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(tab);
		this.setMaxStackSize(1);
		this.setMaxDamage(256); // TODO: Change this shit out and make it dynamic
	}
	
	@Override
	public boolean hasContainerItem(ItemStack stack) {
		return true;
	}
	
	@Override
	public ItemStack getContainerItem(ItemStack stack) {
		ItemStack stuck = stack.copy();
		stuck.setItemDamage(stack.getItemDamage() + 1);
		return stuck;
	}
}
