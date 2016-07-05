package com.agriculturalexpansion.handler;

import com.agriculturalexpansion.init.AEItems;
import com.agriculturalexpansion.main.Reference;

import net.minecraft.item.Item;
import net.minecraft.world.storage.loot.LootEntryItem;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraft.world.storage.loot.functions.LootFunction;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class DungeonLoot {

    public static Item[] items = {
            AEItems.resource_seed,
            AEItems.coal_sprout, AEItems.iron_sprout, AEItems.gold_sprout, AEItems.lapis_sprout, AEItems.quartz_sprout, AEItems.redstone_sprout, AEItems.diamond_sprout, AEItems.emerald_sprout, AEItems.glowstone_sprout,
            AEItems.zombie_sprout, AEItems.creeper_sprout, AEItems.skeleton_sprout, AEItems.slime_sprout, AEItems.spider_sprout, AEItems.guardian_sprout, AEItems.ghast_sprout, AEItems.wither_sprout, AEItems.blaze_sprout, AEItems.enderman_sprout,
            AEItems.squid_sprout, AEItems.cow_sprout, AEItems.sheep_sprout, AEItems.chicken_sprout, AEItems.pig_sprout, AEItems.rabbit_sprout,
            AEItems.earth_sprout, AEItems.water_sprout, AEItems.fire_sprout, AEItems.experience_sprout, AEItems.dye_sprout, AEItems.nature_sprout, AEItems.nether_sprout,
    };

    public static int[] ints = {
            ConfigurationFile.resourceSeeds,
            ConfigurationFile.coalSprouts, ConfigurationFile.ironSprouts, ConfigurationFile.goldSprouts, ConfigurationFile.lapisSprouts, ConfigurationFile.quartzSprouts, ConfigurationFile.redstoneSprouts, ConfigurationFile.diamondSprouts, ConfigurationFile.emeraldSprouts, ConfigurationFile.glowstoneSprouts,
            ConfigurationFile.zombieSprouts, ConfigurationFile.creeperSprouts, ConfigurationFile.skeletonSprouts, ConfigurationFile.slimeSprouts, ConfigurationFile.spiderSprouts, ConfigurationFile.guardianSprouts, ConfigurationFile.ghastSprouts, ConfigurationFile.witherSprouts, ConfigurationFile.blazeSprouts, ConfigurationFile.endermanSprouts,
            ConfigurationFile.squidSprouts, ConfigurationFile.cowSprouts, ConfigurationFile.sheepSprouts, ConfigurationFile.chickenSprouts, ConfigurationFile.pigSprouts, ConfigurationFile.rabbitSprouts,
            ConfigurationFile.earthSprouts, ConfigurationFile.waterSprouts, ConfigurationFile.fireSprouts, ConfigurationFile.experienceSprouts, ConfigurationFile.dyeSprouts, ConfigurationFile.natureSprouts, ConfigurationFile.netherSprouts
    };
	
	@SubscribeEvent
    public void lootTableLoadEvent(LootTableLoadEvent event) {
        if (event.getName().equals(LootTableList.CHESTS_ABANDONED_MINESHAFT) ||
                event.getName().equals(LootTableList.CHESTS_IGLOO_CHEST) ||
                event.getName().equals(LootTableList.CHESTS_DESERT_PYRAMID) ||
                event.getName().equals(LootTableList.CHESTS_JUNGLE_TEMPLE) ||
                event.getName().equals(LootTableList.CHESTS_VILLAGE_BLACKSMITH) ||
                event.getName().equals(LootTableList.CHESTS_SIMPLE_DUNGEON)) {
            LootPool main = event.getTable().getPool("main");
            for(int i = 0; i < items.length; i++) {
                main.addEntry(new LootEntryItem(items[i], ints[i], 0, new LootFunction[0], new LootCondition[0], Reference.MOD_ID + ":" + items[i].getUnlocalizedName()));
            }
        }
    }

}
