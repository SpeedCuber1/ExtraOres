package com.tylerh.extraores.Items;

import com.tylerh.extraores.Util.CreativeTabExtraOres;
import net.minecraft.item.Item;

/**
 * Created by Tyler on 4/29/2016.
 */
public class ItemEXOre extends Item
{
    public ItemEXOre(String uName)
    {
        super();
        this.setUnlocalizedName(uName);
        this.setCreativeTab(CreativeTabExtraOres.EXTRA_ORES_TAB);
    }
}
