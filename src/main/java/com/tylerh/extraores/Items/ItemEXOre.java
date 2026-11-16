package com.tylerh.extraores.Items;

import com.tylerh.extraores.Util.ModInfo;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.component.TooltipDisplay;

import java.util.List;
import java.util.function.Consumer;

public class ItemEXOre extends Item
{
    public ItemEXOre(Properties properties)
    {
        super(properties.stacksTo(64));
    }

    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag)
    {
        for (int i = 0; i < ModInfo.blockNames.length; i++)
        {
            if(stack.getDisplayName().getString().contains(ModInfo.blockNames[i]) && !stack.getDisplayName().getString().contains("Astral") && !stack.getDisplayName().getString().contains("Azure"))
            {
                builder.accept(Component.translatable("Atomic Symbol: " + ModInfo.symbols[i]));
                break;
            }
        }
    }
}