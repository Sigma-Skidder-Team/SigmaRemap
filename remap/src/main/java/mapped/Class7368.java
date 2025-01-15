// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ThreadFactory;

public final class Class7368 implements ThreadFactory
{
    private static String[] field28416;
    public final /* synthetic */ String field28417;
    public final /* synthetic */ boolean field28418;
    
    public Class7368(final String field28417, final boolean field28418) {
        this.field28417 = field28417;
        this.field28418 = field28418;
    }
    
    @Override
    public Thread newThread(final Runnable task) {
        final Thread thread = new Thread(task, this.field28417);
        thread.setDaemon(this.field28418);
        return thread;
    }
}
