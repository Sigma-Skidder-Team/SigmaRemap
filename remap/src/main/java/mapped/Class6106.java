// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.nbt.INBT;

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
    public void method18197(final INBT class41, final List<INBT> list) {
        if (class41 instanceof Class51) {
            final INBT method313 = ((Class51)class41).method313(this.field24767);
            if (method313 != null) {
                list.add(method313);
            }
        }
    }
    
    @Override
    public void method18198(final INBT class41, final Supplier<INBT> supplier, final List<INBT> list) {
        if (class41 instanceof Class51) {
            final Class51 class42 = (Class51)class41;
            INBT method313;
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
    public INBT method18199() {
        return new Class51();
    }
    
    @Override
    public int method18200(final INBT class41, final Supplier<INBT> supplier) {
        if (class41 instanceof Class51) {
            final Class51 class42 = (Class51)class41;
            final INBT class43 = supplier.get();
            if (!class43.equals(class42.method295(this.field24767, class43))) {
                return 1;
            }
        }
        return 0;
    }
    
    @Override
    public int method18201(final INBT class41) {
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
