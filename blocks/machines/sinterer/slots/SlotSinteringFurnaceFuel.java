package com.republicofgamers.randomstuffmod.blocks.machines.sinterer.slots;


import com.republicofgamers.randomstuffmod.blocks.machines.sinterer.TileEntitySinteringFurnace;

import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotSinteringFurnaceFuel extends Slot
{
	public SlotSinteringFurnaceFuel(IInventory inventory, int index, int x, int y) 
	{
		super(inventory, index, x, y);
	}
	
	@Override
	public boolean isItemValid(ItemStack stack)
	{
		return TileEntitySinteringFurnace.isItemFuel(stack);
	}
	
	@Override
	public int getItemStackLimit(ItemStack stack) 
	{
		return super.getItemStackLimit(stack);
	}
}
