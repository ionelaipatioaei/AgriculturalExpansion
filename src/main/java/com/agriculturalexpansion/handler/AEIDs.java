package com.agriculturalexpansion.handler;

import com.agriculturalexpansion.init.AEBlocks;
import com.agriculturalexpansion.init.AEItems;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

import java.util.List;

public class AEIDs {

    /**
     * MULTI-DIMENSIONAL ARRAYS
     * int[c][r] = {};
     * [c] - coulumn;
     * [r] - row;
     */

    public static ItemStack getItem(String oreDict, boolean stack, int stackSize) {
        ItemStack item = null;
        List<ItemStack> list = OreDictionary.getOres(oreDict);
        if(!list.isEmpty()) {
            item = list.get(0);
            if(stack) {
                item.stackSize = stackSize;
            } else {
                item.stackSize = 1;
            }
        }
        return item;
    }

    public static Item[] items = {
            AEItems.resource_sprout, AEItems.powerful_sprout, AEItems.ultimate_sprout,
            AEItems.earth_sprout_former, AEItems.water_sprout_former, AEItems.fire_sprout_former, AEItems.experience_sprout_former, AEItems.dye_sprout_former, AEItems.nature_sprout_former, AEItems.nether_sprout_former,
            AEItems.coal_essence, AEItems.iron_essence, AEItems.gold_essence, AEItems.lapis_essence, AEItems.quartz_essence, AEItems.redstone_essence, AEItems.diamond_essence, AEItems.emerald_essence, AEItems.glowstone_essence,
            AEItems.zombie_essence, AEItems.creeper_essence, AEItems.skeleton_essence, AEItems.slime_essence, AEItems.spider_essence, AEItems.guardian_essence, AEItems.ghast_essence, AEItems.wither_essence, AEItems.blaze_essence, AEItems.enderman_essence,
            AEItems.squid_essence, AEItems.cow_essence, AEItems.sheep_essence, AEItems.chicken_essence, AEItems.pig_essence, AEItems.rabbit_essence,
            AEItems.earth_essence, AEItems.water_essence, AEItems.fire_essence, AEItems.experience_essence, AEItems.dye_essence, AEItems.nature_essence, AEItems.nether_essence,
            AEItems.copper_essence, AEItems.tin_essence, AEItems.silver_essence, AEItems.lead_essence, AEItems.nickel_essence, AEItems.platinum_essence, AEItems.aluminum_essence, AEItems.iridium_essence, AEItems.titanium_essence, AEItems.tungsten_essence, AEItems.zinc_essence,
            AEItems.ardite_essence, AEItems.cobalt_essence, AEItems.alubrass_essence, AEItems.manyullyn_essence,
            AEItems.bronze_essence, AEItems.steel_essence, AEItems.invar_essence, AEItems.electrum_essence, AEItems.brass_essence,
            AEItems.ruby_essence, AEItems.sapphire_essence, AEItems.amber_essence, AEItems.malachite_essence, AEItems.peridot_essence, AEItems.tanzanite_essence, AEItems.topaz_essence,
            AEItems.apatite_essence, AEItems.rubber_essence,
            AEItems.zombie_chunk, AEItems.creeper_chunk, AEItems.skeleton_chunk, AEItems.slime_chunk, AEItems.spider_chunk, AEItems.guardian_chunk, AEItems.ghast_chunk, AEItems.wither_chunk, AEItems.blaze_chunk, AEItems.enderman_chunk,
            AEItems.squid_chunk, AEItems.cow_chunk, AEItems.sheep_chunk, AEItems.chicken_chunk, AEItems.pig_chunk, AEItems.rabbit_chunk,
            AEItems.cooked_mob_chunk,
            AEItems.resource_seed,
            AEItems.coal_sprout, AEItems.iron_sprout, AEItems.gold_sprout, AEItems.lapis_sprout, AEItems.quartz_sprout, AEItems.redstone_sprout, AEItems.diamond_sprout, AEItems.emerald_sprout, AEItems.glowstone_sprout,
            AEItems.zombie_sprout, AEItems.creeper_sprout, AEItems.skeleton_sprout, AEItems.slime_sprout, AEItems.spider_sprout, AEItems.guardian_sprout, AEItems.ghast_sprout, AEItems.wither_sprout, AEItems.blaze_sprout, AEItems.enderman_sprout,
            AEItems.squid_sprout, AEItems.cow_sprout, AEItems.sheep_sprout, AEItems.chicken_sprout, AEItems.pig_sprout, AEItems.rabbit_sprout,
            AEItems.earth_sprout, AEItems.water_sprout, AEItems.fire_sprout, AEItems.experience_sprout, AEItems.dye_sprout, AEItems.nature_sprout, AEItems.nether_sprout,
            AEItems.copper_sprout, AEItems.tin_sprout, AEItems.silver_sprout, AEItems.lead_sprout, AEItems.nickel_sprout, AEItems.platinum_sprout, AEItems.aluminum_sprout, AEItems.iridium_sprout, AEItems.titanium_sprout, AEItems.tungsten_sprout, AEItems.zinc_sprout,
            AEItems.ardite_sprout, AEItems.cobalt_sprout, AEItems.alubrass_sprout, AEItems.manyullyn_sprout,
            AEItems.bronze_sprout, AEItems.steel_sprout, AEItems.invar_sprout, AEItems.electrum_sprout, AEItems.brass_sprout,
            AEItems.ruby_sprout, AEItems.sapphire_sprout, AEItems.amber_sprout, AEItems.malachite_sprout, AEItems. peridot_sprout, AEItems.tanzanite_sprout, AEItems.topaz_sprout,
            AEItems.apatite_sprout, AEItems.rubber_sprout
    };

    public static String[] itemsName = {
            "resource_sprout", "powerful_sprout", "ultimate_sprout",
            "earth_sprout_former", "water_sprout_former", "fire_sprout_former", "experience_sprout_former", "dye_sprout_former", "nature_sprout_former", "nether_sprout_former",
            "coal_essence", "iron_essence", "gold_essence", "lapis_essence", "quartz_essence", "redstone_essence", "diamond_essence", "emerald_essence", "glowstone_essence",
            "zombie_essence", "creeper_essence", "skeleton_essence", "slime_essence", "spider_essence", "guardian_essence", "ghast_essence", "wither_essence", "blaze_essence", "enderman_essence",
            "squid_essence", "cow_essence", "sheep_essence", "chicken_essence", "pig_essence", "rabbit_essence",
            "earth_essence", "water_essence", "fire_essence", "experience_essence", "dye_essence", "nature_essence", "nether_essence",
            "copper_essence", "tin_essence", "silver_essence", "lead_essence", "nickel_essence", "platinum_essence", "aluminum_essence", "iridium_essence", "titanium_essence", "tungsten_essence", "zinc_essence",
            "ardite_essence", "cobalt_essence", "alubrass_essence", "manyullyn_essence",
            "bronze_essence", "steel_essence", "invar_essence", "electrum_essence", "brass_essence",
            "ruby_essence", "sapphire_essence", "amber_essence", "malachite_essence", "peridot_essence", "tanzanite_essence", "topaz_essence",
            "apatite_essence", "rubber_essence",
            "zombie_chunk", "creeper_chunk", "skeleton_chunk", "slime_chunk", "spider_chunk", "guardian_chunk", "ghast_chunk", "wither_chunk", "blaze_chunk", "enderman_chunk",
            "squid_chunk", "cow_chunk", "sheep_chunk", "chicken_chunk", "pig_chunk", "rabbit_chunk",
            "cooked_mob_chunk",
            "resource_seed",
            "coal_sprout", "iron_sprout", "gold_sprout", "lapis_sprout", "quartz_sprout", "redstone_sprout", "diamond_sprout", "emerald_sprout", "glowstone_sprout",
            "zombie_sprout", "creeper_sprout", "skeleton_sprout", "slime_sprout", "spider_sprout", "guardian_sprout", "ghast_sprout", "wither_sprout", "blaze_sprout", "enderman_sprout",
            "squid_sprout", "cow_sprout", "sheep_sprout", "chicken_sprout", "pig_sprout", "rabbit_sprout",
            "earth_sprout", "water_sprout", "fire_sprout", "experience_sprout", "dye_sprout", "nature_sprout", "nether_sprout",
            "copper_sprout", "tin_sprout", "silver_sprout", "lead_sprout", "nickel_sprout", "platinum_sprout", "aluminum_sprout", "iridium_sprout", "titanium_sprout", "tungsten_sprout", "zinc_sprout",
            "ardite_sprout", "cobalt_sprout", "alubrass_sprout", "manyullyn_sprout",
            "bronze_sprout", "steel_sprout", "invar_sprout", "electrum_sprout", "brass_sprout",
            "ruby_sprout", "sapphire_sprout", "amber_sprout", "malachite_sprout", "peridot_sprout", "tanzanite_sprout", "topaz_sprout",
            "apatite_sprout", "rubber_sprout"
    };

    public static Item getItemFromId(int id) {
        Item item;
        item = items[id];
        if (id > items.length) {
            item = null;
        }
        return item;
    }

    public static Block[] blocks = {
            AEBlocks.sprout_block,
            AEBlocks.resource_crop,
            AEBlocks.coal_crop, AEBlocks.iron_crop, AEBlocks.gold_crop, AEBlocks.lapis_crop, AEBlocks.quartz_crop, AEBlocks.redstone_crop, AEBlocks.diamond_crop, AEBlocks.emerald_crop, AEBlocks.glowstone_crop,
            AEBlocks.zombie_crop, AEBlocks.creeper_crop, AEBlocks.skeleton_crop, AEBlocks.slime_crop, AEBlocks.spider_crop, AEBlocks.guardian_crop, AEBlocks.ghast_crop, AEBlocks.wither_crop, AEBlocks.blaze_crop, AEBlocks.enderman_crop,
            AEBlocks.squid_crop, AEBlocks.cow_crop, AEBlocks.sheep_crop, AEBlocks.chicken_crop, AEBlocks.pig_crop, AEBlocks.rabbit_crop,
            AEBlocks.earth_crop, AEBlocks.water_crop, AEBlocks.fire_crop, AEBlocks.experience_crop, AEBlocks.dye_crop, AEBlocks.nature_crop, AEBlocks.nether_crop,
            AEBlocks.copper_crop, AEBlocks.tin_crop, AEBlocks.silver_crop, AEBlocks.lead_crop, AEBlocks.nickel_crop, AEBlocks.platinum_crop, AEBlocks.aluminum_crop, AEBlocks.iridium_crop, AEBlocks.titanium_crop, AEBlocks.tungsten_crop, AEBlocks.zinc_crop,
            AEBlocks.ardite_crop, AEBlocks.cobalt_crop, AEBlocks.alubrass_crop, AEBlocks.manyullyn_crop,
            AEBlocks.bronze_crop, AEBlocks.steel_crop, AEBlocks.invar_crop, AEBlocks.electrum_crop, AEBlocks.brass_crop,
            AEBlocks.ruby_crop, AEBlocks.sapphire_crop, AEBlocks.amber_crop, AEBlocks.malachite_crop, AEBlocks.peridot_crop, AEBlocks.tanzanite_crop, AEBlocks.topaz_crop,
            AEBlocks.apatite_crop, AEBlocks.rubber_crop
    };

    public static String[] blocksName = {
            "sprout_block",
            "resource_crop",
            "coal_crop", "iron_crop", "gold_crop", "lapis_crop", "quartz_crop", "redstone_crop", "diamond_crop", "emerald_crop", "glowstone_crop",
            "zombie_crop", "creeper_crop", "skeleton_crop", "slime_crop", "spider_crop", "guardian_crop", "ghast_crop", "wither_crop", "blaze_crop", "enderman_crop",
            "squid_crop", "cow_crop", "sheep_crop", "chicken_crop", "pig_crop", "rabbit_crop",
            "earth_crop", "water_crop", "fire_crop", "experience_crop", "dye_crop", "nature_crop", "nether_crop",
            "copper_crop", "tin_crop", "silver_crop", "lead_crop", "nickel_crop", "platinum_crop", "aluminum_crop", "iridium_crop", "titanium_crop", "tungsten_crop", "zinc_crop",
            "ardite_crop", "cobalt_crop", "alubrass_crop", "manyullyn_crop",
            "bronze_crop", "steel_crop", "invar_crop", "electrum_crop", "brass_crop",
            "ruby_crop", "sapphire_crop", "amber_crop", "malachite_crop", "peridot_crop", "tanzanite_crop", "topaz_crop",
            "apatite_crop", "rubber_crop"
    };

    public static Block getBlockFormId(int id) {
        Block block;
        block = blocks[id];
        if (id > blocks.length) {
            block = null;
        }
        return block;
    }

    public static Item[] inputEssence = {
            AEItems.coal_essence, AEItems.iron_essence, AEItems.gold_essence, AEItems.lapis_essence, AEItems.quartz_essence, AEItems.redstone_essence, AEItems.diamond_essence, AEItems.emerald_essence, AEItems.glowstone_essence,
            AEItems.zombie_essence, AEItems.creeper_essence, AEItems.skeleton_essence, AEItems.slime_essence, AEItems.spider_essence, AEItems.guardian_essence, AEItems.ghast_essence, AEItems.wither_essence, AEItems.blaze_essence, AEItems.enderman_essence,
            AEItems.squid_essence, AEItems.cow_essence, AEItems.sheep_essence, AEItems.chicken_essence, AEItems.pig_essence, AEItems.rabbit_essence,
            AEItems.copper_essence, AEItems.tin_essence, AEItems.silver_essence, AEItems.lead_essence, AEItems.nickel_essence, AEItems.platinum_essence, AEItems.aluminum_essence, AEItems.iridium_essence, AEItems.titanium_essence, AEItems.tungsten_essence, AEItems.zinc_essence,
            AEItems.ardite_essence, AEItems.cobalt_essence, AEItems.alubrass_essence, AEItems.manyullyn_essence,
            AEItems.bronze_essence, AEItems.steel_essence, AEItems.invar_essence, AEItems.electrum_essence, AEItems.brass_essence,
            AEItems.ruby_essence, AEItems.sapphire_essence, AEItems.amber_essence, AEItems.malachite_essence, AEItems.peridot_essence, AEItems.tanzanite_essence, AEItems.topaz_essence,
            AEItems.apatite_essence, AEItems.rubber_essence,
    };

    public static Item[][] outputSprout = {
            {AEItems.coal_sprout, AEItems.zombie_sprout, AEItems.creeper_sprout, AEItems.skeleton_sprout, AEItems.slime_sprout, AEItems.spider_sprout, AEItems.squid_sprout, AEItems.cow_sprout, AEItems.sheep_sprout, AEItems.chicken_sprout, AEItems.pig_sprout, AEItems.rabbit_sprout, AEItems.copper_sprout, AEItems.tin_sprout, AEItems.bronze_sprout, AEItems.apatite_sprout},
            {AEItems.iron_sprout, AEItems.gold_sprout, AEItems.lapis_sprout, AEItems.quartz_sprout, AEItems.redstone_sprout, AEItems.glowstone_sprout, AEItems.guardian_sprout, AEItems.blaze_sprout, AEItems.earth_sprout, AEItems.water_sprout, AEItems.fire_sprout, AEItems.experience_sprout, AEItems.dye_sprout, AEItems.nature_sprout, AEItems.nether_sprout,
                    AEItems.silver_sprout, AEItems.lead_sprout, AEItems.nickel_sprout, AEItems.aluminum_sprout, AEItems.tungsten_sprout, AEItems.zinc_sprout, AEItems.alubrass_sprout, AEItems.steel_sprout, AEItems.invar_sprout, AEItems.electrum_sprout, AEItems.brass_sprout, AEItems.ruby_sprout, AEItems.sapphire_sprout, AEItems.amber_sprout, AEItems.malachite_sprout, AEItems. peridot_sprout, AEItems.tanzanite_sprout, AEItems.topaz_sprout, AEItems.ruby_sprout},
            {AEItems.diamond_sprout, AEItems.emerald_sprout, AEItems.ghast_sprout, AEItems.wither_sprout, AEItems.enderman_sprout, AEItems.platinum_sprout, AEItems.iridium_sprout, AEItems.titanium_sprout, AEItems.ardite_sprout, AEItems.cobalt_sprout, AEItems.manyullyn_sprout}
    };

    public static Item[] inputChunk = {
            AEItems.zombie_chunk, AEItems.spider_chunk, AEItems.guardian_chunk, AEItems.squid_chunk, AEItems.cow_chunk, AEItems.sheep_chunk, AEItems.chicken_chunk, AEItems.pig_chunk, AEItems.rabbit_chunk
    };

}
