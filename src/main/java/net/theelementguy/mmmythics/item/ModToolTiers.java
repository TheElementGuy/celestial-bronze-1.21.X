package net.theelementguy.mmmythics.item;

import com.mojang.serialization.Decoder;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.neoforge.common.SimpleTier;
import net.theelementguy.mmmythics.util.ModTags;

public class ModToolTiers {

    public static final Tier CELESTIAL_BRONZE = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_CELESTIAL_BRONZE_TOOL, 1651, 8.0f, 4.0f, 25, () -> Ingredient.of(Items.NETHER_STAR));

    public static final Tier IMPERIAL_GOLD = new SimpleTier(ModTags.Blocks.INCORRECT_FOR_IMPERIAL_GOLD_TOOL, 751, 9.0f, 5.0f, 25, () -> Ingredient.of(Items.NETHER_STAR));

}
