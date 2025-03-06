package net.frozenblock.ocarina;

import net.frozenblock.ocarina.registry.RegisterCreativeModeTabs;
import net.frozenblock.ocarina.registry.RegisterItems;
import net.minecraft.core.registries.BuiltInRegistries;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.RegisterEvent;

@Mod(OOMConstants.MOD_ID)
public class OOM {
    public OOM(IEventBus eventBus) {
        eventBus.register(this);
    }

    @SubscribeEvent
    public void registerEvent(RegisterEvent event) {
        event.register(BuiltInRegistries.ITEM.key(), helper -> RegisterItems.register());
        event.register(BuiltInRegistries.CREATIVE_MODE_TAB.key(), helper -> RegisterCreativeModeTabs.register());
    }
}
