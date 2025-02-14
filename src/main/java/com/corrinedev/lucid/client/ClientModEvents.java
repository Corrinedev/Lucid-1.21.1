package com.corrinedev.lucid.client;

import com.corrinedev.lucid.Lucid;
import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

import static com.corrinedev.lucid.Lucid.ID;

@EventBusSubscriber(modid = ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEvents {
    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        Lucid.LOGGER.info("WELCOME TO LUCID >> {}", Minecraft.getInstance().getUser().getName());
    }
}