package mapped;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class8543 {
   private int field38400;
   private int field38401;
   private long field38402;
   private long field38403;
   private Class8630 field38404;
   private Class8630 field38405;
   private boolean field38406 = false;
   private boolean field38407 = false;

   public Class8543(long var1, long var3) {
      if (var1 > 1L && var3 > 1L) {
         this.field38400 = (int)var1;
         this.field38401 = (int)var3;
         this.field38402 = var1;
         this.field38403 = var3;
         if (var1 * var3 >= Class7796.method25893()) {
            this.field38407 = true;
         }

         if (Class7796.method25908(var1) && Class7796.method25908(var3)) {
            this.field38406 = true;
         }

         Class7796.method25902(2L * var1 * var3 > (long)Class2373.method9693());
         this.field38405 = new Class8630(var1);
         if (var1 != var3) {
            this.field38404 = new Class8630(var3);
         } else {
            this.field38404 = this.field38405;
         }
      } else {
         throw new IllegalArgumentException("rows and columns must be greater than 1");
      }
   }

   public void method30392(float[] var1) {
      int var4 = Class7008.method21726();
      if (this.field38406) {
         this.field38401 = 2 * this.field38401;
         if (var4 > 1 && this.field38407) {
            this.method30422(0, -1, var1, true);
            this.method30428(-1, var1, true);
         } else {
            for (int var5 = 0; var5 < this.field38400; var5++) {
               this.field38404.method30931(var1, var5 * this.field38401);
            }

            this.method30419(-1, var1, true);
         }

         this.field38401 /= 2;
      } else {
         int var16 = 2 * this.field38401;
         if (var4 > 1 && this.field38407 && this.field38400 >= var4 && this.field38401 >= var4) {
            Future[] var18 = new Future[var4];
            int var19 = this.field38400 / var4;

            for (int var21 = 0; var21 < var4; var21++) {
               int var24 = var21 * var19;
               int var27 = var21 == var4 - 1 ? this.field38400 : var24 + var19;
               var18[var21] = Class7008.method21729(new Class677(this, var24, var27, var1, var16));
            }

            try {
               Class7008.method21730(var18);
            } catch (InterruptedException var14) {
               Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var14);
            } catch (ExecutionException var15) {
               Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var15);
            }

            var19 = this.field38401 / var4;

            for (int var22 = 0; var22 < var4; var22++) {
               int var25 = var22 * var19;
               int var28 = var22 == var4 - 1 ? this.field38401 : var25 + var19;
               var18[var22] = Class7008.method21729(new Class1580(this, var25, var28, var16, var1));
            }

            try {
               Class7008.method21730(var18);
            } catch (InterruptedException var12) {
               Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var12);
            } catch (ExecutionException var13) {
               Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var13);
            }
         } else {
            for (int var6 = 0; var6 < this.field38400; var6++) {
               this.field38404.method30931(var1, var6 * var16);
            }

            float[] var17 = new float[2 * this.field38400];

            for (int var7 = 0; var7 < this.field38401; var7++) {
               int var8 = 2 * var7;

               for (int var9 = 0; var9 < this.field38400; var9++) {
                  int var10 = 2 * var9;
                  int var11 = var9 * var16 + var8;
                  var17[var10] = var1[var11];
                  var17[var10 + 1] = var1[var11 + 1];
               }

               this.field38405.method30929(var17);

               for (int var23 = 0; var23 < this.field38400; var23++) {
                  int var26 = 2 * var23;
                  int var29 = var23 * var16 + var8;
                  var1[var29] = var17[var26];
                  var1[var29 + 1] = var17[var26 + 1];
               }
            }
         }
      }
   }

   public void method30393(Class2378 var1) {
      if (!var1.method9689() && !var1.method9691()) {
         this.method30392(var1.method9655());
      } else {
         int var4 = Class7008.method21726();
         if (this.field38406) {
            this.field38403 = 2L * this.field38403;
            if (var4 > 1 && this.field38407) {
               this.method30423(0L, -1, var1, true);
               this.method30429(-1, var1, true);
            } else {
               for (int var5 = 0; (long)var5 < this.field38402; var5++) {
                  this.field38404.method30932(var1, (long)var5 * this.field38403);
               }

               this.method30420(-1, var1, true);
            }

            this.field38403 /= 2L;
         } else {
            long var6 = 2L * this.field38403;
            if (var4 > 1 && this.field38407 && this.field38402 >= (long)var4 && this.field38403 >= (long)var4) {
               Future[] var30 = new Future[var4];
               long var31 = this.field38402 / (long)var4;

               for (int var11 = 0; var11 < var4; var11++) {
                  long var12 = (long)var11 * var31;
                  long var14 = var11 == var4 - 1 ? this.field38402 : var12 + var31;
                  var30[var11] = Class7008.method21729(new Class534(this, var12, var14, var1, var6));
               }

               try {
                  Class7008.method21730(var30);
               } catch (InterruptedException var28) {
                  Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var28);
               } catch (ExecutionException var29) {
                  Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var29);
               }

               var31 = this.field38403 / (long)var4;

               for (int var33 = 0; var33 < var4; var33++) {
                  long var34 = (long)var33 * var31;
                  long var35 = var33 == var4 - 1 ? this.field38403 : var34 + var31;
                  var30[var33] = Class7008.method21729(new Class581(this, var34, var35, var6, var1));
               }

               try {
                  Class7008.method21730(var30);
               } catch (InterruptedException var26) {
                  Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var26);
               } catch (ExecutionException var27) {
                  Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var27);
               }
            } else {
               for (long var16 = 0L; var16 < this.field38402; var16++) {
                  this.field38404.method30932(var1, var16 * var6);
               }

               Class2378 var8 = new Class2378(2L * this.field38402, false);

               for (long var9 = 0L; var9 < this.field38403; var9++) {
                  long var18 = 2L * var9;

                  for (long var20 = 0L; var20 < this.field38402; var20++) {
                     long var22 = 2L * var20;
                     long var24 = var20 * var6 + var18;
                     var8.method9687(var22, (double)var1.method9651(var24));
                     var8.method9687(var22 + 1L, (double)var1.method9651(var24 + 1L));
                  }

                  this.field38405.method30930(var8);

                  for (long var36 = 0L; var36 < this.field38402; var36++) {
                     long var37 = 2L * var36;
                     long var38 = var36 * var6 + var18;
                     var1.method9687(var38, (double)var8.method9651(var37));
                     var1.method9687(var38 + 1L, (double)var8.method9651(var37 + 1L));
                  }
               }
            }
         }
      }
   }

   public void method30394(float[][] var1) {
      int var4 = Class7008.method21726();
      if (this.field38406) {
         this.field38401 = 2 * this.field38401;
         if (var4 > 1 && this.field38407) {
            this.method30426(0, -1, var1, true);
            this.method30430(-1, var1, true);
         } else {
            for (int var5 = 0; var5 < this.field38400; var5++) {
               this.field38404.method30929(var1[var5]);
            }

            this.method30421(-1, var1, true);
         }

         this.field38401 /= 2;
      } else if (var4 > 1 && this.field38407 && this.field38400 >= var4 && this.field38401 >= var4) {
         Future[] var16 = new Future[var4];
         int var17 = this.field38400 / var4;

         for (int var19 = 0; var19 < var4; var19++) {
            int var22 = var19 * var17;
            int var25 = var19 == var4 - 1 ? this.field38400 : var22 + var17;
            var16[var19] = Class7008.method21729(new Class620(this, var22, var25, var1));
         }

         try {
            Class7008.method21730(var16);
         } catch (InterruptedException var12) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var12);
         } catch (ExecutionException var13) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var13);
         }

         var17 = this.field38401 / var4;

         for (int var20 = 0; var20 < var4; var20++) {
            int var23 = var20 * var17;
            int var26 = var20 == var4 - 1 ? this.field38401 : var23 + var17;
            var16[var20] = Class7008.method21729(new Class515(this, var23, var26, var1));
         }

         try {
            Class7008.method21730(var16);
         } catch (InterruptedException var10) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var10);
         } catch (ExecutionException var11) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var11);
         }
      } else {
         for (int var14 = 0; var14 < this.field38400; var14++) {
            this.field38404.method30929(var1[var14]);
         }

         float[] var15 = new float[2 * this.field38400];

         for (int var6 = 0; var6 < this.field38401; var6++) {
            int var7 = 2 * var6;

            for (int var8 = 0; var8 < this.field38400; var8++) {
               int var9 = 2 * var8;
               var15[var9] = var1[var8][var7];
               var15[var9 + 1] = var1[var8][var7 + 1];
            }

            this.field38405.method30929(var15);

            for (int var21 = 0; var21 < this.field38400; var21++) {
               int var24 = 2 * var21;
               var1[var21][var7] = var15[var24];
               var1[var21][var7 + 1] = var15[var24 + 1];
            }
         }
      }
   }

   public void method30395(float[] var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field38406) {
         this.field38401 = 2 * this.field38401;
         if (var5 > 1 && this.field38407) {
            this.method30422(0, 1, var1, var2);
            this.method30428(1, var1, var2);
         } else {
            for (int var6 = 0; var6 < this.field38400; var6++) {
               this.field38404.method30935(var1, var6 * this.field38401, var2);
            }

            this.method30419(1, var1, var2);
         }

         this.field38401 /= 2;
      } else {
         int var17 = 2 * this.field38401;
         if (var5 > 1 && this.field38407 && this.field38400 >= var5 && this.field38401 >= var5) {
            Future[] var19 = new Future[var5];
            int var20 = this.field38400 / var5;

            for (int var22 = 0; var22 < var5; var22++) {
               int var25 = var22 * var20;
               int var28 = var22 == var5 - 1 ? this.field38400 : var25 + var20;
               var19[var22] = Class7008.method21729(new Class1542(this, var25, var28, var1, var17, var2));
            }

            try {
               Class7008.method21730(var19);
            } catch (InterruptedException var15) {
               Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var15);
            } catch (ExecutionException var16) {
               Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var16);
            }

            var20 = this.field38401 / var5;

            for (int var23 = 0; var23 < var5; var23++) {
               int var26 = var23 * var20;
               int var29 = var23 == var5 - 1 ? this.field38401 : var26 + var20;
               var19[var23] = Class7008.method21729(new Class323(this, var26, var29, var17, var1, var2));
            }

            try {
               Class7008.method21730(var19);
            } catch (InterruptedException var13) {
               Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var13);
            } catch (ExecutionException var14) {
               Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var14);
            }
         } else {
            for (int var7 = 0; var7 < this.field38400; var7++) {
               this.field38404.method30935(var1, var7 * var17, var2);
            }

            float[] var18 = new float[2 * this.field38400];

            for (int var8 = 0; var8 < this.field38401; var8++) {
               int var9 = 2 * var8;

               for (int var10 = 0; var10 < this.field38400; var10++) {
                  int var11 = 2 * var10;
                  int var12 = var10 * var17 + var9;
                  var18[var11] = var1[var12];
                  var18[var11 + 1] = var1[var12 + 1];
               }

               this.field38405.method30933(var18, var2);

               for (int var24 = 0; var24 < this.field38400; var24++) {
                  int var27 = 2 * var24;
                  int var30 = var24 * var17 + var9;
                  var1[var30] = var18[var27];
                  var1[var30 + 1] = var18[var27 + 1];
               }
            }
         }
      }
   }

   public void method30396(Class2378 var1, boolean var2) {
      if (!var1.method9689() && !var1.method9691()) {
         this.method30395(var1.method9655(), var2);
      } else {
         int var5 = Class7008.method21726();
         if (this.field38406) {
            this.field38403 = 2L * this.field38403;
            if (var5 > 1 && this.field38407) {
               this.method30423(0L, 1, var1, var2);
               this.method30429(1, var1, var2);
            } else {
               for (long var6 = 0L; var6 < this.field38402; var6++) {
                  this.field38404.method30936(var1, var6 * this.field38403, var2);
               }

               this.method30420(1, var1, var2);
            }

            this.field38403 /= 2L;
         } else {
            long var30 = 2L * this.field38403;
            if (var5 > 1 && this.field38407 && this.field38402 >= (long)var5 && this.field38403 >= (long)var5) {
               Future[] var31 = new Future[var5];
               long var32 = this.field38402 / (long)var5;

               for (int var11 = 0; var11 < var5; var11++) {
                  long var12 = (long)var11 * var32;
                  long var14 = var11 == var5 - 1 ? this.field38402 : var12 + var32;
                  var31[var11] = Class7008.method21729(new Class595(this, var12, var14, var1, var30, var2));
               }

               try {
                  Class7008.method21730(var31);
               } catch (InterruptedException var28) {
                  Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var28);
               } catch (ExecutionException var29) {
                  Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var29);
               }

               var32 = this.field38403 / (long)var5;

               for (int var34 = 0; var34 < var5; var34++) {
                  long var35 = (long)var34 * var32;
                  long var36 = var34 == var5 - 1 ? this.field38403 : var35 + var32;
                  var31[var34] = Class7008.method21729(new Class333(this, var35, var36, var30, var1, var2));
               }

               try {
                  Class7008.method21730(var31);
               } catch (InterruptedException var26) {
                  Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var26);
               } catch (ExecutionException var27) {
                  Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var27);
               }
            } else {
               for (long var16 = 0L; var16 < this.field38402; var16++) {
                  this.field38404.method30936(var1, var16 * var30, var2);
               }

               Class2378 var8 = new Class2378(2L * this.field38402);

               for (long var9 = 0L; var9 < this.field38403; var9++) {
                  long var18 = 2L * var9;

                  for (long var20 = 0L; var20 < this.field38402; var20++) {
                     long var22 = 2L * var20;
                     long var24 = var20 * var30 + var18;
                     var8.method9687(var22, (double)var1.method9651(var24));
                     var8.method9687(var22 + 1L, (double)var1.method9651(var24 + 1L));
                  }

                  this.field38405.method30934(var8, var2);

                  for (long var37 = 0L; var37 < this.field38402; var37++) {
                     long var38 = 2L * var37;
                     long var39 = var37 * var30 + var18;
                     var1.method9687(var39, (double)var8.method9651(var38));
                     var1.method9687(var39 + 1L, (double)var8.method9651(var38 + 1L));
                  }
               }
            }
         }
      }
   }

   public void method30397(float[][] var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field38406) {
         this.field38401 = 2 * this.field38401;
         if (var5 > 1 && this.field38407) {
            this.method30426(0, 1, var1, var2);
            this.method30430(1, var1, var2);
         } else {
            for (int var6 = 0; var6 < this.field38400; var6++) {
               this.field38404.method30933(var1[var6], var2);
            }

            this.method30421(1, var1, var2);
         }

         this.field38401 /= 2;
      } else if (var5 > 1 && this.field38407 && this.field38400 >= var5 && this.field38401 >= var5) {
         Future[] var17 = new Future[var5];
         int var18 = this.field38400 / var5;

         for (int var20 = 0; var20 < var5; var20++) {
            int var23 = var20 * var18;
            int var26 = var20 == var5 - 1 ? this.field38400 : var23 + var18;
            var17[var20] = Class7008.method21729(new Class496(this, var23, var26, var1, var2));
         }

         try {
            Class7008.method21730(var17);
         } catch (InterruptedException var13) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var13);
         } catch (ExecutionException var14) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var14);
         }

         var18 = this.field38401 / var5;

         for (int var21 = 0; var21 < var5; var21++) {
            int var24 = var21 * var18;
            int var27 = var21 == var5 - 1 ? this.field38401 : var24 + var18;
            var17[var21] = Class7008.method21729(new Class666(this, var24, var27, var1, var2));
         }

         try {
            Class7008.method21730(var17);
         } catch (InterruptedException var11) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var11);
         } catch (ExecutionException var12) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var12);
         }
      } else {
         for (int var15 = 0; var15 < this.field38400; var15++) {
            this.field38404.method30933(var1[var15], var2);
         }

         float[] var16 = new float[2 * this.field38400];

         for (int var7 = 0; var7 < this.field38401; var7++) {
            int var8 = 2 * var7;

            for (int var9 = 0; var9 < this.field38400; var9++) {
               int var10 = 2 * var9;
               var16[var10] = var1[var9][var8];
               var16[var10 + 1] = var1[var9][var8 + 1];
            }

            this.field38405.method30933(var16, var2);

            for (int var22 = 0; var22 < this.field38400; var22++) {
               int var25 = 2 * var22;
               var1[var22][var8] = var16[var25];
               var1[var22][var8 + 1] = var16[var25 + 1];
            }
         }
      }
   }

   public void method30398(float[] var1) {
      if (!this.field38406) {
         throw new IllegalArgumentException("rows and columns must be power of two numbers");
      } else {
         int var4 = Class7008.method21726();
         if (var4 > 1 && this.field38407) {
            this.method30422(1, 1, var1, true);
            this.method30428(-1, var1, true);
            this.method30416(1, var1);
         } else {
            for (int var5 = 0; var5 < this.field38400; var5++) {
               this.field38404.method30939(var1, var5 * this.field38401);
            }

            this.method30419(-1, var1, true);
            this.method30416(1, var1);
         }
      }
   }

   public void method30399(Class2378 var1) {
      if (!this.field38406) {
         throw new IllegalArgumentException("rows and columns must be power of two numbers");
      } else {
         int var4 = Class7008.method21726();
         if (var4 > 1 && this.field38407) {
            this.method30423(1L, 1, var1, true);
            this.method30429(-1, var1, true);
            this.method30417(1, var1);
         } else {
            for (long var5 = 0L; var5 < this.field38402; var5++) {
               this.field38404.method30940(var1, var5 * this.field38403);
            }

            this.method30420(-1, var1, true);
            this.method30417(1, var1);
         }
      }
   }

   public void method30400(float[][] var1) {
      if (!this.field38406) {
         throw new IllegalArgumentException("rows and columns must be power of two numbers");
      } else {
         int var4 = Class7008.method21726();
         if (var4 > 1 && this.field38407) {
            this.method30426(1, 1, var1, true);
            this.method30430(-1, var1, true);
            this.method30418(1, var1);
         } else {
            for (int var5 = 0; var5 < this.field38400; var5++) {
               this.field38404.method30937(var1[var5]);
            }

            this.method30421(-1, var1, true);
            this.method30418(1, var1);
         }
      }
   }

   public void method30401(float[] var1) {
      if (!this.field38406) {
         this.method30411(var1);
      } else {
         int var4 = Class7008.method21726();
         if (var4 > 1 && this.field38407) {
            this.method30422(1, 1, var1, true);
            this.method30428(-1, var1, true);
            this.method30416(1, var1);
         } else {
            for (int var5 = 0; var5 < this.field38400; var5++) {
               this.field38404.method30939(var1, var5 * this.field38401);
            }

            this.method30419(-1, var1, true);
            this.method30416(1, var1);
         }

         this.method30431(var1);
      }
   }

   public void method30402(Class2378 var1) {
      if (!this.field38406) {
         this.method30412(var1);
      } else {
         int var4 = Class7008.method21726();
         if (var4 > 1 && this.field38407) {
            this.method30423(1L, 1, var1, true);
            this.method30429(-1, var1, true);
            this.method30417(1, var1);
         } else {
            for (long var5 = 0L; var5 < this.field38402; var5++) {
               this.field38404.method30940(var1, var5 * this.field38403);
            }

            this.method30420(-1, var1, true);
            this.method30417(1, var1);
         }

         this.method30432(var1);
      }
   }

   public void method30403(float[][] var1) {
      if (!this.field38406) {
         this.method30410(var1);
      } else {
         int var4 = Class7008.method21726();
         if (var4 > 1 && this.field38407) {
            this.method30426(1, 1, var1, true);
            this.method30430(-1, var1, true);
            this.method30418(1, var1);
         } else {
            for (int var5 = 0; var5 < this.field38400; var5++) {
               this.field38404.method30937(var1[var5]);
            }

            this.method30421(-1, var1, true);
            this.method30418(1, var1);
         }

         this.method30433(var1);
      }
   }

   public void method30404(float[] var1, boolean var2) {
      if (!this.field38406) {
         throw new IllegalArgumentException("rows and columns must be power of two numbers");
      } else {
         int var5 = Class7008.method21726();
         if (var5 > 1 && this.field38407) {
            this.method30416(-1, var1);
            this.method30428(1, var1, var2);
            this.method30422(1, -1, var1, var2);
         } else {
            this.method30416(-1, var1);
            this.method30419(1, var1, var2);

            for (int var6 = 0; var6 < this.field38400; var6++) {
               this.field38404.method30947(var1, var6 * this.field38401, var2);
            }
         }
      }
   }

   public void method30405(Class2378 var1, boolean var2) {
      if (!this.field38406) {
         throw new IllegalArgumentException("rows and columns must be power of two numbers");
      } else {
         int var5 = Class7008.method21726();
         if (var5 > 1 && this.field38407) {
            this.method30417(-1, var1);
            this.method30429(1, var1, var2);
            this.method30423(1L, -1, var1, var2);
         } else {
            this.method30417(-1, var1);
            this.method30420(1, var1, var2);

            for (long var6 = 0L; var6 < this.field38402; var6++) {
               this.field38404.method30948(var1, var6 * this.field38403, var2);
            }
         }
      }
   }

   public void method30406(float[][] var1, boolean var2) {
      if (!this.field38406) {
         throw new IllegalArgumentException("rows and columns must be power of two numbers");
      } else {
         int var5 = Class7008.method21726();
         if (var5 > 1 && this.field38407) {
            this.method30418(-1, var1);
            this.method30430(1, var1, var2);
            this.method30426(1, -1, var1, var2);
         } else {
            this.method30418(-1, var1);
            this.method30421(1, var1, var2);

            for (int var6 = 0; var6 < this.field38400; var6++) {
               this.field38404.method30945(var1[var6], var2);
            }
         }
      }
   }

   public void method30407(float[] var1, boolean var2) {
      if (!this.field38406) {
         this.method30414(var1, var2);
      } else {
         int var5 = Class7008.method21726();
         if (var5 > 1 && this.field38407) {
            this.method30424(1, -1, var1, var2);
            this.method30428(1, var1, var2);
            this.method30416(1, var1);
         } else {
            for (int var6 = 0; var6 < this.field38400; var6++) {
               this.field38404.method30953(var1, var6 * this.field38401, var2);
            }

            this.method30419(1, var1, var2);
            this.method30416(1, var1);
         }

         this.method30431(var1);
      }
   }

   public void method30408(Class2378 var1, boolean var2) {
      if (!this.field38406) {
         this.method30415(var1, var2);
      } else {
         int var5 = Class7008.method21726();
         if (var5 > 1 && this.field38407) {
            this.method30425(1L, -1, var1, var2);
            this.method30429(1, var1, var2);
            this.method30417(1, var1);
         } else {
            for (long var6 = 0L; var6 < this.field38402; var6++) {
               this.field38404.method30954(var1, var6 * this.field38403, var2);
            }

            this.method30420(1, var1, var2);
            this.method30417(1, var1);
         }

         this.method30432(var1);
      }
   }

   public void method30409(float[][] var1, boolean var2) {
      if (!this.field38406) {
         this.method30413(var1, var2);
      } else {
         int var5 = Class7008.method21726();
         if (var5 > 1 && this.field38407) {
            this.method30427(1, -1, var1, var2);
            this.method30430(1, var1, var2);
            this.method30418(1, var1);
         } else {
            for (int var6 = 0; var6 < this.field38400; var6++) {
               this.field38404.method30953(var1[var6], 0, var2);
            }

            this.method30421(1, var1, var2);
            this.method30418(1, var1);
         }

         this.method30433(var1);
      }
   }

   private void method30410(float[][] var1) {
      int var4 = this.field38401 / 2 + 1;
      float[][] var5 = new float[var4][2 * this.field38400];
      int var6 = Class7008.method21726();
      if (var6 > 1 && this.field38407 && this.field38400 >= var6 && var4 - 2 >= var6) {
         Future[] var26 = new Future[var6];
         int var30 = this.field38400 / var6;

         for (int var36 = 0; var36 < var6; var36++) {
            int var45 = var36 * var30;
            int var50 = var36 == var6 - 1 ? this.field38400 : var45 + var30;
            var26[var36] = Class7008.method21729(new Class556(this, var45, var50, var1));
         }

         try {
            Class7008.method21730(var26);
         } catch (InterruptedException var18) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var18);
         } catch (ExecutionException var19) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var19);
         }

         for (int var37 = 0; var37 < this.field38400; var37++) {
            var5[0][var37] = var1[var37][0];
         }

         this.field38405.method30941(var5[0]);
         var30 = (var4 - 2) / var6;

         for (int var38 = 0; var38 < var6; var38++) {
            int var46 = 1 + var38 * var30;
            int var51 = var38 == var6 - 1 ? var4 - 1 : var46 + var30;
            var26[var38] = Class7008.method21729(new Class1539(this, var46, var51, var5, var1));
         }

         try {
            Class7008.method21730(var26);
         } catch (InterruptedException var16) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var16);
         } catch (ExecutionException var17) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var17);
         }

         if (this.field38401 % 2 == 0) {
            for (int var40 = 0; var40 < this.field38400; var40++) {
               var5[var4 - 1][var40] = var1[var40][1];
            }

            this.field38405.method30941(var5[var4 - 1]);
         } else {
            for (int var39 = 0; var39 < this.field38400; var39++) {
               int var47 = 2 * var39;
               int var52 = var4 - 1;
               var5[var52][var47] = var1[var39][2 * var52];
               var5[var52][var47 + 1] = var1[var39][1];
            }

            this.field38405.method30929(var5[var4 - 1]);
         }

         var30 = this.field38400 / var6;

         for (int var41 = 0; var41 < var6; var41++) {
            int var48 = var41 * var30;
            int var53 = var41 == var6 - 1 ? this.field38400 : var48 + var30;
            var26[var41] = Class7008.method21729(new Class1377(this, var48, var53, var4, var1, var5));
         }

         try {
            Class7008.method21730(var26);
         } catch (InterruptedException var14) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var14);
         } catch (ExecutionException var15) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var15);
         }

         for (int var42 = 0; var42 < var6; var42++) {
            int var49 = 1 + var42 * var30;
            int var54 = var42 == var6 - 1 ? this.field38400 : var49 + var30;
            var26[var42] = Class7008.method21729(new Class479(this, var49, var54, var4, var1));
         }

         try {
            Class7008.method21730(var26);
         } catch (InterruptedException var12) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var12);
         } catch (ExecutionException var13) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var13);
         }
      } else {
         for (int var7 = 0; var7 < this.field38400; var7++) {
            this.field38404.method30937(var1[var7]);
         }

         for (int var20 = 0; var20 < this.field38400; var20++) {
            var5[0][var20] = var1[var20][0];
         }

         this.field38405.method30941(var5[0]);

         for (int var21 = 1; var21 < var4 - 1; var21++) {
            int var8 = 2 * var21;

            for (int var9 = 0; var9 < this.field38400; var9++) {
               int var10 = 2 * var9;
               var5[var21][var10] = var1[var9][var8];
               var5[var21][var10 + 1] = var1[var9][var8 + 1];
            }

            this.field38405.method30929(var5[var21]);
         }

         if (this.field38401 % 2 == 0) {
            for (int var23 = 0; var23 < this.field38400; var23++) {
               var5[var4 - 1][var23] = var1[var23][1];
            }

            this.field38405.method30941(var5[var4 - 1]);
         } else {
            for (int var22 = 0; var22 < this.field38400; var22++) {
               int var27 = 2 * var22;
               int var33 = var4 - 1;
               var5[var33][var27] = var1[var22][2 * var33];
               var5[var33][var27 + 1] = var1[var22][1];
            }

            this.field38405.method30929(var5[var4 - 1]);
         }

         for (int var24 = 0; var24 < this.field38400; var24++) {
            int var28 = 2 * var24;

            for (int var34 = 0; var34 < var4; var34++) {
               int var43 = 2 * var34;
               var1[var24][var43] = var5[var34][var28];
               var1[var24][var43 + 1] = var5[var34][var28 + 1];
            }
         }

         for (int var25 = 1; var25 < this.field38400; var25++) {
            int var29 = this.field38400 - var25;

            for (int var35 = var4; var35 < this.field38401; var35++) {
               int var44 = 2 * var35;
               int var11 = 2 * (this.field38401 - var35);
               var1[0][var44] = var1[0][var11];
               var1[0][var44 + 1] = -var1[0][var11 + 1];
               var1[var25][var44] = var1[var29][var11];
               var1[var25][var44 + 1] = -var1[var29][var11 + 1];
            }
         }
      }
   }

   private void method30411(float[] var1) {
      int var4 = 2 * this.field38401;
      int var5 = this.field38401 / 2 + 1;
      float[][] var6 = new float[var5][2 * this.field38400];
      int var7 = Class7008.method21726();
      if (var7 > 1 && this.field38407 && this.field38400 >= var7 && var5 - 2 >= var7) {
         Future[] var30 = new Future[var7];
         int var34 = this.field38400 / var7;

         for (int var40 = 0; var40 < var7; var40++) {
            int var50 = var40 * var34;
            int var57 = var40 == var7 - 1 ? this.field38400 : var50 + var34;
            var30[var40] = Class7008.method21729(new Class488(this, var50, var57, var1));
         }

         try {
            Class7008.method21730(var30);
         } catch (InterruptedException var22) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var22);
         } catch (ExecutionException var23) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var23);
         }

         for (int var41 = 0; var41 < this.field38400; var41++) {
            var6[0][var41] = var1[var41 * this.field38401];
         }

         this.field38405.method30941(var6[0]);
         var34 = (var5 - 2) / var7;

         for (int var42 = 0; var42 < var7; var42++) {
            int var51 = 1 + var42 * var34;
            int var58 = var42 == var7 - 1 ? var5 - 1 : var51 + var34;
            var30[var42] = Class7008.method21729(new Class751(this, var51, var58, var6, var1));
         }

         try {
            Class7008.method21730(var30);
         } catch (InterruptedException var20) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var20);
         } catch (ExecutionException var21) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var21);
         }

         if (this.field38401 % 2 == 0) {
            for (int var44 = 0; var44 < this.field38400; var44++) {
               var6[var5 - 1][var44] = var1[var44 * this.field38401 + 1];
            }

            this.field38405.method30941(var6[var5 - 1]);
         } else {
            for (int var43 = 0; var43 < this.field38400; var43++) {
               int var52 = 2 * var43;
               int var59 = var43 * this.field38401;
               int var62 = var5 - 1;
               var6[var62][var52] = var1[var59 + 2 * var62];
               var6[var62][var52 + 1] = var1[var59 + 1];
            }

            this.field38405.method30929(var6[var5 - 1]);
         }

         var34 = this.field38400 / var7;

         for (int var45 = 0; var45 < var7; var45++) {
            int var53 = var45 * var34;
            int var60 = var45 == var7 - 1 ? this.field38400 : var53 + var34;
            var30[var45] = Class7008.method21729(new Class351(this, var53, var60, var5, var4, var1, var6));
         }

         try {
            Class7008.method21730(var30);
         } catch (InterruptedException var18) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var18);
         } catch (ExecutionException var19) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var19);
         }

         for (int var46 = 0; var46 < var7; var46++) {
            int var54 = 1 + var46 * var34;
            int var61 = var46 == var7 - 1 ? this.field38400 : var54 + var34;
            var30[var46] = Class7008.method21729(new Class632(this, var54, var61, var4, var5, var1));
         }

         try {
            Class7008.method21730(var30);
         } catch (InterruptedException var16) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var16);
         } catch (ExecutionException var17) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var17);
         }
      } else {
         for (int var8 = 0; var8 < this.field38400; var8++) {
            this.field38404.method30939(var1, var8 * this.field38401);
         }

         for (int var24 = 0; var24 < this.field38400; var24++) {
            var6[0][var24] = var1[var24 * this.field38401];
         }

         this.field38405.method30941(var6[0]);

         for (int var25 = 1; var25 < var5 - 1; var25++) {
            int var9 = 2 * var25;

            for (int var10 = 0; var10 < this.field38400; var10++) {
               int var11 = 2 * var10;
               int var12 = var10 * this.field38401 + var9;
               var6[var25][var11] = var1[var12];
               var6[var25][var11 + 1] = var1[var12 + 1];
            }

            this.field38405.method30929(var6[var25]);
         }

         if (this.field38401 % 2 == 0) {
            for (int var27 = 0; var27 < this.field38400; var27++) {
               var6[var5 - 1][var27] = var1[var27 * this.field38401 + 1];
            }

            this.field38405.method30941(var6[var5 - 1]);
         } else {
            for (int var26 = 0; var26 < this.field38400; var26++) {
               int var31 = 2 * var26;
               int var37 = var26 * this.field38401;
               int var47 = var5 - 1;
               var6[var47][var31] = var1[var37 + 2 * var47];
               var6[var47][var31 + 1] = var1[var37 + 1];
            }

            this.field38405.method30929(var6[var5 - 1]);
         }

         for (int var28 = 0; var28 < this.field38400; var28++) {
            int var32 = 2 * var28;

            for (int var38 = 0; var38 < var5; var38++) {
               int var48 = 2 * var38;
               int var55 = var28 * var4 + var48;
               var1[var55] = var6[var38][var32];
               var1[var55 + 1] = var6[var38][var32 + 1];
            }
         }

         for (int var29 = 1; var29 < this.field38400; var29++) {
            int var33 = var29 * var4;
            int var39 = (this.field38400 - var29 + 1) * var4;

            for (int var49 = var5; var49 < this.field38401; var49++) {
               int var56 = 2 * var49;
               int var13 = 2 * (this.field38401 - var49);
               var1[var56] = var1[var13];
               var1[var56 + 1] = -var1[var13 + 1];
               int var14 = var33 + var56;
               int var15 = var39 - var56;
               var1[var14] = var1[var15];
               var1[var14 + 1] = -var1[var15 + 1];
            }
         }
      }
   }

   private void method30412(Class2378 var1) {
      long var4 = 2L * this.field38403;
      long var6 = this.field38403 / 2L + 1L;
      Class2378 var8 = new Class2378(var6 * 2L * this.field38402);
      long var9 = 2L * this.field38402;
      int var11 = Class7008.method21726();
      if (var11 > 1 && this.field38407 && this.field38402 >= (long)var11 && var6 - 2L >= (long)var11) {
         Future[] var12 = new Future[var11];
         long var13 = this.field38402 / (long)var11;

         for (int var15 = 0; var15 < var11; var15++) {
            long var56 = (long)var15 * var13;
            long var63 = var15 == var11 - 1 ? this.field38402 : var56 + var13;
            var12[var15] = Class7008.method21729(new Class542(this, var56, var63, var1));
         }

         try {
            Class7008.method21730(var12);
         } catch (InterruptedException var46) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var46);
         } catch (ExecutionException var47) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var47);
         }

         for (long var20 = 0L; var20 < this.field38402; var20++) {
            var8.method9687(var20, (double)var1.method9651(var20 * this.field38403));
         }

         this.field38405.method30942(var8);
         var13 = (var6 - 2L) / (long)var11;

         for (int var50 = 0; var50 < var11; var50++) {
            long var57 = 1L + (long)var50 * var13;
            long var64 = var50 == var11 - 1 ? var6 - 1L : var57 + var13;
            var12[var50] = Class7008.method21729(new Class601(this, var57, var64, var8, var9, var1));
         }

         try {
            Class7008.method21730(var12);
         } catch (InterruptedException var44) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var44);
         } catch (ExecutionException var45) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var45);
         }

         if (this.field38403 % 2L == 0L) {
            for (long var68 = 0L; var68 < this.field38402; var68++) {
               var8.method9687((var6 - 1L) * var9 + var68, (double)var1.method9651(var68 * this.field38403 + 1L));
            }

            this.field38405.method30944(var8, (var6 - 1L) * var9);
         } else {
            for (long var67 = 0L; var67 < this.field38402; var67++) {
               long var22 = 2L * var67;
               long var24 = var67 * this.field38403;
               long var26 = var6 - 1L;
               var8.method9687(var26 * var9 + var22, (double)var1.method9651(var24 + 2L * var26));
               var8.method9687(var26 * var9 + var22 + 1L, (double)var1.method9651(var24 + 1L));
            }

            this.field38405.method30932(var8, (var6 - 1L) * var9);
         }

         var13 = this.field38402 / (long)var11;

         for (int var51 = 0; var51 < var11; var51++) {
            long var58 = (long)var51 * var13;
            long var65 = var51 == var11 - 1 ? this.field38402 : var58 + var13;
            var12[var51] = Class7008.method21729(new Class419(this, var58, var65, var6, var4, var1, var8, var9));
         }

         try {
            Class7008.method21730(var12);
         } catch (InterruptedException var42) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var42);
         } catch (ExecutionException var43) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var43);
         }

         for (int var52 = 0; var52 < var11; var52++) {
            long var59 = 1L + (long)var52 * var13;
            long var66 = var52 == var11 - 1 ? this.field38402 : var59 + var13;
            var12[var52] = Class7008.method21729(new Class1495(this, var59, var66, var4, var6, var1));
         }

         try {
            Class7008.method21730(var12);
         } catch (InterruptedException var40) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var40);
         } catch (ExecutionException var41) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var41);
         }
      } else {
         for (long var28 = 0L; var28 < this.field38402; var28++) {
            this.field38404.method30940(var1, var28 * this.field38403);
         }

         for (long var69 = 0L; var69 < this.field38402; var69++) {
            var8.method9687(var69, (double)var1.method9651(var69 * this.field38403));
         }

         this.field38405.method30942(var8);

         for (long var70 = 1L; var70 < var6 - 1L; var70++) {
            long var30 = 2L * var70;

            for (long var16 = 0L; var16 < this.field38402; var16++) {
               long var18 = 2L * var16;
               long var32 = var16 * this.field38403 + var30;
               var8.method9687(var70 * var9 + var18, (double)var1.method9651(var32));
               var8.method9687(var70 * var9 + var18 + 1L, (double)var1.method9651(var32 + 1L));
            }

            this.field38405.method30932(var8, var70 * var9);
         }

         if (this.field38403 % 2L == 0L) {
            for (long var72 = 0L; var72 < this.field38402; var72++) {
               var8.method9687((var6 - 1L) * var9 + var72, (double)var1.method9651(var72 * this.field38403 + 1L));
            }

            this.field38405.method30944(var8, (var6 - 1L) * var9);
         } else {
            for (long var71 = 0L; var71 < this.field38402; var71++) {
               long var75 = 2L * var71;
               long var53 = var71 * this.field38403;
               long var60 = var6 - 1L;
               var8.method9687(var60 * var9 + var75, (double)var1.method9651(var53 + 2L * var60));
               var8.method9687(var60 * var9 + var75 + 1L, (double)var1.method9651(var53 + 1L));
            }

            this.field38405.method30932(var8, (var6 - 1L) * var9);
         }

         for (long var73 = 0L; var73 < this.field38402; var73++) {
            long var76 = 2L * var73;

            for (long var54 = 0L; var54 < var6; var54++) {
               long var61 = 2L * var54;
               long var78 = var73 * var4 + var61;
               var1.method9687(var78, (double)var8.method9651(var54 * var9 + var76));
               var1.method9687(var78 + 1L, (double)var8.method9651(var54 * var9 + var76 + 1L));
            }
         }

         for (long var74 = 1L; var74 < this.field38402; var74++) {
            long var77 = var74 * var4;
            long var55 = (this.field38402 - var74 + 1L) * var4;

            for (long var62 = var6; var62 < this.field38403; var62++) {
               long var79 = 2L * var62;
               long var34 = 2L * (this.field38403 - var62);
               var1.method9687(var79, (double)var1.method9651(var34));
               var1.method9687(var79 + 1L, (double)(-var1.method9651(var34 + 1L)));
               long var36 = var77 + var79;
               long var38 = var55 - var79;
               var1.method9687(var36, (double)var1.method9651(var38));
               var1.method9687(var36 + 1L, (double)(-var1.method9651(var38 + 1L)));
            }
         }
      }
   }

   private void method30413(float[][] var1, boolean var2) {
      int var5 = this.field38401 / 2 + 1;
      float[][] var6 = new float[var5][2 * this.field38400];
      int var7 = Class7008.method21726();
      if (var7 > 1 && this.field38407 && this.field38400 >= var7 && var5 - 2 >= var7) {
         Future[] var27 = new Future[var7];
         int var31 = this.field38400 / var7;

         for (int var37 = 0; var37 < var7; var37++) {
            int var46 = var37 * var31;
            int var51 = var37 == var7 - 1 ? this.field38400 : var46 + var31;
            var27[var37] = Class7008.method21729(new Class786(this, var46, var51, var1, var2));
         }

         try {
            Class7008.method21730(var27);
         } catch (InterruptedException var19) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var19);
         } catch (ExecutionException var20) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var20);
         }

         for (int var38 = 0; var38 < this.field38400; var38++) {
            var6[0][var38] = var1[var38][0];
         }

         this.field38405.method30949(var6[0], var2);
         var31 = (var5 - 2) / var7;

         for (int var39 = 0; var39 < var7; var39++) {
            int var47 = 1 + var39 * var31;
            int var52 = var39 == var7 - 1 ? var5 - 1 : var47 + var31;
            var27[var39] = Class7008.method21729(new Class781(this, var47, var52, var6, var1, var2));
         }

         try {
            Class7008.method21730(var27);
         } catch (InterruptedException var17) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var17);
         } catch (ExecutionException var18) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var18);
         }

         if (this.field38401 % 2 == 0) {
            for (int var41 = 0; var41 < this.field38400; var41++) {
               var6[var5 - 1][var41] = var1[var41][1];
            }

            this.field38405.method30949(var6[var5 - 1], var2);
         } else {
            for (int var40 = 0; var40 < this.field38400; var40++) {
               int var48 = 2 * var40;
               int var53 = var5 - 1;
               var6[var53][var48] = var1[var40][2 * var53];
               var6[var53][var48 + 1] = var1[var40][1];
            }

            this.field38405.method30933(var6[var5 - 1], var2);
         }

         var31 = this.field38400 / var7;

         for (int var42 = 0; var42 < var7; var42++) {
            int var49 = var42 * var31;
            int var54 = var42 == var7 - 1 ? this.field38400 : var49 + var31;
            var27[var42] = Class7008.method21729(new Class1364(this, var49, var54, var5, var1, var6));
         }

         try {
            Class7008.method21730(var27);
         } catch (InterruptedException var15) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var15);
         } catch (ExecutionException var16) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var16);
         }

         for (int var43 = 0; var43 < var7; var43++) {
            int var50 = 1 + var43 * var31;
            int var55 = var43 == var7 - 1 ? this.field38400 : var50 + var31;
            var27[var43] = Class7008.method21729(new Class608(this, var50, var55, var5, var1));
         }

         try {
            Class7008.method21730(var27);
         } catch (InterruptedException var13) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var13);
         } catch (ExecutionException var14) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var14);
         }
      } else {
         for (int var8 = 0; var8 < this.field38400; var8++) {
            this.field38404.method30953(var1[var8], 0, var2);
         }

         for (int var21 = 0; var21 < this.field38400; var21++) {
            var6[0][var21] = var1[var21][0];
         }

         this.field38405.method30949(var6[0], var2);

         for (int var22 = 1; var22 < var5 - 1; var22++) {
            int var9 = 2 * var22;

            for (int var10 = 0; var10 < this.field38400; var10++) {
               int var11 = 2 * var10;
               var6[var22][var11] = var1[var10][var9];
               var6[var22][var11 + 1] = var1[var10][var9 + 1];
            }

            this.field38405.method30933(var6[var22], var2);
         }

         if (this.field38401 % 2 == 0) {
            for (int var24 = 0; var24 < this.field38400; var24++) {
               var6[var5 - 1][var24] = var1[var24][1];
            }

            this.field38405.method30949(var6[var5 - 1], var2);
         } else {
            for (int var23 = 0; var23 < this.field38400; var23++) {
               int var28 = 2 * var23;
               int var34 = var5 - 1;
               var6[var34][var28] = var1[var23][2 * var34];
               var6[var34][var28 + 1] = var1[var23][1];
            }

            this.field38405.method30933(var6[var5 - 1], var2);
         }

         for (int var25 = 0; var25 < this.field38400; var25++) {
            int var29 = 2 * var25;

            for (int var35 = 0; var35 < var5; var35++) {
               int var44 = 2 * var35;
               var1[var25][var44] = var6[var35][var29];
               var1[var25][var44 + 1] = var6[var35][var29 + 1];
            }
         }

         for (int var26 = 1; var26 < this.field38400; var26++) {
            int var30 = this.field38400 - var26;

            for (int var36 = var5; var36 < this.field38401; var36++) {
               int var45 = 2 * var36;
               int var12 = 2 * (this.field38401 - var36);
               var1[0][var45] = var1[0][var12];
               var1[0][var45 + 1] = -var1[0][var12 + 1];
               var1[var26][var45] = var1[var30][var12];
               var1[var26][var45 + 1] = -var1[var30][var12 + 1];
            }
         }
      }
   }

   private void method30414(float[] var1, boolean var2) {
      int var5 = 2 * this.field38401;
      int var6 = this.field38401 / 2 + 1;
      float[][] var7 = new float[var6][2 * this.field38400];
      int var8 = Class7008.method21726();
      if (var8 > 1 && this.field38407 && this.field38400 >= var8 && var6 - 2 >= var8) {
         Future[] var31 = new Future[var8];
         int var35 = this.field38400 / var8;

         for (int var41 = 0; var41 < var8; var41++) {
            int var51 = var41 * var35;
            int var58 = var41 == var8 - 1 ? this.field38400 : var51 + var35;
            var31[var41] = Class7008.method21729(new Class505(this, var51, var58, var1, var2));
         }

         try {
            Class7008.method21730(var31);
         } catch (InterruptedException var23) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var23);
         } catch (ExecutionException var24) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var24);
         }

         for (int var42 = 0; var42 < this.field38400; var42++) {
            var7[0][var42] = var1[var42 * this.field38401];
         }

         this.field38405.method30949(var7[0], var2);
         var35 = (var6 - 2) / var8;

         for (int var43 = 0; var43 < var8; var43++) {
            int var52 = 1 + var43 * var35;
            int var59 = var43 == var8 - 1 ? var6 - 1 : var52 + var35;
            var31[var43] = Class7008.method21729(new Class527(this, var52, var59, var7, var1, var2));
         }

         try {
            Class7008.method21730(var31);
         } catch (InterruptedException var21) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var21);
         } catch (ExecutionException var22) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var22);
         }

         if (this.field38401 % 2 == 0) {
            for (int var45 = 0; var45 < this.field38400; var45++) {
               var7[var6 - 1][var45] = var1[var45 * this.field38401 + 1];
            }

            this.field38405.method30949(var7[var6 - 1], var2);
         } else {
            for (int var44 = 0; var44 < this.field38400; var44++) {
               int var53 = 2 * var44;
               int var60 = var44 * this.field38401;
               int var63 = var6 - 1;
               var7[var63][var53] = var1[var60 + 2 * var63];
               var7[var63][var53 + 1] = var1[var60 + 1];
            }

            this.field38405.method30933(var7[var6 - 1], var2);
         }

         var35 = this.field38400 / var8;

         for (int var46 = 0; var46 < var8; var46++) {
            int var54 = var46 * var35;
            int var61 = var46 == var8 - 1 ? this.field38400 : var54 + var35;
            var31[var46] = Class7008.method21729(new Class558(this, var54, var61, var6, var5, var1, var7));
         }

         try {
            Class7008.method21730(var31);
         } catch (InterruptedException var19) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var19);
         } catch (ExecutionException var20) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var20);
         }

         for (int var47 = 0; var47 < var8; var47++) {
            int var55 = 1 + var47 * var35;
            int var62 = var47 == var8 - 1 ? this.field38400 : var55 + var35;
            var31[var47] = Class7008.method21729(new Class705(this, var55, var62, var5, var6, var1));
         }

         try {
            Class7008.method21730(var31);
         } catch (InterruptedException var17) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var17);
         } catch (ExecutionException var18) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var18);
         }
      } else {
         for (int var9 = 0; var9 < this.field38400; var9++) {
            this.field38404.method30953(var1, var9 * this.field38401, var2);
         }

         for (int var25 = 0; var25 < this.field38400; var25++) {
            var7[0][var25] = var1[var25 * this.field38401];
         }

         this.field38405.method30949(var7[0], var2);

         for (int var26 = 1; var26 < var6 - 1; var26++) {
            int var10 = 2 * var26;

            for (int var11 = 0; var11 < this.field38400; var11++) {
               int var12 = 2 * var11;
               int var13 = var11 * this.field38401 + var10;
               var7[var26][var12] = var1[var13];
               var7[var26][var12 + 1] = var1[var13 + 1];
            }

            this.field38405.method30933(var7[var26], var2);
         }

         if (this.field38401 % 2 == 0) {
            for (int var28 = 0; var28 < this.field38400; var28++) {
               var7[var6 - 1][var28] = var1[var28 * this.field38401 + 1];
            }

            this.field38405.method30949(var7[var6 - 1], var2);
         } else {
            for (int var27 = 0; var27 < this.field38400; var27++) {
               int var32 = 2 * var27;
               int var38 = var27 * this.field38401;
               int var48 = var6 - 1;
               var7[var48][var32] = var1[var38 + 2 * var48];
               var7[var48][var32 + 1] = var1[var38 + 1];
            }

            this.field38405.method30933(var7[var6 - 1], var2);
         }

         for (int var29 = 0; var29 < this.field38400; var29++) {
            int var33 = 2 * var29;

            for (int var39 = 0; var39 < var6; var39++) {
               int var49 = 2 * var39;
               int var56 = var29 * var5 + var49;
               var1[var56] = var7[var39][var33];
               var1[var56 + 1] = var7[var39][var33 + 1];
            }
         }

         for (int var30 = 1; var30 < this.field38400; var30++) {
            int var34 = var30 * var5;
            int var40 = (this.field38400 - var30 + 1) * var5;

            for (int var50 = var6; var50 < this.field38401; var50++) {
               int var57 = 2 * var50;
               int var14 = 2 * (this.field38401 - var50);
               var1[var57] = var1[var14];
               var1[var57 + 1] = -var1[var14 + 1];
               int var15 = var34 + var57;
               int var16 = var40 - var57;
               var1[var15] = var1[var16];
               var1[var15 + 1] = -var1[var16 + 1];
            }
         }
      }
   }

   private void method30415(Class2378 var1, boolean var2) {
      long var5 = 2L * this.field38403;
      long var7 = this.field38403 / 2L + 1L;
      Class2378 var9 = new Class2378(var7 * 2L * this.field38402);
      long var10 = 2L * this.field38402;
      int var12 = Class7008.method21726();
      if (var12 > 1 && this.field38407 && this.field38402 >= (long)var12 && var7 - 2L >= (long)var12) {
         Future[] var13 = new Future[var12];
         long var14 = this.field38402 / (long)var12;

         for (int var16 = 0; var16 < var12; var16++) {
            long var57 = (long)var16 * var14;
            long var64 = var16 == var12 - 1 ? this.field38402 : var57 + var14;
            var13[var16] = Class7008.method21729(new Class633(this, var57, var64, var1, var2));
         }

         try {
            Class7008.method21730(var13);
         } catch (InterruptedException var47) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var47);
         } catch (ExecutionException var48) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var48);
         }

         for (long var21 = 0L; var21 < this.field38402; var21++) {
            var9.method9687(var21, (double)var1.method9651(var21 * this.field38403));
         }

         this.field38405.method30950(var9, var2);
         var14 = (var7 - 2L) / (long)var12;

         for (int var51 = 0; var51 < var12; var51++) {
            long var58 = 1L + (long)var51 * var14;
            long var65 = var51 == var12 - 1 ? var7 - 1L : var58 + var14;
            var13[var51] = Class7008.method21729(new Class728(this, var58, var65, var9, var10, var1, var2));
         }

         try {
            Class7008.method21730(var13);
         } catch (InterruptedException var45) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var45);
         } catch (ExecutionException var46) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var46);
         }

         if (this.field38403 % 2L == 0L) {
            for (long var69 = 0L; var69 < this.field38402; var69++) {
               var9.method9687((var7 - 1L) * var10 + var69, (double)var1.method9651(var69 * this.field38403 + 1L));
            }

            this.field38405.method30952(var9, (var7 - 1L) * var10, var2);
         } else {
            for (long var68 = 0L; var68 < this.field38402; var68++) {
               long var23 = 2L * var68;
               long var25 = var68 * this.field38403;
               long var27 = var7 - 1L;
               var9.method9687(var27 * var10 + var23, (double)var1.method9651(var25 + 2L * var27));
               var9.method9687(var27 * var10 + var23 + 1L, (double)var1.method9651(var25 + 1L));
            }

            this.field38405.method30936(var9, (var7 - 1L) * var10, var2);
         }

         var14 = this.field38402 / (long)var12;

         for (int var52 = 0; var52 < var12; var52++) {
            long var59 = (long)var52 * var14;
            long var66 = var52 == var12 - 1 ? this.field38402 : var59 + var14;
            var13[var52] = Class7008.method21729(new Class337(this, var59, var66, var7, var5, var1, var9, var10));
         }

         try {
            Class7008.method21730(var13);
         } catch (InterruptedException var43) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var43);
         } catch (ExecutionException var44) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var44);
         }

         for (int var53 = 0; var53 < var12; var53++) {
            long var60 = 1L + (long)var53 * var14;
            long var67 = var53 == var12 - 1 ? this.field38402 : var60 + var14;
            var13[var53] = Class7008.method21729(new Class1581(this, var60, var67, var5, var7, var1));
         }

         try {
            Class7008.method21730(var13);
         } catch (InterruptedException var41) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var41);
         } catch (ExecutionException var42) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var42);
         }
      } else {
         for (long var29 = 0L; var29 < this.field38402; var29++) {
            this.field38404.method30954(var1, var29 * this.field38403, var2);
         }

         for (long var70 = 0L; var70 < this.field38402; var70++) {
            var9.method9687(var70, (double)var1.method9651(var70 * this.field38403));
         }

         this.field38405.method30950(var9, var2);

         for (long var71 = 1L; var71 < var7 - 1L; var71++) {
            long var31 = 2L * var71;

            for (long var17 = 0L; var17 < this.field38402; var17++) {
               long var19 = 2L * var17;
               long var33 = var17 * this.field38403 + var31;
               var9.method9687(var71 * var10 + var19, (double)var1.method9651(var33));
               var9.method9687(var71 * var10 + var19 + 1L, (double)var1.method9651(var33 + 1L));
            }

            this.field38405.method30936(var9, var71 * var10, var2);
         }

         if (this.field38403 % 2L == 0L) {
            for (long var73 = 0L; var73 < this.field38402; var73++) {
               var9.method9687((var7 - 1L) * var10 + var73, (double)var1.method9651(var73 * this.field38403 + 1L));
            }

            this.field38405.method30952(var9, (var7 - 1L) * var10, var2);
         } else {
            for (long var72 = 0L; var72 < this.field38402; var72++) {
               long var76 = 2L * var72;
               long var54 = var72 * this.field38403;
               long var61 = var7 - 1L;
               var9.method9687(var61 * var10 + var76, (double)var1.method9651(var54 + 2L * var61));
               var9.method9687(var61 * var10 + var76 + 1L, (double)var1.method9651(var54 + 1L));
            }

            this.field38405.method30936(var9, (var7 - 1L) * var10, var2);
         }

         for (long var74 = 0L; var74 < this.field38402; var74++) {
            long var77 = 2L * var74;

            for (long var55 = 0L; var55 < var7; var55++) {
               long var62 = 2L * var55;
               long var79 = var74 * var5 + var62;
               var1.method9687(var79, (double)var9.method9651(var55 * var10 + var77));
               var1.method9687(var79 + 1L, (double)var9.method9651(var55 * var10 + var77 + 1L));
            }
         }

         for (long var75 = 1L; var75 < this.field38402; var75++) {
            long var78 = var75 * var5;
            long var56 = (this.field38402 - var75 + 1L) * var5;

            for (long var63 = var7; var63 < this.field38403; var63++) {
               long var80 = 2L * var63;
               long var35 = 2L * (this.field38403 - var63);
               var1.method9687(var80, (double)var1.method9651(var35));
               var1.method9687(var80 + 1L, (double)(-var1.method9651(var35 + 1L)));
               long var37 = var78 + var80;
               long var39 = var56 - var80;
               var1.method9687(var37, (double)var1.method9651(var39));
               var1.method9687(var37 + 1L, (double)(-var1.method9651(var39 + 1L)));
            }
         }
      }
   }

   private void method30416(int var1, float[] var2) {
      int var5 = this.field38400 >> 1;
      if (var1 >= 0) {
         for (int var6 = 1; var6 < var5; var6++) {
            int var7 = this.field38400 - var6;
            int var8 = var6 * this.field38401;
            int var9 = var7 * this.field38401;
            var2[var9] = 0.5F * (var2[var8] - var2[var9]);
            var2[var8] -= var2[var9];
            var2[var9 + 1] = 0.5F * (var2[var8 + 1] + var2[var9 + 1]);
            var2[var8 + 1] = var2[var8 + 1] - var2[var9 + 1];
         }
      } else {
         for (int var11 = 1; var11 < var5; var11++) {
            int var12 = this.field38400 - var11;
            int var13 = var11 * this.field38401;
            int var14 = var12 * this.field38401;
            float var10 = var2[var13] - var2[var14];
            var2[var13] += var2[var14];
            var2[var14] = var10;
            var10 = var2[var14 + 1] - var2[var13 + 1];
            var2[var13 + 1] = var2[var13 + 1] + var2[var14 + 1];
            var2[var14 + 1] = var10;
         }
      }
   }

   private void method30417(int var1, Class2378 var2) {
      long var5 = this.field38402 >> 1;
      if (var1 >= 0) {
         for (long var7 = 1L; var7 < var5; var7++) {
            long var9 = this.field38402 - var7;
            long var11 = var7 * this.field38403;
            long var13 = var9 * this.field38403;
            var2.method9687(var13, (double)(0.5F * (var2.method9651(var11) - var2.method9651(var13))));
            var2.method9687(var11, (double)(var2.method9651(var11) - var2.method9651(var13)));
            var2.method9687(var13 + 1L, (double)(0.5F * (var2.method9651(var11 + 1L) + var2.method9651(var13 + 1L))));
            var2.method9687(var11 + 1L, (double)(var2.method9651(var11 + 1L) - var2.method9651(var13 + 1L)));
         }
      } else {
         for (long var16 = 1L; var16 < var5; var16++) {
            long var17 = this.field38402 - var16;
            long var18 = var16 * this.field38403;
            long var19 = var17 * this.field38403;
            float var15 = var2.method9651(var18) - var2.method9651(var19);
            var2.method9687(var18, (double)(var2.method9651(var18) + var2.method9651(var19)));
            var2.method9687(var19, (double)var15);
            var15 = var2.method9651(var19 + 1L) - var2.method9651(var18 + 1L);
            var2.method9687(var18 + 1L, (double)(var2.method9651(var18 + 1L) + var2.method9651(var19 + 1L)));
            var2.method9687(var19 + 1L, (double)var15);
         }
      }
   }

   private void method30418(int var1, float[][] var2) {
      int var5 = this.field38400 >> 1;
      if (var1 >= 0) {
         for (int var6 = 1; var6 < var5; var6++) {
            int var7 = this.field38400 - var6;
            var2[var7][0] = 0.5F * (var2[var6][0] - var2[var7][0]);
            var2[var6][0] = var2[var6][0] - var2[var7][0];
            var2[var7][1] = 0.5F * (var2[var6][1] + var2[var7][1]);
            var2[var6][1] = var2[var6][1] - var2[var7][1];
         }
      } else {
         for (int var9 = 1; var9 < var5; var9++) {
            int var10 = this.field38400 - var9;
            float var8 = var2[var9][0] - var2[var10][0];
            var2[var9][0] = var2[var9][0] + var2[var10][0];
            var2[var10][0] = var8;
            var8 = var2[var10][1] - var2[var9][1];
            var2[var9][1] = var2[var9][1] + var2[var10][1];
            var2[var10][1] = var8;
         }
      }
   }

   private void method30419(int var1, float[] var2, boolean var3) {
      int var6 = 8 * this.field38400;
      if (this.field38401 != 4) {
         if (this.field38401 < 4) {
            var6 >>= 2;
         }
      } else {
         var6 >>= 1;
      }

      float[] var7 = new float[var6];
      if (var1 != -1) {
         if (this.field38401 <= 4) {
            if (this.field38401 != 4) {
               if (this.field38401 == 2) {
                  for (int var8 = 0; var8 < this.field38400; var8++) {
                     int var10 = var8 * this.field38401;
                     int var11 = 2 * var8;
                     var7[var11] = var2[var10];
                     var7[var11 + 1] = var2[var10 + 1];
                  }

                  this.field38405.method30935(var7, 0, var3);

                  for (int var15 = 0; var15 < this.field38400; var15++) {
                     int var27 = var15 * this.field38401;
                     int var38 = 2 * var15;
                     var2[var27] = var7[var38];
                     var2[var27 + 1] = var7[var38 + 1];
                  }
               }
            } else {
               for (int var16 = 0; var16 < this.field38400; var16++) {
                  int var28 = var16 * this.field38401;
                  int var39 = 2 * var16;
                  int var12 = 2 * this.field38400 + 2 * var16;
                  var7[var39] = var2[var28];
                  var7[var39 + 1] = var2[var28 + 1];
                  var7[var12] = var2[var28 + 2];
                  var7[var12 + 1] = var2[var28 + 3];
               }

               this.field38405.method30935(var7, 0, var3);
               this.field38405.method30935(var7, 2 * this.field38400, var3);

               for (int var17 = 0; var17 < this.field38400; var17++) {
                  int var29 = var17 * this.field38401;
                  int var40 = 2 * var17;
                  int var49 = 2 * this.field38400 + 2 * var17;
                  var2[var29] = var7[var40];
                  var2[var29 + 1] = var7[var40 + 1];
                  var2[var29 + 2] = var7[var49];
                  var2[var29 + 3] = var7[var49 + 1];
               }
            }
         } else {
            for (int var18 = 0; var18 < this.field38401; var18 += 8) {
               for (int var9 = 0; var9 < this.field38400; var9++) {
                  int var30 = var9 * this.field38401 + var18;
                  int var41 = 2 * var9;
                  int var50 = 2 * this.field38400 + 2 * var9;
                  int var13 = var50 + 2 * this.field38400;
                  int var14 = var13 + 2 * this.field38400;
                  var7[var41] = var2[var30];
                  var7[var41 + 1] = var2[var30 + 1];
                  var7[var50] = var2[var30 + 2];
                  var7[var50 + 1] = var2[var30 + 3];
                  var7[var13] = var2[var30 + 4];
                  var7[var13 + 1] = var2[var30 + 5];
                  var7[var14] = var2[var30 + 6];
                  var7[var14 + 1] = var2[var30 + 7];
               }

               this.field38405.method30935(var7, 0, var3);
               this.field38405.method30935(var7, 2 * this.field38400, var3);
               this.field38405.method30935(var7, 4 * this.field38400, var3);
               this.field38405.method30935(var7, 6 * this.field38400, var3);

               for (int var24 = 0; var24 < this.field38400; var24++) {
                  int var31 = var24 * this.field38401 + var18;
                  int var42 = 2 * var24;
                  int var51 = 2 * this.field38400 + 2 * var24;
                  int var56 = var51 + 2 * this.field38400;
                  int var59 = var56 + 2 * this.field38400;
                  var2[var31] = var7[var42];
                  var2[var31 + 1] = var7[var42 + 1];
                  var2[var31 + 2] = var7[var51];
                  var2[var31 + 3] = var7[var51 + 1];
                  var2[var31 + 4] = var7[var56];
                  var2[var31 + 5] = var7[var56 + 1];
                  var2[var31 + 6] = var7[var59];
                  var2[var31 + 7] = var7[var59 + 1];
               }
            }
         }
      } else if (this.field38401 <= 4) {
         if (this.field38401 != 4) {
            if (this.field38401 == 2) {
               for (int var19 = 0; var19 < this.field38400; var19++) {
                  int var32 = var19 * this.field38401;
                  int var43 = 2 * var19;
                  var7[var43] = var2[var32];
                  var7[var43 + 1] = var2[var32 + 1];
               }

               this.field38405.method30931(var7, 0);

               for (int var20 = 0; var20 < this.field38400; var20++) {
                  int var33 = var20 * this.field38401;
                  int var44 = 2 * var20;
                  var2[var33] = var7[var44];
                  var2[var33 + 1] = var7[var44 + 1];
               }
            }
         } else {
            for (int var21 = 0; var21 < this.field38400; var21++) {
               int var34 = var21 * this.field38401;
               int var45 = 2 * var21;
               int var52 = 2 * this.field38400 + 2 * var21;
               var7[var45] = var2[var34];
               var7[var45 + 1] = var2[var34 + 1];
               var7[var52] = var2[var34 + 2];
               var7[var52 + 1] = var2[var34 + 3];
            }

            this.field38405.method30931(var7, 0);
            this.field38405.method30931(var7, 2 * this.field38400);

            for (int var22 = 0; var22 < this.field38400; var22++) {
               int var35 = var22 * this.field38401;
               int var46 = 2 * var22;
               int var53 = 2 * this.field38400 + 2 * var22;
               var2[var35] = var7[var46];
               var2[var35 + 1] = var7[var46 + 1];
               var2[var35 + 2] = var7[var53];
               var2[var35 + 3] = var7[var53 + 1];
            }
         }
      } else {
         for (int var23 = 0; var23 < this.field38401; var23 += 8) {
            for (int var25 = 0; var25 < this.field38400; var25++) {
               int var36 = var25 * this.field38401 + var23;
               int var47 = 2 * var25;
               int var54 = 2 * this.field38400 + 2 * var25;
               int var57 = var54 + 2 * this.field38400;
               int var60 = var57 + 2 * this.field38400;
               var7[var47] = var2[var36];
               var7[var47 + 1] = var2[var36 + 1];
               var7[var54] = var2[var36 + 2];
               var7[var54 + 1] = var2[var36 + 3];
               var7[var57] = var2[var36 + 4];
               var7[var57 + 1] = var2[var36 + 5];
               var7[var60] = var2[var36 + 6];
               var7[var60 + 1] = var2[var36 + 7];
            }

            this.field38405.method30931(var7, 0);
            this.field38405.method30931(var7, 2 * this.field38400);
            this.field38405.method30931(var7, 4 * this.field38400);
            this.field38405.method30931(var7, 6 * this.field38400);

            for (int var26 = 0; var26 < this.field38400; var26++) {
               int var37 = var26 * this.field38401 + var23;
               int var48 = 2 * var26;
               int var55 = 2 * this.field38400 + 2 * var26;
               int var58 = var55 + 2 * this.field38400;
               int var61 = var58 + 2 * this.field38400;
               var2[var37] = var7[var48];
               var2[var37 + 1] = var7[var48 + 1];
               var2[var37 + 2] = var7[var55];
               var2[var37 + 3] = var7[var55 + 1];
               var2[var37 + 4] = var7[var58];
               var2[var37 + 5] = var7[var58 + 1];
               var2[var37 + 6] = var7[var61];
               var2[var37 + 7] = var7[var61 + 1];
            }
         }
      }
   }

   private void method30420(int var1, Class2378 var2, boolean var3) {
      long var6 = 8L * this.field38402;
      if (this.field38403 != 4L) {
         if (this.field38403 < 4L) {
            var6 >>= 2;
         }
      } else {
         var6 >>= 1;
      }

      Class2378 var8 = new Class2378(var6);
      if (var1 != -1) {
         if (this.field38403 <= 4L) {
            if (this.field38403 != 4L) {
               if (this.field38403 == 2L) {
                  for (long var9 = 0L; var9 < this.field38402; var9++) {
                     long var13 = var9 * this.field38403;
                     long var15 = 2L * var9;
                     var8.method9687(var15, (double)var2.method9651(var13));
                     var8.method9687(var15 + 1L, (double)var2.method9651(var13 + 1L));
                  }

                  this.field38405.method30936(var8, 0L, var3);

                  for (long var23 = 0L; var23 < this.field38402; var23++) {
                     long var35 = var23 * this.field38403;
                     long var46 = 2L * var23;
                     var2.method9687(var35, (double)var8.method9651(var46));
                     var2.method9687(var35 + 1L, (double)var8.method9651(var46 + 1L));
                  }
               }
            } else {
               for (long var24 = 0L; var24 < this.field38402; var24++) {
                  long var36 = var24 * this.field38403;
                  long var47 = 2L * var24;
                  long var17 = 2L * this.field38402 + 2L * var24;
                  var8.method9687(var47, (double)var2.method9651(var36));
                  var8.method9687(var47 + 1L, (double)var2.method9651(var36 + 1L));
                  var8.method9687(var17, (double)var2.method9651(var36 + 2L));
                  var8.method9687(var17 + 1L, (double)var2.method9651(var36 + 3L));
               }

               this.field38405.method30936(var8, 0L, var3);
               this.field38405.method30936(var8, 2L * this.field38402, var3);

               for (long var25 = 0L; var25 < this.field38402; var25++) {
                  long var37 = var25 * this.field38403;
                  long var48 = 2L * var25;
                  long var57 = 2L * this.field38402 + 2L * var25;
                  var2.method9687(var37, (double)var8.method9651(var48));
                  var2.method9687(var37 + 1L, (double)var8.method9651(var48 + 1L));
                  var2.method9687(var37 + 2L, (double)var8.method9651(var57));
                  var2.method9687(var37 + 3L, (double)var8.method9651(var57 + 1L));
               }
            }
         } else {
            for (long var26 = 0L; var26 < this.field38403; var26 += 8L) {
               for (long var11 = 0L; var11 < this.field38402; var11++) {
                  long var38 = var11 * this.field38403 + var26;
                  long var49 = 2L * var11;
                  long var58 = 2L * this.field38402 + 2L * var11;
                  long var19 = var58 + 2L * this.field38402;
                  long var21 = var19 + 2L * this.field38402;
                  var8.method9687(var49, (double)var2.method9651(var38));
                  var8.method9687(var49 + 1L, (double)var2.method9651(var38 + 1L));
                  var8.method9687(var58, (double)var2.method9651(var38 + 2L));
                  var8.method9687(var58 + 1L, (double)var2.method9651(var38 + 3L));
                  var8.method9687(var19, (double)var2.method9651(var38 + 4L));
                  var8.method9687(var19 + 1L, (double)var2.method9651(var38 + 5L));
                  var8.method9687(var21, (double)var2.method9651(var38 + 6L));
                  var8.method9687(var21 + 1L, (double)var2.method9651(var38 + 7L));
               }

               this.field38405.method30936(var8, 0L, var3);
               this.field38405.method30936(var8, 2L * this.field38402, var3);
               this.field38405.method30936(var8, 4L * this.field38402, var3);
               this.field38405.method30936(var8, 6L * this.field38402, var3);

               for (long var32 = 0L; var32 < this.field38402; var32++) {
                  long var39 = var32 * this.field38403 + var26;
                  long var50 = 2L * var32;
                  long var59 = 2L * this.field38402 + 2L * var32;
                  long var64 = var59 + 2L * this.field38402;
                  long var67 = var64 + 2L * this.field38402;
                  var2.method9687(var39, (double)var8.method9651(var50));
                  var2.method9687(var39 + 1L, (double)var8.method9651(var50 + 1L));
                  var2.method9687(var39 + 2L, (double)var8.method9651(var59));
                  var2.method9687(var39 + 3L, (double)var8.method9651(var59 + 1L));
                  var2.method9687(var39 + 4L, (double)var8.method9651(var64));
                  var2.method9687(var39 + 5L, (double)var8.method9651(var64 + 1L));
                  var2.method9687(var39 + 6L, (double)var8.method9651(var67));
                  var2.method9687(var39 + 7L, (double)var8.method9651(var67 + 1L));
               }
            }
         }
      } else if (this.field38403 <= 4L) {
         if (this.field38403 != 4L) {
            if (this.field38403 == 2L) {
               for (long var27 = 0L; var27 < this.field38402; var27++) {
                  long var40 = var27 * this.field38403;
                  long var51 = 2L * var27;
                  var8.method9687(var51, (double)var2.method9651(var40));
                  var8.method9687(var51 + 1L, (double)var2.method9651(var40 + 1L));
               }

               this.field38405.method30932(var8, 0L);

               for (long var28 = 0L; var28 < this.field38402; var28++) {
                  long var41 = var28 * this.field38403;
                  long var52 = 2L * var28;
                  var2.method9687(var41, (double)var8.method9651(var52));
                  var2.method9687(var41 + 1L, (double)var8.method9651(var52 + 1L));
               }
            }
         } else {
            for (long var29 = 0L; var29 < this.field38402; var29++) {
               long var42 = var29 * this.field38403;
               long var53 = 2L * var29;
               long var60 = 2L * this.field38402 + 2L * var29;
               var8.method9687(var53, (double)var2.method9651(var42));
               var8.method9687(var53 + 1L, (double)var2.method9651(var42 + 1L));
               var8.method9687(var60, (double)var2.method9651(var42 + 2L));
               var8.method9687(var60 + 1L, (double)var2.method9651(var42 + 3L));
            }

            this.field38405.method30932(var8, 0L);
            this.field38405.method30932(var8, 2L * this.field38402);

            for (long var30 = 0L; var30 < this.field38402; var30++) {
               long var43 = var30 * this.field38403;
               long var54 = 2L * var30;
               long var61 = 2L * this.field38402 + 2L * var30;
               var2.method9687(var43, (double)var8.method9651(var54));
               var2.method9687(var43 + 1L, (double)var8.method9651(var54 + 1L));
               var2.method9687(var43 + 2L, (double)var8.method9651(var61));
               var2.method9687(var43 + 3L, (double)var8.method9651(var61 + 1L));
            }
         }
      } else {
         for (long var31 = 0L; var31 < this.field38403; var31 += 8L) {
            for (long var33 = 0L; var33 < this.field38402; var33++) {
               long var44 = var33 * this.field38403 + var31;
               long var55 = 2L * var33;
               long var62 = 2L * this.field38402 + 2L * var33;
               long var65 = var62 + 2L * this.field38402;
               long var68 = var65 + 2L * this.field38402;
               var8.method9687(var55, (double)var2.method9651(var44));
               var8.method9687(var55 + 1L, (double)var2.method9651(var44 + 1L));
               var8.method9687(var62, (double)var2.method9651(var44 + 2L));
               var8.method9687(var62 + 1L, (double)var2.method9651(var44 + 3L));
               var8.method9687(var65, (double)var2.method9651(var44 + 4L));
               var8.method9687(var65 + 1L, (double)var2.method9651(var44 + 5L));
               var8.method9687(var68, (double)var2.method9651(var44 + 6L));
               var8.method9687(var68 + 1L, (double)var2.method9651(var44 + 7L));
            }

            this.field38405.method30932(var8, 0L);
            this.field38405.method30932(var8, 2L * this.field38402);
            this.field38405.method30932(var8, 4L * this.field38402);
            this.field38405.method30932(var8, 6L * this.field38402);

            for (long var34 = 0L; var34 < this.field38402; var34++) {
               long var45 = var34 * this.field38403 + var31;
               long var56 = 2L * var34;
               long var63 = 2L * this.field38402 + 2L * var34;
               long var66 = var63 + 2L * this.field38402;
               long var69 = var66 + 2L * this.field38402;
               var2.method9687(var45, (double)var8.method9651(var56));
               var2.method9687(var45 + 1L, (double)var8.method9651(var56 + 1L));
               var2.method9687(var45 + 2L, (double)var8.method9651(var63));
               var2.method9687(var45 + 3L, (double)var8.method9651(var63 + 1L));
               var2.method9687(var45 + 4L, (double)var8.method9651(var66));
               var2.method9687(var45 + 5L, (double)var8.method9651(var66 + 1L));
               var2.method9687(var45 + 6L, (double)var8.method9651(var69));
               var2.method9687(var45 + 7L, (double)var8.method9651(var69 + 1L));
            }
         }
      }
   }

   private void method30421(int var1, float[][] var2, boolean var3) {
      int var6 = 8 * this.field38400;
      if (this.field38401 != 4) {
         if (this.field38401 < 4) {
            var6 >>= 2;
         }
      } else {
         var6 >>= 1;
      }

      float[] var7 = new float[var6];
      if (var1 != -1) {
         if (this.field38401 <= 4) {
            if (this.field38401 != 4) {
               if (this.field38401 == 2) {
                  for (int var8 = 0; var8 < this.field38400; var8++) {
                     int var10 = 2 * var8;
                     var7[var10] = var2[var8][0];
                     var7[var10 + 1] = var2[var8][1];
                  }

                  this.field38405.method30935(var7, 0, var3);

                  for (int var14 = 0; var14 < this.field38400; var14++) {
                     int var26 = 2 * var14;
                     var2[var14][0] = var7[var26];
                     var2[var14][1] = var7[var26 + 1];
                  }
               }
            } else {
               for (int var15 = 0; var15 < this.field38400; var15++) {
                  int var27 = 2 * var15;
                  int var11 = 2 * this.field38400 + 2 * var15;
                  var7[var27] = var2[var15][0];
                  var7[var27 + 1] = var2[var15][1];
                  var7[var11] = var2[var15][2];
                  var7[var11 + 1] = var2[var15][3];
               }

               this.field38405.method30935(var7, 0, var3);
               this.field38405.method30935(var7, 2 * this.field38400, var3);

               for (int var16 = 0; var16 < this.field38400; var16++) {
                  int var28 = 2 * var16;
                  int var37 = 2 * this.field38400 + 2 * var16;
                  var2[var16][0] = var7[var28];
                  var2[var16][1] = var7[var28 + 1];
                  var2[var16][2] = var7[var37];
                  var2[var16][3] = var7[var37 + 1];
               }
            }
         } else {
            for (int var17 = 0; var17 < this.field38401; var17 += 8) {
               for (int var9 = 0; var9 < this.field38400; var9++) {
                  int var29 = 2 * var9;
                  int var38 = 2 * this.field38400 + 2 * var9;
                  int var12 = var38 + 2 * this.field38400;
                  int var13 = var12 + 2 * this.field38400;
                  var7[var29] = var2[var9][var17];
                  var7[var29 + 1] = var2[var9][var17 + 1];
                  var7[var38] = var2[var9][var17 + 2];
                  var7[var38 + 1] = var2[var9][var17 + 3];
                  var7[var12] = var2[var9][var17 + 4];
                  var7[var12 + 1] = var2[var9][var17 + 5];
                  var7[var13] = var2[var9][var17 + 6];
                  var7[var13 + 1] = var2[var9][var17 + 7];
               }

               this.field38405.method30935(var7, 0, var3);
               this.field38405.method30935(var7, 2 * this.field38400, var3);
               this.field38405.method30935(var7, 4 * this.field38400, var3);
               this.field38405.method30935(var7, 6 * this.field38400, var3);

               for (int var23 = 0; var23 < this.field38400; var23++) {
                  int var30 = 2 * var23;
                  int var39 = 2 * this.field38400 + 2 * var23;
                  int var44 = var39 + 2 * this.field38400;
                  int var47 = var44 + 2 * this.field38400;
                  var2[var23][var17] = var7[var30];
                  var2[var23][var17 + 1] = var7[var30 + 1];
                  var2[var23][var17 + 2] = var7[var39];
                  var2[var23][var17 + 3] = var7[var39 + 1];
                  var2[var23][var17 + 4] = var7[var44];
                  var2[var23][var17 + 5] = var7[var44 + 1];
                  var2[var23][var17 + 6] = var7[var47];
                  var2[var23][var17 + 7] = var7[var47 + 1];
               }
            }
         }
      } else if (this.field38401 <= 4) {
         if (this.field38401 != 4) {
            if (this.field38401 == 2) {
               for (int var18 = 0; var18 < this.field38400; var18++) {
                  int var31 = 2 * var18;
                  var7[var31] = var2[var18][0];
                  var7[var31 + 1] = var2[var18][1];
               }

               this.field38405.method30931(var7, 0);

               for (int var19 = 0; var19 < this.field38400; var19++) {
                  int var32 = 2 * var19;
                  var2[var19][0] = var7[var32];
                  var2[var19][1] = var7[var32 + 1];
               }
            }
         } else {
            for (int var20 = 0; var20 < this.field38400; var20++) {
               int var33 = 2 * var20;
               int var40 = 2 * this.field38400 + 2 * var20;
               var7[var33] = var2[var20][0];
               var7[var33 + 1] = var2[var20][1];
               var7[var40] = var2[var20][2];
               var7[var40 + 1] = var2[var20][3];
            }

            this.field38405.method30931(var7, 0);
            this.field38405.method30931(var7, 2 * this.field38400);

            for (int var21 = 0; var21 < this.field38400; var21++) {
               int var34 = 2 * var21;
               int var41 = 2 * this.field38400 + 2 * var21;
               var2[var21][0] = var7[var34];
               var2[var21][1] = var7[var34 + 1];
               var2[var21][2] = var7[var41];
               var2[var21][3] = var7[var41 + 1];
            }
         }
      } else {
         for (int var22 = 0; var22 < this.field38401; var22 += 8) {
            for (int var24 = 0; var24 < this.field38400; var24++) {
               int var35 = 2 * var24;
               int var42 = 2 * this.field38400 + 2 * var24;
               int var45 = var42 + 2 * this.field38400;
               int var48 = var45 + 2 * this.field38400;
               var7[var35] = var2[var24][var22];
               var7[var35 + 1] = var2[var24][var22 + 1];
               var7[var42] = var2[var24][var22 + 2];
               var7[var42 + 1] = var2[var24][var22 + 3];
               var7[var45] = var2[var24][var22 + 4];
               var7[var45 + 1] = var2[var24][var22 + 5];
               var7[var48] = var2[var24][var22 + 6];
               var7[var48 + 1] = var2[var24][var22 + 7];
            }

            this.field38405.method30931(var7, 0);
            this.field38405.method30931(var7, 2 * this.field38400);
            this.field38405.method30931(var7, 4 * this.field38400);
            this.field38405.method30931(var7, 6 * this.field38400);

            for (int var25 = 0; var25 < this.field38400; var25++) {
               int var36 = 2 * var25;
               int var43 = 2 * this.field38400 + 2 * var25;
               int var46 = var43 + 2 * this.field38400;
               int var49 = var46 + 2 * this.field38400;
               var2[var25][var22] = var7[var36];
               var2[var25][var22 + 1] = var7[var36 + 1];
               var2[var25][var22 + 2] = var7[var43];
               var2[var25][var22 + 3] = var7[var43 + 1];
               var2[var25][var22 + 4] = var7[var46];
               var2[var25][var22 + 5] = var7[var46 + 1];
               var2[var25][var22 + 6] = var7[var49];
               var2[var25][var22 + 7] = var7[var49 + 1];
            }
         }
      }
   }

   private void method30422(int var1, int var2, float[] var3, boolean var4) {
      int var7 = Class7008.method21726() > this.field38400 ? this.field38400 : Class7008.method21726();
      Future[] var8 = new Future[var7];

      for (int var9 = 0; var9 < var7; var9++) {
         var8[var9] = Class7008.method21729(new Class1505(this, var1, var2, var9, var7, var3, var4));
      }

      try {
         Class7008.method21730(var8);
      } catch (InterruptedException var11) {
         Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var11);
      } catch (ExecutionException var12) {
         Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var12);
      }
   }

   private void method30423(long var1, int var3, Class2378 var4, boolean var5) {
      int var8 = (int)((long)Class7008.method21726() > this.field38402 ? this.field38402 : (long)Class7008.method21726());
      Future[] var9 = new Future[var8];

      for (int var10 = 0; var10 < var8; var10++) {
         var9[var10] = Class7008.method21729(new Class714(this, var1, var3, var10, var8, var4, var5));
      }

      try {
         Class7008.method21730(var9);
      } catch (InterruptedException var12) {
         Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var12);
      } catch (ExecutionException var13) {
         Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var13);
      }
   }

   private void method30424(int var1, int var2, float[] var3, boolean var4) {
      int var7 = Class7008.method21726() > this.field38400 ? this.field38400 : Class7008.method21726();
      Future[] var8 = new Future[var7];

      for (int var9 = 0; var9 < var7; var9++) {
         var8[var9] = Class7008.method21729(new Class560(this, var1, var2, var9, var7, var3, var4));
      }

      try {
         Class7008.method21730(var8);
      } catch (InterruptedException var11) {
         Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var11);
      } catch (ExecutionException var12) {
         Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var12);
      }
   }

   private void method30425(long var1, int var3, Class2378 var4, boolean var5) {
      int var8 = Class7008.method21726() > this.field38400 ? this.field38400 : Class7008.method21726();
      Future[] var9 = new Future[var8];

      for (int var10 = 0; var10 < var8; var10++) {
         long var11 = (long)var10;
         var9[var10] = Class7008.method21729(new Class406(this, var1, var3, var11, var8, var4, var5));
      }

      try {
         Class7008.method21730(var9);
      } catch (InterruptedException var13) {
         Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var13);
      } catch (ExecutionException var14) {
         Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var14);
      }
   }

   private void method30426(int var1, int var2, float[][] var3, boolean var4) {
      int var7 = Class7008.method21726() > this.field38400 ? this.field38400 : Class7008.method21726();
      Future[] var8 = new Future[var7];

      for (int var9 = 0; var9 < var7; var9++) {
         var8[var9] = Class7008.method21729(new Class722(this, var1, var2, var9, var7, var3, var4));
      }

      try {
         Class7008.method21730(var8);
      } catch (InterruptedException var11) {
         Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var11);
      } catch (ExecutionException var12) {
         Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var12);
      }
   }

   private void method30427(int var1, int var2, float[][] var3, boolean var4) {
      int var7 = Class7008.method21726() > this.field38400 ? this.field38400 : Class7008.method21726();
      Future[] var8 = new Future[var7];

      for (int var9 = 0; var9 < var7; var9++) {
         var8[var9] = Class7008.method21729(new Class352(this, var1, var2, var9, var7, var3, var4));
      }

      try {
         Class7008.method21730(var8);
      } catch (InterruptedException var11) {
         Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var11);
      } catch (ExecutionException var12) {
         Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var12);
      }
   }

   private void method30428(int var1, float[] var2, boolean var3) {
      int var6 = Class9044.method33603(this.field38401 / 2, Class7008.method21726());
      int var7 = 8 * this.field38400;
      if (this.field38401 == 4) {
         var7 >>= 1;
      } else if (this.field38401 < 4) {
         var7 >>= 2;
      }

      int var8 = var7;
      Future[] var9 = new Future[var6];
      int var10 = var6;

      for (int var11 = 0; var11 < var6; var11++) {
         var9[var11] = Class7008.method21729(new Class1598(this, var8, var1, var10, var11, var2, var3));
      }

      try {
         Class7008.method21730(var9);
      } catch (InterruptedException var13) {
         Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var13);
      } catch (ExecutionException var14) {
         Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var14);
      }
   }

   private void method30429(int var1, Class2378 var2, boolean var3) {
      int var6 = (int)Class9044.method33604(this.field38403 / 2L, (long)Class7008.method21726());
      long var7 = 8L * this.field38402;
      if (this.field38403 == 4L) {
         var7 >>= 1;
      } else if (this.field38403 < 4L) {
         var7 >>= 2;
      }

      long var9 = var7;
      Future[] var11 = new Future[var6];
      int var12 = var6;

      for (int var13 = 0; var13 < var6; var13++) {
         long var14 = (long)var13;
         var11[var13] = Class7008.method21729(new Class623(this, var9, var1, var12, var14, var2, var3));
      }

      try {
         Class7008.method21730(var11);
      } catch (InterruptedException var16) {
         Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var16);
      } catch (ExecutionException var17) {
         Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var17);
      }
   }

   private void method30430(int var1, float[][] var2, boolean var3) {
      int var6 = Class9044.method33603(this.field38401 / 2, Class7008.method21726());
      int var7 = 8 * this.field38400;
      if (this.field38401 == 4) {
         var7 >>= 1;
      } else if (this.field38401 < 4) {
         var7 >>= 2;
      }

      int var8 = var7;
      Future[] var9 = new Future[var6];
      int var10 = var6;

      for (int var11 = 0; var11 < var10; var11++) {
         var9[var11] = Class7008.method21729(new Class572(this, var8, var1, var10, var11, var2, var3));
      }

      try {
         Class7008.method21730(var9);
      } catch (InterruptedException var13) {
         Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var13);
      } catch (ExecutionException var14) {
         Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var14);
      }
   }

   private void method30431(float[] var1) {
      int var4 = 2 * this.field38401;
      int var5 = this.field38400 / 2;

      for (int var6 = this.field38400 - 1; var6 >= 1; var6--) {
         int var7 = var6 * this.field38401;
         int var8 = 2 * var7;

         for (int var9 = 0; var9 < this.field38401; var9 += 2) {
            var1[var8 + var9] = var1[var7 + var9];
            var1[var7 + var9] = 0.0F;
            var1[var8 + var9 + 1] = var1[var7 + var9 + 1];
            var1[var7 + var9 + 1] = 0.0F;
         }
      }

      int var21 = Class7008.method21726();
      if (var21 > 1 && this.field38407 && var5 >= var21) {
         Future[] var30 = new Future[var21];
         int var32 = var5 / var21;
         int var11 = 2 * this.field38401;

         for (int var12 = 0; var12 < var21; var12++) {
            int var13;
            if (var12 == 0) {
               var13 = var12 * var32 + 1;
            } else {
               var13 = var12 * var32;
            }

            int var14 = var12 * var32 + var32;
            int var15 = var12 * var32;
            int var16;
            if (var12 == var21 - 1) {
               var16 = var12 * var32 + var32 + 1;
            } else {
               var16 = var12 * var32 + var32;
            }

            var30[var12] = Class7008.method21729(new Class663(this, var13, var14, var11, var1, var15, var16));
         }

         try {
            Class7008.method21730(var30);
         } catch (InterruptedException var19) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var19);
         } catch (ExecutionException var20) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var20);
         }
      } else {
         for (int var27 = 1; var27 < var5; var27++) {
            int var24 = var27 * var4;
            int var17 = (this.field38400 - var27) * var4;
            var1[var24 + this.field38401] = var1[var17 + 1];
            var1[var24 + this.field38401 + 1] = -var1[var17];
         }

         for (int var28 = 1; var28 < var5; var28++) {
            int var25 = var28 * var4;
            int var33 = (this.field38400 - var28 + 1) * var4;

            for (int var10 = this.field38401 + 2; var10 < var4; var10 += 2) {
               var1[var25 + var10] = var1[var33 - var10];
               var1[var25 + var10 + 1] = -var1[var33 - var10 + 1];
            }
         }

         for (int var29 = 0; var29 <= this.field38400 / 2; var29++) {
            int var22 = var29 * var4;
            int var18 = (this.field38400 - var29) % this.field38400 * var4;

            for (int var31 = 0; var31 < var4; var31 += 2) {
               int var26 = var22 + var31;
               int var34 = var18 + (var4 - var31) % var4;
               var1[var34] = var1[var26];
               var1[var34 + 1] = -var1[var26 + 1];
            }
         }
      }

      var1[this.field38401] = -var1[1];
      var1[1] = 0.0F;
      int var23 = var5 * var4;
      var1[var23 + this.field38401] = -var1[var23 + 1];
      var1[var23 + 1] = 0.0F;
      var1[var23 + this.field38401 + 1] = 0.0F;
   }

   private void method30432(Class2378 var1) {
      long var4 = 2L * this.field38403;
      long var6 = this.field38402 / 2L;

      for (long var8 = this.field38402 - 1L; var8 >= 1L; var8--) {
         long var10 = var8 * this.field38403;
         long var12 = 2L * var10;

         for (long var14 = 0L; var14 < this.field38403; var14 += 2L) {
            var1.method9687(var12 + var14, (double)var1.method9651(var10 + var14));
            var1.method9687(var10 + var14, 0.0);
            var1.method9687(var12 + var14 + 1L, (double)var1.method9651(var10 + var14 + 1L));
            var1.method9687(var10 + var14 + 1L, 0.0);
         }
      }

      int var16 = Class7008.method21726();
      if (var16 > 1 && this.field38407 && var6 >= (long)var16) {
         Future[] var17 = new Future[var16];
         long var44 = var6 / (long)var16;
         long var18 = 2L * this.field38403;

         for (int var20 = 0; var20 < var16; var20++) {
            long var21;
            if (var20 == 0) {
               var21 = (long)var20 * var44 + 1L;
            } else {
               var21 = (long)var20 * var44;
            }

            long var23 = (long)var20 * var44 + var44;
            long var25 = (long)var20 * var44;
            long var27;
            if (var20 == var16 - 1) {
               var27 = (long)var20 * var44 + var44 + 1L;
            } else {
               var27 = (long)var20 * var44 + var44;
            }

            var17[var20] = Class7008.method21729(new Class396(this, var21, var23, var18, var1, var25, var27));
         }

         try {
            Class7008.method21730(var17);
         } catch (InterruptedException var37) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var37);
         } catch (ExecutionException var38) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var38);
         }
      } else {
         for (long var29 = 1L; var29 < var6; var29++) {
            long var41 = var29 * var4;
            long var31 = (this.field38402 - var29) * var4;
            var1.method9687(var41 + this.field38403, (double)var1.method9651(var31 + 1L));
            var1.method9687(var41 + this.field38403 + 1L, (double)(-var1.method9651(var31)));
         }

         for (long var45 = 1L; var45 < var6; var45++) {
            long var42 = var45 * var4;
            long var47 = (this.field38402 - var45 + 1L) * var4;

            for (long var33 = this.field38403 + 2L; var33 < var4; var33 += 2L) {
               var1.method9687(var42 + var33, (double)var1.method9651(var47 - var33));
               var1.method9687(var42 + var33 + 1L, (double)(-var1.method9651(var47 - var33 + 1L)));
            }
         }

         for (long var46 = 0L; var46 <= this.field38402 / 2L; var46++) {
            long var39 = var46 * var4;
            long var35 = (this.field38402 - var46) % this.field38402 * var4;

            for (long var49 = 0L; var49 < var4; var49 += 2L) {
               long var43 = var39 + var49;
               long var48 = var35 + (var4 - var49) % var4;
               var1.method9687(var48, (double)var1.method9651(var43));
               var1.method9687(var48 + 1L, (double)(-var1.method9651(var43 + 1L)));
            }
         }
      }

      var1.method9687(this.field38403, (double)(-var1.method9651(1L)));
      var1.method9687(1L, 0.0);
      long var40 = var6 * var4;
      var1.method9687(var40 + this.field38403, (double)(-var1.method9651(var40 + 1L)));
      var1.method9687(var40 + 1L, 0.0);
      var1.method9687(var40 + this.field38403 + 1L, 0.0);
   }

   private void method30433(float[][] var1) {
      int var4 = 2 * this.field38401;
      int var5 = this.field38400 / 2;
      int var6 = Class7008.method21726();
      if (var6 > 1 && this.field38407 && var5 >= var6) {
         Future[] var18 = new Future[var6];
         int var21 = var5 / var6;

         for (int var23 = 0; var23 < var6; var23++) {
            int var25;
            if (var23 == 0) {
               var25 = var23 * var21 + 1;
            } else {
               var25 = var23 * var21;
            }

            int var11 = var23 * var21 + var21;
            int var12 = var23 * var21;
            int var13;
            if (var23 == var6 - 1) {
               var13 = var23 * var21 + var21 + 1;
            } else {
               var13 = var23 * var21 + var21;
            }

            var18[var23] = Class7008.method21729(new Class661(this, var25, var11, var1, var4, var12, var13));
         }

         try {
            Class7008.method21730(var18);
         } catch (InterruptedException var14) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var14);
         } catch (ExecutionException var15) {
            Logger.getLogger(Class8543.class.getName()).log(Level.SEVERE, null, var15);
         }
      } else {
         for (int var7 = 1; var7 < var5; var7++) {
            int var8 = this.field38400 - var7;
            var1[var7][this.field38401] = var1[var8][1];
            var1[var7][this.field38401 + 1] = -var1[var8][0];
         }

         for (int var16 = 1; var16 < var5; var16++) {
            int var19 = this.field38400 - var16;

            for (int var9 = this.field38401 + 2; var9 < var4; var9 += 2) {
               int var10 = var4 - var9;
               var1[var16][var9] = var1[var19][var10];
               var1[var16][var9 + 1] = -var1[var19][var10 + 1];
            }
         }

         for (int var17 = 0; var17 <= this.field38400 / 2; var17++) {
            int var20 = (this.field38400 - var17) % this.field38400;

            for (int var22 = 0; var22 < var4; var22 += 2) {
               int var24 = (var4 - var22) % var4;
               var1[var20][var24] = var1[var17][var22];
               var1[var20][var24 + 1] = -var1[var17][var22 + 1];
            }
         }
      }

      var1[0][this.field38401] = -var1[0][1];
      var1[0][1] = 0.0F;
      var1[var5][this.field38401] = -var1[var5][1];
      var1[var5][1] = 0.0F;
      var1[var5][this.field38401 + 1] = 0.0F;
   }

   // $VF: synthetic method
   public static Class8630 method30434(Class8543 var0) {
      return var0.field38404;
   }

   // $VF: synthetic method
   public static int method30435(Class8543 var0) {
      return var0.field38400;
   }

   // $VF: synthetic method
   public static Class8630 method30436(Class8543 var0) {
      return var0.field38405;
   }

   // $VF: synthetic method
   public static long method30437(Class8543 var0) {
      return var0.field38402;
   }

   // $VF: synthetic method
   public static int method30438(Class8543 var0) {
      return var0.field38401;
   }

   // $VF: synthetic method
   public static long method30439(Class8543 var0) {
      return var0.field38403;
   }
}
