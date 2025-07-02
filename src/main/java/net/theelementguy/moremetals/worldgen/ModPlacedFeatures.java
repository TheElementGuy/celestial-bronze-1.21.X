package net.theelementguy.moremetals.worldgen;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.heightproviders.HeightProvider;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.theelementguy.moremetals.MoreMetalsMod;

import java.util.List;

public class ModPlacedFeatures {

    public static final ResourceKey<PlacedFeature> CUBIC_ZIRCONIA_LARGE_ORE_PLACED_KEY = registerKey("cubic_zirconia_large_ore_placed");

    public static final ResourceKey<PlacedFeature> CUBIC_ZIRCONIA_MEDIUM_ORE_PLACED_KEY = registerKey("cubic_zirconia_medium_ore_placed");

    public static final ResourceKey<PlacedFeature> CUBIC_ZIRCONIA_SMALL_ORE_PLACED_KEY = registerKey("cubic_zirconia_small_ore_placed");

    public static final ResourceKey<PlacedFeature> TIN_SMALL_ORE_PLACED_KEY = registerKey("tin_small_ore_placed");

    public static final ResourceKey<PlacedFeature> TIN_LARGE_ORE_PLACED_KEY = registerKey("tin_large_ore_placed");

    public static final ResourceKey<PlacedFeature> RUBIDIUM_LARGE_ORE_PLACED_KEY = registerKey("rubidium_large_ore_placed");

    public static final ResourceKey<PlacedFeature> RUBIDIUM_SMALL_ORE_PLACED_KEY = registerKey("rubidium_small_ore_placed");

    public static final ResourceKey<PlacedFeature> STARSHARD_LARGEE_ORE_PLACED_KEY = registerKey("starshard_large_ore_placed");

    public static final ResourceKey<PlacedFeature> STARSHARD_SMALL_ORE_PLACED_KEY = registerKey("starshard_small_ore_placed");

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        register(context, CUBIC_ZIRCONIA_MEDIUM_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CUBIC_ZIRCONIA_MEDIUM_ORE_KEY), ModOrePlacement.commonOrePlacement(2, HeightRangePlacement.triangle(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(48))));

        register(context, CUBIC_ZIRCONIA_SMALL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CUBIC_ZIRCONIA_SMALL_ORE_KEY), ModOrePlacement.commonOrePlacement(8, HeightRangePlacement.triangle(VerticalAnchor.absolute(-32), VerticalAnchor.absolute(48))));

        register(context, CUBIC_ZIRCONIA_LARGE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.CUBIC_ZIRCONIA_LARGE_ORE_KEY), ModOrePlacement.rareOrePlacement(8, HeightRangePlacement.triangle(VerticalAnchor.absolute(-48), VerticalAnchor.absolute(0))));

        register(context, TIN_SMALL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TIN_SMALL_ORE_KEY), ModOrePlacement.commonOrePlacement(8, HeightRangePlacement.uniform(VerticalAnchor.absolute(4), VerticalAnchor.absolute(80))));

        register(context, TIN_LARGE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.TIN_LARGE_ORE_KEY), ModOrePlacement.commonOrePlacement(5, HeightRangePlacement.triangle(VerticalAnchor.absolute(-16), VerticalAnchor.absolute(48))));

        register(context, RUBIDIUM_LARGE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RUBIDIUM_LARGE_ORE_KEY), ModOrePlacement.rareOrePlacement(1, HeightRangePlacement.uniform(VerticalAnchor.absolute(30), VerticalAnchor.absolute(46))));

        register(context, RUBIDIUM_SMALL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.RUBIDIUM_SMALL_ORE_KEY), ModOrePlacement.commonOrePlacement(4, HeightRangePlacement.uniform(VerticalAnchor.absolute(20), VerticalAnchor.absolute(56))));

        register(context, STARSHARD_LARGEE_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.STARSHARD_LARGE_ORE_KEY), ModOrePlacement.commonOrePlacement(5, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));

        register(context, STARSHARD_SMALL_ORE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.STARSHARD_SMALL_ORE_KEY), ModOrePlacement.commonOrePlacement(20, HeightRangePlacement.uniform(VerticalAnchor.absolute(-64), VerticalAnchor.absolute(80))));
    }

    private static ResourceKey<PlacedFeature> registerKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, name));
    }

    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }
}