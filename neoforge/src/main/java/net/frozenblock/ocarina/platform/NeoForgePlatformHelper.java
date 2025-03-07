package net.frozenblock.ocarina.platform;

import net.frozenblock.ocarina.platform.services.IPlatformHelper;
import net.minecraft.world.item.CreativeModeTab;

public class NeoForgePlatformHelper implements IPlatformHelper {

    @Override
    public CreativeModeTab.Builder getCreativeTabBuilder() {
        return CreativeModeTab.builder();
    }
}