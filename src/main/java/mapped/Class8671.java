// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.Iterator;

public class Class8671
{
    private static String[] field36452;
    private boolean field36453;
    private Class2073 field36454;
    private int field36455;
    private int field36456;
    private int field36457;
    private int field36458;
    private int field36459;
    
    public Class8671() {
        this.field36454 = Class2073.field11961;
    }
    
    public int method29680(final Class1849 class1849, final boolean b, final boolean b2) {
        if (class1849.method6703() || !b) {
            this.field36454 = Class2073.field11961;
            this.field36453 = false;
            return 0;
        }
        if (class1849.method6952(0.0f) == 0.5) {
            this.field36454 = ((class1849.field10062.nextInt(10) != 0) ? Class2073.field11961 : Class2073.field11960);
        }
        if (this.field36454 == Class2073.field11961) {
            return 0;
        }
        if (!this.field36453) {
            if (!this.method29681(class1849)) {
                return 0;
            }
            this.field36453 = true;
        }
        if (this.field36456 <= 0) {
            this.field36456 = 2;
            if (this.field36455 <= 0) {
                this.field36454 = Class2073.field11961;
            }
            else {
                this.method29682(class1849);
                --this.field36455;
            }
            return 1;
        }
        --this.field36456;
        return 0;
    }
    
    private boolean method29681(final Class1849 class1849) {
        for (final Class512 class1850 : class1849.method6840()) {
            if (class1850.method1639()) {
                continue;
            }
            final Class354 method1894 = class1850.method1894();
            if (!class1849.method6922(method1894)) {
                continue;
            }
            if (class1849.method6959(method1894).method9870() == Class2140.field12600) {
                continue;
            }
            for (int i = 0; i < 10; ++i) {
                final float n = class1849.field10062.nextFloat() * 6.2831855f;
                this.field36457 = method1894.method1074() + Class9546.method35642(Class9546.method35639(n) * 32.0f);
                this.field36458 = method1894.method1075();
                this.field36459 = method1894.method1076() + Class9546.method35642(Class9546.method35638(n) * 32.0f);
                if (this.method29683(class1849, new Class354(this.field36457, this.field36458, this.field36459)) != null) {
                    this.field36456 = 0;
                    this.field36455 = 20;
                    break;
                }
            }
            return true;
        }
        return false;
    }
    
    private void method29682(final Class1849 class1849) {
        final Class5487 method29683 = this.method29683(class1849, new Class354(this.field36457, this.field36458, this.field36459));
        if (method29683 != null) {
            Class827 class1850;
            try {
                class1850 = new Class827(class1849);
                class1850.method4188(class1849, class1849.method6784(new Class354(class1850)), Class2101.field12181, null, null);
            }
            catch (final Exception ex) {
                ex.printStackTrace();
                return;
            }
            class1850.method1730(method29683.field22770, method29683.field22771, method29683.field22772, class1849.field10062.nextFloat() * 360.0f, 0.0f);
            class1849.method6886(class1850);
        }
    }
    
    @Nullable
    private Class5487 method29683(final Class1849 class1849, final Class354 class1850) {
        for (int i = 0; i < 10; ++i) {
            final int n = class1850.method1074() + class1849.field10062.nextInt(16) - 8;
            final int n2 = class1850.method1076() + class1849.field10062.nextInt(16) - 8;
            final Class354 class1851 = new Class354(n, class1849.method6699(Class2020.field11522, n, n2), n2);
            if (class1849.method6922(class1851) && Class763.method4230(Class7499.field29052, class1849, Class2101.field12181, class1851, class1849.field10062)) {
                return new Class5487(class1851.method1074() + 0.5, class1851.method1075(), class1851.method1076() + 0.5);
            }
        }
        return null;
    }
}
