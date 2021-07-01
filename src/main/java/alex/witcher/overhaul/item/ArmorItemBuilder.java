package alex.witcher.overhaul.item;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;

public class ArmorItemBuilder {

  private ArmorMaterial material;
  private EquipmentSlot slot;
  private Item.Settings settings;


  public ArmorItem build() {
    return new ArmorItem(material, slot, settings);
  }

  public ArmorItemBuilder withMaterial(ArmorMaterial material) {
    this.material = material;
    return this;
  }

  public ArmorItemBuilder withSlot(EquipmentSlot slot) {
    this.slot = slot;
    return this;
  }

  public ArmorItemBuilder withSettings(Item.Settings settings) {
    this.settings = settings;
    return this;
  }


}
