package net.theelementguy.moremetals.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.fml.common.Mod;
import net.theelementguy.moremetals.MoreMetalsMod;
import net.theelementguy.moremetals.block.ModBlocks;
import net.theelementguy.moremetals.item.ModItems;
import net.theelementguy.moremetals.util.ModUtil;

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
            return "More Metals Recipes";
        }
    }

    @Override
    protected void buildRecipes() {
        List<ItemLike> CUBIC_ZIRCONIA_SMELTABLES = List.of(ModItems.RAW_CUBIC_ZIRCONIA, ModBlocks.CUBIC_ZIRCONIA_ORE, ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE);

        List<ItemLike> CELESTIAL_BRONZE_SMELTABLES = List.of();

        List<ItemLike> TIN_SMELTABLES = List.of(ModBlocks.TIN_ORE, ModBlocks.DEEPSLATE_TIN_ORE);

        List<ItemLike> RUBIDIUM_SMELTABLES = List.of(ModBlocks.NETHER_RUBIDIUM_ORE);

        List<ItemLike> STARSHARD_SMELTABLES = List.of(ModBlocks.END_STARSHARD_ORE);

        blockRecipe(ModItems.CUBIC_ZIRCONIA.get(), ModBlocks.CUBIC_ZIRCONIA_BLOCK.asItem(), this.output);

        blockRecipe(ModItems.RAW_CUBIC_ZIRCONIA.get(), ModBlocks.RAW_CUBIC_ZIRCONIA_BLOCK.asItem(), this.output);

        //blockRecipe(ModItems.CELESTIAL_BRONZE_INGOT.get(), ModBlocks.CELESTIAL_BRONZE_BLOCK.asItem(), this.output);

        //blockRecipe(ModItems.RAW_CELESTIAL_BRONZE.get(), ModBlocks.RAW_CELESTIAL_BRONZE_BLOCK.asItem(), this.output);

        blockRecipe(ModItems.TIN_SCRAPS.get(), ModBlocks.TIN_BLOCK.asItem(), this.output);

        blockRecipe(ModItems.RUBIDIUM.get(), ModBlocks.RUBIDIUM_BLOCK.asItem(), this.output);

        blockRecipe(ModItems.STARSHARD.get(), ModBlocks.STARSHARD_BLOCK.asItem(), this.output);

        blockRecipe(ModItems.BRONZE_INGOT.get(), ModBlocks.BRONZE_BLOCK.asItem(), this.output);

        swordRecipe(ModItems.CUBIC_ZIRCONIA_SWORD.get(), ModItems.CUBIC_ZIRCONIA.get(), "has_cz", this.output);

        axeRecipe(ModItems.CUBIC_ZIRCONIA_AXE.get(), ModItems.CUBIC_ZIRCONIA.get(), "has_cz", this.output);

        pickaxeRecipe(ModItems.CUBIC_ZIRCONIA_PICKAXE.get(), ModItems.CUBIC_ZIRCONIA.get(), "has_cz", this.output);

        shovelRecipe(ModItems.CUBIC_ZIRCONIA_SHOVEL.get(), ModItems.CUBIC_ZIRCONIA.get(), "has_cz", this.output);

        hoeRecipe(ModItems.CUBIC_ZIRCONIA_HOE.get(), ModItems.CUBIC_ZIRCONIA.get(), "has_cz", this.output);

        helmetRecipe(ModItems.CUBIC_ZIRCONIA_HELMET.get(), ModItems.CUBIC_ZIRCONIA.get(), "has_cz", this.output);

        chestplateRecipe(ModItems.CUBIC_ZIRCONIA_CHESTPLATE.get(), ModItems.CUBIC_ZIRCONIA.get(), "has_cz", this.output);

        leggingsRecipe(ModItems.CUBIC_ZIRCONIA_LEGGINGS.get(), ModItems.CUBIC_ZIRCONIA.get(), "has_cz", this.output);

        bootsRecipe(ModItems.CUBIC_ZIRCONIA_BOOTS.get(), ModItems.CUBIC_ZIRCONIA.get(), "has_cz", this.output);

        //Not doing this anymore:
        //swordRecipe(ModItems.CELESTIAL_BRRONZE_SWORD.get(), ModItems.CELESTIAL_BRONZE_INGOT.get(), "has_cb", this.output);

        SmithingTransformRecipeBuilder.smithing(Ingredient.of(ModItems.CELESTIAL_BRONZE_UPGRADE_SMITHING_TEMPLATE), Ingredient.of(ModItems.BRONZE_SWORD), Ingredient.of(Items.NETHER_STAR), RecipeCategory.COMBAT, ModItems.CELESTIAL_BRRONZE_SWORD.get()).unlocks("has_ns", has(Items.NETHER_STAR)).save(this.output, ModUtil.createRecipeResourceKey("celestial_bronze_sword_smithing"));

        swordRecipe(ModItems.RUBIDIUM_SWORD.get(), ModItems.RUBIDIUM.get(), "has_r", this.output);

        axeRecipe(ModItems.RUBIDIUM_AXE.get(), ModItems.RUBIDIUM.get(), "has_r", this.output);

        pickaxeRecipe(ModItems.RUBIDIUM_PICKAXE.get(), ModItems.RUBIDIUM.get(), "has_r", this.output);

        shovelRecipe(ModItems.RUBIDIUM_SHOVEL.get(), ModItems.RUBIDIUM.get(), "has_r", this.output);

        hoeRecipe(ModItems.RUBIDIUM_HOE.get(), ModItems.RUBIDIUM.get(), "has_r", this.output);

        helmetRecipe(ModItems.RUBIDIUM_HELMET.get(), ModItems.RUBIDIUM.get(), "has_r", this.output);

        chestplateRecipe(ModItems.RUBIDIUM_CHESTPLATE.get(), ModItems.RUBIDIUM.get(), "has_r", this.output);

        leggingsRecipe(ModItems.RUBIDIUM_LEGGINGS.get(), ModItems.RUBIDIUM.get(), "has_r", this.output);

        bootsRecipe(ModItems.RUBIDIUM_BOOTS.get(), ModItems.RUBIDIUM.get(), "has_r", this.output);

        swordRecipe(ModItems.STARSHARD_SWORD.get(), ModItems.STARSHARD.get(), "has_s", this.output);

        axeRecipe(ModItems.STARSHARD_AXE.get(), ModItems.STARSHARD.get(), "has_s", this.output);

        pickaxeRecipe(ModItems.STARSHARD_PICKAXE.get(), ModItems.STARSHARD.get(), "has_s", this.output);

        shovelRecipe(ModItems.STARSHARD_SHOVEL.get(), ModItems.STARSHARD.get(), "has_s", this.output);

        hoeRecipe(ModItems.STARSHARD_HOE.get(), ModItems.STARSHARD.get(), "has_s", this.output);

        helmetRecipe(ModItems.STARSHARD_HELMET.get(), ModItems.STARSHARD.get(), "has_s", this.output);

        chestplateRecipe(ModItems.STARSHARD_CHESTPLATE.get(), ModItems.STARSHARD.get(), "has_s", this.output);

        leggingsRecipe(ModItems.STARSHARD_LEGGINGS.get(), ModItems.STARSHARD.get(), "has_s", this.output);

        bootsRecipe(ModItems.STARSHARD_BOOTS.get(), ModItems.STARSHARD.get(), "has_s", this.output);

        allEquipmentRecipes(ModItems.BRONZE_SWORD.get(), ModItems.BRONZE_AXE.get(), ModItems.BRONZE_PICKAXE.get(), ModItems.BRONZE_SHOVEL.get(), ModItems.BRONZE_HOE.get(), ModItems.BRONZE_HELMET.get(), ModItems.BRONZE_CHESTPLATE.get(), ModItems.BRONZE_LEGGINGS.get(), ModItems.BRONZE_BOOTS.get(), ModItems.BRONZE_INGOT.get(), "has_b", this.output);

        //this.shapeless(RecipeCategory.MISC, ModItems.CELESTIAL_BRONZE_INGOT).requires(Items.COPPER_INGOT, 4).requires(ModItems.TIN_SCRAPS).requires(Items.NETHER_STAR).unlockedBy("has_ns", has(Items.NETHER_STAR)).save(this.output, ResourceKey.create(Registries.RECIPE, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "celestial_bronze_forging")));

        this.shapeless(RecipeCategory.MISC, ModItems.BRONZE_INGOT).requires(Items.COPPER_INGOT, 4).requires(ModItems.TIN_SCRAPS).unlockedBy("has_c", has(Items.COPPER_INGOT)).save(this.output, ModUtil.createRecipeResourceKey("bronze_forging"));

        allOreSmelting(ModItems.CUBIC_ZIRCONIA.get(), CUBIC_ZIRCONIA_SMELTABLES, 1.0f, "cz", this.output);

        //allOreSmelting(ModItems.CELESTIAL_BRONZE_INGOT.get(), CELESTIAL_BRONZE_SMELTABLES, 1.0f, "cb", this.output);

        allOreSmelting(ModItems.TIN_SCRAPS.get(), TIN_SMELTABLES, 0.7f, "t", this.output);

        allOreSmelting(ModItems.RUBIDIUM.get(), RUBIDIUM_SMELTABLES, 1.3f, "r", this.output);

        allOreSmelting(ModItems.STARSHARD.get(), STARSHARD_SMELTABLES, 1.5f, "s", this.output);

    }

    protected void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike)).save(recipeOutput, MoreMetalsMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }

    protected void swordRecipe(Item result, Item ingredient, String advancementName, RecipeOutput output) {
        shaped(RecipeCategory.COMBAT, result).pattern(" I ").pattern(" I ").pattern(" S ").define('I', ingredient).define('S', Items.STICK).unlockedBy(advancementName, has(ingredient)).save(output);
    }

    protected void axeRecipe(Item result, Item ingredient, String advancementName, RecipeOutput output) {
        shaped(RecipeCategory.TOOLS, result).pattern("II ").pattern("IS ").pattern(" S ").define('I', ingredient).define('S', Items.STICK).unlockedBy(advancementName, has(ingredient)).save(output);


    }

    protected void pickaxeRecipe(Item result, Item ingredient, String advancementName, RecipeOutput output) {
        shaped(RecipeCategory.TOOLS, result).pattern("III").pattern(" S ").pattern(" S ").define('I', ingredient).define('S', Items.STICK).unlockedBy(advancementName, has(ingredient)).save(output);
    }

    protected void shovelRecipe(Item result, Item ingredient, String advancementName, RecipeOutput output) {
        shaped(RecipeCategory.TOOLS, result).pattern(" I ").pattern(" S ").pattern(" S ").define('I', ingredient).define('S', Items.STICK).unlockedBy(advancementName, has(ingredient)).save(output);
    }

    protected void hoeRecipe(Item result, Item ingredient, String advancementName, RecipeOutput output) {
        shaped(RecipeCategory.COMBAT, result).pattern("II ").pattern(" S ").pattern(" S ").define('I', ingredient).define('S', Items.STICK).unlockedBy(advancementName, has(ingredient)).save(output);
    }

    protected void helmetRecipe(Item result, Item ingredient, String advancementName, RecipeOutput output) {
        shaped(RecipeCategory.COMBAT, result).pattern("III").pattern("I I").pattern("   ").define('I', ingredient).unlockedBy(advancementName, has(ingredient)).save(output);
    }

    protected void chestplateRecipe(Item result, Item ingredient, String advancementName, RecipeOutput output) {
        shaped(RecipeCategory.COMBAT, result).pattern("I I").pattern("III").pattern("III").define('I', ingredient).unlockedBy(advancementName, has(ingredient)).save(output);
    }

    protected void leggingsRecipe(Item result, Item ingredient, String advancementName, RecipeOutput output) {
        shaped(RecipeCategory.COMBAT, result).pattern("III").pattern("I I").pattern("I I").define('I', ingredient).unlockedBy(advancementName, has(ingredient)).save(output);
    }

    protected void bootsRecipe(Item result, Item ingredient, String advancementName, RecipeOutput output) {
        shaped(RecipeCategory.COMBAT, result).pattern("   ").pattern("I I").pattern("I I").define('I', ingredient).unlockedBy(advancementName, has(ingredient)).save(output);
    }

    protected void blockRecipe(Item material, Item block, RecipeOutput output) {
        shapeless(RecipeCategory.MISC, material, 9).requires(block).unlockedBy("has_" + getItemName(material), has(block)).save(output);

        shapeless(RecipeCategory.MISC, block).requires(material, 9).unlockedBy("has_" + getItemName(material) + "_block", has(block)).save(output);
    }

    protected void allOreSmelting(Item material, List<ItemLike> smeltables, float experience, String group, RecipeOutput output) {
        oreSmelting(output, smeltables, RecipeCategory.MISC, material, experience, 200, group);
        oreBlasting(output, smeltables, RecipeCategory.MISC, material, experience, 100, group);
    }

    protected void allEquipmentRecipes(Item sword, Item axe, Item pickaxe, Item shovel, Item hoe, Item helmet, Item chestplate, Item leggings, Item boots, Item material, String advancementNames, RecipeOutput output) {
        swordRecipe(sword, material, advancementNames, output);
        axeRecipe(axe, material, advancementNames, output);
        pickaxeRecipe(pickaxe, material, advancementNames, output);
        shovelRecipe(shovel, material, advancementNames, output);
        hoeRecipe(hoe, material, advancementNames, output);

        helmetRecipe(helmet, material, advancementNames, output);
        chestplateRecipe(chestplate, material, advancementNames, output);
        leggingsRecipe(leggings, material, advancementNames, output);
        bootsRecipe(boots, material, advancementNames, output);
    }
}
