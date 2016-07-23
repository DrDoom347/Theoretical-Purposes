package com.gmail.drdoom347.theop.init;

import com.gmail.drdoom347.theop.blocks.BlockTheop;
import com.gmail.drdoom347.theop.blocks.BlockTheopOre;
import com.gmail.drdoom347.theop.helpers.RegisterHelper;

import net.minecraft.block.Block;

public class TheopBlocks
{

	public static Block oreKryptonite = new BlockTheopOre(2.0F, 3.0F, "pickaxe", 7, 0F, null).setRegistryName("oreKryptonite");
	public static Block kryptoniteBlock = new BlockTheopOre(2.0F, 3.0F, "pickaxe", 7, 0F, null).setRegistryName("kryptoniteBlock");
	public static Block block_of_gunpowder = new BlockTheop(2.0F, 3.0F, "pickaxe", 0, 0F).setRegistryName("block_of_gunpowder");
	public static Block block_of_sugar = new BlockTheop(2.0F, 3.0F, "pickaxe", 0, 0F).setRegistryName("block_of_sugar");
	public static Block withermoriumOre = new BlockTheopOre(2.0F, 3.0F, "pickaxe", 8, 0F, null).setRegistryName("withermoriumOre");
	public static Block withermoriumBlock = new BlockTheopOre(2.0F, 3.0F, "pickaxe", 8, 0F, null).setRegistryName("withermoriumBlock");
	public static Block pureWitherBlock = new BlockTheopOre(2.0F, 3.0F, "pickaxe", 9, 0F, null).setRegistryName("pureWitherBlock");
	public static Block metalGemBlock = new BlockTheopOre(2.0F, 3.0F, "pickaxe", 3, 0F, null).setRegistryName("metalGemBlock");
	public static Block faerumBlock = new BlockTheopOre(2.0F, 3.0F, "pickaxe", 4, 0F, null).setRegistryName("faerumBlock");
	public static Block ceruliumBlock = new BlockTheopOre(2.0F, 3.0F, "pickaxe", 5, 0F, null).setRegistryName("ceruliumBlock");
	public static Block superMetalGemBlock = new BlockTheopOre(2.0F, 3.0F, "pickaxe", 6, 0F, null).setRegistryName("superMetalGemBlock");
	public static Block magmaCreamBlock = new BlockTheop(2.0F, 3.0F, "pickaxe", 0, 0F).setRegistryName("magmaCreamBlock");
	public static Block packedCobble = new BlockTheop(5.0F, 6.0F, "pickaxe", 0, 0F).setRegistryName("packedCobble");
	public static Block superPackedCobble = new BlockTheop(8.0F, 10.0F, "pickaxe", 0, 0F).setRegistryName("superPackedCobble");
	public static Block ultraPackedCobble = new BlockTheop(13.0F, 15.0F, "pickaxe", 0, 0F).setRegistryName("ultraPackedCobble");
	public static Block packedNetherrack = new BlockTheop(2.0F, 3.0F, "pickaxe", 0, 0F).setRegistryName("packedNetherrack");
	public static Block superPackedNetherrack = new BlockTheop(4.0F, 5.0F, "pickaxe", 0, 0F).setRegistryName("superPackedNetherrack");
	public static Block ultraPackedNetherrack = new BlockTheop(7.0F, 8.0F, "pickaxe", 0, 0F).setRegistryName("ultraPackedNetherrack");
	public static Block netherroniumOre = new BlockTheopOre(2.0F, 3.0F, "pickaxe", 8, 0F, null).setRegistryName("netherroniumOre");
	
	public static void registerBlocks()
    {
        RegisterHelper.registerBlock(oreKryptonite);
        RegisterHelper.registerBlock(kryptoniteBlock);
        RegisterHelper.registerBlock(block_of_gunpowder);
        RegisterHelper.registerBlock(block_of_sugar);
        RegisterHelper.registerBlock(withermoriumOre);
        RegisterHelper.registerBlock(withermoriumBlock);
        RegisterHelper.registerBlock(pureWitherBlock);
        RegisterHelper.registerBlock(metalGemBlock);
        RegisterHelper.registerBlock(faerumBlock);
        RegisterHelper.registerBlock(ceruliumBlock);
        RegisterHelper.registerBlock(superMetalGemBlock);
        RegisterHelper.registerBlock(magmaCreamBlock);
        RegisterHelper.registerBlock(packedCobble);
        RegisterHelper.registerBlock(superPackedCobble);
        RegisterHelper.registerBlock(ultraPackedCobble);
        RegisterHelper.registerBlock(packedNetherrack);
        RegisterHelper.registerBlock(superPackedNetherrack);
        RegisterHelper.registerBlock(ultraPackedNetherrack);
        RegisterHelper.registerBlock(netherroniumOre);
    }
	
	public static void registerBlockRenderer()
	{
		RegisterHelper.registerBlockRenderer(oreKryptonite);
		RegisterHelper.registerBlockRenderer(kryptoniteBlock);
		RegisterHelper.registerBlockRenderer(block_of_gunpowder);
		RegisterHelper.registerBlockRenderer(block_of_sugar);
		RegisterHelper.registerBlockRenderer(withermoriumOre);
		RegisterHelper.registerBlockRenderer(withermoriumBlock);
		RegisterHelper.registerBlockRenderer(pureWitherBlock);
		RegisterHelper.registerBlockRenderer(metalGemBlock);
		RegisterHelper.registerBlockRenderer(faerumBlock);
		RegisterHelper.registerBlockRenderer(ceruliumBlock);
		RegisterHelper.registerBlockRenderer(superMetalGemBlock);
		RegisterHelper.registerBlockRenderer(magmaCreamBlock);
		RegisterHelper.registerBlockRenderer(packedCobble);
		RegisterHelper.registerBlockRenderer(superPackedCobble);
		RegisterHelper.registerBlockRenderer(ultraPackedCobble);
		RegisterHelper.registerBlockRenderer(packedNetherrack);
		RegisterHelper.registerBlockRenderer(superPackedNetherrack);
		RegisterHelper.registerBlockRenderer(ultraPackedNetherrack);
		RegisterHelper.registerBlockRenderer(netherroniumOre);
	}
}
