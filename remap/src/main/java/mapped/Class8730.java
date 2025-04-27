// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.chunk.ChunkStatus;
import org.apache.logging.log4j.LogManager;
import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongIterator;
import javax.annotation.Nullable;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap$Entry;
import java.util.List;
import com.google.common.collect.ImmutableList;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import com.google.common.collect.Sets;
import java.util.concurrent.Executor;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.Set;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import org.apache.logging.log4j.Logger;

public abstract class Class8730
{
    private static final Logger field36663;
    private static final int field36664;
    private final Long2ObjectMap<ObjectSet<Class513>> field36665;
    private final Long2ObjectOpenHashMap<Class79<Class1949<?>>> field36666;
    private final Class1893 field36667;
    private final Class1894 field36668;
    private final Class1895 field36669;
    private final Set<Class9298> field36670;
    private final Class1910 field36671;
    private final Class875<Class7701<Runnable>> field36672;
    private final Class875<Class8960> field36673;
    private final LongSet field36674;
    private final Executor field36675;
    private long field36676;
    
    public Class8730(final Executor executor, final Executor field36675) {
        this.field36665 = (Long2ObjectMap<ObjectSet<Class513>>)new Long2ObjectOpenHashMap();
        this.field36666 = (Long2ObjectOpenHashMap<Class79<Class1949<?>>>)new Long2ObjectOpenHashMap();
        this.field36667 = new Class1893(this);
        this.field36668 = new Class1894(this, 8);
        this.field36669 = new Class1895(this, 33);
        this.field36670 = Sets.newHashSet();
        this.field36674 = new LongOpenHashSet();
        final Class875<Runnable> method5392 = Class875.method5392("player ticket throttler", field36675::execute);
        final Class1910 field36676 = new Class1910((List<Class875<?>>)ImmutableList.of((Object)method5392), executor, 4);
        this.field36671 = field36676;
        this.field36672 = field36676.method7466(method5392, true);
        this.field36673 = field36676.method7467(method5392);
        this.field36675 = field36675;
    }
    
    public void method30122() {
        ++this.field36676;
        final ObjectIterator fastIterator = this.field36666.long2ObjectEntrySet().fastIterator();
        while (fastIterator.hasNext()) {
            final Long2ObjectMap$Entry long2ObjectMap$Entry = (Long2ObjectMap$Entry)fastIterator.next();
            if (((Class79)long2ObjectMap$Entry.getValue()).removeIf(class1949 -> class1949.method7925(this.field36676))) {
                this.field36667.method7329(long2ObjectMap$Entry.getLongKey(), method30123((Class79<Class1949<?>>)long2ObjectMap$Entry.getValue()), false);
            }
            if (!((Class79)long2ObjectMap$Entry.getValue()).isEmpty()) {
                continue;
            }
            fastIterator.remove();
        }
    }
    
    private static int method30123(final Class79<Class1949<?>> class79) {
        return class79.isEmpty() ? (Class388.field2249 + 1) : class79.method439().method7923();
    }
    
    public abstract boolean method30124(final long p0);
    
    @Nullable
    public abstract Class9298 method30125(final long p0);
    
    @Nullable
    public abstract Class9298 method30126(final long p0, final int p1, final Class9298 p2, final int p3);
    
    public boolean method30127(final Class388 class388) {
        this.field36668.method7333();
        this.field36669.method7333();
        final boolean b = Integer.MAX_VALUE - this.field36667.method7330(Integer.MAX_VALUE) != 0;
        if (!b) {}
        if (this.field36670.isEmpty()) {
            if (!this.field36674.isEmpty()) {
                final LongIterator iterator = this.field36674.iterator();
                while (iterator.hasNext()) {
                    final long nextLong = iterator.nextLong();
                    if (!this.method30134(nextLong).stream().anyMatch(class389 -> class389.method7922() == Class9105.field38567)) {
                        continue;
                    }
                    final Class9298 method1316 = class388.method1316(nextLong);
                    if (method1316 == null) {
                        throw new IllegalStateException();
                    }
                    method1316.method34343().thenAccept(p1 -> this.field36675.execute(() -> this.field36673.method5386(Class1910.method7465(() -> {}, n, (boolean)(0 != 0)))));
                }
                this.field36674.clear();
            }
            return b;
        }
        this.field36670.forEach(class391 -> class391.method34362(class390));
        this.field36670.clear();
        return true;
    }
    
    private void method30128(final long n, final Class1949<?> class1949) {
        final Class79<Class1949<?>> method30134 = this.method30134(n);
        final int method30135 = method30123(method30134);
        method30134.method438(class1949).method7924(this.field36676);
        if (class1949.method7923() < method30135) {
            this.field36667.method7329(n, class1949.method7923(), true);
        }
    }
    
    private void method30129(final long n, final Class1949<?> class1949) {
        final Class79<Class1949<?>> method30134 = this.method30134(n);
        if (!method30134.remove(class1949)) {}
        if (method30134.isEmpty()) {
            this.field36666.remove(n);
        }
        this.field36667.method7329(n, method30123(method30134), false);
    }
    
    public <T> void method30130(final Class9105<T> class9105, final ChunkPos class9106, final int n, final T t) {
        this.method30128(class9106.method25422(), new Class1949<Object>(class9105, n, t));
    }
    
    public <T> void method30131(final Class9105<T> class9105, final ChunkPos class9106, final int n, final T t) {
        this.method30129(class9106.method25422(), new Class1949<Object>(class9105, n, t));
    }
    
    public <T> void method30132(final Class9105<T> class9105, final ChunkPos class9106, final int n, final T t) {
        this.method30128(class9106.method25422(), new Class1949<Object>(class9105, 33 - n, t));
    }
    
    public <T> void method30133(final Class9105<T> class9105, final ChunkPos class9106, final int n, final T t) {
        this.method30129(class9106.method25422(), new Class1949<Object>(class9105, 33 - n, t));
    }
    
    private Class79<Class1949<?>> method30134(final long n) {
        return this.field36666.computeIfAbsent(n, p0 -> Class79.method430(4));
    }
    
    public void method30135(final ChunkPos class7859, final boolean b) {
        final Class1949 class7860 = new Class1949(Class9105.field38568, 31, class7859);
        if (!b) {
            this.method30129(class7859.method25422(), class7860);
        }
        else {
            this.method30128(class7859.method25422(), class7860);
        }
    }
    
    public void method30136(final Class353 class353, final Class513 class354) {
        final long method25422 = class353.method1115().method25422();
        ((ObjectSet)this.field36665.computeIfAbsent(method25422, p0 -> new ObjectOpenHashSet())).add(class354);
        this.field36668.method7329(method25422, 0, true);
        this.field36669.method7329(method25422, 0, true);
    }
    
    public void method30137(final Class353 class353, final Class513 class354) {
        final long method25422 = class353.method1115().method25422();
        final ObjectSet set = this.field36665.get(method25422);
        set.remove(class354);
        if (set.isEmpty()) {
            this.field36665.remove(method25422);
            this.field36668.method7329(method25422, Integer.MAX_VALUE, false);
            this.field36669.method7329(method25422, Integer.MAX_VALUE, false);
        }
    }
    
    public String method30138(final long n) {
        final Class79 class79 = this.field36666.get(n);
        String string;
        if (class79 != null && !class79.isEmpty()) {
            string = class79.method439().toString();
        }
        else {
            string = "no_ticket";
        }
        return string;
    }
    
    public void method30139(final int n) {
        this.field36669.method7334(n);
    }
    
    public int method30140() {
        this.field36668.method7333();
        return this.field36668.field10290.size();
    }
    
    public boolean method30141(final long n) {
        this.field36668.method7333();
        return this.field36668.field10290.containsKey(n);
    }
    
    public String method30142() {
        return this.field36671.method7473();
    }
    
    static {
        field36663 = LogManager.getLogger();
        field36664 = 33 + ChunkStatus.getDistance(ChunkStatus.FULL) - 2;
    }
}
