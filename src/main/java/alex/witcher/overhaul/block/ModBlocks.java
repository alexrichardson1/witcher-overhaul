package alex.witcher.overhaul.block;

import alex.witcher.overhaul.utils.MiningLevel;
import alex.witcher.overhaul.utils.ModLib;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

  public static final Block SILVER_BLOCK = new Block(
      FabricBlockSettings.of(Material.METAL).strength(5, 6).sounds(BlockSoundGroup.METAL)
          .breakByTool(FabricToolTags.PICKAXES, MiningLevel.STONE.level));
  public static final Block SILVER_ORE = new Block(
      FabricBlockSettings.of(Material.STONE).strength(3, 3).sounds(BlockSoundGroup.STONE)
          .breakByTool(FabricToolTags.PICKAXES, MiningLevel.STONE.level));
  public static final Block DIMERITIUM_BLOCK = new Block(
      FabricBlockSettings.of(Material.METAL).strength(5, 6).sounds(BlockSoundGroup.METAL)
          .breakByTool(FabricToolTags.PICKAXES, MiningLevel.IRON.level));
  public static final Block DIMERITIUM_ORE = new Block(
      FabricBlockSettings.of(Material.STONE).strength(3, 3).sounds(BlockSoundGroup.STONE)
          .breakByTool(FabricToolTags.PICKAXES, MiningLevel.IRON.level));


  public static void register() {
    // silver block
    Registry.register(Registry.BLOCK, ModLib.id("silver_block"), SILVER_BLOCK);
    Registry.register(Registry.ITEM, ModLib.id("silver_block"),
        new BlockItem(SILVER_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    // silver ore
    // TODO: silver ore world generation
    Registry.register(Registry.BLOCK, ModLib.id("silver_ore"), SILVER_ORE);
    Registry.register(Registry.ITEM, ModLib.id("silver_ore"),
        new BlockItem(SILVER_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    // dimeritium block
    Registry.register(Registry.BLOCK, ModLib.id("dimeritium_block"), DIMERITIUM_BLOCK);
    Registry.register(Registry.ITEM, ModLib.id("dimeritium_block"),
        new BlockItem(DIMERITIUM_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    // dimeritium ore
    // TODO: dimeritium ore world generation
    Registry.register(Registry.BLOCK, ModLib.id("dimeritium_ore"), DIMERITIUM_ORE);
    Registry.register(Registry.ITEM, ModLib.id("dimeritium_ore"),
        new BlockItem(SILVER_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
  }

}
