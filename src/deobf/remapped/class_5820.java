package remapped;

public class class_5820 extends class_246 {
   private static String[] field_29517;
   private boolean field_29520;
   private boolean field_29522;
   private final class_9326 field_29523;
   private float field_29518;
   private float field_29524;
   private float field_29521;
   private boolean field_29519;

   private class_5820(class_174 var1, double var2, double var4, double var6, double var8, double var10, double var12, class_9326 var14, class_6571 var15) {
      super(var1, var2, var4, var6, var15, -0.004F);
      this.field_49481 = var8;
      this.field_49486 = var10;
      this.field_49471 = var12;
      this.field_29523 = var14;
      this.field_10503 *= 0.75F;
      this.field_49476 = 48 + this.field_49466.nextInt(12);
      this.method_40054(var15);
   }

   public void method_26339(boolean var1) {
      this.field_29520 = var1;
   }

   public void method_26340(boolean var1) {
      this.field_29522 = var1;
   }

   @Override
   public void method_44951(class_7907 var1, class_9071 var2, float var3) {
      if (!this.field_29522 || this.field_49475 < this.field_49476 / 3 || (this.field_49475 + this.field_49476) / 3 % 2 == 0) {
         super.method_44951(var1, var2, var3);
      }
   }

   @Override
   public void method_44949() {
      super.method_44949();
      if (this.field_29520 && this.field_49475 < this.field_49476 / 2 && (this.field_49475 + this.field_49476) % 2 == 0) {
         class_5820 var3 = new class_5820(
            this.field_49469, this.field_49462, this.field_49473, this.field_49465, 0.0, 0.0, 0.0, this.field_29523, this.field_864
         );
         var3.method_44956(0.99F);
         var3.method_44953(this.field_49485, this.field_49468, this.field_49487);
         var3.field_49475 = var3.field_49476 / 2;
         if (this.field_29519) {
            var3.field_29519 = true;
            var3.field_29518 = this.field_29518;
            var3.field_29524 = this.field_29524;
            var3.field_29521 = this.field_29521;
         }

         var3.field_29522 = this.field_29522;
         this.field_29523.method_43044(var3);
      }
   }
}
