package net.theelementguy.moremetals.item;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.theelementguy.moremetals.util.ModTags;

public class ModToolTiers {

    public static final Tier CUBIC_ZIRCONIA = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_CUBIC_ZIRCONIA_TOOL, 2501, 7.0f, 2.0f, 14, () -> Ingredient.of(ModItems.CUBIC_ZIRCONIA));

    public static final Tier CELESTIAL_BRONZE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_CELESTIAL_BRONZE_TOOL, 1651, 8.0f, 4.0f, 25, () -> Ingredient.of(ModItems.CELESTIAL_BRONZE_INGOT));

    public static final Tier RUBIDIUM = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_RUBIDIUM_TOOL, 2401, 12.0f, 3.0f, 17, () -> Ingredient.of(ModItems.RUBIDIUM));

    public static final Tier STARSHARD = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_STARSHARD_TOOL, 3001, 15.0f, 5.0f, 13, () -> Ingredient.of(ModItems.STARSHARD));

    public static final Tier BRONZE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_BRONZE_TOOL, 180, 5.0f, 1.0f, 13, () -> Ingredient.of(ModItems.BRONZE_INGOT));

}
