package remapped;

public class class_2112 extends class_2833 {
   private static String[] field_10597;
   private final int field_10596;
   private final boolean field_10595;

   public class_2112(MobEntity var1, int var2, boolean var3) {
      super(var1);
      this.field_10596 = var2;
      this.field_10595 = var3;
   }

   @Override
   public void method_12883() {
      if (this.field_13878 != class_1737.field_8946) {
         if (!this.field_10595) {
            this.field_13879.method_37182(false);
         }

         this.field_13879.method_26845(0.0F);
         this.field_13879.method_26904(0.0F);
      } else {
         this.field_13878 = class_1737.field_8945;
         this.field_13879.method_37182(true);
         double var3 = this.field_13884 - this.field_13879.getPosX();
         double var5 = this.field_13886 - this.field_13879.method_37309();
         double var7 = this.field_13880 - this.field_13879.getPosZ();
         double var9 = var3 * var3 + var5 * var5 + var7 * var7;
         if (var9 < 2.5000003E-7F) {
            this.field_13879.method_26845(0.0F);
            this.field_13879.method_26904(0.0F);
            return;
         }

         float var11 = (float)(class_9299.method_42821(var7, var3) * 180.0F / (float)Math.PI) - 90.0F;
         this.field_13879.rotationYaw = this.method_12882(this.field_13879.rotationYaw, var11, 90.0F);
         float var12;
         if (!this.field_13879.method_37360()) {
            var12 = (float)(this.field_13885 * this.field_13879.method_26575(class_7331.field_37474));
         } else {
            var12 = (float)(this.field_13885 * this.field_13879.method_26575(class_7331.field_37465));
         }

         this.field_13879.method_26461(var12);
         double var13 = (double)class_9299.method_42842(var3 * var3 + var7 * var7);
         float var15 = (float)(-(class_9299.method_42821(var5, var13) * 180.0F / (float)Math.PI));
         this.field_13879.rotationPitch = this.method_12882(this.field_13879.rotationPitch, var15, (float)this.field_10596);
         this.field_13879.method_26845(!(var5 > 0.0) ? -var12 : var12);
      }
   }
}
