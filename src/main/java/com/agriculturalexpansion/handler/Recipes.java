package com.agriculturalexpansion.handler;

import com.agriculturalexpansion.init.AEBlocks;
import com.agriculturalexpansion.init.AEItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class Recipes {
	
	public static void init() {
		
		initRecipes();
		initSmelting();
		initOreDictionary();
		
	}
	
	public static void initRecipes() {
		
		//Basic Crafting
		if (ConfigurationFile.enableSproutBlockCrafting = true) {
		GameRegistry.addShapedRecipe(new ItemStack(AEBlocks.sprout_block), new Object[] {
				"XXX", "XXX", "XXX",
				'X', AEItems.resource_sprout
		});
		}
		if (ConfigurationFile.reusableSproutsFromBlock = true) {
		GameRegistry.addShapelessRecipe(new ItemStack(AEItems.resource_sprout, 9), new Object[] {
				 AEBlocks.sprout_block
		});
		}
		
		//Default Recipes
		//Vanilla Resources
		GameRegistry.addShapedRecipe(new ItemStack(Items.COAL, 2), new Object[] {
				" X ", "X X", " X ",
				'X', AEItems.coal_essence
		});
		GameRegistry.addShapedRecipe(new ItemStack(Items.COAL, 4), new Object[] {
				"XXX", "X X", "XXX",
				'X', AEItems.coal_essence
		});
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.IRON_INGOT, 2), new Object[] {
				" X ", "X X", " X ",
				'X', AEItems.iron_essence
		});
		GameRegistry.addShapedRecipe(new ItemStack(Items.IRON_INGOT, 4), new Object[] {
				"XXX", "X X", "XXX",
				'X', AEItems.iron_essence
		});
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.GOLD_INGOT, 2), new Object[] {
				" X ", "X X", " X ",
				'X', AEItems.gold_essence
		});
		GameRegistry.addShapedRecipe(new ItemStack(Items.GOLD_INGOT, 4), new Object[] {
				"XXX", "X X", "XXX",
				'X', AEItems.gold_essence
		});
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.DYE, 6, 4), new Object[] {
				" X ", "X X", " X ",
				'X', AEItems.lapis_essence
		});
		GameRegistry.addShapedRecipe(new ItemStack(Items.DYE, 12, 4), new Object[] {
				"XXX", "X X", "XXX",
				'X', AEItems.lapis_essence
		});
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.QUARTZ, 3), new Object[] {
				" X ", "X X", " X ",
				'X', AEItems.quartz_essence
		});
		GameRegistry.addShapedRecipe(new ItemStack(Items.QUARTZ, 6), new Object[] {
				"XXX", "X X", "XXX",
				'X', AEItems.quartz_essence
		});
		
		GameRegistry.addShapedRecipe(new ItemStack(Items.REDSTONE, 4), new Object[] {
				" X ", "X X", " X ",
				'X', AEItems.redstone_essence
		});
		GameRegistry.addShapedRecipe(new ItemStack(Items.REDSTONE, 8), new Object[] {
				"XXX", "X X", "XXX",
				'X', AEItems.redstone_essence
		});
	
		GameRegistry.addShapedRecipe(new ItemStack(Items.DIAMOND, 1), new Object[] {
				" X ", "X X", " X ",
				'X', AEItems.diamond_essence
		});
		GameRegistry.addShapedRecipe(new ItemStack(Items.DIAMOND, 2), new Object[] {
				"XXX", "X X", "XXX",
				'X', AEItems.diamond_essence
		});
	
		GameRegistry.addShapedRecipe(new ItemStack(Items.EMERALD, 1), new Object[] {
				" X ", "X X", " X ",
				'X', AEItems.emerald_essence
		});
		GameRegistry.addShapedRecipe(new ItemStack(Items.EMERALD, 2), new Object[] {
				"XXX", "X X", "XXX",
				'X', AEItems.emerald_essence
		});
		GameRegistry.addShapedRecipe(new ItemStack(Items.GLOWSTONE_DUST, 4), new Object[] {
				" X ", "X X", " X ",
				'X', AEItems.glowstone_essence
		});
		GameRegistry.addShapedRecipe(new ItemStack(Items.GLOWSTONE_DUST, 8), new Object[] {
				"XXX", "X X", "XXX",
				'X', AEItems.glowstone_essence
		});
		
		//Hostile Mobs
		GameRegistry.addShapedRecipe(new ItemStack(Items.ROTTEN_FLESH, 3), new Object[]{
				"X X", " X ", "X X", 
				'X', AEItems.zombie_essence
		});
		GameRegistry.addShapedRecipe(new ItemStack(Items.GUNPOWDER, 2), new Object[]{
				"X X", " X ", "X X", 
				'X', AEItems.creeper_essence
		});
		GameRegistry.addShapedRecipe(new ItemStack(Items.BONE, 2), new Object[]{
				"X X", " X ", "X X", 
				'X', AEItems.skeleton_essence
		});
		GameRegistry.addShapedRecipe(new ItemStack(Items.ARROW, 3), new Object[]{
				"   ", "XXX", "   ", 
				'X', AEItems.skeleton_essence
		});
		GameRegistry.addShapedRecipe(new ItemStack(Items.SLIME_BALL, 2), new Object[]{
				"X X", " X ", "X X", 
				'X', AEItems.slime_essence
		});
		GameRegistry.addShapedRecipe(new ItemStack(Items.SPIDER_EYE, 2), new Object[]{
				"X X", " X ", "X X", 
				'X', AEItems.spider_essence
		});
		GameRegistry.addShapedRecipe(new ItemStack(Items.STRING, 3), new Object[]{
				" X ", "X X", " X ", 
				'X', AEItems.spider_essence
		});
		GameRegistry.addShapedRecipe(new ItemStack(Items.PRISMARINE_SHARD, 3), new Object[]{
				"X X", " X ", "X X", 
				'X', AEItems.guardian_essence
		});
		GameRegistry.addShapedRecipe(new ItemStack(Items.PRISMARINE_CRYSTALS, 3), new Object[]{
				" X ", "X X", " X ", 
				'X', AEItems.guardian_essence
		});
		GameRegistry.addShapedRecipe(new ItemStack(Items.FISH, 2), new Object[]{
				"   ", "XXX", "   ", 
				'X', AEItems.guardian_essence
		});
		GameRegistry.addShapedRecipe(new ItemStack(Items.GHAST_TEAR, 1), new Object[]{
				"X X", " X ", "X X", 
				'X', AEItems.ghast_essence
		});
		GameRegistry.addShapedRecipe(new ItemStack(Items.GUNPOWDER, 4), new Object[]{
				" X ", "X X", " X ", 
				'X', AEItems.ghast_essence
		});
		GameRegistry.addShapedRecipe(new ItemStack(Items.SKULL, 1, 1), new Object[]{
				"XXX", "XXX", "XXX", 
				'X', AEItems.wither_essence
		});
		GameRegistry.addShapedRecipe(new ItemStack(Items.BLAZE_ROD, 1), new Object[]{
				"X X", " X ", "X X", 
				'X', AEItems.blaze_essence
		});
		GameRegistry.addShapedRecipe(new ItemStack(Items.BLAZE_POWDER, 2), new Object[]{
				" X ", "X X", " X ", 
				'X', AEItems.blaze_essence
		});
		GameRegistry.addShapedRecipe(new ItemStack(Items.ENDER_PEARL, 1), new Object[]{
				"X X", " X ", "X X", 
				'X', AEItems.enderman_essence
		});
		
		//Passive Mobs
		GameRegistry.addShapedRecipe(new ItemStack(Items.DYE, 3, 0), new Object[]{
				"X X", " X ", "X X", 
				'X', AEItems.squid_essence
		});
		GameRegistry.addShapedRecipe(new ItemStack(Items.LEATHER, 2), new Object[]{
				" X ", "X X", " X ", 
				'X', AEItems.cow_essence
		});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.WOOL, 2), new Object[]{
				" X ", "X X", " X ", 
				'X', AEItems.sheep_essence
		});
		GameRegistry.addShapedRecipe(new ItemStack(Items.FEATHER, 2), new Object[]{
				" X ", "X X", " X ", 
				'X', AEItems.chicken_essence
		});
		GameRegistry.addShapedRecipe(new ItemStack(Items.PORKCHOP, 2), new Object[]{
				" X ", "X X", " X ", 
				'X', AEItems.pig_essence
		});
		GameRegistry.addShapedRecipe(new ItemStack(Items.RABBIT_HIDE, 2), new Object[]{
				" X ", "X X", " X ", 
				'X', AEItems.rabbit_essence
		});
		GameRegistry.addShapedRecipe(new ItemStack(Items.RABBIT_FOOT, 1), new Object[]{
				"XXX", "XXX", "XXX", 
				'X', AEItems.rabbit_essence
		});
		
		//Seed Crafting
		//Vanilla Resources
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.resource_seed), new Object[] {
				"XY ", "ZW ", "   ",
				'X', (new ItemStack(Items.DYE, 1, 15)), 'Y', Items.WHEAT_SEEDS, 'Z', Items.WATER_BUCKET, 'W', Items.APPLE
		});
		
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.coal_sprout), new Object[] {
				" X ", "XYX", " X ",
				'X', AEItems.resource_sprout, 'Y', Items.COAL
		});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.iron_sprout), new Object[] {
				" X ", "XYX", " X ",
				'X', AEItems.resource_sprout, 'Y', Items.IRON_INGOT
		});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.gold_sprout), new Object[] {
				" X ", "XYX", " X ",
				'X', AEItems.resource_sprout, 'Y', Items.GOLD_INGOT
		});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.lapis_sprout), new Object[] {
				" X ", "XYX", " X ",
				'X', AEItems.resource_sprout, 'Y', (new ItemStack(Items.DYE, 1, 4))
		});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.quartz_sprout), new Object[] {
				" X ", "XYX", " X ",
				'X', AEItems.resource_sprout, 'Y', Items.QUARTZ
		});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.redstone_sprout), new Object[] {
				" X ", "XYX", " X ",
				'X', AEItems.resource_sprout, 'Y', Items.REDSTONE
		});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.diamond_sprout), new Object[] {
				" X ", "XYX", " X ",
				'X', AEItems.resource_sprout, 'Y', Items.DIAMOND
		});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.emerald_sprout), new Object[] {
				" X ", "XYX", " X ",
				'X', AEItems.resource_sprout, 'Y', Items.EMERALD
		});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.glowstone_sprout), new Object[] {
				" X ", "XYX", " X ",
				'X', AEItems.resource_sprout, 'Y', Items.GLOWSTONE_DUST
		});
		
		//Hostile Mobs
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.zombie_sprout), new Object[] {
				" X ", "XYX", " X ",
				'X', AEItems.resource_sprout, 'Y', AEItems.zombie_chunk
		});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.creeper_sprout), new Object[] {
				" X ", "XYX", " X ",
				'X', AEItems.resource_sprout, 'Y', AEItems.creeper_chunk
		});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.skeleton_sprout), new Object[] {
				" X ", "XYX", " X ",
				'X', AEItems.resource_sprout, 'Y', AEItems.skeleton_chunk
		});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.slime_sprout), new Object[] {
				" X ", "XYX", " X ",
				'X', AEItems.resource_sprout, 'Y', AEItems.slime_chunk
		});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.spider_sprout), new Object[] {
				" X ", "XYX", " X ",
				'X', AEItems.resource_sprout, 'Y', AEItems.spider_chunk
		});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.guardian_sprout), new Object[] {
				" X ", "XYX", " X ",
				'X', AEItems.resource_sprout, 'Y', AEItems.guardian_chunk
		});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.ghast_sprout), new Object[] {
				" X ", "XYX", " X ",
				'X', AEItems.resource_sprout, 'Y', AEItems.ghast_chunk
		});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.wither_sprout), new Object[] {
				" X ", "XYX", " X ",
				'X', AEItems.resource_sprout, 'Y', AEItems.wither_chunk
		});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.blaze_sprout), new Object[] {
				" X ", "XYX", " X ",
				'X', AEItems.resource_sprout, 'Y', AEItems.blaze_chunk
		});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.enderman_sprout), new Object[] {
				" X ", "XYX", " X ",
				'X', AEItems.resource_sprout, 'Y', AEItems.enderman_chunk
		});
		
		//Passive Mobs
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.squid_sprout), new Object[] {
				" X ", "XYX", " X ",
				'X', AEItems.resource_sprout, 'Y', AEItems.squid_chunk
		});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.cow_sprout), new Object[] {
				" X ", "XYX", " X ",
				'X', AEItems.resource_sprout, 'Y', AEItems.cow_chunk
		});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.sheep_sprout), new Object[] {
				" X ", "XYX", " X ",
				'X', AEItems.resource_sprout, 'Y', AEItems.sheep_chunk
		});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.chicken_sprout), new Object[] {
				" X ", "XYX", " X ",
				'X', AEItems.resource_sprout, 'Y', AEItems.chicken_chunk
		});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.pig_sprout), new Object[] {
				" X ", "XYX", " X ",
				'X', AEItems.resource_sprout, 'Y', AEItems.pig_chunk
		});
		GameRegistry.addShapedRecipe(new ItemStack(AEItems.rabbit_sprout), new Object[] {
				" X ", "XYX", " X ",
				'X', AEItems.resource_sprout, 'Y', AEItems.rabbit_chunk
		});
		
	}
	
	public static void initSmelting() {
		
	}
	
	public static void initOreDictionary() {
		
		OreDictionary.registerOre("seed", new ItemStack(AEItems.resource_seed));
		
	}

}
