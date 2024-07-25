package remapped;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class class_1266 {
   private static final ExecutorService field_6966 = Executors.newCachedThreadPool(new class_1339(new class_8098(null)));
   private static ExecutorService field_6967 = field_6966;
   private static int field_6968 = method_5690();
   private static long field_6965 = 100000L;

   private class_1266() {
   }

   public static long method_5689() {
      return field_6965;
   }

   public static void method_5692(long var0) {
      field_6965 = class_6806.method_31159(1L, var0);
   }

   public static int method_5690() {
      return Runtime.getRuntime().availableProcessors();
   }

   public static int method_5693() {
      return field_6968;
   }

   public static void method_5697(int var0) {
      field_6968 = var0;
   }

   public static <T> Future<T> method_5695(Callable<T> var0) {
      if (field_6967.isShutdown() || field_6967.isTerminated()) {
         field_6967 = field_6966;
      }

      return field_6967.<T>submit(var0);
   }

   public static Future<?> method_5694(Runnable var0) {
      if (field_6967.isShutdown() || field_6967.isTerminated()) {
         field_6967 = field_6966;
      }

      return field_6967.submit(var0);
   }

   public static void method_5696(Future<?>[] var0) throws InterruptedException, ExecutionException {
      int var3 = var0.length;

      for (int var4 = 0; var4 < var3; var4++) {
         var0[var4].get();
      }
   }

   public static void method_5698(ExecutorService var0) {
      field_6967 = var0;
   }

   public static ExecutorService method_5691() {
      return field_6967;
   }

   public static void method_5688() {
      field_6967.shutdown();

      try {
         if (!field_6967.awaitTermination(60L, TimeUnit.SECONDS)) {
            field_6967.shutdownNow();
            if (!field_6967.awaitTermination(60L, TimeUnit.SECONDS)) {
               System.err.println("Pool did not terminate");
            }
         }
      } catch (InterruptedException var3) {
         field_6967.shutdownNow();
         Thread.currentThread().interrupt();
      }
   }
}
