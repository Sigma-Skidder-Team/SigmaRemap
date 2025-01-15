// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8235 implements UncaughtExceptionHandler
{
    private static String[] field33828;
    
    private Class8235() {
    }
    
    @Override
    public void uncaughtException(final Thread thread, final Throwable t) {
        t.printStackTrace();
    }
}
