package com.corrinedev.lucid.registry;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.registries.RegisterEvent;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;

public final class JsonRegistry {
    private static LinkedList<JsonObject> ITEMS = new LinkedList<>();
    private static Gson GS = new GsonBuilder().setPrettyPrinting().create();

    @SubscribeEvent
    private void register(final RegisterEvent event) {
        event.register(Registries.ITEM, (helper) -> {
            for(JsonObject obj : ITEMS) {

                var type = Type.valueOf(obj.getAsJsonPrimitive("type").getAsString().toUpperCase());
                var resourceLocation = obj.getAsJsonPrimitive("id").getAsString();
            }
        });
    }
    public void init(IEventBus bus) {


        bus.addListener(this::register);
    }
    public enum Type {
        WEAPON,
        CONSUMABLE,
        MISC
    }
}
