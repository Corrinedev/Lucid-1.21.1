package com.corrinedev.lucid;

import com.corrinedev.lucid.registry.JsonRegistry;
import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.NeoForge;
import org.slf4j.Logger;

@Mod(Lucid.ID)
public class Lucid {
    public static final String ID = "lucid";
    public static final Logger LOGGER = LogUtils.getLogger();

    public Lucid(IEventBus modEventBus, ModContainer modContainer) {
        NeoForge.EVENT_BUS.register(this);
        new JsonRegistry().init(modEventBus);
    }
}
