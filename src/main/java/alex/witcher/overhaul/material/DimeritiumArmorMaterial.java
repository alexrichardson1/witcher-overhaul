package alex.witcher.overhaul.material;

import alex.witcher.overhaul.item.ModItems;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

public class DimeritiumArmorMaterial implements ArmorMaterial {

  public static final DimeritiumArmorMaterial INSTANCE = new DimeritiumArmorMaterial();

  private static final int NETHERITE_ENCHANTABILITY = 15;
  // durability
  private static final int HELMET_DURABILITY = 13;
  private static final int CHESTPLATE_DURABILITY = 15;
  private static final int LEGGINGS_DURABILITY = 16;
  private static final int BOOTS_DURABILITY = 11;
  // protections
  private static final int HELMET_PROTECTION = 3;
  private static final int CHESTPLATE_PROTECTION = 6;
  private static final int LEGGINGS_PROTECTION = 8;
  private static final int BOOTS_PROTECTION = 3;

  private static final int[] BASE_DURABILITY = new int[]{HELMET_DURABILITY, CHESTPLATE_DURABILITY,
      LEGGINGS_DURABILITY, BOOTS_DURABILITY};
  private static final int[] PROTECTION_VALUES = new int[]{HELMET_PROTECTION,
      CHESTPLATE_PROTECTION, LEGGINGS_PROTECTION, BOOTS_PROTECTION};


  private DimeritiumArmorMaterial() {
  }

  @Override
  public int getDurability(EquipmentSlot slot) {
    return BASE_DURABILITY[slot.getEntitySlotId()] * 10;
  }

  @Override
  public int getProtectionAmount(EquipmentSlot slot) {
    return PROTECTION_VALUES[slot.getEntitySlotId()];
  }

  @Override
  public int getEnchantability() {
    return NETHERITE_ENCHANTABILITY;
  }

  @Override
  public SoundEvent getEquipSound() {
    return SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE;
  }

  @Override
  public Ingredient getRepairIngredient() {
    return Ingredient.ofItems(ModItems.DIMERITIUM_INGOT);
  }

  @Override
  public String getName() {
    return "dimeritium";
  }

  @Override
  public float getToughness() {
    return 3;
  }

  @Override
  public float getKnockbackResistance() {
    return 0.9F;
  }
}
