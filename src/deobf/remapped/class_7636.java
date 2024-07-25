package remapped;

import com.google.common.collect.Streams;
import java.io.File;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Timer;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_7636 implements Runnable {
   private static final Logger field_38849 = LogManager.getLogger();
   private final class_4497 field_38848;
   private final long field_38847;

   public class_7636(class_4497 var1) {
      this.field_38848 = var1;
      this.field_38847 = var1.method_20895();
   }

   @Override
   public void run() {
      while (this.field_38848.method_1692()) {
         long var3 = this.field_38848.method_1740();
         long var5 = Util.getMeasuringTimeMs();
         long var7 = var5 - var3;
         if (var7 > this.field_38847) {
            field_38849.fatal(
               "A single server tick took {} seconds (should be max {})",
               String.format(Locale.ROOT, "%.2f", (float)var7 / 1000.0F),
               String.format(Locale.ROOT, "%.2f", 0.05F)
            );
            field_38849.fatal("Considering it to be crashed, server will forcibly shutdown.");
            ThreadMXBean var9 = ManagementFactory.getThreadMXBean();
            ThreadInfo[] var10 = var9.dumpAllThreads(true, true);
            StringBuilder var11 = new StringBuilder();
            Error var12 = new Error("Watchdog");

            for (ThreadInfo var16 : var10) {
               if (var16.getThreadId() == this.field_38848.method_34460().getId()) {
                  var12.setStackTrace(var16.getStackTrace());
               }

               var11.append(var16);
               var11.append("\n");
            }

            class_159 var18 = new class_159("Watching Server", var12);
            this.field_38848.method_1725(var18);
            class_6544 var19 = var18.method_639("Thread Dump");
            var19.method_29850("Threads", var11);
            class_6544 var20 = var18.method_639("Performance stats");
            var20.method_29851("Random tick rate", () -> this.field_38848.method_1601().method_8653().<class_1997>method_1287(class_291.field_1040).toString());
            var20.method_29851(
               "Level stats",
               () -> Streams.stream(this.field_38848.method_1719())
                     .<CharSequence>map(var0 -> var0.method_29545() + ": " + var0.method_28934())
                     .collect(Collectors.joining(",\n"))
            );
            class_2557.method_11619("Crash report:\n" + var18.method_632());
            File var21 = new File(
               new File(this.field_38848.method_1652(), "crash-reports"),
               "crash-" + new SimpleDateFormat("yyyy-MM-dd_HH.mm.ss").format(new Date()) + "-server.txt"
            );
            if (var18.method_641(var21)) {
               field_38849.error("This crash report has been saved to: {}", var21.getAbsolutePath());
            } else {
               field_38849.error("We were unable to save this crash report to disk.");
            }

            this.method_34603();
         }

         try {
            Thread.sleep(var3 + this.field_38847 - var5);
         } catch (InterruptedException var17) {
         }
      }
   }

   private void method_34603() {
      try {
         Timer var3 = new Timer();
         var3.schedule(new class_2227(this), 10000L);
         System.exit(1);
      } catch (Throwable var4) {
         Runtime.getRuntime().halt(1);
      }
   }
}
