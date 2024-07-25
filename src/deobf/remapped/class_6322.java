package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JsonOps;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class class_6322 {
   private static final Logger field_32280 = LogManager.getLogger();
   private static final Map<class_5621<? extends class_8669<?>>, class_7883<?>> field_32282 = Util.<Map<class_5621<? extends class_8669<?>>, class_7883<?>>>method_44660(
      () -> {
         Builder var2 = ImmutableMap.builder();
         method_28816(var2, class_8669.field_44415, class_8760.field_44837, class_8760.field_44837);
         method_28816(var2, class_8669.field_44359, class_6325.field_32307, class_6325.field_32290);
         method_28812(var2, class_8669.field_44412, class_7929.field_40559);
         method_28812(var2, class_8669.field_44406, class_987.field_5032);
         method_28812(var2, class_8669.field_44453, class_5927.field_30063);
         method_28812(var2, class_8669.field_44385, class_7865.field_40269);
         method_28812(var2, class_8669.field_44386, class_2111.field_10591);
         method_28812(var2, class_8669.field_44413, class_8115.field_41594);
         method_28812(var2, class_8669.field_44360, class_7902.field_40409);
         return var2.build();
      }
   );
   private static final class_7522 field_32281 = Util.<class_7522>method_44660(
      () -> {
         class_7522 var2 = new class_7522();
         class_8760.method_40235(var2);
         field_32282.keySet()
            .stream()
            .filter(var0 -> !var0.equals(class_8669.field_44415))
            .forEach(var1 -> method_28815(var2, (class_5621<? extends class_8669<?>>)var1));
         return var2;
      }
   );

   public abstract <E> Optional<class_6433<E>> method_28814(class_5621<? extends class_8669<E>> var1);

   public <E> class_6433<E> method_28813(class_5621<? extends class_8669<E>> var1) {
      return this.<E>method_28814(var1).orElseThrow(() -> new IllegalStateException("Missing registry: " + var1));
   }

   public class_8669<class_8760> method_28811() {
      return this.<class_8760>method_28813(class_8669.field_44415);
   }

   private static <E> void method_28812(
      Builder<class_5621<? extends class_8669<?>>, class_7883<?>> var0, class_5621<? extends class_8669<E>> var1, Codec<E> var2
   ) {
      var0.put(var1, new class_7883(var1, var2, (Codec<E>)null));
   }

   private static <E> void method_28816(
      Builder<class_5621<? extends class_8669<?>>, class_7883<?>> var0, class_5621<? extends class_8669<E>> var1, Codec<E> var2, Codec<E> var3
   ) {
      var0.put(var1, new class_7883(var1, var2, var3));
   }

   public static class_7522 method_28810() {
      class_7522 var2 = new class_7522();
      class_126 var3 = new class_126();

      for (class_7883 var5 : field_32282.values()) {
         method_28808(var2, var3, var5);
      }

      class_888.method_3826(JsonOps.INSTANCE, var3, var2);
      return var2;
   }

   private static <E> void method_28808(class_7522 var0, class_126 var1, class_7883<E> var2) {
      class_5621 var5 = var2.method_35647();
      boolean var6 = !var5.equals(class_8669.field_44360) && !var5.equals(class_8669.field_44415);
      class_6433 var7 = field_32281.method_28813(var5);
      class_6433 var8 = var0.method_28813(var5);

      for (Entry var10 : var7.method_39808()) {
         Object var11 = var10.getValue();
         if (!var6) {
            var8.<Object>method_29380(var7.method_14041(var11), (class_5621)var10.getKey(), var11, var7.method_39813(var11));
         } else {
            var1.method_392(field_32281, (class_5621<Object>)var10.getKey(), var2.method_35644(), var7.method_14041(var11), var11, var7.method_39813(var11));
         }
      }
   }

   private static <R extends class_8669<?>> void method_28815(class_7522 var0, class_5621<R> var1) {
      class_8669 var4 = class_889.field_4574;
      class_8669 var5 = (class_8669)var4.method_39799(var1);
      if (var5 != null) {
         method_28806(var0, var5);
      } else {
         throw new IllegalStateException("Missing builtin registry: " + var1);
      }
   }

   private static <E> void method_28806(class_7522 var0, class_8669<E> var1) {
      class_6433 var4 = (class_6433)var0.method_28814(var1.method_39798())
         .orElseThrow(() -> new IllegalStateException("Missing registry: " + var1.method_39798()));

      for (Entry var6 : var1.method_39808()) {
         Object var7 = var6.getValue();
         var4.<Object>method_29380(var1.method_14041(var7), (class_5621)var6.getKey(), var7, var1.method_39813(var7));
      }
   }

   public static void method_28809(class_7522 var0, class_888<?> var1) {
      for (class_7883 var5 : field_32282.values()) {
         method_28804(var1, var0, var5);
      }
   }

   private static <E> void method_28804(class_888<?> var0, class_7522 var1, class_7883<E> var2) {
      class_5621 var5 = var2.method_35647();
      class_5383 var6 = (class_5383)Optional.<Object>ofNullable((class_5383)class_7522.method_34276(var1).get(var5))
         .<Object>map(var0x -> (Object)var0x)
         .orElseThrow(() -> new IllegalStateException("Missing registry: " + var5));
      DataResult var7 = var0.method_3829(var6, var2.method_35647(), var2.method_35644());
      var7.error().ifPresent(var0x -> field_32280.error("Error loading registry data: {}", var0x.message()));
   }
}
