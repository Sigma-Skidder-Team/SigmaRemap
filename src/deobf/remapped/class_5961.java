package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class class_5961 extends class_1710<class_611> {
   public class_5961(Codec<class_611> var1) {
      super(var1);
   }

   public Stream<BlockPos> method_27232(Random var1, class_611 var2, BlockPos var3) {
      return IntStream.range(0, var2.method_2873().method_15936(var1)).<BlockPos>mapToObj(var1x -> var3);
   }
}
