package alex.witcher.overhaul.utils;

import net.minecraft.util.Identifier;

public class ModLib {

  public static final String MOD_ID = "witcheroverhaul";
  public static final int TICKS_PER_SECOND = 20;

  public static Identifier id(String name) {
    return new Identifier(MOD_ID, name);
  }
}
