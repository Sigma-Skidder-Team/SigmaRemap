package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunk;

import java.util.Random;

public class Class6780 extends SurfaceBuilder<Class8278> {
   public Class6780(Codec<Class8278> var1) {
      super(var1);
   }

   public void buildSurface(
      Random var1,
      IChunk var2,
      Biome var3,
      int var4,
      int var5,
      int var6,
      double var7,
      BlockState var9,
      BlockState var10,
      int var11,
      long var12,
      Class8278 var14
   ) {
      if (!(var7 > 1.0)) {
         SurfaceBuilder.field29523.buildSurface(var1, var2, var3, var4, var5, var6, var7, var9, var10, var11, var12, SurfaceBuilder.field29509);
      } else {
         SurfaceBuilder.field29523.buildSurface(var1, var2, var3, var4, var5, var6, var7, var9, var10, var11, var12, SurfaceBuilder.field29510);
      }
   }
}
