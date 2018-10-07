package com.republicofgamers.randomstuffmod.items;

import com.republicofgamers.randomstuffmod.Main;
import com.republicofgamers.randomstuffmod.entity.EntityCentaur;
import com.republicofgamers.randomstuffmod.init.ModItems;
import com.republicofgamers.randomstuffmod.util.interfaces.IHasModel;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CopperIngot extends Item implements IHasModel {
	
	public CopperIngot(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.combattab);
		
		ModItems.ITEMS.add(this);
	}


	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0 , "inventory");
	}

}
