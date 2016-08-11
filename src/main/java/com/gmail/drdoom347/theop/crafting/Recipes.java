package com.gmail.drdoom347.theop.crafting;

import com.gmail.drdoom347.theop.init.TheopArmory;
import com.gmail.drdoom347.theop.init.TheopBlocks;
import com.gmail.drdoom347.theop.init.TheopItems;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Recipes
{

	public static void addSmelting()
	{
		GameRegistry.addSmelting(TheopBlocks.oreKryptonite, new ItemStack(TheopItems.kryptoniteIngot), 101.9F);
		GameRegistry.addSmelting(TheopBlocks.withermoriumOre, new ItemStack(TheopItems.withermoriumIngot), 300.0F);
		GameRegistry.addSmelting(Items.GHAST_TEAR, new ItemStack(TheopItems.rawLightning), 55.7F);
		GameRegistry.addSmelting(TheopBlocks.netherroniumOre, new ItemStack(TheopItems.netherroniumIngot), 347.0F);
	}
	
	public static void addShapedRecipe()
	{
		//** Kryptonite Stuff **//
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.kryptoniteSword), new Object[] {"A", "A", "B", 'A', TheopItems.kryptoniteIngot, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.kryptonitePick), new Object[] {"AAA", " B ", " B ", 'A', TheopItems.kryptoniteIngot, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.kryptoniteShovel), new Object[] {"A", "B", "B", 'A', TheopItems.kryptoniteIngot, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.kryptoniteAxe), new Object[] {"AA", "BA", "B ", 'A', TheopItems.kryptoniteIngot, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.kryptoniteHoe), new Object[] {" AA", " B ", " B ", 'A', TheopItems.kryptoniteIngot, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.kryptoniteHelm), new Object[] {"AAA", "A A", 'A', TheopItems.kryptoniteIngot});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.kryptonitePlate), new Object[] {"A A", "AAA", "AAA", 'A', TheopItems.kryptoniteIngot});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.kryptonitePants), new Object[] {"AAA", "A A", "A A", 'A', TheopItems.kryptoniteIngot});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.kryptoniteBoots), new Object[] {"A A", "A A", 'A', TheopItems.kryptoniteIngot});
		GameRegistry.addShapedRecipe(new ItemStack(TheopBlocks.kryptoniteBlock), new Object[] {"AAA", "AAA", "AAA", 'A', TheopItems.kryptoniteIngot});
		//** Miscellaneous stuff **//
		GameRegistry.addShapedRecipe(new ItemStack(TheopBlocks.block_of_gunpowder), new Object[] {"AAA", "AAA", "AAA", 'A', Items.GUNPOWDER});
		GameRegistry.addShapedRecipe(new ItemStack(TheopBlocks.block_of_sugar), new Object[] {"AAA", "AAA", "AAA", 'A', Items.SUGAR});
		GameRegistry.addShapedRecipe(new ItemStack(TheopItems.refinedLightning), new Object[] {" A ", "ABA", " A ", 'A', TheopItems.rawLightning, 'B', Blocks.QUARTZ_BLOCK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopItems.chargedNetherStar), new Object[] {" A ", "ABA", " A ", 'A', TheopItems.refinedLightning, 'B', Items.NETHER_STAR});
		GameRegistry.addShapedRecipe(new ItemStack(TheopItems.studdedNetherStar), new Object[] {" A ", "ABA", " A ", 'A', TheopItems.kryptoniteIngot, 'B', Items.NETHER_STAR});
		GameRegistry.addShapedRecipe(new ItemStack(TheopItems.studCharNetherStar), new Object[] {" A ", "ABA", " A ", 'A', TheopItems.kryptoniteIngot, 'B', TheopItems.chargedNetherStar});
		GameRegistry.addShapedRecipe(new ItemStack(TheopItems.studCharNetherStar), new Object[] {" A ", "ABA", " A ", 'A', TheopItems.refinedLightning, 'B', TheopItems.studdedNetherStar});
		GameRegistry.addShapedRecipe(new ItemStack(TheopBlocks.withermoriumOre), new Object[] {"ABA", "BAB", "ABA", 'A', TheopItems.studCharNetherStar, 'B', new ItemStack(Items.SKULL, 1, 1)});
		GameRegistry.addShapedRecipe(new ItemStack(TheopItems.superMetalGem), new Object[] {" A ", "BCB", " A ", 'A', Blocks.DIAMOND_BLOCK, 'B', Blocks.IRON_BLOCK, 'C', Blocks.EMERALD_BLOCK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopBlocks.oreKryptonite), new Object[] {"ABA", "BAB", "ABA", 'A', TheopItems.superMetalGem, 'B', TheopBlocks.ultraPackedCobble});
		GameRegistry.addShapedRecipe(new ItemStack(TheopItems.cinnamon,2), new Object[] {"AA", "AA", 'A', new ItemStack(Blocks.LOG, 1, 2)});
		GameRegistry.addShapedRecipe(new ItemStack(TheopItems.cinnamonSugar,2), new Object[] {"AB", "BA", 'A', TheopItems.cinnamon, 'B', Items.SUGAR});
		GameRegistry.addShapedRecipe(new ItemStack(TheopItems.cinnamonSugar,2), new Object[] {"BA", "AB", 'A', TheopItems.cinnamon, 'B', Items.SUGAR});
		GameRegistry.addShapedRecipe(new ItemStack(TheopItems.cinnamonRoll,3), new Object[] {"AAA", "BBB", "CCC", 'A', TheopItems.icingBucket, 'B', TheopItems.cinnamonSugar, 'C', Items.BREAD});
		GameRegistry.addShapedRecipe(new ItemStack(TheopItems.purifiedLightning), new Object[] {"BBB", "BAB", "BBB", 'A', TheopItems.refinedLightning, 'B', TheopItems.holyWater});
		GameRegistry.addShapedRecipe(new ItemStack(TheopItems.blitzLightning), new Object[] {"AAA", "AAA", "AAA", 'A', TheopItems.purifiedLightning});
		GameRegistry.addShapedRecipe(new ItemStack(TheopItems.refinedBlitzLightning), new Object[] {" A ", "ABA", " A ", 'A', TheopItems.blitzLightning, 'B', Blocks.QUARTZ_BLOCK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopItems.pureRefinedBlitzLightning), new Object[] {"AAA", "ABA", "AAA", 'A', TheopItems.holyWater, 'B', TheopItems.refinedBlitzLightning});
		GameRegistry.addShapedRecipe(new ItemStack(TheopItems.witherLightning), new Object[] {"AAA", "AAA", "AAA", 'A', TheopItems.pureRefinedBlitzLightning});
		//** Packed Blocks **//
		GameRegistry.addShapedRecipe(new ItemStack(TheopBlocks.packedCobble), new Object[] {"AAA", "AAA", "AAA", 'A', Blocks.COBBLESTONE});
		GameRegistry.addShapedRecipe(new ItemStack(TheopBlocks.superPackedCobble), new Object[] {"AAA", "AAA", "AAA", 'A', TheopBlocks.packedCobble});
		GameRegistry.addShapedRecipe(new ItemStack(TheopBlocks.ultraPackedCobble), new Object[] {"AAA", "AAA", "AAA", 'A', TheopBlocks.superPackedCobble});
		GameRegistry.addShapedRecipe(new ItemStack(TheopBlocks.packedNetherrack), new Object[] {"AAA", "AAA", "AAA", 'A', Blocks.NETHERRACK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopBlocks.superPackedNetherrack), new Object[] {"AAA", "AAA", "AAA", 'A', TheopBlocks.packedNetherrack});
		GameRegistry.addShapedRecipe(new ItemStack(TheopBlocks.ultraPackedNetherrack), new Object[] {"AAA", "AAA", "AAA", 'A', TheopBlocks.superPackedNetherrack});
		GameRegistry.addShapedRecipe(new ItemStack(Blocks.PACKED_ICE), new Object[] {"AAA", "AAA", "AAA", 'A', Blocks.ICE});
		//** Netherronium Crafting Path **//
		GameRegistry.addShapedRecipe(new ItemStack(Items.SLIME_BALL), new Object[] {"AAA", "AAA", "AAA", 'A', TheopItems.slimeNugget});
		GameRegistry.addShapedRecipe(new ItemStack(Items.MAGMA_CREAM), new Object[] {"AAA", "AAA", "AAA", 'A', TheopItems.magmaCreamNugget});
		GameRegistry.addShapedRecipe(new ItemStack(TheopBlocks.magmaCreamBlock), new Object[] {"AAA", "AAA", "AAA", 'A', Items.MAGMA_CREAM});
		GameRegistry.addShapedRecipe(new ItemStack(TheopItems.topaz), new Object[] {" A ", "BCB", " A ", 'A', Items.GLOWSTONE_DUST, 'B', new ItemStack(Items.DYE, 1, 11), 'C', Items.DIAMOND});
		GameRegistry.addShapedRecipe(new ItemStack(TheopItems.peridot), new Object[] {" A ", "BCB", " A ", 'A', Items.ENDER_PEARL, 'B', new ItemStack(Items.DYE, 1, 2), 'C', Items.EMERALD});
		GameRegistry.addShapedRecipe(new ItemStack(TheopItems.redstoneChunk), new Object[] {"AA", "AA", 'A', new ItemStack(Items.REDSTONE)});
		GameRegistry.addShapedRecipe(new ItemStack(TheopItems.lapisChunk), new Object[] {"AA", "AA", 'A', new ItemStack(Items.DYE, 1, 4)});
		GameRegistry.addShapedRecipe(new ItemStack(TheopItems.enhancedMultiGem), new Object[] {"BAB", "ACA", "BAB", 'A', TheopItems.basicMultiGem, 'B', Blocks.QUARTZ_BLOCK, 'C', Items.SLIME_BALL});
		GameRegistry.addShapedRecipe(new ItemStack(TheopItems.eliteMultiGem), new Object[] {"BAB", "ACA", "BAB", 'A', TheopItems.enhancedMultiGem, 'B', Blocks.GLOWSTONE, 'C', Blocks.SLIME_BLOCK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopItems.witherFragment), new Object[] {"BAB", "ACA", "BAB", 'A', TheopItems.eliteMultiGem, 'B', TheopItems.witherDust, 'C', TheopItems.magmaCreamNugget});
		GameRegistry.addShapedRecipe(new ItemStack(TheopItems.witherShard), new Object[] {"BAB", "ACA", "BAB", 'A', TheopItems.witherFragment, 'B', new ItemStack(Items.SKULL, 1, 1), 'C', Items.MAGMA_CREAM});
		GameRegistry.addShapedRecipe(new ItemStack(TheopItems.witherCrystal), new Object[] {"BAB", "ACA", "BAB", 'A', TheopItems.witherShard, 'B', Items.NETHER_STAR, 'C', TheopBlocks.magmaCreamBlock});
		GameRegistry.addShapedRecipe(new ItemStack(TheopBlocks.netherroniumOre), new Object[] {"ABA", "BAB", "ABA", 'A', TheopItems.witherCrystal, 'B', TheopBlocks.ultraPackedNetherrack});
		//** Netherronium Stuff **//
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.netherSword), new Object[] {"A", "A", "B", 'A', TheopItems.netherroniumIngot, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.netherPick), new Object[] {"AAA", " B ", " B ", 'A', TheopItems.netherroniumIngot, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.netherShovel), new Object[] {"A", "B", "B", 'A', TheopItems.netherroniumIngot, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.netherAxe), new Object[] {"AA", "BA", "B ", 'A', TheopItems.netherroniumIngot, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.netherHoe), new Object[] {"AA", "B ", "B ", 'A', TheopItems.netherroniumIngot, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.netherHelm), new Object[] {"AAA", "A A", 'A', TheopItems.netherroniumIngot});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.netherPlate), new Object[] {"A A", "AAA", "AAA", 'A', TheopItems.netherroniumIngot});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.netherPants), new Object[] {"AAA", "A A", "A A", 'A', TheopItems.netherroniumIngot});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.netherBoots), new Object[] {"A A", "A A", 'A', TheopItems.netherroniumIngot});
		//** Charged Netherronium Stuff **//
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.chargedNetherSword), new Object[] {"A", "A", "B", 'A', TheopItems.chargedNetherIngot, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.chargedNetherPick), new Object[] {"AAA", " B ", " B ", 'A', TheopItems.chargedNetherIngot, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.chargedNetherShovel), new Object[] {"A", "B", "B", 'A', TheopItems.chargedNetherIngot, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.chargedNetherAxe), new Object[] {"AA", "BA", "B ", 'A', TheopItems.chargedNetherIngot, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.chargedNetherHoe), new Object[] {"AA", "B ", "B ", 'A', TheopItems.chargedNetherIngot, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.chargedNetherHelm), new Object[] {"AAA", "A A", 'A', TheopItems.chargedNetherIngot});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.chargedNetherPlate), new Object[] {"A A", "AAA", "AAA", 'A', TheopItems.chargedNetherIngot});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.chargedNetherPants), new Object[] {"AAA", "A A", "A A", 'A', TheopItems.chargedNetherIngot});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.chargedNetherBoots), new Object[] {"A A", "A A", 'A', TheopItems.chargedNetherIngot});
		//** Charged out of Regular **//
		GameRegistry.addShapedRecipe(new ItemStack(TheopItems.chargedNetherIngot), new Object[] {"AAA", "ABA", "AAA", 'A', TheopItems.witherLightning, 'B', TheopItems.netherroniumIngot});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.chargedNetherSword), new Object[] {"AAA", "ABA", "AAA", 'A', TheopItems.witherLightning, 'B', TheopArmory.netherSword});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.chargedNetherPick), new Object[] {"AAA", "ABA", "AAA", 'A', TheopItems.witherLightning, 'B', TheopArmory.netherPick});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.chargedNetherShovel), new Object[] {"AAA", "ABA", "AAA", 'A', TheopItems.witherLightning, 'B', TheopArmory.netherShovel});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.chargedNetherAxe), new Object[] {"AAA", "ABA", "AAA", 'A', TheopItems.witherLightning, 'B', TheopArmory.netherAxe});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.chargedNetherHoe), new Object[] {"AAA", "ABA", "AAA", 'A', TheopItems.witherLightning, 'B', TheopArmory.netherHoe});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.chargedNetherHelm), new Object[] {"AAA", "ABA", "AAA", 'A', TheopItems.witherLightning, 'B', TheopArmory.netherHelm});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.chargedNetherPlate), new Object[] {"AAA", "ABA", "AAA", 'A', TheopItems.witherLightning, 'B', TheopArmory.netherPlate});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.chargedNetherPants), new Object[] {"AAA", "ABA", "AAA", 'A', TheopItems.witherLightning, 'B', TheopArmory.netherPants});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.chargedNetherBoots), new Object[] {"AAA", "ABA", "AAA", 'A', TheopItems.witherLightning, 'B', TheopArmory.netherBoots});	
		//** Purified Withermorium Stuff **//
		GameRegistry.addShapedRecipe(new ItemStack(TheopItems.pureWithermoriumIngot), new Object[] {"AAA", "ABA", "AAA", 'A', TheopItems.holyWater, 'B', TheopItems.withermoriumIngot});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.pureWitherSword), new Object[] {"A", "A", "B", 'A', TheopItems.pureWithermoriumIngot, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.pureWitherPick), new Object[] {"AAA", " B ", " B ", 'A', TheopItems.pureWithermoriumIngot, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.pureWitherShovel), new Object[] {"A", "B", "B", 'A', TheopItems.pureWithermoriumIngot, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.pureWitherAxe), new Object[] {"AA", "BA", "B ", 'A', TheopItems.pureWithermoriumIngot, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.pureWitherHoe), new Object[] {"AA", "B ", "B ", 'A', TheopItems.pureWithermoriumIngot, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.pureWitherHelm), new Object[] {"AAA", "A A", 'A', TheopItems.pureWithermoriumIngot});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.pureWitherPlate), new Object[] {"A A", "AAA", "AAA", 'A', TheopItems.pureWithermoriumIngot});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.pureWitherPants), new Object[] {"AAA", "A A", "A A", 'A', TheopItems.pureWithermoriumIngot});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.pureWitherBoots), new Object[] {"A A", "A A", 'A', TheopItems.pureWithermoriumIngot});
		GameRegistry.addShapedRecipe(new ItemStack(TheopBlocks.pureWitherBlock), new Object[] {"AAA", "AAA", "AAA", 'A', TheopItems.pureWithermoriumIngot});
		//** Pure out of Regular **//
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.pureWitherSword), new Object[] {"AAA", "ABA", "AAA", 'A', TheopItems.holyWater, 'B', TheopArmory.witherSword});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.pureWitherPick), new Object[] {"AAA", "ABA", "AAA", 'A', TheopItems.holyWater, 'B', TheopArmory.witherPick});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.pureWitherShovel), new Object[] {"AAA", "ABA", "AAA", 'A', TheopItems.holyWater, 'B', TheopArmory.witherShovel});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.pureWitherAxe), new Object[] {"AAA", "ABA", "AAA", 'A', TheopItems.holyWater, 'B', TheopArmory.witherAxe});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.pureWitherHoe), new Object[] {"AAA", "ABA", "AAA", 'A', TheopItems.holyWater, 'B', TheopArmory.witherHoe});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.pureWitherHelm), new Object[] {"AAA", "ABA", "AAA", 'A', TheopItems.holyWater, 'B', TheopArmory.witherHelm});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.pureWitherPlate), new Object[] {"AAA", "ABA", "AAA", 'A', TheopItems.holyWater, 'B', TheopArmory.witherPlate});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.pureWitherPants), new Object[] {"AAA", "ABA", "AAA", 'A', TheopItems.holyWater, 'B', TheopArmory.witherPants});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.pureWitherBoots), new Object[] {"AAA", "ABA", "AAA", 'A', TheopItems.holyWater, 'B', TheopArmory.witherBoots});	
		//** Regular Withermorium Stuff **//
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.witherSword), new Object[] {"A", "A", "B", 'A', TheopItems.withermoriumIngot, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.witherPick), new Object[] {"AAA", " B ", " B ", 'A', TheopItems.withermoriumIngot, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.witherShovel), new Object[] {"A", "B", "B", 'A', TheopItems.withermoriumIngot, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.witherAxe), new Object[] {" AA", " BA", " B ", 'A', TheopItems.withermoriumIngot, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.witherHoe), new Object[] {" AA", " B ", " B ", 'A', TheopItems.withermoriumIngot, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.witherHelm), new Object[] {"AAA", "A A", 'A', TheopItems.withermoriumIngot});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.witherPlate), new Object[] {"A A", "AAA", "AAA", 'A', TheopItems.withermoriumIngot});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.witherPants), new Object[] {"AAA", "A A", "A A", 'A', TheopItems.withermoriumIngot});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.witherBoots), new Object[] {"A A", "A A", 'A', TheopItems.withermoriumIngot});
		GameRegistry.addShapedRecipe(new ItemStack(TheopBlocks.withermoriumBlock), new Object[] {"AAA", "AAA", "AAA", 'A', TheopItems.withermoriumIngot});
		//** MetalGem Stuff **//
		GameRegistry.addShapedRecipe(new ItemStack(TheopItems.metalGem), new Object[] {"ABA", "CDC", "ABA", 'A', Items.IRON_INGOT, 'B', Items.DIAMOND, 'C', Items.GOLD_INGOT, 'D', Items.EMERALD});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.metalGemSword), new Object[] {"A", "A", "B", 'A', TheopItems.metalGem, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.metalGemPick), new Object[] {"AAA", " B ", " B ", 'A', TheopItems.metalGem, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.metalGemShovel), new Object[] {"A", "B", "B", 'A', TheopItems.metalGem, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.metalGemAxe), new Object[] {" AA", " BA", " B ", 'A', TheopItems.metalGem, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.metalGemHoe), new Object[] {" AA", " B ", " B ", 'A', TheopItems.metalGem, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.metalGemHelm), new Object[] {"AAA", "A A", 'A', TheopItems.metalGem});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.metalGemPlate), new Object[] {"A A", "AAA", "AAA", 'A', TheopItems.metalGem});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.metalGemPants), new Object[] {"AAA", "A A", "A A", 'A', TheopItems.metalGem});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.metalGemBoots), new Object[] {"A A", "A A", 'A', TheopItems.metalGem});
		GameRegistry.addShapedRecipe(new ItemStack(TheopBlocks.metalGemBlock), new Object[] {"AAA", "AAA", "AAA", 'A', TheopItems.metalGem});
		//** Faerum Stuff **//
		GameRegistry.addShapedRecipe(new ItemStack(TheopItems.faerumIngot), new Object[] {"ABA", "BCB", "ABA", 'A', Items.GOLD_INGOT, 'B', Items.IRON_INGOT, 'C', Items.LAVA_BUCKET});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.faerumSword), new Object[] {"A", "A", "B", 'A', TheopItems.faerumIngot, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.faerumPick), new Object[] {"AAA", " B ", " B ", 'A', TheopItems.faerumIngot, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.faerumShovel), new Object[] {"A", "B", "B", 'A', TheopItems.faerumIngot, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.faerumAxe), new Object[] {" AA", " BA", " B ", 'A', TheopItems.faerumIngot, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.faerumHoe), new Object[] {" AA", " B ", " B ", 'A', TheopItems.faerumIngot, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.faerumHelm), new Object[] {"AAA", "A A", 'A', TheopItems.faerumIngot});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.faerumPlate), new Object[] {"A A", "AAA", "AAA", 'A', TheopItems.faerumIngot});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.faerumPants), new Object[] {"AAA", "A A", "A A", 'A', TheopItems.faerumIngot});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.faerumBoots), new Object[] {"A A", "A A", 'A', TheopItems.faerumIngot});
		GameRegistry.addShapedRecipe(new ItemStack(TheopBlocks.faerumBlock), new Object[] {"AAA", "AAA", "AAA", 'A', TheopItems.faerumIngot});
		//** Cerulium Stuff **//
		GameRegistry.addShapedRecipe(new ItemStack(TheopItems.ceruliumGem,2), new Object[] {"BA", "AB", 'A', Items.DIAMOND, 'B', Items.EMERALD});
		GameRegistry.addShapedRecipe(new ItemStack(TheopItems.ceruliumGem,2), new Object[] {"AB", "BA", 'A', Items.DIAMOND, 'B', Items.EMERALD});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.ceruliumSword), new Object[] {" A ", " A ", "CBC", 'A', TheopItems.ceruliumGem, 'B', Items.STICK, 'C', Items.GOLD_NUGGET});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.ceruliumPick), new Object[] {"AAA", " B ", "CBC", 'A', TheopItems.ceruliumGem, 'B', Items.STICK, 'C', Items.GOLD_NUGGET});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.ceruliumShovel), new Object[] {" A ", " B ", "CBC", 'A', TheopItems.ceruliumGem, 'B', Items.STICK, 'C', Items.GOLD_NUGGET});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.ceruliumAxe), new Object[] {" AA", " BA", "CBC", 'A', TheopItems.ceruliumGem, 'B', Items.STICK, 'C', Items.GOLD_NUGGET});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.ceruliumHoe), new Object[] {" AA", " B ", "CBC", 'A', TheopItems.ceruliumGem, 'B', Items.STICK, 'C', Items.GOLD_NUGGET});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.ceruliumHelm), new Object[] {"AAA", "A A", 'A', TheopItems.ceruliumGem});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.ceruliumPlate), new Object[] {"A A", "AAA", "AAA", 'A', TheopItems.ceruliumGem});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.ceruliumPants), new Object[] {"AAA", "A A", "A A", 'A', TheopItems.ceruliumGem});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.ceruliumBoots), new Object[] {"A A", "A A", 'A', TheopItems.ceruliumGem});
		GameRegistry.addShapedRecipe(new ItemStack(TheopBlocks.ceruliumBlock), new Object[] {"AAA", "AAA", "AAA", 'A', TheopItems.ceruliumGem});
		//** SuperMetalGem Stuff **//
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.superMetalGemSword), new Object[] {"A", "A", "B", 'A', TheopItems.superMetalGem, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.superMetalGemPick), new Object[] {"AAA", " B ", " B ", 'A', TheopItems.superMetalGem, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.superMetalGemShovel), new Object[] {"A", "B", "B", 'A', TheopItems.superMetalGem, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.superMetalGemAxe), new Object[] {" AA", " BA", " B ", 'A', TheopItems.superMetalGem, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.superMetalGemHoe), new Object[] {" AA", " B ", " B ", 'A', TheopItems.superMetalGem, 'B', Items.STICK});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.superMetalGemHelm), new Object[] {"AAA", "A A", 'A', TheopItems.superMetalGem});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.superMetalGemPlate), new Object[] {"A A", "AAA", "AAA", 'A', TheopItems.superMetalGem});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.superMetalGemPants), new Object[] {"AAA", "A A", "A A", 'A', TheopItems.superMetalGem});
		GameRegistry.addShapedRecipe(new ItemStack(TheopArmory.superMetalGemBoots), new Object[] {"A A", "A A", 'A', TheopItems.superMetalGem});
		GameRegistry.addShapedRecipe(new ItemStack(TheopBlocks.superMetalGemBlock), new Object[] {"AAA", "AAA", "AAA", 'A', TheopItems.superMetalGem});

	}
	
	public static void addShapelessRecipe()
	{
		//** Crafting blocks into Ingot's **//
		GameRegistry.addShapelessRecipe(new ItemStack(TheopItems.kryptoniteIngot,9), new ItemStack(TheopBlocks.kryptoniteBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(TheopItems.withermoriumIngot,9), new ItemStack(TheopBlocks.withermoriumBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(TheopItems.pureWithermoriumIngot,9), new ItemStack(TheopBlocks.pureWitherBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(TheopItems.metalGem,9), new ItemStack(TheopBlocks.metalGemBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(TheopItems.faerumIngot,9), new ItemStack(TheopBlocks.faerumBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.SUGAR,9), new ItemStack(TheopBlocks.block_of_sugar));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.GUNPOWDER,9), new ItemStack(TheopBlocks.block_of_gunpowder));
		GameRegistry.addShapelessRecipe(new ItemStack(TheopItems.superMetalGem,9), new ItemStack(TheopBlocks.superMetalGemBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(TheopItems.ceruliumGem,9), new ItemStack(TheopBlocks.ceruliumBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(TheopItems.magmaCreamNugget,9), new ItemStack(Items.MAGMA_CREAM));
		GameRegistry.addShapelessRecipe(new ItemStack(Items.MAGMA_CREAM,9), new ItemStack(TheopBlocks.magmaCreamBlock));
		GameRegistry.addShapelessRecipe(new ItemStack(TheopItems.witherDust,9), new ItemStack(Items.SKULL, 1, 1));
		GameRegistry.addShapelessRecipe(new ItemStack(TheopItems.slimeNugget,9), new ItemStack(Items.SLIME_BALL));
		GameRegistry.addShapelessRecipe(new ItemStack(TheopBlocks.superPackedCobble,9), new ItemStack(TheopBlocks.ultraPackedCobble));
		GameRegistry.addShapelessRecipe(new ItemStack(TheopBlocks.packedCobble,9), new ItemStack(TheopBlocks.superPackedCobble));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.COBBLESTONE,9), new ItemStack(TheopBlocks.packedCobble));
		GameRegistry.addShapelessRecipe(new ItemStack(TheopBlocks.superPackedNetherrack,9), new ItemStack(TheopBlocks.ultraPackedNetherrack));
		GameRegistry.addShapelessRecipe(new ItemStack(TheopBlocks.packedNetherrack,9), new ItemStack(TheopBlocks.superPackedNetherrack));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.NETHERRACK,9), new ItemStack(TheopBlocks.packedNetherrack));
		GameRegistry.addShapelessRecipe(new ItemStack(Blocks.ICE,6), new ItemStack(Blocks.PACKED_ICE));
		//** Custom Flint & Steels Shapeless**//
		GameRegistry.addShapelessRecipe(new ItemStack(TheopArmory.flintAndMetalGem), new ItemStack(Items.FLINT), new ItemStack(TheopItems.metalGem));
		//** Miscellaneous Shapeless **//
		GameRegistry.addShapelessRecipe(new ItemStack(TheopItems.basicMultiGem), new ItemStack(TheopItems.peridot), new ItemStack(TheopItems.lapisChunk), new ItemStack(TheopItems.redstoneChunk), new ItemStack(TheopItems.topaz), new ItemStack(TheopItems.slimeNugget));
		GameRegistry.addShapelessRecipe(new ItemStack(TheopItems.icingBucket), new ItemStack(Items.SUGAR), new ItemStack(Items.MILK_BUCKET));
		GameRegistry.addShapelessRecipe(new ItemStack(TheopItems.holyWater), new ItemStack (Items.SUGAR,2), new ItemStack(Items.GUNPOWDER,2), new ItemStack(TheopItems.cinnamon,2), new ItemStack(Items.DIAMOND,2), new ItemStack(Items.DRAGON_BREATH));
	}
	
}
