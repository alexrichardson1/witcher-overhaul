package alex.witcher.overhaul.enchantment;

import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;

public abstract class WitcherArmourEnchantment extends WitcherEnchantment {

  protected WitcherArmourEnchantment() {
    super(EnchantmentTarget.ARMOR,
        new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS,
            EquipmentSlot.FEET});
  }

  @Override
  public abstract int getProtectionAmount(int level, DamageSource source);

  @Override
  public abstract void onUserDamaged(LivingEntity user, Entity attacker, int level);
}
