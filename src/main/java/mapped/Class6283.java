package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Class6283 extends Class6273<Class4721> {
   public Class6283(Codec<Class4721> var1) {
      super(var1);
   }

   public Stream<BlockPos> method19247(Random var1, Class4721 var2, BlockPos var3) {
      int var6 = var2.field22377 + (!(var1.nextFloat() < var2.field22378) ? 0 : var2.field22379);
      return IntStream.range(0, var6).<BlockPos>mapToObj(var1x -> var3);
   }
}
