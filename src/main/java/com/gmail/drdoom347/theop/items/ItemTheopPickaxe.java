package com.gmail.drdoom347.theop.items;

import com.gmail.drdoom347.theop.tabs.ModTabs;

import net.minecraft.item.ItemPickaxe;

public class ItemTheopPickaxe extends ItemPickaxe
{
	public final ToolMaterial toolMaterial;
    
    public ItemTheopPickaxe(ToolMaterial EnumToolMaterial)
    {
        super(EnumToolMaterial);
        toolMaterial = EnumToolMaterial;
        setCreativeTab(ModTabs.tabTheop);
    }

}
