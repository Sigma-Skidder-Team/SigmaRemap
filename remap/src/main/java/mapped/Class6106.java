// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.nbt.INBT;

import java.util.function.Supplier;
import java.util.List;

public class Class6106 implements INode
{
    private static String[] field24766;
    private final String field24767;
    
    public Class6106(final String field24767) {
        this.field24767 = field24767;
    }
    
    @Override
    public void addMatchingElements(final INBT class41, final List<INBT> list) {
        if (class41 instanceof CompoundNBT) {
            final INBT method313 = ((CompoundNBT)class41).get(this.field24767);
            if (method313 != null) {
                list.add(method313);
            }
        }
    }
    
    @Override
    public void func_218054_a(final INBT class41, final Supplier<INBT> supplier, final List<INBT> list) {
        if (class41 instanceof CompoundNBT) {
            final CompoundNBT class42 = (CompoundNBT)class41;
            INBT method313;
            if (!class42.contains(this.field24767)) {
                method313 = supplier.get();
                class42.put(this.field24767, method313);
            }
            else {
                method313 = class42.get(this.field24767);
            }
            list.add(method313);
        }
    }
    
    @Override
    public INBT createEmptyElement() {
        return new CompoundNBT();
    }
    
    @Override
    public int func_218051_a(final INBT class41, final Supplier<INBT> supplier) {
        if (class41 instanceof CompoundNBT) {
            final CompoundNBT class42 = (CompoundNBT)class41;
            final INBT class43 = supplier.get();
            if (!class43.equals(class42.put(this.field24767, class43))) {
                return 1;
            }
        }
        return 0;
    }
    
    @Override
    public int func_218053_a(final INBT class41) {
        if (class41 instanceof CompoundNBT) {
            final CompoundNBT class42 = (CompoundNBT)class41;
            if (class42.contains(this.field24767)) {
                class42.remove(this.field24767);
                return 1;
            }
        }
        return 0;
    }
}
