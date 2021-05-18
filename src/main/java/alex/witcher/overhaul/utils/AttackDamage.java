package alex.witcher.overhaul.utils;

public enum AttackDamage {
  NOCHANGE(-1),
  PLUSONE(0),
  PLUSTWO(1);

  public final int damage;

  AttackDamage(int damage) {
    this.damage = damage;
  }
}
