package mapped;

import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;

public class Class2760 extends Class2595 {
   private static String[] field17318;
   private final Class1088 field17319;
   private final double field17320;
   private boolean field17321;
   private int field17322;

   public Class2760(Class1088 var1, double var2) {
      this.field17319 = var1;
      this.field17320 = var2;
   }

   @Override
   public boolean method10803() {
      if (!this.field17319.isChild()) {
         if (!this.field17319.method5045()) {
            return this.field17319.getRNG().nextInt(700) == 0
               ? !Class1088.method5056(this.field17319).method8317(this.field17319.getPositionVec(), 64.0)
               : false;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public void method10804() {
      Class1088.method5057(this.field17319, true);
      this.field17321 = false;
      this.field17322 = 0;
   }

   @Override
   public void method10807() {
      Class1088.method5057(this.field17319, false);
   }

   @Override
   public boolean method10806() {
      return !Class1088.method5056(this.field17319).method8317(this.field17319.getPositionVec(), 7.0) && !this.field17321 && this.field17322 <= 600;
   }

   @Override
   public void method10805() {
      BlockPos var3 = Class1088.method5056(this.field17319);
      boolean var4 = var3.method8317(this.field17319.getPositionVec(), 16.0);
      if (var4) {
         this.field17322++;
      }

      if (this.field17319.method4230().method21664()) {
         Vector3d var5 = Vector3d.method11330(var3);
         Vector3d var6 = Class8037.method27588(this.field17319, 16, 3, var5, (float) (Math.PI / 10));
         if (var6 == null) {
            var6 = Class8037.method27587(this.field17319, 8, 7, var5);
         }

         if (var6 != null && !var4 && !this.field17319.world.getBlockState(new BlockPos(var6)).isIn(Blocks.WATER)) {
            var6 = Class8037.method27587(this.field17319, 16, 5, var5);
         }

         if (var6 == null) {
            this.field17321 = true;
            return;
         }

         this.field17319.method4230().method21654(var6.x, var6.y, var6.z, this.field17320);
      }
   }
}
