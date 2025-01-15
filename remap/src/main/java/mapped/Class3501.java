// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;

import java.util.List;
import java.util.EnumSet;

public class Class3501 extends Class3446
{
    private static String[] field16460;
    public final Class815 field16461;
    private double field16462;
    private int field16463;
    
    public Class3501(final Class815 field16461, final double field16462) {
        this.field16461 = field16461;
        this.field16462 = field16462;
        this.method11019(EnumSet.of(Class2139.field12580));
    }
    
    @Override
    public boolean method11013() {
        if (this.field16461.method4205() || this.field16461.method4800()) {
            return false;
        }
        final List<Entity> method6737 = this.field16461.field2391.method6737(this.field16461, this.field16461.method1886().method18495(9.0, 4.0, 9.0), class818 -> {
            class818.method1642();
            final EntityType class819;
            return class819 == EntityType.field28996 || class819 == EntityType.field29033;
        });
        Class815 class815 = null;
        double n = Double.MAX_VALUE;
        for (final Class815 class816 : method6737) {
            if (!class816.method4800()) {
                continue;
            }
            if (class816.method4799()) {
                continue;
            }
            final double method6738 = this.field16461.method1734(class816);
            if (method6738 > n) {
                continue;
            }
            n = method6738;
            class815 = class816;
        }
        if (class815 == null) {
            for (final Class815 class817 : method6737) {
                if (!class817.method4205()) {
                    continue;
                }
                if (class817.method4799()) {
                    continue;
                }
                final double method6739 = this.field16461.method1734(class817);
                if (method6739 > n) {
                    continue;
                }
                n = method6739;
                class815 = class817;
            }
        }
        if (class815 == null) {
            return false;
        }
        if (n < 4.0) {
            return false;
        }
        if (!class815.method4205() && !this.method11065(class815, 1)) {
            return false;
        }
        this.field16461.method4798(class815);
        return true;
    }
    
    @Override
    public boolean method11017() {
        if (this.field16461.method4800()) {
            if (this.field16461.method4801().method1768()) {
                if (this.method11065(this.field16461, 0)) {
                    if (this.field16461.method1734(this.field16461.method4801()) > 676.0) {
                        if (this.field16462 <= 3.0) {
                            this.field16462 *= 1.2;
                            this.field16463 = 40;
                            return true;
                        }
                        if (this.field16463 == 0) {
                            return false;
                        }
                    }
                    if (this.field16463 > 0) {
                        --this.field16463;
                    }
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public void method11018() {
        this.field16461.method4797();
        this.field16462 = 2.1;
    }
    
    @Override
    public void method11016() {
        if (this.field16461.method4800()) {
            final Class815 method4801 = this.field16461.method4801();
            final Vec3d method4802 = new Vec3d(method4801.getPosX() - this.field16461.getPosX(), method4801.getPosY() - this.field16461.getPosY(), method4801.getPosZ() - this.field16461.getPosZ()).normalize().scale(Math.max(this.field16461.method1732(method4801) - 2.0, 0.0));
            this.field16461.method4150().method24724(this.field16461.getPosX() + method4802.x, this.field16461.getPosY() + method4802.y, this.field16461.getPosZ() + method4802.z, this.field16462);
        }
    }
    
    private boolean method11065(final Class815 class815, int n) {
        if (n > 8) {
            return false;
        }
        if (!class815.method4800()) {
            return false;
        }
        if (!class815.method4801().method4205()) {
            final Class815 method4801 = class815.method4801();
            ++n;
            return this.method11065(method4801, n);
        }
        return true;
    }
}
