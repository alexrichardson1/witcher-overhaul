package alex.witcher.overhaul.item;

import alex.witcher.overhaul.material.DimeritiumArmorMaterial;
import alex.witcher.overhaul.material.SilverToolMaterial;
import alex.witcher.overhaul.utils.ModLib;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;

public class ModItems {

  public static final Item SILVER_INGOT = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
  public static final Item SILVER_NUGGET = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
  public static final Item SILVER_PICKAXE = new BasePickaxe(SilverToolMaterial.INSTANCE);
  public static final Item SILVER_AXE = new BaseAxe(SilverToolMaterial.INSTANCE);
  public static final Item SILVER_HOE = new BaseHoe(SilverToolMaterial.INSTANCE);
  public static final Item SILVER_SHOVEL = new BaseShovel(SilverToolMaterial.INSTANCE);
  public static final Item SILVER_SWORD = new SilverSword();
  public static final Item DIMERITIUM_INGOT = new Item(
      new Item.Settings().group(ItemGroup.MATERIALS));

  public static final Item DIMERITIUM_HELMET = new ArmorItemBuilder()
      .withMaterial(DimeritiumArmorMaterial.INSTANCE).withSlot(EquipmentSlot.HEAD)
      .withSettings(new Item.Settings().group(ItemGroup.COMBAT)).build();
  public static final Item DIMERITIUM_CHESTPLATE = new ArmorItemBuilder()
      .withMaterial(DimeritiumArmorMaterial.INSTANCE).withSlot(EquipmentSlot.CHEST)
      .withSettings(new Item.Settings().group(ItemGroup.COMBAT)).build();
  public static final Item DIMERITIUM_LEGGINGS = new ArmorItemBuilder()
      .withMaterial(DimeritiumArmorMaterial.INSTANCE).withSlot(EquipmentSlot.LEGS)
      .withSettings(new Item.Settings().group(ItemGroup.COMBAT)).build();
  public static final Item DIMERITIUM_BOOTS = new ArmorItemBuilder()
      .withMaterial(DimeritiumArmorMaterial.INSTANCE).withSlot(EquipmentSlot.FEET)
      .withSettings(new Item.Settings().group(ItemGroup.COMBAT)).build();

  public static void register() {
    // silver
    Registry.register(Registry.ITEM, ModLib.id("silver_ingot"), SILVER_INGOT);
    Registry.register(Registry.ITEM, ModLib.id("silver_nugget"), SILVER_NUGGET);
    // silver tools
    Registry.register(Registry.ITEM, ModLib.id("silver_pickaxe"), SILVER_PICKAXE);
    Registry.register(Registry.ITEM, ModLib.id("silver_axe"), SILVER_AXE);
    Registry.register(Registry.ITEM, ModLib.id("silver_hoe"), SILVER_HOE);
    Registry.register(Registry.ITEM, ModLib.id("silver_shovel"), SILVER_SHOVEL);
    Registry.register(Registry.ITEM, ModLib.id("silver_sword"), SILVER_SWORD);
    // dimeritium
    Registry.register(Registry.ITEM, ModLib.id("dimeritium_ingot"), DIMERITIUM_INGOT);
    // dimeritium armour
    Registry.register(Registry.ITEM, ModLib.id("dimeritium_helmet"), DIMERITIUM_HELMET);
    Registry.register(Registry.ITEM, ModLib.id("dimeritium_chestplate"), DIMERITIUM_CHESTPLATE);
    Registry.register(Registry.ITEM, ModLib.id("dimeritium_leggings"), DIMERITIUM_LEGGINGS);
    Registry.register(Registry.ITEM, ModLib.id("dimeritium_boots"), DIMERITIUM_BOOTS);
  }
}
