package mapped;

public class Class1401 implements Runnable {
   private static String[] field7492;
   public final int field7493;
   public final int field7494;
   public final int field7495;
   public final int field7496;
   public final double[] field7497;
   public final boolean field7498;
   public final Class6352 field7499;

   public Class1401(Class6352 var1, int var2, int var3, int var4, int var5, double[] var6, boolean var7) {
      this.field7499 = var1;
      this.field7493 = var2;
      this.field7494 = var3;
      this.field7495 = var4;
      this.field7496 = var5;
      this.field7497 = var6;
      this.field7498 = var7;
   }

   @Override
   public void run() {
      double[] var3 = new double[this.field7493];
      if (this.field7494 != -1) {
         if (Class6352.method19331(this.field7499) <= 2) {
            if (Class6352.method19331(this.field7499) == 2) {
               for (int var4 = this.field7495; var4 < Class6352.method19328(this.field7499); var4 += this.field7496) {
                  int var5 = var4 * Class6352.method19329(this.field7499);

                  for (int var6 = 0; var6 < Class6352.method19333(this.field7499); var6++) {
                     int var8 = var6 * Class6352.method19327(this.field7499) + var5;
                     var3[var6] = this.field7497[var8];
                     var3[Class6352.method19333(this.field7499) + var6] = this.field7497[var8 + 1];
                  }

                  Class6352.method19334(this.field7499).method38582(var3, 0, this.field7498);
                  Class6352.method19334(this.field7499).method38582(var3, Class6352.method19333(this.field7499), this.field7498);

                  for (int var16 = 0; var16 < Class6352.method19333(this.field7499); var16++) {
                     int var24 = var16 * Class6352.method19327(this.field7499) + var5;
                     this.field7497[var24] = var3[var16];
                     this.field7497[var24 + 1] = var3[Class6352.method19333(this.field7499) + var16];
                  }
               }
            }
         } else {
            for (int var10 = this.field7495; var10 < Class6352.method19328(this.field7499); var10 += this.field7496) {
               int var13 = var10 * Class6352.method19329(this.field7499);

               for (int var17 = 0; var17 < Class6352.method19331(this.field7499); var17 += 4) {
                  for (int var7 = 0; var7 < Class6352.method19333(this.field7499); var7++) {
                     int var25 = var7 * Class6352.method19327(this.field7499) + var13 + var17;
                     int var9 = Class6352.method19333(this.field7499) + var7;
                     var3[var7] = this.field7497[var25];
                     var3[var9] = this.field7497[var25 + 1];
                     var3[var9 + Class6352.method19333(this.field7499)] = this.field7497[var25 + 2];
                     var3[var9 + 2 * Class6352.method19333(this.field7499)] = this.field7497[var25 + 3];
                  }

                  Class6352.method19334(this.field7499).method38582(var3, 0, this.field7498);
                  Class6352.method19334(this.field7499).method38582(var3, Class6352.method19333(this.field7499), this.field7498);
                  Class6352.method19334(this.field7499).method38582(var3, 2 * Class6352.method19333(this.field7499), this.field7498);
                  Class6352.method19334(this.field7499).method38582(var3, 3 * Class6352.method19333(this.field7499), this.field7498);

                  for (int var21 = 0; var21 < Class6352.method19333(this.field7499); var21++) {
                     int var26 = var21 * Class6352.method19327(this.field7499) + var13 + var17;
                     int var31 = Class6352.method19333(this.field7499) + var21;
                     this.field7497[var26] = var3[var21];
                     this.field7497[var26 + 1] = var3[var31];
                     this.field7497[var26 + 2] = var3[var31 + Class6352.method19333(this.field7499)];
                     this.field7497[var26 + 3] = var3[var31 + 2 * Class6352.method19333(this.field7499)];
                  }
               }
            }
         }
      } else if (Class6352.method19331(this.field7499) <= 2) {
         if (Class6352.method19331(this.field7499) == 2) {
            for (int var11 = this.field7495; var11 < Class6352.method19328(this.field7499); var11 += this.field7496) {
               int var14 = var11 * Class6352.method19329(this.field7499);

               for (int var18 = 0; var18 < Class6352.method19333(this.field7499); var18++) {
                  int var27 = var18 * Class6352.method19327(this.field7499) + var14;
                  var3[var18] = this.field7497[var27];
                  var3[Class6352.method19333(this.field7499) + var18] = this.field7497[var27 + 1];
               }

               Class6352.method19334(this.field7499).method38578(var3, 0, this.field7498);
               Class6352.method19334(this.field7499).method38578(var3, Class6352.method19333(this.field7499), this.field7498);

               for (int var19 = 0; var19 < Class6352.method19333(this.field7499); var19++) {
                  int var28 = var19 * Class6352.method19327(this.field7499) + var14;
                  this.field7497[var28] = var3[var19];
                  this.field7497[var28 + 1] = var3[Class6352.method19333(this.field7499) + var19];
               }
            }
         }
      } else {
         for (int var12 = this.field7495; var12 < Class6352.method19328(this.field7499); var12 += this.field7496) {
            int var15 = var12 * Class6352.method19329(this.field7499);

            for (int var20 = 0; var20 < Class6352.method19331(this.field7499); var20 += 4) {
               for (int var22 = 0; var22 < Class6352.method19333(this.field7499); var22++) {
                  int var29 = var22 * Class6352.method19327(this.field7499) + var15 + var20;
                  int var32 = Class6352.method19333(this.field7499) + var22;
                  var3[var22] = this.field7497[var29];
                  var3[var32] = this.field7497[var29 + 1];
                  var3[var32 + Class6352.method19333(this.field7499)] = this.field7497[var29 + 2];
                  var3[var32 + 2 * Class6352.method19333(this.field7499)] = this.field7497[var29 + 3];
               }

               Class6352.method19334(this.field7499).method38578(var3, 0, this.field7498);
               Class6352.method19334(this.field7499).method38578(var3, Class6352.method19333(this.field7499), this.field7498);
               Class6352.method19334(this.field7499).method38578(var3, 2 * Class6352.method19333(this.field7499), this.field7498);
               Class6352.method19334(this.field7499).method38578(var3, 3 * Class6352.method19333(this.field7499), this.field7498);

               for (int var23 = 0; var23 < Class6352.method19333(this.field7499); var23++) {
                  int var30 = var23 * Class6352.method19327(this.field7499) + var15 + var20;
                  int var33 = Class6352.method19333(this.field7499) + var23;
                  this.field7497[var30] = var3[var23];
                  this.field7497[var30 + 1] = var3[var33];
                  this.field7497[var30 + 2] = var3[var33 + Class6352.method19333(this.field7499)];
                  this.field7497[var30 + 3] = var3[var33 + 2 * Class6352.method19333(this.field7499)];
               }
            }
         }
      }
   }
}
