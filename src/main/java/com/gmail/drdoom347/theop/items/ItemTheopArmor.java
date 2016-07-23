package com.gmail.drdoom347.theop.items;

import com.gmail.drdoom347.theop.tabs.ModTabs;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemTheopArmor extends ItemArmor
{
	public ItemTheopArmor(ArmorMaterial material, int renderIndex, EntityEquipmentSlot ArmorType, String name) 
    {
        super(material, renderIndex, ArmorType);
        setRegistryName(name);
        setCreativeTab(ModTabs.tabTheop);
    }

}
