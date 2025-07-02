package net.theelementguy.celestialbronze.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.EntityTypeTagsProvider;
import net.minecraft.tags.EntityTypeTags;
import net.minecraft.world.entity.EntityType;
import net.theelementguy.celestialbronze.CelestialBronzeMod;
import net.theelementguy.celestialbronze.util.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModEntityTypeTagProvider extends EntityTypeTagsProvider {
    public ModEntityTypeTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> provider) {
        super(output, provider, CelestialBronzeMod.MOD_ID);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.EntityTypes.CELESTIAL_BRONZE_SWORD_TARGETS).add(EntityType.BLAZE).add(EntityType.BOGGED).add(EntityType.BREEZE).add(EntityType.CAVE_SPIDER).add(EntityType.CREEPER).add(EntityType.DROWNED).add(EntityType.ELDER_GUARDIAN).add(EntityType.END_CRYSTAL).add(EntityType.ENDER_DRAGON).add(EntityType.ENDERMAN).add(EntityType.ENDERMITE).add(EntityType.EVOKER).add(EntityType.EVOKER_FANGS).add(EntityType.GHAST).add(EntityType.GUARDIAN).add(EntityType.HOGLIN).add(EntityType.HUSK).add(EntityType.ILLUSIONER).add(EntityType.MAGMA_CUBE).add(EntityType.PHANTOM).add(EntityType.PIGLIN).add(EntityType.PIGLIN_BRUTE).add(EntityType.PILLAGER).add(EntityType.RAVAGER).add(EntityType.SHULKER).add(EntityType.SHULKER_BULLET).add(EntityType.SILVERFISH).addTag(EntityTypeTags.SKELETONS).add(EntityType.SLIME).add(EntityType.SPIDER).add(EntityType.VEX).add(EntityType.VINDICATOR).add(EntityType.WARDEN).add(EntityType.WITCH).add(EntityType.WITHER).add(EntityType.WITHER_SKELETON).add(EntityType.ZOGLIN).addTag(EntityTypeTags.ZOMBIES).add(EntityType.ZOMBIFIED_PIGLIN);
    }
}