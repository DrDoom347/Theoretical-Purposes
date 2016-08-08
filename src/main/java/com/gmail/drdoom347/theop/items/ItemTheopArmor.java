package com.gmail.drdoom347.theop.items;

import com.gmail.drdoom347.theop.init.TheopArmory;
import com.gmail.drdoom347.theop.tabs.ModTabs;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ItemTheopArmor extends ItemArmor
{
	public ItemTheopArmor(ArmorMaterial material, int renderIndex, EntityEquipmentSlot ArmorType, String name) 
    {
        super(material, renderIndex, ArmorType);
        setRegistryName(name);
        setCreativeTab(ModTabs.tabTheop);
    }
	
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemstack)
	{
		if (player.inventory.armorInventory[2].getItem() == TheopArmory.voidUltimatiumPlate)
		{
			player.capabilities.allowFlying = true;
			player.fallDistance = 0F;
		}
	}
}
