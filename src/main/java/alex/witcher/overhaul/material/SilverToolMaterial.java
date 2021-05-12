package alex.witcher.overhaul.material;

import alex.witcher.overhaul.item.ModItems;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class SilverToolMaterial implements ToolMaterial {

  public static final SilverToolMaterial INSTANCE = new SilverToolMaterial();

  private SilverToolMaterial() {
  }

  @Override
  public int getDurability() {
    return 500;
  }

  @Override
  public float getMiningSpeedMultiplier() {
    return 6F;
  }

  @Override
  public float getAttackDamage() {
    return 3F;
  }

  @Override
  public int getMiningLevel() {
    return 2;
  }

  @Override
  public int getEnchantability() {
    return 12;
  }

  @Override
  public Ingredient getRepairIngredient() {
    return Ingredient.ofItems(ModItems.SILVER_INGOT);
  }
}
