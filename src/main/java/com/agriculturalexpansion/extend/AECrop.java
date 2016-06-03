package com.agriculturalexpansion.extend;

import java.util.Random;

import com.agriculturalexpansion.handler.ConfigurationFile;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class AECrop extends BlockCrops {
	
	 public static final PropertyInteger AGE = PropertyInteger.create("age", 0, 7);

    public AECrop(String name) {
    	super();
    	this.setUnlocalizedName(name);
        this.setCreativeTab((CreativeTabs)null);
        this.setHardness(0.0F);
        this.setSoundType(SoundType.PLANT);
        this.disableStats();
    }
    	
    public boolean canUseBonemeal(World worldIn, Random rand, BlockPos pos, IBlockState state) {
    	return ConfigurationFile.canUseBonemeal;
    }
    
    protected boolean canSustainBush(IBlockState state) {
        return state.getBlock() == Blocks.FARMLAND;
    }
    
    @Override
    public java.util.List<ItemStack> getDrops(net.minecraft.world.IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
        java.util.List<ItemStack> ret = super.getDrops(world, pos, state, fortune);
        int age = getAge(state);
        Random rand = world instanceof World ? ((World)world).rand : new Random();

        if (age >= getMaxAge()) {
            int k = 3 + fortune;

            for (int i = 0; i < 3 + fortune; ++i) {
            	
                if (rand.nextInt(2 * getMaxAge()) <= age){
                    ret.add(new ItemStack(this.getSeed(), 1, 0));
                }
                if (rand.nextInt(1) < 0) {
                	ret.add(new ItemStack(this.getCrop(), 1, 0));
                }
            }
        }
        return ret;
    }
    
    @Override
    public PropertyInteger getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return 7;
    }

    @Override
    public int getAge(IBlockState state) {
        return ((Integer)state.getValue(this.getAgeProperty())).intValue();
    }

    @Override
    public IBlockState withAge(int age) {
        return this.getDefaultState().withProperty(this.getAgeProperty(), Integer.valueOf(age));
    }

    @Override
    public boolean isMaxAge(IBlockState state) {
        return ((Integer)state.getValue(this.getAgeProperty())).intValue() >= this.getMaxAge();
    }
    
    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.withAge(meta);
    }
    
    @Override
    public int getMetaFromState(IBlockState state) {
        return this.getAge(state);
    }

    @Override
    public BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[] {AGE});
    }

}
