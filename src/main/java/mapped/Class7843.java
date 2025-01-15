// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Predicate;

public class Class7843
{
    private static String[] field32116;
    public static final Class7843 field32117;
    private double field32118;
    private boolean field32119;
    private boolean field32120;
    private boolean field32121;
    private boolean field32122;
    private boolean field32123;
    private Predicate<Class511> field32124;
    
    public Class7843() {
        this.field32118 = -1.0;
        this.field32123 = true;
    }
    
    public Class7843 method25337(final double field32118) {
        this.field32118 = field32118;
        return this;
    }
    
    public Class7843 method25338() {
        this.field32119 = true;
        return this;
    }
    
    public Class7843 method25339() {
        this.field32120 = true;
        return this;
    }
    
    public Class7843 method25340() {
        this.field32121 = true;
        return this;
    }
    
    public Class7843 method25341() {
        this.field32122 = true;
        return this;
    }
    
    public Class7843 method25342() {
        this.field32123 = false;
        return this;
    }
    
    public Class7843 method25343(final Predicate<Class511> field32124) {
        this.field32124 = field32124;
        return this;
    }
    
    public boolean method25344(final Class511 class511, final Class511 class512) {
        if (class511 == class512) {
            return false;
        }
        if (class512.method1639()) {
            return false;
        }
        if (!class512.method1768()) {
            return false;
        }
        if (!this.field32119 && class512.method1850()) {
            return false;
        }
        if (this.field32124 != null && !this.field32124.test(class512)) {
            return false;
        }
        if (class511 != null) {
            if (!this.field32122) {
                if (!class511.method2646(class512)) {
                    return false;
                }
                if (!class511.method2620(class512.method1642())) {
                    return false;
                }
            }
            if (!this.field32120 && class511.method1826(class512)) {
                return false;
            }
            if (this.field32118 > 0.0) {
                final double n = this.field32118 * (this.field32123 ? class512.method2645(class511) : 1.0);
                if (class511.method1733(class512.method1938(), class512.method1941(), class512.method1945()) > n * n) {
                    return false;
                }
            }
            if (!this.field32121) {
                if (class511 instanceof Class759) {
                    if (!((Class759)class511).method4151().method34143(class512)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    static {
        field32117 = new Class7843();
    }
}
