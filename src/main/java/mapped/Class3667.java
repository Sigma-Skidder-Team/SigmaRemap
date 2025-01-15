// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3667 extends Class3666
{
    public Class3667(final Class1932 class1932) {
        super(class1932);
    }
    
    public boolean method11301(final Class473 class473, final Class1847 class474) {
        Class8321 field34174 = Class8321.field34174;
        Class8321 field34175 = Class8321.field34174;
        for (int i = 0; i < class473.method2239(); ++i) {
            final Class8321 method2157 = class473.method2157(i);
            if (!method2157.method27620()) {
                if (!(method2157.method27622() instanceof Class4044)) {
                    if (method2157.method27622() != Class7739.field31583) {
                        return false;
                    }
                    if (!field34174.method27620()) {
                        return false;
                    }
                    if (method2157.method27660("BlockEntityTag") != null) {
                        return false;
                    }
                    field34174 = method2157;
                }
                else {
                    if (!field34175.method27620()) {
                        return false;
                    }
                    field34175 = method2157;
                }
            }
        }
        return !field34174.method27620() && !field34175.method27620();
    }
    
    public Class8321 method11303(final Class473 class473) {
        Class8321 field34174 = Class8321.field34174;
        Class8321 class474 = Class8321.field34174;
        for (int i = 0; i < class473.method2239(); ++i) {
            final Class8321 method2157 = class473.method2157(i);
            if (!method2157.method27620()) {
                if (!(method2157.method27622() instanceof Class4044)) {
                    if (method2157.method27622() == Class7739.field31583) {
                        class474 = method2157.method27641();
                    }
                }
                else {
                    field34174 = method2157;
                }
            }
        }
        if (!class474.method27620()) {
            final Class51 method2158 = field34174.method27660("BlockEntityTag");
            final Class51 class475 = (method2158 != null) ? method2158.method333() : new Class51();
            class475.method298("Base", ((Class4044)field34174.method27622()).method12244().method813());
            class474.method27676("BlockEntityTag", class475);
            return class474;
        }
        return class474;
    }
    
    @Override
    public boolean method11291(final int n, final int n2) {
        return n * n2 >= 2;
    }
    
    @Override
    public Class6096<?> method11299() {
        return Class6096.field24744;
    }
}
