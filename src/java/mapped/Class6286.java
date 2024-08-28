package mapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class Class6286 extends Class6273<Class4722> {
   public Class6286(Codec<Class4722> var1) {
      super(var1);
   }

   public Stream<BlockPos> method19247(Random var1, Class4722 var2, BlockPos var3) {
      return !(var1.nextFloat() < 1.0F / (float)var2.field22381) ? Stream.<BlockPos>empty() : Stream.<BlockPos>of(var3);
   }
}
