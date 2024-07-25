package remapped;

public class class_5151 implements Runnable {
   private static String[] field_26513;

   public class_5151(class_573 var1, int var2, int var3, int var4, int var5, double[] var6, boolean var7) {
      this.field_26517 = var1;
      this.field_26516 = var2;
      this.field_26519 = var3;
      this.field_26520 = var4;
      this.field_26514 = var5;
      this.field_26515 = var6;
      this.field_26518 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field_26516];
      if (this.field_26519 != -1) {
         for (int var4 = this.field_26520; var4 < class_573.method_2716(this.field_26517); var4 += this.field_26514) {
            int var5 = var4 * class_573.method_2737(this.field_26517);

            for (int var6 = 0; var6 < class_573.method_2721(this.field_26517); var6++) {
               class_573.method_2736(this.field_26517).method_44820(this.field_26515, var5 + var6 * class_573.method_2717(this.field_26517), this.field_26518);
            }

            if (class_573.method_2730(this.field_26517) <= 2) {
               if (class_573.method_2730(this.field_26517) == 2) {
                  for (int var13 = 0; var13 < class_573.method_2721(this.field_26517); var13++) {
                     int var23 = var5 + var13 * class_573.method_2717(this.field_26517);
                     var3[var13] = this.field_26515[var23];
                     var3[class_573.method_2721(this.field_26517) + var13] = this.field_26515[var23 + 1];
                  }

                  class_573.method_2711(this.field_26517).method_44820(var3, 0, this.field_26518);
                  class_573.method_2711(this.field_26517).method_44820(var3, class_573.method_2721(this.field_26517), this.field_26518);

                  for (int var14 = 0; var14 < class_573.method_2721(this.field_26517); var14++) {
                     int var24 = var5 + var14 * class_573.method_2717(this.field_26517);
                     this.field_26515[var24] = var3[var14];
                     this.field_26515[var24 + 1] = var3[class_573.method_2721(this.field_26517) + var14];
                  }
               }
            } else {
               for (byte var12 = 0; var12 < class_573.method_2730(this.field_26517); var12 += 4) {
                  for (int var7 = 0; var7 < class_573.method_2721(this.field_26517); var7++) {
                     int var8 = var5 + var7 * class_573.method_2717(this.field_26517) + var12;
                     int var9 = class_573.method_2721(this.field_26517) + var7;
                     var3[var7] = this.field_26515[var8];
                     var3[var9] = this.field_26515[var8 + 1];
                     var3[var9 + class_573.method_2721(this.field_26517)] = this.field_26515[var8 + 2];
                     var3[var9 + 2 * class_573.method_2721(this.field_26517)] = this.field_26515[var8 + 3];
                  }

                  class_573.method_2711(this.field_26517).method_44820(var3, 0, this.field_26518);
                  class_573.method_2711(this.field_26517).method_44820(var3, class_573.method_2721(this.field_26517), this.field_26518);
                  class_573.method_2711(this.field_26517).method_44820(var3, 2 * class_573.method_2721(this.field_26517), this.field_26518);
                  class_573.method_2711(this.field_26517).method_44820(var3, 3 * class_573.method_2721(this.field_26517), this.field_26518);

                  for (int var19 = 0; var19 < class_573.method_2721(this.field_26517); var19++) {
                     int var22 = var5 + var19 * class_573.method_2717(this.field_26517) + var12;
                     int var29 = class_573.method_2721(this.field_26517) + var19;
                     this.field_26515[var22] = var3[var19];
                     this.field_26515[var22 + 1] = var3[var29];
                     this.field_26515[var22 + 2] = var3[var29 + class_573.method_2721(this.field_26517)];
                     this.field_26515[var22 + 3] = var3[var29 + 2 * class_573.method_2721(this.field_26517)];
                  }
               }
            }
         }
      } else {
         for (int var10 = this.field_26520; var10 < class_573.method_2716(this.field_26517); var10 += this.field_26514) {
            int var11 = var10 * class_573.method_2737(this.field_26517);

            for (int var15 = 0; var15 < class_573.method_2721(this.field_26517); var15++) {
               class_573.method_2736(this.field_26517)
                  .method_44815(this.field_26515, var11 + var15 * class_573.method_2717(this.field_26517), this.field_26518);
            }

            if (class_573.method_2730(this.field_26517) <= 2) {
               if (class_573.method_2730(this.field_26517) == 2) {
                  for (int var17 = 0; var17 < class_573.method_2721(this.field_26517); var17++) {
                     int var27 = var11 + var17 * class_573.method_2717(this.field_26517);
                     var3[var17] = this.field_26515[var27];
                     var3[class_573.method_2721(this.field_26517) + var17] = this.field_26515[var27 + 1];
                  }

                  class_573.method_2711(this.field_26517).method_44815(var3, 0, this.field_26518);
                  class_573.method_2711(this.field_26517).method_44815(var3, class_573.method_2721(this.field_26517), this.field_26518);

                  for (int var18 = 0; var18 < class_573.method_2721(this.field_26517); var18++) {
                     int var28 = var11 + var18 * class_573.method_2717(this.field_26517);
                     this.field_26515[var28] = var3[var18];
                     this.field_26515[var28 + 1] = var3[class_573.method_2721(this.field_26517) + var18];
                  }
               }
            } else {
               for (byte var16 = 0; var16 < class_573.method_2730(this.field_26517); var16 += 4) {
                  for (int var20 = 0; var20 < class_573.method_2721(this.field_26517); var20++) {
                     int var25 = var11 + var20 * class_573.method_2717(this.field_26517) + var16;
                     int var30 = class_573.method_2721(this.field_26517) + var20;
                     var3[var20] = this.field_26515[var25];
                     var3[var30] = this.field_26515[var25 + 1];
                     var3[var30 + class_573.method_2721(this.field_26517)] = this.field_26515[var25 + 2];
                     var3[var30 + 2 * class_573.method_2721(this.field_26517)] = this.field_26515[var25 + 3];
                  }

                  class_573.method_2711(this.field_26517).method_44815(var3, 0, this.field_26518);
                  class_573.method_2711(this.field_26517).method_44815(var3, class_573.method_2721(this.field_26517), this.field_26518);
                  class_573.method_2711(this.field_26517).method_44815(var3, 2 * class_573.method_2721(this.field_26517), this.field_26518);
                  class_573.method_2711(this.field_26517).method_44815(var3, 3 * class_573.method_2721(this.field_26517), this.field_26518);

                  for (int var21 = 0; var21 < class_573.method_2721(this.field_26517); var21++) {
                     int var26 = var11 + var21 * class_573.method_2717(this.field_26517) + var16;
                     int var31 = class_573.method_2721(this.field_26517) + var21;
                     this.field_26515[var26] = var3[var21];
                     this.field_26515[var26 + 1] = var3[var31];
                     this.field_26515[var26 + 2] = var3[var31 + class_573.method_2721(this.field_26517)];
                     this.field_26515[var26 + 3] = var3[var31 + 2 * class_573.method_2721(this.field_26517)];
                  }
               }
            }
         }
      }
   }
}
