package remapped;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

public class class_8323 extends class_1710<class_611> {
   public class_8323(Codec<class_611> var1) {
      super(var1);
   }

   public Stream<BlockPos> method_38355(Random var1, class_611 var2, BlockPos var3) {
      ArrayList var6 = Lists.newArrayList();

      for (int var7 = 0; var7 < var1.nextInt(var1.nextInt(var2.method_2873().method_15936(var1)) + 1) + 1; var7++) {
         int var8 = var1.nextInt(16) + var3.getX();
         int var9 = var1.nextInt(16) + var3.method_12185();
         int var10 = var1.nextInt(120) + 4;
         var6.add(new BlockPos(var8, var10, var9));
      }

      return var6.stream();
   }
}
