package mapped;

import com.mojang.serialization.Codec;
import net.minecraft.util.math.BlockPos;

import java.util.Random;
import java.util.stream.Stream;

public class Class6278 extends Class6273<Class4725> {
   public Class6278(Codec<Class4725> var1) {
      super(var1);
   }

   public Stream<BlockPos> method19247(Random var1, Class4725 var2, BlockPos var3) {
      int var6 = var3.getX();
      int var7 = var3.getZ();
      int var8 = var1.nextInt(var1.nextInt(var1.nextInt(var2.field22391 - var2.field22390) + var2.field22389) + var2.field22389);
      return Stream.<BlockPos>of(new BlockPos(var6, var8, var7));
   }
}
