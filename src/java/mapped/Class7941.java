package mapped;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class7941 {
   private int field34121;
   private long field34122;
   private int field34123;
   private long field34124;
   private int field34125;
   private long field34126;
   private int field34127;
   private long field34128;
   private int field34129;
   private long field34130;
   private Class8276 field34131;
   private Class8276 field34132;
   private Class8276 field34133;
   private boolean field34134 = false;
   private boolean field34135 = false;

   public Class7941(long var1, long var3, long var5) {
      if (var1 > 1L && var3 > 1L && var5 > 1L) {
         this.field34121 = (int)var1;
         this.field34123 = (int)var3;
         this.field34125 = (int)var5;
         this.field34122 = var1;
         this.field34124 = var3;
         this.field34126 = var5;
         this.field34127 = (int)(var3 * var5);
         this.field34129 = (int)var5;
         this.field34128 = var3 * var5;
         this.field34130 = var5;
         if (var1 * var3 * var5 >= Class7796.method25894()) {
            this.field34135 = true;
         }

         if (Class7796.method25908(var1) && Class7796.method25908(var3) && Class7796.method25908(var5)) {
            this.field34134 = true;
         }

         Class7796.method25902(var1 * var3 * var5 > (long)Class2373.method9693());
         this.field34131 = new Class8276(var1);
         if (var1 != var3) {
            this.field34132 = new Class8276(var3);
         } else {
            this.field34132 = this.field34131;
         }

         if (var1 != var5) {
            if (var3 != var5) {
               this.field34133 = new Class8276(var5);
            } else {
               this.field34133 = this.field34132;
            }
         } else {
            this.field34133 = this.field34131;
         }
      } else {
         throw new IllegalArgumentException("slices, rows and columns must be greater than 1");
      }
   }

   public void method26745(float[] var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field34134) {
         if (var5 > 1 && this.field34135) {
            this.method26757(-1, var1, var2);
            this.method26760(-1, var1, var2);
         } else {
            this.method26751(-1, var1, var2);
            this.method26754(-1, var1, var2);
         }
      } else if (var5 > 1 && this.field34135 && this.field34121 >= var5 && this.field34123 >= var5 && this.field34125 >= var5) {
         Future[] var20 = new Future[var5];
         int var23 = this.field34121 / var5;

         for (int var27 = 0; var27 < var5; var27++) {
            int var31 = var27 * var23;
            int var37 = var27 == var5 - 1 ? this.field34121 : var31 + var23;
            var20[var27] = Class7008.method21729(new Class1406(this, var31, var37, var1, var2));
         }

         try {
            Class7008.method21730(var20);
         } catch (InterruptedException var16) {
            Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var16);
         } catch (ExecutionException var17) {
            Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var17);
         }

         for (int var28 = 0; var28 < var5; var28++) {
            int var32 = var28 * var23;
            int var38 = var28 == var5 - 1 ? this.field34121 : var32 + var23;
            var20[var28] = Class7008.method21729(new Class1459(this, var32, var38, var1, var2));
         }

         try {
            Class7008.method21730(var20);
         } catch (InterruptedException var14) {
            Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var14);
         } catch (ExecutionException var15) {
            Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var15);
         }

         var23 = this.field34123 / var5;

         for (int var29 = 0; var29 < var5; var29++) {
            int var33 = var29 * var23;
            int var39 = var29 == var5 - 1 ? this.field34123 : var33 + var23;
            var20[var29] = Class7008.method21729(new Class1479(this, var33, var39, var1, var2));
         }

         try {
            Class7008.method21730(var20);
         } catch (InterruptedException var12) {
            Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var12);
         } catch (ExecutionException var13) {
            Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var13);
         }
      } else {
         for (int var6 = 0; var6 < this.field34121; var6++) {
            int var7 = var6 * this.field34127;

            for (int var8 = 0; var8 < this.field34123; var8++) {
               this.field34133.method28926(var1, var7 + var8 * this.field34129, var2);
            }
         }

         float[] var18 = new float[this.field34123];

         for (int var21 = 0; var21 < this.field34121; var21++) {
            int var25 = var21 * this.field34127;

            for (int var9 = 0; var9 < this.field34125; var9++) {
               for (int var10 = 0; var10 < this.field34123; var10++) {
                  int var11 = var25 + var10 * this.field34129 + var9;
                  var18[var10] = var1[var11];
               }

               this.field34132.method28924(var18, var2);

               for (int var34 = 0; var34 < this.field34123; var34++) {
                  int var40 = var25 + var34 * this.field34129 + var9;
                  var1[var40] = var18[var34];
               }
            }
         }

         var18 = new float[this.field34121];

         for (int var22 = 0; var22 < this.field34123; var22++) {
            int var26 = var22 * this.field34129;

            for (int var30 = 0; var30 < this.field34125; var30++) {
               for (int var35 = 0; var35 < this.field34121; var35++) {
                  int var41 = var35 * this.field34127 + var26 + var30;
                  var18[var35] = var1[var41];
               }

               this.field34131.method28924(var18, var2);

               for (int var36 = 0; var36 < this.field34121; var36++) {
                  int var42 = var36 * this.field34127 + var26 + var30;
                  var1[var42] = var18[var36];
               }
            }
         }
      }
   }

   public void method26746(Class2378 var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field34134) {
         if (var5 > 1 && this.field34135) {
            this.method26758(-1, var1, var2);
            this.method26761(-1, var1, var2);
         } else {
            this.method26752(-1, var1, var2);
            this.method26755(-1, var1, var2);
         }
      } else if (var5 > 1 && this.field34135 && this.field34122 >= (long)var5 && this.field34124 >= (long)var5 && this.field34126 >= (long)var5) {
         Future[] var33 = new Future[var5];
         long var35 = this.field34122 / (long)var5;

         for (int var9 = 0; var9 < var5; var9++) {
            long var39 = (long)var9 * var35;
            long var12 = var9 == var5 - 1 ? this.field34122 : var39 + var35;
            var33[var9] = Class7008.method21729(new Class526(this, var39, var12, var1, var2));
         }

         try {
            Class7008.method21730(var33);
         } catch (InterruptedException var30) {
            Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var30);
         } catch (ExecutionException var31) {
            Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var31);
         }

         for (int var37 = 0; var37 < var5; var37++) {
            long var40 = (long)var37 * var35;
            long var42 = var37 == var5 - 1 ? this.field34122 : var40 + var35;
            var33[var37] = Class7008.method21729(new Class536(this, var40, var42, var1, var2));
         }

         try {
            Class7008.method21730(var33);
         } catch (InterruptedException var28) {
            Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var28);
         } catch (ExecutionException var29) {
            Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var29);
         }

         var35 = this.field34124 / (long)var5;

         for (int var38 = 0; var38 < var5; var38++) {
            long var41 = (long)var38 * var35;
            long var43 = var38 == var5 - 1 ? this.field34124 : var41 + var35;
            var33[var38] = Class7008.method21729(new Class508(this, var41, var43, var1, var2));
         }

         try {
            Class7008.method21730(var33);
         } catch (InterruptedException var26) {
            Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var26);
         } catch (ExecutionException var27) {
            Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var27);
         }
      } else {
         for (long var14 = 0L; var14 < this.field34122; var14++) {
            long var16 = var14 * this.field34128;

            for (long var10 = 0L; var10 < this.field34124; var10++) {
               this.field34133.method28927(var1, var16 + var10 * this.field34130, var2);
            }
         }

         Class2378 var6 = new Class2378(this.field34124, false);

         for (long var7 = 0L; var7 < this.field34122; var7++) {
            long var18 = var7 * this.field34128;

            for (long var20 = 0L; var20 < this.field34126; var20++) {
               for (long var22 = 0L; var22 < this.field34124; var22++) {
                  long var24 = var18 + var22 * this.field34130 + var20;
                  var6.method9685(var22, var1.method9651(var24));
               }

               this.field34132.method28925(var6, var2);

               for (long var46 = 0L; var46 < this.field34124; var46++) {
                  long var49 = var18 + var46 * this.field34130 + var20;
                  var1.method9685(var49, var6.method9651(var46));
               }
            }
         }

         var6 = new Class2378(this.field34122, false);

         for (long var34 = 0L; var34 < this.field34124; var34++) {
            long var44 = var34 * this.field34130;

            for (long var45 = 0L; var45 < this.field34126; var45++) {
               for (long var47 = 0L; var47 < this.field34122; var47++) {
                  long var50 = var47 * this.field34128 + var44 + var45;
                  var6.method9685(var47, var1.method9651(var50));
               }

               this.field34131.method28925(var6, var2);

               for (long var48 = 0L; var48 < this.field34122; var48++) {
                  long var51 = var48 * this.field34128 + var44 + var45;
                  var1.method9685(var51, var6.method9651(var48));
               }
            }
         }
      }
   }

   public void method26747(float[][][] var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field34134) {
         if (var5 > 1 && this.field34135) {
            this.method26759(-1, var1, var2);
            this.method26762(-1, var1, var2);
         } else {
            this.method26753(-1, var1, var2);
            this.method26756(-1, var1, var2);
         }
      } else if (var5 > 1 && this.field34135 && this.field34121 >= var5 && this.field34123 >= var5 && this.field34125 >= var5) {
         Future[] var19 = new Future[var5];
         int var22 = this.field34121 / var5;

         for (int var25 = 0; var25 < var5; var25++) {
            int var31 = var25 * var22;
            int var10 = var25 == var5 - 1 ? this.field34121 : var31 + var22;
            var19[var25] = Class7008.method21729(new Class659(this, var31, var10, var1, var2));
         }

         try {
            Class7008.method21730(var19);
         } catch (InterruptedException var15) {
            Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var15);
         } catch (ExecutionException var16) {
            Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var16);
         }

         for (int var26 = 0; var26 < var5; var26++) {
            int var32 = var26 * var22;
            int var34 = var26 == var5 - 1 ? this.field34121 : var32 + var22;
            var19[var26] = Class7008.method21729(new Class1619(this, var32, var34, var1, var2));
         }

         try {
            Class7008.method21730(var19);
         } catch (InterruptedException var13) {
            Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var13);
         } catch (ExecutionException var14) {
            Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var14);
         }

         var22 = this.field34123 / var5;

         for (int var27 = 0; var27 < var5; var27++) {
            int var33 = var27 * var22;
            int var35 = var27 == var5 - 1 ? this.field34123 : var33 + var22;
            var19[var27] = Class7008.method21729(new Class399(this, var33, var35, var1, var2));
         }

         try {
            Class7008.method21730(var19);
         } catch (InterruptedException var11) {
            Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var11);
         } catch (ExecutionException var12) {
            Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var12);
         }
      } else {
         for (int var6 = 0; var6 < this.field34121; var6++) {
            for (int var7 = 0; var7 < this.field34123; var7++) {
               this.field34133.method28924(var1[var6][var7], var2);
            }
         }

         float[] var17 = new float[this.field34123];

         for (int var20 = 0; var20 < this.field34121; var20++) {
            for (int var8 = 0; var8 < this.field34125; var8++) {
               for (int var9 = 0; var9 < this.field34123; var9++) {
                  var17[var9] = var1[var20][var9][var8];
               }

               this.field34132.method28924(var17, var2);

               for (int var28 = 0; var28 < this.field34123; var28++) {
                  var1[var20][var28][var8] = var17[var28];
               }
            }
         }

         var17 = new float[this.field34121];

         for (int var21 = 0; var21 < this.field34123; var21++) {
            for (int var24 = 0; var24 < this.field34125; var24++) {
               for (int var29 = 0; var29 < this.field34121; var29++) {
                  var17[var29] = var1[var29][var21][var24];
               }

               this.field34131.method28924(var17, var2);

               for (int var30 = 0; var30 < this.field34121; var30++) {
                  var1[var30][var21][var24] = var17[var30];
               }
            }
         }
      }
   }

   public void method26748(float[] var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field34134) {
         if (var5 > 1 && this.field34135) {
            this.method26757(1, var1, var2);
            this.method26760(1, var1, var2);
         } else {
            this.method26751(1, var1, var2);
            this.method26754(1, var1, var2);
         }
      } else if (var5 > 1 && this.field34135 && this.field34121 >= var5 && this.field34123 >= var5 && this.field34125 >= var5) {
         Future[] var20 = new Future[var5];
         int var23 = this.field34121 / var5;

         for (int var27 = 0; var27 < var5; var27++) {
            int var31 = var27 * var23;
            int var37 = var27 == var5 - 1 ? this.field34121 : var31 + var23;
            var20[var27] = Class7008.method21729(new Class717(this, var31, var37, var1, var2));
         }

         try {
            Class7008.method21730(var20);
         } catch (InterruptedException var16) {
            Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var16);
         } catch (ExecutionException var17) {
            Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var17);
         }

         for (int var28 = 0; var28 < var5; var28++) {
            int var32 = var28 * var23;
            int var38 = var28 == var5 - 1 ? this.field34121 : var32 + var23;
            var20[var28] = Class7008.method21729(new Class1548(this, var32, var38, var1, var2));
         }

         try {
            Class7008.method21730(var20);
         } catch (InterruptedException var14) {
            Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var14);
         } catch (ExecutionException var15) {
            Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var15);
         }

         var23 = this.field34123 / var5;

         for (int var29 = 0; var29 < var5; var29++) {
            int var33 = var29 * var23;
            int var39 = var29 == var5 - 1 ? this.field34123 : var33 + var23;
            var20[var29] = Class7008.method21729(new Class433(this, var33, var39, var1, var2));
         }

         try {
            Class7008.method21730(var20);
         } catch (InterruptedException var12) {
            Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var12);
         } catch (ExecutionException var13) {
            Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var13);
         }
      } else {
         for (int var6 = 0; var6 < this.field34121; var6++) {
            int var7 = var6 * this.field34127;

            for (int var8 = 0; var8 < this.field34123; var8++) {
               this.field34133.method28930(var1, var7 + var8 * this.field34129, var2);
            }
         }

         float[] var18 = new float[this.field34123];

         for (int var21 = 0; var21 < this.field34121; var21++) {
            int var25 = var21 * this.field34127;

            for (int var9 = 0; var9 < this.field34125; var9++) {
               for (int var10 = 0; var10 < this.field34123; var10++) {
                  int var11 = var25 + var10 * this.field34129 + var9;
                  var18[var10] = var1[var11];
               }

               this.field34132.method28928(var18, var2);

               for (int var34 = 0; var34 < this.field34123; var34++) {
                  int var40 = var25 + var34 * this.field34129 + var9;
                  var1[var40] = var18[var34];
               }
            }
         }

         var18 = new float[this.field34121];

         for (int var22 = 0; var22 < this.field34123; var22++) {
            int var26 = var22 * this.field34129;

            for (int var30 = 0; var30 < this.field34125; var30++) {
               for (int var35 = 0; var35 < this.field34121; var35++) {
                  int var41 = var35 * this.field34127 + var26 + var30;
                  var18[var35] = var1[var41];
               }

               this.field34131.method28928(var18, var2);

               for (int var36 = 0; var36 < this.field34121; var36++) {
                  int var42 = var36 * this.field34127 + var26 + var30;
                  var1[var42] = var18[var36];
               }
            }
         }
      }
   }

   public void method26749(Class2378 var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field34134) {
         if (var5 > 1 && this.field34135) {
            this.method26758(1, var1, var2);
            this.method26761(1, var1, var2);
         } else {
            this.method26752(1, var1, var2);
            this.method26755(1, var1, var2);
         }
      } else if (var5 > 1 && this.field34135 && this.field34122 >= (long)var5 && this.field34124 >= (long)var5 && this.field34126 >= (long)var5) {
         Future[] var33 = new Future[var5];
         long var35 = this.field34122 / (long)var5;

         for (int var9 = 0; var9 < var5; var9++) {
            long var39 = (long)var9 * var35;
            long var12 = var9 == var5 - 1 ? this.field34122 : var39 + var35;
            var33[var9] = Class7008.method21729(new Class422(this, var39, var12, var1, var2));
         }

         try {
            Class7008.method21730(var33);
         } catch (InterruptedException var30) {
            Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var30);
         } catch (ExecutionException var31) {
            Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var31);
         }

         for (int var37 = 0; var37 < var5; var37++) {
            long var40 = (long)var37 * var35;
            long var42 = var37 == var5 - 1 ? this.field34122 : var40 + var35;
            var33[var37] = Class7008.method21729(new Class1381(this, var40, var42, var1, var2));
         }

         try {
            Class7008.method21730(var33);
         } catch (InterruptedException var28) {
            Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var28);
         } catch (ExecutionException var29) {
            Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var29);
         }

         var35 = this.field34124 / (long)var5;

         for (int var38 = 0; var38 < var5; var38++) {
            long var41 = (long)var38 * var35;
            long var43 = var38 == var5 - 1 ? this.field34124 : var41 + var35;
            var33[var38] = Class7008.method21729(new Class395(this, var41, var43, var1, var2));
         }

         try {
            Class7008.method21730(var33);
         } catch (InterruptedException var26) {
            Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var26);
         } catch (ExecutionException var27) {
            Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var27);
         }
      } else {
         for (long var14 = 0L; var14 < this.field34122; var14++) {
            long var16 = var14 * (long)this.field34127;

            for (long var10 = 0L; var10 < this.field34124; var10++) {
               this.field34133.method28931(var1, var16 + var10 * (long)this.field34129, var2);
            }
         }

         Class2378 var6 = new Class2378(this.field34124, false);

         for (long var7 = 0L; var7 < this.field34122; var7++) {
            long var18 = var7 * (long)this.field34127;

            for (long var20 = 0L; var20 < this.field34126; var20++) {
               for (long var22 = 0L; var22 < this.field34124; var22++) {
                  long var24 = var18 + var22 * (long)this.field34129 + var20;
                  var6.method9685(var22, var1.method9651(var24));
               }

               this.field34132.method28929(var6, var2);

               for (long var46 = 0L; var46 < this.field34124; var46++) {
                  long var49 = var18 + var46 * (long)this.field34129 + var20;
                  var1.method9685(var49, var6.method9651(var46));
               }
            }
         }

         var6 = new Class2378(this.field34122, false);

         for (long var34 = 0L; var34 < this.field34124; var34++) {
            long var44 = var34 * (long)this.field34129;

            for (long var45 = 0L; var45 < this.field34126; var45++) {
               for (long var47 = 0L; var47 < this.field34122; var47++) {
                  long var50 = var47 * (long)this.field34127 + var44 + var45;
                  var6.method9685(var47, var1.method9651(var50));
               }

               this.field34131.method28929(var6, var2);

               for (long var48 = 0L; var48 < this.field34122; var48++) {
                  long var51 = var48 * (long)this.field34127 + var44 + var45;
                  var1.method9685(var51, var6.method9651(var48));
               }
            }
         }
      }
   }

   public void method26750(float[][][] var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field34134) {
         if (var5 > 1 && this.field34135) {
            this.method26759(1, var1, var2);
            this.method26762(1, var1, var2);
         } else {
            this.method26753(1, var1, var2);
            this.method26756(1, var1, var2);
         }
      } else if (var5 > 1 && this.field34135 && this.field34121 >= var5 && this.field34123 >= var5 && this.field34125 >= var5) {
         Future[] var19 = new Future[var5];
         int var22 = this.field34121 / var5;

         for (int var25 = 0; var25 < var5; var25++) {
            int var31 = var25 * var22;
            int var10 = var25 == var5 - 1 ? this.field34121 : var31 + var22;
            var19[var25] = Class7008.method21729(new Class574(this, var31, var10, var1, var2));
         }

         try {
            Class7008.method21730(var19);
         } catch (InterruptedException var15) {
            Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var15);
         } catch (ExecutionException var16) {
            Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var16);
         }

         for (int var26 = 0; var26 < var5; var26++) {
            int var32 = var26 * var22;
            int var34 = var26 == var5 - 1 ? this.field34121 : var32 + var22;
            var19[var26] = Class7008.method21729(new Class1354(this, var32, var34, var1, var2));
         }

         try {
            Class7008.method21730(var19);
         } catch (InterruptedException var13) {
            Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var13);
         } catch (ExecutionException var14) {
            Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var14);
         }

         var22 = this.field34123 / var5;

         for (int var27 = 0; var27 < var5; var27++) {
            int var33 = var27 * var22;
            int var35 = var27 == var5 - 1 ? this.field34123 : var33 + var22;
            var19[var27] = Class7008.method21729(new Class1380(this, var33, var35, var1, var2));
         }

         try {
            Class7008.method21730(var19);
         } catch (InterruptedException var11) {
            Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var11);
         } catch (ExecutionException var12) {
            Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var12);
         }
      } else {
         for (int var6 = 0; var6 < this.field34121; var6++) {
            for (int var7 = 0; var7 < this.field34123; var7++) {
               this.field34133.method28928(var1[var6][var7], var2);
            }
         }

         float[] var17 = new float[this.field34123];

         for (int var20 = 0; var20 < this.field34121; var20++) {
            for (int var8 = 0; var8 < this.field34125; var8++) {
               for (int var9 = 0; var9 < this.field34123; var9++) {
                  var17[var9] = var1[var20][var9][var8];
               }

               this.field34132.method28928(var17, var2);

               for (int var28 = 0; var28 < this.field34123; var28++) {
                  var1[var20][var28][var8] = var17[var28];
               }
            }
         }

         var17 = new float[this.field34121];

         for (int var21 = 0; var21 < this.field34123; var21++) {
            for (int var24 = 0; var24 < this.field34125; var24++) {
               for (int var29 = 0; var29 < this.field34121; var29++) {
                  var17[var29] = var1[var29][var21][var24];
               }

               this.field34131.method28928(var17, var2);

               for (int var30 = 0; var30 < this.field34121; var30++) {
                  var1[var30][var21][var24] = var17[var30];
               }
            }
         }
      }
   }

   private void method26751(int var1, float[] var2, boolean var3) {
      int var6 = 4 * this.field34123;
      if (this.field34125 == 2) {
         var6 >>= 1;
      }

      float[] var7 = new float[var6];
      if (var1 != -1) {
         for (int var8 = 0; var8 < this.field34121; var8++) {
            int var9 = var8 * this.field34127;

            for (int var10 = 0; var10 < this.field34123; var10++) {
               this.field34133.method28930(var2, var9 + var10 * this.field34129, var3);
            }

            if (this.field34125 <= 2) {
               if (this.field34125 == 2) {
                  for (int var17 = 0; var17 < this.field34123; var17++) {
                     int var27 = var9 + var17 * this.field34129;
                     var7[var17] = var2[var27];
                     var7[this.field34123 + var17] = var2[var27 + 1];
                  }

                  this.field34132.method28930(var7, 0, var3);
                  this.field34132.method28930(var7, this.field34123, var3);

                  for (int var18 = 0; var18 < this.field34123; var18++) {
                     int var28 = var9 + var18 * this.field34129;
                     var2[var28] = var7[var18];
                     var2[var28 + 1] = var7[this.field34123 + var18];
                  }
               }
            } else {
               for (int var16 = 0; var16 < this.field34125; var16 += 4) {
                  for (int var11 = 0; var11 < this.field34123; var11++) {
                     int var12 = var9 + var11 * this.field34129 + var16;
                     int var13 = this.field34123 + var11;
                     var7[var11] = var2[var12];
                     var7[var13] = var2[var12 + 1];
                     var7[var13 + this.field34123] = var2[var12 + 2];
                     var7[var13 + 2 * this.field34123] = var2[var12 + 3];
                  }

                  this.field34132.method28930(var7, 0, var3);
                  this.field34132.method28930(var7, this.field34123, var3);
                  this.field34132.method28930(var7, 2 * this.field34123, var3);
                  this.field34132.method28930(var7, 3 * this.field34123, var3);

                  for (int var23 = 0; var23 < this.field34123; var23++) {
                     int var26 = var9 + var23 * this.field34129 + var16;
                     int var33 = this.field34123 + var23;
                     var2[var26] = var7[var23];
                     var2[var26 + 1] = var7[var33];
                     var2[var26 + 2] = var7[var33 + this.field34123];
                     var2[var26 + 3] = var7[var33 + 2 * this.field34123];
                  }
               }
            }
         }
      } else {
         for (int var14 = 0; var14 < this.field34121; var14++) {
            int var15 = var14 * this.field34127;

            for (int var19 = 0; var19 < this.field34123; var19++) {
               this.field34133.method28926(var2, var15 + var19 * this.field34129, var3);
            }

            if (this.field34125 <= 2) {
               if (this.field34125 == 2) {
                  for (int var21 = 0; var21 < this.field34123; var21++) {
                     int var31 = var15 + var21 * this.field34129;
                     var7[var21] = var2[var31];
                     var7[this.field34123 + var21] = var2[var31 + 1];
                  }

                  this.field34132.method28926(var7, 0, var3);
                  this.field34132.method28926(var7, this.field34123, var3);

                  for (int var22 = 0; var22 < this.field34123; var22++) {
                     int var32 = var15 + var22 * this.field34129;
                     var2[var32] = var7[var22];
                     var2[var32 + 1] = var7[this.field34123 + var22];
                  }
               }
            } else {
               for (int var20 = 0; var20 < this.field34125; var20 += 4) {
                  for (int var24 = 0; var24 < this.field34123; var24++) {
                     int var29 = var15 + var24 * this.field34129 + var20;
                     int var34 = this.field34123 + var24;
                     var7[var24] = var2[var29];
                     var7[var34] = var2[var29 + 1];
                     var7[var34 + this.field34123] = var2[var29 + 2];
                     var7[var34 + 2 * this.field34123] = var2[var29 + 3];
                  }

                  this.field34132.method28926(var7, 0, var3);
                  this.field34132.method28926(var7, this.field34123, var3);
                  this.field34132.method28926(var7, 2 * this.field34123, var3);
                  this.field34132.method28926(var7, 3 * this.field34123, var3);

                  for (int var25 = 0; var25 < this.field34123; var25++) {
                     int var30 = var15 + var25 * this.field34129 + var20;
                     int var35 = this.field34123 + var25;
                     var2[var30] = var7[var25];
                     var2[var30 + 1] = var7[var35];
                     var2[var30 + 2] = var7[var35 + this.field34123];
                     var2[var30 + 3] = var7[var35 + 2 * this.field34123];
                  }
               }
            }
         }
      }
   }

   private void method26752(int var1, Class2378 var2, boolean var3) {
      long var6 = 4L * this.field34124;
      if (this.field34126 == 2L) {
         var6 >>= 1;
      }

      Class2378 var8 = new Class2378(var6);
      if (var1 != -1) {
         for (long var9 = 0L; var9 < this.field34122; var9++) {
            long var11 = var9 * this.field34128;

            for (long var13 = 0L; var13 < this.field34124; var13++) {
               this.field34133.method28931(var2, var11 + var13 * this.field34130, var3);
            }

            if (this.field34126 <= 2L) {
               if (this.field34126 == 2L) {
                  for (long var24 = 0L; var24 < this.field34124; var24++) {
                     long var34 = var11 + var24 * this.field34130;
                     var8.method9685(var24, var2.method9651(var34));
                     var8.method9685(this.field34124 + var24, var2.method9651(var34 + 1L));
                  }

                  this.field34132.method28931(var8, 0L, var3);
                  this.field34132.method28931(var8, this.field34124, var3);

                  for (long var25 = 0L; var25 < this.field34124; var25++) {
                     long var35 = var11 + var25 * this.field34130;
                     var2.method9685(var35, var8.method9651(var25));
                     var2.method9685(var35 + 1L, var8.method9651(this.field34124 + var25));
                  }
               }
            } else {
               for (long var23 = 0L; var23 < this.field34126; var23 += 4L) {
                  for (long var15 = 0L; var15 < this.field34124; var15++) {
                     long var17 = var11 + var15 * this.field34130 + var23;
                     long var19 = this.field34124 + var15;
                     var8.method9685(var15, var2.method9651(var17));
                     var8.method9685(var19, var2.method9651(var17 + 1L));
                     var8.method9685(var19 + this.field34124, var2.method9651(var17 + 2L));
                     var8.method9685(var19 + 2L * this.field34124, var2.method9651(var17 + 3L));
                  }

                  this.field34132.method28931(var8, 0L, var3);
                  this.field34132.method28931(var8, this.field34124, var3);
                  this.field34132.method28931(var8, 2L * this.field34124, var3);
                  this.field34132.method28931(var8, 3L * this.field34124, var3);

                  for (long var30 = 0L; var30 < this.field34124; var30++) {
                     long var33 = var11 + var30 * this.field34130 + var23;
                     long var40 = this.field34124 + var30;
                     var2.method9685(var33, var8.method9651(var30));
                     var2.method9685(var33 + 1L, var8.method9651(var40));
                     var2.method9685(var33 + 2L, var8.method9651(var40 + this.field34124));
                     var2.method9685(var33 + 3L, var8.method9651(var40 + 2L * this.field34124));
                  }
               }
            }
         }
      } else {
         for (long var21 = 0L; var21 < this.field34122; var21++) {
            long var22 = var21 * this.field34128;

            for (long var26 = 0L; var26 < this.field34124; var26++) {
               this.field34133.method28927(var2, var22 + var26 * (long)this.field34129, var3);
            }

            if (this.field34126 <= 2L) {
               if (this.field34126 == 2L) {
                  for (long var28 = 0L; var28 < this.field34124; var28++) {
                     long var38 = var22 + var28 * this.field34130;
                     var8.method9685(var28, var2.method9651(var38));
                     var8.method9685(this.field34124 + var28, var2.method9651(var38 + 1L));
                  }

                  this.field34132.method28927(var8, 0L, var3);
                  this.field34132.method28927(var8, this.field34124, var3);

                  for (long var29 = 0L; var29 < this.field34124; var29++) {
                     long var39 = var22 + var29 * this.field34130;
                     var2.method9685(var39, var8.method9651(var29));
                     var2.method9685(var39 + 1L, var8.method9651(this.field34124 + var29));
                  }
               }
            } else {
               for (long var27 = 0L; var27 < this.field34126; var27 += 4L) {
                  for (long var31 = 0L; var31 < this.field34124; var31++) {
                     long var36 = var22 + var31 * this.field34130 + var27;
                     long var41 = this.field34124 + var31;
                     var8.method9685(var31, var2.method9651(var36));
                     var8.method9685(var41, var2.method9651(var36 + 1L));
                     var8.method9685(var41 + this.field34124, var2.method9651(var36 + 2L));
                     var8.method9685(var41 + 2L * this.field34124, var2.method9651(var36 + 3L));
                  }

                  this.field34132.method28927(var8, 0L, var3);
                  this.field34132.method28927(var8, this.field34124, var3);
                  this.field34132.method28927(var8, 2L * this.field34124, var3);
                  this.field34132.method28927(var8, 3L * this.field34124, var3);

                  for (long var32 = 0L; var32 < this.field34124; var32++) {
                     long var37 = var22 + var32 * this.field34130 + var27;
                     long var42 = this.field34124 + var32;
                     var2.method9685(var37, var8.method9651(var32));
                     var2.method9685(var37 + 1L, var8.method9651(var42));
                     var2.method9685(var37 + 2L, var8.method9651(var42 + this.field34124));
                     var2.method9685(var37 + 3L, var8.method9651(var42 + 2L * this.field34124));
                  }
               }
            }
         }
      }
   }

   private void method26753(int var1, float[][][] var2, boolean var3) {
      int var6 = 4 * this.field34123;
      if (this.field34125 == 2) {
         var6 >>= 1;
      }

      float[] var7 = new float[var6];
      if (var1 != -1) {
         for (int var8 = 0; var8 < this.field34121; var8++) {
            for (int var9 = 0; var9 < this.field34123; var9++) {
               this.field34133.method28928(var2[var8][var9], var3);
            }

            if (this.field34125 <= 2) {
               if (this.field34125 == 2) {
                  for (int var14 = 0; var14 < this.field34123; var14++) {
                     var7[var14] = var2[var8][var14][0];
                     var7[this.field34123 + var14] = var2[var8][var14][1];
                  }

                  this.field34132.method28930(var7, 0, var3);
                  this.field34132.method28930(var7, this.field34123, var3);

                  for (int var15 = 0; var15 < this.field34123; var15++) {
                     var2[var8][var15][0] = var7[var15];
                     var2[var8][var15][1] = var7[this.field34123 + var15];
                  }
               }
            } else {
               for (int var13 = 0; var13 < this.field34125; var13 += 4) {
                  for (int var10 = 0; var10 < this.field34123; var10++) {
                     int var11 = this.field34123 + var10;
                     var7[var10] = var2[var8][var10][var13];
                     var7[var11] = var2[var8][var10][var13 + 1];
                     var7[var11 + this.field34123] = var2[var8][var10][var13 + 2];
                     var7[var11 + 2 * this.field34123] = var2[var8][var10][var13 + 3];
                  }

                  this.field34132.method28930(var7, 0, var3);
                  this.field34132.method28930(var7, this.field34123, var3);
                  this.field34132.method28930(var7, 2 * this.field34123, var3);
                  this.field34132.method28930(var7, 3 * this.field34123, var3);

                  for (int var20 = 0; var20 < this.field34123; var20++) {
                     int var23 = this.field34123 + var20;
                     var2[var8][var20][var13] = var7[var20];
                     var2[var8][var20][var13 + 1] = var7[var23];
                     var2[var8][var20][var13 + 2] = var7[var23 + this.field34123];
                     var2[var8][var20][var13 + 3] = var7[var23 + 2 * this.field34123];
                  }
               }
            }
         }
      } else {
         for (int var12 = 0; var12 < this.field34121; var12++) {
            for (int var16 = 0; var16 < this.field34123; var16++) {
               this.field34133.method28924(var2[var12][var16], var3);
            }

            if (this.field34125 <= 2) {
               if (this.field34125 == 2) {
                  for (int var18 = 0; var18 < this.field34123; var18++) {
                     var7[var18] = var2[var12][var18][0];
                     var7[this.field34123 + var18] = var2[var12][var18][1];
                  }

                  this.field34132.method28926(var7, 0, var3);
                  this.field34132.method28926(var7, this.field34123, var3);

                  for (int var19 = 0; var19 < this.field34123; var19++) {
                     var2[var12][var19][0] = var7[var19];
                     var2[var12][var19][1] = var7[this.field34123 + var19];
                  }
               }
            } else {
               for (int var17 = 0; var17 < this.field34125; var17 += 4) {
                  for (int var21 = 0; var21 < this.field34123; var21++) {
                     int var24 = this.field34123 + var21;
                     var7[var21] = var2[var12][var21][var17];
                     var7[var24] = var2[var12][var21][var17 + 1];
                     var7[var24 + this.field34123] = var2[var12][var21][var17 + 2];
                     var7[var24 + 2 * this.field34123] = var2[var12][var21][var17 + 3];
                  }

                  this.field34132.method28926(var7, 0, var3);
                  this.field34132.method28926(var7, this.field34123, var3);
                  this.field34132.method28926(var7, 2 * this.field34123, var3);
                  this.field34132.method28926(var7, 3 * this.field34123, var3);

                  for (int var22 = 0; var22 < this.field34123; var22++) {
                     int var25 = this.field34123 + var22;
                     var2[var12][var22][var17] = var7[var22];
                     var2[var12][var22][var17 + 1] = var7[var25];
                     var2[var12][var22][var17 + 2] = var7[var25 + this.field34123];
                     var2[var12][var22][var17 + 3] = var7[var25 + 2 * this.field34123];
                  }
               }
            }
         }
      }
   }

   private void method26754(int var1, float[] var2, boolean var3) {
      int var6 = 4 * this.field34121;
      if (this.field34125 == 2) {
         var6 >>= 1;
      }

      float[] var7 = new float[var6];
      if (var1 != -1) {
         if (this.field34125 <= 2) {
            if (this.field34125 == 2) {
               for (int var8 = 0; var8 < this.field34123; var8++) {
                  int var9 = var8 * this.field34129;

                  for (int var10 = 0; var10 < this.field34121; var10++) {
                     int var12 = var10 * this.field34127 + var9;
                     var7[var10] = var2[var12];
                     var7[this.field34121 + var10] = var2[var12 + 1];
                  }

                  this.field34131.method28930(var7, 0, var3);
                  this.field34131.method28930(var7, this.field34121, var3);

                  for (int var20 = 0; var20 < this.field34121; var20++) {
                     int var28 = var20 * this.field34127 + var9;
                     var2[var28] = var7[var20];
                     var2[var28 + 1] = var7[this.field34121 + var20];
                  }
               }
            }
         } else {
            for (int var14 = 0; var14 < this.field34123; var14++) {
               int var17 = var14 * this.field34129;

               for (int var21 = 0; var21 < this.field34125; var21 += 4) {
                  for (int var11 = 0; var11 < this.field34121; var11++) {
                     int var29 = var11 * this.field34127 + var17 + var21;
                     int var13 = this.field34121 + var11;
                     var7[var11] = var2[var29];
                     var7[var13] = var2[var29 + 1];
                     var7[var13 + this.field34121] = var2[var29 + 2];
                     var7[var13 + 2 * this.field34121] = var2[var29 + 3];
                  }

                  this.field34131.method28930(var7, 0, var3);
                  this.field34131.method28930(var7, this.field34121, var3);
                  this.field34131.method28930(var7, 2 * this.field34121, var3);
                  this.field34131.method28930(var7, 3 * this.field34121, var3);

                  for (int var25 = 0; var25 < this.field34121; var25++) {
                     int var30 = var25 * this.field34127 + var17 + var21;
                     int var35 = this.field34121 + var25;
                     var2[var30] = var7[var25];
                     var2[var30 + 1] = var7[var35];
                     var2[var30 + 2] = var7[var35 + this.field34121];
                     var2[var30 + 3] = var7[var35 + 2 * this.field34121];
                  }
               }
            }
         }
      } else if (this.field34125 <= 2) {
         if (this.field34125 == 2) {
            for (int var15 = 0; var15 < this.field34123; var15++) {
               int var18 = var15 * this.field34129;

               for (int var22 = 0; var22 < this.field34121; var22++) {
                  int var31 = var22 * this.field34127 + var18;
                  var7[var22] = var2[var31];
                  var7[this.field34121 + var22] = var2[var31 + 1];
               }

               this.field34131.method28926(var7, 0, var3);
               this.field34131.method28926(var7, this.field34121, var3);

               for (int var23 = 0; var23 < this.field34121; var23++) {
                  int var32 = var23 * this.field34127 + var18;
                  var2[var32] = var7[var23];
                  var2[var32 + 1] = var7[this.field34121 + var23];
               }
            }
         }
      } else {
         for (int var16 = 0; var16 < this.field34123; var16++) {
            int var19 = var16 * this.field34129;

            for (int var24 = 0; var24 < this.field34125; var24 += 4) {
               for (int var26 = 0; var26 < this.field34121; var26++) {
                  int var33 = var26 * this.field34127 + var19 + var24;
                  int var36 = this.field34121 + var26;
                  var7[var26] = var2[var33];
                  var7[var36] = var2[var33 + 1];
                  var7[var36 + this.field34121] = var2[var33 + 2];
                  var7[var36 + 2 * this.field34121] = var2[var33 + 3];
               }

               this.field34131.method28926(var7, 0, var3);
               this.field34131.method28926(var7, this.field34121, var3);
               this.field34131.method28926(var7, 2 * this.field34121, var3);
               this.field34131.method28926(var7, 3 * this.field34121, var3);

               for (int var27 = 0; var27 < this.field34121; var27++) {
                  int var34 = var27 * this.field34127 + var19 + var24;
                  int var37 = this.field34121 + var27;
                  var2[var34] = var7[var27];
                  var2[var34 + 1] = var7[var37];
                  var2[var34 + 2] = var7[var37 + this.field34121];
                  var2[var34 + 3] = var7[var37 + 2 * this.field34121];
               }
            }
         }
      }
   }

   private void method26755(int var1, Class2378 var2, boolean var3) {
      long var6 = 4L * this.field34122;
      if (this.field34126 == 2L) {
         var6 >>= 1;
      }

      Class2378 var8 = new Class2378(var6);
      if (var1 != -1) {
         if (this.field34126 <= 2L) {
            if (this.field34126 == 2L) {
               for (long var9 = 0L; var9 < this.field34124; var9++) {
                  long var11 = var9 * this.field34130;

                  for (long var13 = 0L; var13 < this.field34122; var13++) {
                     long var17 = var13 * this.field34128 + var11;
                     var8.method9685(var13, var2.method9651(var17));
                     var8.method9685(this.field34122 + var13, var2.method9651(var17 + 1L));
                  }

                  this.field34131.method28931(var8, 0L, var3);
                  this.field34131.method28931(var8, this.field34122, var3);

                  for (long var27 = 0L; var27 < this.field34122; var27++) {
                     long var35 = var27 * this.field34128 + var11;
                     var2.method9685(var35, var8.method9651(var27));
                     var2.method9685(var35 + 1L, var8.method9651(this.field34122 + var27));
                  }
               }
            }
         } else {
            for (long var21 = 0L; var21 < this.field34124; var21++) {
               long var24 = var21 * this.field34130;

               for (long var28 = 0L; var28 < this.field34126; var28 += 4L) {
                  for (long var15 = 0L; var15 < this.field34122; var15++) {
                     long var36 = var15 * this.field34128 + var24 + var28;
                     long var19 = this.field34122 + var15;
                     var8.method9685(var15, var2.method9651(var36));
                     var8.method9685(var19, var2.method9651(var36 + 1L));
                     var8.method9685(var19 + this.field34122, var2.method9651(var36 + 2L));
                     var8.method9685(var19 + 2L * this.field34122, var2.method9651(var36 + 3L));
                  }

                  this.field34131.method28931(var8, 0L, var3);
                  this.field34131.method28931(var8, this.field34122, var3);
                  this.field34131.method28931(var8, 2L * this.field34122, var3);
                  this.field34131.method28931(var8, 3L * this.field34122, var3);

                  for (long var32 = 0L; var32 < this.field34122; var32++) {
                     long var37 = var32 * this.field34128 + var24 + var28;
                     long var42 = this.field34122 + var32;
                     var2.method9685(var37, var8.method9651(var32));
                     var2.method9685(var37 + 1L, var8.method9651(var42));
                     var2.method9685(var37 + 2L, var8.method9651(var42 + this.field34122));
                     var2.method9685(var37 + 3L, var8.method9651(var42 + 2L * this.field34122));
                  }
               }
            }
         }
      } else if (this.field34126 <= 2L) {
         if (this.field34126 == 2L) {
            for (long var22 = 0L; var22 < this.field34124; var22++) {
               long var25 = var22 * this.field34130;

               for (long var29 = 0L; var29 < this.field34122; var29++) {
                  long var38 = var29 * this.field34128 + var25;
                  var8.method9685(var29, var2.method9651(var38));
                  var8.method9685(this.field34122 + var29, var2.method9651(var38 + 1L));
               }

               this.field34131.method28927(var8, 0L, var3);
               this.field34131.method28927(var8, this.field34122, var3);

               for (long var30 = 0L; var30 < this.field34122; var30++) {
                  long var39 = var30 * this.field34128 + var25;
                  var2.method9685(var39, var8.method9651(var30));
                  var2.method9685(var39 + 1L, var8.method9651(this.field34122 + var30));
               }
            }
         }
      } else {
         for (long var23 = 0L; var23 < this.field34124; var23++) {
            long var26 = var23 * this.field34130;

            for (long var31 = 0L; var31 < this.field34126; var31 += 4L) {
               for (long var33 = 0L; var33 < this.field34122; var33++) {
                  long var40 = var33 * this.field34128 + var26 + var31;
                  long var43 = this.field34122 + var33;
                  var8.method9685(var33, var2.method9651(var40));
                  var8.method9685(var43, var2.method9651(var40 + 1L));
                  var8.method9685(var43 + this.field34122, var2.method9651(var40 + 2L));
                  var8.method9685(var43 + 2L * this.field34122, var2.method9651(var40 + 3L));
               }

               this.field34131.method28927(var8, 0L, var3);
               this.field34131.method28927(var8, this.field34122, var3);
               this.field34131.method28927(var8, 2L * this.field34122, var3);
               this.field34131.method28927(var8, 3L * this.field34122, var3);

               for (long var34 = 0L; var34 < this.field34122; var34++) {
                  long var41 = var34 * this.field34128 + var26 + var31;
                  long var44 = this.field34122 + var34;
                  var2.method9685(var41, var8.method9651(var34));
                  var2.method9685(var41 + 1L, var8.method9651(var44));
                  var2.method9685(var41 + 2L, var8.method9651(var44 + this.field34122));
                  var2.method9685(var41 + 3L, var8.method9651(var44 + 2L * this.field34122));
               }
            }
         }
      }
   }

   private void method26756(int var1, float[][][] var2, boolean var3) {
      int var6 = 4 * this.field34121;
      if (this.field34125 == 2) {
         var6 >>= 1;
      }

      float[] var7 = new float[var6];
      if (var1 != -1) {
         if (this.field34125 <= 2) {
            if (this.field34125 == 2) {
               for (int var8 = 0; var8 < this.field34123; var8++) {
                  for (int var9 = 0; var9 < this.field34121; var9++) {
                     var7[var9] = var2[var9][var8][0];
                     var7[this.field34121 + var9] = var2[var9][var8][1];
                  }

                  this.field34131.method28930(var7, 0, var3);
                  this.field34131.method28930(var7, this.field34121, var3);

                  for (int var15 = 0; var15 < this.field34121; var15++) {
                     var2[var15][var8][0] = var7[var15];
                     var2[var15][var8][1] = var7[this.field34121 + var15];
                  }
               }
            }
         } else {
            for (int var12 = 0; var12 < this.field34123; var12++) {
               for (int var16 = 0; var16 < this.field34125; var16 += 4) {
                  for (int var10 = 0; var10 < this.field34121; var10++) {
                     int var11 = this.field34121 + var10;
                     var7[var10] = var2[var10][var12][var16];
                     var7[var11] = var2[var10][var12][var16 + 1];
                     var7[var11 + this.field34121] = var2[var10][var12][var16 + 2];
                     var7[var11 + 2 * this.field34121] = var2[var10][var12][var16 + 3];
                  }

                  this.field34131.method28930(var7, 0, var3);
                  this.field34131.method28930(var7, this.field34121, var3);
                  this.field34131.method28930(var7, 2 * this.field34121, var3);
                  this.field34131.method28930(var7, 3 * this.field34121, var3);

                  for (int var20 = 0; var20 < this.field34121; var20++) {
                     int var23 = this.field34121 + var20;
                     var2[var20][var12][var16] = var7[var20];
                     var2[var20][var12][var16 + 1] = var7[var23];
                     var2[var20][var12][var16 + 2] = var7[var23 + this.field34121];
                     var2[var20][var12][var16 + 3] = var7[var23 + 2 * this.field34121];
                  }
               }
            }
         }
      } else if (this.field34125 <= 2) {
         if (this.field34125 == 2) {
            for (int var13 = 0; var13 < this.field34123; var13++) {
               for (int var17 = 0; var17 < this.field34121; var17++) {
                  var7[var17] = var2[var17][var13][0];
                  var7[this.field34121 + var17] = var2[var17][var13][1];
               }

               this.field34131.method28926(var7, 0, var3);
               this.field34131.method28926(var7, this.field34121, var3);

               for (int var18 = 0; var18 < this.field34121; var18++) {
                  var2[var18][var13][0] = var7[var18];
                  var2[var18][var13][1] = var7[this.field34121 + var18];
               }
            }
         }
      } else {
         for (int var14 = 0; var14 < this.field34123; var14++) {
            for (int var19 = 0; var19 < this.field34125; var19 += 4) {
               for (int var21 = 0; var21 < this.field34121; var21++) {
                  int var24 = this.field34121 + var21;
                  var7[var21] = var2[var21][var14][var19];
                  var7[var24] = var2[var21][var14][var19 + 1];
                  var7[var24 + this.field34121] = var2[var21][var14][var19 + 2];
                  var7[var24 + 2 * this.field34121] = var2[var21][var14][var19 + 3];
               }

               this.field34131.method28926(var7, 0, var3);
               this.field34131.method28926(var7, this.field34121, var3);
               this.field34131.method28926(var7, 2 * this.field34121, var3);
               this.field34131.method28926(var7, 3 * this.field34121, var3);

               for (int var22 = 0; var22 < this.field34121; var22++) {
                  int var25 = this.field34121 + var22;
                  var2[var22][var14][var19] = var7[var22];
                  var2[var22][var14][var19 + 1] = var7[var25];
                  var2[var22][var14][var19 + 2] = var7[var25 + this.field34121];
                  var2[var22][var14][var19 + 3] = var7[var25 + 2 * this.field34121];
               }
            }
         }
      }
   }

   private void method26757(int var1, float[] var2, boolean var3) {
      int var6 = Class7008.method21726() > this.field34121 ? this.field34121 : Class7008.method21726();
      int var7 = 4 * this.field34123;
      if (this.field34125 == 2) {
         var7 >>= 1;
      }

      int var8 = var7;
      Future[] var9 = new Future[var6];

      for (int var10 = 0; var10 < var6; var10++) {
         var9[var10] = Class7008.method21729(new Class1365(this, var8, var1, var10, var6, var2, var3));
      }

      try {
         Class7008.method21730(var9);
      } catch (InterruptedException var12) {
         Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var12);
      } catch (ExecutionException var13) {
         Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var13);
      }
   }

   private void method26758(int var1, Class2378 var2, boolean var3) {
      int var6 = (int)((long)Class7008.method21726() > this.field34122 ? this.field34122 : (long)Class7008.method21726());
      long var7 = 4L * this.field34124;
      if (this.field34126 == 2L) {
         var7 >>= 1;
      }

      long var9 = var7;
      Future[] var11 = new Future[var6];

      for (int var12 = 0; var12 < var6; var12++) {
         long var13 = (long)var12;
         var11[var12] = Class7008.method21729(new Class565(this, var9, var1, var13, var6, var2, var3));
      }

      try {
         Class7008.method21730(var11);
      } catch (InterruptedException var15) {
         Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var15);
      } catch (ExecutionException var16) {
         Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var16);
      }
   }

   private void method26759(int var1, float[][][] var2, boolean var3) {
      int var6 = Class7008.method21726() > this.field34121 ? this.field34121 : Class7008.method21726();
      int var7 = 4 * this.field34123;
      if (this.field34125 == 2) {
         var7 >>= 1;
      }

      int var8 = var7;
      Future[] var9 = new Future[var6];

      for (int var10 = 0; var10 < var6; var10++) {
         var9[var10] = Class7008.method21729(new Class463(this, var8, var1, var10, var6, var2, var3));
      }

      try {
         Class7008.method21730(var9);
      } catch (InterruptedException var12) {
         Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var12);
      } catch (ExecutionException var13) {
         Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var13);
      }
   }

   private void method26760(int var1, float[] var2, boolean var3) {
      int var6 = Class7008.method21726() > this.field34123 ? this.field34123 : Class7008.method21726();
      int var7 = 4 * this.field34121;
      if (this.field34125 == 2) {
         var7 >>= 1;
      }

      int var8 = var7;
      Future[] var9 = new Future[var6];

      for (int var10 = 0; var10 < var6; var10++) {
         var9[var10] = Class7008.method21729(new Class571(this, var8, var1, var10, var6, var2, var3));
      }

      try {
         Class7008.method21730(var9);
      } catch (InterruptedException var12) {
         Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var12);
      } catch (ExecutionException var13) {
         Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var13);
      }
   }

   private void method26761(int var1, Class2378 var2, boolean var3) {
      int var6 = (int)((long)Class7008.method21726() > this.field34124 ? this.field34124 : (long)Class7008.method21726());
      long var7 = 4L * this.field34122;
      if (this.field34126 == 2L) {
         var7 >>= 1;
      }

      long var9 = var7;
      Future[] var11 = new Future[var6];

      for (int var12 = 0; var12 < var6; var12++) {
         long var13 = (long)var12;
         var11[var12] = Class7008.method21729(new Class1396(this, var9, var1, var13, var6, var2, var3));
      }

      try {
         Class7008.method21730(var11);
      } catch (InterruptedException var15) {
         Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var15);
      } catch (ExecutionException var16) {
         Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var16);
      }
   }

   private void method26762(int var1, float[][][] var2, boolean var3) {
      int var6 = Class7008.method21726() > this.field34123 ? this.field34123 : Class7008.method21726();
      int var7 = 4 * this.field34121;
      if (this.field34125 == 2) {
         var7 >>= 1;
      }

      int var8 = var7;
      Future[] var9 = new Future[var6];

      for (int var10 = 0; var10 < var6; var10++) {
         var9[var10] = Class7008.method21729(new Class657(this, var8, var1, var10, var6, var2, var3));
      }

      try {
         Class7008.method21730(var9);
      } catch (InterruptedException var12) {
         Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var12);
      } catch (ExecutionException var13) {
         Logger.getLogger(Class7941.class.getName()).log(Level.SEVERE, null, var13);
      }
   }

   // $VF: synthetic method
   public static int method26763(Class7941 var0) {
      return var0.field34127;
   }

   // $VF: synthetic method
   public static int method26764(Class7941 var0) {
      return var0.field34123;
   }

   // $VF: synthetic method
   public static int method26765(Class7941 var0) {
      return var0.field34129;
   }

   // $VF: synthetic method
   public static Class8276 method26766(Class7941 var0) {
      return var0.field34133;
   }

   // $VF: synthetic method
   public static int method26767(Class7941 var0) {
      return var0.field34125;
   }

   // $VF: synthetic method
   public static Class8276 method26768(Class7941 var0) {
      return var0.field34132;
   }

   // $VF: synthetic method
   public static int method26769(Class7941 var0) {
      return var0.field34121;
   }

   // $VF: synthetic method
   public static Class8276 method26770(Class7941 var0) {
      return var0.field34131;
   }

   // $VF: synthetic method
   public static long method26771(Class7941 var0) {
      return var0.field34128;
   }

   // $VF: synthetic method
   public static long method26772(Class7941 var0) {
      return var0.field34124;
   }

   // $VF: synthetic method
   public static long method26773(Class7941 var0) {
      return var0.field34130;
   }

   // $VF: synthetic method
   public static long method26774(Class7941 var0) {
      return var0.field34126;
   }

   // $VF: synthetic method
   public static long method26775(Class7941 var0) {
      return var0.field34122;
   }
}
