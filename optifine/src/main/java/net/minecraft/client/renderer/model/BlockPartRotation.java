package net.minecraft.client.renderer.model;

import net.minecraft.client.renderer.Vector3f;
import net.minecraft.util.Direction;

public class BlockPartRotation
{
    public final Vector3f origin;
    public final Direction.Axis axis;
    public final float angle;
    public final boolean rescale;

    public BlockPartRotation(Vector3f p_i3994_1_, Direction.Axis p_i3994_2_, float p_i3994_3_, boolean p_i3994_4_)
    {
        this.origin = p_i3994_1_;
        this.axis = p_i3994_2_;
        this.angle = p_i3994_3_;
        this.rescale = p_i3994_4_;
    }
}
