package com.gmail.drdoom347.theop.proxies;

import com.gmail.drdoom347.theop.init.TheopArmory;
import com.gmail.drdoom347.theop.init.TheopBlocks;
import com.gmail.drdoom347.theop.init.TheopItems;

public class CommonProxy
{
	public void registerRenderers() 
	{
	TheopItems.registerItemRenderer();
	TheopBlocks.registerBlockRenderer();
	TheopArmory.registerItemRenderer();
	}
}
