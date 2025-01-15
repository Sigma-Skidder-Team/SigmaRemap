// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumSet;

public class Class3528 extends Class3446
{
    private final Class794 field16545;
    private Class511 field16546;
    private final Class1852 field16547;
    private final double field16548;
    private final Class7746 field16549;
    private int field16550;
    private final float field16551;
    private final float field16552;
    private float field16553;
    private final boolean field16554;
    
    public Class3528(final Class794 field16545, final double field16546, final float field16547, final float field16548, final boolean field16549) {
        this.field16545 = field16545;
        this.field16547 = field16545.field2391;
        this.field16548 = field16546;
        this.field16549 = field16545.method4150();
        this.field16552 = field16547;
        this.field16551 = field16548;
        this.field16554 = field16549;
        this.method11019(EnumSet.of(Class2139.field12580, Class2139.field12581));
        if (!(field16545.method4150() instanceof Class7747) && !(field16545.method4150() instanceof Class7750)) {
            throw new IllegalArgumentException("Unsupported mob type for FollowOwnerGoal");
        }
    }
    
    @Override
    public boolean method11013() {
        final Class511 method4488 = this.field16545.method4488();
        if (method4488 == null) {
            return false;
        }
        if (method4488.method1639()) {
            return false;
        }
        if (this.field16545.method4483()) {
            return false;
        }
        if (this.field16545.method1734(method4488) >= this.field16552 * this.field16552) {
            this.field16546 = method4488;
            return true;
        }
        return false;
    }
    
    @Override
    public boolean method11017() {
        return !this.field16549.method24731() && !this.field16545.method4483() && this.field16545.method1734(this.field16546) > this.field16551 * this.field16551;
    }
    
    @Override
    public void method11015() {
        this.field16550 = 0;
        this.field16553 = this.field16545.method4144(Class257.field1211);
        this.field16545.method4145(Class257.field1211, 0.0f);
    }
    
    @Override
    public void method11018() {
        this.field16546 = null;
        this.field16549.method24733();
        this.field16545.method4145(Class257.field1211, this.field16553);
    }
    
    @Override
    public void method11016() {
        this.field16545.method4147().method24667(this.field16546, 10.0f, (float)this.field16545.method4173());
        final int field16550 = this.field16550 - 1;
        this.field16550 = field16550;
        if (field16550 <= 0) {
            this.field16550 = 10;
            if (!this.field16545.method4205()) {
                if (!this.field16545.method1805()) {
                    if (this.field16545.method1734(this.field16546) < 144.0) {
                        this.field16549.method24725(this.field16546, this.field16548);
                    }
                    else {
                        this.method11077();
                    }
                }
            }
        }
    }
    
    private void method11077() {
        final Class354 class354 = new Class354(this.field16546);
        for (int i = 0; i < 10; ++i) {
            if (this.method11078(class354.method1074() + this.method11080(-3, 3), class354.method1075() + this.method11080(-1, 1), class354.method1076() + this.method11080(-3, 3))) {
                return;
            }
        }
    }
    
    private boolean method11078(final int n, final int n2, final int n3) {
        if (Math.abs(n - this.field16546.method1938()) < 2.0 && Math.abs(n3 - this.field16546.method1945()) < 2.0) {
            return false;
        }
        if (this.method11079(new Class354(n, n2, n3))) {
            this.field16545.method1730(n + 0.5f, n2, n3 + 0.5f, this.field16545.field2399, this.field16545.field2400);
            this.field16549.method24733();
            return true;
        }
        return false;
    }
    
    private boolean method11079(final Class354 class354) {
        if (Class4651.method13914(this.field16547, class354.method1074(), class354.method1075(), class354.method1076()) == Class257.field1207) {
            final Class7096 method6701 = this.field16547.method6701(class354.method1139());
            return (this.field16554 || !(method6701.method21696() instanceof Class3972)) && this.field16547.method6978(this.field16545, this.field16545.method1886().method18500(class354.method1136(new Class354(this.field16545))));
        }
        return false;
    }
    
    private int method11080(final int n, final int n2) {
        return this.field16545.method2633().nextInt(n2 - n + 1) + n;
    }
}
