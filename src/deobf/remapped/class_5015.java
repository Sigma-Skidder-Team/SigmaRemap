package remapped;

public class class_5015 extends class_8715 {
   private static String[] field_25942;
   private final float field_25944;
   private final class_6571 field_25943;

   private class_5015(ClientWorld var1, double var2, double var4, double var6, float var8, float var9, float var10, class_6571 var11) {
      super(var1, var2, var4, var6);
      this.field_25943 = var11;
      this.field_49485 = var8;
      this.field_49468 = var9;
      this.field_49487 = var10;
      float var14 = 0.9F;
      this.field_10503 *= 0.67499995F;
      int var15 = (int)(32.0 / (Math.random() * 0.8 + 0.2));
      this.field_49476 = (int)Math.max((float)var15 * 0.9F, 1.0F);
      this.method_40054(var11);
      this.field_25944 = ((float)Math.random() - 0.5F) * 0.1F;
      this.field_49478 = (float)Math.random() * (float) (Math.PI * 2);
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
         this.method_40054(this.field_25943);
         this.field_49467 = this.field_49478;
         this.field_49478 = this.field_49478 + (float) Math.PI * this.field_25944 * 2.0F;
         if (this.field_49482) {
            this.field_49467 = this.field_49478 = 0.0F;
         }

         this.method_44962(this.field_49481, this.field_49486, this.field_49471);
         this.field_49486 -= 0.003F;
         this.field_49486 = Math.max(this.field_49486, -0.14F);
      } else {
         this.method_44948();
      }
   }
}
