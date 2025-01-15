// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3673 extends Class3666
{
    private static String[] field16958;
    
    public Class3673(final Class1932 class1932) {
        super(class1932);
    }
    
    public boolean method11301(final Class473 class473, final Class1847 class474) {
        int n = 0;
        int n2 = 0;
        for (int i = 0; i < class473.method2239(); ++i) {
            final ItemStack method2157 = class473.method2157(i);
            if (!method2157.method27620()) {
                if (!(Class3833.method11776(method2157.method27622()) instanceof Class3942)) {
                    if (!(method2157.method27622() instanceof Class3829)) {
                        return false;
                    }
                    ++n2;
                }
                else {
                    ++n;
                }
                if (n2 > 1 || n > 1) {
                    return false;
                }
            }
        }
        return n == 1 && n2 == 1;
    }
    
    public ItemStack method11303(final Class473 class473) {
        ItemStack field34174 = ItemStack.field34174;
        Class3829 class474 = (Class3829)Class7739.field31404;
        for (int i = 0; i < class473.method2239(); ++i) {
            final ItemStack method2157 = class473.method2157(i);
            if (!method2157.method27620()) {
                final Class3820 method2158 = method2157.method27622();
                if (!(Class3833.method11776(method2158) instanceof Class3942)) {
                    if (method2158 instanceof Class3829) {
                        class474 = (Class3829)method2158;
                    }
                }
                else {
                    field34174 = method2157;
                }
            }
        }
        final ItemStack method2159 = Class3942.method12061(class474.method11767());
        if (field34174.method27656()) {
            method2159.method27663(field34174.method27657().method333());
        }
        return method2159;
    }
    
    @Override
    public boolean method11291(final int n, final int n2) {
        return n * n2 >= 2;
    }
    
    @Override
    public Class6096<?> method11299() {
        return Class6096.field24745;
    }
}
