package mapped;

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

public abstract class Class8904 {
   private static final Logger field40298 = LogManager.getLogger();
   private static final Map<RegistryKey<? extends Registry<?>>, Class9305<?>> field40299 = Util.<Map<RegistryKey<? extends Registry<?>>, Class9305<?>>>method38507(
      () -> {
         Builder var2 = ImmutableMap.builder();
         method32456(var2, Registry.field16066, Class9535.field44369, Class9535.field44369);
         method32456(var2, Registry.BIOME_KEY, Biome.field40307, Biome.field40308);
         method32455(var2, Registry.field16100, Class9319.field43262);
         method32455(var2, Registry.field16101, Class6815.field29674);
         method32455(var2, Registry.field16102, Class7909.field33882);
         method32455(var2, Registry.field16103, Class9300.field43171);
         method32455(var2, Registry.field16104, Class7525.field32305);
         method32455(var2, Registry.field16105, Class9369.field43491);
         method32455(var2, Registry.field16099, Class9309.field43220);
         return var2.build();
      }
   );
   private static final Class8905 field40300 = Util.<Class8905>method38507(
      () -> {
         Class8905 var2 = new Class8905();
         Class9535.method36868(var2);
         field40299.keySet()
            .stream()
            .filter(var0 -> !var0.equals(Registry.field16066))
            .forEach(var1 -> method32459(var2, (RegistryKey<? extends Registry<?>>)var1));
         return var2;
      }
   );

   public abstract <E> Optional<Class2349<E>> method32452(RegistryKey<? extends Registry<E>> var1);

   public <E> Class2349<E> method32453(RegistryKey<? extends Registry<E>> var1) {
      return this.<E>method32452(var1).orElseThrow(() -> new IllegalStateException("Missing registry: " + var1));
   }

   public Registry<Class9535> method32454() {
      return this.<Class9535>method32453(Registry.field16066);
   }

   private static <E> void method32455(Builder<RegistryKey<? extends Registry<?>>, Class9305<?>> var0, RegistryKey<? extends Registry<E>> var1, Codec<E> var2) {
      var0.put(var1, new Class9305(var1, var2, (Codec<E>)null));
   }

   private static <E> void method32456(
           Builder<RegistryKey<? extends Registry<?>>, Class9305<?>> var0, RegistryKey<? extends Registry<E>> var1, Codec<E> var2, Codec<E> var3
   ) {
      var0.put(var1, new Class9305(var1, var2, var3));
   }

   public static Class8905 method32457() {
      Class8905 var2 = new Class8905();
      Class4382 var3 = new Class4382();

      for (Class9305 var5 : field40299.values()) {
         method32458(var2, var3, var5);
      }

      Class6711.method20472(JsonOps.INSTANCE, var3, var2);
      return var2;
   }

   private static <E> void method32458(Class8905 var0, Class4382 var1, Class9305<E> var2) {
      RegistryKey<? extends Registry<E>> var5 = var2.method35116();
      boolean var6 = !var5.equals(Registry.field16099) && !var5.equals(Registry.field16066);
      Class2349<E> var7 = field40300.method32453(var5);
      Class2349<E>  var8 = var0.method32453(var5);

      for (Entry<RegistryKey<E>, E> var10 : var7.method9191()) {
         E var11 = var10.getValue();
         if (!var6) {
            var8.method9249(var7.method9171(var11), var10.getKey(), var11, var7.method9185(var11));
         } else {
            var1.method13745(field40300, var10.getKey(), var2.method35117(), var7.method9171(var11), var11, var7.method9185(var11));
         }
      }
   }

   private static <R extends Registry<?>> void method32459(Class8905 var0, RegistryKey<R> var1) {
      Registry var4 = Class6714.field29423;
      Registry var5 = (Registry)var4.method9183(var1);
      if (var5 != null) {
         method32460(var0, var5);
      } else {
         throw new IllegalStateException("Missing builtin registry: " + var1);
      }
   }

   private static <E> void method32460(Class8905 var0, Registry<E> var1) {
      Class2349<E>  var4 = var0.method32452(var1.method9180()).orElseThrow(() -> new IllegalStateException("Missing registry: " + var1.method9180()));

      for (Entry<RegistryKey<E>, E> var6 : var1.method9191()) {
         E var7 = var6.getValue();
         var4.method9249(var1.method9171(var7), var6.getKey(), var7, var1.method9185(var7));
      }
   }

   public static void method32461(Class8905 var0, Class6711<?> var1) {
      for (Class9305 var5 : field40299.values()) {
         method32462(var1, var0, var5);
      }
   }

   private static <E> void method32462(Class6711<?> var0, Class8905 var1, Class9305<E> var2) {
      RegistryKey<? extends Registry<E>> var5 = var2.method35116();
      Class2350<E> var6 = Optional.ofNullable((Class2350<E>) Class8905.method32485(var1).get(var5))
         .orElseThrow(() -> new IllegalStateException("Missing registry: " + var5));
      DataResult<Class2350<E>> var7 = var0.method20474(var6, var2.method35116(), var2.method35117());
      var7.error().ifPresent(var0x -> field40298.error("Error loading registry data: {}", var0x.message()));
   }

   // $VF: synthetic method
   public static Map<RegistryKey<? extends Registry<?>>, Class9305<?>> method32472() {
      return field40299;
   }
}
