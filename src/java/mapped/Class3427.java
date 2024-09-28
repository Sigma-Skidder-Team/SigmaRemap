package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class Class3427 extends Block {
   private static String[] field19178;

   public Class3427(Properties var1) {
      super(var1);
   }

   @Override
   public void animateTick(BlockState var1, World var2, BlockPos var3, Random var4) {
      if (var4.nextInt(5) == 0) {
         Direction var7 = Direction.getRandomDirection(var4);
         if (var7 != Direction.UP) {
            BlockPos var8 = var3.offset(var7);
            BlockState var9 = var2.getBlockState(var8);
            if (!var1.method23410() || !var9.method23454(var2, var8, var7.getOpposite())) {
               double var10 = var7.getXOffset() != 0 ? 0.5 + (double)var7.getXOffset() * 0.6 : var4.nextDouble();
               double var12 = var7.getYOffset() != 0 ? 0.5 + (double)var7.getYOffset() * 0.6 : var4.nextDouble();
               double var14 = var7.getZOffset() != 0 ? 0.5 + (double)var7.getZOffset() * 0.6 : var4.nextDouble();
               var2.addParticle(
                  ParticleTypes.field34115, (double)var3.getX() + var10, (double)var3.getY() + var12, (double)var3.getZ() + var14, 0.0, 0.0, 0.0
               );
            }
         }
      }
   }
}
