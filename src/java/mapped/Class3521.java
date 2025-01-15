// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import java.util.EnumSet;

public class Class3521 extends Class3514
{
    private static String[] field16521;
    private Class179 field16522;
    private boolean field16523;
    
    public Class3521(final Class848 class848) {
        super(class848, 1.0, 10);
        this.method11019(EnumSet.of(Class2139.field12580));
    }
    
    @Override
    public boolean method11013() {
        if (this.field16510.method4152() != null) {
            return false;
        }
        if (this.field16510.method4150().method24731()) {
            final Random method2633 = this.field16510.method2633();
            if (this.field16510.field2391.method6765().method31216(Class8878.field37316)) {
                if (method2633.nextInt(10) == 0) {
                    this.field16522 = Class179.method798(method2633);
                    if (Class3979.method12123(this.field16510.field2391.method6701(new Class354(this.field16510.method1938(), this.field16510.method1941() + 0.5, this.field16510.method1945()).method1149(this.field16522)))) {
                        return this.field16523 = true;
                    }
                }
            }
            this.field16523 = false;
            return super.method11013();
        }
        return false;
    }
    
    @Override
    public boolean method11017() {
        return !this.field16523 && super.method11017();
    }
    
    @Override
    public void method11015() {
        if (this.field16523) {
            final Class1847 field2391 = this.field16510.field2391;
            final Class354 method1149 = new Class354(this.field16510.method1938(), this.field16510.method1941() + 0.5, this.field16510.method1945()).method1149(this.field16522);
            final Class7096 method1150 = field2391.method6701(method1149);
            if (Class3979.method12123(method1150)) {
                field2391.method6688(method1149, Class3979.method12124(method1150.method21696()), 3);
                this.field16510.method4158();
                this.field16510.method1652();
            }
        }
        else {
            super.method11015();
        }
    }
}
