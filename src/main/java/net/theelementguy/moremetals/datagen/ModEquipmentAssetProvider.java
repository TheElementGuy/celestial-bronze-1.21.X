package net.theelementguy.moremetals.datagen;

import net.minecraft.client.data.models.EquipmentAssetProvider;
import net.minecraft.client.resources.model.EquipmentClientInfo;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.theelementguy.moremetals.item.ModEquipmentAssets;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ModEquipmentAssetProvider extends EquipmentAssetProvider {

    protected final PackOutput.PathProvider pathProvider;

    public ModEquipmentAssetProvider(PackOutput output) {
        super(output);
        pathProvider = output.createPathProvider(PackOutput.Target.RESOURCE_PACK, "equipment");
    }

    @Override
    public CompletableFuture<?> run(CachedOutput p_387304_) {
        Map<ResourceKey<EquipmentAsset>, EquipmentClientInfo> MAP = new HashMap<>();
        ModEquipmentAssets.bootstrap((key, model) -> {
            if (MAP.putIfAbsent(key, model) != null) {
                throw new IllegalStateException("Duplicate equipment asset for:" + key.location());
            }
        });
        return DataProvider.saveAll(p_387304_, EquipmentClientInfo.CODEC, this.pathProvider::json, MAP);
    }
}
