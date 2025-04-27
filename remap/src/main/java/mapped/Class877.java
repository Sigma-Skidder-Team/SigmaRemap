// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import it.unimi.dsi.fastutil.ints.Int2BooleanFunction;
import java.util.concurrent.RejectedExecutionException;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.Logger;

public class Class877<T> implements Class875<T>, AutoCloseable, Runnable
{
    private static final Logger field4727;
    private final AtomicInteger field4728;
    public final Class7121<? super T, ? extends Runnable> field4729;
    private final Executor field4730;
    private final String field4731;
    
    public static Class877<Runnable> method5393(final Executor executor, final String s) {
        return new Class877<Runnable>((Class7121<? super Runnable, ? extends Runnable>)new Class7120(new ConcurrentLinkedQueue<Object>()), executor, s);
    }
    
    public Class877(final Class7121<? super T, ? extends Runnable> field4729, final Executor field4730, final String field4731) {
        this.field4728 = new AtomicInteger(0);
        this.field4730 = field4730;
        this.field4729 = field4729;
        this.field4731 = field4731;
    }
    
    private boolean method5394() {
        int value;
        do {
            value = this.field4728.get();
        } while (!this.field4728.compareAndSet(value, value | 0x2));
        return true;
    }
    
    private void method5395() {
        int value;
        do {
            value = this.field4728.get();
        } while (!this.field4728.compareAndSet(value, value & 0xFFFFFFFD));
    }
    
    private boolean method5396() {
        return (this.field4728.get() & 0x1) == 0x0 && !this.field4729.method21858();
    }
    
    @Override
    public void close() {
        int value;
        do {
            value = this.field4728.get();
        } while (!this.field4728.compareAndSet(value, value | 0x1));
    }
    
    private boolean method5397() {
        return (this.field4728.get() & 0x2) != 0x0;
    }
    
    private boolean method5398() {
        if (!this.method5397()) {
            return false;
        }
        final Runnable runnable = this.field4729.method21856();
        if (runnable != null) {
            runnable.run();
            return true;
        }
        return false;
    }
    
    @Override
    public void run() {
        try {
            this.method5400(n -> n == 0);
        }
        finally {
            this.method5395();
            this.method5399();
        }
    }
    
    @Override
    public void method5386(final T t) {
        this.field4729.method21857(t);
        this.method5399();
    }
    
    private void method5399() {
        if (this.method5396() && this.method5394()) {
            try {
                this.field4730.execute(this);
            }
            catch (final RejectedExecutionException ex) {
                final Class877 class877 = this;
                final Executor executor = class877.field4730;
                final Class877 class878 = this;
                executor.execute(class878);
            }
        }
        return;
        try {
            final Class877 class877 = this;
            final Executor executor = class877.field4730;
            final Class877 class878 = this;
            executor.execute(class878);
        }
        catch (final RejectedExecutionException ex2) {
            Class877.field4727.error("Cound not schedule mailbox", ex2);
        }
    }
    
    private int method5400(final Int2BooleanFunction int2BooleanFunction) {
        int n;
        for (n = 0; int2BooleanFunction.get(n) && this.method5398(); ++n) {}
        return n;
    }
    
    @Override
    public String toString() {
        return this.field4731 + " " + this.field4728.get() + " " + this.field4729.method21858();
    }
    
    @Override
    public String method5376() {
        return this.field4731;
    }
    
    static {
        field4727 = LogManager.getLogger();
    }
}
