// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.util.ArrayList;
import com.google.common.collect.Lists;

public class Class3670 extends Class3666
{
    private static String[] field16955;
    
    public Class3670(final Class1932 class1932) {
        super(class1932);
    }
    
    public boolean method11301(final Class473 class473, final Class1847 class474) {
        Class8321 field34174 = Class8321.field34174;
        final ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < class473.method2239(); ++i) {
            final Class8321 method2157 = class473.method2157(i);
            if (!method2157.method27620()) {
                if (!(method2157.method27622() instanceof Class4053)) {
                    if (!(method2157.method27622() instanceof Class3829)) {
                        return false;
                    }
                    arrayList.add(method2157);
                }
                else {
                    if (!field34174.method27620()) {
                        return false;
                    }
                    field34174 = method2157;
                }
            }
        }
        return !field34174.method27620() && !arrayList.isEmpty();
    }
    
    public Class8321 method11303(final Class473 class473) {
        final ArrayList arrayList = Lists.newArrayList();
        Class8321 class474 = Class8321.field34174;
        for (int i = 0; i < class473.method2239(); ++i) {
            final Class8321 method2157 = class473.method2157(i);
            if (!method2157.method27620()) {
                final Class3820 method2158 = method2157.method27622();
                if (!(method2158 instanceof Class4053)) {
                    if (!(method2158 instanceof Class3829)) {
                        return Class8321.field34174;
                    }
                    arrayList.add(method2158);
                }
                else {
                    if (!class474.method27620()) {
                        return Class8321.field34174;
                    }
                    class474 = method2157.method27641();
                }
            }
        }
        return (!class474.method27620() && !arrayList.isEmpty()) ? Class4053.method12255(class474, arrayList) : Class8321.field34174;
    }
    
    @Override
    public boolean method11291(final int n, final int n2) {
        return n * n2 >= 2;
    }
    
    @Override
    public Class6096<?> method11299() {
        return Class6096.field24735;
    }
}
