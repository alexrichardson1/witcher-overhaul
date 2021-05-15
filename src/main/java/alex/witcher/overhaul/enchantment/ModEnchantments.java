package alex.witcher.overhaul.enchantment;

import alex.witcher.overhaul.utils.ModLib;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.registry.Registry;

public class ModEnchantments {

  public static final Enchantment WOLVEN_CHEST_ENCHANTMENT = WolvenChestEnchantment.INSTANCE;
  public static final Enchantment WOLVEN_HELMET_ENCHANTMENT = WolvenHelmetEnchantment.INSTANCE;
  public static final Enchantment WOLVEN_LEGGINGS_ENCHANTMENT = WolvenLeggingsEnchantment.INSTANCE;
  public static final Enchantment WOLVEN_BOOTS_ENCHANTMENT = WolvenBootsEnchantment.INSTANCE;

  public static void register() {
    Registry.register(Registry.ENCHANTMENT, ModLib.id("wolven_armour"), WOLVEN_CHEST_ENCHANTMENT);
    Registry.register(Registry.ENCHANTMENT, ModLib.id("wolven_helmet"), WOLVEN_HELMET_ENCHANTMENT);
    Registry.register(Registry.ENCHANTMENT, ModLib.id("wolven_leggings"), WOLVEN_LEGGINGS_ENCHANTMENT);
    Registry.register(Registry.ENCHANTMENT, ModLib.id("wolven_boots"), WOLVEN_BOOTS_ENCHANTMENT);
  }
}
