// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3842 extends Class3841 implements Class3843
{
    private static String[] field17452;
    
    public Class3842(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public Class181 method11900() {
        return Class181.field537;
    }
    
    @Override
    public Class436 method11898(final Class1855 class1855) {
        return new Class490();
    }
    
    @Override
    public Class2201 method11844(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final Class512 class7099, final Class316 class7100, final Class7005 class7101) {
        if (!class7097.field10067) {
            final Class436 method6727 = class7097.method6727(class7098);
            if (method6727 instanceof Class490) {
                class7099.method2833((Class434)method6727);
                class7099.method2857(Class8276.field34030);
            }
            return Class2201.field13400;
        }
        return Class2201.field13400;
    }
    
    @Override
    public boolean method11793(final Class7096 class7096, final Class1855 class7097, final Class354 class7098) {
        return false;
    }
    
    @Override
    public Class2115 method11797(final Class7096 class7096) {
        return Class2115.field12307;
    }
    
    @Override
    public void method11853(final Class1847 class1847, final Class354 class1848, final Class7096 class1849, final Class511 class1850, final Class8321 class1851) {
        if (class1851.method27667()) {
            final Class436 method6727 = class1847.method6727(class1848);
            if (method6727 instanceof Class490) {
                ((Class490)method6727).method2453(class1851.method27664());
            }
        }
    }
}
