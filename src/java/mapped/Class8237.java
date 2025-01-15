// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.Logger;

public class Class8237 implements UncaughtExceptionHandler
{
    private final Logger field33830;
    
    public Class8237(final Logger field33830) {
        this.field33830 = field33830;
    }
    
    @Override
    public void uncaughtException(final Thread thread, final Throwable t) {
        this.field33830.error("Caught previously unhandled exception :");
        this.field33830.error(thread.getName(), t);
    }
}
