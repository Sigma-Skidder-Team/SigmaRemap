package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.server.ServerWorld;

public class Class2641 extends Class2640 {
   private static String[] field16965;
   private int field16972;
   public final FoxEntity field16973;

   public Class2641(FoxEntity var1, double var2) {
      super(var1, var2);
      this.field16973 = var1;
      this.field16972 = 100;
   }

   @Override
   public boolean method10803() {
      if (this.field16973.isSleeping() || this.field16966.getAttackTarget() != null) {
         return false;
      } else if (this.field16973.world.method6794()) {
         return true;
      } else if (this.field16972 > 0) {
         this.field16972--;
         return false;
      } else {
         this.field16972 = 100;
         BlockPos var3 = this.field16966.getPosition();
         return this.field16973.world.method6740()
            && this.field16973.world.method7022(var3)
            && !((ServerWorld)this.field16973.world).method6952(var3)
            && this.method10848();
      }
   }

   @Override
   public void startExecuting() {
      FoxEntity.method5167(this.field16973);
      super.startExecuting();
   }
}
