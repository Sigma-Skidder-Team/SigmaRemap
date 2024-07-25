package remapped;

public class class_1098 extends class_8715 {
   private static String[] field_6062;

   private class_1098(ClientWorld var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.field_49481 *= 0.1F;
      this.field_49486 *= 0.1F;
      this.field_49471 *= 0.1F;
      this.field_49481 += var8 * 0.4;
      this.field_49486 += var10 * 0.4;
      this.field_49471 += var12 * 0.4;
      float var16 = (float)(Math.random() * 0.3F + 0.6F);
      this.field_49485 = var16;
      this.field_49468 = var16;
      this.field_49487 = var16;
      this.field_10503 *= 0.75F;
      this.field_49476 = Math.max((int)(6.0 / (Math.random() * 0.8 + 0.6)), 1);
      this.field_49474 = false;
      this.method_44949();
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
         this.method_44962(this.field_49481, this.field_49486, this.field_49471);
         this.field_49468 = (float)((double)this.field_49468 * 0.96);
         this.field_49487 = (float)((double)this.field_49487 * 0.9);
         this.field_49481 *= 0.7F;
         this.field_49486 *= 0.7F;
         this.field_49471 *= 0.7F;
         this.field_49486 -= 0.02F;
         if (this.field_49482) {
            this.field_49481 *= 0.7F;
            this.field_49471 *= 0.7F;
         }
      } else {
         this.method_44948();
      }
   }

   @Override
   public class_7154 method_44957() {
      return class_7154.field_36843;
   }
}
