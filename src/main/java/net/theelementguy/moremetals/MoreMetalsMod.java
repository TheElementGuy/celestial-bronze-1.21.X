package net.theelementguy.moremetals;

import net.theelementguy.moremetals.block.ModBlocks;
import net.theelementguy.moremetals.item.ModItems;
import net.theelementguy.moremetals.loot.ModLootModifiers;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.minecraft.client.Minecraft;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(MoreMetalsMod.MOD_ID)
public class MoreMetalsMod {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "moremetals";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();


    // Creates a creative tab with the id "examplemod:example_tab" for the example item, that is placed after the combat tab
    //public static final DeferredHolder<CreativeModeTab, CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register("example_tab", () -> CreativeModeTab.builder().title(Component.translatable("itemGroup.examplemod")) //The language key for the title of your CreativeModeTab.withTabsBefore(CreativeModeTabs.COMBAT).icon(() -> EXAMPLE_ITEM.get().getDefaultInstance()).displayItems((parameters, output) -> {output.accept(EXAMPLE_ITEM.get()); // Add the example item to the tab. For your own tabs, this method is preferred over the event}).build());

    // The constructor for the mod class is the first code that is run when your mod is loaded.
    // FML will recognize some parameter types like IEventBus or ModContainer and pass them in automatically.
    public MoreMetalsMod(IEventBus modEventBus, ModContainer modContainer)
    {
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in.
        // Note that this is necessary if and only if we want *this* class (ExampleMod) to respond directly to events.

        ModItems.register(modEventBus);

        ModBlocks.register(modEventBus);

        ModLootModifiers.register(modEventBus);

        // Do not add this line if there are no @SubscribeEvent-annotated functions in this class, like onServerStarting() below.
        NeoForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, MoreMetalsModConfig.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");

        if (MoreMetalsModConfig.logDirtBlock)
            LOGGER.info("DIRT BLOCK >> {}", BuiltInRegistries.BLOCK.getKey(Blocks.DIRT));

        LOGGER.info(MoreMetalsModConfig.magicNumberIntroduction + MoreMetalsModConfig.magicNumber);

        MoreMetalsModConfig.items.forEach((item) -> LOGGER.info("ITEM >> {}", item.toString()));
    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.CUBIC_ZIRCONIA);
            event.accept(ModItems.RAW_CUBIC_ZIRCONIA);
            event.accept(ModItems.TIN_SCRAPS);
            //event.accept(ModItems.CELESTIAL_BRONZE_INGOT);
            //event.accept(ModItems.RAW_CELESTIAL_BRONZE);
            event.accept(ModItems.RUBIDIUM);
            event.accept(ModItems.STARSHARD);
            event.accept(ModItems.BRONZE_INGOT);
            event.accept(ModItems.CELESTIAL_BRONZE_UPGRADE_SMITHING_TEMPLATE);
        }
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.CUBIC_ZIRCONIA_BLOCK);
            event.accept(ModBlocks.RAW_CUBIC_ZIRCONIA_BLOCK);
            event.accept(ModBlocks.TIN_BLOCK);
            //event.accept(ModBlocks.CELESTIAL_BRONZE_BLOCK);
            //event.accept(ModBlocks.RAW_CELESTIAL_BRONZE_BLOCK);
            event.accept(ModBlocks.RUBIDIUM_BLOCK);
            event.accept(ModBlocks.STARSHARD_BLOCK);
            event.accept(ModBlocks.BRONZE_BLOCK);
        }
        if(event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
            event.accept(ModBlocks.CUBIC_ZIRCONIA_ORE);
            event.accept(ModBlocks.DEEPSLATE_CUBIC_ZIRCONIA_ORE);
            event.accept(ModBlocks.TIN_ORE);
            event.accept(ModBlocks.DEEPSLATE_TIN_ORE);
            event.accept(ModBlocks.NETHER_RUBIDIUM_ORE);
            event.accept(ModBlocks.END_STARSHARD_ORE);
        }
        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ModItems.CUBIC_ZIRCONIA_SWORD);
            event.accept(ModItems.CUBIC_ZIRCONIA_AXE);
            event.accept(ModItems.CUBIC_ZIRCONIA_HELMET);
            event.accept(ModItems.CUBIC_ZIRCONIA_CHESTPLATE);
            event.accept(ModItems.CUBIC_ZIRCONIA_LEGGINGS);
            event.accept(ModItems.CUBIC_ZIRCONIA_BOOTS);
            event.accept(ModItems.CELESTIAL_BRRONZE_SWORD);
            event.accept(ModItems.RUBIDIUM_SWORD);
            event.accept(ModItems.RUBIDIUM_AXE);
            event.accept(ModItems.RUBIDIUM_HELMET);
            event.accept(ModItems.RUBIDIUM_CHESTPLATE);
            event.accept(ModItems.RUBIDIUM_LEGGINGS);
            event.accept(ModItems.RUBIDIUM_BOOTS);
            event.accept(ModItems.STARSHARD_SWORD);
            event.accept(ModItems.STARSHARD_AXE);
            event.accept(ModItems.STARSHARD_HELMET);
            event.accept(ModItems.STARSHARD_CHESTPLATE);
            event.accept(ModItems.STARSHARD_LEGGINGS);
            event.accept(ModItems.STARSHARD_BOOTS);
            event.accept(ModItems.BRONZE_SWORD);
            event.accept(ModItems.BRONZE_AXE);
            event.accept(ModItems.BRONZE_HELMET);
            event.accept(ModItems.BRONZE_CHESTPLATE);
            event.accept(ModItems.BRONZE_LEGGINGS);
            event.accept(ModItems.BRONZE_BOOTS);
        }
        if (event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.CUBIC_ZIRCONIA_AXE);
            event.accept(ModItems.CUBIC_ZIRCONIA_PICKAXE);
            event.accept(ModItems.CUBIC_ZIRCONIA_SHOVEL);
            event.accept(ModItems.CUBIC_ZIRCONIA_HOE);
            event.accept(ModItems.RUBIDIUM_AXE);
            event.accept(ModItems.RUBIDIUM_PICKAXE);
            event.accept(ModItems.RUBIDIUM_SHOVEL);
            event.accept(ModItems.RUBIDIUM_HOE);
            event.accept(ModItems.STARSHARD_AXE);
            event.accept(ModItems.STARSHARD_PICKAXE);
            event.accept(ModItems.STARSHARD_SHOVEL);
            event.accept(ModItems.STARSHARD_HOE);
            event.accept(ModItems.BRONZE_AXE);
            event.accept(ModItems.BRONZE_PICKAXE);
            event.accept(ModItems.BRONZE_SHOVEL);
            event.accept(ModItems.BRONZE_HOE);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @EventBusSubscriber(modid = MOD_ID, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
            LOGGER.info("HELLO FROM CLIENT SETUP");
            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
