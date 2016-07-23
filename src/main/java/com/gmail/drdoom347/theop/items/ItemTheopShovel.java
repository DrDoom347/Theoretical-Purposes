package com.gmail.drdoom347.theop.items;

import com.gmail.drdoom347.theop.tabs.ModTabs;

import net.minecraft.item.ItemSpade;

public class ItemTheopShovel extends ItemSpade
{
	public final ToolMaterial toolMaterial;
    
    public ItemTheopShovel(ToolMaterial EnumToolMaterial)
    {
        super(EnumToolMaterial);
        toolMaterial = EnumToolMaterial;
        setCreativeTab(ModTabs.tabTheop);
    }

}
