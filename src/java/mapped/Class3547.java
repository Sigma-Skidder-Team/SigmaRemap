// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.EnumSet;

public class Class3547 extends Class3545
{
    private static String[] field16614;
    private static final Class7843 field16615;
    private boolean field16616;
    private int field16617;
    private final Class<?>[] field16618;
    private Class<?>[] field16619;
    
    public Class3547(final Class787 class787, final Class<?>... field16618) {
        super(class787, true);
        this.field16618 = field16618;
        this.method11019(EnumSet.of(Class2139.field12583));
    }
    
    @Override
    public boolean method11013() {
        final int method2635 = this.field16602.method2635();
        final Class511 method2636 = this.field16602.method2634();
        if (method2635 != this.field16617 && method2636 != null) {
            final Class<?>[] field16618 = this.field16618;
            for (int length = field16618.length, i = 0; i < length; ++i) {
                if (field16618[i].isAssignableFrom(method2636.getClass())) {
                    return false;
                }
            }
            return this.method11097(method2636, Class3547.field16615);
        }
        return false;
    }
    
    public Class3547 method11100(final Class<?>... field16619) {
        this.field16616 = true;
        this.field16619 = field16619;
        return this;
    }
    
    @Override
    public void method11015() {
        this.field16602.method4153(this.field16602.method2634());
        this.field16608 = this.field16602.method4152();
        this.field16617 = this.field16602.method2635();
        this.field16609 = 300;
        if (this.field16616) {
            this.method11101();
        }
        super.method11015();
    }
    
    public void method11101() {
        final double method11096 = this.method11096();
        for (final Class759 class759 : this.field16602.field2391.method7129(this.field16602.getClass(), new Class6221(this.field16602.method1938(), this.field16602.method1941(), this.field16602.method1945(), this.field16602.method1938() + 1.0, this.field16602.method1941() + 1.0, this.field16602.method1945() + 1.0).method18495(method11096, 10.0, method11096))) {
            if (this.field16602 == class759) {
                continue;
            }
            if (class759.method4152() != null) {
                continue;
            }
            if (this.field16602 instanceof Class794 && ((Class794)this.field16602).method4488() != ((Class794)class759).method4488()) {
                continue;
            }
            if (class759.method1826(this.field16602.method2634())) {
                continue;
            }
            if (this.field16619 != null) {
                int n = 0;
                final Class<?>[] field16619 = this.field16619;
                for (int length = field16619.length, i = 0; i < length; ++i) {
                    if (((Class794)class759).getClass() == field16619[i]) {
                        n = 1;
                        break;
                    }
                }
                if (n != 0) {
                    continue;
                }
            }
            this.method11102(class759, this.field16602.method2634());
        }
    }
    
    public void method11102(final Class759 class759, final Class511 class760) {
        class759.method4153(class760);
    }
    
    static {
        field16615 = new Class7843().method25340().method25342();
    }
}
