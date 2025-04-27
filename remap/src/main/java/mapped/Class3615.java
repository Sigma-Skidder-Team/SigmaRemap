// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumSet;

public class Class3615 extends Class3446
{
    private static String[] field16808;
    private final Class840 field16809;
    private final double field16810;
    private PlayerEntity field16811;
    
    public Class3615(final Class840 field16809, final double field16810) {
        this.field16809 = field16809;
        this.field16810 = field16810;
        this.method11019(EnumSet.of(Class2139.field12580, Class2139.field12581));
    }
    
    @Override
    public boolean method11013() {
        this.field16811 = this.field16809.world.method7135(Class840.method5015(), this.field16809);
        return this.field16811 != null && this.field16811.method1817();
    }
    
    @Override
    public boolean method11017() {
        if (this.field16811 != null) {
            if (this.field16811.method1817()) {
                return this.field16809.method1734(this.field16811) < 256.0;
            }
        }
        return false;
    }
    
    @Override
    public void method11015() {
        this.field16811.method2655(new Class1948(Class9439.field40503, 100));
    }
    
    @Override
    public void method11018() {
        this.field16811 = null;
        this.field16809.method4150().method24733();
    }
    
    @Override
    public void method11016() {
        this.field16809.method4147().method24667(this.field16811, (float)(this.field16809.method4174() + 20), (float)this.field16809.method4173());
        if (this.field16809.method1734(this.field16811) >= 6.25) {
            this.field16809.method4150().method24725(this.field16811, this.field16810);
        }
        else {
            this.field16809.method4150().method24733();
        }
        if (this.field16811.method1817()) {
            if (this.field16811.world.rand.nextInt(6) == 0) {
                this.field16811.method2655(new Class1948(Class9439.field40503, 100));
            }
        }
    }
}
