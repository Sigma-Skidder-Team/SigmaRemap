package net.minecraft.world.biome.provider;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.biome.Biome;

import java.util.Random;
import java.util.Set;
import java.util.function.Predicate;
import java.util.function.Supplier;
import javax.annotation.Nullable;

public class SingleBiomeProvider extends BiomeProvider {
   public static final Codec<SingleBiomeProvider> CODEC = Biome.BIOME_CODEC.fieldOf("biome").xmap(SingleBiomeProvider::new, var0 -> var0.field9183).stable().codec();
   private final Supplier<Biome> field9183;

   public SingleBiomeProvider(Biome var1) {
      this(() -> var1);
   }

   public SingleBiomeProvider(Supplier<Biome> var1) {
      super(ImmutableList.of(var1.get()));
      this.field9183 = var1;
   }

   @Override
   public Codec<? extends BiomeProvider> getBiomeProviderCodec() {
      return CODEC;
   }

   @Override
   public BiomeProvider getBiomeProvider(long var1) {
      return this;
   }

   @Override
   public Biome getNoiseBiome(int var1, int var2, int var3) {
      return this.field9183.get();
   }

   @Nullable
   @Override
   public BlockPos findBiomePosition(int x, int y, int z, int radius, int increment, Predicate<Biome> biomes, Random rand, boolean findClosest) {
      if (!biomes.test(this.field9183.get())) {
         return null;
      } else {
         return !findClosest
            ? new BlockPos(x - radius + rand.nextInt(radius * 2 + 1), y, z - radius + rand.nextInt(radius * 2 + 1))
            : new BlockPos(x, y, z);
      }
   }

   @Override
   public Set<Biome> method7202(int xIn, int var2, int zIn, int radius) {
      return Sets.newHashSet(new Biome[]{this.field9183.get()});
   }
}
