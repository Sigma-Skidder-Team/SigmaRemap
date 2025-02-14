package mapped;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class8832 {
   private int field39878;
   private long field39879;
   private int field39880;
   private long field39881;
   private int field39882;
   private long field39883;
   private int field39884;
   private long field39885;
   private int field39886;
   private long field39887;
   private Class9049 field39888;
   private Class9049 field39889;
   private Class9049 field39890;
   private boolean field39891 = false;
   private boolean field39892 = false;

   public Class8832(long var1, long var3, long var5) {
      if (var1 > 1L && var3 > 1L && var5 > 1L) {
         this.field39878 = (int)var1;
         this.field39880 = (int)var3;
         this.field39882 = (int)var5;
         this.field39879 = var1;
         this.field39881 = var3;
         this.field39883 = var5;
         this.field39884 = (int)(var3 * var5);
         this.field39886 = (int)var5;
         this.field39885 = var3 * var5;
         this.field39887 = var5;
         if (var1 * var3 * var5 >= Class7796.method25894()) {
            this.field39892 = true;
         }

         if (Class7796.method25908(var1) && Class7796.method25908(var3) && Class7796.method25908(var5)) {
            this.field39891 = true;
         }

         Class7796.method25902(var1 * var3 * var5 > (long)Class2373.method9693());
         this.field39888 = new Class9049(var1);
         if (var1 != var3) {
            this.field39889 = new Class9049(var3);
         } else {
            this.field39889 = this.field39888;
         }

         if (var1 != var5) {
            if (var3 != var5) {
               this.field39890 = new Class9049(var5);
            } else {
               this.field39890 = this.field39889;
            }
         } else {
            this.field39890 = this.field39888;
         }
      } else {
         throw new IllegalArgumentException("slices, rows and columns must be greater than 1");
      }
   }

   public void method31934(double[] var1) {
      int var4 = Class7008.method21726();
      if (this.field39891) {
         if (var4 > 1 && this.field39892) {
            this.method31946(-1, var1, true);
            this.method31949(-1, var1, true);
         } else {
            this.method31940(-1, var1, true);
            this.method31943(-1, var1, true);
         }

         this.method31952(var1);
      } else {
         if (var4 > 1 && this.field39892 && this.field39878 >= var4 && this.field39880 >= var4 && this.field39882 >= var4) {
            Future[] var19 = new Future[var4];
            int var22 = this.field39878 / var4;

            for (int var26 = 0; var26 < var4; var26++) {
               int var30 = var26 * var22;
               int var36 = var26 == var4 - 1 ? this.field39878 : var30 + var22;
               var19[var26] = Class7008.method21729(new Class734(this, var30, var36, var1));
            }

            try {
               Class7008.method21730(var19);
            } catch (InterruptedException var15) {
               Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var15);
            } catch (ExecutionException var16) {
               Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var16);
            }

            for (int var27 = 0; var27 < var4; var27++) {
               int var31 = var27 * var22;
               int var37 = var27 == var4 - 1 ? this.field39878 : var31 + var22;
               var19[var27] = Class7008.method21729(new Class1356(this, var31, var37, var1));
            }

            try {
               Class7008.method21730(var19);
            } catch (InterruptedException var13) {
               Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var13);
            } catch (ExecutionException var14) {
               Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var14);
            }

            var22 = this.field39880 / var4;

            for (int var28 = 0; var28 < var4; var28++) {
               int var32 = var28 * var22;
               int var38;
               if (var28 == var4 - 1) {
                  var38 = this.field39880;
               } else {
                  var38 = var32 + var22;
               }

               var19[var28] = Class7008.method21729(new Class469(this, var32, var38, var1));
            }

            try {
               Class7008.method21730(var19);
            } catch (InterruptedException var11) {
               Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var11);
            } catch (ExecutionException var12) {
               Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var12);
            }
         } else {
            for (int var5 = 0; var5 < this.field39878; var5++) {
               int var6 = var5 * this.field39884;

               for (int var7 = 0; var7 < this.field39880; var7++) {
                  this.field39890.method33648(var1, var6 + var7 * this.field39886);
               }
            }

            double[] var17 = new double[this.field39880];

            for (int var20 = 0; var20 < this.field39878; var20++) {
               int var24 = var20 * this.field39884;

               for (int var8 = 0; var8 < this.field39882; var8++) {
                  for (int var9 = 0; var9 < this.field39880; var9++) {
                     int var10 = var24 + var9 * this.field39886 + var8;
                     var17[var9] = var1[var10];
                  }

                  this.field39889.method33646(var17);

                  for (int var33 = 0; var33 < this.field39880; var33++) {
                     int var39 = var24 + var33 * this.field39886 + var8;
                     var1[var39] = var17[var33];
                  }
               }
            }

            var17 = new double[this.field39878];

            for (int var21 = 0; var21 < this.field39880; var21++) {
               int var25 = var21 * this.field39886;

               for (int var29 = 0; var29 < this.field39882; var29++) {
                  for (int var34 = 0; var34 < this.field39878; var34++) {
                     int var40 = var34 * this.field39884 + var25 + var29;
                     var17[var34] = var1[var40];
                  }

                  this.field39888.method33646(var17);

                  for (int var35 = 0; var35 < this.field39878; var35++) {
                     int var41 = var35 * this.field39884 + var25 + var29;
                     var1[var41] = var17[var35];
                  }
               }
            }
         }

         this.method31952(var1);
      }
   }

   public void method31935(Class2381 var1) {
      int var4 = Class7008.method21726();
      if (this.field39891) {
         if (var4 > 1 && this.field39892) {
            this.method31947(-1, var1, true);
            this.method31950(-1, var1, true);
         } else {
            this.method31941(-1, var1, true);
            this.method31944(-1, var1, true);
         }

         this.method31953(var1);
      } else {
         if (var4 > 1 && this.field39892 && this.field39879 >= (long)var4 && this.field39881 >= (long)var4 && this.field39883 >= (long)var4) {
            Future[] var32 = new Future[var4];
            long var34 = this.field39879 / (long)var4;

            for (int var8 = 0; var8 < var4; var8++) {
               long var38 = (long)var8 * var34;
               long var11 = var8 == var4 - 1 ? this.field39879 : var38 + var34;
               var32[var8] = Class7008.method21729(new Class1498(this, var38, var11, var1));
            }

            try {
               Class7008.method21730(var32);
            } catch (InterruptedException var29) {
               Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var29);
            } catch (ExecutionException var30) {
               Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var30);
            }

            for (int var36 = 0; var36 < var4; var36++) {
               long var39 = (long)var36 * var34;
               long var41 = var36 == var4 - 1 ? this.field39879 : var39 + var34;
               var32[var36] = Class7008.method21729(new Class593(this, var39, var41, var1));
            }

            try {
               Class7008.method21730(var32);
            } catch (InterruptedException var27) {
               Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var27);
            } catch (ExecutionException var28) {
               Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var28);
            }

            var34 = this.field39881 / (long)var4;

            for (int var37 = 0; var37 < var4; var37++) {
               long var40 = (long)var37 * var34;
               long var42;
               if (var37 == var4 - 1) {
                  var42 = this.field39881;
               } else {
                  var42 = var40 + var34;
               }

               var32[var37] = Class7008.method21729(new Class775(this, var40, var42, var1));
            }

            try {
               Class7008.method21730(var32);
            } catch (InterruptedException var25) {
               Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var25);
            } catch (ExecutionException var26) {
               Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var26);
            }
         } else {
            for (long var13 = 0L; var13 < this.field39879; var13++) {
               long var15 = var13 * (long)this.field39884;

               for (long var9 = 0L; var9 < this.field39881; var9++) {
                  this.field39890.method33649(var1, var15 + var9 * (long)this.field39886);
               }
            }

            Class2381 var5 = new Class2381(this.field39881, false);

            for (long var6 = 0L; var6 < this.field39879; var6++) {
               long var17 = var6 * (long)this.field39884;

               for (long var19 = 0L; var19 < this.field39883; var19++) {
                  for (long var21 = 0L; var21 < this.field39881; var21++) {
                     long var23 = var17 + var21 * (long)this.field39886 + var19;
                     var5.method9687(var21, var1.method9653(var23));
                  }

                  this.field39889.method33647(var5);

                  for (long var45 = 0L; var45 < this.field39881; var45++) {
                     long var48 = var17 + var45 * (long)this.field39886 + var19;
                     var1.method9687(var48, var5.method9653(var45));
                  }
               }
            }

            var5 = new Class2381(this.field39879, false);

            for (long var33 = 0L; var33 < this.field39881; var33++) {
               long var43 = var33 * (long)this.field39886;

               for (long var44 = 0L; var44 < this.field39883; var44++) {
                  for (long var46 = 0L; var46 < this.field39879; var46++) {
                     long var49 = var46 * (long)this.field39884 + var43 + var44;
                     var5.method9687(var46, var1.method9653(var49));
                  }

                  this.field39888.method33647(var5);

                  for (long var47 = 0L; var47 < this.field39879; var47++) {
                     long var50 = var47 * (long)this.field39884 + var43 + var44;
                     var1.method9687(var50, var5.method9653(var47));
                  }
               }
            }
         }

         this.method31953(var1);
      }
   }

   public void method31936(double[][][] var1) {
      int var4 = Class7008.method21726();
      if (this.field39891) {
         if (var4 > 1 && this.field39892) {
            this.method31948(-1, var1, true);
            this.method31951(-1, var1, true);
         } else {
            this.method31942(-1, var1, true);
            this.method31945(-1, var1, true);
         }

         this.method31954(var1);
      } else {
         if (var4 > 1 && this.field39892 && this.field39878 >= var4 && this.field39880 >= var4 && this.field39882 >= var4) {
            Future[] var18 = new Future[var4];
            int var21 = this.field39878 / var4;

            for (int var24 = 0; var24 < var4; var24++) {
               int var30 = var24 * var21;
               int var9 = var24 == var4 - 1 ? this.field39878 : var30 + var21;
               var18[var24] = Class7008.method21729(new Class1440(this, var30, var9, var1));
            }

            try {
               Class7008.method21730(var18);
            } catch (InterruptedException var14) {
               Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var14);
            } catch (ExecutionException var15) {
               Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var15);
            }

            for (int var25 = 0; var25 < var4; var25++) {
               int var31 = var25 * var21;
               int var33 = var25 == var4 - 1 ? this.field39878 : var31 + var21;
               var18[var25] = Class7008.method21729(new Class390(this, var31, var33, var1));
            }

            try {
               Class7008.method21730(var18);
            } catch (InterruptedException var12) {
               Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var12);
            } catch (ExecutionException var13) {
               Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var13);
            }

            var21 = this.field39880 / var4;

            for (int var26 = 0; var26 < var4; var26++) {
               int var32 = var26 * var21;
               int var34 = var26 == var4 - 1 ? this.field39880 : var32 + var21;
               var18[var26] = Class7008.method21729(new Class583(this, var32, var34, var1));
            }

            try {
               Class7008.method21730(var18);
            } catch (InterruptedException var10) {
               Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var10);
            } catch (ExecutionException var11) {
               Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var11);
            }
         } else {
            for (int var5 = 0; var5 < this.field39878; var5++) {
               for (int var6 = 0; var6 < this.field39880; var6++) {
                  this.field39890.method33646(var1[var5][var6]);
               }
            }

            double[] var16 = new double[this.field39880];

            for (int var19 = 0; var19 < this.field39878; var19++) {
               for (int var7 = 0; var7 < this.field39882; var7++) {
                  for (int var8 = 0; var8 < this.field39880; var8++) {
                     var16[var8] = var1[var19][var8][var7];
                  }

                  this.field39889.method33646(var16);

                  for (int var27 = 0; var27 < this.field39880; var27++) {
                     var1[var19][var27][var7] = var16[var27];
                  }
               }
            }

            var16 = new double[this.field39878];

            for (int var20 = 0; var20 < this.field39880; var20++) {
               for (int var23 = 0; var23 < this.field39882; var23++) {
                  for (int var28 = 0; var28 < this.field39878; var28++) {
                     var16[var28] = var1[var28][var20][var23];
                  }

                  this.field39888.method33646(var16);

                  for (int var29 = 0; var29 < this.field39878; var29++) {
                     var1[var29][var20][var23] = var16[var29];
                  }
               }
            }
         }

         this.method31954(var1);
      }
   }

   public void method31937(double[] var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field39891) {
         if (var5 > 1 && this.field39892) {
            this.method31946(1, var1, var2);
            this.method31949(1, var1, var2);
         } else {
            this.method31940(1, var1, var2);
            this.method31943(1, var1, var2);
         }

         this.method31952(var1);
      } else {
         if (var5 > 1 && this.field39892 && this.field39878 >= var5 && this.field39880 >= var5 && this.field39882 >= var5) {
            Future[] var20 = new Future[var5];
            int var23 = this.field39878 / var5;

            for (int var27 = 0; var27 < var5; var27++) {
               int var31 = var27 * var23;
               int var37 = var27 == var5 - 1 ? this.field39878 : var31 + var23;
               var20[var27] = Class7008.method21729(new Class1457(this, var31, var37, var1, var2));
            }

            try {
               Class7008.method21730(var20);
            } catch (InterruptedException var16) {
               Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var16);
            } catch (ExecutionException var17) {
               Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var17);
            }

            for (int var28 = 0; var28 < var5; var28++) {
               int var32 = var28 * var23;
               int var38 = var28 == var5 - 1 ? this.field39878 : var32 + var23;
               var20[var28] = Class7008.method21729(new Class1407(this, var32, var38, var1, var2));
            }

            try {
               Class7008.method21730(var20);
            } catch (InterruptedException var14) {
               Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var14);
            } catch (ExecutionException var15) {
               Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var15);
            }

            var23 = this.field39880 / var5;

            for (int var29 = 0; var29 < var5; var29++) {
               int var33 = var29 * var23;
               int var39 = var29 == var5 - 1 ? this.field39880 : var33 + var23;
               var20[var29] = Class7008.method21729(new Class1640(this, var33, var39, var1, var2));
            }

            try {
               Class7008.method21730(var20);
            } catch (InterruptedException var12) {
               Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var12);
            } catch (ExecutionException var13) {
               Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var13);
            }
         } else {
            for (int var6 = 0; var6 < this.field39878; var6++) {
               int var7 = var6 * this.field39884;

               for (int var8 = 0; var8 < this.field39880; var8++) {
                  this.field39890.method33652(var1, var7 + var8 * this.field39886, var2);
               }
            }

            double[] var18 = new double[this.field39880];

            for (int var21 = 0; var21 < this.field39878; var21++) {
               int var25 = var21 * this.field39884;

               for (int var9 = 0; var9 < this.field39882; var9++) {
                  for (int var10 = 0; var10 < this.field39880; var10++) {
                     int var11 = var25 + var10 * this.field39886 + var9;
                     var18[var10] = var1[var11];
                  }

                  this.field39889.method33650(var18, var2);

                  for (int var34 = 0; var34 < this.field39880; var34++) {
                     int var40 = var25 + var34 * this.field39886 + var9;
                     var1[var40] = var18[var34];
                  }
               }
            }

            var18 = new double[this.field39878];

            for (int var22 = 0; var22 < this.field39880; var22++) {
               int var26 = var22 * this.field39886;

               for (int var30 = 0; var30 < this.field39882; var30++) {
                  for (int var35 = 0; var35 < this.field39878; var35++) {
                     int var41 = var35 * this.field39884 + var26 + var30;
                     var18[var35] = var1[var41];
                  }

                  this.field39888.method33650(var18, var2);

                  for (int var36 = 0; var36 < this.field39878; var36++) {
                     int var42 = var36 * this.field39884 + var26 + var30;
                     var1[var42] = var18[var36];
                  }
               }
            }
         }

         this.method31952(var1);
      }
   }

   public void method31938(Class2381 var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field39891) {
         if (var5 > 1 && this.field39892) {
            this.method31947(1, var1, var2);
            this.method31950(1, var1, var2);
         } else {
            this.method31941(1, var1, var2);
            this.method31944(1, var1, var2);
         }

         this.method31953(var1);
      } else {
         if (var5 > 1 && this.field39892 && this.field39879 >= (long)var5 && this.field39881 >= (long)var5 && this.field39883 >= (long)var5) {
            Future[] var33 = new Future[var5];
            long var35 = this.field39879 / (long)var5;

            for (int var9 = 0; var9 < var5; var9++) {
               long var39 = (long)var9 * var35;
               long var12 = var9 == var5 - 1 ? this.field39879 : var39 + var35;
               var33[var9] = Class7008.method21729(new Class1361(this, var39, var12, var1, var2));
            }

            try {
               Class7008.method21730(var33);
            } catch (InterruptedException var30) {
               Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var30);
            } catch (ExecutionException var31) {
               Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var31);
            }

            for (int var37 = 0; var37 < var5; var37++) {
               long var40 = (long)var37 * var35;
               long var42 = var37 == var5 - 1 ? this.field39879 : var40 + var35;
               var33[var37] = Class7008.method21729(new Class1449(this, var40, var42, var1, var2));
            }

            try {
               Class7008.method21730(var33);
            } catch (InterruptedException var28) {
               Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var28);
            } catch (ExecutionException var29) {
               Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var29);
            }

            var35 = this.field39881 / (long)var5;

            for (int var38 = 0; var38 < var5; var38++) {
               long var41 = (long)var38 * var35;
               long var43 = var38 == var5 - 1 ? this.field39881 : var41 + var35;
               var33[var38] = Class7008.method21729(new Class1583(this, var41, var43, var1, var2));
            }

            try {
               Class7008.method21730(var33);
            } catch (InterruptedException var26) {
               Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var26);
            } catch (ExecutionException var27) {
               Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var27);
            }
         } else {
            for (long var14 = 0L; var14 < this.field39879; var14++) {
               long var16 = var14 * this.field39885;

               for (long var10 = 0L; var10 < this.field39881; var10++) {
                  this.field39890.method33653(var1, var16 + var10 * this.field39887, var2);
               }
            }

            Class2381 var6 = new Class2381(this.field39881, false);

            for (long var7 = 0L; var7 < this.field39879; var7++) {
               long var18 = var7 * this.field39885;

               for (long var20 = 0L; var20 < this.field39883; var20++) {
                  for (long var22 = 0L; var22 < this.field39881; var22++) {
                     long var24 = var18 + var22 * this.field39887 + var20;
                     var6.method9687(var22, var1.method9653(var24));
                  }

                  this.field39889.method33651(var6, var2);

                  for (long var46 = 0L; var46 < this.field39881; var46++) {
                     long var49 = var18 + var46 * this.field39887 + var20;
                     var1.method9687(var49, var6.method9653(var46));
                  }
               }
            }

            var6 = new Class2381(this.field39879, false);

            for (long var34 = 0L; var34 < this.field39881; var34++) {
               long var44 = var34 * this.field39887;

               for (long var45 = 0L; var45 < this.field39883; var45++) {
                  for (long var47 = 0L; var47 < this.field39879; var47++) {
                     long var50 = var47 * this.field39885 + var44 + var45;
                     var6.method9687(var47, var1.method9653(var50));
                  }

                  this.field39888.method33651(var6, var2);

                  for (long var48 = 0L; var48 < this.field39879; var48++) {
                     long var51 = var48 * this.field39885 + var44 + var45;
                     var1.method9687(var51, var6.method9653(var48));
                  }
               }
            }
         }

         this.method31953(var1);
      }
   }

   public void method31939(double[][][] var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field39891) {
         if (var5 > 1 && this.field39892) {
            this.method31948(1, var1, var2);
            this.method31951(1, var1, var2);
         } else {
            this.method31942(1, var1, var2);
            this.method31945(1, var1, var2);
         }

         this.method31954(var1);
      } else {
         if (var5 > 1 && this.field39892 && this.field39878 >= var5 && this.field39880 >= var5 && this.field39882 >= var5) {
            Future[] var19 = new Future[var5];
            int var22 = this.field39878 / var5;

            for (int var25 = 0; var25 < var5; var25++) {
               int var31 = var25 * var22;
               int var10 = var25 == var5 - 1 ? this.field39878 : var31 + var22;
               var19[var25] = Class7008.method21729(new Class747(this, var31, var10, var1, var2));
            }

            try {
               Class7008.method21730(var19);
            } catch (InterruptedException var15) {
               Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var15);
            } catch (ExecutionException var16) {
               Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var16);
            }

            for (int var26 = 0; var26 < var5; var26++) {
               int var32 = var26 * var22;
               int var34 = var26 == var5 - 1 ? this.field39878 : var32 + var22;
               var19[var26] = Class7008.method21729(new Class1613(this, var32, var34, var1, var2));
            }

            try {
               Class7008.method21730(var19);
            } catch (InterruptedException var13) {
               Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var13);
            } catch (ExecutionException var14) {
               Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var14);
            }

            var22 = this.field39880 / var5;

            for (int var27 = 0; var27 < var5; var27++) {
               int var33 = var27 * var22;
               int var35 = var27 == var5 - 1 ? this.field39880 : var33 + var22;
               var19[var27] = Class7008.method21729(new Class1604(this, var33, var35, var1, var2));
            }

            try {
               Class7008.method21730(var19);
            } catch (InterruptedException var11) {
               Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var11);
            } catch (ExecutionException var12) {
               Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var12);
            }
         } else {
            for (int var6 = 0; var6 < this.field39878; var6++) {
               for (int var7 = 0; var7 < this.field39880; var7++) {
                  this.field39890.method33650(var1[var6][var7], var2);
               }
            }

            double[] var17 = new double[this.field39880];

            for (int var20 = 0; var20 < this.field39878; var20++) {
               for (int var8 = 0; var8 < this.field39882; var8++) {
                  for (int var9 = 0; var9 < this.field39880; var9++) {
                     var17[var9] = var1[var20][var9][var8];
                  }

                  this.field39889.method33650(var17, var2);

                  for (int var28 = 0; var28 < this.field39880; var28++) {
                     var1[var20][var28][var8] = var17[var28];
                  }
               }
            }

            var17 = new double[this.field39878];

            for (int var21 = 0; var21 < this.field39880; var21++) {
               for (int var24 = 0; var24 < this.field39882; var24++) {
                  for (int var29 = 0; var29 < this.field39878; var29++) {
                     var17[var29] = var1[var29][var21][var24];
                  }

                  this.field39888.method33650(var17, var2);

                  for (int var30 = 0; var30 < this.field39878; var30++) {
                     var1[var30][var21][var24] = var17[var30];
                  }
               }
            }
         }

         this.method31954(var1);
      }
   }

   private void method31940(int var1, double[] var2, boolean var3) {
      int var6 = 4 * this.field39880;
      if (this.field39882 == 2) {
         var6 >>= 1;
      }

      double[] var7 = new double[var6];
      if (var1 != -1) {
         for (int var8 = 0; var8 < this.field39878; var8++) {
            int var9 = var8 * this.field39884;

            for (int var10 = 0; var10 < this.field39880; var10++) {
               this.field39890.method33652(var2, var9 + var10 * this.field39886, var3);
            }

            if (this.field39882 <= 2) {
               if (this.field39882 == 2) {
                  for (int var17 = 0; var17 < this.field39880; var17++) {
                     int var27 = var9 + var17 * this.field39886;
                     var7[var17] = var2[var27];
                     var7[this.field39880 + var17] = var2[var27 + 1];
                  }

                  this.field39889.method33652(var7, 0, var3);
                  this.field39889.method33652(var7, this.field39880, var3);

                  for (int var18 = 0; var18 < this.field39880; var18++) {
                     int var28 = var9 + var18 * this.field39886;
                     var2[var28] = var7[var18];
                     var2[var28 + 1] = var7[this.field39880 + var18];
                  }
               }
            } else {
               for (int var16 = 0; var16 < this.field39882; var16 += 4) {
                  for (int var11 = 0; var11 < this.field39880; var11++) {
                     int var12 = var9 + var11 * this.field39886 + var16;
                     int var13 = this.field39880 + var11;
                     var7[var11] = var2[var12];
                     var7[var13] = var2[var12 + 1];
                     var7[var13 + this.field39880] = var2[var12 + 2];
                     var7[var13 + 2 * this.field39880] = var2[var12 + 3];
                  }

                  this.field39889.method33652(var7, 0, var3);
                  this.field39889.method33652(var7, this.field39880, var3);
                  this.field39889.method33652(var7, 2 * this.field39880, var3);
                  this.field39889.method33652(var7, 3 * this.field39880, var3);

                  for (int var23 = 0; var23 < this.field39880; var23++) {
                     int var26 = var9 + var23 * this.field39886 + var16;
                     int var33 = this.field39880 + var23;
                     var2[var26] = var7[var23];
                     var2[var26 + 1] = var7[var33];
                     var2[var26 + 2] = var7[var33 + this.field39880];
                     var2[var26 + 3] = var7[var33 + 2 * this.field39880];
                  }
               }
            }
         }
      } else {
         for (int var14 = 0; var14 < this.field39878; var14++) {
            int var15 = var14 * this.field39884;

            for (int var19 = 0; var19 < this.field39880; var19++) {
               this.field39890.method33648(var2, var15 + var19 * this.field39886);
            }

            if (this.field39882 <= 2) {
               if (this.field39882 == 2) {
                  for (int var21 = 0; var21 < this.field39880; var21++) {
                     int var31 = var15 + var21 * this.field39886;
                     var7[var21] = var2[var31];
                     var7[this.field39880 + var21] = var2[var31 + 1];
                  }

                  this.field39889.method33648(var7, 0);
                  this.field39889.method33648(var7, this.field39880);

                  for (int var22 = 0; var22 < this.field39880; var22++) {
                     int var32 = var15 + var22 * this.field39886;
                     var2[var32] = var7[var22];
                     var2[var32 + 1] = var7[this.field39880 + var22];
                  }
               }
            } else {
               for (int var20 = 0; var20 < this.field39882; var20 += 4) {
                  for (int var24 = 0; var24 < this.field39880; var24++) {
                     int var29 = var15 + var24 * this.field39886 + var20;
                     int var34 = this.field39880 + var24;
                     var7[var24] = var2[var29];
                     var7[var34] = var2[var29 + 1];
                     var7[var34 + this.field39880] = var2[var29 + 2];
                     var7[var34 + 2 * this.field39880] = var2[var29 + 3];
                  }

                  this.field39889.method33648(var7, 0);
                  this.field39889.method33648(var7, this.field39880);
                  this.field39889.method33648(var7, 2 * this.field39880);
                  this.field39889.method33648(var7, 3 * this.field39880);

                  for (int var25 = 0; var25 < this.field39880; var25++) {
                     int var30 = var15 + var25 * this.field39886 + var20;
                     int var35 = this.field39880 + var25;
                     var2[var30] = var7[var25];
                     var2[var30 + 1] = var7[var35];
                     var2[var30 + 2] = var7[var35 + this.field39880];
                     var2[var30 + 3] = var7[var35 + 2 * this.field39880];
                  }
               }
            }
         }
      }
   }

   private void method31941(int var1, Class2381 var2, boolean var3) {
      long var6 = 4L * this.field39881;
      if (this.field39883 == 2L) {
         var6 >>= 1;
      }

      Class2381 var8 = new Class2381(var6);
      if (var1 != -1) {
         for (long var9 = 0L; var9 < this.field39879; var9++) {
            long var11 = var9 * this.field39885;

            for (long var13 = 0L; var13 < this.field39881; var13++) {
               this.field39890.method33653(var2, var11 + var13 * this.field39887, var3);
            }

            if (this.field39883 <= 2L) {
               if (this.field39883 == 2L) {
                  for (long var24 = 0L; var24 < this.field39881; var24++) {
                     long var34 = var11 + var24 * this.field39887;
                     var8.method9687(var24, var2.method9653(var34));
                     var8.method9687(this.field39881 + var24, var2.method9653(var34 + 1L));
                  }

                  this.field39889.method33653(var8, 0L, var3);
                  this.field39889.method33653(var8, this.field39881, var3);

                  for (long var25 = 0L; var25 < this.field39881; var25++) {
                     long var35 = var11 + var25 * this.field39887;
                     var2.method9687(var35, var8.method9653(var25));
                     var2.method9687(var35 + 1L, var8.method9653(this.field39881 + var25));
                  }
               }
            } else {
               for (long var23 = 0L; var23 < this.field39883; var23 += 4L) {
                  for (long var15 = 0L; var15 < this.field39881; var15++) {
                     long var17 = var11 + var15 * this.field39887 + var23;
                     long var19 = this.field39881 + var15;
                     var8.method9687(var15, var2.method9653(var17));
                     var8.method9687(var19, var2.method9653(var17 + 1L));
                     var8.method9687(var19 + this.field39881, var2.method9653(var17 + 2L));
                     var8.method9687(var19 + 2L * this.field39881, var2.method9653(var17 + 3L));
                  }

                  this.field39889.method33653(var8, 0L, var3);
                  this.field39889.method33653(var8, this.field39881, var3);
                  this.field39889.method33653(var8, 2L * this.field39881, var3);
                  this.field39889.method33653(var8, 3L * this.field39881, var3);

                  for (long var30 = 0L; var30 < this.field39881; var30++) {
                     long var33 = var11 + var30 * this.field39887 + var23;
                     long var40 = this.field39881 + var30;
                     var2.method9687(var33, var8.method9653(var30));
                     var2.method9687(var33 + 1L, var8.method9653(var40));
                     var2.method9687(var33 + 2L, var8.method9653(var40 + this.field39881));
                     var2.method9687(var33 + 3L, var8.method9653(var40 + 2L * this.field39881));
                  }
               }
            }
         }
      } else {
         for (long var21 = 0L; var21 < this.field39879; var21++) {
            long var22 = var21 * this.field39885;

            for (long var26 = 0L; var26 < this.field39881; var26++) {
               this.field39890.method33649(var2, var22 + var26 * this.field39887);
            }

            if (this.field39883 <= 2L) {
               if (this.field39883 == 2L) {
                  for (long var28 = 0L; var28 < this.field39881; var28++) {
                     long var38 = var22 + var28 * this.field39887;
                     var8.method9687(var28, var2.method9653(var38));
                     var8.method9687(this.field39881 + var28, var2.method9653(var38 + 1L));
                  }

                  this.field39889.method33649(var8, 0L);
                  this.field39889.method33649(var8, this.field39881);

                  for (long var29 = 0L; var29 < this.field39881; var29++) {
                     long var39 = var22 + var29 * this.field39887;
                     var2.method9687(var39, var8.method9653(var29));
                     var2.method9687(var39 + 1L, var8.method9653(this.field39881 + var29));
                  }
               }
            } else {
               for (long var27 = 0L; var27 < this.field39883; var27 += 4L) {
                  for (long var31 = 0L; var31 < this.field39881; var31++) {
                     long var36 = var22 + var31 * this.field39887 + var27;
                     long var41 = this.field39881 + var31;
                     var8.method9687(var31, var2.method9653(var36));
                     var8.method9687(var41, var2.method9653(var36 + 1L));
                     var8.method9687(var41 + this.field39881, var2.method9653(var36 + 2L));
                     var8.method9687(var41 + 2L * this.field39881, var2.method9653(var36 + 3L));
                  }

                  this.field39889.method33649(var8, 0L);
                  this.field39889.method33649(var8, this.field39881);
                  this.field39889.method33649(var8, 2L * this.field39881);
                  this.field39889.method33649(var8, 3L * this.field39881);

                  for (long var32 = 0L; var32 < this.field39881; var32++) {
                     long var37 = var22 + var32 * this.field39887 + var27;
                     long var42 = this.field39881 + var32;
                     var2.method9687(var37, var8.method9653(var32));
                     var2.method9687(var37 + 1L, var8.method9653(var42));
                     var2.method9687(var37 + 2L, var8.method9653(var42 + this.field39881));
                     var2.method9687(var37 + 3L, var8.method9653(var42 + 2L * this.field39881));
                  }
               }
            }
         }
      }
   }

   private void method31942(int var1, double[][][] var2, boolean var3) {
      int var6 = 4 * this.field39880;
      if (this.field39883 == 2L) {
         var6 >>= 1;
      }

      double[] var7 = new double[var6];
      if (var1 != -1) {
         for (int var8 = 0; var8 < this.field39878; var8++) {
            for (int var9 = 0; var9 < this.field39880; var9++) {
               this.field39890.method33650(var2[var8][var9], var3);
            }

            if (this.field39882 <= 2) {
               if (this.field39882 == 2) {
                  for (int var14 = 0; var14 < this.field39880; var14++) {
                     var7[var14] = var2[var8][var14][0];
                     var7[this.field39880 + var14] = var2[var8][var14][1];
                  }

                  this.field39889.method33652(var7, 0, var3);
                  this.field39889.method33652(var7, this.field39880, var3);

                  for (int var15 = 0; var15 < this.field39880; var15++) {
                     var2[var8][var15][0] = var7[var15];
                     var2[var8][var15][1] = var7[this.field39880 + var15];
                  }
               }
            } else {
               for (int var13 = 0; var13 < this.field39882; var13 += 4) {
                  for (int var10 = 0; var10 < this.field39880; var10++) {
                     int var11 = this.field39880 + var10;
                     var7[var10] = var2[var8][var10][var13];
                     var7[var11] = var2[var8][var10][var13 + 1];
                     var7[var11 + this.field39880] = var2[var8][var10][var13 + 2];
                     var7[var11 + 2 * this.field39880] = var2[var8][var10][var13 + 3];
                  }

                  this.field39889.method33652(var7, 0, var3);
                  this.field39889.method33652(var7, this.field39880, var3);
                  this.field39889.method33652(var7, 2 * this.field39880, var3);
                  this.field39889.method33652(var7, 3 * this.field39880, var3);

                  for (int var20 = 0; var20 < this.field39880; var20++) {
                     int var23 = this.field39880 + var20;
                     var2[var8][var20][var13] = var7[var20];
                     var2[var8][var20][var13 + 1] = var7[var23];
                     var2[var8][var20][var13 + 2] = var7[var23 + this.field39880];
                     var2[var8][var20][var13 + 3] = var7[var23 + 2 * this.field39880];
                  }
               }
            }
         }
      } else {
         for (int var12 = 0; var12 < this.field39878; var12++) {
            for (int var16 = 0; var16 < this.field39880; var16++) {
               this.field39890.method33646(var2[var12][var16]);
            }

            if (this.field39882 <= 2) {
               if (this.field39882 == 2) {
                  for (int var18 = 0; var18 < this.field39880; var18++) {
                     var7[var18] = var2[var12][var18][0];
                     var7[this.field39880 + var18] = var2[var12][var18][1];
                  }

                  this.field39889.method33648(var7, 0);
                  this.field39889.method33648(var7, this.field39880);

                  for (int var19 = 0; var19 < this.field39880; var19++) {
                     var2[var12][var19][0] = var7[var19];
                     var2[var12][var19][1] = var7[this.field39880 + var19];
                  }
               }
            } else {
               for (int var17 = 0; var17 < this.field39882; var17 += 4) {
                  for (int var21 = 0; var21 < this.field39880; var21++) {
                     int var24 = this.field39880 + var21;
                     var7[var21] = var2[var12][var21][var17];
                     var7[var24] = var2[var12][var21][var17 + 1];
                     var7[var24 + this.field39880] = var2[var12][var21][var17 + 2];
                     var7[var24 + 2 * this.field39880] = var2[var12][var21][var17 + 3];
                  }

                  this.field39889.method33648(var7, 0);
                  this.field39889.method33648(var7, this.field39880);
                  this.field39889.method33648(var7, 2 * this.field39880);
                  this.field39889.method33648(var7, 3 * this.field39880);

                  for (int var22 = 0; var22 < this.field39880; var22++) {
                     int var25 = this.field39880 + var22;
                     var2[var12][var22][var17] = var7[var22];
                     var2[var12][var22][var17 + 1] = var7[var25];
                     var2[var12][var22][var17 + 2] = var7[var25 + this.field39880];
                     var2[var12][var22][var17 + 3] = var7[var25 + 2 * this.field39880];
                  }
               }
            }
         }
      }
   }

   private void method31943(int var1, double[] var2, boolean var3) {
      int var6 = 4 * this.field39878;
      if (this.field39882 == 2) {
         var6 >>= 1;
      }

      double[] var7 = new double[var6];
      if (var1 != -1) {
         if (this.field39882 <= 2) {
            if (this.field39882 == 2) {
               for (int var8 = 0; var8 < this.field39880; var8++) {
                  int var9 = var8 * this.field39886;

                  for (int var10 = 0; var10 < this.field39878; var10++) {
                     int var12 = var10 * this.field39884 + var9;
                     var7[var10] = var2[var12];
                     var7[this.field39878 + var10] = var2[var12 + 1];
                  }

                  this.field39888.method33652(var7, 0, var3);
                  this.field39888.method33652(var7, this.field39878, var3);

                  for (int var20 = 0; var20 < this.field39878; var20++) {
                     int var28 = var20 * this.field39884 + var9;
                     var2[var28] = var7[var20];
                     var2[var28 + 1] = var7[this.field39878 + var20];
                  }
               }
            }
         } else {
            for (int var14 = 0; var14 < this.field39880; var14++) {
               int var17 = var14 * this.field39886;

               for (int var21 = 0; var21 < this.field39882; var21 += 4) {
                  for (int var11 = 0; var11 < this.field39878; var11++) {
                     int var29 = var11 * this.field39884 + var17 + var21;
                     int var13 = this.field39878 + var11;
                     var7[var11] = var2[var29];
                     var7[var13] = var2[var29 + 1];
                     var7[var13 + this.field39878] = var2[var29 + 2];
                     var7[var13 + 2 * this.field39878] = var2[var29 + 3];
                  }

                  this.field39888.method33652(var7, 0, var3);
                  this.field39888.method33652(var7, this.field39878, var3);
                  this.field39888.method33652(var7, 2 * this.field39878, var3);
                  this.field39888.method33652(var7, 3 * this.field39878, var3);

                  for (int var25 = 0; var25 < this.field39878; var25++) {
                     int var30 = var25 * this.field39884 + var17 + var21;
                     int var35 = this.field39878 + var25;
                     var2[var30] = var7[var25];
                     var2[var30 + 1] = var7[var35];
                     var2[var30 + 2] = var7[var35 + this.field39878];
                     var2[var30 + 3] = var7[var35 + 2 * this.field39878];
                  }
               }
            }
         }
      } else if (this.field39882 <= 2) {
         if (this.field39882 == 2) {
            for (int var15 = 0; var15 < this.field39880; var15++) {
               int var18 = var15 * this.field39886;

               for (int var22 = 0; var22 < this.field39878; var22++) {
                  int var31 = var22 * this.field39884 + var18;
                  var7[var22] = var2[var31];
                  var7[this.field39878 + var22] = var2[var31 + 1];
               }

               this.field39888.method33648(var7, 0);
               this.field39888.method33648(var7, this.field39878);

               for (int var23 = 0; var23 < this.field39878; var23++) {
                  int var32 = var23 * this.field39884 + var18;
                  var2[var32] = var7[var23];
                  var2[var32 + 1] = var7[this.field39878 + var23];
               }
            }
         }
      } else {
         for (int var16 = 0; var16 < this.field39880; var16++) {
            int var19 = var16 * this.field39886;

            for (int var24 = 0; var24 < this.field39882; var24 += 4) {
               for (int var26 = 0; var26 < this.field39878; var26++) {
                  int var33 = var26 * this.field39884 + var19 + var24;
                  int var36 = this.field39878 + var26;
                  var7[var26] = var2[var33];
                  var7[var36] = var2[var33 + 1];
                  var7[var36 + this.field39878] = var2[var33 + 2];
                  var7[var36 + 2 * this.field39878] = var2[var33 + 3];
               }

               this.field39888.method33648(var7, 0);
               this.field39888.method33648(var7, this.field39878);
               this.field39888.method33648(var7, 2 * this.field39878);
               this.field39888.method33648(var7, 3 * this.field39878);

               for (int var27 = 0; var27 < this.field39878; var27++) {
                  int var34 = var27 * this.field39884 + var19 + var24;
                  int var37 = this.field39878 + var27;
                  var2[var34] = var7[var27];
                  var2[var34 + 1] = var7[var37];
                  var2[var34 + 2] = var7[var37 + this.field39878];
                  var2[var34 + 3] = var7[var37 + 2 * this.field39878];
               }
            }
         }
      }
   }

   private void method31944(int var1, Class2381 var2, boolean var3) {
      long var6 = 4L * this.field39879;
      if (this.field39883 == 2L) {
         var6 >>= 1;
      }

      Class2381 var8 = new Class2381(var6);
      if (var1 != -1) {
         if (this.field39883 <= 2L) {
            if (this.field39883 == 2L) {
               for (long var9 = 0L; var9 < this.field39881; var9++) {
                  long var11 = var9 * this.field39887;

                  for (long var13 = 0L; var13 < this.field39879; var13++) {
                     long var17 = var13 * this.field39885 + var11;
                     var8.method9687(var13, var2.method9653(var17));
                     var8.method9687(this.field39879 + var13, var2.method9653(var17 + 1L));
                  }

                  this.field39888.method33653(var8, 0L, var3);
                  this.field39888.method33653(var8, this.field39879, var3);

                  for (long var27 = 0L; var27 < this.field39879; var27++) {
                     long var35 = var27 * this.field39885 + var11;
                     var2.method9687(var35, var8.method9653(var27));
                     var2.method9687(var35 + 1L, var8.method9653(this.field39879 + var27));
                  }
               }
            }
         } else {
            for (long var21 = 0L; var21 < this.field39881; var21++) {
               long var24 = var21 * this.field39887;

               for (long var28 = 0L; var28 < this.field39883; var28 += 4L) {
                  for (long var15 = 0L; var15 < this.field39879; var15++) {
                     long var36 = var15 * this.field39885 + var24 + var28;
                     long var19 = this.field39879 + var15;
                     var8.method9687(var15, var2.method9653(var36));
                     var8.method9687(var19, var2.method9653(var36 + 1L));
                     var8.method9687(var19 + this.field39879, var2.method9653(var36 + 2L));
                     var8.method9687(var19 + 2L * this.field39879, var2.method9653(var36 + 3L));
                  }

                  this.field39888.method33653(var8, 0L, var3);
                  this.field39888.method33653(var8, this.field39879, var3);
                  this.field39888.method33653(var8, 2L * this.field39879, var3);
                  this.field39888.method33653(var8, 3L * this.field39879, var3);

                  for (long var32 = 0L; var32 < this.field39879; var32++) {
                     long var37 = var32 * this.field39885 + var24 + var28;
                     long var42 = this.field39879 + var32;
                     var2.method9687(var37, var8.method9653(var32));
                     var2.method9687(var37 + 1L, var8.method9653(var42));
                     var2.method9687(var37 + 2L, var8.method9653(var42 + this.field39879));
                     var2.method9687(var37 + 3L, var8.method9653(var42 + 2L * this.field39879));
                  }
               }
            }
         }
      } else if (this.field39883 <= 2L) {
         if (this.field39883 == 2L) {
            for (long var22 = 0L; var22 < this.field39881; var22++) {
               long var25 = var22 * this.field39887;

               for (long var29 = 0L; var29 < this.field39879; var29++) {
                  long var38 = var29 * this.field39885 + var25;
                  var8.method9687(var29, var2.method9653(var38));
                  var8.method9687(this.field39879 + var29, var2.method9653(var38 + 1L));
               }

               this.field39888.method33649(var8, 0L);
               this.field39888.method33649(var8, this.field39879);

               for (long var30 = 0L; var30 < this.field39879; var30++) {
                  long var39 = var30 * this.field39885 + var25;
                  var2.method9687(var39, var8.method9653(var30));
                  var2.method9687(var39 + 1L, var8.method9653(this.field39879 + var30));
               }
            }
         }
      } else {
         for (long var23 = 0L; var23 < this.field39881; var23++) {
            long var26 = var23 * this.field39887;

            for (long var31 = 0L; var31 < this.field39883; var31 += 4L) {
               for (long var33 = 0L; var33 < this.field39879; var33++) {
                  long var40 = var33 * this.field39885 + var26 + var31;
                  long var43 = this.field39879 + var33;
                  var8.method9687(var33, var2.method9653(var40));
                  var8.method9687(var43, var2.method9653(var40 + 1L));
                  var8.method9687(var43 + this.field39879, var2.method9653(var40 + 2L));
                  var8.method9687(var43 + 2L * this.field39879, var2.method9653(var40 + 3L));
               }

               this.field39888.method33649(var8, 0L);
               this.field39888.method33649(var8, this.field39879);
               this.field39888.method33649(var8, 2L * this.field39879);
               this.field39888.method33649(var8, 3L * this.field39879);

               for (long var34 = 0L; var34 < this.field39879; var34++) {
                  long var41 = var34 * this.field39885 + var26 + var31;
                  long var44 = this.field39879 + var34;
                  var2.method9687(var41, var8.method9653(var34));
                  var2.method9687(var41 + 1L, var8.method9653(var44));
                  var2.method9687(var41 + 2L, var8.method9653(var44 + this.field39879));
                  var2.method9687(var41 + 3L, var8.method9653(var44 + 2L * this.field39879));
               }
            }
         }
      }
   }

   private void method31945(int var1, double[][][] var2, boolean var3) {
      int var6 = 4 * this.field39878;
      if (this.field39882 == 2) {
         var6 >>= 1;
      }

      double[] var7 = new double[var6];
      if (var1 != -1) {
         if (this.field39882 <= 2) {
            if (this.field39882 == 2) {
               for (int var8 = 0; var8 < this.field39880; var8++) {
                  for (int var9 = 0; var9 < this.field39878; var9++) {
                     var7[var9] = var2[var9][var8][0];
                     var7[this.field39878 + var9] = var2[var9][var8][1];
                  }

                  this.field39888.method33652(var7, 0, var3);
                  this.field39888.method33652(var7, this.field39878, var3);

                  for (int var15 = 0; var15 < this.field39878; var15++) {
                     var2[var15][var8][0] = var7[var15];
                     var2[var15][var8][1] = var7[this.field39878 + var15];
                  }
               }
            }
         } else {
            for (int var12 = 0; var12 < this.field39880; var12++) {
               for (int var16 = 0; var16 < this.field39882; var16 += 4) {
                  for (int var10 = 0; var10 < this.field39878; var10++) {
                     int var11 = this.field39878 + var10;
                     var7[var10] = var2[var10][var12][var16];
                     var7[var11] = var2[var10][var12][var16 + 1];
                     var7[var11 + this.field39878] = var2[var10][var12][var16 + 2];
                     var7[var11 + 2 * this.field39878] = var2[var10][var12][var16 + 3];
                  }

                  this.field39888.method33652(var7, 0, var3);
                  this.field39888.method33652(var7, this.field39878, var3);
                  this.field39888.method33652(var7, 2 * this.field39878, var3);
                  this.field39888.method33652(var7, 3 * this.field39878, var3);

                  for (int var20 = 0; var20 < this.field39878; var20++) {
                     int var23 = this.field39878 + var20;
                     var2[var20][var12][var16] = var7[var20];
                     var2[var20][var12][var16 + 1] = var7[var23];
                     var2[var20][var12][var16 + 2] = var7[var23 + this.field39878];
                     var2[var20][var12][var16 + 3] = var7[var23 + 2 * this.field39878];
                  }
               }
            }
         }
      } else if (this.field39882 <= 2) {
         if (this.field39882 == 2) {
            for (int var13 = 0; var13 < this.field39880; var13++) {
               for (int var17 = 0; var17 < this.field39878; var17++) {
                  var7[var17] = var2[var17][var13][0];
                  var7[this.field39878 + var17] = var2[var17][var13][1];
               }

               this.field39888.method33648(var7, 0);
               this.field39888.method33648(var7, this.field39878);

               for (int var18 = 0; var18 < this.field39878; var18++) {
                  var2[var18][var13][0] = var7[var18];
                  var2[var18][var13][1] = var7[this.field39878 + var18];
               }
            }
         }
      } else {
         for (int var14 = 0; var14 < this.field39880; var14++) {
            for (int var19 = 0; var19 < this.field39882; var19 += 4) {
               for (int var21 = 0; var21 < this.field39878; var21++) {
                  int var24 = this.field39878 + var21;
                  var7[var21] = var2[var21][var14][var19];
                  var7[var24] = var2[var21][var14][var19 + 1];
                  var7[var24 + this.field39878] = var2[var21][var14][var19 + 2];
                  var7[var24 + 2 * this.field39878] = var2[var21][var14][var19 + 3];
               }

               this.field39888.method33648(var7, 0);
               this.field39888.method33648(var7, this.field39878);
               this.field39888.method33648(var7, 2 * this.field39878);
               this.field39888.method33648(var7, 3 * this.field39878);

               for (int var22 = 0; var22 < this.field39878; var22++) {
                  int var25 = this.field39878 + var22;
                  var2[var22][var14][var19] = var7[var22];
                  var2[var22][var14][var19 + 1] = var7[var25];
                  var2[var22][var14][var19 + 2] = var7[var25 + this.field39878];
                  var2[var22][var14][var19 + 3] = var7[var25 + 2 * this.field39878];
               }
            }
         }
      }
   }

   private void method31946(int var1, double[] var2, boolean var3) {
      int var6 = Class7008.method21726() > this.field39878 ? this.field39878 : Class7008.method21726();
      int var7 = 4 * this.field39880;
      if (this.field39882 == 2) {
         var7 >>= 1;
      }

      int var8 = var7;
      Future[] var9 = new Future[var6];

      for (int var10 = 0; var10 < var6; var10++) {
         var9[var10] = Class7008.method21729(new Class700(this, var8, var1, var10, var6, var2, var3));
      }

      try {
         Class7008.method21730(var9);
      } catch (InterruptedException var12) {
         Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var12);
      } catch (ExecutionException var13) {
         Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var13);
      }
   }

   private void method31947(int var1, Class2381 var2, boolean var3) {
      int var6 = (int)((long)Class7008.method21726() > this.field39879 ? this.field39879 : (long)Class7008.method21726());
      long var7 = 4L * this.field39881;
      if (this.field39883 == 2L) {
         var7 >>= 1;
      }

      long var9 = var7;
      Future[] var11 = new Future[var6];

      for (int var12 = 0; var12 < var6; var12++) {
         long var13 = (long)var12;
         var11[var12] = Class7008.method21729(new Class701(this, var9, var1, var13, var6, var2, var3));
      }

      try {
         Class7008.method21730(var11);
      } catch (InterruptedException var15) {
         Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var15);
      } catch (ExecutionException var16) {
         Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var16);
      }
   }

   private void method31948(int var1, double[][][] var2, boolean var3) {
      int var6 = Class7008.method21726() > this.field39878 ? this.field39878 : Class7008.method21726();
      int var7 = 4 * this.field39880;
      if (this.field39882 == 2) {
         var7 >>= 1;
      }

      int var8 = var7;
      Future[] var9 = new Future[var6];

      for (int var10 = 0; var10 < var6; var10++) {
         var9[var10] = Class7008.method21729(new Class531(this, var8, var1, var10, var6, var2, var3));
      }

      try {
         Class7008.method21730(var9);
      } catch (InterruptedException var12) {
         Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var12);
      } catch (ExecutionException var13) {
         Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var13);
      }
   }

   private void method31949(int var1, double[] var2, boolean var3) {
      int var6 = Class7008.method21726() > this.field39880 ? this.field39880 : Class7008.method21726();
      int var7 = 4 * this.field39878;
      if (this.field39882 == 2) {
         var7 >>= 1;
      }

      int var8 = var7;
      Future[] var9 = new Future[var6];

      for (int var10 = 0; var10 < var6; var10++) {
         var9[var10] = Class7008.method21729(new Class723(this, var8, var1, var10, var6, var2, var3));
      }

      try {
         Class7008.method21730(var9);
      } catch (InterruptedException var12) {
         Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var12);
      } catch (ExecutionException var13) {
         Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var13);
      }
   }

   private void method31950(int var1, Class2381 var2, boolean var3) {
      int var6 = (int)((long)Class7008.method21726() > this.field39881 ? this.field39881 : (long)Class7008.method21726());
      long var7 = 4L * this.field39879;
      if (this.field39883 == 2L) {
         var7 >>= 1;
      }

      long var9 = var7;
      Future[] var11 = new Future[var6];

      for (int var12 = 0; var12 < var6; var12++) {
         long var13 = (long)var12;
         var11[var12] = Class7008.method21729(new Class1601(this, var9, var1, var13, var6, var2, var3));
      }

      try {
         Class7008.method21730(var11);
      } catch (InterruptedException var15) {
         Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var15);
      } catch (ExecutionException var16) {
         Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var16);
      }
   }

   private void method31951(int var1, double[][][] var2, boolean var3) {
      int var6 = Class7008.method21726() > this.field39880 ? this.field39880 : Class7008.method21726();
      int var7 = 4 * this.field39878;
      if (this.field39882 == 2) {
         var7 >>= 1;
      }

      int var8 = var7;
      Future[] var9 = new Future[var6];

      for (int var10 = 0; var10 < var6; var10++) {
         var9[var10] = Class7008.method21729(new Class507(this, var8, var1, var10, var6, var2, var3));
      }

      try {
         Class7008.method21730(var9);
      } catch (InterruptedException var12) {
         Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var12);
      } catch (ExecutionException var13) {
         Logger.getLogger(Class8832.class.getName()).log(Level.SEVERE, null, var13);
      }
   }

   private void method31952(double[] var1) {
      for (int var4 = 0; var4 <= this.field39878 / 2; var4++) {
         int var5 = (this.field39878 - var4) % this.field39878;
         int var6 = var4 * this.field39884;
         int var7 = var5 * this.field39884;

         for (int var8 = 0; var8 <= this.field39880 / 2; var8++) {
            int var9 = (this.field39880 - var8) % this.field39880;
            int var10 = var8 * this.field39886;
            int var11 = var9 * this.field39886;

            for (int var12 = 0; var12 <= this.field39882 / 2; var12++) {
               int var13 = (this.field39882 - var12) % this.field39882;
               int var14 = var6 + var11 + var12;
               int var15 = var6 + var10 + var13;
               int var16 = var7 + var10 + var12;
               int var17 = var7 + var11 + var13;
               int var18 = var7 + var11 + var12;
               int var19 = var7 + var10 + var13;
               int var20 = var6 + var10 + var12;
               int var21 = var6 + var11 + var13;
               double var22 = var1[var14];
               double var24 = var1[var15];
               double var26 = var1[var16];
               double var28 = var1[var17];
               double var30 = var1[var18];
               double var32 = var1[var19];
               double var34 = var1[var20];
               double var36 = var1[var21];
               var1[var20] = (var22 + var24 + var26 - var28) / 2.0;
               var1[var16] = (var30 + var32 + var34 - var36) / 2.0;
               var1[var14] = (var34 + var36 + var30 - var32) / 2.0;
               var1[var18] = (var26 + var28 + var22 - var24) / 2.0;
               var1[var15] = (var36 + var34 + var32 - var30) / 2.0;
               var1[var19] = (var28 + var26 + var24 - var22) / 2.0;
               var1[var21] = (var24 + var22 + var28 - var26) / 2.0;
               var1[var17] = (var32 + var30 + var36 - var34) / 2.0;
            }
         }
      }
   }

   private void method31953(Class2381 var1) {
      for (long var4 = 0L; var4 <= this.field39879 / 2L; var4++) {
         long var6 = (this.field39879 - var4) % this.field39879;
         long var8 = var4 * this.field39885;
         long var10 = var6 * this.field39885;

         for (long var12 = 0L; var12 <= this.field39881 / 2L; var12++) {
            long var14 = (this.field39881 - var12) % this.field39881;
            long var16 = var12 * this.field39887;
            long var18 = var14 * this.field39887;

            for (long var20 = 0L; var20 <= this.field39883 / 2L; var20++) {
               long var22 = (this.field39883 - var20) % this.field39883;
               long var24 = var8 + var18 + var20;
               long var26 = var8 + var16 + var22;
               long var28 = var10 + var16 + var20;
               long var30 = var10 + var18 + var22;
               long var32 = var10 + var18 + var20;
               long var34 = var10 + var16 + var22;
               long var36 = var8 + var16 + var20;
               long var38 = var8 + var18 + var22;
               double var40 = var1.method9653(var24);
               double var42 = var1.method9653(var26);
               double var44 = var1.method9653(var28);
               double var46 = var1.method9653(var30);
               double var48 = var1.method9653(var32);
               double var50 = var1.method9653(var34);
               double var52 = var1.method9653(var36);
               double var54 = var1.method9653(var38);
               var1.method9687(var36, (var40 + var42 + var44 - var46) / 2.0);
               var1.method9687(var28, (var48 + var50 + var52 - var54) / 2.0);
               var1.method9687(var24, (var52 + var54 + var48 - var50) / 2.0);
               var1.method9687(var32, (var44 + var46 + var40 - var42) / 2.0);
               var1.method9687(var26, (var54 + var52 + var50 - var48) / 2.0);
               var1.method9687(var34, (var46 + var44 + var42 - var40) / 2.0);
               var1.method9687(var38, (var42 + var40 + var46 - var44) / 2.0);
               var1.method9687(var30, (var50 + var48 + var54 - var52) / 2.0);
            }
         }
      }
   }

   private void method31954(double[][][] var1) {
      for (int var4 = 0; var4 <= this.field39878 / 2; var4++) {
         int var5 = (this.field39878 - var4) % this.field39878;

         for (int var6 = 0; var6 <= this.field39880 / 2; var6++) {
            int var7 = (this.field39880 - var6) % this.field39880;

            for (int var8 = 0; var8 <= this.field39882 / 2; var8++) {
               int var9 = (this.field39882 - var8) % this.field39882;
               double var10 = var1[var4][var7][var8];
               double var12 = var1[var4][var6][var9];
               double var14 = var1[var5][var6][var8];
               double var16 = var1[var5][var7][var9];
               double var18 = var1[var5][var7][var8];
               double var20 = var1[var5][var6][var9];
               double var22 = var1[var4][var6][var8];
               double var24 = var1[var4][var7][var9];
               var1[var4][var6][var8] = (var10 + var12 + var14 - var16) / 2.0;
               var1[var5][var6][var8] = (var18 + var20 + var22 - var24) / 2.0;
               var1[var4][var7][var8] = (var22 + var24 + var18 - var20) / 2.0;
               var1[var5][var7][var8] = (var14 + var16 + var10 - var12) / 2.0;
               var1[var4][var6][var9] = (var24 + var22 + var20 - var18) / 2.0;
               var1[var5][var6][var9] = (var16 + var14 + var12 - var10) / 2.0;
               var1[var4][var7][var9] = (var12 + var10 + var16 - var14) / 2.0;
               var1[var5][var7][var9] = (var20 + var18 + var24 - var22) / 2.0;
            }
         }
      }
   }

   // $VF: synthetic method
   public static int method31955(Class8832 var0) {
      return var0.field39884;
   }

   // $VF: synthetic method
   public static int method31956(Class8832 var0) {
      return var0.field39880;
   }

   // $VF: synthetic method
   public static int method31957(Class8832 var0) {
      return var0.field39886;
   }

   // $VF: synthetic method
   public static Class9049 method31958(Class8832 var0) {
      return var0.field39890;
   }

   // $VF: synthetic method
   public static int method31959(Class8832 var0) {
      return var0.field39882;
   }

   // $VF: synthetic method
   public static Class9049 method31960(Class8832 var0) {
      return var0.field39889;
   }

   // $VF: synthetic method
   public static int method31961(Class8832 var0) {
      return var0.field39878;
   }

   // $VF: synthetic method
   public static Class9049 method31962(Class8832 var0) {
      return var0.field39888;
   }

   // $VF: synthetic method
   public static long method31963(Class8832 var0) {
      return var0.field39881;
   }

   // $VF: synthetic method
   public static long method31964(Class8832 var0) {
      return var0.field39883;
   }

   // $VF: synthetic method
   public static long method31965(Class8832 var0) {
      return var0.field39879;
   }

   // $VF: synthetic method
   public static long method31966(Class8832 var0) {
      return var0.field39885;
   }

   // $VF: synthetic method
   public static long method31967(Class8832 var0) {
      return var0.field39887;
   }
}
