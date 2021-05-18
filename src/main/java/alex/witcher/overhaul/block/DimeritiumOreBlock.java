package alex.witcher.overhaul.block;

import java.util.Random;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.OreBlock;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;

public class DimeritiumOreBlock extends OreBlock {

  public DimeritiumOreBlock() {
    super(FabricBlockSettings.copy(Blocks.DIAMOND_ORE));
  }

  @Override
  protected int getExperienceWhenMined(Random random) {
    return MathHelper.nextInt(random, 3, 7);
  }

  @Override
  public void onStacksDropped(BlockState state, ServerWorld world, BlockPos pos, ItemStack stack) {
    if (EnchantmentHelper.getLevel(Enchantments.SILK_TOUCH, stack) == 0) {
      int i = this.getExperienceWhenMined(world.random);
      if (i > 0) {
        this.dropExperience(world, pos, i);
      }
    }
  }
}
