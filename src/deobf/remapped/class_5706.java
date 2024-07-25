package remapped;

public class class_5706 implements Runnable {
   private static String[] field_28874;

   public class_5706(class_4993 var1, int var2, int var3, int var4, int var5, float[] var6, boolean var7) {
      this.field_28867 = var1;
      this.field_28873 = var2;
      this.field_28869 = var3;
      this.field_28872 = var4;
      this.field_28868 = var5;
      this.field_28870 = var6;
      this.field_28871 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field_28873];
      if (this.field_28869 != -1) {
         if (class_4993.method_22972(this.field_28867) <= 4 * this.field_28872) {
            if (class_4993.method_22972(this.field_28867) != 4 * this.field_28872) {
               if (class_4993.method_22972(this.field_28867) == 2 * this.field_28872) {
                  for (int var4 = 0; var4 < class_4993.method_22973(this.field_28867); var4++) {
                     int var6 = var4 * class_4993.method_22972(this.field_28867) + 2 * this.field_28868;
                     int var7 = 2 * var4;
                     var3[var7] = this.field_28870[var6];
                     var3[var7 + 1] = this.field_28870[var6 + 1];
                  }

                  class_4993.method_22985(this.field_28867).method_24215(var3, 0, this.field_28871);

                  for (int var11 = 0; var11 < class_4993.method_22973(this.field_28867); var11++) {
                     int var23 = var11 * class_4993.method_22972(this.field_28867) + 2 * this.field_28868;
                     int var34 = 2 * var11;
                     this.field_28870[var23] = var3[var34];
                     this.field_28870[var23 + 1] = var3[var34 + 1];
                  }
               }
            } else {
               for (int var12 = 0; var12 < class_4993.method_22973(this.field_28867); var12++) {
                  int var24 = var12 * class_4993.method_22972(this.field_28867) + 4 * this.field_28868;
                  int var35 = 2 * var12;
                  int var8 = 2 * class_4993.method_22973(this.field_28867) + 2 * var12;
                  var3[var35] = this.field_28870[var24];
                  var3[var35 + 1] = this.field_28870[var24 + 1];
                  var3[var8] = this.field_28870[var24 + 2];
                  var3[var8 + 1] = this.field_28870[var24 + 3];
               }

               class_4993.method_22985(this.field_28867).method_24215(var3, 0, this.field_28871);
               class_4993.method_22985(this.field_28867).method_24215(var3, 2 * class_4993.method_22973(this.field_28867), this.field_28871);

               for (int var13 = 0; var13 < class_4993.method_22973(this.field_28867); var13++) {
                  int var25 = var13 * class_4993.method_22972(this.field_28867) + 4 * this.field_28868;
                  int var36 = 2 * var13;
                  int var45 = 2 * class_4993.method_22973(this.field_28867) + 2 * var13;
                  this.field_28870[var25] = var3[var36];
                  this.field_28870[var25 + 1] = var3[var36 + 1];
                  this.field_28870[var25 + 2] = var3[var45];
                  this.field_28870[var25 + 3] = var3[var45 + 1];
               }
            }
         } else {
            for (int var14 = 8 * this.field_28868; var14 < class_4993.method_22972(this.field_28867); var14 += 8 * this.field_28872) {
               for (int var5 = 0; var5 < class_4993.method_22973(this.field_28867); var5++) {
                  int var26 = var5 * class_4993.method_22972(this.field_28867) + var14;
                  int var37 = 2 * var5;
                  int var46 = 2 * class_4993.method_22973(this.field_28867) + 2 * var5;
                  int var9 = var46 + 2 * class_4993.method_22973(this.field_28867);
                  int var10 = var9 + 2 * class_4993.method_22973(this.field_28867);
                  var3[var37] = this.field_28870[var26];
                  var3[var37 + 1] = this.field_28870[var26 + 1];
                  var3[var46] = this.field_28870[var26 + 2];
                  var3[var46 + 1] = this.field_28870[var26 + 3];
                  var3[var9] = this.field_28870[var26 + 4];
                  var3[var9 + 1] = this.field_28870[var26 + 5];
                  var3[var10] = this.field_28870[var26 + 6];
                  var3[var10 + 1] = this.field_28870[var26 + 7];
               }

               class_4993.method_22985(this.field_28867).method_24215(var3, 0, this.field_28871);
               class_4993.method_22985(this.field_28867).method_24215(var3, 2 * class_4993.method_22973(this.field_28867), this.field_28871);
               class_4993.method_22985(this.field_28867).method_24215(var3, 4 * class_4993.method_22973(this.field_28867), this.field_28871);
               class_4993.method_22985(this.field_28867).method_24215(var3, 6 * class_4993.method_22973(this.field_28867), this.field_28871);

               for (int var20 = 0; var20 < class_4993.method_22973(this.field_28867); var20++) {
                  int var27 = var20 * class_4993.method_22972(this.field_28867) + var14;
                  int var38 = 2 * var20;
                  int var47 = 2 * class_4993.method_22973(this.field_28867) + 2 * var20;
                  int var52 = var47 + 2 * class_4993.method_22973(this.field_28867);
                  int var55 = var52 + 2 * class_4993.method_22973(this.field_28867);
                  this.field_28870[var27] = var3[var38];
                  this.field_28870[var27 + 1] = var3[var38 + 1];
                  this.field_28870[var27 + 2] = var3[var47];
                  this.field_28870[var27 + 3] = var3[var47 + 1];
                  this.field_28870[var27 + 4] = var3[var52];
                  this.field_28870[var27 + 5] = var3[var52 + 1];
                  this.field_28870[var27 + 6] = var3[var55];
                  this.field_28870[var27 + 7] = var3[var55 + 1];
               }
            }
         }
      } else if (class_4993.method_22972(this.field_28867) <= 4 * this.field_28872) {
         if (class_4993.method_22972(this.field_28867) != 4 * this.field_28872) {
            if (class_4993.method_22972(this.field_28867) == 2 * this.field_28872) {
               for (int var15 = 0; var15 < class_4993.method_22973(this.field_28867); var15++) {
                  int var28 = var15 * class_4993.method_22972(this.field_28867) + 2 * this.field_28868;
                  int var39 = 2 * var15;
                  var3[var39] = this.field_28870[var28];
                  var3[var39 + 1] = this.field_28870[var28 + 1];
               }

               class_4993.method_22985(this.field_28867).method_24186(var3, 0);

               for (int var16 = 0; var16 < class_4993.method_22973(this.field_28867); var16++) {
                  int var29 = var16 * class_4993.method_22972(this.field_28867) + 2 * this.field_28868;
                  int var40 = 2 * var16;
                  this.field_28870[var29] = var3[var40];
                  this.field_28870[var29 + 1] = var3[var40 + 1];
               }
            }
         } else {
            for (int var17 = 0; var17 < class_4993.method_22973(this.field_28867); var17++) {
               int var30 = var17 * class_4993.method_22972(this.field_28867) + 4 * this.field_28868;
               int var41 = 2 * var17;
               int var48 = 2 * class_4993.method_22973(this.field_28867) + 2 * var17;
               var3[var41] = this.field_28870[var30];
               var3[var41 + 1] = this.field_28870[var30 + 1];
               var3[var48] = this.field_28870[var30 + 2];
               var3[var48 + 1] = this.field_28870[var30 + 3];
            }

            class_4993.method_22985(this.field_28867).method_24186(var3, 0);
            class_4993.method_22985(this.field_28867).method_24186(var3, 2 * class_4993.method_22973(this.field_28867));

            for (int var18 = 0; var18 < class_4993.method_22973(this.field_28867); var18++) {
               int var31 = var18 * class_4993.method_22972(this.field_28867) + 4 * this.field_28868;
               int var42 = 2 * var18;
               int var49 = 2 * class_4993.method_22973(this.field_28867) + 2 * var18;
               this.field_28870[var31] = var3[var42];
               this.field_28870[var31 + 1] = var3[var42 + 1];
               this.field_28870[var31 + 2] = var3[var49];
               this.field_28870[var31 + 3] = var3[var49 + 1];
            }
         }
      } else {
         for (int var19 = 8 * this.field_28868; var19 < class_4993.method_22972(this.field_28867); var19 += 8 * this.field_28872) {
            for (int var21 = 0; var21 < class_4993.method_22973(this.field_28867); var21++) {
               int var32 = var21 * class_4993.method_22972(this.field_28867) + var19;
               int var43 = 2 * var21;
               int var50 = 2 * class_4993.method_22973(this.field_28867) + 2 * var21;
               int var53 = var50 + 2 * class_4993.method_22973(this.field_28867);
               int var56 = var53 + 2 * class_4993.method_22973(this.field_28867);
               var3[var43] = this.field_28870[var32];
               var3[var43 + 1] = this.field_28870[var32 + 1];
               var3[var50] = this.field_28870[var32 + 2];
               var3[var50 + 1] = this.field_28870[var32 + 3];
               var3[var53] = this.field_28870[var32 + 4];
               var3[var53 + 1] = this.field_28870[var32 + 5];
               var3[var56] = this.field_28870[var32 + 6];
               var3[var56 + 1] = this.field_28870[var32 + 7];
            }

            class_4993.method_22985(this.field_28867).method_24186(var3, 0);
            class_4993.method_22985(this.field_28867).method_24186(var3, 2 * class_4993.method_22973(this.field_28867));
            class_4993.method_22985(this.field_28867).method_24186(var3, 4 * class_4993.method_22973(this.field_28867));
            class_4993.method_22985(this.field_28867).method_24186(var3, 6 * class_4993.method_22973(this.field_28867));

            for (int var22 = 0; var22 < class_4993.method_22973(this.field_28867); var22++) {
               int var33 = var22 * class_4993.method_22972(this.field_28867) + var19;
               int var44 = 2 * var22;
               int var51 = 2 * class_4993.method_22973(this.field_28867) + 2 * var22;
               int var54 = var51 + 2 * class_4993.method_22973(this.field_28867);
               int var57 = var54 + 2 * class_4993.method_22973(this.field_28867);
               this.field_28870[var33] = var3[var44];
               this.field_28870[var33 + 1] = var3[var44 + 1];
               this.field_28870[var33 + 2] = var3[var51];
               this.field_28870[var33 + 3] = var3[var51 + 1];
               this.field_28870[var33 + 4] = var3[var54];
               this.field_28870[var33 + 5] = var3[var54 + 1];
               this.field_28870[var33 + 6] = var3[var57];
               this.field_28870[var33 + 7] = var3[var57 + 1];
            }
         }
      }
   }
}
