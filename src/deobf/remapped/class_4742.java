package remapped;

public class class_4742 implements Runnable {
   private static String[] field_22980;

   public class_4742(class_6056 var1, int var2, int var3, int var4, int var5, double[][][] var6, boolean var7) {
      this.field_22975 = var1;
      this.field_22977 = var2;
      this.field_22978 = var3;
      this.field_22974 = var4;
      this.field_22976 = var5;
      this.field_22979 = var6;
      this.field_22981 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field_22977];
      if (this.field_22978 != -1) {
         if (class_6056.method_27666(this.field_22975) <= 2) {
            if (class_6056.method_27666(this.field_22975) == 2) {
               for (int var4 = this.field_22974; var4 < class_6056.method_27660(this.field_22975); var4 += this.field_22976) {
                  for (int var5 = 0; var5 < class_6056.method_27671(this.field_22975); var5++) {
                     var3[var5] = this.field_22979[var5][var4][0];
                     var3[class_6056.method_27671(this.field_22975) + var5] = this.field_22979[var5][var4][1];
                  }

                  class_6056.method_27659(this.field_22975).method_31282(var3, 0, this.field_22981);
                  class_6056.method_27659(this.field_22975).method_31282(var3, class_6056.method_27671(this.field_22975), this.field_22981);

                  for (int var11 = 0; var11 < class_6056.method_27671(this.field_22975); var11++) {
                     this.field_22979[var11][var4][0] = var3[var11];
                     this.field_22979[var11][var4][1] = var3[class_6056.method_27671(this.field_22975) + var11];
                  }
               }
            }
         } else {
            for (int var8 = this.field_22974; var8 < class_6056.method_27660(this.field_22975); var8 += this.field_22976) {
               for (byte var12 = 0; var12 < class_6056.method_27666(this.field_22975); var12 += 4) {
                  for (int var6 = 0; var6 < class_6056.method_27671(this.field_22975); var6++) {
                     int var7 = class_6056.method_27671(this.field_22975) + var6;
                     var3[var6] = this.field_22979[var6][var8][var12];
                     var3[var7] = this.field_22979[var6][var8][var12 + 1];
                     var3[var7 + class_6056.method_27671(this.field_22975)] = this.field_22979[var6][var8][var12 + 2];
                     var3[var7 + 2 * class_6056.method_27671(this.field_22975)] = this.field_22979[var6][var8][var12 + 3];
                  }

                  class_6056.method_27659(this.field_22975).method_31282(var3, 0, this.field_22981);
                  class_6056.method_27659(this.field_22975).method_31282(var3, class_6056.method_27671(this.field_22975), this.field_22981);
                  class_6056.method_27659(this.field_22975).method_31282(var3, 2 * class_6056.method_27671(this.field_22975), this.field_22981);
                  class_6056.method_27659(this.field_22975).method_31282(var3, 3 * class_6056.method_27671(this.field_22975), this.field_22981);

                  for (int var16 = 0; var16 < class_6056.method_27671(this.field_22975); var16++) {
                     int var19 = class_6056.method_27671(this.field_22975) + var16;
                     this.field_22979[var16][var8][var12] = var3[var16];
                     this.field_22979[var16][var8][var12 + 1] = var3[var19];
                     this.field_22979[var16][var8][var12 + 2] = var3[var19 + class_6056.method_27671(this.field_22975)];
                     this.field_22979[var16][var8][var12 + 3] = var3[var19 + 2 * class_6056.method_27671(this.field_22975)];
                  }
               }
            }
         }
      } else if (class_6056.method_27666(this.field_22975) <= 2) {
         if (class_6056.method_27666(this.field_22975) == 2) {
            for (int var9 = this.field_22974; var9 < class_6056.method_27660(this.field_22975); var9 += this.field_22976) {
               for (int var13 = 0; var13 < class_6056.method_27671(this.field_22975); var13++) {
                  var3[var13] = this.field_22979[var13][var9][0];
                  var3[class_6056.method_27671(this.field_22975) + var13] = this.field_22979[var13][var9][1];
               }

               class_6056.method_27659(this.field_22975).method_31276(var3, 0);
               class_6056.method_27659(this.field_22975).method_31276(var3, class_6056.method_27671(this.field_22975));

               for (int var14 = 0; var14 < class_6056.method_27671(this.field_22975); var14++) {
                  this.field_22979[var14][var9][0] = var3[var14];
                  this.field_22979[var14][var9][1] = var3[class_6056.method_27671(this.field_22975) + var14];
               }
            }
         }
      } else {
         for (int var10 = this.field_22974; var10 < class_6056.method_27660(this.field_22975); var10 += this.field_22976) {
            for (byte var15 = 0; var15 < class_6056.method_27666(this.field_22975); var15 += 4) {
               for (int var17 = 0; var17 < class_6056.method_27671(this.field_22975); var17++) {
                  int var20 = class_6056.method_27671(this.field_22975) + var17;
                  var3[var17] = this.field_22979[var17][var10][var15];
                  var3[var20] = this.field_22979[var17][var10][var15 + 1];
                  var3[var20 + class_6056.method_27671(this.field_22975)] = this.field_22979[var17][var10][var15 + 2];
                  var3[var20 + 2 * class_6056.method_27671(this.field_22975)] = this.field_22979[var17][var10][var15 + 3];
               }

               class_6056.method_27659(this.field_22975).method_31276(var3, 0);
               class_6056.method_27659(this.field_22975).method_31276(var3, class_6056.method_27671(this.field_22975));
               class_6056.method_27659(this.field_22975).method_31276(var3, 2 * class_6056.method_27671(this.field_22975));
               class_6056.method_27659(this.field_22975).method_31276(var3, 3 * class_6056.method_27671(this.field_22975));

               for (int var18 = 0; var18 < class_6056.method_27671(this.field_22975); var18++) {
                  int var21 = class_6056.method_27671(this.field_22975) + var18;
                  this.field_22979[var18][var10][var15] = var3[var18];
                  this.field_22979[var18][var10][var15 + 1] = var3[var21];
                  this.field_22979[var18][var10][var15 + 2] = var3[var21 + class_6056.method_27671(this.field_22975)];
                  this.field_22979[var18][var10][var15 + 3] = var3[var21 + 2 * class_6056.method_27671(this.field_22975)];
               }
            }
         }
      }
   }
}
