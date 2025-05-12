package net.frozenblock.ocarina.registry;

import net.frozenblock.ocarina.OOMConstants;
import net.frozenblock.ocarina.platform.OOMServices;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class RegisterCreativeModeTabs {
    public static final ResourceKey<CreativeModeTab> TAB_KEY = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), OOMConstants.id("ocarina_of_mine"));
    public static final CreativeModeTab TAB = OOMServices.PLATFORM.getCreativeTabBuilder()
            .icon(() -> new ItemStack(RegisterItems.ZELDAS_OCARINA))
            .title(Component.translatable("itemGroup.ocarina_of_mine"))
            .displayItems((params, output) -> {
                output.accept(RegisterItems.OCARINA);
                output.accept(RegisterItems.ZELDAS_OCARINA);
                output.accept(RegisterItems.EMPTY_SHEET);
                output.accept(RegisterItems.CUSTOM_SHEET);
            })
            .build();


    public static void register() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, OOMConstants.id("tab"), TAB);
    }
}
