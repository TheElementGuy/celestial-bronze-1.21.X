package net.theelementguy.moremetals.datagen;

import net.minecraft.client.color.item.Dye;
import net.minecraft.client.color.item.ItemTintSource;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.*;
import net.minecraft.client.renderer.item.BlockModelWrapper;
import net.minecraft.client.renderer.item.ItemModel;
import net.minecraft.client.renderer.item.SelectItemModel;
import net.minecraft.client.renderer.item.properties.select.TrimMaterialProperty;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.trim.MaterialAssetGroup;
import net.minecraft.world.item.equipment.trim.TrimMaterial;
import net.minecraft.world.item.equipment.trim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.theelementguy.moremetals.MoreMetalsMod;
import net.theelementguy.moremetals.block.ModBlocks;
import net.theelementguy.moremetals.item.ModArmorMaterials;
import net.theelementguy.moremetals.item.ModEquipmentAssets;
import net.theelementguy.moremetals.item.ModItems;
import net.theelementguy.moremetals.trim.ModTrimMaterials;
import net.theelementguy.moremetals.util.ModTags;
import net.theelementguy.moremetals.util.ModUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import static net.minecraft.client.data.models.ItemModelGenerators.*;
import static net.minecraft.tags.TagEntry.tag;

public class ModModelProvider extends ModelProvider {
    public ModModelProvider(PackOutput output) {
        super(output, MoreMetalsMod.MOD_ID);
    }

    public static final List<ItemModelGenerators.TrimMaterialData> TRIM_MATERIAL_MODELS = List.of(
            new ItemModelGenerators.TrimMaterialData(MaterialAssetGroup.QUARTZ, TrimMaterials.QUARTZ),
            new ItemModelGenerators.TrimMaterialData(MaterialAssetGroup.IRON, TrimMaterials.IRON),
            new ItemModelGenerators.TrimMaterialData(MaterialAssetGroup.NETHERITE, TrimMaterials.NETHERITE),
            new ItemModelGenerators.TrimMaterialData(MaterialAssetGroup.REDSTONE, TrimMaterials.REDSTONE),
            new ItemModelGenerators.TrimMaterialData(MaterialAssetGroup.COPPER, TrimMaterials.COPPER),
            new ItemModelGenerators.TrimMaterialData(MaterialAssetGroup.GOLD, TrimMaterials.GOLD),
            new ItemModelGenerators.TrimMaterialData(MaterialAssetGroup.EMERALD, TrimMaterials.EMERALD),
            new ItemModelGenerators.TrimMaterialData(MaterialAssetGroup.DIAMOND, TrimMaterials.DIAMOND),
            new ItemModelGenerators.TrimMaterialData(MaterialAssetGroup.LAPIS, TrimMaterials.LAPIS),
            new ItemModelGenerators.TrimMaterialData(MaterialAssetGroup.AMETHYST, TrimMaterials.AMETHYST),
            new ItemModelGenerators.TrimMaterialData(MaterialAssetGroup.RESIN, TrimMaterials.RESIN),
            new ItemModelGenerators.TrimMaterialData(ModTrimMaterials.CUBIC_ZIRCONIA_ASSET_GROUP, ModTrimMaterials.CUBIC_ZIRCONIA),
            new ItemModelGenerators.TrimMaterialData(ModTrimMaterials.BRONZE_ASSET_GROUP, ModTrimMaterials.BRONZE),
            new ItemModelGenerators.TrimMaterialData(ModTrimMaterials.TIN_ASSET_GROUP, ModTrimMaterials.TIN),
            new ItemModelGenerators.TrimMaterialData(ModTrimMaterials.STARSHARD_ASSET_GROUP, ModTrimMaterials.STARSHARD),
            new ItemModelGenerators.TrimMaterialData(ModTrimMaterials.RUBIDIUM_ASSET_GROUP, ModTrimMaterials.RUBIDIUM)
    );

    public static final ResourceLocation MODDED_TRIM_PREFIX_HELMET = prefixForSlotTrimModded("helmet");

    public static final ResourceLocation MODDED_TRIM_PREFIX_CHESTPLATE = prefixForSlotTrimModded("chestplate");

    public static final ResourceLocation MODDED_TRIM_PREFIX_LEGGINGS = prefixForSlotTrimModded("leggings");

    public static final ResourceLocation MODDED_TRIM_PREFIX_BOOTS = prefixForSlotTrimModded("boots");

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {

        itemModels.generateFlatItem(ModItems.CUBIC_ZIRCONIA.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RAW_CUBIC_ZIRCONIA.get(), ModelTemplates.FLAT_ITEM);
        //itemModels.generateFlatItem(ModItems.CELESTIAL_BRONZE_INGOT.get(), ModelTemplates.FLAT_ITEM);
        //itemModels.generateFlatItem(ModItems.RAW_CELESTIAL_BRONZE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.TIN_SCRAPS.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.RUBIDIUM.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.STARSHARD.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.BRONZE_INGOT.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(ModItems.CELESTIAL_BRONZE_UPGRADE_SMITHING_TEMPLATE.get(), ModelTemplates.FLAT_ITEM);

        itemModels.generateFlatItem(ModItems.CUBIC_ZIRCONIA_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.CUBIC_ZIRCONIA_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.CUBIC_ZIRCONIA_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.CUBIC_ZIRCONIA_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.CUBIC_ZIRCONIA_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.CELESTIAL_BRRONZE_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.RUBIDIUM_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.RUBIDIUM_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.RUBIDIUM_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.RUBIDIUM_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.RUBIDIUM_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.STARSHARD_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.STARSHARD_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.STARSHARD_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.STARSHARD_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.STARSHARD_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.BRONZE_SWORD.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.BRONZE_AXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.BRONZE_PICKAXE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.BRONZE_SHOVEL.get(), ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModels.generateFlatItem(ModItems.BRONZE_HOE.get(), ModelTemplates.FLAT_HANDHELD_ITEM);

        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.CUBIC_ZIRCONIA_HELMET.get(), ModEquipmentAssets.CUBIC_ZIRCONIA, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.CUBIC_ZIRCONIA_CHESTPLATE.get(), ModEquipmentAssets.CUBIC_ZIRCONIA, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.CUBIC_ZIRCONIA_LEGGINGS.get(), ModEquipmentAssets.CUBIC_ZIRCONIA, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.CUBIC_ZIRCONIA_BOOTS.get(), ModEquipmentAssets.CUBIC_ZIRCONIA, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.RUBIDIUM_HELMET.get(), ModEquipmentAssets.RUBIDIUM, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.RUBIDIUM_CHESTPLATE.get(), ModEquipmentAssets.RUBIDIUM, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.RUBIDIUM_LEGGINGS.get(), ModEquipmentAssets.RUBIDIUM, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.RUBIDIUM_BOOTS.get(), ModEquipmentAssets.RUBIDIUM, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.STARSHARD_HELMET.get(), ModEquipmentAssets.STARSHARD, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.STARSHARD_CHESTPLATE.get(), ModEquipmentAssets.STARSHARD, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.STARSHARD_LEGGINGS.get(), ModEquipmentAssets.STARSHARD, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.STARSHARD_BOOTS.get(), ModEquipmentAssets.STARSHARD, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.BRONZE_HELMET.get(), ModEquipmentAssets.BRONZE, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.BRONZE_CHESTPLATE.get(), ModEquipmentAssets.BRONZE, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.BRONZE_LEGGINGS.get(), ModEquipmentAssets.BRONZE, false);
        generateTrimmableItemWithModdedMaterials(itemModels, ModItems.BRONZE_BOOTS.get(), ModEquipmentAssets.BRONZE, false);

        blockModels.createTrivialCube(ModBlocks.CUBIC_ZIRCONIA_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.RAW_CUBIC_ZIRCONIA_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.CUBIC_ZIRCONIA_ORE.get());
        blockModels.createTrivialCube(ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE.get());
        //blockModels.createTrivialCube(ModBlocks.CELESTIAL_BRONZE_BLOCK.get());
        //blockModels.createTrivialCube(ModBlocks.RAW_CELESTIAL_BRONZE_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.TIN_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.TIN_ORE.get());
        blockModels.createTrivialCube(ModBlocks.DEEPSLATE_TIN_ORE.get());
        blockModels.createTrivialCube(ModBlocks.RUBIDIUM_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.NETHER_RUBIDIUM_ORE.get());
        blockModels.createColoredBlockWithStateRotations(TexturedModel.GLAZED_TERRACOTTA, ModBlocks.STARSHARD_BLOCK.get());
        blockModels.createTrivialCube(ModBlocks.END_STARSHARD_ORE.get());
        blockModels.createTrivialCube(ModBlocks.BRONZE_BLOCK.get());


        generateTrimmableItemWithModdedMaterials(itemModels, Items.LEATHER_HELMET, EquipmentAssets.LEATHER, true);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.LEATHER_CHESTPLATE, EquipmentAssets.LEATHER, true);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.LEATHER_LEGGINGS, EquipmentAssets.LEATHER, true);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.LEATHER_BOOTS, EquipmentAssets.LEATHER, true);


        generateTrimmableItemWithModdedMaterials(itemModels, Items.CHAINMAIL_HELMET, EquipmentAssets.CHAINMAIL, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.CHAINMAIL_CHESTPLATE, EquipmentAssets.CHAINMAIL, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.CHAINMAIL_LEGGINGS, EquipmentAssets.CHAINMAIL, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.CHAINMAIL_BOOTS, EquipmentAssets.CHAINMAIL, false);


        generateTrimmableItemWithModdedMaterials(itemModels, Items.IRON_HELMET, EquipmentAssets.IRON, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.IRON_CHESTPLATE, EquipmentAssets.IRON, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.IRON_LEGGINGS, EquipmentAssets.IRON, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.IRON_BOOTS, EquipmentAssets.IRON, false);


        generateTrimmableItemWithModdedMaterials(itemModels, Items.DIAMOND_HELMET, EquipmentAssets.DIAMOND, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.DIAMOND_CHESTPLATE, EquipmentAssets.DIAMOND, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.DIAMOND_LEGGINGS, EquipmentAssets.DIAMOND, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.DIAMOND_BOOTS, EquipmentAssets.DIAMOND, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.GOLDEN_HELMET, EquipmentAssets.GOLD, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.GOLDEN_CHESTPLATE, EquipmentAssets.GOLD, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.GOLDEN_LEGGINGS, EquipmentAssets.GOLD, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.GOLDEN_BOOTS, EquipmentAssets.GOLD, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.NETHERITE_HELMET, EquipmentAssets.NETHERITE, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.NETHERITE_CHESTPLATE, EquipmentAssets.NETHERITE, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.NETHERITE_LEGGINGS, EquipmentAssets.NETHERITE, false);
        generateTrimmableItemWithModdedMaterials(itemModels, Items.NETHERITE_BOOTS, EquipmentAssets.NETHERITE, false);

        generateTrimmableItemWithModdedMaterials(itemModels, Items.TURTLE_HELMET, EquipmentAssets.TURTLE_SCUTE, false);
    }

    public void generateTrimmableItemWithModdedMaterials(ItemModelGenerators itemModels, Item item, ResourceKey<EquipmentAsset> equipmentAsset, boolean usesSecondLayer) {
        ResourceLocation resourcelocation = ModelLocationUtils.getModelLocation(item);
        ResourceLocation resourcelocation1 = TextureMapping.getItemTexture(item);
        ResourceLocation resourcelocation2 = TextureMapping.getItemTexture(item, "_overlay");
        List<SelectItemModel.SwitchCase<ResourceKey<TrimMaterial>>> list = new ArrayList(TRIM_MATERIAL_MODELS.size());

        for(ItemModelGenerators.TrimMaterialData itemmodelgenerators$trimmaterialdata : TRIM_MATERIAL_MODELS) {
            ResourceLocation resourcelocation3 = resourcelocation.withSuffix("_" + itemmodelgenerators$trimmaterialdata.assets().base().suffix() + "_trim");
            String var10001 = itemmodelgenerators$trimmaterialdata.assets().assetId(equipmentAsset).suffix();
            String path = item.getDescriptionId();
            ResourceLocation modelId = (path.contains("helmet")) ? TRIM_PREFIX_HELMET : ((path.contains("chestplate")) ? TRIM_PREFIX_CHESTPLATE : ((path.contains("leggings")) ? TRIM_PREFIX_LEGGINGS : ItemModelGenerators.TRIM_PREFIX_BOOTS));
            System.out.println(path);
            ResourceLocation resourcelocation4 = modelId.withSuffix("_" + var10001);
            ItemModel.Unbaked itemmodel$unbaked;
            if (usesSecondLayer) {
                itemModels.generateLayeredItem(resourcelocation3, resourcelocation1, resourcelocation2, resourcelocation4);
                itemmodel$unbaked = ItemModelUtils.tintedModel(resourcelocation3, new ItemTintSource[]{new Dye(-6265536)});
            } else {
                itemModels.generateLayeredItem(resourcelocation3, resourcelocation1, resourcelocation4);
                itemmodel$unbaked = ItemModelUtils.plainModel(resourcelocation3);
            }

            list.add(ItemModelUtils.when(itemmodelgenerators$trimmaterialdata.materialKey(), itemmodel$unbaked));
        }

        ItemModel.Unbaked itemmodel$unbaked1;
        if (usesSecondLayer) {
            ModelTemplates.TWO_LAYERED_ITEM.create(resourcelocation, TextureMapping.layered(resourcelocation1, resourcelocation2), itemModels.modelOutput);
            itemmodel$unbaked1 = ItemModelUtils.tintedModel(resourcelocation, new ItemTintSource[]{new Dye(-6265536)});
        } else {
            ModelTemplates.FLAT_ITEM.create(resourcelocation, TextureMapping.layer0(resourcelocation1), itemModels.modelOutput);
            itemmodel$unbaked1 = ItemModelUtils.plainModel(resourcelocation);
        }

        itemModels.itemModelOutput.accept(item, ItemModelUtils.select(new TrimMaterialProperty(), itemmodel$unbaked1, list));
    }

    public static ResourceLocation prefixForSlotTrimModded(String name) {
        return ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "trims/items/" + name + "_trim");
    }
}
