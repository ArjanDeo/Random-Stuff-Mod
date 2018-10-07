package com.republicofgamers.randomstuffmod.tabs;

import com.republicofgamers.randomstuffmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class PartsTab extends CreativeTabs{

	public PartsTab(String label) { super("partstab"); 
	
	this.setBackgroundImageName("parts.png"); }
	public ItemStack getTabIconItem() { return new ItemStack(ModItems.SCREEN);}
}
