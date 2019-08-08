package com.tylerh.extraores.World;

import net.minecraftforge.common.ForgeConfigSpec;

public class ExOreWorldGenConfig
{
    public static ForgeConfigSpec.IntValue chanceToSpawn;

    public static void init(ForgeConfigSpec.Builder builder)
    {
        builder.comment("Ore Gen Config");
        chanceToSpawn = builder.comment("Maximum Ore In Vein").defineInRange("Chance To Spawn",4,1,10);
    }
}
