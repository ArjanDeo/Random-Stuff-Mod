package com.republicofgamers.randomstuffmod.items.tools;

import com.republicofgamers.randomstuffmod.items.ItemBase;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class StaffFire extends ItemBase 
{

	public StaffFire(String name) {
		super(name);
		  
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) 
	{
		ItemStack item = playerIn.getHeldItem(handIn);
		Vec3d aim = playerIn.getLookVec();
		EntityLargeFireball fireball = new EntityLargeFireball(worldIn, playerIn, 1, 1, 1);
		
		fireball.setPosition(playerIn.posX + aim.x * 1.5D, playerIn.posY + aim.y * 1.5D, playerIn.posZ + aim.z * 1.5D);
		fireball.accelerationX = aim.x * 0.1;
		fireball.accelerationY = aim.y * 0.1;
		fireball.accelerationZ = aim.z * 0.1;
		worldIn.spawnEntity(fireball);
		
		item.damageItem(1, playerIn);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
	}
}
