package com.gmail.drdoom347.theop.items;

import com.gmail.drdoom347.theop.tabs.ModTabs;

import net.minecraft.item.ItemFood;
import net.minecraft.potion.PotionEffect;

public class ItemTheopFood extends ItemFood
{
	public ItemTheopFood(String unlocalizedName, int healAmount, float saturationModifier, boolean wolvesFavorite, PotionEffect... effects) {
		super(healAmount, saturationModifier, wolvesFavorite);
		this.setUnlocalizedName(unlocalizedName);
		this.setCreativeTab(ModTabs.tabTheop);
	}
}
