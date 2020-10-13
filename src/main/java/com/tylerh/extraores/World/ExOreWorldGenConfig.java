package com.tylerh.extraores.World;

import net.minecraftforge.common.ForgeConfigSpec;

public class ExOreWorldGenConfig
{
    public static ForgeConfigSpec.IntValue veinSize;
    public static ForgeConfigSpec.IntValue spawnRate;
    public static void init(ForgeConfigSpec.Builder builder)
    {
        builder.comment("Ore Gen Config");
        veinSize = builder.comment("Size of Ore Veins").defineInRange("Vein Size",10,1,20);
        spawnRate = builder.comment("Ore Spawn Rate").defineInRange("Spawn Rate",30,10,100);
    }
}
