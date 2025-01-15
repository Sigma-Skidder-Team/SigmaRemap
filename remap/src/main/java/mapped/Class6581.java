// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Function;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;
import java.util.Collection;
import java.util.function.Predicate;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Iterator;
import com.google.common.collect.Sets;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Set;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.Logger;

public class Class6581 implements Class6580
{
    private static final Logger field26113;
    private final Map<String, Class6583> field26114;
    private final List<Class1662> field26115;
    private final List<Class1662> field26116;
    private final Set<String> field26117;
    private final Class346 field26118;
    private final Thread field26119;
    
    public Class6581(final Class346 field26118, final Thread field26119) {
        this.field26114 = Maps.newHashMap();
        this.field26115 = Lists.newArrayList();
        this.field26116 = Lists.newArrayList();
        this.field26117 = Sets.newLinkedHashSet();
        this.field26118 = field26118;
        this.field26119 = field26119;
    }
    
    public void method19931(final Class1727 class1727) {
        for (final String s : class1727.method6100(this.field26118)) {
            this.field26117.add(s);
            Class6583 class1728 = this.field26114.get(s);
            if (class1728 == null) {
                class1728 = new Class6583(this.field26118, s);
                this.field26114.put(s, class1728);
            }
            class1728.method19939(class1727);
        }
    }
    
    @Override
    public Set<String> method19932() {
        return this.field26117;
    }
    
    @Override
    public Class1671 method19933(final Class1932 class1932) throws IOException {
        final Class6582 class1933 = this.field26114.get(class1932.method7798());
        if (class1933 == null) {
            throw new FileNotFoundException(class1932.toString());
        }
        return class1933.method19933(class1932);
    }
    
    @Override
    public boolean method19934(final Class1932 class1932) {
        final Class6582 class1933 = this.field26114.get(class1932.method7798());
        return class1933 != null && class1933.method19934(class1932);
    }
    
    @Override
    public List<Class1671> method19935(final Class1932 class1932) throws IOException {
        final Class6582 class1933 = this.field26114.get(class1932.method7798());
        if (class1933 == null) {
            throw new FileNotFoundException(class1932.toString());
        }
        return class1933.method19935(class1932);
    }
    
    @Override
    public Collection<Class1932> method19936(final String s, final Predicate<String> predicate) {
        final HashSet hashSet = Sets.newHashSet();
        final Iterator<Class6583> iterator = this.field26114.values().iterator();
        while (iterator.hasNext()) {
            hashSet.addAll(iterator.next().method19936(s, predicate));
        }
        final ArrayList arrayList = Lists.newArrayList((Iterable)hashSet);
        Collections.sort((List<Comparable>)arrayList);
        return arrayList;
    }
    
    private void method19937() {
        this.field26114.clear();
        this.field26117.clear();
    }
    
    @Override
    public CompletableFuture<Class315> method19928(final Executor executor, final Executor executor2, final List<Class1727> list, final CompletableFuture<Class315> completableFuture) {
        return this.method19929(executor, executor2, completableFuture, list).method27188();
    }
    
    @Override
    public void method19930(final Class1662 class1662) {
        this.field26115.add(class1662);
        this.field26116.add(class1662);
    }
    
    public Class8207 method19938(final Executor executor, final Executor executor2, final List<Class1662> list, final CompletableFuture<Class315> completableFuture) {
        Class8207 method27187;
        if (!Class6581.field26113.isDebugEnabled()) {
            method27187 = Class8206.method27187(this, Lists.newArrayList((Iterable)list), executor, executor2, completableFuture);
        }
        else {
            method27187 = new Class8205(this, Lists.newArrayList((Iterable)list), executor, executor2, completableFuture);
        }
        this.field26116.clear();
        return method27187;
    }
    
    @Override
    public Class8207 method19929(final Executor executor, final Executor executor2, final CompletableFuture<Class315> completableFuture, final List<Class1727> list) {
        this.method19937();
        Class6581.field26113.info("Reloading ResourceManager: {}", (Object)list.stream().map((Function<? super Object, ?>)Class1727::method6102).collect((Collector<? super Object, ?, String>)Collectors.joining(", ")));
        for (final Class1727 class1727 : list) {
            try {
                this.method19931(class1727);
            }
            catch (final Exception ex) {
                Class6581.field26113.error("Failed to add resource pack {}", (Object)class1727.method6102(), (Object)ex);
                return new Class8208(new Class2370(class1727, ex));
            }
        }
        return this.method19938(executor, executor2, this.field26115, completableFuture);
    }
    
    static {
        field26113 = LogManager.getLogger();
    }
}
