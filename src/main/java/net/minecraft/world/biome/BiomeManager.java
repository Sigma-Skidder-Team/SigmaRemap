package net.minecraft.world.biome;

import com.google.common.hash.Hashing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.biome.provider.BiomeProvider;

public class BiomeManager {
    private final IBiomeReader reader;
   private final long seed;
   private final IBiomeMagnifier magnifier;

   public BiomeManager(IBiomeReader var1, long var2, IBiomeMagnifier var4) {
      this.reader = var1;
      this.seed = var2;
      this.magnifier = var4;
   }

   public static long getHashedSeed(long var0) {
      return Hashing.sha256().hashLong(var0).asLong();
   }

   public BiomeManager copyWithProvider(BiomeProvider var1) {
      return new BiomeManager(var1, this.seed, this.magnifier);
   }

   public Biome getBiome(BlockPos var1) {
      return this.magnifier.getBiome(this.seed, var1.getX(), var1.getY(), var1.getZ(), this.reader);
   }

   public Biome getBiomeAtPosition(double var1, double var3, double var5) {
      int var9 = MathHelper.floor(var1) >> 2;
      int var10 = MathHelper.floor(var3) >> 2;
      int var11 = MathHelper.floor(var5) >> 2;
      return this.getBiomeAtPosition(var9, var10, var11);
   }

   public Biome getBiomeAtPosition(BlockPos var1) {
      int var4 = var1.getX() >> 2;
      int var5 = var1.getY() >> 2;
      int var6 = var1.getZ() >> 2;
      return this.getBiomeAtPosition(var4, var5, var6);
   }

   public Biome getBiomeAtPosition(int var1, int var2, int var3) {
      return this.reader.getNoiseBiome(var1, var2, var3);
   }

   public interface IBiomeReader {
      Biome getNoiseBiome(int var1, int var2, int var3);
   }
}
