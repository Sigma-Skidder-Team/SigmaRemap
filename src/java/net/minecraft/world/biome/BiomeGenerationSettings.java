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
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BiomeGenerationSettings {
   public static final Logger field32135 = LogManager.getLogger();
   public static final BiomeGenerationSettings field32136 = new BiomeGenerationSettings(() -> Class9109.field41856, ImmutableMap.of(), ImmutableList.of(), ImmutableList.of());
   public static final MapCodec<BiomeGenerationSettings> field32137 = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
               Class9319.field43263.fieldOf("surface_builder").forGetter(var0x -> var0x.field32138),
               Codec.simpleMap(
                     GenerationStageCarving.field261,
                     ConfiguredCarver.field29676.promotePartial(Util.func_240982_a_("Carver: ", field32135::error)),
                     IStringSerializable.method260(GenerationStageCarving.values())
                  )
                  .fieldOf("carvers")
                  .forGetter(var0x -> var0x.field32139),
               Class7909.field33884
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
   private final Supplier<Class9319<?>> field32138;
   private final Map<GenerationStageCarving, List<Supplier<ConfiguredCarver<?>>>> field32139;
   private final List<List<Supplier<Class7909<?, ?>>>> field32140;
   private final List<Supplier<StructureFeature<?, ?>>> field32141;
   private final List<Class7909<?, ?>> field32142;

   public BiomeGenerationSettings(
           Supplier<Class9319<?>> var1,
           Map<GenerationStageCarving, List<Supplier<ConfiguredCarver<?>>>> var2,
           List<List<Supplier<Class7909<?, ?>>>> var3,
           List<Supplier<StructureFeature<?, ?>>> var4
   ) {
      this.field32138 = var1;
      this.field32139 = var2;
      this.field32140 = var3;
      this.field32141 = var4;
      this.field32142 = var3.stream()
         .flatMap(Collection::stream)
         .map(Supplier::get)
         .<Class7909<?, ?>>flatMap(Class7909::method26522)
         .filter(var0 -> var0.field33886 == Class2898.field17938)
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

   public List<Class7909<?, ?>> method24280() {
      return this.field32142;
   }

   public List<List<Supplier<Class7909<?, ?>>>> method24281() {
      return this.field32140;
   }

   public Supplier<Class9319<?>> method24282() {
      return this.field32138;
   }

   public Class8277 method24283() {
      return this.field32138.get().method35211();
   }
}
