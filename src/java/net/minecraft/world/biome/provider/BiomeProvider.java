package net.minecraft.world.biome.provider;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import mapped.*;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeManager;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class BiomeProvider implements BiomeManager.IBiomeReader {
   public static final Codec<BiomeProvider> CODEC = Registry.BIOME_PROVIDER_CODEC.dispatchStable(BiomeProvider::getBiomeProviderCodec, Function.identity());
   public final Map<Structure<?>, Boolean> hasStructureCache = Maps.newHashMap();
   public final Set<BlockState> topBlocksCache = Sets.newHashSet();
   public final List<Biome> biomes;

   public BiomeProvider(Stream<Supplier<Biome>> var1) {
      this(var1.map(Supplier::get).collect(ImmutableList.toImmutableList()));
   }

   public BiomeProvider(List<Biome> var1) {
      this.biomes = var1;
   }

   public abstract Codec<? extends BiomeProvider> getBiomeProviderCodec();

   public abstract BiomeProvider getBiomeProvider(long var1);

   public List<Biome> getBiomes() {
      return this.biomes;
   }

   public Set<Biome> method7202(int xIn, int yIn, int zIn, int radius) {
      int i = xIn - radius >> 2;
      int j = yIn - radius >> 2;
      int k = zIn - radius >> 2;
      int l = xIn + radius >> 2;
      int i1 = yIn + radius >> 2;
      int j1 = zIn + radius >> 2;
      int k1 = l - i + 1;
      int l1 = i1 - j + 1;
      int i2 = j1 - k + 1;
      Set<Biome> set = Sets.newHashSet();

      for (int j2 = 0; j2 < i2; ++j2)
      {
         for (int k2 = 0; k2 < k1; ++k2)
         {
            for (int l2 = 0; l2 < l1; ++l2)
            {
               int i3 = i + k2;
               int j3 = j + l2;
               int k3 = k + j2;
               set.add(this.getNoiseBiome(i3, j3, k3));
            }
         }
      }

      return set;
   }

   @Nullable
   public BlockPos findBiomePosition(int var1, int var2, int var3, int var4, Predicate<Biome> var5, Random var6) {
      return this.findBiomePosition(var1, var2, var3, var4, 1, var5, var6, false);
   }

   @Nullable
   public BlockPos findBiomePosition(int x, int y, int z, int radius, int increment, Predicate<Biome> biomes, Random rand, boolean findClosest) {
      int i = x >> 2;
      int j = z >> 2;
      int k = radius >> 2;
      int l = y >> 2;
      BlockPos blockpos = null;
      int i1 = 0;
      int j1 = findClosest ? 0 : k;

      for (int k1 = j1; k1 <= k; k1 += increment)
      {
         for (int l1 = -k1; l1 <= k1; l1 += increment)
         {
            boolean flag = Math.abs(l1) == k1;

            for (int i2 = -k1; i2 <= k1; i2 += increment)
            {
               if (findClosest)
               {
                  boolean flag1 = Math.abs(i2) == k1;

                  if (!flag1 && !flag)
                  {
                     continue;
                  }
               }

               int k2 = i + i2;
               int j2 = j + l1;

               if (biomes.test(this.getNoiseBiome(k2, l, j2)))
               {
                  if (blockpos == null || rand.nextInt(i1 + 1) == 0)
                  {
                     blockpos = new BlockPos(k2 << 2, y, j2 << 2);

                     if (findClosest)
                     {
                        return blockpos;
                     }
                  }

                  ++i1;
               }
            }
         }
      }

      return blockpos;
   }

   public boolean hasStructure(Structure<?> structureIn) {
      return this.hasStructureCache.computeIfAbsent(structureIn, var1x -> this.biomes.stream().anyMatch(var1xx -> var1xx.getGenerationSettings().hasStructure(var1x)));
   }

   public Set<BlockState> getSurfaceBlocks() {
      if (this.topBlocksCache.isEmpty()) {
         for (Biome biome : this.biomes) {
            this.topBlocksCache.add(biome.getGenerationSettings().getSurfaceBuilderConfig().getTop());
         }
      }

      return this.topBlocksCache;
   }

   static {
      Registry.register(Registry.BIOME_PROVIDER_CODEC, "fixed", SingleBiomeProvider.CODEC);
      Registry.register(Registry.BIOME_PROVIDER_CODEC, "multi_noise", NetherBiomeProvider.CODEC);
      Registry.register(Registry.BIOME_PROVIDER_CODEC, "checkerboard", CheckerboardBiomeProvider.CODEC);
      Registry.register(Registry.BIOME_PROVIDER_CODEC, "vanilla_layered", OverworldBiomeProvider.CODEC);
      Registry.register(Registry.BIOME_PROVIDER_CODEC, "the_end", EndBiomeProvider.CODEC);
   }
}
