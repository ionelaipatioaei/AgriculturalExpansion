package com.agriculturalexpansion.extend;

import java.util.List;

import com.agriculturalexpansion.init.AEItems;
import com.agriculturalexpansion.main.AgriculturalExpansion;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class AEItem extends Item {
	
	public AEItem(String name) {
		super();
		
		this.setUnlocalizedName(name);
		this.setCreativeTab(AgriculturalExpansion.tabAgriculturalExpansion);
	}
	
	@Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
		super.addInformation(stack, playerIn, tooltip, advanced);
        if (stack.getItem() == AEItems.resource_sprout) {
        	tooltip.add("Obtained from Resource Crop(10% chance to get another one).");
        }
		if (stack.getItem() == AEItems.powerful_sprout) {
			tooltip.add("Obtained from all types of crops(10% chance to ge one).");
		}
		if(stack.getItem() == AEItems.ultimate_sprout) {
			tooltip.add("Obtained from all types of crops(5% chance to get one).");
		}
    }

}
