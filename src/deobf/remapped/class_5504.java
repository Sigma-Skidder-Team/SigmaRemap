package remapped;

public class class_5504 implements Runnable {
   private static String[] field_28004;

   public class_5504(class_573 var1, int var2, int var3, int var4, int var5, double[][][] var6, boolean var7) {
      this.field_28007 = var1;
      this.field_28002 = var2;
      this.field_28008 = var3;
      this.field_28003 = var4;
      this.field_28009 = var5;
      this.field_28006 = var6;
      this.field_28005 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field_28002];
      if (this.field_28008 != -1) {
         if (class_573.method_2730(this.field_28007) <= 2) {
            if (class_573.method_2730(this.field_28007) == 2) {
               for (int var4 = this.field_28003; var4 < class_573.method_2721(this.field_28007); var4 += this.field_28009) {
                  for (int var5 = 0; var5 < class_573.method_2716(this.field_28007); var5++) {
                     var3[var5] = this.field_28006[var5][var4][0];
                     var3[class_573.method_2716(this.field_28007) + var5] = this.field_28006[var5][var4][1];
                  }

                  class_573.method_2710(this.field_28007).method_44820(var3, 0, this.field_28005);
                  class_573.method_2710(this.field_28007).method_44820(var3, class_573.method_2716(this.field_28007), this.field_28005);

                  for (int var11 = 0; var11 < class_573.method_2716(this.field_28007); var11++) {
                     this.field_28006[var11][var4][0] = var3[var11];
                     this.field_28006[var11][var4][1] = var3[class_573.method_2716(this.field_28007) + var11];
                  }
               }
            }
         } else {
            for (int var8 = this.field_28003; var8 < class_573.method_2721(this.field_28007); var8 += this.field_28009) {
               for (byte var12 = 0; var12 < class_573.method_2730(this.field_28007); var12 += 4) {
                  for (int var6 = 0; var6 < class_573.method_2716(this.field_28007); var6++) {
                     int var7 = class_573.method_2716(this.field_28007) + var6;
                     var3[var6] = this.field_28006[var6][var8][var12];
                     var3[var7] = this.field_28006[var6][var8][var12 + 1];
                     var3[var7 + class_573.method_2716(this.field_28007)] = this.field_28006[var6][var8][var12 + 2];
                     var3[var7 + 2 * class_573.method_2716(this.field_28007)] = this.field_28006[var6][var8][var12 + 3];
                  }

                  class_573.method_2710(this.field_28007).method_44820(var3, 0, this.field_28005);
                  class_573.method_2710(this.field_28007).method_44820(var3, class_573.method_2716(this.field_28007), this.field_28005);
                  class_573.method_2710(this.field_28007).method_44820(var3, 2 * class_573.method_2716(this.field_28007), this.field_28005);
                  class_573.method_2710(this.field_28007).method_44820(var3, 3 * class_573.method_2716(this.field_28007), this.field_28005);

                  for (int var16 = 0; var16 < class_573.method_2716(this.field_28007); var16++) {
                     int var19 = class_573.method_2716(this.field_28007) + var16;
                     this.field_28006[var16][var8][var12] = var3[var16];
                     this.field_28006[var16][var8][var12 + 1] = var3[var19];
                     this.field_28006[var16][var8][var12 + 2] = var3[var19 + class_573.method_2716(this.field_28007)];
                     this.field_28006[var16][var8][var12 + 3] = var3[var19 + 2 * class_573.method_2716(this.field_28007)];
                  }
               }
            }
         }
      } else if (class_573.method_2730(this.field_28007) <= 2) {
         if (class_573.method_2730(this.field_28007) == 2) {
            for (int var9 = this.field_28003; var9 < class_573.method_2721(this.field_28007); var9 += this.field_28009) {
               for (int var13 = 0; var13 < class_573.method_2716(this.field_28007); var13++) {
                  var3[var13] = this.field_28006[var13][var9][0];
                  var3[class_573.method_2716(this.field_28007) + var13] = this.field_28006[var13][var9][1];
               }

               class_573.method_2710(this.field_28007).method_44815(var3, 0, this.field_28005);
               class_573.method_2710(this.field_28007).method_44815(var3, class_573.method_2716(this.field_28007), this.field_28005);

               for (int var14 = 0; var14 < class_573.method_2716(this.field_28007); var14++) {
                  this.field_28006[var14][var9][0] = var3[var14];
                  this.field_28006[var14][var9][1] = var3[class_573.method_2716(this.field_28007) + var14];
               }
            }
         }
      } else {
         for (int var10 = this.field_28003; var10 < class_573.method_2721(this.field_28007); var10 += this.field_28009) {
            for (byte var15 = 0; var15 < class_573.method_2730(this.field_28007); var15 += 4) {
               for (int var17 = 0; var17 < class_573.method_2716(this.field_28007); var17++) {
                  int var20 = class_573.method_2716(this.field_28007) + var17;
                  var3[var17] = this.field_28006[var17][var10][var15];
                  var3[var20] = this.field_28006[var17][var10][var15 + 1];
                  var3[var20 + class_573.method_2716(this.field_28007)] = this.field_28006[var17][var10][var15 + 2];
                  var3[var20 + 2 * class_573.method_2716(this.field_28007)] = this.field_28006[var17][var10][var15 + 3];
               }

               class_573.method_2710(this.field_28007).method_44815(var3, 0, this.field_28005);
               class_573.method_2710(this.field_28007).method_44815(var3, class_573.method_2716(this.field_28007), this.field_28005);
               class_573.method_2710(this.field_28007).method_44815(var3, 2 * class_573.method_2716(this.field_28007), this.field_28005);
               class_573.method_2710(this.field_28007).method_44815(var3, 3 * class_573.method_2716(this.field_28007), this.field_28005);

               for (int var18 = 0; var18 < class_573.method_2716(this.field_28007); var18++) {
                  int var21 = class_573.method_2716(this.field_28007) + var18;
                  this.field_28006[var18][var10][var15] = var3[var18];
                  this.field_28006[var18][var10][var15 + 1] = var3[var21];
                  this.field_28006[var18][var10][var15 + 2] = var3[var21 + class_573.method_2716(this.field_28007)];
                  this.field_28006[var18][var10][var15 + 3] = var3[var21 + 2 * class_573.method_2716(this.field_28007)];
               }
            }
         }
      }
   }
}
