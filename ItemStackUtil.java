package com.republicofgamers.randomstuffmod;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;


public class ItemStackUtil
{
    public static NBTTagCompound createTagCompound(ItemStack stack)
    {
        if(!stack.hasTagCompound())
        {
            stack.setTagCompound(new NBTTagCompound());
        }
        return stack.getTagCompound();
    }
}
