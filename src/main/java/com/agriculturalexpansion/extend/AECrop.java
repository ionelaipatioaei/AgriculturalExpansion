package com.agriculturalexpansion.extend;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.agriculturalexpansion.handler.ConfigurationFile;

import com.agriculturalexpansion.init.AEItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;



public class AECrop extends BlockCrops {
	
    public AECrop(String name) {
    	super();
    	this.setUnlocalizedName(name);
        this.setCreativeTab((CreativeTabs)null);
        this.setHardness(0.0F);
        this.setSoundType(SoundType.PLANT);
    }
    	
    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state) {
    	return ConfigurationFile.canUseBonemeal;
    }
    
    protected boolean canSustainBush(IBlockState state) {
        return state.getBlock() == Blocks.FARMLAND;
    }
    
    @Override
    public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        List<ItemStack> drops = new ArrayList<ItemStack>();

        int age = state.getValue(AGE);
        Random rand = ((World) world).rand;

        int essence = 1;
        int seeds = 1;
        int powerful_sprout = 0;
        int ultimate_sprout = 0;

        if (age >= getMaxAge()) {
            //33% chance to get an extra seed
            if(rand.nextInt(3) == 0){
                seeds++;
            }

            //10% chance to get a second essence
            if(rand.nextInt(10) == 0) {
            	essence++;
            }

            //10% chance to get a powerful sprout
            if(rand.nextInt(10) == 0) {
                powerful_sprout++;
            }

            //5% chance to get an ultimate sprout
            if(rand.nextInt(20) == 0) {
                ultimate_sprout++;
            }
            drops.add(new ItemStack(this.getSeed(), seeds, 0));
            drops.add(new ItemStack(this.getCrop(), essence, 0));
            drops.add(new ItemStack(AEItems.powerful_sprout, powerful_sprout, 0));
            drops.add(new ItemStack(AEItems.ultimate_sprout, ultimate_sprout, 0));
        } else {
            int seed = 1;
            drops.add(new ItemStack(this.getSeed(), seed, 0));
        }
        return drops;
    }

    
}