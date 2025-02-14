package mapped;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Class7008 {
   private static final ExecutorService field30291 = Executors.newCachedThreadPool(new Class7074(new Class6033()));
   private static ExecutorService field30292 = field30291;
   private static int field30293 = method21725();
   private static long field30294 = 100000L;

   private Class7008() {
   }

   public static long method21723() {
      return field30294;
   }

   public static void method21724(long var0) {
      field30294 = Class9044.method33608(1L, var0);
   }

   public static int method21725() {
      return Runtime.getRuntime().availableProcessors();
   }

   public static int method21726() {
      return field30293;
   }

   public static void method21727(int var0) {
      field30293 = var0;
   }

   public static <T> Future<T> method21728(Callable<T> var0) {
      if (field30292.isShutdown() || field30292.isTerminated()) {
         field30292 = field30291;
      }

      return field30292.<T>submit(var0);
   }

   public static Future<?> method21729(Runnable var0) {
      if (field30292.isShutdown() || field30292.isTerminated()) {
         field30292 = field30291;
      }

      return field30292.submit(var0);
   }

   public static void method21730(Future<?>[] var0) throws InterruptedException, ExecutionException {
      int var3 = var0.length;

      for (int var4 = 0; var4 < var3; var4++) {
         var0[var4].get();
      }
   }

   public static void method21731(ExecutorService var0) {
      field30292 = var0;
   }

   public static ExecutorService method21732() {
      return field30292;
   }

   public static void method21733() {
      field30292.shutdown();

      try {
         if (!field30292.awaitTermination(60L, TimeUnit.SECONDS)) {
            field30292.shutdownNow();
            if (!field30292.awaitTermination(60L, TimeUnit.SECONDS)) {
               System.err.println("Pool did not terminate");
            }
         }
      } catch (InterruptedException var3) {
         field30292.shutdownNow();
         Thread.currentThread().interrupt();
      }
   }
}
