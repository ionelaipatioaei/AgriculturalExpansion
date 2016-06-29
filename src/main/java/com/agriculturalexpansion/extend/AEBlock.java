package com.agriculturalexpansion.extend;

import com.agriculturalexpansion.main.AgriculturalExpansion;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class AEBlock extends Block {

	public AEBlock(String unlocalizedName, Material materialIn, float hardness, float resistance, String toolClass, int level) {
		super(materialIn);
		this.setCreativeTab(AgriculturalExpansion.tabAgriculturalExpansion);
		this.setUnlocalizedName(unlocalizedName);
		this.setHardness(hardness);
		this.setResistance(resistance);
		this.setHarvestLevel(toolClass, level);
	}

}
