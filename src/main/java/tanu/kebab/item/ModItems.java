package tanu.kebab.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import tanu.kebab.TanusKebabMod;

public class ModItems {
    public static final Item KEBAB = registerItem("kebab", new Item(new Item.Settings().food(ModFoodComponents.KEBAB)));
    public static final Item RAW_KEBAB = registerItem("raw_kebab", new Item(new Item.Settings().food(ModFoodComponents.RAW_KEBAB)));
    public static final Item KEBAB_BREAD = registerItem("kebab_bread", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TanusKebabMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TanusKebabMod.LOGGER.info("Registering Mod Items for " + TanusKebabMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(RAW_KEBAB);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(KEBAB);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(KEBAB_BREAD);
        });
    }
}
