package com.republicofgamers.randomstuffmod.util.handlers;

import com.republicofgamers.randomstuffmod.blocks.container.ContainerCopperChest;
import com.republicofgamers.randomstuffmod.blocks.container.ContainerElectricSinteringFurnace;
import com.republicofgamers.randomstuffmod.blocks.container.ContainerGlowstoneGenerator;
import com.republicofgamers.randomstuffmod.blocks.container.ContainerSinteringFurnace;
import com.republicofgamers.randomstuffmod.blocks.gui.GuiCopperChest;
import com.republicofgamers.randomstuffmod.blocks.gui.GuiElectricSinteringFurnace;
import com.republicofgamers.randomstuffmod.blocks.gui.GuiGlowstoneGenerator;
import com.republicofgamers.randomstuffmod.blocks.gui.GuiSinteringFurnace;
import com.republicofgamers.randomstuffmod.blocks.machines.sinterer.TileEntitySinteringFurnace;
import com.republicofgamers.randomstuffmod.blocks.tileentity.TileEntityCopperChest;
import com.republicofgamers.randomstuffmod.blocks.tileentity.TileEntityElectricSinteringFurnace;
import com.republicofgamers.randomstuffmod.blocks.tileentity.TileEntityGlowstoneGenerator;
import com.republicofgamers.randomstuffmod.util.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
		if(ID == Reference.GUI_COPPER_CHEST) return new ContainerCopperChest(player.inventory, (TileEntityCopperChest)world.getTileEntity(new BlockPos(x,y,z)), player);
		if(ID == Reference.GUI_SINTERING_FURNACE) return new ContainerSinteringFurnace(player.inventory, (TileEntitySinteringFurnace)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == Reference.GUI_GLOWSTONE_GENERATOR) return new ContainerGlowstoneGenerator(player.inventory, (TileEntityGlowstoneGenerator)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == Reference.GUI_ELECTRIC_SINTERING_FURNACE) return new ContainerElectricSinteringFurnace(player.inventory, (TileEntityElectricSinteringFurnace)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) 
	{
		if(ID == Reference.GUI_SINTERING_FURNACE) return new GuiSinteringFurnace(player.inventory, (TileEntitySinteringFurnace)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == Reference.GUI_COPPER_CHEST) return new GuiCopperChest(player.inventory, (TileEntityCopperChest)world.getTileEntity(new BlockPos(x,y,z)), player);
		if(ID == Reference.GUI_GLOWSTONE_GENERATOR) return new GuiGlowstoneGenerator(player.inventory, (TileEntityGlowstoneGenerator)world.getTileEntity(new BlockPos(x,y,z)));
		if(ID == Reference.GUI_ELECTRIC_SINTERING_FURNACE) return new GuiElectricSinteringFurnace(player.inventory, (TileEntityElectricSinteringFurnace)world.getTileEntity(new BlockPos(x,y,z)));
		return null;
	}
}