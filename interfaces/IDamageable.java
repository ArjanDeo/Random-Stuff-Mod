package com.republicofgamers.randomstuffmod.interfaces;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public interface IDamageable
{
    void onBlockDamaged(World world, IBlockState state, BlockPos pos, int damage);
}
