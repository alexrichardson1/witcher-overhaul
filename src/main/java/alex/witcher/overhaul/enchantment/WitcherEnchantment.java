package alex.witcher.overhaul.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;

public abstract class WitcherEnchantment extends Enchantment {

  protected WitcherEnchantment(EnchantmentTarget type, EquipmentSlot[] slotTypes) {
    super(Rarity.VERY_RARE, type, slotTypes);
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
}
