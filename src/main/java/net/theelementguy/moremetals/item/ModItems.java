package net.theelementguy.moremetals.item;

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
import net.theelementguy.moremetals.MoreMetalsMod;
import net.theelementguy.moremetals.item.custom.CelestialBronzeSwordItem;
import net.theelementguy.moremetals.util.ModUtil;

import java.util.List;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MoreMetalsMod.MOD_ID);

    public static final DeferredItem<Item> CUBIC_ZIRCONIA = ITEMS.register("cubic_zirconia", () -> new Item(new Item.Properties().fireResistant()));

    public static final DeferredItem<Item> RAW_CUBIC_ZIRCONIA = ITEMS.register("raw_cubic_zirconia", () -> new Item(new Item.Properties().fireResistant()));

    public static final DeferredItem<SwordItem> CUBIC_ZIRCONIA_SWORD = ITEMS.register("cubic_zirconia_sword", () -> new SwordItem(ModToolTiers.CUBIC_ZIRCONIA, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.CUBIC_ZIRCONIA, 3, -2.4f)).fireResistant()));

    public static final DeferredItem<AxeItem> CUBIC_ZIRCONIA_AXE = ITEMS.register("cubic_zirconia_axe", () -> new AxeItem(ModToolTiers.CUBIC_ZIRCONIA, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.CUBIC_ZIRCONIA, 6.0f, -3.1f)).fireResistant()));

    public static final DeferredItem<PickaxeItem> CUBIC_ZIRCONIA_PICKAXE = ITEMS.register("cubic_zirconia_pickaxe", () -> new PickaxeItem(ModToolTiers.CUBIC_ZIRCONIA, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.CUBIC_ZIRCONIA, 1.0f, -2.8f)).fireResistant()));

    public static final DeferredItem<ShovelItem> CUBIC_ZIRCONIA_SHOVEL = ITEMS.register("cubic_zirconia_shovel", () -> new ShovelItem(ModToolTiers.CUBIC_ZIRCONIA, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.CUBIC_ZIRCONIA, 1.5f, -3.0f)).fireResistant()));

    public static final DeferredItem<HoeItem> CUBIC_ZIRCONIA_HOE = ITEMS.register("cubic_zirconia_hoe", () -> new HoeItem(ModToolTiers.CUBIC_ZIRCONIA, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.CUBIC_ZIRCONIA, -2.0f, -1.0f)).fireResistant()));

    public static final DeferredItem<ArmorItem> CUBIC_ZIRCONIA_HELMET = ITEMS.register("cubic_zirconia_helmet", () -> new ArmorItem(ModArmorMaterials.CUBIC_ZIRCONIA, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(39)).fireResistant()));

    public static final DeferredItem<ArmorItem> CUBIC_ZIRCONIA_CHESTPLATE = ITEMS.register("cubic_zirconia_chestplate", () -> new ArmorItem(ModArmorMaterials.CUBIC_ZIRCONIA, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(39)).fireResistant()));

    public static final DeferredItem<ArmorItem> CUBIC_ZIRCONIA_LEGGINGS = ITEMS.register("cubic_zirconia_leggings", () -> new ArmorItem(ModArmorMaterials.CUBIC_ZIRCONIA, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(39)).fireResistant()));

    public static final DeferredItem<ArmorItem> CUBIC_ZIRCONIA_BOOTS = ITEMS.register("cubic_zirconia_boots", () -> new ArmorItem(ModArmorMaterials.CUBIC_ZIRCONIA, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(39)).fireResistant()));

    public static final DeferredItem<Item> TIN_SCRAPS = ITEMS.register("tin_scraps", () -> new Item(new Item.Properties()));

    public static final DeferredItem<Item> RAW_CELESTIAL_BRONZE = ITEMS.register("raw_celestial_bronze", () -> new Item(new Item.Properties().rarity(Rarity.RARE)));

    public static final DeferredItem<Item> CELESTIAL_BRONZE_INGOT = ITEMS.register("celestial_bronze_ingot", () -> new Item(new Item.Properties().rarity(Rarity.RARE)));

    public static final DeferredItem<CelestialBronzeSwordItem> CELESTIAL_BRRONZE_SWORD = ITEMS.register("celestial_bronze_sword", () -> new CelestialBronzeSwordItem(ModToolTiers.CELESTIAL_BRONZE, new Item.Properties().attributes(CelestialBronzeSwordItem.createAttributes(ModToolTiers.CELESTIAL_BRONZE, 3, -2.4f)).rarity(Rarity.RARE)));

    public static final DeferredItem<Item> RUBIDIUM = ITEMS.register("rubidium", () -> new Item(new Item.Properties()));

    public static final DeferredItem<SwordItem> RUBIDIUM_SWORD = ITEMS.register("rubidium_sword", () -> new SwordItem(ModToolTiers.RUBIDIUM, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.RUBIDIUM, 3, -2.4f))));

    public static final DeferredItem<AxeItem> RUBIDIUM_AXE = ITEMS.register("rubidium_axe", () -> new AxeItem(ModToolTiers.RUBIDIUM, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.RUBIDIUM, 6.0f, -3.1f))));

    public static final DeferredItem<PickaxeItem> RUBIDIUM_PICKAXE = ITEMS.register("rubidium_pickaxe", () -> new PickaxeItem(ModToolTiers.RUBIDIUM, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.RUBIDIUM, 1.0f, -2.8f))));

    public static final DeferredItem<ShovelItem> RUBIDIUM_SHOVEL = ITEMS.register("rubidium_shovel", () -> new ShovelItem(ModToolTiers.RUBIDIUM, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.RUBIDIUM, 1.5f, -3.0f))));

    public static final DeferredItem<HoeItem> RUBIDIUM_HOE = ITEMS.register("rubidium_hoe", () -> new HoeItem(ModToolTiers.RUBIDIUM, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.RUBIDIUM, -2.0f, -1.0f))));

    public static final DeferredItem<ArmorItem> RUBIDIUM_HELMET = ITEMS.register("rubidium_helmet", () -> new ArmorItem(ModArmorMaterials.RUBIDIUM, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(35))));

    public static final DeferredItem<ArmorItem> RUBIDIUM_CHESTPLATE = ITEMS.register("rubidium_chestplate", () -> new ArmorItem(ModArmorMaterials.RUBIDIUM, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(35))));

    public static final DeferredItem<ArmorItem> RUBIDIUM_LEGGINGS = ITEMS.register("rubidium_leggings", () -> new ArmorItem(ModArmorMaterials.RUBIDIUM, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(35))));

    public static final DeferredItem<ArmorItem> RUBIDIUM_BOOTS = ITEMS.register("rubidium_boots", () -> new ArmorItem(ModArmorMaterials.RUBIDIUM, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(35))));

    public static final DeferredItem<Item> STARSHARD = ITEMS.register("starshard", () -> new Item(new Item.Properties().rarity(Rarity.UNCOMMON)));

    public static final DeferredItem<SwordItem> STARSHARD_SWORD = ITEMS.register("starshard_sword", () -> new SwordItem(ModToolTiers.STARSHARD, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.STARSHARD, 3, -2.4f))));

    public static final DeferredItem<AxeItem> STARSHARD_AXE = ITEMS.register("starshard_axe", () -> new AxeItem(ModToolTiers.STARSHARD, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.STARSHARD, 6.0f, -3.1f))));

    public static final DeferredItem<PickaxeItem> STARSHARD_PICKAXE = ITEMS.register("starshard_pickaxe", () -> new PickaxeItem(ModToolTiers.STARSHARD, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.STARSHARD, 1.0f, -2.8f))));

    public static final DeferredItem<ShovelItem> STARSHARD_SHOVEL = ITEMS.register("starshard_shovel", () -> new ShovelItem(ModToolTiers.STARSHARD, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.STARSHARD, 1.5f, -3.0f))));

    public static final DeferredItem<HoeItem> STARSHARD_HOE = ITEMS.register("starshard_hoe", () -> new HoeItem(ModToolTiers.STARSHARD, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.STARSHARD, -2.0f, -1.0f))));

    public static final DeferredItem<ArmorItem> STARSHARD_HELMET = ITEMS.register("starshard_helmet", () -> new ArmorItem(ModArmorMaterials.STARSHARD, ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(41))));

    public static final DeferredItem<ArmorItem> STARSHARD_CHESTPLATE = ITEMS.register("starshard_chestplate", () -> new ArmorItem(ModArmorMaterials.STARSHARD, ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(41))));

    public static final DeferredItem<ArmorItem> STARSHARD_LEGGINGS = ITEMS.register("starshard_leggings", () -> new ArmorItem(ModArmorMaterials.STARSHARD, ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(41))));

    public static final DeferredItem<ArmorItem> STARSHARD_BOOTS = ITEMS.register("starshard_boots", () -> new ArmorItem(ModArmorMaterials.STARSHARD, ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(41))));

    public static final DeferredItem<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties()));

    public static final DeferredItem<SwordItem> BRONZE_SWORD = ITEMS.register("bronze_sword", () -> new SwordItem(ModToolTiers.BRONZE, new Item.Properties().attributes(SwordItem.createAttributes(ModToolTiers.BRONZE, 3.0F, -2.4F))));

    public static final DeferredItem<AxeItem> BRONZE_AXE = ITEMS.register("bronze_axe", () -> new AxeItem(ModToolTiers.BRONZE, new Item.Properties().attributes(AxeItem.createAttributes(ModToolTiers.BRONZE, 6.0F, -3.1F))));

    public static final DeferredItem<PickaxeItem> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe", () -> new PickaxeItem(ModToolTiers.BRONZE, new Item.Properties().attributes(PickaxeItem.createAttributes(ModToolTiers.BRONZE, 1.0F, -2.8F))));

    public static final DeferredItem<ShovelItem> BRONZE_SHOVEL = ITEMS.register("bronze_shovel", () -> new ShovelItem(ModToolTiers.BRONZE, new Item.Properties().attributes(ShovelItem.createAttributes(ModToolTiers.BRONZE, 1.5F, -3.0F))));

    public static final DeferredItem<HoeItem> BRONZE_HOE = ITEMS.register("bronze_hoe", () -> new HoeItem(ModToolTiers.BRONZE, new Item.Properties().attributes(HoeItem.createAttributes(ModToolTiers.BRONZE, -2.0F, -1.0F))));

    public static final DeferredItem<ArmorItem> BRONZE_HELMET = ITEMS.register("bronze_helmet", () -> new ArmorItem(ModArmorMaterials.BRONZE, ArmorItem.Type.HELMET, (new Item.Properties())));

    public static final DeferredItem<ArmorItem> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate", () -> new ArmorItem(ModArmorMaterials.BRONZE, ArmorItem.Type.CHESTPLATE, (new Item.Properties())));

    public static final DeferredItem<ArmorItem> BRONZE_LEGGINGS = ITEMS.register("bronze_leggings", () -> new ArmorItem(ModArmorMaterials.BRONZE, ArmorItem.Type.LEGGINGS, (new Item.Properties())));

    public static final DeferredItem<ArmorItem> BRONZE_BOOTS = ITEMS.register("bronze_boots", () -> new ArmorItem(ModArmorMaterials.BRONZE, ArmorItem.Type.BOOTS, (new Item.Properties())));

    public static final DeferredItem<Item> CELESTIAL_BRONZE_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("celestial_bronze_upgrade_smithing_template", () -> new SmithingTemplateItem(Component.translatable(Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "smithing_template.celestial_bronze_upgrade.applies_to"))).withStyle(ChatFormatting.BLUE), Component.translatable(Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "smithing_template.celestial_bronze_upgrade.ingredients"))).withStyle(ChatFormatting.BLUE), Component.translatable(Util.makeDescriptionId("upgrade", ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "celestial_bronze_upgrade"))), Component.translatable(Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "smithing_template.celestial_bronze_upgrade.base_slot_description"))), Component.translatable(Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "smithing_template.celestial_bronze_upgrade.additions_slot_description"))), List.of(ResourceLocation.withDefaultNamespace("container/slot/sword")), List.of(ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "container/slot/nether_star"))));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }

}
