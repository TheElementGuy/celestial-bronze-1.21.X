package net.theelementguy.celestialbronze.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.theelementguy.celestialbronze.CelestialBronzeMod;

public class ModTags {

    public static class Blocks {

        public static final TagKey<Block> NEEDS_CELESTIAL_BRONZE_TOOL = createTag("needs_celestial_bronze");

        public static final TagKey<Block> INCORRECT_FOR_CELESTIAL_BRONZE_TOOL = createTag("incorrect_for_celestial_bronze_tool");

        private static TagKey<Block> createTag(String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(CelestialBronzeMod.MOD_ID, name));
        }

    }

    public static class Items {

        public static final TagKey<Item> CELESTIAL_BRONZE_TYPE_SWORDS = createTag("celestial_bronze_type_swords");

        public static final TagKey<Item> CELESTIAL_BRONZE_REPAIRABLES = createTag("celestial_bronze_repairables");

        private static TagKey<Item> createTag(String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(CelestialBronzeMod.MOD_ID, name));
        }

    }

    public static class EntityTypes {

        public static TagKey<EntityType<?>> CELESTIAL_BRONZE_SWORD_TARGETS = createTag("celestial_bronze_sword_targets");

        private static TagKey<EntityType<?>> createTag(String name) {
            return TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(CelestialBronzeMod.MOD_ID, name));
        }

    }

}