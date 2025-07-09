package net.theelementguy.mmmythics.datagen;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.common.data.LanguageProvider;
import net.theelementguy.mmmythics.CelestialBronzeMod;
import net.theelementguy.mmmythics.item.ModItems;

public class ModLanguageProvider extends LanguageProvider {
    public ModLanguageProvider(PackOutput output, String locale) {
        super(output, CelestialBronzeMod.MOD_ID, locale);
    }

    @Override
    protected void addTranslations() {
        add(ModItems.CELESTIAL_BRRONZE_SWORD.get(), "Celestial Bronze Sword");
        add(ModItems.IMPERIAL_GOLD_SWORD.get(), "Imperial Gold Sword");
        add(ModItems.CELESTIAL_BRONZE_UPGRADE_SMITHING_TEMPLATE.get(), "Celestial Bronze Upgrade");
        add(ModItems.IMPERIAL_GOLD_UPGRADE_SMITHING_TEMPLATE.get(), "Imperial Gold Upgrade");
        addSmithingTemplateTranslations(ModItems.CELESTIAL_BRONZE_UPGRADE_SMITHING_TEMPLATE.get(), "Bronze Sword", "Nether Star", "Add a Bronze Sword", "Add a Nether Star");
        addSmithingTemplateTranslations(ModItems.IMPERIAL_GOLD_UPGRADE_SMITHING_TEMPLATE.get(), "Golden Sword", "Nether Star", "Add a Golden Sword", "Add a Nether Star");
        addTooltip(ModItems.CELESTIAL_BRRONZE_SWORD.get(), "This sword once belonged to §kPerseus§r. Its history stretches to Greek times. While the sword does heavy damage, beware; it won't hurt anything less than pure monster.");
        addTooltip(ModItems.IMPERIAL_GOLD_SWORD.get(), "This sword was wielded by §kJason§r. Its history stretches to Greek times. While the sword does heavy damage, beware; it won't hurt anything less than pure monster.");
    }

    private void addSmithingTemplateTranslations(Item smithingTemplate, String appliesTo, String ingredients, String baseDescription, String ingredientDescription) {
        add(("item.mmmythics.smithing_template." + BuiltInRegistries.ITEM.getKey(smithingTemplate).getPath().replace("_smithing_template", "") + ".applies_to"), appliesTo);
        add(("item.mmmythics.smithing_template." + BuiltInRegistries.ITEM.getKey(smithingTemplate).getPath().replace("_smithing_template", "") + ".ingredients"), ingredients);
        add(("item.mmmythics.smithing_template." + BuiltInRegistries.ITEM.getKey(smithingTemplate).getPath().replace("_smithing_template", "") + ".base_slot_description"), baseDescription);
        add(("item.mmmythics.smithing_template." + BuiltInRegistries.ITEM.getKey(smithingTemplate).getPath().replace("_smithing_template", "") + ".additions_slot_description"), ingredientDescription);
    }

    private void addTooltip(Item item, String tooltip) {
        add("item.mmmythics." + BuiltInRegistries.ITEM.getKey(item).getPath() + ".hover_text", tooltip);
    }
}
