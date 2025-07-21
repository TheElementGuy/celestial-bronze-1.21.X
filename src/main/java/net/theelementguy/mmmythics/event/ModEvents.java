package net.theelementguy.mmmythics.event;

import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.player.AttackEntityEvent;
import net.theelementguy.mmmythics.CelestialBronzeMod;
import net.theelementguy.mmmythics.util.ModTags;

import java.util.function.Predicate;

@EventBusSubscriber(modid = CelestialBronzeMod.MOD_ID)
public class ModEvents {

    //ModItems.CELESTIAL_BRONZE_SWORD.get();

    @SubscribeEvent
    public static void attackEntityEvent(AttackEntityEvent event) {
        LivingEntity attacker = event.getEntity();
        Item item = attacker.getMainHandItem().getItem();
        ItemStack stack = attacker.getMainHandItem();
        LivingEntity entity = (LivingEntity) event.getTarget();
        EntityType<?> type = entity.getType();

        //attacker.sendSystemMessage(Component.literal("You hit something!"));

        if (stack.is(ModTags.Items.MONSTER_HUNTING_SWORDS)) {

            boolean tagMatch = type.getTags().anyMatch(new Predicate<TagKey<EntityType<?>>>() {
                @Override
                public boolean test(TagKey<EntityType<?>> entityTypeTagKey) {
                    return entityTypeTagKey.equals(ModTags.EntityTypes.CELESTIAL_BRONZE_SWORD_TARGETS);
                }
            });

            boolean toCancel = !tagMatch;

            //attacker.sendSystemMessage(Component.literal("You hit something with a CBS! Passive is:"));

            //attacker.sendSystemMessage(Component.literal((toCancel) ? "yes" : "no"));

            //attacker.sendSystemMessage(Component.literal((tagMatch) ? "yay" : "aww"));

            event.setCanceled(toCancel);
        }
    }
}