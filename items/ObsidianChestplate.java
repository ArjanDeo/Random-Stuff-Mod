package com.republicofgamers.randomstuffmod.items;

import com.republicofgamers.randomstuffmod.Main;
import com.republicofgamers.randomstuffmod.init.ModItems;
import com.republicofgamers.randomstuffmod.util.interfaces.IHasModel;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ObsidianChestplate extends ItemArmor implements IHasModel{

	public ObsidianChestplate(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.combattab);
		
		ModItems.ITEMS.add(this);
	}
	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(11), 20, 20));
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(22), 20, 20));
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(24), 20, 20));
	}
	
	
		@Override
		public void registerModels() 
		{
			Main.proxy.registerItemRenderer(this, 0 , "inventory");
		}
	}
