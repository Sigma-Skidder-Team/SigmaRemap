// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumSet;

public class Class3543 extends Class3542
{
    private static String[] field16594;
    private double field16595;
    private double field16596;
    private int field16597;
    private int field16598;
    public final /* synthetic */ Class803 field16593;
    
    public Class3543(final Class803 field16593) {
        this.field16593 = field16593;
        super(field16593, null);
        this.method11019(EnumSet.of(Class2139.field12580, Class2139.field12581));
    }
    
    @Override
    public boolean method11013() {
        if (this.field16593.method2634() == null) {
            if (this.field16593.method2633().nextFloat() < 0.02f) {
                if (!this.field16593.method2783()) {
                    if (this.field16593.method4152() == null) {
                        if (this.field16593.method4150().method24731()) {
                            if (!this.method11093()) {
                                if (!this.field16593.method4665()) {
                                    return !this.field16593.method1814();
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public boolean method11017() {
        return this.field16598 > 0;
    }
    
    @Override
    public void method11015() {
        this.method11094();
        this.field16598 = 2 + this.field16593.method2633().nextInt(3);
        this.field16593.method4655(true);
        this.field16593.method4150().method24733();
    }
    
    @Override
    public void method11018() {
        this.field16593.method4655(false);
    }
    
    @Override
    public void method11016() {
        --this.field16597;
        if (this.field16597 <= 0) {
            --this.field16598;
            this.method11094();
        }
        this.field16593.method4147().method24669(this.field16593.getPosX() + this.field16595, this.field16593.method1944(), this.field16593.getPosZ() + this.field16596, (float)this.field16593.method4174(), (float)this.field16593.method4173());
    }
    
    private void method11094() {
        final double n = 6.283185307179586 * this.field16593.method2633().nextDouble();
        this.field16595 = Math.cos(n);
        this.field16596 = Math.sin(n);
        this.field16597 = 80 + this.field16593.method2633().nextInt(20);
    }
}
