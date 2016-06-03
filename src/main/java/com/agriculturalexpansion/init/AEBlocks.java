package com.agriculturalexpansion.init;

import com.agriculturalexpansion.extend.AECrops.*;
import com.agriculturalexpansion.extend.AEBlock;
import com.agriculturalexpansion.handler.ConfigurationFile;
import com.agriculturalexpansion.main.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AEBlocks {
	
	//Blocks
	public static Block sprout_block = new AEBlock("sprout_block", Material.GROUND, 0, 0, null, 0);
	
	//Resource Crop
	public static Block resource_crop = new ResourceCrop("resource_crop");
	
	//Vanilla Crops
	public static Block coal_crop = new CoalCrop("coal_crop");
	public static Block iron_crop = new IronCrop("iron_crop");
	public static Block gold_crop = new GoldCrop("gold_crop");
	public static Block lapis_crop = new LapisCrop("lapis_crop");
	public static Block quartz_crop = new QuartzCrop("quartz_crop");
	public static Block redstone_crop = new RedstoneCrop("redstone_crop");
	public static Block diamond_crop = new DiamondCrop("diamond_crop");
	public static Block emerald_crop = new EmeraldCrop("emerald_crop");
	public static Block glowstone_crop = new GlowstoneCrop("glowstone_crop");

	//Hostile Mobs Crops
	public static Block zombie_crop = new ZombieCrop("zombie_crop");
	public static Block creeper_crop = new CreeperCrop("creeper_crop");
	public static Block skeleton_crop = new SkeletonCrop("skeleton_crop");
	public static Block slime_crop = new SlimeCrop("slime_crop");
	public static Block spider_crop = new SpiderCrop("spider_crop");
	public static Block guardian_crop = new GuardianCrop("guardian_crop");
	public static Block ghast_crop = new GhastCrop("ghast_crop");
	public static Block wither_crop = new WitherCrop("wither_crop");
	public static Block blaze_crop = new BlazeCrop("blaze_crop");
	public static Block enderman_crop = new EndermanCrop("enderman_crop");
	
	//Passive Mobs Crops
	public static Block squid_crop = new SquidCrop("squid_crop");
	public static Block cow_crop = new CowCrop("cow_crop");
	public static Block sheep_crop = new SheepCrop("sheep_crop");
	public static Block chicken_crop = new ChickenCrop("chicken_crop");
	public static Block pig_crop = new PigCrop("pig_crop");
	public static Block rabbit_crop = new RabbitCrop("rabbit_crop");
	
	public static void initBlocks() {
		
		//Blocks
		GameRegistry.registerBlock((sprout_block), "sprout_block");
		
		//Resource Crop
		GameRegistry.registerBlock((resource_crop), "resource_crop");
		
		//Vanilla Crops
		GameRegistry.registerBlock((coal_crop), "coal_crop");
		GameRegistry.registerBlock((iron_crop), "iron_crop");
		GameRegistry.registerBlock((gold_crop), "gold_crop");
		GameRegistry.registerBlock((lapis_crop), "lapis_crop");
		GameRegistry.registerBlock((quartz_crop), "quartz_crop");
		GameRegistry.registerBlock((redstone_crop), "redstone_crop");
		GameRegistry.registerBlock((diamond_crop), "diamond_crop");
		GameRegistry.registerBlock((emerald_crop), "emerald_crop");
		GameRegistry.registerBlock((glowstone_crop), "glowstone_crop");
		
		//Hostile Mobs Crops
		GameRegistry.registerBlock((zombie_crop), "zombie_crop");
		GameRegistry.registerBlock((creeper_crop), "creeper_crop");
		GameRegistry.registerBlock((skeleton_crop), "skeleton_crop");
		GameRegistry.registerBlock((slime_crop), "slime_crop");
		GameRegistry.registerBlock((spider_crop), "spider_crop");
		GameRegistry.registerBlock((guardian_crop), "guardian_crop");
		GameRegistry.registerBlock((ghast_crop), "ghast_crop");
		GameRegistry.registerBlock((wither_crop), "wither_crop");
		GameRegistry.registerBlock((blaze_crop), "blaze_crop");
		GameRegistry.registerBlock((enderman_crop), "enderman_crop");
		
		//Passive Mobs Crops
		GameRegistry.registerBlock((squid_crop), "squid_crop");
		GameRegistry.registerBlock((cow_crop), "cow_crop");
		GameRegistry.registerBlock((sheep_crop), "sheep_crop");
		GameRegistry.registerBlock((chicken_crop), "chicken_crop");
		GameRegistry.registerBlock((pig_crop), "pig_crop");
		GameRegistry.registerBlock((rabbit_crop), "rabbit_crop");
		
	}
	
public static void initModels() {
		
		//Blocks
		initModel(sprout_block);
		
		//Resource Crop
		initModel(resource_crop);
		
		//Vanilla Crops
		initModel(coal_crop);
		initModel(iron_crop);
		initModel(gold_crop);
		initModel(lapis_crop);
		initModel(quartz_crop);
		initModel(redstone_crop);
		initModel(diamond_crop);
		initModel(emerald_crop);
		initModel(glowstone_crop);
		
		//Hostile Mobs Crops
		initModel(zombie_crop);
		initModel(creeper_crop);
		initModel(skeleton_crop);
		initModel(slime_crop);
		initModel(spider_crop);
		initModel(guardian_crop);
		initModel(ghast_crop);
		initModel(wither_crop);
		initModel(blaze_crop);
		initModel(enderman_crop);
		
		//Passive Mobs Crops
		initModel(squid_crop);
		initModel(cow_crop);
		initModel(sheep_crop);
		initModel(chicken_crop);
		initModel(pig_crop);
		initModel(rabbit_crop);
	}
	
	public static void initModel(Block block) {
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, 
				new ModelResourceLocation(Reference.MOD_ID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
    }

}
