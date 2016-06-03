package com.agriculturalexpansion.init;

import com.agriculturalexpansion.extend.AECrops.*;
import com.agriculturalexpansion.extend.AEBlock;
import com.agriculturalexpansion.handler.ConfigurationFile;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Items;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AEBlocks {
	
	//Blocks
	public static Block sprout_block;
	
	//Crops
	public static Block resource_crop;
	
	//Vanilla Crops
	public static Block coal_crop;
	public static Block iron_crop;
	public static Block gold_crop;
	public static Block lapis_crop;
	public static Block quartz_crop;
	public static Block redstone_crop;
	public static Block diamond_crop;
	public static Block emerald_crop;
	public static Block glowstone_crop;
	
	//Mob Crops
	public static Block zombie_crop;
	public static Block creeper_crop;
	public static Block skeleton_crop;
	public static Block slime_crop;
	public static Block spider_crop;
	public static Block guardian_crop;
	public static Block ghast_crop;
	public static Block wither_crop;
	public static Block blaze_crop;
	public static Block enderman_crop;
	public static Block squid_crop;
	
	//Passive Crops
	public static Block cow_crop;
	public static Block sheep_crop;
	public static Block chicken_crop;
	public static Block pig_crop;
	public static Block rabbit_crop;
	
	public static void initBlocks() {
		
		//Blocks
		GameRegistry.registerBlock(sprout_block = new AEBlock("sprout_block", Material.PLANTS, 0, 0, null, 0), "sprout_block");
		
		//Crops
		GameRegistry.registerBlock(resource_crop = new ResourceCrop("resource_crop"), "resource_crop");
		
		GameRegistry.registerBlock(coal_crop = new CoalCrop("coal_crop"), "coal_crop");
		GameRegistry.registerBlock(iron_crop = new IronCrop("iron_crop"), "iron_crop");
		GameRegistry.registerBlock(gold_crop = new GoldCrop("gold_crop"), "gold_crop");
		GameRegistry.registerBlock(lapis_crop = new LapisCrop("lapis_crop"), "lapis_crop");
		GameRegistry.registerBlock(quartz_crop = new QuartzCrop("quartz_crop"), "quartz_crop");
		GameRegistry.registerBlock(redstone_crop = new RedstoneCrop("redstone_crop"), "redstone_crop");
		GameRegistry.registerBlock(diamond_crop = new DiamondCrop("diamond_crop"), "diamond_crop");
		GameRegistry.registerBlock(emerald_crop = new EmeraldCrop("emerald_crop"), "emerald_crop");
		GameRegistry.registerBlock(glowstone_crop = new GlowstoneCrop("glowstone_crop"), "glowstone_crop");
		
		//Mob Crops
		GameRegistry.registerBlock(zombie_crop = new ZombieCrop("zombie_crop"), "zombie_crop");
		GameRegistry.registerBlock(creeper_crop = new CreeperCrop("creeper_crop"), "creeper_crop");
		GameRegistry.registerBlock(skeleton_crop = new SkeletonCrop("skeleton_crop"), "skeleton_crop");
		GameRegistry.registerBlock(slime_crop = new SlimeCrop("slime_crop"), "slime_crop");
		GameRegistry.registerBlock(spider_crop = new SpiderCrop("spider_crop"), "spider_crop");
		GameRegistry.registerBlock(guardian_crop = new GuardianCrop("guardian_crop"), "guardian_crop");
		GameRegistry.registerBlock(ghast_crop = new GhastCrop("ghast_crop"), "ghast_crop");
		GameRegistry.registerBlock(wither_crop = new WitherCrop("wither_crop"), "wither_crop");
		GameRegistry.registerBlock(blaze_crop = new BlazeCrop("blaze_crop"), "blaze_crop");
		GameRegistry.registerBlock(enderman_crop = new EndermanCrop("enderman_crop"), "enderman_crop");
		GameRegistry.registerBlock(squid_crop = new SquidCrop("squid_crop"), "squid_crop");
		
		//Passive Crops
		GameRegistry.registerBlock(cow_crop = new CowCrop("cow_crop"), "cow_crop");
		GameRegistry.registerBlock(sheep_crop = new SheepCrop("sheep_crop"), "sheep_crop");
		GameRegistry.registerBlock(chicken_crop = new ChickenCrop("chicken_crop"), "chicken_crop");
		GameRegistry.registerBlock(pig_crop = new PigCrop("pig_crop"), "pig_crop");
		GameRegistry.registerBlock(rabbit_crop = new RabbitCrop("rabbit_crop"), "rabbit_crop");
		
	}

}
