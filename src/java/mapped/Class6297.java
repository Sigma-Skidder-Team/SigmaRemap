package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Class6297 extends Class6291<Class4718> {
   public Class6297(Codec<Class4718> var1) {
      super(var1);
   }

   public Heightmap.Type method19255(Class4718 var1) {
      return Heightmap.Type.field299;
   }

   public Stream<BlockPos> method19240(Class9010 var1, Random var2, Class4718 var3, BlockPos var4) {
      return IntStream.range(0, 16).<BlockPos>mapToObj(var5 -> {
         int var8 = var5 / 4;
         int var9 = var5 % 4;
         int var10 = var8 * 4 + 1 + var2.nextInt(3) + var4.getX();
         int var11 = var9 * 4 + 1 + var2.nextInt(3) + var4.getZ();
         int var12 = var1.method33296(this.method19255(var3), var10, var11);
         return new BlockPos(var10, var12, var11);
      });
   }
}
