package alex.witcher.overhaul.enchantment;

import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.mob.Monster;

public class WolvenArmourEnchantment extends WitcherArmourEnchantment {

  @Override
  public int getProtectionAmount(int level, DamageSource source) {
    if (source.isOutOfWorld()) {
      return 0;
    } else if (source.getAttacker() instanceof Monster) {
      return level;
    }
    else if (source.isProjectile()) {
      return level * 5;
    }
    return level;
  }
}
