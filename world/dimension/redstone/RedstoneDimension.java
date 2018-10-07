package com.republicofgamers.randomstuffmod.world.dimension.redstone;

import com.republicofgamers.randomstuffmod.init.BiomeInit;
import com.republicofgamers.randomstuffmod.init.DimensionInit;
import com.republicofgamers.randomstuffmod.world.dimension.redstone.ChunkGeneratorRedstone;

import net.minecraft.world.DimensionType;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.IChunkGenerator;

public class RedstoneDimension extends WorldProvider
{
    public RedstoneDimension()
    {
        this.biomeProvider = new BiomeProviderSingle(BiomeInit.DIAMOND_DIMENSION);
    }
    
    @Override
    public DimensionType getDimensionType()
    {
        return DimensionInit.DIAMOND;
    }

    @Override
    public IChunkGenerator createChunkGenerator()
    {
    	return new ChunkGeneratorRedstone(world, true, world.getSeed(), null);
        //return new ChunkGeneratorRedstone(world, true, world.getSeed());
    }

    @Override
    public boolean canRespawnHere()
    {
        return true;
    }

    @Override
    public boolean isSurfaceWorld()
    {
        return false;
    }
}

