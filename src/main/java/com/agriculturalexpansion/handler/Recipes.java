package com.agriculturalexpansion.handler;

import com.agriculturalexpansion.init.AEBlocks;
import com.agriculturalexpansion.init.AEItems;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

import java.util.List;

public class Recipes {

    public static void init() {
        initRecipes();
        initSmelting();
        initOreDict();
    }

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

    public static ItemStack[] outputItems = {
            new ItemStack(Items.COAL, 4), new ItemStack(Items.IRON_INGOT, 2), new ItemStack(Items.GOLD_INGOT, 2), new ItemStack(Items.DYE, 8, 4), new ItemStack(Items.QUARTZ, 4), new ItemStack(Items.REDSTONE, 8), new ItemStack(Items.DIAMOND, 1), new ItemStack(Items.EMERALD, 1), new ItemStack(Items.GLOWSTONE_DUST, 4),
            new ItemStack(Items.ROTTEN_FLESH, 4), new ItemStack(Items.GUNPOWDER, 4), new ItemStack(Items.BONE, 4), new ItemStack(Items.SLIME_BALL, 3), new ItemStack(Items.STRING, 4), new ItemStack(Items.PRISMARINE_SHARD, 4), new ItemStack(Items.GHAST_TEAR, 2), new ItemStack(Items.SKULL, 1, 1), new ItemStack(Items.BLAZE_ROD, 3), new ItemStack(Items.ENDER_PEARL, 2),
            new ItemStack(Items.DYE, 4, 0), new ItemStack(Items.LEATHER, 4), new ItemStack(Blocks.WOOL, 2), new ItemStack(Items.FEATHER, 4), new ItemStack(Items.PORKCHOP, 4), new ItemStack(Items.RABBIT_FOOT, 1),
            getItem("ingotCopper", true, 2), getItem("ingotTin", true, 2), getItem("ingotSilver", true, 2), getItem("ingotLead", true, 2), getItem("ingotNickel", true, 2), getItem("ingotPlatinum", true, 1), getItem("ingotAluminum", true, 2), getItem("ingotIridium", true, 1), getItem("ingotTitanium", true, 2), getItem("ingotTungsten", true, 2), getItem("ingotZinc", true, 2),
            getItem("ingotArdite", true, 2), getItem("ingotCobalt", true, 2), getItem("ingotAlubrass", true, 2), getItem("ingotManyullyn", true, 2),
            getItem("ingotBronze", true, 2), getItem("ingotSteel", true, 2), getItem("ingotInvar", true, 2), getItem("ingotElectrum", true, 2), getItem("ingotBrass", true, 2),
            getItem("gemRuby", true, 2), getItem("gemSapphire", true, 2), getItem("gemAmber", true, 2), getItem("gemMalachite", true, 2), getItem("gemPeridot", true, 2), getItem("gemTanzanite", true, 2), getItem("gemTopaz", true, 2),
            getItem("gemApatite", true, 10), getItem("materialRubber", true, 2),
    };
    public static ItemStack[] outputOres = {
            new ItemStack(Blocks.COAL_ORE, 2), new ItemStack(Blocks.IRON_ORE, 1), new ItemStack(Blocks.GOLD_ORE, 1), new ItemStack(Blocks.LAPIS_ORE, 2), new ItemStack(Blocks.QUARTZ_ORE, 2), new ItemStack(Blocks.REDSTONE_ORE, 2), new ItemStack(Blocks.DIAMOND_ORE, 1), new ItemStack(Blocks.EMERALD_ORE, 1), null,
            null, null, null, null, null, null, null, null, null, null,
            null, null, null, null, null, null,
            getItem("oreCopper", true, 1), getItem("oreTin", true, 1), getItem("oreSilver", true, 1), getItem("oreLead", true, 1), getItem("oreNickel", true, 1), getItem("orePlatinum", true, 1), getItem("oreAluminum", true, 1), getItem("oreIridium", true, 1), getItem("oreTitanium", true, 1), getItem("oreTungsten", true, 1), getItem("oreZinc", true, 1),
            getItem("oreArdite", true, 1), getItem("oreCobalt", true, 1), null, null,
            null, null, null, null, null,
            getItem("oreRuby", true, 1), getItem("oreSapphire", true, 1), getItem("oreAmber", true, 1), getItem("oreMalachite", true, 1), getItem("orePeridot", true, 1), getItem("oreTanzanite", true, 1), getItem("oreTopaz", true, 1),
            getItem("oreApatite", true, 3), null,
    };
    public static ItemStack[][] inputSprouts = {
            {new ItemStack(Items.COAL), new ItemStack(AEItems.zombie_chunk), new ItemStack(AEItems.creeper_chunk), new ItemStack(AEItems.skeleton_chunk), new ItemStack(AEItems.slime_chunk), new ItemStack(AEItems.spider_chunk), new ItemStack(AEItems.squid_chunk), new ItemStack(AEItems.cow_chunk), new ItemStack(AEItems.sheep_chunk), new ItemStack(AEItems.chicken_chunk), new ItemStack(AEItems.pig_chunk), new ItemStack(AEItems.rabbit_chunk), getItem("ingotCopper", true, 2), getItem("ingotTin", true, 2), getItem("ingotBronze", true, 2), getItem("gemApatite", true, 10)},
            {new ItemStack(Items.IRON_INGOT, 2), new ItemStack(Items.GOLD_INGOT, 2), new ItemStack(Items.DYE, 8, 4), new ItemStack(Items.QUARTZ, 4), new ItemStack(Items.REDSTONE, 8), new ItemStack(Items.GLOWSTONE_DUST, 4), new ItemStack(AEItems.guardian_chunk), new ItemStack(AEItems.blaze_chunk), new ItemStack(AEItems.earth_sprout_former), new ItemStack(AEItems.water_sprout_former), new ItemStack(AEItems.fire_sprout_former), new ItemStack(AEItems.experience_sprout_former), new ItemStack(AEItems.dye_sprout_former), new ItemStack(AEItems.nature_sprout_former), new ItemStack(AEItems.nether_sprout_former),
                    getItem("ingotSilver", true, 2), getItem("ingotLead", true, 2), getItem("ingotNickel", true, 2), getItem("ingotAluminum", true, 2), getItem("ingotTungsten", true, 2), getItem("ingotZinc", true, 2), getItem("ingotAlubrass", true, 2), getItem("ingotSteel", true, 2), getItem("ingotInvar", true, 2), getItem("ingotElectrum", true, 2), getItem("ingotBrass", true, 2), getItem("gemRuby", true, 2), getItem("gemSapphire", true, 2), getItem("gemAmber", true, 2), getItem("gemMalachite", true, 2), getItem("gemPeridot", true, 2), getItem("gemTanzanite", true, 2), getItem("gemTopaz", true, 2), getItem("materialRubber", true, 2)},
            {new ItemStack(Items.DIAMOND, 1), new ItemStack(Items.EMERALD, 1), new ItemStack(AEItems.ghast_chunk), new ItemStack(AEItems.wither_chunk), new ItemStack(AEItems.enderman_chunk), getItem("ingotPlatinum", true, 1), getItem("ingotIridium", true, 1), getItem("ingotTitanium", true, 2), getItem("ingotArdite", true, 2), getItem("ingotCobalt", true, 2), getItem("ingotManyullyn", true, 2)}
    };

    private static void initRecipes() {

        if(ConfigurationFile.enableSproutBlockCrafting) {
            GameRegistry.addShapedRecipe(new ItemStack(AEBlocks.sprout_block), "XXX", "XXX", "XXX", 'X', AEItems.resource_sprout);
        }
        if(ConfigurationFile.reusableSproutsFromBlock) {
            GameRegistry.addShapelessRecipe(new ItemStack(AEItems.resource_sprout), AEBlocks.sprout_block);
        }
        //Generated Recipes
        for(int i = 0; i < outputItems.length; i++) {
            if (outputItems[i] != null) {
                GameRegistry.addShapedRecipe(outputItems[i], "XXX", "X X", "XXX", 'X', new ItemStack(AEIDs.inputEssence[i]));
            }
        }
        for(int i = 0; i < outputOres.length; i++) {
            if(outputOres[i] != null) {
                int[] exception = {4, 36, 37};
                for(int x = 0; x < exception.length; x++) {
                    GameRegistry.addShapedRecipe(outputOres[exception[x]], "XXX", "XYX", "XXX", 'Y', new ItemStack(Blocks.NETHERRACK), 'X', new ItemStack(AEIDs.inputEssence[exception[x]]));
                    outputOres[exception[x]] = null;
                }
                GameRegistry.addShapedRecipe(outputOres[i], "XXX", "XYX", "XXX", 'Y', new ItemStack(Blocks.STONE, 0, 0), 'X', new ItemStack(AEIDs.inputEssence[i]));
            }
        }
        for(int i = 0; i < inputSprouts[0].length; i++) {
            if (inputSprouts[0][i] != null) {
                GameRegistry.addShapedRecipe(new ItemStack(AEIDs.outputSprout[0][i]), "XXX", "XYX", "XXX", 'X', new ItemStack(AEItems.resource_sprout), 'Y', inputSprouts[0][i]);
            }
        }
        for(int i = 0; i < inputSprouts[1].length; i++) {
            if(inputSprouts[1][i] != null) {
                GameRegistry.addShapedRecipe(new ItemStack(AEIDs.outputSprout[1][i]), "ZXZ", "XYX", "ZXZ", 'Z', AEItems.resource_sprout, 'X', AEItems.powerful_sprout, 'Y', inputSprouts[1][i]);
            }
        }
        for(int i = 0; i < inputSprouts[2].length; i++) {
            if (inputSprouts[2][i] != null) {
                GameRegistry.addShapedRecipe(new ItemStack(AEIDs.outputSprout[2][i]), "ZXZ", "XYX", "ZXZ", 'Z', AEItems.powerful_sprout, 'X', AEItems.ultimate_sprout, 'Y', inputSprouts[2][i]);
            }
        }
        int[] dye = {1, 2, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        for(int i = 1; i < dye.length; i++) {
            GameRegistry.addShapelessRecipe(new ItemStack(Items.DYE, 2, dye[i]), new ItemStack(Items.DYE, 1, dye[i]), AEItems.dye_essence);
        }
        //Custom Recipes
        //Resource Seed
        GameRegistry.addShapelessRecipe(new ItemStack(AEItems.resource_seed), Items.WATER_BUCKET, new ItemStack(Items.DYE, 1, 15), Items.WHEAT_SEEDS, Items.APPLE);

        //Sprout Former
        GameRegistry.addShapelessRecipe(new ItemStack(AEItems.earth_sprout_former), Blocks.GRASS, Blocks.DIRT, Blocks.GRAVEL, Blocks.CLAY);
        GameRegistry.addShapelessRecipe(new ItemStack(AEItems.water_sprout_former), Items.WATER_BUCKET);
        GameRegistry.addShapelessRecipe(new ItemStack(AEItems.fire_sprout_former), Items.LAVA_BUCKET);
        GameRegistry.addShapelessRecipe(new ItemStack(AEItems.experience_sprout_former), Items.EXPERIENCE_BOTTLE, Items.ROTTEN_FLESH, Items.BONE, Items.SPIDER_EYE, Items.BLAZE_POWDER);
        GameRegistry.addShapelessRecipe(new ItemStack(AEItems.dye_sprout_former), new ItemStack(Items.DYE, 1, 1), new ItemStack(Items.DYE, 1, 2), new ItemStack(Items.DYE, 1, 3), new ItemStack(Items.DYE, 1, 4), new ItemStack(Items.DYE, 1, 14));
        GameRegistry.addShapelessRecipe(new ItemStack(AEItems.nature_sprout_former), Items.APPLE, Items.WHEAT_SEEDS, Blocks.SAPLING, Blocks.PLANKS, Blocks.LEAVES);
        GameRegistry.addShapelessRecipe(new ItemStack(AEItems.nether_sprout_former), Items.GHAST_TEAR, Items.MAGMA_CREAM, Blocks.NETHERRACK, Blocks.NETHER_BRICK, Items.BLAZE_ROD);

        //Recipes
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.DIRT, 8), "XXX", "X X", "XXX", 'X', AEItems.earth_essence);
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.SAND, 8), "XXX", " X ", "XXX", 'X', AEItems.earth_essence);
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.GRAVEL, 8), "X X", "XXX", "X X", 'X', AEItems.earth_essence);
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.CLAY, 8), "XXX", "XYX", "XXX", 'X', AEItems.earth_essence, 'Y', AEItems.water_essence);
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.GRASS, 8), "XXX", "XYX", "XXX", 'X', AEItems.earth_essence, 'Y', AEItems.nature_essence);
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.NETHERRACK, 8), "XXX", "XYX", "XXX", 'X', AEItems.earth_essence, 'Y', AEItems.nether_essence);

        GameRegistry.addShapedRecipe(new ItemStack(Items.WATER_BUCKET, 1), "XXX", "XYX", "XXX", 'X', AEItems.water_essence, 'Y', Items.BUCKET);
        GameRegistry.addShapedRecipe(new ItemStack(Items.LAVA_BUCKET, 1), "XXX", "XYX", "XXX", 'X', AEItems.fire_essence, 'Y', Items.BUCKET);
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.OBSIDIAN, 2), "XXX", "YYY", "YYY", 'X', AEItems.water_essence, 'Y', AEItems.fire_essence);
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.STONE, 8, 0), "XXX", "YYY", 'X', AEItems.water_essence, 'Y', AEItems.fire_essence);
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.COBBLESTONE, 8), "XXX", "YYY", 'X', AEItems.fire_essence, 'Y', AEItems.water_essence);

        GameRegistry.addShapedRecipe(new ItemStack(Items.EXPERIENCE_BOTTLE, 8), "XXX", "X X", "XXX", 'X', AEItems.experience_essence);
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.LEAVES, 8), "XXX", "X X", "XXX", 'X', AEItems.nature_essence);
        GameRegistry.addShapedRecipe(new ItemStack(Blocks.SOUL_SAND, 8), "XXX", "XYX", "XXX", 'X', AEItems.nether_essence, 'Y', AEItems.earth_essence);

        GameRegistry.addShapedRecipe(new ItemStack(Items.ARROW, 8), "X X", "XXX", "X X", 'X', AEItems.skeleton_essence);
        GameRegistry.addShapedRecipe(new ItemStack(Items.SPIDER_EYE, 4), "X X", "XXX", "X X", 'X', AEItems.spider_essence);
        GameRegistry.addShapedRecipe(new ItemStack(Items.PRISMARINE_CRYSTALS, 3), "X X", "XXX", "X X", 'X', AEItems.guardian_essence);
        GameRegistry.addShapedRecipe(new ItemStack(Items.ARROW, 8), "X X", "XXX", "X X", 'X', AEItems.skeleton_essence);
        GameRegistry.addShapedRecipe(new ItemStack(Items.GUNPOWDER, 4), "X X", "XXX", "X X", 'X', AEItems.ghast_essence);

        GameRegistry.addShapedRecipe(new ItemStack(Items.BEEF, 4), "X X", "XXX", "X X", 'X', AEItems.cow_essence);
        GameRegistry.addShapedRecipe(new ItemStack(Items.MUTTON, 4), "X X", "XXX", "X X", 'X', AEItems.sheep_essence);
        GameRegistry.addShapedRecipe(new ItemStack(Items.CHICKEN, 3), "X X", "XXX", "X X", 'X', AEItems.chicken_essence);
        GameRegistry.addShapedRecipe(new ItemStack(Items.RABBIT, 3), "X X", "XXX", "X X", 'X', AEItems.rabbit_essence);
        GameRegistry.addShapedRecipe(new ItemStack(Items.RABBIT_HIDE, 4), "XXX", " X ", "XXX", 'X', AEItems.rabbit_essence);
    }

    private static void initSmelting() {
        for(int i = 0; i < AEIDs.inputChunk.length; i++) {
            GameRegistry.addSmelting(new ItemStack(AEIDs.inputChunk[i]), new ItemStack(AEItems.cooked_mob_chunk, 1), 10.0F);
        }

    }

    private static void initOreDict() {

        OreDictionary.registerOre("seed", new ItemStack(AEItems.resource_seed));
    }
}
