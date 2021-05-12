package alex.witcher.overhaul.item;

import alex.witcher.overhaul.material.SilverToolMaterial;
import alex.witcher.overhaul.utils.ModLib;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

public class ModItems {

  public static final Item SILVER_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
  public static final Item SILVER_NUGGET = new Item(new Item.Settings().group(ItemGroup.MATERIALS));


  public static void register() {
    // silver
    Registry.register(Registry.ITEM, ModLib.id("silver_ingot"), SILVER_INGOT);
    Registry.register(Registry.ITEM, ModLib.id("silver_nugget"), SILVER_NUGGET);
    // witcher weapons
    Registry.register(Registry.ITEM, ModLib.id("silver_pickaxe"),
        new BasePickaxe(SilverToolMaterial.INSTANCE));
    Registry.register(Registry.ITEM, ModLib.id("silver_axe"),
        new BaseAxe(SilverToolMaterial.INSTANCE));
    Registry.register(Registry.ITEM, ModLib.id("silver_hoe"),
        new BaseHoe(SilverToolMaterial.INSTANCE));
    Registry.register(Registry.ITEM, ModLib.id("silver_shovel"),
        new BaseShovel(SilverToolMaterial.INSTANCE));
    Registry.register(Registry.ITEM, ModLib.id("silver_sword"), new SilverSword());
  }
}
