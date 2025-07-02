package net.theelementguy.celestialbronze.item;

import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.theelementguy.celestialbronze.CelestialBronzeMod;
import net.theelementguy.celestialbronze.item.custom.CelestialBronzeSwordItem;
import net.theelementguy.celestialbronze.util.ModUtil;

import java.util.List;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CelestialBronzeMod.MOD_ID);

    public static final DeferredItem<CelestialBronzeSwordItem> CELESTIAL_BRRONZE_SWORD = ITEMS.register("celestial_bronze_sword", () -> new CelestialBronzeSwordItem(ModToolMaterials.CELESTIAL_BRONZE, 3.0F, -2.4F, (new Item.Properties()).rarity(Rarity.RARE).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(CelestialBronzeMod.MOD_ID, "celestial_bronze_sword")))));

    public static final DeferredItem<Item> CELESTIAL_BRONZE_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("celestial_bronze_upgrade_smithing_template", () -> new SmithingTemplateItem(Component.translatable(Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(CelestialBronzeMod.MOD_ID, "smithing_template.celestial_bronze_upgrade.applies_to"))).withStyle(ChatFormatting.BLUE), Component.translatable(Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(CelestialBronzeMod.MOD_ID, "smithing_template.celestial_bronze_upgrade.ingredients"))).withStyle(ChatFormatting.BLUE), Component.translatable(Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(CelestialBronzeMod.MOD_ID, "smithing_template.celestial_bronze_upgrade.base_slot_description"))), Component.translatable(Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(CelestialBronzeMod.MOD_ID, "smithing_template.celestial_bronze_upgrade.additions_slot_description"))), List.of(ResourceLocation.withDefaultNamespace("container/slot/sword")), List.of(ResourceLocation.fromNamespaceAndPath(CelestialBronzeMod.MOD_ID, "container/slot/nether_star")), new Item.Properties().rarity(Rarity.UNCOMMON).setId(ModUtil.createItemResourceKey("celestial_bronze_upgrade_smithing_template"))));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }

}
