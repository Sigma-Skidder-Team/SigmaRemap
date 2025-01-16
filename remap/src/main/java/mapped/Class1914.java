// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;

import java.util.Iterator;
import java.util.concurrent.locks.LockSupport;
import java.util.function.Function;
import javax.annotation.Nullable;
import java.util.concurrent.CompletionException;
import java.io.IOException;
import com.google.common.collect.Maps;
import com.google.common.collect.Queues;
import java.util.concurrent.CompletableFuture;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.logging.log4j.Logger;

public class Class1914 implements AutoCloseable
{
    private static final Logger field10406;
    private final Thread field10407;
    private final AtomicBoolean field10408;
    private final Queue<Runnable> field10409;
    private final Class1881 field10410;
    private final Map<Class7859, Class7312> field10411;
    private boolean field10412;
    private CompletableFuture<Void> field10413;
    
    public Class1914(final Class1881 field10410, final String str) {
        this.field10408 = new AtomicBoolean();
        this.field10409 = Queues.newConcurrentLinkedQueue();
        this.field10411 = Maps.newLinkedHashMap();
        this.field10412 = true;
        this.field10413 = new CompletableFuture<Void>();
        this.field10410 = field10410;
        (this.field10407 = new Thread(this::method7562)).setName(str + " IO worker");
        this.field10407.start();
    }
    
    public CompletableFuture<Void> method7556(final Class7859 class7859, final CompoundNBT class7860) {
        return this.method7560(p2 -> () -> {
            final Class7312 class7862 = this.field10411.computeIfAbsent(key, p0 -> new Class7312(null));
            Class7312.method22430(class7862, class7861);
            Class7312.method22429(class7862).whenComplete((p1, ex) -> {
                if (ex == null) {
                    completableFuture2.complete(null);
                }
                else {
                    completableFuture2.completeExceptionally(ex);
                }
            });
        });
    }
    
    @Nullable
    public CompoundNBT method7557(final Class7859 class7859) throws IOException {
        final CompletableFuture<CompoundNBT> method7560 = this.method7560(p1 -> () -> {
            final Class7312 class7861 = this.field10411.get(class7860);
            if (class7861 != null) {
                completableFuture2.complete(Class7312.method22428(class7861));
            }
            else {
                try {
                    completableFuture2.complete(this.field10410.method7176(class7860));
                }
                catch (final Exception ex2) {
                    Class1914.field10406.warn("Failed to read chunk {}", (Object)class7860, (Object)ex2);
                    completableFuture2.completeExceptionally(ex2);
                }
            }
            return;
        });
        try {
            return method7560.join();
        }
        catch (final CompletionException ex) {
            if (ex.getCause() instanceof IOException) {
                throw (IOException)ex.getCause();
            }
        }
        throw;
    }
    
    private CompletableFuture<Void> method7558() {
        return this.method7560(p0 -> () -> {
            this.field10412 = false;
            this.field10413 = field10413;
        });
    }
    
    public CompletableFuture<Void> method7559() {
        return this.method7560(p0 -> () -> CompletableFuture.allOf((CompletableFuture<?>[])this.field10411.values().stream().map(class7312 -> Class7312.method22429(class7312)).toArray(CompletableFuture[]::new)).whenComplete((p1, p2) -> completableFuture2.complete(null)));
    }
    
    private <T> CompletableFuture<T> method7560(final Function<CompletableFuture<T>, Runnable> function) {
        final CompletableFuture completableFuture = new CompletableFuture();
        this.field10409.add(function.apply(completableFuture));
        LockSupport.unpark(this.field10407);
        return completableFuture;
    }
    
    private void method7561() {
        LockSupport.park("waiting for tasks");
    }
    
    private void method7562() {
        try {
            while (this.field10412) {
                final boolean method7567 = this.method7567();
                final boolean method7568 = this.method7563();
                if (!method7567 && !method7568) {
                    this.method7561();
                }
            }
            this.method7567();
            this.method7564();
        }
        finally {
            this.method7566();
        }
    }
    
    private boolean method7563() {
        final Iterator<Map.Entry<Class7859, Class7312>> iterator = this.field10411.entrySet().iterator();
        if (iterator.hasNext()) {
            final Map.Entry entry = iterator.next();
            iterator.remove();
            this.method7565((Class7859)entry.getKey(), (Class7312)entry.getValue());
            return true;
        }
        return false;
    }
    
    private void method7564() {
        this.field10411.forEach(this::method7565);
        this.field10411.clear();
    }
    
    private void method7565(final Class7859 class7859, final Class7312 class7860) {
        try {
            this.field10410.method7177(class7859, Class7312.method22428(class7860));
            Class7312.method22429(class7860).complete(null);
        }
        catch (final Exception ex) {
            Class1914.field10406.error("Failed to store chunk {}", (Object)class7859, (Object)ex);
            Class7312.method22429(class7860).completeExceptionally(ex);
        }
    }
    
    private void method7566() {
        try {
            this.field10410.close();
            this.field10413.complete(null);
        }
        catch (final Exception ex) {
            Class1914.field10406.error("Failed to close storage", (Throwable)ex);
            this.field10413.completeExceptionally(ex);
        }
    }
    
    private boolean method7567() {
        boolean b = false;
        Runnable runnable;
        while ((runnable = this.field10409.poll()) != null) {
            b = true;
            runnable.run();
        }
        return b;
    }
    
    @Override
    public void close() throws IOException {
        if (this.field10408.compareAndSet(false, true)) {
            try {
                this.method7558().join();
                return;
            }
            catch (final CompletionException ex) {
                if (ex.getCause() instanceof IOException) {
                    throw (IOException)ex.getCause();
                }
            }
            throw;
        }
    }
    
    static {
        field10406 = LogManager.getLogger();
    }
}
