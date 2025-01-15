package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.layers.ElytraLayer;
import net.minecraft.client.renderer.entity.layers.HeadLayer;
import net.minecraft.client.renderer.entity.layers.HeldItemLayer;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.MobEntity;
import net.minecraft.util.ResourceLocation;

public class BipedRenderer<T extends MobEntity, M extends BipedModel<T>> extends MobRenderer<T, M>
{
    private static final ResourceLocation DEFAULT_RES_LOC = new ResourceLocation("textures/entity/steve.png");

    public BipedRenderer(EntityRendererManager p_i1499_1_, M p_i1499_2_, float p_i1499_3_)
    {
        super(p_i1499_1_, p_i1499_2_, p_i1499_3_);
        this.addLayer(new HeadLayer<>(this));
        this.addLayer(new ElytraLayer<>(this));
        this.addLayer(new HeldItemLayer<>(this));
    }

    public ResourceLocation getEntityTexture(T entity)
    {
        return DEFAULT_RES_LOC;
    }
}
