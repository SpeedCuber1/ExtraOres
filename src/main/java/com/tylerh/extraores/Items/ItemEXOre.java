package com.tylerh.extraores.Items;

import com.tylerh.extraores.Util.ModInfo;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class ItemEXOre extends Item
{
    public ItemEXOre()
    {
        super(new Item.Properties().stacksTo(64));
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> list, TooltipFlag flag)
    {
        for (int i = 0; i < ModInfo.blockNames.length; i++)
        {
            if(stack.getDisplayName().getString().contains(ModInfo.blockNames[i]) && !stack.getDisplayName().getString().contains("Astral") && !stack.getDisplayName().getString().contains("Azure"))
            {
                list.add(Component.translatable("Atomic Symbol: " + ModInfo.symbols[i]));
                break;
            }
        }
    }
}