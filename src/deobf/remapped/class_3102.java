package remapped;

public class class_3102 extends class_4287 {
   private static String[] field_15435;

   private class_3102(ClientWorld var1, double var2, double var4, double var6, double var8, double var10, double var12) {
      super(var1, var2, var4, var6, var8, var10, var12);
      this.field_10503 = (float)((double)this.field_10503 * 1.5);
      this.field_49476 = (int)(Math.random() * 2.0) + 60;
   }

   @Override
   public float method_9766(float var1) {
      float var4 = 1.0F - ((float)this.field_49475 + var1) / ((float)this.field_49476 * 1.5F);
      return this.field_10503 * var4;
   }

   @Override
   public void method_44949() {
      this.field_49459 = this.field_49462;
      this.field_49480 = this.field_49473;
      this.field_49479 = this.field_49465;
      if (this.field_49475++ < this.field_49476) {
         float var3 = (float)this.field_49475 / (float)this.field_49476;
         this.field_49462 = this.field_49462 + this.field_49481 * (double)var3;
         this.field_49473 = this.field_49473 + this.field_49486 * (double)var3;
         this.field_49465 = this.field_49465 + this.field_49471 * (double)var3;
      } else {
         this.method_44948();
      }
   }
}
