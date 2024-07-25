package remapped;

public class class_5382 extends class_8715 {
   private static String[] field_27465;
   private boolean field_27466;
   private final class_6571 field_27467;

   private class_5382(ClientWorld var1, double var2, double var4, double var6, double var8, double var10, double var12, class_6571 var14) {
      super(var1, var2, var4, var6);
      this.field_49481 = var8;
      this.field_49486 = var10;
      this.field_49471 = var12;
      this.field_49485 = class_9299.method_42819(this.field_49466, 0.7176471F, 0.8745098F);
      this.field_49468 = class_9299.method_42819(this.field_49466, 0.0F, 0.0F);
      this.field_49487 = class_9299.method_42819(this.field_49466, 0.8235294F, 0.9764706F);
      this.field_10503 *= 0.75F;
      this.field_49476 = (int)(20.0 / ((double)this.field_49466.nextFloat() * 0.8 + 0.2));
      this.field_27466 = false;
      this.field_49474 = false;
      this.field_27467 = var14;
      this.method_40054(var14);
   }

   @Override
   public void method_44949() {
      this.field_49459 = this.field_49462;
      this.field_49480 = this.field_49473;
      this.field_49479 = this.field_49465;
      if (this.field_49475++ < this.field_49476) {
         this.method_40054(this.field_27467);
         if (this.field_49482) {
            this.field_49486 = 0.0;
            this.field_27466 = true;
         }

         if (this.field_27466) {
            this.field_49486 += 0.002;
         }

         this.method_44962(this.field_49481, this.field_49486, this.field_49471);
         if (this.field_49473 == this.field_49480) {
            this.field_49481 *= 1.1;
            this.field_49471 *= 1.1;
         }

         this.field_49481 *= 0.96F;
         this.field_49471 *= 0.96F;
         if (this.field_27466) {
            this.field_49486 *= 0.96F;
         }
      } else {
         this.method_44948();
      }
   }

   @Override
   public class_7154 method_44957() {
      return class_7154.field_36843;
   }

   @Override
   public float method_9766(float var1) {
      return this.field_10503 * class_9299.method_42828(((float)this.field_49475 + var1) / (float)this.field_49476 * 32.0F, 0.0F, 1.0F);
   }
}
