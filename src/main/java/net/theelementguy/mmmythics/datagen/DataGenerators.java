package net.theelementguy.mmmythics.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.theelementguy.mmmythics.CelestialBronzeMod;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = CelestialBronzeMod.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        System.out.println("its doing something");
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> provider = event.getLookupProvider();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(true, new ModRecipeProvider(output, provider));

        generator.addProvider(true, new ModEntityTypeTagProvider(output, provider, existingFileHelper));
        generator.addProvider(true, new ModItemModelProvider(output, existingFileHelper));

        BlockTagsProvider blockTagsProvider = new ModBlockTagProvider(output, provider, existingFileHelper);
        generator.addProvider(true, blockTagsProvider);
        generator.addProvider(true, new ModItemTagProvider(output, provider, blockTagsProvider.contentsGetter()));

        generator.addProvider(true, new ModGlobalLootModifiers(output, provider));

        generator.addProvider(true, new ModLanguageProvider(output, "en_us"));
    }

}
