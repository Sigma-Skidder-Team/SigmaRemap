// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.Vec3d;

import java.util.EnumSet;

public class Class3466 extends Class3446
{
    private static String[] field16332;
    private final Class787 field16333;
    private LivingEntity field16334;
    private double field16335;
    private double field16336;
    private double field16337;
    private final double field16338;
    private final float field16339;
    
    public Class3466(final Class787 field16333, final double field16334, final float field16335) {
        this.field16333 = field16333;
        this.field16338 = field16334;
        this.field16339 = field16335;
        this.method11019(EnumSet.of(Class2139.field12580));
    }
    
    @Override
    public boolean method11013() {
        this.field16334 = this.field16333.method4152();
        if (this.field16334 == null) {
            return false;
        }
        if (this.field16334.method1734(this.field16333) > this.field16339 * this.field16339) {
            return false;
        }
        final Vec3d method24905 = Class7775.method24905(this.field16333, 16, 7, this.field16334.method1934());
        if (method24905 != null) {
            this.field16335 = method24905.x;
            this.field16336 = method24905.y;
            this.field16337 = method24905.z;
            return true;
        }
        return false;
    }
    
    @Override
    public boolean method11017() {
        if (!this.field16333.method4150().method24731()) {
            if (this.field16334.method1768()) {
                if (this.field16334.method1734(this.field16333) < this.field16339 * this.field16339) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public void method11018() {
        this.field16334 = null;
    }
    
    @Override
    public void method11015() {
        this.field16333.method4150().method24724(this.field16335, this.field16336, this.field16337, this.field16338);
    }
}
