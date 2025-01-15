// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Iterator;

public class Class450 implements Class446
{
    private static String[] field2690;
    private final Class822 field2691;
    private final Class2265<Class8321> field2692;
    private Class9017 field2693;
    private int field2694;
    private int field2695;
    
    public Class450(final Class822 field2691) {
        this.field2692 = Class2265.method8507(3, Class8321.field34174);
        this.field2691 = field2691;
    }
    
    @Override
    public int method2239() {
        return this.field2692.size();
    }
    
    @Override
    public boolean method2156() {
        final Iterator<Object> iterator = this.field2692.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().method27620()) {
                continue;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public Class8321 method2157(final int n) {
        return this.field2692.get(n);
    }
    
    @Override
    public Class8321 method2158(final int n, final int n2) {
        final Class8321 class8321 = this.field2692.get(n);
        if (n == 2 && !class8321.method27620()) {
            return Class8508.method28422(this.field2692, n, class8321.method27690());
        }
        final Class8321 method28422 = Class8508.method28422(this.field2692, n, n2);
        if (!method28422.method27620()) {
            if (this.method2279(n)) {
                this.method2280();
            }
        }
        return method28422;
    }
    
    private boolean method2279(final int n) {
        return n == 0 || n == 1;
    }
    
    @Override
    public Class8321 method2159(final int n) {
        return Class8508.method28423(this.field2692, n);
    }
    
    @Override
    public void method2160(final int n, final Class8321 class8321) {
        this.field2692.set(n, class8321);
        if (!class8321.method27620()) {
            if (class8321.method27690() > this.method2254()) {
                class8321.method27691(this.method2254());
            }
        }
        if (this.method2279(n)) {
            this.method2280();
        }
    }
    
    @Override
    public boolean method2162(final Class512 class512) {
        return this.field2691.method4823() == class512;
    }
    
    @Override
    public void method2161() {
        this.method2280();
    }
    
    public void method2280() {
        this.field2693 = null;
        Class8321 class8321;
        Class8321 field34174;
        if (!this.field2692.get(0).method27620()) {
            class8321 = this.field2692.get(0);
            field34174 = this.field2692.get(1);
        }
        else {
            class8321 = this.field2692.get(1);
            field34174 = Class8321.field34174;
        }
        if (!class8321.method27620()) {
            final Class57 method4825 = this.field2691.method4825();
            if (!method4825.isEmpty()) {
                Class9017 class8322 = method4825.method359(class8321, field34174, this.field2694);
                if (class8322 == null || class8322.method32297()) {
                    this.field2693 = class8322;
                    class8322 = method4825.method359(field34174, class8321, this.field2694);
                }
                if (class8322 != null && !class8322.method32297()) {
                    this.field2693 = class8322;
                    this.method2160(2, class8322.method32285());
                    this.field2695 = class8322.method32296();
                }
                else {
                    this.method2160(2, Class8321.field34174);
                    this.field2695 = 0;
                }
            }
            this.field2691.method4831(this.method2157(2));
        }
        else {
            this.method2160(2, Class8321.field34174);
            this.field2695 = 0;
        }
    }
    
    @Nullable
    public Class9017 method2281() {
        return this.field2693;
    }
    
    public void method2282(final int field2694) {
        this.field2694 = field2694;
        this.method2280();
    }
    
    @Override
    public void method2164() {
        this.field2692.clear();
    }
    
    public int method2283() {
        return this.field2695;
    }
}
