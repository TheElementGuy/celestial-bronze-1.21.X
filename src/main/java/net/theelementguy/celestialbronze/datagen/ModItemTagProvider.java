package net.theelementguy.celestialbronze.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.theelementguy.celestialbronze.item.ModItems;
import net.theelementguy.celestialbronze.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blocks) {
        super(output, lookupProvider, blocks);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.SWORDS).addTag(ModTags.Items.CELESTIAL_BRONZE_TYPE_SWORDS);
        tag(ModTags.Items.CELESTIAL_BRONZE_TYPE_SWORDS).add(ModItems.CELESTIAL_BRRONZE_SWORD.get());
        tag(ModTags.Items.CELESTIAL_BRONZE_REPAIRABLES).add(Items.NETHER_STAR);
    }
}