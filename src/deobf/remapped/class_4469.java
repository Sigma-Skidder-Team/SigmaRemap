package remapped;

public class class_4469 extends class_2833 {
   private static String[] field_21793;
   private final class_449 field_21792;

   public class_4469(class_449 var1) {
      super(var1);
      this.field_21792 = var1;
   }

   @Override
   public void method_12883() {
      if (this.field_21792.method_37285()) {
         this.field_21792.method_37215(this.field_21792.method_37098().method_6214(0.0, 0.005, 0.0));
      }

      if (this.field_13878 == class_1737.field_8946 && !this.field_21792.method_26927().method_5591()) {
         double var3 = this.field_13884 - this.field_21792.method_37302();
         double var5 = this.field_13886 - this.field_21792.method_37309();
         double var7 = this.field_13880 - this.field_21792.method_37156();
         double var9 = var3 * var3 + var5 * var5 + var7 * var7;
         if (!(var9 < 2.5000003E-7F)) {
            float var11 = (float)(class_9299.method_42821(var7, var3) * 180.0F / (float)Math.PI) - 90.0F;
            this.field_21792.field_41701 = this.method_12882(this.field_21792.field_41701, var11, 10.0F);
            this.field_21792.field_29605 = this.field_21792.field_41701;
            this.field_21792.field_29618 = this.field_21792.field_41701;
            float var12 = (float)(this.field_13885 * this.field_21792.method_26575(class_7331.field_37465));
            if (!this.field_21792.method_37285()) {
               this.field_21792.method_26461(var12 * 0.1F);
            } else {
               this.field_21792.method_26461(var12 * 0.02F);
               float var13 = -((float)(class_9299.method_42821(var5, (double)class_9299.method_42842(var3 * var3 + var7 * var7)) * 180.0F / (float)Math.PI));
               var13 = class_9299.method_42828(class_9299.method_42810(var13), -85.0F, 85.0F);
               this.field_21792.field_41755 = this.method_12882(this.field_21792.field_41755, var13, 5.0F);
               float var14 = class_9299.method_42840(this.field_21792.field_41755 * (float) (Math.PI / 180.0));
               float var15 = class_9299.method_42818(this.field_21792.field_41755 * (float) (Math.PI / 180.0));
               this.field_21792.field_29673 = var14 * var12;
               this.field_21792.field_29651 = -var15 * var12;
            }
         } else {
            this.field_13879.method_26904(0.0F);
         }
      } else {
         this.field_21792.method_26461(0.0F);
         this.field_21792.method_26907(0.0F);
         this.field_21792.method_26845(0.0F);
         this.field_21792.method_26904(0.0F);
      }
   }
}