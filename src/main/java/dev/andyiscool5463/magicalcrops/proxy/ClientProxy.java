package dev.andyiscool5463.magicalcrops.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

public class ClientProxy extends CommonProxy {
	
	
	public void preInit(FMLPreInitializationEvent event) {
	super.preInit(event);
	}
	
	// Init - Do your mod setup. Build whatever data structures you care aboutandler
	public void init(FMLInitializationEvent event) {		
		super.init(event);
	}
	
	
	// postInit "Handle interaction with other mods, complete your setup based on this."
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}
	
	public void serverLoad(FMLServerStartingEvent event) {
		super.serverLoad(event);
	}
}
