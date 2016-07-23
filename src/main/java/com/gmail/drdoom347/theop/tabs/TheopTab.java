package com.gmail.drdoom347.theop.tabs;

import com.gmail.drdoom347.theop.init.TheopItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class TheopTab extends CreativeTabs
{
	String name;
    
    public TheopTab(int par1, String par2Str)
    {
        super(par1, par2Str);
        this.name = par2Str;
    }
    
    @SideOnly(Side.CLIENT)
    public Item getTabIconItem()
    {
    	if (this.name == "tabTheop") 
        {
            return TheopItems.kryptoniteIngot;
        }
        return null;
    }
}
