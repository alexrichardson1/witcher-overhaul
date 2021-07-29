package alex.witcher.overhaul.enchantment;

import net.minecraft.entity.EntityGroup;

public class WolvenWeaponEnchantment extends WitcherWeaponEnchantment {

  @Override
  public float getAttackDamage(int level, EntityGroup group) {
    return level;
  }
}
