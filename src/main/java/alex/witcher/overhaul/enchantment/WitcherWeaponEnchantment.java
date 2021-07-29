package alex.witcher.overhaul.enchantment;

import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EntityGroup;
import net.minecraft.entity.EquipmentSlot;

public abstract class WitcherWeaponEnchantment extends WitcherEnchantment {

  protected WitcherWeaponEnchantment() {
    super(EnchantmentTarget.WEAPON, new EquipmentSlot[]{EquipmentSlot.MAINHAND});
  }

  @Override
  public abstract float getAttackDamage(int level, EntityGroup group);
}
