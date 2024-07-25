package remapped;

public class class_818 extends class_8715 {
   private static String[] field_4340;
   private final class_6571 field_4341;

   private class_818(class_174 var1, double var2, double var4, double var6, double var8, double var10, double var12, class_6571 var14) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.field_4341 = var14;
      float var17 = 2.5F;
      this.field_49481 *= 0.1F;
      this.field_49486 *= 0.1F;
      this.field_49471 *= 0.1F;
      this.field_49481 += var8;
      this.field_49486 += var10;
      this.field_49471 += var12;
      float var18 = 1.0F - (float)(Math.random() * 0.3F);
      this.field_49485 = var18;
      this.field_49468 = var18;
      this.field_49487 = var18;
      this.field_10503 *= 1.875F;
      int var19 = (int)(8.0 / (Math.random() * 0.8 + 0.3));
      this.field_49476 = (int)Math.max((float)var19 * 2.5F, 1.0F);
      this.field_49474 = false;
      this.method_40054(var14);
   }

   @Override
   public class_7154 method_44957() {
      return class_7154.field_36847;
   }

   @Override
   public float method_9766(float var1) {
      return this.field_10503 * class_9299.method_42828(((float)this.field_49475 + var1) / (float)this.field_49476 * 32.0F, 0.0F, 1.0F);
   }

   @Override
   public void method_44949() {
      this.field_49459 = this.field_49462;
      this.field_49480 = this.field_49473;
      this.field_49479 = this.field_49465;
      if (this.field_49475++ < this.field_49476) {
         this.method_40054(this.field_4341);
         this.method_44962(this.field_49481, this.field_49486, this.field_49471);
         this.field_49481 *= 0.96F;
         this.field_49486 *= 0.96F;
         this.field_49471 *= 0.96F;
         class_704 var3 = this.field_49469.method_25857(this.field_49462, this.field_49473, this.field_49465, 2.0, false);
         if (var3 != null) {
            double var4 = var3.method_37309();
            if (this.field_49473 > var4) {
               this.field_49473 = this.field_49473 + (var4 - this.field_49473) * 0.2;
               this.field_49486 = this.field_49486 + (var3.method_37098().field_7333 - this.field_49486) * 0.2;
               this.method_44960(this.field_49462, this.field_49473, this.field_49465);
            }
         }

         if (this.field_49482) {
            this.field_49481 *= 0.7F;
            this.field_49471 *= 0.7F;
         }
      } else {
         this.method_44948();
      }
   }
}
