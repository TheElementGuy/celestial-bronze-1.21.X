package net.theelementguy.mmmythics.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;
import net.neoforged.neoforge.common.loot.LootTableIdCondition;
import net.theelementguy.mmmythics.CelestialBronzeMod;
import net.theelementguy.mmmythics.item.ModItems;
import net.theelementguy.mmmythics.loot.AddItemRollModifier;

import java.util.concurrent.CompletableFuture;

public class ModGlobalLootModifiers extends GlobalLootModifierProvider {
    public ModGlobalLootModifiers(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CelestialBronzeMod.MOD_ID);
    }

    @Override
    protected void start() {
        this.add("celestial_bronze_upgrade_smithing_template_to_desert_pyramid", new AddItemRollModifier(new LootItemCondition[] {new LootTableIdCondition.Builder(ResourceLocation.withDefaultNamespace("archaeology/desert_pyramid")).build()}, ModItems.CELESTIAL_BRONZE_UPGRADE_SMITHING_TEMPLATE.get(), 0.111f));
    }
}
