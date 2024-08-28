package mapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Class6280 extends Class6273<Class4715> {
   public Class6280(Codec<Class4715> var1) {
      super(var1);
   }

   public Stream<BlockPos> method19247(Random var1, Class4715 var2, BlockPos var3) {
      return IntStream.range(0, var1.nextInt(var1.nextInt(var2.method14807().method27633(var1)) + 1)).<BlockPos>mapToObj(var2x -> {
         int var5 = var1.nextInt(16) + var3.method8304();
         int var6 = var1.nextInt(16) + var3.method8306();
         int var7 = var1.nextInt(120) + 4;
         return new BlockPos(var5, var7, var6);
      });
   }
}
