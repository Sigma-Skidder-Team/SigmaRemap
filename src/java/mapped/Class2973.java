package mapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import net.minecraft.entity.EntityType;
import net.minecraft.util.SharedSeedRandom;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.BiomeProvider;

import java.util.List;

public class Class2973 extends Structure<Class4712> {
   private static final List<MobSpawnInfoSpawners> field18086 = ImmutableList.of(
      new MobSpawnInfoSpawners(EntityType.field41010, 10, 2, 3),
      new MobSpawnInfoSpawners(EntityType.field41110, 5, 4, 4),
      new MobSpawnInfoSpawners(EntityType.field41103, 8, 5, 5),
      new MobSpawnInfoSpawners(EntityType.field41078, 2, 5, 5),
      new MobSpawnInfoSpawners(EntityType.field41049, 3, 4, 4)
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
   public List<MobSpawnInfoSpawners> method11374() {
      return field18086;
   }
}
