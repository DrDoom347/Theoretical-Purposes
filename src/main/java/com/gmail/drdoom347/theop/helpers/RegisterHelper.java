package com.gmail.drdoom347.theop.helpers;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RegisterHelper {
	

	public static void registerItem(Item Item)
	{
		GameRegistry.register(Item.setUnlocalizedName(Item.getRegistryName().toString()));;
	}
	
	public static void registerBlock(Block Block)
	{
		GameRegistry.register(Block.setUnlocalizedName(Block.getRegistryName().toString()));
		GameRegistry.register(new ItemBlock(Block).setRegistryName(Block.getRegistryName()));
	}

	public static void registerItemRenderer(Item item)
	{
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

	public static void registerBlockRenderer(Block Block)
	{
		Item item = Item.getItemFromBlock(Block);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		
	}
}