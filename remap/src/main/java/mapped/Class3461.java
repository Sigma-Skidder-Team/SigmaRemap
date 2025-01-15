// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import java.util.EnumSet;

public class Class3461 extends Class3446
{
    private static String[] field16316;
    private final Class787 field16317;
    private final int field16318;
    private Class354 field16319;
    
    public Class3461(final Class787 field16317, final int field16318) {
        this.field16317 = field16317;
        this.field16318 = field16318;
        this.method11019(EnumSet.of(Class2139.field12580));
    }
    
    @Override
    public boolean method11013() {
        if (this.field16317.method1806()) {
            return false;
        }
        if (this.field16317.field2391.method6703()) {
            return false;
        }
        if (this.field16317.method2633().nextInt(this.field16318) != 0) {
            return false;
        }
        if (((Class1849)this.field16317.field2391).method6924(new Class354(this.field16317), 6)) {
            final Class5487 method24903 = Class7775.method24903(this.field16317, 15, 7, class1850 -> -class1849.method6925(Class353.method1089(class1850)));
            this.field16319 = ((method24903 != null) ? new Class354(method24903) : null);
            return this.field16319 != null;
        }
        return false;
    }
    
    @Override
    public boolean method11017() {
        if (this.field16319 != null) {
            if (!this.field16317.method4150().method24731()) {
                if (this.field16317.method4150().method24714().equals(this.field16319)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public void method11016() {
        if (this.field16319 != null) {
            final Class7746 method4150 = this.field16317.method4150();
            if (method4150.method24731()) {
                if (!this.field16319.method1082(this.field16317.method1934(), 10.0)) {
                    final Class5487 class5487 = new Class5487(this.field16319);
                    final Class5487 method4151 = this.field16317.method1934();
                    final Class354 method4152 = this.field16317.field2391.method6958(Class2020.field11526, new Class354(method4151.method16741(class5487).method16748(0.4).method16743(class5487).method16741(method4151).method16738().method16748(10.0).method16743(method4151)));
                    if (!method4150.method24724(method4152.method1074(), method4152.method1075(), method4152.method1076(), 1.0)) {
                        this.method11024();
                    }
                }
            }
        }
    }
    
    private void method11024() {
        final Random method2633 = this.field16317.method2633();
        final Class354 method2634 = this.field16317.field2391.method6958(Class2020.field11526, new Class354(this.field16317).method1134(-8 + method2633.nextInt(16), 0, -8 + method2633.nextInt(16)));
        this.field16317.method4150().method24724(method2634.method1074(), method2634.method1075(), method2634.method1076(), 1.0);
    }
}
