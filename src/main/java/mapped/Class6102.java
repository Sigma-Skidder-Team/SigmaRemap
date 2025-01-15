// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.List;

public interface Class6102
{
    void method18197(final Class41 p0, final List<Class41> p1);
    
    void method18198(final Class41 p0, final Supplier<Class41> p1, final List<Class41> p2);
    
    Class41 method18199();
    
    int method18200(final Class41 p0, final Supplier<Class41> p1);
    
    int method18201(final Class41 p0);
    
    default List<Class41> method18202(final List<Class41> list) {
        return this.method18204(list, this::method18197);
    }
    
    default List<Class41> method18203(final List<Class41> list, final Supplier<Class41> supplier) {
        return this.method18204(list, (class41, list2) -> this.method18198(class41, supplier2, list2));
    }
    
    default List<Class41> method18204(final List<Class41> list, final BiConsumer<Class41, List<Class41>> biConsumer) {
        final ArrayList arrayList = Lists.newArrayList();
        final Iterator<Class41> iterator = list.iterator();
        while (iterator.hasNext()) {
            biConsumer.accept(iterator.next(), arrayList);
        }
        return arrayList;
    }
}
