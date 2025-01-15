// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.Collection;
import java.util.List;

public class Class6101 implements Class6102
{
    private static String[] field24756;
    public static final Class6101 field24757;
    
    private Class6101() {
    }
    
    @Override
    public void method18197(final Class41 class41, final List<Class41> list) {
        if (class41 instanceof Class38) {
            list.addAll((Collection<? extends Class41>)class41);
        }
    }
    
    @Override
    public void method18198(final Class41 class41, final Supplier<Class41> supplier, final List<Class41> list) {
        if (class41 instanceof Class38) {
            final Class38 class42 = (Class38)class41;
            if (!class42.isEmpty()) {
                list.addAll(class42);
            }
            else {
                final Class41 class43 = supplier.get();
                if (class42.method258(0, class43)) {
                    list.add(class43);
                }
            }
        }
    }
    
    @Override
    public Class41 method18199() {
        return new Class52();
    }
    
    @Override
    public int method18200(final Class41 class41, final Supplier<Class41> supplier) {
        if (!(class41 instanceof Class38)) {
            return 0;
        }
        final Class38 class42 = (Class38)class41;
        final int size = class42.size();
        if (size == 0) {
            class42.method258(0, supplier.get());
            return 1;
        }
        final Class41 class43 = supplier.get();
        final int n = size - (int)class42.stream().filter(class43::equals).count();
        if (n == 0) {
            return 0;
        }
        class42.clear();
        if (class42.method258(0, class43)) {
            for (int i = 1; i < size; ++i) {
                class42.method258(i, supplier.get());
            }
            return n;
        }
        return 0;
    }
    
    @Override
    public int method18201(final Class41 class41) {
        if (class41 instanceof Class38) {
            final Class38 class42 = (Class38)class41;
            final int size = class42.size();
            if (size > 0) {
                class42.clear();
                return size;
            }
        }
        return 0;
    }
    
    static {
        field24757 = new Class6101();
    }
}
