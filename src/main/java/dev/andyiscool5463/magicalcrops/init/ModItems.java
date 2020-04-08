package dev.andyiscool5463.magicalcrops.init;

import dev.andyiscool5463.magicalcrops.Reference;
import dev.andyiscool5463.magicalcrops.items.ItemBasic;
import dev.andyiscool5463.magicalcrops.items.Infusionstones.InfusionstoneExtreme;
import dev.andyiscool5463.magicalcrops.items.Infusionstones.InfusionstoneMaster;
import dev.andyiscool5463.magicalcrops.items.Infusionstones.InfusionstoneRegular;
import dev.andyiscool5463.magicalcrops.items.Infusionstones.InfusionstoneStrong;
import dev.andyiscool5463.magicalcrops.items.Infusionstones.InfusionstoneWeak;
import dev.andyiscool5463.magicalcrops.items.armor.ItemAccioArmor;
import dev.andyiscool5463.magicalcrops.items.armor.ItemCrucioArmor;
import dev.andyiscool5463.magicalcrops.items.essence.EssenceAccio;
import dev.andyiscool5463.magicalcrops.items.essence.EssenceAir;
import dev.andyiscool5463.magicalcrops.items.essence.EssenceCoal;
import dev.andyiscool5463.magicalcrops.items.essence.EssenceCrucio;
import dev.andyiscool5463.magicalcrops.items.essence.EssenceDiamond;
import dev.andyiscool5463.magicalcrops.items.essence.EssenceDye;
import dev.andyiscool5463.magicalcrops.items.essence.EssenceEarth;
import dev.andyiscool5463.magicalcrops.items.essence.EssenceEmerald;
import dev.andyiscool5463.magicalcrops.items.essence.EssenceExperience;
import dev.andyiscool5463.magicalcrops.items.essence.EssenceFire;
import dev.andyiscool5463.magicalcrops.items.essence.EssenceGlowstone;
import dev.andyiscool5463.magicalcrops.items.essence.EssenceGold;
import dev.andyiscool5463.magicalcrops.items.essence.EssenceImperio;
import dev.andyiscool5463.magicalcrops.items.essence.EssenceIron;
import dev.andyiscool5463.magicalcrops.items.essence.EssenceLapis;
import dev.andyiscool5463.magicalcrops.items.essence.EssenceMinicio;
import dev.andyiscool5463.magicalcrops.items.essence.EssenceNature;
import dev.andyiscool5463.magicalcrops.items.essence.EssenceNether;
import dev.andyiscool5463.magicalcrops.items.essence.EssenceObsidian;
import dev.andyiscool5463.magicalcrops.items.essence.EssenceQuartz;
import dev.andyiscool5463.magicalcrops.items.essence.EssenceRedstone;
import dev.andyiscool5463.magicalcrops.items.essence.EssenceWater;
import dev.andyiscool5463.magicalcrops.items.essence.EssenceZivicio;
import dev.andyiscool5463.magicalcrops.items.tools.ToolHoeBase;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@ObjectHolder(Reference.MOD_ID)
@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class ModItems {

	public static Item ItemEssenceMinicio;
	public static Item ItemEssenceAccio;
	public static Item ItemEssenceCrucio;
	public static Item ItemEssenceImperio;
	public static Item ItemEssenceZivicio;

	public static Item ItemEssenceAir;
	public static Item ItemEssenceCoal;
	public static Item ItemEssenceDiamond;
	public static Item ItemEssenceDye;
	public static Item ItemEssenceEarth;
	public static Item ItemEssenceEmerald;
	public static Item ItemEssenceExperience;
	public static Item ItemEssenceFire;
	public static Item ItemEssenceGlowstone;
	public static Item ItemEssenceGold;
	public static Item ItemEssenceIron;
	public static Item ItemEssenceLapis;
	public static Item ItemEssenceNature;
	public static Item ItemEssenceNether;
	public static Item ItemEssenceObsidian;
	public static Item ItemEssenceQuartz;
	public static Item ItemEssenceRedstone;
	public static Item ItemEssenceWater;
	public static Item ItemEssenceWither;;

	public static Item ItemInfusionstoneWeak;
	public static Item ItemInfusionstoneRegular;
	public static Item ItemInfusionstoneStrong;
	public static Item ItemInfusionstoneExtreme;
	public static Item ItemInfusionstoneMaster;

	public static Item ItemSeedAir;
	public static Item ItemSeedCoal;
	public static Item ItemSeedDiamond;
	public static Item ItemSeedDye;
	public static Item ItemSeedEarth;
	public static Item ItemSeedMinicio;
	public static Item ItemSeedEmerald;
	public static Item ItemSeedExperience;
	public static Item ItemSeedFire;
	public static Item ItemSeedGlowstone;
	public static Item ItemSeedGold;
	public static Item ItemSeedIron;
	public static Item ItemSeedLapis;
	public static Item ItemSeedNature;
	public static Item ItemSeedNether;
	public static Item ItemSeedObsidian;
	public static Item ItemSeedQuartz;
	public static Item ItemSeedRedstone;
	public static Item ItemSeedWater;
	public static Item ItemSeedWither;

	public static Item ItemFurnaceAccio;
	public static Item ItemFurnaceCrucio;
	public static Item ItemFurnaceImperio;
	public static Item ItemFurnaceUltimate;
	public static Item ItemFurnaceZivicio;

	public static Item ItemOreMinicio;

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

	public static Item ItemArmorAccioHelmet;
	public static Item ItemArmorCrucioHelmet;
	public static Item ItemArmorImperioHelmet;
	public static Item ItemArmorZivicioHelmet;

	public static Item ItemArmorAccioChestplate;
	public static Item ItemArmorCrucioChestplate;
	public static Item ItemArmorImperioChestplate;
	public static Item ItemArmorZivicioChestplate;

	public static Item ItemArmorAccioLeggings;
	public static Item ItemArmorCrucioLeggings;
	public static Item ItemArmorImperioLeggings;
	public static Item ItemArmorZivicioLeggings;

	public static Item ItemArmorAccioBoots;
	public static Item ItemArmorCrucioBoots;
	public static Item ItemArmorImperioBoots;
	public static Item ItemArmorZivicioBoots;

	static Item ROCK;

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

	/*
	 * Magical Crops Tab menu
	 */
	static final CreativeTabs CreativeTab = new CreativeTabs("tabMagicalCrops") {

		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(ItemEssenceMinicio);
		}

		@Override
		public boolean hasSearchBar() {
			return true;
		}
	}.setBackgroundImageName("magicalcrops.png").setNoTitle();

	public static void init() {
		ROCK = new ItemBasic("tutorial_apple").setCreativeTab(CreativeTab);

		ItemEssenceMinicio = new EssenceMinicio(CreativeTab);
		ItemEssenceAccio = new EssenceAccio(CreativeTab);
		ItemEssenceCrucio = new EssenceCrucio(CreativeTab);
		ItemEssenceImperio = new EssenceImperio(CreativeTab);
		ItemEssenceZivicio = new EssenceZivicio(CreativeTab);

		ItemEssenceAir = new EssenceAir(CreativeTab);
		ItemEssenceCoal = new EssenceCoal(CreativeTab);
		ItemEssenceDiamond = new EssenceDiamond(CreativeTab);
		ItemEssenceDye = new EssenceDye(CreativeTab);
		ItemEssenceEarth = new EssenceEarth(CreativeTab);
		ItemEssenceEmerald = new EssenceEmerald(CreativeTab);
		ItemEssenceExperience = new EssenceExperience(CreativeTab);
		ItemEssenceFire = new EssenceFire(CreativeTab);
		ItemEssenceGlowstone = new EssenceGlowstone(CreativeTab);
		ItemEssenceGold = new EssenceGold(CreativeTab);
		ItemEssenceIron = new EssenceIron(CreativeTab);
		ItemEssenceLapis = new EssenceLapis(CreativeTab);
		ItemEssenceNature = new EssenceNature(CreativeTab);
		ItemEssenceNether = new EssenceNether(CreativeTab);
		ItemEssenceObsidian = new EssenceObsidian(CreativeTab);
		ItemEssenceQuartz = new EssenceQuartz(CreativeTab);
		ItemEssenceRedstone = new EssenceRedstone(CreativeTab);
		ItemEssenceWater = new EssenceWater(CreativeTab);

		ItemInfusionstoneWeak = new InfusionstoneWeak(CreativeTab);
		ItemInfusionstoneRegular = new InfusionstoneRegular(CreativeTab);
		ItemInfusionstoneStrong = new InfusionstoneStrong(CreativeTab);
		ItemInfusionstoneExtreme = new InfusionstoneExtreme(CreativeTab);
		ItemInfusionstoneMaster = new InfusionstoneMaster(CreativeTab);

		ItemToolAccioHoe = new ToolHoeBase("tools_accio_hoe", ACCIO_TOOL, CreativeTab);
		ItemToolCrucioHoe = new ToolHoeBase("tools_crucio_hoe", CRUCIO_TOOL, CreativeTab);
		ItemToolImperioHoe = new ToolHoeBase("tools_imperio_hoe", IMPERIO_TOOL, CreativeTab);
		ItemToolZivicioHoe = new ToolHoeBase("tools_zivicio_hoe", ZIVICIO_TOOL, CreativeTab);

		ItemArmorAccioHelmet = new ItemAccioArmor(ACCIO_ARMOR, 0, EntityEquipmentSlot.HEAD, "armour_accio_helmet")
				.setCreativeTab(CreativeTab);
		ItemArmorAccioChestplate = new ItemAccioArmor(ACCIO_ARMOR, 1, EntityEquipmentSlot.CHEST,
				"armour_accio_chestplate").setCreativeTab(CreativeTab);
		ItemArmorAccioLeggings = new ItemAccioArmor(ACCIO_ARMOR, 2, EntityEquipmentSlot.LEGS, "armour_accio_leggings")
				.setCreativeTab(CreativeTab);
		ItemArmorAccioBoots = new ItemAccioArmor(ACCIO_ARMOR, 2, EntityEquipmentSlot.FEET, "armour_accio_boots")
				.setCreativeTab(CreativeTab);

		ItemArmorCrucioHelmet = new ItemCrucioArmor(CRUCIO_ARMOR, 0, EntityEquipmentSlot.HEAD, "armour_crucio_helmet")
				.setCreativeTab(CreativeTab);
		ItemArmorCrucioChestplate = new ItemCrucioArmor(CRUCIO_ARMOR, 1, EntityEquipmentSlot.CHEST,
				"armour_crucio_chestplate").setCreativeTab(CreativeTab);
		ItemArmorCrucioLeggings = new ItemCrucioArmor(CRUCIO_ARMOR, 2, EntityEquipmentSlot.LEGS,
				"armour_crucio_leggings").setCreativeTab(CreativeTab);
		ItemArmorCrucioBoots = new ItemCrucioArmor(CRUCIO_ARMOR, 2, EntityEquipmentSlot.FEET, "armour_crucio_boots")
				.setCreativeTab(CreativeTab);

		ItemArmorImperioHelmet = new ItemCrucioArmor(IMPERIO_ARMOR, 0, EntityEquipmentSlot.HEAD,
				"armour_imperio_helmet").setCreativeTab(CreativeTab);
		ItemArmorImperioChestplate = new ItemCrucioArmor(IMPERIO_ARMOR, 1, EntityEquipmentSlot.CHEST,
				"armour_imperio_chestplate").setCreativeTab(CreativeTab);
		ItemArmorImperioLeggings = new ItemCrucioArmor(IMPERIO_ARMOR, 2, EntityEquipmentSlot.LEGS,
				"armour_imperio_leggings").setCreativeTab(CreativeTab);
		ItemArmorImperioBoots = new ItemCrucioArmor(IMPERIO_ARMOR, 2, EntityEquipmentSlot.FEET, "armour_imperio_boots")
				.setCreativeTab(CreativeTab);

		ItemArmorZivicioHelmet = new ItemCrucioArmor(ZIVICIO_ARMOR, 0, EntityEquipmentSlot.HEAD,
				"armour_zivicio_helmet").setCreativeTab(CreativeTab);
		ItemArmorZivicioChestplate = new ItemCrucioArmor(ZIVICIO_ARMOR, 1, EntityEquipmentSlot.CHEST,
				"armour_zivicio_chestplate").setCreativeTab(CreativeTab);
		ItemArmorZivicioLeggings = new ItemCrucioArmor(ZIVICIO_ARMOR, 2, EntityEquipmentSlot.LEGS,
				"armour_zivicio_leggings").setCreativeTab(CreativeTab);
		ItemArmorZivicioBoots = new ItemCrucioArmor(ZIVICIO_ARMOR, 2, EntityEquipmentSlot.FEET, "armour_zivicio_boots")
				.setCreativeTab(CreativeTab);
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {

		event.getRegistry().registerAll(ROCK, ItemEssenceMinicio, ItemEssenceAccio, ItemEssenceImperio,
				ItemEssenceZivicio, ItemEssenceCrucio, ItemEssenceAir, ItemEssenceCoal, ItemEssenceDiamond,
				ItemEssenceDye, ItemEssenceEarth, ItemEssenceEmerald, ItemEssenceExperience, ItemEssenceFire,
				ItemEssenceGlowstone, ItemEssenceGold, ItemEssenceIron, ItemEssenceLapis, ItemEssenceNature,
				ItemEssenceNether, ItemEssenceObsidian, ItemEssenceQuartz, ItemEssenceRedstone, ItemEssenceWater,
				ItemInfusionstoneWeak, ItemInfusionstoneRegular, ItemInfusionstoneStrong, ItemInfusionstoneExtreme,
				ItemInfusionstoneMaster, new Item().setRegistryName("essencedye"), ItemToolAccioHoe, ItemToolCrucioHoe,
				ItemToolImperioHoe, ItemToolZivicioHoe, ItemArmorAccioHelmet, ItemArmorAccioChestplate,
				ItemArmorAccioLeggings, ItemArmorAccioBoots, ItemArmorCrucioHelmet, ItemArmorCrucioChestplate,
				ItemArmorCrucioLeggings, ItemArmorCrucioBoots, ItemArmorImperioHelmet, ItemArmorImperioChestplate,
				ItemArmorImperioLeggings, ItemArmorImperioBoots, ItemArmorZivicioHelmet, ItemArmorZivicioChestplate,
				ItemArmorZivicioLeggings, ItemArmorZivicioBoots);
	}

	@SubscribeEvent
	@SideOnly(Side.CLIENT)
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(ROCK);

		registerRender(ItemEssenceMinicio);
		registerRender(ItemEssenceAccio);
		registerRender(ItemEssenceCrucio);
		registerRender(ItemEssenceImperio);
		registerRender(ItemEssenceZivicio);

		registerRender(ItemEssenceAir);
		registerRender(ItemEssenceCoal);
		registerRender(ItemEssenceDiamond);
		registerRender(ItemEssenceDye);
		registerRender(ItemEssenceEarth);
		registerRender(ItemEssenceEmerald);
		registerRender(ItemEssenceExperience);
		registerRender(ItemEssenceFire);
		registerRender(ItemEssenceGlowstone);
		registerRender(ItemEssenceGold);
		registerRender(ItemEssenceIron);
		registerRender(ItemEssenceLapis);
		registerRender(ItemEssenceNature);
		registerRender(ItemEssenceNether);
		registerRender(ItemEssenceObsidian);
		registerRender(ItemEssenceQuartz);
		registerRender(ItemEssenceRedstone);
		registerRender(ItemEssenceWater);

		registerRender(ItemInfusionstoneWeak);
		registerRender(ItemInfusionstoneRegular);
		registerRender(ItemInfusionstoneStrong);
		registerRender(ItemInfusionstoneExtreme);
		registerRender(ItemInfusionstoneMaster);

		registerRender(ItemSeedAir);
		registerRender(ItemSeedCoal);
		registerRender(ItemSeedDiamond);
		registerRender(ItemSeedDye);
		registerRender(ItemSeedEarth);
		registerRender(ItemSeedMinicio);

		registerRender(ItemSeedAir);
		registerRender(ItemSeedCoal);
		registerRender(ItemSeedDiamond);
		registerRender(ItemSeedDye);
		registerRender(ItemSeedEarth);
		registerRender(ItemSeedMinicio);
		registerRender(ItemSeedEmerald);
		registerRender(ItemSeedExperience);
		registerRender(ItemSeedFire);
		registerRender(ItemSeedGlowstone);
		registerRender(ItemSeedGold);
		registerRender(ItemSeedIron);
		registerRender(ItemSeedLapis);
		registerRender(ItemSeedNature);
		registerRender(ItemSeedNether);
		registerRender(ItemSeedObsidian);
		registerRender(ItemSeedQuartz);
		registerRender(ItemSeedRedstone);
		registerRender(ItemSeedWater);
		registerRender(ItemSeedWither);

		registerRender(ItemFurnaceAccio);
		registerRender(ItemFurnaceCrucio);
		registerRender(ItemFurnaceImperio);
		registerRender(ItemFurnaceUltimate);
		registerRender(ItemFurnaceZivicio);

		registerRender(ItemOreMinicio);

		registerRender(ItemToolAccioHoe);
		registerRender(ItemToolCrucioHoe);
		registerRender(ItemToolImperioHoe);
		registerRender(ItemToolZivicioHoe);

		registerRender(ItemArmorAccioHelmet);
		registerRender(ItemArmorAccioChestplate);
		registerRender(ItemArmorAccioLeggings);
		registerRender(ItemArmorAccioBoots);

		registerRender(ItemArmorCrucioHelmet);
		registerRender(ItemArmorCrucioChestplate);
		registerRender(ItemArmorCrucioLeggings);
		registerRender(ItemArmorCrucioBoots);
		
		registerRender(ItemArmorImperioHelmet);
		registerRender(ItemArmorImperioChestplate);
		registerRender(ItemArmorImperioLeggings);
		registerRender(ItemArmorImperioBoots);
		
		registerRender(ItemArmorZivicioHelmet);
		registerRender(ItemArmorZivicioChestplate);
		registerRender(ItemArmorZivicioLeggings);
		registerRender(ItemArmorZivicioBoots);
	}

	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0,
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}