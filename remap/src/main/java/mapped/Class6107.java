// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;

import net.minecraft.nbt.INBT;
import org.apache.commons.lang3.mutable.MutableBoolean;
import java.util.function.Supplier;
import java.util.List;
import java.util.function.Predicate;

public class Class6107 implements Class6102
{
    private static String[] field24768;
    private final Class51 field24769;
    private final Predicate<INBT> field24770;
    
    public Class6107(final Class51 field24769) {
        this.field24769 = field24769;
        this.field24770 = Class8258.method27412(field24769);
    }
    
    @Override
    public void method18197(final INBT class41, final List<INBT> list) {
        if (class41 instanceof Class52) {
            ((Class52)class41).stream().filter(this.field24770).forEach(list::add);
        }
    }
    
    @Override
    public void method18198(final INBT class41, final Supplier<INBT> supplier, final List<INBT> list) {
        final MutableBoolean mutableBoolean = new MutableBoolean();
        if (class41 instanceof Class52) {
            final Class52 class42 = (Class52)class41;
            class42.stream().filter(this.field24770).forEach(class43 -> {
                list2.add(class43);
                mutableBoolean2.setTrue();
                return;
            });
            if (mutableBoolean.isFalse()) {
                final Class51 method333 = this.field24769.method333();
                ((AbstractList<Class51>)class42).add(method333);
                list.add(method333);
            }
        }
    }
    
    @Override
    public INBT method18199() {
        return new Class52();
    }
    
    @Override
    public int method18200(final INBT class41, final Supplier<INBT> supplier) {
        int n = 0;
        if (class41 instanceof Class52) {
            final Class52 class42 = (Class52)class41;
            final int size = class42.size();
            if (size != 0) {
                for (int i = 0; i < size; ++i) {
                    final INBT value = class42.get(i);
                    if (this.field24770.test(value)) {
                        final INBT class43 = supplier.get();
                        if (!class43.equals(value)) {
                            if (class42.func_218659_a(i, class43)) {
                                ++n;
                            }
                        }
                    }
                }
            }
            else {
                class42.add(supplier.get());
                ++n;
            }
        }
        return n;
    }
    
    @Override
    public int method18201(final INBT class41) {
        int n = 0;
        if (class41 instanceof Class52) {
            final Class52 class42 = (Class52)class41;
            for (int i = class42.size() - 1; i >= 0; --i) {
                if (this.field24770.test(class42.get(i))) {
                    class42.remove(i);
                    ++n;
                }
            }
        }
        return n;
    }
}