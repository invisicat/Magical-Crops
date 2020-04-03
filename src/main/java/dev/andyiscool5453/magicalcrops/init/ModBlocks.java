package dev.andyiscool5453.magicalcrops.init;

import dev.andyiscool5453.magicalcrops.Reference;
import dev.andyiscool5453.magicalcrops.blocks.crops.CropBase;
import dev.andyiscool5453.magicalcrops.items.seeds.*;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=Reference.MOD_ID)
public class ModBlocks {

	static Block minicioCrop;
	static Block BlockCropAir;
	static Block BlockCropCoal;
	static Block BlockCropDiamond;
	static Block BlockCropDye;
	static Block BlockCropEarth;
	static Block BlockCropEmerald;
	static Block BlockCropExperience;
	static Block BlockCropFire;
	static Block BlockCropGlowstone;
	static Block BlockCropGold;
	static Block BlockCropIron;
	static Block BlockCropLapis;
	static Block BlockCropNature;
	static Block BlockCropNether;
	static Block BlockCropObsidian;
	static Block BlockCropQuartz;
	static Block BlockCropRedstone;
	static Block BlockCropWater;
	static Block BlockCropWither;
	
	public static void init() {
		minicioCrop = new CropBase("cropminicio", ModItems.ItemSeedMinicio, ModItems.ItemEssenceMinicio);
		BlockCropAir = new CropBase("cropair", ModItems.ItemSeedAir, ModItems.ItemEssenceAir);
		BlockCropCoal = new CropBase("cropcoal", ModItems.ItemSeedAir, ModItems.ItemEssenceCoal);
		BlockCropDiamond = new CropBase("cropdiamond", ModItems.ItemSeedDiamond, ModItems.ItemEssenceDiamond);
		BlockCropDye = new CropBase("cropdye", ModItems.ItemSeedDye, ModItems.ItemEssenceDye);
		BlockCropEarth = new CropBase("cropearth", ModItems.ItemSeedEarth, ModItems.ItemEssenceEarth);
		
		BlockCropEmerald = new CropBase("cropemerald", ModItems.ItemSeedEarth, ModItems.ItemEssenceEmerald);
		BlockCropExperience = new CropBase("cropexperience", ModItems.ItemSeedEarth, ModItems.ItemEssenceExperience);
		BlockCropFire = new CropBase("cropfire", ModItems.ItemSeedEarth, ModItems.ItemEssenceFire);
		BlockCropGlowstone = new CropBase("cropglowstone", ModItems.ItemSeedEarth, ModItems.ItemEssenceGlowstone);
		BlockCropGold = new CropBase("cropgold", ModItems.ItemSeedEarth, ModItems.ItemEssenceGold);
		BlockCropIron = new CropBase("cropiron", ModItems.ItemSeedEarth, ModItems.ItemEssenceIron);
		BlockCropLapis = new CropBase("croplapis", ModItems.ItemSeedEarth, ModItems.ItemEssenceLapis);
		BlockCropNature = new CropBase("cropnature", ModItems.ItemSeedEarth, ModItems.ItemEssenceNature);
		BlockCropNether = new CropBase("cropnether", ModItems.ItemSeedEarth, ModItems.ItemEssenceNether);
		BlockCropQuartz = new CropBase("cropquartz", ModItems.ItemSeedEarth, ModItems.ItemEssenceQuartz);
		BlockCropRedstone = new CropBase("cropredstone", ModItems.ItemSeedEarth, ModItems.ItemEssenceRedstone);
		BlockCropWater = new CropBase("cropwater", ModItems.ItemSeedEarth, ModItems.ItemEssenceWater);
		BlockCropWither = new CropBase("cropwither", ModItems.ItemSeedEarth, ModItems.ItemEssenceAccio); // fix
		
	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(
				minicioCrop,
				BlockCropAir,
				BlockCropCoal,
				BlockCropDiamond,
				BlockCropDye,
				BlockCropEarth,
				BlockCropEmerald,
				BlockCropExperience,
				BlockCropFire,
				BlockCropGlowstone,
				BlockCropGold,
				BlockCropIron,
				BlockCropLapis,
				BlockCropNature,
				BlockCropNether,
				BlockCropQuartz,
				BlockCropRedstone,
				BlockCropWater,
				BlockCropWither
				);
	}
	
	@SubscribeEvent
	public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
//		event.getRegistry().register(new ItemSeeds(ModBlocks.tutorialCrop, ModBlocks.tutorialBlock).setRegistryName("tutorial_seeds").setUnlocalizedName("tutorial_seeds")); Use this if you want a normal farmland seed.
		
		ModItems.ItemSeedMinicio = new SeedBase(ModBlocks.minicioCrop,Blocks.FARMLAND,"seedminicio").setCreativeTab(ModItems.CreativeTab);
		ModItems.ItemSeedAir = new SeedBase(ModBlocks.BlockCropAir, Blocks.FARMLAND, "seedair").setCreativeTab(ModItems.CreativeTab);
		ModItems.ItemSeedCoal = new SeedBase(ModBlocks.BlockCropCoal, Blocks.FARMLAND, "seedcoal").setCreativeTab(ModItems.CreativeTab);
		ModItems.ItemSeedDiamond = new SeedBase(ModBlocks.BlockCropDiamond, Blocks.FARMLAND, "seeddiamond").setCreativeTab(ModItems.CreativeTab);
		ModItems.ItemSeedDye = new SeedBase(ModBlocks.BlockCropDye, Blocks.FARMLAND, "seeddye").setCreativeTab(ModItems.CreativeTab);
		ModItems.ItemSeedEarth = new SeedBase(ModBlocks.BlockCropEarth, Blocks.FARMLAND, "seedearth").setCreativeTab(ModItems.CreativeTab);
		
		ModItems.ItemSeedEmerald = new SeedBase(ModBlocks.BlockCropEmerald, Blocks.FARMLAND, "seedemerald").setCreativeTab(ModItems.CreativeTab);
		ModItems.ItemSeedExperience = new SeedBase(ModBlocks.BlockCropExperience, Blocks.FARMLAND, "seedexperience").setCreativeTab(ModItems.CreativeTab);
		ModItems.ItemSeedFire = new SeedBase(ModBlocks.BlockCropFire, Blocks.FARMLAND, "seedFire").setCreativeTab(ModItems.CreativeTab);
		ModItems.ItemSeedGlowstone = new SeedBase(ModBlocks.BlockCropGlowstone, Blocks.FARMLAND, "seedglowstone").setCreativeTab(ModItems.CreativeTab);
		ModItems.ItemSeedGold = new SeedBase(ModBlocks.BlockCropGold, Blocks.FARMLAND, "seedgold").setCreativeTab(ModItems.CreativeTab);
		ModItems.ItemSeedIron = new SeedBase(ModBlocks.BlockCropIron, Blocks.FARMLAND, "seediron").setCreativeTab(ModItems.CreativeTab); 
		ModItems.ItemSeedLapis= new SeedBase(ModBlocks.BlockCropLapis, Blocks.FARMLAND, "seedlapis").setCreativeTab(ModItems.CreativeTab);
		ModItems.ItemSeedNature = new SeedBase(ModBlocks.BlockCropNature, Blocks.FARMLAND, "seednature").setCreativeTab(ModItems.CreativeTab);
		ModItems.ItemSeedNether = new SeedBase(ModBlocks.BlockCropNether, Blocks.FARMLAND, "seednether").setCreativeTab(ModItems.CreativeTab);
		ModItems.ItemSeedObsidian = new SeedBase(ModBlocks.BlockCropObsidian, Blocks.FARMLAND, "seedobsidian").setCreativeTab(ModItems.CreativeTab);
		ModItems.ItemSeedQuartz = new SeedBase(ModBlocks.BlockCropQuartz, Blocks.FARMLAND, "seedquartz").setCreativeTab(ModItems.CreativeTab);
		ModItems.ItemSeedRedstone = new SeedBase(ModBlocks.BlockCropRedstone, Blocks.FARMLAND, "seedredstone").setCreativeTab(ModItems.CreativeTab);
		ModItems.ItemSeedWater = new SeedBase(ModBlocks.BlockCropWater, Blocks.FARMLAND, "seedwater").setCreativeTab(ModItems.CreativeTab);
		ModItems.ItemSeedWither = new SeedBase(ModBlocks.BlockCropWither, Blocks.FARMLAND, "seedwither").setCreativeTab(ModItems.CreativeTab);
		
		
		event.getRegistry().registerAll(
				ModItems.ItemSeedMinicio,
				ModItems.ItemSeedAir,
				ModItems.ItemSeedCoal,
				ModItems.ItemSeedDiamond,
				ModItems.ItemSeedDye,
				ModItems.ItemSeedEarth,
				ModItems.ItemSeedEmerald,
				ModItems.ItemSeedExperience, 
				ModItems.ItemSeedFire,
				ModItems.ItemSeedGlowstone,
				ModItems.ItemSeedGold,
				ModItems.ItemSeedIron, 
				ModItems.ItemSeedLapis,
				ModItems.ItemSeedNature,
				ModItems.ItemSeedNether,
				ModItems.ItemSeedObsidian,
				ModItems.ItemSeedQuartz,
				ModItems.ItemSeedRedstone, 
				ModItems.ItemSeedWater,
				ModItems.ItemSeedWither
				);
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {

	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation( item.getRegistryName(), "inventory"));
	}
}