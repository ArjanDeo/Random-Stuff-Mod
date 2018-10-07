package com.republicofgamers.randomstuffmod.init;

import com.republicofgamers.randomstuffmod.Main;
import com.republicofgamers.randomstuffmod.entity.EntityCentaur;
import com.republicofgamers.randomstuffmod.entity.EntityZombieCentaur;
import com.republicofgamers.randomstuffmod.util.Reference;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit 
{
	public static void registerEntities()
	{
		registerEntity("centaur", EntityCentaur.class, Reference.ENTITY_CENTAUR, 50, 12617053, 000000);
		registerEntity("zombie_centaur", EntityZombieCentaur.class, Reference.ENTITY_ZOMBIE_CENTAUR, 50, 7830068, 000000);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2)
	{
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MOD_ID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
}
