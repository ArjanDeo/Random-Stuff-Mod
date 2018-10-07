package com.republicofgamers.randomstuffmod.util.handlers;

import com.republicofgamers.randomstuffmod.blocks.machines.sinterer.TileEntitySinteringFurnace;
import com.republicofgamers.randomstuffmod.blocks.tileentity.TileEntityCopperChest;
import com.republicofgamers.randomstuffmod.blocks.tileentity.TileEntityElectricSinteringFurnace;
import com.republicofgamers.randomstuffmod.blocks.tileentity.TileEntityGlowstoneGenerator;
import com.republicofgamers.randomstuffmod.util.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TileEntityHandler 
{
	public static void registerTileEntities()
	{
		GameRegistry.registerTileEntity(TileEntitySinteringFurnace.class, new ResourceLocation(Reference.MOD_ID + ":sintering_furnace"));
		GameRegistry.registerTileEntity(TileEntityCopperChest.class, new ResourceLocation(Reference.MOD_ID + ":copper_chest"));
		GameRegistry.registerTileEntity(TileEntityGlowstoneGenerator.class, new ResourceLocation(Reference.MOD_ID + ":glowstone_generator"));
		GameRegistry.registerTileEntity(TileEntityElectricSinteringFurnace.class, new ResourceLocation(Reference.MOD_ID + ":electric_sintering_furnace"));	
	}
}
