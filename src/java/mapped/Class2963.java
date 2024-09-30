package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.SharedSeedRandom;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.BiomeProvider;

public class Class2963 extends Structure<Class4728> {
   public Class2963(Codec<Class4728> var1) {
      super(var1);
   }

   public boolean method11361(ChunkGenerator var1, BiomeProvider var2, long var3, SharedSeedRandom var5, int var6, int var7, Biome var8, ChunkPos var9, Class4728 var10) {
      var5.method10374(var3, var6, var7, 10387320);
      return var5.nextFloat() < var10.field22399;
   }

   @Override
   public Class7072<Class4728> method11359() {
      return Class5448::new;
   }
}
