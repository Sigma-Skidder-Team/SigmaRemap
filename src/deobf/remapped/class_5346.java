package remapped;

import net.sourceforge.jaad.aac.AACException;

public class class_5346 implements class_3471, class_8080, class_4183 {
   private static String[] field_27265;
   private final float[][] field_27268;
   private final float[][] field_27271;
   private final int field_27272;
   private final int field_27273;
   private final int field_27267;
   private final int field_27275;
   private final class_6563 field_27269;
   private final class_6563 field_27270;
   private final float[] field_27266;
   private final float[][] field_27274;

   public class_5346(boolean var1, int var2) throws AACException {
      if (!var1) {
         this.field_27272 = 1024;
         this.field_27273 = 128;
         this.field_27268 = new float[][]{field_41361, field_20364};
         this.field_27271 = new float[][]{field_41358, field_20361};
      } else {
         this.field_27272 = 960;
         this.field_27273 = 120;
         this.field_27268 = new float[][]{field_41360, field_20362};
         this.field_27271 = new float[][]{field_41359, field_20363};
      }

      this.field_27267 = (this.field_27272 - this.field_27273) / 2;
      this.field_27275 = this.field_27273 / 2;
      this.field_27269 = new class_6563(this.field_27273 * 2);
      this.field_27270 = new class_6563(this.field_27272 * 2);
      this.field_27274 = new float[var2][this.field_27272];
      this.field_27266 = new float[2 * this.field_27272];
   }

   public void method_24372(class_6954 var1, int var2, int var3, float[] var4, float[] var5, int var6) {
      float[] var9 = this.field_27274[var6];
      switch (var1) {
         case field_35755:
            this.field_27270.method_29999(var4, 0, this.field_27266, 0);

            for (int var23 = 0; var23 < this.field_27272; var23++) {
               var5[var23] = var9[var23] + this.field_27266[var23] * this.field_27268[var3][var23];
            }

            for (int var24 = 0; var24 < this.field_27272; var24++) {
               var9[var24] = this.field_27266[this.field_27272 + var24] * this.field_27268[var2][this.field_27272 - 1 - var24];
            }
            break;
         case field_35757:
            this.field_27270.method_29999(var4, 0, this.field_27266, 0);

            for (int var19 = 0; var19 < this.field_27272; var19++) {
               var5[var19] = var9[var19] + this.field_27266[var19] * this.field_27268[var3][var19];
            }

            for (int var20 = 0; var20 < this.field_27267; var20++) {
               var9[var20] = this.field_27266[this.field_27272 + var20];
            }

            for (int var21 = 0; var21 < this.field_27273; var21++) {
               var9[this.field_27267 + var21] = this.field_27266[this.field_27272 + this.field_27267 + var21]
                  * this.field_27271[var2][this.field_27273 - var21 - 1];
            }

            for (int var22 = 0; var22 < this.field_27267; var22++) {
               var9[this.field_27267 + this.field_27273 + var22] = 0.0F;
            }
            break;
         case field_35756:
            for (int var14 = 0; var14 < 8; var14++) {
               this.field_27269.method_29999(var4, var14 * this.field_27273, this.field_27266, 2 * var14 * this.field_27273);
            }

            for (int var15 = 0; var15 < this.field_27267; var15++) {
               var5[var15] = var9[var15];
            }

            for (int var16 = 0; var16 < this.field_27273; var16++) {
               var5[this.field_27267 + var16] = var9[this.field_27267 + var16] + this.field_27266[var16] * this.field_27271[var3][var16];
               var5[this.field_27267 + 1 * this.field_27273 + var16] = var9[this.field_27267 + this.field_27273 * 1 + var16]
                  + this.field_27266[this.field_27273 * 1 + var16] * this.field_27271[var2][this.field_27273 - 1 - var16]
                  + this.field_27266[this.field_27273 * 2 + var16] * this.field_27271[var2][var16];
               var5[this.field_27267 + 2 * this.field_27273 + var16] = var9[this.field_27267 + this.field_27273 * 2 + var16]
                  + this.field_27266[this.field_27273 * 3 + var16] * this.field_27271[var2][this.field_27273 - 1 - var16]
                  + this.field_27266[this.field_27273 * 4 + var16] * this.field_27271[var2][var16];
               var5[this.field_27267 + 3 * this.field_27273 + var16] = var9[this.field_27267 + this.field_27273 * 3 + var16]
                  + this.field_27266[this.field_27273 * 5 + var16] * this.field_27271[var2][this.field_27273 - 1 - var16]
                  + this.field_27266[this.field_27273 * 6 + var16] * this.field_27271[var2][var16];
               if (var16 < this.field_27275) {
                  var5[this.field_27267 + 4 * this.field_27273 + var16] = var9[this.field_27267 + this.field_27273 * 4 + var16]
                     + this.field_27266[this.field_27273 * 7 + var16] * this.field_27271[var2][this.field_27273 - 1 - var16]
                     + this.field_27266[this.field_27273 * 8 + var16] * this.field_27271[var2][var16];
               }
            }

            for (int var17 = 0; var17 < this.field_27273; var17++) {
               if (var17 >= this.field_27275) {
                  var9[this.field_27267 + 4 * this.field_27273 + var17 - this.field_27272] = this.field_27266[this.field_27273 * 7 + var17]
                        * this.field_27271[var2][this.field_27273 - 1 - var17]
                     + this.field_27266[this.field_27273 * 8 + var17] * this.field_27271[var2][var17];
               }

               var9[this.field_27267 + 5 * this.field_27273 + var17 - this.field_27272] = this.field_27266[this.field_27273 * 9 + var17]
                     * this.field_27271[var2][this.field_27273 - 1 - var17]
                  + this.field_27266[this.field_27273 * 10 + var17] * this.field_27271[var2][var17];
               var9[this.field_27267 + 6 * this.field_27273 + var17 - this.field_27272] = this.field_27266[this.field_27273 * 11 + var17]
                     * this.field_27271[var2][this.field_27273 - 1 - var17]
                  + this.field_27266[this.field_27273 * 12 + var17] * this.field_27271[var2][var17];
               var9[this.field_27267 + 7 * this.field_27273 + var17 - this.field_27272] = this.field_27266[this.field_27273 * 13 + var17]
                     * this.field_27271[var2][this.field_27273 - 1 - var17]
                  + this.field_27266[this.field_27273 * 14 + var17] * this.field_27271[var2][var17];
               var9[this.field_27267 + 8 * this.field_27273 + var17 - this.field_27272] = this.field_27266[this.field_27273 * 15 + var17]
                  * this.field_27271[var2][this.field_27273 - 1 - var17];
            }

            for (int var18 = 0; var18 < this.field_27267; var18++) {
               var9[this.field_27267 + this.field_27273 + var18] = 0.0F;
            }
            break;
         case field_35758:
            this.field_27270.method_29999(var4, 0, this.field_27266, 0);

            for (int var10 = 0; var10 < this.field_27267; var10++) {
               var5[var10] = var9[var10];
            }

            for (int var11 = 0; var11 < this.field_27273; var11++) {
               var5[this.field_27267 + var11] = var9[this.field_27267 + var11] + this.field_27266[this.field_27267 + var11] * this.field_27271[var3][var11];
            }

            for (int var12 = 0; var12 < this.field_27267; var12++) {
               var5[this.field_27267 + this.field_27273 + var12] = var9[this.field_27267 + this.field_27273 + var12]
                  + this.field_27266[this.field_27267 + this.field_27273 + var12];
            }

            for (int var13 = 0; var13 < this.field_27272; var13++) {
               var9[var13] = this.field_27266[this.field_27272 + var13] * this.field_27268[var2][this.field_27272 - 1 - var13];
            }
      }
   }

   public void method_24369(class_6954 var1, int var2, int var3, float[] var4, float[] var5) {
      switch (var1) {
         case field_35755:
            for (int var16 = this.field_27272 - 1; var16 >= 0; var16--) {
               this.field_27266[var16] = var4[var16] * this.field_27268[var3][var16];
               this.field_27266[var16 + this.field_27272] = var4[var16 + this.field_27272] * this.field_27268[var2][this.field_27272 - 1 - var16];
            }
            break;
         case field_35757:
            for (int var12 = 0; var12 < this.field_27272; var12++) {
               this.field_27266[var12] = var4[var12] * this.field_27268[var3][var12];
            }

            for (int var13 = 0; var13 < this.field_27267; var13++) {
               this.field_27266[var13 + this.field_27272] = var4[var13 + this.field_27272];
            }

            for (int var14 = 0; var14 < this.field_27273; var14++) {
               this.field_27266[var14 + this.field_27272 + this.field_27267] = var4[var14 + this.field_27272 + this.field_27267]
                  * this.field_27271[var2][this.field_27273 - 1 - var14];
            }

            for (int var15 = 0; var15 < this.field_27267; var15++) {
               this.field_27266[var15 + this.field_27272 + this.field_27267 + this.field_27273] = 0.0F;
            }
         case field_35756:
         default:
            break;
         case field_35758:
            for (int var8 = 0; var8 < this.field_27267; var8++) {
               this.field_27266[var8] = 0.0F;
            }

            for (int var9 = 0; var9 < this.field_27273; var9++) {
               this.field_27266[var9 + this.field_27267] = var4[var9 + this.field_27267] * this.field_27271[var3][var9];
            }

            for (int var10 = 0; var10 < this.field_27267; var10++) {
               this.field_27266[var10 + this.field_27267 + this.field_27273] = var4[var10 + this.field_27267 + this.field_27273];
            }

            for (int var11 = 0; var11 < this.field_27272; var11++) {
               this.field_27266[var11 + this.field_27272] = var4[var11 + this.field_27272] * this.field_27268[var2][this.field_27272 - 1 - var11];
            }
      }

      this.field_27270.method_29997(this.field_27266, var5);
   }

   public float[] method_24370(int var1) {
      return this.field_27274[var1];
   }
}
