package mapped;

public class Class1523 implements Runnable {
   private static String[] field8249;
   public final long field8250;
   public final int field8251;
   public final long field8252;
   public final int field8253;
   public final Class2381 field8254;
   public final boolean field8255;
   public final Class6352 field8256;

   public Class1523(Class6352 var1, long var2, int var4, long var5, int var7, Class2381 var8, boolean var9) {
      this.field8256 = var1;
      this.field8250 = var2;
      this.field8251 = var4;
      this.field8252 = var5;
      this.field8253 = var7;
      this.field8254 = var8;
      this.field8255 = var9;
   }

   @Override
   public void run() {
      Class2381 var3 = new Class2381(this.field8250);
      if (this.field8251 != -1) {
         for (long var4 = this.field8252; var4 < Class6352.method19339(this.field8256); var4 += (long)this.field8253) {
            long var6 = var4 * Class6352.method19335(this.field8256);

            for (long var8 = 0L; var8 < Class6352.method19336(this.field8256); var8++) {
               Class6352.method19330(this.field8256).method38583(this.field8254, var6 + var8 * Class6352.method19337(this.field8256), this.field8255);
            }

            if (Class6352.method19338(this.field8256) <= 2L) {
               if (Class6352.method19338(this.field8256) == 2L) {
                  for (long var19 = 0L; var19 < Class6352.method19336(this.field8256); var19++) {
                     long var29 = var6 + var19 * Class6352.method19337(this.field8256);
                     var3.method9687(var19, this.field8254.method9653(var29));
                     var3.method9687(Class6352.method19336(this.field8256) + var19, this.field8254.method9653(var29 + 1L));
                  }

                  Class6352.method19332(this.field8256).method38583(var3, 0L, this.field8255);
                  Class6352.method19332(this.field8256).method38583(var3, Class6352.method19336(this.field8256), this.field8255);

                  for (long var20 = 0L; var20 < Class6352.method19336(this.field8256); var20++) {
                     long var30 = var6 + var20 * Class6352.method19337(this.field8256);
                     this.field8254.method9687(var30, var3.method9653(var20));
                     this.field8254.method9687(var30 + 1L, var3.method9653(Class6352.method19336(this.field8256) + var20));
                  }
               }
            } else {
               for (long var18 = 0L; var18 < Class6352.method19338(this.field8256); var18 += 4L) {
                  for (long var10 = 0L; var10 < Class6352.method19336(this.field8256); var10++) {
                     long var12 = var6 + var10 * Class6352.method19337(this.field8256) + var18;
                     long var14 = Class6352.method19336(this.field8256) + var10;
                     var3.method9687(var10, this.field8254.method9653(var12));
                     var3.method9687(var14, this.field8254.method9653(var12 + 1L));
                     var3.method9687(var14 + Class6352.method19336(this.field8256), this.field8254.method9653(var12 + 2L));
                     var3.method9687(var14 + 2L * Class6352.method19336(this.field8256), this.field8254.method9653(var12 + 3L));
                  }

                  Class6352.method19332(this.field8256).method38583(var3, 0L, this.field8255);
                  Class6352.method19332(this.field8256).method38583(var3, Class6352.method19336(this.field8256), this.field8255);
                  Class6352.method19332(this.field8256).method38583(var3, 2L * Class6352.method19336(this.field8256), this.field8255);
                  Class6352.method19332(this.field8256).method38583(var3, 3L * Class6352.method19336(this.field8256), this.field8255);

                  for (long var25 = 0L; var25 < Class6352.method19336(this.field8256); var25++) {
                     long var28 = var6 + var25 * Class6352.method19337(this.field8256) + var18;
                     long var35 = Class6352.method19336(this.field8256) + var25;
                     this.field8254.method9687(var28, var3.method9653(var25));
                     this.field8254.method9687(var28 + 1L, var3.method9653(var35));
                     this.field8254.method9687(var28 + 2L, var3.method9653(var35 + Class6352.method19336(this.field8256)));
                     this.field8254.method9687(var28 + 3L, var3.method9653(var35 + 2L * Class6352.method19336(this.field8256)));
                  }
               }
            }
         }
      } else {
         for (long var16 = this.field8252; var16 < Class6352.method19339(this.field8256); var16 += (long)this.field8253) {
            long var17 = var16 * Class6352.method19335(this.field8256);

            for (long var21 = 0L; var21 < Class6352.method19336(this.field8256); var21++) {
               Class6352.method19330(this.field8256).method38579(this.field8254, var17 + var21 * Class6352.method19337(this.field8256), this.field8255);
            }

            if (Class6352.method19338(this.field8256) <= 2L) {
               if (Class6352.method19338(this.field8256) == 2L) {
                  for (long var23 = 0L; var23 < Class6352.method19336(this.field8256); var23++) {
                     long var33 = var17 + var23 * Class6352.method19337(this.field8256);
                     var3.method9687(var23, this.field8254.method9653(var33));
                     var3.method9687(Class6352.method19336(this.field8256) + var23, this.field8254.method9653(var33 + 1L));
                  }

                  Class6352.method19332(this.field8256).method38579(var3, 0L, this.field8255);
                  Class6352.method19332(this.field8256).method38579(var3, Class6352.method19336(this.field8256), this.field8255);

                  for (long var24 = 0L; var24 < Class6352.method19336(this.field8256); var24++) {
                     long var34 = var17 + var24 * Class6352.method19337(this.field8256);
                     this.field8254.method9687(var34, var3.method9653(var24));
                     this.field8254.method9687(var34 + 1L, var3.method9653(Class6352.method19336(this.field8256) + var24));
                  }
               }
            } else {
               for (long var22 = 0L; var22 < Class6352.method19338(this.field8256); var22 += 4L) {
                  for (long var26 = 0L; var26 < Class6352.method19336(this.field8256); var26++) {
                     long var31 = var17 + var26 * Class6352.method19337(this.field8256) + var22;
                     long var36 = Class6352.method19336(this.field8256) + var26;
                     var3.method9687(var26, this.field8254.method9653(var31));
                     var3.method9687(var36, this.field8254.method9653(var31 + 1L));
                     var3.method9687(var36 + Class6352.method19336(this.field8256), this.field8254.method9653(var31 + 2L));
                     var3.method9687(var36 + 2L * Class6352.method19336(this.field8256), this.field8254.method9653(var31 + 3L));
                  }

                  Class6352.method19332(this.field8256).method38579(var3, 0L, this.field8255);
                  Class6352.method19332(this.field8256).method38579(var3, Class6352.method19336(this.field8256), this.field8255);
                  Class6352.method19332(this.field8256).method38579(var3, 2L * Class6352.method19336(this.field8256), this.field8255);
                  Class6352.method19332(this.field8256).method38579(var3, 3L * Class6352.method19336(this.field8256), this.field8255);

                  for (long var27 = 0L; var27 < Class6352.method19336(this.field8256); var27++) {
                     long var32 = var17 + var27 * Class6352.method19337(this.field8256) + var22;
                     long var37 = Class6352.method19336(this.field8256) + var27;
                     this.field8254.method9687(var32, var3.method9653(var27));
                     this.field8254.method9687(var32 + 1L, var3.method9653(var37));
                     this.field8254.method9687(var32 + 2L, var3.method9653(var37 + Class6352.method19336(this.field8256)));
                     this.field8254.method9687(var32 + 3L, var3.method9653(var37 + 2L * Class6352.method19336(this.field8256)));
                  }
               }
            }
         }
      }
   }
}
