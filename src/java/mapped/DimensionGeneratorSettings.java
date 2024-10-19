package mapped;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableSet;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.Properties;
import java.util.Random;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.function.Supplier;

import net.minecraft.util.JSONUtils;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.OverworldBiomeProvider;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DimensionGeneratorSettings {
   public static final Codec<DimensionGeneratorSettings> field_236201_a_ = RecordCodecBuilder.<DimensionGeneratorSettings>create(
         var0 -> var0.group(
                  Codec.LONG.fieldOf("seed").stable().forGetter(DimensionGeneratorSettings::method26259),
                  Codec.BOOL.fieldOf("generate_features").orElse(true).stable().forGetter(DimensionGeneratorSettings::method26260),
                  Codec.BOOL.fieldOf("bonus_chest").orElse(false).stable().forGetter(DimensionGeneratorSettings::method26261),
                  SimpleRegistry.method9256(Registry.DIMENSION_KEY, Lifecycle.stable(), Dimension.field43951)
                     .xmap(Dimension::method36414, Function.identity())
                     .fieldOf("dimensions")
                     .forGetter(DimensionGeneratorSettings::method26264),
                  Codec.STRING.optionalFieldOf("legacy_custom_options").stable().forGetter(var0x -> var0x.field33656)
               )
               .apply(var0, var0.stable(DimensionGeneratorSettings::new))
      )
      .comapFlatMap(DimensionGeneratorSettings::method26254, Function.identity());
   private static final Logger field33651 = LogManager.getLogger();
   private final long field33652;
   private final boolean field33653;
   private final boolean field33654;
   private final SimpleRegistry<Dimension> field33655;
   private final Optional<String> field33656;

   private DataResult<DimensionGeneratorSettings> method26254() {
      Dimension var3 = this.field33655.getValueForKey(Dimension.field43952);
      if (var3 != null) {
         return !this.method26255() ? DataResult.success(this) : DataResult.success(this, Lifecycle.stable());
      } else {
         return DataResult.error("Overworld settings missing");
      }
   }

   private boolean method26255() {
      return Dimension.method36415(this.field33652, this.field33655);
   }

   public DimensionGeneratorSettings(long var1, boolean var3, boolean var4, SimpleRegistry<Dimension> var5) {
      this(var1, var3, var4, var5, Optional.<String>empty());
      Dimension var8 = var5.getValueForKey(Dimension.field43952);
      if (var8 == null) {
         throw new IllegalStateException("Overworld settings missing");
      }
   }

   private DimensionGeneratorSettings(long var1, boolean var3, boolean var4, SimpleRegistry<Dimension> var5, Optional<String> var6) {
      this.field33652 = var1;
      this.field33653 = var3;
      this.field33654 = var4;
      this.field33655 = var5;
      this.field33656 = var6;
   }

   public static DimensionGeneratorSettings method26256(DynamicRegistries var0) {
      MutableRegistry var3 = var0.<Biome>getRegistry(Registry.BIOME_KEY);
      int var4 = "North Carolina".hashCode();
      MutableRegistry var5 = var0.<DimensionType>getRegistry(Registry.DIMENSION_TYPE_KEY);
      MutableRegistry var6 = var0.<DimensionSettings>getRegistry(Registry.NOISE_SETTINGS_KEY);
      return new DimensionGeneratorSettings((long)var4, true, true, method26262(var5, DimensionType.getDefaultSimpleRegistry(var5, var3, var6, (long)var4), method26258(var3, var6, (long)var4)));
   }

   public static DimensionGeneratorSettings method26257(Registry<DimensionType> var0, Registry<Biome> var1, Registry<DimensionSettings> var2) {
      long var5 = new Random().nextLong();
      return new DimensionGeneratorSettings(var5, true, false, method26262(var0, DimensionType.getDefaultSimpleRegistry(var0, var1, var2, var5), method26258(var1, var2, var5)));
   }

   public static NoiseChunkGenerator method26258(Registry<Biome> var0, Registry<DimensionSettings> var1, long var2) {
      return new NoiseChunkGenerator(new OverworldBiomeProvider(var2, false, false, var0), var2, () -> var1.getOrThrow(DimensionSettings.field43230));
   }

   public long method26259() {
      return this.field33652;
   }

   public boolean method26260() {
      return this.field33653;
   }

   public boolean method26261() {
      return this.field33654;
   }

   public static SimpleRegistry<Dimension> method26262(Registry<DimensionType> var0, SimpleRegistry<Dimension> var1, ChunkGenerator var2) {
      Dimension var5 = var1.getValueForKey(Dimension.field43952);
      Supplier var6 = () -> var5 != null ? var5.method36412() : var0.getOrThrow(DimensionType.OVERWORLD);
      return method26263(var1, var6, var2);
   }

   public static SimpleRegistry<Dimension> method26263(SimpleRegistry<Dimension> var0, Supplier<DimensionType> var1, ChunkGenerator var2) {
      SimpleRegistry<Dimension> var5 = new SimpleRegistry(Registry.DIMENSION_KEY, Lifecycle.experimental());
      var5.register(Dimension.field43952, new Dimension(var1, var2), Lifecycle.stable());


      for (Entry<RegistryKey<Dimension>, Dimension>var7 : var0.method9191()) {
         RegistryKey<Dimension> var8 = var7.getKey();
         if (var8 != Dimension.field43952) {
            var5.register(var8, var7.getValue(), var0.method9185(var7.getValue()));
         }
      }

      return var5;
   }

   public SimpleRegistry<Dimension> method26264() {
      return this.field33655;
   }

   public ChunkGenerator method26265() {
      Dimension var3 = this.field33655.getValueForKey(Dimension.field43952);
      if (var3 != null) {
         return var3.method36413();
      } else {
         throw new IllegalStateException("Overworld settings missing");
      }
   }

   public ImmutableSet<RegistryKey<World>> method26266() {
      return this.method26264()
         .method9191()
         .stream()
         .<RegistryKey<World>>map(var0 -> RegistryKey.<World>getOrCreateKey(Registry.WORLD_KEY, var0.getKey().getLocation()))
         .collect(ImmutableSet.toImmutableSet());
   }

   public boolean method26267() {
      return this.method26265() instanceof DebugChunkGenerator;
   }

   public boolean method26268() {
      return this.method26265() instanceof FlatChunkGenerator;
   }

   public boolean func_236229_j_() {
      return this.field33656.isPresent();
   }

   public DimensionGeneratorSettings method26270() {
      return new DimensionGeneratorSettings(this.field33652, this.field33653, true, this.field33655, this.field33656);
   }

   public DimensionGeneratorSettings method26271() {
      return new DimensionGeneratorSettings(this.field33652, !this.field33653, this.field33654, this.field33655);
   }

   public DimensionGeneratorSettings method26272() {
      return new DimensionGeneratorSettings(this.field33652, this.field33653, !this.field33654, this.field33655);
   }

   public static DimensionGeneratorSettings method26273(DynamicRegistries var0, Properties var1) {
      String var4 = (String)MoreObjects.firstNonNull((String)var1.get("generator-settings"), "");
      var1.put("generator-settings", var4);
      String var5 = (String)MoreObjects.firstNonNull((String)var1.get("level-seed"), "");
      var1.put("level-seed", var5);
      String var6 = (String)var1.get("generate-structures");
      boolean var7 = var6 == null || Boolean.parseBoolean(var6);
      var1.put("generate-structures", Objects.toString(var7));
      String var8 = (String)var1.get("level-type");
      String var9 = Optional.<String>ofNullable(var8).<String>map(var0x -> var0x.toLowerCase(Locale.ROOT)).orElse("default");
      var1.put("level-type", var9);
      long var10 = new Random().nextLong();
      if (!var5.isEmpty()) {
         try {
            long var12 = Long.parseLong(var5);
            if (var12 != 0L) {
               var10 = var12;
            }
         } catch (NumberFormatException var22) {
            var10 = (long)var5.hashCode();
         }
      }

      MutableRegistry<DimensionType> var14 = var0.getRegistry(Registry.DIMENSION_TYPE_KEY);
      MutableRegistry<Biome> var15 = var0.getRegistry(Registry.BIOME_KEY);
      MutableRegistry<DimensionSettings> var16 = var0.getRegistry(Registry.NOISE_SETTINGS_KEY);
      SimpleRegistry<Dimension> var17 = DimensionType.getDefaultSimpleRegistry(var14, var15, var16, var10);
      switch (var9) {
         case "flat":
            JsonObject var20 = !var4.isEmpty() ? JSONUtils.method32800(var4) : new JsonObject();
            Dynamic<JsonElement> var21 = new Dynamic<>(JsonOps.INSTANCE, var20);
            return new DimensionGeneratorSettings(
               var10,
               var7,
               false,
               method26262(
                  var14,
                  var17,
                  new FlatChunkGenerator(Class9733.field45443.parse(var21).resultOrPartial(field33651::error).orElseGet(() -> Class9733.method38132(var15)))
               )
            );
         case "debug_all_block_states":
            return new DimensionGeneratorSettings(var10, var7, false, method26262(var14, var17, new DebugChunkGenerator(var15)));
         case "amplified":
            return new DimensionGeneratorSettings(
               var10,
               var7,
               false,
               method26262(var14, var17, new NoiseChunkGenerator(new OverworldBiomeProvider(var10, false, false, var15), var10, () -> var16.getOrThrow(DimensionSettings.field43231)))
            );
         case "largebiomes":
            return new DimensionGeneratorSettings(
               var10,
               var7,
               false,
               method26262(var14, var17, new NoiseChunkGenerator(new OverworldBiomeProvider(var10, false, true, var15), var10, () -> var16.getOrThrow(DimensionSettings.field43230)))
            );
         default:
            return new DimensionGeneratorSettings(var10, var7, false, method26262(var14, var17, method26258(var15, var16, var10)));
      }
   }

   public DimensionGeneratorSettings method26274(boolean var1, OptionalLong var2) {
      long var5 = var2.orElse(this.field33652);
      SimpleRegistry var7;
      if (!var2.isPresent()) {
         var7 = this.field33655;
      } else {
         var7 = new SimpleRegistry<Dimension>(Registry.DIMENSION_KEY, Lifecycle.experimental());
         long var8 = var2.getAsLong();

         for (Entry var11 : this.field33655.method9191()) {
            RegistryKey var12 = (RegistryKey)var11.getKey();
            var7.<Dimension>register(
               var12,
               new Dimension(((Dimension)var11.getValue()).method36411(), ((Dimension)var11.getValue()).method36413().func_230349_a_(var8)),
               this.field33655.method9185((Dimension)var11.getValue())
            );
         }
      }

      DimensionGeneratorSettings var13;
      if (!this.method26267()) {
         var13 = new DimensionGeneratorSettings(var5, this.method26260(), this.method26261() && !var1, var7);
      } else {
         var13 = new DimensionGeneratorSettings(var5, false, false, var7);
      }

      return var13;
   }
}
