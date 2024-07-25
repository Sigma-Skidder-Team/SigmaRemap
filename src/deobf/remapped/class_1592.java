package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class class_1592 extends class_1710<class_9504> {
   public class_1592(Codec<class_9504> var1) {
      super(var1);
   }

   public Stream<BlockPos> method_7147(Random var1, class_9504 var2, BlockPos var3) {
      int var6 = 3 + var1.nextInt(6);
      return IntStream.range(0, var6).<BlockPos>mapToObj(var2x -> {
         int var5 = var1.nextInt(16) + var3.method_12173();
         int var6x = var1.nextInt(16) + var3.method_12185();
         int var7 = var1.nextInt(28) + 4;
         return new BlockPos(var5, var7, var6x);
      });
   }
}
