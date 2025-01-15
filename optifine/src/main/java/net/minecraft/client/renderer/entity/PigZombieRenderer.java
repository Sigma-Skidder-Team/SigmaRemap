package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.layers.BipedArmorLayer;
import net.minecraft.client.renderer.entity.model.ZombieModel;
import net.minecraft.entity.monster.ZombiePigmanEntity;
import net.minecraft.util.ResourceLocation;

public class PigZombieRenderer extends BipedRenderer<ZombiePigmanEntity, ZombieModel<ZombiePigmanEntity>>
{
    private static final ResourceLocation ZOMBIE_PIGMAN_TEXTURE = new ResourceLocation("textures/entity/zombie_pigman.png");

    public PigZombieRenderer(EntityRendererManager p_i2471_1_)
    {
        super(p_i2471_1_, new ZombieModel<>(0.0F, false), 0.5F);
        this.addLayer(new BipedArmorLayer<>(this, new ZombieModel(0.5F, true), new ZombieModel(1.0F, true)));
    }

    public ResourceLocation getEntityTexture(ZombiePigmanEntity entity)
    {
        return ZOMBIE_PIGMAN_TEXTURE;
    }
}
