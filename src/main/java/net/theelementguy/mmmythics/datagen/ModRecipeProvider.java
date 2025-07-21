package net.theelementguy.mmmythics.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.theelementguy.mmmythics.util.ModUtil;
import net.theelementguy.tegmoremetals.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider {

    protected ModRecipeProvider(HolderLookup.Provider registries, RecipeOutput output) {
        super(registries, output);
    }

    public static class Runner extends RecipeProvider.Runner {

        protected Runner(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> registries) {
            super(packOutput, registries);
        }

        @Override
        protected RecipeProvider createRecipeProvider(HolderLookup.Provider provider, RecipeOutput recipeOutput) {
            return new ModRecipeProvider(provider, recipeOutput);
        }

        @Override
        public String getName() {
            return "Celestial Bronze Recipes";
        }
    }

    @Override
    protected void buildRecipes() {

        SmithingTransformRecipeBuilder.smithing(Ingredient.of(net.theelementguy.mmmythics.item.ModItems.CELESTIAL_BRONZE_UPGRADE_SMITHING_TEMPLATE), Ingredient.of(ModItems.BRONZE_SWORD), Ingredient.of(Items.NETHER_STAR), RecipeCategory.COMBAT, net.theelementguy.mmmythics.item.ModItems.CELESTIAL_BRRONZE_SWORD.get()).unlocks("has_ns", has(Items.NETHER_STAR)).save(this.output, ModUtil.createRecipeResourceKey("celestial_bronze_sword_smithing"));

        SmithingTransformRecipeBuilder.smithing(Ingredient.of(net.theelementguy.mmmythics.item.ModItems.IMPERIAL_GOLD_UPGRADE_SMITHING_TEMPLATE), Ingredient.of(Items.GOLDEN_SWORD), Ingredient.of(Items.NETHER_STAR), RecipeCategory.COMBAT, net.theelementguy.mmmythics.item.ModItems.IMPERIAL_GOLD_SWORD.get()).unlocks("has_ns", has(Items.NETHER_STAR)).save(this.output, ModUtil.createRecipeResourceKey("imperial_gold_sword_smithing"));

    }
}