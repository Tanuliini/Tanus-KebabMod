package tanu.kebab.item;

import net.minecraft.component.type.ConsumableComponent;
import net.minecraft.component.type.ConsumableComponents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.consume.ApplyEffectsConsumeEffect;

public class ModFoodComponents {
    public static final FoodComponent KEBAB = new FoodComponent.Builder().nutrition(6).saturationModifier(0.65f)
            .build();

    public static final FoodComponent RAW_KEBAB = new FoodComponent.Builder().nutrition(2).saturationModifier(0.2f)
            .build();
    public static final ConsumableComponent RAW_KEBAB_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HUNGER, 300), 0.35f))
            .build();

    public static final FoodComponent KEBAB_BREAD = new FoodComponent.Builder().nutrition(6).saturationModifier(1.2F)
            .build();

    public static final FoodComponent KEBAB_LEIPA_KASTIKKEELLA = new FoodComponent.Builder().nutrition(6).saturationModifier(0.65f)
            .build();
    public static final ConsumableComponent KEBAB_LEIPA_KASTIKKEELLA_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.SATURATION, 800), 1f))
            .build();

    public static final FoodComponent OVER_COOKED_KEBAB_BREAD = new FoodComponent.Builder().nutrition(2).saturationModifier(0.3F)
            .build();
    public static final ConsumableComponent OVER_COOKED_KEBAB_BREAD_EFFECT = ConsumableComponents.food()
            .consumeEffect(new ApplyEffectsConsumeEffect(new StatusEffectInstance(StatusEffects.HUNGER, 150), 1f))
            .build();

}
