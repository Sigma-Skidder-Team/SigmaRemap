// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Matrix4f;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;

public abstract class Class4703<T extends Entity>
{
    public final Class8551 field20283;
    public float field20284;
    public float field20285;
    private EntityType field20286;
    private ResourceLocation field20287;
    
    public Class4703(final Class8551 field20283) {
        this.field20285 = 1.0f;
        this.field20286 = null;
        this.field20287 = null;
        this.field20283 = field20283;
    }
    
    public final int method13953(final T t, final float n) {
        return Class392.method1422(this.method13954(t, n), t.world.method6992(Class237.field911, new BlockPos(t.method1747(n))));
    }
    
    public int method13954(final T t, final float n) {
        return t.method1804() ? 15 : t.world.method6992(Class237.field912, new BlockPos(t.method1747(n)));
    }
    
    public boolean method13952(final T t, final Class6664 class6664, final double n, final double n2, final double n3) {
        if (!t.method1752(n, n2, n3)) {
            return false;
        }
        if (!t.ignoreFrustumCheck) {
            AxisAlignedBB method18496 = t.method1887().method18496(0.5);
            if (method18496.method18516() || method18496.method18507() == 0.0) {
                method18496 = new AxisAlignedBB(t.getPosX() - 2.0, t.getPosY() - 2.0, t.getPosZ() - 2.0, t.getPosX() + 2.0, t.getPosY() + 2.0, t.getPosZ() + 2.0);
            }
            return class6664.method20261(method18496);
        }
        return true;
    }
    
    public Vec3d method13955(final T t, final float n) {
        return Vec3d.ZERO;
    }
    
    public void method13951(final T t, final float n, final float n2, final Class7351 class7351, final Class7807 class7352, final int i) {
        if (Class9570.field41417.method22619()) {
            final Object method35842 = Class9570.method35842(Class9570.field41417, t, t.getDisplayName().getFormattedText(), this, class7351, class7352, i);
            Class9570.method35841(method35842);
            final Object method35843 = Class9570.method35826(method35842, Class9570.field41226, new Object[0]);
            if (method35843 != Class7667.field30453) {
                if (method35843 == Class7667.field30452 || this.method13956(t)) {
                    this.method13958(t, Class9570.method35825(method35842, Class9570.field41418, new Object[0]), class7351, class7352, i);
                }
            }
        }
        else if (this.method13956(t)) {
            this.method13958(t, t.getDisplayName().getFormattedText(), class7351, class7352, i);
        }
    }
    
    public boolean method13956(final T t) {
        return t.method1879() && t.hasCustomName();
    }
    
    public abstract ResourceLocation method13950(final T p0);
    
    public Class1844 method13957() {
        return this.field20283.method28718();
    }
    
    public void method13958(final T t, final String anObject, final Class7351 class7351, final Class7807 class7352, final int n) {
        if (this.field20283.method28715(t) <= 4096.0) {
            final boolean b = !t.method1812();
            final float n2 = t.method1931() + 0.5f;
            final int n3 = "deadmau5".equals(anObject) ? -10 : 0;
            class7351.method22567();
            class7351.method22564(0.0, n2, 0.0);
            class7351.method22566(this.field20283.method28717());
            class7351.method22565(-0.025f, -0.025f, 0.025f);
            final Matrix4f method32111 = class7351.method22569().method32111();
            final int n4 = (int)(Class869.method5277().field4648.method17114(0.25f) * 255.0f) << 24;
            final Class1844 method32112 = this.method13957();
            final float n5 = (float)(-method32112.method6617(anObject) / 2);
            method32112.method6613(anObject, n5, (float)n3, 553648127, false, method32111, class7352, b, n4, n);
            if (b) {
                method32112.method6613(anObject, n5, (float)n3, -1, false, method32111, class7352, false, 0, n);
            }
            class7351.method22568();
        }
    }
    
    public Class8551 method13959() {
        return this.field20283;
    }
    
    public Class8651<EntityType, Class5412> method13960() {
        return (Class8651<EntityType, Class5412>)((this.field20286 != null) ? Class8651.method29438(this.field20286) : null);
    }
    
    public void method13961(final Class8651<EntityType, Class5412> class8651) {
        this.field20286 = class8651.method29436().get();
    }
    
    public ResourceLocation method13962() {
        return this.field20287;
    }
    
    public void method13963(final ResourceLocation field20287) {
        this.field20287 = field20287;
    }
}
