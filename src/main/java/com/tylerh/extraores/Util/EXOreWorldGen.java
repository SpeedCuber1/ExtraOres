package com.tylerh.extraores.Util;

import com.tylerh.extraores.Init.InitBlocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

/**
 * Created by Tyler on 4/29/2016.
 */
public class EXOreWorldGen implements IWorldGenerator
{
    private WorldGenerator copperOre;
    private WorldGenerator tinOre;
    private WorldGenerator chromiumOre;
    private WorldGenerator cobaltOre;
    private WorldGenerator unobtainiumOre;
    private WorldGenerator manganeseOre;
    private WorldGenerator molybdenumOre;
    private WorldGenerator aluminumOre;
    private WorldGenerator silverOre;
    private WorldGenerator leadOre;
    private WorldGenerator platinumOre;
    private WorldGenerator tungstenOre;
    private WorldGenerator vanadiumOre;

    public EXOreWorldGen()
    {
        this.copperOre = new EXOreWorldGenMinable(InitBlocks.blockOreCopper.getDefaultState(),4);
        this.tinOre = new EXOreWorldGenMinable(InitBlocks.blockOreTin.getDefaultState(),4);
        this.chromiumOre = new EXOreWorldGenMinable(InitBlocks.blockOreChromium.getDefaultState(),4);
        this.cobaltOre = new EXOreWorldGenMinable(InitBlocks.blockOreCobalt.getDefaultState(),4);
        this.unobtainiumOre = new EXOreWorldGenMinable(InitBlocks.blockOreUnobtainium.getDefaultState(),2);
        this.manganeseOre = new EXOreWorldGenMinable(InitBlocks.blockOreManganese.getDefaultState(),4);
        this.molybdenumOre = new EXOreWorldGenMinable(InitBlocks.blockOreMolybdenum.getDefaultState(),4);
        this.aluminumOre = new EXOreWorldGenMinable(InitBlocks.blockOreAluminum.getDefaultState(),4);
        this.silverOre = new EXOreWorldGenMinable(InitBlocks.blockOreSilver.getDefaultState(),4);
        this.leadOre = new EXOreWorldGenMinable(InitBlocks.blockOreLead.getDefaultState(),4);
        this.platinumOre = new EXOreWorldGenMinable(InitBlocks.blockOrePlatinum.getDefaultState(),4);
        this.tungstenOre = new EXOreWorldGenMinable(InitBlocks.blockOreTungsten.getDefaultState(),4);
        this.vanadiumOre = new EXOreWorldGenMinable(InitBlocks.blockOreVanadium.getDefaultState(),4);
    }
    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        if(world.provider.getDimensionId() == 0)
        {
            runGenerator(this.copperOre,world,random,chunkX,chunkZ,20,0,100);
            runGenerator(this.tinOre,world,random,chunkX,chunkZ,20,0,80);
            runGenerator(this.chromiumOre,world,random,chunkX,chunkZ,20,0,100);
            runGenerator(this.cobaltOre,world,random,chunkX,chunkZ,20,0,100);
            runGenerator(this.unobtainiumOre,world,random,chunkX,chunkZ,10,0,30);
            runGenerator(this.manganeseOre,world,random,chunkX,chunkZ,20,0,100);
            runGenerator(this.molybdenumOre,world,random,chunkX,chunkZ,20,0,100);
            runGenerator(this.aluminumOre,world,random,chunkX,chunkZ,20,0,100);
            runGenerator(this.silverOre,world,random,chunkX,chunkZ,20,0,100);
            runGenerator(this.leadOre,world,random,chunkX,chunkZ,20,0,100);
            runGenerator(this.platinumOre,world,random,chunkX,chunkZ,20,0,100);
            runGenerator(this.tungstenOre,world,random,chunkX,chunkZ,20,0,100);
            runGenerator(this.vanadiumOre,world,random,chunkX,chunkZ,20,0,100);
        }
    }
    public void runGenerator(WorldGenerator generator,World world,Random rand,int chunkX,int chunkZ,int chanceToSpawn,int minHeight,int maxHeight)
    {
        if(minHeight < 0 || maxHeight > 256 || minHeight > maxHeight)
        {
            throw new IllegalArgumentException("Minimum or Maximum height out of bounds");
        }
        int heightDiff = maxHeight - minHeight + 1;
        for(int i = 0; i < chanceToSpawn; i++)
        {
            int x = chunkX * 16 + rand.nextInt(16);
            int y = minHeight + rand.nextInt(heightDiff);
            int z = chunkZ * 16 + rand.nextInt(16);
            generator.generate(world,rand,new BlockPos(x,y,z));
        }
    }
}
