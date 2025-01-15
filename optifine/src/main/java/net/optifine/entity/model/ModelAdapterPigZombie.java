package net.optifine.entity.model;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.PigZombieRenderer;
import net.minecraft.client.renderer.entity.model.ZombieModel;
import net.minecraft.client.renderer.model.Model;
import net.minecraft.entity.EntityType;

public class ModelAdapterPigZombie extends ModelAdapterBiped
{
    public ModelAdapterPigZombie()
    {
        super(EntityType.ZOMBIE_PIGMAN, "zombie_pigman", 0.5F);
    }

    public Model makeModel()
    {
        return new ZombieModel(0.0F, false);
    }

    public IEntityRenderer makeEntityRender(Model modelBase, float shadowSize)
    {
        EntityRendererManager entityrenderermanager = Minecraft.getInstance().getRenderManager();
        PigZombieRenderer pigzombierenderer = new PigZombieRenderer(entityrenderermanager);
        pigzombierenderer.entityModel = (ZombieModel)modelBase;
        pigzombierenderer.shadowSize = shadowSize;
        return pigzombierenderer;
    }
}
