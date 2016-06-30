package com.agriculturalexpansion.init;

import com.agriculturalexpansion.extend.AEBlock;
import com.agriculturalexpansion.extend.AECrops.*;
import com.agriculturalexpansion.handler.AEIDs;
import com.agriculturalexpansion.main.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AEBlocks {
	
	/**
	 * Blocks
	 */
	public static Block sprout_block = new AEBlock("sprout_block", Material.GROUND, 0, 0, null, 0);
	
	/**
	 * Resource Crops
	 */
	public static Block resource_crop = new ResourceCrop("resource_crop");
		
	/**
	 * Vanilla Crops;
	 */
	public static Block coal_crop = new CoalCrop("coal_crop");
	public static Block iron_crop = new IronCrop("iron_crop");
	public static Block gold_crop = new GoldCrop("gold_crop");
	public static Block lapis_crop = new LapisCrop("lapis_crop");
	public static Block quartz_crop = new QuartzCrop("quartz_crop");
	public static Block redstone_crop = new RedstoneCrop("redstone_crop");
	public static Block diamond_crop = new DiamondCrop("diamond_crop");
	public static Block emerald_crop = new EmeraldCrop("emerald_crop");
	public static Block glowstone_crop = new GlowstoneCrop("glowstone_crop");

	/**
	 * Hostile Mobs Crops
	 */
	public static Block zombie_crop = new ZombieCrop("zombie_crop");
	public static Block creeper_crop = new CreeperCrop("creeper_crop");
	public static Block skeleton_crop = new SkeletonCrop("skeleton_crop");
	public static Block slime_crop = new SlimeCrop("slime_crop");
	public static Block spider_crop = new SpiderCrop("spider_crop");
	public static Block guardian_crop = new GuardianCrop("guardian_crop");
	public static Block ghast_crop = new GhastCrop("ghast_crop");
	public static Block wither_crop = new WitherCrop("wither_crop");
	public static Block blaze_crop = new BlazeCrop("blaze_crop");
	public static Block enderman_crop = new EndermanCrop("enderman_crop");
		
	/**
	 * Passive Mobs Crops
	 */
	public static Block squid_crop = new SquidCrop("squid_crop");
	public static Block cow_crop = new CowCrop("cow_crop");
	public static Block sheep_crop = new SheepCrop("sheep_crop");
	public static Block chicken_crop = new ChickenCrop("chicken_crop");
	public static Block pig_crop = new PigCrop("pig_crop");
	public static Block rabbit_crop = new RabbitCrop("rabbit_crop");
	
	/**
	 * Special Crops
	 */
	public static Block earth_crop = new EarthCrop("earth_crop");
	public static Block water_crop = new WaterCrop("water_crop");
	public static Block fire_crop = new FireCrop("fire_crop");
	public static Block experience_crop = new ExperienceCrop("experience_crop");
	public static Block dye_crop = new DyeCrop("dye_crop");
	public static Block nature_crop = new NatureCrop("nature_crop");
	public static Block nether_crop = new NetherCrop("nether_crop");
	
	/**
	 * OreDict Crops
	 */
	// Common Crops
	public static Block copper_crop = new CopperCrop("copper_crop");
	public static Block tin_crop = new TinCrop("tin_crop");
	public static Block silver_crop = new SilverCrop("silver_crop");
	public static Block lead_crop = new LeadCrop("lead_crop");
	public static Block nickel_crop = new NickelCrop("nickel_crop");
	public static Block platinum_crop = new PlatinumCrop("platinum_crop");
	public static Block aluminum_crop = new AluminumCrop("aluminum_crop");
	public static Block iridium_crop = new IridiumCrop("iridium_crop");
	public static Block titanium_crop = new TitaniumCrop("titanium_crop");
	public static Block tungsten_crop = new TungstenCrop("tungsten_crop");
	public static Block zinc_crop = new ZincCrop("zinc_crop");
	
	//TiCon Crops
	public static Block ardite_crop = new ArditeCrop("ardite_crop");
	public static Block cobalt_crop = new CobaltCrop("cobalt_crop");
	public static Block alubrass_crop = new AlubrassCrop("alubrass_crop");
	public static Block manyullyn_crop = new ManyullynCrop("manyullyn_crop");
	
	//Alloy Crops
	public static Block bronze_crop = new BronzeCrop("bronze_crop");
	public static Block steel_crop = new SteelCrop("steel_crop");
	public static Block invar_crop = new InvarCrop("invar_crop");
	public static Block electrum_crop = new ElectrumCrop("electrum_crop");
	public static Block brass_crop = new BrassCrop("brass_crop");
	
	//Gem Crops
	public static Block ruby_crop = new RubyCrop("ruby_crop");
	public static Block sapphire_crop = new SapphireCrop("sapphire_crop");
	public static Block amber_crop = new AmberCrop("amber_crop");
	public static Block malachite_crop = new MalachiteCrop("malachite_crop");
	public static Block peridot_crop = new PeridotCrop("peridot_crop");
	public static Block tanzanite_crop = new TanzaniteCrop("tanzanite_crop");
	public static Block topaz_crop = new TopazCrop("topaz_crop");
	
	//Other Crops
	public static Block apatite_crop = new ApatiteCrop("apatite_crop");
	public static Block rubber_crop = new RubberCrop("rubber_crop");
	
	public static void initBlocks() {
		for(int i = 0; i < AEIDs.blocks.length; i++) {
			GameRegistry.registerBlock((AEIDs.blocks[i]), AEIDs.blocksName[i]);
		}
	}
	
	public static void initModels() {
		for (int i = 0; i < AEIDs.blocks.length; i++) {
			initModel(AEIDs.blocks[i]);
		}
	}
	
	public static void initModel(Block block) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, 
				new ModelResourceLocation(Reference.MOD_ID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
    }

}
