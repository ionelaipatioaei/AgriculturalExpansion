package com.agriculturalexpansion.extend;

import com.agriculturalexpansion.init.AEItems;

import net.minecraft.item.Item;

public class AECrops {
	
	//Resource Crop
	
	public static class ResourceCrop extends AECrop {

		public ResourceCrop(String name) {
			super(name);

		}
		
		public Item getSeed() {
			return AEItems.resource_seed;
		}
		
		public Item getCrop() {
			return AEItems.resource_sprout;
		}
		
	}
	
	//Vanilla Resources
	
	public static class CoalCrop extends AECrop {
		
		public CoalCrop(String name) {
			super(name);

		}
		
		public Item getSeed() {
			return AEItems.coal_sprout;
		}
		
		public Item getCrop() {
			return AEItems.coal_essence;
		}

	}
	
	public static class IronCrop extends AECrop {

		public IronCrop(String name) {
			super(name);

		}
		
		public Item getSeed() {
			return AEItems.iron_sprout;
		}
		
		public Item getCrop() {
			return AEItems.iron_essence;
		}
		
	}
	
	public static class GoldCrop extends AECrop {

		public GoldCrop(String name) {
			super(name);

		}
		
		public Item getSeed() {
			return AEItems.gold_sprout;
		}
		
		public Item getCrop() {
			return AEItems.gold_essence;
		}

	}

	public static class LapisCrop extends AECrop {

		public LapisCrop(String name) {
			super(name);

		}
		
		public Item getSeed() {
			return AEItems.lapis_sprout;
		}
		
		public Item getCrop() {
			return AEItems.lapis_essence;
		}

	}
	
	public static class QuartzCrop extends AECrop {

		public QuartzCrop(String name) {
			super(name);

		}
		
		public Item getSeed() {
			return AEItems.quartz_sprout;
		}
		
		public Item getCrop() {
			return AEItems.quartz_essence;
		}

	}
	
	public static class RedstoneCrop extends AECrop {

		public RedstoneCrop(String name) {
			super(name);
		
		}
		
		public Item getSeed() {
			return AEItems.redstone_sprout;
		}
		
		public Item getCrop() {
			return AEItems.redstone_essence;
		}

	}
	
	public static class DiamondCrop extends AECrop {

		public DiamondCrop(String name) {
			super(name);

		}
		
		public Item getSeed() {
			return AEItems.diamond_sprout;
		}
		
		public Item getCrop() {
			return AEItems.diamond_essence;
		}

	}
	
	public static class EmeraldCrop extends AECrop {

		public EmeraldCrop(String name) {
			super(name);

		}
		
		public Item getSeed() {
			return AEItems.emerald_sprout;
		}
		
		public Item getCrop() {
			return AEItems.emerald_essence;
		}

	}
	
	public static class GlowstoneCrop extends AECrop {

		public GlowstoneCrop(String name) {
			super(name);

		}
		
		public Item getSeed() {
			return AEItems.glowstone_sprout;
		}
		
		public Item getCrop() {
			return AEItems.glowstone_essence;
		}

	}
	
	//Hostile Mobs
	
	public static class ZombieCrop extends AECrop {

		public ZombieCrop(String name) {
			super(name);

		}
		
		public Item getSeed() {
			return AEItems.zombie_sprout;
		}
		
		public Item getCrop() {
			return AEItems.zombie_essence;
		}

	}
	
	public static class CreeperCrop extends AECrop {

		public CreeperCrop(String name) {
			super(name);
			
		}
		
		public Item getSeed() {
			return AEItems.creeper_sprout;
		}
		
		public Item getCrop() {
			return AEItems.creeper_essence;
		}

	}
	
	public static class SkeletonCrop extends AECrop {

		public SkeletonCrop(String name) {
			super(name);

		}
		
		public Item getSeed() {
			return AEItems.skeleton_sprout;
		}
		
		public Item getCrop() {
			return AEItems.skeleton_essence;
		}

	}

	public static class SlimeCrop extends AECrop {

		public SlimeCrop(String name) {
			super(name);

		}
		
		public Item getSeed() {
			return AEItems.slime_sprout;
		}
		
		public Item getCrop() {
			return AEItems.slime_essence;
		}

	}
	
	public static class SpiderCrop extends AECrop {

		public SpiderCrop(String name) {
			super(name);

		}
		
		public Item getSeed() {
			return AEItems.spider_sprout;
		}
		
		public Item getCrop() {
			return AEItems.spider_essence;
		}

	}
	
	public static class GuardianCrop extends AECrop {

		public GuardianCrop(String name) {
			super(name);

		}
		
		public Item getSeed() {
			return AEItems.guardian_sprout;
		}
		
		public Item getCrop() {
			return AEItems.guardian_essence;
		}

	}
	
	public static class GhastCrop extends AECrop {

		public GhastCrop(String name) {
			super(name);

		}
		
		public Item getSeed() {
			return AEItems.ghast_sprout;
		}
		
		public Item getCrop() {
			return AEItems.ghast_essence;
		}

	}
	
	public static class WitherCrop extends AECrop {

		public WitherCrop(String name) {
			super(name);

		}
		
		public Item getSeed() {
			return AEItems.wither_sprout;
		}
		
		public Item getCrop() {
			return AEItems.wither_essence;
		}

	}
	
	public static class BlazeCrop extends AECrop {

		public BlazeCrop(String name) {
			super(name);

		}
		
		public Item getSeed() {
			return AEItems.blaze_sprout;
		}
		
		public Item getCrop() {
			return AEItems.blaze_essence;
		}

	}

	public static class EndermanCrop extends AECrop {

		public EndermanCrop(String name) {
			super(name);

		}
		
		public Item getSeed() {
			return AEItems.enderman_sprout;
		}
		
		public Item getCrop() {
			return AEItems.enderman_essence;
		}

	}
	
	public static class SquidCrop extends AECrop {

		public SquidCrop(String name) {
			super(name);

		}
		
		public Item getSeed() {
			return AEItems.squid_sprout;
		}
		
		public Item getCrop() {
			return AEItems.squid_essence;
		}

	}
	
	//Pasive Mobs
	public static class CowCrop extends AECrop {

		public CowCrop(String name) {
			super(name);

		}
		
		public Item getSeed() {
			return AEItems.cow_sprout;
		}
		
		public Item getCrop() {
			return AEItems.cow_essence;
		}

	}
	
	public static class SheepCrop extends AECrop {

		public SheepCrop(String name) {
			super(name);

		}
		
		public Item getSeed() {
			return AEItems.sheep_sprout;
		}
		
		public Item getCrop() {
			return AEItems.sheep_essence;
		}

	}
	
	public static class ChickenCrop extends AECrop {

		public ChickenCrop(String name) {
			super(name);

		}
		
		public Item getSeed() {
			return AEItems.chicken_sprout;
		}
		
		public Item getCrop() {
			return AEItems.chicken_essence;
		}

	}
	
	public static class PigCrop extends AECrop {

		public PigCrop(String name) {
			super(name);

		}
		
		public Item getSeed() {
			return AEItems.pig_sprout;
		}
		
		public Item getCrop() {
			return AEItems.pig_essence;
		}

	}
	
	public static class RabbitCrop extends AECrop {

		public RabbitCrop(String name) {
			super(name);

		}
		
		public Item getSeed() {
			return AEItems.rabbit_sprout;
		}
		
		public Item getCrop() {
			return AEItems.rabbit_essence;
		}

	}
	
	//OreDictionary Resources

	
}
