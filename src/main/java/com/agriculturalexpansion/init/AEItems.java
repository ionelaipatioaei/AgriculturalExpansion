package com.agriculturalexpansion.init;

import com.agriculturalexpansion.extend.AEFood;
import com.agriculturalexpansion.extend.AEItem;
import com.agriculturalexpansion.extend.AESeed;
import com.agriculturalexpansion.handler.AEIDs;
import com.agriculturalexpansion.main.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AEItems {
	
	/**
	 * Items
	 */
	public static Item resource_sprout = new AEItem("resource_sprout");
	public static Item powerful_sprout = new AEItem("powerful_sprout");
	public static Item ultimate_sprout = new AEItem("ultimate_sprout");

	public static Item earth_sprout_former = new AEItem("earth_sprout_former");
	public static Item water_sprout_former = new AEItem("water_sprout_former");
	public static Item fire_sprout_former = new AEItem("fire_sprout_former");
	public static Item experience_sprout_former = new AEItem("experience_sprout_former");
	public static Item dye_sprout_former = new AEItem("dye_sprout_former");
	public static Item nature_sprout_former = new AEItem("nature_sprout_former");
	public static Item nether_sprout_former = new AEItem("nether_sprout_former");
	
	/**
	 * Vanilla Essence
	 */
	public static Item coal_essence = new AEItem("coal_essence");
	public static Item iron_essence = new AEItem("iron_essence");
	public static Item gold_essence = new AEItem("gold_essence");
	public static Item lapis_essence = new AEItem("lapis_essence");
	public static Item quartz_essence = new AEItem("quartz_essence");
	public static Item redstone_essence = new AEItem("redstone_essence");
	public static Item diamond_essence = new AEItem("diamond_essence");
	public static Item emerald_essence = new AEItem("emerald_essence");
	public static Item glowstone_essence = new AEItem("glowstone_essence");

	/**
	 * Hostile Mobs Essence
	 */
	public static Item zombie_essence = new AEItem("zombie_essence");
	public static Item creeper_essence = new AEItem("creeper_essence");
	public static Item skeleton_essence = new AEItem("skeleton_essence");
	public static Item slime_essence = new AEItem("slime_essence");
	public static Item spider_essence = new AEItem("spider_essence");
	public static Item guardian_essence = new AEItem("guardian_essence");
	public static Item ghast_essence = new AEItem("ghast_essence");
	public static Item wither_essence = new AEItem("wither_essence");
	public static Item blaze_essence = new AEItem("blaze_essence");
	public static Item enderman_essence = new AEItem("enderman_essence");

	/**
	 * Passive Mobs Essence
	 */
	public static Item squid_essence = new AEItem("squid_essence");
	public static Item cow_essence = new AEItem("cow_essence");
	public static Item sheep_essence = new AEItem("sheep_essence");
	public static Item chicken_essence = new AEItem("chicken_essence");
	public static Item pig_essence = new AEItem("pig_essence");
	public static Item rabbit_essence = new AEItem("rabbit_essence");
	
	/**
	 * Special Essence
	 */
	public static Item earth_essence = new AEItem("earth_essence");
	public static Item water_essence = new AEItem("water_essence");
	public static Item fire_essence = new AEItem("fire_essence");
	public static Item experience_essence = new AEItem("experience_essence");
	public static Item dye_essence = new AEItem("dye_essence");
	public static Item nature_essence = new AEItem("nature_essence");
	public static Item nether_essence = new AEItem("nether_essence");
	
	/**
	 * OreDict Essence
	 */
	//Common Essence
	public static Item copper_essence = new AEItem("copper_essence");
	public static Item tin_essence = new AEItem("tin_essence");
	public static Item silver_essence = new AEItem("silver_essence");
	public static Item lead_essence = new AEItem("lead_essence");
	public static Item nickel_essence = new AEItem("nickel_essence");
	public static Item platinum_essence = new AEItem("platinum_essence");
	public static Item aluminum_essence = new AEItem("aluminum_essence");
	public static Item iridium_essence = new AEItem("iridium_essence");
	public static Item titanium_essence = new AEItem("titanium_essence");
	public static Item tungsten_essence = new AEItem("tungsten_essence");
	public static Item zinc_essence = new AEItem("zinc_essence");

	//TiCon Essence
	public static Item ardite_essence = new AEItem("ardite_essence");
	public static Item cobalt_essence = new AEItem("cobalt_essence");
	public static Item alubrass_essence = new AEItem("alubrass_essence");
	public static Item manyullyn_essence = new AEItem("manyullyn_essence");
	
	//Alloy Essence
	public static Item bronze_essence = new AEItem("bronze_essence");
	public static Item steel_essence = new AEItem("steel_essence");
	public static Item invar_essence = new AEItem("invar_essence");
	public static Item electrum_essence = new AEItem("electrum_essence");
	public static Item brass_essence = new AEItem("brass_essence");
	
	//Gem Essence
	public static Item ruby_essence = new AEItem("ruby_essence");
	public static Item sapphire_essence = new AEItem("sapphire_essence");
	public static Item amber_essence = new AEItem("amber_essence");
	public static Item malachite_essence = new AEItem("malachite_essence");
	public static Item peridot_essence = new AEItem("peridot_essence");
	public static Item tanzanite_essence = new AEItem("tanzanite_essence");
	public static Item topaz_essence = new AEItem("topaz_essence");
	
	//Other Essence
	public static Item apatite_essence = new AEItem("apatite_essence");
	public static Item rubber_essence = new AEItem("rubber_essence");
	
	/**
	 * Hostile Mobs Chunks
	 */
	public static Item zombie_chunk = new AEItem("zombie_chunk");
	public static Item creeper_chunk = new AEItem("creeper_chunk");
	public static Item skeleton_chunk = new AEItem("skeleton_chunk");
	public static Item slime_chunk = new AEItem("slime_chunk");
	public static Item spider_chunk = new AEItem("spider_chunk");
	public static Item guardian_chunk = new AEItem("guardian_chunk");
	public static Item ghast_chunk = new AEItem("ghast_chunk");
	public static Item wither_chunk = new AEItem("wither_chunk");
	public static Item blaze_chunk = new AEItem("blaze_chunk");
	public static Item enderman_chunk = new AEItem("enderman_chunk");
	
	/**
	 * Passive Mobs Chunks
	 */
	public static Item squid_chunk = new AEItem("squid_chunk");
	public static Item cow_chunk = new AEItem("cow_chunk");
	public static Item sheep_chunk = new AEItem("sheep_chunk");
	public static Item chicken_chunk = new AEItem("chicken_chunk");
	public static Item pig_chunk = new AEItem("pig_chunk");
	public static Item rabbit_chunk = new AEItem("rabbit_chunk");
	
	/**
	 * Food
	 */
	public static Item cooked_mob_chunk = new AEFood("cooked_mob_chunk", 7, 8, true);
	
	/**
	 * Seeds
	 */
	public static Item resource_seed = new AESeed("resource_seed", AEBlocks.resource_crop, Blocks.FARMLAND);
	
	/**
	 * Vanilla Sprouts
	 */
	public static Item coal_sprout = new AESeed("coal_sprout", AEBlocks.coal_crop, Blocks.FARMLAND);
	public static Item iron_sprout = new AESeed("iron_sprout", AEBlocks.iron_crop, Blocks.FARMLAND);
	public static Item gold_sprout = new AESeed("gold_sprout", AEBlocks.gold_crop, Blocks.FARMLAND);
	public static Item lapis_sprout = new AESeed("lapis_sprout", AEBlocks.lapis_crop, Blocks.FARMLAND);
	public static Item quartz_sprout = new AESeed("quartz_sprout", AEBlocks.quartz_crop, Blocks.FARMLAND);
	public static Item redstone_sprout = new AESeed("redstone_sprout", AEBlocks.redstone_crop, Blocks.FARMLAND);
	public static Item diamond_sprout = new AESeed("diamond_sprout", AEBlocks.diamond_crop, Blocks.FARMLAND);
	public static Item emerald_sprout = new AESeed("emerald_sprout", AEBlocks.emerald_crop, Blocks.FARMLAND);
	public static Item glowstone_sprout = new AESeed("glowstone_sprout", AEBlocks.glowstone_crop, Blocks.FARMLAND);
	
	/**
	 * Hostile Mobs Sprouts
	 */
	public static Item zombie_sprout = new AESeed("zombie_sprout", AEBlocks.zombie_crop, Blocks.FARMLAND);
	public static Item creeper_sprout = new AESeed("creeper_sprout", AEBlocks.creeper_crop, Blocks.FARMLAND);
	public static Item skeleton_sprout = new AESeed("skeleton_sprout", AEBlocks.skeleton_crop, Blocks.FARMLAND);
	public static Item slime_sprout = new AESeed("slime_sprout", AEBlocks.slime_crop, Blocks.FARMLAND);
	public static Item spider_sprout = new AESeed("spider_sprout", AEBlocks.spider_crop, Blocks.FARMLAND);
	public static Item guardian_sprout = new AESeed("guardian_sprout", AEBlocks.guardian_crop, Blocks.FARMLAND);
	public static Item ghast_sprout = new AESeed("ghast_sprout", AEBlocks.ghast_crop, Blocks.FARMLAND);
	public static Item wither_sprout = new AESeed("wither_sprout", AEBlocks.wither_crop, Blocks.FARMLAND);
	public static Item blaze_sprout = new AESeed("blaze_sprout", AEBlocks.blaze_crop, Blocks.FARMLAND);
	public static Item enderman_sprout = new AESeed("enderman_sprout", AEBlocks.enderman_crop, Blocks.FARMLAND);
	
	/**
	 * Passive Mobs Sprouts
	 */
	public static Item squid_sprout = new AESeed("squid_sprout", AEBlocks.squid_crop, Blocks.FARMLAND);
	public static Item cow_sprout = new AESeed("cow_sprout", AEBlocks.cow_crop, Blocks.FARMLAND);
	public static Item sheep_sprout = new AESeed("sheep_sprout", AEBlocks.sheep_crop, Blocks.FARMLAND);
	public static Item chicken_sprout = new AESeed("chicken_sprout", AEBlocks.chicken_crop, Blocks.FARMLAND);
	public static Item pig_sprout = new AESeed("pig_sprout", AEBlocks.pig_crop, Blocks.FARMLAND);
	public static Item rabbit_sprout = new AESeed("rabbit_sprout", AEBlocks.rabbit_crop, Blocks.FARMLAND);
	
	/**
	 * Special Sprouts
	 */
	public static Item earth_sprout = new AESeed("earth_sprout", AEBlocks.earth_crop, Blocks.FARMLAND);
	public static Item water_sprout = new AESeed("water_sprout", AEBlocks.water_crop, Blocks.FARMLAND);
	public static Item fire_sprout = new AESeed("fire_sprout", AEBlocks.fire_crop, Blocks.FARMLAND);
	public static Item experience_sprout = new AESeed("experience_sprout", AEBlocks.experience_crop, Blocks.FARMLAND);
	public static Item dye_sprout = new AESeed("dye_sprout", AEBlocks.dye_crop, Blocks.FARMLAND);
	public static Item nature_sprout = new AESeed("nature_sprout", AEBlocks.nature_crop, Blocks.FARMLAND);
	public static Item nether_sprout = new AESeed("nether_sprout", AEBlocks.nether_crop, Blocks.FARMLAND);
	
	/**
	 * OreDictionary Essence
	 */
	//Common Sprouts
	public static Item copper_sprout = new AESeed("copper_sprout", AEBlocks.copper_crop, Blocks.FARMLAND);
	public static Item tin_sprout = new AESeed("tin_sprout", AEBlocks.tin_crop, Blocks.FARMLAND);
	public static Item silver_sprout = new AESeed("silver_sprout", AEBlocks.silver_crop, Blocks.FARMLAND);
	public static Item lead_sprout = new AESeed("lead_sprout", AEBlocks.lead_crop, Blocks.FARMLAND);
	public static Item nickel_sprout = new AESeed("nickel_sprout", AEBlocks.nickel_crop, Blocks.FARMLAND);
	public static Item platinum_sprout = new AESeed("platinum_sprout", AEBlocks.platinum_crop, Blocks.FARMLAND);
	public static Item aluminum_sprout = new AESeed("aluminum_sprout", AEBlocks.aluminum_crop, Blocks.FARMLAND);
	public static Item iridium_sprout = new AESeed("iridium_sprout", AEBlocks.iridium_crop, Blocks.FARMLAND);
	public static Item titanium_sprout = new AESeed("titanium_sprout", AEBlocks.titanium_crop, Blocks.FARMLAND);
	public static Item tungsten_sprout = new AESeed("tungsten_sprout", AEBlocks.tungsten_crop, Blocks.FARMLAND);
	public static Item zinc_sprout = new AESeed("zinc_sprout", AEBlocks.zinc_crop, Blocks.FARMLAND);

	//TiCon Sprouts
	public static Item ardite_sprout = new AESeed("ardite_sprout", AEBlocks.ardite_crop, Blocks.FARMLAND);
	public static Item cobalt_sprout = new AESeed("cobalt_sprout", AEBlocks.cobalt_crop, Blocks.FARMLAND);
	public static Item alubrass_sprout = new AESeed("alubrass_sprout", AEBlocks.alubrass_crop, Blocks.FARMLAND);
	public static Item manyullyn_sprout = new AESeed("manyullyn_sprout", AEBlocks.manyullyn_crop, Blocks.FARMLAND);
		
	//Alloy Sprouts
	public static Item bronze_sprout = new AESeed("bronze_sprout", AEBlocks.bronze_crop, Blocks.FARMLAND);
	public static Item steel_sprout = new AESeed("steel_sprout", AEBlocks.steel_crop, Blocks.FARMLAND);
	public static Item invar_sprout = new AESeed("invar_sprout", AEBlocks.invar_crop, Blocks.FARMLAND);
	public static Item electrum_sprout = new AESeed("electrum_sprout", AEBlocks.electrum_crop, Blocks.FARMLAND);
	public static Item brass_sprout = new AESeed("brass_sprout", AEBlocks.brass_crop, Blocks.FARMLAND);
		
	//Gem Sprouts
	public static Item ruby_sprout = new AESeed("ruby_sprout", AEBlocks.ruby_crop, Blocks.FARMLAND);
	public static Item sapphire_sprout = new AESeed("sapphire_sprout", AEBlocks.sapphire_crop, Blocks.FARMLAND);
	public static Item amber_sprout = new AESeed("amber_sprout", AEBlocks.amber_crop, Blocks.FARMLAND);
	public static Item malachite_sprout = new AESeed("malachite_sprout", AEBlocks.malachite_crop, Blocks.FARMLAND);
	public static Item peridot_sprout = new AESeed("peridot_sprout", AEBlocks.peridot_crop, Blocks.FARMLAND);
	public static Item tanzanite_sprout = new AESeed("tanzanite_sprout", AEBlocks.tanzanite_crop, Blocks.FARMLAND);
	public static Item topaz_sprout = new AESeed("topaz_sprout", AEBlocks.topaz_crop, Blocks.FARMLAND);
	
	//Other Sprouts
	public static Item apatite_sprout = new AESeed("apatite_sprout", AEBlocks.apatite_crop, Blocks.FARMLAND);
	public static Item rubber_sprout = new AESeed("rubber_sprout", AEBlocks.rubber_crop, Blocks.FARMLAND);
	
	public static void initItems() {
		for(int i = 0; i < AEIDs.items.length; i++) {
			GameRegistry.registerItem((AEIDs.items[i]), AEIDs.itemsName[i]);
		}
	}
	
	public static void initModels() {
        for (int i = 0; i < AEIDs.items.length; i++) {
			initModel(AEIDs.items[i]);
        }
	}
	
	public static void initModel(Item item) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
				new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
	}
	
}
