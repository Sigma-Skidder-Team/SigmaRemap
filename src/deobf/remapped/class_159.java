package remapped;

import com.google.common.collect.Lists;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CompletionException;
import java.util.stream.Collectors;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_159 {
   private static final Logger field_473 = LogManager.getLogger();
   private final String field_475;
   private final Throwable field_482;
   private final class_6544 field_476 = new class_6544(this, "System Details");
   private final List<class_6544> field_477 = Lists.newArrayList();
   private File field_478;
   private boolean field_480 = true;
   private StackTraceElement[] field_481 = new StackTraceElement[0];
   private boolean field_474 = false;

   public class_159(String var1, Throwable var2) {
      this.field_475 = var1;
      this.field_482 = var2;
      this.method_640();
   }

   private void method_640() {
      this.field_476.method_29851("Minecraft Version", () -> class_7665.method_34674().getName());
      this.field_476.method_29851("Minecraft Version ID", () -> class_7665.method_34674().getId());
      this.field_476
         .method_29851(
            "Operating System", () -> System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version")
         );
      this.field_476.method_29851("Java Version", () -> System.getProperty("java.version") + ", " + System.getProperty("java.vendor"));
      this.field_476
         .method_29851(
            "Java VM Version",
            () -> System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor")
         );
      this.field_476.method_29851("Memory", () -> {
         Runtime var2 = Runtime.getRuntime();
         long var3 = var2.maxMemory();
         long var5 = var2.totalMemory();
         long var7 = var2.freeMemory();
         long var9 = var3 / 1024L / 1024L;
         long var11 = var5 / 1024L / 1024L;
         long var13 = var7 / 1024L / 1024L;
         return var7 + " bytes (" + var13 + " MB) / " + var5 + " bytes (" + var11 + " MB) up to " + var3 + " bytes (" + var9 + " MB)";
      });
      this.field_476.method_29850("CPUs", Runtime.getRuntime().availableProcessors());
      this.field_476.method_29851("JVM Flags", () -> {
         List var2 = class_9665.method_44692().collect(Collectors.toList());
         return String.format("%d total; %s", var2.size(), var2.stream().collect(Collectors.joining(" ")));
      });
      if (class_7860.field_40246 != null) {
         class_7860.field_40246.method_3582(this, this.field_476);
      }
   }

   public String method_630() {
      return this.field_475;
   }

   public Throwable method_631() {
      return this.field_482;
   }

   public void method_633(StringBuilder var1) {
      if ((this.field_481 == null || this.field_481.length <= 0) && !this.field_477.isEmpty()) {
         this.field_481 = (StackTraceElement[])ArrayUtils.subarray(this.field_477.get(0).method_29849(), 0, 1);
      }

      if (this.field_481 != null && this.field_481.length > 0) {
         var1.append("-- Head --\n");
         var1.append("Thread: ").append(Thread.currentThread().getName()).append("\n");
         if (!class_7860.field_40244.method_3596()) {
            var1.append("Stacktrace:\n");

            for (StackTraceElement var7 : this.field_481) {
               var1.append("\t").append("at ").append(var7);
               var1.append("\n");
            }

            var1.append("\n");
         } else {
            var1.append("Stacktrace:");
            var1.append(class_7860.field_40244.method_3578(this.field_481));
         }
      }

      for (class_6544 var9 : this.field_477) {
         var9.method_29855(var1);
         var1.append("\n\n");
      }

      this.field_476.method_29855(var1);
   }

   public String method_635() {
      StringWriter var3 = null;
      PrintWriter var4 = null;
      Object var5 = this.field_482;
      if (var5.getMessage() == null) {
         if (var5 instanceof NullPointerException) {
            var5 = new NullPointerException(this.field_475);
         } else if (var5 instanceof StackOverflowError) {
            var5 = new StackOverflowError(this.field_475);
         } else if (var5 instanceof OutOfMemoryError) {
            var5 = new OutOfMemoryError(this.field_475);
         }

         var5.setStackTrace(this.field_482.getStackTrace());
      }

      if (class_7860.field_39893.method_3596()) {
         return class_7860.field_39893.method_3585(var5);
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

   public String method_632() {
      if (!this.field_474) {
         this.field_474 = true;
         class_9475.method_43765(this, this.field_476);
      }

      StringBuilder var3 = new StringBuilder();
      var3.append("---- Minecraft Crash Report ----\n");
      if (class_7860.field_40202 != null && class_7860.field_40202.method_3596()) {
         class_7860.field_40202.method_3582(var3, this);
      }

      var3.append("// ");
      var3.append(method_638());
      var3.append("\n\n");
      var3.append("Time: ");
      var3.append(new SimpleDateFormat().format(new Date()));
      var3.append("\n");
      var3.append("Description: ");
      var3.append(this.field_475);
      var3.append("\n\n");
      var3.append(this.method_635());
      var3.append("\n\nA detailed walkthrough of the error, its code path and all known details is as follows:\n");

      for (int var4 = 0; var4 < 87; var4++) {
         var3.append("-");
      }

      var3.append("\n\n");
      this.method_633(var3);
      return var3.toString();
   }

   public File method_636() {
      return this.field_478;
   }

   public boolean method_641(File var1) {
      if (this.field_478 != null) {
         return false;
      } else {
         if (var1.getParentFile() != null) {
            var1.getParentFile().mkdirs();
         }

         OutputStreamWriter var4 = null;

         boolean var6;
         try {
            var4 = new OutputStreamWriter(new FileOutputStream(var1), StandardCharsets.UTF_8);
            var4.write(this.method_632());
            this.field_478 = var1;
            return true;
         } catch (Throwable var10) {
            field_473.error("Could not save crash report to {}", var1, var10);
            var6 = false;
         } finally {
            IOUtils.closeQuietly(var4);
         }

         return var6;
      }
   }

   public class_6544 method_629() {
      return this.field_476;
   }

   public class_6544 method_639(String var1) {
      return this.method_642(var1, 1);
   }

   public class_6544 method_642(String var1, int var2) {
      class_6544 var5 = new class_6544(this, var1);

      try {
         if (this.field_480) {
            int var6 = var5.method_29847(var2);
            StackTraceElement[] var7 = this.field_482.getStackTrace();
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

            this.field_480 = var5.method_29852(var8, var9);
            if (var6 > 0 && !this.field_477.isEmpty()) {
               class_6544 var11 = this.field_477.get(this.field_477.size() - 1);
               var11.method_29854(var6);
            } else if (var7 != null && var7.length >= var6 && 0 <= var10 && var10 < var7.length) {
               this.field_481 = new StackTraceElement[var10];
               System.arraycopy(var7, 0, this.field_481, 0, this.field_481.length);
            } else {
               this.field_480 = false;
            }
         }
      } catch (Throwable var12) {
         var12.printStackTrace();
      }

      this.field_477.add(var5);
      return var5;
   }

   private static String method_638() {
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
         return var2[(int)(class_9665.method_44657() % (long)var2.length)];
      } catch (Throwable var4) {
         return "Witty comment unavailable :(";
      }
   }

   public static class_159 method_643(Throwable var0, String var1) {
      while (var0 instanceof CompletionException && var0.getCause() != null) {
         var0 = var0.getCause();
      }

      class_159 var4;
      if (!(var0 instanceof class_3297)) {
         var4 = new class_159(var1, var0);
      } else {
         var4 = ((class_3297)var0).method_15119();
      }

      return var4;
   }

   public static void method_634() {
      new class_159("Don't panic!", new Throwable()).method_632();
   }
}
