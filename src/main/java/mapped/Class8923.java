// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Locale;
import java.util.Iterator;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.List;
import java.util.stream.Stream;
import java.util.function.Function;

public class Class8923<T> implements Class8924<T>
{
    private static String[] field37510;
    public Class8134<T> field37511;
    public Class8134<T> field37512;
    private final Function<T, Stream<Class1932>> field37513;
    private final List<T> field37514;
    private final Object2IntMap<T> field37515;
    
    public Class8923(final Function<T, Stream<Class1932>> field37513) {
        this.field37511 = new Class8134<T>();
        this.field37512 = new Class8134<T>();
        this.field37514 = Lists.newArrayList();
        this.field37515 = (Object2IntMap<T>)new Object2IntOpenHashMap();
        this.field37513 = field37513;
    }
    
    @Override
    public void method31454() {
        this.field37511 = new Class8134<T>();
        this.field37512 = new Class8134<T>();
        final Iterator<T> iterator = this.field37514.iterator();
        while (iterator.hasNext()) {
            this.method31455(iterator.next());
        }
        this.field37511.method26805();
        this.field37512.method26805();
    }
    
    @Override
    public void method31458(final T t) {
        this.field37515.put((Object)t, this.field37514.size());
        this.field37514.add(t);
        this.method31455(t);
    }
    
    @Override
    public void method31459() {
        this.field37514.clear();
        this.field37515.clear();
    }
    
    public void method31455(final T t) {
        this.field37513.apply(t).forEach(class1932 -> {
            this.field37511.method26804((T)o, class1932.method7798().toLowerCase(Locale.ROOT));
            this.field37512.method26804((T)o, class1932.method7797().toLowerCase(Locale.ROOT));
        });
    }
    
    public int method31460(final T t, final T t2) {
        return Integer.compare(this.field37515.getInt((Object)t), this.field37515.getInt((Object)t2));
    }
    
    @Override
    public List<T> method31456(final String s) {
        final int index = s.indexOf(58);
        if (index != -1) {
            return Lists.newArrayList((Iterator)new Class7250((Iterator<Object>)this.field37511.method26809(s.substring(0, index).trim()).iterator(), (Iterator<Object>)this.field37512.method26809(s.substring(index + 1).trim()).iterator(), this::method31460));
        }
        return this.field37512.method26809(s);
    }
}
