// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import com.google.common.base.Functions;
import java.util.function.Predicate;
import java.util.Objects;
import java.util.Collection;
import java.util.stream.Collector;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.LinkedHashSet;
import java.util.function.Function;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Class1920<T extends Class1921> implements AutoCloseable
{
    private static String[] field10437;
    private final Set<Class7938> field10438;
    private final Map<String, T> field10439;
    private final List<T> field10440;
    private final Class6712<T> field10441;
    
    public Class1920(final Class6712<T> field10441) {
        this.field10438 = Sets.newHashSet();
        this.field10439 = Maps.newLinkedHashMap();
        this.field10440 = Lists.newLinkedList();
        this.field10441 = field10441;
    }
    
    public void method7606() {
        this.close();
        final Set set = this.field10440.stream().map((Function<? super Object, ?>)Class1921::method7621).collect((Collector<? super Object, ?, Set>)Collectors.toCollection((Supplier<R>)LinkedHashSet::new));
        this.field10439.clear();
        this.field10440.clear();
        final Iterator<Class7938> iterator = this.field10438.iterator();
        while (iterator.hasNext()) {
            iterator.next().method25739(this.field10439, this.field10441);
        }
        this.method7607();
        this.field10440.addAll((Collection<? extends T>)set.stream().map(this.field10439::get).filter(Objects::nonNull).collect(Collectors.toCollection(LinkedHashSet::new)));
        for (final Class1921 class1921 : this.field10439.values()) {
            if (!class1921.method7622()) {
                continue;
            }
            if (this.field10440.contains(class1921)) {
                continue;
            }
            class1921.method7624().method8128((List<Class1921>)this.field10440, class1921, (Function<Class1921, Class1921>)Functions.identity(), false);
        }
    }
    
    private void method7607() {
        final ArrayList arrayList = Lists.newArrayList((Iterable)this.field10439.entrySet());
        this.field10439.clear();
        arrayList.stream().sorted(Map.Entry.comparingByKey()).forEachOrdered(entry -> {
            final Class1921 class1921 = this.field10439.put(entry.getKey(), (T)entry.getValue());
        });
    }
    
    public void method7608(final Collection<T> collection) {
        this.field10440.clear();
        this.field10440.addAll((Collection<? extends T>)collection);
        for (final Class1921 class1921 : this.field10439.values()) {
            if (!class1921.method7622()) {
                continue;
            }
            if (this.field10440.contains(class1921)) {
                continue;
            }
            class1921.method7624().method8128((List<Class1921>)this.field10440, class1921, (Function<Class1921, Class1921>)Functions.identity(), false);
        }
    }
    
    public Collection<T> method7609() {
        return this.field10439.values();
    }
    
    public Collection<T> method7610() {
        final ArrayList arrayList = Lists.newArrayList((Iterable)this.field10439.values());
        arrayList.removeAll(this.field10440);
        return arrayList;
    }
    
    public Collection<T> method7611() {
        return this.field10440;
    }
    
    @Nullable
    public T method7612(final String s) {
        return this.field10439.get(s);
    }
    
    public void method7613(final Class7938 class7938) {
        this.field10438.add(class7938);
    }
    
    @Override
    public void close() {
        this.field10439.values().forEach(Class1921::close);
    }
}
