package net.theelementguy.moremetals.item;

import net.minecraft.Util;
import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.Ingredient;
import net.theelementguy.moremetals.MoreMetalsMod;

import java.util.EnumMap;
import java.util.List;
import java.util.function.Supplier;

public class ModArmorMaterials {

    public static final Holder<ArmorMaterial> CUBIC_ZIRCONIA = register("cubic_zirconia", Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
        attribute.put(ArmorItem.Type.HELMET, 2);
        attribute.put(ArmorItem.Type.CHESTPLATE, 6);
        attribute.put(ArmorItem.Type.LEGGINGS, 5);
        attribute.put(ArmorItem.Type.BOOTS, 2);
        attribute.put(ArmorItem.Type.BODY, 5);
    }), 14, 0.0f, 0.0f, () -> ModItems.CUBIC_ZIRCONIA.get(), SoundEvents.ARMOR_EQUIP_DIAMOND);

    public static final Holder<ArmorMaterial> RUBIDIUM = register("rubidium", Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
        attribute.put(ArmorItem.Type.HELMET, 3);
        attribute.put(ArmorItem.Type.CHESTPLATE, 8);
        attribute.put(ArmorItem.Type.LEGGINGS, 6);
        attribute.put(ArmorItem.Type.BOOTS, 3);
        attribute.put(ArmorItem.Type.BODY, 10);
    }), 15, 1.0f, 0.0f, () -> ModItems.RUBIDIUM.get(), SoundEvents.ARMOR_EQUIP_NETHERITE);

    public static final Holder<ArmorMaterial> STARSHARD = register("starshard", Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
        attribute.put(ArmorItem.Type.HELMET, 4);
        attribute.put(ArmorItem.Type.CHESTPLATE, 7);
        attribute.put(ArmorItem.Type.LEGGINGS, 9);
        attribute.put(ArmorItem.Type.BOOTS, 4);
        attribute.put(ArmorItem.Type.BODY, 12);
    }), 13, 4.0f, 0.5f, () -> ModItems.STARSHARD.get(), SoundEvents.ARMOR_EQUIP_DIAMOND);

    public static final Holder<ArmorMaterial> BRONZE = register("bronze", Util.make(new EnumMap<>(ArmorItem.Type.class), attribute -> {
        attribute.put(ArmorItem.Type.HELMET, 1);
        attribute.put(ArmorItem.Type.CHESTPLATE, 4);
        attribute.put(ArmorItem.Type.LEGGINGS, 5);
        attribute.put(ArmorItem.Type.BOOTS, 2);
        attribute.put(ArmorItem.Type.BODY, 4);
    }), 13, 0.0f, 0.0f, () -> ModItems.BRONZE_INGOT.get(), SoundEvents.ARMOR_EQUIP_IRON);

    private static Holder<ArmorMaterial> register(String name, EnumMap<ArmorItem.Type, Integer> typeProtection, int enchantability, float toughness, float knockbackResistance, Supplier<Item> ingredientItem, Holder<SoundEvent> equipSound) {
        ResourceLocation location = ResourceLocation.fromNamespaceAndPath(MoreMetalsMod.MOD_ID, name);
        //Holder<SoundEvent> equipSound = SoundEvents.ARMOR_EQUIP_DIAMOND;
        Supplier<Ingredient> ingredient = () -> Ingredient.of(ingredientItem.get());
        List<ArmorMaterial.Layer> layers = List.of(new ArmorMaterial.Layer(location));

        EnumMap<ArmorItem.Type, Integer> typeMap = new EnumMap<>(ArmorItem.Type.class);
        for (ArmorItem.Type type : ArmorItem.Type.values()) {
            typeMap.put(type, typeProtection.get(type));
        }

        return Registry.registerForHolder(BuiltInRegistries.ARMOR_MATERIAL, location, new ArmorMaterial(typeProtection, enchantability, equipSound, ingredient, layers, toughness, knockbackResistance));
    }

}