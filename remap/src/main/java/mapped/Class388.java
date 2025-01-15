// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.apache.logging.log4j.LogManager;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletionException;
import java.util.stream.Stream;
import java.util.function.Function;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap$Entry;
import java.io.Writer;
import com.google.common.collect.Iterables;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.longs.LongIterator;
import java.util.function.BooleanSupplier;
import org.apache.commons.lang3.mutable.MutableBoolean;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.function.Predicate;
import java.io.IOException;
import java.util.Optional;
import java.util.Iterator;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import com.mojang.datafixers.util.Either;
import java.util.concurrent.CompletableFuture;
import java.util.function.IntFunction;
import java.util.function.IntSupplier;
import javax.annotation.Nullable;
import java.util.List;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Queues;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.util.concurrent.Executor;
import com.mojang.datafixers.DataFixer;
import java.util.Queue;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import java.io.File;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import org.apache.logging.log4j.Logger;

public class Class388 extends Class387 implements Class389
{
    private static final Logger field2248;
    public static final int field2249;
    private final Long2ObjectLinkedOpenHashMap<Class9298> field2250;
    private volatile Long2ObjectLinkedOpenHashMap<Class9298> field2251;
    private final Long2ObjectLinkedOpenHashMap<Class9298> field2252;
    private final LongSet field2253;
    private final Class1849 field2254;
    private final Class1885 field2255;
    private final Class872<Runnable> field2256;
    private final Class6346<?> field2257;
    private final Supplier<Class8213> field2258;
    private final Class1883 field2259;
    private final LongSet field2260;
    private boolean field2261;
    private final Class1910 field2262;
    private final Class875<Class7701<Runnable>> field2263;
    private final Class875<Class7701<Runnable>> field2264;
    private final Class6459 field2265;
    private final Class8731 field2266;
    private final AtomicInteger field2267;
    private final Class1795 field2268;
    private final File field2269;
    private final Class8249 field2270;
    private final Int2ObjectMap<Class9406> field2271;
    private final Queue<Runnable> field2272;
    private int field2273;
    
    public Class388(final Class1849 field2254, final File file, final DataFixer dataFixer, final Class1795 field2255, final Executor executor, final Class872<Runnable> field2256, final Class1908 class1908, final Class6346<?> field2257, final Class6459 field2258, final Supplier<Class8213> field2259, final int n) {
        super(new File(field2254.method6789().method20487().method1272(file), "region"), dataFixer);
        this.field2250 = (Long2ObjectLinkedOpenHashMap<Class9298>)new Long2ObjectLinkedOpenHashMap();
        this.field2251 = (Long2ObjectLinkedOpenHashMap<Class9298>)this.field2250.clone();
        this.field2252 = (Long2ObjectLinkedOpenHashMap<Class9298>)new Long2ObjectLinkedOpenHashMap();
        this.field2253 = (LongSet)new LongOpenHashSet();
        this.field2260 = (LongSet)new LongOpenHashSet();
        this.field2267 = new AtomicInteger();
        this.field2270 = new Class8249();
        this.field2271 = (Int2ObjectMap<Class9406>)new Int2ObjectOpenHashMap();
        this.field2272 = Queues.newConcurrentLinkedQueue();
        this.field2268 = field2255;
        this.field2269 = field2254.method6789().method20487().method1272(file);
        this.field2254 = field2254;
        this.field2257 = field2257;
        this.field2256 = field2256;
        final Class877<Runnable> method5393 = Class877.method5393(executor, "worldgen");
        final Class875<Runnable> method5394 = Class875.method5392("main", field2256::method5381);
        this.field2265 = field2258;
        final Class877<Runnable> method5395 = Class877.method5393(executor, "light");
        this.field2262 = new Class1910((List<Class875<?>>)ImmutableList.of((Object)method5393, (Object)method5394, (Object)method5395), executor, Integer.MAX_VALUE);
        this.field2263 = this.field2262.method7466(method5393, false);
        this.field2264 = this.field2262.method7466(method5394, false);
        this.field2255 = new Class1885(class1908, this, this.field2254.method6789().method20503(), method5395, this.field2262.method7466(method5395, false));
        this.field2266 = new Class8731(this, executor, field2256);
        this.field2258 = field2259;
        this.field2259 = new Class1883(new File(this.field2269, "poi"), dataFixer);
        this.method1338(n);
    }
    
    private static double method1312(final Class7859 class7859, final Entity class7860) {
        final double n = class7859.field32290 * 16 + 8;
        final double n2 = class7859.field32291 * 16 + 8;
        final double n3 = n - class7860.method1938();
        final double n4 = n2 - class7860.method1945();
        return n3 * n3 + n4 * n4;
    }
    
    private static int method1313(final Class7859 class7859, final Class513 class7860, final boolean b) {
        int n;
        int n2;
        if (!b) {
            n = MathHelper.floor(class7860.method1938() / 16.0);
            n2 = MathHelper.floor(class7860.method1945() / 16.0);
        }
        else {
            final Class353 method2961 = class7860.method2961();
            n = method2961.method1102();
            n2 = method2961.method1104();
        }
        return method1314(class7859, n, n2);
    }
    
    private static int method1314(final Class7859 class7859, final int n, final int n2) {
        return Math.max(Math.abs(class7859.field32290 - n), Math.abs(class7859.field32291 - n2));
    }
    
    public Class1885 method1315() {
        return this.field2255;
    }
    
    @Nullable
    public Class9298 method1316(final long n) {
        return (Class9298)this.field2250.get(n);
    }
    
    @Nullable
    public Class9298 method1317(final long n) {
        return (Class9298)this.field2251.get(n);
    }
    
    public IntSupplier method1318(final long n) {
        return () -> {
            this.method1317(n2);
            final Class9298 class9298;
            return (class9298 != null) ? Math.min(class9298.method34359(), Class8587.field36079 - 1) : (Class8587.field36079 - 1);
        };
    }
    
    public String method1319(final Class7859 class7859) {
        final Class9298 method1317 = this.method1317(class7859.method25422());
        if (method1317 != null) {
            String str = method1317.method34358() + "\n";
            final Class9312 method1318 = method1317.method34346();
            final Class1860 method1319 = method1317.method34347();
            if (method1318 != null) {
                str = str + "St: §" + method1318.method34442() + method1318 + '§' + "r\n";
            }
            if (method1319 != null) {
                str = str + "Ch: §" + method1319.method7027().method34442() + method1319.method7027() + '§' + "r\n";
            }
            final Class2152 method1320 = method1317.method34356();
            return str + "§" + method1320.ordinal() + method1320 + '§' + "r";
        }
        return "null";
    }
    
    private CompletableFuture<Either<List<Class1860>, Class6797>> method1320(final Class7859 class7859, final int n, final IntFunction<Class9312> intFunction) {
        final ArrayList arrayList = Lists.newArrayList();
        final int field32290 = class7859.field32290;
        final int field32291 = class7859.field32291;
        for (int i = -n; i <= n; ++i) {
            for (int j = -n; j <= n; ++j) {
                final int max = Math.max(Math.abs(j), Math.abs(i));
                final Class7859 class7860 = new Class7859(field32290 + j, field32291 + i);
                final Class9298 method1316 = this.method1316(class7860.method25422());
                if (method1316 == null) {
                    return CompletableFuture.completedFuture(Either.right((Object)new Class6796(this, class7860)));
                }
                arrayList.add(method1316.method34354(intFunction.apply(max), this));
            }
        }
        return (CompletableFuture<Either<List<Class1860>, Class6797>>)Class8349.method27853((List<? extends CompletableFuture<?>>)arrayList).thenApply(list -> {
            Lists.newArrayList();
            list.iterator();
            final Iterator iterator;
            final ArrayList list2;
            while (iterator.hasNext()) {
                final Either either = iterator.next();
                either.left();
                final Optional optional;
                if (optional.isPresent()) {
                    list2.add(optional.get());
                    int n5 = 0;
                    ++n5;
                }
                else {
                    final int n5;
                    return Either.right((Object)new Class6798(this, n2, n5, n3, n4, either));
                }
            }
            return Either.left((Object)list2);
        });
    }
    
    public CompletableFuture<Either<Class1862, Class6797>> method1321(final Class7859 class7859) {
        return this.method1320(class7859, 2, p0 -> Class9312.field39989).thenApplyAsync(either -> either.mapLeft(list -> list.get(list.size() / 2)), (Executor)this.field2256);
    }
    
    @Nullable
    private Class9298 method1322(final long n, final int n2, Class9298 class9298, final int n3) {
        if (n3 > Class388.field2249 && n2 > Class388.field2249) {
            return class9298;
        }
        if (class9298 != null) {
            class9298.method34361(n2);
        }
        if (class9298 != null) {
            if (n2 <= Class388.field2249) {
                this.field2260.remove(n);
            }
            else {
                this.field2260.add(n);
            }
        }
        if (n2 <= Class388.field2249) {
            if (class9298 == null) {
                class9298 = (Class9298)this.field2252.remove(n);
                if (class9298 == null) {
                    class9298 = new Class9298(new Class7859(n), n2, this.field2255, this.field2262, this);
                }
                else {
                    class9298.method34361(n2);
                }
                this.field2250.put(n, (Object)class9298);
                this.field2261 = true;
            }
        }
        return class9298;
    }
    
    @Override
    public void close() throws IOException {
        try {
            this.field2262.close();
            this.field2259.close();
        }
        finally {
            super.close();
        }
    }
    
    public void method1323(final boolean b) {
        if (!b) {
            this.field2251.values().stream().filter(Class9298::method34365).forEach(class9298 -> {
                final Class1860 class9299 = class9298.method34348().getNow(null);
                if (class9299 instanceof Class1866 || class9299 instanceof Class1862) {
                    this.method1337(class9299);
                    class9298.method34366();
                }
            });
        }
        else {
            final List<Object> list = this.field2251.values().stream().filter(Class9298::method34365).peek(Class9298::method34366).collect((Collector<? super Object, ?, List<Object>>)Collectors.toList());
            final MutableBoolean mutableBoolean = new MutableBoolean();
            while (true) {
                mutableBoolean.setFalse();
                list.stream().map(class9300 -> {
                    final CompletableFuture completableFuture;
                    while (true) {
                        class9300.method34348();
                        this.field2256.method5384(completableFuture::isDone);
                        if (completableFuture != class9300.method34348()) {
                            continue;
                        }
                        else {
                            break;
                        }
                    }
                    return (Class1860)completableFuture.join();
                }).filter(class9301 -> class9301 instanceof Class1866 || class9301 instanceof Class1862).filter((Predicate<? super Object>)this::method1337).forEach(p1 -> mutableBoolean2.setTrue());
                if (mutableBoolean.isTrue()) {
                    continue;
                }
                break;
            }
            this.method1325(() -> true);
            this.method1311();
            Class388.field2248.info("ThreadedAnvilChunkStorage ({}): All chunks are saved", (Object)this.field2269.getName());
        }
    }
    
    public void method1324(final BooleanSupplier booleanSupplier) {
        final Class5028 method6796 = this.field2254.method6796();
        method6796.method15297("poi");
        this.field2259.method7178(booleanSupplier);
        method6796.method15300("chunk_unload");
        if (!this.field2254.method6795()) {
            this.method1325(booleanSupplier);
            if (Class9570.field41203.method22605()) {
                if (this.field2250.isEmpty()) {
                    Class9570.field41203.method22608(this.field2254);
                }
            }
        }
        method6796.method15299();
    }
    
    private void method1325(final BooleanSupplier booleanSupplier) {
        final LongIterator iterator = this.field2260.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            if (!booleanSupplier.getAsBoolean()) {
                if (n >= 200) {
                    if (this.field2260.size() <= 2000) {
                        break;
                    }
                }
            }
            final long nextLong = iterator.nextLong();
            final Class9298 class9298 = (Class9298)this.field2250.remove(nextLong);
            if (class9298 != null) {
                this.field2252.put(nextLong, (Object)class9298);
                this.field2261 = true;
                ++n;
                this.method1326(nextLong, class9298);
            }
            iterator.remove();
        }
        while (booleanSupplier.getAsBoolean() || this.field2272.size() > 2000) {
            final Runnable runnable;
            if ((runnable = this.field2272.poll()) == null) {
                return;
            }
            runnable.run();
        }
    }
    
    private void method1326(final long n, final Class9298 class9298) {
        class9298.method34348().thenAcceptAsync(class9300 -> {
            if (class9299.method34348() == completableFuture) {
                if (!(!this.field2252.remove(n2, (Object)class9299))) {
                    if (class9300 != null) {
                        if (!(!(class9300 instanceof Class1862))) {
                            ((Class1862)class9300).method7064(false);
                            if (!(!Class9570.field41194.method22619())) {
                                Class9570.method35840(Class9570.field41194, class9300);
                            }
                        }
                        this.method1337(class9300);
                        if (!(!this.field2253.remove(n2))) {
                            if (!(!(class9300 instanceof Class1862))) {
                                this.field2254.method6897((Class1862)class9300);
                            }
                        }
                        this.field2255.method7253(class9300.method7019());
                        this.field2255.method7261();
                        this.field2265.method19318(class9300.method7019(), null);
                    }
                }
            }
            else {
                this.method1326(n2, class9299);
            }
        }, this.field2272::add).whenComplete((p1, t3) -> {
            if (t3 != null) {
                Class388.field2248.error("Failed to save chunk " + class9301.method34357(), t3);
            }
        });
    }
    
    public boolean method1327() {
        if (this.field2261) {
            this.field2251 = (Long2ObjectLinkedOpenHashMap<Class9298>)this.field2250.clone();
            this.field2261 = false;
            return true;
        }
        return false;
    }
    
    public CompletableFuture<Either<Class1860, Class6797>> method1328(final Class9298 class9298, final Class9312 class9299) {
        final Class7859 method34357 = class9298.method34357();
        if (class9299 != Class9312.field39977) {
            return class9298.method34354(class9299.method34444(), this).thenComposeAsync(value -> {
                value.left();
                final Optional optional;
                if (optional.isPresent()) {
                    if (class9300 == Class9312.field39986) {
                        this.field2266.method30130(Class9105.field38569, class9301, 33 + Class9312.method34441(Class9312.field39985), class9301);
                    }
                    final Class1860 class9303 = optional.get();
                    if (!class9303.method7027().method34451(class9300)) {
                        return this.method1330(class9302, class9300);
                    }
                    else {
                        CompletableFuture<Either<Class1860, Class6797>> completableFuture;
                        if (class9300 != Class9312.field39986) {
                            completableFuture = class9300.method34446(this.field2254, this.field2268, this.field2255, p1 -> this.method1333(class9305), class9303);
                        }
                        else {
                            completableFuture = this.method1330(class9302, class9300);
                        }
                        this.field2265.method19318(class9301, class9300);
                        return completableFuture;
                    }
                }
                else {
                    return CompletableFuture.completedFuture(value);
                }
            }, (Executor)this.field2256);
        }
        return this.method1329(method34357);
    }
    
    private CompletableFuture<Either<Class1860, Class6797>> method1329(final Class7859 class7859) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                this.field2254.method6796().method15302("chunkLoad");
                this.method1345(class7860);
                final Class51 class7861;
                if (class7861 != null) {
                    if (class7861.method316("Level", 10) && class7861.method327("Level").method316("Status", 8)) {
                        Class7532.method23592(this.field2254, this.field2268, this.field2259, class7860, class7861);
                        final Class1865 class7862;
                        class7862.method7020(this.field2254.method6754());
                        if (Class9570.field41192.method22619()) {
                            Class9570.method35840(Class9570.field41192, class7862);
                        }
                        return Either.left((Object)class7862);
                    }
                    else {
                        Class388.field2248.error("Chunk file at {} is missing level data, skipping", (Object)class7860);
                    }
                }
            }
            catch (final Class2365 class7863) {
                if (!(class7863.getCause() instanceof IOException)) {
                    throw class7863;
                }
                else {
                    goto Label_0175_1;
                }
            }
            catch (final Exception ex) {
                Class388.field2248.error("Couldn't load chunk {}", (Object)class7860, (Object)ex);
            }
            return Either.left((Object)new Class1865(class7860, Class8288.field34078));
        }, this.field2256);
    }
    
    private CompletableFuture<Either<Class1860, Class6797>> method1330(final Class9298 class9298, final Class9312 class9299) {
        final CompletableFuture<Either<List<Class1860>, Class6797>> method1320 = this.method1320(class9298.method34357(), class9299.method34447(), n2 -> this.method1332(class9300, n2));
        this.field2254.method6796().method15303(() -> "chunkGenerate " + class9301.method34443());
        return (CompletableFuture<Either<Class1860, Class6797>>)method1320.thenComposeAsync(either -> either.map(list -> {
            try {
                class9302.method34445(this.field2254, this.field2257, this.field2268, this.field2255, p1 -> this.method1333(class9307), list);
                this.field2265.method19318(class9303, class9302);
                return;
            }
            catch (final Exception ex) {
                Class7689.method24421(ex, "Exception generating new chunk");
                final Class7689 class9304;
                class9304.method24418("Chunk to be generated");
                final Class5204 class9305;
                class9305.method16297("Location", String.format("%d,%d", class9303.field32290, class9303.field32291));
                class9305.method16297("Position hash", Class7859.method25423(class9303.field32290, class9303.field32291));
                class9305.method16297("Generator", this.field2257);
                throw new Class2365(class9304);
            }
        }, class9309 -> {
            this.method1331(class9308);
            return CompletableFuture.completedFuture(Either.right((Object)class9309));
        }), runnable2 -> this.field2263.method5386(Class1910.method7464(class9310, runnable2)));
    }
    
    public void method1331(final Class7859 class7859) {
        this.field2256.method5381(Class8349.method27856(() -> this.field2266.method30131(Class9105.field38569, class7860, 33 + Class9312.method34441(Class9312.field39985), class7860), () -> "release light ticket " + obj));
    }
    
    private Class9312 method1332(final Class9312 class9312, final int n) {
        Class9312 class9313;
        if (n != 0) {
            class9313 = Class9312.method34439(Class9312.method34441(class9312) + n);
        }
        else {
            class9313 = class9312.method34444();
        }
        return class9313;
    }
    
    private CompletableFuture<Either<Class1860, Class6797>> method1333(final Class9298 class9298) {
        return class9298.method34340(Class9312.field39989.method34444()).thenApplyAsync(either -> Class9298.method34363(class9299.method34358()).method34451(Class9312.field39989) ? either.mapLeft(class9301 -> {
            class9300.method34357();
            Class1862 method7114;
            if (!(class9301 instanceof Class1866)) {
                method7114 = new Class1862(this.field2254, (Class1865)class9301);
                class9300.method34367(new Class1866(method7114));
            }
            else {
                method7114 = ((Class1866)class9301).method7114();
            }
            method7114.method7074(() -> Class9298.method34364(class9304.method34358()));
            method7114.method7057();
            final Class7859 class9302;
            if (!(!this.field2253.add(class9302.method25422()))) {
                method7114.method7064(true);
                this.field2254.method6715(method7114.method7066().values());
                method7114.method7067();
                final Class80[] array;
                int i = 0;
                ArrayList arrayList = null;
                for (int length = array.length; i < length; ++i) {
                    array[i].iterator();
                    final Iterator iterator;
                    while (iterator.hasNext()) {
                        final Entity class9303 = iterator.next();
                        if (class9303 instanceof Class512) {
                            continue;
                        }
                        else if (this.field2254.method6895(class9303)) {
                            continue;
                        }
                        else if (arrayList != null) {
                            arrayList.add(class9303);
                        }
                        else {
                            arrayList = Lists.newArrayList((Object[])new Entity[] { class9303 });
                        }
                    }
                }
                if (arrayList != null) {
                    arrayList.forEach(method7114::method7053);
                }
                if (!(!Class9570.field41192.method22619())) {
                    Class9570.method35840(Class9570.field41192, method7114);
                }
            }
            return method7114;
        }) : Class9298.field39871, runnable2 -> this.field2264.method5386(Class1910.method7463(runnable2, class9305.method34357().method25422(), class9305::method34358)));
    }
    
    public CompletableFuture<Either<Class1862, Class6797>> method1334(final Class9298 class9298) {
        final CompletableFuture<Object> thenApplyAsync = this.method1320(class9298.method34357(), 1, p0 -> Class9312.field39989).thenApplyAsync(either -> either.flatMap(list -> {
            final Class1862 class9299 = list.get(list.size() / 2);
            class9299.method7069();
            return Either.left((Object)class9299);
        }), runnable2 -> this.field2264.method5386(Class1910.method7464(class9300, runnable2)));
        thenApplyAsync.thenAcceptAsync(either2 -> either2.mapLeft(class9302 -> {
            this.field2267.getAndIncrement();
            this.method1351(class9301, (boolean)(0 != 0)).forEach(class9304 -> {
                final Object o2 = new Class4252[2];
                this.method1357(class9304, array, class9303);
                return;
            });
            return Either.left((Object)class9302);
        }), runnable4 -> this.field2264.method5386(Class1910.method7464(class9305, runnable4)));
        return (CompletableFuture<Either<Class1862, Class6797>>)thenApplyAsync;
    }
    
    public CompletableFuture<Either<Class1862, Class6797>> method1335(final Class9298 class9298) {
        return class9298.method34354(Class9312.field39989, this).thenApplyAsync(either -> either.mapLeft(class9299 -> {
            final Class1862 class9300 = (Class1862)class9299;
            class9300.method7071();
            return class9300;
        }), runnable2 -> this.field2264.method5386(Class1910.method7464(class9301, runnable2)));
    }
    
    public int method1336() {
        return this.field2267.get();
    }
    
    private boolean method1337(final Class1860 class1860) {
        this.field2259.method7191(class1860.method7019());
        if (!class1860.method7026()) {
            return false;
        }
        try {
            this.field2254.method6916();
        }
        catch (final Class2337 class1861) {
            Class388.field2248.error("Couldn't save chunk; already in use by another instance of Minecraft?", (Throwable)class1861);
            return false;
        }
        class1860.method7020(this.field2254.method6754());
        class1860.method7025(false);
        final Class7859 method7019 = class1860.method7019();
        try {
            final Class9312 method7020 = class1860.method7027();
            if (method7020.method34448() != Class260.field1244) {
                final Class51 method7021 = this.method1345(method7019);
                if (method7021 != null && Class7532.method23594(method7021) == Class260.field1244) {
                    return false;
                }
                if (method7020 == Class9312.field39977 && class1860.method7021().values().stream().noneMatch(Class5936::method17858)) {
                    return false;
                }
            }
            this.field2254.method6796().method15302("chunkSave");
            final Class51 method7022 = Class7532.method23593(this.field2254, class1860);
            if (Class9570.field41190.method22619()) {
                Class9570.method35840(Class9570.field41190, class1860, method7022);
            }
            this.method1310(method7019, method7022);
            return true;
        }
        catch (final Exception ex) {
            Class388.field2248.error("Failed to save chunk {},{}", (Object)method7019.field32290, (Object)method7019.field32291, (Object)ex);
            return false;
        }
    }
    
    public void method1338(final int n) {
        final int method35651 = MathHelper.method35651(n + 1, 3, 64);
        if (method35651 != this.field2273) {
            final int field2273 = this.field2273;
            this.field2273 = method35651;
            this.field2266.method30139(this.field2273);
            final ObjectIterator iterator = this.field2250.values().iterator();
            while (((Iterator)iterator).hasNext()) {
                this.method1351(((Class9298)((Iterator)iterator).next()).method34357(), false).forEach(class7860 -> {
                    final Object o = new Class4252[2];
                    method1313(class7859, class7860, (boolean)(1 != 0));
                    final int n3;
                    this.method1339(class7860, class7859, array, n3 <= n2, n3 <= this.field2273);
                });
            }
        }
    }
    
    public void method1339(final Class513 class513, final Class7859 class514, final Class4252<?>[] array, final boolean b, final boolean b2) {
        if (class513.field2391 == this.field2254) {
            if (Class9570.field41264.method22605()) {
                Class9570.field41264.method22608(b, b2, class513, class514, this.field2254);
            }
            if (b2) {
                if (!b) {
                    final Class9298 method1317 = this.method1317(class514.method25422());
                    if (method1317 != null) {
                        final Class1862 method1318 = method1317.method34345();
                        if (method1318 != null) {
                            this.method1357(class513, array, method1318);
                        }
                        Class9324.method34531(this.field2254, class514);
                    }
                }
            }
            if (!b2) {
                if (b) {
                    class513.method2960(class514);
                }
            }
        }
    }
    
    public int method1340() {
        return this.field2251.size();
    }
    
    public Class8731 method1341() {
        return this.field2266;
    }
    
    public Iterable<Class9298> method1342() {
        return Iterables.unmodifiableIterable((Iterable)this.field2251.values());
    }
    
    public void method1343(final Writer writer) throws IOException {
        final Class8308 method22418 = Class8308.method27594().method22417("x").method22417("z").method22417("level").method22417("in_memory").method22417("status").method22417("full_status").method22417("accessible_ready").method22417("ticking_ready").method22417("entity_ticking_ready").method22417("ticket").method22417("spawning").method22417("entity_count").method22417("block_entity_count").method22418(writer);
        for (final Long2ObjectMap$Entry long2ObjectMap$Entry : this.field2251.long2ObjectEntrySet()) {
            final Class7859 class7859 = new Class7859(long2ObjectMap$Entry.getLongKey());
            final Class9298 class7860 = (Class9298)long2ObjectMap$Entry.getValue();
            final Optional<Class1860> ofNullable = Optional.ofNullable(class7860.method34347());
            final Optional<Object> flatMap = ofNullable.flatMap(class7861 -> (class7861 instanceof Class1862) ? Optional.of(class7861) : Optional.empty());
            method22418.method27595(class7859.field32290, class7859.field32291, class7860.method34358(), ofNullable.isPresent(), ofNullable.map((Function<? super Object, ? extends Class9312>)Class1860::method7027).orElse(null), flatMap.map((Function<? super Object, ?>)Class1862::method7073).orElse(null), method1344(class7860.method34344()), method1344(class7860.method34342()), method1344(class7860.method34343()), this.field2266.method30138(long2ObjectMap$Entry.getLongKey()), !this.method1346(class7859), flatMap.map(class7862 -> Stream.of(class7862.method7067()).mapToInt(Class80::size).sum()).orElse(0), flatMap.map(class7863 -> class7863.method7066().size()).orElse(0));
        }
    }
    
    private static String method1344(final CompletableFuture<Either<Class1862, Class6797>> completableFuture) {
        try {
            final Either either = completableFuture.getNow(null);
            return (String)((either != null) ? either.map(p0 -> "done", p0 -> "unloaded") : "not completed");
        }
        catch (final CompletionException ex) {
            return "failed " + ex.getCause().getMessage();
        }
        catch (final CancellationException ex2) {
            return "cancelled";
        }
    }
    
    @Nullable
    private Class51 method1345(final Class7859 class7859) throws IOException {
        final Class51 method1309 = this.method1309(class7859);
        return (method1309 != null) ? this.method1307(this.field2254.method6789().method20487(), this.field2258, method1309) : null;
    }
    
    public boolean method1346(final Class7859 class7859) {
        final long method25422 = class7859.method25422();
        return !this.field2266.method30141(method25422) || this.field2270.method27351(method25422).noneMatch(class7861 -> !class7861.method1639() && method1312(class7860, class7861) < 16384.0);
    }
    
    private boolean method1347(final Class513 class513) {
        return class513.method1639() && !this.field2254.method6765().method31216(Class8878.field37330);
    }
    
    public void method1348(final Class513 class513, final boolean b) {
        final boolean method1347 = this.method1347(class513);
        final boolean method1348 = this.field2270.method27356(class513);
        final int n = MathHelper.floor(class513.method1938()) >> 4;
        final int n2 = MathHelper.floor(class513.method1945()) >> 4;
        if (!b) {
            final Class353 method1349 = class513.method2961();
            this.field2270.method27353(method1349.method1115().method25422(), class513);
            if (!method1348) {
                this.field2266.method30137(method1349, class513);
            }
        }
        else {
            this.field2270.method27352(Class7859.method25423(n, n2), class513, method1347);
            this.method1349(class513);
            if (!method1347) {
                this.field2266.method30136(Class353.method1091(class513), class513);
            }
        }
        for (int i = n - this.field2273; i <= n + this.field2273; ++i) {
            for (int j = n2 - this.field2273; j <= n2 + this.field2273; ++j) {
                this.method1339(class513, new Class7859(i, j), new Class4252[2], !b, b);
            }
        }
    }
    
    private Class353 method1349(final Class513 class513) {
        final Class353 method1091 = Class353.method1091(class513);
        class513.method2962(method1091);
        class513.field3039.method17469(new Class4379(method1091.method1102(), method1091.method1104()));
        return method1091;
    }
    
    public void method1350(final Class513 class513) {
        for (final Class9406 class514 : this.field2271.values()) {
            if (Class9406.method34989(class514) != class513) {
                class514.method34986(class513);
            }
            else {
                class514.method34988(this.field2254.method6840());
            }
        }
        final int n = MathHelper.floor(class513.method1938()) >> 4;
        final int n2 = MathHelper.floor(class513.method1945()) >> 4;
        final Class353 method2961 = class513.method2961();
        final Class353 method2962 = Class353.method1091(class513);
        final long method2963 = method2961.method1115().method25422();
        final long method2964 = method2962.method1115().method25422();
        final boolean method2965 = this.field2270.method27357(class513);
        final boolean method2966 = this.method1347(class513);
        if (method2961.method1117() != method2962.method1117() || method2965 != method2966) {
            this.method1349(class513);
            if (!method2965) {
                this.field2266.method30137(method2961, class513);
            }
            if (!method2966) {
                this.field2266.method30136(method2962, class513);
            }
            if (!method2965) {
                if (method2966) {
                    this.field2270.method27354(class513);
                }
            }
            if (method2965) {
                if (!method2966) {
                    this.field2270.method27355(class513);
                }
            }
            if (method2963 != method2964) {
                this.field2270.method27358(method2963, method2964, class513);
            }
        }
        final int method2967 = method2961.method1102();
        final int method2968 = method2961.method1104();
        if (Math.abs(method2967 - n) <= this.field2273 * 2 && Math.abs(method2968 - n2) <= this.field2273 * 2) {
            final int n3 = Math.min(n, method2967) - this.field2273;
            final int n4 = Math.min(n2, method2968) - this.field2273;
            final int n5 = Math.max(n, method2967) + this.field2273;
            final int n6 = Math.max(n2, method2968) + this.field2273;
            for (int i = n3; i <= n5; ++i) {
                for (int j = n4; j <= n6; ++j) {
                    final Class7859 class515 = new Class7859(i, j);
                    this.method1339(class513, class515, new Class4252[2], method1314(class515, method2967, method2968) <= this.field2273, method1314(class515, n, n2) <= this.field2273);
                }
            }
        }
        else {
            for (int k = method2967 - this.field2273; k <= method2967 + this.field2273; ++k) {
                for (int l = method2968 - this.field2273; l <= method2968 + this.field2273; ++l) {
                    this.method1339(class513, new Class7859(k, l), new Class4252[2], true, false);
                }
            }
            for (int n7 = n - this.field2273; n7 <= n + this.field2273; ++n7) {
                for (int n8 = n2 - this.field2273; n8 <= n2 + this.field2273; ++n8) {
                    this.method1339(class513, new Class7859(n7, n8), new Class4252[2], false, true);
                }
            }
        }
    }
    
    @Override
    public Stream<Class513> method1351(final Class7859 class7859, final boolean b) {
        return this.field2270.method27351(class7859.method25422()).filter(class7861 -> {
            method1313(class7860, class7861, true);
            final int n;
            if (n <= this.field2273) {
                return !b2 || n == this.field2273;
            }
            else {
                return false;
            }
        });
    }
    
    public void method1352(final Entity class399) {
        if (!(class399 instanceof Class859)) {
            if (!(class399 instanceof Class422)) {
                final Class7499<?> method1642 = class399.method1642();
                final int n = method1642.method23380() * 16;
                final int method1643 = method1642.method23381();
                if (this.field2271.containsKey(class399.method1643())) {
                    throw Class8349.method27859(new IllegalStateException("Entity is already tracked!"));
                }
                final Class9406 class400 = new Class9406(this, class399, n, method1643, method1642.method23382());
                this.field2271.put(class399.method1643(), (Object)class400);
                class400.method34988(this.field2254.method6840());
                if (class399 instanceof Class513) {
                    final Class513 class401 = (Class513)class399;
                    this.method1348(class401, true);
                    for (final Class9406 class402 : this.field2271.values()) {
                        if (Class9406.method34989(class402) == class401) {
                            continue;
                        }
                        class402.method34986(class401);
                    }
                }
            }
        }
    }
    
    public void method1353(final Entity class399) {
        if (class399 instanceof Class513) {
            final Class513 class400 = (Class513)class399;
            this.method1348(class400, false);
            final ObjectIterator iterator = this.field2271.values().iterator();
            while (((Iterator)iterator).hasNext()) {
                ((Class9406)((Iterator)iterator).next()).method34985(class400);
            }
        }
        final Class9406 class401 = (Class9406)this.field2271.remove(class399.method1643());
        if (class401 != null) {
            class401.method34984();
        }
    }
    
    public void method1354() {
        final ArrayList arrayList = Lists.newArrayList();
        final List<Class513> method6840 = this.field2254.method6840();
        for (final Class9406 class9406 : this.field2271.values()) {
            final Class353 method6841 = Class9406.method34990(class9406);
            final Class353 method6842 = Class353.method1091(Class9406.method34989(class9406));
            if (!Objects.equals(method6841, method6842)) {
                class9406.method34988(method6840);
                final Entity method6843 = Class9406.method34989(class9406);
                if (method6843 instanceof Class513) {
                    arrayList.add(method6843);
                }
                Class9406.method34991(class9406, method6842);
            }
            Class9406.method34992(class9406).method32538();
        }
        if (!arrayList.isEmpty()) {
            final ObjectIterator iterator2 = this.field2271.values().iterator();
            while (((Iterator)iterator2).hasNext()) {
                ((Class9406)((Iterator)iterator2).next()).method34988(arrayList);
            }
        }
    }
    
    public void method1355(final Entity class399, final Class4252<?> class400) {
        final Class9406 class401 = (Class9406)this.field2271.get(class399.method1643());
        if (class401 != null) {
            class401.method34982(class400);
        }
    }
    
    public void method1356(final Entity class399, final Class4252<?> class400) {
        final Class9406 class401 = (Class9406)this.field2271.get(class399.method1643());
        if (class401 != null) {
            class401.method34983(class400);
        }
    }
    
    private void method1357(final Class513 class513, final Class4252<?>[] array, final Class1862 class514) {
        if (array[0] == null) {
            array[0] = new Class4298(class514, 65535);
            array[1] = new Class4349(class514.method7019(), this.field2255);
        }
        class513.method2959(class514.method7019(), array[0], array[1]);
        Class9324.method34531(this.field2254, class514.method7019());
        final ArrayList arrayList = Lists.newArrayList();
        final ArrayList arrayList2 = Lists.newArrayList();
        for (final Class9406 class515 : this.field2271.values()) {
            final Entity method34989 = Class9406.method34989(class515);
            if (method34989 == class513) {
                continue;
            }
            if (method34989.field2441 != class514.method7019().field32290) {
                continue;
            }
            if (method34989.field2443 != class514.method7019().field32291) {
                continue;
            }
            class515.method34986(class513);
            if (method34989 instanceof Class759) {
                if (((Class759)method34989).method4206() != null) {
                    arrayList.add(method34989);
                }
            }
            if (method34989.method1908().isEmpty()) {
                continue;
            }
            arrayList2.add(method34989);
        }
        if (!arrayList.isEmpty()) {
            for (final Entity class516 : arrayList) {
                class513.field3039.method17469(new Class4305(class516, ((Class759)class516).method4206()));
            }
        }
        if (!arrayList2.isEmpty()) {
            final Iterator iterator3 = arrayList2.iterator();
            while (iterator3.hasNext()) {
                class513.field3039.method17469(new Class4286((Entity)iterator3.next()));
            }
        }
    }
    
    public Class1883 method1358() {
        return this.field2259;
    }
    
    public CompletableFuture<Void> method1359(final Class1862 class1862) {
        return this.field2256.method5379(() -> class1863.method7072(this.field2254));
    }
    
    static {
        field2248 = LogManager.getLogger();
        field2249 = 33 + Class9312.method34440();
    }
}
