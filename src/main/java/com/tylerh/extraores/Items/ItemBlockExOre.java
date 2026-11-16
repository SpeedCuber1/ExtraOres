package com.tylerh.extraores.Items;

import com.tylerh.extraores.Util.ModInfo;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import java.util.List;
import java.util.function.Consumer;

public class ItemBlockExOre extends BlockItem
{
    public ItemBlockExOre(Block block,Properties properties)
    {
        super(block,properties);
    }


    @Override
    public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay display, Consumer<Component> builder, TooltipFlag tooltipFlag)
    {
        for (int i = 0; i < ModInfo.blockNames.length; i++)
        {
            if (stack.getDisplayName().getString().contains(ModInfo.blockNames[i]) && !stack.getDisplayName().getString().contains("Astral") && !stack.getDisplayName().getString().contains("Azure"))
            {
                builder.accept(Component.translatable("Atomic Symbol: " + ModInfo.symbols[i]));
                break;
            }
        }
    }
}
