package remapped;

public class class_330 extends class_8715 {
   private static String[] field_1241;
   private final class_6571 field_1240;

   private class_330(ClientWorld var1, double var2, double var4, double var6, double var8, double var10, double var12, class_5727 var14, class_6571 var15) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.field_1240 = var15;
      this.field_49481 *= 0.1F;
      this.field_49486 *= 0.1F;
      this.field_49471 *= 0.1F;
      float var18 = (float)Math.random() * 0.4F + 0.6F;
      this.field_49485 = ((float)(Math.random() * 0.2F) + 0.8F) * var14.method_25910() * var18;
      this.field_49468 = ((float)(Math.random() * 0.2F) + 0.8F) * var14.method_25907() * var18;
      this.field_49487 = ((float)(Math.random() * 0.2F) + 0.8F) * var14.method_25909() * var18;
      this.field_10503 = this.field_10503 * 0.75F * var14.method_25906();
      int var19 = (int)(8.0 / (Math.random() * 0.8 + 0.2));
      this.field_49476 = (int)Math.max((float)var19 * var14.method_25906(), 1.0F);
      this.method_40054(var15);
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
         this.method_40054(this.field_1240);
         this.method_44962(this.field_49481, this.field_49486, this.field_49471);
         if (this.field_49473 == this.field_49480) {
            this.field_49481 *= 1.1;
            this.field_49471 *= 1.1;
         }

         this.field_49481 *= 0.96F;
         this.field_49486 *= 0.96F;
         this.field_49471 *= 0.96F;
         if (this.field_49482) {
            this.field_49481 *= 0.7F;
            this.field_49471 *= 0.7F;
         }
      } else {
         this.method_44948();
      }
   }
}
