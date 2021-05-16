package alex.witcher.overhaul.enchantment;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class WolvenWeaponEnchantment extends WitcherWeaponEnchantment {

  @Override
  public void onTargetDamaged(LivingEntity user, Entity target, int level) {
    if (target instanceof LivingEntity) {
      ((LivingEntity) target).addStatusEffect(
          new StatusEffectInstance(StatusEffects.POISON, 20 * 2 * level, level - 1));
    }
  }

  // +11% Critical Hit Chance
  // +11% Bleeding
  // +20% Exp from Monsters

  @Override
  public float getAttackDamage(int level, EntityGroup group) {
    return level;
  }
}
