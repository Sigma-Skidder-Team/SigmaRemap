package net.minecraft.world.biome;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.longs.Long2FloatLinkedOpenHashMap;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import mapped.*;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowingFluidBlock;
import net.minecraft.client.audio.BackgroundMusicSelector;
import net.minecraft.util.Util;
import net.minecraft.crash.CrashReport;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SharedSeedRandom;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.*;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.FoliageColors;
import net.minecraft.world.GrassColors;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.LightType;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.PerlinNoiseGenerator;
import net.minecraft.world.gen.WorldGenRegion;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.structure.StructureManager;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class Biome {
   public static final Logger LOGGER = LogManager.getLogger();
   public static final Codec<Biome> CODEC = RecordCodecBuilder.create((builder) ->
   {
      return builder.group(Biome.Climate.CODEC.forGetter((biome) -> {
         return biome.climate;
      }), Biome.Category.CODEC.fieldOf("category").forGetter((biome) -> {
         return biome.category;
      }), Codec.FLOAT.fieldOf("depth").forGetter((biome) -> {
         return biome.depth;
      }), Codec.FLOAT.fieldOf("scale").forGetter((biome) -> {
         return biome.scale;
      }), BiomeAmbience.CODEC.fieldOf("effects").forGetter((biome) -> {
         return biome.effects;
      }), BiomeGenerationSettings.CODEC.forGetter((biome) -> {
         return biome.biomeGenerationSettings;
      }), MobSpawnInfo.CODEC.forGetter((biome) -> {
         return biome.mobSpawnInfo;
      })).apply(builder, Biome::new);
   });
   public static final Codec<Biome> PACKET_CODEC = RecordCodecBuilder.create((builder) ->
   {
      return builder.group(Biome.Climate.CODEC.forGetter((biome) -> {
         return biome.climate;
      }), Biome.Category.CODEC.fieldOf("category").forGetter((biome) -> {
         return biome.category;
      }), Codec.FLOAT.fieldOf("depth").forGetter((biome) -> {
         return biome.depth;
      }), Codec.FLOAT.fieldOf("scale").forGetter((biome) -> {
         return biome.scale;
      }), BiomeAmbience.CODEC.fieldOf("effects").forGetter((biome) -> {
         return biome.effects;
      })).apply(builder, (climate, category, depth, scale, ambience) -> {
         return new Biome(climate, category, depth, scale, ambience, BiomeGenerationSettings.DEFAULT_SETTINGS, MobSpawnInfo.EMPTY);
      });
   });
   public static final Codec<Supplier<Biome>> BIOME_CODEC = RegistryKeyCodec.create(Registry.BIOME_KEY, CODEC);
   public static final Codec<List<Supplier<Biome>>> BIOMES_CODEC = RegistryKeyCodec.getValueCodecs(Registry.BIOME_KEY, CODEC);
   private final Map < Integer, List < Structure<? >>> biomeStructures = Registry.STRUCTURE_FEATURE.stream().collect(Collectors.groupingBy((structure) ->
           structure.func_236396_f_().ordinal()));
   private static final PerlinNoiseGenerator TEMPERATURE_NOISE = new PerlinNoiseGenerator(new SharedSeedRandom(1234L), ImmutableList.of(0));
   public static final PerlinNoiseGenerator FROZEN_TEMPERATURE_NOISE = new PerlinNoiseGenerator(new SharedSeedRandom(3456L), ImmutableList.of(-2, -1, 0));
   public static final PerlinNoiseGenerator INFO_NOISE = new PerlinNoiseGenerator(new SharedSeedRandom(2345L), ImmutableList.of(0));
   private final Climate climate;
   private final BiomeGenerationSettings biomeGenerationSettings;
   private final MobSpawnInfo mobSpawnInfo;
   private final float depth;
   private final float scale;
   private final Category category;
   private final BiomeAmbience effects;
   private final ThreadLocal<Long2FloatLinkedOpenHashMap> temperatureCache = ThreadLocal.withInitial(() ->
           Util.make(() -> {
              Long2FloatLinkedOpenHashMap long2floatlinkedopenhashmap = new Long2FloatLinkedOpenHashMap(1024, 0.25F)
              {
                 protected void rehash(int p_rehash_1_)
                 {
                 }
              };
              long2floatlinkedopenhashmap.defaultReturnValue(Float.NaN);
              return long2floatlinkedopenhashmap;
           }));

   private Biome(Climate climate, Category category, float depth, float scale, BiomeAmbience effects, BiomeGenerationSettings biomeGenerationSettings, MobSpawnInfo mobSpawnInfo) {
      this.climate = climate;
      this.biomeGenerationSettings = biomeGenerationSettings;
      this.mobSpawnInfo = mobSpawnInfo;
      this.category = category;
      this.depth = depth;
      this.scale = scale;
      this.effects = effects;
   }

   public int getSkyColor() {
      return this.effects.getSkyColor();
   }

   public MobSpawnInfo getMobSpawnInfo() {
      return this.mobSpawnInfo;
   }

   public RainType getPrecipitation() {
      return this.climate.precipitation;
   }

   public boolean isHighHumidity() {
      return this.getDownfall() > 0.85F;
   }

   private float getTemperatureAtPosition(BlockPos pos) {
      float f = this.climate.temperatureModifier.getTemperatureAtPosition(pos, this.getTemperature());

      if (pos.getY() > 64)
      {
         float f1 = (float)(TEMPERATURE_NOISE.noiseAt((double)((float)pos.getX() / 8.0F), (double)((float)pos.getZ() / 8.0F), false) * 4.0D);
         return f - (f1 + (float)pos.getY() - 64.0F) * 0.05F / 30.0F;
      }
      else
      {
         return f;
      }
   }

   public final float getTemperature(BlockPos pos) {
      long i = pos.toLong();
      Long2FloatLinkedOpenHashMap long2floatlinkedopenhashmap = this.temperatureCache.get();
      float f = long2floatlinkedopenhashmap.get(i);

      if (!Float.isNaN(f))
      {
         return f;
      }
      else
      {
         float f1 = this.getTemperatureAtPosition(pos);

         if (long2floatlinkedopenhashmap.size() == 1024)
         {
            long2floatlinkedopenhashmap.removeFirstFloat();
         }

         long2floatlinkedopenhashmap.put(i, f1);
         return f1;
      }
   }

   public boolean doesWaterFreeze(IWorldReader var1, BlockPos var2) {
      return this.doesWaterFreeze(var1, var2, true);
   }

   public boolean doesWaterFreeze(IWorldReader worldIn, BlockPos water, boolean mustBeAtEdge) {
      if (this.getTemperature(water) >= 0.15F)
      {
         return false;
      }
      else
      {
         if (water.getY() >= 0 && water.getY() < 256 && worldIn.getLightFor(LightType.BLOCK, water) < 10)
         {
            BlockState blockstate = worldIn.getBlockState(water);
            FluidState fluidstate = worldIn.getFluidState(water);

            if (fluidstate.getFluid() == Fluids.WATER && blockstate.getBlock() instanceof FlowingFluidBlock)
            {
               if (!mustBeAtEdge)
               {
                  return true;
               }

               boolean flag = worldIn.hasWater(water.west()) && worldIn.hasWater(water.east()) && worldIn.hasWater(water.north()) && worldIn.hasWater(water.south());

               if (!flag)
               {
                  return true;
               }
            }
         }

         return false;
      }
   }

   public boolean doesSnowGenerate(IWorldReader worldIn, BlockPos pos) {
      if (this.getTemperature(pos) >= 0.15F)
      {
         return false;
      }
      else
      {
         if (pos.getY() >= 0 && pos.getY() < 256 && worldIn.getLightFor(LightType.BLOCK, pos) < 10)
         {
            BlockState blockstate = worldIn.getBlockState(pos);

            if (blockstate.isAir() && Blocks.SNOW.getDefaultState().isValidPosition(worldIn, pos))
            {
               return true;
            }
         }

         return false;
      }
   }

   public BiomeGenerationSettings getGenerationSettings() {
      return this.biomeGenerationSettings;
   }

   public void generateFeatures(StructureManager structureManager, ChunkGenerator chunkGenerator, WorldGenRegion worldGenRegion, long seed, SharedSeedRandom rand, BlockPos pos)
   {
      List < List < Supplier < ConfiguredFeature <? , ? >>> > list = this.biomeGenerationSettings.getFeatures();
      int i = Decoration.values().length;

      for (int j = 0; j < i; ++j)
      {
         int k = 0;
         if (structureManager.func_235005_a_()) {
            for (Structure<?> structure : this.biomeStructures.getOrDefault(j, Collections.emptyList())) {
               rand.setFeatureSeed(seed, k, j);
               int l = pos.getX() >> 4;
               int i1 = pos.getZ() >> 4;
               int j1 = l << 4;
               int k1 = i1 << 4;

               try
               {
                  structureManager.func_235011_a_(SectionPos.from(pos), structure).forEach((structureStart) ->
                          structureStart.func_230366_a_(worldGenRegion, structureManager, chunkGenerator, rand, new MutableBoundingBox(j1, k1, j1 + 15, k1 + 15), new ChunkPos(l, i1)));
               }
               catch (Exception exception)
               {
                  CrashReport crashreport = CrashReport.makeCrashReport(exception, "Feature placement");
                  crashreport.makeCategory("Feature").addDetail("Id", Registry.STRUCTURE_FEATURE.getKey(structure)).addDetail("Description", () ->
                          structure.toString());
                  throw new ReportedException(crashreport);
               }

               ++k;
            }
         }

         if (list.size() > j)
         {
            for (Supplier < ConfiguredFeature <? , ? >> supplier : list.get(j))
            {
               ConfiguredFeature <? , ? > configuredfeature = supplier.get();
               rand.setFeatureSeed(seed, k, j);

               try
               {
                  configuredfeature.func_242765_a(worldGenRegion, chunkGenerator, rand, pos);
               }
               catch (Exception exception1)
               {
                  CrashReport crashreport1 = CrashReport.makeCrashReport(exception1, "Feature placement");
                  crashreport1.makeCategory("Feature").addDetail("Id", Registry.FEATURE.getKey(configuredfeature.feature)).addDetail("Config", configuredfeature.config).addDetail("Description", () ->
                          configuredfeature.feature.toString());
                  throw new ReportedException(crashreport1);
               }

               ++k;
            }
         }
      }
   }

   public int getFogColor() {
      return this.effects.getFogColor();
   }

   public int getGrassColor(double var1, double var3) {
      int var7 = this.effects.getGrassColor().orElseGet(this::getGrassColorByClimate);
      return this.effects.getGrassColorModifier().getModifiedGrassColor(var1, var3, var7);
   }

   private int getGrassColorByClimate() {
      double d0 = (double)MathHelper.clamp(this.climate.temperature, 0.0F, 1.0F);
      double d1 = (double)MathHelper.clamp(this.climate.downfall, 0.0F, 1.0F);
      return GrassColors.get(d0, d1);
   }

   public int getFoliageColor() {
      return this.effects.getFoliageColor().orElseGet(this::getFoliageColorByClimate);
   }

   private int getFoliageColorByClimate() {
      double d0 = (double)MathHelper.clamp(this.climate.temperature, 0.0F, 1.0F);
      double d1 = (double)MathHelper.clamp(this.climate.downfall, 0.0F, 1.0F);
      return FoliageColors.get(d0, d1);
   }

   public void buildSurface(Random var1, IChunk var2, int var3, int var4, int var5, double var6, BlockState var8, BlockState var9, int var10, long var11) {
      ConfiguredSurfaceBuilder<?> configuredsurfacebuilder = this.biomeGenerationSettings.getSurfaceBuilder().get();
      configuredsurfacebuilder.setSeed(var11);
      configuredsurfacebuilder.buildSurface(var1, var2, this, var3, var4, var5, var6, var8, var9, var10, var11);
   }

   public final float getDepth() {
      return this.depth;
   }

   public final float getDownfall()
   {
      return this.climate.downfall;
   }

   public final float getScale() {
      return this.scale;
   }

   public final float getTemperature()
   {
      return this.climate.temperature;
   }

   public BiomeAmbience getAmbience() {
      return this.effects;
   }

   public final int getWaterColor() {
      return this.effects.getWaterColor();
   }

   public final int getWaterFogColor() {
      return this.effects.getWaterFogColor();
   }

   public Optional<ParticleEffectAmbience> getAmbientParticle() {
      return this.effects.getParticle();
   }

   public Optional<SoundEvent> getAmbientSound() {
      return this.effects.getAmbientSound();
   }

   public Optional<MoodSoundAmbience> getMoodSound() {
      return this.effects.getMoodSound();
   }

   public Optional<SoundAdditionsAmbience> getAdditionalAmbientSound() {
      return this.effects.getAdditionsSound();
   }

   public Optional<BackgroundMusicSelector> getBackgroundMusic() {
      return this.effects.getMusic();
   }

   public final Category getCategory() {
      return this.category;
   }

   public String toString()
   {
      ResourceLocation resourcelocation = WorldGenRegistries.BIOME.getKey(this);
      return resourcelocation == null ? super.toString() : resourcelocation.toString();
   }

   public enum Category implements IStringSerializable {
      NONE("none"),
      TAIGA("taiga"),
      EXTREME_HILLS("extreme_hills"),
      JUNGLE("jungle"),
      MESA("mesa"),
      PLAINS("plains"),
      SAVANNA("savanna"),
      ICY("icy"),
      THEEND("the_end"),
      BEACH("beach"),
      FOREST("forest"),
      OCEAN("ocean"),
      DESERT("desert"),
      RIVER("river"),
      SWAMP("swamp"),
      MUSHROOM("mushroom"),
      NETHER("nether");

      public static final Codec<Biome.Category> CODEC = IStringSerializable.createEnumCodec(Biome.Category::values, Biome.Category::byName);
      private static final Map<String, Biome.Category> BY_NAME = Arrays.stream(values()).collect(Collectors.toMap(Biome.Category::getName, (category) -> {
         return category;
      }));
      private final String name;

       Category(String var3) {
         this.name = var3;
      }

      public String getName() {
         return this.name;
      }

      public static Category byName(String var0) {
         return BY_NAME.get(var0);
      }

      public String getString() {
         return this.name;
      }
   }

   public static class Climate {
      public static final MapCodec<Climate> CODEC = RecordCodecBuilder.mapCodec(builder -> builder.group(
                  RainType.CODEC.fieldOf("precipitation").forGetter(var0x -> var0x.precipitation),
                  Codec.FLOAT.fieldOf("temperature").forGetter(var0x -> var0x.temperature),
                  TemperatureModifier.CODEC.optionalFieldOf("temperature_modifier", TemperatureModifier.NONE).forGetter(var0x -> var0x.temperatureModifier),
                  Codec.FLOAT.fieldOf("downfall").forGetter(var0x -> var0x.downfall)
               )
               .apply(     builder, Climate::new));
      private final RainType precipitation;
      private final float temperature;
      private final TemperatureModifier temperatureModifier;
      private final float downfall;

      private Climate(RainType var1, float var2, TemperatureModifier var3, float var4) {
         this.precipitation = var1;
         this.temperature = var2;
         this.temperatureModifier = var3;
         this.downfall = var4;
      }
   }

   public enum RainType implements IStringSerializable {
      NONE("none"),
      RAIN("rain"),
      SNOW("snow");

      public static final Codec<Biome.RainType> CODEC = IStringSerializable.createEnumCodec(Biome.RainType::values, Biome.RainType::getRainType);
      private static final Map<String, Biome.RainType> BY_NAME = Arrays.stream(values()).collect(Collectors.toMap(Biome.RainType::getName, (precipitation) -> {
         return precipitation;
      }));
      private final String name;

       private RainType(String var3) {
         this.name = var3;
      }

      public String getName() {
         return this.name;
      }

      public static RainType getRainType(String var0) {
         return BY_NAME.get(var0);
      }

      public String getString() {
         return this.name;
      }
   }

   public enum TemperatureModifier implements IStringSerializable {
      NONE("none")
              {
                 public float getTemperatureAtPosition(BlockPos pos, float temperature)
                 {
                    return temperature;
                 }
              },

      FROZEN("frozen")
              {
                 public float getTemperatureAtPosition(BlockPos pos, float temperature)
                 {
                    double d0 = Biome.FROZEN_TEMPERATURE_NOISE.noiseAt((double)pos.getX() * 0.05D, (double)pos.getZ() * 0.05D, false) * 7.0D;
                    double d1 = Biome.INFO_NOISE.noiseAt((double)pos.getX() * 0.2D, (double)pos.getZ() * 0.2D, false);
                    double d2 = d0 + d1;

                    if (d2 < 0.3D)
                    {
                       double d3 = Biome.INFO_NOISE.noiseAt((double)pos.getX() * 0.09D, (double)pos.getZ() * 0.09D, false);

                       if (d3 < 0.8D)
                       {
                          return 0.2F;
                       }
                    }

                    return temperature;
                 }
              };

      private final String name;
      public static final Codec<Biome.TemperatureModifier> CODEC = IStringSerializable.createEnumCodec(Biome.TemperatureModifier::values, Biome.TemperatureModifier::byName);
      private static final Map<String, Biome.TemperatureModifier> NAME_TO_MODIFIER_MAP = Arrays.stream(values()).collect(Collectors.toMap(Biome.TemperatureModifier::getName, (temperatureModifier) -> {
         return temperatureModifier;
      }));

      public abstract float getTemperatureAtPosition(BlockPos var1, float var2);

      private TemperatureModifier(String var3) {
         this.name = var3;
      }

      public String getName() {
         return this.name;
      }

      public String getString() {
         return this.name;
      }

      public static TemperatureModifier byName(String var0) {
         return NAME_TO_MODIFIER_MAP.get(var0);
      }
   }

   public static class Builder {
      private RainType precipitation;
      private Category category;
      private Float depth;
      private Float scale;
      private Float temperature;
      private TemperatureModifier temperatureModifier = TemperatureModifier.NONE;
      private Float downfall;
      private BiomeAmbience effects;
      private MobSpawnInfo mobSpawnSettings;
      private BiomeGenerationSettings generationSettings;

      public Builder precipitation(RainType var1) {
         this.precipitation = var1;
         return this;
      }

      public Builder category(Category var1) {
         this.category = var1;
         return this;
      }

      public Builder depth(float var1) {
         this.depth = var1;
         return this;
      }

      public Builder scale(float var1) {
         this.scale = var1;
         return this;
      }

      public Builder temperature(float var1) {
         this.temperature = var1;
         return this;
      }

      public Builder downfall(float var1) {
         this.downfall = var1;
         return this;
      }

      public Builder setEffects(BiomeAmbience var1) {
         this.effects = var1;
         return this;
      }

      public Builder withMobSpawnSettings(MobSpawnInfo var1) {
         this.mobSpawnSettings = var1;
         return this;
      }

      public Builder withGenerationSettings(BiomeGenerationSettings var1) {
         this.generationSettings = var1;
         return this;
      }

      public Builder withTemperatureModifier(TemperatureModifier var1) {
         this.temperatureModifier = var1;
         return this;
      }

      public Biome build()
      {
         if (this.precipitation != null && this.category != null && this.depth != null && this.scale != null && this.temperature != null && this.downfall != null && this.effects != null && this.mobSpawnSettings != null && this.generationSettings != null)
         {
            return new Biome(new Biome.Climate(this.precipitation, this.temperature, this.temperatureModifier, this.downfall), this.category, this.depth, this.scale, this.effects, this.generationSettings, this.mobSpawnSettings);
         }
         else
         {
            throw new IllegalStateException("You are missing parameters to build a proper biome\n" + this);
         }
      }

      public String toString()
      {
         return "BiomeBuilder{\nprecipitation=" + this.precipitation + ",\nbiomeCategory=" + this.category + ",\ndepth=" + this.depth + ",\nscale=" + this.scale + ",\ntemperature=" + this.temperature + ",\ntemperatureModifier=" + this.temperatureModifier + ",\ndownfall=" + this.downfall + ",\nspecialEffects=" + this.effects + ",\nmobSpawnSettings=" + this.mobSpawnSettings + ",\ngenerationSettings=" + this.generationSettings + ",\n" + '}';
      }
   }
}
