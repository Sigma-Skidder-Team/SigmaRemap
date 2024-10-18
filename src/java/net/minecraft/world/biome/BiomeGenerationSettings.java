package net.minecraft.world.biome;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import mapped.*;
import net.minecraft.client.util.Util;
import net.minecraft.util.IStringSerializable;
import net.minecraft.world.gen.carver.ConfiguredCarver;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.ISurfaceBuilderConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BiomeGenerationSettings {
   public static final Logger field32135 = LogManager.getLogger();
   public static final BiomeGenerationSettings DEFAULT_SETTINGS = new BiomeGenerationSettings(() -> Class9109.field41856, ImmutableMap.of(), ImmutableList.of(), ImmutableList.of());
   public static final MapCodec<BiomeGenerationSettings> CODEC = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
               ConfiguredSurfaceBuilder.field_244393_b_.fieldOf("surface_builder").forGetter(var0x -> var0x.field32138),
               Codec.simpleMap(
                     GenerationStageCarving.field261,
                     ConfiguredCarver.field29676.promotePartial(Util.func_240982_a_("Carver: ", field32135::error)),
                     IStringSerializable.method260(GenerationStageCarving.values())
                  )
                  .fieldOf("carvers")
                  .forGetter(var0x -> var0x.field32139),
               ConfiguredFeature.field33884
                  .promotePartial(Util.func_240982_a_("Feature: ", field32135::error))
                  .listOf()
                  .fieldOf("features")
                  .forGetter(var0x -> var0x.field32140),
               StructureFeature.field43173
                  .promotePartial(Util.func_240982_a_("Structure start: ", field32135::error))
                  .fieldOf("starts")
                  .forGetter(var0x -> var0x.field32141)
            )
            .apply(var0, BiomeGenerationSettings::new)
   );
   private final Supplier<ConfiguredSurfaceBuilder<?>> field32138;
   private final Map<GenerationStageCarving, List<Supplier<ConfiguredCarver<?>>>> field32139;
   private final List<List<Supplier<ConfiguredFeature<?, ?>>>> field32140;
   private final List<Supplier<StructureFeature<?, ?>>> field32141;
   private final List<ConfiguredFeature<?, ?>> field32142;

   public BiomeGenerationSettings(
           Supplier<ConfiguredSurfaceBuilder<?>> var1,
           Map<GenerationStageCarving, List<Supplier<ConfiguredCarver<?>>>> var2,
           List<List<Supplier<ConfiguredFeature<?, ?>>>> var3,
           List<Supplier<StructureFeature<?, ?>>> var4
   ) {
      this.field32138 = var1;
      this.field32139 = var2;
      this.field32140 = var3;
      this.field32141 = var4;
      this.field32142 = var3.stream()
         .flatMap(Collection::stream)
         .map(Supplier::get)
         .<ConfiguredFeature<?, ?>>flatMap(ConfiguredFeature::method26522)
         .filter(var0 -> var0.feature == Class2898.field17938)
         .collect(ImmutableList.toImmutableList());
   }

   public List<Supplier<ConfiguredCarver<?>>> getCarvers(GenerationStageCarving var1) {
      return this.field32139.getOrDefault(var1, ImmutableList.of());
   }

   public boolean hasStructure(Structure<?> var1) {
      return this.field32141.stream().anyMatch(var1x -> var1x.get().field_236268_b_ == var1);
   }

   public Collection<Supplier<StructureFeature<?, ?>>> getStructures() {
      return this.field32141;
   }

   public StructureFeature<?, ?> method24279(StructureFeature<?, ?> var1) {
      return (StructureFeature<?, ?>)DataFixUtils.orElse(
         this.field32141.stream().<StructureFeature>map(Supplier::get).filter(var1x -> var1x.field_236268_b_ == var1.field_236268_b_).findAny(), var1
      );
   }

   public List<ConfiguredFeature<?, ?>> method24280() {
      return this.field32142;
   }

   public List<List<Supplier<ConfiguredFeature<?, ?>>>> getFeatures() {
      return this.field32140;
   }

   public Supplier<ConfiguredSurfaceBuilder<?>> getSurfaceBuilder() {
      return this.field32138;
   }

   public ISurfaceBuilderConfig getSurfaceBuilderConfig() {
      return this.field32138.get().getConfig();
   }
}
