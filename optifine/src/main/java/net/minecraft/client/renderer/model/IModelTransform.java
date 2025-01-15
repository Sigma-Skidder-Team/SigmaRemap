package net.minecraft.client.renderer.model;

import net.minecraft.client.renderer.TransformationMatrix;

public interface IModelTransform
{
default TransformationMatrix getRotation()
    {
        return TransformationMatrix.identity();
    }

default boolean isUvLock()
    {
        return false;
    }
}
