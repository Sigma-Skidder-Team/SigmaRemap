package remapped;

public class class_2911 extends class_7764 {
   private static String[] field_14224;
   public class_1343 field_14226;
   public boolean field_14225;

   public class_2911(class_1343 var1) {
      this.field_14226 = var1;
   }

   public boolean method_13314() {
      return this.field_14225;
   }

   public class_1343 method_13317() {
      return this.field_14226;
   }

   public void method_13313(double var1) {
      this.field_14226.field_7333 = var1;
   }

   public void method_13315(double var1) {
      float[] var5 = class_8865.method_40773();
      float var6 = var5[1];
      float var7 = var5[2];
      float var8 = var5[0];
      if (var6 == 0.0F && var7 == 0.0F) {
         this.field_14226.field_7336 = 0.0;
         this.field_14226.field_7334 = 0.0;
      }

      double var9 = Math.cos(Math.toRadians((double)var8));
      double var11 = Math.sin(Math.toRadians((double)var8));
      double var13 = ((double)var6 * var9 + (double)var7 * var11) * var1;
      double var15 = ((double)var6 * var11 - (double)var7 * var9) * var1;
      this.field_14226.field_7336 = var13;
      this.field_14226.field_7334 = var15;
      this.field_14225 = true;
   }

   public void method_13316(class_1343 var1) {
      this.field_14226 = var1;
      this.field_14225 = true;
   }
}
