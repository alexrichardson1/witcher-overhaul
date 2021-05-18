package alex.witcher.overhaul.utils;

public enum AttackDamage {
  NOCHANGE(-1),
  PLUSONE(0),
  PLUSTWO(1);

  public final int attackDamageModifier;

  AttackDamage(int attackDamageModifier) {
    this.attackDamageModifier = attackDamageModifier;
  }
}
