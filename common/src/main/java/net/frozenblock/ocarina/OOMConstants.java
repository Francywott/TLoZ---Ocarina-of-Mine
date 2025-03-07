package net.frozenblock.ocarina;

import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OOMConstants {
    public static final String MOD_ID = "ocarina_of_mine";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static ResourceLocation id(final String name) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, name);
    }
}
