package net.theelementguy.mmmythics.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.theelementguy.mmmythics.CelestialBronzeMod;
import net.theelementguy.mmmythics.item.ModItems;

import java.util.concurrent.CompletableFuture;

import static net.minecraft.data.recipes.ShapedRecipeBuilder.shaped;
import static net.minecraft.data.recipes.ShapelessRecipeBuilder.shapeless;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> provider) {
        super(output, provider);
    }

    @Override
    protected void buildRecipes(RecipeOutput output) {

        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.CELESTIAL_BRONZE_UPGRADE_SMITHING_TEMPLATE), Ingredient.of(net.theelementguy.tegmoremetals.item.ModItems.BRONZE_SWORD), Ingredient.of(Items.NETHER_STAR), RecipeCategory.COMBAT, ModItems.CELESTIAL_BRRONZE_SWORD.get()).unlocks("has_ns", has(Items.NETHER_STAR)).save(output, ResourceLocation.fromNamespaceAndPath(CelestialBronzeMod.MOD_ID, "celestial_bronze_sword_smithing"));

        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.IMPERIAL_GOLD_UPGRADE_SMITHING_TEMPLATE), Ingredient.of(Items.GOLDEN_SWORD), Ingredient.of(Items.NETHER_STAR), RecipeCategory.COMBAT, ModItems.IMPERIAL_GOLD_SWORD.get()).unlocks("has_ns", has(Items.NETHER_STAR)).save(output, ResourceLocation.fromNamespaceAndPath(CelestialBronzeMod.MOD_ID, "imperial_gold_sword_smithing"));

    }

}
