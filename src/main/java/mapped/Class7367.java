// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ThreadFactory;

public final class Class7367 implements ThreadFactory
{
    @Override
    public Thread newThread(final Runnable runnable) {
        Class934.method5437(new Class934(runnable, (Class7367)null));
        Class934.method5438().setName("EventThread");
        Class934.method5438().setDaemon(Thread.currentThread().isDaemon());
        return Class934.method5438();
    }
}
