// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.Vec3d;

import javax.annotation.Nullable;

public class Class5795 extends Class5784
{
    private static String[] field23798;
    private Vec3d field23799;
    
    public Class5795(final Class852 class852) {
        super(class852);
    }
    
    @Override
    public void method17247() {
        if (this.field23799 == null) {
            this.field23799 = this.field23764.method1934();
        }
    }
    
    @Override
    public boolean method17245() {
        return true;
    }
    
    @Override
    public void method17249() {
        this.field23799 = null;
    }
    
    @Override
    public float method17251() {
        return 1.0f;
    }
    
    @Nullable
    @Override
    public Vec3d method17254() {
        return this.field23799;
    }
    
    @Override
    public Class7193<Class5795> method17253() {
        return Class7193.field27958;
    }
}
