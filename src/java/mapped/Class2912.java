package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.ISeedReader;

import java.util.Random;

public class Class2912 extends Class2898<Class4712> {
   private static final BlockPos field17996 = new BlockPos(8, 3, 8);
   private static final ChunkPos field17997 = new ChunkPos(field17996);

   public Class2912(Codec<Class4712> var1) {
      super(var1);
   }

   private static int method11248(int var0, int var1, int var2, int var3) {
      return Math.max(Math.abs(var0 - var2), Math.abs(var1 - var3));
   }

   public boolean method11213(ISeedReader var1, ChunkGenerator var2, Random var3, BlockPos var4, Class4712 var5) {
      ChunkPos var8 = new ChunkPos(var4);
      if (method11248(var8.x, var8.z, field17997.x, field17997.z) > 1) {
         return true;
      } else {
         BlockPos.Mutable var9 = new BlockPos.Mutable();

         for (int var10 = var8.getZ(); var10 <= var8.method24359(); var10++) {
            for (int var11 = var8.getX(); var11 <= var8.method24358(); var11++) {
               if (method11248(field17996.getX(), field17996.getZ(), var11, var10) <= 16) {
                  var9.method8372(var11, field17996.getY(), var10);
                  if (!var9.equals(field17996)) {
                     var1.setBlockState(var9, Blocks.STONE.method11579(), 2);
                  } else {
                     var1.setBlockState(var9, Blocks.field36399.method11579(), 2);
                  }
               }
            }
         }

         return true;
      }
   }
}
