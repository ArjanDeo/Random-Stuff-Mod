package com.republicofgamers.randomstuffmod.entity.render;

import com.republicofgamers.randomstuffmod.entity.EntityZombieCentaur;
import com.republicofgamers.randomstuffmod.entity.model.ModelZombieCentaur;
import com.republicofgamers.randomstuffmod.util.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderZombieCentaur extends RenderLiving<EntityZombieCentaur>
{
	public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.MOD_ID + ":textures/entity/zombie_centaur.png");
	public RenderZombieCentaur(RenderManager manager) 
	{
		super(manager, new ModelZombieCentaur(), 0.5F);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityZombieCentaur entity) 
	{
		return TEXTURES;
	}
	
@Override
protected void applyRotations(EntityZombieCentaur entityLiving, float p_77043_2_, float rotationYaw, float partialTicks) 
	{
		super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
	}
}
