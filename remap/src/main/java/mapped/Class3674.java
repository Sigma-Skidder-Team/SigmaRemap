// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.AbstractList;

public class Class3674 extends Class3666
{
    private static final Class120 field16959;
    private static final Class120 field16960;
    private static final Class120 field16961;
    
    public Class3674(final Class1932 class1932) {
        super(class1932);
    }
    
    public boolean method11301(final Class473 class473, final World class474) {
        int n = 0;
        int n2 = 0;
        for (int i = 0; i < class473.method2239(); ++i) {
            final ItemStack method2157 = class473.method2157(i);
            if (!method2157.method27620()) {
                if (!Class3674.field16959.test(method2157)) {
                    if (!Class3674.field16960.test(method2157)) {
                        if (!Class3674.field16961.test(method2157)) {
                            return false;
                        }
                    }
                    else if (++n2 > 3) {
                        return false;
                    }
                }
                else {
                    if (n != 0) {
                        return false;
                    }
                    n = 1;
                }
            }
        }
        return n != 0 && n2 >= 1;
    }
    
    public ItemStack method11303(final Class473 class473) {
        final ItemStack class474 = new ItemStack(Class7739.field31532, 3);
        final Class51 method27659 = class474.method27659("Fireworks");
        final Class52 class475 = new Class52();
        int n = 0;
        for (int i = 0; i < class473.method2239(); ++i) {
            final ItemStack method27660 = class473.method2157(i);
            if (!method27660.method27620()) {
                if (!Class3674.field16960.test(method27660)) {
                    if (Class3674.field16961.test(method27660)) {
                        final Class51 method27661 = method27660.method27660("Explosion");
                        if (method27661 != null) {
                            ((AbstractList<Class51>)class475).add(method27661);
                        }
                    }
                }
                else {
                    ++n;
                }
            }
        }
        method27659.method296("Flight", (byte)n);
        if (!class475.isEmpty()) {
            method27659.method295("Explosions", class475);
        }
        return class474;
    }
    
    @Override
    public boolean method11291(final int n, final int n2) {
        return n * n2 >= 2;
    }
    
    @Override
    public ItemStack method11292() {
        return new ItemStack(Class7739.field31532);
    }
    
    @Override
    public Class6096<?> method11299() {
        return Class6096.field24739;
    }
    
    static {
        field16959 = Class120.method618(Class7739.field31369);
        field16960 = Class120.method618(Class7739.field31308);
        field16961 = Class120.method618(Class7739.field31533);
    }
}
