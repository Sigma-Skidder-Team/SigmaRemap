package mapped;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class6352 {
   private int field27893;
   private long field27894;
   private int field27895;
   private long field27896;
   private int field27897;
   private long field27898;
   private int field27899;
   private long field27900;
   private int field27901;
   private long field27902;
   private Class9788 field27903;
   private Class9788 field27904;
   private Class9788 field27905;
   private boolean field27906 = false;
   private boolean field27907 = false;

   public Class6352(long var1, long var3, long var5) {
      if (var1 > 1L && var3 > 1L && var5 > 1L) {
         this.field27893 = (int)var1;
         this.field27895 = (int)var3;
         this.field27897 = (int)var5;
         this.field27894 = var1;
         this.field27896 = var3;
         this.field27898 = var5;
         this.field27899 = (int)(var3 * var5);
         this.field27901 = (int)var5;
         this.field27900 = var3 * var5;
         this.field27902 = var5;
         if (var1 * var3 * var5 >= Class7796.method25894()) {
            this.field27907 = true;
         }

         if (Class7796.method25908(var1) && Class7796.method25908(var3) && Class7796.method25908(var5)) {
            this.field27906 = true;
         }

         Class7796.method25902(var1 * var3 * var5 > (long)Class2373.method9693());
         this.field27903 = new Class9788(var1);
         if (var1 != var3) {
            this.field27904 = new Class9788(var3);
         } else {
            this.field27904 = this.field27903;
         }

         if (var1 != var5) {
            if (var3 != var5) {
               this.field27905 = new Class9788(var5);
            } else {
               this.field27905 = this.field27904;
            }
         } else {
            this.field27905 = this.field27903;
         }
      } else {
         throw new IllegalArgumentException("slices, rows and columns must be greater than 1");
      }
   }

   public void method19309(double[] var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field27906) {
         if (var5 > 1 && this.field27907) {
            this.method19321(-1, var1, var2);
            this.method19324(-1, var1, var2);
         } else {
            this.method19315(-1, var1, var2);
            this.method19318(-1, var1, var2);
         }
      } else if (var5 > 1 && this.field27907 && this.field27893 >= var5 && this.field27895 >= var5 && this.field27897 >= var5) {
         Future[] var20 = new Future[var5];
         int var23 = this.field27893 / var5;

         for (int var27 = 0; var27 < var5; var27++) {
            int var31 = var27 * var23;
            int var37 = var27 == var5 - 1 ? this.field27893 : var31 + var23;
            var20[var27] = Class7008.method21729(new Class1527(this, var31, var37, var1, var2));
         }

         try {
            Class7008.method21730(var20);
         } catch (InterruptedException var16) {
            Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var16);
         } catch (ExecutionException var17) {
            Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var17);
         }

         for (int var28 = 0; var28 < var5; var28++) {
            int var32 = var28 * var23;
            int var38 = var28 == var5 - 1 ? this.field27893 : var32 + var23;
            var20[var28] = Class7008.method21729(new Class1349(this, var32, var38, var1, var2));
         }

         try {
            Class7008.method21730(var20);
         } catch (InterruptedException var14) {
            Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var14);
         } catch (ExecutionException var15) {
            Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var15);
         }

         var23 = this.field27895 / var5;

         for (int var29 = 0; var29 < var5; var29++) {
            int var33 = var29 * var23;
            int var39 = var29 == var5 - 1 ? this.field27895 : var33 + var23;
            var20[var29] = Class7008.method21729(new Class569(this, var33, var39, var1, var2));
         }

         try {
            Class7008.method21730(var20);
         } catch (InterruptedException var12) {
            Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var12);
         } catch (ExecutionException var13) {
            Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var13);
         }
      } else {
         for (int var6 = 0; var6 < this.field27893; var6++) {
            int var7 = var6 * this.field27899;

            for (int var8 = 0; var8 < this.field27895; var8++) {
               this.field27905.method38578(var1, var7 + var8 * this.field27901, var2);
            }
         }

         double[] var18 = new double[this.field27895];

         for (int var21 = 0; var21 < this.field27893; var21++) {
            int var25 = var21 * this.field27899;

            for (int var9 = 0; var9 < this.field27897; var9++) {
               for (int var10 = 0; var10 < this.field27895; var10++) {
                  int var11 = var25 + var10 * this.field27901 + var9;
                  var18[var10] = var1[var11];
               }

               this.field27904.method38576(var18, var2);

               for (int var34 = 0; var34 < this.field27895; var34++) {
                  int var40 = var25 + var34 * this.field27901 + var9;
                  var1[var40] = var18[var34];
               }
            }
         }

         var18 = new double[this.field27893];

         for (int var22 = 0; var22 < this.field27895; var22++) {
            int var26 = var22 * this.field27901;

            for (int var30 = 0; var30 < this.field27897; var30++) {
               for (int var35 = 0; var35 < this.field27893; var35++) {
                  int var41 = var35 * this.field27899 + var26 + var30;
                  var18[var35] = var1[var41];
               }

               this.field27903.method38576(var18, var2);

               for (int var36 = 0; var36 < this.field27893; var36++) {
                  int var42 = var36 * this.field27899 + var26 + var30;
                  var1[var42] = var18[var36];
               }
            }
         }
      }
   }

   public void method19310(Class2381 var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field27906) {
         if (var5 > 1 && this.field27907) {
            this.method19322(-1, var1, var2);
            this.method19325(-1, var1, var2);
         } else {
            this.method19316(-1, var1, var2);
            this.method19319(-1, var1, var2);
         }
      } else if (var5 > 1 && this.field27907 && this.field27894 >= (long)var5 && this.field27896 >= (long)var5 && this.field27898 >= (long)var5) {
         Future[] var33 = new Future[var5];
         long var35 = this.field27894 / (long)var5;

         for (int var9 = 0; var9 < var5; var9++) {
            long var39 = (long)var9 * var35;
            long var12 = var9 == var5 - 1 ? this.field27894 : var39 + var35;
            var33[var9] = Class7008.method21729(new Class1426(this, var39, var12, var1, var2));
         }

         try {
            Class7008.method21730(var33);
         } catch (InterruptedException var30) {
            Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var30);
         } catch (ExecutionException var31) {
            Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var31);
         }

         for (int var37 = 0; var37 < var5; var37++) {
            long var40 = (long)var37 * var35;
            long var42 = var37 == var5 - 1 ? this.field27894 : var40 + var35;
            var33[var37] = Class7008.method21729(new Class1517(this, var40, var42, var1, var2));
         }

         try {
            Class7008.method21730(var33);
         } catch (InterruptedException var28) {
            Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var28);
         } catch (ExecutionException var29) {
            Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var29);
         }

         var35 = this.field27896 / (long)var5;

         for (int var38 = 0; var38 < var5; var38++) {
            long var41 = (long)var38 * var35;
            long var43 = var38 == var5 - 1 ? this.field27896 : var41 + var35;
            var33[var38] = Class7008.method21729(new Class1615(this, var41, var43, var1, var2));
         }

         try {
            Class7008.method21730(var33);
         } catch (InterruptedException var26) {
            Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var26);
         } catch (ExecutionException var27) {
            Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var27);
         }
      } else {
         for (long var14 = 0L; var14 < this.field27894; var14++) {
            long var16 = var14 * this.field27900;

            for (long var10 = 0L; var10 < this.field27896; var10++) {
               this.field27905.method38579(var1, var16 + var10 * this.field27902, var2);
            }
         }

         Class2381 var6 = new Class2381(this.field27896, false);

         for (long var7 = 0L; var7 < this.field27894; var7++) {
            long var18 = var7 * this.field27900;

            for (long var20 = 0L; var20 < this.field27898; var20++) {
               for (long var22 = 0L; var22 < this.field27896; var22++) {
                  long var24 = var18 + var22 * this.field27902 + var20;
                  var6.method9687(var22, var1.method9653(var24));
               }

               this.field27904.method38577(var6, var2);

               for (long var46 = 0L; var46 < this.field27896; var46++) {
                  long var49 = var18 + var46 * this.field27902 + var20;
                  var1.method9687(var49, var6.method9653(var46));
               }
            }
         }

         var6 = new Class2381(this.field27894, false);

         for (long var34 = 0L; var34 < this.field27896; var34++) {
            long var44 = var34 * this.field27902;

            for (long var45 = 0L; var45 < this.field27898; var45++) {
               for (long var47 = 0L; var47 < this.field27894; var47++) {
                  long var50 = var47 * this.field27900 + var44 + var45;
                  var6.method9687(var47, var1.method9653(var50));
               }

               this.field27903.method38577(var6, var2);

               for (long var48 = 0L; var48 < this.field27894; var48++) {
                  long var51 = var48 * this.field27900 + var44 + var45;
                  var1.method9687(var51, var6.method9653(var48));
               }
            }
         }
      }
   }

   public void method19311(double[][][] var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field27906) {
         if (var5 > 1 && this.field27907) {
            this.method19323(-1, var1, var2);
            this.method19326(-1, var1, var2);
         } else {
            this.method19317(-1, var1, var2);
            this.method19320(-1, var1, var2);
         }
      } else if (var5 > 1 && this.field27907 && this.field27893 >= var5 && this.field27895 >= var5 && this.field27897 >= var5) {
         Future[] var19 = new Future[var5];
         int var22 = this.field27893 / var5;

         for (int var25 = 0; var25 < var5; var25++) {
            int var31 = var25 * var22;
            int var10 = var25 == var5 - 1 ? this.field27893 : var31 + var22;
            var19[var25] = Class7008.method21729(new Class669(this, var31, var10, var1, var2));
         }

         try {
            Class7008.method21730(var19);
         } catch (InterruptedException var15) {
            Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var15);
         } catch (ExecutionException var16) {
            Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var16);
         }

         for (int var26 = 0; var26 < var5; var26++) {
            int var32 = var26 * var22;
            int var34 = var26 == var5 - 1 ? this.field27893 : var32 + var22;
            var19[var26] = Class7008.method21729(new Class726(this, var32, var34, var1, var2));
         }

         try {
            Class7008.method21730(var19);
         } catch (InterruptedException var13) {
            Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var13);
         } catch (ExecutionException var14) {
            Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var14);
         }

         var22 = this.field27895 / var5;

         for (int var27 = 0; var27 < var5; var27++) {
            int var33 = var27 * var22;
            int var35 = var27 == var5 - 1 ? this.field27895 : var33 + var22;
            var19[var27] = Class7008.method21729(new Class439(this, var33, var35, var1, var2));
         }

         try {
            Class7008.method21730(var19);
         } catch (InterruptedException var11) {
            Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var11);
         } catch (ExecutionException var12) {
            Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var12);
         }
      } else {
         for (int var6 = 0; var6 < this.field27893; var6++) {
            for (int var7 = 0; var7 < this.field27895; var7++) {
               this.field27905.method38576(var1[var6][var7], var2);
            }
         }

         double[] var17 = new double[this.field27895];

         for (int var20 = 0; var20 < this.field27893; var20++) {
            for (int var8 = 0; var8 < this.field27897; var8++) {
               for (int var9 = 0; var9 < this.field27895; var9++) {
                  var17[var9] = var1[var20][var9][var8];
               }

               this.field27904.method38576(var17, var2);

               for (int var28 = 0; var28 < this.field27895; var28++) {
                  var1[var20][var28][var8] = var17[var28];
               }
            }
         }

         var17 = new double[this.field27893];

         for (int var21 = 0; var21 < this.field27895; var21++) {
            for (int var24 = 0; var24 < this.field27897; var24++) {
               for (int var29 = 0; var29 < this.field27893; var29++) {
                  var17[var29] = var1[var29][var21][var24];
               }

               this.field27903.method38576(var17, var2);

               for (int var30 = 0; var30 < this.field27893; var30++) {
                  var1[var30][var21][var24] = var17[var30];
               }
            }
         }
      }
   }

   public void method19312(double[] var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field27906) {
         if (var5 > 1 && this.field27907) {
            this.method19321(1, var1, var2);
            this.method19324(1, var1, var2);
         } else {
            this.method19315(1, var1, var2);
            this.method19318(1, var1, var2);
         }
      } else if (var5 > 1 && this.field27907 && this.field27893 >= var5 && this.field27895 >= var5 && this.field27897 >= var5) {
         Future[] var20 = new Future[var5];
         int var23 = this.field27893 / var5;

         for (int var27 = 0; var27 < var5; var27++) {
            int var31 = var27 * var23;
            int var37 = var27 == var5 - 1 ? this.field27893 : var31 + var23;
            var20[var27] = Class7008.method21729(new Class466(this, var31, var37, var1, var2));
         }

         try {
            Class7008.method21730(var20);
         } catch (InterruptedException var16) {
            Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var16);
         } catch (ExecutionException var17) {
            Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var17);
         }

         for (int var28 = 0; var28 < var5; var28++) {
            int var32 = var28 * var23;
            int var38 = var28 == var5 - 1 ? this.field27893 : var32 + var23;
            var20[var28] = Class7008.method21729(new Class586(this, var32, var38, var1, var2));
         }

         try {
            Class7008.method21730(var20);
         } catch (InterruptedException var14) {
            Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var14);
         } catch (ExecutionException var15) {
            Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var15);
         }

         var23 = this.field27895 / var5;

         for (int var29 = 0; var29 < var5; var29++) {
            int var33 = var29 * var23;
            int var39 = var29 == var5 - 1 ? this.field27895 : var33 + var23;
            var20[var29] = Class7008.method21729(new Class754(this, var33, var39, var1, var2));
         }

         try {
            Class7008.method21730(var20);
         } catch (InterruptedException var12) {
            Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var12);
         } catch (ExecutionException var13) {
            Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var13);
         }
      } else {
         for (int var6 = 0; var6 < this.field27893; var6++) {
            int var7 = var6 * this.field27899;

            for (int var8 = 0; var8 < this.field27895; var8++) {
               this.field27905.method38582(var1, var7 + var8 * this.field27901, var2);
            }
         }

         double[] var18 = new double[this.field27895];

         for (int var21 = 0; var21 < this.field27893; var21++) {
            int var25 = var21 * this.field27899;

            for (int var9 = 0; var9 < this.field27897; var9++) {
               for (int var10 = 0; var10 < this.field27895; var10++) {
                  int var11 = var25 + var10 * this.field27901 + var9;
                  var18[var10] = var1[var11];
               }

               this.field27904.method38580(var18, var2);

               for (int var34 = 0; var34 < this.field27895; var34++) {
                  int var40 = var25 + var34 * this.field27901 + var9;
                  var1[var40] = var18[var34];
               }
            }
         }

         var18 = new double[this.field27893];

         for (int var22 = 0; var22 < this.field27895; var22++) {
            int var26 = var22 * this.field27901;

            for (int var30 = 0; var30 < this.field27897; var30++) {
               for (int var35 = 0; var35 < this.field27893; var35++) {
                  int var41 = var35 * this.field27899 + var26 + var30;
                  var18[var35] = var1[var41];
               }

               this.field27903.method38580(var18, var2);

               for (int var36 = 0; var36 < this.field27893; var36++) {
                  int var42 = var36 * this.field27899 + var26 + var30;
                  var1[var42] = var18[var36];
               }
            }
         }
      }
   }

   public void method19313(Class2381 var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field27906) {
         if (var5 > 1 && this.field27907) {
            this.method19322(1, var1, var2);
            this.method19325(1, var1, var2);
         } else {
            this.method19316(1, var1, var2);
            this.method19319(1, var1, var2);
         }
      } else if (var5 > 1 && this.field27907 && this.field27894 >= (long)var5 && this.field27896 >= (long)var5 && this.field27898 >= (long)var5) {
         Future[] var33 = new Future[var5];
         long var35 = this.field27894 / (long)var5;

         for (int var9 = 0; var9 < var5; var9++) {
            long var39 = (long)var9 * var35;
            long var12 = var9 == var5 - 1 ? this.field27894 : var39 + var35;
            var33[var9] = Class7008.method21729(new Class349(this, var39, var12, var1, var2));
         }

         try {
            Class7008.method21730(var33);
         } catch (InterruptedException var30) {
            Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var30);
         } catch (ExecutionException var31) {
            Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var31);
         }

         for (int var37 = 0; var37 < var5; var37++) {
            long var40 = (long)var37 * var35;
            long var42 = var37 == var5 - 1 ? this.field27894 : var40 + var35;
            var33[var37] = Class7008.method21729(new Class1367(this, var40, var42, var1, var2));
         }

         try {
            Class7008.method21730(var33);
         } catch (InterruptedException var28) {
            Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var28);
         } catch (ExecutionException var29) {
            Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var29);
         }

         var35 = this.field27896 / (long)var5;

         for (int var38 = 0; var38 < var5; var38++) {
            long var41 = (long)var38 * var35;
            long var43 = var38 == var5 - 1 ? this.field27896 : var41 + var35;
            var33[var38] = Class7008.method21729(new Class1587(this, var41, var43, var1, var2));
         }

         try {
            Class7008.method21730(var33);
         } catch (InterruptedException var26) {
            Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var26);
         } catch (ExecutionException var27) {
            Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var27);
         }
      } else {
         for (long var14 = 0L; var14 < this.field27894; var14++) {
            long var16 = var14 * this.field27900;

            for (long var10 = 0L; var10 < this.field27896; var10++) {
               this.field27905.method38583(var1, var16 + var10 * this.field27902, var2);
            }
         }

         Class2381 var6 = new Class2381(this.field27896, false);

         for (long var7 = 0L; var7 < this.field27894; var7++) {
            long var18 = var7 * this.field27900;

            for (long var20 = 0L; var20 < this.field27898; var20++) {
               for (long var22 = 0L; var22 < this.field27896; var22++) {
                  long var24 = var18 + var22 * this.field27902 + var20;
                  var6.method9687(var22, var1.method9653(var24));
               }

               this.field27904.method38581(var6, var2);

               for (long var46 = 0L; var46 < this.field27896; var46++) {
                  long var49 = var18 + var46 * this.field27902 + var20;
                  var1.method9687(var49, var6.method9653(var46));
               }
            }
         }

         var6 = new Class2381(this.field27894, false);

         for (long var34 = 0L; var34 < this.field27896; var34++) {
            long var44 = var34 * this.field27902;

            for (long var45 = 0L; var45 < this.field27898; var45++) {
               for (long var47 = 0L; var47 < this.field27894; var47++) {
                  long var50 = var47 * this.field27900 + var44 + var45;
                  var6.method9687(var47, var1.method9653(var50));
               }

               this.field27903.method38581(var6, var2);

               for (long var48 = 0L; var48 < this.field27894; var48++) {
                  long var51 = var48 * this.field27900 + var44 + var45;
                  var1.method9687(var51, var6.method9653(var48));
               }
            }
         }
      }
   }

   public void method19314(double[][][] var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field27906) {
         if (var5 > 1 && this.field27907) {
            this.method19323(1, var1, var2);
            this.method19326(1, var1, var2);
         } else {
            this.method19317(1, var1, var2);
            this.method19320(1, var1, var2);
         }
      } else if (var5 > 1 && this.field27907 && this.field27893 >= var5 && this.field27895 >= var5 && this.field27897 >= var5) {
         Future[] var19 = new Future[var5];
         int var22 = this.field27893 / var5;

         for (int var25 = 0; var25 < var5; var25++) {
            int var31 = var25 * var22;
            int var10 = var25 == var5 - 1 ? this.field27893 : var31 + var22;
            var19[var25] = Class7008.method21729(new Class588(this, var31, var10, var1, var2));
         }

         try {
            Class7008.method21730(var19);
         } catch (InterruptedException var15) {
            Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var15);
         } catch (ExecutionException var16) {
            Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var16);
         }

         for (int var26 = 0; var26 < var5; var26++) {
            int var32 = var26 * var22;
            int var34 = var26 == var5 - 1 ? this.field27893 : var32 + var22;
            var19[var26] = Class7008.method21729(new Class1578(this, var32, var34, var1, var2));
         }

         try {
            Class7008.method21730(var19);
         } catch (InterruptedException var13) {
            Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var13);
         } catch (ExecutionException var14) {
            Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var14);
         }

         var22 = this.field27895 / var5;

         for (int var27 = 0; var27 < var5; var27++) {
            int var33 = var27 * var22;
            int var35 = var27 == var5 - 1 ? this.field27895 : var33 + var22;
            var19[var27] = Class7008.method21729(new Class752(this, var33, var35, var1, var2));
         }

         try {
            Class7008.method21730(var19);
         } catch (InterruptedException var11) {
            Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var11);
         } catch (ExecutionException var12) {
            Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var12);
         }
      } else {
         for (int var6 = 0; var6 < this.field27893; var6++) {
            for (int var7 = 0; var7 < this.field27895; var7++) {
               this.field27905.method38580(var1[var6][var7], var2);
            }
         }

         double[] var17 = new double[this.field27895];

         for (int var20 = 0; var20 < this.field27893; var20++) {
            for (int var8 = 0; var8 < this.field27897; var8++) {
               for (int var9 = 0; var9 < this.field27895; var9++) {
                  var17[var9] = var1[var20][var9][var8];
               }

               this.field27904.method38580(var17, var2);

               for (int var28 = 0; var28 < this.field27895; var28++) {
                  var1[var20][var28][var8] = var17[var28];
               }
            }
         }

         var17 = new double[this.field27893];

         for (int var21 = 0; var21 < this.field27895; var21++) {
            for (int var24 = 0; var24 < this.field27897; var24++) {
               for (int var29 = 0; var29 < this.field27893; var29++) {
                  var17[var29] = var1[var29][var21][var24];
               }

               this.field27903.method38580(var17, var2);

               for (int var30 = 0; var30 < this.field27893; var30++) {
                  var1[var30][var21][var24] = var17[var30];
               }
            }
         }
      }
   }

   private void method19315(int var1, double[] var2, boolean var3) {
      int var6 = 4 * this.field27895;
      if (this.field27897 == 2) {
         var6 >>= 1;
      }

      double[] var7 = new double[var6];
      if (var1 != -1) {
         for (int var8 = 0; var8 < this.field27893; var8++) {
            int var9 = var8 * this.field27899;

            for (int var10 = 0; var10 < this.field27895; var10++) {
               this.field27905.method38582(var2, var9 + var10 * this.field27901, var3);
            }

            if (this.field27897 <= 2) {
               if (this.field27897 == 2) {
                  for (int var17 = 0; var17 < this.field27895; var17++) {
                     int var27 = var9 + var17 * this.field27901;
                     var7[var17] = var2[var27];
                     var7[this.field27895 + var17] = var2[var27 + 1];
                  }

                  this.field27904.method38582(var7, 0, var3);
                  this.field27904.method38582(var7, this.field27895, var3);

                  for (int var18 = 0; var18 < this.field27895; var18++) {
                     int var28 = var9 + var18 * this.field27901;
                     var2[var28] = var7[var18];
                     var2[var28 + 1] = var7[this.field27895 + var18];
                  }
               }
            } else {
               for (int var16 = 0; var16 < this.field27897; var16 += 4) {
                  for (int var11 = 0; var11 < this.field27895; var11++) {
                     int var12 = var9 + var11 * this.field27901 + var16;
                     int var13 = this.field27895 + var11;
                     var7[var11] = var2[var12];
                     var7[var13] = var2[var12 + 1];
                     var7[var13 + this.field27895] = var2[var12 + 2];
                     var7[var13 + 2 * this.field27895] = var2[var12 + 3];
                  }

                  this.field27904.method38582(var7, 0, var3);
                  this.field27904.method38582(var7, this.field27895, var3);
                  this.field27904.method38582(var7, 2 * this.field27895, var3);
                  this.field27904.method38582(var7, 3 * this.field27895, var3);

                  for (int var23 = 0; var23 < this.field27895; var23++) {
                     int var26 = var9 + var23 * this.field27901 + var16;
                     int var33 = this.field27895 + var23;
                     var2[var26] = var7[var23];
                     var2[var26 + 1] = var7[var33];
                     var2[var26 + 2] = var7[var33 + this.field27895];
                     var2[var26 + 3] = var7[var33 + 2 * this.field27895];
                  }
               }
            }
         }
      } else {
         for (int var14 = 0; var14 < this.field27893; var14++) {
            int var15 = var14 * this.field27899;

            for (int var19 = 0; var19 < this.field27895; var19++) {
               this.field27905.method38578(var2, var15 + var19 * this.field27901, var3);
            }

            if (this.field27897 <= 2) {
               if (this.field27897 == 2) {
                  for (int var21 = 0; var21 < this.field27895; var21++) {
                     int var31 = var15 + var21 * this.field27901;
                     var7[var21] = var2[var31];
                     var7[this.field27895 + var21] = var2[var31 + 1];
                  }

                  this.field27904.method38578(var7, 0, var3);
                  this.field27904.method38578(var7, this.field27895, var3);

                  for (int var22 = 0; var22 < this.field27895; var22++) {
                     int var32 = var15 + var22 * this.field27901;
                     var2[var32] = var7[var22];
                     var2[var32 + 1] = var7[this.field27895 + var22];
                  }
               }
            } else {
               for (int var20 = 0; var20 < this.field27897; var20 += 4) {
                  for (int var24 = 0; var24 < this.field27895; var24++) {
                     int var29 = var15 + var24 * this.field27901 + var20;
                     int var34 = this.field27895 + var24;
                     var7[var24] = var2[var29];
                     var7[var34] = var2[var29 + 1];
                     var7[var34 + this.field27895] = var2[var29 + 2];
                     var7[var34 + 2 * this.field27895] = var2[var29 + 3];
                  }

                  this.field27904.method38578(var7, 0, var3);
                  this.field27904.method38578(var7, this.field27895, var3);
                  this.field27904.method38578(var7, 2 * this.field27895, var3);
                  this.field27904.method38578(var7, 3 * this.field27895, var3);

                  for (int var25 = 0; var25 < this.field27895; var25++) {
                     int var30 = var15 + var25 * this.field27901 + var20;
                     int var35 = this.field27895 + var25;
                     var2[var30] = var7[var25];
                     var2[var30 + 1] = var7[var35];
                     var2[var30 + 2] = var7[var35 + this.field27895];
                     var2[var30 + 3] = var7[var35 + 2 * this.field27895];
                  }
               }
            }
         }
      }
   }

   private void method19316(int var1, Class2381 var2, boolean var3) {
      long var6 = 4L * this.field27896;
      if (this.field27898 == 2L) {
         var6 >>= 1;
      }

      Class2381 var8 = new Class2381(var6);
      if (var1 != -1) {
         for (long var9 = 0L; var9 < this.field27894; var9++) {
            long var11 = var9 * this.field27900;

            for (long var13 = 0L; var13 < this.field27896; var13++) {
               this.field27905.method38583(var2, var11 + var13 * this.field27902, var3);
            }

            if (this.field27898 <= 2L) {
               if (this.field27898 == 2L) {
                  for (long var24 = 0L; var24 < this.field27896; var24++) {
                     long var34 = var11 + var24 * this.field27902;
                     var8.method9687(var24, var2.method9653(var34));
                     var8.method9687(this.field27896 + var24, var2.method9653(var34 + 1L));
                  }

                  this.field27904.method38583(var8, 0L, var3);
                  this.field27904.method38583(var8, this.field27896, var3);

                  for (long var25 = 0L; var25 < this.field27896; var25++) {
                     long var35 = var11 + var25 * this.field27902;
                     var2.method9687(var35, var8.method9653(var25));
                     var2.method9687(var35 + 1L, var8.method9653(this.field27896 + var25));
                  }
               }
            } else {
               for (long var23 = 0L; var23 < this.field27898; var23 += 4L) {
                  for (long var15 = 0L; var15 < this.field27896; var15++) {
                     long var17 = var11 + var15 * this.field27902 + var23;
                     long var19 = this.field27896 + var15;
                     var8.method9687(var15, var2.method9653(var17));
                     var8.method9687(var19, var2.method9653(var17 + 1L));
                     var8.method9687(var19 + this.field27896, var2.method9653(var17 + 2L));
                     var8.method9687(var19 + 2L * this.field27896, var2.method9653(var17 + 3L));
                  }

                  this.field27904.method38583(var8, 0L, var3);
                  this.field27904.method38583(var8, this.field27896, var3);
                  this.field27904.method38583(var8, 2L * this.field27896, var3);
                  this.field27904.method38583(var8, 3L * this.field27896, var3);

                  for (long var30 = 0L; var30 < this.field27896; var30++) {
                     long var33 = var11 + var30 * this.field27902 + var23;
                     long var40 = this.field27896 + var30;
                     var2.method9687(var33, var8.method9653(var30));
                     var2.method9687(var33 + 1L, var8.method9653(var40));
                     var2.method9687(var33 + 2L, var8.method9653(var40 + this.field27896));
                     var2.method9687(var33 + 3L, var8.method9653(var40 + 2L * this.field27896));
                  }
               }
            }
         }
      } else {
         for (long var21 = 0L; var21 < this.field27894; var21++) {
            long var22 = var21 * this.field27900;

            for (long var26 = 0L; var26 < this.field27896; var26++) {
               this.field27905.method38579(var2, var22 + var26 * this.field27902, var3);
            }

            if (this.field27898 <= 2L) {
               if (this.field27898 == 2L) {
                  for (long var28 = 0L; var28 < this.field27896; var28++) {
                     long var38 = var22 + var28 * this.field27902;
                     var8.method9687(var28, var2.method9653(var38));
                     var8.method9687(this.field27896 + var28, var2.method9653(var38 + 1L));
                  }

                  this.field27904.method38579(var8, 0L, var3);
                  this.field27904.method38579(var8, this.field27896, var3);

                  for (long var29 = 0L; var29 < this.field27896; var29++) {
                     long var39 = var22 + var29 * this.field27902;
                     var2.method9687(var39, var8.method9653(var29));
                     var2.method9687(var39 + 1L, var8.method9653(this.field27896 + var29));
                  }
               }
            } else {
               for (long var27 = 0L; var27 < this.field27898; var27 += 4L) {
                  for (long var31 = 0L; var31 < this.field27896; var31++) {
                     long var36 = var22 + var31 * this.field27902 + var27;
                     long var41 = this.field27896 + var31;
                     var8.method9687(var31, var2.method9653(var36));
                     var8.method9687(var41, var2.method9653(var36 + 1L));
                     var8.method9687(var41 + this.field27896, var2.method9653(var36 + 2L));
                     var8.method9687(var41 + 2L * this.field27896, var2.method9653(var36 + 3L));
                  }

                  this.field27904.method38579(var8, 0L, var3);
                  this.field27904.method38579(var8, this.field27896, var3);
                  this.field27904.method38579(var8, 2L * this.field27896, var3);
                  this.field27904.method38579(var8, 3L * this.field27896, var3);

                  for (long var32 = 0L; var32 < this.field27896; var32++) {
                     long var37 = var22 + var32 * this.field27902 + var27;
                     long var42 = this.field27896 + var32;
                     var2.method9687(var37, var8.method9653(var32));
                     var2.method9687(var37 + 1L, var8.method9653(var42));
                     var2.method9687(var37 + 2L, var8.method9653(var42 + this.field27896));
                     var2.method9687(var37 + 3L, var8.method9653(var42 + 2L * this.field27896));
                  }
               }
            }
         }
      }
   }

   private void method19317(int var1, double[][][] var2, boolean var3) {
      int var6 = 4 * this.field27895;
      if (this.field27897 == 2) {
         var6 >>= 1;
      }

      double[] var7 = new double[var6];
      if (var1 != -1) {
         for (int var8 = 0; var8 < this.field27893; var8++) {
            for (int var9 = 0; var9 < this.field27895; var9++) {
               this.field27905.method38580(var2[var8][var9], var3);
            }

            if (this.field27897 <= 2) {
               if (this.field27897 == 2) {
                  for (int var14 = 0; var14 < this.field27895; var14++) {
                     var7[var14] = var2[var8][var14][0];
                     var7[this.field27895 + var14] = var2[var8][var14][1];
                  }

                  this.field27904.method38582(var7, 0, var3);
                  this.field27904.method38582(var7, this.field27895, var3);

                  for (int var15 = 0; var15 < this.field27895; var15++) {
                     var2[var8][var15][0] = var7[var15];
                     var2[var8][var15][1] = var7[this.field27895 + var15];
                  }
               }
            } else {
               for (int var13 = 0; var13 < this.field27897; var13 += 4) {
                  for (int var10 = 0; var10 < this.field27895; var10++) {
                     int var11 = this.field27895 + var10;
                     var7[var10] = var2[var8][var10][var13];
                     var7[var11] = var2[var8][var10][var13 + 1];
                     var7[var11 + this.field27895] = var2[var8][var10][var13 + 2];
                     var7[var11 + 2 * this.field27895] = var2[var8][var10][var13 + 3];
                  }

                  this.field27904.method38582(var7, 0, var3);
                  this.field27904.method38582(var7, this.field27895, var3);
                  this.field27904.method38582(var7, 2 * this.field27895, var3);
                  this.field27904.method38582(var7, 3 * this.field27895, var3);

                  for (int var20 = 0; var20 < this.field27895; var20++) {
                     int var23 = this.field27895 + var20;
                     var2[var8][var20][var13] = var7[var20];
                     var2[var8][var20][var13 + 1] = var7[var23];
                     var2[var8][var20][var13 + 2] = var7[var23 + this.field27895];
                     var2[var8][var20][var13 + 3] = var7[var23 + 2 * this.field27895];
                  }
               }
            }
         }
      } else {
         for (int var12 = 0; var12 < this.field27893; var12++) {
            for (int var16 = 0; var16 < this.field27895; var16++) {
               this.field27905.method38576(var2[var12][var16], var3);
            }

            if (this.field27897 <= 2) {
               if (this.field27897 == 2) {
                  for (int var18 = 0; var18 < this.field27895; var18++) {
                     var7[var18] = var2[var12][var18][0];
                     var7[this.field27895 + var18] = var2[var12][var18][1];
                  }

                  this.field27904.method38578(var7, 0, var3);
                  this.field27904.method38578(var7, this.field27895, var3);

                  for (int var19 = 0; var19 < this.field27895; var19++) {
                     var2[var12][var19][0] = var7[var19];
                     var2[var12][var19][1] = var7[this.field27895 + var19];
                  }
               }
            } else {
               for (int var17 = 0; var17 < this.field27897; var17 += 4) {
                  for (int var21 = 0; var21 < this.field27895; var21++) {
                     int var24 = this.field27895 + var21;
                     var7[var21] = var2[var12][var21][var17];
                     var7[var24] = var2[var12][var21][var17 + 1];
                     var7[var24 + this.field27895] = var2[var12][var21][var17 + 2];
                     var7[var24 + 2 * this.field27895] = var2[var12][var21][var17 + 3];
                  }

                  this.field27904.method38578(var7, 0, var3);
                  this.field27904.method38578(var7, this.field27895, var3);
                  this.field27904.method38578(var7, 2 * this.field27895, var3);
                  this.field27904.method38578(var7, 3 * this.field27895, var3);

                  for (int var22 = 0; var22 < this.field27895; var22++) {
                     int var25 = this.field27895 + var22;
                     var2[var12][var22][var17] = var7[var22];
                     var2[var12][var22][var17 + 1] = var7[var25];
                     var2[var12][var22][var17 + 2] = var7[var25 + this.field27895];
                     var2[var12][var22][var17 + 3] = var7[var25 + 2 * this.field27895];
                  }
               }
            }
         }
      }
   }

   private void method19318(int var1, double[] var2, boolean var3) {
      int var6 = 4 * this.field27893;
      if (this.field27897 == 2) {
         var6 >>= 1;
      }

      double[] var7 = new double[var6];
      if (var1 != -1) {
         if (this.field27897 <= 2) {
            if (this.field27897 == 2) {
               for (int var8 = 0; var8 < this.field27895; var8++) {
                  int var9 = var8 * this.field27901;

                  for (int var10 = 0; var10 < this.field27893; var10++) {
                     int var12 = var10 * this.field27899 + var9;
                     var7[var10] = var2[var12];
                     var7[this.field27893 + var10] = var2[var12 + 1];
                  }

                  this.field27903.method38582(var7, 0, var3);
                  this.field27903.method38582(var7, this.field27893, var3);

                  for (int var20 = 0; var20 < this.field27893; var20++) {
                     int var28 = var20 * this.field27899 + var9;
                     var2[var28] = var7[var20];
                     var2[var28 + 1] = var7[this.field27893 + var20];
                  }
               }
            }
         } else {
            for (int var14 = 0; var14 < this.field27895; var14++) {
               int var17 = var14 * this.field27901;

               for (int var21 = 0; var21 < this.field27897; var21 += 4) {
                  for (int var11 = 0; var11 < this.field27893; var11++) {
                     int var29 = var11 * this.field27899 + var17 + var21;
                     int var13 = this.field27893 + var11;
                     var7[var11] = var2[var29];
                     var7[var13] = var2[var29 + 1];
                     var7[var13 + this.field27893] = var2[var29 + 2];
                     var7[var13 + 2 * this.field27893] = var2[var29 + 3];
                  }

                  this.field27903.method38582(var7, 0, var3);
                  this.field27903.method38582(var7, this.field27893, var3);
                  this.field27903.method38582(var7, 2 * this.field27893, var3);
                  this.field27903.method38582(var7, 3 * this.field27893, var3);

                  for (int var25 = 0; var25 < this.field27893; var25++) {
                     int var30 = var25 * this.field27899 + var17 + var21;
                     int var35 = this.field27893 + var25;
                     var2[var30] = var7[var25];
                     var2[var30 + 1] = var7[var35];
                     var2[var30 + 2] = var7[var35 + this.field27893];
                     var2[var30 + 3] = var7[var35 + 2 * this.field27893];
                  }
               }
            }
         }
      } else if (this.field27897 <= 2) {
         if (this.field27897 == 2) {
            for (int var15 = 0; var15 < this.field27895; var15++) {
               int var18 = var15 * this.field27901;

               for (int var22 = 0; var22 < this.field27893; var22++) {
                  int var31 = var22 * this.field27899 + var18;
                  var7[var22] = var2[var31];
                  var7[this.field27893 + var22] = var2[var31 + 1];
               }

               this.field27903.method38578(var7, 0, var3);
               this.field27903.method38578(var7, this.field27893, var3);

               for (int var23 = 0; var23 < this.field27893; var23++) {
                  int var32 = var23 * this.field27899 + var18;
                  var2[var32] = var7[var23];
                  var2[var32 + 1] = var7[this.field27893 + var23];
               }
            }
         }
      } else {
         for (int var16 = 0; var16 < this.field27895; var16++) {
            int var19 = var16 * this.field27901;

            for (int var24 = 0; var24 < this.field27897; var24 += 4) {
               for (int var26 = 0; var26 < this.field27893; var26++) {
                  int var33 = var26 * this.field27899 + var19 + var24;
                  int var36 = this.field27893 + var26;
                  var7[var26] = var2[var33];
                  var7[var36] = var2[var33 + 1];
                  var7[var36 + this.field27893] = var2[var33 + 2];
                  var7[var36 + 2 * this.field27893] = var2[var33 + 3];
               }

               this.field27903.method38578(var7, 0, var3);
               this.field27903.method38578(var7, this.field27893, var3);
               this.field27903.method38578(var7, 2 * this.field27893, var3);
               this.field27903.method38578(var7, 3 * this.field27893, var3);

               for (int var27 = 0; var27 < this.field27893; var27++) {
                  int var34 = var27 * this.field27899 + var19 + var24;
                  int var37 = this.field27893 + var27;
                  var2[var34] = var7[var27];
                  var2[var34 + 1] = var7[var37];
                  var2[var34 + 2] = var7[var37 + this.field27893];
                  var2[var34 + 3] = var7[var37 + 2 * this.field27893];
               }
            }
         }
      }
   }

   private void method19319(int var1, Class2381 var2, boolean var3) {
      long var6 = 4L * this.field27894;
      if (this.field27898 == 2L) {
         var6 >>= 1;
      }

      Class2381 var8 = new Class2381(var6);
      if (var1 != -1) {
         if (this.field27898 <= 2L) {
            if (this.field27898 == 2L) {
               for (long var9 = 0L; var9 < this.field27896; var9++) {
                  long var11 = var9 * this.field27902;

                  for (long var13 = 0L; var13 < this.field27894; var13++) {
                     long var17 = var13 * this.field27900 + var11;
                     var8.method9687(var13, var2.method9653(var17));
                     var8.method9687(this.field27894 + var13, var2.method9653(var17 + 1L));
                  }

                  this.field27903.method38583(var8, 0L, var3);
                  this.field27903.method38583(var8, this.field27894, var3);

                  for (long var27 = 0L; var27 < this.field27894; var27++) {
                     long var35 = var27 * this.field27900 + var11;
                     var2.method9687(var35, var8.method9653(var27));
                     var2.method9687(var35 + 1L, var8.method9653(this.field27894 + var27));
                  }
               }
            }
         } else {
            for (long var21 = 0L; var21 < this.field27896; var21++) {
               long var24 = var21 * this.field27902;

               for (long var28 = 0L; var28 < this.field27898; var28 += 4L) {
                  for (long var15 = 0L; var15 < this.field27894; var15++) {
                     long var36 = var15 * this.field27900 + var24 + var28;
                     long var19 = this.field27894 + var15;
                     var8.method9687(var15, var2.method9653(var36));
                     var8.method9687(var19, var2.method9653(var36 + 1L));
                     var8.method9687(var19 + this.field27894, var2.method9653(var36 + 2L));
                     var8.method9687(var19 + 2L * this.field27894, var2.method9653(var36 + 3L));
                  }

                  this.field27903.method38583(var8, 0L, var3);
                  this.field27903.method38583(var8, this.field27894, var3);
                  this.field27903.method38583(var8, 2L * this.field27894, var3);
                  this.field27903.method38583(var8, 3L * this.field27894, var3);

                  for (long var32 = 0L; var32 < this.field27894; var32++) {
                     long var37 = var32 * this.field27900 + var24 + var28;
                     long var42 = this.field27894 + var32;
                     var2.method9687(var37, var8.method9653(var32));
                     var2.method9687(var37 + 1L, var8.method9653(var42));
                     var2.method9687(var37 + 2L, var8.method9653(var42 + this.field27894));
                     var2.method9687(var37 + 3L, var8.method9653(var42 + 2L * this.field27894));
                  }
               }
            }
         }
      } else if (this.field27898 <= 2L) {
         if (this.field27898 == 2L) {
            for (long var22 = 0L; var22 < this.field27896; var22++) {
               long var25 = var22 * this.field27902;

               for (long var29 = 0L; var29 < this.field27894; var29++) {
                  long var38 = var29 * this.field27900 + var25;
                  var8.method9687(var29, var2.method9653(var38));
                  var8.method9687(this.field27894 + var29, var2.method9653(var38 + 1L));
               }

               this.field27903.method38579(var8, 0L, var3);
               this.field27903.method38579(var8, this.field27894, var3);

               for (long var30 = 0L; var30 < this.field27894; var30++) {
                  long var39 = var30 * this.field27900 + var25;
                  var2.method9687(var39, var8.method9653(var30));
                  var2.method9687(var39 + 1L, var8.method9653(this.field27894 + var30));
               }
            }
         }
      } else {
         for (long var23 = 0L; var23 < this.field27896; var23++) {
            long var26 = var23 * this.field27902;

            for (long var31 = 0L; var31 < this.field27898; var31 += 4L) {
               for (long var33 = 0L; var33 < this.field27894; var33++) {
                  long var40 = var33 * this.field27900 + var26 + var31;
                  long var43 = this.field27894 + var33;
                  var8.method9687(var33, var2.method9653(var40));
                  var8.method9687(var43, var2.method9653(var40 + 1L));
                  var8.method9687(var43 + this.field27894, var2.method9653(var40 + 2L));
                  var8.method9687(var43 + 2L * this.field27894, var2.method9653(var40 + 3L));
               }

               this.field27903.method38579(var8, 0L, var3);
               this.field27903.method38579(var8, this.field27894, var3);
               this.field27903.method38579(var8, 2L * this.field27894, var3);
               this.field27903.method38579(var8, 3L * this.field27894, var3);

               for (long var34 = 0L; var34 < this.field27894; var34++) {
                  long var41 = var34 * this.field27900 + var26 + var31;
                  long var44 = this.field27894 + var34;
                  var2.method9687(var41, var8.method9653(var34));
                  var2.method9687(var41 + 1L, var8.method9653(var44));
                  var2.method9687(var41 + 2L, var8.method9653(var44 + this.field27894));
                  var2.method9687(var41 + 3L, var8.method9653(var44 + 2L * this.field27894));
               }
            }
         }
      }
   }

   private void method19320(int var1, double[][][] var2, boolean var3) {
      int var6 = 4 * this.field27893;
      if (this.field27897 == 2) {
         var6 >>= 1;
      }

      double[] var7 = new double[var6];
      if (var1 != -1) {
         if (this.field27897 <= 2) {
            if (this.field27897 == 2) {
               for (int var8 = 0; var8 < this.field27895; var8++) {
                  for (int var9 = 0; var9 < this.field27893; var9++) {
                     var7[var9] = var2[var9][var8][0];
                     var7[this.field27893 + var9] = var2[var9][var8][1];
                  }

                  this.field27903.method38582(var7, 0, var3);
                  this.field27903.method38582(var7, this.field27893, var3);

                  for (int var15 = 0; var15 < this.field27893; var15++) {
                     var2[var15][var8][0] = var7[var15];
                     var2[var15][var8][1] = var7[this.field27893 + var15];
                  }
               }
            }
         } else {
            for (int var12 = 0; var12 < this.field27895; var12++) {
               for (int var16 = 0; var16 < this.field27897; var16 += 4) {
                  for (int var10 = 0; var10 < this.field27893; var10++) {
                     int var11 = this.field27893 + var10;
                     var7[var10] = var2[var10][var12][var16];
                     var7[var11] = var2[var10][var12][var16 + 1];
                     var7[var11 + this.field27893] = var2[var10][var12][var16 + 2];
                     var7[var11 + 2 * this.field27893] = var2[var10][var12][var16 + 3];
                  }

                  this.field27903.method38582(var7, 0, var3);
                  this.field27903.method38582(var7, this.field27893, var3);
                  this.field27903.method38582(var7, 2 * this.field27893, var3);
                  this.field27903.method38582(var7, 3 * this.field27893, var3);

                  for (int var20 = 0; var20 < this.field27893; var20++) {
                     int var23 = this.field27893 + var20;
                     var2[var20][var12][var16] = var7[var20];
                     var2[var20][var12][var16 + 1] = var7[var23];
                     var2[var20][var12][var16 + 2] = var7[var23 + this.field27893];
                     var2[var20][var12][var16 + 3] = var7[var23 + 2 * this.field27893];
                  }
               }
            }
         }
      } else if (this.field27897 <= 2) {
         if (this.field27897 == 2) {
            for (int var13 = 0; var13 < this.field27895; var13++) {
               for (int var17 = 0; var17 < this.field27893; var17++) {
                  var7[var17] = var2[var17][var13][0];
                  var7[this.field27893 + var17] = var2[var17][var13][1];
               }

               this.field27903.method38578(var7, 0, var3);
               this.field27903.method38578(var7, this.field27893, var3);

               for (int var18 = 0; var18 < this.field27893; var18++) {
                  var2[var18][var13][0] = var7[var18];
                  var2[var18][var13][1] = var7[this.field27893 + var18];
               }
            }
         }
      } else {
         for (int var14 = 0; var14 < this.field27895; var14++) {
            for (int var19 = 0; var19 < this.field27897; var19 += 4) {
               for (int var21 = 0; var21 < this.field27893; var21++) {
                  int var24 = this.field27893 + var21;
                  var7[var21] = var2[var21][var14][var19];
                  var7[var24] = var2[var21][var14][var19 + 1];
                  var7[var24 + this.field27893] = var2[var21][var14][var19 + 2];
                  var7[var24 + 2 * this.field27893] = var2[var21][var14][var19 + 3];
               }

               this.field27903.method38578(var7, 0, var3);
               this.field27903.method38578(var7, this.field27893, var3);
               this.field27903.method38578(var7, 2 * this.field27893, var3);
               this.field27903.method38578(var7, 3 * this.field27893, var3);

               for (int var22 = 0; var22 < this.field27893; var22++) {
                  int var25 = this.field27893 + var22;
                  var2[var22][var14][var19] = var7[var22];
                  var2[var22][var14][var19 + 1] = var7[var25];
                  var2[var22][var14][var19 + 2] = var7[var25 + this.field27893];
                  var2[var22][var14][var19 + 3] = var7[var25 + 2 * this.field27893];
               }
            }
         }
      }
   }

   private void method19321(int var1, double[] var2, boolean var3) {
      int var6 = Class7008.method21726() > this.field27893 ? this.field27893 : Class7008.method21726();
      int var7 = 4 * this.field27895;
      if (this.field27897 == 2) {
         var7 >>= 1;
      }

      Future[] var8 = new Future[var6];
      int var9 = var7;

      for (int var10 = 0; var10 < var6; var10++) {
         var8[var10] = Class7008.method21729(new Class639(this, var9, var1, var10, var6, var2, var3));
      }

      try {
         Class7008.method21730(var8);
      } catch (InterruptedException var12) {
         Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var12);
      } catch (ExecutionException var13) {
         Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var13);
      }
   }

   private void method19322(int var1, Class2381 var2, boolean var3) {
      int var6 = (int)((long)Class7008.method21726() > this.field27894 ? this.field27894 : (long)Class7008.method21726());
      long var7 = 4L * this.field27896;
      if (this.field27898 == 2L) {
         var7 >>= 1;
      }

      Future[] var9 = new Future[var6];
      long var10 = var7;

      for (int var12 = 0; var12 < var6; var12++) {
         long var13 = (long)var12;
         var9[var12] = Class7008.method21729(new Class1523(this, var10, var1, var13, var6, var2, var3));
      }

      try {
         Class7008.method21730(var9);
      } catch (InterruptedException var15) {
         Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var15);
      } catch (ExecutionException var16) {
         Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var16);
      }
   }

   private void method19323(int var1, double[][][] var2, boolean var3) {
      int var6 = Class7008.method21726() > this.field27893 ? this.field27893 : Class7008.method21726();
      int var7 = 4 * this.field27895;
      if (this.field27897 == 2) {
         var7 >>= 1;
      }

      int var8 = var7;
      Future[] var9 = new Future[var6];

      for (int var10 = 0; var10 < var6; var10++) {
         var9[var10] = Class7008.method21729(new Class490(this, var8, var1, var10, var6, var2, var3));
      }

      try {
         Class7008.method21730(var9);
      } catch (InterruptedException var12) {
         Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var12);
      } catch (ExecutionException var13) {
         Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var13);
      }
   }

   private void method19324(int var1, double[] var2, boolean var3) {
      int var6 = Class7008.method21726() > this.field27895 ? this.field27895 : Class7008.method21726();
      int var7 = 4 * this.field27893;
      if (this.field27897 == 2) {
         var7 >>= 1;
      }

      int var8 = var7;
      Future[] var9 = new Future[var6];

      for (int var10 = 0; var10 < var6; var10++) {
         var9[var10] = Class7008.method21729(new Class1401(this, var8, var1, var10, var6, var2, var3));
      }

      try {
         Class7008.method21730(var9);
      } catch (InterruptedException var12) {
         Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var12);
      } catch (ExecutionException var13) {
         Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var13);
      }
   }

   private void method19325(int var1, Class2381 var2, boolean var3) {
      int var6 = (int)((long)Class7008.method21726() > this.field27896 ? this.field27896 : (long)Class7008.method21726());
      long var7 = 4L * this.field27894;
      if (this.field27898 == 2L) {
         var7 >>= 1;
      }

      long var9 = var7;
      Future[] var11 = new Future[var6];

      for (int var12 = 0; var12 < var6; var12++) {
         long var13 = (long)var12;
         var11[var12] = Class7008.method21729(new Class1506(this, var9, var1, var13, var6, var2, var3));
      }

      try {
         Class7008.method21730(var11);
      } catch (InterruptedException var15) {
         Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var15);
      } catch (ExecutionException var16) {
         Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var16);
      }
   }

   private void method19326(int var1, double[][][] var2, boolean var3) {
      int var6 = Class7008.method21726() > this.field27895 ? this.field27895 : Class7008.method21726();
      int var7 = 4 * this.field27893;
      if (this.field27897 == 2) {
         var7 >>= 1;
      }

      int var8 = var7;
      Future[] var9 = new Future[var6];

      for (int var10 = 0; var10 < var6; var10++) {
         var9[var10] = Class7008.method21729(new Class1584(this, var8, var1, var10, var6, var2, var3));
      }

      try {
         Class7008.method21730(var9);
      } catch (InterruptedException var12) {
         Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var12);
      } catch (ExecutionException var13) {
         Logger.getLogger(Class6352.class.getName()).log(Level.SEVERE, null, var13);
      }
   }

   // $VF: synthetic method
   public static int method19327(Class6352 var0) {
      return var0.field27899;
   }

   // $VF: synthetic method
   public static int method19328(Class6352 var0) {
      return var0.field27895;
   }

   // $VF: synthetic method
   public static int method19329(Class6352 var0) {
      return var0.field27901;
   }

   // $VF: synthetic method
   public static Class9788 method19330(Class6352 var0) {
      return var0.field27905;
   }

   // $VF: synthetic method
   public static int method19331(Class6352 var0) {
      return var0.field27897;
   }

   // $VF: synthetic method
   public static Class9788 method19332(Class6352 var0) {
      return var0.field27904;
   }

   // $VF: synthetic method
   public static int method19333(Class6352 var0) {
      return var0.field27893;
   }

   // $VF: synthetic method
   public static Class9788 method19334(Class6352 var0) {
      return var0.field27903;
   }

   // $VF: synthetic method
   public static long method19335(Class6352 var0) {
      return var0.field27900;
   }

   // $VF: synthetic method
   public static long method19336(Class6352 var0) {
      return var0.field27896;
   }

   // $VF: synthetic method
   public static long method19337(Class6352 var0) {
      return var0.field27902;
   }

   // $VF: synthetic method
   public static long method19338(Class6352 var0) {
      return var0.field27898;
   }

   // $VF: synthetic method
   public static long method19339(Class6352 var0) {
      return var0.field27894;
   }
}
