package com.republicofgamers.randomstuffmod.blocks;

import com.republicofgamers.randomstuffmod.Main;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class Computer extends BlockBase {

	public static final AxisAlignedBB COMPUTER_AABB = new AxisAlignedBB(0.1, 0.0, 0.1, 0.9, 1.0, 0.9);
	
	public Computer(String name, Material material)
{
	
	super(name, Material.IRON);
	
	setSoundType(SoundType.METAL);
	setLightLevel(15.0F);
	setCreativeTab(Main.resourcestab);
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
	
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		
		return false;
	}
	
	@Override
	public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos) {
		return COMPUTER_AABB;
	}
	
}