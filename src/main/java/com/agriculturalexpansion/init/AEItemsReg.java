package com.agriculturalexpansion.init;

import com.agriculturalexpansion.main.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class AEItemsReg {
	
	public static void registerRenders() {
		
		//Items
		registerRender(AEItems.resource_sprout);
		
		registerRender(AEItems.coal_essence);
		registerRender(AEItems.iron_essence);
		registerRender(AEItems.gold_essence);
		registerRender(AEItems.lapis_essence);
		registerRender(AEItems.quartz_essence);
		registerRender(AEItems.redstone_essence);
		registerRender(AEItems.diamond_essence);
		registerRender(AEItems.emerald_essence);
		registerRender(AEItems.glowstone_essence);
		
		registerRender(AEItems.zombie_essence);
		registerRender(AEItems.creeper_essence);
		registerRender(AEItems.skeleton_essence);
		registerRender(AEItems.slime_essence);
		registerRender(AEItems.spider_essence);
		registerRender(AEItems.guardian_essence);
		registerRender(AEItems.ghast_essence);
		registerRender(AEItems.wither_essence);
		registerRender(AEItems.blaze_essence);
		registerRender(AEItems.enderman_essence);
		registerRender(AEItems.squid_essence);
		
		registerRender(AEItems.zombie_chunk);
		registerRender(AEItems.creeper_chunk);
		registerRender(AEItems.skeleton_chunk);
		registerRender(AEItems.slime_chunk);
		registerRender(AEItems.spider_chunk);
		registerRender(AEItems.guardian_chunk);
		registerRender(AEItems.ghast_chunk);
		registerRender(AEItems.wither_chunk);
		registerRender(AEItems.blaze_chunk);
		registerRender(AEItems.enderman_chunk);
		registerRender(AEItems.squid_chunk);
		
		registerRender(AEItems.cow_essence);
		registerRender(AEItems.sheep_essence);
		registerRender(AEItems.chicken_essence);
		registerRender(AEItems.pig_essence);
		registerRender(AEItems.rabbit_essence);
		
		registerRender(AEItems.cow_chunk);
		registerRender(AEItems.sheep_chunk);
		registerRender(AEItems.chicken_chunk);
		registerRender(AEItems.pig_chunk);
		registerRender(AEItems.rabbit_chunk);
		
		//Seeds
		registerRender(AEItems.resource_seed);
		
		registerRender(AEItems.coal_sprout);
		registerRender(AEItems.iron_sprout);
		registerRender(AEItems.gold_sprout);
		registerRender(AEItems.lapis_sprout);
		registerRender(AEItems.quartz_sprout);
		registerRender(AEItems.redstone_sprout);
		registerRender(AEItems.diamond_sprout);
		registerRender(AEItems.emerald_sprout);
		registerRender(AEItems.glowstone_sprout);
		
		registerRender(AEItems.zombie_sprout);
		registerRender(AEItems.creeper_sprout);
		registerRender(AEItems.skeleton_sprout);
		registerRender(AEItems.slime_sprout);
		registerRender(AEItems.spider_sprout);
		registerRender(AEItems.guardian_sprout);
		registerRender(AEItems.ghast_sprout);
		registerRender(AEItems.wither_sprout);
		registerRender(AEItems.blaze_sprout);
		registerRender(AEItems.enderman_sprout);
		registerRender(AEItems.squid_sprout);
		
		registerRender(AEItems.cow_sprout);
		registerRender(AEItems.sheep_sprout);
		registerRender(AEItems.chicken_sprout);
		registerRender(AEItems.pig_sprout);
		registerRender(AEItems.rabbit_sprout);
	}
	
	public static void registerRender(Item item) {
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
				new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
	}

}
