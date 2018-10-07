package com.republicofgamers.randomstuffmod.world.biomes;

import com.republicofgamers.randomstuffmod.util.handlers.EnumHandler;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenMinable;
import com.republicofgamers.randomstuffmod.world.gen.generators.WorldGenDiamondTree;

import java.util.Random;

public class BiomeRedstone extends Biome 
{
	//protected  static final WorldGenAbstractTree TREE = new WorldGenDiamondTree();

	public BiomeRedstone() {
		super(new BiomeProperties("RedstoneDimension").setBaseHeight(2.6F).setHeightVariation(3.4F).setTemperature(2.0F).setRainDisabled().setWaterColor(3974373));

		topBlock = Blocks.REDSTONE_BLOCK.getDefaultState();
		fillerBlock = Blocks.REDSTONE_BLOCK.getDefaultState();

		this.decorator.diamondGen = new WorldGenMinable(Blocks.REDSTONE_ORE.getDefaultState(), 10);

		this.decorator.treesPerChunk = 2;

		this.spawnableCaveCreatureList.clear();
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		this.spawnableWaterCreatureList.clear();

		this.spawnableCreatureList.add(new SpawnListEntry(EntityChicken.class, 10,1, 5));
		this.spawnableCreatureList.add(new SpawnListEntry(EntityPig.class, 5,1, 2));
	}

	/**@Override
	public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
		return TREE;
	}
	*/
}

