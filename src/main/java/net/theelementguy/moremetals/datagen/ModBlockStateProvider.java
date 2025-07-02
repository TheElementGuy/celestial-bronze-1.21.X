package net.theelementguy.moremetals.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.neoforged.neoforge.client.model.generators.*;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.theelementguy.moremetals.MoreMetalsMod;
import net.theelementguy.moremetals.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MoreMetalsMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.CUBIC_ZIRCONIA_BLOCK);
        blockWithItem(ModBlocks.RAW_CUBIC_ZIRCONIA_BLOCK);

        blockWithItem(ModBlocks.CUBIC_ZIRCONIA_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE);

        blockWithItem(ModBlocks.TIN_BLOCK);

        blockWithItem(ModBlocks.TIN_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_TIN_ORE);

        blockWithItem(ModBlocks.RUBIDIUM_BLOCK);

        blockWithItem(ModBlocks.NETHER_RUBIDIUM_ORE);

        glazedTerracottaBlockWithItem(ModBlocks.STARSHARD_BLOCK);

        blockWithItem(ModBlocks.END_STARSHARD_ORE);

        blockWithItem(ModBlocks.BRONZE_BLOCK);
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void rotatableBlockWithItem(DeferredBlock<? extends Block> deferredBlock) {
        axisBlock((RotatedPillarBlock) deferredBlock.get(), blockTexture(deferredBlock.get()), blockTexture(deferredBlock.get()));
        blockItem(deferredBlock);
    }

    private void blockItem(DeferredBlock<?> deferredBlock) {
        simpleBlockItem(deferredBlock.get(), new ModelFile.UncheckedModelFile("moremetals:block/" + deferredBlock.getId().getPath()));
    }

    private void glazedTerracottaBlockWithItem(DeferredBlock<?> deferredBlock) {
        //horizontalBlock((Block) deferredBlock.get(), ResourceLocation.fromNamespaceAndPath("moremetals", "block/" + deferredBlock.getId().getPath()), ResourceLocation.fromNamespaceAndPath("moremetals", "block/" + deferredBlock.getId().getPath()), ResourceLocation.fromNamespaceAndPath("moremetals", "block/" + deferredBlock.getId().getPath()));

        //blockItem(deferredBlock);

        this.models().withExistingParent(deferredBlock.getRegisteredName(), ResourceLocation.withDefaultNamespace("block/template_glazed_terracotta")).texture("pattern", ResourceLocation.fromNamespaceAndPath("moremetals", "block/" + deferredBlock.getId().getPath()));

        horizontalBlock(deferredBlock.get(), new ModelFile.UncheckedModelFile(ResourceLocation.fromNamespaceAndPath("moremetals", "block/" + deferredBlock.getId().getPath())));

        blockItem(deferredBlock);
    }
}