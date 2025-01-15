package net.optifine.shaders;

import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.client.renderer.culling.ClippingHelperImpl;
import net.minecraft.util.math.AxisAlignedBB;

public class ClippingHelperDummy extends ClippingHelperImpl
{
    public ClippingHelperDummy()
    {
        super(new Matrix4f(), new Matrix4f());
    }

    public boolean isBoundingBoxInFrustum(AxisAlignedBB aabbIn)
    {
        return true;
    }
}
