package alex.witcher.overhaul.enchantment;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;

public class WolvenArmourEnchantment extends WitcherArmourEnchantment {

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
