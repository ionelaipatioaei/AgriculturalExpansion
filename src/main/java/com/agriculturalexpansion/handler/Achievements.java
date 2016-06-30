package com.agriculturalexpansion.handler;

import com.agriculturalexpansion.init.AEItems;

import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class Achievements {
	
	public static Achievement sproutFarmer = new Achievement("achievement.sproutFarmer", "sproutFarmer", 0, 0, AEItems.resource_seed, (Achievement)null).registerStat();
	public static Achievement collectSprout = new Achievement("achievement.collectSprout", "collectSprout", -2, 1, AEItems.resource_sprout, sproutFarmer).registerStat();
	
	public static Achievement collectChunk = new Achievement("achievement.collectChunk", "collectChunk", 2, -1, AEItems.zombie_chunk, sproutFarmer).registerStat();
	
	public static Achievement growMobs = new Achievement("achievement.growMobs", "growMobs", 4, 0, AEItems.zombie_sprout, collectChunk).registerStat();
	public static Achievement growGhast = new Achievement("achievement.growGhast", "growGhast", 4, 1, AEItems.ghast_sprout, growMobs).registerStat();
	public static Achievement growWither = new Achievement("achievement.growWither", "growWither", 4, 2, AEItems.wither_sprout, growMobs).registerStat();
	public static Achievement growEnderman = new Achievement("achievement.growEnderman", "growEnderman", 4, 3, AEItems.enderman_sprout, growMobs).registerStat();
	
	public static Achievement growResource = new Achievement("achievement.growResource", "growResource", -4, 0, AEItems.iron_sprout, collectSprout).registerStat();
	public static Achievement growDiamond = new Achievement("achievement.growDiamond", "growDiamond", -4, -1, AEItems.diamond_sprout, growResource).registerStat();
	public static Achievement growEmerald = new Achievement("achievement.growEmerald", "growEmerald", -4, -2, AEItems.emerald_sprout, growResource).registerStat();
	public static Achievement growGlowstone = new Achievement("achievement.growGlowstone", "growGlowstone", -4, -3, AEItems.glowstone_sprout, growResource).registerStat();
	
	public static void initAchievements() {
	
	AchievementPage.registerAchievementPage(new AchievementPage("Agricultural Expansion", new Achievement[] 
			{sproutFarmer, collectSprout, collectChunk, growMobs, growResource, growDiamond, growEmerald, growGlowstone, growGhast, growWither, growEnderman}
	));

	FMLCommonHandler.instance().bus().register(new AchievementsTrigger());
	
	}
	
}
