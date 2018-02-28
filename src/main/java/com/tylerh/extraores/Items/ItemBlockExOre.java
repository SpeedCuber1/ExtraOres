package com.tylerh.extraores.Items;

import com.tylerh.extraores.Util.ModInfo;
import jline.internal.Nullable;
import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

public class ItemBlockExOre extends ItemBlock
{
    public ItemBlockExOre(Block block)
    {
        super(block);
    }
    @Override
    public void addInformation(ItemStack stack, @Nullable World world, List<String> list, ITooltipFlag flag)
    {
        for(int i = 0; i < ModInfo.blockNames.length; i++)
        {
            if(stack.getDisplayName().contains(ModInfo.blockNames[i]) && !stack.getDisplayName().startsWith("Astral Silver"))
            {
                list.add("Atomic Symbol: " + ModInfo.symbols[i]);
                break;
            }
        }
    }
}
