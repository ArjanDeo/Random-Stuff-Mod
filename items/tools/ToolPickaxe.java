package com.republicofgamers.randomstuffmod.items.tools;

import com.republicofgamers.randomstuffmod.Main;
import com.republicofgamers.randomstuffmod.init.ModItems;
import com.republicofgamers.randomstuffmod.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;

public class ToolPickaxe extends ItemPickaxe implements IHasModel{

		public ToolPickaxe(String name, ToolMaterial material)
		{
			super(material);
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
