package alex.witcher.overhaul.item;

import alex.witcher.overhaul.material.SilverToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;

public class SilverSword extends SwordItem {

  public SilverSword() {
    super(SilverToolMaterial.INSTANCE, -1, -0.1F, new Item.Settings().group(ItemGroup.TOOLS));
  }
}
