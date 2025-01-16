// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

import javax.annotation.Nullable;

public abstract class Class5784 implements Class5783
{
    public final Class852 field23764;
    
    public Class5784(final Class852 field23764) {
        this.field23764 = field23764;
    }
    
    @Override
    public boolean method17245() {
        return false;
    }
    
    @Override
    public void method17246() {
    }
    
    @Override
    public void method17247() {
    }
    
    @Override
    public void method17248(final Class858 class858, final BlockPos class859, final DamageSource class860, final PlayerEntity class861) {
    }
    
    @Override
    public void method17249() {
    }
    
    @Override
    public void method17250() {
    }
    
    @Override
    public float method17251() {
        return 0.6f;
    }
    
    @Nullable
    @Override
    public Vec3d method17254() {
        return null;
    }
    
    @Override
    public float method17255(final DamageSource class7929, final float n) {
        return n;
    }
    
    @Override
    public float method17252() {
        final float a = MathHelper.sqrt(Entity.horizontalMag(this.field23764.getMotion())) + 1.0f;
        return 0.7f / Math.min(a, 40.0f) / a;
    }
}
