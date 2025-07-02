package net.theelementguy.moremetals.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;
import net.theelementguy.moremetals.MoreMetalsMod;
import net.theelementguy.moremetals.item.ModItems;

import java.util.LinkedHashMap;

public class ModItemModelProvider  extends ItemModelProvider {

    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MoreMetalsMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ModItems.RAW_CUBIC_ZIRCONIA.get());
        basicItem(ModItems.CUBIC_ZIRCONIA.get());
        basicItem(ModItems.TIN_SCRAPS.get());
        basicItem(ModItems.RUBIDIUM.get());
        basicItem(ModItems.STARSHARD.get());
        basicItem(ModItems.BRONZE_INGOT.get());
        basicItem(ModItems.CELESTIAL_BRONZE_UPGRADE_SMITHING_TEMPLATE.get());
        handheldItem(ModItems.CUBIC_ZIRCONIA_SWORD.get());
        handheldItem(ModItems.CUBIC_ZIRCONIA_AXE.get());
        handheldItem(ModItems.CUBIC_ZIRCONIA_PICKAXE.get());
        handheldItem(ModItems.CUBIC_ZIRCONIA_SHOVEL.get());
        handheldItem(ModItems.CUBIC_ZIRCONIA_HOE.get());
        handheldItem(ModItems.CELESTIAL_BRRONZE_SWORD.get());
        handheldItem(ModItems.RUBIDIUM_SWORD.get());
        handheldItem(ModItems.RUBIDIUM_AXE.get());
        handheldItem(ModItems.RUBIDIUM_PICKAXE.get());
        handheldItem(ModItems.RUBIDIUM_SHOVEL.get());
        handheldItem(ModItems.RUBIDIUM_HOE.get());
        handheldItem(ModItems.STARSHARD_SWORD.get());
        handheldItem(ModItems.STARSHARD_AXE.get());
        handheldItem(ModItems.STARSHARD_PICKAXE.get());
        handheldItem(ModItems.STARSHARD_SHOVEL.get());
        handheldItem(ModItems.STARSHARD_HOE.get());
        handheldItem(ModItems.BRONZE_SWORD.get());
        handheldItem(ModItems.BRONZE_AXE.get());
        handheldItem(ModItems.BRONZE_PICKAXE.get());
        handheldItem(ModItems.BRONZE_SHOVEL.get());
        handheldItem(ModItems.BRONZE_HOE.get());
        trimmedArmorItem(ModItems.CUBIC_ZIRCONIA_HELMET);
        trimmedArmorItem(ModItems.CUBIC_ZIRCONIA_CHESTPLATE);
        trimmedArmorItem(ModItems.CUBIC_ZIRCONIA_LEGGINGS);
        trimmedArmorItem(ModItems.CUBIC_ZIRCONIA_BOOTS);
        trimmedArmorItem(ModItems.RUBIDIUM_HELMET);
        trimmedArmorItem(ModItems.RUBIDIUM_CHESTPLATE);
        trimmedArmorItem(ModItems.RUBIDIUM_LEGGINGS);
        trimmedArmorItem(ModItems.RUBIDIUM_BOOTS);
        trimmedArmorItem(ModItems.STARSHARD_HELMET);
        trimmedArmorItem(ModItems.STARSHARD_CHESTPLATE);
        trimmedArmorItem(ModItems.STARSHARD_LEGGINGS);
        trimmedArmorItem(ModItems.STARSHARD_BOOTS);
        trimmedArmorItem(ModItems.BRONZE_HELMET);
        trimmedArmorItem(ModItems.BRONZE_CHESTPLATE);
        trimmedArmorItem(ModItems.BRONZE_LEGGINGS);
        trimmedArmorItem(ModItems.BRONZE_BOOTS);
    }

    private ItemModelBuilder handheldItem(DeferredItem<?> item) {
        return withExistingParent(item.getId().getPath(), ResourceLocation.parse("item/handheld")).texture("layer0", ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID,"item/" + item.getId().getPath()));
    }


    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();

    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    // Shoutout to El_Redstoniano for making this
    private void trimmedArmorItem(DeferredItem<ArmorItem> itemDeferredItem) {
        final String MOD_ID = MoreMetalsMod.MOD_ID; // Change this to your mod id

        if(itemDeferredItem.get() instanceof ArmorItem armorItem) {
            trimMaterials.forEach((trimMaterial, value) -> {
                float trimValue = value;

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = armorItem.toString();
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = ResourceLocation.parse(armorItemPath);
                ResourceLocation trimResLoc = ResourceLocation.parse(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = ResourceLocation.parse(currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc.getNamespace() + ":item/" + armorItemResLoc.getPath())
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemDeferredItem.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc.getNamespace()  + ":item/" + trimNameResLoc.getPath()))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                ResourceLocation.fromNamespaceAndPath(MOD_ID,
                                        "item/" + itemDeferredItem.getId().getPath()));
            });
        }
    }
}