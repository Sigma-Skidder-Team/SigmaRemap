package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.model.ZombieModel;
import net.minecraft.entity.monster.ZombieEntity;

public class ZombieRenderer extends AbstractZombieRenderer<ZombieEntity, ZombieModel<ZombieEntity>>
{
    public ZombieRenderer(EntityRendererManager p_i1726_1_)
    {
        super(p_i1726_1_, new ZombieModel<>(0.0F, false), new ZombieModel<>(0.5F, true), new ZombieModel<>(1.0F, true));
    }
}
