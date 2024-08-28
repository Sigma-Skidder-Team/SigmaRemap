package mapped;

import com.google.common.collect.Lists;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

public class Class6274 extends Class6273<Class4715> {
   public Class6274(Codec<Class4715> var1) {
      super(var1);
   }

   public Stream<BlockPos> method19247(Random var1, Class4715 var2, BlockPos var3) {
      ArrayList var6 = Lists.newArrayList();

      for (int var7 = 0; var7 < var1.nextInt(var1.nextInt(var2.method14807().method27633(var1)) + 1) + 1; var7++) {
         int var8 = var1.nextInt(16) + var3.method8304();
         int var9 = var1.nextInt(16) + var3.method8306();
         int var10 = var1.nextInt(120) + 4;
         var6.add(new BlockPos(var8, var10, var9));
      }

      return var6.stream();
   }
}
