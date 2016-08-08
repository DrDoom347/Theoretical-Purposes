package com.gmail.drdoom347.theop;

import com.gmail.drdoom347.theop.crafting.Recipes;
import com.gmail.drdoom347.theop.handlers.ArmorFlightHandler;
import com.gmail.drdoom347.theop.init.TheopArmory;
import com.gmail.drdoom347.theop.init.TheopBlocks;
import com.gmail.drdoom347.theop.init.TheopItems;
import com.gmail.drdoom347.theop.proxies.CommonProxy;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class TheoreticalPurposes
{
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
    public static CommonProxy proxy;

    @Instance(Reference.MODID)
    public static TheoreticalPurposes instance;
    
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	TheopBlocks.registerBlocks();
    	TheopItems.registerItems();
    	TheopArmory.registerItems();
    	proxy.registerRenderers();
    	MinecraftForge.EVENT_BUS.register(new ArmorFlightHandler());
    }

	@Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
    	Recipes.addSmelting();
    	Recipes.addShapedRecipe();
    	Recipes.addShapelessRecipe();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }

}
