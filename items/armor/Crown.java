package com.republicofgamers.randomstuffmod.items.armor;

import java.util.List;

import javax.annotation.Nullable;

import com.republicofgamers.randomstuffmod.Main;
import com.republicofgamers.randomstuffmod.init.ModItems;
import com.republicofgamers.randomstuffmod.util.interfaces.IHasModel;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;

public class Crown extends ItemArmor implements IHasModel{

	public Crown(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.combattab);
		
		ModItems.ITEMS.add(this);
	}

	
	 @Override
	    public void addInformation(ItemStack stack, @Nullable World worldIn, List<String> tooltip, ITooltipFlag flagIn)
	    {
	        if(GuiScreen.isShiftKeyDown())
	        {
	            String info = I18n.format("item.crown.info");
	            tooltip.addAll(Minecraft.getMinecraft().fontRenderer.listFormattedStringToWidth(info, 150));
	        }
	        else
	        {
	            if(hasColor(stack))
	            {
	                tooltip.add(I18n.format("item.color", TextFormatting.DARK_GRAY.toString() + String.format("#%06X", createTagCompound(stack).getInteger("color"))));
	            }
	            else
	            tooltip.add(TextFormatting.YELLOW + "Hold SHIFT for Info");
	        }
	    }
	 
	 public static NBTTagCompound createTagCompound(ItemStack stack)
	    {
	        if(!stack.hasTagCompound())
	        {
	            stack.setTagCompound(new NBTTagCompound());
	        }
	        NBTTagCompound tagCompound = stack.getTagCompound();
	        if(tagCompound != null)
			return tagCompound;
			return tagCompound;
	    }

	 public boolean hasColor(ItemStack stack)
	    {
	        NBTTagCompound tagCompound = createTagCompound(stack);
	        return tagCompound.hasKey("color", Constants.NBT.TAG_INT);
	    }
	
		@Override
		public void registerModels() 
		{
			Main.proxy.registerItemRenderer(this, 0 , "inventory");
		}
	}
