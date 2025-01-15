// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4080 extends Class3820
{
    public Class4080(final Class8959 class8959) {
        super(class8959);
        this.method11705(new Class1932("broken"), (class8321, class8322, class8323) -> method12285(class8321) ? 0.0f : 1.0f);
        Class3955.method12069(this, Class4055.field18147);
    }
    
    public static boolean method12285(final Class8321 class8321) {
        return class8321.method27632() < class8321.method27634() - 1;
    }
    
    @Override
    public boolean method11738(final Class8321 class8321, final Class8321 class8322) {
        return class8322.method27622() == Class7739.field31608;
    }
    
    @Override
    public Class9355<Class8321> method11695(final Class1847 class1847, final Class512 class1848, final Class316 class1849) {
        final Class8321 method2715 = class1848.method2715(class1849);
        final Class2215 method2716 = Class759.method4185(method2715);
        if (!class1848.method2718(method2716).method27620()) {
            return Class9355.method34677(method2715);
        }
        class1848.method1803(method2716, method2715.method27641());
        method2715.method27691(0);
        return Class9355.method34674(method2715);
    }
}
