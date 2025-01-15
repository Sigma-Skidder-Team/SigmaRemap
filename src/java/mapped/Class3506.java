// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class3506 extends Class3446
{
    private static String[] field16484;
    private final Class793 field16485;
    private final double field16486;
    private boolean field16487;
    
    public Class3506(final Class793 field16485, final double field16486) {
        this.field16485 = field16485;
        this.field16486 = field16486;
    }
    
    @Override
    public boolean method11013() {
        if (!Class793.method4468(this.field16485)) {
            if (!this.field16485.method4456()) {
                if (this.field16485.method1706()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public void method11015() {
        final Random method4475 = Class793.method4475(this.field16485);
        final int n = method4475.nextInt(1025) - 512;
        int n2 = method4475.nextInt(9) - 4;
        final int n3 = method4475.nextInt(1025) - 512;
        if (n2 + this.field16485.method1941() > this.field16485.field2391.method6743() - 1) {
            n2 = 0;
        }
        Class793.method4476(this.field16485, new Class354(n + this.field16485.method1938(), n2 + this.field16485.method1941(), n3 + this.field16485.method1945()));
        Class793.method4477(this.field16485, true);
        this.field16487 = false;
    }
    
    @Override
    public void method11016() {
        if (this.field16485.method4150().method24731()) {
            final Class5487 class5487 = new Class5487(Class793.method4478(this.field16485));
            Class5487 class5488 = Class7775.method24906(this.field16485, 16, 3, class5487, 0.3141592741012573);
            if (class5488 == null) {
                class5488 = Class7775.method24905(this.field16485, 8, 7, class5487);
            }
            if (class5488 != null) {
                final int method35644 = Class9546.method35644(class5488.field22770);
                final int method35645 = Class9546.method35644(class5488.field22772);
                if (!this.field16485.field2391.method6973(method35644 - 34, 0, method35645 - 34, method35644 + 34, 0, method35645 + 34)) {
                    class5488 = null;
                }
            }
            if (class5488 == null) {
                this.field16487 = true;
                return;
            }
            this.field16485.method4150().method24724(class5488.field22770, class5488.field22771, class5488.field22772, this.field16486);
        }
    }
    
    @Override
    public boolean method11017() {
        if (!this.field16485.method4150().method24731()) {
            if (!this.field16487) {
                if (!Class793.method4468(this.field16485)) {
                    if (!this.field16485.method4363()) {
                        if (!this.field16485.method4456()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    @Override
    public void method11018() {
        Class793.method4477(this.field16485, false);
        super.method11018();
    }
}
