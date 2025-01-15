// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class Class7366 implements ThreadFactory
{
    private static String[] field28413;
    private static final ThreadFactory field28414;
    private final Thread.UncaughtExceptionHandler field28415;
    
    public Class7366(final Thread.UncaughtExceptionHandler field28415) {
        this.field28415 = field28415;
    }
    
    @Override
    public Thread newThread(final Runnable runnable) {
        final Thread thread = Class7366.field28414.newThread(runnable);
        thread.setUncaughtExceptionHandler(this.field28415);
        return thread;
    }
    
    static {
        field28414 = Executors.defaultThreadFactory();
    }
}
