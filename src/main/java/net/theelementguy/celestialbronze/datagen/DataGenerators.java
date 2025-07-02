package net.theelementguy.celestialbronze.datagen;

import com.jcraft.jorbis.Block;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.TagsProvider;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.theelementguy.celestialbronze.CelestialBronzeMod;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = CelestialBronzeMod.MOD_ID)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent.Client event) {
        System.out.println("its doing something");
        DataGenerator generator = event.getGenerator();
        PackOutput output = generator.getPackOutput();
        CompletableFuture<HolderLookup.Provider> provider = event.getLookupProvider();

        generator.addProvider(true, new ModRecipeProvider.Runner(output, provider));

        generator.addProvider(true, new ModEntityTypeTagProvider(output, provider));

        BlockTagsProvider blockTagsProvider = new ModBlockTagProvider(output, provider);
        generator.addProvider(true, blockTagsProvider);
        generator.addProvider(true, new ModItemTagProvider(output, provider, blockTagsProvider.contentsGetter()));

        generator.addProvider(true, new ModModelProvider(output));

        generator.addProvider(true, new ModGlobalLootModifiers(output, provider));
    }

}
