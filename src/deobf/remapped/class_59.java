package remapped;

import java.util.Random;

public class class_59 extends class_3599 {
   private static String[] field_55;
   private final class_3845 field_53;
   private final double field_56;
   private boolean field_54;

   public class_59(class_3845 var1, double var2) {
      this.field_53 = var1;
      this.field_56 = var2;
   }

   @Override
   public boolean method_16795() {
      return !class_3845.method_17858(this.field_53) && !this.field_53.method_17856() && this.field_53.method_37285();
   }

   @Override
   public void method_16796() {
      short var3 = 512;
      byte var4 = 4;
      Random var5 = class_3845.method_17866(this.field_53);
      int var6 = var5.nextInt(1025) - 512;
      int var7 = var5.nextInt(9) - 4;
      int var8 = var5.nextInt(1025) - 512;
      if ((double)var7 + this.field_53.method_37309() > (double)(this.field_53.world.method_22552() - 1)) {
         var7 = 0;
      }

      BlockPos var9 = new BlockPos(
         (double)var6 + this.field_53.getPosX(), (double)var7 + this.field_53.method_37309(), (double)var8 + this.field_53.getPosZ()
      );
      class_3845.method_17869(this.field_53, var9);
      class_3845.method_17855(this.field_53, true);
      this.field_54 = false;
   }

   @Override
   public void method_16794() {
      if (this.field_53.method_26927().method_5591()) {
         class_1343 var3 = class_1343.method_6200(class_3845.method_17846(this.field_53));
         class_1343 var4 = class_3425.method_15841(this.field_53, 16, 3, var3, (float) (Math.PI / 10));
         if (var4 == null) {
            var4 = class_3425.method_15837(this.field_53, 8, 7, var3);
         }

         if (var4 != null) {
            int var5 = class_9299.method_42847(var4.field_7336);
            int var6 = class_9299.method_42847(var4.field_7334);
            byte var7 = 34;
            if (!this.field_53.world.method_22569(var5 - 34, 0, var6 - 34, var5 + 34, 0, var6 + 34)) {
               var4 = null;
            }
         }

         if (var4 == null) {
            this.field_54 = true;
            return;
         }

         this.field_53.method_26927().method_5595(var4.field_7336, var4.field_7333, var4.field_7334, this.field_56);
      }
   }

   @Override
   public boolean method_16799() {
      return !this.field_53.method_26927().method_5591()
         && !this.field_54
         && !class_3845.method_17858(this.field_53)
         && !this.field_53.method_24875()
         && !this.field_53.method_17856();
   }

   @Override
   public void method_16793() {
      class_3845.method_17855(this.field_53, false);
      super.method_16793();
   }
}
