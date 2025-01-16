package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;

import java.util.EnumSet;

public class Class2789 extends Class2595 {
   private static String[] field17418;
   public final WanderingTraderEntity field17419;
   public final double field17420;
   public final double field17421;
   public final WanderingTraderEntity field17422;

   public Class2789(WanderingTraderEntity var1, WanderingTraderEntity var2, double var3, double var5) {
      this.field17422 = var1;
      this.field17419 = var2;
      this.field17420 = var3;
      this.field17421 = var5;
      this.method10809(EnumSet.<Class2240>of(Class2240.field14657));
   }

   @Override
   public void method10807() {
      this.field17419.method4758((BlockPos)null);
      WanderingTraderEntity.method4762(this.field17422).method21666();
   }

   @Override
   public boolean method10803() {
      BlockPos var3 = WanderingTraderEntity.method4763(this.field17419);
      return var3 != null && this.method10981(var3, this.field17420);
   }

   @Override
   public void method10805() {
      BlockPos var3 = WanderingTraderEntity.method4763(this.field17419);
      if (var3 != null && WanderingTraderEntity.method4764(this.field17422).method21664()) {
         if (!this.method10981(var3, 10.0)) {
            WanderingTraderEntity.method4766(this.field17422).method21654((double)var3.getX(), (double)var3.getY(), (double)var3.getZ(), this.field17421);
         } else {
            Vector3d var4 = new Vector3d(
                  (double)var3.getX() - this.field17419.getPosX(),
                  (double)var3.getY() - this.field17419.getPosY(),
                  (double)var3.getZ() - this.field17419.getPosZ()
               )
               .method11333();
            Vector3d var5 = var4.scale(10.0).add(this.field17419.getPosX(), this.field17419.getPosY(), this.field17419.getPosZ());
            WanderingTraderEntity.method4765(this.field17422).method21654(var5.x, var5.y, var5.z, this.field17421);
         }
      }
   }

   private boolean method10981(BlockPos var1, double var2) {
      return !var1.method8317(this.field17419.getPositionVec(), var2);
   }
}
