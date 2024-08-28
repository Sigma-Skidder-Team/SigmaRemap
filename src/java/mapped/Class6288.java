package mapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Class6288 extends Class6273<Class4718> {
   public Class6288(Codec<Class4718> var1) {
      super(var1);
   }

   public Stream<BlockPos> method19247(Random var1, Class4718 var2, BlockPos var3) {
      int var6 = 3 + var1.nextInt(6);
      return IntStream.range(0, var6).<BlockPos>mapToObj(var2x -> {
         int var5 = var1.nextInt(16) + var3.method8304();
         int var6x = var1.nextInt(16) + var3.method8306();
         int var7 = var1.nextInt(28) + 4;
         return new BlockPos(var5, var7, var6x);
      });
   }
}
