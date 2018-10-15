package com.tylerh.extraores.Items;

import com.tylerh.extraores.Util.CreativeTabExtraOres;
import com.tylerh.extraores.Util.LogHelper;
import com.tylerh.extraores.Util.ModInfo;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Created by Tyler on 4/29/2016.
 */
public class ItemEXOre extends Item
{
    public ItemEXOre(String uName)
    {
        super();
        this.setCreativeTab(CreativeTabExtraOres.EXTRA_ORES_TAB);
        this.setUnlocalizedName(uName);
    }

    @Override
    public void addInformation(ItemStack stack, @Nullable World world, List<String> list, ITooltipFlag flag)
    {
        for (int i = 0; i < ModInfo.blockNames.length; i++)
        {
            if(stack.getDisplayName().contains(ModInfo.blockNames[i]) && !stack.getDisplayName().startsWith("Astral Silver"))
            {
                list.add("Atomic Symbol: " + ModInfo.symbols[i]);
                break;
            }
        }
    }
}