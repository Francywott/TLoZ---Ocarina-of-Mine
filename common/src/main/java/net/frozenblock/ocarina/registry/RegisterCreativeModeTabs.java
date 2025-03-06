package net.frozenblock.ocarina.registry;

import net.frozenblock.ocarina.OOMConstants;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;

public class RegisterCreativeModeTabs {
    public static final CreativeModeTab TAB = CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)
            .title(Component.translatable(""))
            .build();


    public static void register() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, OOMConstants.id("tab"), TAB);
    }
}
