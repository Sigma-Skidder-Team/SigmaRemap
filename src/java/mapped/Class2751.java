package mapped;

import net.minecraft.util.math.BlockPos;

public class Class2751 extends Class2747 {
   private static String[] field17280;

   public Class2751(TurtleEntity var1, double var2) {
      super(var1, var2);
   }

   @Override
   public boolean method10803() {
      if (this.field17281.getRevengeTarget() == null && !this.field17281.isBurning()) {
         return false;
      } else {
         BlockPos var3 = this.method10957(this.field17281.world, this.field17281, 7, 4);
         if (var3 == null) {
            return this.method10955();
         } else {
            this.field17283 = (double)var3.getX();
            this.field17284 = (double)var3.getY();
            this.field17285 = (double)var3.getZ();
            return true;
         }
      }
   }
}
