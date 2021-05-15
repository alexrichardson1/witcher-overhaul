package alex.witcher.overhaul.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;

public abstract class WitcherArmourEnchantment extends Enchantment {

  protected WitcherArmourEnchantment(Rarity weight, EnchantmentTarget type, EquipmentSlot[] slotTypes) {
    super(weight, type, slotTypes);
  }

  @Override
  public final int getMaxLevel() {
    return 5;
  }

  @Override
  public final int getMinPower(int level) {
    return 25;
  }

  @Override
  public final int getMaxPower(int level) {
    return getMinPower(level) + 5;
  }

  @Override
  protected final boolean canAccept(Enchantment other) {
    return false;
  }

  @Override
  public abstract int getProtectionAmount(int level, DamageSource source);

  @Override
  public abstract void onUserDamaged(LivingEntity user, Entity attacker, int level);

}
