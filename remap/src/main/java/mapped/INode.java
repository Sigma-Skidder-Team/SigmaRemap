// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import net.minecraft.nbt.INBT;

import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.List;

public interface INode
{
    void addMatchingElements(final INBT p0, final List<INBT> p1);
    
    void func_218054_a(final INBT p0, final Supplier<INBT> p1, final List<INBT> p2);
    
    INBT createEmptyElement();
    
    int func_218051_a(final INBT p0, final Supplier<INBT> p1);
    
    int func_218053_a(final INBT p0);
    
    default List<INBT> func_218056_a(final List<INBT> list) {
        return this.func_218057_a(list, this::addMatchingElements);
    }
    
    default List<INBT> func_218052_a(final List<INBT> list, final Supplier<INBT> supplier) {
        return this.func_218057_a(list, (class41, list2) -> this.func_218054_a(class41, supplier, list2));
    }
    
    default List<INBT> func_218057_a(final List<INBT> list, final BiConsumer<INBT, List<INBT>> biConsumer) {
        final ArrayList arrayList = Lists.newArrayList();
        final Iterator<INBT> iterator = list.iterator();
        while (iterator.hasNext()) {
            biConsumer.accept(iterator.next(), arrayList);
        }
        return arrayList;
    }
}
