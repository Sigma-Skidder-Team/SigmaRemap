package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.BiomeProvider;

public class Class2962 extends Structure<Class4712> {
   public Class2962(Codec<Class4712> var1) {
      super(var1);
   }

   @Override
   public Class7072<Class4712> method11359() {
      return Class5447::new;
   }

   public boolean method11361(ChunkGenerator var1, BiomeProvider var2, long var3, Class2420 var5, int var6, int var7, Biome var8, ChunkPos var9, Class4712 var10) {
      return var1.method17830(new ChunkPos(var6, var7));
   }
}
