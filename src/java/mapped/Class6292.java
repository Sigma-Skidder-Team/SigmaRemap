package mapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public abstract class Class6292<DC extends Class4716> extends Class6291<DC> {
   public Class6292(Codec<DC> var1) {
      super(var1);
   }

   @Override
   public Stream<BlockPos> method19240(Class9010 var1, Random var2, DC var3, BlockPos var4) {
      int var7 = var4.getX();
      int var8 = var4.getZ();
      int var9 = var1.method33296(this.method19255((DC)var3), var7, var8);
      return var9 <= 0 ? Stream.<BlockPos>of() : Stream.<BlockPos>of(new BlockPos(var7, var9, var8));
   }
}
