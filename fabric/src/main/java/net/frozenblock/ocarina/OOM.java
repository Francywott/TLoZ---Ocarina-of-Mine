package net.frozenblock.ocarina;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.frozenblock.ocarina.registry.RegisterCreativeModeTabs;
import net.frozenblock.ocarina.registry.RegisterItems;

public class OOM implements ModInitializer, ClientModInitializer {
    @Override
    public void onInitializeClient() {

    }

    @Override
    public void onInitialize() {
        RegisterItems.register();
        RegisterCreativeModeTabs.register();
    }
}
