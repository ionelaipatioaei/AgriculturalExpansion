package com.agriculturalexpansion.extend;

import com.agriculturalexpansion.main.AgriculturalExpansion;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

import java.util.List;

public class AEFood extends ItemFood {

	public AEFood(String name, int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);

		this.setUnlocalizedName(name);
		this.setCreativeTab(AgriculturalExpansion.tabAgriculturalExpansion);
	}

	@Override
	public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
		super.addInformation(stack, playerIn, tooltip, advanced);
		if (stack.getItem() instanceof AEFood) {
			tooltip.add("Zombie, Spider, Guardian Squid or animal chunks can be cooked.");
		}
	}

}
