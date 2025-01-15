// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import com.google.common.collect.Lists;

public class Class3675 extends Class3666
{
    private static String[] field16962;
    
    public Class3675(final Class1932 class1932) {
        super(class1932);
    }
    
    public boolean method11301(final Class473 class473, final Class1847 class474) {
        final ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < class473.method2239(); ++i) {
            final Class8321 method2157 = class473.method2157(i);
            if (!method2157.method27620()) {
                arrayList.add(method2157);
                if (arrayList.size() > 1) {
                    final Class8321 class475 = (Class8321)arrayList.get(0);
                    if (method2157.method27622() == class475.method27622()) {
                        if (class475.method27690() == 1) {
                            if (method2157.method27690() == 1) {
                                if (class475.method27622().method11710()) {
                                    continue;
                                }
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return arrayList.size() == 2;
    }
    
    public Class8321 method11303(final Class473 class473) {
        final ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < class473.method2239(); ++i) {
            final Class8321 method2157 = class473.method2157(i);
            if (!method2157.method27620()) {
                arrayList.add(method2157);
                if (arrayList.size() > 1) {
                    final Class8321 class474 = (Class8321)arrayList.get(0);
                    if (method2157.method27622() == class474.method27622()) {
                        if (class474.method27690() == 1) {
                            if (method2157.method27690() == 1) {
                                if (class474.method27622().method11710()) {
                                    continue;
                                }
                            }
                        }
                    }
                    return Class8321.field34174;
                }
            }
        }
        if (arrayList.size() == 2) {
            final Class8321 class475 = (Class8321)arrayList.get(0);
            final Class8321 class476 = (Class8321)arrayList.get(1);
            if (class475.method27622() == class476.method27622()) {
                if (class475.method27690() == 1) {
                    if (class476.method27690() == 1) {
                        if (class475.method27622().method11710()) {
                            final Class3820 method2158 = class475.method27622();
                            int n = method2158.method11709() - (method2158.method11709() - class475.method27632() + (method2158.method11709() - class476.method27632()) + method2158.method11709() * 5 / 100);
                            if (n < 0) {
                                n = 0;
                            }
                            final Class8321 class477 = new Class8321(class475.method27622());
                            class477.method27633(n);
                            return class477;
                        }
                    }
                }
            }
        }
        return Class8321.field34174;
    }
    
    @Override
    public boolean method11291(final int n, final int n2) {
        return n * n2 >= 2;
    }
    
    @Override
    public Class6096<?> method11299() {
        return Class6096.field24747;
    }
}
