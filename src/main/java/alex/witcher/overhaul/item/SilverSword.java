package alex.witcher.overhaul.item;

import alex.witcher.overhaul.material.SilverToolMaterial;
import alex.witcher.overhaul.utils.AttackDamage;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;

public class SilverSword extends SwordItem {

  public SilverSword() {
    super(SilverToolMaterial.INSTANCE, AttackDamage.NOCHANGE.damage, -0.1F,
        new Item.Settings().group(ItemGroup.COMBAT));
  }
}
