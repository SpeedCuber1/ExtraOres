package com.tylerh.extraores.Items;

import com.tylerh.extraores.Util.ModInfo;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;
import java.util.List;

public class ItemBlockExOre extends BlockItem
{
    public ItemBlockExOre(Block block, CreativeModeTab group)
    {
        super(block, new Item.Properties().addToolType(ToolType.PICKAXE, 2).tab(group).stacksTo(64));
        setRegistryName(block.getRegistryName());
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> list, TooltipFlag flag)
    {
        for(int i = 0;i < ModInfo.blockNames.length; i++)
        {
            if(stack.getDisplayName().getString().contains(ModInfo.blockNames[i]) && !stack.getDisplayName().getString().contains("Astral"))
            {
                list.add(new TranslatableComponent("Atomic Symbol: " + ModInfo.symbols[i]));
                break;
            }
        }
    }
}
