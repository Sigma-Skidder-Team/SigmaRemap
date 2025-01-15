// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Vec3d;

import java.util.EnumSet;
import java.util.function.Predicate;

public class Class3448<T extends LivingEntity> extends Class3446
{
    private static String[] field16275;
    public final Class787 field16276;
    private final double field16277;
    private final double field16278;
    public T field16279;
    public final float field16280;
    public Class9468 field16281;
    public final Class7746 field16282;
    public final Class<T> field16283;
    public final Predicate<LivingEntity> field16284;
    public final Predicate<LivingEntity> field16285;
    private final Class7843 field16286;
    
    public Class3448(final Class787 class787, final Class<T> clazz, final float n, final double n2, final double n3) {
        this(class787, clazz, p0 -> true, n, n2, n3, (Predicate)Class9170.field38849::test);
    }
    
    public Class3448(final Class787 field16276, final Class<T> field16277, final Predicate<LivingEntity> predicate, final float field16278, final double field16279, final double field16280, final Predicate<LivingEntity> field16281) {
        this.field16276 = field16276;
        this.field16283 = field16277;
        this.field16284 = predicate;
        this.field16280 = field16278;
        this.field16277 = field16279;
        this.field16278 = field16280;
        this.field16285 = field16281;
        this.field16282 = field16276.method4150();
        this.method11019(EnumSet.of(Class2139.field12580));
        this.field16286 = new Class7843().method25337(field16278).method25343(field16281.and(predicate));
    }
    
    public Class3448(final Class787 class787, final Class<T> clazz, final float n, final double n2, final double n3, final Predicate<LivingEntity> predicate) {
        this(class787, clazz, p0 -> true, n, n2, n3, predicate);
    }
    
    @Override
    public boolean method11013() {
        this.field16279 = this.field16276.world.method7139((Class<? extends T>)this.field16283, this.field16286, (LivingEntity)this.field16276, this.field16276.getPosX(), this.field16276.getPosY(), this.field16276.getPosZ(), this.field16276.getBoundingBox().method18495(this.field16280, 3.0, this.field16280));
        if (this.field16279 == null) {
            return false;
        }
        final Vec3d method24908 = Class7775.method24908(this.field16276, 16, 7, this.field16279.method1934());
        if (method24908 == null) {
            return false;
        }
        if (this.field16279.method1733(method24908.x, method24908.y, method24908.z) >= this.field16279.method1734(this.field16276)) {
            this.field16281 = this.field16282.method24719(method24908.x, method24908.y, method24908.z, 0);
            return this.field16281 != null;
        }
        return false;
    }
    
    @Override
    public boolean method11017() {
        return !this.field16282.method24731();
    }
    
    @Override
    public void method11015() {
        this.field16282.method24726(this.field16281, this.field16277);
    }
    
    @Override
    public void method11018() {
        this.field16279 = null;
    }
    
    @Override
    public void method11016() {
        if (this.field16276.method1734(this.field16279) >= 49.0) {
            this.field16276.method4150().method24716(this.field16277);
        }
        else {
            this.field16276.method4150().method24716(this.field16278);
        }
    }
}
