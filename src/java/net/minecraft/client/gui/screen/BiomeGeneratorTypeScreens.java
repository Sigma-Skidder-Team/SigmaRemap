package net.minecraft.client.gui.screen;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

import mapped.*;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.biome.provider.SingleBiomeProvider;

public abstract class BiomeGeneratorTypeScreens {
   public static final BiomeGeneratorTypeScreens field_239066_a_ = new Class5974("default");
   private static final BiomeGeneratorTypeScreens field26026 = new Class5972("flat");
   private static final BiomeGeneratorTypeScreens field26027 = new Class5973("large_biomes");
   public static final BiomeGeneratorTypeScreens field26028 = new Class5976("amplified");
   private static final BiomeGeneratorTypeScreens field26029 = new Class5969("single_biome_surface");
   private static final BiomeGeneratorTypeScreens field26030 = new Class5975("single_biome_caves");
   private static final BiomeGeneratorTypeScreens field26031 = new Class5971("single_biome_floating_islands");
   private static final BiomeGeneratorTypeScreens field26032 = new Class5977("debug_all_block_states");
   public static final List<BiomeGeneratorTypeScreens> field26033 = Lists.newArrayList(
      new BiomeGeneratorTypeScreens[]{field_239066_a_, field26026, field26027, field26028, field26029, field26030, field26031, field26032}
   );
   public static final Map<Optional<BiomeGeneratorTypeScreens>, Class7837> field26034 = ImmutableMap.of(
      Optional.<BiomeGeneratorTypeScreens>of(field26026),
      (Class7837)(var0, var1) -> {
         ChunkGenerator var4 = var1.method26265();
         return new Class1324(
            var0,
            var2 -> var0.field7092
                  .method5782(
                     new DimensionGeneratorSettings(
                        var1.method26259(),
                        var1.method26260(),
                        var1.method26261(),
                        DimensionGeneratorSettings.method26262(var0.field7092.method5789().<DimensionType>getRegistry(Registry.DIMENSION_TYPE_KEY), var1.method26264(), new FlatChunkGenerator(var2))
                     )
                  ),
            !(var4 instanceof FlatChunkGenerator)
               ? Class9733.method38132(var0.field7092.method5789().<Biome>getRegistry(Registry.BIOME_KEY))
               : ((FlatChunkGenerator)var4).method17837()
         );
      },
      Optional.<BiomeGeneratorTypeScreens>of(field26029),
      (Class7837)(var0, var1) -> new Class1323(
            var0,
            var0.field7092.method5789(),
            var2 -> var0.field7092.method5782(method18502(var0.field7092.method5789(), var1, field26029, var2)),
            method18503(var0.field7092.method5789(), var1)
         ),
      Optional.<BiomeGeneratorTypeScreens>of(field26030),
      (Class7837)(var0, var1) -> new Class1323(
            var0,
            var0.field7092.method5789(),
            var2 -> var0.field7092.method5782(method18502(var0.field7092.method5789(), var1, field26030, var2)),
            method18503(var0.field7092.method5789(), var1)
         ),
      Optional.<BiomeGeneratorTypeScreens>of(field26031),
      (Class7837)(var0, var1) -> new Class1323(
            var0,
            var0.field7092.method5789(),
            var2 -> var0.field7092.method5782(method18502(var0.field7092.method5789(), var1, field26031, var2)),
            method18503(var0.field7092.method5789(), var1)
         )
   );
   private final ITextComponent field26035;

   private BiomeGeneratorTypeScreens(String var1) {
      this.field26035 = new TranslationTextComponent("generator." + var1);
   }

   private static DimensionGeneratorSettings method18502(DynamicRegistries var0, DimensionGeneratorSettings var1, BiomeGeneratorTypeScreens var2, Biome var3) {
      SingleBiomeProvider var6 = new SingleBiomeProvider(var3);
      MutableRegistry var7 = var0.<DimensionType>getRegistry(Registry.DIMENSION_TYPE_KEY);
      MutableRegistry var8 = var0.<DimensionSettings>getRegistry(Registry.NOISE_SETTINGS_KEY);
      Supplier var9;
      if (var2 != field26030) {
         if (var2 != field26031) {
            var9 = () -> var8.getOrThrow(DimensionSettings.field43230);
         } else {
            var9 = () -> var8.getOrThrow(DimensionSettings.field43235);
         }
      } else {
         var9 = () -> var8.getOrThrow(DimensionSettings.field43234);
      }

      return new DimensionGeneratorSettings(
         var1.method26259(),
         var1.method26260(),
         var1.method26261(),
         DimensionGeneratorSettings.method26262(var7, var1.method26264(), new NoiseChunkGenerator(var6, var1.method26259(), var9))
      );
   }

   private static Biome method18503(DynamicRegistries var0, DimensionGeneratorSettings var1) {
      return var1.method26265()
         .getBiomeProvider()
         .getBiomes()
         .stream()
         .findFirst()
         .orElse(var0.<Biome>getRegistry(Registry.BIOME_KEY).getOrThrow(Biomes.PLAINS));
   }

   public static Optional<BiomeGeneratorTypeScreens> method18504(DimensionGeneratorSettings var0) {
      ChunkGenerator var3 = var0.method26265();
      if (!(var3 instanceof FlatChunkGenerator)) {
         return !(var3 instanceof DebugChunkGenerator) ? Optional.<BiomeGeneratorTypeScreens>empty() : Optional.<BiomeGeneratorTypeScreens>of(field26032);
      } else {
         return Optional.<BiomeGeneratorTypeScreens>of(field26026);
      }
   }

   public ITextComponent method18505() {
      return this.field26035;
   }

   public DimensionGeneratorSettings method18506(DynamicRegistriesImpl var1, long var2, boolean var4, boolean var5) {
      MutableRegistry var8 = var1.<Biome>getRegistry(Registry.BIOME_KEY);
      MutableRegistry var9 = var1.<DimensionType>getRegistry(Registry.DIMENSION_TYPE_KEY);
      MutableRegistry var10 = var1.<DimensionSettings>getRegistry(Registry.NOISE_SETTINGS_KEY);
      return new DimensionGeneratorSettings(var2, var4, var5, DimensionGeneratorSettings.method26262(var9, DimensionType.getDefaultSimpleRegistry(var9, var8, var10, var2), this.method18500(var8, var10, var2)));
   }

   public abstract ChunkGenerator method18500(Registry<Biome> var1, Registry<DimensionSettings> var2, long var3);

   // $VF: synthetic method
   public BiomeGeneratorTypeScreens(String var1, Class5974 var2) {
      this(var1);
   }
}
