package alex.witcher.overhaul.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;

public class BasePickaxe extends PickaxeItem {

  public BasePickaxe(ToolMaterial material) {
    super(material, -1, -0.1F, new Item.Settings().group(ItemGroup.TOOLS));
  }
}
