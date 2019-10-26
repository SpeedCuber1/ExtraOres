package com.tylerh.extraores.Items;

import com.tylerh.extraores.Util.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;
import java.util.List;

public class ItemBlockExOre extends BlockItem
{
    public ItemBlockExOre(Block block, ItemGroup group)
    {
        super(block, new Item.Properties().addToolType(ToolType.PICKAXE, 2).group(group));
        setRegistryName(block.getRegistryName());
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World world, List<ITextComponent> list, ITooltipFlag flag)
    {
        for (int i = 0; i < ModInfo.blockNames.length; i++)
        {
            if (stack.getDisplayName().getFormattedText().startsWith(ModInfo.blockNames[i]))
            {
                list.add(new TranslationTextComponent("Atomic Symbol: " + ModInfo.symbols[i]));
                break;
            }
        }
    }
}
