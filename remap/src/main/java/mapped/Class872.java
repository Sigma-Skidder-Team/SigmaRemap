// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.function.BooleanSupplier;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import com.google.common.collect.Queues;
import java.util.Queue;
import org.apache.logging.log4j.Logger;
import java.util.concurrent.Executor;

public abstract class Class872<R extends Runnable> implements Class875<R>, Executor
{
    private final String field4717;
    private static final Logger field4718;
    private final Queue<R> field4719;
    private int field4720;
    
    public Class872(final String field4717) {
        this.field4719 = Queues.newConcurrentLinkedQueue();
        this.field4717 = field4717;
    }
    
    public abstract R method1601(final Runnable p0);
    
    public abstract boolean method1600(final R p0);
    
    public boolean method5374() {
        return Thread.currentThread() == this.method1561();
    }
    
    public abstract Thread method1561();
    
    public boolean method1560() {
        return !this.method5374();
    }
    
    public int method5375() {
        return this.field4719.size();
    }
    
    @Override
    public String method5376() {
        return this.field4717;
    }
    
    public <V> CompletableFuture<V> method5377(final Supplier<V> supplier) {
        return this.method1560() ? CompletableFuture.supplyAsync(supplier, this) : CompletableFuture.completedFuture(supplier.get());
    }
    
    private CompletableFuture<Void> method5378(final Runnable runnable) {
        return CompletableFuture.supplyAsync(() -> {
            runnable2.run();
            return null;
        }, this);
    }
    
    public CompletableFuture<Void> method5379(final Runnable runnable) {
        if (!this.method1560()) {
            runnable.run();
            return CompletableFuture.completedFuture(null);
        }
        return this.method5378(runnable);
    }
    
    public void method5380(final Runnable runnable) {
        if (this.method5374()) {
            runnable.run();
        }
        else {
            this.method5378(runnable).join();
        }
    }
    
    public void method5381(final R r) {
        this.field4719.add(r);
        LockSupport.unpark(this.method1561());
    }
    
    @Override
    public void execute(final Runnable runnable) {
        if (!this.method1560()) {
            runnable.run();
        }
        else {
            this.method5381(this.method1601(runnable));
        }
    }
    
    public void method5382() {
        this.field4719.clear();
    }
    
    public void method5383() {
        while (this.method1461()) {}
    }
    
    public boolean method1461() {
        final Runnable runnable = this.field4719.peek();
        if (runnable == null) {
            return false;
        }
        if (this.field4720 == 0 && !this.method1600((R)runnable)) {
            return false;
        }
        this.run(this.field4719.remove());
        return true;
    }
    
    public void method5384(final BooleanSupplier booleanSupplier) {
        ++this.field4720;
        try {
            while (!booleanSupplier.getAsBoolean()) {
                if (!this.method1461()) {
                    this.method5385();
                }
            }
        }
        finally {
            --this.field4720;
        }
    }
    
    public void method5385() {
        Thread.yield();
        LockSupport.parkNanos("waiting for tasks", 100000L);
    }
    
    public void run(final R r) {
        try {
            r.run();
        }
        catch (final Exception ex) {
            Class872.field4718.fatal("Error executing task on {}", this.method5376(), ex);
            if (ex.getCause() instanceof OutOfMemoryError) {
                throw (OutOfMemoryError)ex.getCause();
            }
        }
    }
    
    static {
        field4718 = LogManager.getLogger();
    }
}
