package net.theelementguy.moremetals.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.IntrinsicHolderTagsProvider;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.theelementguy.moremetals.MoreMetalsMod;
import net.theelementguy.moremetals.item.ModItems;
import net.theelementguy.moremetals.util.ModTags;
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

        tag(ItemTags.SWORDS).add(ModItems.CUBIC_ZIRCONIA_SWORD.get()).addTag(ModTags.Items.CELESTIAL_BRONZE_TYPE_SWORDS).add(ModItems.RUBIDIUM_SWORD.get()).add(ModItems.STARSHARD_SWORD.get()).add(ModItems.BRONZE_SWORD.get());
        tag(ItemTags.AXES).add(ModItems.CUBIC_ZIRCONIA_AXE.get()).add(ModItems.RUBIDIUM_AXE.get()).add(ModItems.STARSHARD_AXE.get()).add(ModItems.BRONZE_AXE.get());
        tag(ItemTags.PICKAXES).add(ModItems.CUBIC_ZIRCONIA_PICKAXE.get()).add(ModItems.RUBIDIUM_PICKAXE.get()).add(ModItems.STARSHARD_PICKAXE.get()).add(ModItems.BRONZE_PICKAXE.get());
        tag(ItemTags.SHOVELS).add(ModItems.CUBIC_ZIRCONIA_SHOVEL.get()).add(ModItems.RUBIDIUM_SHOVEL.get()).add(ModItems.STARSHARD_SHOVEL.get()).add(ModItems.BRONZE_SHOVEL.get());
        tag(ItemTags.HOES).add(ModItems.CUBIC_ZIRCONIA_HOE.get()).add(ModItems.RUBIDIUM_HOE.get()).add(ModItems.STARSHARD_HOE.get()).add(ModItems.BRONZE_HOE.get());
        tag(ItemTags.TRIMMABLE_ARMOR).add(ModItems.CUBIC_ZIRCONIA_HELMET.get()).add(ModItems.CUBIC_ZIRCONIA_CHESTPLATE.get()).add(ModItems.CUBIC_ZIRCONIA_LEGGINGS.get()).add(ModItems.CUBIC_ZIRCONIA_BOOTS.get()).add(ModItems.RUBIDIUM_HELMET.get()).add(ModItems.RUBIDIUM_CHESTPLATE.get()).add(ModItems.RUBIDIUM_LEGGINGS.get()).add(ModItems.RUBIDIUM_BOOTS.get()).add(ModItems.STARSHARD_HELMET.get()).add(ModItems.STARSHARD_CHESTPLATE.get()).add(ModItems.STARSHARD_LEGGINGS.get()).add(ModItems.STARSHARD_BOOTS.get()).add(ModItems.BRONZE_HELMET.get()).add(ModItems.BRONZE_CHESTPLATE.get()).add(ModItems.BRONZE_LEGGINGS.get()).add(ModItems.BRONZE_BOOTS.get());
        tag(ItemTags.TRIM_MATERIALS).add(ModItems.CUBIC_ZIRCONIA.get()).add(ModItems.TIN_SCRAPS.get()).add(ModItems.RUBIDIUM.get()).add(ModItems.STARSHARD.get()).add(ModItems.BRONZE_INGOT.get());
        tag(ModTags.Items.CELESTIAL_BRONZE_TYPE_SWORDS).add(ModItems.CELESTIAL_BRRONZE_SWORD.get());
        tag(ModTags.Items.CUBIC_ZIRCONIA_REPAIRABLES).add(ModItems.CUBIC_ZIRCONIA.get());
        tag(ModTags.Items.CELESTIAL_BRONZE_REPAIRABLES).add(Items.NETHER_STAR);
        tag(ModTags.Items.RUBIDIUM_REPAIRABLES).add(ModItems.RUBIDIUM.get());
        tag(ModTags.Items.STARSHARD_REPAIRABLES).add(ModItems.STARSHARD.get());
        tag(ModTags.Items.BRONZE_REPAIRABLES).add(ModItems.BRONZE_INGOT.get());
    }
}