package dev.andyiscool5463.magicalcrops.items.tools;

import java.util.List;

import org.lwjgl.input.Keyboard;

import com.mojang.realmsclient.gui.ChatFormatting;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ToolHoeBase extends ItemHoe {
	
	private int MinicioCount;
	
	public ToolHoeBase(String name, ToolMaterial material, CreativeTabs tab,int MinicioC) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(tab);
		MinicioCount = MinicioC;
		// TODO Auto-generated constructor stub
	}

	
	@Override
	@SideOnly(Side.CLIENT)
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		tooltip.add(ChatFormatting.WHITE + "Hold " + ChatFormatting.YELLOW + "SHIFT" + ChatFormatting.WHITE + " for more info:");
		if(Keyboard.isKeyDown(42) || Keyboard.isKeyDown(54)) {
			tooltip.add(ChatFormatting.ITALIC + "- "+ MinicioCount +" Extra essence from Minicio Crops.");
		}
	}
}
