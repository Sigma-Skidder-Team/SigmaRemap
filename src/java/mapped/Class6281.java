package mapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Class6281 extends Class6273<Class4715> {
   public Class6281(Codec<Class4715> var1) {
      super(var1);
   }

   public Stream<BlockPos> method19247(Random var1, Class4715 var2, BlockPos var3) {
      return IntStream.range(0, var2.method14807().method27633(var1)).<BlockPos>mapToObj(var1x -> var3);
   }
}
