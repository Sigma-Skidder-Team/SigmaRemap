// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public abstract class Class833 extends Class832
{
    private static final Class8810<Boolean> field4444;
    
    public Class833(final Class7499<? extends Class833> class7499, final Class1847 class7500) {
        super(class7499, class7500);
        this.field4110 = new Class6575(this);
    }
    
    @Override
    public float method2789(final Class290 class290, final Class8295 class291) {
        return class291.field34098 * 0.65f;
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33405).method23941(3.0);
    }
    
    @Override
    public boolean method4169() {
        return this.method4953();
    }
    
    public static boolean method4952(final Class7499<? extends Class833> class7499, final Class1851 class7500, final Class2101 class7501, final Class354 class7502, final Random random) {
        return class7500.method6701(class7502).method21696() == Class7521.field29173 && class7500.method6701(class7502.method1137()).method21696() == Class7521.field29173;
    }
    
    @Override
    public boolean method4168(final double n) {
        return !this.method4953() && !this.method1874();
    }
    
    @Override
    public int method4181() {
        return 8;
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.field2432.method33565(Class833.field4444, false);
    }
    
    private boolean method4953() {
        return this.field2432.method33568(Class833.field4444);
    }
    
    public void method4954(final boolean b) {
        this.field2432.method33569(Class833.field4444, b);
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        class51.method312("FromBucket", this.method4953());
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        this.method4954(class51.method329("FromBucket"));
    }
    
    @Override
    public void method4142() {
        super.method4142();
        this.field4114.method22062(0, new Class3607(this, 1.25));
        this.field4114.method22062(2, new Class3448<Object>(this, Class512.class, 8.0f, 1.6, 1.4, Class9170.field38850::test));
        this.field4114.method22062(4, new Class3516(this));
    }
    
    @Override
    public Class7746 method4143(final Class1847 class1847) {
        return new Class7752(this, class1847);
    }
    
    @Override
    public void method2729(final Class5487 class5487) {
        if (this.method2749() && this.method1706()) {
            this.method1724(0.01f, class5487);
            this.method1671(Class2160.field12826, this.method1935());
            this.method1936(this.method1935().method16748(0.9));
            if (this.method4152() == null) {
                this.method1936(this.method1935().method16744(0.0, -0.005, 0.0));
            }
        }
        else {
            super.method2729(class5487);
        }
    }
    
    @Override
    public void method2736() {
        if (!this.method1706()) {
            if (this.field2404) {
                if (this.field2406) {
                    this.method1936(this.method1935().method16744((this.field2423.nextFloat() * 2.0f - 1.0f) * 0.05f, 0.4000000059604645, (this.field2423.nextFloat() * 2.0f - 1.0f) * 0.05f));
                    this.field2404 = false;
                    this.field2448 = true;
                    this.method1695(this.method4958(), this.method2720(), this.method2721());
                }
            }
        }
        super.method2736();
    }
    
    @Override
    public boolean method4195(final Class512 class512, final Class316 class513) {
        final Class8321 method2715 = class512.method2715(class513);
        if (method2715.method27622() == Class7739.field31350 && this.method1768()) {
            this.method1695(Class8520.field35053, 1.0f, 1.0f);
            method2715.method27693(1);
            final Class8321 method2716 = this.method4956();
            this.method4955(method2716);
            if (!this.field2391.field10067) {
                Class7770.field31784.method13862((Class513)class512, method2716);
            }
            if (!method2715.method27620()) {
                if (!class512.field3006.method2362(method2716)) {
                    class512.method2822(method2716, false);
                }
            }
            else {
                class512.method2716(class513, method2716);
            }
            this.method1652();
            return true;
        }
        return super.method4195(class512, class513);
    }
    
    public void method4955(final Class8321 class8321) {
        if (this.method1874()) {
            class8321.method27665(this.method1873());
        }
    }
    
    public abstract Class8321 method4956();
    
    public boolean method4957() {
        return true;
    }
    
    public abstract Class7795 method4958();
    
    @Override
    public Class7795 method1686() {
        return Class8520.field35200;
    }
    
    static {
        field4444 = Class9184.method33564(Class833.class, Class7709.field30661);
    }
}
