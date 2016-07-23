package com.gmail.drdoom347.theop.items;

import com.gmail.drdoom347.theop.tabs.ModTabs;

import net.minecraft.item.ItemSword;

public class ItemTheopSword extends ItemSword
{
	public final ToolMaterial toolMaterial;
    
    public ItemTheopSword(ToolMaterial EnumToolMaterial)
    {
        super(EnumToolMaterial);
        toolMaterial = EnumToolMaterial;
        setCreativeTab(ModTabs.tabTheop);
    }

}
