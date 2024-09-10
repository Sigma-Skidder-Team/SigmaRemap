package mapped;

import com.google.common.collect.Streams;
import net.minecraft.client.util.Util;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Timer;
import java.util.stream.Collectors;

public class Class1470 implements Runnable {
   private static final Logger field7907 = LogManager.getLogger();
   private final DedicatedServer field7908;
   private final long field7909;

   public Class1470(DedicatedServer var1) {
      this.field7908 = var1;
      this.field7909 = var1.method6507();
   }

   @Override
   public void run() {
      while (this.field7908.method1295()) {
         long var3 = this.field7908.getServerTime();
         long var5 = Util.milliTime();
         long var7 = var5 - var3;
         if (var7 > this.field7909) {
            field7907.fatal(
               "A single server tick took {} seconds (should be max {})",
               String.format(Locale.ROOT, "%.2f", (float)var7 / 1000.0F),
               String.format(Locale.ROOT, "%.2f", 0.05F)
            );
            field7907.fatal("Considering it to be crashed, server will forcibly shutdown.");
            ThreadMXBean var9 = ManagementFactory.getThreadMXBean();
            ThreadInfo[] var10 = var9.dumpAllThreads(true, true);
            StringBuilder var11 = new StringBuilder();
            Error var12 = new Error("Watchdog");

            for (ThreadInfo var16 : var10) {
               if (var16.getThreadId() == this.field7908.getExecutionThread().getId()) {
                  var12.setStackTrace(var16.getStackTrace());
               }

               var11.append(var16);
               var11.append("\n");
            }

            CrashReport var18 = new CrashReport("Watching Server", var12);
            this.field7908.method1326(var18);
            CrashReportCategory var19 = var18.makeCategory("Thread Dump");
            var19.addDetail("Threads", var11);
            CrashReportCategory var20 = var18.makeCategory("Performance stats");
            var20.addDetail("Random tick rate", () -> this.field7908.method1436().method20046().<Class7464>method17128(Class5462.field24235).toString());
            var20.addDetail(
               "Level stats",
               () -> Streams.stream(this.field7908.method1320())
                     .<CharSequence>map(var0 -> var0.getDimensionKey() + ": " + var0.method6971())
                     .collect(Collectors.joining(",\n"))
            );
            Bootstrap.printToSYSOUT("Crash report:\n" + var18.getCompleteReport());
            File var21 = new File(
               new File(this.field7908.method1307(), "crash-reports"),
               "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-server.txt"
            );
            if (var18.saveToFile(var21)) {
               field7907.error("This crash report has been saved to: {}", var21.getAbsolutePath());
            } else {
               field7907.error("We were unable to save this crash report to disk.");
            }

            this.method6467();
         }
      }
   }

   private void method6467() {
      try {
         Timer var3 = new Timer();
         var3.schedule(new Class1616(this), 10000L);
         System.exit(1);
      } catch (Throwable var4) {
         Runtime.getRuntime().halt(1);
      }
   }
}
