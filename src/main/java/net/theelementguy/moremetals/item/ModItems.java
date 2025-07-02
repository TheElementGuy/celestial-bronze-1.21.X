package net.theelementguy.moremetals.item;

import net.minecraft.ChatFormatting;
import net.minecraft.Util;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.theelementguy.moremetals.MoreMetalsMod;
import net.theelementguy.moremetals.item.custom.CelestialBronzeSwordItem;
import net.theelementguy.moremetals.trim.ModTrimMaterials;
import net.theelementguy.moremetals.util.ModUtil;

import java.util.List;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MoreMetalsMod.MOD_ID);

    public static final DeferredItem<Item> CUBIC_ZIRCONIA = ITEMS.registerSimpleItem("cubic_zirconia", new Item.Properties().fireResistant().trimMaterial(ModTrimMaterials.CUBIC_ZIRCONIA));

    public static final DeferredItem<Item> RAW_CUBIC_ZIRCONIA = ITEMS.registerSimpleItem("raw_cubic_zirconia", new Item.Properties());

    public static final DeferredItem<Item> CUBIC_ZIRCONIA_SWORD = ITEMS.register("cubic_zirconia_sword", () -> new Item((new Item.Properties()).fireResistant().sword(ModToolMaterials.CUBIC_ZIRCONIA, 3.0F, -2.4F).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "cubic_zirconia_sword")))));

    public static final DeferredItem<AxeItem> CUBIC_ZIRCONIA_AXE = ITEMS.register("cubic_zirconia_axe", () -> new AxeItem(ModToolMaterials.CUBIC_ZIRCONIA, 6.0F, -3.1F, (new Item.Properties()).fireResistant().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "cubic_zirconia_axe")))));

    public static final DeferredItem<Item> CUBIC_ZIRCONIA_PICKAXE = ITEMS.register("cubic_zirconia_pickaxe", () -> new Item((new Item.Properties()).fireResistant().pickaxe(ModToolMaterials.CUBIC_ZIRCONIA, 1.0F, -2.8F).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "cubic_zirconia_pickaxe")))));

    public static final DeferredItem<ShovelItem> CUBIC_ZIRCONIA_SHOVEL = ITEMS.register("cubic_zirconia_shovel", () -> new ShovelItem(ModToolMaterials.CUBIC_ZIRCONIA, 1.5F, -3.0F, (new Item.Properties()).fireResistant().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "cubic_zirconia_shovel")))));

    public static final DeferredItem<HoeItem> CUBIC_ZIRCONIA_HOE = ITEMS.register("cubic_zirconia_hoe", () -> new HoeItem(ModToolMaterials.CUBIC_ZIRCONIA, -2.0F, -1.0F, (new Item.Properties()).fireResistant().setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "cubic_zirconia_hoe")))));

    public static final DeferredItem<Item> CUBIC_ZIRCONIA_HELMET = ITEMS.register("cubic_zirconia_helmet", () -> new Item(new Item.Properties().fireResistant().humanoidArmor(ModArmorMaterials.CUBIC_ZIRCONIA, ArmorType.HELMET).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "cubic_zirconia_helmet")))));

    public static final DeferredItem<Item> CUBIC_ZIRCONIA_CHESTPLATE = ITEMS.register("cubic_zirconia_chestplate", () -> new Item((new Item.Properties()).fireResistant().humanoidArmor(ModArmorMaterials.CUBIC_ZIRCONIA, ArmorType.CHESTPLATE).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "cubic_zirconia_chestplate")))));

    public static final DeferredItem<Item> CUBIC_ZIRCONIA_LEGGINGS = ITEMS.register("cubic_zirconia_leggings", () -> new Item((new Item.Properties()).fireResistant().humanoidArmor(ModArmorMaterials.CUBIC_ZIRCONIA, ArmorType.LEGGINGS).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "cubic_zirconia_leggings")))));

    public static final DeferredItem<Item> CUBIC_ZIRCONIA_BOOTS = ITEMS.register("cubic_zirconia_boots", () -> new Item((new Item.Properties()).fireResistant().humanoidArmor(ModArmorMaterials.CUBIC_ZIRCONIA, ArmorType.BOOTS).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "cubic_zirconia_boots")))));

    public static final DeferredItem<Item> TIN_SCRAPS = ITEMS.register("tin_scraps", () -> new Item((new Item.Properties().trimMaterial(ModTrimMaterials.TIN)).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "tin_scraps")))));

    public static final DeferredItem<CelestialBronzeSwordItem> CELESTIAL_BRRONZE_SWORD = ITEMS.register("celestial_bronze_sword", () -> new CelestialBronzeSwordItem(ModToolMaterials.CELESTIAL_BRONZE, 3.0F, -2.4F, (new Item.Properties()).rarity(Rarity.RARE).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "celestial_bronze_sword")))));

    public static final DeferredItem<Item> RUBIDIUM = ITEMS.register("rubidium", () -> new Item((new Item.Properties()).trimMaterial(ModTrimMaterials.RUBIDIUM).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "rubidium")))));

    public static final DeferredItem<Item> RUBIDIUM_SWORD = ITEMS.register("rubidium_sword", () -> new Item((new Item.Properties()).sword(ModToolMaterials.RUBIDIUM, 3.0F, -2.4F).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "rubidium_sword")))));

    public static final DeferredItem<AxeItem> RUBIDIUM_AXE = ITEMS.register("rubidium_axe", () -> new AxeItem(ModToolMaterials.RUBIDIUM, 6.0F, -3.1F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "rubidium_axe")))));

    public static final DeferredItem<Item> RUBIDIUM_PICKAXE = ITEMS.register("rubidium_pickaxe", () -> new Item((new Item.Properties()).pickaxe(ModToolMaterials.RUBIDIUM, 1.0F, -2.8F).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "rubidium_pickaxe")))));

    public static final DeferredItem<ShovelItem> RUBIDIUM_SHOVEL = ITEMS.register("rubidium_shovel", () -> new ShovelItem(ModToolMaterials.RUBIDIUM, 1.5F, -3.0F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "rubidium_shovel")))));

    public static final DeferredItem<HoeItem> RUBIDIUM_HOE = ITEMS.register("rubidium_hoe", () -> new HoeItem(ModToolMaterials.RUBIDIUM, -2.0F, -1.0F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "rubidium_hoe")))));

    public static final DeferredItem<Item> RUBIDIUM_HELMET = ITEMS.register("rubidium_helmet", () -> new Item((new Item.Properties()).humanoidArmor(ModArmorMaterials.RUBIDIUM, ArmorType.HELMET).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "rubidium_helmet")))));

    public static final DeferredItem<Item> RUBIDIUM_CHESTPLATE = ITEMS.register("rubidium_chestplate", () -> new Item((new Item.Properties()).humanoidArmor(ModArmorMaterials.RUBIDIUM, ArmorType.CHESTPLATE).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "rubidium_chestplate")))));

    public static final DeferredItem<Item> RUBIDIUM_LEGGINGS = ITEMS.register("rubidium_leggings", () -> new Item((new Item.Properties()).humanoidArmor(ModArmorMaterials.RUBIDIUM, ArmorType.LEGGINGS).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "rubidium_leggings")))));

    public static final DeferredItem<Item> RUBIDIUM_BOOTS = ITEMS.register("rubidium_boots", () -> new Item((new Item.Properties()).humanoidArmor(ModArmorMaterials.RUBIDIUM, ArmorType.BOOTS).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "rubidium_boots")))));

    public static final DeferredItem<Item> STARSHARD = ITEMS.register("starshard", () -> new Item((new Item.Properties()).rarity(Rarity.UNCOMMON).trimMaterial(ModTrimMaterials.STARSHARD).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "starshard")))));

    public static final DeferredItem<Item> STARSHARD_SWORD = ITEMS.register("starshard_sword", () -> new Item((new Item.Properties()).sword(ModToolMaterials.STARSHARD, 3.0F, -2.4F).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "starshard_sword")))));

    public static final DeferredItem<AxeItem> STARSHARD_AXE = ITEMS.register("starshard_axe", () -> new AxeItem(ModToolMaterials.STARSHARD, 6.0F, -3.1F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "starshard_axe")))));

    public static final DeferredItem<Item> STARSHARD_PICKAXE = ITEMS.register("starshard_pickaxe", () -> new Item((new Item.Properties()).pickaxe(ModToolMaterials.STARSHARD, 1.0F, -2.8F).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "starshard_pickaxe")))));

    public static final DeferredItem<ShovelItem> STARSHARD_SHOVEL = ITEMS.register("starshard_shovel", () -> new ShovelItem(ModToolMaterials.STARSHARD, 1.5F, -3.0F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "starshard_shovel")))));

    public static final DeferredItem<HoeItem> STARSHARD_HOE = ITEMS.register("starshard_hoe", () -> new HoeItem(ModToolMaterials.STARSHARD, -2.0F, -1.0F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "starshard_hoe")))));

    public static final DeferredItem<Item> STARSHARD_HELMET = ITEMS.register("starshard_helmet", () -> new Item((new Item.Properties()).humanoidArmor(ModArmorMaterials.STARSHARD, ArmorType.HELMET).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "starshard_helmet")))));

    public static final DeferredItem<Item> STARSHARD_CHESTPLATE = ITEMS.register("starshard_chestplate", () -> new Item((new Item.Properties()).humanoidArmor(ModArmorMaterials.STARSHARD, ArmorType.CHESTPLATE).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "starshard_chestplate")))));

    public static final DeferredItem<Item> STARSHARD_LEGGINGS = ITEMS.register("starshard_leggings", () -> new Item((new Item.Properties()).humanoidArmor(ModArmorMaterials.STARSHARD, ArmorType.LEGGINGS).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "starshard_leggings")))));

    public static final DeferredItem<Item> STARSHARD_BOOTS = ITEMS.register("starshard_boots", () -> new Item((new Item.Properties()).humanoidArmor(ModArmorMaterials.STARSHARD, ArmorType.BOOTS).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "starshard_boots")))));

    public static final DeferredItem<Item> BRONZE_INGOT = ITEMS.register("bronze_ingot", () -> new Item(new Item.Properties().trimMaterial(ModTrimMaterials.BRONZE).setId(ModUtil.createItemResourceKey("bronze_ingot"))));

    public static final DeferredItem<Item> BRONZE_SWORD = ITEMS.register("bronze_sword", () -> new Item((new Item.Properties()).sword(ModToolMaterials.BRONZE, 3.0F, -2.4F).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "bronze_sword")))));

    public static final DeferredItem<AxeItem> BRONZE_AXE = ITEMS.register("bronze_axe", () -> new AxeItem(ModToolMaterials.BRONZE, 6.0F, -3.1F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "bronze_axe")))));

    public static final DeferredItem<Item> BRONZE_PICKAXE = ITEMS.register("bronze_pickaxe", () -> new Item((new Item.Properties()).pickaxe(ModToolMaterials.BRONZE, 1.0F, -2.8F).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "bronze_pickaxe")))));

    public static final DeferredItem<ShovelItem> BRONZE_SHOVEL = ITEMS.register("bronze_shovel", () -> new ShovelItem(ModToolMaterials.BRONZE, 1.5F, -3.0F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "bronze_shovel")))));

    public static final DeferredItem<HoeItem> BRONZE_HOE = ITEMS.register("bronze_hoe", () -> new HoeItem(ModToolMaterials.BRONZE, -2.0F, -1.0F, (new Item.Properties()).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "bronze_hoe")))));

    public static final DeferredItem<Item> BRONZE_HELMET = ITEMS.register("bronze_helmet", () -> new Item((new Item.Properties()).humanoidArmor(ModArmorMaterials.BRONZE, ArmorType.HELMET).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "bronze_helmet")))));

    public static final DeferredItem<Item> BRONZE_CHESTPLATE = ITEMS.register("bronze_chestplate", () -> new Item((new Item.Properties()).humanoidArmor(ModArmorMaterials.BRONZE, ArmorType.CHESTPLATE).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "bronze_chestplate")))));

    public static final DeferredItem<Item> BRONZE_LEGGINGS = ITEMS.register("bronze_leggings", () -> new Item((new Item.Properties()).humanoidArmor(ModArmorMaterials.BRONZE, ArmorType.LEGGINGS).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "bronze_leggings")))));

    public static final DeferredItem<Item> BRONZE_BOOTS = ITEMS.register("bronze_boots", () -> new Item((new Item.Properties()).humanoidArmor(ModArmorMaterials.BRONZE, ArmorType.BOOTS).setId(ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "bronze_boots")))));

    public static final DeferredItem<Item> CELESTIAL_BRONZE_UPGRADE_SMITHING_TEMPLATE = ITEMS.register("celestial_bronze_upgrade_smithing_template", () -> new SmithingTemplateItem(Component.translatable(Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "smithing_template.celestial_bronze_upgrade.applies_to"))).withStyle(ChatFormatting.BLUE), Component.translatable(Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "smithing_template.celestial_bronze_upgrade.ingredients"))).withStyle(ChatFormatting.BLUE), Component.translatable(Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "smithing_template.celestial_bronze_upgrade.base_slot_description"))), Component.translatable(Util.makeDescriptionId("item", ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "smithing_template.celestial_bronze_upgrade.additions_slot_description"))), List.of(ResourceLocation.withDefaultNamespace("container/slot/sword")), List.of(ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, "container/slot/nether_star")), new Item.Properties().rarity(Rarity.UNCOMMON).setId(ModUtil.createItemResourceKey("celestial_bronze_upgrade_smithing_template"))));

    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }

}
