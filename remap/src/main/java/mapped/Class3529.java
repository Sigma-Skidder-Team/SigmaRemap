// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class3529 extends Class3446
{
    private static String[] field16555;
    private final Class848 field16556;
    private int field16557;
    
    public Class3529(final Class848 field16556) {
        this.field16556 = field16556;
    }
    
    public void method11081() {
        if (this.field16557 == 0) {
            this.field16557 = 20;
        }
    }
    
    @Override
    public boolean method11013() {
        return this.field16557 > 0;
    }
    
    @Override
    public void method11016() {
        --this.field16557;
        if (this.field16557 <= 0) {
            final Class1847 field2391 = this.field16556.field2391;
            final Random method2633 = this.field16556.method2633();
            final BlockPos class354 = new BlockPos(this.field16556);
            for (int i = 0; i <= 5; i = ((i <= 0) ? 1 : 0) - i) {
                if (i < -5) {
                    break;
                }
                for (int n = 0; n <= 10 && n >= -10; n = ((n <= 0) ? 1 : 0) - n) {
                    for (int n2 = 0; n2 <= 10 && n2 >= -10; n2 = ((n2 <= 0) ? 1 : 0) - n2) {
                        final BlockPos method2634 = class354.method1134(n, i, n2);
                        final Class3833 method2635 = field2391.method6701(method2634).method21696();
                        if (method2635 instanceof Class3979) {
                            if (!field2391.method6765().method31216(Class8878.field37316)) {
                                field2391.method6688(method2634, ((Class3979)method2635).method12122().method11878(), 3);
                            }
                            else {
                                field2391.method6691(method2634, true, this.field16556);
                            }
                            if (method2633.nextBoolean()) {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }
}
