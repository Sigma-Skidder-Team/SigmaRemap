package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;

import java.util.Random;
import java.util.stream.Stream;

public class Class6289 extends Class6272<Class4718> {
   public Class6289(Codec<Class4718> var1) {
      super(var1);
   }

   public Stream<BlockPos> method19240(Class9010 var1, Random var2, Class4718 var3, BlockPos var4) {
      int var7 = var1.method33298();
      int var8 = var7 - 5 + var2.nextInt(10);
      return Stream.<BlockPos>of(new BlockPos(var4.getX(), var8, var4.getZ()));
   }
}
