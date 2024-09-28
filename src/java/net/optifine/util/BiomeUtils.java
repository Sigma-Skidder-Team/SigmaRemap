package net.optifine.util;

import com.google.common.collect.Lists;
import mapped.Class1664;
import net.minecraft.util.registry.WorldGenRegistries;
import net.optifine.config.BiomeId;
import mapped.DynamicRegistries;
import mapped.RegistryKey;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.IBlockDisplayReader;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeMaker;
import net.minecraft.world.biome.Biomes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class BiomeUtils {
   private static Registry<Biome> biomeRegistry = getBiomeRegistry(Minecraft.getInstance().world);
   public static Biome PLAINS = getBiomeSafe(biomeRegistry, Biomes.PLAINS, () ->
   {
      return BiomeMaker.makePlainsBiome(false);
   });
   public static Biome SWAMP = getBiomeSafe(biomeRegistry, Biomes.SWAMP, () ->
   {
      return BiomeMaker.makeGenericSwampBiome(-0.2F, 0.1F, false);
   });
   public static Biome SWAMP_HILLS = getBiomeSafe(biomeRegistry, Biomes.SWAMP_HILLS, () ->
   {
      return BiomeMaker.makeGenericSwampBiome(-0.1F, 0.3F, true);
   });

   public static void onWorldChanged(World var0) {
      biomeRegistry = getBiomeRegistry(var0);
      PLAINS = getBiomeSafe(biomeRegistry, Biomes.PLAINS, () ->
      {
         return BiomeMaker.makePlainsBiome(false);
      });
      SWAMP = getBiomeSafe(biomeRegistry, Biomes.SWAMP, () ->
      {
         return BiomeMaker.makeGenericSwampBiome(-0.2F, 0.1F, false);
      });
      SWAMP_HILLS = getBiomeSafe(biomeRegistry, Biomes.SWAMP_HILLS, () ->
      {
         return BiomeMaker.makeGenericSwampBiome(-0.1F, 0.3F, true);
      });
   }

   private static Biome getBiomeSafe(Registry<Biome> registry, RegistryKey<Biome> biomeKey, Supplier<Biome> biomeDefault)
   {
      Biome biome = registry.getValueForKey(biomeKey);

      if (biome == null)
      {
         biome = biomeDefault.get();
      }

      return biome;
   }

   public static Registry<Biome> getBiomeRegistry(World worldIn)
   {
      return (Registry<Biome>)(worldIn != null ? worldIn.func_241828_r().getRegistry(Registry.BIOME_KEY) : WorldGenRegistries.BIOME);
   }

   public static Registry<Biome> getBiomeRegistry() {
      return biomeRegistry;
   }

   public static ResourceLocation getLocation(Biome var0) {
      return getBiomeRegistry().getKey(var0);
   }

   public static int getId(Biome var0) {
      return getBiomeRegistry().getId(var0);
   }

   public static int getId(ResourceLocation var0) {
      Biome var3 = method31410(var0);
      return getBiomeRegistry().getId(var3);
   }

   public static BiomeId getBiomeId(ResourceLocation var0) {
      return BiomeId.method30138(var0);
   }

   public static Biome method31410(ResourceLocation var0) {
      return getBiomeRegistry().getOrDefault(var0);
   }

   public static Set<ResourceLocation> method31411() {
      return getBiomeRegistry().method9190();
   }

   public static List<Biome> method31412() {
      return Lists.newArrayList(biomeRegistry);
   }

   public static List<BiomeId> method31413() {
      return method31414(method31411());
   }

   public static List<BiomeId> method31414(Collection<ResourceLocation> var0) {
      ArrayList var3 = new ArrayList();

      for (ResourceLocation var5 : var0) {
         BiomeId var6 = BiomeId.method30138(var5);
         if (var6 != null) {
            var3.add(var6);
         }
      }

      return var3;
   }

   public static Biome method31415(IBlockDisplayReader var0, BlockPos var1) {
      Biome var4 = PLAINS;
      if (!(var0 instanceof Class1664)) {
         if (var0 instanceof IWorldReader) {
            var4 = ((IWorldReader)var0).getBiome(var1);
         }
      } else {
         var4 = ((Class1664)var0).method7028(var1);
      }

      return var4;
   }
}
