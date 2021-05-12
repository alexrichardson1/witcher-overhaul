package alex.witcher.overhaul.utils;

public enum MiningLevel {
  WOODENORGOLDEN(0),
  STONE(1),
  IRON(2),
  DIAMOND(3),
  NETHERITE(4);

  public final int level;

  MiningLevel(int level) {
    this.level = level;
  }
}
