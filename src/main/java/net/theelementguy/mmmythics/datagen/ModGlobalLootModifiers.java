package net.theelementguy.mmmythics.datagen;

import com.github.theelementguy.tegmatlib.loot.AddItemRollModifier;
import com.github.theelementguy.tegmatlib.loot.ExtraItemRollModifier;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.Identifier;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.neoforged.neoforge.common.data.GlobalLootModifierProvider;
import net.neoforged.neoforge.common.loot.LootTableIdCondition;
import net.theelementguy.mmmythics.CelestialBronzeMod;
import net.theelementguy.mmmythics.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModGlobalLootModifiers extends GlobalLootModifierProvider {
    public ModGlobalLootModifiers(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, CelestialBronzeMod.MOD_ID);
    }

    @Override
    protected void start() {
        this.add("celestial_bronze_upgrade_smithing_template_to_desert_pyramid", new AddItemRollModifier(new LootItemCondition[] {new LootTableIdCondition.Builder(Identifier.withDefaultNamespace("archaeology/desert_pyramid")).build()}, 1000, ModItems.CELESTIAL_BRONZE_UPGRADE_SMITHING_TEMPLATE.get(), 0.111f));

        this.add("imperial_gold_upgrade_smithing_template_to_desert_pyramid", new ExtraItemRollModifier(new LootItemCondition[] {new LootTableIdCondition.Builder(Identifier.withDefaultNamespace("chests/buried_treasure")).build()}, 1000, ModItems.IMPERIAL_GOLD_UPGRADE_SMITHING_TEMPLATE.get(), 0.3f));
    }
}
