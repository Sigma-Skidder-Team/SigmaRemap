// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinWorkerThread;

public final class Class904 extends ForkJoinWorkerThread
{
    public Class904(final ForkJoinPool pool) {
        super(pool);
    }
    
    public void onTermination(final Throwable exception) {
        if (exception == null) {
            Class8349.method27871().debug("{} shutdown", (Object)this.getName());
        }
        else {
            Class8349.method27871().warn("{} died", (Object)this.getName(), (Object)exception);
        }
        super.onTermination(exception);
    }
}
