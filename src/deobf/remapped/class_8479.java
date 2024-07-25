package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class class_8479 extends class_1710<class_611> {
   public class_8479(Codec<class_611> var1) {
      super(var1);
   }

   public Stream<BlockPos> method_39059(Random var1, class_611 var2, BlockPos var3) {
      return IntStream.range(0, var1.nextInt(var1.nextInt(var2.method_2873().method_15936(var1)) + 1)).<BlockPos>mapToObj(var2x -> {
         int var5 = var1.nextInt(16) + var3.getX();
         int var6 = var1.nextInt(16) + var3.getZ();
         int var7 = var1.nextInt(120) + 4;
         return new BlockPos(var5, var7, var6);
      });
   }
}
