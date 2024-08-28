package mapped;

public class Class8412 {
   private float[] field36072;

   public Class8412() {
      this.field36072 = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 1.0F};
   }

   public Class8412(Class8412 var1) {
      this.field36072 = new float[9];

      for (int var4 = 0; var4 < 9; var4++) {
         this.field36072[var4] = var1.field36072[var4];
      }
   }

   public Class8412(Class8412 var1, Class8412 var2) {
      this(var1);
      this.method29530(var2);
   }

   public Class8412(float[] var1) {
      if (var1.length == 6) {
         this.field36072 = new float[]{var1[0], var1[1], var1[2], var1[3], var1[4], var1[5], 0.0F, 0.0F, 1.0F};
      } else {
         throw new RuntimeException("The parameter must be a float array of length 6.");
      }
   }

   public Class8412(float var1, float var2, float var3, float var4, float var5, float var6) {
      this.field36072 = new float[]{var1, var2, var3, var4, var5, var6, 0.0F, 0.0F, 1.0F};
   }

   public void method29529(float[] var1, int var2, float[] var3, int var4, int var5) {
      float[] var8 = var1 != var3 ? var3 : new float[var5 * 2];

      for (int var9 = 0; var9 < var5 * 2; var9 += 2) {
         for (int var10 = 0; var10 < 6; var10 += 3) {
            var8[var9 + var10 / 3] = var1[var9 + var2] * this.field36072[var10]
               + var1[var9 + var2 + 1] * this.field36072[var10 + 1]
               + 1.0F * this.field36072[var10 + 2];
         }
      }

      if (var1 == var3) {
         for (int var11 = 0; var11 < var5 * 2; var11 += 2) {
            var3[var11 + var4] = var8[var11];
            var3[var11 + var4 + 1] = var8[var11 + 1];
         }
      }
   }

   public Class8412 method29530(Class8412 var1) {
      float[] var4 = new float[9];
      float var5 = this.field36072[0] * var1.field36072[0] + this.field36072[1] * var1.field36072[3];
      float var6 = this.field36072[0] * var1.field36072[1] + this.field36072[1] * var1.field36072[4];
      float var7 = this.field36072[0] * var1.field36072[2] + this.field36072[1] * var1.field36072[5] + this.field36072[2];
      float var8 = this.field36072[3] * var1.field36072[0] + this.field36072[4] * var1.field36072[3];
      float var9 = this.field36072[3] * var1.field36072[1] + this.field36072[4] * var1.field36072[4];
      float var10 = this.field36072[3] * var1.field36072[2] + this.field36072[4] * var1.field36072[5] + this.field36072[5];
      var4[0] = var5;
      var4[1] = var6;
      var4[2] = var7;
      var4[3] = var8;
      var4[4] = var9;
      var4[5] = var10;
      this.field36072 = var4;
      return this;
   }

   @Override
   public String toString() {
      String var3 = "Transform[["
         + this.field36072[0]
         + ","
         + this.field36072[1]
         + ","
         + this.field36072[2]
         + "]["
         + this.field36072[3]
         + ","
         + this.field36072[4]
         + ","
         + this.field36072[5]
         + "]["
         + this.field36072[6]
         + ","
         + this.field36072[7]
         + ","
         + this.field36072[8]
         + "]]";
      return var3.toString();
   }

   public float[] method29531() {
      return this.field36072;
   }

   public static Class8412 method29532(float var0) {
      return new Class8412(
         (float)Class4835.method14957((double)var0),
         -((float)Class4835.method14956((double)var0)),
         0.0F,
         (float)Class4835.method14956((double)var0),
         (float)Class4835.method14957((double)var0),
         0.0F
      );
   }

   public static Class8412 method29533(float var0, float var1, float var2) {
      Class8412 var5 = method29532(var0);
      float var6 = var5.field36072[3];
      float var7 = 1.0F - var5.field36072[4];
      var5.field36072[2] = var1 * var7 + var2 * var6;
      var5.field36072[5] = var2 * var7 - var1 * var6;
      return var5;
   }

   public static Class8412 method29534(float var0, float var1) {
      return new Class8412(1.0F, 0.0F, var0, 0.0F, 1.0F, var1);
   }

   public static Class8412 method29535(float var0, float var1) {
      return new Class8412(var0, 0.0F, 0.0F, 0.0F, var1, 0.0F);
   }

   public Class2532 method29536(Class2532 var1) {
      float[] var4 = new float[]{var1.field16737, var1.field16738};
      float[] var5 = new float[2];
      this.method29529(var4, 0, var5, 0, 1);
      return new Class2532(var5[0], var5[1]);
   }
}
