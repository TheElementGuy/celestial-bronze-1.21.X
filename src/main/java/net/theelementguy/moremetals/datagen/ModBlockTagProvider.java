package net.theelementguy.moremetals.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.theelementguy.moremetals.MoreMetalsMod;
import net.theelementguy.moremetals.util.ModTags;
import org.jetbrains.annotations.Nullable;
import net.theelementguy.moremetals.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {

    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MoreMetalsMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ModBlocks.CUBIC_ZIRCONIA_BLOCK.get()).add(ModBlocks.RAW_CUBIC_ZIRCONIA_BLOCK.get()).add(ModBlocks.CUBIC_ZIRCONIA_ORE.get()).add(ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE.get()).add(ModBlocks.TIN_BLOCK.get()).add(ModBlocks.TIN_ORE.get()).add(ModBlocks.DEEPSLATE_TIN_ORE.get()).add(ModBlocks.RUBIDIUM_BLOCK.get()).add(ModBlocks.STARSHARD_BLOCK.get()).add(ModBlocks.END_STARSHARD_ORE.get()).add(ModBlocks.BRONZE_BLOCK.get());

        tag(BlockTags.NEEDS_IRON_TOOL).add(ModBlocks.CUBIC_ZIRCONIA_BLOCK.get()).add(ModBlocks.RAW_CUBIC_ZIRCONIA_BLOCK.get()).add(ModBlocks.CUBIC_ZIRCONIA_ORE.get()).add(ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE.get());

        tag(BlockTags.NEEDS_STONE_TOOL).add(ModBlocks.TIN_ORE.get()).add(ModBlocks.DEEPSLATE_TIN_ORE.get());

        tag(BlockTags.NEEDS_DIAMOND_TOOL).add(ModBlocks.RUBIDIUM_BLOCK.get()).add(ModBlocks.NETHER_RUBIDIUM_ORE.get()).add(ModBlocks.STARSHARD_BLOCK.get());

        tag(Tags.Blocks.NEEDS_NETHERITE_TOOL).add(ModBlocks.END_STARSHARD_ORE.get());

        tag(ModTags.Blocks.NEEDS_CUBIC_ZIRCONIA_TOOL).addTag(BlockTags.NEEDS_IRON_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_CUBIC_ZIRCONIA_TOOL).addTag(BlockTags.INCORRECT_FOR_IRON_TOOL).remove(ModTags.Blocks.NEEDS_CUBIC_ZIRCONIA_TOOL);

        tag(ModTags.Blocks.NEEDS_CELESTIAL_BRONZE_TOOL).addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_CELESTIAL_BRONZE_TOOL).addTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL).remove(ModTags.Blocks.NEEDS_CELESTIAL_BRONZE_TOOL);

        tag(ModTags.Blocks.NEEDS_RUBIDIUM_TOOL).addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_RUBIDIUM_TOOL).addTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL).remove(ModTags.Blocks.NEEDS_RUBIDIUM_TOOL);

        tag(ModTags.Blocks.NEEDS_STARSHARD_TOOL).addTag(Tags.Blocks.NEEDS_NETHERITE_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_STARSHARD_TOOL).addTag(BlockTags.INCORRECT_FOR_NETHERITE_TOOL).remove(ModTags.Blocks.NEEDS_STARSHARD_TOOL);

    }
}
