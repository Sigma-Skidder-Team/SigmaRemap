// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import java.util.List;
import java.util.EnumSet;
import java.util.function.Predicate;

public class Class3502 extends Class3446
{
    private final Class759 field16464;
    private final Predicate<Class759> field16465;
    private Class759 field16466;
    private final double field16467;
    private final Class7746 field16468;
    private int field16469;
    private final float field16470;
    private float field16471;
    private final float field16472;
    
    public Class3502(final Class759 field16464, final double field16465, final float field16466, final float field16467) {
        this.field16464 = field16464;
        this.field16465 = (class760 -> class760 != null && class759.getClass() != class760.getClass());
        this.field16467 = field16465;
        this.field16468 = field16464.method4150();
        this.field16470 = field16466;
        this.field16472 = field16467;
        this.method11019(EnumSet.of(Class2139.field12580, Class2139.field12581));
        if (!(field16464.method4150() instanceof Class7747) && !(field16464.method4150() instanceof Class7750)) {
            throw new IllegalArgumentException("Unsupported mob type for FollowMobGoal");
        }
    }
    
    @Override
    public boolean method11013() {
        final List<Entity> method6739 = this.field16464.world.method6739((Class<? extends Entity>)Class759.class, this.field16464.getBoundingBox().intersect(this.field16472), (Predicate<? super Entity>)this.field16465);
        if (!method6739.isEmpty()) {
            for (final Class759 field16466 : method6739) {
                if (field16466.method1823()) {
                    continue;
                }
                this.field16466 = field16466;
                return true;
            }
        }
        return false;
    }
    
    @Override
    public boolean method11017() {
        if (this.field16466 != null) {
            if (!this.field16468.method24731()) {
                if (this.field16464.method1734(this.field16466) > this.field16470 * this.field16470) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public void method11015() {
        this.field16469 = 0;
        this.field16471 = this.field16464.method4144(Class257.field1211);
        this.field16464.method4145(Class257.field1211, 0.0f);
    }
    
    @Override
    public void method11018() {
        this.field16466 = null;
        this.field16468.method24733();
        this.field16464.method4145(Class257.field1211, this.field16471);
    }
    
    @Override
    public void method11016() {
        if (this.field16466 != null) {
            if (!this.field16464.method4205()) {
                this.field16464.method4147().method24667(this.field16466, 10.0f, (float)this.field16464.method4173());
                if (--this.field16469 <= 0) {
                    this.field16469 = 10;
                    final double n = this.field16464.getPosX() - this.field16466.getPosX();
                    final double n2 = this.field16464.getPosY() - this.field16466.getPosY();
                    final double n3 = this.field16464.getPosZ() - this.field16466.getPosZ();
                    final double n4 = n * n + n2 * n2 + n3 * n3;
                    if (n4 <= this.field16470 * this.field16470) {
                        this.field16468.method24733();
                        final Class7727 method4147 = this.field16466.method4147();
                        if (n4 > this.field16470) {
                            if (method4147.method24672() != this.field16464.getPosX()) {
                                return;
                            }
                            if (method4147.method24673() != this.field16464.getPosY()) {
                                return;
                            }
                            if (method4147.method24674() != this.field16464.getPosZ()) {
                                return;
                            }
                        }
                        this.field16468.method24724(this.field16464.getPosX() - (this.field16466.getPosX() - this.field16464.getPosX()), this.field16464.getPosY(), this.field16464.getPosZ() - (this.field16466.getPosZ() - this.field16464.getPosZ()), this.field16467);
                    }
                    else {
                        this.field16468.method24725(this.field16466, this.field16467);
                    }
                }
            }
        }
    }
}
