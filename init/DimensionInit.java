package com.republicofgamers.randomstuffmod.init;

import com.republicofgamers.randomstuffmod.world.dimension.diamond.DiamondDimension;
import com.republicofgamers.randomstuffmod.world.dimension.redstone.RedstoneDimension;

import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;

public class DimensionInit
{
    public static final DimensionType DIAMOND = DimensionType.register("Diamond", "_diamond", 2, DiamondDimension.class, false);
    public static final DimensionType REDSTONE = DimensionType.register("Redstone", "_redstone", 2, RedstoneDimension.class, false);

    public static void registerDimensions()
    {
        DimensionManager.registerDimension(2, DIAMOND);
        DimensionManager.registerDimension(3, REDSTONE);
    }
}
