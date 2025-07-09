package net.theelementguy.mmmythics.datagen;

import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.*;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.theelementguy.mmmythics.CelestialBronzeMod;
import net.theelementguy.mmmythics.item.ModItems;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, CelestialBronzeMod.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        itemModels.generateFlatItem(ModItems.CELESTIAL_BRONZE_UPGRADE_SMITHING_TEMPLATE.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(ModItems.CELESTIAL_BRRONZE_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModels.generateFlatItem(ModItems.IMPERIAL_GOLD_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        itemModels.generateFlatItem(ModItems.IMPERIAL_GOLD_UPGRADE_SMITHING_TEMPLATE.get(), ModelTemplates.FLAT_ITEM);

        System.out.println(BuiltInRegistries.ITEM.getKey(ModItems.CELESTIAL_BRRONZE_SWORD.get()));
    }

}