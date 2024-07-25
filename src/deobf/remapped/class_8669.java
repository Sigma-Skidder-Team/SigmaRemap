package remapped;

import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Keyable;
import com.mojang.serialization.Lifecycle;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import javax.annotation.Nullable;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class class_8669<T> implements Codec<T>, Keyable, class_3072<T> {
   public static final Logger field_44408 = LogManager.getLogger();
   private static final Map<class_4639, Supplier<?>> field_44358 = Maps.newLinkedHashMap();
   public static final class_4639 field_44448 = new class_4639("root");
   public static final class_6433<class_6433<?>> field_44444 = new class_5383<class_6433<?>>(method_39804("root"), Lifecycle.experimental());
   public static final class_8669<? extends class_8669<?>> field_44446 = field_44444;
   public static final class_5621<class_8669<class_8461>> field_44362 = method_39804("sound_event");
   public static final class_5621<class_8669<class_2340>> field_44458 = method_39804("fluid");
   public static final class_5621<class_8669<class_1425>> field_44439 = method_39804("mob_effect");
   public static final class_5621<class_8669<class_6414>> field_44377 = method_39804("block");
   public static final class_5621<class_8669<class_4382>> field_44422 = method_39804("enchantment");
   public static final class_5621<class_8669<class_6629<?>>> field_44395 = method_39804("entity_type");
   public static final class_5621<class_8669<class_2451>> field_44440 = method_39804("item");
   public static final class_5621<class_8669<class_6004>> field_44465 = method_39804("potion");
   public static final class_5621<class_8669<class_8583<?>>> field_44455 = method_39804("particle_type");
   public static final class_5621<class_8669<class_133<?>>> field_44464 = method_39804("block_entity_type");
   public static final class_5621<class_8669<class_6933>> field_44388 = method_39804("motive");
   public static final class_5621<class_8669<class_4639>> field_44378 = method_39804("custom_stat");
   public static final class_5621<class_8669<class_7335>> field_44442 = method_39804("chunk_status");
   public static final class_5621<class_8669<class_7768<?>>> field_44437 = method_39804("rule_test");
   public static final class_5621<class_8669<class_6614<?>>> field_44438 = method_39804("pos_rule_test");
   public static final class_5621<class_8669<class_4165<?>>> field_44393 = method_39804("menu");
   public static final class_5621<class_8669<class_1510<?>>> field_44379 = method_39804("recipe_type");
   public static final class_5621<class_8669<class_2994<?>>> field_44396 = method_39804("recipe_serializer");
   public static final class_5621<class_8669<class_225>> field_44371 = method_39804("attribute");
   public static final class_5621<class_8669<class_9478<?>>> field_44423 = method_39804("stat_type");
   public static final class_5621<class_8669<class_8853>> field_44443 = method_39804("villager_type");
   public static final class_5621<class_8669<class_4466>> field_44356 = method_39804("villager_profession");
   public static final class_5621<class_8669<class_236>> field_44380 = method_39804("point_of_interest_type");
   public static final class_5621<class_8669<class_6044<?>>> field_44370 = method_39804("memory_module_type");
   public static final class_5621<class_8669<class_3172<?>>> field_44405 = method_39804("sensor_type");
   public static final class_5621<class_8669<class_3975>> field_44429 = method_39804("schedule");
   public static final class_5621<class_8669<class_6275>> field_44428 = method_39804("activity");
   public static final class_5621<class_8669<class_3515>> field_44409 = method_39804("loot_pool_entry_type");
   public static final class_5621<class_8669<class_1404>> field_44416 = method_39804("loot_function_type");
   public static final class_5621<class_8669<class_2190>> field_44421 = method_39804("loot_condition_type");
   public static final class_5621<class_8669<class_8760>> field_44415 = method_39804("dimension_type");
   public static final class_5621<class_8669<class_6486>> field_44372 = method_39804("dimension");
   public static final class_5621<class_8669<class_8472>> field_44420 = method_39804("dimension");
   public static final class_8669<class_8461> field_44369 = method_39812(field_44362, () -> class_463.field_2732);
   public static final class_3991<class_2340> field_44447 = method_39796(field_44458, "empty", () -> class_8532.field_43673);
   public static final class_8669<class_1425> field_44436 = method_39812(field_44439, () -> class_4054.field_19719);
   public static final class_3991<class_6414> field_44462 = method_39796(field_44377, "air", () -> class_4783.field_23184);
   public static final class_8669<class_4382> field_44445 = method_39812(field_44422, () -> class_3668.field_17876);
   public static final class_3991<class_6629<?>> field_44400 = method_39796(field_44395, "pig", () -> class_6629.field_34252);
   public static final class_3991<class_2451> field_44382 = method_39796(field_44440, "air", () -> class_4897.field_25302);
   public static final class_3991<class_6004> field_44365 = method_39796(field_44465, "empty", () -> class_3697.field_18134);
   public static final class_8669<class_8583<?>> field_44387 = method_39812(field_44455, () -> class_3090.field_15325);
   public static final class_8669<class_133<?>> field_44426 = method_39812(field_44464, () -> class_133.field_383);
   public static final class_3991<class_6933> field_44450 = method_39796(field_44388, "kebab", () -> class_6933.field_35614);
   public static final class_8669<class_4639> field_44373 = method_39812(field_44378, () -> class_6234.field_31856);
   public static final class_3991<class_7335> field_44381 = method_39796(field_44442, "empty", () -> class_7335.field_37504);
   public static final class_8669<class_7768<?>> field_44407 = method_39812(field_44437, () -> class_7768.field_39366);
   public static final class_8669<class_6614<?>> field_44366 = method_39812(field_44438, () -> class_6614.field_34167);
   public static final class_8669<class_4165<?>> field_44402 = method_39812(field_44393, () -> class_4165.field_20266);
   public static final class_8669<class_1510<?>> field_44435 = method_39812(field_44379, () -> class_1510.field_7997);
   public static final class_8669<class_2994<?>> field_44414 = method_39812(field_44396, () -> class_2994.field_14706);
   public static final class_8669<class_225> field_44403 = method_39812(field_44371, () -> class_7331.field_37469);
   public static final class_8669<class_9478<?>> field_44376 = method_39812(field_44423, () -> class_6234.field_31907);
   public static final class_3991<class_8853> field_44375 = method_39796(field_44443, "plains", () -> class_8853.field_45268);
   public static final class_3991<class_4466> field_44425 = method_39796(field_44356, "none", () -> class_4466.field_21775);
   public static final class_3991<class_236> field_44430 = method_39796(field_44380, "unemployed", () -> class_236.field_763);
   public static final class_3991<class_6044<?>> field_44431 = method_39796(field_44370, "dummy", () -> class_6044.field_30882);
   public static final class_3991<class_3172<?>> field_44389 = method_39796(field_44405, "dummy", () -> class_3172.field_15871);
   public static final class_8669<class_3975> field_44374 = method_39812(field_44429, () -> class_3975.field_19363);
   public static final class_8669<class_6275> field_44433 = method_39812(field_44428, () -> class_6275.field_32075);
   public static final class_8669<class_3515> field_44463 = method_39812(field_44409, () -> class_5570.field_28302);
   public static final class_8669<class_1404> field_44357 = method_39812(field_44416, () -> class_5116.field_26380);
   public static final class_8669<class_2190> field_44384 = method_39812(field_44421, () -> class_5110.field_26353);
   public static final class_5621<class_8669<class_7902>> field_44360 = method_39804("worldgen/noise_settings");
   public static final class_5621<class_8669<class_7929<?>>> field_44412 = method_39804("worldgen/configured_surface_builder");
   public static final class_5621<class_8669<class_987<?>>> field_44406 = method_39804("worldgen/configured_carver");
   public static final class_5621<class_8669<class_5927<?, ?>>> field_44453 = method_39804("worldgen/configured_feature");
   public static final class_5621<class_8669<class_7865<?, ?>>> field_44385 = method_39804("worldgen/configured_structure_feature");
   public static final class_5621<class_8669<class_86>> field_44386 = method_39804("worldgen/processor_list");
   public static final class_5621<class_8669<class_8115>> field_44413 = method_39804("worldgen/template_pool");
   public static final class_5621<class_8669<class_6325>> field_44359 = method_39804("worldgen/biome");
   public static final class_5621<class_8669<class_3133<?>>> field_44441 = method_39804("worldgen/surface_builder");
   public static final class_8669<class_3133<?>> field_44363 = method_39812(field_44441, () -> class_3133.field_15561);
   public static final class_5621<class_8669<class_6062<?>>> field_44419 = method_39804("worldgen/carver");
   public static final class_8669<class_6062<?>> field_44368 = method_39812(field_44419, () -> class_6062.field_31015);
   public static final class_5621<class_8669<class_4285<?>>> field_44460 = method_39804("worldgen/feature");
   public static final class_8669<class_4285<?>> field_44417 = method_39812(field_44460, () -> class_4285.field_20763);
   public static final class_5621<class_8669<class_5390<?>>> field_44456 = method_39804("worldgen/structure_feature");
   public static final class_8669<class_5390<?>> field_44457 = method_39812(field_44456, () -> class_5390.field_27498);
   public static final class_5621<class_8669<class_2746>> field_44418 = method_39804("worldgen/structure_piece");
   public static final class_8669<class_2746> field_44364 = method_39812(field_44418, () -> class_2746.field_13425);
   public static final class_5621<class_8669<class_5788<?>>> field_44361 = method_39804("worldgen/decorator");
   public static final class_8669<class_5788<?>> field_44449 = method_39812(field_44361, () -> class_5788.field_29240);
   public static final class_5621<class_8669<class_9212<?>>> field_44367 = method_39804("worldgen/block_state_provider_type");
   public static final class_5621<class_8669<class_7739<?>>> field_44383 = method_39804("worldgen/block_placer_type");
   public static final class_5621<class_8669<class_389<?>>> field_44459 = method_39804("worldgen/foliage_placer_type");
   public static final class_5621<class_8669<class_7027<?>>> field_44461 = method_39804("worldgen/trunk_placer_type");
   public static final class_5621<class_8669<class_8783<?>>> field_44404 = method_39804("worldgen/tree_decorator_type");
   public static final class_5621<class_8669<class_2356<?>>> field_44401 = method_39804("worldgen/feature_size_type");
   public static final class_5621<class_8669<Codec<? extends class_3498>>> field_44452 = method_39804("worldgen/biome_source");
   public static final class_5621<class_8669<Codec<? extends class_6541>>> field_44427 = method_39804("worldgen/chunk_generator");
   public static final class_5621<class_8669<class_2111<?>>> field_44391 = method_39804("worldgen/structure_processor");
   public static final class_5621<class_8669<class_4263<?>>> field_44424 = method_39804("worldgen/structure_pool_element");
   public static final class_8669<class_9212<?>> field_44397 = method_39812(field_44367, () -> class_9212.field_47120);
   public static final class_8669<class_7739<?>> field_44410 = method_39812(field_44383, () -> class_7739.field_39242);
   public static final class_8669<class_389<?>> field_44394 = method_39812(field_44459, () -> class_389.field_1581);
   public static final class_8669<class_7027<?>> field_44432 = method_39812(field_44461, () -> class_7027.field_36192);
   public static final class_8669<class_8783<?>> field_44454 = method_39812(field_44404, () -> class_8783.field_44947);
   public static final class_8669<class_2356<?>> field_44390 = method_39812(field_44401, () -> class_2356.field_11831);
   public static final class_8669<Codec<? extends class_3498>> field_44398 = method_39810(field_44452, Lifecycle.stable(), () -> class_3498.field_17161);
   public static final class_8669<Codec<? extends class_6541>> field_44411 = method_39810(field_44427, Lifecycle.stable(), () -> class_6541.field_33265);
   public static final class_8669<class_2111<?>> field_44399 = method_39812(field_44391, () -> class_2111.field_10589);
   public static final class_8669<class_4263<?>> field_44392 = method_39812(field_44424, () -> class_4263.field_20659);
   private final class_5621<? extends class_8669<T>> field_44434;
   private final Lifecycle field_44451;

   private static <T> class_5621<class_8669<T>> method_39804(String var0) {
      return class_5621.<T>method_25494(new class_4639(var0));
   }

   public static <T extends class_6433<?>> void method_39803(class_6433<T> var0) {
      var0.forEach(var1 -> {
         if (var1.method_39805().isEmpty()) {
            field_44408.error("Registry '{}' was empty after loading", var0.method_39797(var1));
            if (class_7665.field_38958) {
               throw new IllegalStateException("Registry: '" + var0.method_39797(var1) + "' is empty, not allowed, fix me!");
            }
         }

         if (var1 instanceof class_3991) {
            class_4639 var4 = ((class_3991)var1).method_18397();
            Validate.notNull(var1.method_39806(var4), "Missing default of DefaultedMappedRegistry: " + var4, new Object[0]);
         }
      });
   }

   private static <T> class_8669<T> method_39812(class_5621<? extends class_8669<T>> var0, Supplier<T> var1) {
      return method_39810(var0, Lifecycle.experimental(), var1);
   }

   private static <T> class_3991<T> method_39796(class_5621<? extends class_8669<T>> var0, String var1, Supplier<T> var2) {
      return method_39795(var0, var1, Lifecycle.experimental(), var2);
   }

   private static <T> class_8669<T> method_39810(class_5621<? extends class_8669<T>> var0, Lifecycle var1, Supplier<T> var2) {
      return method_39793(var0, new class_5383<T>(var0, var1), var2, var1);
   }

   private static <T> class_3991<T> method_39795(class_5621<? extends class_8669<T>> var0, String var1, Lifecycle var2, Supplier<T> var3) {
      return method_39793(var0, new class_3991<T>(var1, var0, var2), var3, var2);
   }

   private static <T, R extends class_6433<T>> R method_39793(class_5621<? extends class_8669<T>> var0, R var1, Supplier<T> var2, Lifecycle var3) {
      class_4639 var6 = var0.method_25499();
      field_44358.put(var6, var2);
      class_6433 var7 = field_44444;
      return var7.<R>method_29381(var0, (R)var1, var3);
   }

   public class_8669(class_5621<? extends class_8669<T>> var1, Lifecycle var2) {
      this.field_44434 = var1;
      this.field_44451 = var2;
   }

   public class_5621<? extends class_8669<T>> method_39798() {
      return this.field_44434;
   }

   @Override
   public String toString() {
      return "Registry[" + this.field_44434 + " (" + this.field_44451 + ")]";
   }

   public <U> DataResult<Pair<T, U>> decode(DynamicOps<U> var1, U var2) {
      return !var1.compressMaps()
         ? class_4639.field_22655
            .decode(var1, var2)
            .flatMap(
               var1x -> {
                  Object var4 = this.method_39806((class_4639)var1x.getFirst());
                  return var4 != null
                     ? DataResult.success(Pair.of(var4, var1x.getSecond()), this.method_39813((T)var4))
                     : DataResult.error("Unknown registry key: " + var1x.getFirst());
               }
            )
         : var1.getNumberValue(var2).flatMap(var1x -> {
            Object var4 = this.method_14040(var1x.intValue());
            return var4 != null ? DataResult.success(var4, this.method_39813((T)var4)) : DataResult.error("Unknown registry id: " + var1x);
         }).map(var1x -> Pair.of(var1x, var1.empty()));
   }

   public <U> DataResult<U> encode(T var1, DynamicOps<U> var2, U var3) {
      class_4639 var6 = this.method_39797((T)var1);
      if (var6 != null) {
         return !var2.compressMaps()
            ? var2.mergeToPrimitive(var3, var2.createString(var6.toString())).setLifecycle(this.field_44451)
            : var2.mergeToPrimitive(var3, var2.createInt(this.method_14041((T)var1))).setLifecycle(this.field_44451);
      } else {
         return DataResult.error("Unknown registry element " + var1);
      }
   }

   public <U> Stream<U> keys(DynamicOps<U> var1) {
      return this.method_39805().stream().<U>map(var1x -> (U)var1.createString(var1x.toString()));
   }

   @Nullable
   public abstract class_4639 method_39797(T var1);

   public abstract Optional<class_5621<T>> method_39800(T var1);

   @Override
   public abstract int method_14041(T var1);

   @Nullable
   public abstract T method_39799(class_5621<T> var1);

   @Nullable
   public abstract T method_39806(class_4639 var1);

   public abstract Lifecycle method_39813(T var1);

   public abstract Lifecycle method_39811();

   public Optional<T> method_39794(class_4639 var1) {
      return Optional.<T>ofNullable(this.method_39806(var1));
   }

   public Optional<T> method_39802(class_5621<T> var1) {
      return Optional.<T>ofNullable(this.method_39799(var1));
   }

   public T method_39807(class_5621<T> var1) {
      Object var4 = this.method_39799(var1);
      if (var4 != null) {
         return (T)var4;
      } else {
         throw new IllegalStateException("Missing: " + var1);
      }
   }

   public abstract Set<class_4639> method_39805();

   public abstract Set<Entry<class_5621<T>, T>> method_39808();

   public Stream<T> method_39801() {
      return StreamSupport.<T>stream(this.spliterator(), false);
   }

   public abstract boolean method_39814(class_4639 var1);

   public static <T> T method_39791(class_8669<? super T> var0, String var1, T var2) {
      return method_39792(var0, new class_4639(var1), (T)var2);
   }

   public static <V, T extends V> T method_39792(class_8669<V> var0, class_4639 var1, T var2) {
      return ((class_6433)var0).<T>method_29381(class_5621.<T>method_25497(var0.field_44434, var1), (T)var2, Lifecycle.stable());
   }

   public static <V, T extends V> T method_39790(class_8669<V> var0, int var1, String var2, T var3) {
      return ((class_6433)var0).<T>method_29380(var1, class_5621.<T>method_25497(var0.field_44434, new class_4639(var2)), (T)var3, Lifecycle.stable());
   }

   static {
      class_889.method_3837();
      field_44358.forEach((var0, var1) -> {
         if (var1.get() == null) {
            field_44408.error("Unable to bootstrap registry '{}'", var0);
         }
      });
      method_39803(field_44444);
   }
}
