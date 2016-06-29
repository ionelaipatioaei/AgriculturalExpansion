package com.agriculturalexpansion.extend;

import com.agriculturalexpansion.init.AEItems;

import net.minecraft.item.Item;

public class AECrops {
	
	//Resource Crop
	public static class ResourceCrop extends AECrop {
		public ResourceCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.resource_seed;}
		public Item getCrop() {return AEItems.resource_sprout;}}
	
	//Vanilla Resources
	public static class CoalCrop extends AECrop {
		public CoalCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.coal_sprout;}
		public Item getCrop() {return AEItems.coal_essence;}}
	
	public static class IronCrop extends AECrop {
		public IronCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.iron_sprout;}
		public Item getCrop() {return AEItems.iron_essence;}}
	
	public static class GoldCrop extends AECrop {
		public GoldCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.gold_sprout;}
		public Item getCrop() {return AEItems.gold_essence;}}

	public static class LapisCrop extends AECrop {
		public LapisCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.lapis_sprout;}
		public Item getCrop() {return AEItems.lapis_essence;}}
	
	public static class QuartzCrop extends AECrop {
		public QuartzCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.quartz_sprout;}
		public Item getCrop() {return AEItems.quartz_essence;}}
	
	public static class RedstoneCrop extends AECrop {
		public RedstoneCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.redstone_sprout;}
		public Item getCrop() {return AEItems.redstone_essence;}}
	
	public static class DiamondCrop extends AECrop {
		public DiamondCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.diamond_sprout;}
	    public Item getCrop() {return AEItems.diamond_essence;}}
	
	public static class EmeraldCrop extends AECrop {
		public EmeraldCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.emerald_sprout;}
		public Item getCrop() {return AEItems.emerald_essence;}}
	
	public static class GlowstoneCrop extends AECrop {
		public GlowstoneCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.glowstone_sprout;}
		public Item getCrop() {return AEItems.glowstone_essence;}}
	
	//Hostile Mobs
	public static class ZombieCrop extends AECrop {
		public ZombieCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.zombie_sprout;}
		public Item getCrop() {return AEItems.zombie_essence;}}
	
	public static class CreeperCrop extends AECrop {
		public CreeperCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.creeper_sprout;}
		public Item getCrop() {return AEItems.creeper_essence;}}
	
	public static class SkeletonCrop extends AECrop {
		public SkeletonCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.skeleton_sprout;}
		public Item getCrop() {return AEItems.skeleton_essence;}}

	public static class SlimeCrop extends AECrop {
		public SlimeCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.slime_sprout;}
		public Item getCrop() {return AEItems.slime_essence;}}
	
	public static class SpiderCrop extends AECrop {
		public SpiderCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.spider_sprout;}
		public Item getCrop() {return AEItems.spider_essence;}}

	public static class GuardianCrop extends AECrop {
		public GuardianCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.guardian_sprout;}
		public Item getCrop() {return AEItems.guardian_essence;}}
	
	public static class GhastCrop extends AECrop {
		public GhastCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.ghast_sprout;}
		public Item getCrop() {return AEItems.ghast_essence;}}
	
	public static class WitherCrop extends AECrop {
		public WitherCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.wither_sprout;}
		public Item getCrop() {return AEItems.wither_essence;}}
	
	public static class BlazeCrop extends AECrop {
		public BlazeCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.blaze_sprout;}
		public Item getCrop() {return AEItems.blaze_essence;}}
	
	public static class EndermanCrop extends AECrop {
		public EndermanCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.enderman_sprout;}
		public Item getCrop() {return AEItems.enderman_essence;}}
	
	//Pasive Mobs
	public static class SquidCrop extends AECrop {
		public SquidCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.squid_sprout;}
		public Item getCrop() {return AEItems.squid_essence;}}
	
	public static class CowCrop extends AECrop {
		public CowCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.cow_sprout;}
		public Item getCrop() {return AEItems.cow_essence;}}
	
	public static class SheepCrop extends AECrop {
		public SheepCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.sheep_sprout;}
		public Item getCrop() {return AEItems.sheep_essence;}}
	
	public static class ChickenCrop extends AECrop {
		public ChickenCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.chicken_sprout;}
		public Item getCrop() {return AEItems.chicken_essence;}}
	
	public static class PigCrop extends AECrop {
		public PigCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.pig_sprout;}
		public Item getCrop() {return AEItems.pig_essence;}}
	
	public static class RabbitCrop extends AECrop {
		public RabbitCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.rabbit_sprout;}
		public Item getCrop() {return AEItems.rabbit_essence;}}
	
	//Other Crops
	public static class EarthCrop extends AECrop {
		public EarthCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.earth_sprout;}
		public Item getCrop() {return AEItems.earth_essence;}}
	
	public static class WaterCrop extends AECrop {
		public WaterCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.water_sprout;}
		public Item getCrop() {return AEItems.water_essence;}}
	
	public static class FireCrop extends AECrop {
		public FireCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.fire_sprout;}
		public Item getCrop() {return AEItems.fire_essence;}}
	
	public static class ExperienceCrop extends AECrop {
		public ExperienceCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.experience_sprout;}
		public Item getCrop() {return AEItems.experience_essence;}}
	
	public static class DyeCrop extends AECrop {
		public DyeCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.dye_sprout;}
		public Item getCrop() {return AEItems.dye_essence;}}
	
	public static class NatureCrop extends AECrop {
		public NatureCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.nature_sprout;}
		public Item getCrop() {return AEItems.nature_essence;}}
	
	public static class NetherCrop extends AECrop {
		public NetherCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.nether_sprout;}
		public Item getCrop() {return AEItems.nether_essence;}}
	
	//OreDictionary Crops
	//Basic Crops
	public static class CopperCrop extends AECrop {
		public CopperCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.copper_sprout;}
		public Item getCrop() {return AEItems.copper_essence;}}
	
	public static class TinCrop extends AECrop {
		public TinCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.tin_sprout;}
		public Item getCrop() {return AEItems.tin_essence;}}
	
	public static class SilverCrop extends AECrop {
		public SilverCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.silver_sprout;}
		public Item getCrop() {return AEItems.silver_essence;}}
	
	public static class LeadCrop extends AECrop {
		public LeadCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.lead_sprout;}
		public Item getCrop() {return AEItems.lead_essence;}}
	
	public static class NickelCrop extends AECrop {
		public NickelCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.nickel_sprout;}
		public Item getCrop() {return AEItems.nickel_essence;}}
	
	public static class PlatinumCrop extends AECrop {
		public PlatinumCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.platinum_sprout;}
		public Item getCrop() {return AEItems.platinum_essence;}}
	
	public static class AluminumCrop extends AECrop {
		public AluminumCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.aluminum_sprout;}
		public Item getCrop() {return AEItems.aluminum_essence;}}
	
	public static class IridiumCrop extends AECrop {
		public IridiumCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.iridium_sprout;}
		public Item getCrop() {return AEItems.iridium_essence;}}
	
	public static class TitaniumCrop extends AECrop {
		public TitaniumCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.titanium_sprout;}
		public Item getCrop() {return AEItems.titanium_essence;}}
	
	public static class TungstenCrop extends AECrop {
		public TungstenCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.tungsten_sprout;}
		public Item getCrop() {return AEItems.tungsten_essence;}}
	
	public static class ZincCrop extends AECrop {
		public ZincCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.zinc_sprout;}
		public Item getCrop() {return AEItems.zinc_essence;}}
	
	//TiCon Crops
	public static class ArditeCrop extends AECrop {
		public ArditeCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.ardite_sprout;}
		public Item getCrop() {return AEItems.ardite_essence;}}
	
	public static class CobaltCrop extends AECrop {
		public CobaltCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.cobalt_sprout;}
		public Item getCrop() {return AEItems.cobalt_essence;}}
	
	public static class AlubrassCrop extends AECrop {
		public AlubrassCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.alubrass_sprout;}
		public Item getCrop() {return AEItems.alubrass_essence;}}
	
	public static class ManyullynCrop extends AECrop {
		public ManyullynCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.manyullyn_sprout;}
		public Item getCrop() {return AEItems.manyullyn_essence;}}
	
	//Alloy Crops
	public static class BronzeCrop extends AECrop {
		public BronzeCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.bronze_sprout;}
		public Item getCrop() {return AEItems.bronze_essence;}}
	
	public static class SteelCrop extends AECrop {
		public SteelCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.steel_sprout;}
		public Item getCrop() {return AEItems.steel_essence;}}
	
	public static class InvarCrop extends AECrop {
		public InvarCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.invar_sprout;}
		public Item getCrop() {return AEItems.invar_essence;}}
	
	public static class ElectrumCrop extends AECrop {
		public ElectrumCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.electrum_sprout;}
		public Item getCrop() {return AEItems.electrum_essence;}}
	
	public static class BrassCrop extends AECrop {
		public BrassCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.brass_sprout;}
		public Item getCrop() {return AEItems.brass_essence;}}
	
	//Gem Crops
	public static class RubyCrop extends AECrop {
		public RubyCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.ruby_sprout;}
		public Item getCrop() {return AEItems.ruby_essence;}}
	
	public static class SapphireCrop extends AECrop {
		public SapphireCrop(String name) {super(name);}
	    public Item getSeed() {return AEItems.sapphire_sprout;}
		public Item getCrop() {return AEItems.sapphire_essence;}}
	
	public static class AmberCrop extends AECrop {
		public AmberCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.amber_sprout;}
		public Item getCrop() {return AEItems.amber_essence;}}
	
	public static class MalachiteCrop extends AECrop {
		public MalachiteCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.malachite_sprout;}
		public Item getCrop() {return AEItems.malachite_essence;}}
	
	public static class PeridotCrop extends AECrop {
		public PeridotCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.peridot_sprout;}
		public Item getCrop() {return AEItems.peridot_essence;}}
	
	public static class TanzaniteCrop extends AECrop {
		public TanzaniteCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.tanzanite_sprout;}
		public Item getCrop() {return AEItems.tanzanite_essence;}}
	
	public static class TopazCrop extends AECrop {
		public TopazCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.topaz_sprout;}
		public Item getCrop() {return AEItems.topaz_essence;}}
	
	//Other Crops
	public static class ApatiteCrop extends AECrop {
		public ApatiteCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.apatite_sprout;}
		public Item getCrop() {return AEItems.apatite_essence;}}
	
	public static class RubberCrop extends AECrop {
		public RubberCrop(String name) {super(name);}
		public Item getSeed() {return AEItems.rubber_sprout;}
		public Item getCrop() {return AEItems.rubber_essence;}}
	
}
