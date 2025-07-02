package net.theelementguy.celestialbronze.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.IntrinsicHolderTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.theelementguy.celestialbronze.item.ModItems;
import net.theelementguy.celestialbronze.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.Comparator;
import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends IntrinsicHolderTagsProvider<Item> {

    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagsProvider.TagLookup<Block>> blockTags) {
        super(output, Registries.ITEM, lookupProvider, item -> item.builtInRegistryHolder().key());
        //this.blockTagProvider = blockTags;
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {

        tag(ItemTags.SWORDS).addTag(ModTags.Items.CELESTIAL_BRONZE_TYPE_SWORDS);
        tag(ModTags.Items.CELESTIAL_BRONZE_TYPE_SWORDS).add(ModItems.CELESTIAL_BRRONZE_SWORD.get());
        tag(ModTags.Items.CELESTIAL_BRONZE_REPAIRABLES).add(Items.NETHER_STAR);
    }
}