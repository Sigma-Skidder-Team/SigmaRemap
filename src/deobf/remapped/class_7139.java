package remapped;

public class class_7139 implements Runnable {
   private static String[] field_36774;

   public class_7139(class_3803 var1, int var2, int var3, int var4, int var5, float[] var6, boolean var7) {
      this.field_36771 = var1;
      this.field_36776 = var2;
      this.field_36772 = var3;
      this.field_36775 = var4;
      this.field_36773 = var5;
      this.field_36770 = var6;
      this.field_36777 = var7;
   }

   @Override
   public void run() {
      float[] var3 = new float[this.field_36776];
      if (this.field_36772 != -1) {
         for (int var4 = this.field_36775; var4 < class_3803.method_17688(this.field_36771); var4 += this.field_36773) {
            int var5 = var4 * class_3803.method_17689(this.field_36771);

            for (int var6 = 0; var6 < class_3803.method_17681(this.field_36771); var6++) {
               class_3803.method_17704(this.field_36771)
                  .method_17789(this.field_36770, var5 + var6 * class_3803.method_17685(this.field_36771), this.field_36777);
            }

            if (class_3803.method_17715(this.field_36771) <= 2) {
               if (class_3803.method_17715(this.field_36771) == 2) {
                  for (int var13 = 0; var13 < class_3803.method_17681(this.field_36771); var13++) {
                     int var23 = var5 + var13 * class_3803.method_17685(this.field_36771);
                     var3[var13] = this.field_36770[var23];
                     var3[class_3803.method_17681(this.field_36771) + var13] = this.field_36770[var23 + 1];
                  }

                  class_3803.method_17714(this.field_36771).method_17789(var3, 0, this.field_36777);
                  class_3803.method_17714(this.field_36771).method_17789(var3, class_3803.method_17681(this.field_36771), this.field_36777);

                  for (int var14 = 0; var14 < class_3803.method_17681(this.field_36771); var14++) {
                     int var24 = var5 + var14 * class_3803.method_17685(this.field_36771);
                     this.field_36770[var24] = var3[var14];
                     this.field_36770[var24 + 1] = var3[class_3803.method_17681(this.field_36771) + var14];
                  }
               }
            } else {
               for (byte var12 = 0; var12 < class_3803.method_17715(this.field_36771); var12 += 4) {
                  for (int var7 = 0; var7 < class_3803.method_17681(this.field_36771); var7++) {
                     int var8 = var5 + var7 * class_3803.method_17685(this.field_36771) + var12;
                     int var9 = class_3803.method_17681(this.field_36771) + var7;
                     var3[var7] = this.field_36770[var8];
                     var3[var9] = this.field_36770[var8 + 1];
                     var3[var9 + class_3803.method_17681(this.field_36771)] = this.field_36770[var8 + 2];
                     var3[var9 + 2 * class_3803.method_17681(this.field_36771)] = this.field_36770[var8 + 3];
                  }

                  class_3803.method_17714(this.field_36771).method_17789(var3, 0, this.field_36777);
                  class_3803.method_17714(this.field_36771).method_17789(var3, class_3803.method_17681(this.field_36771), this.field_36777);
                  class_3803.method_17714(this.field_36771).method_17789(var3, 2 * class_3803.method_17681(this.field_36771), this.field_36777);
                  class_3803.method_17714(this.field_36771).method_17789(var3, 3 * class_3803.method_17681(this.field_36771), this.field_36777);

                  for (int var19 = 0; var19 < class_3803.method_17681(this.field_36771); var19++) {
                     int var22 = var5 + var19 * class_3803.method_17685(this.field_36771) + var12;
                     int var29 = class_3803.method_17681(this.field_36771) + var19;
                     this.field_36770[var22] = var3[var19];
                     this.field_36770[var22 + 1] = var3[var29];
                     this.field_36770[var22 + 2] = var3[var29 + class_3803.method_17681(this.field_36771)];
                     this.field_36770[var22 + 3] = var3[var29 + 2 * class_3803.method_17681(this.field_36771)];
                  }
               }
            }
         }
      } else {
         for (int var10 = this.field_36775; var10 < class_3803.method_17688(this.field_36771); var10 += this.field_36773) {
            int var11 = var10 * class_3803.method_17689(this.field_36771);

            for (int var15 = 0; var15 < class_3803.method_17681(this.field_36771); var15++) {
               class_3803.method_17704(this.field_36771).method_17786(this.field_36770, var11 + var15 * class_3803.method_17685(this.field_36771));
            }

            if (class_3803.method_17715(this.field_36771) <= 2) {
               if (class_3803.method_17715(this.field_36771) == 2) {
                  for (int var17 = 0; var17 < class_3803.method_17681(this.field_36771); var17++) {
                     int var27 = var11 + var17 * class_3803.method_17685(this.field_36771);
                     var3[var17] = this.field_36770[var27];
                     var3[class_3803.method_17681(this.field_36771) + var17] = this.field_36770[var27 + 1];
                  }

                  class_3803.method_17714(this.field_36771).method_17786(var3, 0);
                  class_3803.method_17714(this.field_36771).method_17786(var3, class_3803.method_17681(this.field_36771));

                  for (int var18 = 0; var18 < class_3803.method_17681(this.field_36771); var18++) {
                     int var28 = var11 + var18 * class_3803.method_17685(this.field_36771);
                     this.field_36770[var28] = var3[var18];
                     this.field_36770[var28 + 1] = var3[class_3803.method_17681(this.field_36771) + var18];
                  }
               }
            } else {
               for (byte var16 = 0; var16 < class_3803.method_17715(this.field_36771); var16 += 4) {
                  for (int var20 = 0; var20 < class_3803.method_17681(this.field_36771); var20++) {
                     int var25 = var11 + var20 * class_3803.method_17685(this.field_36771) + var16;
                     int var30 = class_3803.method_17681(this.field_36771) + var20;
                     var3[var20] = this.field_36770[var25];
                     var3[var30] = this.field_36770[var25 + 1];
                     var3[var30 + class_3803.method_17681(this.field_36771)] = this.field_36770[var25 + 2];
                     var3[var30 + 2 * class_3803.method_17681(this.field_36771)] = this.field_36770[var25 + 3];
                  }

                  class_3803.method_17714(this.field_36771).method_17786(var3, 0);
                  class_3803.method_17714(this.field_36771).method_17786(var3, class_3803.method_17681(this.field_36771));
                  class_3803.method_17714(this.field_36771).method_17786(var3, 2 * class_3803.method_17681(this.field_36771));
                  class_3803.method_17714(this.field_36771).method_17786(var3, 3 * class_3803.method_17681(this.field_36771));

                  for (int var21 = 0; var21 < class_3803.method_17681(this.field_36771); var21++) {
                     int var26 = var11 + var21 * class_3803.method_17685(this.field_36771) + var16;
                     int var31 = class_3803.method_17681(this.field_36771) + var21;
                     this.field_36770[var26] = var3[var21];
                     this.field_36770[var26 + 1] = var3[var31];
                     this.field_36770[var26 + 2] = var3[var31 + class_3803.method_17681(this.field_36771)];
                     this.field_36770[var26 + 3] = var3[var31 + 2 * class_3803.method_17681(this.field_36771)];
                  }
               }
            }
         }
      }
   }
}
