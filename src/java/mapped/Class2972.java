package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.ChunkPos;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.provider.BiomeProvider;

public class Class2972 extends Structure<Class4735> {
   public Class2972(Codec<Class4735> var1) {
      super(var1);
   }

   public boolean method11361(ChunkGenerator var1, BiomeProvider var2, long var3, Class2420 var5, int var6, int var7, Biome var8, ChunkPos var9, Class4735 var10) {
      var5.method10373(var3, var6, var7);
      double var13 = (double)var10.field22426;
      return var5.nextDouble() < var13;
   }

   @Override
   public Class7072<Class4735> method11359() {
      return Class5453::new;
   }
}
