package mapped;

import com.google.common.collect.Maps;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;

public class RegistryKey<T> {
   private static final Map<String, RegistryKey<?>> field39298 = Collections.<String, RegistryKey<?>>synchronizedMap(Maps.newIdentityHashMap());
   private final ResourceLocation field39299;
   private final ResourceLocation field39300;

   public static <T> RegistryKey<T> method31395(RegistryKey<? extends Registry<T>> var0, ResourceLocation var1) {
      return getOrCreateKey(var0.field39300, var1);
   }

   public static <T> RegistryKey<Registry<T>> getOrCreateRootKey(ResourceLocation var0) {
      return getOrCreateKey(Registry.ROOT, var0);
   }

   private static <T> RegistryKey<T> getOrCreateKey(ResourceLocation var0, ResourceLocation var1) {
      String var4 = (var0 + ":" + var1).intern();
      return (RegistryKey<T>)field39298.computeIfAbsent(var4, var2 -> new RegistryKey(var0, var1));
   }

   private RegistryKey(ResourceLocation var1, ResourceLocation var2) {
      this.field39299 = var1;
      this.field39300 = var2;
   }

   @Override
   public String toString() {
      return "ResourceKey[" + this.field39299 + " / " + this.field39300 + ']';
   }

   public boolean method31398(RegistryKey<? extends Registry<?>> var1) {
      return this.field39299.equals(var1.method31399());
   }

   public ResourceLocation method31399() {
      return this.field39300;
   }

   public static <T> Function<ResourceLocation, RegistryKey<T>> method31400(RegistryKey<? extends Registry<T>> var0) {
      return var1 -> method31395(var0, var1);
   }
}