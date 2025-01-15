// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3976 extends Class3833
{
    private static String[] field17964;
    public static final Class7113 field17965;
    
    public Class3976(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)this.method11878()).method21773((Class7111<Comparable>)Class3976.field17965, false));
    }
    
    @Override
    public void method11828(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final Class7096 class7099, final boolean b) {
        if (class7099.method21696() != class7096.method21696()) {
            if (class7097.method6749(class7098)) {
                method12118(class7097, class7098);
                class7097.method6690(class7098, false);
            }
        }
    }
    
    @Override
    public void method11825(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final Class3833 class7099, final Class354 class7100, final boolean b) {
        if (class7097.method6749(class7098)) {
            method12118(class7097, class7098);
            class7097.method6690(class7098, false);
        }
    }
    
    @Override
    public void method11870(final Class1847 class1847, final Class354 class1848, final Class7096 class1849, final Class512 class1850) {
        if (!class1847.method6678()) {
            if (!class1850.method2889()) {
                if (class1849.method21772((Class7111<Boolean>)Class3976.field17965)) {
                    method12118(class1847, class1848);
                }
            }
        }
        super.method11870(class1847, class1848, class1849, class1850);
    }
    
    @Override
    public void method11842(final Class1847 class1847, final Class354 class1848, final Class6154 class1849) {
        if (!class1847.field10067) {
            final Class510 class1850 = new Class510(class1847, class1848.method1074() + 0.5f, class1848.method1075(), class1848.method1076() + 0.5f, class1849.method18414());
            class1850.method2615((short)(class1847.field10062.nextInt(class1850.method2617() / 4) + class1850.method2617() / 8));
            class1847.method6886(class1850);
        }
    }
    
    public static void method12118(final Class1847 class1847, final Class354 class1848) {
        method12119(class1847, class1848, null);
    }
    
    private static void method12119(final Class1847 class1847, final Class354 class1848, final Class511 class1849) {
        if (!class1847.field10067) {
            final Class510 class1850 = new Class510(class1847, class1848.method1074() + 0.5, class1848.method1075(), class1848.method1076() + 0.5, class1849);
            class1847.method6886(class1850);
            class1847.method6706(null, class1850.method1938(), class1850.method1941(), class1850.method1945(), Class8520.field35632, Class286.field1582, 1.0f, 1.0f);
        }
    }
    
    @Override
    public Class2201 method11844(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final Class512 class7099, final Class316 class7100, final Class7005 class7101) {
        final Class8321 method2715 = class7099.method2715(class7100);
        final Class3820 method2716 = method2715.method27622();
        if (method2716 != Class7739.field31277 && method2716 != Class7739.field31511) {
            return super.method11844(class7096, class7097, class7098, class7099, class7100, class7101);
        }
        method12119(class7097, class7098, class7099);
        class7097.method6688(class7098, Class7521.field29147.method11878(), 11);
        if (!class7099.method2889()) {
            if (method2716 != Class7739.field31277) {
                method2715.method27693(1);
            }
            else {
                method2715.method27636(1, class7099, class7103 -> class7103.method2795(class7102));
            }
        }
        return Class2201.field13400;
    }
    
    @Override
    public void method11869(final Class1847 class1847, final Class7096 class1848, final Class7005 class1849, final Class399 class1850) {
        if (!class1847.field10067) {
            if (class1850 instanceof Class402) {
                final Class402 class1851 = (Class402)class1850;
                final Class399 method1973 = class1851.method1973();
                if (class1851.method1804()) {
                    final Class354 method1974 = class1849.method21447();
                    method12119(class1847, method1974, (method1973 instanceof Class511) ? ((Class511)method1973) : null);
                    class1847.method6690(method1974, false);
                }
            }
        }
    }
    
    @Override
    public boolean method11872(final Class6154 class6154) {
        return false;
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3976.field17965);
    }
    
    static {
        field17965 = Class8970.field37746;
    }
}
