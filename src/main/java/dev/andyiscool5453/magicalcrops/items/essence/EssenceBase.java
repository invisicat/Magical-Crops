package dev.andyiscool5453.magicalcrops.items.essence;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class EssenceBase extends Item {
	public EssenceBase(String name, CreativeTabs tab) {
		this.setUnlocalizedName(name);
		this.setRegistryName(name);
		this.setCreativeTab(tab);
	}

}
