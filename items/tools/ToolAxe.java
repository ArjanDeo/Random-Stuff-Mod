package com.republicofgamers.randomstuffmod.items.tools;

import com.republicofgamers.randomstuffmod.Main;
import com.republicofgamers.randomstuffmod.init.ModItems;
import com.republicofgamers.randomstuffmod.util.interfaces.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;

public class ToolAxe extends ItemAxe implements IHasModel{

		public ToolAxe(String name, ToolMaterial material)
		{
			super(material,  8.0F, -1.2F);
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
