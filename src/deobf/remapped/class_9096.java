package remapped;

public class class_9096 implements Runnable {
   private static String[] field_46598;

   public class_9096(class_3803 var1, int var2, int var3, int var4, int var5, float[] var6, boolean var7) {
      this.field_46599 = var1;
      this.field_46592 = var2;
      this.field_46596 = var3;
      this.field_46594 = var4;
      this.field_46597 = var5;
      this.field_46595 = var6;
      this.field_46593 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field_46592];
      if (this.field_46596 != -1) {
         if (class_3803.method_17715(this.field_46599) <= 2) {
            if (class_3803.method_17715(this.field_46599) == 2) {
               for (int var4 = this.field_46594; var4 < class_3803.method_17681(this.field_46599); var4 += this.field_46597) {
                  int var5 = var4 * class_3803.method_17685(this.field_46599);

                  for (int var6 = 0; var6 < class_3803.method_17688(this.field_46599); var6++) {
                     int var8 = var6 * class_3803.method_17689(this.field_46599) + var5;
                     var3[var6] = this.field_46595[var8];
                     var3[class_3803.method_17688(this.field_46599) + var6] = this.field_46595[var8 + 1];
                  }

                  class_3803.method_17699(this.field_46599).method_17789(var3, 0, this.field_46593);
                  class_3803.method_17699(this.field_46599).method_17789(var3, class_3803.method_17688(this.field_46599), this.field_46593);

                  for (int var16 = 0; var16 < class_3803.method_17688(this.field_46599); var16++) {
                     int var24 = var16 * class_3803.method_17689(this.field_46599) + var5;
                     this.field_46595[var24] = var3[var16];
                     this.field_46595[var24 + 1] = var3[class_3803.method_17688(this.field_46599) + var16];
                  }
               }
            }
         } else {
            for (int var10 = this.field_46594; var10 < class_3803.method_17681(this.field_46599); var10 += this.field_46597) {
               int var13 = var10 * class_3803.method_17685(this.field_46599);

               for (byte var17 = 0; var17 < class_3803.method_17715(this.field_46599); var17 += 4) {
                  for (int var7 = 0; var7 < class_3803.method_17688(this.field_46599); var7++) {
                     int var25 = var7 * class_3803.method_17689(this.field_46599) + var13 + var17;
                     int var9 = class_3803.method_17688(this.field_46599) + var7;
                     var3[var7] = this.field_46595[var25];
                     var3[var9] = this.field_46595[var25 + 1];
                     var3[var9 + class_3803.method_17688(this.field_46599)] = this.field_46595[var25 + 2];
                     var3[var9 + 2 * class_3803.method_17688(this.field_46599)] = this.field_46595[var25 + 3];
                  }

                  class_3803.method_17699(this.field_46599).method_17789(var3, 0, this.field_46593);
                  class_3803.method_17699(this.field_46599).method_17789(var3, class_3803.method_17688(this.field_46599), this.field_46593);
                  class_3803.method_17699(this.field_46599).method_17789(var3, 2 * class_3803.method_17688(this.field_46599), this.field_46593);
                  class_3803.method_17699(this.field_46599).method_17789(var3, 3 * class_3803.method_17688(this.field_46599), this.field_46593);

                  for (int var21 = 0; var21 < class_3803.method_17688(this.field_46599); var21++) {
                     int var26 = var21 * class_3803.method_17689(this.field_46599) + var13 + var17;
                     int var31 = class_3803.method_17688(this.field_46599) + var21;
                     this.field_46595[var26] = var3[var21];
                     this.field_46595[var26 + 1] = var3[var31];
                     this.field_46595[var26 + 2] = var3[var31 + class_3803.method_17688(this.field_46599)];
                     this.field_46595[var26 + 3] = var3[var31 + 2 * class_3803.method_17688(this.field_46599)];
                  }
               }
            }
         }
      } else if (class_3803.method_17715(this.field_46599) <= 2) {
         if (class_3803.method_17715(this.field_46599) == 2) {
            for (int var11 = this.field_46594; var11 < class_3803.method_17681(this.field_46599); var11 += this.field_46597) {
               int var14 = var11 * class_3803.method_17685(this.field_46599);

               for (int var18 = 0; var18 < class_3803.method_17688(this.field_46599); var18++) {
                  int var27 = var18 * class_3803.method_17689(this.field_46599) + var14;
                  var3[var18] = this.field_46595[var27];
                  var3[class_3803.method_17688(this.field_46599) + var18] = this.field_46595[var27 + 1];
               }

               class_3803.method_17699(this.field_46599).method_17786(var3, 0);
               class_3803.method_17699(this.field_46599).method_17786(var3, class_3803.method_17688(this.field_46599));

               for (int var19 = 0; var19 < class_3803.method_17688(this.field_46599); var19++) {
                  int var28 = var19 * class_3803.method_17689(this.field_46599) + var14;
                  this.field_46595[var28] = var3[var19];
                  this.field_46595[var28 + 1] = var3[class_3803.method_17688(this.field_46599) + var19];
               }
            }
         }
      } else {
         for (int var12 = this.field_46594; var12 < class_3803.method_17681(this.field_46599); var12 += this.field_46597) {
            int var15 = var12 * class_3803.method_17685(this.field_46599);

            for (byte var20 = 0; var20 < class_3803.method_17715(this.field_46599); var20 += 4) {
               for (int var22 = 0; var22 < class_3803.method_17688(this.field_46599); var22++) {
                  int var29 = var22 * class_3803.method_17689(this.field_46599) + var15 + var20;
                  int var32 = class_3803.method_17688(this.field_46599) + var22;
                  var3[var22] = this.field_46595[var29];
                  var3[var32] = this.field_46595[var29 + 1];
                  var3[var32 + class_3803.method_17688(this.field_46599)] = this.field_46595[var29 + 2];
                  var3[var32 + 2 * class_3803.method_17688(this.field_46599)] = this.field_46595[var29 + 3];
               }

               class_3803.method_17699(this.field_46599).method_17786(var3, 0);
               class_3803.method_17699(this.field_46599).method_17786(var3, class_3803.method_17688(this.field_46599));
               class_3803.method_17699(this.field_46599).method_17786(var3, 2 * class_3803.method_17688(this.field_46599));
               class_3803.method_17699(this.field_46599).method_17786(var3, 3 * class_3803.method_17688(this.field_46599));

               for (int var23 = 0; var23 < class_3803.method_17688(this.field_46599); var23++) {
                  int var30 = var23 * class_3803.method_17689(this.field_46599) + var15 + var20;
                  int var33 = class_3803.method_17688(this.field_46599) + var23;
                  this.field_46595[var30] = var3[var23];
                  this.field_46595[var30 + 1] = var3[var33];
                  this.field_46595[var30 + 2] = var3[var33 + class_3803.method_17688(this.field_46599)];
                  this.field_46595[var30 + 3] = var3[var33 + 2 * class_3803.method_17688(this.field_46599)];
               }
            }
         }
      }
   }
}
