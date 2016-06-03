package com.agriculturalexpansion.extend;

import com.agriculturalexpansion.main.AgriculturalExpansion;

import net.minecraft.item.Item;

public class AEItem extends Item {
	
	public AEItem(String name) {
		super();
		
		this.setUnlocalizedName(name);
		this.setCreativeTab(AgriculturalExpansion.tabAgriculturalExpansion);
	}

}
