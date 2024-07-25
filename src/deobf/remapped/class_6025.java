package remapped;

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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_6025 implements AutoCloseable, class_4568 {
   private static final Logger field_30773 = LogManager.getLogger();
   private final Map<class_8816<?>, class_5077<? extends Function<class_8816<class_3256>, ?>>> field_30771;
   private final Set<class_8816<?>> field_30775;
   private final class_2696<class_9465> field_30774;

   public class_6025(List<class_8816<?>> var1, Executor var2, int var3) {
      this.field_30771 = var1.stream()
         .collect(Collectors.toMap(Function.<class_8816<?>>identity(), var1x -> new class_5077(var1x.method_40492() + "_queue", var3)));
      this.field_30775 = Sets.newHashSet(var1);
      this.field_30774 = new class_2696<class_9465>(new class_5943(4), var2, "sorter");
   }

   public static class_1069<Runnable> method_27494(Runnable var0, long var1, IntSupplier var3) {
      return new class_1069<Runnable>(var1x -> () -> {
            var0.run();
            var1x.method_40495(class_3256.field_16155);
         }, var1, var3, null);
   }

   public static class_1069<Runnable> method_27493(class_5344 var0, Runnable var1) {
      return method_27494(var1, var0.method_24368().method_9539(), var0::method_24345);
   }

   public static class_3684 method_27485(Runnable var0, long var1, boolean var3) {
      return new class_3684(var0, var1, var3, null);
   }

   public <T> class_8816<class_1069<T>> method_27488(class_8816<T> var1, boolean var2) {
      return this.field_30774
         .<class_8816<class_1069<T>>>method_40493(
            var3 -> new class_9465(
                  0,
                  () -> {
                     this.method_27487(var1);
                     var3.method_40495(
                        class_8816.<class_1069>method_40496(
                           "chunk priority sorter around " + var1.method_40492(),
                           var3xx -> this.method_27486(
                                 var1, class_1069.method_4689(var3xx), class_1069.method_4690(var3xx), class_1069.method_4692(var3xx), var2
                              )
                        )
                     );
                  }
               )
         )
         .join();
   }

   public class_8816<class_3684> method_27490(class_8816<Runnable> var1) {
      return this.field_30774
         .<class_8816<class_3684>>method_40493(
            var2 -> new class_9465(
                  0,
                  () -> var2.method_40495(
                        class_8816.<class_3684>method_40496(
                           "chunk priority sorter around " + var1.method_40492(),
                           var2xx -> this.method_27495(var1, class_3684.method_17105(var2xx), class_3684.method_17106(var2xx), class_3684.method_17108(var2xx))
                        )
                     )
               )
         )
         .join();
   }

   @Override
   public void method_21208(class_2034 var1, IntSupplier var2, int var3, IntConsumer var4) {
      this.field_30774.method_40495(new class_9465(0, () -> {
         int var7 = var2.getAsInt();
         this.field_30771.values().forEach(var3xx -> var3xx.method_23354(var7, var1, var3));
         var4.accept(var3);
      }));
   }

   private <T> void method_27495(class_8816<T> var1, long var2, Runnable var4, boolean var5) {
      this.field_30774.method_40495(new class_9465(1, () -> {
         class_5077 var8 = this.method_27487(var1);
         var8.method_23349(var2, var5);
         if (this.field_30775.remove(var1)) {
            this.method_27491(var8, var1);
         }

         var4.run();
      }));
   }

   private <T> void method_27486(class_8816<T> var1, Function<class_8816<class_3256>, T> var2, long var3, IntSupplier var5, boolean var6) {
      this.field_30774.method_40495(new class_9465(2, () -> {
         class_5077 var9 = this.method_27487(var1);
         int var10 = var5.getAsInt();
         var9.method_23353(Optional.<Function>of(var2), var3, var10);
         if (var6) {
            var9.method_23353(Optional.<T>empty(), var3, var10);
         }

         if (this.field_30775.remove(var1)) {
            this.method_27491(var9, var1);
         }
      }));
   }

   private <T> void method_27491(class_5077<Function<class_8816<class_3256>, T>> var1, class_8816<T> var2) {
      this.field_30774.method_40495(new class_9465(3, () -> {
         Stream var5 = var1.method_23351();
         if (var5 != null) {
            class_9665.method_44680(var5.<CompletableFuture>map(var1xx -> (CompletableFuture)var1xx.map(var2::method_40493, var0x -> {
                  var0x.run();
                  return CompletableFuture.<class_3256>completedFuture(class_3256.field_16155);
               })).collect(Collectors.toList())).thenAccept(var3 -> this.method_27491(var1, var2));
         } else {
            this.field_30775.add(var2);
         }
      }));
   }

   private <T> class_5077<Function<class_8816<class_3256>, T>> method_27487(class_8816<T> var1) {
      class_5077 var4 = this.field_30771.get(var1);
      if (var4 != null) {
         return var4;
      } else {
         throw (IllegalArgumentException)class_9665.method_44658(new IllegalArgumentException("No queue for: " + var1));
      }
   }

   @VisibleForTesting
   public String method_27489() {
      return this.field_30771
            .entrySet()
            .stream()
            .<CharSequence>map(
               var0 -> var0.getKey().method_40492()
                     + "=["
                     + var0.getValue().method_23352().stream().<CharSequence>map(var0x -> var0x + ":" + new class_2034(var0x)).collect(Collectors.joining(","))
                     + "]"
            )
            .collect(Collectors.joining(","))
         + ", s="
         + this.field_30775.size();
   }

   @Override
   public void close() {
      this.field_30771.keySet().forEach(class_8816::close);
   }
}
