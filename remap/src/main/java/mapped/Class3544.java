// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumSet;

public class Class3544 extends Class3542
{
    private static String[] field16599;
    private int field16600;
    public final /* synthetic */ Class803 field16601;
    
    public Class3544(final Class803 field16601) {
        this.field16601 = field16601;
        super(field16601, null);
        this.field16600 = Class803.method4701(this.field16601).nextInt(140);
        this.method11019(EnumSet.of(Class2139.field12580, Class2139.field12581, Class2139.field12582));
    }
    
    @Override
    public boolean method11013() {
        if (this.field16601.field2968 == 0.0f) {
            if (this.field16601.field2969 == 0.0f) {
                if (this.field16601.field2970 == 0.0f) {
                    return this.method11095() || this.field16601.method2783();
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean method11017() {
        return this.method11095();
    }
    
    private boolean method11095() {
        if (this.field16600 <= 0) {
            if (this.field16601.world.method6703()) {
                if (this.method11092()) {
                    return !this.method11093();
                }
            }
            return false;
        }
        --this.field16600;
        return false;
    }
    
    @Override
    public void method11018() {
        this.field16600 = Class803.method4702(this.field16601).nextInt(140);
        Class803.method4691(this.field16601);
    }
    
    @Override
    public void method11015() {
        this.field16601.method4655(false);
        this.field16601.method4668(false);
        this.field16601.method4669(false);
        this.field16601.method2745(false);
        Class803.method4703(this.field16601, true);
        this.field16601.method4150().method24733();
        this.field16601.method4148().method19907(this.field16601.getPosX(), this.field16601.getPosY(), this.field16601.getPosZ(), 0.0);
    }
}
