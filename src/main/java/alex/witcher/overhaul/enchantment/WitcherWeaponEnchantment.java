package alex.witcher.overhaul.enchantment;

import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;

public abstract class WitcherWeaponEnchantment extends WitcherEnchantment {

  protected WitcherWeaponEnchantment() {
    super(EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
  }

  @Override
  public abstract void onTargetDamaged(LivingEntity user, Entity target, int level);

  @Override
  public abstract float getAttackDamage(int level, EntityGroup group);
}
