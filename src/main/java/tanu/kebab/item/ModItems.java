package tanu.kebab.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import tanu.kebab.TanusKebabMod;

import java.util.function.Function;

public class ModItems {
    public static final Item KEBAB_KASTIKE = registerItem("kebab_kastike", Item::new);


    public static final Item KEBAB = registerItem("kebab", setting -> new Item(setting
            .food(ModFoodComponents.KEBAB)));
    public static final Item RAW_KEBAB = registerItem("raw_kebab", setting -> new Item(setting
            .food(ModFoodComponents.RAW_KEBAB, ModFoodComponents.RAW_KEBAB_EFFECT)));


    public static final Item KEBAB_BREAD = registerItem("kebab_bread", setting -> new Item(setting
            .food(ModFoodComponents.KEBAB_BREAD)));

    public static final Item OVER_COOKED_KEBAB_BREAD = registerItem("over_cooked_kebab_bread", setting -> new Item(setting
            .food(ModFoodComponents.OVER_COOKED_KEBAB_BREAD, ModFoodComponents.OVER_COOKED_KEBAB_BREAD_EFFECT)));

    public static final Item KEBAB_LEIPA_KASTIKKEELLA = registerItem("kebab_leipa_kastikkeella", setting -> new Item(setting
            .food(ModFoodComponents.KEBAB_LEIPA_KASTIKKEELLA, ModFoodComponents.KEBAB_LEIPA_KASTIKKEELLA_EFFECT)));



    private static Item registerItem(String name, Function<Item.Settings, Item> function) {
        return Registry.register(Registries.ITEM, Identifier.of(TanusKebabMod.MOD_ID, name),
                function.apply(new Item.Settings().registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(TanusKebabMod.MOD_ID, name)))));
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
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(OVER_COOKED_KEBAB_BREAD);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(KEBAB_LEIPA_KASTIKKEELLA);
        });
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(KEBAB_KASTIKE);
        });
    }
}
