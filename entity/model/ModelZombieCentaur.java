package com.republicofgamers.randomstuffmod.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelCow - Either Mojang or a mod author
 * Created using Tabula 7.0.0
 */
public class ModelZombieCentaur extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Udders;
    public ModelRenderer BackRightLeg;
    public ModelRenderer FrontRightLeg;
    public ModelRenderer BackLeftLeg;
    public ModelRenderer FrontLeftLeg;
    public ModelRenderer Head;
    public ModelRenderer LeftArm;
    public ModelRenderer RightArm;
    public ModelRenderer Chest;

    public ModelZombieCentaur() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.BackLeftLeg = new ModelRenderer(this, 0, 16);
        this.BackLeftLeg.setRotationPoint(-4.0F, 12.0F, 7.0F);
        this.BackLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.FrontLeftLeg = new ModelRenderer(this, 0, 16);
        this.FrontLeftLeg.setRotationPoint(-4.0F, 12.0F, -6.0F);
        this.FrontLeftLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.LeftArm = new ModelRenderer(this, 40, 16);
        this.LeftArm.setRotationPoint(4.0F, -10.2F, 0.0F);
        this.LeftArm.addBox(0.0F, 0.0F, 0.0F, 4, 12, 4, 0.0F);
        this.BackRightLeg = new ModelRenderer(this, 0, 16);
        this.BackRightLeg.setRotationPoint(4.0F, 12.0F, 7.0F);
        this.BackRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.RightArm = new ModelRenderer(this, 40, 16);
        this.RightArm.mirror = true;
        this.RightArm.setRotationPoint(-8.1F, -10.2F, 0.0F);
        this.RightArm.addBox(0.0F, 0.0F, 0.0F, 4, 12, 4, 0.0F);
        this.Body = new ModelRenderer(this, 18, 4);
        this.Body.setRotationPoint(0.0F, 5.0F, 2.0F);
        this.Body.addBox(-6.0F, -10.0F, -7.0F, 12, 18, 10, 0.0F);
        this.setRotateAngle(Body, 1.5707963267948966F, 0.0F, 0.0F);
        this.FrontRightLeg = new ModelRenderer(this, 0, 16);
        this.FrontRightLeg.setRotationPoint(4.0F, 12.0F, -6.0F);
        this.FrontRightLeg.addBox(-2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F);
        this.Head = new ModelRenderer(this, 0, 0);
        this.Head.setRotationPoint(0.0F, -10.4F, 0.0F);
        this.Head.addBox(-4.0F, -8.1F, -4.0F, 8, 8, 8, 0.0F);
        this.Udders = new ModelRenderer(this, 52, 0);
        this.Udders.setRotationPoint(0.0F, 5.0F, 2.0F);
        this.Udders.addBox(-2.0F, 2.0F, -8.0F, 4, 6, 1, 0.0F);
        this.setRotateAngle(Udders, 1.5707963267948966F, 0.0F, 0.0F);
        this.Chest = new ModelRenderer(this, 16, 16);
        this.Chest.setRotationPoint(-4.0F, -10.1F, 0.0F);
        this.Chest.addBox(0.0F, 0.0F, 0.0F, 8, 12, 4, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.BackLeftLeg.render(f5);
        this.FrontLeftLeg.render(f5);
        this.LeftArm.render(f5);
        this.BackRightLeg.render(f5);
        this.RightArm.render(f5);
        this.Body.render(f5);
        this.FrontRightLeg.render(f5);
        this.Head.render(f5);
        this.Udders.render(f5);
        this.Chest.render(f5);
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
