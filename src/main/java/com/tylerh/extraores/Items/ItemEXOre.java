package com.tylerh.extraores.Items;

import com.tylerh.extraores.Util.ModInfo;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by Tyler on 4/29/2016.
 */
public class ItemEXOre extends Item
{
    public ItemEXOre(ItemGroup group, String uName)
    {
        super(new Item.Properties().addToolType(ToolType.PICKAXE, 2).group(group).maxStackSize(64));
        setRegistryName(ModInfo.MOD_ID, uName);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World world, List<ITextComponent> list, ITooltipFlag flag)
    {
        for (int i = 0; i < ModInfo.blockNames.length; i++)
        {
            if(stack.getDisplayName().getString().contains(ModInfo.blockNames[i]) && !stack.getDisplayName().getString().contains("Astral"))
            {
                list.add(new TranslationTextComponent("Atomic Symbol: " + ModInfo.symbols[i]));
                break;
            }
        }
    }
}