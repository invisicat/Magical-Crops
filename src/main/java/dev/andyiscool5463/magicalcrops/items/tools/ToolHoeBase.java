package dev.andyiscool5463.magicalcrops.items.tools;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ToolHoeBase extends ItemHoe {
	
	
	public ToolHoeBase(String name, ToolMaterial material, CreativeTabs tab) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		// TODO Auto-generated constructor stub
	}
	/**
     * Called when a Block is destroyed using this Item. Return true to trigger the "Use Item" statistic.
     */
	
}
