package com.republicofgamers.randomstuffmod.items.models;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelGalaxyHelmet - Arjan Deo
 * Created using Tabula 7.0.0
 */
public class ModelGalaxyHelmet extends ModelBiped {
    public ModelRenderer Box;

    public ModelGalaxyHelmet() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Box = new ModelRenderer(this, 82, 0);
        this.Box.setRotationPoint(-4.0F, -8.0F, -4.0F);
        this.Box.addBox(-1.0F, -5.0F, -1.0F, 10, 5, 12, 0.0F);
        
        this.bipedHead.addChild(Box);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) 
    { 
    	super.render(entity, f, f1, f2, f3, f4, f5);
    }
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
