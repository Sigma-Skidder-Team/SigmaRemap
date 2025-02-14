package mapped;

import java.util.Arrays;

public class Class7643 implements Class7642 {
   private static String[] field32724;
   private float[] field32725;
   private int field32726;
   private int field32727;

   public Class7643(int var1) {
      this.field32727 = var1;
      this.field32725 = new float[2 * var1 * 10];
      this.field32726 = 0;
   }

   public void method25107() {
      Arrays.fill(this.field32725, 0.0F);
   }

   public void method25108(Class6528 var1, float[] var2, float[][][] var3, int var4, int var5) {
      float[] var8 = new float[64];
      float[] var9 = new float[32];
      float[] var10 = new float[32];
      float[] var11 = new float[32];
      float[] var12 = new float[32];
      int var13 = 0;

      for (int var14 = 0; var14 < var1.field28728; var14++) {
         for (int var15 = 31; var15 >= 0; var15--) {
            this.field32725[this.field32726 + var15] = this.field32725[this.field32726 + var15 + 320] = var2[var13++];
         }

         for (int var16 = 0; var16 < 64; var16++) {
            var8[var16] = this.field32725[this.field32726 + var16] * field32723[2 * var16]
               + this.field32725[this.field32726 + var16 + 64] * field32723[2 * (var16 + 64)]
               + this.field32725[this.field32726 + var16 + 128] * field32723[2 * (var16 + 128)]
               + this.field32725[this.field32726 + var16 + 192] * field32723[2 * (var16 + 192)]
               + this.field32725[this.field32726 + var16 + 256] * field32723[2 * (var16 + 256)];
         }

         this.field32726 -= 32;
         if (this.field32726 < 0) {
            this.field32726 = 288;
         }

         var10[31] = var8[1];
         var9[0] = var8[0];

         for (int var17 = 1; var17 < 31; var17++) {
            var10[31 - var17] = var8[var17 + 1];
            var9[var17] = -var8[64 - var17];
         }

         var10[0] = var8[32];
         var9[31] = -var8[33];
         Class6745.method20560(var9, var10, var11, var12);

         for (int var18 = 0; var18 < 16; var18++) {
            if (2 * var18 + 1 >= var5) {
               if (2 * var18 >= var5) {
                  var3[var14 + var4][2 * var18][0] = 0.0F;
                  var3[var14 + var4][2 * var18][1] = 0.0F;
               } else {
                  var3[var14 + var4][2 * var18][0] = 2.0F * var11[var18];
                  var3[var14 + var4][2 * var18][1] = 2.0F * var12[var18];
               }

               var3[var14 + var4][2 * var18 + 1][0] = 0.0F;
               var3[var14 + var4][2 * var18 + 1][1] = 0.0F;
            } else {
               var3[var14 + var4][2 * var18][0] = 2.0F * var11[var18];
               var3[var14 + var4][2 * var18][1] = 2.0F * var12[var18];
               var3[var14 + var4][2 * var18 + 1][0] = -2.0F * var12[31 - var18];
               var3[var14 + var4][2 * var18 + 1][1] = -2.0F * var11[31 - var18];
            }
         }
      }
   }
}
