// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledExecutorService;

public abstract class Class960 extends Class961
{
    private boolean field5103;
    private boolean field5104;
    private ScheduledExecutorService field5105;
    private ScheduledFuture field5106;
    private long field5107;
    private boolean field5108;
    private final Object field5109;
    
    public Class960() {
        this.field5107 = TimeUnit.SECONDS.toNanos(60L);
        this.field5108 = false;
        this.field5109 = new Object();
    }
    
    public int method5536() {
        synchronized (this.field5109) {
            return (int)TimeUnit.NANOSECONDS.toSeconds(this.field5107);
        }
    }
    
    public void method5537(final int n) {
        synchronized (this.field5109) {
            this.field5107 = TimeUnit.SECONDS.toNanos(n);
            if (this.field5107 <= 0L) {
                this.method5542();
                return;
            }
            if (this.field5108) {
                try {
                    for (final Class957 class957 : new ArrayList(this.method5462())) {
                        if (class957 instanceof Class958) {
                            ((Class958)class957).method5530();
                        }
                    }
                }
                catch (final Exception ex) {
                    ex.printStackTrace();
                }
                this.method5540();
            }
        }
    }
    
    public void method5538() {
        synchronized (this.field5109) {
            if (this.field5105 != null || this.field5106 != null) {
                this.field5108 = false;
                this.method5542();
            }
        }
    }
    
    public void method5539() {
        synchronized (this.field5109) {
            if (this.field5107 <= 0L) {
                return;
            }
            this.field5108 = true;
            this.method5540();
        }
    }
    
    private void method5540() {
        this.method5542();
        this.field5105 = Executors.newSingleThreadScheduledExecutor(new Class7365("connectionLostChecker"));
        this.field5106 = this.field5105.scheduleAtFixedRate(new Class1606(this), this.field5107, this.field5107, TimeUnit.NANOSECONDS);
    }
    
    private void method5541(final Class957 class957, final long n) {
        if (class957 instanceof Class958) {
            final Class958 class958 = (Class958)class957;
            if (class958.method5529() >= n) {
                if (class958.method5489()) {
                    class958.method5463();
                }
            }
            else {
                class958.method5496(1006, "The connection was closed because the other endpoint did not respond with a pong in time. For more information check: https://github.com/TooTallNate/Java-WebSocket/wiki/Lost-connection-detection");
            }
        }
    }
    
    public abstract Collection<Class957> method5462();
    
    private void method5542() {
        if (this.field5105 != null) {
            this.field5105.shutdownNow();
            this.field5105 = null;
        }
        if (this.field5106 != null) {
            this.field5106.cancel(false);
            this.field5106 = null;
        }
    }
    
    public boolean method5543() {
        return this.field5103;
    }
    
    public void method5544(final boolean field5103) {
        this.field5103 = field5103;
    }
    
    public boolean method5545() {
        return this.field5104;
    }
    
    public void method5546(final boolean field5104) {
        this.field5104 = field5104;
    }
}
