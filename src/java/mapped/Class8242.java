package mapped;


public class Class8242 implements Class8241 {
   private final int field35407;
   private final int field35408;
   private final int field35409;
   private final int field35410;
   private final float[][] field35411;
   private final Class9339 field35412;
   private final float[][] field35413;
   private final float[] field35414;

   public Class8242(int var1) throws AACException {
      this.field35407 = var1;
      this.field35408 = var1 >> 1;
      this.field35409 = var1 >> 2;
      this.field35410 = var1 >> 3;
      switch (var1) {
         case 240:
            this.field35411 = field35406;
         default:
            throw new AACException("unsupported MDCT length: " + var1);
         case 256:
            this.field35411 = field35404;
            break;
         case 1920:
            this.field35411 = field35405;
            break;
         case 2048:
            this.field35411 = field35403;
      }

      this.field35412 = new Class9339(this.field35409);
      this.field35413 = new float[this.field35409][2];
      this.field35414 = new float[2];
   }

   public void method28739(float[] var1, int var2, float[] var3, int var4) {
      for (int var7 = 0; var7 < this.field35409; var7++) {
         this.field35413[var7][1] = var1[var2 + 2 * var7] * this.field35411[var7][0] + var1[var2 + this.field35408 - 1 - 2 * var7] * this.field35411[var7][1];
         this.field35413[var7][0] = var1[var2 + this.field35408 - 1 - 2 * var7] * this.field35411[var7][0] - var1[var2 + 2 * var7] * this.field35411[var7][1];
      }

      this.field35412.method35344(this.field35413, false);

      for (int var8 = 0; var8 < this.field35409; var8++) {
         this.field35414[0] = this.field35413[var8][0];
         this.field35414[1] = this.field35413[var8][1];
         this.field35413[var8][1] = this.field35414[1] * this.field35411[var8][0] + this.field35414[0] * this.field35411[var8][1];
         this.field35413[var8][0] = this.field35414[0] * this.field35411[var8][0] - this.field35414[1] * this.field35411[var8][1];
      }

      for (int var9 = 0; var9 < this.field35410; var9 += 2) {
         var3[var4 + 2 * var9] = this.field35413[this.field35410 + var9][1];
         var3[var4 + 2 + 2 * var9] = this.field35413[this.field35410 + 1 + var9][1];
         var3[var4 + 1 + 2 * var9] = -this.field35413[this.field35410 - 1 - var9][0];
         var3[var4 + 3 + 2 * var9] = -this.field35413[this.field35410 - 2 - var9][0];
         var3[var4 + this.field35409 + 2 * var9] = this.field35413[var9][0];
         var3[var4 + this.field35409 + 2 + 2 * var9] = this.field35413[1 + var9][0];
         var3[var4 + this.field35409 + 1 + 2 * var9] = -this.field35413[this.field35409 - 1 - var9][1];
         var3[var4 + this.field35409 + 3 + 2 * var9] = -this.field35413[this.field35409 - 2 - var9][1];
         var3[var4 + this.field35408 + 2 * var9] = this.field35413[this.field35410 + var9][0];
         var3[var4 + this.field35408 + 2 + 2 * var9] = this.field35413[this.field35410 + 1 + var9][0];
         var3[var4 + this.field35408 + 1 + 2 * var9] = -this.field35413[this.field35410 - 1 - var9][1];
         var3[var4 + this.field35408 + 3 + 2 * var9] = -this.field35413[this.field35410 - 2 - var9][1];
         var3[var4 + this.field35408 + this.field35409 + 2 * var9] = -this.field35413[var9][1];
         var3[var4 + this.field35408 + this.field35409 + 2 + 2 * var9] = -this.field35413[1 + var9][1];
         var3[var4 + this.field35408 + this.field35409 + 1 + 2 * var9] = this.field35413[this.field35409 - 1 - var9][0];
         var3[var4 + this.field35408 + this.field35409 + 3 + 2 * var9] = this.field35413[this.field35409 - 2 - var9][0];
      }
   }

   public void method28740(float[] var1, float[] var2) {
      for (int var5 = 0; var5 < this.field35410; var5++) {
         int var6 = var5 << 1;
         this.field35414[0] = var1[this.field35407 - this.field35409 - 1 - var6] + var1[this.field35407 - this.field35409 + var6];
         this.field35414[1] = var1[this.field35409 + var6] - var1[this.field35409 - 1 - var6];
         this.field35413[var5][0] = this.field35414[0] * this.field35411[var5][0] + this.field35414[1] * this.field35411[var5][1];
         this.field35413[var5][1] = this.field35414[1] * this.field35411[var5][0] - this.field35414[0] * this.field35411[var5][1];
         this.field35413[var5][0] = this.field35413[var5][0] * (float)this.field35407;
         this.field35413[var5][1] = this.field35413[var5][1] * (float)this.field35407;
         this.field35414[0] = var1[this.field35408 - 1 - var6] - var1[var6];
         this.field35414[1] = var1[this.field35408 + var6] + var1[this.field35407 - 1 - var6];
         this.field35413[var5 + this.field35410][0] = this.field35414[0] * this.field35411[var5 + this.field35410][0]
            + this.field35414[1] * this.field35411[var5 + this.field35410][1];
         this.field35413[var5 + this.field35410][1] = this.field35414[1] * this.field35411[var5 + this.field35410][0]
            - this.field35414[0] * this.field35411[var5 + this.field35410][1];
         this.field35413[var5 + this.field35410][0] = this.field35413[var5 + this.field35410][0] * (float)this.field35407;
         this.field35413[var5 + this.field35410][1] = this.field35413[var5 + this.field35410][1] * (float)this.field35407;
      }

      this.field35412.method35344(this.field35413, true);

      for (int var7 = 0; var7 < this.field35409; var7++) {
         int var8 = var7 << 1;
         this.field35414[0] = this.field35413[var7][0] * this.field35411[var7][0] + this.field35413[var7][1] * this.field35411[var7][1];
         this.field35414[1] = this.field35413[var7][1] * this.field35411[var7][0] - this.field35413[var7][0] * this.field35411[var7][1];
         var2[var8] = -this.field35414[0];
         var2[this.field35408 - 1 - var8] = this.field35414[1];
         var2[this.field35408 + var8] = -this.field35414[1];
         var2[this.field35407 - 1 - var8] = this.field35414[0];
      }
   }
}
