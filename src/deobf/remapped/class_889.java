package remapped;

import com.google.common.collect.Maps;
import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_889 {
   public static final Logger field_4581 = LogManager.getLogger();
   private static final Map<Identifier, Supplier<?>> field_4570 = Maps.newLinkedHashMap();
   private static final class_6433<class_6433<?>> field_4572 = new class_5383<class_6433<?>>(
      class_5621.<class_6433<?>>method_25494(new Identifier("root")), Lifecycle.experimental()
   );
   public static final class_8669<? extends class_8669<?>> field_4574 = field_4572;
   public static final class_8669<class_7929<?>> field_4573 = method_3843(class_8669.field_44412, () -> class_7036.field_36236);
   public static final class_8669<class_987<?>> field_4580 = method_3843(class_8669.field_44406, () -> class_2846.field_13955);
   public static final class_8669<class_5927<?, ?>> field_4577 = method_3843(class_8669.field_44453, () -> class_7024.field_36148);
   public static final class_8669<class_7865<?, ?>> field_4571 = method_3843(class_8669.field_44385, () -> class_8390.field_42923);
   public static final class_8669<class_86> field_4578 = method_3843(class_8669.field_44386, () -> class_4932.field_25532);
   public static final class_8669<class_8115> field_4579 = method_3843(class_8669.field_44413, class_9863::method_45481);
   public static final class_8669<class_6325> field_4582 = method_3843(class_8669.field_44359, () -> class_6297.field_32176);
   public static final class_8669<class_7902> field_4575 = method_3843(class_8669.field_44360, class_7902::method_35719);

   private static <T> class_8669<T> method_3843(class_5621<? extends class_8669<T>> var0, Supplier<T> var1) {
      return method_3841(var0, Lifecycle.stable(), var1);
   }

   private static <T> class_8669<T> method_3841(class_5621<? extends class_8669<T>> var0, Lifecycle var1, Supplier<T> var2) {
      return method_3838(var0, new class_5383<T>(var0, var1), var2, var1);
   }

   private static <T, R extends class_6433<T>> R method_3838(class_5621<? extends class_8669<T>> var0, R var1, Supplier<T> var2, Lifecycle var3) {
      Identifier var6 = var0.method_25499();
      field_4570.put(var6, var2);
      class_6433 var7 = field_4572;
      return var7.<R>method_29381(var0, (R)var1, var3);
   }

   public static <T> T method_3840(class_8669<? super T> var0, String var1, T var2) {
      return method_3844(var0, new Identifier(var1), (T)var2);
   }

   public static <V, T extends V> T method_3844(class_8669<V> var0, Identifier var1, T var2) {
      return ((class_6433)var0).<T>method_29381(class_5621.<T>method_25497(var0.method_39798(), var1), (T)var2, Lifecycle.stable());
   }

   public static <V, T extends V> T method_3839(class_8669<V> var0, int var1, class_5621<V> var2, T var3) {
      return ((class_6433)var0).<T>method_29380(var1, var2, (T)var3, Lifecycle.stable());
   }

   public static void method_3837() {
   }

   static {
      field_4570.forEach((var0, var1) -> {
         if (var1.get() == null) {
            field_4581.error("Unable to bootstrap registry '{}'", var0);
         }
      });
      class_8669.method_39803(field_4572);
   }
}
