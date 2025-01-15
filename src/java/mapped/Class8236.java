// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.Logger;

public class Class8236 implements UncaughtExceptionHandler
{
    private final Logger field33829;
    
    public Class8236(final Logger field33829) {
        this.field33829 = field33829;
    }
    
    @Override
    public void uncaughtException(final Thread thread, final Throwable t) {
        this.field33829.error("Caught previously unhandled exception :");
        this.field33829.error((Object)t);
    }
}
