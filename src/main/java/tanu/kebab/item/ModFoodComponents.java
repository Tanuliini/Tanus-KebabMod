package tanu.kebab.item;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class ModFoodComponents {
    public static final FoodComponent KEBAB = new FoodComponent.Builder().nutrition(6).saturationModifier(0.65f)
            .statusEffect(new StatusEffectInstance(StatusEffects.SATURATION, 200), 0.05f).build();

    public static final FoodComponent RAW_KEBAB = new FoodComponent.Builder().nutrition(2).saturationModifier(0.2f)
            .statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 300), 0.35f)
            .statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 300), 0.05f)
            .build();

}
