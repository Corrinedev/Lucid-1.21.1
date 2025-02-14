package com.corrinedev.lucid.network;

import com.corrinedev.lucid.Lucid;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.network.event.RegisterPayloadHandlersEvent;
import net.neoforged.neoforge.network.registration.PayloadRegistrar;

@EventBusSubscriber(modid = Lucid.ID, bus = EventBusSubscriber.Bus.MOD)
public class Network {

    private static int id = 0;
    private static final String PROTOCOL_VERSION = "1";

    @SubscribeEvent
    public static void register(final RegisterPayloadHandlersEvent event) {
        final PayloadRegistrar registrar = event.registrar(PROTOCOL_VERSION);
        /// Example
        //registrar.playToClient(
        //        ShopScreenPacket.TYPE,
        //        ShopScreenPacket.STREAM_CODEC,
        //        ShopScreenPacket.HandleClient::handleDataOnMain
        //);
    }
}
