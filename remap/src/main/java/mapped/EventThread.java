// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.logging.Logger;

public class EventThread extends Thread
{
    private static final Logger field4921 = Logger.getLogger(EventThread.class.getName());
    private static final ThreadFactory field4922 = new Class7367();
    private static EventThread field4923;
    private static ExecutorService field4924;
    private static int field4925 = 0;
    
    EventThread(final Runnable task) {
        super(task);
    }
    
    public static boolean method5434() {
        return currentThread() == EventThread.field4923;
    }
    
    public static void exec(final Runnable runnable) {
        if (!method5434()) {
            method5436(runnable);
        }
        else {
            runnable.run();
        }
    }
    
    public static void method5436(final Runnable runnable) {
        final ExecutorService field4924;
        synchronized (EventThread.class) {
            ++EventThread.field4925;
            if (EventThread.field4924 == null) {
                EventThread.field4924 = Executors.newSingleThreadExecutor(EventThread.field4922);
            }
            field4924 = EventThread.field4924;
        }
        field4924.execute(new Class1113(runnable));
    }

    public static Logger method5439() {
        return field4921;
    }

    public static /* synthetic */ EventThread method5438() {
        return field4923;
    }

    public static /* synthetic */ ExecutorService method5442() {
        return field4924;
    }

    public static /* synthetic */ int method5441() {
        return field4925;
    }

    public static /* synthetic */ int method5440() {
        return field4925--;
    }

    public static /* synthetic */ ExecutorService method5443(ExecutorService executorService) {
        field4924 = executorService;
        return field4924;
    }

    public static /* synthetic */ EventThread method5437(EventThread eventThread) {
        field4923 = eventThread;
        return field4923;
    }
}
