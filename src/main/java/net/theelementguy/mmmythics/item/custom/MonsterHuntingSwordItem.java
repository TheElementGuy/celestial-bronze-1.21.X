package net.theelementguy.mmmythics.item.custom;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;

import java.util.function.Consumer;

public class MonsterHuntingSwordItem extends Item {

    public MonsterHuntingSwordItem(ToolMaterial material, float attackDamage, float attackSpeed, Properties properties) {
        super(properties.sword(material, attackDamage, attackSpeed));
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> tooltipAdder, TooltipFlag flag) {
        tooltipAdder.accept(Component.translatable(this.descriptionId + ".hover_text"));
    }
}
