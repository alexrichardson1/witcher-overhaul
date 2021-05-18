package alex.witcher.overhaul.block;

import alex.witcher.overhaul.utils.MiningLevel;
import alex.witcher.overhaul.utils.ModLib;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class ModBlocks {

  public static final Block SILVER_BLOCK = new Block(
      FabricBlockSettings.of(Material.METAL).strength(5, 6).sounds(BlockSoundGroup.METAL)
          .breakByTool(FabricToolTags.PICKAXES, MiningLevel.STONE.level));
  public static final Block SILVER_ORE = new Block(
      FabricBlockSettings.of(Material.STONE).strength(3, 3).sounds(BlockSoundGroup.STONE)
          .breakByTool(FabricToolTags.PICKAXES, MiningLevel.STONE.level));
  public static ConfiguredFeature<?, ?> SILVER_ORE_OVERWORLD = Feature.ORE
      .configure(new OreFeatureConfig(
          OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, SILVER_ORE.getDefaultState(),
          9)) // vein size
      .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
          0,
          0, // min y level
          64))) // max y level
      .spreadHorizontally()
      .repeat(20); // number of veins per chunk
  public static final Block DIMERITIUM_BLOCK = new Block(
      FabricBlockSettings.of(Material.METAL).strength(5, 6).sounds(BlockSoundGroup.METAL)
          .breakByTool(FabricToolTags.PICKAXES, MiningLevel.IRON.level));
  public static final Block DIMERITIUM_ORE = new DimeritiumOreBlock();
  public static ConfiguredFeature<?, ?> DIMERITIUM_ORE_OVERWORLD = Feature.ORE
      .configure(new OreFeatureConfig(
          OreFeatureConfig.Rules.BASE_STONE_OVERWORLD, DIMERITIUM_ORE.getDefaultState(),
          9)) // vein size
      .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
          0,
          0, // min y level
          64))) // max y level
      .spreadHorizontally()
      .repeat(20); // number of veins per chunk


  public static void register() {
    // silver block
    Registry.register(Registry.BLOCK, ModLib.id("silver_block"), SILVER_BLOCK);
    Registry.register(Registry.ITEM, ModLib.id("silver_block"),
        new BlockItem(SILVER_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    // silver ore
    Registry.register(Registry.BLOCK, ModLib.id("silver_ore"), SILVER_ORE);
    Registry.register(Registry.ITEM, ModLib.id("silver_ore"),
        new BlockItem(SILVER_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    // silver ore world generation
    RegistryKey<ConfiguredFeature<?, ?>> silverOreOverworld = RegistryKey
        .of(Registry.CONFIGURED_FEATURE_WORLDGEN, ModLib.id("silver_ore"));
    Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, silverOreOverworld.getValue(),
        SILVER_ORE_OVERWORLD);
    BiomeModifications
        .addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
            silverOreOverworld);
    // dimeritium block
    Registry.register(Registry.BLOCK, ModLib.id("dimeritium_block"), DIMERITIUM_BLOCK);
    Registry.register(Registry.ITEM, ModLib.id("dimeritium_block"),
        new BlockItem(DIMERITIUM_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    // dimeritium ore
    Registry.register(Registry.BLOCK, ModLib.id("dimeritium_ore"), DIMERITIUM_ORE);
    Registry.register(Registry.ITEM, ModLib.id("dimeritium_ore"),
        new BlockItem(DIMERITIUM_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS)));
    // dimeritium ore world generation
    RegistryKey<ConfiguredFeature<?, ?>> dimeritiumOreOverworld = RegistryKey
        .of(Registry.CONFIGURED_FEATURE_WORLDGEN, ModLib.id("dimeritium_ore"));
    Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, dimeritiumOreOverworld.getValue(),
        DIMERITIUM_ORE_OVERWORLD);
    BiomeModifications
        .addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
            dimeritiumOreOverworld);
  }

}
