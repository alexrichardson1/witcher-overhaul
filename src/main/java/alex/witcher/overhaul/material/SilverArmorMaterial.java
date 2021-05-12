package alex.witcher.overhaul.material;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;

public class SilverArmorMaterial implements ArmorMaterial {

  // TODO: make amour material for witcher gear
  // maybe not silver? => dimirite

  public static final SilverArmorMaterial INSTANCE = new SilverArmorMaterial();

  private SilverArmorMaterial() {
  }

  @Override
  public int getDurability(EquipmentSlot slot) {
    return 0;
  }

  @Override
  public int getProtectionAmount(EquipmentSlot slot) {
    return 0;
  }

  @Override
  public int getEnchantability() {
    return 0;
  }

  @Override
  public SoundEvent getEquipSound() {
    return null;
  }

  @Override
  public Ingredient getRepairIngredient() {
    return null;
  }

  @Override
  public String getName() {
    return null;
  }

  @Override
  public float getToughness() {
    return 0;
  }

  @Override
  public float getKnockbackResistance() {
    return 0;
  }
}
