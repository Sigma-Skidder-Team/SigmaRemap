package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class class_5471 extends class_1710<class_9865> {
   public class_5471(Codec<class_9865> var1) {
      super(var1);
   }

   public Stream<BlockPos> method_24884(Random var1, class_9865 var2, BlockPos var3) {
      int var6 = var2.field_49911 + (!(var1.nextFloat() < var2.field_49912) ? 0 : var2.field_49913);
      return IntStream.range(0, var6).<BlockPos>mapToObj(var1x -> var3);
   }
}
