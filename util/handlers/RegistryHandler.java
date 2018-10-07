package com.republicofgamers.randomstuffmod.util.handlers;

import com.republicofgamers.randomstuffmod.Main;
import com.republicofgamers.randomstuffmod.blocks.animation.RenderCopperChest;
import com.republicofgamers.randomstuffmod.blocks.tileentity.TileEntityCopperChest;
import com.republicofgamers.randomstuffmod.command.CommandDimensionTeleport;
import com.republicofgamers.randomstuffmod.init.BiomeInit;
import com.republicofgamers.randomstuffmod.init.DimensionInit;
import com.republicofgamers.randomstuffmod.init.EntityInit;
import com.republicofgamers.randomstuffmod.init.ModBlocks;
import com.republicofgamers.randomstuffmod.init.ModEnchantments;
import com.republicofgamers.randomstuffmod.init.ModItems;
import com.republicofgamers.randomstuffmod.util.Reference;
import com.republicofgamers.randomstuffmod.util.interfaces.IHasModel;
import com.republicofgamers.randomstuffmod.world.gen.WorldGenCustomOres;
import com.republicofgamers.randomstuffmod.world.gen.WorldGenCustomStructures;
import com.republicofgamers.randomstuffmod.world.types.WorldTypeCopper;
import com.republicofgamers.randomstuffmod.world.types.WorldTypeCustom;

import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.world.WorldType;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry;

@EventBusSubscriber
public class RegistryHandler 
{
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) 
	{
		event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
	}
	
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) 
	{
		event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
		TileEntityHandler.registerTileEntities();
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCopperChest.class, new RenderCopperChest());
	}
	
	@SubscribeEvent
	public static void onEnchantmentRegister(RegistryEvent.Register<Enchantment> event) 
	{
		event.getRegistry().registerAll(ModEnchantments.ENCHANMENTS.toArray(new Enchantment[0]));
	}
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) 
	{
		
		Main.proxy.registerModel(Item.getItemFromBlock(ModBlocks.COPPER_CHEST), 0); 	
		
		for(Item item : ModItems.ITEMS)
		{
			if(item instanceof IHasModel)
			{
				((IHasModel)item).registerModels();
			}
		}
		
		for(Block block : ModBlocks.BLOCKS)
		{
			if(block instanceof IHasModel)
			{
				((IHasModel)block).registerModels();
			}
		}
	}
	
	public static void preInitRegistries()
	{
		GameRegistry.registerWorldGenerator(new WorldGenCustomOres(), 0);
		GameRegistry.registerWorldGenerator(new WorldGenCustomStructures(), 0);
		
		BiomeInit.registerBiomes();
		DimensionInit.registerDimensions();
		
		EntityInit.registerEntities();
		RenderHandler.registerEntityRenders();
		
	}
	
	public static void initRegistries()
	{
		SoundsHandler.registerSounds();
		NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiHandler());
		

	}
	
	public static void postInitRegistries()
	{
		WorldType COPPER = new WorldTypeCopper();
		WorldType CUSTOM = new WorldTypeCustom();
	}
	
	public static void serverRegistries(FMLServerStartingEvent event)
	{
		event.registerServerCommand(new CommandDimensionTeleport());
	}
	
	public static void otherRegistries()
	{
		BiomeInit.registerBiomes(); 
		
	}
}
		