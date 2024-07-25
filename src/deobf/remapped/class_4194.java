package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class class_4194 extends class_5788<class_3966> {
   public class_4194(Codec<class_3966> var1) {
      super(var1);
   }

   public Stream<BlockPos> method_19504(class_6680 var1, Random var2, class_3966 var3, BlockPos var4) {
      if (var2.nextInt(var3.field_19208) != 0) {
         return Stream.<BlockPos>empty();
      } else {
         int var7 = var2.nextInt(16) + var4.getX();
         int var8 = var2.nextInt(16) + var4.method_12185();
         int var9 = var2.nextInt(var1.method_30645());
         return Stream.<BlockPos>of(new BlockPos(var7, var9, var8));
      }
   }
}
