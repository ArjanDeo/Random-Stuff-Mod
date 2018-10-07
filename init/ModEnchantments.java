package com.republicofgamers.randomstuffmod.init;

import java.util.ArrayList;
import java.util.List;

import com.republicofgamers.randomstuffmod.enchantments.EnchantmentOpEnchantment;
import com.republicofgamers.randomstuffmod.util.Reference;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid=Reference.MOD_ID)

public class ModEnchantments 
{	
	public static final List<Enchantment> ENCHANMENTS = new ArrayList<Enchantment>();

		public static final Enchantment OP_ENCHANTMENT = new EnchantmentOpEnchantment();
		
		@SubscribeEvent
		public static void opEnchantmentsFunction(LivingUpdateEvent event) 
		{
			EntityLivingBase living = event.getEntityLiving();
			int  level = EnchantmentHelper.getMaxEnchantmentLevel(OP_ENCHANTMENT, living);
			BlockPos pos = living.getPosition();
			World world = event.getEntity().world;
			
		}
}
