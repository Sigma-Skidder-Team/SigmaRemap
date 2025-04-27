// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3d;

public abstract class RayTraceResult
{
    public final Vec3d hitResult;
    
    public RayTraceResult(final Vec3d field27323) {
        this.hitResult = field27323;
    }
    
    public abstract Type getType();
    
    public Vec3d getHitVec() {
        return this.hitResult;
    }

    public enum Type
    {
        MISS,
        BLOCK,
        ENTITY
    }
}
