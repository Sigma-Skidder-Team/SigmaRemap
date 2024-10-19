package net.minecraft.util;

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
import net.minecraft.util.math.MathHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
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
   private static final AtomicInteger NEXT_SERVER_WORKER_ID = new AtomicInteger(1);
   private static final ExecutorService BOOTSTRAP_SERVICE = createNamedService("Bootstrap");
   private static final ExecutorService SERVER_EXECUTOR = createNamedService("Main");
   private static final ExecutorService RENDERING_SERVICE = startThreadedService();
   public static LongSupplier nanoTimeSupplier = System::nanoTime;
   public static final UUID DUMMY_UUID = new UUID(0L, 0L);
   private static final Logger LOGGER = LogManager.getLogger();
   private static Exception exceptionOpenUrl;

   public static <K, V> Collector < Entry <? extends K, ? extends V > , ? , Map<K, V >> toMapCollector()
   {
      return Collectors.toMap(Entry::getKey, Entry::getValue);
   }

   public static <T extends Comparable<T>> String getValueName(Property<T> property, Object value)
   {
      return property.getName((T)(value));
   }

   public static String makeTranslationKey(String type, @Nullable ResourceLocation id)
   {
      return id == null ? type + ".unregistered_sadface" : type + '.' + id.getNamespace() + '.' + id.getPath().replace('/', '.');
   }

   public static long milliTime() {
      return nanoTime() / 1000000L;
   }

   public static long nanoTime() {
      return nanoTimeSupplier.getAsLong();
   }

   public static long millisecondsSinceEpoch() {
      return Instant.now().toEpochMilli();
   }

   private static ExecutorService createNamedService(String var0) {
      int var3 = MathHelper.clamp(Runtime.getRuntime().availableProcessors() - 1, 1, 7);
      Object var4;
      if (var3 > 0) {
         var4 = new ForkJoinPool(var3, var1 -> {
            Class361 var4x = new Class361(var1);
            var4x.setName("Worker-" + var0 + "-" + NEXT_SERVER_WORKER_ID.getAndIncrement());
            return var4x;
         }, Util::printException, true);
      } else {
         var4 = MoreExecutors.newDirectExecutorService();
      }

      return (ExecutorService)var4;
   }

   public static Executor getBootstrapService() {
      return BOOTSTRAP_SERVICE;
   }

   public static Executor getServerExecutor() {
      return SERVER_EXECUTOR;
   }

   public static Executor getRenderingService() {
      return RENDERING_SERVICE;
   }

   public static void shutdown() {
      shutdownService(SERVER_EXECUTOR);
      shutdownService(RENDERING_SERVICE);
   }

   private static void shutdownService(ExecutorService executorService)
   {
      executorService.shutdown();
      boolean flag;

      try
      {
         flag = executorService.awaitTermination(3L, TimeUnit.SECONDS);
      }
      catch (InterruptedException interruptedexception)
      {
         flag = false;
      }

      if (!flag)
      {
         executorService.shutdownNow();
      }
   }

   private static ExecutorService startThreadedService()
   {
      return Executors.newCachedThreadPool((p_lambda$createIoExecutor$1_0_) ->
      {
         Thread thread = new Thread(p_lambda$createIoExecutor$1_0_);
         thread.setName("IO-Worker-" + NEXT_SERVER_WORKER_ID.getAndIncrement());
         thread.setUncaughtExceptionHandler(Util::printException);
         return thread;
      });
   }

   public static <T> CompletableFuture<T> completedExceptionallyFuture(Throwable throwableIn)
   {
      CompletableFuture<T> completablefuture = new CompletableFuture<>();
      completablefuture.completeExceptionally(throwableIn);
      return completablefuture;
   }

   public static void toRuntimeException(Throwable throwableIn)
   {
      throw throwableIn instanceof RuntimeException ? (RuntimeException)throwableIn : new RuntimeException(throwableIn);
   }

   private static void printException(Thread thread, Throwable throwable)
   {
      pauseDevMode(throwable);

      if (throwable instanceof CompletionException)
      {
         throwable = throwable.getCause();
      }

      if (throwable instanceof ReportedException)
      {
         Bootstrap.printToSYSOUT(((ReportedException)throwable).getCrashReport().getCompleteReport());
         System.exit(-1);
      }

      LOGGER.error(String.format("Caught exception in thread %s", thread), throwable);
   }

   @Nullable
   public static Type<?> attemptDataFix(TypeReference type, String choiceName)
   {
      return !SharedConstants.useDataFixers ? null : attemptDataFixInternal(type, choiceName);
   }

   @Nullable
   private static Type<?> attemptDataFixInternal(TypeReference typeIn, String choiceName)
   {
      Type<?> type = null;

      try
      {
         type = DataFixesManager.getDataFixer().getSchema(DataFixUtils.makeKey(SharedConstants.getVersion().getWorldVersion())).getChoiceType(typeIn, choiceName);
      }
      catch (IllegalArgumentException illegalargumentexception)
      {
         LOGGER.error("No data fixer registered for {}", (Object)choiceName);

         if (SharedConstants.developmentMode)
         {
            throw illegalargumentexception;
         }
      }

      return type;
   }

   public static Util.OS getOSType()
   {
      String s = System.getProperty("os.name").toLowerCase(Locale.ROOT);

      if (s.contains("win"))
      {
         return Util.OS.WINDOWS;
      }
      else if (s.contains("mac"))
      {
         return Util.OS.OSX;
      }
      else if (s.contains("solaris"))
      {
         return Util.OS.SOLARIS;
      }
      else if (s.contains("sunos"))
      {
         return Util.OS.SOLARIS;
      }
      else if (s.contains("linux"))
      {
         return Util.OS.LINUX;
      }
      else
      {
         return s.contains("unix") ? Util.OS.LINUX : Util.OS.UNKNOWN;
      }
   }

   public static Stream<String> getJVMFlags() {
      RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
      return runtimeMXBean.getInputArguments().stream().filter(flag -> flag.startsWith("-X"));
   }

   public static <T> T getLast(List<T> var0) {
      return (T)var0.get(var0.size() - 1);
   }

   public static <T> T getElementAfter(Iterable<T> var0, T var1) {
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

   public static <T> T getElementBefore(Iterable<T> var0, T var1) {
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

   public static <T> T make(Supplier<T> var0) {
      return (T)var0.get();
   }

   public static <T> T make(T object, Consumer<T> consumer)
   {
      consumer.accept(object);
      return object;
   }

   public static <K> Strategy<K> identityHashStrategy() {
      return (Strategy<K>) Util.IdentityStrategy.INSTANCE;
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

   public static <T> Stream<T> streamOptional(Optional<? extends T> var0) {
      return !var0.isPresent() ? Stream.<T>empty() : Stream.<T>of((T)var0.get());
   }

   public static Exception getExceptionOpenUrl() {
      return exceptionOpenUrl;
   }

   public static void setExceptionOpenUrl(Exception var0) {
      exceptionOpenUrl = var0;
   }

   public static <T> Optional<T> acceptOrElse(Optional<T> var0, Consumer<T> var1, Runnable var2) {
      if (!var0.isPresent()) {
         var2.run();
      } else {
         var1.accept(var0.get());
      }

      return var0;
   }

   public static Runnable namedRunnable(Runnable var0, Supplier<String> var1) {
      return var0;
   }

   public static <T extends Throwable> T pauseDevMode(T var0) {
      if (SharedConstants.developmentMode) {
         LOGGER.error("Trying to throw a fatal exception, pausing in IDE", var0);

         while (true) {
            try {
               Thread.sleep(1000L);
               LOGGER.error("paused");
            } catch (InterruptedException var4) {
               return var0;
            }
         }
      } else {
         return var0;
      }
   }

   public static String getMessage(Throwable throwableIn) {
      if (throwableIn.getCause() != null)
      {
         return getMessage(throwableIn.getCause());
      }
      else
      {
         return throwableIn.getMessage() != null ? throwableIn.getMessage() : throwableIn.toString();
      }
   }

   public static <T> T getRandomObject(T[] var0, Random var1) {
      return (T)var0[var1.nextInt(var0.length)];
   }

   public static int getRandomInt(int[] var0, Random var1) {
      return var0[var1.nextInt(var0.length)];
   }

   private static BooleanSupplier func_244363_a(final Path p_244363_0_, final Path p_244363_1_)
   {
      return new BooleanSupplier()
      {
         public boolean getAsBoolean()
         {
            try
            {
               Files.move(p_244363_0_, p_244363_1_);
               return true;
            }
            catch (IOException ioexception)
            {
               Util.LOGGER.error("Failed to rename", (Throwable)ioexception);
               return false;
            }
         }
         public String toString()
         {
            return "rename " + p_244363_0_ + " to " + p_244363_1_;
         }
      };
   }

   private static BooleanSupplier func_244362_a(Path p_244362_0_)
   {
      return new BooleanSupplier()
      {
         public boolean getAsBoolean()
         {
            try
            {
               Files.deleteIfExists(p_244362_0_);
               return true;
            }
            catch (IOException ioexception)
            {
               Util.LOGGER.warn("Failed to delete", (Throwable)ioexception);
               return false;
            }
         }
         public String toString()
         {
            return "delete old " + p_244362_0_;
         }
      };
   }


   private static BooleanSupplier func_244366_b(Path p_244366_0_)
   {
      return new BooleanSupplier()
      {
         public boolean getAsBoolean()
         {
            return !Files.exists(p_244366_0_);
         }
         public String toString()
         {
            return "verify that " + p_244366_0_ + " is deleted";
         }
      };
   }

   private static BooleanSupplier func_244367_c(Path p_244367_0_)
   {
      return new BooleanSupplier()
      {
         public boolean getAsBoolean()
         {
            return Files.isRegularFile(p_244367_0_);
         }
         public String toString()
         {
            return "verify that " + p_244367_0_ + " is present";
         }
      };
   }

   private static boolean method38524(BooleanSupplier... var0) {
      for (BooleanSupplier var6 : var0) {
         if (!var6.getAsBoolean()) {
            LOGGER.warn("Failed to execute {}", var6);
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

         LOGGER.error("Failed to {}, retrying {}/{}", var1, var5, var0);
      }

      LOGGER.error("Failed to {}, aborting, progress might be lost", var1);
      return false;
   }

   public static void backupThenUpdate(File current, File latest, File oldBackup) {
      method38527(current.toPath(), latest.toPath(), oldBackup.toPath());
   }

   public static void method38527(Path var0, Path var1, Path var2) {
      if ((!Files.exists(var0) || method38525(10, "create backup " + var2, func_244362_a(var2), func_244363_a(var0, var2), func_244367_c(var2)))
         && method38525(10, "remove old " + var0, func_244362_a(var0), func_244366_b(var0))
         && !method38525(10, "replace " + var0 + " with " + var1, func_244363_a(var1, var0), func_244367_c(var0))) {
         method38525(10, "restore " + var0 + " from " + var2, func_244363_a(var2, var0), func_244367_c(var0));
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
      var2.setUncaughtExceptionHandler(new DefaultUncaughtExceptionHandler(LOGGER));
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
      return LOGGER;
   }

   public static void method38543(Exception var0) {
      exceptionOpenUrl = var0;
   }

   public enum OS {
      LINUX,
      SOLARIS,
      WINDOWS,
      OSX,
      UNKNOWN;

      OS() {
      }

      public void openURL(URL url) {
         try {
            // Use Runtime to execute the default browser command
            String os = System.getProperty("os.name").toLowerCase();
            String command;

            if (os.contains("win")) {
               // Windows command to open the default browser
               command = "rundll32 url.dll,FileProtocolHandler " + url.toString();
            } else if (os.contains("mac")) {
               // macOS command to open the default browser
               command = "open " + url.toString();
            } else if (os.contains("nix") || os.contains("nux")) {
               // Unix/Linux command to open the default browser
               command = "xdg-open " + url.toString();
            } else {
               throw new UnsupportedOperationException("Unsupported operating system: " + os);
            }

            // Execute the command
            Process process = Runtime.getRuntime().exec(command);
            process.waitFor();  // Wait for the process to complete
         } catch (Exception e) {
            // Log any exceptions that occur
            method38542().error("Couldn't open URL '{}'", url, e);
            method38543(e);
         }
      }

      public void openURI(URI var1) {
         try {
            this.openURL(var1.toURL());
         } catch (MalformedURLException var5) {
            method38542().error("Couldn't open uri '{}'", var1, var5);
         }
      }

      public void openFile(File var1) {
         try {
            this.openURL(var1.toURI().toURL());
         } catch (MalformedURLException var5) {
            method38542().error("Couldn't open file '{}'", var1, var5);
         }
      }

      public void openLink(String var1) {
         try {
            this.openURL(new URI(var1).toURL());
         } catch (URISyntaxException | MalformedURLException | IllegalArgumentException var5) {
            method38542().error("Couldn't open uri '{}'", var1, var5);
         }
      }
   }

   public enum IdentityStrategy implements Strategy<Object> {
      INSTANCE;

       public int hashCode(Object var1) {
         return System.identityHashCode(var1);
      }

      public boolean equals(Object var1, Object var2) {
         return var1 == var2;
      }
   }
}
