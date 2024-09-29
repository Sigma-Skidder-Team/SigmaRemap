package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.BiomeProvider;

public class Class2970 extends Class2967 {
   public Class2970(Codec<Class4700> var1) {
      super(var1, 33, false, false);
   }

   public boolean method11361(ChunkGenerator var1, BiomeProvider var2, long var3, Class2420 var5, int var6, int var7, Biome var8, ChunkPos var9, Class4700 var10) {
      return var5.nextInt(5) >= 2;
   }
}
