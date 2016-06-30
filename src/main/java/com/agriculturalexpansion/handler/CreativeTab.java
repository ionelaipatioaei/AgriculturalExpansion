package com.agriculturalexpansion.handler;

import com.agriculturalexpansion.init.AEItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTab extends CreativeTabs {

	public CreativeTab(String label) {
		super(label);
		
	}

	@Override
	public Item getTabIconItem() {
		return AEItems.resource_seed;
	}

}
