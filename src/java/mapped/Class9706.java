package mapped;

import java.util.logging.Level;


public class Class9706 {
   private static final float field45363 = -9.765625E-4F;
   private static final float field45364 = -1024.0F;
   private static final int field45365 = 672;
   private static final float field45366 = 0.953125F;
   private static final float field45367 = 0.90625F;
   private boolean field45368;
   private int field45369;
   private boolean[] field45370;
   private Class9171[] field45371 = new Class9171[672];

   public Class9706() {
      this.method38029();
   }

   public void method38025(Class9189 var1, int var2, Class2288 var3) throws Class2460 {
      int var6 = var3.method9035();
      if (this.field45368 = var1.method34399()) {
         this.field45369 = var1.method34397(5);
      }

      int var7 = var3.method9034();
      int var8 = Math.min(var2, var7);
      this.field45370 = new boolean[var8];

      for (int var9 = 0; var9 < var8; var9++) {
         this.field45370[var9] = var1.method34399();
      }

      Class6515.field28529.log(Level.WARNING, "ICPrediction: maxSFB={0}, maxPredSFB={1}", new int[]{var2, var7});
   }

   public void method38026(int var1) {
      this.field45370[var1] = false;
   }

   public void method38027(Class6512 var1, float[] var2, Class2288 var3) {
      Class6538 var6 = var1.method19720();
      if (!var6.method19874()) {
         int var7 = Math.min(var3.method9034(), var6.method19866());
         int[] var8 = var6.method19868();

         for (int var9 = 0; var9 < var7; var9++) {
            for (int var10 = var8[var9]; var10 < var8[var9 + 1]; var10++) {
               this.method38031(var2, var10, this.field45370[var9]);
            }
         }

         if (this.field45368) {
            this.method38030(this.field45369);
         }
      } else {
         this.method38029();
      }
   }

   private void method38028(int var1) {
      if (this.field45371[var1] == null) {
         this.field45371[var1] = new Class9171();
      }

      this.field45371[var1].field42099 = 0.0F;
      this.field45371[var1].field42100 = 0.0F;
      this.field45371[var1].field42095 = 0.0F;
      this.field45371[var1].field42096 = 0.0F;
      this.field45371[var1].field42097 = 16256.0F;
      this.field45371[var1].field42098 = 16256.0F;
   }

   private void method38029() {
      for (int var3 = 0; var3 < this.field45371.length; var3++) {
         this.method38028(var3);
      }
   }

   private void method38030(int var1) {
      for (int var4 = var1 - 1; var4 < this.field45371.length; var4 += 30) {
         this.method38028(var4);
      }
   }

   private void method38031(float[] var1, int var2, boolean var3) {
      if (this.field45371[var2] == null) {
         this.field45371[var2] = new Class9171();
      }

      Class9171 var6 = this.field45371[var2];
      float var7 = var6.field42099;
      float var8 = var6.field42100;
      float var9 = var6.field42095;
      float var10 = var6.field42096;
      float var11 = var6.field42097;
      float var12 = var6.field42098;
      float var13 = !(var11 > 1.0F) ? 0.0F : var9 * this.method38033(0.953125F / var11);
      float var14 = !(var12 > 1.0F) ? 0.0F : var10 * this.method38033(0.953125F / var12);
      float var15 = this.method38032(var13 * var7 + var14 * var8);
      if (var3) {
         var1[var2] += var15 * -9.765625E-4F;
      }

      float var16 = var1[var2] * -1024.0F;
      float var17 = var16 - var13 * var7;
      var6.field42096 = this.method38034(0.90625F * var10 + var8 * var17);
      var6.field42098 = this.method38034(0.90625F * var12 + 0.5F * (var8 * var8 + var17 * var17));
      var6.field42095 = this.method38034(0.90625F * var9 + var7 * var16);
      var6.field42097 = this.method38034(0.90625F * var11 + 0.5F * (var7 * var7 + var16 * var16));
      var6.field42100 = this.method38034(0.953125F * (var7 - var13 * var16));
      var6.field42099 = this.method38034(0.953125F * var16);
   }

   private float method38032(float var1) {
      return Float.intBitsToFloat(Float.floatToIntBits(var1) + 32768 & -65536);
   }

   private float method38033(float var1) {
      int var4 = Float.floatToIntBits(var1);
      var4 = var4 + 32767 + (var4 & 1) & -65536;
      return Float.intBitsToFloat(var4);
   }

   private float method38034(float var1) {
      return Float.intBitsToFloat(Float.floatToIntBits(var1) & -65536);
   }
}
