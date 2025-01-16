// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.nbt.CollectionNBT;
import net.minecraft.nbt.INBT;

import java.util.function.Supplier;
import java.util.Collection;
import java.util.List;

public class Class6101 implements INode
{
    private static String[] field24756;
    public static final Class6101 field24757;
    
    private Class6101() {
    }
    
    @Override
    public void addMatchingElements(final INBT class41, final List<INBT> list) {
        if (class41 instanceof CollectionNBT) {
            list.addAll((Collection<? extends INBT>)class41);
        }
    }
    
    @Override
    public void func_218054_a(final INBT class41, final Supplier<INBT> supplier, final List<INBT> list) {
        if (class41 instanceof CollectionNBT) {
            final CollectionNBT class42 = (CollectionNBT)class41;
            if (!class42.isEmpty()) {
                list.addAll(class42);
            }
            else {
                final INBT class43 = supplier.get();
                if (class42.func_218660_b(0, class43)) {
                    list.add(class43);
                }
            }
        }
    }
    
    @Override
    public INBT createEmptyElement() {
        return new ListNBT();
    }
    
    @Override
    public int func_218051_a(final INBT class41, final Supplier<INBT> supplier) {
        if (!(class41 instanceof CollectionNBT)) {
            return 0;
        }
        final CollectionNBT class42 = (CollectionNBT)class41;
        final int size = class42.size();
        if (size == 0) {
            class42.func_218660_b(0, supplier.get());
            return 1;
        }
        final INBT class43 = supplier.get();
        final int n = size - (int)class42.stream().filter(class43::equals).count();
        if (n == 0) {
            return 0;
        }
        class42.clear();
        if (class42.func_218660_b(0, class43)) {
            for (int i = 1; i < size; ++i) {
                class42.func_218660_b(i, supplier.get());
            }
            return n;
        }
        return 0;
    }
    
    @Override
    public int func_218053_a(final INBT class41) {
        if (class41 instanceof CollectionNBT) {
            final CollectionNBT class42 = (CollectionNBT)class41;
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
