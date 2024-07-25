package remapped;

import com.mojang.serialization.Codec;
import java.util.BitSet;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class class_555 extends class_5788<class_6686> {
   public class_555(Codec<class_6686> var1) {
      super(var1);
   }

   public Stream<BlockPos> method_2663(class_6680 var1, Random var2, class_6686 var3, BlockPos var4) {
      class_2034 var7 = new class_2034(var4);
      BitSet var8 = var1.method_30646(var7, var3.field_34551);
      return IntStream.range(0, var8.length()).filter(var3x -> var8.get(var3x) && var2.nextFloat() < var3.field_34550).<BlockPos>mapToObj(var1x -> {
         int var4x = var1x & 15;
         int var5 = var1x >> 4 & 15;
         int var6 = var1x >> 8;
         return new BlockPos(var7.method_9535() + var4x, var6, var7.method_9545() + var5);
      });
   }
}
