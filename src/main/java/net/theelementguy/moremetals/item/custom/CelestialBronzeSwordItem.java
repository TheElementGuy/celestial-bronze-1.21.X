package net.theelementguy.moremetals.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;

public class CelestialBronzeSwordItem extends Item {

    public CelestialBronzeSwordItem(ToolMaterial material, float attackDamage, float attackSpeed, Properties properties) {
        super(properties.sword(material, attackDamage, attackSpeed));
    }

}
