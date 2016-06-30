package com.agriculturalexpansion.handler;

import com.agriculturalexpansion.init.AEItems;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

public class AchievementsTrigger {
	
	@SubscribeEvent
	public void whehIPickUp(PlayerEvent.ItemPickupEvent event) {
		//collectSprout
		if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(AEItems.resource_sprout))) {
			event.player.addStat(Achievements.collectSprout, 1);
		}
		
		//collectChunk
		if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(AEItems.zombie_chunk))) {
			event.player.addStat(Achievements.collectChunk, 1);
		}
		if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(AEItems.creeper_chunk))) {
			event.player.addStat(Achievements.collectChunk, 1);
		}
		if(event.pickedUp.getEntityItem().isItemEqual(new ItemStack(AEItems.skeleton_chunk))) {
			event.player.addStat(Achievements.collectChunk, 1);
		}
	}
	
	@SubscribeEvent
	public void whenICraft(PlayerEvent.ItemCraftedEvent event) {
		//sproutFarmer
		if(event.crafting.getItem().equals(AEItems.resource_seed)) {
			event.player.addStat(Achievements.sproutFarmer, 1);
		}
		
		//growMobs
		if(event.crafting.getItem().equals(AEItems.zombie_sprout)) {
			event.player.addStat(Achievements.growMobs);
		}
		if(event.crafting.getItem().equals(AEItems.creeper_sprout)) {
			event.player.addStat(Achievements.growMobs);
		}
		if(event.crafting.getItem().equals(AEItems.skeleton_sprout)) {
			event.player.addStat(Achievements.growMobs);
		}
		
		//growGhast
		if(event.crafting.getItem().equals(AEItems.ghast_sprout)) {
			event.player.addStat(Achievements.growGhast);
		}
		//growWither
		if(event.crafting.getItem().equals(AEItems.wither_sprout)) {
			event.player.addStat(Achievements.growWither);
		}
		//growEnderman
		if(event.crafting.getItem().equals(AEItems.enderman_sprout)) {
			event.player.addStat(Achievements.growEnderman);
		}
		//growResource
		if(event.crafting.getItem().equals(AEItems.coal_sprout)) {
			event.player.addStat(Achievements.growResource);
		}
		if(event.crafting.getItem().equals(AEItems.iron_sprout)) {
			event.player.addStat(Achievements.growResource);
		}
		if(event.crafting.getItem().equals(AEItems.gold_sprout)) {
			event.player.addStat(Achievements.growResource);
		}
		
		//growDiamond
		if(event.crafting.getItem().equals(AEItems.diamond_sprout)) {
			event.player.addStat(Achievements.growDiamond);
		}
		
		//growEmerald
		if(event.crafting.getItem().equals(AEItems.emerald_sprout)) {
			event.player.addStat(Achievements.growEmerald);
		}
		
		//growGlowstone
		if(event.crafting.getItem().equals(AEItems.glowstone_sprout)) {
			event.player.addStat(Achievements.growGlowstone);
		}
	}

}
