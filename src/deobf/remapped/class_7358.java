package remapped;

import java.util.Arrays;

public class class_7358 implements class_2348 {
   private static String[] field_37612;
   private float[] field_37614;
   private int field_37611;
   private int field_37613;

   public class_7358(int var1) {
      this.field_37613 = var1;
      this.field_37614 = new float[2 * var1 * 10];
      this.field_37611 = 0;
   }

   public void method_33518() {
      Arrays.fill(this.field_37614, 0.0F);
   }

   public void method_33519(class_8470 var1, float[] var2, float[][][] var3, int var4, int var5) {
      float[] var8 = new float[64];
      float[] var9 = new float[32];
      float[] var10 = new float[32];
      float[] var11 = new float[32];
      float[] var12 = new float[32];
      int var13 = 0;

      for (int var14 = 0; var14 < var1.field_43294; var14++) {
         for (int var15 = 31; var15 >= 0; var15--) {
            this.field_37614[this.field_37611 + var15] = this.field_37614[this.field_37611 + var15 + 320] = var2[var13++];
         }

         for (int var16 = 0; var16 < 64; var16++) {
            var8[var16] = this.field_37614[this.field_37611 + var16] * field_11722[2 * var16]
               + this.field_37614[this.field_37611 + var16 + 64] * field_11722[2 * (var16 + 64)]
               + this.field_37614[this.field_37611 + var16 + 128] * field_11722[2 * (var16 + 128)]
               + this.field_37614[this.field_37611 + var16 + 192] * field_11722[2 * (var16 + 192)]
               + this.field_37614[this.field_37611 + var16 + 256] * field_11722[2 * (var16 + 256)];
         }

         this.field_37611 -= 32;
         if (this.field_37611 < 0) {
            this.field_37611 = 288;
         }

         var10[31] = var8[1];
         var9[0] = var8[0];

         for (int var17 = 1; var17 < 31; var17++) {
            var10[31 - var17] = var8[var17 + 1];
            var9[var17] = -var8[64 - var17];
         }

         var10[0] = var8[32];
         var9[31] = -var8[33];
         class_901.method_3862(var9, var10, var11, var12);

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
