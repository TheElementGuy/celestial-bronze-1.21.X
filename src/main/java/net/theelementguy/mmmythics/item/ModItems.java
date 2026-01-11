package net.theelementguy.mmmythics.item;

import net.minecraft.ChatFormatting;
import net.minecraft.util.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.theelementguy.mmmythics.CelestialBronzeMod;
import net.theelementguy.mmmythics.item.custom.CelestialBronzeSwordItem;
import net.theelementguy.mmmythics.item.custom.ImperialGoldSwordItem;
import net.theelementguy.mmmythics.util.ModUtil;

import java.util.List;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CelestialBronzeMod.MOD_ID);

    public static final DeferredItem<CelestialBronzeSwordItem> CELESTIAL_BRRONZE_SWORD = ITEMS.register("celestial_bronze_sword", () -> new CelestialBronzeSwordItem(ModToolMaterials.CELESTIAL_BRONZE, 3.0F, -2.4F, (new Item.Properties()).rarity(Rarity.RARE).setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(CelestialBronzeMod.MOD_ID, "celestial_bronze_sword")))));

    public static final DeferredItem<ImperialGoldSwordItem> IMPERIAL_GOLD_SWORD = ITEMS.register("imperial_gold_sword", () -> new ImperialGoldSwordItem(ModToolMaterials.IMPERIAL_GOLD, 3.0f, -2.4f, (new Item.Properties().rarity(Rarity.RARE).setId(ModUtil.createItemResourceKey("imperial_gold_sword")))));

    public static final DeferredItem<Item> CELESTIAL_BRONZE_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("celestial_bronze_upgrade_smithing_template", () -> new SmithingTemplateItem(Component.translatable(Util.makeDescriptionId("item", Identifier.fromNamespaceAndPath(CelestialBronzeMod.MOD_ID, "smithing_template.celestial_bronze_upgrade.applies_to"))).withStyle(ChatFormatting.BLUE), Component.translatable(Util.makeDescriptionId("item", Identifier.fromNamespaceAndPath(CelestialBronzeMod.MOD_ID, "smithing_template.celestial_bronze_upgrade.ingredients"))).withStyle(ChatFormatting.BLUE), Component.translatable(Util.makeDescriptionId("item", Identifier.fromNamespaceAndPath(CelestialBronzeMod.MOD_ID, "smithing_template.celestial_bronze_upgrade.base_slot_description"))), Component.translatable(Util.makeDescriptionId("item", Identifier.fromNamespaceAndPath(CelestialBronzeMod.MOD_ID, "smithing_template.celestial_bronze_upgrade.additions_slot_description"))), List.of(Identifier.withDefaultNamespace("container/slot/sword")), List.of(Identifier.fromNamespaceAndPath(CelestialBronzeMod.MOD_ID, "container/slot/nether_star")), new Item.Properties().rarity(Rarity.UNCOMMON).setId(ModUtil.createItemResourceKey("celestial_bronze_upgrade_smithing_template"))));

    public static final DeferredItem<Item> IMPERIAL_GOLD_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("imperial_gold_upgrade_smithing_template", () -> new SmithingTemplateItem(Component.translatable(Util.makeDescriptionId("item", Identifier.fromNamespaceAndPath(CelestialBronzeMod.MOD_ID, "smithing_template.imperial_gold_upgrade.applies_to"))).withStyle(ChatFormatting.BLUE), Component.translatable(Util.makeDescriptionId("item", Identifier.fromNamespaceAndPath(CelestialBronzeMod.MOD_ID, "smithing_template.imperial_gold_upgrade.ingredients"))).withStyle(ChatFormatting.BLUE), Component.translatable(Util.makeDescriptionId("item", Identifier.fromNamespaceAndPath(CelestialBronzeMod.MOD_ID, "smithing_template.imperial_gold_upgrade.base_slot_description"))), Component.translatable(Util.makeDescriptionId("item", Identifier.fromNamespaceAndPath(CelestialBronzeMod.MOD_ID, "smithing_template.imperial_gold_upgrade.additions_slot_description"))), List.of(Identifier.withDefaultNamespace("container/slot/sword")), List.of(Identifier.fromNamespaceAndPath(CelestialBronzeMod.MOD_ID, "container/slot/nether_star")), new Item.Properties().rarity(Rarity.UNCOMMON).setId(ModUtil.createItemResourceKey("imperial_gold_upgrade_smithing_template"))));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }

}