package net.frozenblock.ocarina.platform;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.frozenblock.ocarina.platform.services.IPlatformHelper;
import net.minecraft.world.item.CreativeModeTab;

public class FabricPlatformHelper implements IPlatformHelper {

    @Override
    public CreativeModeTab.Builder getCreativeTabBuilder() {
        return FabricItemGroup.builder();
    }
}
