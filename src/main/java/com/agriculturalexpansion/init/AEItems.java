package com.agriculturalexpansion.init;

import com.agriculturalexpansion.extend.AEItem;
import com.agriculturalexpansion.extend.AESeed;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AEItems {
	
	//Items
	public static Item resource_sprout;
	
	public static Item coal_essence;
	public static Item iron_essence;
	public static Item gold_essence;
	public static Item lapis_essence;
	public static Item quartz_essence;
	public static Item redstone_essence;
	public static Item diamond_essence;
	public static Item emerald_essence;
	public static Item glowstone_essence;
	
	public static Item zombie_essence;
	public static Item creeper_essence;
	public static Item skeleton_essence;
	public static Item slime_essence;
	public static Item spider_essence;
	public static Item guardian_essence;
	public static Item ghast_essence;
	public static Item wither_essence;
	public static Item blaze_essence;
	public static Item enderman_essence;
	public static Item squid_essence;
	
	public static Item zombie_chunk;
	public static Item creeper_chunk;
	public static Item skeleton_chunk;
	public static Item slime_chunk;
	public static Item spider_chunk;
	public static Item guardian_chunk;
	public static Item ghast_chunk;
	public static Item wither_chunk;
	public static Item blaze_chunk;
	public static Item enderman_chunk;
	public static Item squid_chunk;
	
	public static Item cow_essence;
	public static Item sheep_essence;
	public static Item chicken_essence;
	public static Item pig_essence;
	public static Item rabbit_essence;
	
	public static Item cow_chunk;
	public static Item sheep_chunk;
	public static Item chicken_chunk;
	public static Item pig_chunk;
	public static Item rabbit_chunk;
	
	//Seeds
	public static Item resource_seed;
	
	public static Item coal_sprout;
	public static Item iron_sprout;
	public static Item gold_sprout;
	public static Item lapis_sprout;
	public static Item quartz_sprout;
	public static Item redstone_sprout;
	public static Item diamond_sprout;
	public static Item emerald_sprout;
	public static Item glowstone_sprout;
	
	public static Item zombie_sprout;
	public static Item creeper_sprout;
	public static Item skeleton_sprout;
	public static Item slime_sprout;
	public static Item spider_sprout;
	public static Item guardian_sprout;
	public static Item ghast_sprout;
	public static Item wither_sprout;
	public static Item blaze_sprout;
	public static Item enderman_sprout;
	public static Item squid_sprout;
	
	public static Item cow_sprout;
	public static Item sheep_sprout;
	public static Item chicken_sprout;
	public static Item pig_sprout;
	public static Item rabbit_sprout;
	
	public static void initItems() {
		
		//Items
		GameRegistry.registerItem(resource_sprout = new AEItem("resource_sprout"), "resource_sprout");
		
		GameRegistry.registerItem(coal_essence = new AEItem("coal_essence"), "coal_essence");
		GameRegistry.registerItem(iron_essence = new AEItem("iron_essence"), "iron_essence");
		GameRegistry.registerItem(gold_essence = new AEItem("gold_essence"), "gold_essence");
		GameRegistry.registerItem(lapis_essence = new AEItem("lapis_essence"), "lapis_essence");
		GameRegistry.registerItem(quartz_essence = new AEItem("quartz_essence"), "quartz_essence");
		GameRegistry.registerItem(redstone_essence = new AEItem("redstone_essence"), "redstone_essence");
		GameRegistry.registerItem(diamond_essence = new AEItem("diamond_essence"), "diamond_essence");
		GameRegistry.registerItem(emerald_essence = new AEItem("emerald_essence"), "emerald_essence");
		GameRegistry.registerItem(glowstone_essence = new AEItem("glowstone_essence"), "glowstone_essence");
		
		GameRegistry.registerItem(zombie_essence = new AEItem("zombie_essence"), "zombie_essence");
		GameRegistry.registerItem(creeper_essence = new AEItem("creeper_essence"), "creeper_essence");
		GameRegistry.registerItem(skeleton_essence = new AEItem("skeleton_essence"), "skeleton_essence");
		GameRegistry.registerItem(slime_essence = new AEItem("slime_essence"), "slime_essence");
		GameRegistry.registerItem(spider_essence = new AEItem("spider_essence"), "spider_essence");
		GameRegistry.registerItem(guardian_essence = new AEItem("guardian_essence"), "guardian_essence");
		GameRegistry.registerItem(ghast_essence = new AEItem("ghast_essence"), "ghast_essence");
		GameRegistry.registerItem(wither_essence = new AEItem("wither_essence"), "wither_essence");
		GameRegistry.registerItem(blaze_essence = new AEItem("blaze_essence"), "blaze_essence");
		GameRegistry.registerItem(enderman_essence = new AEItem("enderman_essence"), "enderman_essence");
		GameRegistry.registerItem(squid_essence = new AEItem("squid_essence"), "squid_essence");
		
		GameRegistry.registerItem(zombie_chunk = new AEItem("zombie_chunk"), "zombie_chunk");
		GameRegistry.registerItem(creeper_chunk = new AEItem("creeper_chunk"), "creeper_chunk");
		GameRegistry.registerItem(skeleton_chunk = new AEItem("skeleton_chunk"), "skeleton_chunk");
		GameRegistry.registerItem(slime_chunk = new AEItem("slime_chunk"), "slime_chunk");
		GameRegistry.registerItem(spider_chunk = new AEItem("spider_chunk"), "spider_chunk");
		GameRegistry.registerItem(guardian_chunk = new AEItem("guardian_chunk"), "guardian_chunk");
		GameRegistry.registerItem(ghast_chunk = new AEItem("ghast_chunk"), "ghast_chunk");
		GameRegistry.registerItem(wither_chunk = new AEItem("wither_chunk"), "wither_chunk");
		GameRegistry.registerItem(blaze_chunk = new AEItem("blaze_chunk"), "blaze_chunk");
		GameRegistry.registerItem(enderman_chunk = new AEItem("enderman_chunk"), "enderman_chunk");
		GameRegistry.registerItem(squid_chunk = new AEItem("squid_chunk"), "squid_chunk");
		
		GameRegistry.registerItem(cow_essence = new AEItem("cow_essence"), "cow_essence");
		GameRegistry.registerItem(sheep_essence = new AEItem("sheep_essence"), "sheep_essence");
		GameRegistry.registerItem(chicken_essence = new AEItem("chicken_essence"), "chicken_essence");
		GameRegistry.registerItem(pig_essence = new AEItem("pig_essence"), "pig_essence");
		GameRegistry.registerItem(rabbit_essence = new AEItem("rabbit_essence"), "rabbit_essence");
		
		GameRegistry.registerItem(cow_chunk = new AEItem("cow_chunk"), "cow_chunk");
		GameRegistry.registerItem(sheep_chunk = new AEItem("sheep_chunk"), "sheep_chunk");
		GameRegistry.registerItem(chicken_chunk = new AEItem("chicken_chunk"), "chicken_chunk");
		GameRegistry.registerItem(pig_chunk = new AEItem("pig_chunk"), "pig_chunk");
		GameRegistry.registerItem(rabbit_chunk = new AEItem("rabbit_chunk"), "rabbit_chunk");
		
		//Seeds
		GameRegistry.registerItem(resource_seed = new AESeed("resource_seed", AEBlocks.resource_crop, Blocks.FARMLAND), "resource_seed");
		
		GameRegistry.registerItem(coal_sprout = new AESeed("coal_sprout", AEBlocks.coal_crop, Blocks.FARMLAND), "coal_sprout");
		GameRegistry.registerItem(iron_sprout = new AESeed("iron_sprout", AEBlocks.iron_crop, Blocks.FARMLAND), "iron_sprout");
		GameRegistry.registerItem(gold_sprout = new AESeed("gold_sprout", AEBlocks.gold_crop, Blocks.FARMLAND), "gold_sprout");
		GameRegistry.registerItem(lapis_sprout = new AESeed("lapis_sprout", AEBlocks.lapis_crop, Blocks.FARMLAND), "lapis_sprout");
		GameRegistry.registerItem(quartz_sprout = new AESeed("quartz_sprout", AEBlocks.quartz_crop, Blocks.FARMLAND), "quartz_sprout");
		GameRegistry.registerItem(redstone_sprout = new AESeed("redstone_sprout", AEBlocks.redstone_crop, Blocks.FARMLAND), "redstone_sprout");
		GameRegistry.registerItem(diamond_sprout = new AESeed("diamond_sprout", AEBlocks.diamond_crop, Blocks.FARMLAND), "diamond_sprout");
		GameRegistry.registerItem(emerald_sprout = new AESeed("emerald_sprout", AEBlocks.emerald_crop, Blocks.FARMLAND), "emerald_sprout");
		GameRegistry.registerItem(glowstone_sprout = new AESeed("glowstone_sprout", AEBlocks.glowstone_crop, Blocks.FARMLAND), "glowstone_sprout");
		
		GameRegistry.registerItem(zombie_sprout = new AESeed("zombie_sprout", AEBlocks.zombie_crop, Blocks.FARMLAND), "zombie_sprout");
		GameRegistry.registerItem(creeper_sprout = new AESeed("creeper_sprout", AEBlocks.creeper_crop, Blocks.FARMLAND), "creeper_sprout");
		GameRegistry.registerItem(skeleton_sprout = new AESeed("skeleton_sprout", AEBlocks.skeleton_crop, Blocks.FARMLAND), "skeleton_sprout");
		GameRegistry.registerItem(slime_sprout = new AESeed("slime_sprout", AEBlocks.slime_crop, Blocks.FARMLAND), "slime_sprout");
		GameRegistry.registerItem(spider_sprout = new AESeed("spider_sprout", AEBlocks.spider_crop, Blocks.FARMLAND), "spider_sprout");
		GameRegistry.registerItem(guardian_sprout = new AESeed("guardian_sprout", AEBlocks.guardian_crop, Blocks.FARMLAND), "guardian_sprout");
		GameRegistry.registerItem(ghast_sprout = new AESeed("ghast_sprout", AEBlocks.ghast_crop, Blocks.FARMLAND), "ghast_sprout");
		GameRegistry.registerItem(wither_sprout = new AESeed("wither_sprout", AEBlocks.wither_crop, Blocks.FARMLAND), "wither_sprout");
		GameRegistry.registerItem(blaze_sprout = new AESeed("blaze_sprout", AEBlocks.blaze_crop, Blocks.FARMLAND), "blaze_sprout");
		GameRegistry.registerItem(enderman_sprout = new AESeed("enderman_sprout", AEBlocks.enderman_crop, Blocks.FARMLAND), "enderman_sprout");
		GameRegistry.registerItem(squid_sprout = new AESeed("squid_sprout", AEBlocks.squid_crop, Blocks.FARMLAND), "squid_sprout");
		
		GameRegistry.registerItem(cow_sprout = new AESeed("cow_sprout", AEBlocks.cow_crop, Blocks.FARMLAND), "cow_sprout");
		GameRegistry.registerItem(sheep_sprout = new AESeed("sheep_sprout", AEBlocks.sheep_crop, Blocks.FARMLAND), "sheep_sprout");
		GameRegistry.registerItem(chicken_sprout = new AESeed("chicken_sprout", AEBlocks.chicken_crop, Blocks.FARMLAND), "chicken_sprout");
		GameRegistry.registerItem(pig_sprout = new AESeed("pig_sprout", AEBlocks.pig_crop, Blocks.FARMLAND), "pig_sprout");
		GameRegistry.registerItem(rabbit_sprout = new AESeed("rabbit_sprout", AEBlocks.rabbit_crop, Blocks.FARMLAND), "rabbit_sprout");
	}

}
