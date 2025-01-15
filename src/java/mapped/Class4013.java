// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class4013 extends Class3833
{
    private static String[] field18084;
    
    public Class4013(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public void method11828(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final Class7096 class7099, final boolean b) {
        if (class7097.method6789().method20502()) {
            class7097.method6688(class7098, Class7521.field29211.method11878(), 3);
            class7097.method6955(2009, class7098, 0);
            class7097.method6705(null, class7098, Class8520.field35199, Class286.field1582, 1.0f, (1.0f + class7097.method6790().nextFloat() * 0.2f) * 0.7f);
        }
    }
    
    @Override
    public void method11823(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final Random random) {
        final Class179 method798 = Class179.method798(random);
        if (method798 != Class179.field512) {
            final Class354 method799 = class7098.method1149(method798);
            final Class7096 method800 = class7097.method6701(method799);
            if (!class7096.method21723() || !method800.method21761(class7097, method799, method798.method782())) {
                final double n = class7098.method1074();
                final double n2 = class7098.method1075();
                final double n3 = class7098.method1076();
                double n4;
                double n5;
                double n6;
                if (method798 != Class179.field511) {
                    n4 = n2 + random.nextDouble() * 0.8;
                    if (method798.method790() != Class111.field351) {
                        n5 = n + random.nextDouble();
                        if (method798 != Class179.field514) {
                            n6 = n3 + 0.05;
                        }
                        else {
                            n6 = n3 + 1.0;
                        }
                    }
                    else {
                        n6 = n3 + random.nextDouble();
                        if (method798 != Class179.field516) {
                            n5 = n + 0.05;
                        }
                        else {
                            n5 = n + 1.0;
                        }
                    }
                }
                else {
                    n4 = n2 - 0.05;
                    n5 = n + random.nextDouble();
                    n6 = n3 + random.nextDouble();
                }
                class7097.method6709(Class8432.field34609, n5, n4, n6, 0.0, 0.0, 0.0);
            }
        }
    }
}
