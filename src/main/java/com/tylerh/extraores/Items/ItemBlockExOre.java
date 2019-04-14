package com.tylerh.extraores.Items;

import com.tylerh.extraores.Util.ModInfo;
import net.minecraft.block.Block;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;
import java.util.List;

public class ItemBlockExOre extends ItemBlock
{
    public ItemBlockExOre(Block block, ItemGroup group)
    {
        super(block,new Item.Properties().group(group).addToolType(ToolType.PICKAXE,2));
        setRegistryName(block.getRegistryName());
    }
    @Override
    public void addInformation(ItemStack stack, @Nullable World world, List<ITextComponent> list, ITooltipFlag flag)
    {
        for(int i = 0; i < ModInfo.blockNames.length;i++)
        {
            if(stack.getDisplayName().getFormattedText().startsWith(ModInfo.blockNames[i]))
            {
                list.add(new TextComponentTranslation("Atomic Symbol: " + ModInfo.symbols[i]));
                break;
            }
        }
    }
}
