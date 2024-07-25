package remapped;

public class class_2680 extends class_246 {
   private static String[] field_13147;

   private class_2680(class_174 var1, double var2, double var4, double var6, double var8, double var10, double var12, class_6571 var14) {
      super(var1, var2, var4, var6, var14, 0.0F);
      this.field_10503 = 0.5F;
      this.method_44956(1.0F);
      this.method_44953(0.0F, 0.0F, 0.0F);
      this.field_49476 = (int)((double)(this.field_10503 * 12.0F) / (Math.random() * 0.8F + 0.2F));
      this.method_40054(var14);
      this.field_49474 = false;
      this.field_49481 = var8;
      this.field_49486 = var10;
      this.field_49471 = var12;
      this.method_1083(0.0F);
   }

   @Override
   public void method_44949() {
      this.field_49459 = this.field_49462;
      this.field_49480 = this.field_49473;
      this.field_49479 = this.field_49465;
      if (this.field_49475++ < this.field_49476) {
         this.method_40054(this.field_864);
         if (this.field_49475 > this.field_49476 / 2) {
            this.method_44956(1.0F - ((float)this.field_49475 - (float)(this.field_49476 / 2)) / (float)this.field_49476);
         }

         this.method_44962(this.field_49481, this.field_49486, this.field_49471);
         if (this.field_49469.method_28262(new class_1331(this.field_49462, this.field_49473, this.field_49465)).method_8345()) {
            this.field_49486 -= 0.008F;
         }

         this.field_49481 *= 0.92F;
         this.field_49486 *= 0.92F;
         this.field_49471 *= 0.92F;
         if (this.field_49482) {
            this.field_49481 *= 0.7F;
            this.field_49471 *= 0.7F;
         }
      } else {
         this.method_44948();
      }
   }
}
