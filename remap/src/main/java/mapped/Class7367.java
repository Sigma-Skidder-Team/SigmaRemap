// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ThreadFactory;

public final class Class7367 implements ThreadFactory
{
    @Override
    public Thread newThread(final Runnable runnable) {
        EventThread.method5437(new EventThread(runnable));
        EventThread.method5438().setName("EventThread");
        EventThread.method5438().setDaemon(Thread.currentThread().isDaemon());
        return EventThread.method5438();
    }
}
