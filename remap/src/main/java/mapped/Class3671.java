// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;

import com.google.common.collect.Lists;

public class Class3671 extends Class3666
{
    private static final Class120 field16956;
    
    public Class3671(final Class1932 class1932) {
        super(class1932);
    }
    
    public boolean method11301(final Class473 class473, final Class1847 class474) {
        boolean b = false;
        int n = 0;
        for (int i = 0; i < class473.method2239(); ++i) {
            final ItemStack method2157 = class473.method2157(i);
            if (!method2157.method27620()) {
                if (!(method2157.method27622() instanceof Class3829)) {
                    if (!Class3671.field16956.test(method2157)) {
                        return false;
                    }
                    if (n != 0) {
                        return false;
                    }
                    n = 1;
                }
                else {
                    b = true;
                }
            }
        }
        return n != 0 && b;
    }
    
    public ItemStack method11303(final Class473 class473) {
        final ArrayList arrayList = Lists.newArrayList();
        ItemStack method27641 = null;
        for (int i = 0; i < class473.method2239(); ++i) {
            final ItemStack method27642 = class473.method2157(i);
            final Class3820 method27643 = method27642.method27622();
            if (!(method27643 instanceof Class3829)) {
                if (Class3671.field16956.test(method27642)) {
                    method27641 = method27642.method27641();
                    method27641.method27691(1);
                }
            }
            else {
                arrayList.add(((Class3829)method27643).method11767().method817());
            }
        }
        if (method27641 != null && !arrayList.isEmpty()) {
            method27641.method27659("Explosion").method309("FadeColors", arrayList);
            return method27641;
        }
        return ItemStack.field34174;
    }
    
    @Override
    public boolean method11291(final int n, final int n2) {
        return n * n2 >= 2;
    }
    
    @Override
    public Class6096<?> method11299() {
        return Class6096.field24741;
    }
    
    static {
        field16956 = Class120.method618(Class7739.field31533);
    }
}
