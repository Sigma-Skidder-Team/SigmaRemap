package mapped;

import com.google.common.collect.Maps;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;

public class Class8705<T> {
   private static final Map<String, Class8705<?>> field39298 = Collections.<String, Class8705<?>>synchronizedMap(Maps.newIdentityHashMap());
   private final ResourceLocation field39299;
   private final ResourceLocation field39300;

   public static <T> Class8705<T> method31395(Class8705<? extends Class2348<T>> var0, ResourceLocation var1) {
      return method31397(var0.field39300, var1);
   }

   public static <T> Class8705<Class2348<T>> method31396(ResourceLocation var0) {
      return method31397(Class2348.field16033, var0);
   }

   private static <T> Class8705<T> method31397(ResourceLocation var0, ResourceLocation var1) {
      String var4 = (var0 + ":" + var1).intern();
      return (Class8705<T>)field39298.computeIfAbsent(var4, var2 -> new Class8705(var0, var1));
   }

   private Class8705(ResourceLocation var1, ResourceLocation var2) {
      this.field39299 = var1;
      this.field39300 = var2;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.field39299 + " / " + this.field39300 + ']';
   }

   public boolean method31398(Class8705<? extends Class2348<?>> var1) {
      return this.field39299.equals(var1.method31399());
   }

   public ResourceLocation method31399() {
      return this.field39300;
   }

   public static <T> Function<ResourceLocation, Class8705<T>> method31400(Class8705<? extends Class2348<T>> var0) {
      return var1 -> method31395(var0, var1);
   }
}
