package com.gmail.drdoom347.theop.items;

import com.gmail.drdoom347.theop.tabs.ModTabs;

import net.minecraft.item.ItemHoe;

public class ItemTheopHoe extends ItemHoe
{
	public final ToolMaterial toolMaterial;
    
    public ItemTheopHoe(ToolMaterial EnumToolMaterial)
    {
        super(EnumToolMaterial);
        toolMaterial = EnumToolMaterial;
        setCreativeTab(ModTabs.tabTheop);
    }

}
