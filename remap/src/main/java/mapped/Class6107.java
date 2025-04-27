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

public class Class6107 implements INode
{
    private static String[] field24768;
    private final CompoundNBT field24769;
    private final Predicate<INBT> field24770;
    
    public Class6107(final CompoundNBT field24769) {
        this.field24769 = field24769;
        this.field24770 = NBTPathArgument.method27412(field24769);
    }
    
    @Override
    public void addMatchingElements(final INBT class41, final List<INBT> list) {
        if (class41 instanceof ListNBT) {
            ((ListNBT)class41).stream().filter(this.field24770).forEach(list::add);
        }
    }
    
    @Override
    public void func_218054_a(final INBT class41, final Supplier<INBT> supplier, final List<INBT> list) {
        final MutableBoolean mutableBoolean = new MutableBoolean();
        if (class41 instanceof ListNBT) {
            final ListNBT class42 = (ListNBT)class41;
            class42.stream().filter(this.field24770).forEach(class43 -> {
                list2.add(class43);
                mutableBoolean2.setTrue();
            });
            if (mutableBoolean.isFalse()) {
                final CompoundNBT method333 = this.field24769.copy();
                class42.add(method333);
                list.add(method333);
            }
        }
    }
    
    @Override
    public INBT createEmptyElement() {
        return new ListNBT();
    }
    
    @Override
    public int func_218051_a(final INBT class41, final Supplier<INBT> supplier) {
        int n = 0;
        if (class41 instanceof ListNBT) {
            final ListNBT class42 = (ListNBT)class41;
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
    public int func_218053_a(final INBT class41) {
        int n = 0;
        if (class41 instanceof ListNBT) {
            final ListNBT class42 = (ListNBT)class41;
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
