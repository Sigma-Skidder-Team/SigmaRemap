// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.List;
import com.google.common.base.Stopwatch;
import org.apache.logging.log4j.Logger;

public class Class8205 extends Class8206<Class7597>
{
    private static final Logger field33732;
    private final Stopwatch field33733;
    
    public Class8205(final Class6582 class6582, final List<Class1662> list, final Executor executor, final Executor executor2, final CompletableFuture<Class315> completableFuture) {
        super(executor, executor2, class6582, list, (class7885, class7886, class7887, executor2, executor3) -> {
            final AtomicLong atomicLong = new AtomicLong();
            final AtomicLong atomicLong2 = new AtomicLong();
            return class7887.method5785(class7885, class7886, new Class5030(Util.method27838(), () -> 0, false), new Class5030(Util.method27838(), () -> 0, false), p2 -> executor4.execute(() -> {
                Util.method27838();
                runnable2.run();
                final long n;
                atomicLong3.addAndGet(Util.method27838() - n);
            }), p2 -> executor5.execute(() -> {
                Util.method27838();
                runnable4.run();
                final long n2;
                atomicLong4.addAndGet(Util.method27838() - n2);
            })).thenApplyAsync(p5 -> new Class7597(class7888.method5848(), class7889.method15304(), class7890.method15304(), atomicLong5, atomicLong6, null), executor2);
        }, completableFuture);
        (this.field33733 = Stopwatch.createUnstarted()).start();
        this.field33737.thenAcceptAsync((Consumer<? super List<S>>)this::method27178, executor2);
    }
    
    private void method27178(final List<Class7597> list) {
        this.field33733.stop();
        int i = 0;
        Class8205.field33732.info("Resource reload finished after " + this.field33733.elapsed(TimeUnit.MILLISECONDS) + " ms");
        for (final Class7597 class7597 : list) {
            Class7597.method23893(class7597);
            Class7597.method23894(class7597);
            final int j = (int)(Class7597.method23895(class7597).get() / 1000000.0);
            final int k = (int)(Class7597.method23896(class7597).get() / 1000000.0);
            Class8205.field33732.info(Class7597.method23897(class7597) + " took approximately " + (j + k) + " ms (" + j + " ms preparing, " + k + " ms applying)");
            i += k;
        }
        Class8205.field33732.info("Total blocking time: " + i + " ms");
    }
    
    static {
        field33732 = LogManager.getLogger();
    }
}
