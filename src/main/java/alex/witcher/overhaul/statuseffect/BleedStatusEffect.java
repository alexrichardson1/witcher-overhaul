package alex.witcher.overhaul.statuseffect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectType;

public class BleedStatusEffect extends StatusEffect {

  public final static BleedStatusEffect INSTANCE = new BleedStatusEffect();

  private BleedStatusEffect() {
    super(StatusEffectType.HARMFUL, 0xFF0000);
  }

  /*** This method is called every tick ***/
  @Override
  public boolean canApplyUpdateEffect(int duration, int amplifier) {
    return true;
  }

  /*** This method is called when it applies the status effect. ***/
  @Override
  public void applyUpdateEffect(LivingEntity entity, int amplifier) {
    final float DAMAGE_PER_UPDATE = 2F;
    if (entity.getHealth() > DAMAGE_PER_UPDATE) {
      entity.damage(DamageSource.MAGIC, DAMAGE_PER_UPDATE);
    }
  }
}


