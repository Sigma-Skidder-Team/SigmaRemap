package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Class6993 extends Class6991 {
   private static String[] field30263;
   private BlockPos field30266;

   public Class6993(MobEntity var1, World var2) {
      super(var1, var2);
   }

   @Override
   public Class8238 method21651(BlockPos var1, int var2) {
      this.field30266 = var1;
      return super.method21651(var1, var2);
   }

   @Override
   public Class8238 method21652(Entity var1, int var2) {
      this.field30266 = var1.getPosition();
      return super.method21652(var1, var2);
   }

   @Override
   public boolean method21655(Entity var1, double var2) {
      Class8238 var6 = this.method21652(var1, 0);
      if (var6 == null) {
         this.field30266 = var1.getPosition();
         this.field30246 = var2;
         return true;
      } else {
         return this.method21656(var6, var2);
      }
   }

   @Override
   public void method21658() {
      if (this.method21664()) {
         if (this.field30266 != null) {
            if (!this.field30266.withinDistance(this.field30243.getPositionVec(), (double)this.field30243.getWidth())
               && (
                  !(this.field30243.getPosY() > (double)this.field30266.getY())
                     || !new BlockPos((double)this.field30266.getX(), this.field30243.getPosY(), (double)this.field30266.getZ())
                        .withinDistance(this.field30243.getPositionVec(), (double)this.field30243.getWidth())
               )) {
               this.field30243
                  .method4228()
                  .method20813(
                     (double)this.field30266.getX(), (double)this.field30266.getY(), (double)this.field30266.getZ(), this.field30246
                  );
            } else {
               this.field30266 = null;
            }
         }
      } else {
         super.method21658();
      }
   }
}
