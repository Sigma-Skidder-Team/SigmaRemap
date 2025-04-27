// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.ChunkPos;
import org.apache.logging.log4j.LogManager;
import com.google.common.annotations.VisibleForTesting;
import java.util.stream.Stream;
import java.util.stream.Collector;
import java.util.concurrent.CompletableFuture;
import java.util.Optional;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import com.google.common.collect.Sets;
import java.util.stream.Collectors;
import java.util.concurrent.Executor;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.Map;
import org.apache.logging.log4j.Logger;

public class Class1910 implements AutoCloseable, Class1911
{
    private static final Logger field10362;
    private final Map<Class875<?>, Class8587<? extends Function<Class875<Class315>, ?>>> field10363;
    private final Set<Class875<?>> field10364;
    private final Class877<Class1414> field10365;
    
    public Class1910(final List<Class875<?>> list, final Executor executor, final int n) {
        this.field10363 = list.stream().collect(Collectors.toMap((Function<? super Object, ? extends Class875<?>>)Function.identity(), class875 -> {
            new Class8587(class875.method5376() + "_queue", n2);
            return;
        }));
        this.field10364 = Sets.newHashSet((Iterable)list);
        this.field10365 = new Class877<Class1414>(new Class7122(4), executor, "sorter");
    }
    
    public static Class7701<Runnable> method7463(final Runnable runnable, final long n, final IntSupplier intSupplier) {
        return new Class7701<Runnable>(p1 -> () -> {
            runnable2.run();
            class875.method5386(Class315.field1875);
        }, n, intSupplier, null);
    }
    
    public static Class7701<Runnable> method7464(final Class9298 class9298, final Runnable runnable) {
        return method7463(runnable, class9298.method34357().method25422(), class9298::method34359);
    }
    
    public static Class8960 method7465(final Runnable runnable, final long n, final boolean b) {
        return new Class8960(runnable, n, b, null);
    }
    
    public <T> Class875<Class7701<T>> method7466(final Class875<T> class875, final boolean b) {
        return this.field10365.method5391(p2 -> new Class1414(0, () -> {
            this.method7472(class876);
            class877.method5386(Class875.method5392("chunk priority sorter around " + class876.method5376(), class879 -> this.method7470(class878, (Function<Class875<Class315>, Object>)Class7701.method24532(class879), Class7701.method24533(class879), Class7701.method24534(class879), b2)));
        })).join();
    }
    
    public Class875<Class8960> method7467(final Class875<Runnable> class875) {
        return this.field10365.method5391(p1 -> new Class1414(0, () -> class876.method5386(Class875.method5392("chunk priority sorter around " + class877.method5376(), class879 -> this.method7469((Class875<Object>)class878, Class8960.method31794(class879), Class8960.method31795(class879), Class8960.method31796(class879)))))).join();
    }
    
    @Override
    public void method7468(final ChunkPos class7859, final IntSupplier intSupplier, final int n, final IntConsumer intConsumer) {
        this.field10365.method5386(new Class1414(0, () -> {
            this.field10363.values().forEach(class7861 -> {
                intSupplier2.getAsInt();
                class7861.method29074(n3, class7860, n4);
            });
            intConsumer2.accept(n2);
        }));
    }
    
    private <T> void method7469(final Class875<T> class875, final long n, final Runnable runnable, final boolean b) {
        this.field10365.method5386(new Class1414(1, () -> {
            this.method7472((Class875<T>)class876);
            final Class8587 class877;
            class877.method29076(n2, b2);
            if (this.field10364.remove(class876)) {
                this.method7471(class877, class876);
            }
            runnable2.run();
        }));
    }
    
    private <T> void method7470(final Class875<T> class875, final Function<Class875<Class315>, T> function, final long n, final IntSupplier intSupplier, final boolean b) {
        this.field10365.method5386(new Class1414(2, () -> {
            this.method7472((Class875<T>)class876);
            intSupplier2.getAsInt();
            final Class8587 class877;
            final int n3;
            class877.method29075(Optional.of(value), n2, n3);
            if (b2) {
                class877.method29075(Optional.empty(), n2, n3);
            }
            if (this.field10364.remove(class876)) {
                this.method7471(class877, class876);
            }
        }));
    }
    
    private <T> void method7471(final Class8587<Function<Class875<Class315>, T>> class8587, final Class875<T> class8588) {
        this.field10365.method5386(new Class1414(3, () -> {
            class8589.method29078();
            final Stream stream;
            if (stream != null) {
                Util.method27853((List<? extends CompletableFuture<?>>)stream.map(either -> (CompletableFuture)either.map((Function)class8591::method5391, runnable -> {
                    runnable.run();
                    return CompletableFuture.completedFuture(Class315.field1875);
                })).collect(Collectors.toList())).thenAccept(p2 -> this.method7471(class8592, class8593));
            }
            else {
                this.field10364.add(class8590);
            }
        }));
    }
    
    private <T> Class8587<Function<Class875<Class315>, T>> method7472(final Class875<T> obj) {
        final Class8587 class8587 = this.field10363.get(obj);
        if (class8587 != null) {
            return class8587;
        }
        throw Util.pauseDevMode(new IllegalArgumentException("No queue for: " + obj));
    }
    
    @VisibleForTesting
    public String method7473() {
        return this.field10363.entrySet().stream().map(entry -> entry.getKey().method5376() + "=[" + entry.getValue().method29079().stream().map(obj -> obj + ":" + new ChunkPos(obj)).collect((Collector<? super Object, ?, String>)Collectors.joining(",")) + "]").collect((Collector<? super Object, ?, String>)Collectors.joining(",")) + ", s=" + this.field10364.size();
    }
    
    @Override
    public void close() {
        this.field10363.keySet().forEach(Class875::close);
    }
    
    static {
        field10362 = LogManager.getLogger();
    }
}
