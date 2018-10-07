package com.republicofgamers.randomstuffmod.enchantments;

import com.republicofgamers.randomstuffmod.init.ModEnchantments;
import com.republicofgamers.randomstuffmod.util.Reference;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;
import net.minecraft.init.Enchantments;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.util.ResourceLocation;

public class EnchantmentOpEnchantment extends Enchantment {

	public EnchantmentOpEnchantment()
	{
		super(Rarity.VERY_RARE, EnumEnchantmentType.WEAPON, new EntityEquipmentSlot[] {EntityEquipmentSlot.MAINHAND});
		this.setName("op_enchantment");
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID + ":op_enchantment"));
		
		ModEnchantments.ENCHANMENTS.add(this);
		
	}
	
	@Override
	public int getMinEnchantability(int enchantmentLevel) 
	{
		return 16 * enchantmentLevel;
	}
	
	@Override
	public int getMaxEnchantability(int enchantmentLevel) 
	{
	return this.getMinEnchantability(enchantmentLevel) + 1000;
	}
	
	@Override
	public int getMaxLevel() 
	{
		return 10;
	}
	
	@Override
	protected boolean canApplyTogether(Enchantment ench) {
		return super.canApplyTogether(ench) && ench != Enchantments.BANE_OF_ARTHROPODS;
	}
}
