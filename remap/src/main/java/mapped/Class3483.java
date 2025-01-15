// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3483 extends Class3479
{
    private static String[] field16406;
    private final Class792 field16407;
    private boolean field16408;
    private boolean field16409;
    
    public Class3483(final Class792 field16407) {
        super(field16407, 0.699999988079071, 16);
        this.field16407 = field16407;
    }
    
    @Override
    public boolean method11013() {
        if (this.field16392 <= 0) {
            if (!this.field16407.field2391.method6765().method31216(Class8878.field37316)) {
                return false;
            }
            this.field16409 = false;
            this.field16408 = Class792.method4450(this.field16407);
            this.field16408 = true;
        }
        return super.method11013();
    }
    
    @Override
    public boolean method11017() {
        return this.field16409 && super.method11017();
    }
    
    @Override
    public void method11016() {
        super.method11016();
        this.field16407.method4147().method24669(this.field16395.method1074() + 0.5, this.field16395.method1075() + 1, this.field16395.method1076() + 0.5, 10.0f, (float)this.field16407.method4173());
        if (this.method11048()) {
            final Class1847 field2391 = this.field16407.field2391;
            final Class354 method1137 = this.field16395.method1137();
            final Class7096 method1138 = field2391.method6701(method1137);
            final Class3833 method1139 = method1138.method21696();
            if (this.field16409) {
                if (method1139 instanceof Class3881) {
                    final Integer n = ((Class7097<Object, Class7096>)method1138).method21772((Class7111<Integer>)Class3881.field17529);
                    if (n != 0) {
                        field2391.method6688(method1137, ((Class7097<Object, Class7096>)method1138).method21773((Class7111<Comparable>)Class3881.field17529, n - 1), 2);
                        field2391.method6955(2001, method1137, Class3833.method11774(method1138));
                    }
                    else {
                        field2391.method6688(method1137, Class7521.field29147.method11878(), 2);
                        field2391.method6691(method1137, true, this.field16407);
                    }
                    Class792.method4451(this.field16407, 40);
                }
            }
            this.field16409 = false;
            this.field16392 = 10;
        }
    }
    
    @Override
    public boolean method11050(final Class1852 class1852, Class354 method1137) {
        if (class1852.method6701(method1137).method21696() == Class7521.field29298) {
            if (this.field16408) {
                if (!this.field16409) {
                    method1137 = method1137.method1137();
                    final Class7096 method1138 = class1852.method6701(method1137);
                    final Class3833 method1139 = method1138.method21696();
                    if (method1139 instanceof Class3881) {
                        if (((Class3881)method1139).method11956(method1138)) {
                            return this.field16409 = true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
