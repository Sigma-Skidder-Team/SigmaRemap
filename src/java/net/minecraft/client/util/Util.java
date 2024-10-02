package net.minecraft.client.util;

import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.MoreExecutors;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.DataResult;
import it.unimi.dsi.fastutil.Hash.Strategy;
import mapped.*;
import net.minecraft.state.Property;
import net.minecraft.util.DefaultUncaughtExceptionHandler;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.LongSupplier;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Util {
   private static final AtomicInteger field45719 = new AtomicInteger(1);
   private static final ExecutorService field45720 = method38490("Bootstrap");
   private static final ExecutorService field45721 = method38490("Main");
   private static final ExecutorService field45722 = method38496();
   public static LongSupplier nanoTimeSupplier = System::nanoTime;
   public static final UUID DUMMY_UUID = new UUID(0L, 0L);
   private static final Logger field45725 = LogManager.getLogger();
   private static Exception field45726;

   public static <K, V> Collector<Entry<? extends K, ? extends V>, ?, Map<K, V>> method38484() {
      return Collectors.<Entry<? extends K, ? extends V>, K, V>toMap(Entry::getKey, Entry::getValue);
   }

   public static <T extends Comparable<T>> String method38485(Property<T> var0, Object var1) {
      return var0.method30475((T)var1);
   }

   public static String makeTranslationKey(String var0, ResourceLocation var1) {
      return var1 != null ? var0 + '.' + var1.getNamespace() + '.' + var1.getPath().replace('/', '.') : var0 + ".unregistered_sadface";
   }

   public static long milliTime() {
      return nanoTime() / 1000000L;
   }

   public static long nanoTime() {
      return nanoTimeSupplier.getAsLong();
   }

   public static long method38489() {
      return Instant.now().toEpochMilli();
   }

   private static ExecutorService method38490(String var0) {
      int var3 = MathHelper.clamp(Runtime.getRuntime().availableProcessors() - 1, 1, 7);
      Object var4;
      if (var3 > 0) {
         var4 = new ForkJoinPool(var3, var1 -> {
            Class361 var4x = new Class361(var1);
            var4x.setName("Worker-" + var0 + "-" + field45719.getAndIncrement());
            return var4x;
         }, Util::method38499, true);
      } else {
         var4 = MoreExecutors.newDirectExecutorService();
      }

      return (ExecutorService)var4;
   }

   public static Executor method38491() {
      return field45720;
   }

   public static Executor getServerExecutor() {
      return field45721;
   }

   public static Executor method38493() {
      return field45722;
   }

   public static void shutdown() {
      method38495(field45721);
      method38495(field45722);
   }

   private static void method38495(ExecutorService var0) {
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

   private static ExecutorService method38496() {
      return Executors.newCachedThreadPool(var0 -> {
         Thread var3 = new Thread(var0);
         var3.setName("IO-Worker-" + field45719.getAndIncrement());
         var3.setUncaughtExceptionHandler(Util::method38499);
         return var3;
      });
   }

   public static <T> CompletableFuture<T> method38497(Throwable var0) {
      CompletableFuture var3 = new CompletableFuture();
      var3.completeExceptionally(var0);
      return var3;
   }

   public static void toRuntimeException(Throwable var0) {
      throw !(var0 instanceof RuntimeException) ? new RuntimeException(var0) : (RuntimeException)var0;
   }

   private static void method38499(Thread var0, Throwable var1) {
      pauseDevMode(var1);
      if (var1 instanceof CompletionException) {
         var1 = var1.getCause();
      }

      if (var1 instanceof ReportedException) {
         Bootstrap.printToSYSOUT(((ReportedException)var1).getCrashReport().getCompleteReport());
         System.exit(-1);
      }

      field45725.error(String.format("Caught exception in thread %s", var0), var1);
   }

   @Nullable
   public static Type<?> method38500(TypeReference var0, String var1) {
      return SharedConstants.field42544 ? method38501(var0, var1) : null;
   }

   @Nullable
   private static Type<?> method38501(TypeReference var0, String var1) {
      Type var4 = null;

      try {
         var4 = DataFixesManager.getDataFixer().getSchema(DataFixUtils.makeKey(SharedConstants.getVersion().getWorldVersion())).getChoiceType(var0, var1);
      } catch (IllegalArgumentException var6) {
         field45725.error("No data fixer registered for {}", var1);
         if (SharedConstants.developmentMode) {
            throw var6;
         }
      }

      return var4;
   }

   public static OS getOSType() {
      String var2 = System.getProperty("os.name").toLowerCase(Locale.ROOT);
      if (!var2.contains("win")) {
         if (!var2.contains("mac")) {
            if (!var2.contains("solaris")) {
               if (!var2.contains("sunos")) {
                  if (!var2.contains("linux")) {
                     return !var2.contains("unix") ? OS.UNKNOWN : OS.LINUX;
                  } else {
                     return OS.LINUX;
                  }
               } else {
                  return OS.SOLARIS;
               }
            } else {
               return OS.SOLARIS;
            }
         } else {
            return OS.OSX;
         }
      } else {
         return OS.WINDOWS;
      }
   }

   public static Stream<String> method38503() {
      RuntimeMXBean var2 = ManagementFactory.getRuntimeMXBean();
      return var2.getInputArguments().stream().filter(var0 -> var0.startsWith("-X"));
   }

   public static <T> T method38504(List<T> var0) {
      return (T)var0.get(var0.size() - 1);
   }

   public static <T> T method38505(Iterable<T> var0, T var1) {
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

   public static <T> T method38506(Iterable<T> var0, T var1) {
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

   public static <T> T method38507(Supplier<T> var0) {
      return (T)var0.get();
   }

   public static <T> T make(T object, Consumer<T> consumer)
   {
      consumer.accept(object);
      return object;
   }

   public static <K> Strategy<K> method38509() {
      return (Strategy<K>) Class2043.field13347;
   }

   public static <V> CompletableFuture<List<V>> gather(List<? extends CompletableFuture<? extends V>> var0) {
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

   public static <T> Stream<T> method38511(Optional<? extends T> var0) {
      return !var0.isPresent() ? Stream.<T>empty() : Stream.<T>of((T)var0.get());
   }

   public static Exception method38512() {
      return field45726;
   }

   public static void method38513(Exception var0) {
      field45726 = var0;
   }

   public static <T> Optional<T> acceptOrElse(Optional<T> var0, Consumer<T> var1, Runnable var2) {
      if (!var0.isPresent()) {
         var2.run();
      } else {
         var1.accept(var0.get());
      }

      return var0;
   }

   public static Runnable method38515(Runnable var0, Supplier<String> var1) {
      return var0;
   }

   public static <T extends Throwable> T pauseDevMode(T var0) {
      if (SharedConstants.developmentMode) {
         field45725.error("Trying to throw a fatal exception, pausing in IDE", var0);

         while (true) {
            try {
               Thread.sleep(1000L);
               field45725.error("paused");
            } catch (InterruptedException var4) {
               return (T)var0;
            }
         }
      } else {
         return (T)var0;
      }
   }

   public static String method38517(Throwable var0) {
      if (var0.getCause() == null) {
         return var0.getMessage() == null ? var0.toString() : var0.getMessage();
      } else {
         return method38517(var0.getCause());
      }
   }

   public static <T> T getRandomObject(T[] var0, Random var1) {
      return (T)var0[var1.nextInt(var0.length)];
   }

   public static int method38519(int[] var0, Random var1) {
      return var0[var1.nextInt(var0.length)];
   }

   private static BooleanSupplier method38520(Path var0, Path var1) {
      return new Class7852(var0, var1);
   }

   private static BooleanSupplier method38521(Path var0) {
      return new Class7851(var0);
   }

   private static BooleanSupplier method38522(Path var0) {
      return new Class7853(var0);
   }

   private static BooleanSupplier method38523(Path var0) {
      return new Class7854(var0);
   }

   private static boolean method38524(BooleanSupplier... var0) {
      for (BooleanSupplier var6 : var0) {
         if (!var6.getAsBoolean()) {
            field45725.warn("Failed to execute {}", var6);
            return false;
         }
      }

      return true;
   }

   private static boolean method38525(int var0, String var1, BooleanSupplier... var2) {
      for (int var5 = 0; var5 < var0; var5++) {
         if (method38524(var2)) {
            return true;
         }

         field45725.error("Failed to {}, retrying {}/{}", var1, var5, var0);
      }

      field45725.error("Failed to {}, aborting, progress might be lost", var1);
      return false;
   }

   public static void method38526(File var0, File var1, File var2) {
      method38527(var0.toPath(), var1.toPath(), var2.toPath());
   }

   public static void method38527(Path var0, Path var1, Path var2) {
      if ((!Files.exists(var0) || method38525(10, "create backup " + var2, method38521(var2), method38520(var0, var2), method38523(var2)))
         && method38525(10, "remove old " + var0, method38521(var0), method38522(var0))
         && !method38525(10, "replace " + var0 + " with " + var1, method38520(var1, var0), method38523(var0))) {
         method38525(10, "restore " + var0 + " from " + var2, method38520(var2, var0), method38523(var0));
      }
   }

   public static int method38528(String var0, int var1, int var2) {
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

   public static Consumer<String> func_240982_a_(String var0, Consumer<String> var1) {
      return var2 -> var1.accept(var0 + var2);
   }

   public static DataResult<int[]> method38530(IntStream var0, int var1) {
      int[] var4 = var0.limit((long)(var1 + 1)).toArray();
      if (var4.length == var1) {
         return DataResult.success(var4);
      } else {
         String var5 = "Input is not a list of " + var1 + " ints";
         return var4.length < var1 ? DataResult.error(var5) : DataResult.error(var5, Arrays.copyOf(var4, var1));
      }
   }

   public static void method38531() {
      Class371 var2 = new Class371("Timer hack thread");
      var2.setDaemon(true);
      var2.setUncaughtExceptionHandler(new DefaultUncaughtExceptionHandler(field45725));
      var2.start();
   }

   public static void method38532(Path var0, Path var1, Path var2) throws IOException {
      Path var5 = var0.relativize(var2);
      Path var6 = var1.resolve(var5);
      Files.copy(var2, var6);
   }

   public static String method38533(String var0, Class8944 var1) {
      return var0.toLowerCase(Locale.ROOT)
         .chars()
         .<CharSequence>mapToObj(var1x -> !var1.method32681((char)var1x) ? "_" : Character.toString((char)var1x))
         .collect(Collectors.joining());
   }

   // $VF: synthetic method
   public static Logger method38542() {
      return field45725;
   }

   // $VF: synthetic method
   public static Exception method38543(Exception var0) {
      field45726 = var0;
      return var0;
   }
}
