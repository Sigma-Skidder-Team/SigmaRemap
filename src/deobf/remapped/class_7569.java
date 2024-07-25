package remapped;

import net.sourceforge.jaad.aac.AACException;

public class class_7569 extends class_7958 implements class_3471 {
   private static String[] field_38574;
   public static final int field_38568 = 0;
   public static final int field_38571 = 1;
   public static final int field_38578 = 2;
   private static final float[] field_38570 = new float[]{1.0905077F, 1.1892071F, 1.4142135F, 2.0F};
   private final class_9143 field_38577;
   private float[] field_38572;
   private int field_38575;
   private int field_38573;
   private final boolean[] field_38576;
   private final int[] field_38567;
   private final int[] field_38569;
   private final float[][] field_38579;

   public class_7569(int var1) {
      this.field_38577 = new class_9143(var1);
      this.field_38576 = new boolean[8];
      this.field_38567 = new int[8];
      this.field_38569 = new int[8];
      this.field_38579 = new float[16][120];
   }

   public int method_34415() {
      return this.field_38575;
   }

   public int method_34421() {
      return this.field_38573;
   }

   public boolean method_34419(int var1) {
      return this.field_38576[var1];
   }

   public int method_34422(int var1) {
      return this.field_38567[var1];
   }

   public int method_34418(int var1) {
      return this.field_38569[var1];
   }

   public void method_34420(class_7390 var1, class_6616 var2) throws AACException {
      this.field_38575 = 2 * var1.method_33655();
      this.field_38573 = var1.method_33662(3);
      int var5 = 0;

      for (int var6 = 0; var6 <= this.field_38573; var6++) {
         var5++;
         this.field_38576[var6] = var1.method_33660();
         this.field_38567[var6] = var1.method_33662(4);
         if (!this.field_38576[var6]) {
            this.field_38569[var6] = 2;
         } else {
            this.field_38569[var6] = var1.method_33662(2);
            if (this.field_38569[var6] == 3) {
               var5++;
            }
         }
      }

      this.field_38575 = this.field_38575 + var1.method_33655();
      this.field_38575 = this.field_38575 | this.field_38575 >> 1;
      boolean var7 = var1.method_33660();
      double var8 = (double)field_38570[var1.method_33662(2)];
      this.field_38577.method_42062(var1, false, var2);
      class_2568 var10 = this.field_38577.method_42072();
      int var11 = var10.method_11670();
      int var12 = var10.method_11671();
      int[][] var13 = (int[][])null;

      for (int var22 = 0; var22 < var5; var22++) {
         int var14 = 0;
         int var15 = 1;
         int var16 = 0;
         float var17 = 1.0F;
         if (var22 > 0) {
            var15 = this.field_38575 != 2 ? var1.method_33655() : 1;
            var16 = var15 != 0 ? class_4883.method_22401(var1) - 60 : 0;
            var17 = (float)Math.pow(var8, (double)(-var16));
         }

         if (this.field_38575 == 2) {
            this.field_38579[var22][0] = var17;
         } else {
            for (int var18 = 0; var18 < var11; var18++) {
               for (int var19 = 0; var19 < var12; var14++) {
                  if (var13[var18][var19] != 0) {
                     if (var15 == 0) {
                        int var20 = class_4883.method_22401(var1) - 60;
                        if (var20 != 0) {
                           int var21 = 1;
                           var20 = var16 += var20;
                           if (!var7) {
                              var21 -= 2 * (var20 & 1);
                              var20 >>= 1;
                           }

                           var17 = (float)(Math.pow(var8, (double)(-var20)) * (double)var21);
                        }
                     }

                     this.field_38579[var22][var14] = var17;
                  }

                  var19++;
               }
            }
         }
      }
   }

   public void method_34414() throws AACException {
      this.field_38572 = this.field_38577.method_42059();
   }

   public void method_34416(int var1, float[] var2) {
      double var5 = (double)this.field_38579[var1][0];

      for (int var7 = 0; var7 < var2.length; var7++) {
         var2[var7] = (float)((double)var2[var7] + var5 * (double)this.field_38572[var7]);
      }
   }

   public void method_34417(int var1, float[] var2) {
      class_2568 var5 = this.field_38577.method_42072();
      int[] var6 = var5.method_11674();
      int var7 = var5.method_11670();
      int var8 = var5.method_11671();
      int[][] var9 = (int[][])null;
      int var10 = 0;
      int var11 = 0;
      int var12 = 0;

      for (int var13 = 0; var13 < var7; var13++) {
         int var14 = var5.method_11665(var13);

         for (int var15 = 0; var15 < var8; var12++) {
            if (var9[var13][var15] != 0) {
               float var16 = this.field_38579[var1][var12];

               for (int var17 = 0; var17 < var14; var17++) {
                  for (int var18 = var6[var15]; var18 < var6[var15 + 1]; var18++) {
                     var2[var11 + var17 * 128 + var18] = var2[var11 + var17 * 128 + var18] + var16 * this.field_38572[var10 + var17 * 128 + var18];
                  }
               }
            }

            var15++;
         }

         var11 += var14 * 128;
         var10 += var14 * 128;
      }
   }
}
