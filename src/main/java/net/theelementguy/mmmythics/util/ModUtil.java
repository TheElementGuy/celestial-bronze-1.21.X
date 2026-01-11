package net.theelementguy.mmmythics.util;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Recipe;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.level.block.Block;
import net.theelementguy.mmmythics.CelestialBronzeMod;

public class ModUtil {

    public static ResourceKey<Item> createItemResourceKey(String name) {
        return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(CelestialBronzeMod.MOD_ID, name));
    }

    public static ResourceKey<Block> createBlockResourceKey(String name) {
        return ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(CelestialBronzeMod.MOD_ID, name));
    }

    public static ResourceKey<Recipe<?>> createRecipeResourceKey(String name) {
        return ResourceKey.create(Registries.RECIPE, Identifier.fromNamespaceAndPath(CelestialBronzeMod.MOD_ID, name));
    }

    public static ResourceKey<EquipmentAsset> createEquipmentAssetResourceKey(String name) {
        return ResourceKey.create(ResourceKey.createRegistryKey(Identifier.fromNamespaceAndPath("minecraft", "equipment_asset")), Identifier.fromNamespaceAndPath(CelestialBronzeMod.MOD_ID, name));
    }

}
