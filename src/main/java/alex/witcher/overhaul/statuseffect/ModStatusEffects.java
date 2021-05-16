package alex.witcher.overhaul.statuseffect;

import alex.witcher.overhaul.utils.ModLib;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.util.registry.Registry;

public class ModStatusEffects {

  public static final StatusEffect BLEED = BleedStatusEffect.INSTANCE;

  public static void register() {
    Registry.register(Registry.STATUS_EFFECT, ModLib.id("bleed"), BLEED);
  }

}
