package com.example.gingerbreadfactory;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(GingerbreadMod.MODID)
public class GingerbreadMod {
    public static final String MODID = "gingerbreadfactory";

    public GingerbreadMod(IEventBus modEventBus) {
        ModItems.ITEMS.register(modEventBus);
        ModItems.BLOCKS.register(modEventBus);
        ModItems.TABS.register(modEventBus);
    }
}
