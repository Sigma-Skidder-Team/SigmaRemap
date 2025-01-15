// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.annotations.VisibleForTesting;
import it.unimi.dsi.fastutil.longs.LongCollection;
import javax.annotation.Nullable;
import java.util.function.Function;
import com.mojang.datafixers.util.Either;
import java.util.stream.Stream;
import java.util.Iterator;
import java.util.Collection;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Optional;
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import java.util.List;

public class Class8587<T>
{
    public static final int field36079;
    private final List<Long2ObjectLinkedOpenHashMap<List<Optional<T>>>> field36080;
    private volatile int field36081;
    private final String field36082;
    private final LongSet field36083;
    private final int field36084;
    
    public Class8587(final String field36082, final int field36083) {
        this.field36080 = IntStream.range(0, Class8587.field36079).mapToObj(p0 -> new Long2ObjectLinkedOpenHashMap()).collect((Collector<? super Object, ?, List<Long2ObjectLinkedOpenHashMap<List<Optional<T>>>>>)Collectors.toList());
        this.field36081 = Class8587.field36079;
        this.field36083 = (LongSet)new LongOpenHashSet();
        this.field36082 = field36082;
        this.field36084 = field36083;
    }
    
    public void method29074(final int n, final Class7859 class7859, final int b) {
        if (n < Class8587.field36079) {
            final List list = (List)this.field36080.get(n).remove(class7859.method25422());
            if (n == this.field36081) {
                while (this.field36081 < Class8587.field36079) {
                    if (!this.field36080.get(this.field36081).isEmpty()) {
                        break;
                    }
                    ++this.field36081;
                }
            }
            if (list != null) {
                if (!list.isEmpty()) {
                    ((List)this.field36080.get(b).computeIfAbsent(class7859.method25422(), p0 -> Lists.newArrayList())).addAll(list);
                    this.field36081 = Math.min(this.field36081, b);
                }
            }
        }
    }
    
    public void method29075(final Optional<T> optional, final long n, final int b) {
        ((List)this.field36080.get(b).computeIfAbsent(n, p0 -> Lists.newArrayList())).add(optional);
        this.field36081 = Math.min(this.field36081, b);
    }
    
    public void method29076(final long n, final boolean b) {
        for (final Long2ObjectLinkedOpenHashMap long2ObjectLinkedOpenHashMap : this.field36080) {
            final List list = (List)long2ObjectLinkedOpenHashMap.get(n);
            if (list == null) {
                continue;
            }
            if (!b) {
                list.removeIf(optional -> !optional.isPresent());
            }
            else {
                list.clear();
            }
            if (!list.isEmpty()) {
                continue;
            }
            long2ObjectLinkedOpenHashMap.remove(n);
        }
        while (this.field36081 < Class8587.field36079 && this.field36080.get(this.field36081).isEmpty()) {
            ++this.field36081;
        }
        this.field36083.remove(n);
    }
    
    private Runnable method29077(final long n) {
        return () -> this.field36083.add(n2);
    }
    
    @Nullable
    public Stream<Either<T, Runnable>> method29078() {
        if (this.field36083.size() >= this.field36084) {
            return null;
        }
        if (this.field36081 < Class8587.field36079) {
            final Long2ObjectLinkedOpenHashMap long2ObjectLinkedOpenHashMap = this.field36080.get(this.field36081);
            long2ObjectLinkedOpenHashMap.firstLongKey();
            final List list = (List)long2ObjectLinkedOpenHashMap.removeFirst();
            while (this.field36081 < Class8587.field36079 && this.field36080.get(this.field36081).isEmpty()) {
                ++this.field36081;
            }
            return list.stream().map(optional -> optional.map(Either::left).orElseGet(() -> Either.right((Object)this.method29077(n))));
        }
        return null;
    }
    
    @Override
    public String toString() {
        return this.field36082 + " " + this.field36081 + "...";
    }
    
    @VisibleForTesting
    public LongSet method29079() {
        return (LongSet)new LongOpenHashSet((LongCollection)this.field36083);
    }
    
    static {
        field36079 = Class388.field2249 + 2;
    }
}
