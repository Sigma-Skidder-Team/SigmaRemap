// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.ThreadFactory;

public class Class7365 implements ThreadFactory
{
    private final ThreadFactory field28410;
    private final AtomicInteger field28411;
    private final String field28412;
    
    public Class7365(final String field28412) {
        this.field28410 = Executors.defaultThreadFactory();
        this.field28411 = new AtomicInteger(1);
        this.field28412 = field28412;
    }
    
    @Override
    public Thread newThread(final Runnable runnable) {
        final Thread thread = this.field28410.newThread(runnable);
        thread.setName(this.field28412 + "-" + this.field28411);
        return thread;
    }
}
