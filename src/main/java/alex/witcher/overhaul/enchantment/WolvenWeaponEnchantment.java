package alex.witcher.overhaul.enchantment;

import alex.witcher.overhaul.statuseffect.ModStatusEffects;
import alex.witcher.overhaul.utils.ModLib;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;

public class WolvenWeaponEnchantment extends WitcherWeaponEnchantment {

  @Override
  public void onTargetDamaged(LivingEntity user, Entity target, int level) {
    if (target instanceof LivingEntity) {
      ((LivingEntity) target).addStatusEffect(
          new StatusEffectInstance(ModStatusEffects.BLEED, ModLib.TICKS_PER_SECOND * 2 * level,
              level - 1));
    }
  }

  // +11% Critical Hit Chance
  // +20% Exp from Monsters

  @Override
  public float getAttackDamage(int level, EntityGroup group) {
    return level;
  }
}
