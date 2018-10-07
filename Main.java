package com.republicofgamers.randomstuffmod;

import com.republicofgamers.randomstuffmod.init.ModRecipes;
import com.republicofgamers.randomstuffmod.proxy.CommonProxy;
import com.republicofgamers.randomstuffmod.tabs.CombatTab;
import com.republicofgamers.randomstuffmod.tabs.PartsTab;
import com.republicofgamers.randomstuffmod.tabs.ResourcesTab;
import com.republicofgamers.randomstuffmod.util.Reference;
import com.republicofgamers.randomstuffmod.util.handlers.RegistryHandler;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.GameRules;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLLoadCompleteEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartedEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

	@Instance
	public static Main instance;
	
	public static final CreativeTabs combattab = new CombatTab("combattab");
	public static final CreativeTabs resourcestab = new ResourcesTab("resourcestab");
	public static final CreativeTabs partstab = new PartsTab("partstab");
	
	
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) 
	{
		RegistryHandler.preInitRegistries();
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		ModRecipes.init();
		RegistryHandler.initRegistries();
		//GameRegistry.registerTileEntity(TileEntityCookieJar.class, Reference.MOD_ID + "TileEntityCookieJar");
		//GameRegistry.registerTileEntity(TileEntityCookieJar.class, Reference.MOD_ID + "TileEntityCookieJar");
	}
	
	
	
	@EventHandler
	public static void PostInit(FMLPostInitializationEvent event) {
		RegistryHandler.postInitRegistries();
	
	}
	
	
	@EventHandler
	public static void serverInit(FMLServerStartingEvent event) {
	RegistryHandler.postInitRegistries();
	RegistryHandler.serverRegistries(event);
	
	}
	
}
