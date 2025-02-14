package mapped;

public class Class1584 implements Runnable {
   private static String[] field8577;
   public final int field8578;
   public final int field8579;
   public final int field8580;
   public final int field8581;
   public final double[][][] field8582;
   public final boolean field8583;
   public final Class6352 field8584;

   public Class1584(Class6352 var1, int var2, int var3, int var4, int var5, double[][][] var6, boolean var7) {
      this.field8584 = var1;
      this.field8578 = var2;
      this.field8579 = var3;
      this.field8580 = var4;
      this.field8581 = var5;
      this.field8582 = var6;
      this.field8583 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field8578];
      if (this.field8579 != -1) {
         if (Class6352.method19331(this.field8584) <= 2) {
            if (Class6352.method19331(this.field8584) == 2) {
               for (int var4 = this.field8580; var4 < Class6352.method19328(this.field8584); var4 += this.field8581) {
                  for (int var5 = 0; var5 < Class6352.method19333(this.field8584); var5++) {
                     var3[var5] = this.field8582[var5][var4][0];
                     var3[Class6352.method19333(this.field8584) + var5] = this.field8582[var5][var4][1];
                  }

                  Class6352.method19334(this.field8584).method38582(var3, 0, this.field8583);
                  Class6352.method19334(this.field8584).method38582(var3, Class6352.method19333(this.field8584), this.field8583);

                  for (int var11 = 0; var11 < Class6352.method19333(this.field8584); var11++) {
                     this.field8582[var11][var4][0] = var3[var11];
                     this.field8582[var11][var4][1] = var3[Class6352.method19333(this.field8584) + var11];
                  }
               }
            }
         } else {
            for (int var8 = this.field8580; var8 < Class6352.method19328(this.field8584); var8 += this.field8581) {
               for (int var12 = 0; var12 < Class6352.method19331(this.field8584); var12 += 4) {
                  for (int var6 = 0; var6 < Class6352.method19333(this.field8584); var6++) {
                     int var7 = Class6352.method19333(this.field8584) + var6;
                     var3[var6] = this.field8582[var6][var8][var12];
                     var3[var7] = this.field8582[var6][var8][var12 + 1];
                     var3[var7 + Class6352.method19333(this.field8584)] = this.field8582[var6][var8][var12 + 2];
                     var3[var7 + 2 * Class6352.method19333(this.field8584)] = this.field8582[var6][var8][var12 + 3];
                  }

                  Class6352.method19334(this.field8584).method38582(var3, 0, this.field8583);
                  Class6352.method19334(this.field8584).method38582(var3, Class6352.method19333(this.field8584), this.field8583);
                  Class6352.method19334(this.field8584).method38582(var3, 2 * Class6352.method19333(this.field8584), this.field8583);
                  Class6352.method19334(this.field8584).method38582(var3, 3 * Class6352.method19333(this.field8584), this.field8583);

                  for (int var16 = 0; var16 < Class6352.method19333(this.field8584); var16++) {
                     int var19 = Class6352.method19333(this.field8584) + var16;
                     this.field8582[var16][var8][var12] = var3[var16];
                     this.field8582[var16][var8][var12 + 1] = var3[var19];
                     this.field8582[var16][var8][var12 + 2] = var3[var19 + Class6352.method19333(this.field8584)];
                     this.field8582[var16][var8][var12 + 3] = var3[var19 + 2 * Class6352.method19333(this.field8584)];
                  }
               }
            }
         }
      } else if (Class6352.method19331(this.field8584) <= 2) {
         if (Class6352.method19331(this.field8584) == 2) {
            for (int var9 = this.field8580; var9 < Class6352.method19328(this.field8584); var9 += this.field8581) {
               for (int var13 = 0; var13 < Class6352.method19333(this.field8584); var13++) {
                  var3[var13] = this.field8582[var13][var9][0];
                  var3[Class6352.method19333(this.field8584) + var13] = this.field8582[var13][var9][1];
               }

               Class6352.method19334(this.field8584).method38578(var3, 0, this.field8583);
               Class6352.method19334(this.field8584).method38578(var3, Class6352.method19333(this.field8584), this.field8583);

               for (int var14 = 0; var14 < Class6352.method19333(this.field8584); var14++) {
                  this.field8582[var14][var9][0] = var3[var14];
                  this.field8582[var14][var9][1] = var3[Class6352.method19333(this.field8584) + var14];
               }
            }
         }
      } else {
         for (int var10 = this.field8580; var10 < Class6352.method19328(this.field8584); var10 += this.field8581) {
            for (int var15 = 0; var15 < Class6352.method19331(this.field8584); var15 += 4) {
               for (int var17 = 0; var17 < Class6352.method19333(this.field8584); var17++) {
                  int var20 = Class6352.method19333(this.field8584) + var17;
                  var3[var17] = this.field8582[var17][var10][var15];
                  var3[var20] = this.field8582[var17][var10][var15 + 1];
                  var3[var20 + Class6352.method19333(this.field8584)] = this.field8582[var17][var10][var15 + 2];
                  var3[var20 + 2 * Class6352.method19333(this.field8584)] = this.field8582[var17][var10][var15 + 3];
               }

               Class6352.method19334(this.field8584).method38578(var3, 0, this.field8583);
               Class6352.method19334(this.field8584).method38578(var3, Class6352.method19333(this.field8584), this.field8583);
               Class6352.method19334(this.field8584).method38578(var3, 2 * Class6352.method19333(this.field8584), this.field8583);
               Class6352.method19334(this.field8584).method38578(var3, 3 * Class6352.method19333(this.field8584), this.field8583);

               for (int var18 = 0; var18 < Class6352.method19333(this.field8584); var18++) {
                  int var21 = Class6352.method19333(this.field8584) + var18;
                  this.field8582[var18][var10][var15] = var3[var18];
                  this.field8582[var18][var10][var15 + 1] = var3[var21];
                  this.field8582[var18][var10][var15 + 2] = var3[var21 + Class6352.method19333(this.field8584)];
                  this.field8582[var18][var10][var15 + 3] = var3[var21 + 2 * Class6352.method19333(this.field8584)];
               }
            }
         }
      }
   }
}
