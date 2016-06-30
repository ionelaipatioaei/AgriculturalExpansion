package com.agriculturalexpansion.handler;

import java.io.File;

import com.agriculturalexpansion.main.Reference;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ConfigurationFile {
	
	public static Configuration config;
	
	public static boolean canUseBonemeal;
	
	public static boolean enableSproutBlockCrafting;
	public static boolean reusableSproutsFromBlock;
	
	public static int resourceSeeds;
	
	public static int coalSprouts;
	public static int ironSprouts;
	public static int goldSprouts;
	public static int lapisSprouts;
	public static int quartzSprouts;
	public static int redstoneSprouts;
	public static int diamondSprouts;
	public static int emeraldSprouts;
	public static int glowstoneSprouts;
	
	public static int zombieSprouts;
	public static int creeperSprouts;
	public static int skeletonSprouts;
	public static int slimeSprouts;
	public static int spiderSprouts;
	public static int guardianSprouts;
	public static int ghastSprouts;
	public static int witherSprouts;
	public static int blazeSprouts;
	public static int endermanSprouts;
	
	public static int squidSprouts;
	public static int cowSprouts;
	public static int sheepSprouts;
	public static int chickenSprouts;
	public static int pigSprouts;
	public static int rabbitSprouts;
	
	public static int earthSprouts;
	public static int waterSprouts;
	public static int fireSprouts;
	public static int experienceSprouts;
	public static int dyeSprouts;
	
	@SubscribeEvent
    public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent eventArgs) {
        if (eventArgs.getModID().equals(Reference.MOD_ID)) {
            ConfigurationFile.syncConfig();
        }
    }
	
	public static void init(File file) {
        config = new Configuration(file);
        syncConfig();
	}
	
	public static void syncConfig() {
		String category;
		
		category = "Loot chances";
		config.addCustomCategoryComment(category, "Set to 0 to disable, 1 is very rare(like golden apple) and 100 is very common");
		resourceSeeds = config.getInt("resourceSeeds", category, 35, 0, 100, "Resource Seeds generation");
		
		coalSprouts = config.getInt("coalSprouts", category, 10, 0, 100, "Coal Sprouts generation");
		ironSprouts = config.getInt("ironSprouts", category, 9, 0, 100, "Iron Sprouts generation");
		goldSprouts = config.getInt("goldSprouts", category, 9, 0, 100, "Gold Sprouts generation");
		lapisSprouts = config.getInt("lapisSprouts", category, 10, 0, 100, "Lapis Sprouts generation");
		quartzSprouts = config.getInt("quartzSprouts", category, 12, 0, 100, "Quartz Sprouts generation");
		redstoneSprouts = config.getInt("redstoneSprouts", category, 15, 0, 100, "Redstone Sprouts generation");
		diamondSprouts = config.getInt("diamondSprouts", category, 5, 0, 100, "Diamond Sprouts generation");
		emeraldSprouts = config.getInt("emeraldSprouts", category, 5, 0, 100, "Emerald Sprouts generation");
		glowstoneSprouts = config.getInt("glowstoneSprouts", category, 12, 0, 100, "Glowstone Sprouts generation");
		 
		zombieSprouts = config.getInt("zombieSprouts", category, 10, 0, 100, "Zombie Sprouts generation");
		creeperSprouts = config.getInt("creeperSprouts", category, 9, 0, 100, "Creeper Sprouts generation");
		skeletonSprouts = config.getInt("skeletonSprouts", category, 10, 0, 100, "Skeleton Sprouts generation");
		slimeSprouts = config.getInt("slimeSprouts", category, 9, 0, 100, "Slime Sprouts generation");
		spiderSprouts = config.getInt("spiderSprouts", category, 10, 0, 100, "Spider Sprouts generation");
		guardianSprouts = config.getInt("guardianSprouts", category, 7, 0, 100, "Guardian Sprouts generation");
		ghastSprouts = config.getInt("ghastSprouts", category, 5, 0, 100, "Ghast Sprouts generation");
		witherSprouts = config.getInt("witherSprouts", category, 5, 0, 100, "Wither Sprouts generation");
		blazeSprouts = config.getInt("blazeSprouts", category, 7, 0, 100, "Blaze Sprouts generation");
		endermanSprouts = config.getInt("endermanSprouts", category, 9, 0, 100, "Enderman Sprouts generation");
		
		squidSprouts = config.getInt("squidSprouts", category, 11, 0, 100, "Squid Sprouts generation");
		cowSprouts = config.getInt("cowSprouts", category, 9, 0, 100, "Cow Sprouts generation");
		sheepSprouts = config.getInt("sheepSprouts", category, 9, 0, 100, "Sheep Sprouts generation");
		chickenSprouts = config.getInt("chickenSprouts", category, 8, 0, 100, "Chicken Sprouts generation");
		pigSprouts = config.getInt("pigSprouts", category, 9, 0, 100, "Pig Sprouts generation");
		rabbitSprouts = config.getInt("rabbitSprouts", category, 7, 0, 100, "Rabbit Sprouts generation");
		
		rabbitSprouts = config.getInt("earthSprouts", category, 7, 0, 100, "Earth Sprouts generation");
		rabbitSprouts = config.getInt("waterSprouts", category, 6, 0, 100, "Water Sprouts generation");
		rabbitSprouts = config.getInt("fireSprouts", category, 8, 0, 100, "Fire Sprouts generation");
		rabbitSprouts = config.getInt("experienceSprouts", category, 5, 0, 100, "Experience Sprouts generation");
		rabbitSprouts = config.getInt("dyeSprouts", category, 10, 0, 100, "Dye Sprouts generation");
		
		category = "General";
		config.addCustomCategoryComment(category, "General Settings");
		canUseBonemeal = config.getBoolean("canUseBonemeal", category, false, "Set to true if bonemeal can be used on crops.");
		
		category = "Crafting";
		config.addCustomCategoryComment(category, "Disable/enable recipes.");
		enableSproutBlockCrafting = config.getBoolean("enableSproutBlockCrafting", category, true, "Set to false to disable Sprout Block crafting recipe.");
		reusableSproutsFromBlock = config.getBoolean("reusableSproutsFromBlock", category, true, "Set to false if you don't want to be able to craft sprouts using Sprout Block.");
		
		config.save();
	}

}
