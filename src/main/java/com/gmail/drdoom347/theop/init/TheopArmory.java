package com.gmail.drdoom347.theop.init;

import com.gmail.drdoom347.theop.helpers.RegisterHelper;
import com.gmail.drdoom347.theop.items.ItemAxeCustom;
import com.gmail.drdoom347.theop.items.ItemTheopArmor;
import com.gmail.drdoom347.theop.items.ItemTheopHoe;
import com.gmail.drdoom347.theop.items.ItemTheopPickaxe;
import com.gmail.drdoom347.theop.items.ItemTheopShovel;
import com.gmail.drdoom347.theop.items.ItemTheopSword;
import com.gmail.drdoom347.theop.items.ItemTheopUniversium;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class TheopArmory
{
	//** Adding Tool Materials **//
	static Item.ToolMaterial METALGEM = EnumHelper.addToolMaterial("METALGEM", 4, 2048, 9.0F, 5.0F, 14);
	static Item.ToolMaterial FAERUM = EnumHelper.addToolMaterial("FAERUM", 5, 3072, 10.0F, 6.0F, 16);
	static Item.ToolMaterial CERULIUM = EnumHelper.addToolMaterial("CERULIUM", 6, 4096, 11.0F, 8.0F, 18);
	static Item.ToolMaterial SUPERMETALGEM = EnumHelper.addToolMaterial("SUPERMETALGEM", 7, 6144, 12.0F, 11.0F, 23);
	static Item.ToolMaterial KRYPTONITE = EnumHelper.addToolMaterial("KRYPTONITE", 8, 8192, 13.0F, 13.0F, 0);
	static Item.ToolMaterial WITHERMORIUM = EnumHelper.addToolMaterial("WITHERMORIUM", 9, 49152, 14.0F, 20.0F, 0);
	static Item.ToolMaterial PUREWITHERMORIUM = EnumHelper.addToolMaterial("PUREWITHERMORIUM", 10, 65536, 15.0F, 26.0F, 0);
	static Item.ToolMaterial NETHERRONIUM = EnumHelper.addToolMaterial("NETHERRONIUM", 11, 131072, 16.0F, 32.0F, 0);
	static Item.ToolMaterial CHARGEDNETHERRONIUM = EnumHelper.addToolMaterial("CHARGEDNETHERRONIUM", 12, 262144, 17.0F, 35.0F, 0);
	static Item.ToolMaterial ULTIMATIUM = EnumHelper.addToolMaterial("ULTIMATIUM", 13, -1, 18.0F, 37.0F, 0);
	static Item.ToolMaterial VOIDULTIMATIUM = EnumHelper.addToolMaterial("VOIDULTIMATIUM", 14, -1, 20.0F, 42.0F, 23);
	// THE UNIVERSIUM
	static Item.ToolMaterial UNIVERSIUM = EnumHelper.addToolMaterial("UNIVERSIUM", 15, -1, 42.0F, 50.0F, 23);
	//** Adding Armor Materials **//
	static ArmorMaterial AMETALGEM = EnumHelper.addArmorMaterial("AMETALGEM", "theop:metalgem", 200, new int[]{5, 8, 7, 4}, 14, null, 3.0F);
	static ArmorMaterial AFAERUM = EnumHelper.addArmorMaterial("AFAERUM", "theop:faerum", 225, new int[]{5, 8, 7, 4}, 16, null, 4.0F);
	static ArmorMaterial ACERULIUM = EnumHelper.addArmorMaterial("ACERULIUM", "theop:cerulium", 250, new int[]{5, 8, 7, 4}, 18, null, 5.0F);
	static ArmorMaterial ASUPERMETALGEM = EnumHelper.addArmorMaterial("ASUPERMETALGEM", "theop:supermetalgem", 275, new int[]{5, 8, 7, 4}, 23, null, 6.0F);
	static ArmorMaterial AKRYPTONITE = EnumHelper.addArmorMaterial("AKRYPTONITE", "theop:kryptonite", 300, new int[]{5, 8, 7, 4}, 0, null, 7.0F);
	static ArmorMaterial AWITHERMORIUM = EnumHelper.addArmorMaterial("AWITHERMORIUM", "theop:withermorium", 350, new int[]{5, 8, 7, 4}, 0, null, 8.0F);
	static ArmorMaterial APUREWITHERMORIUM = EnumHelper.addArmorMaterial("APUREWITHERMORIUM", "theop:purifiedwithermorium", 400, new int[]{5, 8, 7, 4}, 0, null, 9.0F);
	static ArmorMaterial ANETHERRONIUM = EnumHelper.addArmorMaterial("ANETHERRONIUM", "theop:netherronium", 450, new int[]{5, 8, 7, 4}, 0, null, 10.0F);
	static ArmorMaterial ACHARGEDNETHERRONIUM = EnumHelper.addArmorMaterial("ACHARGEDNETHERRONIUM", "theop:chargednetherronium", 500, new int[]{5, 8, 7, 4}, 0, null, 11.0F);
	static ArmorMaterial AULTIMATIUM = EnumHelper.addArmorMaterial("AULTMATIUM", "theop:ultimatium", -1, new int[]{5, 8, 7, 4}, 0, null, 12.0F);
	static ArmorMaterial AVOIDULTIMATIUM = EnumHelper.addArmorMaterial("AVOIDULTMATIUM", "theop:voidultimatium", -1, new int[]{5, 8, 7, 4}, 23, null, 13.0F);
	
	//** Adding gear for each material **//
	public static Item metalGemSword = new ItemTheopSword(METALGEM).setRegistryName("metalGemSword");
    public static Item metalGemPick = new ItemTheopPickaxe(METALGEM).setRegistryName("metalGemPick");
    public static Item metalGemShovel = new ItemTheopShovel(METALGEM).setRegistryName("metalGemShovel");
    public static Item metalGemAxe = new ItemAxeCustom(METALGEM).setRegistryName("metalGemAxe");
    public static Item metalGemHoe = new ItemTheopHoe(METALGEM).setRegistryName("metalGemHoe");
    public static Item metalGemHelm = new ItemTheopArmor(AMETALGEM, 1, EntityEquipmentSlot.HEAD, "metalGemHelm");
    public static Item metalGemPlate = new ItemTheopArmor(AMETALGEM, 1, EntityEquipmentSlot.CHEST, "metalGemPlate");
    public static Item metalGemPants = new ItemTheopArmor(AMETALGEM, 2, EntityEquipmentSlot.LEGS, "metalGemPants");
    public static Item metalGemBoots = new ItemTheopArmor(AMETALGEM, 1, EntityEquipmentSlot.FEET, "metalGemBoots");
	
    public static Item faerumSword = new ItemTheopSword(FAERUM).setRegistryName("faerumSword");
    public static Item faerumPick = new ItemTheopPickaxe(FAERUM).setRegistryName("faerumPick");
    public static Item faerumShovel = new ItemTheopShovel(FAERUM).setRegistryName("faerumShovel");
    public static Item faerumAxe = new ItemAxeCustom(FAERUM).setRegistryName("faerumAxe");
    public static Item faerumHoe = new ItemTheopHoe(FAERUM).setRegistryName("faerumHoe");
    public static Item faerumHelm = new ItemTheopArmor(AFAERUM, 1, EntityEquipmentSlot.HEAD, "faerumHelm");
    public static Item faerumPlate = new ItemTheopArmor(AFAERUM, 1, EntityEquipmentSlot.CHEST, "faerumPlate");
    public static Item faerumPants = new ItemTheopArmor(AFAERUM, 2, EntityEquipmentSlot.LEGS, "faerumPants");
    public static Item faerumBoots = new ItemTheopArmor(AFAERUM, 1, EntityEquipmentSlot.FEET, "faerumBoots");
    
    public static Item ceruliumSword = new ItemTheopSword(CERULIUM).setRegistryName("ceruliumSword");
    public static Item ceruliumPick = new ItemTheopPickaxe(CERULIUM).setRegistryName("ceruliumPick");
    public static Item ceruliumShovel = new ItemTheopShovel(CERULIUM).setRegistryName("ceruliumShovel");
    public static Item ceruliumAxe = new ItemAxeCustom(CERULIUM).setRegistryName("ceruliumAxe");
    public static Item ceruliumHoe = new ItemTheopHoe(CERULIUM).setRegistryName("ceruliumHoe");
    public static Item ceruliumHelm = new ItemTheopArmor(ACERULIUM, 1, EntityEquipmentSlot.HEAD, "ceruliumHelm");
    public static Item ceruliumPlate = new ItemTheopArmor(ACERULIUM, 1, EntityEquipmentSlot.CHEST, "ceruliumPlate");
    public static Item ceruliumPants = new ItemTheopArmor(ACERULIUM, 2, EntityEquipmentSlot.LEGS, "ceruliumPants");
    public static Item ceruliumBoots = new ItemTheopArmor(ACERULIUM, 1, EntityEquipmentSlot.FEET, "ceruliumBoots");
    
    public static Item superMetalGemSword = new ItemTheopSword(SUPERMETALGEM).setRegistryName("superMetalGemSword");
    public static Item superMetalGemPick = new ItemTheopPickaxe(SUPERMETALGEM).setRegistryName("superMetalGemPick");
    public static Item superMetalGemShovel = new ItemTheopShovel(SUPERMETALGEM).setRegistryName("superMetalGemShovel");
    public static Item superMetalGemAxe = new ItemAxeCustom(SUPERMETALGEM).setRegistryName("superMetalGemAxe");
    public static Item superMetalGemHoe = new ItemTheopHoe(SUPERMETALGEM).setRegistryName("superMetalGemHoe");
    public static Item superMetalGemHelm = new ItemTheopArmor(ASUPERMETALGEM, 1, EntityEquipmentSlot.HEAD, "superMetalGemHelm");
    public static Item superMetalGemPlate = new ItemTheopArmor(ASUPERMETALGEM, 1, EntityEquipmentSlot.CHEST, "superMetalGemPlate");
    public static Item superMetalGemPants = new ItemTheopArmor(ASUPERMETALGEM, 2, EntityEquipmentSlot.LEGS, "superMetalGemPants");
    public static Item superMetalGemBoots = new ItemTheopArmor(ASUPERMETALGEM, 1, EntityEquipmentSlot.FEET, "superMetalGemBoots");
    
	public static Item kryptoniteSword = new ItemTheopSword(KRYPTONITE).setRegistryName("kryptoniteSword");
    public static Item kryptonitePick = new ItemTheopPickaxe(KRYPTONITE).setRegistryName("kryptonitePick");
    public static Item kryptoniteShovel = new ItemTheopShovel(KRYPTONITE).setRegistryName("kryptoniteShovel");
    public static Item kryptoniteAxe = new ItemAxeCustom(KRYPTONITE).setRegistryName("kryptoniteAxe");
    public static Item kryptoniteHoe = new ItemTheopHoe(KRYPTONITE).setRegistryName("kryptoniteHoe");
    public static Item kryptoniteHelm = new ItemTheopArmor(AKRYPTONITE, 1, EntityEquipmentSlot.HEAD, "kryptoniteHelm");
    public static Item kryptonitePlate = new ItemTheopArmor(AKRYPTONITE, 1, EntityEquipmentSlot.CHEST, "kryptonitePlate");
    public static Item kryptonitePants = new ItemTheopArmor(AKRYPTONITE, 2, EntityEquipmentSlot.LEGS, "kryptonitePants");
    public static Item kryptoniteBoots = new ItemTheopArmor(AKRYPTONITE, 1, EntityEquipmentSlot.FEET, "kryptoniteBoots");
    
    public static Item witherSword = new ItemTheopSword(WITHERMORIUM).setRegistryName("witherSword");
    public static Item witherPick = new ItemTheopPickaxe(WITHERMORIUM).setRegistryName("witherPick");
    public static Item witherShovel = new ItemTheopShovel(WITHERMORIUM).setRegistryName("witherShovel");
    public static Item witherAxe = new ItemAxeCustom(WITHERMORIUM).setRegistryName("witherAxe");
    public static Item witherHoe = new ItemTheopHoe(WITHERMORIUM).setRegistryName("witherHoe");
    public static Item witherHelm = new ItemTheopArmor(AWITHERMORIUM, 1, EntityEquipmentSlot.HEAD, "witherHelm");
    public static Item witherPlate = new ItemTheopArmor(AWITHERMORIUM, 1, EntityEquipmentSlot.CHEST, "witherPlate");
    public static Item witherPants = new ItemTheopArmor(AWITHERMORIUM, 2, EntityEquipmentSlot.LEGS, "witherPants");
    public static Item witherBoots = new ItemTheopArmor(AWITHERMORIUM, 1, EntityEquipmentSlot.FEET, "witherBoots");
    
    public static Item pureWitherSword = new ItemTheopSword(PUREWITHERMORIUM).setRegistryName("pureWitherSword");
    public static Item pureWitherPick = new ItemTheopPickaxe(PUREWITHERMORIUM).setRegistryName("pureWitherPick");
    public static Item pureWitherShovel = new ItemTheopShovel(PUREWITHERMORIUM).setRegistryName("pureWitherShovel");
    public static Item pureWitherAxe = new ItemAxeCustom(PUREWITHERMORIUM).setRegistryName("pureWitherAxe");
    public static Item pureWitherHoe = new ItemTheopHoe(PUREWITHERMORIUM).setRegistryName("pureWitherHoe");
    public static Item pureWitherHelm = new ItemTheopArmor(APUREWITHERMORIUM, 1, EntityEquipmentSlot.HEAD, "pureWitherHelm");
    public static Item pureWitherPlate = new ItemTheopArmor(APUREWITHERMORIUM, 1, EntityEquipmentSlot.CHEST, "pureWitherPlate");
    public static Item pureWitherPants = new ItemTheopArmor(APUREWITHERMORIUM, 2, EntityEquipmentSlot.LEGS, "pureWitherPants");
    public static Item pureWitherBoots = new ItemTheopArmor(APUREWITHERMORIUM, 1, EntityEquipmentSlot.FEET, "pureWitherBoots");
    
    public static Item netherSword = new ItemTheopSword(NETHERRONIUM).setRegistryName("netherSword");
    public static Item netherPick = new ItemTheopPickaxe(NETHERRONIUM).setRegistryName("netherPick");
    public static Item netherShovel = new ItemTheopShovel(NETHERRONIUM).setRegistryName("netherShovel");
    public static Item netherAxe = new ItemAxeCustom(NETHERRONIUM).setRegistryName("netherAxe");
    public static Item netherHoe = new ItemTheopHoe(NETHERRONIUM).setRegistryName("netherHoe");
    public static Item netherHelm = new ItemTheopArmor(ANETHERRONIUM, 1, EntityEquipmentSlot.HEAD, "netherHelm");
    public static Item netherPlate = new ItemTheopArmor(ANETHERRONIUM, 1, EntityEquipmentSlot.CHEST, "netherPlate");
    public static Item netherPants = new ItemTheopArmor(ANETHERRONIUM, 2, EntityEquipmentSlot.LEGS, "netherPants");
    public static Item netherBoots = new ItemTheopArmor(ANETHERRONIUM, 1, EntityEquipmentSlot.FEET, "netherBoots");
    
    public static Item chargedNetherSword = new ItemTheopSword(CHARGEDNETHERRONIUM).setRegistryName("chargedNetherSword");
    public static Item chargedNetherPick = new ItemTheopPickaxe(CHARGEDNETHERRONIUM).setRegistryName("chargedNetherPick");
    public static Item chargedNetherShovel = new ItemTheopShovel(CHARGEDNETHERRONIUM).setRegistryName("chargedNetherShovel");
    public static Item chargedNetherAxe = new ItemAxeCustom(CHARGEDNETHERRONIUM).setRegistryName("chargedNetherAxe");
    public static Item chargedNetherHoe = new ItemTheopHoe(CHARGEDNETHERRONIUM).setRegistryName("chargedNetherHoe");
    public static Item chargedNetherHelm = new ItemTheopArmor(ACHARGEDNETHERRONIUM, 1, EntityEquipmentSlot.HEAD, "chargedNetherHelm");
    public static Item chargedNetherPlate = new ItemTheopArmor(ACHARGEDNETHERRONIUM, 1, EntityEquipmentSlot.CHEST, "chargedNetherPlate");
    public static Item chargedNetherPants = new ItemTheopArmor(ACHARGEDNETHERRONIUM, 2, EntityEquipmentSlot.LEGS, "chargedNetherPants");
    public static Item chargedNetherBoots = new ItemTheopArmor(ACHARGEDNETHERRONIUM, 1, EntityEquipmentSlot.FEET, "chargedNetherBoots");
    
    public static Item ultimatiumSword = new ItemTheopSword(ULTIMATIUM).setRegistryName("ultimatiumSword");
    public static Item ultimatiumPick = new ItemTheopPickaxe(ULTIMATIUM).setRegistryName("ultimatiumPick");
    public static Item ultimatiumShovel = new ItemTheopShovel(ULTIMATIUM).setRegistryName("ultimatiumShovel");
    public static Item ultimatiumAxe = new ItemAxeCustom(ULTIMATIUM).setRegistryName("ultimatiumAxe");
    public static Item ultimatiumHoe = new ItemTheopHoe(ULTIMATIUM).setRegistryName("ultimatiumHoe");
    public static Item ultimatiumHelm = new ItemTheopArmor(AULTIMATIUM, 1, EntityEquipmentSlot.HEAD, "ultimatiumHelm");
    public static Item ultimatiumPlate = new ItemTheopArmor(AULTIMATIUM, 1, EntityEquipmentSlot.CHEST, "ultimatiumPlate");
    public static Item ultimatiumPants = new ItemTheopArmor(AULTIMATIUM, 2, EntityEquipmentSlot.LEGS, "ultimatiumPants");
    public static Item ultimatiumBoots = new ItemTheopArmor(AULTIMATIUM, 1, EntityEquipmentSlot.FEET, "ultimatiumBoots");
    
    public static Item voidUltimatiumSword = new ItemTheopSword(VOIDULTIMATIUM).setRegistryName("voidUltimatiumSword");
    public static Item voidUltimatiumPick = new ItemTheopPickaxe(VOIDULTIMATIUM).setRegistryName("voidUltimatiumPick");
    public static Item voidUltimatiumShovel = new ItemTheopShovel(VOIDULTIMATIUM).setRegistryName("voidUltimatiumShovel");
    public static Item voidUltimatiumAxe = new ItemAxeCustom(VOIDULTIMATIUM).setRegistryName("voidUltimatiumAxe");
    public static Item voidUltimatiumHoe = new ItemTheopHoe(VOIDULTIMATIUM).setRegistryName("voidUltimatiumHoe");
    public static Item voidUltimatiumHelm = new ItemTheopArmor(AVOIDULTIMATIUM, 1, EntityEquipmentSlot.HEAD, "voidUltimatiumHelm");
    public static Item voidUltimatiumPlate = new ItemTheopArmor(AVOIDULTIMATIUM, 1, EntityEquipmentSlot.CHEST, "voidUltimatiumPlate");
    public static Item voidUltimatiumPants = new ItemTheopArmor(AVOIDULTIMATIUM, 2, EntityEquipmentSlot.LEGS, "voidUltimatiumPants");
    public static Item voidUltimatiumBoots = new ItemTheopArmor(AVOIDULTIMATIUM, 1, EntityEquipmentSlot.FEET, "voidUltimatiumBoots");
    
    public static Item Universium = new ItemTheopUniversium(UNIVERSIUM).setRegistryName("Universium");
    
    public static void registerItems()
    {
        RegisterHelper.registerItem(metalGemSword);
        RegisterHelper.registerItem(metalGemPick);
        RegisterHelper.registerItem(metalGemShovel);
        RegisterHelper.registerItem(metalGemAxe);
        RegisterHelper.registerItem(metalGemHoe);
        RegisterHelper.registerItem(metalGemHelm);
        RegisterHelper.registerItem(metalGemPlate);
        RegisterHelper.registerItem(metalGemPants);
        RegisterHelper.registerItem(metalGemBoots);
        
        RegisterHelper.registerItem(faerumSword);
        RegisterHelper.registerItem(faerumPick);
        RegisterHelper.registerItem(faerumShovel);
        RegisterHelper.registerItem(faerumAxe);
        RegisterHelper.registerItem(faerumHoe);
        RegisterHelper.registerItem(faerumHelm);
        RegisterHelper.registerItem(faerumPlate);
        RegisterHelper.registerItem(faerumPants);
        RegisterHelper.registerItem(faerumBoots);
        
        RegisterHelper.registerItem(ceruliumSword);
        RegisterHelper.registerItem(ceruliumPick);
        RegisterHelper.registerItem(ceruliumShovel);
        RegisterHelper.registerItem(ceruliumAxe);
        RegisterHelper.registerItem(ceruliumHoe);
        RegisterHelper.registerItem(ceruliumHelm);
        RegisterHelper.registerItem(ceruliumPlate);
        RegisterHelper.registerItem(ceruliumPants);
        RegisterHelper.registerItem(ceruliumBoots);
        
        RegisterHelper.registerItem(superMetalGemSword);
        RegisterHelper.registerItem(superMetalGemPick);
        RegisterHelper.registerItem(superMetalGemShovel);
        RegisterHelper.registerItem(superMetalGemAxe);
        RegisterHelper.registerItem(superMetalGemHoe);
        RegisterHelper.registerItem(superMetalGemHelm);
        RegisterHelper.registerItem(superMetalGemPlate);
        RegisterHelper.registerItem(superMetalGemPants);
        RegisterHelper.registerItem(superMetalGemBoots);
        
        RegisterHelper.registerItem(kryptoniteSword);
        RegisterHelper.registerItem(kryptonitePick);
        RegisterHelper.registerItem(kryptoniteShovel);
        RegisterHelper.registerItem(kryptoniteAxe);
        RegisterHelper.registerItem(kryptoniteHoe);
        RegisterHelper.registerItem(kryptoniteHelm);
        RegisterHelper.registerItem(kryptonitePlate);
        RegisterHelper.registerItem(kryptonitePants);
        RegisterHelper.registerItem(kryptoniteBoots);
        
        RegisterHelper.registerItem(witherSword);
        RegisterHelper.registerItem(witherPick);
        RegisterHelper.registerItem(witherShovel);
        RegisterHelper.registerItem(witherAxe);
        RegisterHelper.registerItem(witherHoe);
        RegisterHelper.registerItem(witherHelm);
        RegisterHelper.registerItem(witherPlate);
        RegisterHelper.registerItem(witherPants);
        RegisterHelper.registerItem(witherBoots);
        
        RegisterHelper.registerItem(pureWitherSword);
        RegisterHelper.registerItem(pureWitherPick);
        RegisterHelper.registerItem(pureWitherShovel);
        RegisterHelper.registerItem(pureWitherAxe);
        RegisterHelper.registerItem(pureWitherHoe);
        RegisterHelper.registerItem(pureWitherHelm);
        RegisterHelper.registerItem(pureWitherPlate);
        RegisterHelper.registerItem(pureWitherPants);
        RegisterHelper.registerItem(pureWitherBoots);
        
        RegisterHelper.registerItem(netherSword);
        RegisterHelper.registerItem(netherPick);
        RegisterHelper.registerItem(netherShovel);
        RegisterHelper.registerItem(netherAxe);
        RegisterHelper.registerItem(netherHoe);
        RegisterHelper.registerItem(netherHelm);
        RegisterHelper.registerItem(netherPlate);
        RegisterHelper.registerItem(netherPants);
        RegisterHelper.registerItem(netherBoots);
        
        RegisterHelper.registerItem(chargedNetherSword);
        RegisterHelper.registerItem(chargedNetherPick);
        RegisterHelper.registerItem(chargedNetherShovel);
        RegisterHelper.registerItem(chargedNetherAxe);
        RegisterHelper.registerItem(chargedNetherHoe);
        RegisterHelper.registerItem(chargedNetherHelm);
        RegisterHelper.registerItem(chargedNetherPlate);
        RegisterHelper.registerItem(chargedNetherPants);
        RegisterHelper.registerItem(chargedNetherBoots);
        
        RegisterHelper.registerItem(ultimatiumSword);
        RegisterHelper.registerItem(ultimatiumPick);
        RegisterHelper.registerItem(ultimatiumShovel);
        RegisterHelper.registerItem(ultimatiumAxe);
        RegisterHelper.registerItem(ultimatiumHoe);
        RegisterHelper.registerItem(ultimatiumHelm);
        RegisterHelper.registerItem(ultimatiumPlate);
        RegisterHelper.registerItem(ultimatiumPants);
        RegisterHelper.registerItem(ultimatiumBoots);
        
        RegisterHelper.registerItem(voidUltimatiumSword);
        RegisterHelper.registerItem(voidUltimatiumPick);
        RegisterHelper.registerItem(voidUltimatiumShovel);
        RegisterHelper.registerItem(voidUltimatiumAxe);
        RegisterHelper.registerItem(voidUltimatiumHoe);
        RegisterHelper.registerItem(voidUltimatiumHelm);
        RegisterHelper.registerItem(voidUltimatiumPlate);
        RegisterHelper.registerItem(voidUltimatiumPants);
        RegisterHelper.registerItem(voidUltimatiumBoots);
        
        RegisterHelper.registerItem(Universium);
    }
    
    public static void registerItemRenderer()
	{		
		RegisterHelper.registerItemRenderer(metalGemSword);
		RegisterHelper.registerItemRenderer(metalGemPick);
		RegisterHelper.registerItemRenderer(metalGemShovel);
		RegisterHelper.registerItemRenderer(metalGemAxe);
		RegisterHelper.registerItemRenderer(metalGemHoe);
		RegisterHelper.registerItemRenderer(metalGemHelm);
		RegisterHelper.registerItemRenderer(metalGemPlate);
		RegisterHelper.registerItemRenderer(metalGemPants);
		RegisterHelper.registerItemRenderer(metalGemBoots);
		
		RegisterHelper.registerItemRenderer(faerumSword);
		RegisterHelper.registerItemRenderer(faerumPick);
		RegisterHelper.registerItemRenderer(faerumShovel);
		RegisterHelper.registerItemRenderer(faerumAxe);
		RegisterHelper.registerItemRenderer(faerumHoe);
		RegisterHelper.registerItemRenderer(faerumHelm);
		RegisterHelper.registerItemRenderer(faerumPlate);
		RegisterHelper.registerItemRenderer(faerumPants);
		RegisterHelper.registerItemRenderer(faerumBoots);
		
		RegisterHelper.registerItemRenderer(ceruliumSword);
		RegisterHelper.registerItemRenderer(ceruliumPick);
		RegisterHelper.registerItemRenderer(ceruliumShovel);
		RegisterHelper.registerItemRenderer(ceruliumAxe);
		RegisterHelper.registerItemRenderer(ceruliumHoe);
		RegisterHelper.registerItemRenderer(ceruliumHelm);
		RegisterHelper.registerItemRenderer(ceruliumPlate);
		RegisterHelper.registerItemRenderer(ceruliumPants);
		RegisterHelper.registerItemRenderer(ceruliumBoots);
		
		RegisterHelper.registerItemRenderer(superMetalGemSword);
		RegisterHelper.registerItemRenderer(superMetalGemPick);
		RegisterHelper.registerItemRenderer(superMetalGemShovel);
		RegisterHelper.registerItemRenderer(superMetalGemAxe);
		RegisterHelper.registerItemRenderer(superMetalGemHoe);
		RegisterHelper.registerItemRenderer(superMetalGemHelm);
		RegisterHelper.registerItemRenderer(superMetalGemPlate);
		RegisterHelper.registerItemRenderer(superMetalGemPants);
		RegisterHelper.registerItemRenderer(superMetalGemBoots);
		
		RegisterHelper.registerItemRenderer(kryptoniteSword);
		RegisterHelper.registerItemRenderer(kryptonitePick);
		RegisterHelper.registerItemRenderer(kryptoniteShovel);
		RegisterHelper.registerItemRenderer(kryptoniteAxe);
		RegisterHelper.registerItemRenderer(kryptoniteHoe);
		RegisterHelper.registerItemRenderer(kryptoniteHelm);
		RegisterHelper.registerItemRenderer(kryptonitePlate);
		RegisterHelper.registerItemRenderer(kryptonitePants);
		RegisterHelper.registerItemRenderer(kryptoniteBoots);
		
		RegisterHelper.registerItemRenderer(witherSword);
		RegisterHelper.registerItemRenderer(witherPick);
		RegisterHelper.registerItemRenderer(witherShovel);
		RegisterHelper.registerItemRenderer(witherAxe);
		RegisterHelper.registerItemRenderer(witherHoe);
		RegisterHelper.registerItemRenderer(witherHelm);
        RegisterHelper.registerItemRenderer(witherPlate);
        RegisterHelper.registerItemRenderer(witherPants);
        RegisterHelper.registerItemRenderer(witherBoots);
        
        RegisterHelper.registerItemRenderer(pureWitherSword);
		RegisterHelper.registerItemRenderer(pureWitherPick);
		RegisterHelper.registerItemRenderer(pureWitherShovel);
		RegisterHelper.registerItemRenderer(pureWitherAxe);
		RegisterHelper.registerItemRenderer(pureWitherHoe);
		RegisterHelper.registerItemRenderer(pureWitherHelm);
		RegisterHelper.registerItemRenderer(pureWitherPlate);
		RegisterHelper.registerItemRenderer(pureWitherPants);
		RegisterHelper.registerItemRenderer(pureWitherBoots);
		
		RegisterHelper.registerItemRenderer(netherSword);
        RegisterHelper.registerItemRenderer(netherPick);
        RegisterHelper.registerItemRenderer(netherShovel);
        RegisterHelper.registerItemRenderer(netherAxe);
        RegisterHelper.registerItemRenderer(netherHoe);
        RegisterHelper.registerItemRenderer(netherHelm);
        RegisterHelper.registerItemRenderer(netherPlate);
        RegisterHelper.registerItemRenderer(netherPants);
        RegisterHelper.registerItemRenderer(netherBoots);
        
        RegisterHelper.registerItemRenderer(chargedNetherSword);
        RegisterHelper.registerItemRenderer(chargedNetherPick);
        RegisterHelper.registerItemRenderer(chargedNetherShovel);
        RegisterHelper.registerItemRenderer(chargedNetherAxe);
        RegisterHelper.registerItemRenderer(chargedNetherHoe);
        RegisterHelper.registerItemRenderer(chargedNetherHelm);
        RegisterHelper.registerItemRenderer(chargedNetherPlate);
        RegisterHelper.registerItemRenderer(chargedNetherPants);
        RegisterHelper.registerItemRenderer(chargedNetherBoots);
        
        RegisterHelper.registerItemRenderer(ultimatiumSword);
        RegisterHelper.registerItemRenderer(ultimatiumPick);
        RegisterHelper.registerItemRenderer(ultimatiumShovel);
        RegisterHelper.registerItemRenderer(ultimatiumAxe);
        RegisterHelper.registerItemRenderer(ultimatiumHoe);
        RegisterHelper.registerItemRenderer(ultimatiumHelm);
        RegisterHelper.registerItemRenderer(ultimatiumPlate);
        RegisterHelper.registerItemRenderer(ultimatiumPants);
        RegisterHelper.registerItemRenderer(ultimatiumBoots);
        
        RegisterHelper.registerItemRenderer(voidUltimatiumSword);
        RegisterHelper.registerItemRenderer(voidUltimatiumPick);
        RegisterHelper.registerItemRenderer(voidUltimatiumShovel);
        RegisterHelper.registerItemRenderer(voidUltimatiumAxe);
        RegisterHelper.registerItemRenderer(voidUltimatiumHoe);
        RegisterHelper.registerItemRenderer(voidUltimatiumHelm);
        RegisterHelper.registerItemRenderer(voidUltimatiumPlate);
        RegisterHelper.registerItemRenderer(voidUltimatiumPants);
        RegisterHelper.registerItemRenderer(voidUltimatiumBoots);
        
        RegisterHelper.registerItemRenderer(Universium);
	}
}
