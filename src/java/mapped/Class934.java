// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.logging.Logger;

public class Class934 extends Thread
{
    private static String[] field4920;
    private static final Logger field4921;
    private static final ThreadFactory field4922;
    private static Class934 field4923;
    private static ExecutorService field4924;
    private static int field4925;
    
    private Class934(final Runnable task) {
        super(task);
    }
    
    public static boolean method5434() {
        return currentThread() == Class934.field4923;
    }
    
    public static void method5435(final Runnable runnable) {
        if (!method5434()) {
            method5436(runnable);
        }
        else {
            runnable.run();
        }
    }
    
    public static void method5436(final Runnable runnable) {
        final ExecutorService field4924;
        synchronized (Class934.class) {
            ++Class934.field4925;
            if (Class934.field4924 == null) {
                Class934.field4924 = Executors.newSingleThreadExecutor(Class934.field4922);
            }
            field4924 = Class934.field4924;
        }
        field4924.execute(new Class1113(runnable));
    }
    
    static {
        field4921 = Logger.getLogger(Class934.class.getName());
        field4922 = new Class7367();
        Class934.field4925 = 0;
    }
}
