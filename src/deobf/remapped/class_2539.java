package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class class_2539 extends class_5788<class_9504> {
   public class_2539(Codec<class_9504> var1) {
      super(var1);
   }

   public Stream<BlockPos> method_11567(class_6680 var1, Random var2, class_9504 var3, BlockPos var4) {
      int var7 = var2.nextInt(var4.method_12165() + 32);
      return Stream.<BlockPos>of(new BlockPos(var4.method_12173(), var7, var4.method_12185()));
   }
}
