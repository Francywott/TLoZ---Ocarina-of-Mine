package net.frozenblock.ocarina.platform;

import net.frozenblock.ocarina.OOMConstants;
import net.frozenblock.ocarina.platform.services.IPlatformHelper;

import java.util.ServiceLoader;

public class OOMServices {
    public static final IPlatformHelper PLATFORM = load(IPlatformHelper.class);
    public static <T> T load(Class<T> clazz) {

        final T loadedService = ServiceLoader.load(clazz)
                .findFirst()
                .orElseThrow(() -> new NullPointerException("Failed to load service for " + clazz.getName()));
        OOMConstants.LOGGER.debug("Loaded {} for service {}", loadedService, clazz);
        return loadedService;
    }
}
