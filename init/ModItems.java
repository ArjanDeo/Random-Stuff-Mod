package com.republicofgamers.randomstuffmod.init;

import java.util.ArrayList;
import java.util.List;

import com.republicofgamers.randomstuffmod.blocks.RecordPlayer;
import com.republicofgamers.randomstuffmod.items.Bomb;
import com.republicofgamers.randomstuffmod.items.ItemBase;
import com.republicofgamers.randomstuffmod.items.ItemKeyboard;
import com.republicofgamers.randomstuffmod.items.ItemScreen;
import com.republicofgamers.randomstuffmod.items.ObsidianChestplate;
import com.republicofgamers.randomstuffmod.items.PandoraBox;
import com.republicofgamers.randomstuffmod.items.SpeedBoots;
import com.republicofgamers.randomstuffmod.items.armor.ArmorBase;
import com.republicofgamers.randomstuffmod.items.armor.Crown;
import com.republicofgamers.randomstuffmod.items.food.ItemCustomFood;
import com.republicofgamers.randomstuffmod.items.tools.StaffFire;
import com.republicofgamers.randomstuffmod.items.tools.ToolAxe;
import com.republicofgamers.randomstuffmod.items.tools.ToolHoe;
import com.republicofgamers.randomstuffmod.items.tools.ToolPickaxe;
import com.republicofgamers.randomstuffmod.items.tools.ToolSpade;
import com.republicofgamers.randomstuffmod.items.tools.ToolSword;
import com.republicofgamers.randomstuffmod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems 
{
	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Materials
	public static final ToolMaterial MATERIAL_OBSIDIAN = EnumHelper.addToolMaterial("material_obsidian", 10, 25000, 6.8F, 10.8F, 30);
	public static final ToolMaterial MATERIAL_RUBY = EnumHelper.addToolMaterial("material_ruby", 4, 900, 3.4F, 5.0F, 12);
	public static final ToolMaterial MATERIAL_WOOD_METAL = EnumHelper.addToolMaterial("material_ruby", 0, 2050, 15.0F, 6.0F, 16);
	public static final ToolMaterial TOOL_COPPER = EnumHelper.addToolMaterial("tool_copper", 2, 180, 5.0F, 1.5F, 5);
	public static final ArmorMaterial ARMOR_MATERIAL_OBSIDIAN = EnumHelper.addArmorMaterial("armor_material_obsidian", Reference.MOD_ID + ":obsidian", 20, new int[] {5, 8, 9, 6}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_TECH = EnumHelper.addArmorMaterial("armor_material_tech", Reference.MOD_ID + ":tech", 20, new int[] {3, 3, 3, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_COPPER = EnumHelper.addArmorMaterial("armor_material_copper", Reference.MOD_ID + ":copper", 20, new int[]{2, 5, 6, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_SPEED = EnumHelper.addArmorMaterial("armor_material_speed", Reference.MOD_ID + ":speed", 20, new int[] {4, 3, 6, 4}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_GOLD_DIAMOND_SAPPHIRE_RUBY = EnumHelper.addArmorMaterial("armor_material_gold_diamond_sapphire_ruby", Reference.MOD_ID + ":gold_diamond_sapphire_ruby", 2000000000, new int[] {0, 0, 0, 20}, 200, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_STONE = EnumHelper.addArmorMaterial("armor_material_stone", Reference.MOD_ID + ":stone", 20, new int[] {3, 5, 7, 5}, 10, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0.0F);
	public static final ArmorMaterial ARMOR_MATERIAL_GALAXY = EnumHelper.addArmorMaterial("armor_material_galaxy", Reference.MOD_ID + ":galaxy", 20, new int[] {20, 20, 20, 20}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	
	//Items
	public static final Item OBSIDIAN_INGOT = new ItemBase("obsidian_ingot");
	public static final Item FLIPPHONE = new ItemBase("phone");
	public static final Item RUBY = new ItemBase("ruby");
	public static final Item IPHONE = new ItemBase("iphone");
	public static final Item USB = new ItemBase("usb");
	public static final Item HAND_GUN = new ItemBase("hand_gun");
	public static final Item COPPER_INGOT = new ItemBase("copper_ingot");
	public static final Item IPAD = new ItemBase("ipad");
	public static final Item BOMB = new Bomb("bomb");
	public static final Item KEY = new ItemBase("key");
	public static final Item PANDORABOX = new ItemBase("pandora_box");
	public static final Item PIXIEDUST = new ItemBase("pixie_dust");
	public static final Item NINTENDO_SWITCH = new ItemBase("nintendo_switch");
	public static final Item HUNDRED_BILL = new ItemBase("hundred_bill");
	
	//Parts
	public static final Item SCREEN = new ItemScreen("screen");
	public static final Item KEYBOARD = new ItemKeyboard("keyboard");
	
	//Food
	public static final Item PIZZA = new ItemCustomFood("pizza", 8, false);
	public static final Item CHOCALATE_BAR = new ItemCustomFood("choc_bar", 4, false);
	public static final Item HAMBURGER = new ItemCustomFood("hamburger", 20, false);
	
	//Tools
	public static final ItemSword RUBY_SWORD = new ToolSword("ruby_sword", MATERIAL_RUBY);
	public static final ItemSpade RUBY_SHOVEL = new ToolSpade("ruby_shovel", MATERIAL_RUBY);
	public static final ItemPickaxe RUBY_PICKAXE = new ToolPickaxe("ruby_pickaxe", MATERIAL_RUBY);
	public static final ItemAxe RUBY_AXE = new ToolAxe("ruby_axe", MATERIAL_RUBY);
	public static final ItemHoe RUBY_HOE = new ToolHoe("ruby_hoe", MATERIAL_RUBY);
	public static final Item AXE_COPPER = new ToolAxe("axe_copper", TOOL_COPPER);
	public static final Item HOE_COPPER = new ToolHoe("hoe_copper", TOOL_COPPER);
	public static final Item PICKAXE_COPPER = new ToolPickaxe("pickaxe_copper", TOOL_COPPER);
	public static final Item SHOVEL_COPPER = new ToolSpade("shovel_copper", TOOL_COPPER);
	public static final Item SWORD_COPPER = new ToolSword("sword_copper", TOOL_COPPER);
	public static final Item STAFF_FIRE = new StaffFire("staff_fire");
	
	//Armor
	public static final Item OBSIDIAN_HELMET = new ArmorBase("obsidian_helmet", ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.HEAD);
	public static final Item OBSIDIAN_CHESTPLATE = new ObsidianChestplate("obsidian_chestplate", ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.CHEST);
	public static final Item OBSIDIAN_LEGGINGS = new ArmorBase("obsidian_leggings", ARMOR_MATERIAL_OBSIDIAN, 2, EntityEquipmentSlot.LEGS);
	public static final Item OBSIDIAN_BOOTS = new ArmorBase("obsidian_boots", ARMOR_MATERIAL_OBSIDIAN, 1, EntityEquipmentSlot.FEET);
	public static final Item RUBY_HELMET = new ArmorBase("helmet_copper", ARMOR_MATERIAL_COPPER, 1, EntityEquipmentSlot.HEAD);
	public static final Item RUBY_CHESTPLATE = new ArmorBase("chestplate_copper", ARMOR_MATERIAL_COPPER, 1, EntityEquipmentSlot.CHEST);
	public static final Item RUBY_LEGGINGS = new ArmorBase("leggings_copper", ARMOR_MATERIAL_COPPER, 2, EntityEquipmentSlot.LEGS);
	public static final Item RUBY_BOOTS = new ArmorBase("boots_copper", ARMOR_MATERIAL_COPPER, 1, EntityEquipmentSlot.FEET);
	public static final Item VR_HEADSET = new ArmorBase("vr_headset", ARMOR_MATERIAL_TECH, 1, EntityEquipmentSlot.HEAD);
	public static final Item SPEED_BOOTS = new SpeedBoots("speed_boots", ARMOR_MATERIAL_SPEED, 1, EntityEquipmentSlot.FEET);
	public static final Item STONE_HELMET = new ArmorBase("stone_helmet", ARMOR_MATERIAL_STONE, 1, EntityEquipmentSlot.HEAD);
	public static final Item STONE_CHESTPLATE = new ArmorBase("stone_chestplate", ARMOR_MATERIAL_STONE, 1, EntityEquipmentSlot.CHEST);
	public static final Item STONE_LEGGINGS = new ArmorBase("stone_leggings", ARMOR_MATERIAL_STONE, 2, EntityEquipmentSlot.LEGS);
	public static final Item STONE_BOOTS = new ArmorBase("stone_boots", ARMOR_MATERIAL_STONE, 1, EntityEquipmentSlot.FEET);
	public static final Item CROWN = new Crown("crown", ARMOR_MATERIAL_GOLD_DIAMOND_SAPPHIRE_RUBY, 1, EntityEquipmentSlot.HEAD);
	public static final Item GALAXY_HELMET = new ArmorBase("galaxy_helmet", ARMOR_MATERIAL_GALAXY, 1, EntityEquipmentSlot.HEAD);
}
