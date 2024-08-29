package mapped;

import com.google.common.base.Suppliers;
import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Supplier;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class WorldSettingsImport<T> extends Class6712<T> {
   private static final Logger field29412 = LogManager.getLogger();
   private final Class4383 field29413;
   private final Class8905 field29414;
   private final Map<RegistryKey<? extends Registry<?>>, Class7269<?>> field29415;
   private final WorldSettingsImport<JsonElement> field29416;

   public static <T> WorldSettingsImport<T> create(DynamicOps<T> var0, IResourceManager var1, Class8905 var2) {
      return method20472(var0, Class4383.method13751(var1), var2);
   }

   public static <T> WorldSettingsImport<T> method20472(DynamicOps<T> var0, Class4383 var1, Class8905 var2) {
      WorldSettingsImport var5 = new WorldSettingsImport(var0, var1, var2, Maps.newIdentityHashMap());
      DynamicRegistries.method32461(var2, var5);
      return var5;
   }

   private WorldSettingsImport(DynamicOps<T> var1, Class4383 var2, Class8905 var3, IdentityHashMap<RegistryKey<? extends Registry<?>>, Class7269<?>> var4) {
      super(var1);
      this.field29413 = var2;
      this.field29414 = var3;
      this.field29415 = var4;
      this.field29416 = var1 != JsonOps.INSTANCE ? new WorldSettingsImport<>(JsonOps.INSTANCE, var2, var3, var4) : (WorldSettingsImport<JsonElement>) this;
   }

   public <E> DataResult<Pair<Supplier<E>, T>> method20473(T var1, RegistryKey<? extends Registry<E>> var2, Codec<E> var3, boolean var4) {
      Optional var7 = this.field29414.method32452(var2);
      if (var7.isPresent()) {
         Class2349 var8 = (Class2349)var7.get();
         DataResult var9 = ResourceLocation.field13020.decode(this.field29417, var1);
         if (var9.result().isPresent()) {
            Pair var10 = (Pair)var9.result().get();
            ResourceLocation var11 = (ResourceLocation)var10.getFirst();
            return this.method20475(var2, var8, var3, var11).map(var1x -> Pair.of(var1x, var10.getSecond()));
         } else {
            return var4 ? var3.decode(this, var1).map(var0 -> var0.mapFirst(var0x -> () -> var0x)) : DataResult.error("Inline definitions not allowed here");
         }
      } else {
         return DataResult.error("Unknown registry: " + var2);
      }
   }

   public <E> DataResult<Class2350<E>> method20474(Class2350<E> var1, RegistryKey<? extends Registry<E>> var2, Codec<E> var3) {
      Collection<ResourceLocation> var6 = this.field29413.method13746(var2);
      DataResult<Class2350<E>> var7 = DataResult.success(var1, Lifecycle.stable());
      String var8 = var2.method31399().method8292() + "/";

      for (ResourceLocation var10 : var6) {
         String var11 = var10.method8292();
         if (var11.endsWith(".json")) {
            if (var11.startsWith(var8)) {
               String var12 = var11.substring(var8.length(), var11.length() - ".json".length());
               ResourceLocation var13 = new ResourceLocation(var10.method8293(), var12);
               var7 = var7.flatMap(var4 -> this.method20475(var2, var4, var3, var13).map(var1xx -> var4));
            } else {
               field29412.warn("Skipping resource {} since it does not have a registry name prefix", var10);
            }
         } else {
            field29412.warn("Skipping resource {} since it is not a json file", var10);
         }
      }

      return var7.setPartial(var1);
   }

   private <E> DataResult<Supplier<E>> method20475(RegistryKey<? extends Registry<E>> var1, Class2349<E> var2, Codec<E> var3, ResourceLocation var4) {
      RegistryKey<E> var7 = RegistryKey.method31395(var1, var4);
      Class7269<E> var8 = this.method20476(var1);
      DataResult<Supplier<E>> var9 = (DataResult<Supplier<E>>) Class7269.method22833(var8).get(var7);
      if (var9 == null) {
         com.google.common.base.Supplier<E> var10 = Suppliers.memoize(() -> {
            E var4x = var2.method9183(var7);
            if (var4x != null) {
               return var4x;
            } else {
               throw new RuntimeException("Error during recursive registry parsing, element resolved too early: " + var7);
            }
         });

         Class7269.method22833(var8).put(var7, DataResult.success(var10));
         DataResult<Pair<E, OptionalInt>> var11 = this.field29413.method13747(this.field29416, var1, var7, var3);
         Optional<Pair<E, OptionalInt>> var12 = var11.result();
         if (var12.isPresent()) {
            Pair<E, OptionalInt> var13 = var12.get();
            var2.method9251(var13.getSecond(), var7, var13.getFirst(), var11.lifecycle());
         }

         DataResult<Supplier<E>> var14;
         if (!var12.isPresent() && var2.method9183(var7) != null) {
            var14 = DataResult.success(() -> var2.method9183(var7), Lifecycle.stable());
         } else {
            var14 = var11.map((instanceIndexPair) -> () -> var2.method9183(var7));
         }

         Class7269.method22833(var8).put(var7, var14);
         return var14;
      } else {
         return var9;
      }
   }


   private <E> Class7269<E> method20476(RegistryKey<? extends Registry<E>> var1) {
      return (Class7269<E>)this.field29415.computeIfAbsent(var1, var0 -> new Class7269());
   }

   public <E> DataResult<Registry<E>> method20477(RegistryKey<? extends Registry<E>> var1) {
      return this.field29414
         .method32452(var1)
         .<DataResult<Registry<E>>>map(var0 -> DataResult.success(var0, var0.method9186()))
         .orElseGet(() -> DataResult.error("Unknown registry: " + var1));
   }

   // $VF: synthetic method
   public static Logger method20490() {
      return field29412;
   }
}
