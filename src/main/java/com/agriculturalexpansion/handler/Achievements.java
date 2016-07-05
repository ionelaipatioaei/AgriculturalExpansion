package com.agriculturalexpansion.handler;

import com.agriculturalexpansion.init.AEItems;

import net.minecraft.init.Items;
import net.minecraft.stats.Achievement;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class Achievements {
	
	public static Achievement sproutFarmer = new Achievement("achievement.sproutFarmer", "sproutFarmer", 0, 0, AEItems.resource_seed, (Achievement)null).registerStat();
	public static Achievement collectSprout = new Achievement("achievement.collectSprout", "collectSprout", 0, -2, AEItems.resource_sprout, sproutFarmer).registerStat();
	public static Achievement collectPowerfulSprout = new Achievement("achievement.collectPowerfulSprout", "collectPowerfulSprout", -2, 1, AEItems.powerful_sprout, collectSprout).registerStat();
	public static Achievement collectUltimateSprout = new Achievement("achievement.collectUltimateSprout", "collectUltimateSprout", 2, 1, AEItems.ultimate_sprout, collectSprout).registerStat();

	public static Achievement basicSprout = new Achievement("achievement.basicSprout", "basicSprout", 0, -4, AEItems.coal_sprout, collectSprout).registerStat();
	public static Achievement collectEssence = new Achievement("achievement.collectEssence", "collectEssence", -2, -4, AEItems.coal_essence, basicSprout).registerStat();
	public static Achievement useEssence = new Achievement("achievement.useEssence", "useEssence", -2, -5, Items.COAL, collectEssence).registerStat();
	public static Achievement oreDictSprout = new Achievement("achievement.oreDictSprout", "oreDictSprout", 1, -6, AEItems.copper_sprout, basicSprout).registerStat();
	public static Achievement specialSproutCraft = new Achievement("achievement.specialSproutCraft", "specialSproutCraft", -2, -2, AEItems.earth_sprout_former, collectPowerfulSprout).registerStat();
	public static Achievement specialSprout = new Achievement("achievement.specialSprout", "specialSprout", -3, -1, AEItems.earth_sprout, specialSproutCraft).registerStat();
	public static Achievement mobSprout = new Achievement("achievement.mobSprout", "mobSprout", 3, -2, AEItems.zombie_chunk, sproutFarmer).registerStat();
	public static Achievement endermanSprout = new Achievement("achievement.endermanSprout", "endermanSprout", 3, -1, AEItems.enderman_sprout, mobSprout).registerStat();
	public static Achievement witherSprout = new Achievement("achievement.witherSprout", "witherSprout", 3, 0, AEItems.wither_sprout, mobSprout).registerStat();

	public static Achievement newSprout = new Achievement("achievement.newSprout", "newSprout", -4, 1, AEItems.iron_sprout, collectPowerfulSprout).registerStat();
	public static Achievement gemSprout = new Achievement("achievement.gemSprout", "gemSprout", -3, 2, AEItems.ruby_sprout, collectPowerfulSprout).registerStat();

	public static Achievement diamondSprout = new Achievement("achievement.diamondSprout", "diamondSprout", 2, 2, AEItems.diamond_sprout, collectUltimateSprout).registerStat();
	public static Achievement cobaltSprout = new Achievement("achievement.cobaltSprout", "cobaltSprout", 1, 3, AEItems.cobalt_sprout, collectUltimateSprout).registerStat();
	public static Achievement iridiumSprout = new Achievement("achievement.iridiumSprout", "iridiumSprout", 0, 3, AEItems.iridium_sprout, collectUltimateSprout).registerStat();

	public static void initAchievements() {
	
	AchievementPage.registerAchievementPage(new AchievementPage("Agricultural Expansion", new Achievement[]
			{sproutFarmer, collectSprout, collectPowerfulSprout, collectUltimateSprout, basicSprout, collectEssence, useEssence, oreDictSprout, specialSprout, specialSproutCraft, mobSprout, endermanSprout, witherSprout, newSprout, gemSprout, diamondSprout, cobaltSprout, iridiumSprout}
	));

	FMLCommonHandler.instance().bus().register(new AchievementsTrigger());
	}
	
}
