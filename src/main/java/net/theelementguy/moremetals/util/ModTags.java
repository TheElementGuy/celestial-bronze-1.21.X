package net.theelementguy.moremetals.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.theelementguy.moremetals.MoreMetalsMod;

import javax.swing.text.html.HTML;

public class ModTags {

    public static class Blocks {

        public static final TagKey<Block> NEEDS_CUBIC_ZIRCONIA_TOOL = createTag("needs_cubic_zirconia");

        public static final TagKey<Block> INCORRECT_FOR_CUBIC_ZIRCONIA_TOOL = createTag("incorrect_for_cubic_zirconia_tool");

        public static final TagKey<Block> NEEDS_CELESTIAL_BRONZE_TOOL = createTag("needs_celestial_bronze");

        public static final TagKey<Block> INCORRECT_FOR_CELESTIAL_BRONZE_TOOL = createTag("incorrect_for_celestial_bronze_tool");

        public static final TagKey<Block> NEEDS_RUBIDIUM_TOOL = createTag("needs_rubidium");

        public static final TagKey<Block> INCORRECT_FOR_RUBIDIUM_TOOL = createTag("incorrect_for_rubidium_tool");

        public static final TagKey<Block> NEEDS_STARSHARD_TOOL = createTag("needs_starshard");

        public static final TagKey<Block> INCORRECT_FOR_STARSHARD_TOOL = createTag("incorrect_for_starshard_tool");

        public static final TagKey<Block> NEEDS_BRONZE_TOOL = createTag("needs_bronze");

        public static final TagKey<Block> INCORRECT_FOR_BRONZE_TOOL = createTag("incorrect_for_bronze_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, name));
        }

    }

    public static class Items {

        public static final TagKey<Item> CELESTIAL_BRONZE_TYPE_SWORDS = createTag("celestial_bronze_type_swords");
        public static final TagKey<Item> CUBIC_ZIRCONIA_REPAIRABLES = createTag("cubic_zirconia_replaceables");
        public static final TagKey<Item> CELESTIAL_BRONZE_REPAIRABLES = createTag("celestial_bronze_repairables");
        public static final TagKey<Item> RUBIDIUM_REPAIRABLES = createTag("rubidium_replaceables");
        public static final TagKey<Item> STARSHARD_REPAIRABLES = createTag("starshard_replceables");
        public static final TagKey<Item> BRONZE_REPAIRABLES = createTag("bronze_repairables");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, name));
        }

    }

    public static class EntityTypes {

        public static TagKey<EntityType<?>> CELESTIAL_BRONZE_SWORD_TARGETS = createTag("celestial_bronze_sword_targets");

        private static TagKey<EntityType<?>> createTag(String name) {
            return TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, name));
        }

    }

    public static class Biomes {

        public static TagKey<Biome> IS_END_AND_NOT_MAIN_ISLAND = createTag("is_end_and_not_main_island");

        private static TagKey<Biome> createTag(String name) {
            return TagKey.create(Registries.BIOME, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, name));
        }

    }

}