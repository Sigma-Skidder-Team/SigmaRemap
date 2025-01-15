// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.Logger;

public class Class8239 implements UncaughtExceptionHandler
{
    private final Logger field33834;
    
    public Class8239(final Logger field33834) {
        this.field33834 = field33834;
    }
    
    @Override
    public void uncaughtException(final Thread thread, final Throwable t) {
        this.field33834.error("Caught previously unhandled exception :", t);
    }
}
