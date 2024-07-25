package remapped;

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

public class class_888<T> extends class_3766<T> {
   private static final Logger field_4569 = LogManager.getLogger();
   private final class_3940 field_4566;
   private final class_7522 field_4564;
   private final Map<class_5621<? extends class_8669<?>>, class_1627<?>> field_4567;
   private final class_888<JsonElement> field_4568;

   public static <T> class_888<T> method_3825(DynamicOps<T> var0, class_7832 var1, class_7522 var2) {
      return method_3826(var0, class_3940.method_18207(var1), var2);
   }

   public static <T> class_888<T> method_3826(DynamicOps<T> var0, class_3940 var1, class_7522 var2) {
      class_888 var5 = new class_888(var0, var1, var2, Maps.newIdentityHashMap());
      class_6322.method_28809(var2, var5);
      return var5;
   }

   private class_888(DynamicOps<T> var1, class_3940 var2, class_7522 var3, IdentityHashMap<class_5621<? extends class_8669<?>>, class_1627<?>> var4) {
      super(var1);
      this.field_4566 = var2;
      this.field_4564 = var3;
      this.field_4567 = var4;
      this.field_4568 = var1 != JsonOps.INSTANCE ? new class_888<JsonElement>(JsonOps.INSTANCE, var2, var3, var4) : this;
   }

   public <E> DataResult<Pair<Supplier<E>, T>> method_3827(T var1, class_5621<? extends class_8669<E>> var2, Codec<E> var3, boolean var4) {
      Optional var7 = this.field_4564.method_28814(var2);
      if (var7.isPresent()) {
         class_6433 var8 = (class_6433)var7.get();
         DataResult var9 = class_4639.field_22655.decode(this.field_18419, var1);
         if (var9.result().isPresent()) {
            Pair var10 = (Pair)var9.result().get();
            class_4639 var11 = (class_4639)var10.getFirst();
            return this.method_3824(var2, var8, var3, var11).map(var1x -> Pair.of(var1x, var10.getSecond()));
         } else {
            return var4 ? var3.decode(this, var1).map(var0 -> var0.mapFirst(var0x -> () -> var0x)) : DataResult.error("Inline definitions not allowed here");
         }
      } else {
         return DataResult.error("Unknown registry: " + var2);
      }
   }

   public <E> DataResult<class_5383<E>> method_3829(class_5383<E> var1, class_5621<? extends class_8669<E>> var2, Codec<E> var3) {
      Collection var6 = this.field_4566.method_18209(var2);
      DataResult var7 = DataResult.success(var1, Lifecycle.stable());
      String var8 = var2.method_25499().method_21456() + "/";

      for (class_4639 var10 : var6) {
         String var11 = var10.method_21456();
         if (var11.endsWith(".json")) {
            if (var11.startsWith(var8)) {
               String var12 = var11.substring(var8.length(), var11.length() - ".json".length());
               class_4639 var13 = new class_4639(var10.method_21461(), var12);
               var7 = var7.flatMap(var4 -> this.<T>method_3824(var2, var4, var3, var13).map(var1xx -> var4));
            } else {
               field_4569.warn("Skipping resource {} since it does not have a registry name prefix", var10);
            }
         } else {
            field_4569.warn("Skipping resource {} since it is not a json file", var10);
         }
      }

      return var7.setPartial(var1);
   }

   private <E> DataResult<Supplier<E>> method_3824(class_5621<? extends class_8669<E>> var1, class_6433<E> var2, Codec<E> var3, class_4639 var4) {
      class_5621 var7 = class_5621.method_25497(var1, var4);
      class_1627 var8 = this.method_3822(var1);
      DataResult var9 = (DataResult)class_1627.method_7258(var8).get(var7);
      if (var9 == null) {
         com.google.common.base.Supplier var10 = Suppliers.memoize(() -> {
            Object var4x = var2.method_39799(var7);
            if (var4x != null) {
               return var4x;
            } else {
               throw new RuntimeException("Error during recursive registry parsing, element resolved too early: " + var7);
            }
         });
         class_1627.method_7258(var8).put(var7, DataResult.success(var10));
         DataResult var11 = this.field_4566.method_18208(this.field_4568, var1, var7, var3);
         Optional var12 = var11.result();
         if (var12.isPresent()) {
            Pair var13 = (Pair)var12.get();
            var2.<Object>method_29382((OptionalInt)var13.getSecond(), var7, var13.getFirst(), var11.lifecycle());
         }

         DataResult var14;
         if (!var12.isPresent() && var2.method_39799(var7) != null) {
            var14 = DataResult.success((Supplier<>)() -> var2.method_39799(var7), Lifecycle.stable());
         } else {
            var14 = var11.map(var2x -> () -> var2.method_39799(var7));
         }

         class_1627.method_7258(var8).put(var7, var14);
         return var14;
      } else {
         return var9;
      }
   }

   private <E> class_1627<E> method_3822(class_5621<? extends class_8669<E>> var1) {
      return (class_1627<E>)this.field_4567.computeIfAbsent(var1, var0 -> new class_1627(null));
   }

   public <E> DataResult<class_8669<E>> method_3823(class_5621<? extends class_8669<E>> var1) {
      return this.field_4564
         .method_28814(var1)
         .<DataResult<class_8669<E>>>map(var0 -> DataResult.success(var0, var0.method_39811()))
         .orElseGet(() -> DataResult.error("Unknown registry: " + var1));
   }
}
