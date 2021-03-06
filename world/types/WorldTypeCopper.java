package com.republicofgamers.randomstuffmod.world.types;

import com.republicofgamers.randomstuffmod.world.types.layer.GenLayerCustom;

import net.minecraft.world.WorldType;
import net.minecraft.world.gen.ChunkGeneratorSettings;
import net.minecraft.world.gen.layer.GenLayer;

public class WorldTypeCopper extends WorldType
{
	public WorldTypeCopper() 
	{
		super("Custom");
	}
	
	@Override
	public GenLayer getBiomeLayer(long worldSeed, GenLayer parentLayer, ChunkGeneratorSettings chunkSettings) 
	{
		return new GenLayerCustom(worldSeed, parentLayer, this, chunkSettings);
	}
}