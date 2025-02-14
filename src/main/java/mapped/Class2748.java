package mapped;

import net.minecraft.util.math.BlockPos;

public class Class2748 extends Class2747 {
   private static String[] field17280;
   private final PandaEntity field17287;

   public Class2748(PandaEntity var1, double var2) {
      super(var1, var2);
      this.field17287 = var1;
   }

   @Override
   public boolean method10803() {
      if (this.field17287.isBurning()) {
         BlockPos var3 = this.method10957(this.field17281.world, this.field17281, 5, 4);
         if (var3 == null) {
            return this.method10955();
         } else {
            this.field17283 = (double)var3.getX();
            this.field17284 = (double)var3.getY();
            this.field17285 = (double)var3.getZ();
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean method10806() {
      if (!this.field17287.method5189()) {
         return super.method10806();
      } else {
         this.field17287.method4230().method21666();
         return false;
      }
   }
}
