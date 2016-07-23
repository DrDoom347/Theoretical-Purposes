package com.gmail.drdoom347.theop.handlers;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class MobDropsHandler
{
	@SubscribeEvent
    public void onMobDrops(LivingDropsEvent event)
    {
        if (event.getEntity() instanceof EntitySkeleton)
        {
            ItemStack stack = new ItemStack(Items.GOLD_INGOT);
            EntityItem drop = new EntityItem(event.getEntity().worldObj, event.getEntity().posX, event.getEntity().posY, event.getEntity().posZ, stack);
 
            event.getDrops().add(drop);
        }
    }
}
