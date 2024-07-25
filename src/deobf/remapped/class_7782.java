package remapped;

public class class_7782 extends class_8715 {
   private static String[] field_39443;

   private class_7782(class_174 var1, double var2, double var4, double var6, double var8, double var10, double var12, boolean var14) {
      super(var1, var2, var4, var6);
      this.method_44947(3.0F);
      this.method_44955(0.25F, 0.25F);
      if (!var14) {
         this.field_49476 = this.field_49466.nextInt(50) + 80;
      } else {
         this.field_49476 = this.field_49466.nextInt(50) + 280;
      }

      this.field_49477 = 3.0E-6F;
      this.field_49481 = var8;
      this.field_49486 = var10 + (double)(this.field_49466.nextFloat() / 500.0F);
      this.field_49471 = var12;
   }

   @Override
   public void method_44949() {
      this.field_49459 = this.field_49462;
      this.field_49480 = this.field_49473;
      this.field_49479 = this.field_49465;
      if (this.field_49475++ < this.field_49476 && !(this.field_49470 <= 0.0F)) {
         this.field_49481 = this.field_49481 + (double)(this.field_49466.nextFloat() / 5000.0F * (float)(!this.field_49466.nextBoolean() ? -1 : 1));
         this.field_49471 = this.field_49471 + (double)(this.field_49466.nextFloat() / 5000.0F * (float)(!this.field_49466.nextBoolean() ? -1 : 1));
         this.field_49486 = this.field_49486 - (double)this.field_49477;
         this.method_44962(this.field_49481, this.field_49486, this.field_49471);
         if (this.field_49475 >= this.field_49476 - 60 && this.field_49470 > 0.01F) {
            this.field_49470 -= 0.015F;
         }
      } else {
         this.method_44948();
      }
   }

   @Override
   public class_7154 method_44957() {
      return class_7154.field_36847;
   }
}
