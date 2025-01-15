package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public interface IEntityRenderer<T extends Entity, M extends EntityModel<T>>
{
    M getEntityModel();

    ResourceLocation getEntityTexture(T entity);
}
