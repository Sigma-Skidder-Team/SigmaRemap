// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.nbt.CollectionNBT;
import net.minecraft.nbt.INBT;

import java.util.function.Supplier;
import java.util.List;

public class Class6103 implements INode
{
    private static String[] field24758;
    private final int field24759;
    
    public Class6103(final int field24759) {
        this.field24759 = field24759;
    }
    
    @Override
    public void addMatchingElements(final INBT class41, final List<INBT> list) {
        if (class41 instanceof CollectionNBT) {
            final CollectionNBT class42 = (CollectionNBT)class41;
            final int size = class42.size();
            final int n = (this.field24759 >= 0) ? this.field24759 : (size + this.field24759);
            if (0 <= n) {
                if (n < size) {
                    list.add((INBT)class42.get(n));
                }
            }
        }
    }
    
    @Override
    public void func_218054_a(final INBT class41, final Supplier<INBT> supplier, final List<INBT> list) {
        this.addMatchingElements(class41, list);
    }
    
    @Override
    public INBT createEmptyElement() {
        return new ListNBT();
    }
    
    @Override
    public int func_218051_a(final INBT class41, final Supplier<INBT> supplier) {
        if (class41 instanceof CollectionNBT) {
            final CollectionNBT class42 = (CollectionNBT)class41;
            final int size = class42.size();
            final int n = (this.field24759 >= 0) ? this.field24759 : (size + this.field24759);
            if (0 <= n) {
                if (n < size) {
                    final INBT obj = (INBT)class42.get(n);
                    final INBT class43 = supplier.get();
                    if (!class43.equals(obj)) {
                        if (class42.func_218659_a(n, class43)) {
                            return 1;
                        }
                    }
                }
            }
        }
        return 0;
    }
    
    @Override
    public int func_218053_a(final INBT class41) {
        if (class41 instanceof CollectionNBT) {
            final CollectionNBT class42 = (CollectionNBT)class41;
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
