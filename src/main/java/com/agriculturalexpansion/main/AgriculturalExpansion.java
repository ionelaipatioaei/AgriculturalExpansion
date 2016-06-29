package com.agriculturalexpansion.main;

import com.agriculturalexpansion.handler.*;
import com.agriculturalexpansion.proxy.CommonProxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class AgriculturalExpansion {
	
	@Mod.Instance(Reference.MOD_ID)
	public static AgriculturalExpansion instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
	public static CommonProxy proxy;
	
	public static final CreativeTab tabAgriculturalExpansion = new CreativeTab("tabAgriculturalExpansion");
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent preEvent) {
		this.proxy.preInit(preEvent);
		
		ConfigurationFile.init(preEvent.getSuggestedConfigurationFile());
		MinecraftForge.EVENT_BUS.register(new MobDrops());
		MinecraftForge.EVENT_BUS.register(new DungeonLoot());
		
		FMLInterModComms.sendMessage("Waila", "register", "com.agriculturalexpansion.handler.WailaDataProvider.callbackRegister");
		
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		this.proxy.init(event);
		
		Achievements.initAchievements();
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent postEvent) {
		this.proxy.postInit(postEvent);

		Recipes.init();
		
	}

}
