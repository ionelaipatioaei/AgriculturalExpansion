package com.agriculturalexpansion.extend;

import com.agriculturalexpansion.main.AgriculturalExpansion;

import net.minecraft.block.Block;
import net.minecraft.item.ItemSeeds;

public class AESeed extends ItemSeeds {
	
	private Block crops;

	public AESeed(String name, Block crops, Block soil) {
		super(crops, soil);
		this.crops = crops;
		this.setUnlocalizedName(name);
		this.setCreativeTab(AgriculturalExpansion.tabAgriculturalExpansion);

	}

}
