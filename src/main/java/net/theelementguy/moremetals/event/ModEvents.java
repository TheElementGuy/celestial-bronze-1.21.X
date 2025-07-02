package net.theelementguy.moremetals.event;

import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.entity.monster.warden.Warden;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingDamageEvent;
import net.neoforged.neoforge.event.entity.player.AttackEntityEvent;
import net.theelementguy.moremetals.MoreMetalsMod;
import net.theelementguy.moremetals.item.ModItems;
import net.theelementguy.moremetals.util.ModTags;

import java.util.function.Predicate;

@EventBusSubscriber(modid = MoreMetalsMod.MOD_ID)
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

        if (stack.is(ModTags.Items.CELESTIAL_BRONZE_TYPE_SWORDS)) {

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

    @SubscribeEvent
    public static void livingDamageEvent(LivingDamageEvent.Pre event) {

        if (event.getSource().getWeaponItem() != null) {
            if (event.getSource().getWeaponItem().getItem() == ModItems.CELESTIAL_BRRONZE_SWORD.get() && event.getEntity() instanceof Enemy && !(event.getEntity() instanceof WitherBoss) && !(event.getEntity() instanceof EnderDragon) && !(event.getEntity() instanceof Warden)) {
                event.setNewDamage((float) (event.getEntity().getMaxHealth() * 0.5));
            }
        }

    }
}