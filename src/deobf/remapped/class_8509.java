package remapped;

public class class_8509 extends class_2833 {
   private static String[] field_43555;
   private float field_43556;
   private int field_43553;
   private final class_378 field_43554;
   private boolean field_43557;

   public class_8509(class_378 var1) {
      super(var1);
      this.field_43554 = var1;
      this.field_43556 = 180.0F * var1.rotationYaw / (float) Math.PI;
   }

   public void method_39183(float var1, boolean var2) {
      this.field_43556 = var1;
      this.field_43557 = var2;
   }

   public void method_39182(double var1) {
      this.field_13885 = var1;
      this.field_13878 = class_1737.field_8946;
   }

   @Override
   public void method_12883() {
      this.field_13879.rotationYaw = this.method_12882(this.field_13879.rotationYaw, this.field_43556, 90.0F);
      this.field_13879.field_29618 = this.field_13879.rotationYaw;
      this.field_13879.field_29605 = this.field_13879.rotationYaw;
      if (this.field_13878 == class_1737.field_8946) {
         this.field_13878 = class_1737.field_8945;
         if (!this.field_13879.method_37360()) {
            this.field_13879.method_26461((float)(this.field_13885 * this.field_13879.method_26575(Attributes.MOVEMENT_SPEED)));
         } else {
            this.field_13879.method_26461((float)(this.field_13885 * this.field_13879.method_26575(Attributes.MOVEMENT_SPEED)));
            if (this.field_43553-- > 0) {
               this.field_43554.field_29676 = 0.0F;
               this.field_43554.field_29673 = 0.0F;
               this.field_13879.method_26461(0.0F);
            } else {
               this.field_43553 = this.field_43554.method_1862();
               if (this.field_43557) {
                  this.field_43553 /= 3;
               }

               this.field_43554.method_26886().method_18772();
               if (this.field_43554.method_1852()) {
                  this.field_43554.method_37155(this.field_43554.method_1849(), this.field_43554.method_26439(), class_378.method_1851(this.field_43554));
               }
            }
         }
      } else {
         this.field_13879.method_26904(0.0F);
      }
   }
}
