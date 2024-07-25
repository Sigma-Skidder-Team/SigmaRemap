package remapped;

public class class_4508 {
   private float[] field_22034;

   public class_4508() {
      this.field_22034 = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F};
   }

   public class_4508(class_4508 var1) {
      this.field_22034 = new float[9];

      for (int var4 = 0; var4 < 9; var4++) {
         this.field_22034[var4] = var1.field_22034[var4];
      }
   }

   public class_4508(class_4508 var1, class_4508 var2) {
      this(var1);
      this.method_20950(var2);
   }

   public class_4508(float[] var1) {
      if (var1.length == 6) {
         this.field_22034 = new float[]{var1[0], var1[1], var1[2], var1[3], var1[4], var1[5], 0.0F, 0.0F, 1.0F};
      } else {
         throw new RuntimeException("The parameter must be a float array of length 6.");
      }
   }

   public class_4508(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.field_22034 = new float[]{var1, var2, var3, var4, var5, var6, 0.0F, 0.0F, 1.0F};
   }

   public void method_20952(float[] var1, int var2, float[] var3, int var4, int var5) {
      float[] var8 = var1 != var3 ? var3 : new float[var5 * 2];

      for (byte var9 = 0; var9 < var5 * 2; var9 += 2) {
         for (byte var10 = 0; var10 < 6; var10 += 3) {
            var8[var9 + var10 / 3] = var1[var9 + var2] * this.field_22034[var10]
               + var1[var9 + var2 + 1] * this.field_22034[var10 + 1]
               + 1.0F * this.field_22034[var10 + 2];
         }
      }

      if (var1 == var3) {
         for (byte var11 = 0; var11 < var5 * 2; var11 += 2) {
            var3[var11 + var4] = var8[var11];
            var3[var11 + var4 + 1] = var8[var11 + 1];
         }
      }
   }

   public class_4508 method_20950(class_4508 var1) {
      float[] var4 = new float[9];
      float var5 = this.field_22034[0] * var1.field_22034[0] + this.field_22034[1] * var1.field_22034[3];
      float var6 = this.field_22034[0] * var1.field_22034[1] + this.field_22034[1] * var1.field_22034[4];
      float var7 = this.field_22034[0] * var1.field_22034[2] + this.field_22034[1] * var1.field_22034[5] + this.field_22034[2];
      float var8 = this.field_22034[3] * var1.field_22034[0] + this.field_22034[4] * var1.field_22034[3];
      float var9 = this.field_22034[3] * var1.field_22034[1] + this.field_22034[4] * var1.field_22034[4];
      float var10 = this.field_22034[3] * var1.field_22034[2] + this.field_22034[4] * var1.field_22034[5] + this.field_22034[5];
      var4[0] = var5;
      var4[1] = var6;
      var4[2] = var7;
      var4[3] = var8;
      var4[4] = var9;
      var4[5] = var10;
      this.field_22034 = var4;
      return this;
   }

   @Override
   public String toString() {
      String var3 = "Transform[["
         + this.field_22034[0]
         + ","
         + this.field_22034[1]
         + ","
         + this.field_22034[2]
         + "]["
         + this.field_22034[3]
         + ","
         + this.field_22034[4]
         + ","
         + this.field_22034[5]
         + "]["
         + this.field_22034[6]
         + ","
         + this.field_22034[7]
         + ","
         + this.field_22034[8]
         + "]]";
      return var3.toString();
   }

   public float[] method_20946() {
      return this.field_22034;
   }

   public static class_4508 method_20948(float var0) {
      return new class_4508(
         (float)class_215.method_933((double)var0),
         -((float)class_215.method_932((double)var0)),
         0.0F,
         (float)class_215.method_932((double)var0),
         (float)class_215.method_933((double)var0),
         0.0F
      );
   }

   public static class_4508 method_20949(float var0, float var1, float var2) {
      class_4508 var5 = method_20948(var0);
      float var6 = var5.field_22034[3];
      float var7 = 1.0F - var5.field_22034[4];
      var5.field_22034[2] = var1 * var7 + var2 * var6;
      var5.field_22034[5] = var2 * var7 - var1 * var6;
      return var5;
   }

   public static class_4508 method_20944(float var0, float var1) {
      return new class_4508(1.0F, 0.0F, var0, 0.0F, 1.0F, var1);
   }

   public static class_4508 method_20945(float var0, float var1) {
      return new class_4508(var0, 0.0F, 0.0F, 0.0F, var1, 0.0F);
   }

   public class_1440 method_20951(class_1440 var1) {
      float[] var4 = new float[]{var1.field_7766, var1.field_7765};
      float[] var5 = new float[2];
      this.method_20952(var4, 0, var5, 0, 1);
      return new class_1440(var5[0], var5[1]);
   }
}
