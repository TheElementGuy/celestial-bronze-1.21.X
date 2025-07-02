package net.theelementguy.moremetals.item;

import net.minecraft.Util;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.theelementguy.moremetals.util.ModTags;
import net.theelementguy.moremetals.util.ModUtil;

import java.util.EnumMap;
import java.util.Map;

public class ModArmorMaterials {
    public static final ArmorMaterial CUBIC_ZIRCONIA = new ArmorMaterial(39, (Map) Util.make(new EnumMap(ArmorType.class), (attribute) -> {
        attribute.put(ArmorType.HELMET, 2);
        attribute.put(ArmorType.CHESTPLATE, 6);
        attribute.put(ArmorType.LEGGINGS, 5);
        attribute.put(ArmorType.BOOTS, 2);
        attribute.put(ArmorType.BODY, 5);
    }), 14, SoundEvents.ARMOR_EQUIP_DIAMOND, 0.0F, 0.0F, ModTags.Items.CUBIC_ZIRCONIA_REPAIRABLES, ModUtil.createEquipmentAssetResourceKey("cubic_zirconia"));
    public static final ArmorMaterial RUBIDIUM = new ArmorMaterial(35, (Map)Util.make(new EnumMap(ArmorType.class), (attribute) -> {
        attribute.put(ArmorType.HELMET, 3);
        attribute.put(ArmorType.CHESTPLATE, 8);
        attribute.put(ArmorType.LEGGINGS, 6);
        attribute.put(ArmorType.BOOTS, 3);
        attribute.put(ArmorType.BODY, 10);
    }), 15, SoundEvents.ARMOR_EQUIP_DIAMOND, 1.0F, 0.0F, ModTags.Items.RUBIDIUM_REPAIRABLES, ModUtil.createEquipmentAssetResourceKey("rubidium"));
    public static final ArmorMaterial STARSHARD = new ArmorMaterial(41, (Map)Util.make(new EnumMap(ArmorType.class), (attribute) -> {
        attribute.put(ArmorType.HELMET, 4);
        attribute.put(ArmorType.CHESTPLATE, 7);
        attribute.put(ArmorType.LEGGINGS, 9);
        attribute.put(ArmorType.BOOTS, 4);
        attribute.put(ArmorType.BODY, 12);
    }), 13, SoundEvents.ARMOR_EQUIP_DIAMOND, 4.0F, 0.5F, ModTags.Items.STARSHARD_REPAIRABLES, ModUtil.createEquipmentAssetResourceKey("starshard"));
    public static final ArmorMaterial BRONZE = new ArmorMaterial(41, (Map)Util.make(new EnumMap(ArmorType.class), (attribute) -> {
        attribute.put(ArmorType.HELMET, 1);
        attribute.put(ArmorType.CHESTPLATE, 4);
        attribute.put(ArmorType.LEGGINGS, 5);
        attribute.put(ArmorType.BOOTS, 2);
        attribute.put(ArmorType.BODY, 4);
    }), 13, SoundEvents.ARMOR_EQUIP_IRON, 0.0F, 0.0F, ModTags.Items.BRONZE_REPAIRABLES, ModEquipmentAssets.BRONZE);

}
