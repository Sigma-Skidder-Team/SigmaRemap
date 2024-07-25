package remapped;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixer;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.OptionalDynamic;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongLinkedOpenHashSet;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Optional;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_9821<R> implements AutoCloseable {
   private static final Logger field_49768 = LogManager.getLogger();
   private final class_1983 field_49764;
   private final Long2ObjectMap<Optional<R>> field_49766 = new Long2ObjectOpenHashMap();
   private final LongLinkedOpenHashSet field_49763 = new LongLinkedOpenHashSet();
   private final Function<Runnable, Codec<R>> field_49771;
   private final Function<Runnable, R> field_49767;
   private final DataFixer field_49769;
   private final class_5397 field_49765;

   public class_9821(File var1, Function<Runnable, Codec<R>> var2, Function<Runnable, R> var3, DataFixer var4, class_5397 var5, boolean var6) {
      this.field_49771 = var2;
      this.field_49767 = var3;
      this.field_49769 = var4;
      this.field_49765 = var5;
      this.field_49764 = new class_1983(var1, var6, var1.getName());
   }

   public void method_45259(BooleanSupplier var1) {
      while (!this.field_49763.isEmpty() && var1.getAsBoolean()) {
         class_2034 var4 = class_6979.method_31920(this.field_49763.firstLong()).method_31917();
         this.method_45258(var4);
      }
   }

   @Nullable
   public Optional<R> method_45266(long var1) {
      return (Optional<R>)this.field_49766.get(var1);
   }

   public Optional<R> method_45260(long var1) {
      class_6979 var5 = class_6979.method_31920(var1);
      if (!this.method_45261(var5)) {
         Optional var6 = this.method_45266(var1);
         if (var6 == null) {
            this.method_45263(var5.method_31917());
            var6 = this.method_45266(var1);
            if (var6 != null) {
               return var6;
            } else {
               throw (IllegalStateException) Util.method_44658(new IllegalStateException());
            }
         } else {
            return var6;
         }
      } else {
         return Optional.<R>empty();
      }
   }

   public boolean method_45261(class_6979 var1) {
      return World.method_29571(class_6979.method_31908(var1.method_31918()));
   }

   public R method_45269(long var1) {
      Optional var5 = this.method_45260(var1);
      if (!var5.isPresent()) {
         Object var6 = this.field_49767.apply(() -> this.method_45270(var1));
         this.field_49766.put(var1, Optional.<Object>of(var6));
         return (R)var6;
      } else {
         return (R)var5.get();
      }
   }

   private void method_45263(class_2034 var1) {
      this.method_45268(var1, class_3504.field_17178, this.method_45271(var1));
   }

   @Nullable
   private class_5734 method_45271(class_2034 var1) {
      try {
         return this.field_49764.method_9148(var1);
      } catch (IOException var5) {
         field_49768.error("Error reading chunk {} data from disk", var1, var5);
         return null;
      }
   }

   private <T> void method_45268(class_2034 var1, DynamicOps<T> var2, T var3) {
      if (var3 != null) {
         Dynamic var6 = new Dynamic(var2, var3);
         int var7 = method_45265(var6);
         int var8 = class_7665.method_34674().getWorldVersion();
         boolean var9 = var7 != var8;
         Dynamic var10 = this.field_49769.update(this.field_49765.method_24571(), var6, var7, var8);
         OptionalDynamic var11 = var10.get("Sections");

         for (int var12 = 0; var12 < 16; var12++) {
            long var13 = class_6979.method_31922(var1, var12).method_31925();
            Optional var15 = var11.get(Integer.toString(var12))
               .result()
               .flatMap(var3x -> this.field_49771.apply(() -> this.method_45270(var13)).parse(var3x).resultOrPartial(field_49768::error));
            this.field_49766.put(var13, var15);
            var15.ifPresent(var4 -> {
               this.method_45267(var13);
               if (var9) {
                  this.method_45270(var13);
               }
            });
         }
      } else {
         for (int var16 = 0; var16 < 16; var16++) {
            this.field_49766.put(class_6979.method_31922(var1, var16).method_31925(), Optional.empty());
         }
      }
   }

   private void method_45258(class_2034 var1) {
      Dynamic var4 = this.method_45264(var1, class_3504.field_17178);
      class_8406 var5 = (class_8406)var4.getValue();
      if (!(var5 instanceof class_5734)) {
         field_49768.error("Expected compound tag, got {}", var5);
      } else {
         this.field_49764.method_9152(var1, (class_5734)var5);
      }
   }

   private <T> Dynamic<T> method_45264(class_2034 var1, DynamicOps<T> var2) {
      HashMap var5 = Maps.newHashMap();

      for (int var6 = 0; var6 < 16; var6++) {
         long var7 = class_6979.method_31922(var1, var6).method_31925();
         this.field_49763.remove(var7);
         Optional var9 = (Optional)this.field_49766.get(var7);
         if (var9 != null && var9.isPresent()) {
            DataResult var10 = this.field_49771.apply(() -> this.method_45270(var7)).encodeStart(var2, var9.get());
            String var11 = Integer.toString(var6);
            var10.resultOrPartial(field_49768::error).ifPresent(var3 -> var5.put(var2.createString(var11), var3));
         }
      }

      return new Dynamic(
         var2,
         var2.createMap(
            ImmutableMap.of(
               var2.createString("Sections"),
               var2.createMap(var5),
               var2.createString("DataVersion"),
               var2.createInt(class_7665.method_34674().getWorldVersion())
            )
         )
      );
   }

   public void method_45267(long var1) {
   }

   public void method_45270(long var1) {
      Optional var5 = (Optional)this.field_49766.get(var1);
      if (var5 != null && var5.isPresent()) {
         this.field_49763.add(var1);
      } else {
         field_49768.warn("No data for position: {}", class_6979.method_31920(var1));
      }
   }

   private static int method_45265(Dynamic<?> var0) {
      return var0.get("DataVersion").asInt(1945);
   }

   public void method_45257(class_2034 var1) {
      if (!this.field_49763.isEmpty()) {
         for (int var4 = 0; var4 < 16; var4++) {
            long var5 = class_6979.method_31922(var1, var4).method_31925();
            if (this.field_49763.contains(var5)) {
               this.method_45258(var1);
               return;
            }
         }
      }
   }

   @Override
   public void close() throws IOException {
      this.field_49764.close();
   }
}
