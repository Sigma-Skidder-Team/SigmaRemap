package mapped;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Direction;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class Class3417 extends Block {
   private static String[] field19120;

   public Class3417(Properties var1) {
      super(var1);
   }

   @Override
   public void onBlockAdded(BlockState var1, World var2, BlockPos var3, BlockState var4, boolean var5) {
      if (var2.getDimensionType().isUltrawarm()) {
         var2.setBlockState(var3, Blocks.field36452.getDefaultState(), 3);
         var2.playEvent(2009, var3, 0);
         var2.playSound((PlayerEntity)null, var3, SoundEvents.field26582, Class2266.field14732, 1.0F, (1.0F + var2.method6814().nextFloat() * 0.2F) * 0.7F);
      }
   }

   @Override
   public void animateTick(BlockState var1, World var2, BlockPos var3, Random var4) {
      Direction var7 = Direction.getRandomDirection(var4);
      if (var7 != Direction.UP) {
         BlockPos var8 = var3.offset(var7);
         BlockState var9 = var2.getBlockState(var8);
         if (!var1.isSolid() || !var9.method23454(var2, var8, var7.getOpposite())) {
            double var10 = (double)var3.getX();
            double var12 = (double)var3.getY();
            double var14 = (double)var3.getZ();
            if (var7 != Direction.DOWN) {
               var12 += var4.nextDouble() * 0.8;
               if (var7.getAxis() != Direction.Axis.X) {
                  var10 += var4.nextDouble();
                  if (var7 != Direction.SOUTH) {
                     var14 += 0.05;
                  } else {
                     var14++;
                  }
               } else {
                  var14 += var4.nextDouble();
                  if (var7 != Direction.EAST) {
                     var10 += 0.05;
                  } else {
                     var10++;
                  }
               }
            } else {
               var12 -= 0.05;
               var10 += var4.nextDouble();
               var14 += var4.nextDouble();
            }

            var2.addParticle(ParticleTypes.field34060, var10, var12, var14, 0.0, 0.0, 0.0);
         }
      }
   }
}
