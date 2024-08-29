package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;

import java.util.Random;
import java.util.stream.Stream;

public class Class6296<DC extends Class4716> extends Class6291<DC> {
   public Class6296(Codec<DC> var1) {
      super(var1);
   }

   @Override
   public Class101 method19255(DC var1) {
      return Class101.field299;
   }

   @Override
   public Stream<BlockPos> method19240(Class9010 var1, Random var2, DC var3, BlockPos var4) {
      int var7 = var4.getX();
      int var8 = var4.getZ();
      int var9 = var1.method33296(this.method19255((DC)var3), var7, var8);
      return var9 != 0 ? Stream.<BlockPos>of(new BlockPos(var7, var2.nextInt(var9 * 2), var8)) : Stream.<BlockPos>of();
   }
}
