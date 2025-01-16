// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.nbt.INBT;

import java.util.function.Supplier;
import java.util.List;
import java.util.function.Predicate;

public class Class6105 implements INode
{
    private static String[] field24762;
    private final String field24763;
    private final CompoundNBT field24764;
    private final Predicate<INBT> field24765;
    
    public Class6105(final String field24763, final CompoundNBT field24764) {
        this.field24763 = field24763;
        this.field24764 = field24764;
        this.field24765 = NBTPathArgument.method27412(field24764);
    }
    
    @Override
    public void addMatchingElements(final INBT class41, final List<INBT> list) {
        if (class41 instanceof CompoundNBT) {
            final INBT method313 = ((CompoundNBT)class41).get(this.field24763);
            if (this.field24765.test(method313)) {
                list.add(method313);
            }
        }
    }
    
    @Override
    public void func_218054_a(final INBT class41, final Supplier<INBT> supplier, final List<INBT> list) {
        if (class41 instanceof CompoundNBT) {
            final CompoundNBT class42 = (CompoundNBT)class41;
            final INBT method313 = class42.get(this.field24763);
            if (method313 != null) {
                if (this.field24765.test(method313)) {
                    list.add(method313);
                }
            }
            else {
                final CompoundNBT method314 = this.field24764.copy();
                class42.put(this.field24763, method314);
                list.add(method314);
            }
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
            final INBT method313 = class42.get(this.field24763);
            if (this.field24765.test(method313)) {
                final INBT class43 = supplier.get();
                if (!class43.equals(method313)) {
                    class42.put(this.field24763, class43);
                    return 1;
                }
            }
        }
        return 0;
    }
    
    @Override
    public int func_218053_a(final INBT class41) {
        if (class41 instanceof CompoundNBT) {
            final CompoundNBT class42 = (CompoundNBT)class41;
            if (this.field24765.test(class42.get(this.field24763))) {
                class42.remove(this.field24763);
                return 1;
            }
        }
        return 0;
    }
}
