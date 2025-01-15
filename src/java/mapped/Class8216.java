// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class Class8216
{
    private static final ExecutorService field33762;
    private static ExecutorService field33763;
    private static int field33764;
    private static long field33765;
    
    private Class8216() {
    }
    
    public static long method27221() {
        return Class8216.field33765;
    }
    
    public static void method27222(final long n) {
        Class8216.field33765 = Class7640.method24133(1L, n);
    }
    
    public static int method27223() {
        return Runtime.getRuntime().availableProcessors();
    }
    
    public static int method27224() {
        return Class8216.field33764;
    }
    
    public static void method27225(final int field33764) {
        Class8216.field33764 = field33764;
    }
    
    public static <T> Future<T> method27226(final Callable<T> callable) {
        if (Class8216.field33763.isShutdown() || Class8216.field33763.isTerminated()) {
            Class8216.field33763 = Class8216.field33762;
        }
        return Class8216.field33763.submit(callable);
    }
    
    public static Future<?> method27227(final Runnable runnable) {
        if (Class8216.field33763.isShutdown() || Class8216.field33763.isTerminated()) {
            Class8216.field33763 = Class8216.field33762;
        }
        return Class8216.field33763.submit(runnable);
    }
    
    public static void method27228(final Future<?>[] array) throws InterruptedException, ExecutionException {
        for (int length = array.length, i = 0; i < length; ++i) {
            array[i].get();
        }
    }
    
    public static void method27229(final ExecutorService field33763) {
        Class8216.field33763 = field33763;
    }
    
    public static ExecutorService method27230() {
        return Class8216.field33763;
    }
    
    public static void method27231() {
        Class8216.field33763.shutdown();
        try {
            if (!Class8216.field33763.awaitTermination(60L, TimeUnit.SECONDS)) {
                Class8216.field33763.shutdownNow();
                if (!Class8216.field33763.awaitTermination(60L, TimeUnit.SECONDS)) {
                    System.err.println("Pool did not terminate");
                }
            }
        }
        catch (final InterruptedException ex) {
            Class8216.field33763.shutdownNow();
            Thread.currentThread().interrupt();
        }
    }
    
    static {
        field33762 = Executors.newCachedThreadPool(new Class7366(new Class8235(null)));
        Class8216.field33763 = Class8216.field33762;
        Class8216.field33764 = method27223();
        Class8216.field33765 = 100000L;
    }
}
