package net.theelementguy.celestialbronze.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.fml.common.Mod;
import net.theelementguy.celestialbronze.util.ModUtil;
import net.theelementguy.moremetals.MoreMetalsMod;
import net.theelementguy.moremetals.block.ModBlocks;
import net.theelementguy.moremetals.item.ModItems;

import java.util.List;
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

        SmithingTransformRecipeBuilder.smithing(Ingredient.of(net.theelementguy.celestialbronze.item.ModItems.CELESTIAL_BRONZE_UPGRADE_SMITHING_TEMPLATE), Ingredient.of(ModItems.BRONZE_SWORD), Ingredient.of(Items.NETHER_STAR), RecipeCategory.COMBAT, net.theelementguy.celestialbronze.item.ModItems.CELESTIAL_BRRONZE_SWORD.get()).unlocks("has_ns", has(Items.NETHER_STAR)).save(this.output, ModUtil.createRecipeResourceKey("celestial_bronze_sword_smithing"));

    }
}