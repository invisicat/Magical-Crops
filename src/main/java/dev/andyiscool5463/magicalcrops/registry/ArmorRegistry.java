package dev.andyiscool5463.magicalcrops.registry;

import dev.andyiscool5463.magicalcrops.Reference;
import dev.andyiscool5463.magicalcrops.init.ModItems;
import dev.andyiscool5463.magicalcrops.items.armor.ItemAccioArmor;
import dev.andyiscool5463.magicalcrops.items.armor.ItemCrucioArmor;
import dev.andyiscool5463.magicalcrops.items.armor.ItemImperioArmor;
import dev.andyiscool5463.magicalcrops.items.armor.ItemZivicioArmor;
import dev.andyiscool5463.magicalcrops.items.tools.ToolHoeBase;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;

@ObjectHolder(Reference.MOD_ID)
public class ArmorRegistry {
	private static final CreativeTabs CreativeTab = new CreativeTabs("tabMagiclCropsArmour") {

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ModItems.ItemEssenceMinicio);
		}

		@Override
		public boolean hasSearchBar() {
			return true;
		}
	}.setBackgroundImageName("magicalcrops.png").setNoTitle();
	
	public static Item ItemArmorAccioHelmet;
	public static Item ItemArmorCrucioHelmet;
	public static Item ItemArmorImperioHelmet;
	public static Item ItemArmorZivicioHelmet;
	public static Item ItemArmorZivicioHelmetFeed;
	public static Item ItemArmorZivicioHelmetNight;
	public static Item ItemArmorZivicioHelmetWater;

	public static Item ItemArmorAccioChestplate;
	public static Item ItemArmorCrucioChestplate;
	public static Item ItemArmorImperioChestplate;
	public static Item ItemArmorZivicioChestplate;
	public static Item ItemArmorZivicioChestplateFire;
	public static Item ItemArmorZivicioChestplateWither;
	public static Item ItemArmorZivicioChestplatePoison;
	
	public static Item ItemArmorAccioLeggings;
	public static Item ItemArmorCrucioLeggings;
	public static Item ItemArmorImperioLeggings;
	public static Item ItemArmorZivicioLeggings;
	public static Item ItemArmorZivicioLeggingsBlind;
	public static Item ItemArmorZivicioLeggingsWeak;
	public static Item ItemArmorZivicioLeggingsConfusion;
	

	public static Item ItemArmorAccioBoots;
	public static Item ItemArmorCrucioBoots;
	public static Item ItemArmorImperioBoots;
	public static Item ItemArmorZivicioBoots;
	public static Item ItemArmorZivicioBootsStep;
	public static Item ItemArmorZivicioBootsSpeed;
	public static Item ItemArmorZivicioBootsJump;
	
	public static Item ItemToolAccioHoe;
	public static Item ItemToolAccioPickaxe;
	public static Item ItemToolAccioSword;
	public static Item ItemToolAccioSpade;

	public static Item ItemToolCrucioHoe;
	public static Item ItemToolCrucioPickaxe;
	public static Item ItemToolCrucioSword;
	public static Item ItemToolCrucioSpade;

	public static Item ItemToolImperioHoe;
	public static Item ItemToolImperioPickaxe;
	public static Item ItemToolImperioSword;
	public static Item ItemToolImperioSpade;

	public static Item ItemToolZivicioHoe;
	public static Item ItemToolZivicioPickaxe;
	public static Item ItemToolZivicioSword;
	public static Item ItemToolZivicioSpade;
	
	static final ArmorMaterial ACCIO_ARMOR = EnumHelper.addArmorMaterial("accio_armor",
			Reference.MOD_ID + ":accio_armour", 9, new int[] { 3, 8, 7, 3 }, 15, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
			1.5F);
	static final ArmorMaterial CRUCIO_ARMOR = EnumHelper.addArmorMaterial("crucio_armor",
			Reference.MOD_ID + ":crucio_armour", 9, new int[] { 4, 8, 7, 3 }, 20, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
			1.5F);
	static final ArmorMaterial IMPERIO_ARMOR = EnumHelper.addArmorMaterial("imperio_armor",
			Reference.MOD_ID + ":imperio_armour", 9, new int[] { 4, 8, 7, 4 }, 25, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
			1.5F);
	static final ArmorMaterial ZIVICIO_ARMOR = EnumHelper.addArmorMaterial("zivicio_armor",
			Reference.MOD_ID + ":zivicio_armour", 9, new int[] { 4, 9, 8, 3 }, 30, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
			1.5F);
	
	static final ToolMaterial ACCIO_TOOL = EnumHelper.addToolMaterial("accio_tool", 3, 10, 3.0F, 5.0F, 30);
	static final ToolMaterial CRUCIO_TOOL = EnumHelper.addToolMaterial("crucio_tool", 3, 11, 3.0F, 5.0F, 30);
	static final ToolMaterial IMPERIO_TOOL = EnumHelper.addToolMaterial("imperio_tool", 3, 12, 3.0F, 5.0F, 30);
	static final ToolMaterial ZIVICIO_TOOL = EnumHelper.addToolMaterial("zivicio_tool", 3, -1, 3.0F, 5.0F, 30);
	
	static {
		ItemArmorAccioHelmet = new ItemAccioArmor(ACCIO_ARMOR, 0, EntityEquipmentSlot.HEAD, "armour_accio_helmet").setCreativeTab(CreativeTab);
		ItemArmorAccioChestplate = new ItemAccioArmor(ACCIO_ARMOR, 1, EntityEquipmentSlot.CHEST, "armour_accio_chestplate").setCreativeTab(CreativeTab);
		ItemArmorAccioLeggings = new ItemAccioArmor(ACCIO_ARMOR, 2, EntityEquipmentSlot.LEGS, "armour_accio_leggings").setCreativeTab(CreativeTab);
		ItemArmorAccioBoots = new ItemAccioArmor(ACCIO_ARMOR, 2, EntityEquipmentSlot.FEET, "armour_accio_boots").setCreativeTab(CreativeTab);

		ItemArmorCrucioHelmet = new ItemCrucioArmor(CRUCIO_ARMOR, 0, EntityEquipmentSlot.HEAD, "armour_crucio_helmet").setCreativeTab(CreativeTab);
		ItemArmorCrucioChestplate = new ItemCrucioArmor(CRUCIO_ARMOR, 1, EntityEquipmentSlot.CHEST,"armour_crucio_chestplate").setCreativeTab(CreativeTab);
		ItemArmorCrucioLeggings = new ItemCrucioArmor(CRUCIO_ARMOR, 2, EntityEquipmentSlot.LEGS,"armour_crucio_leggings").setCreativeTab(CreativeTab);
		ItemArmorCrucioBoots = new ItemCrucioArmor(CRUCIO_ARMOR, 2, EntityEquipmentSlot.FEET, "armour_crucio_boots").setCreativeTab(CreativeTab);

		ItemArmorImperioHelmet = new ItemImperioArmor(IMPERIO_ARMOR, 0, EntityEquipmentSlot.HEAD,"armour_imperio_helmet").setCreativeTab(CreativeTab);
		ItemArmorImperioChestplate = new ItemImperioArmor(IMPERIO_ARMOR, 1, EntityEquipmentSlot.CHEST,"armour_imperio_chestplate").setCreativeTab(CreativeTab);
		ItemArmorImperioLeggings = new ItemImperioArmor(IMPERIO_ARMOR, 2, EntityEquipmentSlot.LEGS,"armour_imperio_leggings").setCreativeTab(CreativeTab);
		ItemArmorImperioBoots = new ItemImperioArmor(IMPERIO_ARMOR, 2, EntityEquipmentSlot.FEET, "armour_imperio_boots").setCreativeTab(CreativeTab);

		ItemArmorZivicioHelmet = new ItemZivicioArmor(ZIVICIO_ARMOR, 0, EntityEquipmentSlot.HEAD,
				"armour_zivicio_helmet").setCreativeTab(CreativeTab);
		ItemArmorZivicioChestplate = new ItemZivicioArmor(ZIVICIO_ARMOR, 1, EntityEquipmentSlot.CHEST,
				"armour_zivicio_chestplate").setCreativeTab(CreativeTab);
		ItemArmorZivicioLeggings = new ItemZivicioArmor(ZIVICIO_ARMOR, 2, EntityEquipmentSlot.LEGS,
				"armour_zivicio_leggings").setCreativeTab(CreativeTab);
		ItemArmorZivicioBoots = new ItemZivicioArmor(ZIVICIO_ARMOR, 2, EntityEquipmentSlot.FEET, "armour_zivicio_boots")
				.setCreativeTab(CreativeTab);
		
		
		ItemArmorZivicioHelmetFeed = new ItemZivicioArmor(ZIVICIO_ARMOR, 0, EntityEquipmentSlot.HEAD,
				"armour_zivicio_helmet_feed").setCreativeTab(CreativeTab);
		ItemArmorZivicioHelmetNight = new ItemZivicioArmor(ZIVICIO_ARMOR, 0, EntityEquipmentSlot.HEAD,
				"armour_zivicio_helmet_night").setCreativeTab(CreativeTab);
		ItemArmorZivicioHelmetWater = new ItemZivicioArmor(ZIVICIO_ARMOR, 0, EntityEquipmentSlot.HEAD,
				"armour_zivicio_helmet_water").setCreativeTab(CreativeTab);
		
		ItemArmorZivicioChestplateFire = new ItemZivicioArmor(ZIVICIO_ARMOR, 1, EntityEquipmentSlot.CHEST,
				"armour_zivicio_chestplate_fire").setCreativeTab(CreativeTab);
		ItemArmorZivicioChestplateWither = new ItemZivicioArmor(ZIVICIO_ARMOR, 1, EntityEquipmentSlot.CHEST,
				"armour_zivicio_chestplate_wither").setCreativeTab(CreativeTab);
		ItemArmorZivicioChestplatePoison = new ItemZivicioArmor(ZIVICIO_ARMOR, 1, EntityEquipmentSlot.CHEST,
				"armour_zivicio_chestplate_poison").setCreativeTab(CreativeTab);
		
		ItemArmorZivicioLeggingsBlind = new ItemZivicioArmor(ZIVICIO_ARMOR, 2, EntityEquipmentSlot.LEGS,
				"armour_zivicio_leggings_blind").setCreativeTab(CreativeTab);
		ItemArmorZivicioLeggingsWeak = new ItemZivicioArmor(ZIVICIO_ARMOR, 2, EntityEquipmentSlot.LEGS,
				"armour_zivicio_leggings_weak").setCreativeTab(CreativeTab);
		ItemArmorZivicioLeggingsConfusion = new ItemZivicioArmor(ZIVICIO_ARMOR, 2, EntityEquipmentSlot.LEGS,
				"armour_zivicio_leggings_confusion").setCreativeTab(CreativeTab);
		
		ItemArmorZivicioBootsStep = new ItemZivicioArmor(ZIVICIO_ARMOR, 2, EntityEquipmentSlot.FEET, "armour_zivicio_boots_step")
				.setCreativeTab(CreativeTab);
		ItemArmorZivicioBootsSpeed = new ItemZivicioArmor(ZIVICIO_ARMOR, 2, EntityEquipmentSlot.FEET, "armour_zivicio_boots_speed")
				.setCreativeTab(CreativeTab);
		ItemArmorZivicioBootsJump = new ItemZivicioArmor(ZIVICIO_ARMOR, 2, EntityEquipmentSlot.FEET, "armour_zivicio_boots_jump")
				.setCreativeTab(CreativeTab);
		
		ItemToolAccioHoe = new ToolHoeBase("tools_accio_hoe", ACCIO_TOOL, CreativeTab,1);
		ItemToolCrucioHoe = new ToolHoeBase("tools_crucio_hoe", CRUCIO_TOOL, CreativeTab,2);
		ItemToolImperioHoe = new ToolHoeBase("tools_imperio_hoe", IMPERIO_TOOL, CreativeTab,4);
		ItemToolZivicioHoe = new ToolHoeBase("tools_zivicio_hoe", ZIVICIO_TOOL, CreativeTab,8);
	}
}
