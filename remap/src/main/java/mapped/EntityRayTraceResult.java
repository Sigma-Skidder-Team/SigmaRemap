// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;

public class EntityRayTraceResult extends RayTraceResult
{
    private static String[] field27324;
    private final Entity field27325;
    
    public EntityRayTraceResult(final Entity class399) {
        this(class399, class399.method1934());
    }
    
    public EntityRayTraceResult(final Entity field27325, final Vec3d class5487) {
        super(class5487);
        this.field27325 = field27325;
    }
    
    public Entity getEntity() {
        return this.field27325;
    }
    
    @Override
    public Type getType() {
        return Type.ENTITY;
    }
}
