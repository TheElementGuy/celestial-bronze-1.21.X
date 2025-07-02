package net.theelementguy.moremetals.block;

import com.mojang.serialization.MapCodec;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.theelementguy.moremetals.MoreMetalsMod;
import net.theelementguy.moremetals.block.custom.ModHorizontalRotationBlock;
import net.theelementguy.moremetals.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MoreMetalsMod.MOD_ID);

    public static final DeferredBlock<Block> CUBIC_ZIRCONIA_BLOCK = registerFireproofBlock("cubic_zirconia_block", () -> new Block(BlockBehaviour.Properties.of().destroyTime(5f).mapColor(DyeColor.WHITE).explosionResistance(6f).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> RAW_CUBIC_ZIRCONIA_BLOCK = registerFireproofBlock("raw_cubic_zirconia_block", () -> new Block(BlockBehaviour.Properties.of().destroyTime(5f).mapColor(DyeColor.MAGENTA).explosionResistance(6f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> CUBIC_ZIRCONIA_ORE = registerBlock("cubic_zirconia_ore", () -> new Block(BlockBehaviour.Properties.of().destroyTime(3f).mapColor((DyeColor.GRAY)).explosionResistance(3f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> DEEPSLATE_CUBIC_ZIRCONIA_ORE = registerBlock("deepslate_cubic_zirconia_ore", () -> new Block(BlockBehaviour.Properties.of().destroyTime(4.5f).mapColor((DyeColor.GRAY)).explosionResistance(3f).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));

    //public static final DeferredBlock<Block> CELESTIAL_BRONZE_BLOCK = registerBlock("celestial_bronze_block", () -> new Block(BlockBehaviour.Properties.of().destroyTime(5f).mapColor(DyeColor.BROWN).explosionResistance(6f).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    //public static final DeferredBlock<Block> RAW_CELESTIAL_BRONZE_BLOCK = registerBlock("raw_celestial_bronze_block", () -> new Block(BlockBehaviour.Properties.of().destroyTime(5f).mapColor(DyeColor.BROWN).explosionResistance(6f).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> TIN_BLOCK = registerBlock("tin_block", () -> new Block(BlockBehaviour.Properties.of().destroyTime(5f).mapColor(DyeColor.GRAY).explosionResistance(6f).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> TIN_ORE = registerBlock("tin_ore", () -> new Block(BlockBehaviour.Properties.of().destroyTime(3f).mapColor(DyeColor.GRAY).explosionResistance(3f).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> DEEPSLATE_TIN_ORE = registerBlock("deepslate_tin_ore", () -> new Block(BlockBehaviour.Properties.of().destroyTime(4.5f).mapColor(DyeColor.GRAY).explosionResistance(3f).sound(SoundType.DEEPSLATE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> RUBIDIUM_BLOCK = registerBlock("rubidium_block", () -> new Block(BlockBehaviour.Properties.of().destroyTime(5f).explosionResistance(6f).sound(SoundType.METAL).mapColor(DyeColor.PINK).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> NETHER_RUBIDIUM_ORE = registerBlock("nether_rubidium_ore", () -> new Block(BlockBehaviour.Properties.of().destroyTime(3.0f).explosionResistance(3.0f).sound(SoundType.NETHER_ORE).mapColor(DyeColor.RED).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> STARSHARD_BLOCK = registerRareBlock("starshard_block", () -> new ModHorizontalRotationBlock(BlockBehaviour.Properties.of().destroyTime(5f).mapColor(DyeColor.GREEN).explosionResistance(6f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> END_STARSHARD_ORE = registerBlock("end_starshard_ore", () -> new Block(BlockBehaviour.Properties.of().destroyTime(4.5f).explosionResistance(9f).mapColor(DyeColor.YELLOW).sound(SoundType.STONE).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> BRONZE_BLOCK = registerBlock("bronze_block", () -> new Block(BlockBehaviour.Properties.of().destroyTime(4.5f).explosionResistance(6f).mapColor(MapColor.TERRACOTTA_ORANGE).sound(SoundType.METAL).requiresCorrectToolForDrops()));

    public static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static <T extends Block> DeferredBlock<T> registerFireproofBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerFireproofBlockItem(name, toReturn);
        return toReturn;
    }

    public static <T extends Block> DeferredBlock<T> registerRareBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerRareBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static <T extends Block> void registerFireproofBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().fireResistant()));
    }

    private static <T extends Block> void registerRareBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().rarity(Rarity.UNCOMMON)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}