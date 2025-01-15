// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Supplier;
import java.util.List;

public class Class6103 implements Class6102
{
    private static String[] field24758;
    private final int field24759;
    
    public Class6103(final int field24759) {
        this.field24759 = field24759;
    }
    
    @Override
    public void method18197(final Class41 class41, final List<Class41> list) {
        if (class41 instanceof Class38) {
            final Class38 class42 = (Class38)class41;
            final int size = class42.size();
            final int n = (this.field24759 >= 0) ? this.field24759 : (size + this.field24759);
            if (0 <= n) {
                if (n < size) {
                    list.add((Class41)class42.get(n));
                }
            }
        }
    }
    
    @Override
    public void method18198(final Class41 class41, final Supplier<Class41> supplier, final List<Class41> list) {
        this.method18197(class41, list);
    }
    
    @Override
    public Class41 method18199() {
        return new Class52();
    }
    
    @Override
    public int method18200(final Class41 class41, final Supplier<Class41> supplier) {
        if (class41 instanceof Class38) {
            final Class38 class42 = (Class38)class41;
            final int size = class42.size();
            final int n = (this.field24759 >= 0) ? this.field24759 : (size + this.field24759);
            if (0 <= n) {
                if (n < size) {
                    final Class41 obj = (Class41)class42.get(n);
                    final Class41 class43 = supplier.get();
                    if (!class43.equals(obj)) {
                        if (class42.method257(n, class43)) {
                            return 1;
                        }
                    }
                }
            }
        }
        return 0;
    }
    
    @Override
    public int method18201(final Class41 class41) {
        if (class41 instanceof Class38) {
            final Class38 class42 = (Class38)class41;
            final int size = class42.size();
            final int n = (this.field24759 >= 0) ? this.field24759 : (size + this.field24759);
            if (0 <= n) {
                if (n < size) {
                    class42.remove(n);
                    return 1;
                }
            }
        }
        return 0;
    }
}
