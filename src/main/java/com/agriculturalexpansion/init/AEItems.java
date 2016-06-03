package com.agriculturalexpansion.init;

import com.agriculturalexpansion.extend.AEItem;
import com.agriculturalexpansion.extend.AESeed;
import com.agriculturalexpansion.main.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class AEItems {
	
	//Items
	public static Item resource_sprout = new AEItem("resource_sprout");
	
	//Vanilla Essence
	public static Item coal_essence = new AEItem("coal_essence");
	public static Item iron_essence = new AEItem("iron_essence");
	public static Item gold_essence = new AEItem("gold_essence");
	public static Item lapis_essence = new AEItem("lapis_essence");
	public static Item quartz_essence = new AEItem("quartz_essence");
	public static Item redstone_essence = new AEItem("redstone_essence");
	public static Item diamond_essence = new AEItem("diamond_essence");
	public static Item emerald_essence = new AEItem("emerald_essence");
	public static Item glowstone_essence = new AEItem("glowstone_essence");

	//Hostile Mobs Essence
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

	//Passive Mobs Essence
	public static Item squid_essence = new AEItem("squid_essence");
	public static Item cow_essence = new AEItem("cow_essence");
	public static Item sheep_essence = new AEItem("sheep_essence");
	public static Item chicken_essence = new AEItem("chicken_essence");
	public static Item pig_essence = new AEItem("pig_essence");
	public static Item rabbit_essence = new AEItem("rabbit_essence");

	//Hostile Mobs Chunks
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
	
	//Passive Mobs Chunks
	public static Item squid_chunk = new AEItem("squid_chunk");
	public static Item cow_chunk = new AEItem("cow_chunk");
	public static Item sheep_chunk = new AEItem("sheep_chunk");
	public static Item chicken_chunk = new AEItem("chicken_chunk");
	public static Item pig_chunk = new AEItem("pig_chunk");
	public static Item rabbit_chunk = new AEItem("rabbit_chunk");
	
	//Seeds
	public static Item resource_seed = new AESeed("resource_seed", AEBlocks.resource_crop, Blocks.FARMLAND);
	
	//Vanilla Sprouts
	public static Item coal_sprout = new AESeed("coal_sprout", AEBlocks.coal_crop, Blocks.FARMLAND);
	public static Item iron_sprout = new AESeed("iron_sprout", AEBlocks.iron_crop, Blocks.FARMLAND);
	public static Item gold_sprout = new AESeed("gold_sprout", AEBlocks.gold_crop, Blocks.FARMLAND);
	public static Item lapis_sprout = new AESeed("lapis_sprout", AEBlocks.lapis_crop, Blocks.FARMLAND);
	public static Item quartz_sprout = new AESeed("quartz_sprout", AEBlocks.quartz_crop, Blocks.FARMLAND);
	public static Item redstone_sprout = new AESeed("redstone_sprout", AEBlocks.redstone_crop, Blocks.FARMLAND);
	public static Item diamond_sprout = new AESeed("diamond_sprout", AEBlocks.diamond_crop, Blocks.FARMLAND);
	public static Item emerald_sprout = new AESeed("emerald_sprout", AEBlocks.emerald_crop, Blocks.FARMLAND);
	public static Item glowstone_sprout = new AESeed("glowstone_sprout", AEBlocks.glowstone_crop, Blocks.FARMLAND);
	
	//Hostile Mobs Sprouts
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
	
	//Passive Mobs Sprouts
	public static Item squid_sprout = new AESeed("squid_sprout", AEBlocks.squid_crop, Blocks.FARMLAND);
	public static Item cow_sprout = new AESeed("cow_sprout", AEBlocks.cow_crop, Blocks.FARMLAND);
	public static Item sheep_sprout = new AESeed("sheep_sprout", AEBlocks.sheep_crop, Blocks.FARMLAND);
	public static Item chicken_sprout = new AESeed("chicken_sprout", AEBlocks.chicken_crop, Blocks.FARMLAND);
	public static Item pig_sprout = new AESeed("pig_sprout", AEBlocks.pig_crop, Blocks.FARMLAND);
	public static Item rabbit_sprout = new AESeed("rabbit_sprout", AEBlocks.rabbit_crop, Blocks.FARMLAND);
	
	public static void initItems() {
		
		//Items
		GameRegistry.registerItem((resource_sprout), "resource_sprout");
		
		GameRegistry.registerItem((coal_essence), "coal_essence");
		GameRegistry.registerItem((iron_essence), "iron_essence");
		GameRegistry.registerItem((gold_essence), "gold_essence");
		GameRegistry.registerItem((lapis_essence), "lapis_essence");
		GameRegistry.registerItem((quartz_essence), "quartz_essence");
		GameRegistry.registerItem((redstone_essence), "redstone_essence");
		GameRegistry.registerItem((diamond_essence), "diamond_essence");
		GameRegistry.registerItem((emerald_essence), "emerald_essence");
		GameRegistry.registerItem((glowstone_essence), "glowstone_essence");
		
		GameRegistry.registerItem((zombie_essence), "zombie_essence");
		GameRegistry.registerItem((creeper_essence), "creeper_essence");
		GameRegistry.registerItem((skeleton_essence), "skeleton_essence");
		GameRegistry.registerItem((slime_essence), "slime_essence");
		GameRegistry.registerItem((spider_essence), "spider_essence");
		GameRegistry.registerItem((guardian_essence), "guardian_essence");
		GameRegistry.registerItem((ghast_essence), "ghast_essence");
		GameRegistry.registerItem((wither_essence), "wither_essence");
		GameRegistry.registerItem((blaze_essence), "blaze_essence");
		GameRegistry.registerItem((enderman_essence), "enderman_essence");
		
		GameRegistry.registerItem((squid_essence), "squid_essence");
		GameRegistry.registerItem((cow_essence), "cow_essence");
		GameRegistry.registerItem((sheep_essence), "sheep_essence");
		GameRegistry.registerItem((chicken_essence), "chicken_essence");
		GameRegistry.registerItem((pig_essence), "pig_essence");
		GameRegistry.registerItem((rabbit_essence), "rabbit_essence");
		
		GameRegistry.registerItem((zombie_chunk), "zombie_chunk");
		GameRegistry.registerItem((creeper_chunk), "creeper_chunk");
		GameRegistry.registerItem((skeleton_chunk), "skeleton_chunk");
		GameRegistry.registerItem((slime_chunk), "slime_chunk");
		GameRegistry.registerItem((spider_chunk), "spider_chunk");
		GameRegistry.registerItem((guardian_chunk), "guardian_chunk");
		GameRegistry.registerItem((ghast_chunk), "ghast_chunk");
		GameRegistry.registerItem((wither_chunk), "wither_chunk");
		GameRegistry.registerItem((blaze_chunk), "blaze_chunk");
		GameRegistry.registerItem((enderman_chunk), "enderman_chunk");
		
		GameRegistry.registerItem((squid_chunk), "squid_chunk");
		GameRegistry.registerItem((cow_chunk), "cow_chunk");
		GameRegistry.registerItem((sheep_chunk), "sheep_chunk");
		GameRegistry.registerItem((chicken_chunk), "chicken_chunk");
		GameRegistry.registerItem((pig_chunk), "pig_chunk");
		GameRegistry.registerItem((rabbit_chunk), "rabbit_chunk");
		
		//Seeds
		GameRegistry.registerItem((resource_seed), "resource_seed");
		
		GameRegistry.registerItem((coal_sprout), "coal_sprout");
		GameRegistry.registerItem((iron_sprout), "iron_sprout");
		GameRegistry.registerItem((gold_sprout), "gold_sprout");
		GameRegistry.registerItem((lapis_sprout), "lapis_sprout");
		GameRegistry.registerItem((quartz_sprout), "quartz_sprout");
		GameRegistry.registerItem((redstone_sprout), "redstone_sprout");
		GameRegistry.registerItem((diamond_sprout), "diamond_sprout");
		GameRegistry.registerItem((emerald_sprout), "emerald_sprout");
		GameRegistry.registerItem((glowstone_sprout), "glowstone_sprout");
		
		GameRegistry.registerItem((zombie_sprout), "zombie_sprout");
		GameRegistry.registerItem((creeper_sprout), "creeper_sprout");
		GameRegistry.registerItem((skeleton_sprout), "skeleton_sprout");
		GameRegistry.registerItem((slime_sprout), "slime_sprout");
		GameRegistry.registerItem((spider_sprout), "spider_sprout");
		GameRegistry.registerItem((guardian_sprout), "guardian_sprout");
		GameRegistry.registerItem((ghast_sprout), "ghast_sprout");
		GameRegistry.registerItem((wither_sprout), "wither_sprout");
		GameRegistry.registerItem((blaze_sprout), "blaze_sprout");
		GameRegistry.registerItem((enderman_sprout), "enderman_sprout");
		
		GameRegistry.registerItem((squid_sprout), "squid_sprout");
		GameRegistry.registerItem((cow_sprout), "cow_sprout");
		GameRegistry.registerItem((sheep_sprout), "sheep_sprout");
		GameRegistry.registerItem((chicken_sprout), "chicken_sprout");
		GameRegistry.registerItem((pig_sprout), "pig_sprout");
		GameRegistry.registerItem((rabbit_sprout), "rabbit_sprout");
	}
	
	public static void initModels() {
		
		//Items
		initModel(resource_sprout);
		
		initModel(coal_essence);
		initModel(iron_essence);
		initModel(gold_essence);
		initModel(lapis_essence);
		initModel(quartz_essence);
		initModel(redstone_essence);
		initModel(diamond_essence);
		initModel(emerald_essence);
		initModel(glowstone_essence);
		
		initModel(zombie_essence);
		initModel(creeper_essence);
		initModel(skeleton_essence);
		initModel(slime_essence);
		initModel(spider_essence);
		initModel(guardian_essence);
		initModel(ghast_essence);
		initModel(wither_essence);
		initModel(blaze_essence);
		initModel(enderman_essence);
		
		initModel(squid_essence);
		initModel(cow_essence);
		initModel(sheep_essence);
		initModel(chicken_essence);
		initModel(pig_essence);
		initModel(rabbit_essence);
		
		initModel(zombie_chunk);
		initModel(creeper_chunk);
		initModel(skeleton_chunk);
		initModel(slime_chunk);
		initModel(spider_chunk);
		initModel(guardian_chunk);
		initModel(ghast_chunk);
		initModel(wither_chunk);
		initModel(blaze_chunk);
		initModel(enderman_chunk);
		
		initModel(squid_chunk);
		initModel(cow_chunk);
		initModel(sheep_chunk);
		initModel(chicken_chunk);
		initModel(pig_chunk);
		initModel(rabbit_chunk);
		
		//Seeds
		initModel(resource_seed);
		
		initModel(coal_sprout);
		initModel(iron_sprout);
		initModel(gold_sprout);
		initModel(lapis_sprout);
		initModel(quartz_sprout);
		initModel(redstone_sprout);
		initModel(diamond_sprout);
		initModel(emerald_sprout);
		initModel(glowstone_sprout);
		
		initModel(zombie_sprout);
		initModel(creeper_sprout);
		initModel(skeleton_sprout);
		initModel(slime_sprout);
		initModel(spider_sprout);
		initModel(guardian_sprout);
		initModel(ghast_sprout);
		initModel(wither_sprout);
		initModel(blaze_sprout);
		initModel(enderman_sprout);
		
		initModel(squid_sprout);
		initModel(cow_sprout);
		initModel(sheep_sprout);
		initModel(chicken_sprout);
		initModel(pig_sprout);
		initModel(rabbit_sprout);
	}
	
	public static void initModel(Item item) {
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0,
				new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
	}

}
