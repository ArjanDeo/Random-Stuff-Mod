
package com.republicofgamers.randomstuffmod.proxy;



import net.minecraft.item.Item;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.MinecraftForge;

public class CommonProxy 
{
	public void registerItemRenderer(Item item, int meta, String id) {}
	public void registerVariantRenderer(Item item, int meta, String filename, String id) {}
	
	public void registerModel(Item itemFromBlock, int i) {}
}
