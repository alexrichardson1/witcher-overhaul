package alex.witcher.overhaul.enchantment;

import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;

public class WolvenHelmetEnchantment extends WolvenEnchantment {

  public final static WolvenHelmetEnchantment INSTANCE = new WolvenHelmetEnchantment();

  protected WolvenHelmetEnchantment() {
    super(Rarity.VERY_RARE, EnchantmentTarget.ARMOR_HEAD,
        new EquipmentSlot[]{EquipmentSlot.HEAD});
  }

  @Override
  public int getProtectionAmount(int level, DamageSource source) {
    if (source.isOutOfWorld()) {
      return 0;
    } else if (source.isProjectile()) {
      return level * 3;
    }
    return level;
  }

  @Override
  public void onUserDamaged(LivingEntity user, Entity attacker, int level) {
    super.onUserDamaged(user, attacker, level);
  }


}
