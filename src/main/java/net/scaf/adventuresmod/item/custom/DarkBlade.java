package net.scaf.adventuresmod.item.custom;

import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.scaf.adventuresmod.effect.ModEffects;

public class DarkBlade extends SwordItem {
    public DarkBlade(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addStatusEffect(new StatusEffectInstance(ModEffects.STUN, 50 ,2), attacker);
        PlayerEntity playerEntity = (PlayerEntity) attacker;
        playerEntity.getItemCooldownManager().set(this, 20);
        return super.postHit(stack, target, attacker);
    }
}
