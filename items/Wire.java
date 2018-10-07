package com.republicofgamers.randomstuffmod.items;

import java.awt.Desktop.Action;

import com.republicofgamers.randomstuffmod.Main;
import com.republicofgamers.randomstuffmod.init.ModItems;
import com.republicofgamers.randomstuffmod.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.eventhandler.EventPriority;

public class Wire extends Item implements IHasModel {

	
	public Wire(String name)
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
