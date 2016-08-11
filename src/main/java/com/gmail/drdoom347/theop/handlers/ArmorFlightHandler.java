package com.gmail.drdoom347.theop.handlers;

import java.util.Map;
import java.util.WeakHashMap;

import com.gmail.drdoom347.theop.init.TheopArmory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.living.LivingFallEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.PlayerTickEvent;

public class ArmorFlightHandler
{	
	public static Map<EntityPlayer, Boolean> playersWithFlight = new WeakHashMap<EntityPlayer, Boolean>();
	
	@SuppressWarnings("unused")
	@SubscribeEvent
	public void LivingFallEvent(LivingFallEvent event)
	{
	    if (!(event.getEntityLiving() instanceof EntityPlayer)) return;
	    EntityPlayer eventPlayer = (EntityPlayer)event.getEntityLiving();
	    //Check if the damage should be removed
	    event.setDistance(0F);
	}
	
	@SubscribeEvent
	public void onPlayerTick(PlayerTickEvent event)
	{		
		if (event.phase != TickEvent.Phase.START || !event.player.worldObj.isRemote) return;
		
		if (event.player.capabilities.isCreativeMode = false)
		{	
			if (((EntityPlayer) event.player).inventory.armorInventory[2] != null)
			{
				if (((EntityPlayer) event.player).inventory.armorInventory[2].getItem() != TheopArmory.voidUltimatiumPlate)
				{
					event.player.capabilities.allowFlying = false;
					event.player.capabilities.isFlying = false;
				}
			}else
			{
				event.player.capabilities.allowFlying = false;
				event.player.capabilities.isFlying = false;
			}
		}
	}
}
