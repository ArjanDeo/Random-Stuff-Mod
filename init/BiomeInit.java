package com.republicofgamers.randomstuffmod.init;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import com.republicofgamers.randomstuffmod.world.biomes.BiomeDiamond;
import com.republicofgamers.randomstuffmod.world.biomes.BiomeDiamondDimension;
import com.republicofgamers.randomstuffmod.world.biomes.BiomeRedstone;
import com.republicofgamers.randomstuffmod.world.biomes.BiomeRedstoneDimension;

import java.awt.*;

import com.republicofgamers.randomstuffmod.world.biomes.BiomeDiamond;

public class BiomeInit
{
	//Biomes
    public static final Biome DIAMOND_BIOME = new BiomeDiamond();
    public static final Biome REDSTONE_BIOME = new BiomeRedstone();
    //Dimensions
    public static final Biome DIAMOND_DIMENSION = new BiomeDiamondDimension();
    public static final Biome REDSTONE_DIMENSION = new BiomeRedstoneDimension();
   
    public static void registerBiomes()
    {
    	initBiome(REDSTONE_BIOME, "RedstoneDimension", BiomeType.WARM, Type.HILLS, Type.MOUNTAIN, Type.DRY);
        initBiome(DIAMOND_BIOME, "DiamondDimension", BiomeType.WARM, Type.HILLS, Type.MOUNTAIN, Type.DRY);
        initBiome(DIAMOND_DIMENSION, "Diamond", BiomeType.WARM, Type.SPOOKY, Type.DENSE, Type.DRY);
        initBiome(REDSTONE_DIMENSION, "Redstone", BiomeType.WARM, Type.SPOOKY, Type.DENSE, Type.DRY);
    }

    private static Biome initBiome(Biome biome, String name, BiomeType biomeType, Type... type)
    {
        biome.setRegistryName(name);
        ForgeRegistries.BIOMES.register(biome);
        System.out.println("Biome Registered");
        BiomeDictionary.addTypes(biome, type);
        BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 10));
        BiomeManager.addSpawnBiome(biome);
        System.out.println("Biome Added");
        return biome;
    }
}
