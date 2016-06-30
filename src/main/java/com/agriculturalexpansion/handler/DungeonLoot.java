package com.agriculturalexpansion.handler;

import com.agriculturalexpansion.init.AEItems;
import com.agriculturalexpansion.main.Reference;

import net.minecraft.world.storage.loot.LootEntryItem;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.functions.LootFunction;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DungeonLoot {
	
	@SubscribeEvent
    public void lootTableLoadEvent(LootTableLoadEvent event) {
        if (event.getName().equals(LootTableList.CHESTS_ABANDONED_MINESHAFT) ||
                event.getName().equals(LootTableList.CHESTS_IGLOO_CHEST) ||
                event.getName().equals(LootTableList.CHESTS_DESERT_PYRAMID) ||
                event.getName().equals(LootTableList.CHESTS_JUNGLE_TEMPLE) ||
                event.getName().equals(LootTableList.CHESTS_VILLAGE_BLACKSMITH)) {
            LootPool main = event.getTable().getPool("main");
            //Resource Seed
            main.addEntry(new LootEntryItem(AEItems.resource_seed, ConfigurationFile.resourceSeeds, 0, new LootFunction[0], new LootCondition[0], Reference.MOD_ID + ":resourceSeeds"));
            
            //Vanilla Sprouts
            main.addEntry(new LootEntryItem(AEItems.coal_sprout, ConfigurationFile.coalSprouts, 0, new LootFunction[0], new LootCondition[0], Reference.MOD_ID + ":coalSprouts"));
            main.addEntry(new LootEntryItem(AEItems.iron_sprout, ConfigurationFile.ironSprouts, 0, new LootFunction[0], new LootCondition[0], Reference.MOD_ID + ":ironSprouts"));
            main.addEntry(new LootEntryItem(AEItems.gold_sprout, ConfigurationFile.goldSprouts, 0, new LootFunction[0], new LootCondition[0], Reference.MOD_ID + ":goldSprouts"));
            main.addEntry(new LootEntryItem(AEItems.lapis_sprout, ConfigurationFile.lapisSprouts, 0, new LootFunction[0], new LootCondition[0], Reference.MOD_ID + ":lapisSprouts"));
            main.addEntry(new LootEntryItem(AEItems.quartz_sprout, ConfigurationFile.quartzSprouts, 0, new LootFunction[0], new LootCondition[0], Reference.MOD_ID + ":quartzSprouts"));
            main.addEntry(new LootEntryItem(AEItems.redstone_sprout, ConfigurationFile.redstoneSprouts, 0, new LootFunction[0], new LootCondition[0], Reference.MOD_ID + ":redstoneSprouts"));
            main.addEntry(new LootEntryItem(AEItems.diamond_sprout, ConfigurationFile.diamondSprouts, 0, new LootFunction[0], new LootCondition[0], Reference.MOD_ID + ":diamondSprouts"));
            main.addEntry(new LootEntryItem(AEItems.emerald_sprout, ConfigurationFile.emeraldSprouts, 0, new LootFunction[0], new LootCondition[0], Reference.MOD_ID + ":emeraldSprouts"));
            main.addEntry(new LootEntryItem(AEItems.glowstone_sprout, ConfigurationFile.glowstoneSprouts, 0, new LootFunction[0], new LootCondition[0], Reference.MOD_ID + ":glowstoneSprouts"));
            
            //Hostile Mobs Sprouts
            main.addEntry(new LootEntryItem(AEItems.zombie_sprout, ConfigurationFile.zombieSprouts, 0, new LootFunction[0], new LootCondition[0], Reference.MOD_ID + ":zombieSprouts"));
            main.addEntry(new LootEntryItem(AEItems.creeper_sprout, ConfigurationFile.creeperSprouts, 0, new LootFunction[0], new LootCondition[0], Reference.MOD_ID + ":creeperSprouts"));
            main.addEntry(new LootEntryItem(AEItems.skeleton_sprout, ConfigurationFile.skeletonSprouts, 0, new LootFunction[0], new LootCondition[0], Reference.MOD_ID + ":skeletonSprouts"));
            main.addEntry(new LootEntryItem(AEItems.slime_sprout, ConfigurationFile.slimeSprouts, 0, new LootFunction[0], new LootCondition[0], Reference.MOD_ID + ":slimeSprouts"));
            main.addEntry(new LootEntryItem(AEItems.spider_sprout, ConfigurationFile.spiderSprouts, 0, new LootFunction[0], new LootCondition[0], Reference.MOD_ID + ":spiderSprouts"));
            main.addEntry(new LootEntryItem(AEItems.guardian_sprout, ConfigurationFile.guardianSprouts, 0, new LootFunction[0], new LootCondition[0], Reference.MOD_ID + ":guardianSprouts"));
            main.addEntry(new LootEntryItem(AEItems.ghast_sprout, ConfigurationFile.ghastSprouts, 0, new LootFunction[0], new LootCondition[0], Reference.MOD_ID + ":ghastSprouts"));
            main.addEntry(new LootEntryItem(AEItems.wither_sprout, ConfigurationFile.witherSprouts, 0, new LootFunction[0], new LootCondition[0], Reference.MOD_ID + ":witherSprouts"));
            main.addEntry(new LootEntryItem(AEItems.blaze_sprout, ConfigurationFile.blazeSprouts, 0, new LootFunction[0], new LootCondition[0], Reference.MOD_ID + ":blazeSprouts"));
            main.addEntry(new LootEntryItem(AEItems.enderman_sprout, ConfigurationFile.endermanSprouts, 0, new LootFunction[0], new LootCondition[0], Reference.MOD_ID + ":endermanSprouts"));
            
            //Passive Mobs Sprouts
            main.addEntry(new LootEntryItem(AEItems.squid_sprout, ConfigurationFile.squidSprouts, 0, new LootFunction[0], new LootCondition[0], Reference.MOD_ID + ":squidSprouts"));
            main.addEntry(new LootEntryItem(AEItems.cow_sprout, ConfigurationFile.cowSprouts, 0, new LootFunction[0], new LootCondition[0], Reference.MOD_ID + ":cowSprouts"));
            main.addEntry(new LootEntryItem(AEItems.sheep_sprout, ConfigurationFile.sheepSprouts, 0, new LootFunction[0], new LootCondition[0], Reference.MOD_ID + ":sheepSprouts"));
            main.addEntry(new LootEntryItem(AEItems.chicken_sprout, ConfigurationFile.chickenSprouts, 0, new LootFunction[0], new LootCondition[0], Reference.MOD_ID + ":chickenSprouts"));
            main.addEntry(new LootEntryItem(AEItems.pig_sprout, ConfigurationFile.pigSprouts, 0, new LootFunction[0], new LootCondition[0], Reference.MOD_ID + ":pigSprouts"));
            main.addEntry(new LootEntryItem(AEItems.rabbit_sprout, ConfigurationFile.rabbitSprouts, 0, new LootFunction[0], new LootCondition[0], Reference.MOD_ID + ":rabbitSprouts"));
            
            //Other Sprouts
            main.addEntry(new LootEntryItem(AEItems.earth_sprout, ConfigurationFile.earthSprouts, 0, new LootFunction[0], new LootCondition[0], Reference.MOD_ID + ":earthSprouts"));
            main.addEntry(new LootEntryItem(AEItems.water_sprout, ConfigurationFile.waterSprouts, 0, new LootFunction[0], new LootCondition[0], Reference.MOD_ID + ":waterSprouts"));
            main.addEntry(new LootEntryItem(AEItems.fire_sprout, ConfigurationFile.fireSprouts, 0, new LootFunction[0], new LootCondition[0], Reference.MOD_ID + ":fireSprouts"));
            main.addEntry(new LootEntryItem(AEItems.experience_sprout, ConfigurationFile.experienceSprouts, 0, new LootFunction[0], new LootCondition[0], Reference.MOD_ID + ":experienceSprouts"));
            main.addEntry(new LootEntryItem(AEItems.dye_sprout, ConfigurationFile.dyeSprouts, 0, new LootFunction[0], new LootCondition[0], Reference.MOD_ID + ":dyeSprouts"));
            
        }
    }

}
