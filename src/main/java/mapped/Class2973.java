package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import net.minecraft.entity.EntityType;
import net.minecraft.util.SharedSeedRandom;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.biome.provider.BiomeProvider;
import net.minecraft.world.gen.ChunkGenerator;

import java.util.List;

public class Class2973 extends Structure<Class4712> {
   private static final List<MobSpawnInfo.Spawners> field18086 = ImmutableList.of(
      new MobSpawnInfo.Spawners(EntityType.BLAZE, 10, 2, 3),
      new MobSpawnInfo.Spawners(EntityType.ZOMBIFIED_PIGLIN, 5, 4, 4),
      new MobSpawnInfo.Spawners(EntityType.WITHER_SKELETON, 8, 5, 5),
      new MobSpawnInfo.Spawners(EntityType.SKELETON, 2, 5, 5),
      new MobSpawnInfo.Spawners(EntityType.MAGMA_CUBE, 3, 4, 4)
   );

   public Class2973(Codec<Class4712> var1) {
      super(var1);
   }

   public boolean method11361(ChunkGenerator var1, BiomeProvider var2, long var3, SharedSeedRandom var5, int var6, int var7, Biome var8, ChunkPos var9, Class4712 var10) {
      return var5.nextInt(5) < 2;
   }

   @Override
   public Class7072<Class4712> method11359() {
      return Class5449::new;
   }

   @Override
   public List<MobSpawnInfo.Spawners> method11374() {
      return field18086;
   }
}
