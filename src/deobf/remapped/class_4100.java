package remapped;

public class class_4100 extends class_8715 {
   private static String[] field_19969;

   private class_4100(class_174 var1, double var2, double var4, double var6, double var8) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.field_49481 *= 0.01F;
      this.field_49486 *= 0.01F;
      this.field_49471 *= 0.01F;
      this.field_49486 += 0.2;
      this.field_49485 = Math.max(0.0F, class_9299.method_42818(((float)var8 + 0.0F) * (float) (Math.PI * 2)) * 0.65F + 0.35F);
      this.field_49468 = Math.max(0.0F, class_9299.method_42818(((float)var8 + 0.33333334F) * (float) (Math.PI * 2)) * 0.65F + 0.35F);
      this.field_49487 = Math.max(0.0F, class_9299.method_42818(((float)var8 + 0.6666667F) * (float) (Math.PI * 2)) * 0.65F + 0.35F);
      this.field_10503 *= 1.5F;
      this.field_49476 = 6;
   }

   @Override
   public class_7154 method_44957() {
      return class_7154.field_36843;
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
         if (this.field_49473 == this.field_49480) {
            this.field_49481 *= 1.1;
            this.field_49471 *= 1.1;
         }

         this.field_49481 *= 0.66F;
         this.field_49486 *= 0.66F;
         this.field_49471 *= 0.66F;
         if (this.field_49482) {
            this.field_49481 *= 0.7F;
            this.field_49471 *= 0.7F;
         }
      } else {
         this.method_44948();
      }
   }
}
