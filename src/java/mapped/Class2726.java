package mapped;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.SquidEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;

public class Class2726 extends Class2595 {
   private static String[] field17230;
   private int field17231;
   public final SquidEntity field17232;

   public Class2726(SquidEntity var1) {
      this.field17232 = var1;
   }

   @Override
   public boolean method10803() {
      LivingEntity var3 = this.field17232.method3014();
      return this.field17232.isInWater() && var3 != null ? this.field17232.getDistanceSq(var3) < 100.0 : false;
   }

   @Override
   public void method10804() {
      this.field17231 = 0;
   }

   @Override
   public void method10805() {
      this.field17231++;
      LivingEntity var3 = this.field17232.method3014();
      if (var3 != null) {
         Vector3d var4 = new Vector3d(
            this.field17232.getPosX() - var3.getPosX(),
            this.field17232.getPosY() - var3.getPosY(),
            this.field17232.getPosZ() - var3.getPosZ()
         );
         BlockState var5 = this.field17232
            .world
            .getBlockState(
               new BlockPos(
                  this.field17232.getPosX() + var4.x,
                  this.field17232.getPosY() + var4.y,
                  this.field17232.getPosZ() + var4.z
               )
            );
         FluidState var6 = this.field17232
            .world
            .getFluidState(
               new BlockPos(
                  this.field17232.getPosX() + var4.x,
                  this.field17232.getPosY() + var4.y,
                  this.field17232.getPosZ() + var4.z
               )
            );
         if (var6.method23486(FluidTags.field40469) || var5.isAir()) {
            double var7 = var4.length();
            if (var7 > 0.0) {
               var4.method11333();
               float var9 = 3.0F;
               if (var7 > 5.0) {
                  var9 = (float)((double)var9 - (var7 - 5.0) / 5.0);
               }

               if (var9 > 0.0F) {
                  var4 = var4.scale((double)var9);
               }
            }

            if (var5.isAir()) {
               var4 = var4.method11337(0.0, var4.y, 0.0);
            }

            this.field17232.method4840((float)var4.x / 20.0F, (float)var4.y / 20.0F, (float)var4.z / 20.0F);
         }

         if (this.field17231 % 10 == 5) {
            this.field17232
               .world
               .addParticle(ParticleTypes.field34052, this.field17232.getPosX(), this.field17232.getPosY(), this.field17232.getPosZ(), 0.0, 0.0, 0.0);
         }
      }
   }
}
