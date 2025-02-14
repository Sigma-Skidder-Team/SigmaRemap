package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;

import java.util.Random;
import java.util.stream.Stream;

public class Class6299 extends Class6272<Class4722> {
   public Class6299(Codec<Class4722> var1) {
      super(var1);
   }

   public Stream<BlockPos> method19240(Class9010 var1, Random var2, Class4722 var3, BlockPos var4) {
      if (var2.nextInt(var3.field22381) != 0) {
         return Stream.<BlockPos>empty();
      } else {
         int var7 = var2.nextInt(16) + var4.getX();
         int var8 = var2.nextInt(16) + var4.getZ();
         int var9 = var2.nextInt(var1.method33297());
         return Stream.<BlockPos>of(new BlockPos(var7, var9, var8));
      }
   }
}
