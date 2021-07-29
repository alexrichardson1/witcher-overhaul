package alex.witcher.overhaul.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.text.MutableText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;

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

  @Override
  public final Text getName(int level) {
    MutableText mutableText = new TranslatableText(this.getTranslationKey());
    mutableText.append(" ");
    switch (level) {
      case 1:
        mutableText.append("Basic");
        break;
      case 2:
        mutableText.append("Enhanced");
        break;
      case 3:
        mutableText.append("Superior");
        break;
      case 4:
        mutableText.append("Mastercrafted");
        break;
      case 5:
        mutableText.append("Grandmaster");
        break;
      default:
        mutableText.append(new TranslatableText("enchantment.level." + level));
    }
    return mutableText;
  }

}
