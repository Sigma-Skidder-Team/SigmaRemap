// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.util.function.Predicate;

public class Class454 extends Class433 implements Class453
{
    private boolean field2704;
    private int field2705;
    private final Class354 field2706;
    
    public Class454(final Class7499<? extends Class454> class7499, final Class1847 class7500) {
        super(class7499, class7500);
        this.field2704 = true;
        this.field2705 = -1;
        this.field2706 = Class354.field2173;
    }
    
    public Class454(final Class1847 class1847, final double n, final double n2, final double n3) {
        super(Class7499.field29003, n, n2, n3, class1847);
        this.field2704 = true;
        this.field2705 = -1;
        this.field2706 = Class354.field2173;
    }
    
    @Override
    public Class2080 method2139() {
        return Class2080.field12029;
    }
    
    @Override
    public Class7096 method2141() {
        return Class7521.field29475.method11878();
    }
    
    @Override
    public int method2143() {
        return 1;
    }
    
    @Override
    public int method2239() {
        return 5;
    }
    
    @Override
    public void method2126(final int n, final int n2, final int n3, final boolean b) {
        final boolean b2 = !b;
        if (b2 != this.method2289()) {
            this.method2290(b2);
        }
    }
    
    public boolean method2289() {
        return this.field2704;
    }
    
    public void method2290(final boolean field2704) {
        this.field2704 = field2704;
    }
    
    @Override
    public Class1847 method2186() {
        return this.field2391;
    }
    
    @Override
    public double method2286() {
        return this.method1938();
    }
    
    @Override
    public double method2287() {
        return this.method1941() + 0.5;
    }
    
    @Override
    public double method2288() {
        return this.method1945();
    }
    
    @Override
    public void method1659() {
        super.method1659();
        if (!this.field2391.field10067) {
            if (this.method1768()) {
                if (this.method2289()) {
                    if (!new Class354(this).equals(this.field2706)) {
                        this.method2292(0);
                    }
                    else {
                        --this.field2705;
                    }
                    if (!this.method2293()) {
                        this.method2292(0);
                        if (this.method2291()) {
                            this.method2292(4);
                            this.method2161();
                        }
                    }
                }
            }
        }
    }
    
    public boolean method2291() {
        if (!Class455.method2300(this)) {
            final List<Class399> method6739 = this.field2391.method6739((Class<? extends Class399>)Class427.class, this.method1886().method18495(0.25, 0.0, 0.25), (Predicate<? super Class399>)Class9170.field38845);
            if (!method6739.isEmpty()) {
                Class455.method2302(this, (Class427)method6739.get(0));
            }
            return false;
        }
        return true;
    }
    
    @Override
    public void method2123(final Class7929 class7929) {
        super.method2123(class7929);
        if (this.field2391.method6765().method31216(Class8878.field37321)) {
            this.method1764(Class7521.field29475);
        }
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        class51.method298("TransferCooldown", this.field2705);
        class51.method312("Enabled", this.field2704);
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        this.field2705 = class51.method319("TransferCooldown");
        this.field2704 = (!class51.method315("Enabled") || class51.method329("Enabled"));
    }
    
    public void method2292(final int field2705) {
        this.field2705 = field2705;
    }
    
    public boolean method2293() {
        return this.field2705 > 0;
    }
    
    @Override
    public Class3418 method2167(final int n, final Class464 class464) {
        return new Class3437(n, class464, this);
    }
}
