package com.republicofgamers.randomstuffmod.items;

import com.republicofgamers.randomstuffmod.Main;
import com.republicofgamers.randomstuffmod.init.ModItems;
import com.republicofgamers.randomstuffmod.util.interfaces.IHasModel;

import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.FMLCommonHandler;

public class SpeedBoots extends ItemArmor implements IHasModel{

	public SpeedBoots(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.combattab);
		
		ModItems.ITEMS.add(this);
	}
	@Override

	public void onArmorTick(World world, EntityPlayer player, ItemStack armor) {

	player.addPotionEffect(new PotionEffect(Potion.getPotionById(1), 20, 4));

	}
	
	
		@Override
		public void registerModels() 
		{
			Main.proxy.registerItemRenderer(this, 0 , "inventory");
		}
	}
