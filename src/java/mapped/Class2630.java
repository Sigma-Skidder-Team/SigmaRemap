package mapped;

import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;

public class Class2630 extends Class2628 {
   private static String[] field16940;
   private final TurtleEntity field16941;

   public Class2630(TurtleEntity var1, double var2) {
      super(var1, var2, 16);
      this.field16941 = var1;
   }

   @Override
   public boolean method10803() {
      return this.field16941.method5045() && TurtleEntity.method5056(this.field16941).method8317(this.field16941.getPositionVec(), 9.0) ? super.method10803() : false;
   }

   @Override
   public boolean method10806() {
      return super.method10806() && this.field16941.method5045() && TurtleEntity.method5056(this.field16941).method8317(this.field16941.getPositionVec(), 9.0);
   }

   @Override
   public void method10805() {
      super.method10805();
      BlockPos var3 = this.field16941.getPosition();
      if (!this.field16941.isInWater() && this.method10838()) {
         if (TurtleEntity.method5059(this.field16941) >= 1) {
            if (TurtleEntity.method5059(this.field16941) > 200) {
               World var4 = this.field16941.world;
               var4.playSound((PlayerEntity)null, var3, SoundEvents.field27172, SoundCategory.field14732, 0.3F, 0.9F + var4.rand.nextFloat() * 0.2F);
               var4.setBlockState(
                  this.field16933.up(),
                  Blocks.field36964.getDefaultState().with(Class3441.field19244, Integer.valueOf(TurtleEntity.method5061(this.field16941).nextInt(4) + 1)),
                  3
               );
               TurtleEntity.method5062(this.field16941, false);
               TurtleEntity.method5060(this.field16941, false);
               this.field16941.method4504(600);
            }
         } else {
            TurtleEntity.method5060(this.field16941, true);
         }

         if (this.field16941.method5047()) {
            TurtleEntity.method5063(this.field16941);
         }
      }
   }

   @Override
   public boolean method10840(IWorldReader var1, BlockPos var2) {
      return var1.method7007(var2.up()) ? Class3441.method12115(var1, var2) : false;
   }
}
