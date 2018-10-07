package com.republicofgamers.randomstuffmod.items;

import com.republicofgamers.randomstuffmod.Main;
import com.republicofgamers.randomstuffmod.init.ModItems;
import com.republicofgamers.randomstuffmod.util.interfaces.IHasModel;

import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class Bomb extends Item implements IHasModel {
	
	public Bomb(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.combattab);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) 
	{
		ItemStack item = playerIn.getHeldItem(handIn);
		Vec3d aim = playerIn.getLookVec();
		EntityTNTPrimed tnt = new EntityTNTPrimed(worldIn, 1, 1, 1, playerIn);
		
		tnt.setPosition(playerIn.posX + aim.x * 1.5D, playerIn.posY + aim.y * 1.5D, playerIn.posZ + aim.z * 1.5D);
	//	tnt.accelerationX = aim.x * 0.1;
	//	tnt.accelerationY = aim.y * 0.1;
	//	tnt.accelerationZ = aim.z * 0.1;
		worldIn.spawnEntity(tnt);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
	}


	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0 , "inventory");
	}

}