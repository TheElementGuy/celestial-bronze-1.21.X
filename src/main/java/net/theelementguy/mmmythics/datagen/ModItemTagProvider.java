package net.theelementguy.mmmythics.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.theelementguy.mmmythics.item.ModItems;
import net.theelementguy.mmmythics.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {
    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blocks) {
        super(output, lookupProvider, blocks);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ItemTags.SWORDS).addTag(ModTags.Items.MONSTER_HUNTING_SWORDS);
        tag(ModTags.Items.MONSTER_HUNTING_SWORDS).add(ModItems.CELESTIAL_BRRONZE_SWORD.get()).add(ModItems.IMPERIAL_GOLD_SWORD.get());
    }
}