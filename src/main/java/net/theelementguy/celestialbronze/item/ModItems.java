package net.theelementguy.celestialbronze.item;

import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.theelementguy.celestialbronze.CelestialBronzeMod;
import net.theelementguy.celestialbronze.item.custom.CelestialBronzeSwordItem;

import java.util.List;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CelestialBronzeMod.MOD_ID);

    public static final DeferredItem<CelestialBronzeSwordItem> CELESTIAL_BRRONZE_SWORD = ITEMS.register("celestial_bronze_sword", () -> new CelestialBronzeSwordItem(ModToolTiers.CELESTIAL_BRONZE, new Item.Properties().attributes(CelestialBronzeSwordItem.createAttributes(ModToolTiers.CELESTIAL_BRONZE, 3, -2.4f)).rarity(Rarity.RARE)));

    public static final DeferredItem<Item> CELESTIAL_BRONZE_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("celestial_bronze_upgrade_smithing_template", () -> new SmithingTemplateItem(Component.translatable(Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(CelestialBronzeMod.MOD_ID, "smithing_template.celestial_bronze_upgrade.applies_to"))).withStyle(ChatFormatting.BLUE), Component.translatable(Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(CelestialBronzeMod.MOD_ID, "smithing_template.celestial_bronze_upgrade.ingredients"))).withStyle(ChatFormatting.BLUE), Component.translatable(Util.makeDescriptionId("upgrade", ResourceLocation.fromNamespaceAndPath(CelestialBronzeMod.MOD_ID, "celestial_bronze_upgrade"))), Component.translatable(Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(CelestialBronzeMod.MOD_ID, "smithing_template.celestial_bronze_upgrade.base_slot_description"))), Component.translatable(Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(CelestialBronzeMod.MOD_ID, "smithing_template.celestial_bronze_upgrade.additions_slot_description"))), List.of(ResourceLocation.withDefaultNamespace("item/empty_slot_sword")), List.of(ResourceLocation.fromNamespaceAndPath(CelestialBronzeMod.MOD_ID, "item/empty_slot_nether_star"))));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }

}
