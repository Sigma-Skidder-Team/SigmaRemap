// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class3467 extends Class3446
{
    public Class759 field16340;
    public Class354 field16341;
    public boolean field16342;
    private boolean field16343;
    private float field16344;
    private float field16345;
    
    public Class3467(final Class759 field16340) {
        this.field16341 = Class354.field2173;
        this.field16340 = field16340;
        if (field16340.method4150() instanceof Class7747) {
            return;
        }
        throw new IllegalArgumentException("Unsupported mob type for DoorInteractGoal");
    }
    
    public boolean method11033() {
        if (!this.field16342) {
            return false;
        }
        final Class7096 method6701 = this.field16340.field2391.method6701(this.field16341);
        if (method6701.method21696() instanceof Class3969) {
            return method6701.method21772((Class7111<Boolean>)Class3969.field17932);
        }
        return this.field16342 = false;
    }
    
    public void method11034(final boolean b) {
        if (this.field16342) {
            final Class7096 method6701 = this.field16340.field2391.method6701(this.field16341);
            if (method6701.method21696() instanceof Class3969) {
                ((Class3969)method6701.method21696()).method12110(this.field16340.field2391, this.field16341, b);
            }
        }
    }
    
    @Override
    public boolean method11013() {
        if (this.field16340.field2405) {
            final Class7747 class7747 = (Class7747)this.field16340.method4150();
            final Class9468 method24727 = class7747.method24727();
            if (method24727 != null) {
                if (!method24727.method35215()) {
                    if (class7747.method24748()) {
                        for (int i = 0; i < Math.min(method24727.method35222() + 2, method24727.method35221()); ++i) {
                            final Class6772 method24728 = method24727.method35217(i);
                            this.field16341 = new Class354(method24728.field26589, method24728.field26590 + 1, method24728.field26591);
                            if (this.field16340.method1733(this.field16341.method1074(), this.field16340.method1941(), this.field16341.method1076()) <= 2.25 && (this.field16342 = method11035(this.field16340.field2391, this.field16341))) {
                                return true;
                            }
                        }
                        this.field16341 = new Class354(this.field16340).method1137();
                        return this.field16342 = method11035(this.field16340.field2391, this.field16341);
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public boolean method11017() {
        return !this.field16343;
    }
    
    @Override
    public void method11015() {
        this.field16343 = false;
        this.field16344 = (float)(this.field16341.method1074() + 0.5f - this.field16340.method1938());
        this.field16345 = (float)(this.field16341.method1076() + 0.5f - this.field16340.method1945());
    }
    
    @Override
    public void method11016() {
        if (this.field16344 * (float)(this.field16341.method1074() + 0.5f - this.field16340.method1938()) + this.field16345 * (float)(this.field16341.method1076() + 0.5f - this.field16340.method1945()) < 0.0f) {
            this.field16343 = true;
        }
    }
    
    public static boolean method11035(final Class1847 class1847, final Class354 class1848) {
        final Class7096 method6701 = class1847.method6701(class1848);
        return method6701.method21696() instanceof Class3969 && method6701.method21697() == Class8059.field33176;
    }
}
