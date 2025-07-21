package net.theelementguy.mmmythics.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;

import java.util.List;

public class MonsterHuntingSwordItem extends SwordItem {

    public MonsterHuntingSwordItem(ToolMaterial material, float attackDamage, float attackSpeed, Properties properties) {
        super(material, attackDamage, attackSpeed, properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        tooltipComponents.add(Component.translatable(this.getDescriptionId() + ".hover_text"));
    }
}