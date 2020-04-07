package dev.andyiscool5463.magicalcrops.init;

import dev.andyiscool5463.magicalcrops.Reference;
import dev.andyiscool5463.magicalcrops.items.ItemBasic;
import dev.andyiscool5463.magicalcrops.items.Infusionstones.*;
import dev.andyiscool5463.magicalcrops.items.essence.*;
import dev.andyiscool5463.magicalcrops.items.tools.ToolHoeBase;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.world.BlockEvent;
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
	
	static Item ROCK;

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
		final ToolMaterial ACCIO_TOOL = EnumHelper.addToolMaterial("accio_tool", 3, 10, 3.0F, 5.0F, 30);
		ItemToolAccioHoe = new ToolHoeBase("tools_accio_hoe",ACCIO_TOOL,CreativeTab);
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {

		event.getRegistry().registerAll(ROCK, ItemEssenceMinicio, ItemEssenceAccio, ItemEssenceImperio,
				ItemEssenceZivicio, ItemEssenceCrucio, ItemEssenceAir, ItemEssenceCoal, ItemEssenceDiamond,
				ItemEssenceDye, ItemEssenceEarth, ItemEssenceEmerald, ItemEssenceExperience, ItemEssenceFire,
				ItemEssenceGlowstone, ItemEssenceGold, ItemEssenceIron, ItemEssenceLapis, ItemEssenceNature,
				ItemEssenceNether, ItemEssenceObsidian, ItemEssenceQuartz, ItemEssenceRedstone, ItemEssenceWater,
				ItemInfusionstoneWeak, ItemInfusionstoneRegular, ItemInfusionstoneStrong, ItemInfusionstoneExtreme,
				ItemInfusionstoneMaster, new Item().setRegistryName("essencedye"), ItemToolAccioHoe);
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
	}
	
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0,
				new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}