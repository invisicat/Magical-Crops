package dev.andyiscool5463.magicalcrops;

import dev.andyiscool5463.magicalcrops.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class MagicalCropsCore {
	
	@Instance(Reference.MOD_ID)
	public static MagicalCropsCore instance;
	
	@SidedProxy(clientSide=Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	// preInit "Run before anything else. Read your config, create blocks, items, etc, and register them with the GameRegistry."
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}
	
	// Init - Do your mod setup. Build whatever data structures you care about.
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
		
	}
	
	
	// postInit "Handle interaction with other mods, complete your setup based on this."
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
		
	}
	
	@EventHandler
	public void serverLoad(FMLServerStartingEvent event) {
		proxy.serverStarting(event);
	}
}