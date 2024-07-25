package remapped;

public class class_4898 implements Runnable {
   private static String[] field_25315;

   public class_4898(class_573 var1, int var2, int var3, int var4, int var5, double[] var6, boolean var7) {
      this.field_25313 = var1;
      this.field_25309 = var2;
      this.field_25310 = var3;
      this.field_25314 = var4;
      this.field_25316 = var5;
      this.field_25311 = var6;
      this.field_25312 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field_25309];
      if (this.field_25310 != -1) {
         if (class_573.method_2730(this.field_25313) <= 2) {
            if (class_573.method_2730(this.field_25313) == 2) {
               for (int var4 = this.field_25314; var4 < class_573.method_2721(this.field_25313); var4 += this.field_25316) {
                  int var5 = var4 * class_573.method_2717(this.field_25313);

                  for (int var6 = 0; var6 < class_573.method_2716(this.field_25313); var6++) {
                     int var8 = var6 * class_573.method_2737(this.field_25313) + var5;
                     var3[var6] = this.field_25311[var8];
                     var3[class_573.method_2716(this.field_25313) + var6] = this.field_25311[var8 + 1];
                  }

                  class_573.method_2710(this.field_25313).method_44820(var3, 0, this.field_25312);
                  class_573.method_2710(this.field_25313).method_44820(var3, class_573.method_2716(this.field_25313), this.field_25312);

                  for (int var16 = 0; var16 < class_573.method_2716(this.field_25313); var16++) {
                     int var24 = var16 * class_573.method_2737(this.field_25313) + var5;
                     this.field_25311[var24] = var3[var16];
                     this.field_25311[var24 + 1] = var3[class_573.method_2716(this.field_25313) + var16];
                  }
               }
            }
         } else {
            for (int var10 = this.field_25314; var10 < class_573.method_2721(this.field_25313); var10 += this.field_25316) {
               int var13 = var10 * class_573.method_2717(this.field_25313);

               for (byte var17 = 0; var17 < class_573.method_2730(this.field_25313); var17 += 4) {
                  for (int var7 = 0; var7 < class_573.method_2716(this.field_25313); var7++) {
                     int var25 = var7 * class_573.method_2737(this.field_25313) + var13 + var17;
                     int var9 = class_573.method_2716(this.field_25313) + var7;
                     var3[var7] = this.field_25311[var25];
                     var3[var9] = this.field_25311[var25 + 1];
                     var3[var9 + class_573.method_2716(this.field_25313)] = this.field_25311[var25 + 2];
                     var3[var9 + 2 * class_573.method_2716(this.field_25313)] = this.field_25311[var25 + 3];
                  }

                  class_573.method_2710(this.field_25313).method_44820(var3, 0, this.field_25312);
                  class_573.method_2710(this.field_25313).method_44820(var3, class_573.method_2716(this.field_25313), this.field_25312);
                  class_573.method_2710(this.field_25313).method_44820(var3, 2 * class_573.method_2716(this.field_25313), this.field_25312);
                  class_573.method_2710(this.field_25313).method_44820(var3, 3 * class_573.method_2716(this.field_25313), this.field_25312);

                  for (int var21 = 0; var21 < class_573.method_2716(this.field_25313); var21++) {
                     int var26 = var21 * class_573.method_2737(this.field_25313) + var13 + var17;
                     int var31 = class_573.method_2716(this.field_25313) + var21;
                     this.field_25311[var26] = var3[var21];
                     this.field_25311[var26 + 1] = var3[var31];
                     this.field_25311[var26 + 2] = var3[var31 + class_573.method_2716(this.field_25313)];
                     this.field_25311[var26 + 3] = var3[var31 + 2 * class_573.method_2716(this.field_25313)];
                  }
               }
            }
         }
      } else if (class_573.method_2730(this.field_25313) <= 2) {
         if (class_573.method_2730(this.field_25313) == 2) {
            for (int var11 = this.field_25314; var11 < class_573.method_2721(this.field_25313); var11 += this.field_25316) {
               int var14 = var11 * class_573.method_2717(this.field_25313);

               for (int var18 = 0; var18 < class_573.method_2716(this.field_25313); var18++) {
                  int var27 = var18 * class_573.method_2737(this.field_25313) + var14;
                  var3[var18] = this.field_25311[var27];
                  var3[class_573.method_2716(this.field_25313) + var18] = this.field_25311[var27 + 1];
               }

               class_573.method_2710(this.field_25313).method_44815(var3, 0, this.field_25312);
               class_573.method_2710(this.field_25313).method_44815(var3, class_573.method_2716(this.field_25313), this.field_25312);

               for (int var19 = 0; var19 < class_573.method_2716(this.field_25313); var19++) {
                  int var28 = var19 * class_573.method_2737(this.field_25313) + var14;
                  this.field_25311[var28] = var3[var19];
                  this.field_25311[var28 + 1] = var3[class_573.method_2716(this.field_25313) + var19];
               }
            }
         }
      } else {
         for (int var12 = this.field_25314; var12 < class_573.method_2721(this.field_25313); var12 += this.field_25316) {
            int var15 = var12 * class_573.method_2717(this.field_25313);

            for (byte var20 = 0; var20 < class_573.method_2730(this.field_25313); var20 += 4) {
               for (int var22 = 0; var22 < class_573.method_2716(this.field_25313); var22++) {
                  int var29 = var22 * class_573.method_2737(this.field_25313) + var15 + var20;
                  int var32 = class_573.method_2716(this.field_25313) + var22;
                  var3[var22] = this.field_25311[var29];
                  var3[var32] = this.field_25311[var29 + 1];
                  var3[var32 + class_573.method_2716(this.field_25313)] = this.field_25311[var29 + 2];
                  var3[var32 + 2 * class_573.method_2716(this.field_25313)] = this.field_25311[var29 + 3];
               }

               class_573.method_2710(this.field_25313).method_44815(var3, 0, this.field_25312);
               class_573.method_2710(this.field_25313).method_44815(var3, class_573.method_2716(this.field_25313), this.field_25312);
               class_573.method_2710(this.field_25313).method_44815(var3, 2 * class_573.method_2716(this.field_25313), this.field_25312);
               class_573.method_2710(this.field_25313).method_44815(var3, 3 * class_573.method_2716(this.field_25313), this.field_25312);

               for (int var23 = 0; var23 < class_573.method_2716(this.field_25313); var23++) {
                  int var30 = var23 * class_573.method_2737(this.field_25313) + var15 + var20;
                  int var33 = class_573.method_2716(this.field_25313) + var23;
                  this.field_25311[var30] = var3[var23];
                  this.field_25311[var30 + 1] = var3[var33];
                  this.field_25311[var30 + 2] = var3[var33 + class_573.method_2716(this.field_25313)];
                  this.field_25311[var30 + 3] = var3[var33 + 2 * class_573.method_2716(this.field_25313)];
               }
            }
         }
      }
   }
}
