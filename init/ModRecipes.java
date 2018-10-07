package com.republicofgamers.randomstuffmod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
	GameRegistry.addSmelting(ModItems.RUBY, new ItemStack(ModBlocks.RUBY_BLOCK, 1), 2.3F);	
	GameRegistry.addSmelting(ModBlocks.CUP, new ItemStack(Blocks.GLASS_PANE, 4), 1.2F);
	GameRegistry.addSmelting(ModBlocks.CUP, new ItemStack(Blocks.JUKEBOX, 4), 1.2F);
	}
}
