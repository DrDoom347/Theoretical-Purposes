package com.gmail.drdoom347.theop.init;

import com.gmail.drdoom347.theop.helpers.RegisterHelper;
import com.gmail.drdoom347.theop.items.ItemTheopBasicItem;
import com.gmail.drdoom347.theop.items.ItemTheopFood;
import com.gmail.drdoom347.theop.items.ItemTheopIngot;
import com.gmail.drdoom347.theop.items.ItemTheopLightning;
import com.gmail.drdoom347.theop.items.ItemTheopStudCharNetherStar;

import net.minecraft.item.Item;

public class TheopItems
{
	public static Item kryptoniteIngot = new ItemTheopIngot().setRegistryName("kryptoniteIngot");
	public static Item rawLightning = new ItemTheopLightning().setRegistryName("rawLightning");
	public static Item refinedLightning = new ItemTheopLightning().setRegistryName("refinedLightning");
	public static Item purifiedLightning = new ItemTheopLightning().setRegistryName("purifiedLightning");
	public static Item chargedNetherStar = new ItemTheopStudCharNetherStar().setRegistryName("chargedNetherStar");
	public static Item studdedNetherStar = new ItemTheopStudCharNetherStar().setRegistryName("studdedNetherStar");
	public static Item studCharNetherStar = new ItemTheopStudCharNetherStar().setRegistryName("studCharNetherStar");
	public static Item withermoriumIngot = new ItemTheopIngot().setRegistryName("withermoriumIngot");
	public static Item pureWithermoriumIngot = new ItemTheopIngot().setRegistryName("pureWithermoriumIngot");
	public static Item cinnamon = new ItemTheopBasicItem().setRegistryName("cinnamon");
	public static Item holyWater = new ItemTheopBasicItem().setRegistryName("holyWater");
	public static Item metalGem = new ItemTheopBasicItem().setRegistryName("metalGem");
	public static Item faerumIngot = new ItemTheopIngot().setRegistryName("faerumIngot");
	public static Item cinnamonRoll = new ItemTheopFood("cinnamonRoll", 7, 1.42857F, true).setRegistryName("cinnamonRoll");
	public static Item cinnamonSugar = new ItemTheopBasicItem().setRegistryName("cinnamonSugar");
	public static Item icingBucket = new ItemTheopBasicItem().setRegistryName("icingBucket");
	public static Item topaz = new ItemTheopBasicItem().setRegistryName("topaz");
	public static Item peridot = new ItemTheopBasicItem().setRegistryName("peridot");
	public static Item redstoneChunk = new ItemTheopBasicItem().setRegistryName("redstoneChunk");
	public static Item lapisChunk = new ItemTheopBasicItem().setRegistryName("lapisChunk");
	public static Item basicMultiGem = new ItemTheopBasicItem().setRegistryName("basicMultiGem");
	public static Item enhancedMultiGem = new ItemTheopBasicItem().setRegistryName("enhancedMultiGem");
	public static Item eliteMultiGem = new ItemTheopBasicItem().setRegistryName("eliteMultiGem");
	public static Item witherFragment = new ItemTheopBasicItem().setRegistryName("witherFragment");
	public static Item witherShard = new ItemTheopBasicItem().setRegistryName("witherShard");
	public static Item witherCrystal = new ItemTheopBasicItem().setRegistryName("witherCrystal");
	public static Item ceruliumGem = new ItemTheopBasicItem().setRegistryName("ceruliumGem");
	public static Item superMetalGem = new ItemTheopIngot().setRegistryName("superMetalGem");
	public static Item magmaCreamNugget = new ItemTheopBasicItem().setRegistryName("magmaCreamNugget");
	public static Item witherDust = new ItemTheopBasicItem().setRegistryName("witherDust");
	public static Item slimeNugget = new ItemTheopBasicItem().setRegistryName("slimeNugget");
	public static Item netherroniumIngot = new ItemTheopIngot().setRegistryName("netherroniumIngot");
	
	public static void registerItems()
	{
		RegisterHelper.registerItem(kryptoniteIngot);
		RegisterHelper.registerItem(rawLightning);
		RegisterHelper.registerItem(refinedLightning);
		RegisterHelper.registerItem(purifiedLightning);
		RegisterHelper.registerItem(chargedNetherStar);
		RegisterHelper.registerItem(studdedNetherStar);
		RegisterHelper.registerItem(studCharNetherStar);
		RegisterHelper.registerItem(withermoriumIngot);
		RegisterHelper.registerItem(pureWithermoriumIngot);
		RegisterHelper.registerItem(cinnamon);
		RegisterHelper.registerItem(holyWater);
		RegisterHelper.registerItem(metalGem);
		RegisterHelper.registerItem(faerumIngot);
		RegisterHelper.registerItem(cinnamonRoll);
		RegisterHelper.registerItem(cinnamonSugar);
		RegisterHelper.registerItem(icingBucket);
		RegisterHelper.registerItem(topaz);
		RegisterHelper.registerItem(peridot);
		RegisterHelper.registerItem(redstoneChunk);
		RegisterHelper.registerItem(lapisChunk);
		RegisterHelper.registerItem(basicMultiGem);
		RegisterHelper.registerItem(enhancedMultiGem);
		RegisterHelper.registerItem(eliteMultiGem);
		RegisterHelper.registerItem(witherFragment);
		RegisterHelper.registerItem(witherShard);
		RegisterHelper.registerItem(witherCrystal);
		RegisterHelper.registerItem(ceruliumGem);
		RegisterHelper.registerItem(superMetalGem);
		RegisterHelper.registerItem(magmaCreamNugget);
		RegisterHelper.registerItem(witherDust);
		RegisterHelper.registerItem(slimeNugget);
		RegisterHelper.registerItem(netherroniumIngot);
	}
	
	public static void registerItemRenderer()
	{
		RegisterHelper.registerItemRenderer(kryptoniteIngot);
		RegisterHelper.registerItemRenderer(rawLightning);
		RegisterHelper.registerItemRenderer(refinedLightning);
		RegisterHelper.registerItemRenderer(purifiedLightning);
		RegisterHelper.registerItemRenderer(chargedNetherStar);
		RegisterHelper.registerItemRenderer(studdedNetherStar);
		RegisterHelper.registerItemRenderer(studCharNetherStar);
		RegisterHelper.registerItemRenderer(withermoriumIngot);
		RegisterHelper.registerItemRenderer(pureWithermoriumIngot);
		RegisterHelper.registerItemRenderer(cinnamon);
		RegisterHelper.registerItemRenderer(holyWater);
		RegisterHelper.registerItemRenderer(metalGem);
		RegisterHelper.registerItemRenderer(faerumIngot);
		RegisterHelper.registerItemRenderer(cinnamonRoll);
		RegisterHelper.registerItemRenderer(cinnamonSugar);
		RegisterHelper.registerItemRenderer(icingBucket);
		RegisterHelper.registerItemRenderer(topaz);
		RegisterHelper.registerItemRenderer(peridot);
		RegisterHelper.registerItemRenderer(redstoneChunk);
		RegisterHelper.registerItemRenderer(lapisChunk);
		RegisterHelper.registerItemRenderer(basicMultiGem);
		RegisterHelper.registerItemRenderer(enhancedMultiGem);
		RegisterHelper.registerItemRenderer(eliteMultiGem);
		RegisterHelper.registerItemRenderer(witherFragment);
		RegisterHelper.registerItemRenderer(witherShard);
		RegisterHelper.registerItemRenderer(witherCrystal);
		RegisterHelper.registerItemRenderer(ceruliumGem);
		RegisterHelper.registerItemRenderer(superMetalGem);
		RegisterHelper.registerItemRenderer(magmaCreamNugget);
		RegisterHelper.registerItemRenderer(witherDust);
		RegisterHelper.registerItemRenderer(slimeNugget);
		RegisterHelper.registerItemRenderer(netherroniumIngot);
	}
}
