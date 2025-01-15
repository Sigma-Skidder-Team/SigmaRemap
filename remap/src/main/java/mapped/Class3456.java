// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import java.util.List;

public class Class3456 extends Class3446
{
    private static String[] field16298;
    private final Class789 field16299;
    private Class789 field16300;
    private final double field16301;
    private int field16302;
    
    public Class3456(final Class789 field16299, final double field16300) {
        this.field16299 = field16299;
        this.field16301 = field16300;
    }
    
    @Override
    public boolean method11013() {
        if (this.field16299.method4351() >= 0) {
            return false;
        }
        final List<Entity> method7128 = (List<Entity>)this.field16299.world.method7128(this.field16299.getClass(), this.field16299.method1886().method18495(8.0, 4.0, 8.0));
        Class789 field16300 = null;
        double n = Double.MAX_VALUE;
        for (final Class789 class789 : method7128) {
            if (class789.method4351() < 0) {
                continue;
            }
            final double method7129 = this.field16299.method1734(class789);
            if (method7129 > n) {
                continue;
            }
            n = method7129;
            field16300 = class789;
        }
        if (field16300 == null) {
            return false;
        }
        if (n >= 9.0) {
            this.field16300 = field16300;
            return true;
        }
        return false;
    }
    
    @Override
    public boolean method11017() {
        if (this.field16299.method4351() >= 0) {
            return false;
        }
        if (this.field16300.method1768()) {
            final double method1734 = this.field16299.method1734(this.field16300);
            return method1734 >= 9.0 && method1734 <= 256.0;
        }
        return false;
    }
    
    @Override
    public void method11015() {
        this.field16302 = 0;
    }
    
    @Override
    public void method11018() {
        this.field16300 = null;
    }
    
    @Override
    public void method11016() {
        final int field16302 = this.field16302 - 1;
        this.field16302 = field16302;
        if (field16302 <= 0) {
            this.field16302 = 10;
            this.field16299.method4150().method24725(this.field16300, this.field16301);
        }
    }
}
