// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Supplier;
import java.util.List;
import java.util.function.Predicate;

public class Class6105 implements Class6102
{
    private static String[] field24762;
    private final String field24763;
    private final Class51 field24764;
    private final Predicate<Class41> field24765;
    
    public Class6105(final String field24763, final Class51 field24764) {
        this.field24763 = field24763;
        this.field24764 = field24764;
        this.field24765 = Class8258.method27412(field24764);
    }
    
    @Override
    public void method18197(final Class41 class41, final List<Class41> list) {
        if (class41 instanceof Class51) {
            final Class41 method313 = ((Class51)class41).method313(this.field24763);
            if (this.field24765.test(method313)) {
                list.add(method313);
            }
        }
    }
    
    @Override
    public void method18198(final Class41 class41, final Supplier<Class41> supplier, final List<Class41> list) {
        if (class41 instanceof Class51) {
            final Class51 class42 = (Class51)class41;
            final Class41 method313 = class42.method313(this.field24763);
            if (method313 != null) {
                if (this.field24765.test(method313)) {
                    list.add(method313);
                }
            }
            else {
                final Class51 method314 = this.field24764.method333();
                class42.method295(this.field24763, method314);
                list.add(method314);
            }
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
            final Class41 method313 = class42.method313(this.field24763);
            if (this.field24765.test(method313)) {
                final Class41 class43 = supplier.get();
                if (!class43.equals(method313)) {
                    class42.method295(this.field24763, class43);
                    return 1;
                }
            }
        }
        return 0;
    }
    
    @Override
    public int method18201(final Class41 class41) {
        if (class41 instanceof Class51) {
            final Class51 class42 = (Class51)class41;
            if (this.field24765.test(class42.method313(this.field24763))) {
                class42.method330(this.field24763);
                return 1;
            }
        }
        return 0;
    }
}
