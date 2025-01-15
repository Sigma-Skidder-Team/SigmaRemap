// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4065 extends Class3820
{
    private static String[] field18158;
    
    public Class4065(final Class8959 class8959) {
        super(class8959);
    }
    
    @Override
    public Class9355<ItemStack> method11695(final Class1847 class1847, final Class512 class1848, final Class316 class1849) {
        final ItemStack method2715 = class1848.method2715(class1849);
        if (!class1847.field10067) {
            if (class1848.method1805()) {
                if (class1848.method1920() instanceof Class801) {
                    final Class801 class1850 = (Class801)class1848.method1920();
                    if (method2715.method27634() - method2715.method27632() >= 7) {
                        if (class1850.method4627()) {
                            method2715.method27636(7, class1848, class1853 -> class1853.method2795(class1852));
                            if (!method2715.method27620()) {
                                return Class9355.method34674(method2715);
                            }
                            final ItemStack class1851 = new ItemStack(Class7739.field31376);
                            class1851.method27663(method2715.method27657());
                            return Class9355.method34674(class1851);
                        }
                    }
                }
            }
            class1848.method2859(Class8276.field33981.method8449(this));
            return Class9355.method34676(method2715);
        }
        return Class9355.method34676(method2715);
    }
}
