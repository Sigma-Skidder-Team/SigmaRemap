// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Function;
import com.google.common.base.MoreObjects;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Collection;
import com.google.common.collect.ImmutableMap;
import java.util.stream.Stream;
import java.util.Collections;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Map;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSortedMap;
import java.util.regex.Pattern;

public class Class9104<O, S extends Class7098<S>>
{
    private static final Pattern field38558;
    private final O field38559;
    private final ImmutableSortedMap<String, Class7111<?>> field38560;
    private final ImmutableList<S> field38561;
    
    public <A extends Class7097<O, S>> Class9104(final O field38559, final Class6846<O, S, A> class6846, final Map<String, Class7111<?>> map) {
        this.field38559 = field38559;
        this.field38560 = (ImmutableSortedMap<String, Class7111<?>>)ImmutableSortedMap.copyOf((Map)map);
        final LinkedHashMap linkedHashMap = Maps.newLinkedHashMap();
        final ArrayList arrayList = Lists.newArrayList();
        Object o = Stream.of(Collections.emptyList());
        while (((Iterator)this.field38560.values().iterator()).hasNext()) {
            o = ((Stream<List<Object>>)o).flatMap(p1 -> {
                final Iterator<Class7111> iterator2;
                final Object o3 = iterator2.next();
                return class6847.method21829().stream().map(comparable -> {
                    Lists.newArrayList((Iterable)list);
                    final Stream stream;
                    ((List)stream).add(comparable);
                    return stream;
                });
            });
        }
        ((Stream<List<Object>>)o).forEach(list3 -> {
            Class8739.method30188((Iterable<Object>)this.field38560.values(), (Iterable<Object>)list3);
            final Map map3;
            class6848.method20943(o5, ImmutableMap.copyOf(map3));
            final Class7097 class6849;
            map2.put(map3, class6849);
            list2.add(class6849);
            return;
        });
        final Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            ((Class7097)iterator.next()).method21774(linkedHashMap);
        }
        this.field38561 = (ImmutableList<S>)ImmutableList.copyOf((Collection)arrayList);
    }
    
    public ImmutableList<S> method32902() {
        return this.field38561;
    }
    
    public S method32903() {
        return (S)this.field38561.get(0);
    }
    
    public O method32904() {
        return this.field38559;
    }
    
    public Collection<Class7111<?>> method32905() {
        return (Collection<Class7111<?>>)this.field38560.values();
    }
    
    @Override
    public String toString() {
        return MoreObjects.toStringHelper((Object)this).add("block", (Object)this.field38559).add("properties", (Object)this.field38560.values().stream().map(Class7111::method21826).collect((Collector<? super Object, ?, List<Object>>)Collectors.toList())).toString();
    }
    
    @Nullable
    public Class7111<?> method32906(final String s) {
        return (Class7111)this.field38560.get((Object)s);
    }
    
    static {
        field38558 = Pattern.compile("^[a-z0-9_]+$");
    }
}
