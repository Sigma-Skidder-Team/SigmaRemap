package net.minecraft.util.registry;

import com.google.common.collect.Maps;
import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.function.Supplier;

import mapped.*;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeRegistry;
import net.minecraft.world.gen.carver.ConfiguredCarver;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.structure.StructureFeatures;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WorldGenRegistries {
   public static final Logger field29420 = LogManager.getLogger();
   private static final Map<ResourceLocation, Supplier<?>> field29421 = Maps.newLinkedHashMap();
   private static final MutableRegistry<MutableRegistry<?>> field29422 = new SimpleRegistry<MutableRegistry<?>>(
      RegistryKey.<MutableRegistry<?>>getOrCreateRootKey(new ResourceLocation("root")), Lifecycle.experimental()
   );
   public static final Registry<? extends Registry<?>> field29423 = field29422;
   public static final Registry<Class9319<?>> field29424 = method20493(Registry.field16100, () -> Class9109.field41856);
   public static final Registry<ConfiguredCarver<?>> field29425 = method20493(Registry.field16101, () -> Class7827.field33606);
   public static final Registry<ConfiguredFeature<?, ?>> field29426 = method20493(Registry.field16102, () -> Features.field41770);
   public static final Registry<StructureFeature<?, ?>> field29427 = method20493(Registry.field16103, () -> StructureFeatures.field43835);
   public static final Registry<Class3622> field29428 = method20493(Registry.field16104, () -> Class8523.field38251);
   public static final Registry<Class9369> field29429 = method20493(Registry.field16105, Class9837::method38885);
   public static final Registry<Biome> BIOME = method20493(Registry.BIOME_KEY, () -> BiomeRegistry.PLAINS);
   public static final Registry<DimensionSettings> field29431 = method20493(Registry.NOISE_SETTINGS_KEY, DimensionSettings::method35170);

   private static <T> Registry<T> method20493(RegistryKey<? extends Registry<T>> var0, Supplier<T> var1) {
      return method20494(var0, Lifecycle.stable(), var1);
   }

   private static <T> Registry<T> method20494(RegistryKey<? extends Registry<T>> var0, Lifecycle var1, Supplier<T> var2) {
      return method20495(var0, new SimpleRegistry<T>(var0, var1), var2, var1);
   }

   private static <T, R extends MutableRegistry<T>> R method20495(RegistryKey<? extends Registry<T>> var0, R var1, Supplier<T> var2, Lifecycle var3) {
      ResourceLocation var6 = var0.getLocation();
      field29421.put(var6, var2);
      MutableRegistry<R> var7 = (MutableRegistry<R>) field29422;
      return  (R) var7.register(((RegistryKey) var0), var1, var3);
   }

   public static <T> T method20496(Registry<? super T> var0, String var1, T var2) {
      return method20497(var0, new ResourceLocation(var1), (T)var2);
   }

   public static <V, T extends V> T method20497(Registry<V> var0, ResourceLocation var1, T var2) {
      return ((MutableRegistry<V>)var0).register(RegistryKey.getOrCreateKey(var0.method9180(), var1), var2, Lifecycle.stable());
   }

   public static <V, T extends V> T method20498(Registry<V> var0, int var1, RegistryKey<V> var2, T var3) {
      return ((MutableRegistry<V>)var0).method9249(var1, var2, var3, Lifecycle.stable());
   }

   public static void method20499() {
   }

   static {
      field29421.forEach((var0, var1) -> {
         if (var1.get() == null) {
            field29420.error("Unable to bootstrap registry '{}'", var0);
         }
      });
      Registry.method9174(field29422);
   }
}
