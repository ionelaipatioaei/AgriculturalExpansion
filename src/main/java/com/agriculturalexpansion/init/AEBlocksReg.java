package com.agriculturalexpansion.init;

import com.agriculturalexpansion.handler.ConfigurationFile;
import com.agriculturalexpansion.main.Reference;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AEBlocksReg {
	
	public static void registerRenders() {
		
		//Blocks
		registerRender(AEBlocks.sprout_block);
		
		//Crops
		registerRender(AEBlocks.resource_crop);
		
		registerRender(AEBlocks.coal_crop);
		registerRender(AEBlocks.iron_crop);
		registerRender(AEBlocks.gold_crop);
		registerRender(AEBlocks.lapis_crop);
		registerRender(AEBlocks.quartz_crop);
		registerRender(AEBlocks.redstone_crop);
		registerRender(AEBlocks.diamond_crop);
		registerRender(AEBlocks.emerald_crop);
		registerRender(AEBlocks.glowstone_crop);
		
		registerRender(AEBlocks.zombie_crop);
		registerRender(AEBlocks.creeper_crop);
		registerRender(AEBlocks.skeleton_crop);
		registerRender(AEBlocks.slime_crop);
		registerRender(AEBlocks.spider_crop);
		registerRender(AEBlocks.guardian_crop);
		registerRender(AEBlocks.ghast_crop);
		registerRender(AEBlocks.wither_crop);
		registerRender(AEBlocks.blaze_crop);
		registerRender(AEBlocks.enderman_crop);
		registerRender(AEBlocks.squid_crop);
		
		registerRender(AEBlocks.cow_crop);
		registerRender(AEBlocks.sheep_crop);
		registerRender(AEBlocks.chicken_crop);
		registerRender(AEBlocks.pig_crop);
		registerRender(AEBlocks.rabbit_crop);
	}
	
	public static void registerRender(Block block) {
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, 
				new ModelResourceLocation(Reference.MOD_ID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
    }

}
