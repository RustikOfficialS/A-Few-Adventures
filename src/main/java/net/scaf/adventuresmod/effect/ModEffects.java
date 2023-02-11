package net.scaf.adventuresmod.effect;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.scaf.adventuresmod.FewAdventuresMod;

public class ModEffects {
    public static StatusEffect STUN;

    public static StatusEffect registerStatusEffect(String name) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(FewAdventuresMod.MOD_ID, name),
                new StunEffect(StatusEffectCategory.HARMFUL, 3124687));
    }

    public static void registerEffects() {
        STUN = registerStatusEffect("stun");
    }

}
