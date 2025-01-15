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

public interface Class6102
{
    void method18197(final INBT p0, final List<INBT> p1);
    
    void method18198(final INBT p0, final Supplier<INBT> p1, final List<INBT> p2);
    
    INBT method18199();
    
    int method18200(final INBT p0, final Supplier<INBT> p1);
    
    int method18201(final INBT p0);
    
    default List<INBT> method18202(final List<INBT> list) {
        return this.method18204(list, this::method18197);
    }
    
    default List<INBT> method18203(final List<INBT> list, final Supplier<INBT> supplier) {
        return this.method18204(list, (class41, list2) -> this.method18198(class41, supplier2, list2));
    }
    
    default List<INBT> method18204(final List<INBT> list, final BiConsumer<INBT, List<INBT>> biConsumer) {
        final ArrayList arrayList = Lists.newArrayList();
        final Iterator<INBT> iterator = list.iterator();
        while (iterator.hasNext()) {
            biConsumer.accept(iterator.next(), arrayList);
        }
        return arrayList;
    }
}
