package remapped;

import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.MoreExecutors;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.Hash.Strategy;
import java.io.File;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_9665 {
   private static final AtomicInteger field_49233 = new AtomicInteger(1);
   private static final ExecutorService field_49231 = method_44670("Bootstrap");
   private static final ExecutorService field_49226 = method_44670("Main");
   private static final ExecutorService field_49227 = method_44693();
   public static LongSupplier field_49234 = System::nanoTime;
   public static final UUID field_49232 = new UUID(0L, 0L);
   private static final Logger field_49230 = LogManager.getLogger();
   private static Exception field_49228;

   public static <K, V> Collector<Entry<? extends K, ? extends V>, ?, Map<K, V>> method_44681() {
      return Collectors.<Entry<? extends K, ? extends V>, K, V>toMap(Entry::getKey, Entry::getValue);
   }

   public static <T extends Comparable<T>> String method_44665(class_5019<T> var0, Object var1) {
      return var0.method_23110((T)var1);
   }

   public static String method_44671(String var0, class_4639 var1) {
      return var1 != null ? var0 + '.' + var1.method_21461() + '.' + var1.method_21456().replace('/', '.') : var0 + ".unregistered_sadface";
   }

   public static long method_44650() {
      return method_44657() / 1000000L;
   }

   public static long method_44657() {
      return field_49234.getAsLong();
   }

   public static long method_44686() {
      return Instant.now().toEpochMilli();
   }

   private static ExecutorService method_44670(String var0) {
      int var3 = class_9299.method_42829(Runtime.getRuntime().availableProcessors() - 1, 1, 7);
      Object var4;
      if (var3 > 0) {
         var4 = new ForkJoinPool(var3, var1 -> {
            class_5724 var4x = new class_5724(var1);
            var4x.setName("Worker-" + var0 + "-" + field_49233.getAndIncrement());
            return var4x;
         }, class_9665::method_44673, true);
      } else {
         var4 = MoreExecutors.newDirectExecutorService();
      }

      return (ExecutorService)var4;
   }

   public static Executor method_44695() {
      return field_49231;
   }

   public static Executor method_44661() {
      return field_49226;
   }

   public static Executor method_44683() {
      return field_49227;
   }

   public static void method_44653() {
      method_44699(field_49226);
      method_44699(field_49227);
   }

   private static void method_44699(ExecutorService var0) {
      var0.shutdown();

      boolean var3;
      try {
         var3 = var0.awaitTermination(3L, TimeUnit.SECONDS);
      } catch (InterruptedException var5) {
         var3 = false;
      }

      if (!var3) {
         var0.shutdownNow();
      }
   }

   private static ExecutorService method_44693() {
      return Executors.newCachedThreadPool(var0 -> {
         Thread var3 = new Thread(var0);
         var3.setName("IO-Worker-" + field_49233.getAndIncrement());
         var3.setUncaughtExceptionHandler(class_9665::method_44673);
         return var3;
      });
   }

   public static <T> CompletableFuture<T> method_44652(Throwable var0) {
      CompletableFuture var3 = new CompletableFuture();
      var3.completeExceptionally(var0);
      return var3;
   }

   public static void method_44672(Throwable var0) {
      throw !(var0 instanceof RuntimeException) ? new RuntimeException(var0) : (RuntimeException)var0;
   }

   private static void method_44673(Thread var0, Throwable var1) {
      method_44658(var1);
      if (var1 instanceof CompletionException) {
         var1 = var1.getCause();
      }

      if (var1 instanceof class_3297) {
         class_2557.method_11619(((class_3297)var1).method_15119().method_632());
         System.exit(-1);
      }

      field_49230.error(String.format("Caught exception in thread %s", var0), var1);
   }

   @Nullable
   public static Type<?> method_44669(TypeReference var0, String var1) {
      return class_7665.field_38957 ? method_44677(var0, var1) : null;
   }

   @Nullable
   private static Type<?> method_44677(TypeReference var0, String var1) {
      Type var4 = null;

      try {
         var4 = class_148.method_580().getSchema(DataFixUtils.makeKey(class_7665.method_34674().getWorldVersion())).getChoiceType(var0, var1);
      } catch (IllegalArgumentException var6) {
         field_49230.error("No data fixer registered for {}", var1);
         if (class_7665.field_38958) {
            throw var6;
         }
      }

      return var4;
   }

   public static class_8208 method_44667() {
      String var2 = System.getProperty("os.name").toLowerCase(Locale.ROOT);
      if (!var2.contains("win")) {
         if (!var2.contains("mac")) {
            if (!var2.contains("solaris")) {
               if (!var2.contains("sunos")) {
                  if (!var2.contains("linux")) {
                     return !var2.contains("unix") ? class_8208.field_41985 : class_8208.field_41988;
                  } else {
                     return class_8208.field_41988;
                  }
               } else {
                  return class_8208.field_41986;
               }
            } else {
               return class_8208.field_41986;
            }
         } else {
            return class_8208.field_41983;
         }
      } else {
         return class_8208.field_41987;
      }
   }

   public static Stream<String> method_44692() {
      RuntimeMXBean var2 = ManagementFactory.getRuntimeMXBean();
      return var2.getInputArguments().stream().filter(var0 -> var0.startsWith("-X"));
   }

   public static <T> T method_44651(List<T> var0) {
      return (T)var0.get(var0.size() - 1);
   }

   public static <T> T method_44694(Iterable<T> var0, T var1) {
      Iterator var4 = var0.iterator();
      Object var5 = var4.next();
      if (var1 != null) {
         Object var6 = var5;

         while (var6 != var1) {
            if (var4.hasNext()) {
               var6 = var4.next();
            }
         }

         if (var4.hasNext()) {
            return (T)var4.next();
         }
      }

      return (T)var5;
   }

   public static <T> T method_44656(Iterable<T> var0, T var1) {
      Iterator var4 = var0.iterator();
      Object var5 = null;

      while (var4.hasNext()) {
         Object var6 = var4.next();
         if (var6 == var1) {
            if (var5 == null) {
               var5 = !var4.hasNext() ? var1 : Iterators.getLast(var4);
            }
            break;
         }

         var5 = var6;
      }

      return (T)var5;
   }

   public static <T> T method_44660(Supplier<T> var0) {
      return (T)var0.get();
   }

   public static <T> T method_44659(T var0, Consumer<T> var1) {
      var1.accept(var0);
      return (T)var0;
   }

   public static <K> Strategy<K> method_44698() {
      return class_3107.field_15443;
   }

   public static <V> CompletableFuture<List<V>> method_44680(List<? extends CompletableFuture<? extends V>> var0) {
      ArrayList var3 = Lists.newArrayListWithCapacity(var0.size());
      CompletableFuture[] var4 = new CompletableFuture[var0.size()];
      CompletableFuture var5 = new CompletableFuture();
      var0.forEach(var3x -> {
         int var6 = var3.size();
         var3.add(null);
         var4[var6] = var3x.whenComplete((var3xx, var4x) -> {
            if (var4x == null) {
               var3.set(var6, var3xx);
            } else {
               var5.completeExceptionally(var4x);
            }
         });
      });
      return CompletableFuture.allOf(var4).<List<V>>applyToEither(var5, var1 -> var3);
   }

   public static <T> Stream<T> method_44689(Optional<? extends T> var0) {
      return !var0.isPresent() ? Stream.<T>empty() : Stream.<T>of((T)var0.get());
   }

   public static Exception method_44701() {
      return field_49228;
   }

   public static void method_44655(Exception var0) {
      field_49228 = var0;
   }

   public static <T> Optional<T> method_44691(Optional<T> var0, Consumer<T> var1, Runnable var2) {
      if (!var0.isPresent()) {
         var2.run();
      } else {
         var1.accept(var0.get());
      }

      return var0;
   }

   public static Runnable method_44687(Runnable var0, Supplier<String> var1) {
      return var0;
   }

   public static <T extends Throwable> T method_44658(T var0) {
      if (class_7665.field_38958) {
         field_49230.error("Trying to throw a fatal exception, pausing in IDE", var0);

         while (true) {
            try {
               Thread.sleep(1000L);
               field_49230.error("paused");
            } catch (InterruptedException var4) {
               return (T)var0;
            }
         }
      } else {
         return (T)var0;
      }
   }

   public static String method_44664(Throwable var0) {
      if (var0.getCause() == null) {
         return var0.getMessage() == null ? var0.toString() : var0.getMessage();
      } else {
         return method_44664(var0.getCause());
      }
   }

   public static <T> T method_44697(T[] var0, Random var1) {
      return (T)var0[var1.nextInt(var0.length)];
   }

   public static int method_44676(int[] var0, Random var1) {
      return var0[var1.nextInt(var0.length)];
   }

   private static BooleanSupplier method_44685(Path var0, Path var1) {
      return new class_8621(var0, var1);
   }

   private static BooleanSupplier method_44684(Path var0) {
      return new class_2924(var0);
   }

   private static BooleanSupplier method_44700(Path var0) {
      return new class_3609(var0);
   }

   private static BooleanSupplier method_44668(Path var0) {
      return new class_7619(var0);
   }

   private static boolean method_44688(BooleanSupplier... var0) {
      for (BooleanSupplier var6 : var0) {
         if (!var6.getAsBoolean()) {
            field_49230.warn("Failed to execute {}", var6);
            return false;
         }
      }

      return true;
   }

   private static boolean method_44666(int var0, String var1, BooleanSupplier... var2) {
      for (int var5 = 0; var5 < var0; var5++) {
         if (method_44688(var2)) {
            return true;
         }

         field_49230.error("Failed to {}, retrying {}/{}", var1, var5, var0);
      }

      field_49230.error("Failed to {}, aborting, progress might be lost", var1);
      return false;
   }

   public static void method_44675(File var0, File var1, File var2) {
      method_44682(var0.toPath(), var1.toPath(), var2.toPath());
   }

   public static void method_44682(Path var0, Path var1, Path var2) {
      byte var5 = 10;
      if ((!Files.exists(var0) || method_44666(10, "create backup " + var2, method_44684(var2), method_44685(var0, var2), method_44668(var2)))
         && method_44666(10, "remove old " + var0, method_44684(var0), method_44700(var0))
         && !method_44666(10, "replace " + var0 + " with " + var1, method_44685(var1, var0), method_44668(var0))) {
         method_44666(10, "restore " + var0 + " from " + var2, method_44685(var2, var0), method_44668(var0));
      }
   }

   public static int method_44662(String var0, int var1, int var2) {
      int var5 = var0.length();
      if (var2 < 0) {
         for (int var6 = var2; var1 > 0 && var6 < 0; var6++) {
            var1--;
            if (Character.isLowSurrogate(var0.charAt(var1)) && var1 > 0 && Character.isHighSurrogate(var0.charAt(var1 - 1))) {
               var1--;
            }
         }
      } else {
         for (int var7 = 0; var1 < var5 && var7 < var2; var7++) {
            if (Character.isHighSurrogate(var0.charAt(var1++)) && var1 < var5 && Character.isLowSurrogate(var0.charAt(var1))) {
               var1++;
            }
         }
      }

      return var1;
   }

   public static Consumer<String> method_44690(String var0, Consumer<String> var1) {
      return var2 -> var1.accept(var0 + var2);
   }

   public static DataResult<int[]> method_44654(IntStream var0, int var1) {
      int[] var4 = var0.limit((long)(var1 + 1)).toArray();
      if (var4.length == var1) {
         return DataResult.success(var4);
      } else {
         String var5 = "Input is not a list of " + var1 + " ints";
         return var4.length < var1 ? DataResult.error(var5) : DataResult.error(var5, Arrays.copyOf(var4, var1));
      }
   }

   public static void method_44679() {
      class_2118 var2 = new class_2118("Timer hack thread");
      var2.setDaemon(true);
      var2.setUncaughtExceptionHandler(new class_447(field_49230));
      var2.start();
   }

   public static void method_44696(Path var0, Path var1, Path var2) throws IOException {
      Path var5 = var0.relativize(var2);
      Path var6 = var1.resolve(var5);
      Files.copy(var2, var6);
   }

   public static String method_44678(String var0, class_6468 var1) {
      return var0.toLowerCase(Locale.ROOT)
         .chars()
         .<CharSequence>mapToObj(var1x -> !var1.method_29456((char)var1x) ? "_" : Character.toString((char)var1x))
         .collect(Collectors.joining());
   }
}
