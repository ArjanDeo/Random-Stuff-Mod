package com.republicofgamers.randomstuffmod.items.tools;

import java.util.List;

import javax.annotation.Nullable;

import com.republicofgamers.randomstuffmod.Main;
import com.republicofgamers.randomstuffmod.init.ModItems;
import com.republicofgamers.randomstuffmod.util.interfaces.IHasModel;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.util.Constants;

public class ToolSword extends ItemSword implements IHasModel{
	
	
	public ToolSword(String name, ToolMaterial material)
	{
		super(material);
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
	            String info = I18n.format("item.ruby_sword.info");
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
