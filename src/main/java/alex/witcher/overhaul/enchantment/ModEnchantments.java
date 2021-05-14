package alex.witcher.overhaul.enchantment;

import alex.witcher.overhaul.utils.ModLib;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.util.registry.Registry;

public class ModEnchantments {

  private static final Enchantment WOLVEN_CHEST_ENCHANTMENT = WolvenChestEnchantment.INSTANCE;


  public static void register() {
    Registry.register(Registry.ENCHANTMENT, ModLib.id("wolven_chest"), WOLVEN_CHEST_ENCHANTMENT);

  }
}
