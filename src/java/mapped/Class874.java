// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.locks.LockSupport;

public class Class874 extends Class872<Runnable>
{
    private Thread field4722;
    private volatile boolean field4723;
    
    public Class874() {
        super("Sound executor");
        this.field4722 = this.method5388();
    }
    
    private Thread method5388() {
        final Thread thread = new Thread(this::run);
        thread.setDaemon(true);
        thread.setName("Sound engine");
        thread.start();
        return thread;
    }
    
    @Override
    public Runnable method1601(final Runnable runnable) {
        return runnable;
    }
    
    @Override
    public boolean method1600(final Runnable runnable) {
        return !this.field4723;
    }
    
    @Override
    public Thread method1561() {
        return this.field4722;
    }
    
    private void run() {
        while (!this.field4723) {
            this.method5384(() -> this.field4723);
        }
    }
    
    @Override
    public void method5385() {
        LockSupport.park("waiting for tasks");
    }
    
    public void method5389() {
        this.field4723 = true;
        this.field4722.interrupt();
        try {
            this.field4722.join();
        }
        catch (final InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        this.method5382();
        this.field4723 = false;
        this.field4722 = this.method5388();
    }
}
