package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class Class3474 extends Class3472 {
   private static String[] field19324;

   public Class3474(AbstractBlock var1) {
      super(var1);
   }

   @Override
   public void method11512(BlockState var1, World var2, BlockPos var3, Random var4) {
      super.method11512(var1, var2, var3, var4);
      if (var4.nextInt(10) == 0) {
         var2.addParticle(
            ParticleTypes.field34087,
            (double)var3.getX() + var4.nextDouble(),
            (double)var3.getY() + 1.1,
            (double)var3.getZ() + var4.nextDouble(),
            0.0,
            0.0,
            0.0
         );
      }
   }
}
