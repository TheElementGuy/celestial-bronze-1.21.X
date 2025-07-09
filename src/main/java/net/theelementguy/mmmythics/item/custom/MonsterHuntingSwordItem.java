package net.theelementguy.mmmythics.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.*;

import java.util.List;
import java.util.function.Consumer;

public class MonsterHuntingSwordItem extends SwordItem {

    public MonsterHuntingSwordItem(Tier tier, Properties properties) {
        super(tier, properties);
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
        tooltipComponents.add(Component.translatable(this.getDescriptionId() + ".hover_text"));
    }
}