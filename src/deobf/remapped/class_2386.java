package remapped;

public class class_2386 extends class_8715 {
   private static String[] field_11902;

   private class_2386(ClientWorld var1, double var2, double var4, double var6) {
      super(var1, var2, var4, var6, 0.0, 0.0, 0.0);
      this.field_49481 *= 0.8F;
      this.field_49486 *= 0.8F;
      this.field_49471 *= 0.8F;
      this.field_49486 = (double)(this.field_49466.nextFloat() * 0.4F + 0.05F);
      this.field_10503 = this.field_10503 * (this.field_49466.nextFloat() * 2.0F + 0.2F);
      this.field_49476 = (int)(16.0 / (Math.random() * 0.8 + 0.2));
   }

   @Override
   public class_7154 method_44957() {
      return class_7154.field_36843;
   }

   @Override
   public int method_44952(float var1) {
      int var4 = super.method_44952(var1);
      short var5 = 240;
      int var6 = var4 >> 16 & 0xFF;
      return 240 | var6 << 16;
   }

   @Override
   public float method_9766(float var1) {
      float var4 = ((float)this.field_49475 + var1) / (float)this.field_49476;
      return this.field_10503 * (1.0F - var4 * var4);
   }

   @Override
   public void method_44949() {
      this.field_49459 = this.field_49462;
      this.field_49480 = this.field_49473;
      this.field_49479 = this.field_49465;
      float var3 = (float)this.field_49475 / (float)this.field_49476;
      if (this.field_49466.nextFloat() > var3) {
         this.field_49469
            .method_43361(class_3090.field_15376, this.field_49462, this.field_49473, this.field_49465, this.field_49481, this.field_49486, this.field_49471);
      }

      if (this.field_49475++ < this.field_49476) {
         this.field_49486 -= 0.03;
         this.method_44962(this.field_49481, this.field_49486, this.field_49471);
         this.field_49481 *= 0.999F;
         this.field_49486 *= 0.999F;
         this.field_49471 *= 0.999F;
         if (this.field_49482) {
            this.field_49481 *= 0.7F;
            this.field_49471 *= 0.7F;
         }
      } else {
         this.method_44948();
      }
   }
}
