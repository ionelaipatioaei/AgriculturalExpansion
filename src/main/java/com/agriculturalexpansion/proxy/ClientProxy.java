package com.agriculturalexpansion.proxy;

import com.agriculturalexpansion.init.AEBlocks;
import com.agriculturalexpansion.init.AEItems;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

	@Override
	public void preInit(FMLPreInitializationEvent preEvent) {
		super.preInit(preEvent);
		
	}
	
	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
		
		AEBlocks.initModels();
		AEItems.initModels();
		
	}

	@Override
	public void postInit(FMLPostInitializationEvent postEvent) {
		super.postInit(postEvent);
	
	}

}
