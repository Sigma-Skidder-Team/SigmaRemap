package mapped;

import com.google.common.collect.Maps;
import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Class6714 {
   public static final Logger field29420 = LogManager.getLogger();
   private static final Map<ResourceLocation, Supplier<?>> field29421 = Maps.newLinkedHashMap();
   private static final Class2349<Class2349<?>> field29422 = new Class2350<Class2349<?>>(
      Class8705.<Class2349<?>>method31396(new ResourceLocation("root")), Lifecycle.experimental()
   );
   public static final Class2348<? extends Class2348<?>> field29423 = field29422;
   public static final Class2348<Class9319<?>> field29424 = method20493(Class2348.field16100, () -> Class9109.field41856);
   public static final Class2348<Class6815<?>> field29425 = method20493(Class2348.field16101, () -> Class7827.field33606);
   public static final Class2348<Class7909<?, ?>> field29426 = method20493(Class2348.field16102, () -> Class9104.field41770);
   public static final Class2348<Class9300<?, ?>> field29427 = method20493(Class2348.field16103, () -> Class9438.field43835);
   public static final Class2348<Class3622> field29428 = method20493(Class2348.field16104, () -> Class8523.field38251);
   public static final Class2348<Class9369> field29429 = method20493(Class2348.field16105, Class9837::method38885);
   public static final Class2348<Class8907> field29430 = method20493(Class2348.field16106, () -> Class8900.field40281);
   public static final Class2348<Class9309> field29431 = method20493(Class2348.field16099, Class9309::method35170);

   private static <T> Class2348<T> method20493(Class8705<? extends Class2348<T>> var0, Supplier<T> var1) {
      return method20494(var0, Lifecycle.stable(), var1);
   }

   private static <T> Class2348<T> method20494(Class8705<? extends Class2348<T>> var0, Lifecycle var1, Supplier<T> var2) {
      return method20495(var0, new Class2350<T>(var0, var1), var2, var1);
   }

   private static <T, R extends Class2349<T>> R method20495(Class8705<? extends Class2348<T>> var0, R var1, Supplier<T> var2, Lifecycle var3) {
      ResourceLocation var6 = var0.method31399();
      field29421.put(var6, var2);
      Class2349<R> var7 = (Class2349<R>) field29422;
      return  (R) var7.method9250(((Class8705) var0), var1, var3);
   }

   public static <T> T method20496(Class2348<? super T> var0, String var1, T var2) {
      return method20497(var0, new ResourceLocation(var1), (T)var2);
   }

   public static <V, T extends V> T method20497(Class2348<V> var0, ResourceLocation var1, T var2) {
      return ((Class2349<V>)var0).method9250(Class8705.method31395(var0.method9180(), var1), var2, Lifecycle.stable());
   }

   public static <V, T extends V> T method20498(Class2348<V> var0, int var1, Class8705<V> var2, T var3) {
      return ((Class2349<V>)var0).method9249(var1, var2, var3, Lifecycle.stable());
   }

   public static void method20499() {
   }

   static {
      field29421.forEach((var0, var1) -> {
         if (var1.get() == null) {
            field29420.error("Unable to bootstrap registry '{}'", var0);
         }
      });
      Class2348.method9174(field29422);
   }
}