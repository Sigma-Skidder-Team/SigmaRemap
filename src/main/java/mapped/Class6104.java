// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.Supplier;
import java.util.List;
import java.util.function.Predicate;

public class Class6104 implements Class6102
{
    private static String[] field24760;
    private final Predicate<Class41> field24761;
    
    public Class6104(final Class51 class51) {
        this.field24761 = Class8258.method27412(class51);
    }
    
    @Override
    public void method18197(final Class41 class41, final List<Class41> list) {
        if (class41 instanceof Class51) {
            if (this.field24761.test(class41)) {
                list.add(class41);
            }
        }
    }
    
    @Override
    public void method18198(final Class41 class41, final Supplier<Class41> supplier, final List<Class41> list) {
        this.method18197(class41, list);
    }
    
    @Override
    public Class41 method18199() {
        return new Class51();
    }
    
    @Override
    public int method18200(final Class41 class41, final Supplier<Class41> supplier) {
        return 0;
    }
    
    @Override
    public int method18201(final Class41 class41) {
        return 0;
    }
}
