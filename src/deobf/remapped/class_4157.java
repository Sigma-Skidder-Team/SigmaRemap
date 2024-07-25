package remapped;

import java.util.Arrays;
import net.sourceforge.jaad.aac.AACException;

public class class_4157 implements class_7623 {
   private static String[] field_20208;
   private final int field_20220;
   private final int field_20211;
   private final int field_20216;
   private final class_8809 field_20215;
   private final class_4303 field_20210;
   private final float[] field_20219;
   private final float[] field_20207;
   private final float[][] field_20214;
   private final float[][] field_20221;
   private int field_20217;
   private int[][][] field_20218;
   private int[][][] field_20209;
   private int[][][] field_20213;
   private int[][][] field_20212;

   public class_4157(int var1) {
      this.field_20220 = var1;
      this.field_20211 = var1 / 4;
      this.field_20216 = this.field_20211 / 8;
      this.field_20215 = new class_8809(var1);
      this.field_20210 = new class_4303();
      this.field_20209 = new int[0][][];
      this.field_20212 = new int[0][][];
      this.field_20219 = new float[var1 / 2];
      this.field_20214 = new float[4][this.field_20211];
      this.field_20207 = new float[this.field_20211 * 2];
      this.field_20221 = new float[4][this.field_20211 * 2];
   }

   public void method_19282(class_7390 var1, class_6954 var2) throws AACException {
      this.field_20217 = var1.method_33662(2) + 1;
      byte var5 = 0;
      byte var6;
      byte var7;
      switch (var2) {
         case field_35755:
            var6 = 1;
            var7 = 5;
            var5 = 5;
            break;
         case field_35756:
            var6 = 8;
            var7 = 2;
            var5 = 2;
            break;
         case field_35757:
            var6 = 2;
            var7 = 4;
            var5 = 2;
            break;
         case field_35758:
            var6 = 2;
            var7 = 4;
            var5 = 5;
            break;
         default:
            return;
      }

      this.field_20218 = new int[this.field_20217][var6][];
      this.field_20213 = new int[this.field_20217][var6][];

      for (int var8 = 1; var8 < this.field_20217; var8++) {
         for (int var9 = 0; var9 < var6; var9++) {
            int var10 = var1.method_33662(3);
            this.field_20218[var8][var9] = new int[var10];
            this.field_20213[var8][var9] = new int[var10];

            for (int var11 = 0; var11 < var10; var11++) {
               this.field_20218[var8][var9][var11] = var1.method_33662(4);
               byte var12 = var9 == 0 ? var7 : var5;
               this.field_20213[var8][var9][var11] = var1.method_33662(var12);
            }
         }
      }
   }

   public void method_19284(float[] var1, int var2, int var3, class_6954 var4) throws AACException {
      this.field_20215.method_40484(var1, this.field_20219, var2, var3, var4);

      for (int var7 = 0; var7 < 4; var7++) {
         this.method_19285(this.field_20219, this.field_20214, var4, var7);
      }

      this.field_20210.method_19971(this.field_20214, this.field_20220, this.field_20217, var1);
   }

   private void method_19285(float[] var1, float[][] var2, class_6954 var3, int var4) {
      if (!var3.equals(class_6954.field_35756)) {
         this.method_19279(this.field_20211 * 2, var4, var3, 0);

         for (int var7 = 0; var7 < this.field_20211 * 2; var7++) {
            var1[var4 * this.field_20211 * 2 + var7] = var1[var4 * this.field_20211 * 2 + var7] * this.field_20207[var7];
         }

         for (int var11 = 0; var11 < this.field_20211; var11++) {
            var2[var4][var11] = this.field_20221[var4][var11] + var1[var4 * this.field_20211 * 2 + var11];
         }

         for (int var12 = 0; var12 < this.field_20211; var12++) {
            this.field_20221[var4][var12] = var1[var4 * this.field_20211 * 2 + this.field_20211 + var12];
         }

         int var9 = !var3.equals(class_6954.field_35755) ? 0 : 1;
         this.field_20212[var4][0] = Arrays.copyOf(this.field_20213[var4][var9], this.field_20213[var4][var9].length);
         this.field_20209[var4][0] = Arrays.copyOf(this.field_20218[var4][var9], this.field_20218[var4][var9].length);
      } else {
         for (int var8 = 0; var8 < 8; var8++) {
            this.method_19279(this.field_20216 * 2, var4, var3, var8);

            for (int var13 = 0; var13 < this.field_20216 * 2; var13++) {
               int var16 = var4 * this.field_20211 * 2 + var8 * this.field_20216 * 2 + var13;
               var1[var16] *= this.field_20207[var13];
            }

            for (int var14 = 0; var14 < this.field_20216; var14++) {
               int var17 = var14 + this.field_20211 * 7 / 16 + this.field_20216 * var8;
               int var10 = var4 * this.field_20211 * 2 + var8 * this.field_20216 * 2 + var14;
               this.field_20221[var4][var17] = this.field_20221[var4][var17] + var1[var10];
            }

            for (int var15 = 0; var15 < this.field_20216; var15++) {
               int var18 = var15 + this.field_20211 * 7 / 16 + this.field_20216 * (var8 + 1);
               int var19 = var4 * this.field_20211 * 2 + var8 * this.field_20216 * 2 + this.field_20216 + var15;
               this.field_20221[var4][var18] = var1[var19];
            }

            this.field_20212[var4][0] = Arrays.copyOf(this.field_20213[var4][var8], this.field_20213[var4][var8].length);
            this.field_20209[var4][0] = Arrays.copyOf(this.field_20218[var4][var8], this.field_20218[var4][var8].length);
         }

         System.arraycopy(this.field_20221[var4], 0, var2[var4], 0, this.field_20211);
         System.arraycopy(this.field_20221[var4], this.field_20211, this.field_20221[var4], 0, this.field_20211);
      }
   }

   private void method_19279(int var1, int var2, class_6954 var3, int var4) {
      int[] var7 = new int[10];
      float[] var8 = new float[10];
      float[] var9 = new float[var1];
      float[] var10 = new float[var1 / 2];
      float[] var11 = new float[var1 / 2];
      float[] var12 = new float[var1 / 2];
      int var13 = 0;
      int var14 = 0;
      int var15 = 0;
      switch (var3) {
         case field_35755:
         case field_35756:
            var13 = var14 = var1 / 2;
            var15 = 0;
            break;
         case field_35757:
            var13 = var1 / 2;
            var14 = var1 * 7 / 32;
            var15 = var1 / 16;
            break;
         case field_35758:
            var13 = var1 / 16;
            var14 = var1 * 7 / 32;
            var15 = var1 / 2;
      }

      this.method_19281(var2, 0, true, var13, var1, var7, var8, var10);
      int var16 = var3.equals(class_6954.field_35756) ? var4 : 0;
      float var17 = this.method_19281(var2, var16, false, var14, var1, var7, var8, var11);
      if (var3.equals(class_6954.field_35757) || var3.equals(class_6954.field_35758)) {
         this.method_19281(var2, 1, false, var15, var1, var7, var8, var12);
      }

      int var18 = 0;
      if (var3.equals(class_6954.field_35758)) {
         var18 = var1 / 2 - var13 - var14;

         for (int var19 = 0; var19 < var18; var19++) {
            var9[var19] = 1.0F;
         }
      }

      if (var3.equals(class_6954.field_35755) || var3.equals(class_6954.field_35756)) {
         var8[0] = 1.0F;
      }

      for (int var21 = 0; var21 < var13; var21++) {
         var9[var21 + var18] = var8[0] * var17 * var10[var21];
      }

      for (int var22 = 0; var22 < var14; var22++) {
         var9[var22 + var18 + var13] = var8[0] * var11[var22];
      }

      if (var3.equals(class_6954.field_35757)) {
         for (int var23 = 0; var23 < var15; var23++) {
            var9[var23 + var13 + var14] = var12[var23];
         }

         var18 = var1 / 2 - var14 - var15;

         for (int var24 = 0; var24 < var18; var24++) {
            var9[var24 + var13 + var14 + var15] = 1.0F;
         }
      } else if (var3.equals(class_6954.field_35758)) {
         for (int var25 = 0; var25 < var15; var25++) {
            var9[var25 + var18 + var13 + var14] = var12[var25];
         }
      }

      for (int var26 = 0; var26 < var1; var26++) {
         this.field_20207[var26] = 1.0F / var9[var26];
      }
   }

   private float method_19281(int var1, int var2, boolean var3, int var4, int var5, int[] var6, float[] var7, float[] var8) {
      int[] var11 = new int[var5 / 2];
      int[] var12 = !var3 ? this.field_20213[var1][var2] : this.field_20212[var1][var2];
      int[] var13 = !var3 ? this.field_20218[var1][var2] : this.field_20209[var1][var2];
      int var14 = var12.length;

      for (int var15 = 0; var15 < var14; var15++) {
         var6[var15 + 1] = 8 * var12[var15];
         int var16 = this.method_19283(var13[var15]);
         if (var16 >= 0) {
            var7[var15 + 1] = (float)Math.pow(2.0, (double)var16);
         } else {
            var7[var15 + 1] = 1.0F / (float)Math.pow(2.0, (double)(-var16));
         }
      }

      var6[0] = 0;
      if (var14 != 0) {
         var7[0] = var7[1];
      } else {
         var7[0] = 1.0F;
      }

      float var17 = var7[0];
      var6[var14 + 1] = var4;
      var7[var14 + 1] = 1.0F;

      for (int var19 = 0; var19 < var4; var19++) {
         var11[var19] = 0;

         for (int var18 = 0; var18 <= var14 + 1; var18++) {
            if (var6[var18] <= var19) {
               var11[var19] = var18;
            }
         }
      }

      for (int var20 = 0; var20 < var4; var20++) {
         if (var20 >= var6[var11[var20]] && var20 <= var6[var11[var20]] + 7) {
            var8[var20] = this.method_19280(var7[var11[var20]], var7[var11[var20] + 1], var20 - var6[var11[var20]]);
         } else {
            var8[var20] = var7[var11[var20] + 1];
         }
      }

      return var17;
   }

   private int method_19283(int var1) {
      for (int var4 = 0; var4 < 16; var4++) {
         if (var1 == field_38782[var4]) {
            return var4;
         }
      }

      return 0;
   }

   private float method_19280(float var1, float var2, int var3) {
      float var6 = (float)(Math.log((double)var1) / Math.log(2.0));
      float var7 = (float)(Math.log((double)var2) / Math.log(2.0));
      return (float)Math.pow(2.0, (double)(((float)(8 - var3) * var6 + (float)var3 * var7) / 8.0F));
   }
}
