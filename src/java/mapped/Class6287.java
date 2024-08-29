package mapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class Class6287 extends Class6273<Class4723> {
   public Class6287(Codec<Class4723> var1) {
      super(var1);
   }

   public Stream<BlockPos> method19247(Random var1, Class4723 var2, BlockPos var3) {
      int var6 = var2.field22383;
      int var7 = var2.field22384;
      int var8 = var3.getX();
      int var9 = var3.getZ();
      int var10 = var1.nextInt(var7) + var1.nextInt(var7) - var7 + var6;
      return Stream.<BlockPos>of(new BlockPos(var8, var10, var9));
   }
}
