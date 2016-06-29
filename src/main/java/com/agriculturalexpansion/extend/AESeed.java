package com.agriculturalexpansion.extend;

import java.util.Collection;

import com.agriculturalexpansion.main.AgriculturalExpansion;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class AESeed extends ItemSeeds {
	
	private Block crops;

	public AESeed(String name, Block crops, Block soil) {
		super(crops, soil);
		this.crops = crops;
		this.setUnlocalizedName(name);
		this.setCreativeTab(AgriculturalExpansion.tabAgriculturalExpansion);

	}
}
