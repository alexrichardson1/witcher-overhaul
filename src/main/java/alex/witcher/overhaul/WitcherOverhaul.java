package alex.witcher.overhaul;

import alex.witcher.overhaul.block.ModBlocks;
import alex.witcher.overhaul.enchantment.ModEnchantments;
import alex.witcher.overhaul.item.ModItems;
import net.fabricmc.api.ModInitializer;

public class WitcherOverhaul implements ModInitializer {

  @Override
  public void onInitialize() {
    ModBlocks.register();
    ModEnchantments.register();
    ModItems.register();
  }
}
