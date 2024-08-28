package mapped;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntSupplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.mojang.datafixers.util.Either;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class1812 implements AutoCloseable, Class1813 {
   private static final Logger field9775 = LogManager.getLogger();
   private final Map<Class321<?>, Class8572<? extends Function<Class321<Class2341>, ?>>> field9776;
   private final Set<Class321<?>> field9777;
   private final Class322<Class497> field9778;

   public Class1812(List<Class321<?>> var1, Executor var2, int var3) {
      this.field9776 = var1.stream().collect(Collectors.toMap(Function.<Class321<?>>identity(), var1x -> new Class8572(var1x.method1631() + "_queue", var3)));
      this.field9777 = Sets.newHashSet(var1);
      this.field9778 = new Class322<Class497>(new Class7384(4), var2, "sorter");
   }

   public static Class6875<Runnable> method7960(Runnable var0, long var1, IntSupplier var3) {
      return new Class6875<>((p_219072_1_) -> () -> {
         var0.run();
         p_219072_1_.method1641(Class2341.field16010);
      }, var1, var3);
   }

   public static Class6875<Runnable> method7961(Class8641 var0, Runnable var1) {
      return method7960(var1, var0.method31056().method24352(), var0::method31058);
   }

   public static Class8132 method7962(Runnable var0, long var1, boolean var3) {
      return new Class8132(var0, var1, var3);
   }

   public <T> Class321<Class6875<T>> method7963(Class321<T> var1, boolean var2) {
      return this.field9778.<Class321<Class6875<T>>>method1646(var3 -> new Class497(0, () -> {this.method7969(var1);
                     var3.method1641(
                        Class321.method1648(
                           "chunk priority sorter around " + var1.method1631(),
                           var3xx -> this.method7967(var1, var3xx.field29808, Class6875.method20934(var3xx), Class6875.method20935(var3xx), var2)
                        ));
                  })).join();
   }

   public Class321<Class8132> method7964(Class321<Runnable> var1) {
      return this.field9778
         .<Class321<Class8132>>method1646(
            var2 -> new Class497(
                  0,
                  () -> var2.method1641(
                        Class321.<Class8132>method1648(
                           "chunk priority sorter around " + var1.method1631(),
                           var2xx -> this.method7966(var1, Class8132.method28157(var2xx), Class8132.method28158(var2xx), Class8132.method28159(var2xx))
                        )
                     )
               )
         )
         .join();
   }

   @Override
   public void method7965(Class7481 var1, IntSupplier var2, int var3, IntConsumer var4) {
      this.field9778.method1641(new Class497(0, () -> {
         int var7 = var2.getAsInt();
         this.field9776.values().forEach(var3xx -> var3xx.method30625(var7, var1, var3));
         var4.accept(var3);
      }));
   }

   private <T> void method7966(Class321<T> var1, long var2, Runnable var4, boolean var5) {
      this.field9778.method1641(new Class497(1, () -> {
         Class8572 var8 = this.method7969(var1);
         var8.method30627(var2, var5);
         if (this.field9777.remove(var1)) {
            this.method7968(var8, var1);
         }

         var4.run();
      }));
   }

   private <T> void method7967(Class321<T> var1, Function<Class321<Class2341>, T> var2, long var3, IntSupplier var5, boolean var6) {
      this.field9778.method1641(new Class497(2, () -> {
         Class8572<Function<Class321<Class2341>, T>> var9 = this.method7969(var1);
         int var10 = var5.getAsInt();
         var9.method30626(Optional.of(var2), var3, var10);
         if (var6) {
            var9.method30626(Optional.empty(), var3, var10);
         }

         if (this.field9777.remove(var1)) {
            this.method7968(var9, var1);
         }
      }));
   }

   private <T> void method7968(Class8572<Function<Class321<Class2341>, T>> var1, Class321<T> var2) {
      this.field9778.method1641(new Class497(3, () -> {
         Stream<Either<Function<Class321<Class2341>, T>, Runnable>> var5 = var1.method30629();
         if (var5 != null) {
            Util.gather(var5.map(var1xx -> var1xx.map(var2::method1646, var0x -> {
                  var0x.run();
                  return CompletableFuture.completedFuture(Class2341.field16010);
               })).collect(Collectors.toList())).thenAccept(var3 -> this.method7968(var1, var2));
         } else {
            this.field9777.add(var2);
         }
      }));
   }

   private <T> Class8572<Function<Class321<Class2341>, T>> method7969(Class321<T> var1) {
      Class8572 var4 = this.field9776.get(var1);
      if (var4 != null) {
         return var4;
      } else {
         throw (IllegalArgumentException) Util.method38516(new IllegalArgumentException("No queue for: " + var1));
      }
   }

   @VisibleForTesting
   public String method7970() {
      return this.field9776
            .entrySet()
            .stream()
            .<CharSequence>map(
               var0 -> var0.getKey().method1631()
                     + "=["
                     + var0.getValue().method30630().stream().<CharSequence>map(var0x -> var0x + ":" + new Class7481(var0x)).collect(Collectors.joining(","))
                     + "]"
            )
            .collect(Collectors.joining(","))
         + ", s="
         + this.field9777.size();
   }

   @Override
   public void close() {
      this.field9776.keySet().forEach(Class321::close);
   }
}
