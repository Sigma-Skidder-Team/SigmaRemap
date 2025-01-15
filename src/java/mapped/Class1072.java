// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.TimerTask;
import java.util.Timer;
import java.lang.management.ThreadInfo;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.File;
import java.lang.management.ManagementFactory;
import java.util.Locale;
import org.apache.logging.log4j.Logger;

public class Class1072 implements Runnable
{
    private static final Logger field5767;
    private final Class395 field5768;
    private final long field5769;
    
    public Class1072(final Class395 field5768) {
        this.field5768 = field5768;
        this.field5769 = field5768.method1626();
    }
    
    @Override
    public void run() {
        while (this.field5768.method1455()) {
            final long method1563 = this.field5768.method1563();
            final long method1564 = Class8349.method27837();
            final long n = method1564 - method1563;
            if (n > this.field5769) {
                Class1072.field5767.fatal("A single server tick took {} seconds (should be max {})", (Object)String.format(Locale.ROOT, "%.2f", n / 1000.0f), (Object)String.format(Locale.ROOT, "%.2f", 0.05f));
                Class1072.field5767.fatal("Considering it to be crashed, server will forcibly shutdown.");
                final ThreadInfo[] dumpAllThreads = ManagementFactory.getThreadMXBean().dumpAllThreads(true, true);
                final StringBuilder sb = new StringBuilder();
                final Error error = new Error();
                for (final ThreadInfo obj : dumpAllThreads) {
                    if (obj.getThreadId() == this.field5768.method1561().getId()) {
                        error.setStackTrace(obj.getStackTrace());
                    }
                    sb.append(obj);
                    sb.append("\n");
                }
                final Class7689 class7689 = new Class7689("Watching Server", error);
                this.field5768.method1491(class7689);
                class7689.method24418("Thread Dump").method16297("Threads", sb);
                final File file = new File(new File(this.field5768.method1466(), "crash-reports"), "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-server.txt");
                if (class7689.method24416(file)) {
                    Class1072.field5767.error("This crash report has been saved to: {}", (Object)file.getAbsolutePath());
                }
                else {
                    Class1072.field5767.error("We were unable to save this crash report to disk.");
                }
                this.method5605();
            }
            try {
                Thread.sleep(method1563 + this.field5769 - method1564);
            }
            catch (final InterruptedException ex) {}
        }
    }
    
    private void method5605() {
        try {
            new Timer().schedule(new Class1619(this), 10000L);
            System.exit(1);
        }
        catch (final Throwable t) {
            Runtime.getRuntime().halt(1);
        }
    }
    
    static {
        field5767 = LogManager.getLogger();
    }
}
