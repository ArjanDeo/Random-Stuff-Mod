package com.republicofgamers.randomstuffmod.items;

import com.republicofgamers.randomstuffmod.Main;
import com.republicofgamers.randomstuffmod.blocks.BlockBase;
import com.republicofgamers.randomstuffmod.init.ModItems;
import com.republicofgamers.randomstuffmod.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class Cup extends BlockBase {
	
	public static final AxisAlignedBB CUP_AABB = new AxisAlignedBB(5 * 0.0625, 0.0, 5 * 0.0625, 11 * 0.0625, 7.5 * 0.0625, 11 * 0.0625);
	
	public Cup(String name, Material material)
	{
		super(name, Material.GLASS);
		
		setSoundType(SoundType.GLASS);
		setCreativeTab(Main.combattab);
		setLightLevel(3.2F);
		
	}
	
	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.TRANSLUCENT;
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
		return CUP_AABB;
	}
}