package net.minecraft.world.gen.feature;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

import mapped.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.ISeedReader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConfiguredFeature<FC extends Class4698, F extends Class2898<FC>> implements Class7908<ConfiguredFeature<?, ?>> {
   private static String[] field33881;
   public static final Codec<ConfiguredFeature<?, ?>> field33882 = Registry.field16112.dispatch(var0 -> var0.field33886, Class2898::method11215);
   public static final Codec<Supplier<ConfiguredFeature<?, ?>>> field33883 = RegistryKeyCodec.create(Registry.field16102, field33882);
   public static final Codec<List<Supplier<ConfiguredFeature<?, ?>>>> field33884 = RegistryKeyCodec.<ConfiguredFeature<?, ?>>method33672(Registry.field16102, field33882);
   public static final Logger field33885 = LogManager.getLogger();
   public final F field33886;
   public final FC field33887;

   public ConfiguredFeature(F var1, FC var2) {
      this.field33886 = (F)var1;
      this.field33887 = (FC)var2;
   }

   public F method26518() {
      return this.field33886;
   }

   public FC method26519() {
      return this.field33887;
   }

   public ConfiguredFeature<?, ?> method26510(Class7907<?> var1) {
      return Class2898.field17987.method11216(new Class4713(() -> this, var1));
   }

   public Class7758 method26520(float var1) {
      return new Class7758(this, var1);
   }

   public boolean func_242765_a(ISeedReader var1, ChunkGenerator var2, Random var3, BlockPos var4) {
      return this.field33886.method11213(var1, var2, var3, var4, this.field33887);
   }

   public Stream<ConfiguredFeature<?, ?>> method26522() {
      return Stream.<ConfiguredFeature<?, ?>>concat(Stream.of(this), this.field33887.method14736());
   }
}
