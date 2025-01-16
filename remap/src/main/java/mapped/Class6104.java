// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.nbt.INBT;

import java.util.function.Supplier;
import java.util.List;
import java.util.function.Predicate;

public class Class6104 implements INode
{
    private static String[] field24760;
    private final Predicate<INBT> field24761;
    
    public Class6104(final CompoundNBT class51) {
        this.field24761 = NBTPathArgument.method27412(class51);
    }
    
    @Override
    public void addMatchingElements(final INBT class41, final List<INBT> list) {
        if (class41 instanceof CompoundNBT) {
            if (this.field24761.test(class41)) {
                list.add(class41);
            }
        }
    }
    
    @Override
    public void func_218054_a(final INBT class41, final Supplier<INBT> supplier, final List<INBT> list) {
        this.addMatchingElements(class41, list);
    }
    
    @Override
    public INBT createEmptyElement() {
        return new CompoundNBT();
    }
    
    @Override
    public int func_218051_a(final INBT class41, final Supplier<INBT> supplier) {
        return 0;
    }
    
    @Override
    public int func_218053_a(final INBT class41) {
        return 0;
    }
}
