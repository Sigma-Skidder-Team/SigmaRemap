package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class class_5374 extends class_1710<class_3891> {
   public class_5374(Codec<class_3891> var1) {
      super(var1);
   }

   public Stream<BlockPos> method_24508(Random var1, class_3891 var2, BlockPos var3) {
      int var6 = var2.field_18932;
      int var7 = var2.field_18934;
      int var8 = var3.getX();
      int var9 = var3.method_12185();
      int var10 = var1.nextInt(var7) + var1.nextInt(var7) - var7 + var6;
      return Stream.<BlockPos>of(new BlockPos(var8, var10, var9));
   }
}
