// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;
import org.apache.logging.log4j.LogManager;

import java.util.UUID;
import com.mojang.datafixers.Dynamic;
import java.util.Optional;
import java.util.concurrent.CompletionStage;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.Hash$Strategy;
import java.util.function.Consumer;
import java.util.function.Supplier;
import com.google.common.collect.Iterators;
import java.util.Iterator;
import java.util.List;
import java.lang.management.ManagementFactory;
import java.util.stream.Stream;
import java.util.Locale;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Executor;
import com.google.common.util.concurrent.MoreExecutors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.CompletionException;
import java.time.Instant;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.stream.Collector;
import org.apache.logging.log4j.Logger;
import java.util.function.LongSupplier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

public class Util
{
    private static final AtomicInteger field34266;
    private static final ExecutorService field34267;
    public static LongSupplier field34268;
    private static final Logger field34269;
    private static Exception field34270;
    
    public static <K, V> Collector<Map.Entry<? extends K, ? extends V>, ?, Map<K, V>> method27834() {
        return Collectors.toMap((Function<? super Map.Entry<? extends K, ? extends V>, ? extends K>)Map.Entry::getKey, (Function<? super Map.Entry<? extends K, ? extends V>, ? extends V>)Map.Entry::getValue);
    }
    
    public static <T extends Comparable<T>> String method27835(final IProperty<T> class7111, final Object o) {
        return class7111.getName((T)o);
    }
    
    public static String method27836(final String s, final ResourceLocation class1932) {
        return (class1932 != null) ? (s + '.' + class1932.method7798() + '.' + class1932.method7797().replace('/', '.')) : (s + ".unregistered_sadface");
    }
    
    public static long method27837() {
        return method27838() / 1000000L;
    }
    
    public static long method27838() {
        return Util.field34268.getAsLong();
    }
    
    public static long method27839() {
        return Instant.now().toEpochMilli();
    }
    
    private static ExecutorService method27840() {
        final int method35651 = MathHelper.method35651(Runtime.getRuntime().availableProcessors() - 1, 1, 7);
        Object directExecutorService;
        if (method35651 > 0) {
            directExecutorService = new ForkJoinPool(method35651, forkJoinPool -> {
                final Class904 class904 = new Class904(forkJoinPool);
                class904.setName("Server-Worker-" + Util.field34266.getAndIncrement());
                return class904;
            }, (thread, cause) -> {
                pauseDevMode(cause);
                if (cause instanceof CompletionException) {
                    cause = cause.getCause();
                }
                if (cause instanceof ReportedException) {
                    Class9280.method34259(((ReportedException)cause).method9500().method24414());
                    System.exit(-1);
                }
                Util.field34269.error(String.format("Caught exception in thread %s", thread), cause);
            }, true);
        }
        else {
            directExecutorService = MoreExecutors.newDirectExecutorService();
        }
        return (ExecutorService)directExecutorService;
    }
    
    public static Executor method27841() {
        return Util.field34267;
    }
    
    public static void method27842() {
        Util.field34267.shutdown();
        boolean awaitTermination;
        try {
            awaitTermination = Util.field34267.awaitTermination(3L, TimeUnit.SECONDS);
        }
        catch (final InterruptedException ex) {
            awaitTermination = false;
        }
        if (!awaitTermination) {
            Util.field34267.shutdownNow();
        }
    }
    
    public static <T> CompletableFuture<T> method27843(final Throwable ex) {
        final CompletableFuture completableFuture = new CompletableFuture();
        completableFuture.completeExceptionally(ex);
        return completableFuture;
    }
    
    public static void method27844(final Throwable cause) {
        throw (cause instanceof RuntimeException) ? cause : new RuntimeException(cause);
    }
    
    public static Class306 method27845() {
        final String lowerCase = System.getProperty("os.name").toLowerCase(Locale.ROOT);
        if (lowerCase.contains("win")) {
            return Class306.field1833;
        }
        if (lowerCase.contains("mac")) {
            return Class306.field1834;
        }
        if (lowerCase.contains("solaris")) {
            return Class306.field1832;
        }
        if (lowerCase.contains("sunos")) {
            return Class306.field1832;
        }
        if (!lowerCase.contains("linux")) {
            return lowerCase.contains("unix") ? Class306.field1831 : Class306.field1835;
        }
        return Class306.field1831;
    }
    
    public static Stream<String> method27846() {
        return ManagementFactory.getRuntimeMXBean().getInputArguments().stream().filter(s -> s.startsWith("-X"));
    }
    
    public static <T> T method27847(final List<T> list) {
        return list.get(list.size() - 1);
    }
    
    public static <T> T method27848(final Iterable<T> iterable, final T t) {
        final Iterator<T> iterator = iterable.iterator();
        final T next = iterator.next();
        if (t != null) {
            T next2 = next;
            while (next2 != t) {
                if (!iterator.hasNext()) {
                    continue;
                }
                next2 = iterator.next();
            }
            if (iterator.hasNext()) {
                return iterator.next();
            }
        }
        return next;
    }
    
    public static <T> T method27849(final Iterable<T> iterable, final T t) {
        final Iterator<T> iterator = iterable.iterator();
        Object o = null;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            if (next != t) {
                o = next;
            }
            else {
                if (o != null) {
                    break;
                }
                o = (iterator.hasNext() ? Iterators.getLast((Iterator)iterator) : t);
                break;
            }
        }
        return (T)o;
    }
    
    public static <T> T method27850(final Supplier<T> supplier) {
        return supplier.get();
    }
    
    public static <T> T method27851(final T t, final Consumer<T> consumer) {
        consumer.accept(t);
        return t;
    }
    
    public static <K> Hash$Strategy<K> method27852() {
        return (Hash$Strategy<K>)Class1996.field11182;
    }
    
    public static <V> CompletableFuture<List<V>> method27853(final List<? extends CompletableFuture<? extends V>> list) {
        Lists.newArrayListWithCapacity(list.size());
        final CompletableFuture[] cfs = new CompletableFuture[list.size()];
        final CompletableFuture other = new CompletableFuture();
        list.forEach(completableFuture -> {
            list2.size();
            list2.add(null);
            final int n;
            array[n] = completableFuture.whenComplete((o, ex) -> {
                if (ex == null) {
                    list3.set(n2, o);
                }
                else {
                    completableFuture2.completeExceptionally(ex);
                }
            });
        });
        return CompletableFuture.allOf(cfs).applyToEither((CompletionStage<? extends Void>)other, p1 -> list4);
    }
    
    public static <T> Stream<T> method27854(final Optional<? extends T> optional) {
        return optional.isPresent() ? Stream.of(optional.get()) : Stream.empty();
    }
    
    public static <T> Optional<T> method27855(final Optional<T> optional, final Consumer<T> consumer, final Runnable runnable) {
        if (!optional.isPresent()) {
            runnable.run();
        }
        else {
            consumer.accept(optional.get());
        }
        return optional;
    }
    
    public static Runnable method27856(final Runnable runnable, final Supplier<String> supplier) {
        return runnable;
    }
    
    public static Optional<UUID> method27857(final String str, final Dynamic<?> dynamic) {
        return dynamic.get(str + "Most").asNumber().flatMap(p2 -> dynamic2.get(str2 + "Least").asNumber().map(n2 -> new UUID(n.longValue(), n2.longValue())));
    }
    
    public static <T> Dynamic<T> method27858(final String s, final UUID uuid, final Dynamic<T> dynamic) {
        return dynamic.set(s + "Most", dynamic.createLong(uuid.getMostSignificantBits())).set(s + "Least", dynamic.createLong(uuid.getLeastSignificantBits()));
    }
    
    public static <T extends Throwable> T pauseDevMode(final T t) {
        if (Class9528.field41021) {
            Util.field34269.error("Trying to throw a fatal exception, pausing in IDE", t);
            try {
                while (true) {
                    Thread.sleep(1000L);
                    Util.field34269.error("paused");
                }
            }
            catch (final InterruptedException ex) {
                return t;
            }
        }
        return t;
    }
    
    public static String method27860(final Throwable t) {
        if (t.getCause() == null) {
            return (t.getMessage() == null) ? t.toString() : t.getMessage();
        }
        return method27860(t.getCause());
    }
    
    public static Exception method27861() {
        return Util.field34270;
    }
    
    public static void method27862(final Exception field34270) {
        Util.field34270 = field34270;
    }
    
    static {
        field34266 = new AtomicInteger(1);
        field34267 = method27840();
        Util.field34268 = System::nanoTime;
        field34269 = LogManager.getLogger();
    }
}
