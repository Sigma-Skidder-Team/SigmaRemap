package mapped;

import net.minecraft.tileentity.TileEntity;

public class EnterBeehiveGoal extends Class2661 {
   private static String[] field17039;
   public final BeeEntity field17022;

   private EnterBeehiveGoal(BeeEntity var1) {
      super(var1, null);
      this.field17022 = var1;
   }

   @Override
   public boolean canBeeStart() {
      if (this.field17022.method4432()
         && BeeEntity.method4452(this.field17022)
         && BeeEntity.method4453(this.field17022).withinDistance(this.field17022.getPositionVec(), 2.0)) {
         TileEntity var3 = this.field17022.world.getTileEntity(BeeEntity.method4453(this.field17022));
         if (var3 instanceof BeehiveTileEntity) {
            BeehiveTileEntity var4 = (BeehiveTileEntity)var3;
            if (!var4.method3914()) {
               return true;
            }

            BeeEntity.method4454(this.field17022, null);
         }
      }

      return false;
   }

   @Override
   public boolean canBeeContinue() {
      return false;
   }

   @Override
   public void startExecuting() {
      TileEntity var3 = this.field17022.world.getTileEntity(BeeEntity.method4453(this.field17022));
      if (var3 instanceof BeehiveTileEntity) {
         BeehiveTileEntity var4 = (BeehiveTileEntity)var3;
         var4.method3917(this.field17022, this.field17022.method4438());
      }
   }

   // $VF: synthetic method
   public EnterBeehiveGoal(BeeEntity var1, Class6996 var2) {
      this(var1);
   }
}
