package com.agriculturalexpansion.handler;

import com.agriculturalexpansion.init.AEItems;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

public class AchievementsTrigger {

	public ItemStack[][] trigger = {
			{new ItemStack(AEItems.resource_sprout), new ItemStack(AEItems.powerful_sprout), new ItemStack(AEItems.ultimate_sprout)}
    };

	public Achievement[][] achievements = {
			{Achievements.collectSprout, Achievements.collectPowerfulSprout, Achievements.collectUltimateSprout},
	};

	@SubscribeEvent
	public void pickUp(PlayerEvent.ItemPickupEvent event) {
		for (int i = 0; i < trigger[0].length; i++) {
			if(event.pickedUp.getEntityItem().isItemEqual(trigger[0][i])) {
				event.player.addStat(achievements[0][i], 1);
			}
		}
		if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(AEItems.coal_essence))) {
			event.player.addStat(Achievements.collectEssence, 1);
		}
		if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(AEItems.zombie_chunk))) {
			event.player.addStat(Achievements.mobSprout, 1);
		}
        if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(AEItems.creeper_chunk))) {
            event.player.addStat(Achievements.mobSprout, 1);
        }
        if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(AEItems.skeleton_chunk))) {
            event.player.addStat(Achievements.mobSprout, 1);
        }
	}
	@SubscribeEvent
	public void craft(PlayerEvent.ItemCraftedEvent event) {
        if (event.crafting.getItem().equals(AEItems.resource_seed)) {
            event.player.addStat(Achievements.sproutFarmer, 1);
        }
        if (event.crafting.getItem().equals(AEItems.coal_sprout)) {
            event.player.addStat(Achievements.basicSprout, 1);
        }
        if (event.crafting.getItem().equals(Items.COAL)) {
            event.player.addStat(Achievements.useEssence, 1);
        }
        if (event.crafting.getItem().equals(AEItems.copper_sprout)) {
            event.player.addStat(Achievements.oreDictSprout, 1);
        }
        if (event.crafting.getItem().equals(AEItems.earth_sprout_former)) {
            event.player.addStat(Achievements.specialSproutCraft, 1);
        }
        if (event.crafting.getItem().equals(AEItems.earth_sprout)) {
            event.player.addStat(Achievements.specialSprout, 1);
        }

        if (event.crafting.getItem().equals(AEItems.enderman_sprout)) {
            event.player.addStat(Achievements.endermanSprout, 1);
        }
        if (event.crafting.getItem().equals(AEItems.wither_sprout)) {
            event.player.addStat(Achievements.witherSprout, 1);
        }
        if (event.crafting.getItem().equals(AEItems.iron_sprout)) {
            event.player.addStat(Achievements.newSprout, 1);
        }
        if (event.crafting.getItem().equals(AEItems.ruby_sprout)) {
            event.player.addStat(Achievements.gemSprout, 1);
        }
        if (event.crafting.getItem().equals(AEItems.sapphire_sprout)) {
            event.player.addStat(Achievements.gemSprout, 1);
        }
        if (event.crafting.getItem().equals(AEItems.diamond_sprout)) {
            event.player.addStat(Achievements.diamondSprout, 1);
        }
        if (event.crafting.getItem().equals(AEItems.cobalt_sprout)) {
            event.player.addStat(Achievements.cobaltSprout, 1);
        }
        if (event.crafting.getItem().equals(AEItems.iridium_sprout)) {
            event.player.addStat(Achievements.iridiumSprout, 1);
        }
	}
}
