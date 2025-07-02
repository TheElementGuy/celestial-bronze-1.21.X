package net.theelementguy.moremetals.trim;

import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import net.minecraft.network.chat.TextColor;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.trim.MaterialAssetGroup;
import net.minecraft.world.item.equipment.trim.TrimMaterial;
import net.minecraft.world.item.equipment.trim.TrimMaterials;
import net.theelementguy.moremetals.MoreMetalsMod;
import net.theelementguy.moremetals.item.ModItems;

import java.awt.geom.RectangularShape;

public class ModTrimMaterials {

    public static final ResourceKey<TrimMaterial> CUBIC_ZIRCONIA = ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "cubic_zirconia"));

    public static final ResourceKey<TrimMaterial> TIN = registerKey("tin");

    public static final ResourceKey<TrimMaterial> STARSHARD = registerKey("starshard");

    public static final ResourceKey<TrimMaterial> RUBIDIUM = registerKey("rubidium");

    public static final ResourceKey<TrimMaterial> BRONZE = registerKey("bronze");

    public static final MaterialAssetGroup CUBIC_ZIRCONIA_ASSET_GROUP = MaterialAssetGroup.create("cubic_zirconia");

    public static final MaterialAssetGroup TIN_ASSET_GROUP = MaterialAssetGroup.create("tin");

    public static final MaterialAssetGroup STARSHARD_ASSET_GROUP = MaterialAssetGroup.create("starshard");

    public static final MaterialAssetGroup RUBIDIUM_ASSET_GROUP = MaterialAssetGroup.create("rubidium");

    public static final MaterialAssetGroup BRONZE_ASSET_GROUP = MaterialAssetGroup.create("bronze");

    public static void bootstrap(BootstrapContext<TrimMaterial> context) {
        register(context, CUBIC_ZIRCONIA, Style.EMPTY.withColor(TextColor.parseColor("#ebcacb").getOrThrow()));

        register(context, TIN, Style.EMPTY.withColor(TextColor.parseColor("#e6e6ca").getOrThrow()));

        register(context, STARSHARD, Style.EMPTY.withColor(TextColor.parseColor("#7fe9f5").getOrThrow()));

        register(context, BRONZE, Style.EMPTY.withColor(TextColor.parseColor("#ffa896").getOrThrow()));

        register(context, RUBIDIUM, Style.EMPTY.withColor(TextColor.parseColor("#fa89a2").getOrThrow()));
    }

    public static void register(BootstrapContext<TrimMaterial> context, ResourceKey<TrimMaterial> key, Style style) {
        register(context, key, key.location().getPath(), style);
    }

    public static void register(BootstrapContext<TrimMaterial> context, ResourceKey<TrimMaterial> resourceKey, String name, Style style) {

        TrimMaterial trimMaterial = new TrimMaterial(MaterialAssetGroup.create(name), Component.translatable(Util.makeDescriptionId("trim_material", resourceKey.location())).withStyle(style));

        System.out.println(resourceKey.location().getPath());

        context.register(resourceKey, trimMaterial);

    }

    public static ResourceKey<TrimMaterial> registerKey(String name) {
        return ResourceKey.create(Registries.TRIM_MATERIAL, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, name));
    }

}
