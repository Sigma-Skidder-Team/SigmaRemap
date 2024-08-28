package mapped;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class7824 {
   private int field33565;
   private long field33566;
   private int field33567;
   private long field33568;
   private int field33569;
   private long field33570;
   private int field33571;
   private long field33572;
   private int field33573;
   private long field33574;
   private Class8431 field33575;
   private Class8431 field33576;
   private Class8431 field33577;
   private boolean field33578 = false;
   private boolean field33579 = false;

   public Class7824(long var1, long var3, long var5) {
      if (var1 > 1L && var3 > 1L && var5 > 1L) {
         this.field33565 = (int)var1;
         this.field33567 = (int)var3;
         this.field33569 = (int)var5;
         this.field33566 = var1;
         this.field33568 = var3;
         this.field33570 = var5;
         this.field33571 = (int)(var3 * var5);
         this.field33573 = (int)var5;
         this.field33572 = var3 * var5;
         this.field33574 = var5;
         if (var1 * var3 * var5 >= Class7796.method25894()) {
            this.field33579 = true;
         }

         if (Class7796.method25908(var1) && Class7796.method25908(var3) && Class7796.method25908(var5)) {
            this.field33578 = true;
         }

         Class7796.method25902(var1 * var3 * var5 > (long)Class2373.method9693());
         this.field33575 = new Class8431(var1);
         if (var1 != var3) {
            this.field33576 = new Class8431(var3);
         } else {
            this.field33576 = this.field33575;
         }

         if (var1 != var5) {
            if (var3 != var5) {
               this.field33577 = new Class8431(var5);
            } else {
               this.field33577 = this.field33576;
            }
         } else {
            this.field33577 = this.field33575;
         }
      } else {
         throw new IllegalArgumentException("slices, rows and columns must be greater than 1");
      }
   }

   public void method26161(float[] var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field33578) {
         if (var5 > 1 && this.field33579) {
            this.method26173(-1, var1, var2);
            this.method26176(-1, var1, var2);
         } else {
            this.method26167(-1, var1, var2);
            this.method26170(-1, var1, var2);
         }
      } else if (var5 > 1 && this.field33579 && this.field33565 >= var5 && this.field33567 >= var5 && this.field33569 >= var5) {
         Future[] var20 = new Future[var5];
         int var23 = this.field33565 / var5;

         for (int var27 = 0; var27 < var5; var27++) {
            int var31 = var27 * var23;
            int var37 = var27 == var5 - 1 ? this.field33565 : var31 + var23;
            var20[var27] = Class7008.method21729(new Class1427(this, var31, var37, var1, var2));
         }

         try {
            Class7008.method21730(var20);
         } catch (InterruptedException var16) {
            Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var16);
         } catch (ExecutionException var17) {
            Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var17);
         }

         for (int var28 = 0; var28 < var5; var28++) {
            int var32 = var28 * var23;
            int var38 = var28 == var5 - 1 ? this.field33565 : var32 + var23;
            var20[var28] = Class7008.method21729(new Class614(this, var32, var38, var1, var2));
         }

         try {
            Class7008.method21730(var20);
         } catch (InterruptedException var14) {
            Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var14);
         } catch (ExecutionException var15) {
            Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var15);
         }

         var23 = this.field33567 / var5;

         for (int var29 = 0; var29 < var5; var29++) {
            int var33 = var29 * var23;
            int var39 = var29 == var5 - 1 ? this.field33567 : var33 + var23;
            var20[var29] = Class7008.method21729(new Class1595(this, var33, var39, var1, var2));
         }

         try {
            Class7008.method21730(var20);
         } catch (InterruptedException var12) {
            Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var12);
         } catch (ExecutionException var13) {
            Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var13);
         }
      } else {
         for (int var6 = 0; var6 < this.field33565; var6++) {
            int var7 = var6 * this.field33571;

            for (int var8 = 0; var8 < this.field33567; var8++) {
               this.field33577.method29629(var1, var7 + var8 * this.field33573, var2);
            }
         }

         float[] var18 = new float[this.field33567];

         for (int var21 = 0; var21 < this.field33565; var21++) {
            int var25 = var21 * this.field33571;

            for (int var9 = 0; var9 < this.field33569; var9++) {
               for (int var10 = 0; var10 < this.field33567; var10++) {
                  int var11 = var25 + var10 * this.field33573 + var9;
                  var18[var10] = var1[var11];
               }

               this.field33576.method29627(var18, var2);

               for (int var34 = 0; var34 < this.field33567; var34++) {
                  int var40 = var25 + var34 * this.field33573 + var9;
                  var1[var40] = var18[var34];
               }
            }
         }

         var18 = new float[this.field33565];

         for (int var22 = 0; var22 < this.field33567; var22++) {
            int var26 = var22 * this.field33573;

            for (int var30 = 0; var30 < this.field33569; var30++) {
               for (int var35 = 0; var35 < this.field33565; var35++) {
                  int var41 = var35 * this.field33571 + var26 + var30;
                  var18[var35] = var1[var41];
               }

               this.field33575.method29627(var18, var2);

               for (int var36 = 0; var36 < this.field33565; var36++) {
                  int var42 = var36 * this.field33571 + var26 + var30;
                  var1[var42] = var18[var36];
               }
            }
         }
      }
   }

   public void method26162(Class2378 var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field33578) {
         if (var5 > 1 && this.field33579) {
            this.method26174(-1, var1, var2);
            this.method26177(-1, var1, var2);
         } else {
            this.method26168(-1, var1, var2);
            this.method26171(-1, var1, var2);
         }
      } else if (var5 > 1 && this.field33579 && this.field33566 >= (long)var5 && this.field33568 >= (long)var5 && this.field33570 >= (long)var5) {
         Future[] var33 = new Future[var5];
         long var35 = this.field33566 / (long)var5;

         for (int var9 = 0; var9 < var5; var9++) {
            long var39 = (long)var9 * var35;
            long var12 = var9 == var5 - 1 ? this.field33566 : var39 + var35;
            var33[var9] = Class7008.method21729(new Class492(this, var39, var12, var1, var2));
         }

         try {
            Class7008.method21730(var33);
         } catch (InterruptedException var30) {
            Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var30);
         } catch (ExecutionException var31) {
            Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var31);
         }

         for (int var37 = 0; var37 < var5; var37++) {
            long var40 = (long)var37 * var35;
            long var42 = var37 == var5 - 1 ? this.field33566 : var40 + var35;
            var33[var37] = Class7008.method21729(new Class696(this, var40, var42, var1, var2));
         }

         try {
            Class7008.method21730(var33);
         } catch (InterruptedException var28) {
            Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var28);
         } catch (ExecutionException var29) {
            Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var29);
         }

         var35 = this.field33568 / (long)var5;

         for (int var38 = 0; var38 < var5; var38++) {
            long var41 = (long)var38 * var35;
            long var43 = var38 == var5 - 1 ? this.field33568 : var41 + var35;
            var33[var38] = Class7008.method21729(new Class1546(this, var41, var43, var1, var2));
         }

         try {
            Class7008.method21730(var33);
         } catch (InterruptedException var26) {
            Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var26);
         } catch (ExecutionException var27) {
            Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var27);
         }
      } else {
         for (long var14 = 0L; var14 < this.field33566; var14++) {
            long var16 = var14 * this.field33572;

            for (long var10 = 0L; var10 < this.field33568; var10++) {
               this.field33577.method29630(var1, var16 + var10 * this.field33574, var2);
            }
         }

         Class2378 var6 = new Class2378(this.field33568, false);

         for (long var7 = 0L; var7 < this.field33566; var7++) {
            long var18 = var7 * this.field33572;

            for (long var20 = 0L; var20 < this.field33570; var20++) {
               for (long var22 = 0L; var22 < this.field33568; var22++) {
                  long var24 = var18 + var22 * this.field33574 + var20;
                  var6.method9685(var22, var1.method9651(var24));
               }

               this.field33576.method29628(var6, var2);

               for (long var46 = 0L; var46 < this.field33568; var46++) {
                  long var49 = var18 + var46 * this.field33574 + var20;
                  var1.method9685(var49, var6.method9651(var46));
               }
            }
         }

         var6 = new Class2378(this.field33566, false);

         for (long var34 = 0L; var34 < this.field33568; var34++) {
            long var44 = var34 * this.field33574;

            for (long var45 = 0L; var45 < this.field33570; var45++) {
               for (long var47 = 0L; var47 < this.field33566; var47++) {
                  long var50 = var47 * this.field33572 + var44 + var45;
                  var6.method9685(var47, var1.method9651(var50));
               }

               this.field33575.method29628(var6, var2);

               for (long var48 = 0L; var48 < this.field33566; var48++) {
                  long var51 = var48 * this.field33572 + var44 + var45;
                  var1.method9685(var51, var6.method9651(var48));
               }
            }
         }
      }
   }

   public void method26163(float[][][] var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field33578) {
         if (var5 > 1 && this.field33579) {
            this.method26175(-1, var1, var2);
            this.method26178(-1, var1, var2);
         } else {
            this.method26169(-1, var1, var2);
            this.method26172(-1, var1, var2);
         }
      } else if (var5 > 1 && this.field33579 && this.field33565 >= var5 && this.field33567 >= var5 && this.field33569 >= var5) {
         Future[] var19 = new Future[var5];
         int var22 = this.field33565 / var5;

         for (int var25 = 0; var25 < var5; var25++) {
            int var31 = var25 * var22;
            int var10 = var25 == var5 - 1 ? this.field33565 : var31 + var22;
            var19[var25] = Class7008.method21729(new Class746(this, var31, var10, var1, var2));
         }

         try {
            Class7008.method21730(var19);
         } catch (InterruptedException var15) {
            Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var15);
         } catch (ExecutionException var16) {
            Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var16);
         }

         for (int var26 = 0; var26 < var5; var26++) {
            int var32 = var26 * var22;
            int var34 = var26 == var5 - 1 ? this.field33565 : var32 + var22;
            var19[var26] = Class7008.method21729(new Class1417(this, var32, var34, var1, var2));
         }

         try {
            Class7008.method21730(var19);
         } catch (InterruptedException var13) {
            Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var13);
         } catch (ExecutionException var14) {
            Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var14);
         }

         var22 = this.field33567 / var5;

         for (int var27 = 0; var27 < var5; var27++) {
            int var33 = var27 * var22;
            int var35 = var27 == var5 - 1 ? this.field33567 : var33 + var22;
            var19[var27] = Class7008.method21729(new Class662(this, var33, var35, var1, var2));
         }

         try {
            Class7008.method21730(var19);
         } catch (InterruptedException var11) {
            Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var11);
         } catch (ExecutionException var12) {
            Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var12);
         }
      } else {
         for (int var6 = 0; var6 < this.field33565; var6++) {
            for (int var7 = 0; var7 < this.field33567; var7++) {
               this.field33577.method29627(var1[var6][var7], var2);
            }
         }

         float[] var17 = new float[this.field33567];

         for (int var20 = 0; var20 < this.field33565; var20++) {
            for (int var8 = 0; var8 < this.field33569; var8++) {
               for (int var9 = 0; var9 < this.field33567; var9++) {
                  var17[var9] = var1[var20][var9][var8];
               }

               this.field33576.method29627(var17, var2);

               for (int var28 = 0; var28 < this.field33567; var28++) {
                  var1[var20][var28][var8] = var17[var28];
               }
            }
         }

         var17 = new float[this.field33565];

         for (int var21 = 0; var21 < this.field33567; var21++) {
            for (int var24 = 0; var24 < this.field33569; var24++) {
               for (int var29 = 0; var29 < this.field33565; var29++) {
                  var17[var29] = var1[var29][var21][var24];
               }

               this.field33575.method29627(var17, var2);

               for (int var30 = 0; var30 < this.field33565; var30++) {
                  var1[var30][var21][var24] = var17[var30];
               }
            }
         }
      }
   }

   public void method26164(float[] var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field33578) {
         if (var5 > 1 && this.field33579) {
            this.method26173(1, var1, var2);
            this.method26176(1, var1, var2);
         } else {
            this.method26167(1, var1, var2);
            this.method26170(1, var1, var2);
         }
      } else if (var5 > 1 && this.field33579 && this.field33565 >= var5 && this.field33567 >= var5 && this.field33569 >= var5) {
         Future[] var20 = new Future[var5];
         int var23 = this.field33565 / var5;

         for (int var27 = 0; var27 < var5; var27++) {
            int var31 = var27 * var23;
            int var37 = var27 == var5 - 1 ? this.field33565 : var31 + var23;
            var20[var27] = Class7008.method21729(new Class325(this, var31, var37, var1, var2));
         }

         try {
            Class7008.method21730(var20);
         } catch (InterruptedException var16) {
            Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var16);
         } catch (ExecutionException var17) {
            Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var17);
         }

         for (int var28 = 0; var28 < var5; var28++) {
            int var32 = var28 * var23;
            int var38 = var28 == var5 - 1 ? this.field33565 : var32 + var23;
            var20[var28] = Class7008.method21729(new Class465(this, var32, var38, var1, var2));
         }

         try {
            Class7008.method21730(var20);
         } catch (InterruptedException var14) {
            Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var14);
         } catch (ExecutionException var15) {
            Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var15);
         }

         var23 = this.field33567 / var5;

         for (int var29 = 0; var29 < var5; var29++) {
            int var33 = var29 * var23;
            int var39 = var29 == var5 - 1 ? this.field33567 : var33 + var23;
            var20[var29] = Class7008.method21729(new Class334(this, var33, var39, var1, var2));
         }

         try {
            Class7008.method21730(var20);
         } catch (InterruptedException var12) {
            Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var12);
         } catch (ExecutionException var13) {
            Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var13);
         }
      } else {
         for (int var6 = 0; var6 < this.field33565; var6++) {
            int var7 = var6 * this.field33571;

            for (int var8 = 0; var8 < this.field33567; var8++) {
               this.field33577.method29633(var1, var7 + var8 * this.field33573, var2);
            }
         }

         float[] var18 = new float[this.field33567];

         for (int var21 = 0; var21 < this.field33565; var21++) {
            int var25 = var21 * this.field33571;

            for (int var9 = 0; var9 < this.field33569; var9++) {
               for (int var10 = 0; var10 < this.field33567; var10++) {
                  int var11 = var25 + var10 * this.field33573 + var9;
                  var18[var10] = var1[var11];
               }

               this.field33576.method29631(var18, var2);

               for (int var34 = 0; var34 < this.field33567; var34++) {
                  int var40 = var25 + var34 * this.field33573 + var9;
                  var1[var40] = var18[var34];
               }
            }
         }

         var18 = new float[this.field33565];

         for (int var22 = 0; var22 < this.field33567; var22++) {
            int var26 = var22 * this.field33573;

            for (int var30 = 0; var30 < this.field33569; var30++) {
               for (int var35 = 0; var35 < this.field33565; var35++) {
                  int var41 = var35 * this.field33571 + var26 + var30;
                  var18[var35] = var1[var41];
               }

               this.field33575.method29631(var18, var2);

               for (int var36 = 0; var36 < this.field33565; var36++) {
                  int var42 = var36 * this.field33571 + var26 + var30;
                  var1[var42] = var18[var36];
               }
            }
         }
      }
   }

   public void method26165(Class2378 var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field33578) {
         if (var5 > 1 && this.field33579) {
            this.method26174(1, var1, var2);
            this.method26177(1, var1, var2);
         } else {
            this.method26168(1, var1, var2);
            this.method26171(1, var1, var2);
         }
      } else if (var5 > 1 && this.field33579 && this.field33566 >= (long)var5 && this.field33568 >= (long)var5 && this.field33570 >= (long)var5) {
         Future[] var33 = new Future[var5];
         long var35 = this.field33566 / (long)var5;

         for (int var9 = 0; var9 < var5; var9++) {
            long var39 = (long)var9 * var35;
            long var12 = var9 == var5 - 1 ? this.field33566 : var39 + var35;
            var33[var9] = Class7008.method21729(new Class1467(this, var39, var12, var1, var2));
         }

         try {
            Class7008.method21730(var33);
         } catch (InterruptedException var30) {
            Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var30);
         } catch (ExecutionException var31) {
            Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var31);
         }

         for (int var37 = 0; var37 < var5; var37++) {
            long var40 = (long)var37 * var35;
            long var42 = var37 == var5 - 1 ? this.field33566 : var40 + var35;
            var33[var37] = Class7008.method21729(new Class548(this, var40, var42, var1, var2));
         }

         try {
            Class7008.method21730(var33);
         } catch (InterruptedException var28) {
            Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var28);
         } catch (ExecutionException var29) {
            Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var29);
         }

         var35 = this.field33568 / (long)var5;

         for (int var38 = 0; var38 < var5; var38++) {
            long var41 = (long)var38 * var35;
            long var43 = var38 == var5 - 1 ? this.field33568 : var41 + var35;
            var33[var38] = Class7008.method21729(new Class1378(this, var41, var43, var1, var2));
         }

         try {
            Class7008.method21730(var33);
         } catch (InterruptedException var26) {
            Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var26);
         } catch (ExecutionException var27) {
            Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var27);
         }
      } else {
         for (long var14 = 0L; var14 < this.field33566; var14++) {
            long var16 = var14 * this.field33572;

            for (long var10 = 0L; var10 < this.field33568; var10++) {
               this.field33577.method29634(var1, var16 + var10 * this.field33574, var2);
            }
         }

         Class2378 var6 = new Class2378(this.field33568, false);

         for (long var7 = 0L; var7 < this.field33566; var7++) {
            long var18 = var7 * this.field33572;

            for (long var20 = 0L; var20 < this.field33570; var20++) {
               for (long var22 = 0L; var22 < this.field33568; var22++) {
                  long var24 = var18 + var22 * this.field33574 + var20;
                  var6.method9685(var22, var1.method9651(var24));
               }

               this.field33576.method29632(var6, var2);

               for (long var46 = 0L; var46 < this.field33568; var46++) {
                  long var49 = var18 + var46 * this.field33574 + var20;
                  var1.method9685(var49, var6.method9651(var46));
               }
            }
         }

         var6 = new Class2378(this.field33566, false);

         for (long var34 = 0L; var34 < this.field33568; var34++) {
            long var44 = var34 * this.field33574;

            for (long var45 = 0L; var45 < this.field33570; var45++) {
               for (long var47 = 0L; var47 < this.field33566; var47++) {
                  long var50 = var47 * this.field33572 + var44 + var45;
                  var6.method9685(var47, var1.method9651(var50));
               }

               this.field33575.method29632(var6, var2);

               for (long var48 = 0L; var48 < this.field33566; var48++) {
                  long var51 = var48 * this.field33572 + var44 + var45;
                  var1.method9685(var51, var6.method9651(var48));
               }
            }
         }
      }
   }

   public void method26166(float[][][] var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field33578) {
         if (var5 > 1 && this.field33579) {
            this.method26175(1, var1, var2);
            this.method26178(1, var1, var2);
         } else {
            this.method26169(1, var1, var2);
            this.method26172(1, var1, var2);
         }
      } else if (var5 > 1 && this.field33579 && this.field33565 >= var5 && this.field33567 >= var5 && this.field33569 >= var5) {
         Future[] var19 = new Future[var5];
         int var22 = this.field33565 / var5;

         for (int var25 = 0; var25 < var5; var25++) {
            int var31 = var25 * var22;
            int var10 = var25 == var5 - 1 ? this.field33565 : var31 + var22;
            var19[var25] = Class7008.method21729(new Class710(this, var31, var10, var1, var2));
         }

         try {
            Class7008.method21730(var19);
         } catch (InterruptedException var15) {
            Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var15);
         } catch (ExecutionException var16) {
            Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var16);
         }

         for (int var26 = 0; var26 < var5; var26++) {
            int var32 = var26 * var22;
            int var34 = var26 == var5 - 1 ? this.field33565 : var32 + var22;
            var19[var26] = Class7008.method21729(new Class704(this, var32, var34, var1, var2));
         }

         try {
            Class7008.method21730(var19);
         } catch (InterruptedException var13) {
            Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var13);
         } catch (ExecutionException var14) {
            Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var14);
         }

         var22 = this.field33567 / var5;

         for (int var27 = 0; var27 < var5; var27++) {
            int var33 = var27 * var22;
            int var35 = var27 == var5 - 1 ? this.field33567 : var33 + var22;
            var19[var27] = Class7008.method21729(new Class575(this, var33, var35, var1, var2));
         }

         try {
            Class7008.method21730(var19);
         } catch (InterruptedException var11) {
            Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var11);
         } catch (ExecutionException var12) {
            Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var12);
         }
      } else {
         for (int var6 = 0; var6 < this.field33565; var6++) {
            for (int var7 = 0; var7 < this.field33567; var7++) {
               this.field33577.method29631(var1[var6][var7], var2);
            }
         }

         float[] var17 = new float[this.field33567];

         for (int var20 = 0; var20 < this.field33565; var20++) {
            for (int var8 = 0; var8 < this.field33569; var8++) {
               for (int var9 = 0; var9 < this.field33567; var9++) {
                  var17[var9] = var1[var20][var9][var8];
               }

               this.field33576.method29631(var17, var2);

               for (int var28 = 0; var28 < this.field33567; var28++) {
                  var1[var20][var28][var8] = var17[var28];
               }
            }
         }

         var17 = new float[this.field33565];

         for (int var21 = 0; var21 < this.field33567; var21++) {
            for (int var24 = 0; var24 < this.field33569; var24++) {
               for (int var29 = 0; var29 < this.field33565; var29++) {
                  var17[var29] = var1[var29][var21][var24];
               }

               this.field33575.method29631(var17, var2);

               for (int var30 = 0; var30 < this.field33565; var30++) {
                  var1[var30][var21][var24] = var17[var30];
               }
            }
         }
      }
   }

   private void method26167(int var1, float[] var2, boolean var3) {
      int var6 = 4 * this.field33567;
      if (this.field33569 == 2) {
         var6 >>= 1;
      }

      float[] var7 = new float[var6];
      if (var1 != -1) {
         for (int var8 = 0; var8 < this.field33565; var8++) {
            int var9 = var8 * this.field33571;

            for (int var10 = 0; var10 < this.field33567; var10++) {
               this.field33577.method29633(var2, var9 + var10 * this.field33573, var3);
            }

            if (this.field33569 <= 2) {
               if (this.field33569 == 2) {
                  for (int var17 = 0; var17 < this.field33567; var17++) {
                     int var27 = var9 + var17 * this.field33573;
                     var7[var17] = var2[var27];
                     var7[this.field33567 + var17] = var2[var27 + 1];
                  }

                  this.field33576.method29633(var7, 0, var3);
                  this.field33576.method29633(var7, this.field33567, var3);

                  for (int var18 = 0; var18 < this.field33567; var18++) {
                     int var28 = var9 + var18 * this.field33573;
                     var2[var28] = var7[var18];
                     var2[var28 + 1] = var7[this.field33567 + var18];
                  }
               }
            } else {
               for (int var16 = 0; var16 < this.field33569; var16 += 4) {
                  for (int var11 = 0; var11 < this.field33567; var11++) {
                     int var12 = var9 + var11 * this.field33573 + var16;
                     int var13 = this.field33567 + var11;
                     var7[var11] = var2[var12];
                     var7[var13] = var2[var12 + 1];
                     var7[var13 + this.field33567] = var2[var12 + 2];
                     var7[var13 + 2 * this.field33567] = var2[var12 + 3];
                  }

                  this.field33576.method29633(var7, 0, var3);
                  this.field33576.method29633(var7, this.field33567, var3);
                  this.field33576.method29633(var7, 2 * this.field33567, var3);
                  this.field33576.method29633(var7, 3 * this.field33567, var3);

                  for (int var23 = 0; var23 < this.field33567; var23++) {
                     int var26 = var9 + var23 * this.field33573 + var16;
                     int var33 = this.field33567 + var23;
                     var2[var26] = var7[var23];
                     var2[var26 + 1] = var7[var33];
                     var2[var26 + 2] = var7[var33 + this.field33567];
                     var2[var26 + 3] = var7[var33 + 2 * this.field33567];
                  }
               }
            }
         }
      } else {
         for (int var14 = 0; var14 < this.field33565; var14++) {
            int var15 = var14 * this.field33571;

            for (int var19 = 0; var19 < this.field33567; var19++) {
               this.field33577.method29629(var2, var15 + var19 * this.field33573, var3);
            }

            if (this.field33569 <= 2) {
               if (this.field33569 == 2) {
                  for (int var21 = 0; var21 < this.field33567; var21++) {
                     int var31 = var15 + var21 * this.field33573;
                     var7[var21] = var2[var31];
                     var7[this.field33567 + var21] = var2[var31 + 1];
                  }

                  this.field33576.method29629(var7, 0, var3);
                  this.field33576.method29629(var7, this.field33567, var3);

                  for (int var22 = 0; var22 < this.field33567; var22++) {
                     int var32 = var15 + var22 * this.field33573;
                     var2[var32] = var7[var22];
                     var2[var32 + 1] = var7[this.field33567 + var22];
                  }
               }
            } else {
               for (int var20 = 0; var20 < this.field33569; var20 += 4) {
                  for (int var24 = 0; var24 < this.field33567; var24++) {
                     int var29 = var15 + var24 * this.field33573 + var20;
                     int var34 = this.field33567 + var24;
                     var7[var24] = var2[var29];
                     var7[var34] = var2[var29 + 1];
                     var7[var34 + this.field33567] = var2[var29 + 2];
                     var7[var34 + 2 * this.field33567] = var2[var29 + 3];
                  }

                  this.field33576.method29629(var7, 0, var3);
                  this.field33576.method29629(var7, this.field33567, var3);
                  this.field33576.method29629(var7, 2 * this.field33567, var3);
                  this.field33576.method29629(var7, 3 * this.field33567, var3);

                  for (int var25 = 0; var25 < this.field33567; var25++) {
                     int var30 = var15 + var25 * this.field33573 + var20;
                     int var35 = this.field33567 + var25;
                     var2[var30] = var7[var25];
                     var2[var30 + 1] = var7[var35];
                     var2[var30 + 2] = var7[var35 + this.field33567];
                     var2[var30 + 3] = var7[var35 + 2 * this.field33567];
                  }
               }
            }
         }
      }
   }

   private void method26168(int var1, Class2378 var2, boolean var3) {
      long var6 = 4L * this.field33568;
      if (this.field33570 == 2L) {
         var6 >>= 1;
      }

      Class2378 var8 = new Class2378(var6);
      if (var1 != -1) {
         for (long var9 = 0L; var9 < this.field33566; var9++) {
            long var11 = var9 * this.field33572;

            for (long var13 = 0L; var13 < this.field33568; var13++) {
               this.field33577.method29634(var2, var11 + var13 * this.field33574, var3);
            }

            if (this.field33570 <= 2L) {
               if (this.field33570 == 2L) {
                  for (long var24 = 0L; var24 < this.field33568; var24++) {
                     long var34 = var11 + var24 * this.field33574;
                     var8.method9685(var24, var2.method9651(var34));
                     var8.method9685(this.field33568 + var24, var2.method9651(var34 + 1L));
                  }

                  this.field33576.method29634(var8, 0L, var3);
                  this.field33576.method29634(var8, this.field33568, var3);

                  for (long var25 = 0L; var25 < this.field33568; var25++) {
                     long var35 = var11 + var25 * this.field33574;
                     var2.method9685(var35, var8.method9651(var25));
                     var2.method9685(var35 + 1L, var8.method9651(this.field33568 + var25));
                  }
               }
            } else {
               for (long var23 = 0L; var23 < this.field33570; var23 += 4L) {
                  for (long var15 = 0L; var15 < this.field33568; var15++) {
                     long var17 = var11 + var15 * this.field33574 + var23;
                     long var19 = this.field33568 + var15;
                     var8.method9685(var15, var2.method9651(var17));
                     var8.method9685(var19, var2.method9651(var17 + 1L));
                     var8.method9685(var19 + this.field33568, var2.method9651(var17 + 2L));
                     var8.method9685(var19 + 2L * this.field33568, var2.method9651(var17 + 3L));
                  }

                  this.field33576.method29634(var8, 0L, var3);
                  this.field33576.method29634(var8, this.field33568, var3);
                  this.field33576.method29634(var8, 2L * this.field33568, var3);
                  this.field33576.method29634(var8, 3L * this.field33568, var3);

                  for (long var30 = 0L; var30 < this.field33568; var30++) {
                     long var33 = var11 + var30 * this.field33574 + var23;
                     long var40 = this.field33568 + var30;
                     var2.method9685(var33, var8.method9651(var30));
                     var2.method9685(var33 + 1L, var8.method9651(var40));
                     var2.method9685(var33 + 2L, var8.method9651(var40 + this.field33568));
                     var2.method9685(var33 + 3L, var8.method9651(var40 + 2L * this.field33568));
                  }
               }
            }
         }
      } else {
         for (long var21 = 0L; var21 < this.field33566; var21++) {
            long var22 = var21 * this.field33572;

            for (long var26 = 0L; var26 < this.field33568; var26++) {
               this.field33577.method29630(var2, var22 + var26 * this.field33574, var3);
            }

            if (this.field33570 <= 2L) {
               if (this.field33570 == 2L) {
                  for (long var28 = 0L; var28 < this.field33568; var28++) {
                     long var38 = var22 + var28 * this.field33574;
                     var8.method9685(var28, var2.method9651(var38));
                     var8.method9685(this.field33568 + var28, var2.method9651(var38 + 1L));
                  }

                  this.field33576.method29630(var8, 0L, var3);
                  this.field33576.method29630(var8, this.field33568, var3);

                  for (long var29 = 0L; var29 < this.field33568; var29++) {
                     long var39 = var22 + var29 * this.field33574;
                     var2.method9685(var39, var8.method9651(var29));
                     var2.method9685(var39 + 1L, var8.method9651(this.field33568 + var29));
                  }
               }
            } else {
               for (long var27 = 0L; var27 < this.field33570; var27 += 4L) {
                  for (long var31 = 0L; var31 < this.field33568; var31++) {
                     long var36 = var22 + var31 * this.field33574 + var27;
                     long var41 = this.field33568 + var31;
                     var8.method9685(var31, var2.method9651(var36));
                     var8.method9685(var41, var2.method9651(var36 + 1L));
                     var8.method9685(var41 + this.field33568, var2.method9651(var36 + 2L));
                     var8.method9685(var41 + 2L * this.field33568, var2.method9651(var36 + 3L));
                  }

                  this.field33576.method29630(var8, 0L, var3);
                  this.field33576.method29630(var8, this.field33568, var3);
                  this.field33576.method29630(var8, 2L * this.field33568, var3);
                  this.field33576.method29630(var8, 3L * this.field33568, var3);

                  for (long var32 = 0L; var32 < this.field33568; var32++) {
                     long var37 = var22 + var32 * this.field33574 + var27;
                     long var42 = this.field33568 + var32;
                     var2.method9685(var37, var8.method9651(var32));
                     var2.method9685(var37 + 1L, var8.method9651(var42));
                     var2.method9685(var37 + 2L, var8.method9651(var42 + this.field33568));
                     var2.method9685(var37 + 3L, var8.method9651(var42 + 2L * this.field33568));
                  }
               }
            }
         }
      }
   }

   private void method26169(int var1, float[][][] var2, boolean var3) {
      int var6 = 4 * this.field33567;
      if (this.field33569 == 2) {
         var6 >>= 1;
      }

      float[] var7 = new float[var6];
      if (var1 != -1) {
         for (int var8 = 0; var8 < this.field33565; var8++) {
            for (int var9 = 0; var9 < this.field33567; var9++) {
               this.field33577.method29631(var2[var8][var9], var3);
            }

            if (this.field33569 <= 2) {
               if (this.field33569 == 2) {
                  for (int var14 = 0; var14 < this.field33567; var14++) {
                     var7[var14] = var2[var8][var14][0];
                     var7[this.field33567 + var14] = var2[var8][var14][1];
                  }

                  this.field33576.method29633(var7, 0, var3);
                  this.field33576.method29633(var7, this.field33567, var3);

                  for (int var15 = 0; var15 < this.field33567; var15++) {
                     var2[var8][var15][0] = var7[var15];
                     var2[var8][var15][1] = var7[this.field33567 + var15];
                  }
               }
            } else {
               for (int var13 = 0; var13 < this.field33569; var13 += 4) {
                  for (int var10 = 0; var10 < this.field33567; var10++) {
                     int var11 = this.field33567 + var10;
                     var7[var10] = var2[var8][var10][var13];
                     var7[var11] = var2[var8][var10][var13 + 1];
                     var7[var11 + this.field33567] = var2[var8][var10][var13 + 2];
                     var7[var11 + 2 * this.field33567] = var2[var8][var10][var13 + 3];
                  }

                  this.field33576.method29633(var7, 0, var3);
                  this.field33576.method29633(var7, this.field33567, var3);
                  this.field33576.method29633(var7, 2 * this.field33567, var3);
                  this.field33576.method29633(var7, 3 * this.field33567, var3);

                  for (int var20 = 0; var20 < this.field33567; var20++) {
                     int var23 = this.field33567 + var20;
                     var2[var8][var20][var13] = var7[var20];
                     var2[var8][var20][var13 + 1] = var7[var23];
                     var2[var8][var20][var13 + 2] = var7[var23 + this.field33567];
                     var2[var8][var20][var13 + 3] = var7[var23 + 2 * this.field33567];
                  }
               }
            }
         }
      } else {
         for (int var12 = 0; var12 < this.field33565; var12++) {
            for (int var16 = 0; var16 < this.field33567; var16++) {
               this.field33577.method29627(var2[var12][var16], var3);
            }

            if (this.field33569 <= 2) {
               if (this.field33569 == 2) {
                  for (int var18 = 0; var18 < this.field33567; var18++) {
                     var7[var18] = var2[var12][var18][0];
                     var7[this.field33567 + var18] = var2[var12][var18][1];
                  }

                  this.field33576.method29629(var7, 0, var3);
                  this.field33576.method29629(var7, this.field33567, var3);

                  for (int var19 = 0; var19 < this.field33567; var19++) {
                     var2[var12][var19][0] = var7[var19];
                     var2[var12][var19][1] = var7[this.field33567 + var19];
                  }
               }
            } else {
               for (int var17 = 0; var17 < this.field33569; var17 += 4) {
                  for (int var21 = 0; var21 < this.field33567; var21++) {
                     int var24 = this.field33567 + var21;
                     var7[var21] = var2[var12][var21][var17];
                     var7[var24] = var2[var12][var21][var17 + 1];
                     var7[var24 + this.field33567] = var2[var12][var21][var17 + 2];
                     var7[var24 + 2 * this.field33567] = var2[var12][var21][var17 + 3];
                  }

                  this.field33576.method29629(var7, 0, var3);
                  this.field33576.method29629(var7, this.field33567, var3);
                  this.field33576.method29629(var7, 2 * this.field33567, var3);
                  this.field33576.method29629(var7, 3 * this.field33567, var3);

                  for (int var22 = 0; var22 < this.field33567; var22++) {
                     int var25 = this.field33567 + var22;
                     var2[var12][var22][var17] = var7[var22];
                     var2[var12][var22][var17 + 1] = var7[var25];
                     var2[var12][var22][var17 + 2] = var7[var25 + this.field33567];
                     var2[var12][var22][var17 + 3] = var7[var25 + 2 * this.field33567];
                  }
               }
            }
         }
      }
   }

   private void method26170(int var1, float[] var2, boolean var3) {
      int var6 = 4 * this.field33565;
      if (this.field33569 == 2) {
         var6 >>= 1;
      }

      float[] var7 = new float[var6];
      if (var1 != -1) {
         if (this.field33569 <= 2) {
            if (this.field33569 == 2) {
               for (int var8 = 0; var8 < this.field33567; var8++) {
                  int var9 = var8 * this.field33573;

                  for (int var10 = 0; var10 < this.field33565; var10++) {
                     int var12 = var10 * this.field33571 + var9;
                     var7[var10] = var2[var12];
                     var7[this.field33565 + var10] = var2[var12 + 1];
                  }

                  this.field33575.method29633(var7, 0, var3);
                  this.field33575.method29633(var7, this.field33565, var3);

                  for (int var20 = 0; var20 < this.field33565; var20++) {
                     int var28 = var20 * this.field33571 + var9;
                     var2[var28] = var7[var20];
                     var2[var28 + 1] = var7[this.field33565 + var20];
                  }
               }
            }
         } else {
            for (int var14 = 0; var14 < this.field33567; var14++) {
               int var17 = var14 * this.field33573;

               for (int var21 = 0; var21 < this.field33569; var21 += 4) {
                  for (int var11 = 0; var11 < this.field33565; var11++) {
                     int var29 = var11 * this.field33571 + var17 + var21;
                     int var13 = this.field33565 + var11;
                     var7[var11] = var2[var29];
                     var7[var13] = var2[var29 + 1];
                     var7[var13 + this.field33565] = var2[var29 + 2];
                     var7[var13 + 2 * this.field33565] = var2[var29 + 3];
                  }

                  this.field33575.method29633(var7, 0, var3);
                  this.field33575.method29633(var7, this.field33565, var3);
                  this.field33575.method29633(var7, 2 * this.field33565, var3);
                  this.field33575.method29633(var7, 3 * this.field33565, var3);

                  for (int var25 = 0; var25 < this.field33565; var25++) {
                     int var30 = var25 * this.field33571 + var17 + var21;
                     int var35 = this.field33565 + var25;
                     var2[var30] = var7[var25];
                     var2[var30 + 1] = var7[var35];
                     var2[var30 + 2] = var7[var35 + this.field33565];
                     var2[var30 + 3] = var7[var35 + 2 * this.field33565];
                  }
               }
            }
         }
      } else if (this.field33569 <= 2) {
         if (this.field33569 == 2) {
            for (int var15 = 0; var15 < this.field33567; var15++) {
               int var18 = var15 * this.field33573;

               for (int var22 = 0; var22 < this.field33565; var22++) {
                  int var31 = var22 * this.field33571 + var18;
                  var7[var22] = var2[var31];
                  var7[this.field33565 + var22] = var2[var31 + 1];
               }

               this.field33575.method29629(var7, 0, var3);
               this.field33575.method29629(var7, this.field33565, var3);

               for (int var23 = 0; var23 < this.field33565; var23++) {
                  int var32 = var23 * this.field33571 + var18;
                  var2[var32] = var7[var23];
                  var2[var32 + 1] = var7[this.field33565 + var23];
               }
            }
         }
      } else {
         for (int var16 = 0; var16 < this.field33567; var16++) {
            int var19 = var16 * this.field33573;

            for (int var24 = 0; var24 < this.field33569; var24 += 4) {
               for (int var26 = 0; var26 < this.field33565; var26++) {
                  int var33 = var26 * this.field33571 + var19 + var24;
                  int var36 = this.field33565 + var26;
                  var7[var26] = var2[var33];
                  var7[var36] = var2[var33 + 1];
                  var7[var36 + this.field33565] = var2[var33 + 2];
                  var7[var36 + 2 * this.field33565] = var2[var33 + 3];
               }

               this.field33575.method29629(var7, 0, var3);
               this.field33575.method29629(var7, this.field33565, var3);
               this.field33575.method29629(var7, 2 * this.field33565, var3);
               this.field33575.method29629(var7, 3 * this.field33565, var3);

               for (int var27 = 0; var27 < this.field33565; var27++) {
                  int var34 = var27 * this.field33571 + var19 + var24;
                  int var37 = this.field33565 + var27;
                  var2[var34] = var7[var27];
                  var2[var34 + 1] = var7[var37];
                  var2[var34 + 2] = var7[var37 + this.field33565];
                  var2[var34 + 3] = var7[var37 + 2 * this.field33565];
               }
            }
         }
      }
   }

   private void method26171(int var1, Class2378 var2, boolean var3) {
      long var6 = 4L * this.field33566;
      if (this.field33570 == 2L) {
         var6 >>= 1;
      }

      Class2378 var8 = new Class2378(var6);
      if (var1 != -1) {
         if (this.field33570 <= 2L) {
            if (this.field33570 == 2L) {
               for (long var9 = 0L; var9 < this.field33568; var9++) {
                  long var11 = var9 * this.field33574;

                  for (long var13 = 0L; var13 < this.field33566; var13++) {
                     long var17 = var13 * this.field33572 + var11;
                     var8.method9685(var13, var2.method9651(var17));
                     var8.method9685(this.field33566 + var13, var2.method9651(var17 + 1L));
                  }

                  this.field33575.method29634(var8, 0L, var3);
                  this.field33575.method29634(var8, this.field33566, var3);

                  for (long var27 = 0L; var27 < this.field33566; var27++) {
                     long var35 = var27 * this.field33572 + var11;
                     var2.method9685(var35, var8.method9651(var27));
                     var2.method9685(var35 + 1L, var8.method9651(this.field33566 + var27));
                  }
               }
            }
         } else {
            for (long var21 = 0L; var21 < this.field33568; var21++) {
               long var24 = var21 * this.field33574;

               for (long var28 = 0L; var28 < this.field33570; var28 += 4L) {
                  for (long var15 = 0L; var15 < this.field33566; var15++) {
                     long var36 = var15 * this.field33572 + var24 + var28;
                     long var19 = this.field33566 + var15;
                     var8.method9685(var15, var2.method9651(var36));
                     var8.method9685(var19, var2.method9651(var36 + 1L));
                     var8.method9685(var19 + this.field33566, var2.method9651(var36 + 2L));
                     var8.method9685(var19 + 2L * this.field33566, var2.method9651(var36 + 3L));
                  }

                  this.field33575.method29634(var8, 0L, var3);
                  this.field33575.method29634(var8, this.field33566, var3);
                  this.field33575.method29634(var8, 2L * this.field33566, var3);
                  this.field33575.method29634(var8, 3L * this.field33566, var3);

                  for (long var32 = 0L; var32 < this.field33566; var32++) {
                     long var37 = var32 * this.field33572 + var24 + var28;
                     long var42 = this.field33566 + var32;
                     var2.method9685(var37, var8.method9651(var32));
                     var2.method9685(var37 + 1L, var8.method9651(var42));
                     var2.method9685(var37 + 2L, var8.method9651(var42 + this.field33566));
                     var2.method9685(var37 + 3L, var8.method9651(var42 + 2L * this.field33566));
                  }
               }
            }
         }
      } else if (this.field33570 <= 2L) {
         if (this.field33570 == 2L) {
            for (long var22 = 0L; var22 < this.field33568; var22++) {
               long var25 = var22 * this.field33574;

               for (long var29 = 0L; var29 < this.field33566; var29++) {
                  long var38 = var29 * this.field33572 + var25;
                  var8.method9685(var29, var2.method9651(var38));
                  var8.method9685(this.field33566 + var29, var2.method9651(var38 + 1L));
               }

               this.field33575.method29630(var8, 0L, var3);
               this.field33575.method29630(var8, this.field33566, var3);

               for (long var30 = 0L; var30 < this.field33566; var30++) {
                  long var39 = var30 * this.field33572 + var25;
                  var2.method9685(var39, var8.method9651(var30));
                  var2.method9685(var39 + 1L, var8.method9651(this.field33566 + var30));
               }
            }
         }
      } else {
         for (long var23 = 0L; var23 < this.field33568; var23++) {
            long var26 = var23 * this.field33574;

            for (long var31 = 0L; var31 < this.field33570; var31 += 4L) {
               for (long var33 = 0L; var33 < this.field33566; var33++) {
                  long var40 = var33 * this.field33572 + var26 + var31;
                  long var43 = this.field33566 + var33;
                  var8.method9685(var33, var2.method9651(var40));
                  var8.method9685(var43, var2.method9651(var40 + 1L));
                  var8.method9685(var43 + this.field33566, var2.method9651(var40 + 2L));
                  var8.method9685(var43 + 2L * this.field33566, var2.method9651(var40 + 3L));
               }

               this.field33575.method29630(var8, 0L, var3);
               this.field33575.method29630(var8, this.field33566, var3);
               this.field33575.method29630(var8, 2L * this.field33566, var3);
               this.field33575.method29630(var8, 3L * this.field33566, var3);

               for (long var34 = 0L; var34 < this.field33566; var34++) {
                  long var41 = var34 * this.field33572 + var26 + var31;
                  long var44 = this.field33566 + var34;
                  var2.method9685(var41, var8.method9651(var34));
                  var2.method9685(var41 + 1L, var8.method9651(var44));
                  var2.method9685(var41 + 2L, var8.method9651(var44 + this.field33566));
                  var2.method9685(var41 + 3L, var8.method9651(var44 + 2L * this.field33566));
               }
            }
         }
      }
   }

   private void method26172(int var1, float[][][] var2, boolean var3) {
      int var6 = 4 * this.field33565;
      if (this.field33569 == 2) {
         var6 >>= 1;
      }

      float[] var7 = new float[var6];
      if (var1 != -1) {
         if (this.field33569 <= 2) {
            if (this.field33569 == 2) {
               for (int var8 = 0; var8 < this.field33567; var8++) {
                  for (int var9 = 0; var9 < this.field33565; var9++) {
                     var7[var9] = var2[var9][var8][0];
                     var7[this.field33565 + var9] = var2[var9][var8][1];
                  }

                  this.field33575.method29633(var7, 0, var3);
                  this.field33575.method29633(var7, this.field33565, var3);

                  for (int var15 = 0; var15 < this.field33565; var15++) {
                     var2[var15][var8][0] = var7[var15];
                     var2[var15][var8][1] = var7[this.field33565 + var15];
                  }
               }
            }
         } else {
            for (int var12 = 0; var12 < this.field33567; var12++) {
               for (int var16 = 0; var16 < this.field33569; var16 += 4) {
                  for (int var10 = 0; var10 < this.field33565; var10++) {
                     int var11 = this.field33565 + var10;
                     var7[var10] = var2[var10][var12][var16];
                     var7[var11] = var2[var10][var12][var16 + 1];
                     var7[var11 + this.field33565] = var2[var10][var12][var16 + 2];
                     var7[var11 + 2 * this.field33565] = var2[var10][var12][var16 + 3];
                  }

                  this.field33575.method29633(var7, 0, var3);
                  this.field33575.method29633(var7, this.field33565, var3);
                  this.field33575.method29633(var7, 2 * this.field33565, var3);
                  this.field33575.method29633(var7, 3 * this.field33565, var3);

                  for (int var20 = 0; var20 < this.field33565; var20++) {
                     int var23 = this.field33565 + var20;
                     var2[var20][var12][var16] = var7[var20];
                     var2[var20][var12][var16 + 1] = var7[var23];
                     var2[var20][var12][var16 + 2] = var7[var23 + this.field33565];
                     var2[var20][var12][var16 + 3] = var7[var23 + 2 * this.field33565];
                  }
               }
            }
         }
      } else if (this.field33569 <= 2) {
         if (this.field33569 == 2) {
            for (int var13 = 0; var13 < this.field33567; var13++) {
               for (int var17 = 0; var17 < this.field33565; var17++) {
                  var7[var17] = var2[var17][var13][0];
                  var7[this.field33565 + var17] = var2[var17][var13][1];
               }

               this.field33575.method29629(var7, 0, var3);
               this.field33575.method29629(var7, this.field33565, var3);

               for (int var18 = 0; var18 < this.field33565; var18++) {
                  var2[var18][var13][0] = var7[var18];
                  var2[var18][var13][1] = var7[this.field33565 + var18];
               }
            }
         }
      } else {
         for (int var14 = 0; var14 < this.field33567; var14++) {
            for (int var19 = 0; var19 < this.field33569; var19 += 4) {
               for (int var21 = 0; var21 < this.field33565; var21++) {
                  int var24 = this.field33565 + var21;
                  var7[var21] = var2[var21][var14][var19];
                  var7[var24] = var2[var21][var14][var19 + 1];
                  var7[var24 + this.field33565] = var2[var21][var14][var19 + 2];
                  var7[var24 + 2 * this.field33565] = var2[var21][var14][var19 + 3];
               }

               this.field33575.method29629(var7, 0, var3);
               this.field33575.method29629(var7, this.field33565, var3);
               this.field33575.method29629(var7, 2 * this.field33565, var3);
               this.field33575.method29629(var7, 3 * this.field33565, var3);

               for (int var22 = 0; var22 < this.field33565; var22++) {
                  int var25 = this.field33565 + var22;
                  var2[var22][var14][var19] = var7[var22];
                  var2[var22][var14][var19 + 1] = var7[var25];
                  var2[var22][var14][var19 + 2] = var7[var25 + this.field33565];
                  var2[var22][var14][var19 + 3] = var7[var25 + 2 * this.field33565];
               }
            }
         }
      }
   }

   private void method26173(int var1, float[] var2, boolean var3) {
      int var6 = Class7008.method21726() > this.field33565 ? this.field33565 : Class7008.method21726();
      int var7 = 4 * this.field33567;
      if (this.field33569 == 2) {
         var7 >>= 1;
      }

      Future[] var8 = new Future[var6];
      int var9 = var7;

      for (int var10 = 0; var10 < var6; var10++) {
         var8[var10] = Class7008.method21729(new Class779(this, var9, var1, var10, var6, var2, var3));
      }

      try {
         Class7008.method21730(var8);
      } catch (InterruptedException var12) {
         Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var12);
      } catch (ExecutionException var13) {
         Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var13);
      }
   }

   private void method26174(int var1, Class2378 var2, boolean var3) {
      int var6 = (int)((long)Class7008.method21726() > this.field33566 ? this.field33566 : (long)Class7008.method21726());
      long var7 = 4L * this.field33568;
      if (this.field33570 == 2L) {
         var7 >>= 1;
      }

      Future[] var9 = new Future[var6];
      long var10 = var7;

      for (int var12 = 0; var12 < var6; var12++) {
         long var13 = (long)var12;
         var9[var12] = Class7008.method21729(new Class764(this, var10, var1, var13, var6, var2, var3));
      }

      try {
         Class7008.method21730(var9);
      } catch (InterruptedException var15) {
         Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var15);
      } catch (ExecutionException var16) {
         Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var16);
      }
   }

   private void method26175(int var1, float[][][] var2, boolean var3) {
      int var6 = Class7008.method21726() > this.field33565 ? this.field33565 : Class7008.method21726();
      int var7 = 4 * this.field33567;
      if (this.field33569 == 2) {
         var7 >>= 1;
      }

      int var8 = var7;
      Future[] var9 = new Future[var6];

      for (int var10 = 0; var10 < var6; var10++) {
         var9[var10] = Class7008.method21729(new Class1488(this, var8, var1, var10, var6, var2, var3));
      }

      try {
         Class7008.method21730(var9);
      } catch (InterruptedException var12) {
         Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var12);
      } catch (ExecutionException var13) {
         Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var13);
      }
   }

   private void method26176(int var1, float[] var2, boolean var3) {
      int var6 = Class7008.method21726() > this.field33567 ? this.field33567 : Class7008.method21726();
      int var7 = 4 * this.field33565;
      if (this.field33569 == 2) {
         var7 >>= 1;
      }

      int var8 = var7;
      Future[] var9 = new Future[var6];

      for (int var10 = 0; var10 < var6; var10++) {
         var9[var10] = Class7008.method21729(new Class1372(this, var8, var1, var10, var6, var2, var3));
      }

      try {
         Class7008.method21730(var9);
      } catch (InterruptedException var12) {
         Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var12);
      } catch (ExecutionException var13) {
         Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var13);
      }
   }

   private void method26177(int var1, Class2378 var2, boolean var3) {
      int var6 = (int)((long)Class7008.method21726() > this.field33568 ? this.field33568 : (long)Class7008.method21726());
      long var7 = 4L * this.field33566;
      if (this.field33570 == 2L) {
         var7 >>= 1;
      }

      long var9 = var7;
      Future[] var11 = new Future[var6];

      for (int var12 = 0; var12 < var6; var12++) {
         long var13 = (long)var12;
         var11[var12] = Class7008.method21729(new Class772(this, var9, var1, var13, var6, var2, var3));
      }

      try {
         Class7008.method21730(var11);
      } catch (InterruptedException var15) {
         Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var15);
      } catch (ExecutionException var16) {
         Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var16);
      }
   }

   private void method26178(int var1, float[][][] var2, boolean var3) {
      int var6 = Class7008.method21726() > this.field33567 ? this.field33567 : Class7008.method21726();
      int var7 = 4 * this.field33565;
      if (this.field33569 == 2) {
         var7 >>= 1;
      }

      int var8 = var7;
      Future[] var9 = new Future[var6];

      for (int var10 = 0; var10 < var6; var10++) {
         var9[var10] = Class7008.method21729(new Class470(this, var8, var1, var10, var6, var2, var3));
      }

      try {
         Class7008.method21730(var9);
      } catch (InterruptedException var12) {
         Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var12);
      } catch (ExecutionException var13) {
         Logger.getLogger(Class7824.class.getName()).log(Level.SEVERE, null, var13);
      }
   }

   // $VF: synthetic method
   public static int method26179(Class7824 var0) {
      return var0.field33571;
   }

   // $VF: synthetic method
   public static int method26180(Class7824 var0) {
      return var0.field33567;
   }

   // $VF: synthetic method
   public static int method26181(Class7824 var0) {
      return var0.field33573;
   }

   // $VF: synthetic method
   public static Class8431 method26182(Class7824 var0) {
      return var0.field33577;
   }

   // $VF: synthetic method
   public static int method26183(Class7824 var0) {
      return var0.field33569;
   }

   // $VF: synthetic method
   public static Class8431 method26184(Class7824 var0) {
      return var0.field33576;
   }

   // $VF: synthetic method
   public static int method26185(Class7824 var0) {
      return var0.field33565;
   }

   // $VF: synthetic method
   public static Class8431 method26186(Class7824 var0) {
      return var0.field33575;
   }

   // $VF: synthetic method
   public static long method26187(Class7824 var0) {
      return var0.field33572;
   }

   // $VF: synthetic method
   public static long method26188(Class7824 var0) {
      return var0.field33568;
   }

   // $VF: synthetic method
   public static long method26189(Class7824 var0) {
      return var0.field33574;
   }

   // $VF: synthetic method
   public static long method26190(Class7824 var0) {
      return var0.field33570;
   }

   // $VF: synthetic method
   public static long method26191(Class7824 var0) {
      return var0.field33566;
   }
}
