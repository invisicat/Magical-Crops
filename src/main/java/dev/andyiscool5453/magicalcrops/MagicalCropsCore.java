package dev.andyiscool5453.magicalcrops;

import dev.andyiscool5453.magicalcrops.init.ModBlocks;
import dev.andyiscool5453.magicalcrops.init.ModItems;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class MagicalCropsCore {
	
	@Instance(Reference.MOD_ID)
	public static MagicalCropsCore instance;
	
	//@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
	//public static IProxy proxy;
	
	
	//static {
	//	FluidRegistry.enableUniversalBucket();
	//}
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		// REGISTER REGISTRIES HERE
		ModItems.init();
		ModBlocks.init();

	//	proxy.preInit(event);
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
	//	proxy.init(event);
	//	NetworkRegistry.INSTANCE.registerGuiHandler(Reference.MOD_ID, new TutorialGuiHandler());
		
	//	GameRegistry.addShapelessRecipe(new ResourceLocation(Reference.MOD_ID, "fire_sword"), null, stack, Ingredient.fromItem(Items.DIAMOND_SWORD), Ingredient.fromItem(Items.BLAZE_POWDER));
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	//	proxy.postInit(event);
		
	}
	
	@EventHandler
	public void serverLoad(FMLServerStartingEvent event) {
		System.out.println(Reference.MOD_ID + ":postInit");

	//	proxy.serverStarting(event);
	}
}