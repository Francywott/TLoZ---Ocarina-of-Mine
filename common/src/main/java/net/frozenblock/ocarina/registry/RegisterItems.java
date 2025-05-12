package net.frozenblock.ocarina.registry;

import net.frozenblock.ocarina.OOMConstants;
import net.frozenblock.ocarina.content.item.OcarinaItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class RegisterItems {
    public static final OcarinaItem OCARINA = new OcarinaItem(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON));
    public static final OcarinaItem ZELDAS_OCARINA = new OcarinaItem(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
    public static final OcarinaItem EMPTY_SHEET = new OcarinaItem(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
    public static final OcarinaItem CUSTOM_SHEET = new OcarinaItem(new Item.Properties().stacksTo(1).rarity(Rarity.COMMON));

    public static void register() {
        Registry.register(BuiltInRegistries.ITEM, OOMConstants.id("ocarina"), OCARINA);
        Registry.register(BuiltInRegistries.ITEM, OOMConstants.id("zeldas_ocarina"), ZELDAS_OCARINA);
        Registry.register(BuiltInRegistries.ITEM, OOMConstants.id("empty_sheet"), EMPTY_SHEET);
        Registry.register(BuiltInRegistries.ITEM, OOMConstants.id("custom_sheet"), CUSTOM_SHEET);
    }
}
