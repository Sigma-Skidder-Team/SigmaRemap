// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Supplier;
import java.util.List;

public class Class6106 implements Class6102
{
    private static String[] field24766;
    private final String field24767;
    
    public Class6106(final String field24767) {
        this.field24767 = field24767;
    }
    
    @Override
    public void method18197(final Class41 class41, final List<Class41> list) {
        if (class41 instanceof Class51) {
            final Class41 method313 = ((Class51)class41).method313(this.field24767);
            if (method313 != null) {
                list.add(method313);
            }
        }
    }
    
    @Override
    public void method18198(final Class41 class41, final Supplier<Class41> supplier, final List<Class41> list) {
        if (class41 instanceof Class51) {
            final Class51 class42 = (Class51)class41;
            Class41 method313;
            if (!class42.method315(this.field24767)) {
                method313 = supplier.get();
                class42.method295(this.field24767, method313);
            }
            else {
                method313 = class42.method313(this.field24767);
            }
            list.add(method313);
        }
    }
    
    @Override
    public Class41 method18199() {
        return new Class51();
    }
    
    @Override
    public int method18200(final Class41 class41, final Supplier<Class41> supplier) {
        if (class41 instanceof Class51) {
            final Class51 class42 = (Class51)class41;
            final Class41 class43 = supplier.get();
            if (!class43.equals(class42.method295(this.field24767, class43))) {
                return 1;
            }
        }
        return 0;
    }
    
    @Override
    public int method18201(final Class41 class41) {
        if (class41 instanceof Class51) {
            final Class51 class42 = (Class51)class41;
            if (class42.method315(this.field24767)) {
                class42.method330(this.field24767);
                return 1;
            }
        }
        return 0;
    }
}
