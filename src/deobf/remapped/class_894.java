package remapped;

public class class_894 implements Runnable {
   private static String[] field_4598;

   public class_894(class_4993 var1, int var2, int var3, int var4, int var5, float[][] var6, boolean var7) {
      this.field_4594 = var1;
      this.field_4592 = var2;
      this.field_4597 = var3;
      this.field_4596 = var4;
      this.field_4591 = var5;
      this.field_4595 = var6;
      this.field_4593 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field_4592];
      if (this.field_4597 != -1) {
         if (class_4993.method_22972(this.field_4594) <= 4 * this.field_4596) {
            if (class_4993.method_22972(this.field_4594) != 4 * this.field_4596) {
               if (class_4993.method_22972(this.field_4594) == 2 * this.field_4596) {
                  for (int var4 = 0; var4 < class_4993.method_22973(this.field_4594); var4++) {
                     int var6 = 2 * var4;
                     var3[var6] = this.field_4595[var4][2 * this.field_4591];
                     var3[var6 + 1] = this.field_4595[var4][2 * this.field_4591 + 1];
                  }

                  class_4993.method_22985(this.field_4594).method_24215(var3, 0, this.field_4593);

                  for (int var10 = 0; var10 < class_4993.method_22973(this.field_4594); var10++) {
                     int var22 = 2 * var10;
                     this.field_4595[var10][2 * this.field_4591] = var3[var22];
                     this.field_4595[var10][2 * this.field_4591 + 1] = var3[var22 + 1];
                  }
               }
            } else {
               for (int var11 = 0; var11 < class_4993.method_22973(this.field_4594); var11++) {
                  int var23 = 2 * var11;
                  int var7 = 2 * class_4993.method_22973(this.field_4594) + 2 * var11;
                  var3[var23] = this.field_4595[var11][4 * this.field_4591];
                  var3[var23 + 1] = this.field_4595[var11][4 * this.field_4591 + 1];
                  var3[var7] = this.field_4595[var11][4 * this.field_4591 + 2];
                  var3[var7 + 1] = this.field_4595[var11][4 * this.field_4591 + 3];
               }

               class_4993.method_22985(this.field_4594).method_24215(var3, 0, this.field_4593);
               class_4993.method_22985(this.field_4594).method_24215(var3, 2 * class_4993.method_22973(this.field_4594), this.field_4593);

               for (int var12 = 0; var12 < class_4993.method_22973(this.field_4594); var12++) {
                  int var24 = 2 * var12;
                  int var33 = 2 * class_4993.method_22973(this.field_4594) + 2 * var12;
                  this.field_4595[var12][4 * this.field_4591] = var3[var24];
                  this.field_4595[var12][4 * this.field_4591 + 1] = var3[var24 + 1];
                  this.field_4595[var12][4 * this.field_4591 + 2] = var3[var33];
                  this.field_4595[var12][4 * this.field_4591 + 3] = var3[var33 + 1];
               }
            }
         } else {
            for (int var13 = 8 * this.field_4591; var13 < class_4993.method_22972(this.field_4594); var13 += 8 * this.field_4596) {
               for (int var5 = 0; var5 < class_4993.method_22973(this.field_4594); var5++) {
                  int var25 = 2 * var5;
                  int var34 = 2 * class_4993.method_22973(this.field_4594) + 2 * var5;
                  int var8 = var34 + 2 * class_4993.method_22973(this.field_4594);
                  int var9 = var8 + 2 * class_4993.method_22973(this.field_4594);
                  var3[var25] = this.field_4595[var5][var13];
                  var3[var25 + 1] = this.field_4595[var5][var13 + 1];
                  var3[var34] = this.field_4595[var5][var13 + 2];
                  var3[var34 + 1] = this.field_4595[var5][var13 + 3];
                  var3[var8] = this.field_4595[var5][var13 + 4];
                  var3[var8 + 1] = this.field_4595[var5][var13 + 5];
                  var3[var9] = this.field_4595[var5][var13 + 6];
                  var3[var9 + 1] = this.field_4595[var5][var13 + 7];
               }

               class_4993.method_22985(this.field_4594).method_24215(var3, 0, this.field_4593);
               class_4993.method_22985(this.field_4594).method_24215(var3, 2 * class_4993.method_22973(this.field_4594), this.field_4593);
               class_4993.method_22985(this.field_4594).method_24215(var3, 4 * class_4993.method_22973(this.field_4594), this.field_4593);
               class_4993.method_22985(this.field_4594).method_24215(var3, 6 * class_4993.method_22973(this.field_4594), this.field_4593);

               for (int var19 = 0; var19 < class_4993.method_22973(this.field_4594); var19++) {
                  int var26 = 2 * var19;
                  int var35 = 2 * class_4993.method_22973(this.field_4594) + 2 * var19;
                  int var40 = var35 + 2 * class_4993.method_22973(this.field_4594);
                  int var43 = var40 + 2 * class_4993.method_22973(this.field_4594);
                  this.field_4595[var19][var13] = var3[var26];
                  this.field_4595[var19][var13 + 1] = var3[var26 + 1];
                  this.field_4595[var19][var13 + 2] = var3[var35];
                  this.field_4595[var19][var13 + 3] = var3[var35 + 1];
                  this.field_4595[var19][var13 + 4] = var3[var40];
                  this.field_4595[var19][var13 + 5] = var3[var40 + 1];
                  this.field_4595[var19][var13 + 6] = var3[var43];
                  this.field_4595[var19][var13 + 7] = var3[var43 + 1];
               }
            }
         }
      } else if (class_4993.method_22972(this.field_4594) <= 4 * this.field_4596) {
         if (class_4993.method_22972(this.field_4594) != 4 * this.field_4596) {
            if (class_4993.method_22972(this.field_4594) == 2 * this.field_4596) {
               for (int var14 = 0; var14 < class_4993.method_22973(this.field_4594); var14++) {
                  int var27 = 2 * var14;
                  var3[var27] = this.field_4595[var14][2 * this.field_4591];
                  var3[var27 + 1] = this.field_4595[var14][2 * this.field_4591 + 1];
               }

               class_4993.method_22985(this.field_4594).method_24186(var3, 0);

               for (int var15 = 0; var15 < class_4993.method_22973(this.field_4594); var15++) {
                  int var28 = 2 * var15;
                  this.field_4595[var15][2 * this.field_4591] = var3[var28];
                  this.field_4595[var15][2 * this.field_4591 + 1] = var3[var28 + 1];
               }
            }
         } else {
            for (int var16 = 0; var16 < class_4993.method_22973(this.field_4594); var16++) {
               int var29 = 2 * var16;
               int var36 = 2 * class_4993.method_22973(this.field_4594) + 2 * var16;
               var3[var29] = this.field_4595[var16][4 * this.field_4591];
               var3[var29 + 1] = this.field_4595[var16][4 * this.field_4591 + 1];
               var3[var36] = this.field_4595[var16][4 * this.field_4591 + 2];
               var3[var36 + 1] = this.field_4595[var16][4 * this.field_4591 + 3];
            }

            class_4993.method_22985(this.field_4594).method_24186(var3, 0);
            class_4993.method_22985(this.field_4594).method_24186(var3, 2 * class_4993.method_22973(this.field_4594));

            for (int var17 = 0; var17 < class_4993.method_22973(this.field_4594); var17++) {
               int var30 = 2 * var17;
               int var37 = 2 * class_4993.method_22973(this.field_4594) + 2 * var17;
               this.field_4595[var17][4 * this.field_4591] = var3[var30];
               this.field_4595[var17][4 * this.field_4591 + 1] = var3[var30 + 1];
               this.field_4595[var17][4 * this.field_4591 + 2] = var3[var37];
               this.field_4595[var17][4 * this.field_4591 + 3] = var3[var37 + 1];
            }
         }
      } else {
         for (int var18 = 8 * this.field_4591; var18 < class_4993.method_22972(this.field_4594); var18 += 8 * this.field_4596) {
            for (int var20 = 0; var20 < class_4993.method_22973(this.field_4594); var20++) {
               int var31 = 2 * var20;
               int var38 = 2 * class_4993.method_22973(this.field_4594) + 2 * var20;
               int var41 = var38 + 2 * class_4993.method_22973(this.field_4594);
               int var44 = var41 + 2 * class_4993.method_22973(this.field_4594);
               var3[var31] = this.field_4595[var20][var18];
               var3[var31 + 1] = this.field_4595[var20][var18 + 1];
               var3[var38] = this.field_4595[var20][var18 + 2];
               var3[var38 + 1] = this.field_4595[var20][var18 + 3];
               var3[var41] = this.field_4595[var20][var18 + 4];
               var3[var41 + 1] = this.field_4595[var20][var18 + 5];
               var3[var44] = this.field_4595[var20][var18 + 6];
               var3[var44 + 1] = this.field_4595[var20][var18 + 7];
            }

            class_4993.method_22985(this.field_4594).method_24186(var3, 0);
            class_4993.method_22985(this.field_4594).method_24186(var3, 2 * class_4993.method_22973(this.field_4594));
            class_4993.method_22985(this.field_4594).method_24186(var3, 4 * class_4993.method_22973(this.field_4594));
            class_4993.method_22985(this.field_4594).method_24186(var3, 6 * class_4993.method_22973(this.field_4594));

            for (int var21 = 0; var21 < class_4993.method_22973(this.field_4594); var21++) {
               int var32 = 2 * var21;
               int var39 = 2 * class_4993.method_22973(this.field_4594) + 2 * var21;
               int var42 = var39 + 2 * class_4993.method_22973(this.field_4594);
               int var45 = var42 + 2 * class_4993.method_22973(this.field_4594);
               this.field_4595[var21][var18] = var3[var32];
               this.field_4595[var21][var18 + 1] = var3[var32 + 1];
               this.field_4595[var21][var18 + 2] = var3[var39];
               this.field_4595[var21][var18 + 3] = var3[var39 + 1];
               this.field_4595[var21][var18 + 4] = var3[var42];
               this.field_4595[var21][var18 + 5] = var3[var42 + 1];
               this.field_4595[var21][var18 + 6] = var3[var45];
               this.field_4595[var21][var18 + 7] = var3[var45 + 1];
            }
         }
      }
   }
}
