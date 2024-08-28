package mapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class Class6285 extends Class6273<Class4718> {
   public Class6285(Codec<Class4718> var1) {
      super(var1);
   }

   public Stream<BlockPos> method19247(Random var1, Class4718 var2, BlockPos var3) {
      int var6 = var1.nextInt(16) + var3.method8304();
      int var7 = var1.nextInt(16) + var3.method8306();
      int var8 = var3.getY();
      return Stream.<BlockPos>of(new BlockPos(var6, var8, var7));
   }
}
