package net.theelementguy.moremetals.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.theelementguy.moremetals.MoreMetalsMod;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = MoreMetalsMod.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> provider = event.getLookupProvider();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(true, ModBlockLootTableProvider.create(output, provider));
        new LootTableProvider(output, Collections.emptySet(), List.of(new LootTableProvider.SubProviderEntry(ModBlockLootTableProvider::new, LootContextParamSets.BLOCK)), provider);
        generator.addProvider(true, new ModRecipeProvider(output, provider));

        BlockTagsProvider blockTagsProvider = new ModBlockTagProvider(output, provider, existingFileHelper);
        generator.addProvider(true, blockTagsProvider);
        generator.addProvider(true, new ModItemTagProvider(output, provider, blockTagsProvider.contentsGetter()));
        generator.addProvider(true, new ModEntityTypeTagProvider(output, provider, existingFileHelper));
        generator.addProvider(true, new ModBiomeTagProvider(output, provider));

        generator.addProvider(true, new ModBlockStateProvider(output, existingFileHelper));
        generator.addProvider(true, new ModItemModelProvider(output, existingFileHelper));

        generator.addProvider(true, new ModDatapackProvider(output, provider));

        generator.addProvider(true, new ModGlobalLootModifiers(output, provider));
    }

}
