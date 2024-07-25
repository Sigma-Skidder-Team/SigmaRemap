package remapped;

import net.sourceforge.jaad.aac.AACException;

public class class_6563 implements class_4013 {
   private final int field_33480;
   private final int field_33482;
   private final int field_33483;
   private final int field_33487;
   private final float[][] field_33481;
   private final class_8113 field_33484;
   private final float[][] field_33479;
   private final float[] field_33485;

   public class_6563(int var1) throws AACException {
      this.field_33480 = var1;
      this.field_33482 = var1 >> 1;
      this.field_33483 = var1 >> 2;
      this.field_33487 = var1 >> 3;
      switch (var1) {
         case 240:
            this.field_33481 = field_19486;
         default:
            throw new class_5060("unsupported MDCT length: " + var1);
         case 256:
            this.field_33481 = field_19487;
            break;
         case 1920:
            this.field_33481 = field_19485;
            break;
         case 2048:
            this.field_33481 = field_19488;
      }

      this.field_33484 = new class_8113(this.field_33483);
      this.field_33479 = new float[this.field_33483][2];
      this.field_33485 = new float[2];
   }

   public void method_29999(float[] var1, int var2, float[] var3, int var4) {
      for (int var7 = 0; var7 < this.field_33483; var7++) {
         this.field_33479[var7][1] = var1[var2 + 2 * var7] * this.field_33481[var7][0]
            + var1[var2 + this.field_33482 - 1 - 2 * var7] * this.field_33481[var7][1];
         this.field_33479[var7][0] = var1[var2 + this.field_33482 - 1 - 2 * var7] * this.field_33481[var7][0]
            - var1[var2 + 2 * var7] * this.field_33481[var7][1];
      }

      this.field_33484.method_36906(this.field_33479, false);

      for (int var8 = 0; var8 < this.field_33483; var8++) {
         this.field_33485[0] = this.field_33479[var8][0];
         this.field_33485[1] = this.field_33479[var8][1];
         this.field_33479[var8][1] = this.field_33485[1] * this.field_33481[var8][0] + this.field_33485[0] * this.field_33481[var8][1];
         this.field_33479[var8][0] = this.field_33485[0] * this.field_33481[var8][0] - this.field_33485[1] * this.field_33481[var8][1];
      }

      for (byte var9 = 0; var9 < this.field_33487; var9 += 2) {
         var3[var4 + 2 * var9] = this.field_33479[this.field_33487 + var9][1];
         var3[var4 + 2 + 2 * var9] = this.field_33479[this.field_33487 + 1 + var9][1];
         var3[var4 + 1 + 2 * var9] = -this.field_33479[this.field_33487 - 1 - var9][0];
         var3[var4 + 3 + 2 * var9] = -this.field_33479[this.field_33487 - 2 - var9][0];
         var3[var4 + this.field_33483 + 2 * var9] = this.field_33479[var9][0];
         var3[var4 + this.field_33483 + 2 + 2 * var9] = this.field_33479[1 + var9][0];
         var3[var4 + this.field_33483 + 1 + 2 * var9] = -this.field_33479[this.field_33483 - 1 - var9][1];
         var3[var4 + this.field_33483 + 3 + 2 * var9] = -this.field_33479[this.field_33483 - 2 - var9][1];
         var3[var4 + this.field_33482 + 2 * var9] = this.field_33479[this.field_33487 + var9][0];
         var3[var4 + this.field_33482 + 2 + 2 * var9] = this.field_33479[this.field_33487 + 1 + var9][0];
         var3[var4 + this.field_33482 + 1 + 2 * var9] = -this.field_33479[this.field_33487 - 1 - var9][1];
         var3[var4 + this.field_33482 + 3 + 2 * var9] = -this.field_33479[this.field_33487 - 2 - var9][1];
         var3[var4 + this.field_33482 + this.field_33483 + 2 * var9] = -this.field_33479[var9][1];
         var3[var4 + this.field_33482 + this.field_33483 + 2 + 2 * var9] = -this.field_33479[1 + var9][1];
         var3[var4 + this.field_33482 + this.field_33483 + 1 + 2 * var9] = this.field_33479[this.field_33483 - 1 - var9][0];
         var3[var4 + this.field_33482 + this.field_33483 + 3 + 2 * var9] = this.field_33479[this.field_33483 - 2 - var9][0];
      }
   }

   public void method_29997(float[] var1, float[] var2) {
      for (int var5 = 0; var5 < this.field_33487; var5++) {
         int var6 = var5 << 1;
         this.field_33485[0] = var1[this.field_33480 - this.field_33483 - 1 - var6] + var1[this.field_33480 - this.field_33483 + var6];
         this.field_33485[1] = var1[this.field_33483 + var6] - var1[this.field_33483 - 1 - var6];
         this.field_33479[var5][0] = this.field_33485[0] * this.field_33481[var5][0] + this.field_33485[1] * this.field_33481[var5][1];
         this.field_33479[var5][1] = this.field_33485[1] * this.field_33481[var5][0] - this.field_33485[0] * this.field_33481[var5][1];
         this.field_33479[var5][0] = this.field_33479[var5][0] * (float)this.field_33480;
         this.field_33479[var5][1] = this.field_33479[var5][1] * (float)this.field_33480;
         this.field_33485[0] = var1[this.field_33482 - 1 - var6] - var1[var6];
         this.field_33485[1] = var1[this.field_33482 + var6] + var1[this.field_33480 - 1 - var6];
         this.field_33479[var5 + this.field_33487][0] = this.field_33485[0] * this.field_33481[var5 + this.field_33487][0]
            + this.field_33485[1] * this.field_33481[var5 + this.field_33487][1];
         this.field_33479[var5 + this.field_33487][1] = this.field_33485[1] * this.field_33481[var5 + this.field_33487][0]
            - this.field_33485[0] * this.field_33481[var5 + this.field_33487][1];
         this.field_33479[var5 + this.field_33487][0] = this.field_33479[var5 + this.field_33487][0] * (float)this.field_33480;
         this.field_33479[var5 + this.field_33487][1] = this.field_33479[var5 + this.field_33487][1] * (float)this.field_33480;
      }

      this.field_33484.method_36906(this.field_33479, true);

      for (int var7 = 0; var7 < this.field_33483; var7++) {
         int var8 = var7 << 1;
         this.field_33485[0] = this.field_33479[var7][0] * this.field_33481[var7][0] + this.field_33479[var7][1] * this.field_33481[var7][1];
         this.field_33485[1] = this.field_33479[var7][1] * this.field_33481[var7][0] - this.field_33479[var7][0] * this.field_33481[var7][1];
         var2[var8] = -this.field_33485[0];
         var2[this.field_33482 - 1 - var8] = this.field_33485[1];
         var2[this.field_33482 + var8] = -this.field_33485[1];
         var2[this.field_33480 - 1 - var8] = this.field_33485[0];
      }
   }
}
