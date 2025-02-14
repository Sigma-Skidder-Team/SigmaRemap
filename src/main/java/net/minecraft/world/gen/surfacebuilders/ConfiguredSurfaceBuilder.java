package net.minecraft.world.gen.surfacebuilders;

import com.mojang.serialization.Codec;
import mapped.SurfaceBuilder;
import mapped.RegistryKeyCodec;
import net.minecraft.block.BlockState;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunk;

import java.util.Random;
import java.util.function.Supplier;

public class ConfiguredSurfaceBuilder<SC extends ISurfaceBuilderConfig> {
   public static final Codec<ConfiguredSurfaceBuilder<?>> field_237168_a_ = Registry.SURFACE_BUILDER.dispatch(var0 -> var0.builder, SurfaceBuilder::func_237202_d_);
   public static final Codec<Supplier<ConfiguredSurfaceBuilder<?>>> field_244393_b_ = RegistryKeyCodec.create(Registry.CONFIGURED_SURFACE_BUILDER_KEY, field_237168_a_);
   public final SurfaceBuilder<SC> builder;
   public final SC config;

   public ConfiguredSurfaceBuilder(SurfaceBuilder<SC> var1, SC var2) {
      this.builder = var1;
      this.config = (SC)var2;
   }

   public void buildSurface(
           Random var1, IChunk var2, Biome var3, int var4, int var5, int var6, double var7, BlockState var9, BlockState var10, int var11, long var12
   ) {
      this.builder.buildSurface(var1, var2, var3, var4, var5, var6, var7, var9, var10, var11, var12, this.config);
   }

   public void setSeed(long var1) {
      this.builder.method20658(var1);
   }

   public SC getConfig() {
      return this.config;
   }
}
