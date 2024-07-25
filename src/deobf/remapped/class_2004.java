package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class class_2004 extends class_5557<class_9504> {
   public class_2004(Codec<class_9504> var1) {
      super(var1);
   }

   public class_3801 method_9313(class_9504 var1) {
      return class_3801.field_18595;
   }

   public Stream<BlockPos> method_9314(class_6680 var1, Random var2, class_9504 var3, BlockPos var4) {
      return IntStream.range(0, 16).<BlockPos>mapToObj(var5 -> {
         int var8 = var5 / 4;
         int var9 = var5 % 4;
         int var10 = var8 * 4 + 1 + var2.nextInt(3) + var4.method_12173();
         int var11 = var9 * 4 + 1 + var2.nextInt(3) + var4.method_12185();
         int var12 = var1.method_30648(this.method_9313(var3), var10, var11);
         return new BlockPos(var10, var12, var11);
      });
   }
}
