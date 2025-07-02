package net.theelementguy.celestialbronze.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.theelementguy.celestialbronze.CelestialBronzeMod;
import net.theelementguy.moremetals.MoreMetalsMod;
import net.theelementguy.celestialbronze.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {

    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider, CelestialBronzeMod.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        System.out.println("mine");

        tag(ModTags.Blocks.NEEDS_CELESTIAL_BRONZE_TOOL).addTag(BlockTags.NEEDS_DIAMOND_TOOL);

        tag(ModTags.Blocks.INCORRECT_FOR_CELESTIAL_BRONZE_TOOL).addTag(BlockTags.INCORRECT_FOR_DIAMOND_TOOL).remove(ModTags.Blocks.NEEDS_CELESTIAL_BRONZE_TOOL);

    }
}
