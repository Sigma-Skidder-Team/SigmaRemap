// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

public class Class801 extends Class789
{
    private static final Class8810<Boolean> field4299;
    private static final Class8810<Integer> field4300;
    private static final Class120 field4301;
    private boolean field4302;
    private int field4303;
    private int field4304;
    
    public Class801(final Class7499<? extends Class801> class7499, final Class1847 class7500) {
        super(class7499, class7500);
    }
    
    @Override
    public void method4142() {
        this.field4114.method22062(0, new Class3490(this));
        this.field4114.method22062(1, new Class3607(this, 1.25));
        this.field4114.method22062(3, new Class3587(this, 1.0));
        this.field4114.method22062(4, new Class3472(this, 1.2, Class120.method618(Class7739.field31529), false));
        this.field4114.method22062(4, new Class3472(this, 1.2, false, Class801.field4301));
        this.field4114.method22062(5, new Class3456(this, 1.1));
        this.field4114.method22062(6, new Class3517(this, 1.0));
        this.field4114.method22062(7, new Class3628(this, Class512.class, 6.0f));
        this.field4114.method22062(8, new Class3503(this));
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33405).method23941(10.0);
        this.method2710(Class8107.field33408).method23941(0.25);
    }
    
    @Nullable
    @Override
    public Class399 method1907() {
        return this.method1908().isEmpty() ? null : this.method1908().get(0);
    }
    
    @Override
    public boolean method4189() {
        final Class399 method1907 = this.method1907();
        if (method1907 instanceof Class512) {
            final Class512 class512 = (Class512)method1907;
            return class512.method2713().method27622() == Class7739.field31529 || class512.method2714().method27622() == Class7739.field31529;
        }
        return false;
    }
    
    @Override
    public void method1880(final Class8810<?> class8810) {
        if (Class801.field4300.equals(class8810)) {
            if (this.field2391.field10067) {
                this.field4302 = true;
                this.field4303 = 0;
                this.field4304 = this.field2432.method33568(Class801.field4300);
            }
        }
        super.method1880(class8810);
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.field2432.method33565(Class801.field4299, false);
        this.field2432.method33565(Class801.field4300, 0);
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        class51.method312("Saddle", this.method4625());
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        this.method4626(class51.method329("Saddle"));
    }
    
    @Override
    public Class7795 method4160() {
        return Class8520.field35460;
    }
    
    @Override
    public Class7795 method2683(final Class7929 class7929) {
        return Class8520.field35462;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35461;
    }
    
    @Override
    public void method1691(final Class354 class354, final Class7096 class355) {
        this.method1695(Class8520.field35464, 0.15f, 1.0f);
    }
    
    @Override
    public boolean method4195(final Class512 class512, final Class316 class513) {
        if (super.method4195(class512, class513)) {
            return true;
        }
        final Class8321 method2715 = class512.method2715(class513);
        if (method2715.method27622() == Class7739.field31552) {
            method2715.method27640(class512, this, class513);
            return true;
        }
        if (this.method4625() && !this.method1806()) {
            if (!this.field2391.field10067) {
                class512.method1778(this);
            }
            return true;
        }
        return method2715.method27622() == Class7739.field31353 && method2715.method27640(class512, this, class513);
    }
    
    @Override
    public void method2676() {
        super.method2676();
        if (this.method4625()) {
            this.method1764(Class7739.field31353);
        }
    }
    
    public boolean method4625() {
        return this.field2432.method33568(Class801.field4299);
    }
    
    public void method4626(final boolean b) {
        if (!b) {
            this.field2432.method33569(Class801.field4299, false);
        }
        else {
            this.field2432.method33569(Class801.field4299, true);
        }
    }
    
    @Override
    public void method1834(final Class422 class422) {
        final Class828 class423 = Class7499.field29014.method23371(this.field2391);
        class423.method1803(Class2215.field13600, new Class8321(Class7739.field31302));
        class423.method1730(this.method1938(), this.method1941(), this.method1945(), this.field2399, this.field2400);
        class423.method4211(this.method4214());
        if (this.method1874()) {
            class423.method1872(this.method1873());
            class423.method1875(this.method1876());
        }
        this.field2391.method6886(class423);
        this.method1652();
    }
    
    @Override
    public void method2729(final Class5487 class5487) {
        if (this.method1768()) {
            final Class399 class5488 = this.method1908().isEmpty() ? null : this.method1908().get(0);
            if (this.method1806() && this.method4189()) {
                this.field2399 = class5488.field2399;
                this.field2401 = this.field2399;
                this.field2400 = class5488.field2400 * 0.5f;
                this.method1655(this.field2399, this.field2400);
                this.field2951 = this.field2399;
                this.field2953 = this.field2399;
                this.field2420 = 1.0f;
                this.field2955 = this.method2732() * 0.1f;
                if (this.field4302) {
                    if (this.field4303++ > this.field4304) {
                        this.field4302 = false;
                    }
                }
                if (!this.method1919()) {
                    this.method1936(Class5487.field22769);
                }
                else {
                    float n = (float)this.method2710(Class8107.field33408).method23950() * 0.225f;
                    if (this.field4302) {
                        n += n * 1.15f * Class9546.method35638(this.field4303 / (float)this.field4304 * 3.1415927f);
                    }
                    this.method2733(n);
                    super.method2729(new Class5487(0.0, 0.0, 1.0));
                    this.field2971 = 0;
                }
                this.field2945 = this.field2946;
                final double n2 = this.method1938() - this.field2392;
                final double n3 = this.method1945() - this.field2394;
                float n4 = Class9546.method35641(n2 * n2 + n3 * n3) * 4.0f;
                if (n4 > 1.0f) {
                    n4 = 1.0f;
                }
                this.field2946 += (n4 - this.field2946) * 0.4f;
                this.field2947 += this.field2946;
            }
            else {
                this.field2420 = 0.5f;
                this.field2955 = 0.02f;
                super.method2729(class5487);
            }
        }
    }
    
    public boolean method4627() {
        if (!this.field4302) {
            this.field4302 = true;
            this.field4303 = 0;
            this.field4304 = this.method2633().nextInt(841) + 140;
            this.method1650().method33569(Class801.field4300, this.field4304);
            return true;
        }
        return false;
    }
    
    public Class801 method4628(final Class788 class788) {
        return Class7499.field29012.method23371(this.field2391);
    }
    
    @Override
    public boolean method4357(final Class8321 class8321) {
        return Class801.field4301.test(class8321);
    }
    
    static {
        field4299 = Class9184.method33564(Class801.class, Class7709.field30661);
        field4300 = Class9184.method33564(Class801.class, Class7709.field30654);
        field4301 = Class120.method618(Class7739.field31517, Class7739.field31518, Class7739.field31575);
    }
}
