package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;

import java.util.Random;
import java.util.stream.Stream;

public class Class6303 extends Class6272<Class4718> {
   public Class6303(Codec<Class4718> var1) {
      super(var1);
   }

   public Stream<BlockPos> method19240(Class9010 var1, Random var2, Class4718 var3, BlockPos var4) {
      if (var2.nextInt(700) == 0) {
         int var7 = var2.nextInt(16) + var4.getX();
         int var8 = var2.nextInt(16) + var4.getZ();
         int var9 = var1.method33296(Heightmap.Type.field299, var7, var8);
         if (var9 > 0) {
            int var10 = var9 + 3 + var2.nextInt(7);
            return Stream.<BlockPos>of(new BlockPos(var7, var10, var8));
         }
      }

      return Stream.<BlockPos>empty();
   }
}
