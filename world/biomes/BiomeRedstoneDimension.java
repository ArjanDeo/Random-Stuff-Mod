package com.republicofgamers.randomstuffmod.world.biomes;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;

public class BiomeRedstoneDimension extends Biome
{
    public BiomeRedstoneDimension()
    {
        super(new BiomeProperties("Redstone").setBaseHeight(1.5F).setHeightVariation(1.2F).setTemperature(0.6F).setRainDisabled().setWaterColor(10424606));
    }
}
