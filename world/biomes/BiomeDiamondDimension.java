package com.republicofgamers.randomstuffmod.world.biomes;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;

public class BiomeDiamondDimension extends Biome
{
    public BiomeDiamondDimension()
    {
        super(new BiomeProperties("Library").setBaseHeight(1.5F).setHeightVariation(1.2F).setTemperature(0.6F).setRainDisabled().setWaterColor(16711680));
    }
}
