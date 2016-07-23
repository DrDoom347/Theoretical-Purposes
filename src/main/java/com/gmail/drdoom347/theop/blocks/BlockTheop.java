package com.gmail.drdoom347.theop.blocks;

import com.gmail.drdoom347.theop.tabs.ModTabs;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTheop extends Block
{
	public BlockTheop(float hardness, float resistance, String harvestType, int harvestLevel, float lightLevel)
	{
		super(Material.ROCK);
		this.setCreativeTab(ModTabs.tabTheop);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setHarvestLevel(harvestType, harvestLevel);
        this.setLightLevel(lightLevel);
	}
}
