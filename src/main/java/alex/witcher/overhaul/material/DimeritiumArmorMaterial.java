package alex.witcher.overhaul.material;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;

public class DimeritiumArmorMaterial implements ArmorMaterial {

  public static final DimeritiumArmorMaterial INSTANCE = new DimeritiumArmorMaterial();
  // durability
  public static final int HELMET_DURABILITY = 13;
  public static final int CHESTPLATE_DURABILITY = 15;
  public static final int LEGGINGS_DURABILITY = 16;
  public static final int BOOTS_DURABILITY = 11;
  
  private static final int[] BASE_DURABILITY = new int[]{HELMET_DURABILITY, CHESTPLATE_DURABILITY,
      LEGGINGS_DURABILITY, BOOTS_DURABILITY};


  private DimeritiumArmorMaterial() {
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
