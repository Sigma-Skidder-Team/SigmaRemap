package mapped;

import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.vector.Vector3d;

public class Class6837 extends Class6829 {
   private static String[] field29706;
   private final Class1112 field29724;
   private int field29725;

   public Class6837(Class1112 var1) {
      super(var1);
      this.field29724 = var1;
   }

   @Override
   public void method20810() {
      if (this.field29714 == Class2335.field15967 && this.field29725-- <= 0) {
         this.field29725 = this.field29725 + this.field29724.getRNG().nextInt(5) + 2;
         Vector3d var3 = new Vector3d(
            this.field29708 - this.field29724.getPosX(), this.field29709 - this.field29724.getPosY(), this.field29710 - this.field29724.getPosZ()
         );
         double var4 = var3.length();
         var3 = var3.method11333();
         if (!this.method20820(var3, MathHelper.method37774(var4))) {
            this.field29714 = Class2335.field15966;
         } else {
            this.field29724.setMotion(this.field29724.getMotion().add(var3.scale(0.1)));
         }
      }
   }

   private boolean method20820(Vector3d var1, int var2) {
      AxisAlignedBB var5 = this.field29724.getBoundingBox();

      for (int var6 = 1; var6 < var2; var6++) {
         var5 = var5.offset(var1);
         if (!this.field29724.world.hasNoCollisions(this.field29724, var5)) {
            return false;
         }
      }

      return true;
   }
}
