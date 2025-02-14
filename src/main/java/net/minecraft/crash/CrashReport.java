package net.minecraft.crash;

import com.google.common.collect.Lists;
import mapped.*;
import net.minecraft.util.Util;
import net.minecraft.util.SharedConstants;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletionException;
import java.util.stream.Collectors;

public class CrashReport {
   private static final Logger field21830 = LogManager.getLogger();
   private final String field21831;
   private final Throwable field21832;
   private final CrashReportCategory field21833 = new CrashReportCategory(this, "System Details");
   private final List<CrashReportCategory> field21834 = Lists.newArrayList();
   private File field21835;
   private boolean field21836 = true;
   private StackTraceElement[] field21837 = new StackTraceElement[0];
   private boolean field21838 = false;

   public CrashReport(String var1, Throwable var2) {
      this.field21831 = var1;
      this.field21832 = var2;
      this.method14401();
   }

   private void method14401() {
      this.field21833.addDetail("Minecraft Version", () -> SharedConstants.getVersion().getName());
      this.field21833.addDetail("Minecraft Version ID", () -> SharedConstants.getVersion().getId());
      this.field21833
         .addDetail(
            "Operating System", () -> System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version")
         );
      this.field21833.addDetail("Java Version", () -> System.getProperty("java.version") + ", " + System.getProperty("java.vendor"));
      this.field21833
         .addDetail(
            "Java VM Version",
            () -> System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor")
         );
      this.field21833.addDetail("Memory", () -> {
         Runtime var2 = Runtime.getRuntime();
         long var3 = var2.maxMemory();
         long var5 = var2.totalMemory();
         long var7 = var2.freeMemory();
         long var9 = var3 / 1024L / 1024L;
         long var11 = var5 / 1024L / 1024L;
         long var13 = var7 / 1024L / 1024L;
         return var7 + " bytes (" + var13 + " MB) / " + var5 + " bytes (" + var11 + " MB) up to " + var3 + " bytes (" + var9 + " MB)";
      });
      this.field21833.addDetail("CPUs", Runtime.getRuntime().availableProcessors());
      this.field21833.addDetail("JVM Flags", () -> {
         List var2 = Util.getJVMFlags().collect(Collectors.toList());
         return String.format("%d total; %s", var2.size(), var2.stream().collect(Collectors.joining(" ")));
      });
      if (Reflector.field42782 != null) {
         Reflector.field42782.call(this, this.field21833);
      }
   }

   public String method14402() {
      return this.field21831;
   }

   public Throwable method14403() {
      return this.field21832;
   }

   public void method14404(StringBuilder var1) {
      if ((this.field21837 == null || this.field21837.length <= 0) && !this.field21834.isEmpty()) {
         this.field21837 = (StackTraceElement[])ArrayUtils.subarray(this.field21834.get(0).method32813(), 0, 1);
      }

      if (this.field21837 != null && this.field21837.length > 0) {
         var1.append("-- Head --\n");
         var1.append("Thread: ").append(Thread.currentThread().getName()).append("\n");
         if (!Reflector.field42785.exists()) {
            var1.append("Stacktrace:\n");

            for (StackTraceElement var7 : this.field21837) {
               var1.append("\t").append("at ").append(var7);
               var1.append("\n");
            }

            var1.append("\n");
         } else {
            var1.append("Stacktrace:");
            var1.append(Reflector.field42785.method20228(this.field21837));
         }
      }

      for (CrashReportCategory var9 : this.field21834) {
         var9.method32812(var1);
         var1.append("\n\n");
      }

      this.field21833.method32812(var1);
   }

   public String method14405() {
      StringWriter var3 = null;
      PrintWriter var4 = null;
      Throwable var5 = this.field21832;
      if (var5.getMessage() == null) {
         if (var5 instanceof NullPointerException) {
            var5 = new NullPointerException(this.field21831);
         } else if (var5 instanceof StackOverflowError) {
            var5 = new StackOverflowError(this.field21831);
         } else if (var5 instanceof OutOfMemoryError) {
            var5 = new OutOfMemoryError(this.field21831);
         }

         var5.setStackTrace(this.field21832.getStackTrace());
      }

      if (Reflector.field42784.exists()) {
         return Reflector.field42784.method20222(var5);
      } else {
         String var6;
         try {
            var3 = new StringWriter();
            var4 = new PrintWriter(var3);
            var5.printStackTrace(var4);
            var6 = var3.toString();
         } finally {
            IOUtils.closeQuietly(var3);
            IOUtils.closeQuietly(var4);
         }

         return var6;
      }
   }

   public String getCompleteReport() {
      if (!this.field21838) {
         this.field21838 = true;
         Class9724.method38083(this, this.field21833);
      }

      StringBuilder var3 = new StringBuilder();
      var3.append("---- Minecraft Crash Report ----\n");
      if (Reflector.field42783 != null && Reflector.field42783.exists()) {
         Reflector.field42783.call(var3, this);
      }

      var3.append("// ");
      var3.append(method14412());
      var3.append("\n\n");
      var3.append("Time: ");
      var3.append(new SimpleDateFormat().format(new Date()));
      var3.append("\n");
      var3.append("Description: ");
      var3.append(this.field21831);
      var3.append("\n\n");
      var3.append(this.method14405());
      var3.append("\n\nA detailed walkthrough of the error, its code path and all known details is as follows:\n");

      for (int var4 = 0; var4 < 87; var4++) {
         var3.append("-");
      }

      var3.append("\n\n");
      this.method14404(var3);
      return var3.toString();
   }

   public File getFile() {
      return this.field21835;
   }

   public boolean saveToFile(File var1) {
      if (this.field21835 != null) {
         return false;
      } else {
         if (var1.getParentFile() != null) {
            var1.getParentFile().mkdirs();
         }

         OutputStreamWriter var4 = null;

         boolean var6;
         try {
            var4 = new OutputStreamWriter(new FileOutputStream(var1), StandardCharsets.UTF_8);
            var4.write(this.getCompleteReport());
            this.field21835 = var1;
            return true;
         } catch (Throwable var10) {
            field21830.error("Could not save crash report to {}", var1, var10);
            var6 = false;
         } finally {
            IOUtils.closeQuietly(var4);
         }

         return var6;
      }
   }

   public CrashReportCategory getCategory() {
      return this.field21833;
   }

   public CrashReportCategory makeCategory(String var1) {
      return this.makeCategoryDepth(var1, 1);
   }

   public CrashReportCategory makeCategoryDepth(String var1, int var2) {
      CrashReportCategory var5 = new CrashReportCategory(this, var1);

      try {
         if (this.field21836) {
            int var6 = var5.method32809(var2);
            StackTraceElement[] var7 = this.field21832.getStackTrace();
            StackTraceElement var8 = null;
            StackTraceElement var9 = null;
            int var10 = var7.length - var6;
            if (var10 < 0) {
               System.out.println("Negative index in crash report handler (" + var7.length + "/" + var6 + ")");
            }

            if (var7 != null && 0 <= var10 && var10 < var7.length) {
               var8 = var7[var10];
               if (var7.length + 1 - var6 < var7.length) {
                  var9 = var7[var7.length + 1 - var6];
               }
            }

            this.field21836 = var5.method32810(var8, var9);
            if (var6 > 0 && !this.field21834.isEmpty()) {
               CrashReportCategory var11 = this.field21834.get(this.field21834.size() - 1);
               var11.method32811(var6);
            } else if (var7 != null && var7.length >= var6 && 0 <= var10 && var10 < var7.length) {
               this.field21837 = new StackTraceElement[var10];
               System.arraycopy(var7, 0, this.field21837, 0, this.field21837.length);
            } else {
               this.field21836 = false;
            }
         }
      } catch (Throwable var12) {
         var12.printStackTrace();
      }

      this.field21834.add(var5);
      return var5;
   }

   private static String method14412() {
      String[] var2 = new String[]{
         "Who set us up the TNT?",
         "Everything's going to plan. No, really, that was supposed to happen.",
         "Uh... Did I do that?",
         "Oops.",
         "Why did you do that?",
         "I feel sad now :(",
         "My bad.",
         "I'm sorry, Dave.",
         "I let you down. Sorry :(",
         "On the bright side, I bought you a teddy bear!",
         "Daisy, daisy...",
         "Oh - I know what I did wrong!",
         "Hey, that tickles! Hehehe!",
         "I blame Dinnerbone.",
         "You should try our sister game, Minceraft!",
         "Don't be sad. I'll do better next time, I promise!",
         "Don't be sad, have a hug! <3",
         "I just don't know what went wrong :(",
         "Shall we play a game?",
         "Quite honestly, I wouldn't worry myself about that.",
         "I bet Cylons wouldn't have this problem.",
         "Sorry :(",
         "Surprise! Haha. Well, this is awkward.",
         "Would you like a cupcake?",
         "Hi. I'm Minecraft, and I'm a crashaholic.",
         "Ooh. Shiny.",
         "This doesn't make any sense!",
         "Why is it breaking :(",
         "Don't do that.",
         "Ouch. That hurt :(",
         "You're mean.",
         "This is a token for 1 free hug. Redeem at your nearest Mojangsta: [~~HUG~~]",
         "There are four lights!",
         "But it works on my machine."
      };

      try {
         return var2[(int)(Util.nanoTime() % (long)var2.length)];
      } catch (Throwable var4) {
         return "Witty comment unavailable :(";
      }
   }

   public static CrashReport makeCrashReport(Throwable var0, String var1) {
      while (var0 instanceof CompletionException && var0.getCause() != null) {
         var0 = var0.getCause();
      }

      CrashReport var4;
      if (!(var0 instanceof ReportedException)) {
         var4 = new CrashReport(var1, var0);
      } else {
         var4 = ((ReportedException)var0).getCrashReport();
      }

      return var4;
   }

   public static void method14414() {
      new CrashReport("Don't panic!", new Throwable()).getCompleteReport();
   }
}
