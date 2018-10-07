package com.republicofgamers.randomstuffmod.tabs;

import com.republicofgamers.randomstuffmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CombatTab extends CreativeTabs{

	public CombatTab(String label) { super("combattab"); 
	
	this.setBackgroundImageName("combat.png"); }
	public ItemStack getTabIconItem() { return new ItemStack(ModItems.HAND_GUN);}
}
