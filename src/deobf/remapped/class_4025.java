package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class class_4025 extends class_1710<class_9504> {
   public class_4025(Codec<class_9504> var1) {
      super(var1);
   }

   public Stream<BlockPos> method_18541(Random var1, class_9504 var2, BlockPos var3) {
      int var6 = var1.nextInt(8) + 4 + var3.getX();
      int var7 = var1.nextInt(8) + 4 + var3.getZ();
      return Stream.<BlockPos>of(new BlockPos(var6, var3.getY(), var7));
   }
}
