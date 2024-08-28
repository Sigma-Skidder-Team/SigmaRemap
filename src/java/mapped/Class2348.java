package mapped;

import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.*;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.annotation.Nullable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public abstract class Class2348<T> implements Codec<T>, Keyable, Class2347<T> {
   public static final Logger field16031 = LogManager.getLogger();
   private static final Map<ResourceLocation, Supplier<?>> field16032 = Maps.newLinkedHashMap();
   public static final ResourceLocation field16033 = new ResourceLocation("root");
   public static final Class2349<Class2349<?>> field16034 = new Class2350<Class2349<?>>(method9173("root"), Lifecycle.experimental());
   public static final Class2348<? extends Class2348<?>> field16035 = field16034;
   public static final Class8705<Class2348<Class9455>> field16036 = method9173("sound_event");
   public static final Class8705<Class2348<Class7631>> field16037 = method9173("fluid");
   public static final Class8705<Class2348<Class7144>> field16038 = method9173("mob_effect");
   public static final Class8705<Class2348<Block>> field16039 = method9173("block");
   public static final Class8705<Class2348<Class6069>> field16040 = method9173("enchantment");
   public static final Class8705<Class2348<Class8992<?>>> field16041 = method9173("entity_type");
   public static final Class8705<Class2348<Class3257>> field16042 = method9173("item");
   public static final Class8705<Class2348<Class8812>> field16043 = method9173("potion");
   public static final Class8705<Class2348<Class7434<?>>> field16044 = method9173("particle_type");
   public static final Class8705<Class2348<Class4387<?>>> field16045 = method9173("block_entity_type");
   public static final Class8705<Class2348<Class9078>> field16046 = method9173("motive");
   public static final Class8705<Class2348<ResourceLocation>> field16047 = method9173("custom_stat");
   public static final Class8705<Class2348<Class9176>> field16048 = method9173("chunk_status");
   public static final Class8705<Class2348<Class9277<?>>> field16049 = method9173("rule_test");
   public static final Class8705<Class2348<Class8989<?>>> field16050 = method9173("pos_rule_test");
   public static final Class8705<Class2348<Class8298<?>>> field16051 = method9173("menu");
   public static final Class8705<Class2348<Class7207<?>>> field16052 = method9173("recipe_type");
   public static final Class8705<Class2348<Class6504<?>>> field16053 = method9173("recipe_serializer");
   public static final Class8705<Class2348<Class4869>> field16054 = method9173("attribute");
   public static final Class8705<Class2348<Class49<?>>> field16055 = method9173("stat_type");
   public static final Class8705<Class2348<Class9564>> field16056 = method9173("villager_type");
   public static final Class8705<Class2348<Class8395>> field16057 = method9173("villager_profession");
   public static final Class8705<Class2348<Class4913>> field16058 = method9173("point_of_interest_type");
   public static final Class8705<Class2348<Class8830<?>>> field16059 = method9173("memory_module_type");
   public static final Class8705<Class2348<Class7963<?>>> field16060 = method9173("sensor_type");
   public static final Class8705<Class2348<Class8234>> field16061 = method9173("schedule");
   public static final Class8705<Class2348<Class8890>> field16062 = method9173("activity");
   public static final Class8705<Class2348<Class7131>> field16063 = method9173("loot_pool_entry_type");
   public static final Class8705<Class2348<Class7128>> field16064 = method9173("loot_function_type");
   public static final Class8705<Class2348<Class7130>> field16065 = method9173("loot_condition_type");
   public static final Class8705<Class2348<Class9535>> field16066 = method9173("dimension_type");
   public static final Class8705<Class2348<Class1655>> field16067 = method9173("dimension");
   public static final Class8705<Class2348<Class9459>> field16068 = method9173("dimension");
   public static final Class2348<Class9455> field16069 = method9175(field16036, () -> Class6067.field26714);
   public static final Class2351<Class7631> field16070 = method9176(field16037, "empty", () -> Class9479.field44064);
   public static final Class2348<Class7144> field16071 = method9175(field16038, () -> Class8254.field35492);
   public static final Class2351<Block> field16072 = method9176(field16039, "air", () -> Blocks.AIR);
   public static final Class2348<Class6069> field16073 = method9175(field16040, () -> Class8122.field34918);
   public static final Class2351<Class8992<?>> field16074 = method9176(field16041, "pig", () -> Class8992.field41064);
   public static final Class2351<Class3257> field16075 = method9176(field16042, "air", () -> Class8514.field37222);
   public static final Class2351<Class8812> field16076 = method9176(field16043, "empty", () -> Class8137.field34976);
   public static final Class2348<Class7434<?>> field16077 = method9175(field16044, () -> Class7940.field34051);
   public static final Class2348<Class4387<?>> field16078 = method9175(field16045, () -> Class4387.field21421);
   public static final Class2351<Class9078> field16079 = method9176(field16046, "kebab", () -> Class9078.field41530);
   public static final Class2348<ResourceLocation> field16080 = method9175(field16047, () -> Class8876.field40125);
   public static final Class2351<Class9176> field16081 = method9176(field16048, "empty", () -> Class9176.field42133);
   public static final Class2348<Class9277<?>> field16082 = method9175(field16049, () -> Class9277.field42660);
   public static final Class2348<Class8989<?>> field16083 = method9175(field16050, () -> Class8989.field41001);
   public static final Class2348<Class8298<?>> field16084 = method9175(field16051, () -> Class8298.field35655);
   public static final Class2348<Class7207<?>> field16085 = method9175(field16052, () -> Class7207.field30935);
   public static final Class2348<Class6504<?>> field16086 = method9175(field16053, () -> Class6504.field28471);
   public static final Class2348<Class4869> field16087 = method9175(field16054, () -> Class9173.field42115);
   public static final Class2348<Class49<?>> field16088 = method9175(field16055, () -> Class8876.field40098);
   public static final Class2351<Class9564> field16089 = method9176(field16056, "plains", () -> Class9564.field44542);
   public static final Class2351<Class8395> field16090 = method9176(field16057, "none", () -> Class8395.field36011);
   public static final Class2351<Class4913> field16091 = method9176(field16058, "unemployed", () -> Class4913.field22751);
   public static final Class2351<Class8830<?>> field16092 = method9176(field16059, "dummy", () -> Class8830.field39812);
   public static final Class2351<Class7963<?>> field16093 = method9176(field16060, "dummy", () -> Class7963.field34237);
   public static final Class2348<Class8234> field16094 = method9175(field16061, () -> Class8234.field35349);
   public static final Class2348<Class8890> field16095 = method9175(field16062, () -> Class8890.field40220);
   public static final Class2348<Class7131> field16096 = method9175(field16063, () -> Class8695.field39239);
   public static final Class2348<Class7128> field16097 = method9175(field16064, () -> Class8585.field38618);
   public static final Class2348<Class7130> field16098 = method9175(field16065, () -> Class8582.field38595);
   public static final Class8705<Class2348<Class9309>> field16099 = method9173("worldgen/noise_settings");
   public static final Class8705<Class2348<Class9319<?>>> field16100 = method9173("worldgen/configured_surface_builder");
   public static final Class8705<Class2348<Class6815<?>>> field16101 = method9173("worldgen/configured_carver");
   public static final Class8705<Class2348<Class7909<?, ?>>> field16102 = method9173("worldgen/configured_feature");
   public static final Class8705<Class2348<Class9300<?, ?>>> field16103 = method9173("worldgen/configured_structure_feature");
   public static final Class8705<Class2348<Class3622>> field16104 = method9173("worldgen/processor_list");
   public static final Class8705<Class2348<Class9369>> field16105 = method9173("worldgen/template_pool");
   public static final Class8705<Class2348<Class8907>> field16106 = method9173("worldgen/biome");
   public static final Class8705<Class2348<Class6768<?>>> field16107 = method9173("worldgen/surface_builder");
   public static final Class2348<Class6768<?>> field16108 = method9175(field16107, () -> Class6768.field29523);
   public static final Class8705<Class2348<Class7195<?>>> field16109 = method9173("worldgen/carver");
   public static final Class2348<Class7195<?>> field16110 = method9175(field16109, () -> Class7195.field30888);
   public static final Class8705<Class2348<Class2898<?>>> field16111 = method9173("worldgen/feature");
   public static final Class2348<Class2898<?>> field16112 = method9175(field16111, () -> Class2898.field17961);
   public static final Class8705<Class2348<Class2961<?>>> field16113 = method9173("worldgen/structure_feature");
   public static final Class2348<Class2961<?>> field16114 = method9175(field16113, () -> Class2961.field18059);
   public static final Class8705<Class2348<Class7792>> field16115 = method9173("worldgen/structure_piece");
   public static final Class2348<Class7792> field16116 = method9175(field16115, () -> Class7792.field33427);
   public static final Class8705<Class2348<Class6272<?>>> field16117 = method9173("worldgen/decorator");
   public static final Class2348<Class6272<?>> field16118 = method9175(field16117, () -> Class6272.field27752);
   public static final Class8705<Class2348<Class9654<?>>> field16119 = method9173("worldgen/block_state_provider_type");
   public static final Class8705<Class2348<Class9269<?>>> field16120 = method9173("worldgen/block_placer_type");
   public static final Class8705<Class2348<Class5984<?>>> field16121 = method9173("worldgen/foliage_placer_type");
   public static final Class8705<Class2348<Class9107<?>>> field16122 = method9173("worldgen/trunk_placer_type");
   public static final Class8705<Class2348<Class9542<?>>> field16123 = method9173("worldgen/tree_decorator_type");
   public static final Class8705<Class2348<Class7646<?>>> field16124 = method9173("worldgen/feature_size_type");
   public static final Class8705<Class2348<Codec<? extends Class1685>>> field16125 = method9173("worldgen/biome_source");
   public static final Class8705<Class2348<Codec<? extends Class5646>>> field16126 = method9173("worldgen/chunk_generator");
   public static final Class8705<Class2348<Class7525<?>>> field16127 = method9173("worldgen/structure_processor");
   public static final Class8705<Class2348<Class8325<?>>> field16128 = method9173("worldgen/structure_pool_element");
   public static final Class2348<Class9654<?>> field16129 = method9175(field16119, () -> Class9654.field45131);
   public static final Class2348<Class9269<?>> field16130 = method9175(field16120, () -> Class9269.field42638);
   public static final Class2348<Class5984<?>> field16131 = method9175(field16121, () -> Class5984.field26059);
   public static final Class2348<Class9107<?>> field16132 = method9175(field16122, () -> Class9107.field41831);
   public static final Class2348<Class9542<?>> field16133 = method9175(field16123, () -> Class9542.field44429);
   public static final Class2348<Class7646<?>> field16134 = method9175(field16124, () -> Class7646.field32820);
   public static final Class2348<Codec<? extends Class1685>> field16135 = method9177(field16125, Lifecycle.stable(), () -> Class1685.field9159);
   public static final Class2348<Codec<? extends Class5646>> field16136 = method9177(field16126, Lifecycle.stable(), () -> Class5646.field24984);
   public static final Class2348<Class7525<?>> field16137 = method9175(field16127, () -> Class7525.field32294);
   public static final Class2348<Class8325<?>> field16138 = method9175(field16128, () -> Class8325.field35773);
   private final Class8705<? extends Class2348<T>> field16139;
   private final Lifecycle field16140;

   private static <T> Class8705<Class2348<T>> method9173(String var0) {
      return Class8705.<T>method31396(new ResourceLocation(var0));
   }

   public static <T extends Class2349<?>> void method9174(Class2349<T> var0) {
      var0.forEach(var1 -> {
         if (var1.method9190().isEmpty()) {
            field16031.error("Registry '{}' was empty after loading", var0.method9181(var1));
            if (Class9246.field42545) {
               throw new IllegalStateException("Registry: '" + var0.method9181(var1) + "' is empty, not allowed, fix me!");
            }
         }

         if (var1 instanceof Class2351) {
            ResourceLocation var4 = ((Class2351)var1).method9267();
            Validate.notNull(var1.method9184(var4), "Missing default of DefaultedMappedRegistry: " + var4, new Object[0]);
         }
      });
   }

   private static <T> Class2348<T> method9175(Class8705<? extends Class2348<T>> var0, Supplier<T> var1) {
      return method9177(var0, Lifecycle.experimental(), var1);
   }

   private static <T> Class2351<T> method9176(Class8705<? extends Class2348<T>> var0, String var1, Supplier<T> var2) {
      return method9178(var0, var1, Lifecycle.experimental(), var2);
   }

   private static <T> Class2348<T> method9177(Class8705<? extends Class2348<T>> var0, Lifecycle var1, Supplier<T> var2) {
      return method9179(var0, new Class2350<T>(var0, var1), var2, var1);
   }

   private static <T> Class2351<T> method9178(Class8705<? extends Class2348<T>> var0, String var1, Lifecycle var2, Supplier<T> var3) {
      return method9179(var0, new Class2351<T>(var1, var0, var2), var3, var2);
   }

   private static <T, R extends Class2349<T>> R method9179(Class8705<? extends Class2348<T>> var0, R var1, Supplier<T> var2, Lifecycle var3) {
      ResourceLocation var6 = var0.method31399();
      field16032.put(var6, var2);
      Class2349 var7 = field16034;
      return (R) var7.<R>method9250(var0, (R)var1, var3);
   }

   public Class2348(Class8705<? extends Class2348<T>> var1, Lifecycle var2) {
      this.field16139 = var1;
      this.field16140 = var2;
   }

   public Class8705<? extends Class2348<T>> method9180() {
      return this.field16139;
   }

   @Override
   public String toString() {
      return "Registry[" + this.field16139 + " (" + this.field16140 + ")]";
   }

   public <U> DataResult<Pair<T, U>> decode(DynamicOps<U> var1, U var2) {
      return !var1.compressMaps()
         ? ResourceLocation.field13020
            .decode(var1, var2)
            .flatMap(
               var1x -> {
                  T var4 = this.method9184(var1x.getFirst());
                  return var4 != null
                     ? DataResult.success(Pair.of(var4, var1x.getSecond()), this.method9185((T)var4))
                     : DataResult.error("Unknown registry key: " + var1x.getFirst());
               }
            )
         : var1.getNumberValue(var2).flatMap(var1x -> {
            Object var4 = this.method9172(var1x.intValue());
            return var4 != null ? DataResult.success(var4, this.method9185((T)var4)) : DataResult.error("Unknown registry id: " + var1x);
         }).map(var1x -> Pair.of((T) var1x, var1.empty()));
   }

   public <U> DataResult<U> encode(T var1, DynamicOps<U> var2, U var3) {
      ResourceLocation var6 = this.method9181((T)var1);
      if (var6 != null) {
         return !var2.compressMaps()
            ? var2.mergeToPrimitive(var3, var2.createString(var6.toString())).setLifecycle(this.field16140)
            : var2.mergeToPrimitive(var3, var2.createInt(this.method9171((T)var1))).setLifecycle(this.field16140);
      } else {
         return DataResult.error("Unknown registry element " + var1);
      }
   }

   public <U> Stream<U> keys(DynamicOps<U> var1) {
      return this.method9190().stream().<U>map(var1x -> (U)var1.createString(var1x.toString()));
   }

   @Nullable
   public abstract ResourceLocation method9181(T var1);

   public abstract Optional<Class8705<T>> method9182(T var1);

   @Override
   public abstract int method9171(T var1);

   @Nullable
   public abstract T method9183(Class8705<T> var1);

   @Nullable
   public abstract T method9184(ResourceLocation var1);

   public abstract Lifecycle method9185(T var1);

   public abstract Lifecycle method9186();

   public Optional<T> method9187(ResourceLocation var1) {
      return Optional.<T>ofNullable(this.method9184(var1));
   }

   public Optional<T> method9188(Class8705<T> var1) {
      return Optional.<T>ofNullable(this.method9183(var1));
   }

   public T method9189(Class8705<T> var1) {
      Object var4 = this.method9183(var1);
      if (var4 != null) {
         return (T)var4;
      } else {
         throw new IllegalStateException("Missing: " + var1);
      }
   }

   public abstract Set<ResourceLocation> method9190();

   public abstract Set<Entry<Class8705<T>, T>> method9191();

   public Stream<T> method9192() {
      return StreamSupport.<T>stream(this.spliterator(), false);
   }

   public abstract boolean method9193(ResourceLocation var1);

   public static <T> T method9194(Class2348<? super T> var0, String var1, T var2) {
      return method9195(var0, new ResourceLocation(var1), (T)var2);
   }

   public static <V, T extends V> T method9195(Class2348<V> var0, ResourceLocation var1, T var2) {
      return ((Class2349<V>)var0).method9250(Class8705.method31395(var0.field16139, var1), (T)var2, Lifecycle.stable());
   }

   public static <V, T extends V> T method9196(Class2348<V> var0, int var1, String var2, T var3) {
      return ((Class2349<V>)var0).method9249(var1, Class8705.method31395(var0.field16139, new ResourceLocation(var2)), (T)var3, Lifecycle.stable());
   }

   static {
      Class6714.method20499();
      field16032.forEach((var0, var1) -> {
         if (var1.get() == null) {
            field16031.error("Unable to bootstrap registry '{}'", var0);
         }
      });
      method9174(field16034);
   }
}
