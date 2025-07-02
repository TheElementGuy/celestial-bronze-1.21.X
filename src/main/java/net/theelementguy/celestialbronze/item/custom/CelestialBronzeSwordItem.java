package net.theelementguy.celestialbronze.item.custom;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.monster.Enemy;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class CelestialBronzeSwordItem extends SwordItem {
    public CelestialBronzeSwordItem(Tier tier, Properties properties) {
        super(tier, properties);
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {

        if (target instanceof Enemy) {
            //target.kill();
        }

        return super.hurtEnemy(stack, target, attacker);
    }


}