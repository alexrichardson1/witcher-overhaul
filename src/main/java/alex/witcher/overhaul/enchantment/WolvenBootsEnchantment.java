package alex.witcher.overhaul.enchantment;

import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;

public class WolvenBootsEnchantment extends WitcherArmourEnchantment {

  public final static WolvenBootsEnchantment INSTANCE = new WolvenBootsEnchantment();

  protected WolvenBootsEnchantment() {
    super(Rarity.VERY_RARE, EnchantmentTarget.ARMOR_FEET,
        new EquipmentSlot[]{EquipmentSlot.FEET});
  }

  @Override
  public int getProtectionAmount(int level, DamageSource source) {
    if (source.isOutOfWorld()) {
      return 0;
    } else if (source.isProjectile()) {
      return level * 4;
    }
    return level;
  }

  @Override
  public void onUserDamaged(LivingEntity user, Entity attacker, int level) {
    super.onUserDamaged(user, attacker, level);
  }
}
