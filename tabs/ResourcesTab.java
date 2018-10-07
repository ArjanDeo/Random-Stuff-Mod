package com.republicofgamers.randomstuffmod.tabs;

import com.republicofgamers.randomstuffmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class ResourcesTab extends CreativeTabs{

	public ResourcesTab(String label) { super("resourcestab"); 
	
	this.setBackgroundImageName("tutorial.png"); }
	public ItemStack getTabIconItem() { return new ItemStack(ModItems.OBSIDIAN_INGOT);}
}
