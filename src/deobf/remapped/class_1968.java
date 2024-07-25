package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class class_1968 extends class_5788<class_3966> {
   public class_1968(Codec<class_3966> var1) {
      super(var1);
   }

   public Stream<BlockPos> method_9066(class_6680 var1, Random var2, class_3966 var3, BlockPos var4) {
      if (var2.nextInt(var3.field_19208 / 10) == 0) {
         int var7 = var2.nextInt(16) + var4.getX();
         int var8 = var2.nextInt(16) + var4.getZ();
         int var9 = var2.nextInt(var2.nextInt(var1.method_30645() - 8) + 8);
         if (var9 < var1.method_30647() || var2.nextInt(var3.field_19208 / 8) == 0) {
            return Stream.<BlockPos>of(new BlockPos(var7, var9, var8));
         }
      }

      return Stream.<BlockPos>empty();
   }
}
