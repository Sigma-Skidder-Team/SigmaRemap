// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.Iterator;
import java.util.List;

public class Class495 extends Class436 implements Class439
{
    private static String[] field2841;
    private long field2842;
    public int field2843;
    public boolean field2844;
    public Class179 field2845;
    private List<Class511> field2846;
    private boolean field2847;
    private int field2848;
    
    public Class495() {
        super(Class5412.field22570);
    }
    
    @Override
    public boolean method2200(final int n, final int n2) {
        if (n != 1) {
            return super.method2200(n, n2);
        }
        this.method2512();
        this.field2848 = 0;
        this.field2845 = Class179.method792(n2);
        this.field2843 = 0;
        return this.field2844 = true;
    }
    
    @Override
    public void method2229() {
        if (this.field2844) {
            ++this.field2843;
        }
        if (this.field2843 >= 50) {
            this.field2844 = false;
            this.field2843 = 0;
        }
        if (this.field2843 >= 5) {
            if (this.field2848 == 0) {
                if (this.method2513()) {
                    this.field2847 = true;
                    this.method2510();
                }
            }
        }
        if (this.field2847) {
            if (this.field2848 >= 40) {
                this.method2514(this.field2656);
                this.method2515(this.field2656);
                this.field2847 = false;
            }
            else {
                ++this.field2848;
            }
        }
    }
    
    private void method2510() {
        this.field2656.method6705(null, this.method2193(), Class8520.field35026, Class286.field1582, 1.0f, 1.0f);
    }
    
    public void method2511(final Class179 field2845) {
        final Class354 method2193 = this.method2193();
        this.field2845 = field2845;
        if (!this.field2844) {
            this.field2844 = true;
        }
        else {
            this.field2843 = 0;
        }
        this.field2656.method6763(method2193, this.method2194().method21696(), 1, field2845.method779());
    }
    
    private void method2512() {
        final Class354 method2193 = this.method2193();
        if (this.field2656.method6754() > this.field2842 + 60L || this.field2846 == null) {
            this.field2842 = this.field2656.method6754();
            this.field2846 = (List<Class511>)this.field2656.method7128((Class<? extends Class399>)Class511.class, new Class6221(method2193).method18496(48.0));
        }
        if (!this.field2656.field10067) {
            for (final Class511 class511 : this.field2846) {
                if (!class511.method1768()) {
                    continue;
                }
                if (class511.field2410) {
                    continue;
                }
                if (!method2193.method1082(class511.method1934(), 32.0)) {
                    continue;
                }
                class511.method2618().method1196(Class8233.field33821, this.field2656.method6754());
            }
        }
    }
    
    private boolean method2513() {
        final Class354 method2193 = this.method2193();
        for (final Class511 class511 : this.field2846) {
            if (!class511.method1768()) {
                continue;
            }
            if (class511.field2410) {
                continue;
            }
            if (!method2193.method1082(class511.method1934(), 32.0)) {
                continue;
            }
            if (!class511.method1642().method23383(Class8039.field33100)) {
                continue;
            }
            return true;
        }
        return false;
    }
    
    private void method2514(final Class1847 class1847) {
        if (!class1847.field10067) {
            this.field2846.stream().filter((Predicate<? super Object>)this::method2516).forEach((Consumer<? super Object>)this::method2517);
        }
    }
    
    private void method2515(final Class1847 class1847) {
        if (class1847.field10067) {
            this.method2193();
            this.field2846.stream().filter((Predicate<? super Object>)this::method2516).forEach(class1850 -> {
                final Object o = (int)this.field2846.stream().filter(p1 -> {}).count();
                final Object o2 = new AtomicInteger(16700985);
                Class9546.method35641((class1850.method1938() - class1848.method1074()) * (class1850.method1938() - class1848.method1074()) + (class1850.method1945() - class1848.method1076()) * (class1850.method1945() - class1848.method1076()));
                final float n3;
                final double n2 = class1848.method1074() + 0.5f + 1.0f / n3 * (class1850.method1938() - class1848.method1074());
                final double n4 = class1848.method1076() + 0.5f + 1.0f / n3 * (class1850.method1945() - class1848.method1076());
                Class9546.method35651((n - 21) / -2, 3, 15);
                int i = 0;
                final int n5;
                while (i < n5) {
                    atomicInteger.addAndGet(5);
                    class1849.method6709(Class8432.field34617, n2, class1848.method1075() + 0.5f, n4, (atomicInteger.get() >> 16 & 0xFF) / 255.0, (atomicInteger.get() >> 8 & 0xFF) / 255.0, (atomicInteger.get() & 0xFF) / 255.0);
                    ++i;
                }
            });
        }
    }
    
    private boolean method2516(final Class511 class511) {
        if (class511.method1768()) {
            if (!class511.field2410) {
                if (this.method2193().method1082(class511.method1934(), 48.0)) {
                    if (class511.method1642().method23383(Class8039.field33100)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    private void method2517(final Class511 class511) {
        class511.method2655(new Class1948(Class9439.field40497, 60));
    }
}
