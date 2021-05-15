package alex.witcher.overhaul.enchantment;

import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;

public class WolvenArmourEnchantment extends WitcherArmourEnchantment {

  public final static WitcherArmourEnchantment INSTANCE = new WolvenArmourEnchantment();

  private WolvenArmourEnchantment() {
    super(Rarity.VERY_RARE, EnchantmentTarget.ARMOR,
        new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS,
            EquipmentSlot.FEET});
  }

  @Override
  public int getProtectionAmount(int level, DamageSource source) {
    if (source.isOutOfWorld()) {
      return 0;
    } else if (source.isProjectile()) {
      return level * 5;
    }
    return level;
  }

  @Override
  public void onUserDamaged(LivingEntity user, Entity attacker, int level) {
  }
}
