package net.minecraft.util.registry;

import com.google.common.collect.Maps;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.*;
import mapped.*;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.Attribute;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.Fluids;
import net.minecraft.inventory.container.ContainerType;
import net.minecraft.item.Items;
import net.minecraft.stats.Stats;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SharedConstants;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.world.chunk.ChunkStatus;
import net.minecraft.world.gen.carver.ConfiguredCarver;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
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

public abstract class Registry<T> implements Codec<T>, Keyable, Class2347<T> {
   public static final Logger field16031 = LogManager.getLogger();
   private static final Map<ResourceLocation, Supplier<?>> field16032 = Maps.newLinkedHashMap();
   public static final ResourceLocation ROOT = new ResourceLocation("root");
   public static final MutableRegistry<MutableRegistry<?>> field16034 = new SimpleRegistry<MutableRegistry<?>>(createKey("root"), Lifecycle.experimental());
   public static final Registry<? extends Registry<?>> field16035 = field16034;
   public static final RegistryKey<Registry<SoundEvent>> field16036 = createKey("sound_event");
   public static final RegistryKey<Registry<Fluid>> field16037 = createKey("fluid");
   public static final RegistryKey<Registry<Effect>> field16038 = createKey("mob_effect");
   public static final RegistryKey<Registry<Block>> field16039 = createKey("block");
   public static final RegistryKey<Registry<Enchantment>> field16040 = createKey("enchantment");
   public static final RegistryKey<Registry<EntityType<?>>> field16041 = createKey("entity_type");
   public static final RegistryKey<Registry<Item>> field16042 = createKey("item");
   public static final RegistryKey<Registry<Class8812>> field16043 = createKey("potion");
   public static final RegistryKey<Registry<ParticleType<?>>> field16044 = createKey("particle_type");
   public static final RegistryKey<Registry<TileEntityType<?>>> field16045 = createKey("block_entity_type");
   public static final RegistryKey<Registry<Class9078>> field16046 = createKey("motive");
   public static final RegistryKey<Registry<ResourceLocation>> field16047 = createKey("custom_stat");
   public static final RegistryKey<Registry<ChunkStatus>> field16048 = createKey("chunk_status");
   public static final RegistryKey<Registry<Class9277<?>>> field16049 = createKey("rule_test");
   public static final RegistryKey<Registry<Class8989<?>>> field16050 = createKey("pos_rule_test");
   public static final RegistryKey<Registry<ContainerType<?>>> field16051 = createKey("menu");
   public static final RegistryKey<Registry<Class7207<?>>> field16052 = createKey("recipe_type");
   public static final RegistryKey<Registry<Class6504<?>>> field16053 = createKey("recipe_serializer");
   public static final RegistryKey<Registry<Attribute>> field16054 = createKey("attribute");
   public static final RegistryKey<Registry<Class49<?>>> field16055 = createKey("stat_type");
   public static final RegistryKey<Registry<Class9564>> field16056 = createKey("villager_type");
   public static final RegistryKey<Registry<Class8395>> field16057 = createKey("villager_profession");
   public static final RegistryKey<Registry<Class4913>> field16058 = createKey("point_of_interest_type");
   public static final RegistryKey<Registry<Class8830<?>>> field16059 = createKey("memory_module_type");
   public static final RegistryKey<Registry<Class7963<?>>> field16060 = createKey("sensor_type");
   public static final RegistryKey<Registry<Schedule>> field16061 = createKey("schedule");
   public static final RegistryKey<Registry<Activity>> field16062 = createKey("activity");
   public static final RegistryKey<Registry<Class7131>> field16063 = createKey("loot_pool_entry_type");
   public static final RegistryKey<Registry<LootFunctionType>> field16064 = createKey("loot_function_type");
   public static final RegistryKey<Registry<Class7130>> field16065 = createKey("loot_condition_type");
   public static final RegistryKey<Registry<DimensionType>> DIMENSION_TYPE_KEY = createKey("dimension_type");
   public static final RegistryKey<Registry<World>> WORLD_KEY = createKey("dimension");
   public static final RegistryKey<Registry<Dimension>> DIMENSION_KEY = createKey("dimension");
   public static final Registry<SoundEvent> field16069 = method9175(field16036, () -> SoundEvents.field26714);
   public static final Class2351<Fluid> FLUID = method9176(field16037, "empty", () -> Fluids.EMPTY);
   public static final Registry<Effect> EFFECTS = method9175(field16038, () -> Effects.LUCK);
   public static final Class2351<Block> BLOCK = method9176(field16039, "air", () -> Blocks.AIR);
   public static final Registry<Enchantment> ENCHANTMENT = method9175(field16040, () -> Enchantments.FORTUNE);
   public static final Class2351<EntityType<?>> ENTITY_TYPE = method9176(field16041, "pig", () -> EntityType.PIG);
   public static final Class2351<Item> ITEM = method9176(field16042, "air", () -> Items.AIR);
   public static final Class2351<Class8812> field16076 = method9176(field16043, "empty", () -> Class8137.field34976);
   public static final Registry<ParticleType<?>> PARTICLE_TYPE = method9175(field16044, () -> ParticleTypes.field34051);
   public static final Registry<TileEntityType<?>> field16078 = method9175(field16045, () -> TileEntityType.field21421);
   public static final Class2351<Class9078> field16079 = method9176(field16046, "kebab", () -> Class9078.field41530);
   public static final Registry<ResourceLocation> field16080 = method9175(field16047, () -> Stats.field40125);
   public static final Class2351<ChunkStatus> field16081 = method9176(field16048, "empty", () -> ChunkStatus.EMPTY);
   public static final Registry<Class9277<?>> field16082 = method9175(field16049, () -> Class9277.field42660);
   public static final Registry<Class8989<?>> field16083 = method9175(field16050, () -> Class8989.field41001);
   public static final Registry<ContainerType<?>> MENU = method9175(field16051, () -> ContainerType.ANVIL);
   public static final Registry<Class7207<?>> field16085 = method9175(field16052, () -> Class7207.field30935);
   public static final Registry<Class6504<?>> field16086 = method9175(field16053, () -> Class6504.field28471);
   public static final Registry<Attribute> ATTRIBUTE = method9175(field16054, () -> Attributes.LUCK);
   public static final Registry<Class49<?>> field16088 = method9175(field16055, () -> Stats.field40098);
   public static final Class2351<Class9564> field16089 = method9176(field16056, "plains", () -> Class9564.field44542);
   public static final Class2351<Class8395> field16090 = method9176(field16057, "none", () -> Class8395.field36011);
   public static final Class2351<Class4913> field16091 = method9176(field16058, "unemployed", () -> Class4913.field22751);
   public static final Class2351<Class8830<?>> field16092 = method9176(field16059, "dummy", () -> Class8830.field39812);
   public static final Class2351<Class7963<?>> field16093 = method9176(field16060, "dummy", () -> Class7963.field34237);
   public static final Registry<Schedule> field16094 = method9175(field16061, () -> Schedule.field35349);
   public static final Registry<Activity> field16095 = method9175(field16062, () -> Activity.field40220);
   public static final Registry<Class7131> field16096 = method9175(field16063, () -> Class8695.field39239);
   public static final Registry<LootFunctionType> LOOT_FUNCTION_TYPE = method9175(field16064, () -> LootFunctionManager.SET_COUNT);
   public static final Registry<Class7130> field16098 = method9175(field16065, () -> Class8582.field38595);
   public static final RegistryKey<Registry<DimensionSettings>> NOISE_SETTINGS_KEY = createKey("worldgen/noise_settings");
   public static final RegistryKey<Registry<ConfiguredSurfaceBuilder<?>>> CONFIGURED_SURFACE_BUILDER_KEY = createKey("worldgen/configured_surface_builder");
   public static final RegistryKey<Registry<ConfiguredCarver<?>>> field16101 = createKey("worldgen/configured_carver");
   public static final RegistryKey<Registry<ConfiguredFeature<?, ?>>> field16102 = createKey("worldgen/configured_feature");
   public static final RegistryKey<Registry<StructureFeature<?, ?>>> field16103 = createKey("worldgen/configured_structure_feature");
   public static final RegistryKey<Registry<Class3622>> field16104 = createKey("worldgen/processor_list");
   public static final RegistryKey<Registry<Class9369>> field16105 = createKey("worldgen/template_pool");
   public static final RegistryKey<Registry<Biome>> BIOME_KEY = createKey("worldgen/biome");
   public static final RegistryKey<Registry<SurfaceBuilder<?>>> field16107 = createKey("worldgen/surface_builder");
   public static final Registry<SurfaceBuilder<?>> SURFACE_BUILDER = method9175(field16107, () -> SurfaceBuilder.field29523);
   public static final RegistryKey<Registry<Class7195<?>>> field16109 = createKey("worldgen/carver");
   public static final Registry<Class7195<?>> field16110 = method9175(field16109, () -> Class7195.field30888);
   public static final RegistryKey<Registry<Class2898<?>>> field16111 = createKey("worldgen/feature");
   public static final Registry<Class2898<?>> FEATURE = method9175(field16111, () -> Class2898.field17961);
   public static final RegistryKey<Registry<Structure<?>>> field16113 = createKey("worldgen/structure_feature");
   public static final Registry<Structure<?>> STRUCTURE_FEATURE = method9175(field16113, () -> Structure.MINESHAFT);
   public static final RegistryKey<Registry<Class7792>> field16115 = createKey("worldgen/structure_piece");
   public static final Registry<Class7792> field16116 = method9175(field16115, () -> Class7792.field33427);
   public static final RegistryKey<Registry<Class6272<?>>> field16117 = createKey("worldgen/decorator");
   public static final Registry<Class6272<?>> field16118 = method9175(field16117, () -> Class6272.field27752);
   public static final RegistryKey<Registry<Class9654<?>>> field16119 = createKey("worldgen/block_state_provider_type");
   public static final RegistryKey<Registry<Class9269<?>>> field16120 = createKey("worldgen/block_placer_type");
   public static final RegistryKey<Registry<Class5984<?>>> field16121 = createKey("worldgen/foliage_placer_type");
   public static final RegistryKey<Registry<Class9107<?>>> field16122 = createKey("worldgen/trunk_placer_type");
   public static final RegistryKey<Registry<Class9542<?>>> field16123 = createKey("worldgen/tree_decorator_type");
   public static final RegistryKey<Registry<Class7646<?>>> field16124 = createKey("worldgen/feature_size_type");
   public static final RegistryKey<Registry<Codec<? extends BiomeProvider>>> field16125 = createKey("worldgen/biome_source");
   public static final RegistryKey<Registry<Codec<? extends ChunkGenerator>>> field16126 = createKey("worldgen/chunk_generator");
   public static final RegistryKey<Registry<Class7525<?>>> field16127 = createKey("worldgen/structure_processor");
   public static final RegistryKey<Registry<Class8325<?>>> field16128 = createKey("worldgen/structure_pool_element");
   public static final Registry<Class9654<?>> field16129 = method9175(field16119, () -> Class9654.field45131);
   public static final Registry<Class9269<?>> field16130 = method9175(field16120, () -> Class9269.field42638);
   public static final Registry<Class5984<?>> field16131 = method9175(field16121, () -> Class5984.field26059);
   public static final Registry<Class9107<?>> field16132 = method9175(field16122, () -> Class9107.field41831);
   public static final Registry<Class9542<?>> field16133 = method9175(field16123, () -> Class9542.field44429);
   public static final Registry<Class7646<?>> field16134 = method9175(field16124, () -> Class7646.field32820);
   public static final Registry<Codec<? extends BiomeProvider>> BIOME_PROVIDER_CODEC = method9177(field16125, Lifecycle.stable(), () -> BiomeProvider.CODEC);
   public static final Registry<Codec<? extends ChunkGenerator>> CHUNK_GENERATOR_CODEC = method9177(field16126, Lifecycle.stable(), () -> ChunkGenerator.field_235948_a_);
   public static final Registry<Class7525<?>> field16137 = method9175(field16127, () -> Class7525.field32294);
   public static final Registry<Class8325<?>> field16138 = method9175(field16128, () -> Class8325.field35773);
   private final RegistryKey<? extends Registry<T>> field16139;
   private final Lifecycle field16140;

   private static <T> RegistryKey<Registry<T>> createKey(String var0) {
      return RegistryKey.getOrCreateRootKey(new ResourceLocation(var0));
   }

   public static <T extends MutableRegistry<?>> void method9174(MutableRegistry<T> var0) {
      var0.forEach(var1 -> {
         if (var1.method9190().isEmpty()) {
            field16031.error("Registry '{}' was empty after loading", var0.getKey(var1));
            if (SharedConstants.developmentMode) {
               throw new IllegalStateException("Registry: '" + var0.getKey(var1) + "' is empty, not allowed, fix me!");
            }
         }

         if (var1 instanceof Class2351) {
            ResourceLocation var4 = ((Class2351)var1).method9267();
            Validate.notNull(var1.getOrDefault(var4), "Missing default of DefaultedMappedRegistry: " + var4, new Object[0]);
         }
      });
   }

   private static <T> Registry<T> method9175(RegistryKey<? extends Registry<T>> var0, Supplier<T> var1) {
      return method9177(var0, Lifecycle.experimental(), var1);
   }

   private static <T> Class2351<T> method9176(RegistryKey<? extends Registry<T>> var0, String var1, Supplier<T> var2) {
      return method9178(var0, var1, Lifecycle.experimental(), var2);
   }

   private static <T> Registry<T> method9177(RegistryKey<? extends Registry<T>> var0, Lifecycle var1, Supplier<T> var2) {
      return method9179(var0, new SimpleRegistry<T>(var0, var1), var2, var1);
   }

   private static <T> Class2351<T> method9178(RegistryKey<? extends Registry<T>> var0, String var1, Lifecycle var2, Supplier<T> var3) {
      return method9179(var0, new Class2351<T>(var1, var0, var2), var3, var2);
   }

   private static <T, R extends MutableRegistry<T>> R method9179(RegistryKey<? extends Registry<T>> var0, R var1, Supplier<T> var2, Lifecycle var3) {
      ResourceLocation var6 = var0.getLocation();
      field16032.put(var6, var2);
      MutableRegistry var7 = field16034;
      return (R) var7.<R>register(var0, (R)var1, var3);
   }

   public Registry(RegistryKey<? extends Registry<T>> var1, Lifecycle var2) {
      this.field16139 = var1;
      this.field16140 = var2;
   }

   public RegistryKey<? extends Registry<T>> method9180() {
      return this.field16139;
   }

   @Override
   public String toString() {
      return "Registry[" + this.field16139 + " (" + this.field16140 + ")]";
   }

   public <U> DataResult<Pair<T, U>> decode(DynamicOps<U> var1, U var2) {
      return !var1.compressMaps()
         ? ResourceLocation.CODEC
            .decode(var1, var2)
            .flatMap(
               var1x -> {
                  T var4 = this.getOrDefault(var1x.getFirst());
                  return var4 != null
                     ? DataResult.success(Pair.of(var4, var1x.getSecond()), this.method9185((T)var4))
                     : DataResult.error("Unknown registry key: " + var1x.getFirst());
               }
            )
         : var1.getNumberValue(var2).flatMap(var1x -> {
            Object var4 = this.getByValue(var1x.intValue());
            return var4 != null ? DataResult.success(var4, this.method9185((T)var4)) : DataResult.error("Unknown registry id: " + var1x);
         }).map(var1x -> Pair.of((T) var1x, var1.empty()));
   }

   public <U> DataResult<U> encode(T var1, DynamicOps<U> var2, U var3) {
      ResourceLocation var6 = this.getKey((T)var1);
      if (var6 != null) {
         return !var2.compressMaps()
            ? var2.mergeToPrimitive(var3, var2.createString(var6.toString())).setLifecycle(this.field16140)
            : var2.mergeToPrimitive(var3, var2.createInt(this.getId((T)var1))).setLifecycle(this.field16140);
      } else {
         return DataResult.error("Unknown registry element " + var1);
      }
   }

   public <U> Stream<U> keys(DynamicOps<U> var1) {
      return this.method9190().stream().<U>map(var1x -> (U)var1.createString(var1x.toString()));
   }

   @Nullable
   public abstract ResourceLocation getKey(T var1);

   public abstract Optional<RegistryKey<T>> method9182(T var1);

   @Override
   public abstract int getId(T var1);

   @Nullable
   public abstract T getValueForKey(RegistryKey<T> var1);

   @Nullable
   public abstract T getOrDefault(ResourceLocation var1);

   public abstract Lifecycle method9185(T var1);

   public abstract Lifecycle method9186();

   public Optional<T> method9187(ResourceLocation var1) {
      return Optional.<T>ofNullable(this.getOrDefault(var1));
   }

   public Optional<T> method9188(RegistryKey<T> var1) {
      return Optional.<T>ofNullable(this.getValueForKey(var1));
   }

   public T getOrThrow(RegistryKey<T> var1) {
      Object var4 = this.getValueForKey(var1);
      if (var4 != null) {
         return (T)var4;
      } else {
         throw new IllegalStateException("Missing: " + var1);
      }
   }

   public abstract Set<ResourceLocation> method9190();

   public abstract Set<Entry<RegistryKey<T>, T>> method9191();

   public Stream<T> stream() {
      return StreamSupport.<T>stream(this.spliterator(), false);
   }

   public abstract boolean method9193(ResourceLocation var1);

   public static <T> T register(Registry<? super T> var0, String var1, T var2) {
      return register(var0, new ResourceLocation(var1), (T)var2);
   }

   public static <V, T extends V> T register(Registry<V> var0, ResourceLocation var1, T var2) {
      return ((MutableRegistry<V>)var0).register(RegistryKey.getOrCreateKey(var0.field16139, var1), (T)var2, Lifecycle.stable());
   }

   public static <V, T extends V> T register(Registry<V> var0, int var1, String var2, T var3) {
      return ((MutableRegistry<V>)var0).method9249(var1, RegistryKey.getOrCreateKey(var0.field16139, new ResourceLocation(var2)), (T)var3, Lifecycle.stable());
   }

   static {
      WorldGenRegistries.method20499();
      field16032.forEach((var0, var1) -> {
         if (var1.get() == null) {
            field16031.error("Unable to bootstrap registry '{}'", var0);
         }
      });
      method9174(field16034);
   }
}
