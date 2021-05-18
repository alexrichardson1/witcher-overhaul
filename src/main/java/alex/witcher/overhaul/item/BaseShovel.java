package alex.witcher.overhaul.item;

import alex.witcher.overhaul.utils.AttackDamage;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ToolMaterial;

public class BaseShovel extends ShovelItem {

  public BaseShovel(ToolMaterial material) {
    super(material, AttackDamage.NOCHANGE.damage, -0.1F,
        new Item.Settings().group(ItemGroup.TOOLS));
  }
}
