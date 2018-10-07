package com.republicofgamers.randomstuffmod.items.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelCrown - Arjan Deo
 * Created using Tabula 7.0.0
 */
public class ModelCrown extends ModelBiped {
    public ModelRenderer Crown;

    public ModelCrown() {
        this.textureWidth = 128;
        this.textureHeight = 128;
        this.Crown = new ModelRenderer(this, 71, 0);
        this.Crown.setRotationPoint(-4.0F, -5.0F, -4.0F);
        this.Crown.addBox(0.0F, -7.0F, 0.0F, 8, 4, 8, 0.0F);
        
        this.bipedHead.addChild(Crown);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) 
    { 
    	super.render(entity, f, f1, f2, f3, f4, f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
