package mapped;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class7274 {
   private int field31201;
   private long field31202;
   private int field31203;
   private long field31204;
   private int field31205;
   private long field31206;
   private int field31207;
   private long field31208;
   private int field31209;
   private long field31210;
   private Class7990 field31211;
   private Class7990 field31212;
   private Class7990 field31213;
   private boolean field31214 = false;
   private boolean field31215 = false;

   public Class7274(long var1, long var3, long var5) {
      if (var1 > 1L && var3 > 1L && var5 > 1L) {
         this.field31201 = (int)var1;
         this.field31203 = (int)var3;
         this.field31205 = (int)var5;
         this.field31202 = var1;
         this.field31204 = var3;
         this.field31206 = var5;
         this.field31207 = (int)(var3 * var5);
         this.field31209 = (int)var5;
         this.field31208 = var3 * var5;
         this.field31210 = var5;
         if (var1 * var3 * var5 >= Class7796.method25894()) {
            this.field31215 = true;
         }

         if (Class7796.method25908(var1) && Class7796.method25908(var3) && Class7796.method25908(var5)) {
            this.field31214 = true;
         }

         Class7796.method25902(2L * var1 * var3 * var5 > (long)Class2373.method9693());
         this.field31211 = new Class7990(var1);
         if (var1 != var3) {
            this.field31212 = new Class7990(var3);
         } else {
            this.field31212 = this.field31211;
         }

         if (var1 != var5) {
            if (var3 != var5) {
               this.field31213 = new Class7990(var5);
            } else {
               this.field31213 = this.field31212;
            }
         } else {
            this.field31213 = this.field31211;
         }
      } else {
         throw new IllegalArgumentException("slices, rows and columns must be greater than 1");
      }
   }

   public void method22846(double[] var1) {
      int var4 = Class7008.method21726();
      if (this.field31214) {
         int var5 = this.field31205;
         this.field31205 = 2 * this.field31205;
         this.field31207 = this.field31203 * this.field31205;
         this.field31209 = this.field31205;
         if (var4 > 1 && this.field31215) {
            this.method22881(0, -1, var1, true);
            this.method22885(-1, var1, true);
         } else {
            this.method22872(0, -1, var1, true);
            this.method22876(-1, var1, true);
         }

         this.field31205 = var5;
         this.field31207 = this.field31203 * this.field31205;
         this.field31209 = this.field31205;
      } else {
         this.field31207 = 2 * this.field31203 * this.field31205;
         this.field31209 = 2 * this.field31205;
         if (var4 > 1 && this.field31215 && this.field31201 >= var4 && this.field31203 >= var4 && this.field31205 >= var4) {
            Future[] var22 = new Future[var4];
            int var25 = this.field31201 / var4;

            for (int var29 = 0; var29 < var4; var29++) {
               int var33 = var29 * var25;
               int var37 = var29 == var4 - 1 ? this.field31201 : var33 + var25;
               var22[var29] = Class7008.method21729(new Class568(this, var33, var37, var1));
            }

            try {
               Class7008.method21730(var22);
            } catch (InterruptedException var17) {
               Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var17);
            } catch (ExecutionException var18) {
               Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var18);
            }

            for (int var30 = 0; var30 < var4; var30++) {
               int var34 = var30 * var25;
               int var38 = var30 == var4 - 1 ? this.field31201 : var34 + var25;
               var22[var30] = Class7008.method21729(new Class1375(this, var34, var38, var1));
            }

            try {
               Class7008.method21730(var22);
            } catch (InterruptedException var15) {
               Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var15);
            } catch (ExecutionException var16) {
               Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var16);
            }

            var25 = this.field31203 / var4;

            for (int var31 = 0; var31 < var4; var31++) {
               int var35 = var31 * var25;
               int var39 = var31 == var4 - 1 ? this.field31203 : var35 + var25;
               var22[var31] = Class7008.method21729(new Class1400(this, var35, var39, var1));
            }

            try {
               Class7008.method21730(var22);
            } catch (InterruptedException var13) {
               Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var13);
            } catch (ExecutionException var14) {
               Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var14);
            }
         } else {
            for (int var19 = 0; var19 < this.field31201; var19++) {
               int var6 = var19 * this.field31207;

               for (int var7 = 0; var7 < this.field31203; var7++) {
                  this.field31213.method27164(var1, var6 + var7 * this.field31209);
               }
            }

            double[] var20 = new double[2 * this.field31203];

            for (int var23 = 0; var23 < this.field31201; var23++) {
               int var27 = var23 * this.field31207;

               for (int var8 = 0; var8 < this.field31205; var8++) {
                  int var9 = 2 * var8;

                  for (int var10 = 0; var10 < this.field31203; var10++) {
                     int var11 = var27 + var9 + var10 * this.field31209;
                     int var12 = 2 * var10;
                     var20[var12] = var1[var11];
                     var20[var12 + 1] = var1[var11 + 1];
                  }

                  this.field31212.method27162(var20);

                  for (int var40 = 0; var40 < this.field31203; var40++) {
                     int var43 = var27 + var9 + var40 * this.field31209;
                     int var46 = 2 * var40;
                     var1[var43] = var20[var46];
                     var1[var43 + 1] = var20[var46 + 1];
                  }
               }
            }

            var20 = new double[2 * this.field31201];

            for (int var24 = 0; var24 < this.field31203; var24++) {
               int var28 = var24 * this.field31209;

               for (int var32 = 0; var32 < this.field31205; var32++) {
                  int var36 = 2 * var32;

                  for (int var41 = 0; var41 < this.field31201; var41++) {
                     int var44 = var41 * this.field31207 + var28 + var36;
                     int var47 = 2 * var41;
                     var20[var47] = var1[var44];
                     var20[var47 + 1] = var1[var44 + 1];
                  }

                  this.field31211.method27162(var20);

                  for (int var42 = 0; var42 < this.field31201; var42++) {
                     int var45 = var42 * this.field31207 + var28 + var36;
                     int var48 = 2 * var42;
                     var1[var45] = var20[var48];
                     var1[var45 + 1] = var20[var48 + 1];
                  }
               }
            }
         }

         this.field31207 = this.field31203 * this.field31205;
         this.field31209 = this.field31205;
      }
   }

   public void method22847(Class2381 var1) {
      int var4 = Class7008.method21726();
      if (this.field31214) {
         long var5 = this.field31206;
         this.field31206 = 2L * this.field31206;
         this.field31208 = this.field31204 * this.field31206;
         this.field31210 = this.field31206;
         if (var4 > 1 && this.field31215) {
            this.method22882(0L, -1, var1, true);
            this.method22886(-1, var1, true);
         } else {
            this.method22873(0L, -1, var1, true);
            this.method22877(-1, var1, true);
         }

         this.field31206 = var5;
         this.field31208 = this.field31204 * this.field31206;
         this.field31210 = this.field31206;
      } else {
         this.field31208 = 2L * this.field31204 * this.field31206;
         this.field31210 = 2L * this.field31206;
         if (var4 > 1 && this.field31215 && this.field31202 >= (long)var4 && this.field31204 >= (long)var4 && this.field31206 >= (long)var4) {
            Future[] var37 = new Future[var4];
            long var39 = this.field31202 / (long)var4;

            for (int var10 = 0; var10 < var4; var10++) {
               long var43 = (long)var10 * var39;
               long var13 = var10 == var4 - 1 ? this.field31202 : var43 + var39;
               var37[var10] = Class7008.method21729(new Class592(this, var43, var13, var1));
            }

            try {
               Class7008.method21730(var37);
            } catch (InterruptedException var33) {
               Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var33);
            } catch (ExecutionException var34) {
               Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var34);
            }

            for (int var41 = 0; var41 < var4; var41++) {
               long var44 = (long)var41 * var39;
               long var46 = var41 == var4 - 1 ? this.field31202 : var44 + var39;
               var37[var41] = Class7008.method21729(new Class640(this, var44, var46, var1));
            }

            try {
               Class7008.method21730(var37);
            } catch (InterruptedException var31) {
               Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var31);
            } catch (ExecutionException var32) {
               Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var32);
            }

            var39 = this.field31204 / (long)var4;

            for (int var42 = 0; var42 < var4; var42++) {
               long var45 = (long)var42 * var39;
               long var47 = var42 == var4 - 1 ? this.field31204 : var45 + var39;
               var37[var42] = Class7008.method21729(new Class687(this, var45, var47, var1));
            }

            try {
               Class7008.method21730(var37);
            } catch (InterruptedException var29) {
               Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var29);
            } catch (ExecutionException var30) {
               Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var30);
            }
         } else {
            for (long var35 = 0L; var35 < this.field31202; var35++) {
               long var15 = var35 * this.field31208;

               for (long var11 = 0L; var11 < this.field31204; var11++) {
                  this.field31213.method27165(var1, var15 + var11 * this.field31210);
               }
            }

            Class2381 var7 = new Class2381(2L * this.field31204, false);

            for (long var8 = 0L; var8 < this.field31202; var8++) {
               long var17 = var8 * this.field31208;

               for (long var19 = 0L; var19 < this.field31206; var19++) {
                  long var21 = 2L * var19;

                  for (long var23 = 0L; var23 < this.field31204; var23++) {
                     long var25 = var17 + var21 + var23 * this.field31210;
                     long var27 = 2L * var23;
                     var7.method9687(var27, var1.method9653(var25));
                     var7.method9687(var27 + 1L, var1.method9653(var25 + 1L));
                  }

                  this.field31212.method27163(var7);

                  for (long var51 = 0L; var51 < this.field31204; var51++) {
                     long var54 = var17 + var21 + var51 * this.field31210;
                     long var57 = 2L * var51;
                     var1.method9687(var54, var7.method9653(var57));
                     var1.method9687(var54 + 1L, var7.method9653(var57 + 1L));
                  }
               }
            }

            var7 = new Class2381(2L * this.field31202, false);

            for (long var38 = 0L; var38 < this.field31204; var38++) {
               long var48 = var38 * this.field31210;

               for (long var49 = 0L; var49 < this.field31206; var49++) {
                  long var50 = 2L * var49;

                  for (long var52 = 0L; var52 < this.field31202; var52++) {
                     long var55 = var52 * this.field31208 + var48 + var50;
                     long var58 = 2L * var52;
                     var7.method9687(var58, var1.method9653(var55));
                     var7.method9687(var58 + 1L, var1.method9653(var55 + 1L));
                  }

                  this.field31211.method27163(var7);

                  for (long var53 = 0L; var53 < this.field31202; var53++) {
                     long var56 = var53 * this.field31208 + var48 + var50;
                     long var59 = 2L * var53;
                     var1.method9687(var56, var7.method9653(var59));
                     var1.method9687(var56 + 1L, var7.method9653(var59 + 1L));
                  }
               }
            }
         }

         this.field31208 = this.field31204 * this.field31206;
         this.field31210 = this.field31206;
      }
   }

   public void method22848(double[][][] var1) {
      int var4 = Class7008.method21726();
      if (this.field31214) {
         int var5 = this.field31205;
         this.field31205 = 2 * this.field31205;
         this.field31207 = this.field31203 * this.field31205;
         this.field31209 = this.field31205;
         if (var4 > 1 && this.field31215) {
            this.method22884(0, -1, var1, true);
            this.method22887(-1, var1, true);
         } else {
            this.method22875(0, -1, var1, true);
            this.method22878(-1, var1, true);
         }

         this.field31205 = var5;
         this.field31207 = this.field31203 * this.field31205;
         this.field31209 = this.field31205;
      } else if (var4 > 1 && this.field31215 && this.field31201 >= var4 && this.field31203 >= var4 && this.field31205 >= var4) {
         Future[] var20 = new Future[var4];
         int var23 = this.field31201 / var4;

         for (int var26 = 0; var26 < var4; var26++) {
            int var30 = var26 * var23;
            int var36 = var26 == var4 - 1 ? this.field31201 : var30 + var23;
            var20[var26] = Class7008.method21729(new Class427(this, var30, var36, var1));
         }

         try {
            Class7008.method21730(var20);
         } catch (InterruptedException var15) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var15);
         } catch (ExecutionException var16) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var16);
         }

         for (int var27 = 0; var27 < var4; var27++) {
            int var31 = var27 * var23;
            int var37 = var27 == var4 - 1 ? this.field31201 : var31 + var23;
            var20[var27] = Class7008.method21729(new Class600(this, var31, var37, var1));
         }

         try {
            Class7008.method21730(var20);
         } catch (InterruptedException var13) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var13);
         } catch (ExecutionException var14) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var14);
         }

         var23 = this.field31203 / var4;

         for (int var28 = 0; var28 < var4; var28++) {
            int var32 = var28 * var23;
            int var38 = var28 == var4 - 1 ? this.field31203 : var32 + var23;
            var20[var28] = Class7008.method21729(new Class1473(this, var32, var38, var1));
         }

         try {
            Class7008.method21730(var20);
         } catch (InterruptedException var11) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var11);
         } catch (ExecutionException var12) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var12);
         }
      } else {
         for (int var17 = 0; var17 < this.field31201; var17++) {
            for (int var6 = 0; var6 < this.field31203; var6++) {
               this.field31213.method27162(var1[var17][var6]);
            }
         }

         double[] var18 = new double[2 * this.field31203];

         for (int var21 = 0; var21 < this.field31201; var21++) {
            for (int var7 = 0; var7 < this.field31205; var7++) {
               int var8 = 2 * var7;

               for (int var9 = 0; var9 < this.field31203; var9++) {
                  int var10 = 2 * var9;
                  var18[var10] = var1[var21][var9][var8];
                  var18[var10 + 1] = var1[var21][var9][var8 + 1];
               }

               this.field31212.method27162(var18);

               for (int var33 = 0; var33 < this.field31203; var33++) {
                  int var39 = 2 * var33;
                  var1[var21][var33][var8] = var18[var39];
                  var1[var21][var33][var8 + 1] = var18[var39 + 1];
               }
            }
         }

         var18 = new double[2 * this.field31201];

         for (int var22 = 0; var22 < this.field31203; var22++) {
            for (int var25 = 0; var25 < this.field31205; var25++) {
               int var29 = 2 * var25;

               for (int var34 = 0; var34 < this.field31201; var34++) {
                  int var40 = 2 * var34;
                  var18[var40] = var1[var34][var22][var29];
                  var18[var40 + 1] = var1[var34][var22][var29 + 1];
               }

               this.field31211.method27162(var18);

               for (int var35 = 0; var35 < this.field31201; var35++) {
                  int var41 = 2 * var35;
                  var1[var35][var22][var29] = var18[var41];
                  var1[var35][var22][var29 + 1] = var18[var41 + 1];
               }
            }
         }
      }
   }

   public void method22849(double[] var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field31214) {
         int var6 = this.field31205;
         this.field31205 = 2 * this.field31205;
         this.field31207 = this.field31203 * this.field31205;
         this.field31209 = this.field31205;
         if (var5 > 1 && this.field31215) {
            this.method22881(0, 1, var1, var2);
            this.method22885(1, var1, var2);
         } else {
            this.method22872(0, 1, var1, var2);
            this.method22876(1, var1, var2);
         }

         this.field31205 = var6;
         this.field31207 = this.field31203 * this.field31205;
         this.field31209 = this.field31205;
      } else {
         this.field31207 = 2 * this.field31203 * this.field31205;
         this.field31209 = 2 * this.field31205;
         if (var5 > 1 && this.field31215 && this.field31201 >= var5 && this.field31203 >= var5 && this.field31205 >= var5) {
            Future[] var23 = new Future[var5];
            int var26 = this.field31201 / var5;

            for (int var30 = 0; var30 < var5; var30++) {
               int var34 = var30 * var26;
               int var38 = var30 == var5 - 1 ? this.field31201 : var34 + var26;
               var23[var30] = Class7008.method21729(new Class415(this, var34, var38, var1, var2));
            }

            try {
               Class7008.method21730(var23);
            } catch (InterruptedException var18) {
               Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var18);
            } catch (ExecutionException var19) {
               Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var19);
            }

            for (int var31 = 0; var31 < var5; var31++) {
               int var35 = var31 * var26;
               int var39 = var31 == var5 - 1 ? this.field31201 : var35 + var26;
               var23[var31] = Class7008.method21729(new Class680(this, var35, var39, var1, var2));
            }

            try {
               Class7008.method21730(var23);
            } catch (InterruptedException var16) {
               Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var16);
            } catch (ExecutionException var17) {
               Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var17);
            }

            var26 = this.field31203 / var5;

            for (int var32 = 0; var32 < var5; var32++) {
               int var36 = var32 * var26;
               int var40 = var32 == var5 - 1 ? this.field31203 : var36 + var26;
               var23[var32] = Class7008.method21729(new Class1373(this, var36, var40, var1, var2));
            }

            try {
               Class7008.method21730(var23);
            } catch (InterruptedException var14) {
               Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var14);
            } catch (ExecutionException var15) {
               Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var15);
            }
         } else {
            for (int var20 = 0; var20 < this.field31201; var20++) {
               int var7 = var20 * this.field31207;

               for (int var8 = 0; var8 < this.field31203; var8++) {
                  this.field31213.method27168(var1, var7 + var8 * this.field31209, var2);
               }
            }

            double[] var21 = new double[2 * this.field31203];

            for (int var24 = 0; var24 < this.field31201; var24++) {
               int var28 = var24 * this.field31207;

               for (int var9 = 0; var9 < this.field31205; var9++) {
                  int var10 = 2 * var9;

                  for (int var11 = 0; var11 < this.field31203; var11++) {
                     int var12 = var28 + var10 + var11 * this.field31209;
                     int var13 = 2 * var11;
                     var21[var13] = var1[var12];
                     var21[var13 + 1] = var1[var12 + 1];
                  }

                  this.field31212.method27166(var21, var2);

                  for (int var41 = 0; var41 < this.field31203; var41++) {
                     int var44 = var28 + var10 + var41 * this.field31209;
                     int var47 = 2 * var41;
                     var1[var44] = var21[var47];
                     var1[var44 + 1] = var21[var47 + 1];
                  }
               }
            }

            var21 = new double[2 * this.field31201];

            for (int var25 = 0; var25 < this.field31203; var25++) {
               int var29 = var25 * this.field31209;

               for (int var33 = 0; var33 < this.field31205; var33++) {
                  int var37 = 2 * var33;

                  for (int var42 = 0; var42 < this.field31201; var42++) {
                     int var45 = var42 * this.field31207 + var29 + var37;
                     int var48 = 2 * var42;
                     var21[var48] = var1[var45];
                     var21[var48 + 1] = var1[var45 + 1];
                  }

                  this.field31211.method27166(var21, var2);

                  for (int var43 = 0; var43 < this.field31201; var43++) {
                     int var46 = var43 * this.field31207 + var29 + var37;
                     int var49 = 2 * var43;
                     var1[var46] = var21[var49];
                     var1[var46 + 1] = var21[var49 + 1];
                  }
               }
            }
         }

         this.field31207 = this.field31203 * this.field31205;
         this.field31209 = this.field31205;
      }
   }

   public void method22850(Class2381 var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field31214) {
         long var6 = this.field31206;
         this.field31206 = 2L * this.field31206;
         this.field31208 = this.field31204 * this.field31206;
         this.field31210 = this.field31206;
         if (var5 > 1 && this.field31215) {
            this.method22882(0L, 1, var1, var2);
            this.method22886(1, var1, var2);
         } else {
            this.method22873(0L, 1, var1, var2);
            this.method22877(1, var1, var2);
         }

         this.field31206 = var6;
         this.field31208 = this.field31204 * this.field31206;
         this.field31210 = this.field31206;
      } else {
         this.field31208 = 2L * this.field31204 * this.field31206;
         this.field31210 = 2L * this.field31206;
         if (var5 > 1 && this.field31215 && this.field31202 >= (long)var5 && this.field31204 >= (long)var5 && this.field31206 >= (long)var5) {
            Future[] var38 = new Future[var5];
            long var40 = this.field31202 / (long)var5;

            for (int var11 = 0; var11 < var5; var11++) {
               long var44 = (long)var11 * var40;
               long var14 = var11 == var5 - 1 ? this.field31202 : var44 + var40;
               var38[var11] = Class7008.method21729(new Class1634(this, var44, var14, var1, var2));
            }

            try {
               Class7008.method21730(var38);
            } catch (InterruptedException var34) {
               Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var34);
            } catch (ExecutionException var35) {
               Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var35);
            }

            for (int var42 = 0; var42 < var5; var42++) {
               long var45 = (long)var42 * var40;
               long var47 = var42 == var5 - 1 ? this.field31202 : var45 + var40;
               var38[var42] = Class7008.method21729(new Class1393(this, var45, var47, var1, var2));
            }

            try {
               Class7008.method21730(var38);
            } catch (InterruptedException var32) {
               Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var32);
            } catch (ExecutionException var33) {
               Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var33);
            }

            var40 = this.field31204 / (long)var5;

            for (int var43 = 0; var43 < var5; var43++) {
               long var46 = (long)var43 * var40;
               long var48 = var43 == var5 - 1 ? this.field31204 : var46 + var40;
               var38[var43] = Class7008.method21729(new Class1497(this, var46, var48, var1, var2));
            }

            try {
               Class7008.method21730(var38);
            } catch (InterruptedException var30) {
               Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var30);
            } catch (ExecutionException var31) {
               Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var31);
            }
         } else {
            for (long var36 = 0L; var36 < this.field31202; var36++) {
               long var16 = var36 * this.field31208;

               for (long var12 = 0L; var12 < this.field31204; var12++) {
                  this.field31213.method27169(var1, var16 + var12 * this.field31210, var2);
               }
            }

            Class2381 var8 = new Class2381(2L * this.field31204, false);

            for (long var9 = 0L; var9 < this.field31202; var9++) {
               long var18 = var9 * this.field31208;

               for (long var20 = 0L; var20 < this.field31206; var20++) {
                  long var22 = 2L * var20;

                  for (long var24 = 0L; var24 < this.field31204; var24++) {
                     long var26 = var18 + var22 + var24 * this.field31210;
                     long var28 = 2L * var24;
                     var8.method9687(var28, var1.method9653(var26));
                     var8.method9687(var28 + 1L, var1.method9653(var26 + 1L));
                  }

                  this.field31212.method27167(var8, var2);

                  for (long var52 = 0L; var52 < this.field31204; var52++) {
                     long var55 = var18 + var22 + var52 * this.field31210;
                     long var58 = 2L * var52;
                     var1.method9687(var55, var8.method9653(var58));
                     var1.method9687(var55 + 1L, var8.method9653(var58 + 1L));
                  }
               }
            }

            var8 = new Class2381(2L * this.field31202, false);

            for (long var39 = 0L; var39 < this.field31204; var39++) {
               long var49 = var39 * this.field31210;

               for (long var50 = 0L; var50 < this.field31206; var50++) {
                  long var51 = 2L * var50;

                  for (long var53 = 0L; var53 < this.field31202; var53++) {
                     long var56 = var53 * this.field31208 + var49 + var51;
                     long var59 = 2L * var53;
                     var8.method9687(var59, var1.method9653(var56));
                     var8.method9687(var59 + 1L, var1.method9653(var56 + 1L));
                  }

                  this.field31211.method27167(var8, var2);

                  for (long var54 = 0L; var54 < this.field31202; var54++) {
                     long var57 = var54 * this.field31208 + var49 + var51;
                     long var60 = 2L * var54;
                     var1.method9687(var57, var8.method9653(var60));
                     var1.method9687(var57 + 1L, var8.method9653(var60 + 1L));
                  }
               }
            }
         }

         this.field31208 = this.field31204 * this.field31206;
         this.field31210 = this.field31206;
      }
   }

   public void method22851(double[][][] var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field31214) {
         int var6 = this.field31205;
         this.field31205 = 2 * this.field31205;
         this.field31207 = this.field31203 * this.field31205;
         this.field31209 = this.field31205;
         if (var5 > 1 && this.field31215) {
            this.method22884(0, 1, var1, var2);
            this.method22887(1, var1, var2);
         } else {
            this.method22875(0, 1, var1, var2);
            this.method22878(1, var1, var2);
         }

         this.field31205 = var6;
         this.field31207 = this.field31203 * this.field31205;
         this.field31209 = this.field31205;
      } else if (var5 > 1 && this.field31215 && this.field31201 >= var5 && this.field31203 >= var5 && this.field31205 >= var5) {
         Future[] var21 = new Future[var5];
         int var24 = this.field31201 / var5;

         for (int var27 = 0; var27 < var5; var27++) {
            int var31 = var27 * var24;
            int var37 = var27 == var5 - 1 ? this.field31201 : var31 + var24;
            var21[var27] = Class7008.method21729(new Class715(this, var31, var37, var1, var2));
         }

         try {
            Class7008.method21730(var21);
         } catch (InterruptedException var16) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var16);
         } catch (ExecutionException var17) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var17);
         }

         for (int var28 = 0; var28 < var5; var28++) {
            int var32 = var28 * var24;
            int var38 = var28 == var5 - 1 ? this.field31201 : var32 + var24;
            var21[var28] = Class7008.method21729(new Class1456(this, var32, var38, var1, var2));
         }

         try {
            Class7008.method21730(var21);
         } catch (InterruptedException var14) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var14);
         } catch (ExecutionException var15) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var15);
         }

         var24 = this.field31203 / var5;

         for (int var29 = 0; var29 < var5; var29++) {
            int var33 = var29 * var24;
            int var39 = var29 == var5 - 1 ? this.field31203 : var33 + var24;
            var21[var29] = Class7008.method21729(new Class1386(this, var33, var39, var1, var2));
         }

         try {
            Class7008.method21730(var21);
         } catch (InterruptedException var12) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var12);
         } catch (ExecutionException var13) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var13);
         }
      } else {
         for (int var18 = 0; var18 < this.field31201; var18++) {
            for (int var7 = 0; var7 < this.field31203; var7++) {
               this.field31213.method27166(var1[var18][var7], var2);
            }
         }

         double[] var19 = new double[2 * this.field31203];

         for (int var22 = 0; var22 < this.field31201; var22++) {
            for (int var8 = 0; var8 < this.field31205; var8++) {
               int var9 = 2 * var8;

               for (int var10 = 0; var10 < this.field31203; var10++) {
                  int var11 = 2 * var10;
                  var19[var11] = var1[var22][var10][var9];
                  var19[var11 + 1] = var1[var22][var10][var9 + 1];
               }

               this.field31212.method27166(var19, var2);

               for (int var34 = 0; var34 < this.field31203; var34++) {
                  int var40 = 2 * var34;
                  var1[var22][var34][var9] = var19[var40];
                  var1[var22][var34][var9 + 1] = var19[var40 + 1];
               }
            }
         }

         var19 = new double[2 * this.field31201];

         for (int var23 = 0; var23 < this.field31203; var23++) {
            for (int var26 = 0; var26 < this.field31205; var26++) {
               int var30 = 2 * var26;

               for (int var35 = 0; var35 < this.field31201; var35++) {
                  int var41 = 2 * var35;
                  var19[var41] = var1[var35][var23][var30];
                  var19[var41 + 1] = var1[var35][var23][var30 + 1];
               }

               this.field31211.method27166(var19, var2);

               for (int var36 = 0; var36 < this.field31201; var36++) {
                  int var42 = 2 * var36;
                  var1[var36][var23][var30] = var19[var42];
                  var1[var36][var23][var30 + 1] = var19[var42 + 1];
               }
            }
         }
      }
   }

   public void method22852(double[] var1) {
      if (!this.field31214) {
         throw new IllegalArgumentException("slices, rows and columns must be power of two numbers");
      } else {
         int var4 = Class7008.method21726();
         if (var4 > 1 && this.field31215) {
            this.method22879(1, -1, var1, true);
            this.method22885(-1, var1, true);
            this.method22888(1, var1);
         } else {
            this.method22870(1, -1, var1, true);
            this.method22876(-1, var1, true);
            this.method22888(1, var1);
         }
      }
   }

   public void method22853(Class2381 var1) {
      if (!this.field31214) {
         throw new IllegalArgumentException("slices, rows and columns must be power of two numbers");
      } else {
         int var4 = Class7008.method21726();
         if (var4 > 1 && this.field31215) {
            this.method22880(1L, -1, var1, true);
            this.method22886(-1, var1, true);
            this.method22889(1, var1);
         } else {
            this.method22871(1L, -1, var1, true);
            this.method22877(-1, var1, true);
            this.method22889(1, var1);
         }
      }
   }

   public void method22854(double[][][] var1) {
      if (!this.field31214) {
         throw new IllegalArgumentException("slices, rows and columns must be power of two numbers");
      } else {
         int var4 = Class7008.method21726();
         if (var4 > 1 && this.field31215) {
            this.method22883(1, -1, var1, true);
            this.method22887(-1, var1, true);
            this.method22890(1, var1);
         } else {
            this.method22874(1, -1, var1, true);
            this.method22878(-1, var1, true);
            this.method22890(1, var1);
         }
      }
   }

   public void method22855(double[] var1) {
      if (!this.field31214) {
         this.method22866(var1);
      } else {
         int var4 = Class7008.method21726();
         if (var4 > 1 && this.field31215) {
            this.method22881(1, -1, var1, true);
            this.method22885(-1, var1, true);
            this.method22888(1, var1);
         } else {
            this.method22872(1, -1, var1, true);
            this.method22876(-1, var1, true);
            this.method22888(1, var1);
         }

         this.method22892(var1);
      }
   }

   public void method22856(Class2381 var1) {
      if (!this.field31214) {
         this.method22867(var1);
      } else {
         int var4 = Class7008.method21726();
         if (var4 > 1 && this.field31215) {
            this.method22882(1L, -1, var1, true);
            this.method22886(-1, var1, true);
            this.method22889(1, var1);
         } else {
            this.method22873(1L, -1, var1, true);
            this.method22877(-1, var1, true);
            this.method22889(1, var1);
         }

         this.method22893(var1);
      }
   }

   public void method22857(double[][][] var1) {
      if (!this.field31214) {
         this.method22864(var1);
      } else {
         int var4 = Class7008.method21726();
         if (var4 > 1 && this.field31215) {
            this.method22884(1, -1, var1, true);
            this.method22887(-1, var1, true);
            this.method22890(1, var1);
         } else {
            this.method22875(1, -1, var1, true);
            this.method22878(-1, var1, true);
            this.method22890(1, var1);
         }

         this.method22891(var1);
      }
   }

   public void method22858(double[] var1, boolean var2) {
      if (!this.field31214) {
         throw new IllegalArgumentException("slices, rows and columns must be power of two numbers");
      } else {
         int var5 = Class7008.method21726();
         if (var5 > 1 && this.field31215) {
            this.method22888(-1, var1);
            this.method22885(1, var1, var2);
            this.method22879(1, 1, var1, var2);
         } else {
            this.method22888(-1, var1);
            this.method22876(1, var1, var2);
            this.method22870(1, 1, var1, var2);
         }
      }
   }

   public void method22859(Class2381 var1, boolean var2) {
      if (!this.field31214) {
         throw new IllegalArgumentException("slices, rows and columns must be power of two numbers");
      } else {
         int var5 = Class7008.method21726();
         if (var5 > 1 && this.field31215) {
            this.method22889(-1, var1);
            this.method22886(1, var1, var2);
            this.method22880(1L, 1, var1, var2);
         } else {
            this.method22889(-1, var1);
            this.method22877(1, var1, var2);
            this.method22871(1L, 1, var1, var2);
         }
      }
   }

   public void method22860(double[][][] var1, boolean var2) {
      if (!this.field31214) {
         throw new IllegalArgumentException("slices, rows and columns must be power of two numbers");
      } else {
         int var5 = Class7008.method21726();
         if (var5 > 1 && this.field31215) {
            this.method22890(-1, var1);
            this.method22887(1, var1, var2);
            this.method22883(1, 1, var1, var2);
         } else {
            this.method22890(-1, var1);
            this.method22878(1, var1, var2);
            this.method22874(1, 1, var1, var2);
         }
      }
   }

   public void method22861(double[] var1, boolean var2) {
      if (!this.field31214) {
         this.method22868(var1, var2);
      } else {
         int var5 = Class7008.method21726();
         if (var5 > 1 && this.field31215) {
            this.method22881(1, 1, var1, var2);
            this.method22885(1, var1, var2);
            this.method22888(1, var1);
         } else {
            this.method22872(1, 1, var1, var2);
            this.method22876(1, var1, var2);
            this.method22888(1, var1);
         }

         this.method22892(var1);
      }
   }

   public void method22862(Class2381 var1, boolean var2) {
      if (!this.field31214) {
         this.method22869(var1, var2);
      } else {
         int var5 = Class7008.method21726();
         if (var5 > 1 && this.field31215) {
            this.method22882(1L, 1, var1, var2);
            this.method22886(1, var1, var2);
            this.method22889(1, var1);
         } else {
            this.method22873(1L, 1, var1, var2);
            this.method22877(1, var1, var2);
            this.method22889(1, var1);
         }

         this.method22893(var1);
      }
   }

   public void method22863(double[][][] var1, boolean var2) {
      if (!this.field31214) {
         this.method22865(var1, var2);
      } else {
         int var5 = Class7008.method21726();
         if (var5 > 1 && this.field31215) {
            this.method22884(1, 1, var1, var2);
            this.method22887(1, var1, var2);
            this.method22890(1, var1);
         } else {
            this.method22875(1, 1, var1, var2);
            this.method22878(1, var1, var2);
            this.method22890(1, var1);
         }

         this.method22891(var1);
      }
   }

   private void method22864(double[][][] var1) {
      double[] var4 = new double[2 * this.field31203];
      int var5 = this.field31203 / 2 + 1;
      int var6 = 2 * this.field31205;
      int var7;
      if (this.field31203 % 2 == 0) {
         var7 = this.field31203 / 2;
      } else {
         var7 = (this.field31203 + 1) / 2;
      }

      int var8 = Class7008.method21726();
      if (var8 > 1 && this.field31215 && this.field31201 >= var8 && this.field31205 >= var8 && var5 >= var8) {
         Future[] var28 = new Future[var8];
         int var32 = this.field31201 / var8;

         for (int var37 = 0; var37 < var8; var37++) {
            int var45 = var37 * var32;
            int var53 = var37 == var8 - 1 ? this.field31201 : var45 + var32;
            var28[var37] = Class7008.method21729(new Class1502(this, var45, var53, var1));
         }

         try {
            Class7008.method21730(var28);
         } catch (InterruptedException var22) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var22);
         } catch (ExecutionException var23) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var23);
         }

         for (int var38 = 0; var38 < var8; var38++) {
            int var46 = var38 * var32;
            int var54 = var38 == var8 - 1 ? this.field31201 : var46 + var32;
            var28[var38] = Class7008.method21729(new Class1420(this, var46, var54, var1));
         }

         try {
            Class7008.method21730(var28);
         } catch (InterruptedException var20) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var20);
         } catch (ExecutionException var21) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var21);
         }

         var32 = var5 / var8;

         for (int var39 = 0; var39 < var8; var39++) {
            int var47 = var39 * var32;
            int var55 = var39 == var8 - 1 ? var5 : var47 + var32;
            var28[var39] = Class7008.method21729(new Class562(this, var47, var55, var1));
         }

         try {
            Class7008.method21730(var28);
         } catch (InterruptedException var18) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var18);
         } catch (ExecutionException var19) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var19);
         }

         var32 = this.field31201 / var8;

         for (int var40 = 0; var40 < var8; var40++) {
            int var48 = var40 * var32;
            int var56 = var40 == var8 - 1 ? this.field31201 : var48 + var32;
            var28[var40] = Class7008.method21729(new Class1443(this, var48, var56, var7, var6, var1));
         }

         try {
            Class7008.method21730(var28);
         } catch (InterruptedException var16) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var16);
         } catch (ExecutionException var17) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var17);
         }
      } else {
         for (int var9 = 0; var9 < this.field31201; var9++) {
            for (int var10 = 0; var10 < this.field31203; var10++) {
               this.field31213.method27174(var1[var9][var10]);
            }
         }

         for (int var25 = 0; var25 < this.field31201; var25++) {
            for (int var29 = 0; var29 < this.field31205; var29++) {
               int var11 = 2 * var29;

               for (int var12 = 0; var12 < this.field31203; var12++) {
                  int var13 = 2 * var12;
                  var4[var13] = var1[var25][var12][var11];
                  var4[var13 + 1] = var1[var25][var12][var11 + 1];
               }

               this.field31212.method27162(var4);

               for (int var41 = 0; var41 < this.field31203; var41++) {
                  int var49 = 2 * var41;
                  var1[var25][var41][var11] = var4[var49];
                  var1[var25][var41][var11 + 1] = var4[var49 + 1];
               }
            }
         }

         var4 = new double[2 * this.field31201];

         for (int var26 = 0; var26 < var5; var26++) {
            for (int var30 = 0; var30 < this.field31205; var30++) {
               int var35 = 2 * var30;

               for (int var42 = 0; var42 < this.field31201; var42++) {
                  int var50 = 2 * var42;
                  var4[var50] = var1[var42][var26][var35];
                  var4[var50 + 1] = var1[var42][var26][var35 + 1];
               }

               this.field31211.method27162(var4);

               for (int var43 = 0; var43 < this.field31201; var43++) {
                  int var51 = 2 * var43;
                  var1[var43][var26][var35] = var4[var51];
                  var1[var43][var26][var35 + 1] = var4[var51 + 1];
               }
            }
         }

         for (int var27 = 0; var27 < this.field31201; var27++) {
            int var31 = (this.field31201 - var27) % this.field31201;

            for (int var36 = 1; var36 < var7; var36++) {
               int var44 = this.field31203 - var36;

               for (int var52 = 0; var52 < this.field31205; var52++) {
                  int var14 = 2 * var52;
                  int var15 = var6 - var14;
                  var1[var31][var44][var15 % var6] = var1[var27][var36][var14];
                  var1[var31][var44][(var15 + 1) % var6] = -var1[var27][var36][var14 + 1];
               }
            }
         }
      }
   }

   private void method22865(double[][][] var1, boolean var2) {
      double[] var5 = new double[2 * this.field31203];
      int var6 = this.field31203 / 2 + 1;
      int var7 = 2 * this.field31205;
      int var8;
      if (this.field31203 % 2 == 0) {
         var8 = this.field31203 / 2;
      } else {
         var8 = (this.field31203 + 1) / 2;
      }

      int var9 = Class7008.method21726();
      if (var9 > 1 && this.field31215 && this.field31201 >= var9 && this.field31205 >= var9 && var6 >= var9) {
         Future[] var29 = new Future[var9];
         int var33 = this.field31201 / var9;

         for (int var38 = 0; var38 < var9; var38++) {
            int var46 = var38 * var33;
            int var54 = var38 == var9 - 1 ? this.field31201 : var46 + var33;
            var29[var38] = Class7008.method21729(new Class529(this, var46, var54, var1, var2));
         }

         try {
            Class7008.method21730(var29);
         } catch (InterruptedException var23) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var23);
         } catch (ExecutionException var24) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var24);
         }

         for (int var39 = 0; var39 < var9; var39++) {
            int var47 = var39 * var33;
            int var55 = var39 == var9 - 1 ? this.field31201 : var47 + var33;
            var29[var39] = Class7008.method21729(new Class412(this, var47, var55, var1, var2));
         }

         try {
            Class7008.method21730(var29);
         } catch (InterruptedException var21) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var21);
         } catch (ExecutionException var22) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var22);
         }

         var33 = var6 / var9;

         for (int var40 = 0; var40 < var9; var40++) {
            int var48 = var40 * var33;
            int var56 = var40 == var9 - 1 ? var6 : var48 + var33;
            var29[var40] = Class7008.method21729(new Class421(this, var48, var56, var1, var2));
         }

         try {
            Class7008.method21730(var29);
         } catch (InterruptedException var19) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var19);
         } catch (ExecutionException var20) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var20);
         }

         var33 = this.field31201 / var9;

         for (int var41 = 0; var41 < var9; var41++) {
            int var49 = var41 * var33;
            int var57 = var41 == var9 - 1 ? this.field31201 : var49 + var33;
            var29[var41] = Class7008.method21729(new Class1490(this, var49, var57, var8, var7, var1));
         }

         try {
            Class7008.method21730(var29);
         } catch (InterruptedException var17) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var17);
         } catch (ExecutionException var18) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var18);
         }
      } else {
         for (int var10 = 0; var10 < this.field31201; var10++) {
            for (int var11 = 0; var11 < this.field31203; var11++) {
               this.field31213.method27182(var1[var10][var11], var2);
            }
         }

         for (int var26 = 0; var26 < this.field31201; var26++) {
            for (int var30 = 0; var30 < this.field31205; var30++) {
               int var12 = 2 * var30;

               for (int var13 = 0; var13 < this.field31203; var13++) {
                  int var14 = 2 * var13;
                  var5[var14] = var1[var26][var13][var12];
                  var5[var14 + 1] = var1[var26][var13][var12 + 1];
               }

               this.field31212.method27166(var5, var2);

               for (int var42 = 0; var42 < this.field31203; var42++) {
                  int var50 = 2 * var42;
                  var1[var26][var42][var12] = var5[var50];
                  var1[var26][var42][var12 + 1] = var5[var50 + 1];
               }
            }
         }

         var5 = new double[2 * this.field31201];

         for (int var27 = 0; var27 < var6; var27++) {
            for (int var31 = 0; var31 < this.field31205; var31++) {
               int var36 = 2 * var31;

               for (int var43 = 0; var43 < this.field31201; var43++) {
                  int var51 = 2 * var43;
                  var5[var51] = var1[var43][var27][var36];
                  var5[var51 + 1] = var1[var43][var27][var36 + 1];
               }

               this.field31211.method27166(var5, var2);

               for (int var44 = 0; var44 < this.field31201; var44++) {
                  int var52 = 2 * var44;
                  var1[var44][var27][var36] = var5[var52];
                  var1[var44][var27][var36 + 1] = var5[var52 + 1];
               }
            }
         }

         for (int var28 = 0; var28 < this.field31201; var28++) {
            int var32 = (this.field31201 - var28) % this.field31201;

            for (int var37 = 1; var37 < var8; var37++) {
               int var45 = this.field31203 - var37;

               for (int var53 = 0; var53 < this.field31205; var53++) {
                  int var15 = 2 * var53;
                  int var16 = var7 - var15;
                  var1[var32][var45][var16 % var7] = var1[var28][var37][var15];
                  var1[var32][var45][(var16 + 1) % var7] = -var1[var28][var37][var15 + 1];
               }
            }
         }
      }
   }

   private void method22866(double[] var1) {
      int var4 = 2 * this.field31205;
      double[] var5 = new double[var4];
      int var6 = this.field31203 / 2 + 1;
      int var7;
      if (this.field31203 % 2 == 0) {
         var7 = this.field31203 / 2;
      } else {
         var7 = (this.field31203 + 1) / 2;
      }

      int var8 = 2 * this.field31207;
      int var9 = 2 * this.field31209;
      int var10 = this.field31201 / 2;
      int var11 = Class7008.method21726();
      if (var11 > 1 && this.field31215 && var10 >= var11 && this.field31205 >= var11 && var6 >= var11) {
         Future[] var42 = new Future[var11];
         int var46 = var10 / var11;

         for (int var53 = 0; var53 < var11; var53++) {
            int var58 = this.field31201 - 1 - var53 * var46;
            int var68 = var53 == var11 - 1 ? var10 + 1 : var58 - var46;
            var42[var53] = Class7008.method21729(new Class503(this, var4, var58, var68, var8, var1, var9));
         }

         try {
            Class7008.method21730(var42);
         } catch (InterruptedException var35) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var35);
         } catch (ExecutionException var36) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var36);
         }

         double[][][] var54 = new double[var10 + 1][this.field31203][var4];

         for (int var59 = 0; var59 < var11; var59++) {
            int var69 = var59 * var46;
            int var78 = var59 == var11 - 1 ? var10 + 1 : var69 + var46;
            var42[var59] = Class7008.method21729(new Class1639(this, var69, var78, var1, var54));
         }

         try {
            Class7008.method21730(var42);
         } catch (InterruptedException var33) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var33);
         } catch (ExecutionException var34) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var34);
         }

         for (int var60 = 0; var60 < var11; var60++) {
            int var70 = var60 * var46;
            int var79 = var60 == var11 - 1 ? var10 + 1 : var70 + var46;
            var42[var60] = Class7008.method21729(new Class673(this, var70, var79, var8, var54, var1, var9, var4));
         }

         try {
            Class7008.method21730(var42);
         } catch (InterruptedException var31) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var31);
         } catch (ExecutionException var32) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var32);
         }

         var46 = this.field31201 / var11;

         for (int var61 = 0; var61 < var11; var61++) {
            int var71 = var61 * var46;
            int var80 = var61 == var11 - 1 ? this.field31201 : var71 + var46;
            var42[var61] = Class7008.method21729(new Class1534(this, var71, var80, var8, var9, var1));
         }

         try {
            Class7008.method21730(var42);
         } catch (InterruptedException var29) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var29);
         } catch (ExecutionException var30) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var30);
         }

         var46 = var6 / var11;

         for (int var62 = 0; var62 < var11; var62++) {
            int var72 = var62 * var46;
            int var81 = var62 == var11 - 1 ? var6 : var72 + var46;
            var42[var62] = Class7008.method21729(new Class1551(this, var72, var81, var9, var8, var1));
         }

         try {
            Class7008.method21730(var42);
         } catch (InterruptedException var27) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var27);
         } catch (ExecutionException var28) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var28);
         }

         var46 = this.field31201 / var11;

         for (int var63 = 0; var63 < var11; var63++) {
            int var73 = var63 * var46;
            int var82 = var63 == var11 - 1 ? this.field31201 : var73 + var46;
            var42[var63] = Class7008.method21729(new Class684(this, var73, var82, var8, var7, var9, var4, var1));
         }

         try {
            Class7008.method21730(var42);
         } catch (InterruptedException var25) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var25);
         } catch (ExecutionException var26) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var26);
         }
      } else {
         for (int var12 = this.field31201 - 1; var12 >= 0; var12--) {
            int var13 = var12 * this.field31207;
            int var14 = var12 * var8;

            for (int var15 = this.field31203 - 1; var15 >= 0; var15--) {
               System.arraycopy(var1, var13 + var15 * this.field31209, var5, 0, this.field31205);
               this.field31213.method27174(var5);
               System.arraycopy(var5, 0, var1, var14 + var15 * var9, var4);
            }
         }

         var5 = new double[2 * this.field31203];

         for (int var39 = 0; var39 < this.field31201; var39++) {
            int var43 = var39 * var8;

            for (int var50 = 0; var50 < this.field31205; var50++) {
               int var55 = 2 * var50;

               for (int var16 = 0; var16 < this.field31203; var16++) {
                  int var17 = 2 * var16;
                  int var18 = var43 + var16 * var9 + var55;
                  var5[var17] = var1[var18];
                  var5[var17 + 1] = var1[var18 + 1];
               }

               this.field31212.method27162(var5);

               for (int var64 = 0; var64 < this.field31203; var64++) {
                  int var74 = 2 * var64;
                  int var83 = var43 + var64 * var9 + var55;
                  var1[var83] = var5[var74];
                  var1[var83 + 1] = var5[var74 + 1];
               }
            }
         }

         var5 = new double[2 * this.field31201];

         for (int var40 = 0; var40 < var6; var40++) {
            int var44 = var40 * var9;

            for (int var51 = 0; var51 < this.field31205; var51++) {
               int var56 = 2 * var51;

               for (int var65 = 0; var65 < this.field31201; var65++) {
                  int var75 = 2 * var65;
                  int var84 = var65 * var8 + var44 + var56;
                  var5[var75] = var1[var84];
                  var5[var75 + 1] = var1[var84 + 1];
               }

               this.field31211.method27162(var5);

               for (int var66 = 0; var66 < this.field31201; var66++) {
                  int var76 = 2 * var66;
                  int var85 = var66 * var8 + var44 + var56;
                  var1[var85] = var5[var76];
                  var1[var85 + 1] = var5[var76 + 1];
               }
            }
         }

         for (int var41 = 0; var41 < this.field31201; var41++) {
            int var45 = (this.field31201 - var41) % this.field31201;
            int var52 = var45 * var8;
            int var57 = var41 * var8;

            for (int var67 = 1; var67 < var7; var67++) {
               int var77 = this.field31203 - var67;
               int var86 = var77 * var9;
               int var19 = var67 * var9;
               int var20 = var52 + var86;

               for (int var21 = 0; var21 < this.field31205; var21++) {
                  int var22 = 2 * var21;
                  int var23 = var4 - var22;
                  int var24 = var57 + var19 + var22;
                  var1[var20 + var23 % var4] = var1[var24];
                  var1[var20 + (var23 + 1) % var4] = -var1[var24 + 1];
               }
            }
         }
      }
   }

   private void method22867(Class2381 var1) {
      long var4 = 2L * this.field31206;
      Class2381 var6 = new Class2381(var4);
      long var7 = this.field31204 / 2L + 1L;
      long var9;
      if (this.field31204 % 2L == 0L) {
         var9 = this.field31204 / 2L;
      } else {
         var9 = (this.field31204 + 1L) / 2L;
      }

      long var11 = 2L * this.field31208;
      long var13 = 2L * this.field31210;
      long var15 = this.field31202 / 2L;
      int var17 = Class7008.method21726();
      if (var17 > 1 && this.field31215 && var15 >= (long)var17 && this.field31206 >= (long)var17 && var7 >= (long)var17) {
         Future[] var18 = new Future[var17];
         long var19 = var15 / (long)var17;

         for (int var21 = 0; var21 < var17; var21++) {
            long var74 = this.field31202 - 1L - (long)var21 * var19;
            long var78 = var21 == var17 - 1 ? var15 + 1L : var74 - var19;
            var18[var21] = Class7008.method21729(new Class428(this, var4, var74, var78, var11, var1, var13));
         }

         try {
            Class7008.method21730(var18);
         } catch (InterruptedException var63) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var63);
         } catch (ExecutionException var64) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var64);
         }

         Class2381 var70 = new Class2381((var15 + 1L) * this.field31204 * var4);

         for (int var26 = 0; var26 < var17; var26++) {
            long var27 = (long)var26 * var19;
            long var29 = var26 == var17 - 1 ? var15 + 1L : var27 + var19;
            var18[var26] = Class7008.method21729(new Class665(this, var27, var29, var1, var70, var4));
         }

         try {
            Class7008.method21730(var18);
         } catch (InterruptedException var61) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var61);
         } catch (ExecutionException var62) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var62);
         }

         for (int var79 = 0; var79 < var17; var79++) {
            long var83 = (long)var79 * var19;
            long var87 = var79 == var17 - 1 ? var15 + 1L : var83 + var19;
            var18[var79] = Class7008.method21729(new Class1521(this, var83, var87, var11, var70, var4, var1, var13));
         }

         try {
            Class7008.method21730(var18);
         } catch (InterruptedException var59) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var59);
         } catch (ExecutionException var60) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var60);
         }

         var19 = this.field31202 / (long)var17;

         for (int var80 = 0; var80 < var17; var80++) {
            long var84 = (long)var80 * var19;
            long var88 = var80 == var17 - 1 ? this.field31202 : var84 + var19;
            var18[var80] = Class7008.method21729(new Class643(this, var84, var88, var11, var13, var1));
         }

         try {
            Class7008.method21730(var18);
         } catch (InterruptedException var57) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var57);
         } catch (ExecutionException var58) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var58);
         }

         var19 = var7 / (long)var17;

         for (int var81 = 0; var81 < var17; var81++) {
            long var85 = (long)var81 * var19;
            long var89 = var81 == var17 - 1 ? var7 : var85 + var19;
            var18[var81] = Class7008.method21729(new Class1597(this, var85, var89, var13, var11, var1));
         }

         try {
            Class7008.method21730(var18);
         } catch (InterruptedException var55) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var55);
         } catch (ExecutionException var56) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var56);
         }

         var19 = this.field31202 / (long)var17;

         for (int var82 = 0; var82 < var17; var82++) {
            long var86 = (long)var82 * var19;
            long var90 = var82 == var17 - 1 ? this.field31202 : var86 + var19;
            var18[var82] = Class7008.method21729(new Class658(this, var86, var90, var11, var9, var13, var4, var1));
         }

         try {
            Class7008.method21730(var18);
         } catch (InterruptedException var53) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var53);
         } catch (ExecutionException var54) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var54);
         }
      } else {
         for (long var31 = this.field31202 - 1L; var31 >= 0L; var31--) {
            long var33 = var31 * this.field31208;
            long var22 = var31 * var11;

            for (long var24 = this.field31204 - 1L; var24 >= 0L; var24--) {
               Class8133.method28177(var1, var33 + var24 * this.field31210, var6, 0L, this.field31206);
               this.field31213.method27175(var6);
               Class8133.method28177(var6, 0L, var1, var22 + var24 * var13, var4);
            }
         }

         var6 = new Class2381(2L * this.field31204, false);

         for (long var91 = 0L; var91 < this.field31202; var91++) {
            long var94 = var91 * var11;

            for (long var71 = 0L; var71 < this.field31206; var71++) {
               long var75 = 2L * var71;

               for (long var35 = 0L; var35 < this.field31204; var35++) {
                  long var37 = 2L * var35;
                  long var39 = var94 + var35 * var13 + var75;
                  var6.method9687(var37, var1.method9653(var39));
                  var6.method9687(var37 + 1L, var1.method9653(var39 + 1L));
               }

               this.field31212.method27163(var6);

               for (long var97 = 0L; var97 < this.field31204; var97++) {
                  long var101 = 2L * var97;
                  long var105 = var94 + var97 * var13 + var75;
                  var1.method9687(var105, var6.method9653(var101));
                  var1.method9687(var105 + 1L, var6.method9653(var101 + 1L));
               }
            }
         }

         var6 = new Class2381(2L * this.field31202, false);

         for (long var92 = 0L; var92 < var7; var92++) {
            long var95 = var92 * var13;

            for (long var72 = 0L; var72 < this.field31206; var72++) {
               long var76 = 2L * var72;

               for (long var98 = 0L; var98 < this.field31202; var98++) {
                  long var102 = 2L * var98;
                  long var106 = var98 * var11 + var95 + var76;
                  var6.method9687(var102, var1.method9653(var106));
                  var6.method9687(var102 + 1L, var1.method9653(var106 + 1L));
               }

               this.field31211.method27163(var6);

               for (long var99 = 0L; var99 < this.field31202; var99++) {
                  long var103 = 2L * var99;
                  long var107 = var99 * var11 + var95 + var76;
                  var1.method9687(var107, var6.method9653(var103));
                  var1.method9687(var107 + 1L, var6.method9653(var103 + 1L));
               }
            }
         }

         for (long var93 = 0L; var93 < this.field31202; var93++) {
            long var96 = (this.field31202 - var93) % this.field31202;
            long var73 = var96 * var11;
            long var77 = var93 * var11;

            for (long var100 = 1L; var100 < var9; var100++) {
               long var104 = this.field31204 - var100;
               long var108 = var104 * var13;
               long var41 = var100 * var13;
               long var43 = var73 + var108;

               for (long var45 = 0L; var45 < this.field31206; var45++) {
                  long var47 = 2L * var45;
                  long var49 = var4 - var47;
                  long var51 = var77 + var41 + var47;
                  var1.method9687(var43 + var49 % var4, var1.method9653(var51));
                  var1.method9687(var43 + (var49 + 1L) % var4, -var1.method9653(var51 + 1L));
               }
            }
         }
      }
   }

   private void method22868(double[] var1, boolean var2) {
      int var5 = 2 * this.field31205;
      double[] var6 = new double[var5];
      int var7 = this.field31203 / 2 + 1;
      int var8;
      if (this.field31203 % 2 == 0) {
         var8 = this.field31203 / 2;
      } else {
         var8 = (this.field31203 + 1) / 2;
      }

      int var9 = 2 * this.field31207;
      int var10 = 2 * this.field31209;
      int var11 = this.field31201 / 2;
      int var12 = Class7008.method21726();
      if (var12 > 1 && this.field31215 && var11 >= var12 && this.field31205 >= var12 && var7 >= var12) {
         Future[] var43 = new Future[var12];
         int var47 = var11 / var12;

         for (int var54 = 0; var54 < var12; var54++) {
            int var59 = this.field31201 - 1 - var54 * var47;
            int var69 = var54 == var12 - 1 ? var11 + 1 : var59 - var47;
            var43[var54] = Class7008.method21729(new Class410(this, var5, var59, var69, var9, var1, var2, var10));
         }

         try {
            Class7008.method21730(var43);
         } catch (InterruptedException var36) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var36);
         } catch (ExecutionException var37) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var37);
         }

         double[][][] var55 = new double[var11 + 1][this.field31203][var5];

         for (int var60 = 0; var60 < var12; var60++) {
            int var70 = var60 * var47;
            int var79 = var60 == var12 - 1 ? var11 + 1 : var70 + var47;
            var43[var60] = Class7008.method21729(new Class753(this, var70, var79, var1, var55, var2));
         }

         try {
            Class7008.method21730(var43);
         } catch (InterruptedException var34) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var34);
         } catch (ExecutionException var35) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var35);
         }

         for (int var61 = 0; var61 < var12; var61++) {
            int var71 = var61 * var47;
            int var80 = var61 == var12 - 1 ? var11 + 1 : var71 + var47;
            var43[var61] = Class7008.method21729(new Class1590(this, var71, var80, var9, var55, var1, var10, var5));
         }

         try {
            Class7008.method21730(var43);
         } catch (InterruptedException var32) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var32);
         } catch (ExecutionException var33) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var33);
         }

         var47 = this.field31201 / var12;

         for (int var62 = 0; var62 < var12; var62++) {
            int var72 = var62 * var47;
            int var81 = var62 == var12 - 1 ? this.field31201 : var72 + var47;
            var43[var62] = Class7008.method21729(new Class770(this, var72, var81, var9, var10, var1, var2));
         }

         try {
            Class7008.method21730(var43);
         } catch (InterruptedException var30) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var30);
         } catch (ExecutionException var31) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var31);
         }

         var47 = var7 / var12;

         for (int var63 = 0; var63 < var12; var63++) {
            int var73 = var63 * var47;
            int var82 = var63 == var12 - 1 ? var7 : var73 + var47;
            var43[var63] = Class7008.method21729(new Class628(this, var73, var82, var10, var9, var1, var2));
         }

         try {
            Class7008.method21730(var43);
         } catch (InterruptedException var28) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var28);
         } catch (ExecutionException var29) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var29);
         }

         var47 = this.field31201 / var12;

         for (int var64 = 0; var64 < var12; var64++) {
            int var74 = var64 * var47;
            int var83 = var64 == var12 - 1 ? this.field31201 : var74 + var47;
            var43[var64] = Class7008.method21729(new Class1480(this, var74, var83, var9, var8, var10, var5, var1));
         }

         try {
            Class7008.method21730(var43);
         } catch (InterruptedException var26) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var26);
         } catch (ExecutionException var27) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var27);
         }
      } else {
         for (int var13 = this.field31201 - 1; var13 >= 0; var13--) {
            int var14 = var13 * this.field31207;
            int var15 = var13 * var9;

            for (int var16 = this.field31203 - 1; var16 >= 0; var16--) {
               System.arraycopy(var1, var14 + var16 * this.field31209, var6, 0, this.field31205);
               this.field31213.method27182(var6, var2);
               System.arraycopy(var6, 0, var1, var15 + var16 * var10, var5);
            }
         }

         var6 = new double[2 * this.field31203];

         for (int var40 = 0; var40 < this.field31201; var40++) {
            int var44 = var40 * var9;

            for (int var51 = 0; var51 < this.field31205; var51++) {
               int var56 = 2 * var51;

               for (int var17 = 0; var17 < this.field31203; var17++) {
                  int var18 = 2 * var17;
                  int var19 = var44 + var17 * var10 + var56;
                  var6[var18] = var1[var19];
                  var6[var18 + 1] = var1[var19 + 1];
               }

               this.field31212.method27166(var6, var2);

               for (int var65 = 0; var65 < this.field31203; var65++) {
                  int var75 = 2 * var65;
                  int var84 = var44 + var65 * var10 + var56;
                  var1[var84] = var6[var75];
                  var1[var84 + 1] = var6[var75 + 1];
               }
            }
         }

         var6 = new double[2 * this.field31201];

         for (int var41 = 0; var41 < var7; var41++) {
            int var45 = var41 * var10;

            for (int var52 = 0; var52 < this.field31205; var52++) {
               int var57 = 2 * var52;

               for (int var66 = 0; var66 < this.field31201; var66++) {
                  int var76 = 2 * var66;
                  int var85 = var66 * var9 + var45 + var57;
                  var6[var76] = var1[var85];
                  var6[var76 + 1] = var1[var85 + 1];
               }

               this.field31211.method27166(var6, var2);

               for (int var67 = 0; var67 < this.field31201; var67++) {
                  int var77 = 2 * var67;
                  int var86 = var67 * var9 + var45 + var57;
                  var1[var86] = var6[var77];
                  var1[var86 + 1] = var6[var77 + 1];
               }
            }
         }

         for (int var42 = 0; var42 < this.field31201; var42++) {
            int var46 = (this.field31201 - var42) % this.field31201;
            int var53 = var46 * var9;
            int var58 = var42 * var9;

            for (int var68 = 1; var68 < var8; var68++) {
               int var78 = this.field31203 - var68;
               int var87 = var78 * var10;
               int var20 = var68 * var10;
               int var21 = var53 + var87;

               for (int var22 = 0; var22 < this.field31205; var22++) {
                  int var23 = 2 * var22;
                  int var24 = var5 - var23;
                  int var25 = var58 + var20 + var23;
                  var1[var21 + var24 % var5] = var1[var25];
                  var1[var21 + (var24 + 1) % var5] = -var1[var25 + 1];
               }
            }
         }
      }
   }

   private void method22869(Class2381 var1, boolean var2) {
      long var5 = 2L * this.field31206;
      Class2381 var7 = new Class2381(var5);
      long var8 = this.field31204 / 2L + 1L;
      long var10;
      if (this.field31204 % 2L == 0L) {
         var10 = this.field31204 / 2L;
      } else {
         var10 = (this.field31204 + 1L) / 2L;
      }

      long var12 = 2L * this.field31208;
      long var14 = 2L * this.field31210;
      long var16 = this.field31202 / 2L;
      int var18 = Class7008.method21726();
      if (var18 > 1 && this.field31215 && var16 >= (long)var18 && this.field31206 >= (long)var18 && var8 >= (long)var18) {
         Future[] var19 = new Future[var18];
         long var20 = var16 / (long)var18;

         for (int var22 = 0; var22 < var18; var22++) {
            long var75 = this.field31202 - 1L - (long)var22 * var20;
            long var79 = var22 == var18 - 1 ? var16 + 1L : var75 - var20;
            var19[var22] = Class7008.method21729(new Class564(this, var5, var75, var79, var12, var1, var2, var14));
         }

         try {
            Class7008.method21730(var19);
         } catch (InterruptedException var64) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var64);
         } catch (ExecutionException var65) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var65);
         }

         Class2381 var71 = new Class2381((var16 + 1L) * this.field31204 * var5);

         for (int var27 = 0; var27 < var18; var27++) {
            long var28 = (long)var27 * var20;
            long var30 = var27 == var18 - 1 ? var16 + 1L : var28 + var20;
            var19[var27] = Class7008.method21729(new Class1496(this, var28, var30, var1, var71, var5, var2));
         }

         try {
            Class7008.method21730(var19);
         } catch (InterruptedException var62) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var62);
         } catch (ExecutionException var63) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var63);
         }

         for (int var80 = 0; var80 < var18; var80++) {
            long var84 = (long)var80 * var20;
            long var88 = var80 == var18 - 1 ? var16 + 1L : var84 + var20;
            var19[var80] = Class7008.method21729(new Class736(this, var84, var88, var12, var71, var5, var1, var14));
         }

         try {
            Class7008.method21730(var19);
         } catch (InterruptedException var60) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var60);
         } catch (ExecutionException var61) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var61);
         }

         var20 = this.field31202 / (long)var18;

         for (int var81 = 0; var81 < var18; var81++) {
            long var85 = (long)var81 * var20;
            long var89 = var81 == var18 - 1 ? this.field31202 : var85 + var20;
            var19[var81] = Class7008.method21729(new Class766(this, var85, var89, var12, var14, var1, var2));
         }

         try {
            Class7008.method21730(var19);
         } catch (InterruptedException var58) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var58);
         } catch (ExecutionException var59) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var59);
         }

         var20 = var8 / (long)var18;

         for (int var82 = 0; var82 < var18; var82++) {
            long var86 = (long)var82 * var20;
            long var90 = var82 == var18 - 1 ? var8 : var86 + var20;
            var19[var82] = Class7008.method21729(new Class551(this, var86, var90, var14, var12, var1, var2));
         }

         try {
            Class7008.method21730(var19);
         } catch (InterruptedException var56) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var56);
         } catch (ExecutionException var57) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var57);
         }

         var20 = this.field31202 / (long)var18;

         for (int var83 = 0; var83 < var18; var83++) {
            long var87 = (long)var83 * var20;
            long var91 = var83 == var18 - 1 ? this.field31202 : var87 + var20;
            var19[var83] = Class7008.method21729(new Class464(this, var87, var91, var12, var10, var14, var5, var1));
         }

         try {
            Class7008.method21730(var19);
         } catch (InterruptedException var54) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var54);
         } catch (ExecutionException var55) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var55);
         }
      } else {
         for (long var32 = this.field31202 - 1L; var32 >= 0L; var32--) {
            long var34 = var32 * this.field31208;
            long var23 = var32 * var12;

            for (long var25 = this.field31204 - 1L; var25 >= 0L; var25--) {
               Class8133.method28177(var1, var34 + var25 * this.field31210, var7, 0L, this.field31206);
               this.field31213.method27183(var7, var2);
               Class8133.method28177(var7, 0L, var1, var23 + var25 * var14, var5);
            }
         }

         var7 = new Class2381(2L * this.field31204, false);

         for (long var92 = 0L; var92 < this.field31202; var92++) {
            long var95 = var92 * var12;

            for (long var72 = 0L; var72 < this.field31206; var72++) {
               long var76 = 2L * var72;

               for (long var36 = 0L; var36 < this.field31204; var36++) {
                  long var38 = 2L * var36;
                  long var40 = var95 + var36 * var14 + var76;
                  var7.method9687(var38, var1.method9653(var40));
                  var7.method9687(var38 + 1L, var1.method9653(var40 + 1L));
               }

               this.field31212.method27167(var7, var2);

               for (long var98 = 0L; var98 < this.field31204; var98++) {
                  long var102 = 2L * var98;
                  long var106 = var95 + var98 * var14 + var76;
                  var1.method9687(var106, var7.method9653(var102));
                  var1.method9687(var106 + 1L, var7.method9653(var102 + 1L));
               }
            }
         }

         var7 = new Class2381(2L * this.field31202, false);

         for (long var93 = 0L; var93 < var8; var93++) {
            long var96 = var93 * var14;

            for (long var73 = 0L; var73 < this.field31206; var73++) {
               long var77 = 2L * var73;

               for (long var99 = 0L; var99 < this.field31202; var99++) {
                  long var103 = 2L * var99;
                  long var107 = var99 * var12 + var96 + var77;
                  var7.method9687(var103, var1.method9653(var107));
                  var7.method9687(var103 + 1L, var1.method9653(var107 + 1L));
               }

               this.field31211.method27167(var7, var2);

               for (long var100 = 0L; var100 < this.field31202; var100++) {
                  long var104 = 2L * var100;
                  long var108 = var100 * var12 + var96 + var77;
                  var1.method9687(var108, var7.method9653(var104));
                  var1.method9687(var108 + 1L, var7.method9653(var104 + 1L));
               }
            }
         }

         for (long var94 = 0L; var94 < this.field31202; var94++) {
            long var97 = (this.field31202 - var94) % this.field31202;
            long var74 = var97 * var12;
            long var78 = var94 * var12;

            for (long var101 = 1L; var101 < var10; var101++) {
               long var105 = this.field31204 - var101;
               long var109 = var105 * var14;
               long var42 = var101 * var14;
               long var44 = var74 + var109;

               for (long var46 = 0L; var46 < this.field31206; var46++) {
                  long var48 = 2L * var46;
                  long var50 = var5 - var48;
                  long var52 = var78 + var42 + var48;
                  var1.method9687(var44 + var50 % var5, var1.method9653(var52));
                  var1.method9687(var44 + (var50 + 1L) % var5, -var1.method9653(var52 + 1L));
               }
            }
         }
      }
   }

   private void method22870(int var1, int var2, double[] var3, boolean var4) {
      int var7 = this.field31201;
      if (var7 < this.field31203) {
         var7 = this.field31203;
      }

      var7 *= 8;
      if (this.field31205 != 4) {
         if (this.field31205 < 4) {
            var7 >>= 2;
         }
      } else {
         var7 >>= 1;
      }

      double[] var8 = new double[var7];
      if (var2 != -1) {
         for (int var9 = 0; var9 < this.field31201; var9++) {
            int var10 = var9 * this.field31207;
            if (var1 == 0) {
               for (int var11 = 0; var11 < this.field31203; var11++) {
                  this.field31213.method27168(var3, var10 + var11 * this.field31209, var4);
               }
            }

            if (this.field31205 <= 4) {
               if (this.field31205 != 4) {
                  if (this.field31205 == 2) {
                     for (int var24 = 0; var24 < this.field31203; var24++) {
                        int var40 = var10 + var24 * this.field31209;
                        int var51 = 2 * var24;
                        var8[var51] = var3[var40];
                        var8[var51 + 1] = var3[var40 + 1];
                     }

                     this.field31212.method27168(var8, 0, var4);

                     for (int var25 = 0; var25 < this.field31203; var25++) {
                        int var41 = var10 + var25 * this.field31209;
                        int var52 = 2 * var25;
                        var3[var41] = var8[var52];
                        var3[var41 + 1] = var8[var52 + 1];
                     }
                  }
               } else {
                  for (int var22 = 0; var22 < this.field31203; var22++) {
                     int var38 = var10 + var22 * this.field31209;
                     int var49 = 2 * var22;
                     int var60 = 2 * this.field31203 + 2 * var22;
                     var8[var49] = var3[var38];
                     var8[var49 + 1] = var3[var38 + 1];
                     var8[var60] = var3[var38 + 2];
                     var8[var60 + 1] = var3[var38 + 3];
                  }

                  this.field31212.method27168(var8, 0, var4);
                  this.field31212.method27168(var8, 2 * this.field31203, var4);

                  for (int var23 = 0; var23 < this.field31203; var23++) {
                     int var39 = var10 + var23 * this.field31209;
                     int var50 = 2 * var23;
                     int var61 = 2 * this.field31203 + 2 * var23;
                     var3[var39] = var8[var50];
                     var3[var39 + 1] = var8[var50 + 1];
                     var3[var39 + 2] = var8[var61];
                     var3[var39 + 3] = var8[var61 + 1];
                  }
               }
            } else {
               for (int var21 = 0; var21 < this.field31205; var21 += 8) {
                  for (int var12 = 0; var12 < this.field31203; var12++) {
                     int var13 = var10 + var12 * this.field31209 + var21;
                     int var14 = 2 * var12;
                     int var15 = 2 * this.field31203 + 2 * var12;
                     int var16 = var15 + 2 * this.field31203;
                     int var17 = var16 + 2 * this.field31203;
                     var8[var14] = var3[var13];
                     var8[var14 + 1] = var3[var13 + 1];
                     var8[var15] = var3[var13 + 2];
                     var8[var15 + 1] = var3[var13 + 3];
                     var8[var16] = var3[var13 + 4];
                     var8[var16 + 1] = var3[var13 + 5];
                     var8[var17] = var3[var13 + 6];
                     var8[var17 + 1] = var3[var13 + 7];
                  }

                  this.field31212.method27168(var8, 0, var4);
                  this.field31212.method27168(var8, 2 * this.field31203, var4);
                  this.field31212.method27168(var8, 4 * this.field31203, var4);
                  this.field31212.method27168(var8, 6 * this.field31203, var4);

                  for (int var34 = 0; var34 < this.field31203; var34++) {
                     int var37 = var10 + var34 * this.field31209 + var21;
                     int var48 = 2 * var34;
                     int var59 = 2 * this.field31203 + 2 * var34;
                     int var66 = var59 + 2 * this.field31203;
                     int var69 = var66 + 2 * this.field31203;
                     var3[var37] = var8[var48];
                     var3[var37 + 1] = var8[var48 + 1];
                     var3[var37 + 2] = var8[var59];
                     var3[var37 + 3] = var8[var59 + 1];
                     var3[var37 + 4] = var8[var66];
                     var3[var37 + 5] = var8[var66 + 1];
                     var3[var37 + 6] = var8[var69];
                     var3[var37 + 7] = var8[var69 + 1];
                  }
               }
            }

            if (var1 != 0) {
               for (int var26 = 0; var26 < this.field31203; var26++) {
                  this.field31213.method27180(var3, var10 + var26 * this.field31209, var4);
               }
            }
         }
      } else {
         for (int var19 = 0; var19 < this.field31201; var19++) {
            int var20 = var19 * this.field31207;
            if (var1 != 0) {
               for (int var28 = 0; var28 < this.field31203; var28++) {
                  this.field31213.method27172(var3, var20 + var28 * this.field31209);
               }
            } else {
               for (int var27 = 0; var27 < this.field31203; var27++) {
                  this.field31213.method27164(var3, var20 + var27 * this.field31209);
               }
            }

            if (this.field31205 <= 4) {
               if (this.field31205 != 4) {
                  if (this.field31205 == 2) {
                     for (int var32 = 0; var32 < this.field31203; var32++) {
                        int var46 = var20 + var32 * this.field31209;
                        int var57 = 2 * var32;
                        var8[var57] = var3[var46];
                        var8[var57 + 1] = var3[var46 + 1];
                     }

                     this.field31212.method27164(var8, 0);

                     for (int var33 = 0; var33 < this.field31203; var33++) {
                        int var47 = var20 + var33 * this.field31209;
                        int var58 = 2 * var33;
                        var3[var47] = var8[var58];
                        var3[var47 + 1] = var8[var58 + 1];
                     }
                  }
               } else {
                  for (int var30 = 0; var30 < this.field31203; var30++) {
                     int var44 = var20 + var30 * this.field31209;
                     int var55 = 2 * var30;
                     int var64 = 2 * this.field31203 + 2 * var30;
                     var8[var55] = var3[var44];
                     var8[var55 + 1] = var3[var44 + 1];
                     var8[var64] = var3[var44 + 2];
                     var8[var64 + 1] = var3[var44 + 3];
                  }

                  this.field31212.method27164(var8, 0);
                  this.field31212.method27164(var8, 2 * this.field31203);

                  for (int var31 = 0; var31 < this.field31203; var31++) {
                     int var45 = var20 + var31 * this.field31209;
                     int var56 = 2 * var31;
                     int var65 = 2 * this.field31203 + 2 * var31;
                     var3[var45] = var8[var56];
                     var3[var45 + 1] = var8[var56 + 1];
                     var3[var45 + 2] = var8[var65];
                     var3[var45 + 3] = var8[var65 + 1];
                  }
               }
            } else {
               for (int var29 = 0; var29 < this.field31205; var29 += 8) {
                  for (int var35 = 0; var35 < this.field31203; var35++) {
                     int var42 = var20 + var35 * this.field31209 + var29;
                     int var53 = 2 * var35;
                     int var62 = 2 * this.field31203 + 2 * var35;
                     int var67 = var62 + 2 * this.field31203;
                     int var70 = var67 + 2 * this.field31203;
                     var8[var53] = var3[var42];
                     var8[var53 + 1] = var3[var42 + 1];
                     var8[var62] = var3[var42 + 2];
                     var8[var62 + 1] = var3[var42 + 3];
                     var8[var67] = var3[var42 + 4];
                     var8[var67 + 1] = var3[var42 + 5];
                     var8[var70] = var3[var42 + 6];
                     var8[var70 + 1] = var3[var42 + 7];
                  }

                  this.field31212.method27164(var8, 0);
                  this.field31212.method27164(var8, 2 * this.field31203);
                  this.field31212.method27164(var8, 4 * this.field31203);
                  this.field31212.method27164(var8, 6 * this.field31203);

                  for (int var36 = 0; var36 < this.field31203; var36++) {
                     int var43 = var20 + var36 * this.field31209 + var29;
                     int var54 = 2 * var36;
                     int var63 = 2 * this.field31203 + 2 * var36;
                     int var68 = var63 + 2 * this.field31203;
                     int var71 = var68 + 2 * this.field31203;
                     var3[var43] = var8[var54];
                     var3[var43 + 1] = var8[var54 + 1];
                     var3[var43 + 2] = var8[var63];
                     var3[var43 + 3] = var8[var63 + 1];
                     var3[var43 + 4] = var8[var68];
                     var3[var43 + 5] = var8[var68 + 1];
                     var3[var43 + 6] = var8[var71];
                     var3[var43 + 7] = var8[var71 + 1];
                  }
               }
            }
         }
      }
   }

   private void method22871(long var1, int var3, Class2381 var4, boolean var5) {
      long var8 = this.field31202;
      if (var8 < this.field31204) {
         var8 = this.field31204;
      }

      var8 *= 8L;
      if (this.field31206 != 4L) {
         if (this.field31206 < 4L) {
            var8 >>= 2;
         }
      } else {
         var8 >>= 1;
      }

      Class2381 var10 = new Class2381(var8);
      if (var3 != -1) {
         for (long var11 = 0L; var11 < this.field31202; var11++) {
            long var13 = var11 * this.field31208;
            if (var1 == 0L) {
               for (long var15 = 0L; var15 < this.field31204; var15++) {
                  this.field31213.method27169(var4, var13 + var15 * this.field31210, var5);
               }
            }

            if (this.field31206 <= 4L) {
               if (this.field31206 != 4L) {
                  if (this.field31206 == 2L) {
                     for (long var35 = 0L; var35 < this.field31204; var35++) {
                        long var51 = var13 + var35 * this.field31210;
                        long var62 = 2L * var35;
                        var10.method9687(var62, var4.method9653(var51));
                        var10.method9687(var62 + 1L, var4.method9653(var51 + 1L));
                     }

                     this.field31212.method27169(var10, 0L, var5);

                     for (long var36 = 0L; var36 < this.field31204; var36++) {
                        long var52 = var13 + var36 * this.field31210;
                        long var63 = 2L * var36;
                        var4.method9687(var52, var10.method9653(var63));
                        var4.method9687(var52 + 1L, var10.method9653(var63 + 1L));
                     }
                  }
               } else {
                  for (long var33 = 0L; var33 < this.field31204; var33++) {
                     long var49 = var13 + var33 * this.field31210;
                     long var60 = 2L * var33;
                     long var71 = 2L * this.field31204 + 2L * var33;
                     var10.method9687(var60, var4.method9653(var49));
                     var10.method9687(var60 + 1L, var4.method9653(var49 + 1L));
                     var10.method9687(var71, var4.method9653(var49 + 2L));
                     var10.method9687(var71 + 1L, var4.method9653(var49 + 3L));
                  }

                  this.field31212.method27169(var10, 0L, var5);
                  this.field31212.method27169(var10, 2L * this.field31204, var5);

                  for (long var34 = 0L; var34 < this.field31204; var34++) {
                     long var50 = var13 + var34 * this.field31210;
                     long var61 = 2L * var34;
                     long var72 = 2L * this.field31204 + 2L * var34;
                     var4.method9687(var50, var10.method9653(var61));
                     var4.method9687(var50 + 1L, var10.method9653(var61 + 1L));
                     var4.method9687(var50 + 2L, var10.method9653(var72));
                     var4.method9687(var50 + 3L, var10.method9653(var72 + 1L));
                  }
               }
            } else {
               for (long var32 = 0L; var32 < this.field31206; var32 += 8L) {
                  for (long var17 = 0L; var17 < this.field31204; var17++) {
                     long var19 = var13 + var17 * this.field31210 + var32;
                     long var21 = 2L * var17;
                     long var23 = 2L * this.field31204 + 2L * var17;
                     long var25 = var23 + 2L * this.field31204;
                     long var27 = var25 + 2L * this.field31204;
                     var10.method9687(var21, var4.method9653(var19));
                     var10.method9687(var21 + 1L, var4.method9653(var19 + 1L));
                     var10.method9687(var23, var4.method9653(var19 + 2L));
                     var10.method9687(var23 + 1L, var4.method9653(var19 + 3L));
                     var10.method9687(var25, var4.method9653(var19 + 4L));
                     var10.method9687(var25 + 1L, var4.method9653(var19 + 5L));
                     var10.method9687(var27, var4.method9653(var19 + 6L));
                     var10.method9687(var27 + 1L, var4.method9653(var19 + 7L));
                  }

                  this.field31212.method27169(var10, 0L, var5);
                  this.field31212.method27169(var10, 2L * this.field31204, var5);
                  this.field31212.method27169(var10, 4L * this.field31204, var5);
                  this.field31212.method27169(var10, 6L * this.field31204, var5);

                  for (long var45 = 0L; var45 < this.field31204; var45++) {
                     long var48 = var13 + var45 * this.field31210 + var32;
                     long var59 = 2L * var45;
                     long var70 = 2L * this.field31204 + 2L * var45;
                     long var77 = var70 + 2L * this.field31204;
                     long var80 = var77 + 2L * this.field31204;
                     var4.method9687(var48, var10.method9653(var59));
                     var4.method9687(var48 + 1L, var10.method9653(var59 + 1L));
                     var4.method9687(var48 + 2L, var10.method9653(var70));
                     var4.method9687(var48 + 3L, var10.method9653(var70 + 1L));
                     var4.method9687(var48 + 4L, var10.method9653(var77));
                     var4.method9687(var48 + 5L, var10.method9653(var77 + 1L));
                     var4.method9687(var48 + 6L, var10.method9653(var80));
                     var4.method9687(var48 + 7L, var10.method9653(var80 + 1L));
                  }
               }
            }

            if (var1 != 0L) {
               for (long var37 = 0L; var37 < this.field31204; var37++) {
                  this.field31213.method27181(var4, var13 + var37 * this.field31210, var5);
               }
            }
         }
      } else {
         for (long var30 = 0L; var30 < this.field31202; var30++) {
            long var31 = var30 * this.field31208;
            if (var1 != 0L) {
               for (long var39 = 0L; var39 < this.field31204; var39++) {
                  this.field31213.method27173(var4, var31 + var39 * this.field31210);
               }
            } else {
               for (long var38 = 0L; var38 < this.field31204; var38++) {
                  this.field31213.method27165(var4, var31 + var38 * this.field31210);
               }
            }

            if (this.field31206 <= 4L) {
               if (this.field31206 != 4L) {
                  if (this.field31206 == 2L) {
                     for (long var43 = 0L; var43 < this.field31204; var43++) {
                        long var57 = var31 + var43 * this.field31210;
                        long var68 = 2L * var43;
                        var10.method9687(var68, var4.method9653(var57));
                        var10.method9687(var68 + 1L, var4.method9653(var57 + 1L));
                     }

                     this.field31212.method27165(var10, 0L);

                     for (long var44 = 0L; var44 < this.field31204; var44++) {
                        long var58 = var31 + var44 * this.field31210;
                        long var69 = 2L * var44;
                        var4.method9687(var58, var10.method9653(var69));
                        var4.method9687(var58 + 1L, var10.method9653(var69 + 1L));
                     }
                  }
               } else {
                  for (long var41 = 0L; var41 < this.field31204; var41++) {
                     long var55 = var31 + var41 * this.field31210;
                     long var66 = 2L * var41;
                     long var75 = 2L * this.field31204 + 2L * var41;
                     var10.method9687(var66, var4.method9653(var55));
                     var10.method9687(var66 + 1L, var4.method9653(var55 + 1L));
                     var10.method9687(var75, var4.method9653(var55 + 2L));
                     var10.method9687(var75 + 1L, var4.method9653(var55 + 3L));
                  }

                  this.field31212.method27165(var10, 0L);
                  this.field31212.method27165(var10, 2L * this.field31204);

                  for (long var42 = 0L; var42 < this.field31204; var42++) {
                     long var56 = var31 + var42 * this.field31210;
                     long var67 = 2L * var42;
                     long var76 = 2L * this.field31204 + 2L * var42;
                     var4.method9687(var56, var10.method9653(var67));
                     var4.method9687(var56 + 1L, var10.method9653(var67 + 1L));
                     var4.method9687(var56 + 2L, var10.method9653(var76));
                     var4.method9687(var56 + 3L, var10.method9653(var76 + 1L));
                  }
               }
            } else {
               for (long var40 = 0L; var40 < this.field31206; var40 += 8L) {
                  for (long var46 = 0L; var46 < this.field31204; var46++) {
                     long var53 = var31 + var46 * this.field31210 + var40;
                     long var64 = 2L * var46;
                     long var73 = 2L * this.field31204 + 2L * var46;
                     long var78 = var73 + 2L * this.field31204;
                     long var81 = var78 + 2L * this.field31204;
                     var10.method9687(var64, var4.method9653(var53));
                     var10.method9687(var64 + 1L, var4.method9653(var53 + 1L));
                     var10.method9687(var73, var4.method9653(var53 + 2L));
                     var10.method9687(var73 + 1L, var4.method9653(var53 + 3L));
                     var10.method9687(var78, var4.method9653(var53 + 4L));
                     var10.method9687(var78 + 1L, var4.method9653(var53 + 5L));
                     var10.method9687(var81, var4.method9653(var53 + 6L));
                     var10.method9687(var81 + 1L, var4.method9653(var53 + 7L));
                  }

                  this.field31212.method27165(var10, 0L);
                  this.field31212.method27165(var10, 2L * this.field31204);
                  this.field31212.method27165(var10, 4L * this.field31204);
                  this.field31212.method27165(var10, 6L * this.field31204);

                  for (long var47 = 0L; var47 < this.field31204; var47++) {
                     long var54 = var31 + var47 * this.field31210 + var40;
                     long var65 = 2L * var47;
                     long var74 = 2L * this.field31204 + 2L * var47;
                     long var79 = var74 + 2L * this.field31204;
                     long var82 = var79 + 2L * this.field31204;
                     var4.method9687(var54, var10.method9653(var65));
                     var4.method9687(var54 + 1L, var10.method9653(var65 + 1L));
                     var4.method9687(var54 + 2L, var10.method9653(var74));
                     var4.method9687(var54 + 3L, var10.method9653(var74 + 1L));
                     var4.method9687(var54 + 4L, var10.method9653(var79));
                     var4.method9687(var54 + 5L, var10.method9653(var79 + 1L));
                     var4.method9687(var54 + 6L, var10.method9653(var82));
                     var4.method9687(var54 + 7L, var10.method9653(var82 + 1L));
                  }
               }
            }
         }
      }
   }

   private void method22872(int var1, int var2, double[] var3, boolean var4) {
      int var7 = this.field31201;
      if (var7 < this.field31203) {
         var7 = this.field31203;
      }

      var7 *= 8;
      if (this.field31205 != 4) {
         if (this.field31205 < 4) {
            var7 >>= 2;
         }
      } else {
         var7 >>= 1;
      }

      double[] var8 = new double[var7];
      if (var2 != -1) {
         for (int var9 = 0; var9 < this.field31201; var9++) {
            int var10 = var9 * this.field31207;
            if (var1 != 0) {
               for (int var21 = 0; var21 < this.field31203; var21++) {
                  this.field31213.method27186(var3, var10 + var21 * this.field31209, var4);
               }
            } else {
               for (int var11 = 0; var11 < this.field31203; var11++) {
                  this.field31213.method27168(var3, var10 + var11 * this.field31209, var4);
               }
            }

            if (this.field31205 <= 4) {
               if (this.field31205 != 4) {
                  if (this.field31205 == 2) {
                     for (int var25 = 0; var25 < this.field31203; var25++) {
                        int var40 = var10 + var25 * this.field31209;
                        int var51 = 2 * var25;
                        var8[var51] = var3[var40];
                        var8[var51 + 1] = var3[var40 + 1];
                     }

                     this.field31212.method27168(var8, 0, var4);

                     for (int var26 = 0; var26 < this.field31203; var26++) {
                        int var41 = var10 + var26 * this.field31209;
                        int var52 = 2 * var26;
                        var3[var41] = var8[var52];
                        var3[var41 + 1] = var8[var52 + 1];
                     }
                  }
               } else {
                  for (int var23 = 0; var23 < this.field31203; var23++) {
                     int var38 = var10 + var23 * this.field31209;
                     int var49 = 2 * var23;
                     int var60 = 2 * this.field31203 + 2 * var23;
                     var8[var49] = var3[var38];
                     var8[var49 + 1] = var3[var38 + 1];
                     var8[var60] = var3[var38 + 2];
                     var8[var60 + 1] = var3[var38 + 3];
                  }

                  this.field31212.method27168(var8, 0, var4);
                  this.field31212.method27168(var8, 2 * this.field31203, var4);

                  for (int var24 = 0; var24 < this.field31203; var24++) {
                     int var39 = var10 + var24 * this.field31209;
                     int var50 = 2 * var24;
                     int var61 = 2 * this.field31203 + 2 * var24;
                     var3[var39] = var8[var50];
                     var3[var39 + 1] = var8[var50 + 1];
                     var3[var39 + 2] = var8[var61];
                     var3[var39 + 3] = var8[var61 + 1];
                  }
               }
            } else {
               for (int var22 = 0; var22 < this.field31205; var22 += 8) {
                  for (int var12 = 0; var12 < this.field31203; var12++) {
                     int var13 = var10 + var12 * this.field31209 + var22;
                     int var14 = 2 * var12;
                     int var15 = 2 * this.field31203 + 2 * var12;
                     int var16 = var15 + 2 * this.field31203;
                     int var17 = var16 + 2 * this.field31203;
                     var8[var14] = var3[var13];
                     var8[var14 + 1] = var3[var13 + 1];
                     var8[var15] = var3[var13 + 2];
                     var8[var15 + 1] = var3[var13 + 3];
                     var8[var16] = var3[var13 + 4];
                     var8[var16 + 1] = var3[var13 + 5];
                     var8[var17] = var3[var13 + 6];
                     var8[var17 + 1] = var3[var13 + 7];
                  }

                  this.field31212.method27168(var8, 0, var4);
                  this.field31212.method27168(var8, 2 * this.field31203, var4);
                  this.field31212.method27168(var8, 4 * this.field31203, var4);
                  this.field31212.method27168(var8, 6 * this.field31203, var4);

                  for (int var34 = 0; var34 < this.field31203; var34++) {
                     int var37 = var10 + var34 * this.field31209 + var22;
                     int var48 = 2 * var34;
                     int var59 = 2 * this.field31203 + 2 * var34;
                     int var66 = var59 + 2 * this.field31203;
                     int var69 = var66 + 2 * this.field31203;
                     var3[var37] = var8[var48];
                     var3[var37 + 1] = var8[var48 + 1];
                     var3[var37 + 2] = var8[var59];
                     var3[var37 + 3] = var8[var59 + 1];
                     var3[var37 + 4] = var8[var66];
                     var3[var37 + 5] = var8[var66 + 1];
                     var3[var37 + 6] = var8[var69];
                     var3[var37 + 7] = var8[var69 + 1];
                  }
               }
            }
         }
      } else {
         for (int var19 = 0; var19 < this.field31201; var19++) {
            int var20 = var19 * this.field31207;
            if (var1 != 0) {
               for (int var28 = 0; var28 < this.field31203; var28++) {
                  this.field31213.method27172(var3, var20 + var28 * this.field31209);
               }
            } else {
               for (int var27 = 0; var27 < this.field31203; var27++) {
                  this.field31213.method27164(var3, var20 + var27 * this.field31209);
               }
            }

            if (this.field31205 <= 4) {
               if (this.field31205 != 4) {
                  if (this.field31205 == 2) {
                     for (int var32 = 0; var32 < this.field31203; var32++) {
                        int var46 = var20 + var32 * this.field31209;
                        int var57 = 2 * var32;
                        var8[var57] = var3[var46];
                        var8[var57 + 1] = var3[var46 + 1];
                     }

                     this.field31212.method27164(var8, 0);

                     for (int var33 = 0; var33 < this.field31203; var33++) {
                        int var47 = var20 + var33 * this.field31209;
                        int var58 = 2 * var33;
                        var3[var47] = var8[var58];
                        var3[var47 + 1] = var8[var58 + 1];
                     }
                  }
               } else {
                  for (int var30 = 0; var30 < this.field31203; var30++) {
                     int var44 = var20 + var30 * this.field31209;
                     int var55 = 2 * var30;
                     int var64 = 2 * this.field31203 + 2 * var30;
                     var8[var55] = var3[var44];
                     var8[var55 + 1] = var3[var44 + 1];
                     var8[var64] = var3[var44 + 2];
                     var8[var64 + 1] = var3[var44 + 3];
                  }

                  this.field31212.method27164(var8, 0);
                  this.field31212.method27164(var8, 2 * this.field31203);

                  for (int var31 = 0; var31 < this.field31203; var31++) {
                     int var45 = var20 + var31 * this.field31209;
                     int var56 = 2 * var31;
                     int var65 = 2 * this.field31203 + 2 * var31;
                     var3[var45] = var8[var56];
                     var3[var45 + 1] = var8[var56 + 1];
                     var3[var45 + 2] = var8[var65];
                     var3[var45 + 3] = var8[var65 + 1];
                  }
               }
            } else {
               for (int var29 = 0; var29 < this.field31205; var29 += 8) {
                  for (int var35 = 0; var35 < this.field31203; var35++) {
                     int var42 = var20 + var35 * this.field31209 + var29;
                     int var53 = 2 * var35;
                     int var62 = 2 * this.field31203 + 2 * var35;
                     int var67 = var62 + 2 * this.field31203;
                     int var70 = var67 + 2 * this.field31203;
                     var8[var53] = var3[var42];
                     var8[var53 + 1] = var3[var42 + 1];
                     var8[var62] = var3[var42 + 2];
                     var8[var62 + 1] = var3[var42 + 3];
                     var8[var67] = var3[var42 + 4];
                     var8[var67 + 1] = var3[var42 + 5];
                     var8[var70] = var3[var42 + 6];
                     var8[var70 + 1] = var3[var42 + 7];
                  }

                  this.field31212.method27164(var8, 0);
                  this.field31212.method27164(var8, 2 * this.field31203);
                  this.field31212.method27164(var8, 4 * this.field31203);
                  this.field31212.method27164(var8, 6 * this.field31203);

                  for (int var36 = 0; var36 < this.field31203; var36++) {
                     int var43 = var20 + var36 * this.field31209 + var29;
                     int var54 = 2 * var36;
                     int var63 = 2 * this.field31203 + 2 * var36;
                     int var68 = var63 + 2 * this.field31203;
                     int var71 = var68 + 2 * this.field31203;
                     var3[var43] = var8[var54];
                     var3[var43 + 1] = var8[var54 + 1];
                     var3[var43 + 2] = var8[var63];
                     var3[var43 + 3] = var8[var63 + 1];
                     var3[var43 + 4] = var8[var68];
                     var3[var43 + 5] = var8[var68 + 1];
                     var3[var43 + 6] = var8[var71];
                     var3[var43 + 7] = var8[var71 + 1];
                  }
               }
            }
         }
      }
   }

   private void method22873(long var1, int var3, Class2381 var4, boolean var5) {
      long var8 = this.field31202;
      if (var8 < this.field31204) {
         var8 = this.field31204;
      }

      var8 *= 8L;
      if (this.field31206 != 4L) {
         if (this.field31206 < 4L) {
            var8 >>= 2;
         }
      } else {
         var8 >>= 1;
      }

      Class2381 var10 = new Class2381(var8);
      if (var3 != -1) {
         for (long var11 = 0L; var11 < this.field31202; var11++) {
            long var13 = var11 * this.field31208;
            if (var1 != 0L) {
               for (long var32 = 0L; var32 < this.field31204; var32++) {
                  this.field31213.method27187(var4, var13 + var32 * this.field31210, var5);
               }
            } else {
               for (long var15 = 0L; var15 < this.field31204; var15++) {
                  this.field31213.method27169(var4, var13 + var15 * this.field31210, var5);
               }
            }

            if (this.field31206 <= 4L) {
               if (this.field31206 != 4L) {
                  if (this.field31206 == 2L) {
                     for (long var36 = 0L; var36 < this.field31204; var36++) {
                        long var51 = var13 + var36 * this.field31210;
                        long var62 = 2L * var36;
                        var10.method9687(var62, var4.method9653(var51));
                        var10.method9687(var62 + 1L, var4.method9653(var51 + 1L));
                     }

                     this.field31212.method27169(var10, 0L, var5);

                     for (long var37 = 0L; var37 < this.field31204; var37++) {
                        long var52 = var13 + var37 * this.field31210;
                        long var63 = 2L * var37;
                        var4.method9687(var52, var10.method9653(var63));
                        var4.method9687(var52 + 1L, var10.method9653(var63 + 1L));
                     }
                  }
               } else {
                  for (long var34 = 0L; var34 < this.field31204; var34++) {
                     long var49 = var13 + var34 * this.field31210;
                     long var60 = 2L * var34;
                     long var71 = 2L * this.field31204 + 2L * var34;
                     var10.method9687(var60, var4.method9653(var49));
                     var10.method9687(var60 + 1L, var4.method9653(var49 + 1L));
                     var10.method9687(var71, var4.method9653(var49 + 2L));
                     var10.method9687(var71 + 1L, var4.method9653(var49 + 3L));
                  }

                  this.field31212.method27169(var10, 0L, var5);
                  this.field31212.method27169(var10, 2L * this.field31204, var5);

                  for (long var35 = 0L; var35 < this.field31204; var35++) {
                     long var50 = var13 + var35 * this.field31210;
                     long var61 = 2L * var35;
                     long var72 = 2L * this.field31204 + 2L * var35;
                     var4.method9687(var50, var10.method9653(var61));
                     var4.method9687(var50 + 1L, var10.method9653(var61 + 1L));
                     var4.method9687(var50 + 2L, var10.method9653(var72));
                     var4.method9687(var50 + 3L, var10.method9653(var72 + 1L));
                  }
               }
            } else {
               for (long var33 = 0L; var33 < this.field31206; var33 += 8L) {
                  for (long var17 = 0L; var17 < this.field31204; var17++) {
                     long var19 = var13 + var17 * this.field31210 + var33;
                     long var21 = 2L * var17;
                     long var23 = 2L * this.field31204 + 2L * var17;
                     long var25 = var23 + 2L * this.field31204;
                     long var27 = var25 + 2L * this.field31204;
                     var10.method9687(var21, var4.method9653(var19));
                     var10.method9687(var21 + 1L, var4.method9653(var19 + 1L));
                     var10.method9687(var23, var4.method9653(var19 + 2L));
                     var10.method9687(var23 + 1L, var4.method9653(var19 + 3L));
                     var10.method9687(var25, var4.method9653(var19 + 4L));
                     var10.method9687(var25 + 1L, var4.method9653(var19 + 5L));
                     var10.method9687(var27, var4.method9653(var19 + 6L));
                     var10.method9687(var27 + 1L, var4.method9653(var19 + 7L));
                  }

                  this.field31212.method27169(var10, 0L, var5);
                  this.field31212.method27169(var10, 2L * this.field31204, var5);
                  this.field31212.method27169(var10, 4L * this.field31204, var5);
                  this.field31212.method27169(var10, 6L * this.field31204, var5);

                  for (long var45 = 0L; var45 < this.field31204; var45++) {
                     long var48 = var13 + var45 * this.field31210 + var33;
                     long var59 = 2L * var45;
                     long var70 = 2L * this.field31204 + 2L * var45;
                     long var77 = var70 + 2L * this.field31204;
                     long var80 = var77 + 2L * this.field31204;
                     var4.method9687(var48, var10.method9653(var59));
                     var4.method9687(var48 + 1L, var10.method9653(var59 + 1L));
                     var4.method9687(var48 + 2L, var10.method9653(var70));
                     var4.method9687(var48 + 3L, var10.method9653(var70 + 1L));
                     var4.method9687(var48 + 4L, var10.method9653(var77));
                     var4.method9687(var48 + 5L, var10.method9653(var77 + 1L));
                     var4.method9687(var48 + 6L, var10.method9653(var80));
                     var4.method9687(var48 + 7L, var10.method9653(var80 + 1L));
                  }
               }
            }
         }
      } else {
         for (long var30 = 0L; var30 < this.field31202; var30++) {
            long var31 = var30 * this.field31208;
            if (var1 != 0L) {
               for (long var39 = 0L; var39 < this.field31204; var39++) {
                  this.field31213.method27173(var4, var31 + var39 * this.field31210);
               }
            } else {
               for (long var38 = 0L; var38 < this.field31204; var38++) {
                  this.field31213.method27165(var4, var31 + var38 * this.field31210);
               }
            }

            if (this.field31206 <= 4L) {
               if (this.field31206 != 4L) {
                  if (this.field31206 == 2L) {
                     for (long var43 = 0L; var43 < this.field31204; var43++) {
                        long var57 = var31 + var43 * this.field31210;
                        long var68 = 2L * var43;
                        var10.method9687(var68, var4.method9653(var57));
                        var10.method9687(var68 + 1L, var4.method9653(var57 + 1L));
                     }

                     this.field31212.method27165(var10, 0L);

                     for (long var44 = 0L; var44 < this.field31204; var44++) {
                        long var58 = var31 + var44 * this.field31210;
                        long var69 = 2L * var44;
                        var4.method9687(var58, var10.method9653(var69));
                        var4.method9687(var58 + 1L, var10.method9653(var69 + 1L));
                     }
                  }
               } else {
                  for (long var41 = 0L; var41 < this.field31204; var41++) {
                     long var55 = var31 + var41 * this.field31210;
                     long var66 = 2L * var41;
                     long var75 = 2L * this.field31204 + 2L * var41;
                     var10.method9687(var66, var4.method9653(var55));
                     var10.method9687(var66 + 1L, var4.method9653(var55 + 1L));
                     var10.method9687(var75, var4.method9653(var55 + 2L));
                     var10.method9687(var75 + 1L, var4.method9653(var55 + 3L));
                  }

                  this.field31212.method27165(var10, 0L);
                  this.field31212.method27165(var10, 2L * this.field31204);

                  for (long var42 = 0L; var42 < this.field31204; var42++) {
                     long var56 = var31 + var42 * this.field31210;
                     long var67 = 2L * var42;
                     long var76 = 2L * this.field31204 + 2L * var42;
                     var4.method9687(var56, var10.method9653(var67));
                     var4.method9687(var56 + 1L, var10.method9653(var67 + 1L));
                     var4.method9687(var56 + 2L, var10.method9653(var76));
                     var4.method9687(var56 + 3L, var10.method9653(var76 + 1L));
                  }
               }
            } else {
               for (long var40 = 0L; var40 < this.field31206; var40 += 8L) {
                  for (long var46 = 0L; var46 < this.field31204; var46++) {
                     long var53 = var31 + var46 * this.field31210 + var40;
                     long var64 = 2L * var46;
                     long var73 = 2L * this.field31204 + 2L * var46;
                     long var78 = var73 + 2L * this.field31204;
                     long var81 = var78 + 2L * this.field31204;
                     var10.method9687(var64, var4.method9653(var53));
                     var10.method9687(var64 + 1L, var4.method9653(var53 + 1L));
                     var10.method9687(var73, var4.method9653(var53 + 2L));
                     var10.method9687(var73 + 1L, var4.method9653(var53 + 3L));
                     var10.method9687(var78, var4.method9653(var53 + 4L));
                     var10.method9687(var78 + 1L, var4.method9653(var53 + 5L));
                     var10.method9687(var81, var4.method9653(var53 + 6L));
                     var10.method9687(var81 + 1L, var4.method9653(var53 + 7L));
                  }

                  this.field31212.method27165(var10, 0L);
                  this.field31212.method27165(var10, 2L * this.field31204);
                  this.field31212.method27165(var10, 4L * this.field31204);
                  this.field31212.method27165(var10, 6L * this.field31204);

                  for (long var47 = 0L; var47 < this.field31204; var47++) {
                     long var54 = var31 + var47 * this.field31210 + var40;
                     long var65 = 2L * var47;
                     long var74 = 2L * this.field31204 + 2L * var47;
                     long var79 = var74 + 2L * this.field31204;
                     long var82 = var79 + 2L * this.field31204;
                     var4.method9687(var54, var10.method9653(var65));
                     var4.method9687(var54 + 1L, var10.method9653(var65 + 1L));
                     var4.method9687(var54 + 2L, var10.method9653(var74));
                     var4.method9687(var54 + 3L, var10.method9653(var74 + 1L));
                     var4.method9687(var54 + 4L, var10.method9653(var79));
                     var4.method9687(var54 + 5L, var10.method9653(var79 + 1L));
                     var4.method9687(var54 + 6L, var10.method9653(var82));
                     var4.method9687(var54 + 7L, var10.method9653(var82 + 1L));
                  }
               }
            }
         }
      }
   }

   private void method22874(int var1, int var2, double[][][] var3, boolean var4) {
      int var7 = this.field31201;
      if (var7 < this.field31203) {
         var7 = this.field31203;
      }

      var7 *= 8;
      if (this.field31205 != 4) {
         if (this.field31205 < 4) {
            var7 >>= 2;
         }
      } else {
         var7 >>= 1;
      }

      double[] var8 = new double[var7];
      if (var2 != -1) {
         for (int var9 = 0; var9 < this.field31201; var9++) {
            if (var1 == 0) {
               for (int var10 = 0; var10 < this.field31203; var10++) {
                  this.field31213.method27166(var3[var9][var10], var4);
               }
            }

            if (this.field31205 <= 4) {
               if (this.field31205 != 4) {
                  if (this.field31205 == 2) {
                     for (int var21 = 0; var21 < this.field31203; var21++) {
                        int var37 = 2 * var21;
                        var8[var37] = var3[var9][var21][0];
                        var8[var37 + 1] = var3[var9][var21][1];
                     }

                     this.field31212.method27168(var8, 0, var4);

                     for (int var22 = 0; var22 < this.field31203; var22++) {
                        int var38 = 2 * var22;
                        var3[var9][var22][0] = var8[var38];
                        var3[var9][var22][1] = var8[var38 + 1];
                     }
                  }
               } else {
                  for (int var19 = 0; var19 < this.field31203; var19++) {
                     int var35 = 2 * var19;
                     int var46 = 2 * this.field31203 + 2 * var19;
                     var8[var35] = var3[var9][var19][0];
                     var8[var35 + 1] = var3[var9][var19][1];
                     var8[var46] = var3[var9][var19][2];
                     var8[var46 + 1] = var3[var9][var19][3];
                  }

                  this.field31212.method27168(var8, 0, var4);
                  this.field31212.method27168(var8, 2 * this.field31203, var4);

                  for (int var20 = 0; var20 < this.field31203; var20++) {
                     int var36 = 2 * var20;
                     int var47 = 2 * this.field31203 + 2 * var20;
                     var3[var9][var20][0] = var8[var36];
                     var3[var9][var20][1] = var8[var36 + 1];
                     var3[var9][var20][2] = var8[var47];
                     var3[var9][var20][3] = var8[var47 + 1];
                  }
               }
            } else {
               for (int var18 = 0; var18 < this.field31205; var18 += 8) {
                  for (int var11 = 0; var11 < this.field31203; var11++) {
                     int var12 = 2 * var11;
                     int var13 = 2 * this.field31203 + 2 * var11;
                     int var14 = var13 + 2 * this.field31203;
                     int var15 = var14 + 2 * this.field31203;
                     var8[var12] = var3[var9][var11][var18];
                     var8[var12 + 1] = var3[var9][var11][var18 + 1];
                     var8[var13] = var3[var9][var11][var18 + 2];
                     var8[var13 + 1] = var3[var9][var11][var18 + 3];
                     var8[var14] = var3[var9][var11][var18 + 4];
                     var8[var14 + 1] = var3[var9][var11][var18 + 5];
                     var8[var15] = var3[var9][var11][var18 + 6];
                     var8[var15 + 1] = var3[var9][var11][var18 + 7];
                  }

                  this.field31212.method27168(var8, 0, var4);
                  this.field31212.method27168(var8, 2 * this.field31203, var4);
                  this.field31212.method27168(var8, 4 * this.field31203, var4);
                  this.field31212.method27168(var8, 6 * this.field31203, var4);

                  for (int var31 = 0; var31 < this.field31203; var31++) {
                     int var34 = 2 * var31;
                     int var45 = 2 * this.field31203 + 2 * var31;
                     int var52 = var45 + 2 * this.field31203;
                     int var55 = var52 + 2 * this.field31203;
                     var3[var9][var31][var18] = var8[var34];
                     var3[var9][var31][var18 + 1] = var8[var34 + 1];
                     var3[var9][var31][var18 + 2] = var8[var45];
                     var3[var9][var31][var18 + 3] = var8[var45 + 1];
                     var3[var9][var31][var18 + 4] = var8[var52];
                     var3[var9][var31][var18 + 5] = var8[var52 + 1];
                     var3[var9][var31][var18 + 6] = var8[var55];
                     var3[var9][var31][var18 + 7] = var8[var55 + 1];
                  }
               }
            }

            if (var1 != 0) {
               for (int var23 = 0; var23 < this.field31203; var23++) {
                  this.field31213.method27178(var3[var9][var23], var4);
               }
            }
         }
      } else {
         for (int var17 = 0; var17 < this.field31201; var17++) {
            if (var1 != 0) {
               for (int var25 = 0; var25 < this.field31203; var25++) {
                  this.field31213.method27172(var3[var17][var25], 0);
               }
            } else {
               for (int var24 = 0; var24 < this.field31203; var24++) {
                  this.field31213.method27162(var3[var17][var24]);
               }
            }

            if (this.field31205 <= 4) {
               if (this.field31205 != 4) {
                  if (this.field31205 == 2) {
                     for (int var29 = 0; var29 < this.field31203; var29++) {
                        int var43 = 2 * var29;
                        var8[var43] = var3[var17][var29][0];
                        var8[var43 + 1] = var3[var17][var29][1];
                     }

                     this.field31212.method27164(var8, 0);

                     for (int var30 = 0; var30 < this.field31203; var30++) {
                        int var44 = 2 * var30;
                        var3[var17][var30][0] = var8[var44];
                        var3[var17][var30][1] = var8[var44 + 1];
                     }
                  }
               } else {
                  for (int var27 = 0; var27 < this.field31203; var27++) {
                     int var41 = 2 * var27;
                     int var50 = 2 * this.field31203 + 2 * var27;
                     var8[var41] = var3[var17][var27][0];
                     var8[var41 + 1] = var3[var17][var27][1];
                     var8[var50] = var3[var17][var27][2];
                     var8[var50 + 1] = var3[var17][var27][3];
                  }

                  this.field31212.method27164(var8, 0);
                  this.field31212.method27164(var8, 2 * this.field31203);

                  for (int var28 = 0; var28 < this.field31203; var28++) {
                     int var42 = 2 * var28;
                     int var51 = 2 * this.field31203 + 2 * var28;
                     var3[var17][var28][0] = var8[var42];
                     var3[var17][var28][1] = var8[var42 + 1];
                     var3[var17][var28][2] = var8[var51];
                     var3[var17][var28][3] = var8[var51 + 1];
                  }
               }
            } else {
               for (int var26 = 0; var26 < this.field31205; var26 += 8) {
                  for (int var32 = 0; var32 < this.field31203; var32++) {
                     int var39 = 2 * var32;
                     int var48 = 2 * this.field31203 + 2 * var32;
                     int var53 = var48 + 2 * this.field31203;
                     int var56 = var53 + 2 * this.field31203;
                     var8[var39] = var3[var17][var32][var26];
                     var8[var39 + 1] = var3[var17][var32][var26 + 1];
                     var8[var48] = var3[var17][var32][var26 + 2];
                     var8[var48 + 1] = var3[var17][var32][var26 + 3];
                     var8[var53] = var3[var17][var32][var26 + 4];
                     var8[var53 + 1] = var3[var17][var32][var26 + 5];
                     var8[var56] = var3[var17][var32][var26 + 6];
                     var8[var56 + 1] = var3[var17][var32][var26 + 7];
                  }

                  this.field31212.method27164(var8, 0);
                  this.field31212.method27164(var8, 2 * this.field31203);
                  this.field31212.method27164(var8, 4 * this.field31203);
                  this.field31212.method27164(var8, 6 * this.field31203);

                  for (int var33 = 0; var33 < this.field31203; var33++) {
                     int var40 = 2 * var33;
                     int var49 = 2 * this.field31203 + 2 * var33;
                     int var54 = var49 + 2 * this.field31203;
                     int var57 = var54 + 2 * this.field31203;
                     var3[var17][var33][var26] = var8[var40];
                     var3[var17][var33][var26 + 1] = var8[var40 + 1];
                     var3[var17][var33][var26 + 2] = var8[var49];
                     var3[var17][var33][var26 + 3] = var8[var49 + 1];
                     var3[var17][var33][var26 + 4] = var8[var54];
                     var3[var17][var33][var26 + 5] = var8[var54 + 1];
                     var3[var17][var33][var26 + 6] = var8[var57];
                     var3[var17][var33][var26 + 7] = var8[var57 + 1];
                  }
               }
            }
         }
      }
   }

   private void method22875(int var1, int var2, double[][][] var3, boolean var4) {
      int var7 = this.field31201;
      if (var7 < this.field31203) {
         var7 = this.field31203;
      }

      var7 *= 8;
      if (this.field31205 != 4) {
         if (this.field31205 < 4) {
            var7 >>= 2;
         }
      } else {
         var7 >>= 1;
      }

      double[] var8 = new double[var7];
      if (var2 != -1) {
         for (int var9 = 0; var9 < this.field31201; var9++) {
            if (var1 != 0) {
               for (int var18 = 0; var18 < this.field31203; var18++) {
                  this.field31213.method27186(var3[var9][var18], 0, var4);
               }
            } else {
               for (int var10 = 0; var10 < this.field31203; var10++) {
                  this.field31213.method27166(var3[var9][var10], var4);
               }
            }

            if (this.field31205 <= 4) {
               if (this.field31205 != 4) {
                  if (this.field31205 == 2) {
                     for (int var22 = 0; var22 < this.field31203; var22++) {
                        int var37 = 2 * var22;
                        var8[var37] = var3[var9][var22][0];
                        var8[var37 + 1] = var3[var9][var22][1];
                     }

                     this.field31212.method27168(var8, 0, var4);

                     for (int var23 = 0; var23 < this.field31203; var23++) {
                        int var38 = 2 * var23;
                        var3[var9][var23][0] = var8[var38];
                        var3[var9][var23][1] = var8[var38 + 1];
                     }
                  }
               } else {
                  for (int var20 = 0; var20 < this.field31203; var20++) {
                     int var35 = 2 * var20;
                     int var46 = 2 * this.field31203 + 2 * var20;
                     var8[var35] = var3[var9][var20][0];
                     var8[var35 + 1] = var3[var9][var20][1];
                     var8[var46] = var3[var9][var20][2];
                     var8[var46 + 1] = var3[var9][var20][3];
                  }

                  this.field31212.method27168(var8, 0, var4);
                  this.field31212.method27168(var8, 2 * this.field31203, var4);

                  for (int var21 = 0; var21 < this.field31203; var21++) {
                     int var36 = 2 * var21;
                     int var47 = 2 * this.field31203 + 2 * var21;
                     var3[var9][var21][0] = var8[var36];
                     var3[var9][var21][1] = var8[var36 + 1];
                     var3[var9][var21][2] = var8[var47];
                     var3[var9][var21][3] = var8[var47 + 1];
                  }
               }
            } else {
               for (int var19 = 0; var19 < this.field31205; var19 += 8) {
                  for (int var11 = 0; var11 < this.field31203; var11++) {
                     int var12 = 2 * var11;
                     int var13 = 2 * this.field31203 + 2 * var11;
                     int var14 = var13 + 2 * this.field31203;
                     int var15 = var14 + 2 * this.field31203;
                     var8[var12] = var3[var9][var11][var19];
                     var8[var12 + 1] = var3[var9][var11][var19 + 1];
                     var8[var13] = var3[var9][var11][var19 + 2];
                     var8[var13 + 1] = var3[var9][var11][var19 + 3];
                     var8[var14] = var3[var9][var11][var19 + 4];
                     var8[var14 + 1] = var3[var9][var11][var19 + 5];
                     var8[var15] = var3[var9][var11][var19 + 6];
                     var8[var15 + 1] = var3[var9][var11][var19 + 7];
                  }

                  this.field31212.method27168(var8, 0, var4);
                  this.field31212.method27168(var8, 2 * this.field31203, var4);
                  this.field31212.method27168(var8, 4 * this.field31203, var4);
                  this.field31212.method27168(var8, 6 * this.field31203, var4);

                  for (int var31 = 0; var31 < this.field31203; var31++) {
                     int var34 = 2 * var31;
                     int var45 = 2 * this.field31203 + 2 * var31;
                     int var52 = var45 + 2 * this.field31203;
                     int var55 = var52 + 2 * this.field31203;
                     var3[var9][var31][var19] = var8[var34];
                     var3[var9][var31][var19 + 1] = var8[var34 + 1];
                     var3[var9][var31][var19 + 2] = var8[var45];
                     var3[var9][var31][var19 + 3] = var8[var45 + 1];
                     var3[var9][var31][var19 + 4] = var8[var52];
                     var3[var9][var31][var19 + 5] = var8[var52 + 1];
                     var3[var9][var31][var19 + 6] = var8[var55];
                     var3[var9][var31][var19 + 7] = var8[var55 + 1];
                  }
               }
            }
         }
      } else {
         for (int var17 = 0; var17 < this.field31201; var17++) {
            if (var1 != 0) {
               for (int var25 = 0; var25 < this.field31203; var25++) {
                  this.field31213.method27170(var3[var17][var25]);
               }
            } else {
               for (int var24 = 0; var24 < this.field31203; var24++) {
                  this.field31213.method27162(var3[var17][var24]);
               }
            }

            if (this.field31205 <= 4) {
               if (this.field31205 != 4) {
                  if (this.field31205 == 2) {
                     for (int var29 = 0; var29 < this.field31203; var29++) {
                        int var43 = 2 * var29;
                        var8[var43] = var3[var17][var29][0];
                        var8[var43 + 1] = var3[var17][var29][1];
                     }

                     this.field31212.method27164(var8, 0);

                     for (int var30 = 0; var30 < this.field31203; var30++) {
                        int var44 = 2 * var30;
                        var3[var17][var30][0] = var8[var44];
                        var3[var17][var30][1] = var8[var44 + 1];
                     }
                  }
               } else {
                  for (int var27 = 0; var27 < this.field31203; var27++) {
                     int var41 = 2 * var27;
                     int var50 = 2 * this.field31203 + 2 * var27;
                     var8[var41] = var3[var17][var27][0];
                     var8[var41 + 1] = var3[var17][var27][1];
                     var8[var50] = var3[var17][var27][2];
                     var8[var50 + 1] = var3[var17][var27][3];
                  }

                  this.field31212.method27164(var8, 0);
                  this.field31212.method27164(var8, 2 * this.field31203);

                  for (int var28 = 0; var28 < this.field31203; var28++) {
                     int var42 = 2 * var28;
                     int var51 = 2 * this.field31203 + 2 * var28;
                     var3[var17][var28][0] = var8[var42];
                     var3[var17][var28][1] = var8[var42 + 1];
                     var3[var17][var28][2] = var8[var51];
                     var3[var17][var28][3] = var8[var51 + 1];
                  }
               }
            } else {
               for (int var26 = 0; var26 < this.field31205; var26 += 8) {
                  for (int var32 = 0; var32 < this.field31203; var32++) {
                     int var39 = 2 * var32;
                     int var48 = 2 * this.field31203 + 2 * var32;
                     int var53 = var48 + 2 * this.field31203;
                     int var56 = var53 + 2 * this.field31203;
                     var8[var39] = var3[var17][var32][var26];
                     var8[var39 + 1] = var3[var17][var32][var26 + 1];
                     var8[var48] = var3[var17][var32][var26 + 2];
                     var8[var48 + 1] = var3[var17][var32][var26 + 3];
                     var8[var53] = var3[var17][var32][var26 + 4];
                     var8[var53 + 1] = var3[var17][var32][var26 + 5];
                     var8[var56] = var3[var17][var32][var26 + 6];
                     var8[var56 + 1] = var3[var17][var32][var26 + 7];
                  }

                  this.field31212.method27164(var8, 0);
                  this.field31212.method27164(var8, 2 * this.field31203);
                  this.field31212.method27164(var8, 4 * this.field31203);
                  this.field31212.method27164(var8, 6 * this.field31203);

                  for (int var33 = 0; var33 < this.field31203; var33++) {
                     int var40 = 2 * var33;
                     int var49 = 2 * this.field31203 + 2 * var33;
                     int var54 = var49 + 2 * this.field31203;
                     int var57 = var54 + 2 * this.field31203;
                     var3[var17][var33][var26] = var8[var40];
                     var3[var17][var33][var26 + 1] = var8[var40 + 1];
                     var3[var17][var33][var26 + 2] = var8[var49];
                     var3[var17][var33][var26 + 3] = var8[var49 + 1];
                     var3[var17][var33][var26 + 4] = var8[var54];
                     var3[var17][var33][var26 + 5] = var8[var54 + 1];
                     var3[var17][var33][var26 + 6] = var8[var57];
                     var3[var17][var33][var26 + 7] = var8[var57 + 1];
                  }
               }
            }
         }
      }
   }

   private void method22876(int var1, double[] var2, boolean var3) {
      int var6 = this.field31201;
      if (var6 < this.field31203) {
         var6 = this.field31203;
      }

      var6 *= 8;
      if (this.field31205 != 4) {
         if (this.field31205 < 4) {
            var6 >>= 2;
         }
      } else {
         var6 >>= 1;
      }

      double[] var7 = new double[var6];
      if (var1 != -1) {
         if (this.field31205 <= 4) {
            if (this.field31205 != 4) {
               if (this.field31205 == 2) {
                  for (int var8 = 0; var8 < this.field31203; var8++) {
                     int var9 = var8 * this.field31209;

                     for (int var10 = 0; var10 < this.field31201; var10++) {
                        int var12 = var10 * this.field31207 + var9;
                        int var13 = 2 * var10;
                        var7[var13] = var2[var12];
                        var7[var13 + 1] = var2[var12 + 1];
                     }

                     this.field31211.method27168(var7, 0, var3);

                     for (int var28 = 0; var28 < this.field31201; var28++) {
                        int var40 = var28 * this.field31207 + var9;
                        int var51 = 2 * var28;
                        var2[var40] = var7[var51];
                        var2[var40 + 1] = var7[var51 + 1];
                     }
                  }
               }
            } else {
               for (int var18 = 0; var18 < this.field31203; var18++) {
                  int var23 = var18 * this.field31209;

                  for (int var29 = 0; var29 < this.field31201; var29++) {
                     int var41 = var29 * this.field31207 + var23;
                     int var52 = 2 * var29;
                     int var14 = 2 * this.field31201 + 2 * var29;
                     var7[var52] = var2[var41];
                     var7[var52 + 1] = var2[var41 + 1];
                     var7[var14] = var2[var41 + 2];
                     var7[var14 + 1] = var2[var41 + 3];
                  }

                  this.field31211.method27168(var7, 0, var3);
                  this.field31211.method27168(var7, 2 * this.field31201, var3);

                  for (int var30 = 0; var30 < this.field31201; var30++) {
                     int var42 = var30 * this.field31207 + var23;
                     int var53 = 2 * var30;
                     int var62 = 2 * this.field31201 + 2 * var30;
                     var2[var42] = var7[var53];
                     var2[var42 + 1] = var7[var53 + 1];
                     var2[var42 + 2] = var7[var62];
                     var2[var42 + 3] = var7[var62 + 1];
                  }
               }
            }
         } else {
            for (int var19 = 0; var19 < this.field31203; var19++) {
               int var24 = var19 * this.field31209;

               for (int var31 = 0; var31 < this.field31205; var31 += 8) {
                  for (int var11 = 0; var11 < this.field31201; var11++) {
                     int var43 = var11 * this.field31207 + var24 + var31;
                     int var54 = 2 * var11;
                     int var63 = 2 * this.field31201 + 2 * var11;
                     int var15 = var63 + 2 * this.field31201;
                     int var16 = var15 + 2 * this.field31201;
                     var7[var54] = var2[var43];
                     var7[var54 + 1] = var2[var43 + 1];
                     var7[var63] = var2[var43 + 2];
                     var7[var63 + 1] = var2[var43 + 3];
                     var7[var15] = var2[var43 + 4];
                     var7[var15 + 1] = var2[var43 + 5];
                     var7[var16] = var2[var43 + 6];
                     var7[var16 + 1] = var2[var43 + 7];
                  }

                  this.field31211.method27168(var7, 0, var3);
                  this.field31211.method27168(var7, 2 * this.field31201, var3);
                  this.field31211.method27168(var7, 4 * this.field31201, var3);
                  this.field31211.method27168(var7, 6 * this.field31201, var3);

                  for (int var37 = 0; var37 < this.field31201; var37++) {
                     int var44 = var37 * this.field31207 + var24 + var31;
                     int var55 = 2 * var37;
                     int var64 = 2 * this.field31201 + 2 * var37;
                     int var69 = var64 + 2 * this.field31201;
                     int var72 = var69 + 2 * this.field31201;
                     var2[var44] = var7[var55];
                     var2[var44 + 1] = var7[var55 + 1];
                     var2[var44 + 2] = var7[var64];
                     var2[var44 + 3] = var7[var64 + 1];
                     var2[var44 + 4] = var7[var69];
                     var2[var44 + 5] = var7[var69 + 1];
                     var2[var44 + 6] = var7[var72];
                     var2[var44 + 7] = var7[var72 + 1];
                  }
               }
            }
         }
      } else if (this.field31205 <= 4) {
         if (this.field31205 != 4) {
            if (this.field31205 == 2) {
               for (int var20 = 0; var20 < this.field31203; var20++) {
                  int var25 = var20 * this.field31209;

                  for (int var32 = 0; var32 < this.field31201; var32++) {
                     int var45 = var32 * this.field31207 + var25;
                     int var56 = 2 * var32;
                     var7[var56] = var2[var45];
                     var7[var56 + 1] = var2[var45 + 1];
                  }

                  this.field31211.method27164(var7, 0);

                  for (int var33 = 0; var33 < this.field31201; var33++) {
                     int var46 = var33 * this.field31207 + var25;
                     int var57 = 2 * var33;
                     var2[var46] = var7[var57];
                     var2[var46 + 1] = var7[var57 + 1];
                  }
               }
            }
         } else {
            for (int var21 = 0; var21 < this.field31203; var21++) {
               int var26 = var21 * this.field31209;

               for (int var34 = 0; var34 < this.field31201; var34++) {
                  int var47 = var34 * this.field31207 + var26;
                  int var58 = 2 * var34;
                  int var65 = 2 * this.field31201 + 2 * var34;
                  var7[var58] = var2[var47];
                  var7[var58 + 1] = var2[var47 + 1];
                  var7[var65] = var2[var47 + 2];
                  var7[var65 + 1] = var2[var47 + 3];
               }

               this.field31211.method27164(var7, 0);
               this.field31211.method27164(var7, 2 * this.field31201);

               for (int var35 = 0; var35 < this.field31201; var35++) {
                  int var48 = var35 * this.field31207 + var26;
                  int var59 = 2 * var35;
                  int var66 = 2 * this.field31201 + 2 * var35;
                  var2[var48] = var7[var59];
                  var2[var48 + 1] = var7[var59 + 1];
                  var2[var48 + 2] = var7[var66];
                  var2[var48 + 3] = var7[var66 + 1];
               }
            }
         }
      } else {
         for (int var22 = 0; var22 < this.field31203; var22++) {
            int var27 = var22 * this.field31209;

            for (int var36 = 0; var36 < this.field31205; var36 += 8) {
               for (int var38 = 0; var38 < this.field31201; var38++) {
                  int var49 = var38 * this.field31207 + var27 + var36;
                  int var60 = 2 * var38;
                  int var67 = 2 * this.field31201 + 2 * var38;
                  int var70 = var67 + 2 * this.field31201;
                  int var73 = var70 + 2 * this.field31201;
                  var7[var60] = var2[var49];
                  var7[var60 + 1] = var2[var49 + 1];
                  var7[var67] = var2[var49 + 2];
                  var7[var67 + 1] = var2[var49 + 3];
                  var7[var70] = var2[var49 + 4];
                  var7[var70 + 1] = var2[var49 + 5];
                  var7[var73] = var2[var49 + 6];
                  var7[var73 + 1] = var2[var49 + 7];
               }

               this.field31211.method27164(var7, 0);
               this.field31211.method27164(var7, 2 * this.field31201);
               this.field31211.method27164(var7, 4 * this.field31201);
               this.field31211.method27164(var7, 6 * this.field31201);

               for (int var39 = 0; var39 < this.field31201; var39++) {
                  int var50 = var39 * this.field31207 + var27 + var36;
                  int var61 = 2 * var39;
                  int var68 = 2 * this.field31201 + 2 * var39;
                  int var71 = var68 + 2 * this.field31201;
                  int var74 = var71 + 2 * this.field31201;
                  var2[var50] = var7[var61];
                  var2[var50 + 1] = var7[var61 + 1];
                  var2[var50 + 2] = var7[var68];
                  var2[var50 + 3] = var7[var68 + 1];
                  var2[var50 + 4] = var7[var71];
                  var2[var50 + 5] = var7[var71 + 1];
                  var2[var50 + 6] = var7[var74];
                  var2[var50 + 7] = var7[var74 + 1];
               }
            }
         }
      }
   }

   private void method22877(int var1, Class2381 var2, boolean var3) {
      long var6 = this.field31202;
      if (var6 < this.field31204) {
         var6 = this.field31204;
      }

      var6 *= 8L;
      if (this.field31206 != 4L) {
         if (this.field31206 < 4L) {
            var6 >>= 2;
         }
      } else {
         var6 >>= 1;
      }

      Class2381 var8 = new Class2381(var6);
      if (var1 != -1) {
         if (this.field31206 <= 4L) {
            if (this.field31206 != 4L) {
               if (this.field31206 == 2L) {
                  for (long var9 = 0L; var9 < this.field31204; var9++) {
                     long var11 = var9 * this.field31210;

                     for (long var13 = 0L; var13 < this.field31202; var13++) {
                        long var17 = var13 * this.field31208 + var11;
                        long var19 = 2L * var13;
                        var8.method9687(var19, var2.method9653(var17));
                        var8.method9687(var19 + 1L, var2.method9653(var17 + 1L));
                     }

                     this.field31211.method27169(var8, 0L, var3);

                     for (long var38 = 0L; var38 < this.field31202; var38++) {
                        long var50 = var38 * this.field31208 + var11;
                        long var61 = 2L * var38;
                        var2.method9687(var50, var8.method9653(var61));
                        var2.method9687(var50 + 1L, var8.method9653(var61 + 1L));
                     }
                  }
               }
            } else {
               for (long var28 = 0L; var28 < this.field31204; var28++) {
                  long var33 = var28 * this.field31210;

                  for (long var39 = 0L; var39 < this.field31202; var39++) {
                     long var51 = var39 * this.field31208 + var33;
                     long var62 = 2L * var39;
                     long var21 = 2L * this.field31202 + 2L * var39;
                     var8.method9687(var62, var2.method9653(var51));
                     var8.method9687(var62 + 1L, var2.method9653(var51 + 1L));
                     var8.method9687(var21, var2.method9653(var51 + 2L));
                     var8.method9687(var21 + 1L, var2.method9653(var51 + 3L));
                  }

                  this.field31211.method27169(var8, 0L, var3);
                  this.field31211.method27169(var8, 2L * this.field31202, var3);

                  for (long var40 = 0L; var40 < this.field31202; var40++) {
                     long var52 = var40 * this.field31208 + var33;
                     long var63 = 2L * var40;
                     long var72 = 2L * this.field31202 + 2L * var40;
                     var2.method9687(var52, var8.method9653(var63));
                     var2.method9687(var52 + 1L, var8.method9653(var63 + 1L));
                     var2.method9687(var52 + 2L, var8.method9653(var72));
                     var2.method9687(var52 + 3L, var8.method9653(var72 + 1L));
                  }
               }
            }
         } else {
            for (long var29 = 0L; var29 < this.field31204; var29++) {
               long var34 = var29 * this.field31210;

               for (long var41 = 0L; var41 < this.field31206; var41 += 8L) {
                  for (long var15 = 0L; var15 < this.field31202; var15++) {
                     long var53 = var15 * this.field31208 + var34 + var41;
                     long var64 = 2L * var15;
                     long var73 = 2L * this.field31202 + 2L * var15;
                     long var23 = var73 + 2L * this.field31202;
                     long var25 = var23 + 2L * this.field31202;
                     var8.method9687(var64, var2.method9653(var53));
                     var8.method9687(var64 + 1L, var2.method9653(var53 + 1L));
                     var8.method9687(var73, var2.method9653(var53 + 2L));
                     var8.method9687(var73 + 1L, var2.method9653(var53 + 3L));
                     var8.method9687(var23, var2.method9653(var53 + 4L));
                     var8.method9687(var23 + 1L, var2.method9653(var53 + 5L));
                     var8.method9687(var25, var2.method9653(var53 + 6L));
                     var8.method9687(var25 + 1L, var2.method9653(var53 + 7L));
                  }

                  this.field31211.method27169(var8, 0L, var3);
                  this.field31211.method27169(var8, 2L * this.field31202, var3);
                  this.field31211.method27169(var8, 4L * this.field31202, var3);
                  this.field31211.method27169(var8, 6L * this.field31202, var3);

                  for (long var47 = 0L; var47 < this.field31202; var47++) {
                     long var54 = var47 * this.field31208 + var34 + var41;
                     long var65 = 2L * var47;
                     long var74 = 2L * this.field31202 + 2L * var47;
                     long var79 = var74 + 2L * this.field31202;
                     long var82 = var79 + 2L * this.field31202;
                     var2.method9687(var54, var8.method9653(var65));
                     var2.method9687(var54 + 1L, var8.method9653(var65 + 1L));
                     var2.method9687(var54 + 2L, var8.method9653(var74));
                     var2.method9687(var54 + 3L, var8.method9653(var74 + 1L));
                     var2.method9687(var54 + 4L, var8.method9653(var79));
                     var2.method9687(var54 + 5L, var8.method9653(var79 + 1L));
                     var2.method9687(var54 + 6L, var8.method9653(var82));
                     var2.method9687(var54 + 7L, var8.method9653(var82 + 1L));
                  }
               }
            }
         }
      } else if (this.field31206 <= 4L) {
         if (this.field31206 != 4L) {
            if (this.field31206 == 2L) {
               for (long var30 = 0L; var30 < this.field31204; var30++) {
                  long var35 = var30 * this.field31210;

                  for (long var42 = 0L; var42 < this.field31202; var42++) {
                     long var55 = var42 * this.field31208 + var35;
                     long var66 = 2L * var42;
                     var8.method9687(var66, var2.method9653(var55));
                     var8.method9687(var66 + 1L, var2.method9653(var55 + 1L));
                  }

                  this.field31211.method27165(var8, 0L);

                  for (long var43 = 0L; var43 < this.field31202; var43++) {
                     long var56 = var43 * this.field31208 + var35;
                     long var67 = 2L * var43;
                     var2.method9687(var56, var8.method9653(var67));
                     var2.method9687(var56 + 1L, var8.method9653(var67 + 1L));
                  }
               }
            }
         } else {
            for (long var31 = 0L; var31 < this.field31204; var31++) {
               long var36 = var31 * this.field31210;

               for (long var44 = 0L; var44 < this.field31202; var44++) {
                  long var57 = var44 * this.field31208 + var36;
                  long var68 = 2L * var44;
                  long var75 = 2L * this.field31202 + 2L * var44;
                  var8.method9687(var68, var2.method9653(var57));
                  var8.method9687(var68 + 1L, var2.method9653(var57 + 1L));
                  var8.method9687(var75, var2.method9653(var57 + 2L));
                  var8.method9687(var75 + 1L, var2.method9653(var57 + 3L));
               }

               this.field31211.method27165(var8, 0L);
               this.field31211.method27165(var8, 2L * this.field31202);

               for (long var45 = 0L; var45 < this.field31202; var45++) {
                  long var58 = var45 * this.field31208 + var36;
                  long var69 = 2L * var45;
                  long var76 = 2L * this.field31202 + 2L * var45;
                  var2.method9687(var58, var8.method9653(var69));
                  var2.method9687(var58 + 1L, var8.method9653(var69 + 1L));
                  var2.method9687(var58 + 2L, var8.method9653(var76));
                  var2.method9687(var58 + 3L, var8.method9653(var76 + 1L));
               }
            }
         }
      } else {
         for (long var32 = 0L; var32 < this.field31204; var32++) {
            long var37 = var32 * this.field31210;

            for (long var46 = 0L; var46 < this.field31206; var46 += 8L) {
               for (long var48 = 0L; var48 < this.field31202; var48++) {
                  long var59 = var48 * this.field31208 + var37 + var46;
                  long var70 = 2L * var48;
                  long var77 = 2L * this.field31202 + 2L * var48;
                  long var80 = var77 + 2L * this.field31202;
                  long var83 = var80 + 2L * this.field31202;
                  var8.method9687(var70, var2.method9653(var59));
                  var8.method9687(var70 + 1L, var2.method9653(var59 + 1L));
                  var8.method9687(var77, var2.method9653(var59 + 2L));
                  var8.method9687(var77 + 1L, var2.method9653(var59 + 3L));
                  var8.method9687(var80, var2.method9653(var59 + 4L));
                  var8.method9687(var80 + 1L, var2.method9653(var59 + 5L));
                  var8.method9687(var83, var2.method9653(var59 + 6L));
                  var8.method9687(var83 + 1L, var2.method9653(var59 + 7L));
               }

               this.field31211.method27165(var8, 0L);
               this.field31211.method27165(var8, 2L * this.field31202);
               this.field31211.method27165(var8, 4L * this.field31202);
               this.field31211.method27165(var8, 6L * this.field31202);

               for (long var49 = 0L; var49 < this.field31202; var49++) {
                  long var60 = var49 * this.field31208 + var37 + var46;
                  long var71 = 2L * var49;
                  long var78 = 2L * this.field31202 + 2L * var49;
                  long var81 = var78 + 2L * this.field31202;
                  long var84 = var81 + 2L * this.field31202;
                  var2.method9687(var60, var8.method9653(var71));
                  var2.method9687(var60 + 1L, var8.method9653(var71 + 1L));
                  var2.method9687(var60 + 2L, var8.method9653(var78));
                  var2.method9687(var60 + 3L, var8.method9653(var78 + 1L));
                  var2.method9687(var60 + 4L, var8.method9653(var81));
                  var2.method9687(var60 + 5L, var8.method9653(var81 + 1L));
                  var2.method9687(var60 + 6L, var8.method9653(var84));
                  var2.method9687(var60 + 7L, var8.method9653(var84 + 1L));
               }
            }
         }
      }
   }

   private void method22878(int var1, double[][][] var2, boolean var3) {
      int var6 = this.field31201;
      if (var6 < this.field31203) {
         var6 = this.field31203;
      }

      var6 *= 8;
      if (this.field31205 != 4) {
         if (this.field31205 < 4) {
            var6 >>= 2;
         }
      } else {
         var6 >>= 1;
      }

      double[] var7 = new double[var6];
      if (var1 != -1) {
         if (this.field31205 <= 4) {
            if (this.field31205 != 4) {
               if (this.field31205 == 2) {
                  for (int var8 = 0; var8 < this.field31203; var8++) {
                     for (int var9 = 0; var9 < this.field31201; var9++) {
                        int var11 = 2 * var9;
                        var7[var11] = var2[var9][var8][0];
                        var7[var11 + 1] = var2[var9][var8][1];
                     }

                     this.field31211.method27168(var7, 0, var3);

                     for (int var21 = 0; var21 < this.field31201; var21++) {
                        int var33 = 2 * var21;
                        var2[var21][var8][0] = var7[var33];
                        var2[var21][var8][1] = var7[var33 + 1];
                     }
                  }
               }
            } else {
               for (int var16 = 0; var16 < this.field31203; var16++) {
                  for (int var22 = 0; var22 < this.field31201; var22++) {
                     int var34 = 2 * var22;
                     int var12 = 2 * this.field31201 + 2 * var22;
                     var7[var34] = var2[var22][var16][0];
                     var7[var34 + 1] = var2[var22][var16][1];
                     var7[var12] = var2[var22][var16][2];
                     var7[var12 + 1] = var2[var22][var16][3];
                  }

                  this.field31211.method27168(var7, 0, var3);
                  this.field31211.method27168(var7, 2 * this.field31201, var3);

                  for (int var23 = 0; var23 < this.field31201; var23++) {
                     int var35 = 2 * var23;
                     int var44 = 2 * this.field31201 + 2 * var23;
                     var2[var23][var16][0] = var7[var35];
                     var2[var23][var16][1] = var7[var35 + 1];
                     var2[var23][var16][2] = var7[var44];
                     var2[var23][var16][3] = var7[var44 + 1];
                  }
               }
            }
         } else {
            for (int var17 = 0; var17 < this.field31203; var17++) {
               for (int var24 = 0; var24 < this.field31205; var24 += 8) {
                  for (int var10 = 0; var10 < this.field31201; var10++) {
                     int var36 = 2 * var10;
                     int var45 = 2 * this.field31201 + 2 * var10;
                     int var13 = var45 + 2 * this.field31201;
                     int var14 = var13 + 2 * this.field31201;
                     var7[var36] = var2[var10][var17][var24];
                     var7[var36 + 1] = var2[var10][var17][var24 + 1];
                     var7[var45] = var2[var10][var17][var24 + 2];
                     var7[var45 + 1] = var2[var10][var17][var24 + 3];
                     var7[var13] = var2[var10][var17][var24 + 4];
                     var7[var13 + 1] = var2[var10][var17][var24 + 5];
                     var7[var14] = var2[var10][var17][var24 + 6];
                     var7[var14 + 1] = var2[var10][var17][var24 + 7];
                  }

                  this.field31211.method27168(var7, 0, var3);
                  this.field31211.method27168(var7, 2 * this.field31201, var3);
                  this.field31211.method27168(var7, 4 * this.field31201, var3);
                  this.field31211.method27168(var7, 6 * this.field31201, var3);

                  for (int var30 = 0; var30 < this.field31201; var30++) {
                     int var37 = 2 * var30;
                     int var46 = 2 * this.field31201 + 2 * var30;
                     int var51 = var46 + 2 * this.field31201;
                     int var54 = var51 + 2 * this.field31201;
                     var2[var30][var17][var24] = var7[var37];
                     var2[var30][var17][var24 + 1] = var7[var37 + 1];
                     var2[var30][var17][var24 + 2] = var7[var46];
                     var2[var30][var17][var24 + 3] = var7[var46 + 1];
                     var2[var30][var17][var24 + 4] = var7[var51];
                     var2[var30][var17][var24 + 5] = var7[var51 + 1];
                     var2[var30][var17][var24 + 6] = var7[var54];
                     var2[var30][var17][var24 + 7] = var7[var54 + 1];
                  }
               }
            }
         }
      } else if (this.field31205 <= 4) {
         if (this.field31205 != 4) {
            if (this.field31205 == 2) {
               for (int var18 = 0; var18 < this.field31203; var18++) {
                  for (int var25 = 0; var25 < this.field31201; var25++) {
                     int var38 = 2 * var25;
                     var7[var38] = var2[var25][var18][0];
                     var7[var38 + 1] = var2[var25][var18][1];
                  }

                  this.field31211.method27164(var7, 0);

                  for (int var26 = 0; var26 < this.field31201; var26++) {
                     int var39 = 2 * var26;
                     var2[var26][var18][0] = var7[var39];
                     var2[var26][var18][1] = var7[var39 + 1];
                  }
               }
            }
         } else {
            for (int var19 = 0; var19 < this.field31203; var19++) {
               for (int var27 = 0; var27 < this.field31201; var27++) {
                  int var40 = 2 * var27;
                  int var47 = 2 * this.field31201 + 2 * var27;
                  var7[var40] = var2[var27][var19][0];
                  var7[var40 + 1] = var2[var27][var19][1];
                  var7[var47] = var2[var27][var19][2];
                  var7[var47 + 1] = var2[var27][var19][3];
               }

               this.field31211.method27164(var7, 0);
               this.field31211.method27164(var7, 2 * this.field31201);

               for (int var28 = 0; var28 < this.field31201; var28++) {
                  int var41 = 2 * var28;
                  int var48 = 2 * this.field31201 + 2 * var28;
                  var2[var28][var19][0] = var7[var41];
                  var2[var28][var19][1] = var7[var41 + 1];
                  var2[var28][var19][2] = var7[var48];
                  var2[var28][var19][3] = var7[var48 + 1];
               }
            }
         }
      } else {
         for (int var20 = 0; var20 < this.field31203; var20++) {
            for (int var29 = 0; var29 < this.field31205; var29 += 8) {
               for (int var31 = 0; var31 < this.field31201; var31++) {
                  int var42 = 2 * var31;
                  int var49 = 2 * this.field31201 + 2 * var31;
                  int var52 = var49 + 2 * this.field31201;
                  int var55 = var52 + 2 * this.field31201;
                  var7[var42] = var2[var31][var20][var29];
                  var7[var42 + 1] = var2[var31][var20][var29 + 1];
                  var7[var49] = var2[var31][var20][var29 + 2];
                  var7[var49 + 1] = var2[var31][var20][var29 + 3];
                  var7[var52] = var2[var31][var20][var29 + 4];
                  var7[var52 + 1] = var2[var31][var20][var29 + 5];
                  var7[var55] = var2[var31][var20][var29 + 6];
                  var7[var55 + 1] = var2[var31][var20][var29 + 7];
               }

               this.field31211.method27164(var7, 0);
               this.field31211.method27164(var7, 2 * this.field31201);
               this.field31211.method27164(var7, 4 * this.field31201);
               this.field31211.method27164(var7, 6 * this.field31201);

               for (int var32 = 0; var32 < this.field31201; var32++) {
                  int var43 = 2 * var32;
                  int var50 = 2 * this.field31201 + 2 * var32;
                  int var53 = var50 + 2 * this.field31201;
                  int var56 = var53 + 2 * this.field31201;
                  var2[var32][var20][var29] = var7[var43];
                  var2[var32][var20][var29 + 1] = var7[var43 + 1];
                  var2[var32][var20][var29 + 2] = var7[var50];
                  var2[var32][var20][var29 + 3] = var7[var50 + 1];
                  var2[var32][var20][var29 + 4] = var7[var53];
                  var2[var32][var20][var29 + 5] = var7[var53 + 1];
                  var2[var32][var20][var29 + 6] = var7[var56];
                  var2[var32][var20][var29 + 7] = var7[var56 + 1];
               }
            }
         }
      }
   }

   private void method22879(int var1, int var2, double[] var3, boolean var4) {
      int var7 = Class9044.method33603(Class7008.method21726(), this.field31201);
      int var8 = this.field31201;
      if (var8 < this.field31203) {
         var8 = this.field31203;
      }

      var8 *= 8;
      if (this.field31205 == 4) {
         var8 >>= 1;
      } else if (this.field31205 < 4) {
         var8 >>= 2;
      }

      int var9 = var8;
      Future[] var10 = new Future[var7];

      for (int var11 = 0; var11 < var7; var11++) {
         var10[var11] = Class7008.method21729(new Class1520(this, var9, var2, var11, var7, var1, var3, var4));
      }

      try {
         Class7008.method21730(var10);
      } catch (InterruptedException var13) {
         Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var13);
      } catch (ExecutionException var14) {
         Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var14);
      }
   }

   private void method22880(long var1, int var3, Class2381 var4, boolean var5) {
      int var8 = (int)Class9044.method33604((long)Class7008.method21726(), this.field31202);
      long var9 = this.field31202;
      if (var9 < this.field31204) {
         var9 = this.field31204;
      }

      var9 *= 8L;
      if (this.field31206 == 4L) {
         var9 >>= 1;
      } else if (this.field31206 < 4L) {
         var9 >>= 2;
      }

      long var11 = var9;
      Future[] var13 = new Future[var8];

      for (int var14 = 0; var14 < var8; var14++) {
         long var15 = (long)var14;
         var13[var14] = Class7008.method21729(new Class780(this, var11, var3, var15, var8, var1, var4, var5));
      }

      try {
         Class7008.method21730(var13);
      } catch (InterruptedException var18) {
         Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var18);
      } catch (ExecutionException var19) {
         Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var19);
      }
   }

   private void method22881(int var1, int var2, double[] var3, boolean var4) {
      int var7 = Class9044.method33603(Class7008.method21726(), this.field31201);
      int var8 = this.field31201;
      if (var8 < this.field31203) {
         var8 = this.field31203;
      }

      var8 *= 8;
      if (this.field31205 == 4) {
         var8 >>= 1;
      } else if (this.field31205 < 4) {
         var8 >>= 2;
      }

      int var9 = var8;
      Future[] var10 = new Future[var7];

      for (int var11 = 0; var11 < var7; var11++) {
         var10[var11] = Class7008.method21729(new Class1464(this, var9, var2, var11, var7, var1, var3, var4));
      }

      try {
         Class7008.method21730(var10);
      } catch (InterruptedException var13) {
         Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var13);
      } catch (ExecutionException var14) {
         Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var14);
      }
   }

   private void method22882(long var1, int var3, Class2381 var4, boolean var5) {
      int var8 = (int)Class9044.method33604((long)Class7008.method21726(), this.field31202);
      long var9 = this.field31202;
      if (var9 < this.field31204) {
         var9 = this.field31204;
      }

      var9 *= 8L;
      if (this.field31206 == 4L) {
         var9 >>= 1;
      } else if (this.field31206 < 4L) {
         var9 >>= 2;
      }

      long var11 = var9;
      Future[] var13 = new Future[var8];

      for (int var14 = 0; var14 < var8; var14++) {
         long var15 = (long)var14;
         var13[var14] = Class7008.method21729(new Class561(this, var11, var3, var15, var8, var1, var4, var5));
      }

      try {
         Class7008.method21730(var13);
      } catch (InterruptedException var18) {
         Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var18);
      } catch (ExecutionException var19) {
         Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var19);
      }
   }

   private void method22883(int var1, int var2, double[][][] var3, boolean var4) {
      int var7 = Class9044.method33603(Class7008.method21726(), this.field31201);
      int var8 = this.field31201;
      if (var8 < this.field31203) {
         var8 = this.field31203;
      }

      var8 *= 8;
      if (this.field31205 == 4) {
         var8 >>= 1;
      } else if (this.field31205 < 4) {
         var8 >>= 2;
      }

      int var9 = var8;
      Future[] var10 = new Future[var7];

      for (int var11 = 0; var11 < var7; var11++) {
         var10[var11] = Class7008.method21729(new Class579(this, var9, var2, var11, var7, var1, var3, var4));
      }

      try {
         Class7008.method21730(var10);
      } catch (InterruptedException var13) {
         Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var13);
      } catch (ExecutionException var14) {
         Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var14);
      }
   }

   private void method22884(int var1, int var2, double[][][] var3, boolean var4) {
      int var7 = Class9044.method33603(Class7008.method21726(), this.field31201);
      int var8 = this.field31201;
      if (var8 < this.field31203) {
         var8 = this.field31203;
      }

      var8 *= 8;
      if (this.field31205 == 4) {
         var8 >>= 1;
      } else if (this.field31205 < 4) {
         var8 >>= 2;
      }

      int var9 = var8;
      Future[] var10 = new Future[var7];

      for (int var11 = 0; var11 < var7; var11++) {
         var10[var11] = Class7008.method21729(new Class679(this, var9, var2, var11, var7, var1, var3, var4));
      }

      try {
         Class7008.method21730(var10);
      } catch (InterruptedException var13) {
         Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var13);
      } catch (ExecutionException var14) {
         Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var14);
      }
   }

   private void method22885(int var1, double[] var2, boolean var3) {
      int var6 = Class9044.method33603(Class7008.method21726(), this.field31203);
      int var7 = this.field31201;
      if (var7 < this.field31203) {
         var7 = this.field31203;
      }

      var7 *= 8;
      if (this.field31205 == 4) {
         var7 >>= 1;
      } else if (this.field31205 < 4) {
         var7 >>= 2;
      }

      int var8 = var7;
      Future[] var9 = new Future[var6];

      for (int var10 = 0; var10 < var6; var10++) {
         var9[var10] = Class7008.method21729(new Class773(this, var8, var1, var10, var6, var2, var3));
      }

      try {
         Class7008.method21730(var9);
      } catch (InterruptedException var12) {
         Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var12);
      } catch (ExecutionException var13) {
         Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var13);
      }
   }

   private void method22886(int var1, Class2381 var2, boolean var3) {
      int var6 = (int)Class9044.method33604((long)Class7008.method21726(), this.field31204);
      long var7 = this.field31202;
      if (var7 < this.field31204) {
         var7 = this.field31204;
      }

      var7 *= 8L;
      if (this.field31206 == 4L) {
         var7 >>= 1;
      } else if (this.field31206 < 4L) {
         var7 >>= 2;
      }

      long var9 = var7;
      Future[] var11 = new Future[var6];

      for (int var12 = 0; var12 < var6; var12++) {
         long var13 = (long)var12;
         var11[var12] = Class7008.method21729(new Class1576(this, var9, var1, var13, var6, var2, var3));
      }

      try {
         Class7008.method21730(var11);
      } catch (InterruptedException var16) {
         Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var16);
      } catch (ExecutionException var17) {
         Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var17);
      }
   }

   private void method22887(int var1, double[][][] var2, boolean var3) {
      int var6 = Class9044.method33603(Class7008.method21726(), this.field31203);
      int var7 = this.field31201;
      if (var7 < this.field31203) {
         var7 = this.field31203;
      }

      var7 *= 8;
      if (this.field31205 == 4) {
         var7 >>= 1;
      } else if (this.field31205 < 4) {
         var7 >>= 2;
      }

      int var8 = var7;
      Future[] var9 = new Future[var6];

      for (int var10 = 0; var10 < var6; var10++) {
         var9[var10] = Class7008.method21729(new Class727(this, var8, var1, var10, var6, var2, var3));
      }

      try {
         Class7008.method21730(var9);
      } catch (InterruptedException var12) {
         Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var12);
      } catch (ExecutionException var13) {
         Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var13);
      }
   }

   private void method22888(int var1, double[] var2) {
      int var5 = this.field31201 >> 1;
      int var6 = this.field31203 >> 1;
      if (var1 >= 0) {
         for (int var7 = 1; var7 < var5; var7++) {
            int var9 = this.field31201 - var7;
            int var10 = var9 * this.field31207;
            int var11 = var7 * this.field31207;
            var2[var10] = 0.5 * (var2[var11] - var2[var10]);
            var2[var11] -= var2[var10];
            var2[var10 + 1] = 0.5 * (var2[var11 + 1] + var2[var10 + 1]);
            var2[var11 + 1] = var2[var11 + 1] - var2[var10 + 1];
            int var12 = var9 * this.field31207 + var6 * this.field31209;
            int var13 = var7 * this.field31207 + var6 * this.field31209;
            var2[var12] = 0.5 * (var2[var13] - var2[var12]);
            var2[var13] -= var2[var12];
            var2[var12 + 1] = 0.5 * (var2[var13 + 1] + var2[var12 + 1]);
            var2[var13 + 1] = var2[var13 + 1] - var2[var12 + 1];

            for (int var8 = 1; var8 < var6; var8++) {
               int var16 = this.field31203 - var8;
               var10 = var9 * this.field31207 + var16 * this.field31209;
               var11 = var7 * this.field31207 + var8 * this.field31209;
               var2[var10] = 0.5 * (var2[var11] - var2[var10]);
               var2[var11] -= var2[var10];
               var2[var10 + 1] = 0.5 * (var2[var11 + 1] + var2[var10 + 1]);
               var2[var11 + 1] = var2[var11 + 1] - var2[var10 + 1];
               var12 = var7 * this.field31207 + var16 * this.field31209;
               var13 = var9 * this.field31207 + var8 * this.field31209;
               var2[var12] = 0.5 * (var2[var13] - var2[var12]);
               var2[var13] -= var2[var12];
               var2[var12 + 1] = 0.5 * (var2[var13 + 1] + var2[var12 + 1]);
               var2[var13 + 1] = var2[var13 + 1] - var2[var12 + 1];
            }
         }

         for (int var18 = 1; var18 < var6; var18++) {
            int var53 = this.field31203 - var18;
            int var23 = var53 * this.field31209;
            int var28 = var18 * this.field31209;
            var2[var23] = 0.5 * (var2[var28] - var2[var23]);
            var2[var28] -= var2[var23];
            var2[var23 + 1] = 0.5 * (var2[var28 + 1] + var2[var23 + 1]);
            var2[var28 + 1] = var2[var28 + 1] - var2[var23 + 1];
            int var33 = var5 * this.field31207 + var53 * this.field31209;
            int var38 = var5 * this.field31207 + var18 * this.field31209;
            var2[var33] = 0.5 * (var2[var38] - var2[var33]);
            var2[var38] -= var2[var33];
            var2[var33 + 1] = 0.5 * (var2[var38 + 1] + var2[var33 + 1]);
            var2[var38 + 1] = var2[var38 + 1] - var2[var33 + 1];
         }
      } else {
         for (int var17 = 1; var17 < var5; var17++) {
            int var21 = this.field31201 - var17;
            int var24 = var17 * this.field31207;
            int var29 = var21 * this.field31207;
            int var34 = var17 * this.field31207 + var6 * this.field31209;
            int var39 = var21 * this.field31207 + var6 * this.field31209;
            double var14 = var2[var24] - var2[var29];
            var2[var24] += var2[var29];
            var2[var29] = var14;
            var14 = var2[var29 + 1] - var2[var24 + 1];
            var2[var24 + 1] = var2[var24 + 1] + var2[var29 + 1];
            var2[var29 + 1] = var14;
            var14 = var2[var34] - var2[var39];
            var2[var34] += var2[var39];
            var2[var39] = var14;
            var14 = var2[var39 + 1] - var2[var34 + 1];
            var2[var34 + 1] = var2[var34 + 1] + var2[var39 + 1];
            var2[var39 + 1] = var14;

            for (int var19 = 1; var19 < var6; var19++) {
               int var54 = this.field31203 - var19;
               var24 = var17 * this.field31207 + var19 * this.field31209;
               var29 = var21 * this.field31207 + var54 * this.field31209;
               var14 = var2[var24] - var2[var29];
               var2[var24] += var2[var29];
               var2[var29] = var14;
               var14 = var2[var29 + 1] - var2[var24 + 1];
               var2[var24 + 1] = var2[var24 + 1] + var2[var29 + 1];
               var2[var29 + 1] = var14;
               var34 = var21 * this.field31207 + var19 * this.field31209;
               var39 = var17 * this.field31207 + var54 * this.field31209;
               var14 = var2[var34] - var2[var39];
               var2[var34] += var2[var39];
               var2[var39] = var14;
               var14 = var2[var39 + 1] - var2[var34 + 1];
               var2[var34 + 1] = var2[var34 + 1] + var2[var39 + 1];
               var2[var39 + 1] = var14;
            }
         }

         for (int var20 = 1; var20 < var6; var20++) {
            int var55 = this.field31203 - var20;
            int var26 = var20 * this.field31209;
            int var31 = var55 * this.field31209;
            double var49 = var2[var26] - var2[var31];
            var2[var26] += var2[var31];
            var2[var31] = var49;
            var49 = var2[var31 + 1] - var2[var26 + 1];
            var2[var26 + 1] = var2[var26 + 1] + var2[var31 + 1];
            var2[var31 + 1] = var49;
            int var36 = var5 * this.field31207 + var20 * this.field31209;
            int var41 = var5 * this.field31207 + var55 * this.field31209;
            var49 = var2[var36] - var2[var41];
            var2[var36] += var2[var41];
            var2[var41] = var49;
            var49 = var2[var41 + 1] - var2[var36 + 1];
            var2[var36 + 1] = var2[var36 + 1] + var2[var41 + 1];
            var2[var41 + 1] = var49;
         }
      }
   }

   private void method22889(int var1, Class2381 var2) {
      long var5 = this.field31202 >> 1;
      long var7 = this.field31204 >> 1;
      if (var1 >= 0) {
         for (long var9 = 1L; var9 < var5; var9++) {
            long var13 = this.field31202 - var9;
            long var15 = var13 * this.field31208;
            long var17 = var9 * this.field31208;
            var2.method9687(var15, 0.5 * (var2.method9653(var17) - var2.method9653(var15)));
            var2.method9687(var17, var2.method9653(var17) - var2.method9653(var15));
            var2.method9687(var15 + 1L, 0.5 * (var2.method9653(var17 + 1L) + var2.method9653(var15 + 1L)));
            var2.method9687(var17 + 1L, var2.method9653(var17 + 1L) - var2.method9653(var15 + 1L));
            long var19 = var13 * this.field31208 + var7 * this.field31210;
            long var21 = var9 * this.field31208 + var7 * this.field31210;
            var2.method9687(var19, 0.5 * (var2.method9653(var21) - var2.method9653(var19)));
            var2.method9687(var21, var2.method9653(var21) - var2.method9653(var19));
            var2.method9687(var19 + 1L, 0.5 * (var2.method9653(var21 + 1L) + var2.method9653(var19 + 1L)));
            var2.method9687(var21 + 1L, var2.method9653(var21 + 1L) - var2.method9653(var19 + 1L));

            for (long var11 = 1L; var11 < var7; var11++) {
               long var25 = this.field31204 - var11;
               var15 = var13 * this.field31208 + var25 * this.field31210;
               var17 = var9 * this.field31208 + var11 * this.field31210;
               var2.method9687(var15, 0.5 * (var2.method9653(var17) - var2.method9653(var15)));
               var2.method9687(var17, var2.method9653(var17) - var2.method9653(var15));
               var2.method9687(var15 + 1L, 0.5 * (var2.method9653(var17 + 1L) + var2.method9653(var15 + 1L)));
               var2.method9687(var17 + 1L, var2.method9653(var17 + 1L) - var2.method9653(var15 + 1L));
               var19 = var9 * this.field31208 + var25 * this.field31210;
               var21 = var13 * this.field31208 + var11 * this.field31210;
               var2.method9687(var19, 0.5 * (var2.method9653(var21) - var2.method9653(var19)));
               var2.method9687(var21, var2.method9653(var21) - var2.method9653(var19));
               var2.method9687(var19 + 1L, 0.5 * (var2.method9653(var21 + 1L) + var2.method9653(var19 + 1L)));
               var2.method9687(var21 + 1L, var2.method9653(var21 + 1L) - var2.method9653(var19 + 1L));
            }
         }

         for (long var28 = 1L; var28 < var7; var28++) {
            long var63 = this.field31204 - var28;
            long var33 = var63 * this.field31210;
            long var38 = var28 * this.field31210;
            var2.method9687(var33, 0.5 * (var2.method9653(var38) - var2.method9653(var33)));
            var2.method9687(var38, var2.method9653(var38) - var2.method9653(var33));
            var2.method9687(var33 + 1L, 0.5 * (var2.method9653(var38 + 1L) + var2.method9653(var33 + 1L)));
            var2.method9687(var38 + 1L, var2.method9653(var38 + 1L) - var2.method9653(var33 + 1L));
            long var43 = var5 * this.field31208 + var63 * this.field31210;
            long var48 = var5 * this.field31208 + var28 * this.field31210;
            var2.method9687(var43, 0.5 * (var2.method9653(var48) - var2.method9653(var43)));
            var2.method9687(var48, var2.method9653(var48) - var2.method9653(var43));
            var2.method9687(var43 + 1L, 0.5 * (var2.method9653(var48 + 1L) + var2.method9653(var43 + 1L)));
            var2.method9687(var48 + 1L, var2.method9653(var48 + 1L) - var2.method9653(var43 + 1L));
         }
      } else {
         for (long var27 = 1L; var27 < var5; var27++) {
            long var31 = this.field31202 - var27;
            long var34 = var27 * this.field31208;
            long var39 = var31 * this.field31208;
            long var44 = var27 * this.field31208 + var7 * this.field31210;
            long var49 = var31 * this.field31208 + var7 * this.field31210;
            double var23 = var2.method9653(var34) - var2.method9653(var39);
            var2.method9687(var34, var2.method9653(var34) + var2.method9653(var39));
            var2.method9687(var39, var23);
            var23 = var2.method9653(var39 + 1L) - var2.method9653(var34 + 1L);
            var2.method9687(var34 + 1L, var2.method9653(var34 + 1L) + var2.method9653(var39 + 1L));
            var2.method9687(var39 + 1L, var23);
            var23 = var2.method9653(var44) - var2.method9653(var49);
            var2.method9687(var44, var2.method9653(var44) + var2.method9653(var49));
            var2.method9687(var49, var23);
            var23 = var2.method9653(var49 + 1L) - var2.method9653(var44 + 1L);
            var2.method9687(var44 + 1L, var2.method9653(var44 + 1L) + var2.method9653(var49 + 1L));
            var2.method9687(var49 + 1L, var23);

            for (long var29 = 1L; var29 < var7; var29++) {
               long var64 = this.field31204 - var29;
               var34 = var27 * this.field31208 + var29 * this.field31210;
               var39 = var31 * this.field31208 + var64 * this.field31210;
               var23 = var2.method9653(var34) - var2.method9653(var39);
               var2.method9687(var34, var2.method9653(var34) + var2.method9653(var39));
               var2.method9687(var39, var23);
               var23 = var2.method9653(var39 + 1L) - var2.method9653(var34 + 1L);
               var2.method9687(var34 + 1L, var2.method9653(var34 + 1L) + var2.method9653(var39 + 1L));
               var2.method9687(var39 + 1L, var23);
               var44 = var31 * this.field31208 + var29 * this.field31210;
               var49 = var27 * this.field31208 + var64 * this.field31210;
               var23 = var2.method9653(var44) - var2.method9653(var49);
               var2.method9687(var44, var2.method9653(var44) + var2.method9653(var49));
               var2.method9687(var49, var23);
               var23 = var2.method9653(var49 + 1L) - var2.method9653(var44 + 1L);
               var2.method9687(var44 + 1L, var2.method9653(var44 + 1L) + var2.method9653(var49 + 1L));
               var2.method9687(var49 + 1L, var23);
            }
         }

         for (long var30 = 1L; var30 < var7; var30++) {
            long var65 = this.field31204 - var30;
            long var36 = var30 * this.field31210;
            long var41 = var65 * this.field31210;
            double var59 = var2.method9653(var36) - var2.method9653(var41);
            var2.method9687(var36, var2.method9653(var36) + var2.method9653(var41));
            var2.method9687(var41, var59);
            var59 = var2.method9653(var41 + 1L) - var2.method9653(var36 + 1L);
            var2.method9687(var36 + 1L, var2.method9653(var36 + 1L) + var2.method9653(var41 + 1L));
            var2.method9687(var41 + 1L, var59);
            long var46 = var5 * this.field31208 + var30 * this.field31210;
            long var51 = var5 * this.field31208 + var65 * this.field31210;
            var59 = var2.method9653(var46) - var2.method9653(var51);
            var2.method9687(var46, var2.method9653(var46) + var2.method9653(var51));
            var2.method9687(var51, var59);
            var59 = var2.method9653(var51 + 1L) - var2.method9653(var46 + 1L);
            var2.method9687(var46 + 1L, var2.method9653(var46 + 1L) + var2.method9653(var51 + 1L));
            var2.method9687(var51 + 1L, var59);
         }
      }
   }

   private void method22890(int var1, double[][][] var2) {
      int var5 = this.field31201 >> 1;
      int var6 = this.field31203 >> 1;
      if (var1 >= 0) {
         for (int var7 = 1; var7 < var5; var7++) {
            int var9 = this.field31201 - var7;
            var2[var9][0][0] = 0.5 * (var2[var7][0][0] - var2[var9][0][0]);
            var2[var7][0][0] = var2[var7][0][0] - var2[var9][0][0];
            var2[var9][0][1] = 0.5 * (var2[var7][0][1] + var2[var9][0][1]);
            var2[var7][0][1] = var2[var7][0][1] - var2[var9][0][1];
            var2[var9][var6][0] = 0.5 * (var2[var7][var6][0] - var2[var9][var6][0]);
            var2[var7][var6][0] = var2[var7][var6][0] - var2[var9][var6][0];
            var2[var9][var6][1] = 0.5 * (var2[var7][var6][1] + var2[var9][var6][1]);
            var2[var7][var6][1] = var2[var7][var6][1] - var2[var9][var6][1];

            for (int var8 = 1; var8 < var6; var8++) {
               int var12 = this.field31203 - var8;
               var2[var9][var12][0] = 0.5 * (var2[var7][var8][0] - var2[var9][var12][0]);
               var2[var7][var8][0] = var2[var7][var8][0] - var2[var9][var12][0];
               var2[var9][var12][1] = 0.5 * (var2[var7][var8][1] + var2[var9][var12][1]);
               var2[var7][var8][1] = var2[var7][var8][1] - var2[var9][var12][1];
               var2[var7][var12][0] = 0.5 * (var2[var9][var8][0] - var2[var7][var12][0]);
               var2[var9][var8][0] = var2[var9][var8][0] - var2[var7][var12][0];
               var2[var7][var12][1] = 0.5 * (var2[var9][var8][1] + var2[var7][var12][1]);
               var2[var9][var8][1] = var2[var9][var8][1] - var2[var7][var12][1];
            }
         }

         for (int var14 = 1; var14 < var6; var14++) {
            int var29 = this.field31203 - var14;
            var2[0][var29][0] = 0.5 * (var2[0][var14][0] - var2[0][var29][0]);
            var2[0][var14][0] = var2[0][var14][0] - var2[0][var29][0];
            var2[0][var29][1] = 0.5 * (var2[0][var14][1] + var2[0][var29][1]);
            var2[0][var14][1] = var2[0][var14][1] - var2[0][var29][1];
            var2[var5][var29][0] = 0.5 * (var2[var5][var14][0] - var2[var5][var29][0]);
            var2[var5][var14][0] = var2[var5][var14][0] - var2[var5][var29][0];
            var2[var5][var29][1] = 0.5 * (var2[var5][var14][1] + var2[var5][var29][1]);
            var2[var5][var14][1] = var2[var5][var14][1] - var2[var5][var29][1];
         }
      } else {
         for (int var13 = 1; var13 < var5; var13++) {
            int var17 = this.field31201 - var13;
            double var10 = var2[var13][0][0] - var2[var17][0][0];
            var2[var13][0][0] = var2[var13][0][0] + var2[var17][0][0];
            var2[var17][0][0] = var10;
            var10 = var2[var17][0][1] - var2[var13][0][1];
            var2[var13][0][1] = var2[var13][0][1] + var2[var17][0][1];
            var2[var17][0][1] = var10;
            var10 = var2[var13][var6][0] - var2[var17][var6][0];
            var2[var13][var6][0] = var2[var13][var6][0] + var2[var17][var6][0];
            var2[var17][var6][0] = var10;
            var10 = var2[var17][var6][1] - var2[var13][var6][1];
            var2[var13][var6][1] = var2[var13][var6][1] + var2[var17][var6][1];
            var2[var17][var6][1] = var10;

            for (int var15 = 1; var15 < var6; var15++) {
               int var30 = this.field31203 - var15;
               var10 = var2[var13][var15][0] - var2[var17][var30][0];
               var2[var13][var15][0] = var2[var13][var15][0] + var2[var17][var30][0];
               var2[var17][var30][0] = var10;
               var10 = var2[var17][var30][1] - var2[var13][var15][1];
               var2[var13][var15][1] = var2[var13][var15][1] + var2[var17][var30][1];
               var2[var17][var30][1] = var10;
               var10 = var2[var17][var15][0] - var2[var13][var30][0];
               var2[var17][var15][0] = var2[var17][var15][0] + var2[var13][var30][0];
               var2[var13][var30][0] = var10;
               var10 = var2[var13][var30][1] - var2[var17][var15][1];
               var2[var17][var15][1] = var2[var17][var15][1] + var2[var13][var30][1];
               var2[var13][var30][1] = var10;
            }
         }

         for (int var16 = 1; var16 < var6; var16++) {
            int var31 = this.field31203 - var16;
            double var25 = var2[0][var16][0] - var2[0][var31][0];
            var2[0][var16][0] = var2[0][var16][0] + var2[0][var31][0];
            var2[0][var31][0] = var25;
            var25 = var2[0][var31][1] - var2[0][var16][1];
            var2[0][var16][1] = var2[0][var16][1] + var2[0][var31][1];
            var2[0][var31][1] = var25;
            var25 = var2[var5][var16][0] - var2[var5][var31][0];
            var2[var5][var16][0] = var2[var5][var16][0] + var2[var5][var31][0];
            var2[var5][var31][0] = var25;
            var25 = var2[var5][var31][1] - var2[var5][var16][1];
            var2[var5][var16][1] = var2[var5][var16][1] + var2[var5][var31][1];
            var2[var5][var31][1] = var25;
         }
      }
   }

   private void method22891(double[][][] var1) {
      int var4 = 2 * this.field31205;
      int var5 = this.field31203 / 2;
      int var6 = this.field31201 / 2;
      int var7 = Class7008.method21726();
      if (var7 > 1 && this.field31215 && this.field31201 >= var7) {
         Future[] var22 = new Future[var7];
         int var26 = this.field31201 / var7;

         for (int var30 = 0; var30 < var7; var30++) {
            int var35 = var30 * var26;
            int var38 = var30 == var7 - 1 ? this.field31201 : var35 + var26;
            var22[var30] = Class7008.method21729(new Class1509(this, var35, var38, var4, var1));
         }

         try {
            Class7008.method21730(var22);
         } catch (InterruptedException var18) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var18);
         } catch (ExecutionException var19) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var19);
         }

         for (int var31 = 0; var31 < var7; var31++) {
            int var36 = var31 * var26;
            int var39 = var31 == var7 - 1 ? this.field31201 : var36 + var26;
            var22[var31] = Class7008.method21729(new Class1632(this, var36, var39, var5, var1));
         }

         try {
            Class7008.method21730(var22);
         } catch (InterruptedException var16) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var16);
         } catch (ExecutionException var17) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var17);
         }

         for (int var32 = 0; var32 < var7; var32++) {
            int var37 = var32 * var26;
            int var40 = var32 == var7 - 1 ? this.field31201 : var37 + var26;
            var22[var32] = Class7008.method21729(new Class475(this, var37, var40, var5, var1));
         }

         try {
            Class7008.method21730(var22);
         } catch (InterruptedException var14) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var14);
         } catch (ExecutionException var15) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var15);
         }
      } else {
         for (int var8 = 0; var8 < this.field31201; var8++) {
            int var9 = (this.field31201 - var8) % this.field31201;

            for (int var10 = 0; var10 < this.field31203; var10++) {
               int var11 = (this.field31203 - var10) % this.field31203;

               for (int var12 = 1; var12 < this.field31205; var12 += 2) {
                  int var13 = var4 - var12;
                  var1[var9][var11][var13] = -var1[var8][var10][var12 + 2];
                  var1[var9][var11][var13 - 1] = var1[var8][var10][var12 + 1];
               }
            }
         }

         for (int var20 = 0; var20 < this.field31201; var20++) {
            int var24 = (this.field31201 - var20) % this.field31201;

            for (int var28 = 1; var28 < var5; var28++) {
               int var33 = this.field31203 - var28;
               var1[var24][var28][this.field31205] = var1[var20][var33][1];
               var1[var20][var33][this.field31205] = var1[var20][var33][1];
               var1[var24][var28][this.field31205 + 1] = -var1[var20][var33][0];
               var1[var20][var33][this.field31205 + 1] = var1[var20][var33][0];
            }
         }

         for (int var21 = 0; var21 < this.field31201; var21++) {
            int var25 = (this.field31201 - var21) % this.field31201;

            for (int var29 = 1; var29 < var5; var29++) {
               int var34 = this.field31203 - var29;
               var1[var25][var34][0] = var1[var21][var29][0];
               var1[var25][var34][1] = -var1[var21][var29][1];
            }
         }
      }

      for (int var23 = 1; var23 < var6; var23++) {
         int var27 = this.field31201 - var23;
         var1[var23][0][this.field31205] = var1[var27][0][1];
         var1[var27][0][this.field31205] = var1[var27][0][1];
         var1[var23][0][this.field31205 + 1] = -var1[var27][0][0];
         var1[var27][0][this.field31205 + 1] = var1[var27][0][0];
         var1[var23][var5][this.field31205] = var1[var27][var5][1];
         var1[var27][var5][this.field31205] = var1[var27][var5][1];
         var1[var23][var5][this.field31205 + 1] = -var1[var27][var5][0];
         var1[var27][var5][this.field31205 + 1] = var1[var27][var5][0];
         var1[var27][0][0] = var1[var23][0][0];
         var1[var27][0][1] = -var1[var23][0][1];
         var1[var27][var5][0] = var1[var23][var5][0];
         var1[var27][var5][1] = -var1[var23][var5][1];
      }

      var1[0][0][this.field31205] = var1[0][0][1];
      var1[0][0][1] = 0.0;
      var1[0][var5][this.field31205] = var1[0][var5][1];
      var1[0][var5][1] = 0.0;
      var1[var6][0][this.field31205] = var1[var6][0][1];
      var1[var6][0][1] = 0.0;
      var1[var6][var5][this.field31205] = var1[var6][var5][1];
      var1[var6][var5][1] = 0.0;
      var1[var6][0][this.field31205 + 1] = 0.0;
      var1[var6][var5][this.field31205 + 1] = 0.0;
   }

   private void method22892(double[] var1) {
      int var4 = 2 * this.field31205;
      int var5 = this.field31203 / 2;
      int var6 = this.field31201 / 2;
      int var7 = this.field31203 * var4;
      int var8 = var4;

      for (int var9 = this.field31201 - 1; var9 >= 1; var9--) {
         int var10 = var9 * this.field31207;
         int var11 = 2 * var10;

         for (int var12 = 0; var12 < this.field31203; var12++) {
            int var13 = var12 * this.field31209;
            int var14 = 2 * var13;

            for (int var15 = 0; var15 < this.field31205; var15 += 2) {
               int var16 = var10 + var13 + var15;
               int var17 = var11 + var14 + var15;
               var1[var17] = var1[var16];
               var1[var16] = 0.0;
               var16++;
               var17++;
               var1[var17] = var1[var16];
               var1[var16] = 0.0;
            }
         }
      }

      for (int var27 = 1; var27 < this.field31203; var27++) {
         int var29 = (this.field31203 - var27) * this.field31209;
         int var35 = (this.field31203 - var27) * var8;

         for (int var40 = 0; var40 < this.field31205; var40 += 2) {
            int var56 = var29 + var40;
            int var64 = var35 + var40;
            var1[var64] = var1[var56];
            var1[var56] = 0.0;
            var56++;
            var64++;
            var1[var64] = var1[var56];
            var1[var56] = 0.0;
         }
      }

      int var28 = Class7008.method21726();
      if (var28 > 1 && this.field31215 && this.field31201 >= var28) {
         Future[] var44 = new Future[var28];
         int var54 = this.field31201 / var28;

         for (int var71 = 0; var71 < var28; var71++) {
            int var19 = var71 * var54;
            int var20 = var71 == var28 - 1 ? this.field31201 : var19 + var54;
            var44[var71] = Class7008.method21729(new Class1422(this, var19, var20, var7, var8, var4, var1));
         }

         try {
            Class7008.method21730(var44);
         } catch (InterruptedException var25) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var25);
         } catch (ExecutionException var26) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var26);
         }

         for (int var72 = 0; var72 < var28; var72++) {
            int var74 = var72 * var54;
            int var76 = var72 == var28 - 1 ? this.field31201 : var74 + var54;
            var44[var72] = Class7008.method21729(new Class348(this, var74, var76, var7, var5, var8, var1));
         }

         try {
            Class7008.method21730(var44);
         } catch (InterruptedException var23) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var23);
         } catch (ExecutionException var24) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var24);
         }

         for (int var73 = 0; var73 < var28; var73++) {
            int var75 = var73 * var54;
            int var77 = var73 == var28 - 1 ? this.field31201 : var75 + var54;
            var44[var73] = Class7008.method21729(new Class597(this, var75, var77, var7, var5, var8, var1));
         }

         try {
            Class7008.method21730(var44);
         } catch (InterruptedException var21) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var21);
         } catch (ExecutionException var22) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var22);
         }
      } else {
         for (int var41 = 0; var41 < this.field31201; var41++) {
            int var30 = (this.field31201 - var41) % this.field31201 * var7;
            int var46 = var41 * var7;

            for (int var51 = 0; var51 < this.field31203; var51++) {
               int var36 = (this.field31203 - var51) % this.field31203 * var8;
               int var49 = var51 * var8;

               for (int var18 = 1; var18 < this.field31205; var18 += 2) {
                  int var58 = var30 + var36 + var4 - var18;
                  int var66 = var46 + var49 + var18;
                  var1[var58] = -var1[var66 + 2];
                  var1[var58 - 1] = var1[var66 + 1];
               }
            }
         }

         for (int var42 = 0; var42 < this.field31201; var42++) {
            int var47 = (this.field31201 - var42) % this.field31201 * var7;
            int var50 = var42 * var7;

            for (int var52 = 1; var52 < var5; var52++) {
               int var37 = var50 + (this.field31203 - var52) * var8;
               int var59 = var47 + var52 * var8 + this.field31205;
               int var67 = var37 + this.field31205;
               int var31 = var37 + 1;
               var1[var59] = var1[var31];
               var1[var67] = var1[var31];
               var1[var59 + 1] = -var1[var37];
               var1[var67 + 1] = var1[var37];
            }
         }

         for (int var43 = 0; var43 < this.field31201; var43++) {
            int var32 = (this.field31201 - var43) % this.field31201 * var7;
            int var38 = var43 * var7;

            for (int var53 = 1; var53 < var5; var53++) {
               int var60 = var32 + (this.field31203 - var53) * var8;
               int var68 = var38 + var53 * var8;
               var1[var60] = var1[var68];
               var1[var60 + 1] = -var1[var68 + 1];
            }
         }
      }

      for (int var45 = 1; var45 < var6; var45++) {
         int var61 = var45 * var7;
         int var69 = (this.field31201 - var45) * var7;
         int var33 = var5 * var8;
         int var39 = var61 + var33;
         int var48 = var69 + var33;
         var1[var61 + this.field31205] = var1[var69 + 1];
         var1[var69 + this.field31205] = var1[var69 + 1];
         var1[var61 + this.field31205 + 1] = -var1[var69];
         var1[var69 + this.field31205 + 1] = var1[var69];
         var1[var39 + this.field31205] = var1[var48 + 1];
         var1[var48 + this.field31205] = var1[var48 + 1];
         var1[var39 + this.field31205 + 1] = -var1[var48];
         var1[var48 + this.field31205 + 1] = var1[var48];
         var1[var69] = var1[var61];
         var1[var69 + 1] = -var1[var61 + 1];
         var1[var48] = var1[var39];
         var1[var48 + 1] = -var1[var39 + 1];
      }

      var1[this.field31205] = var1[1];
      var1[1] = 0.0;
      int var62 = var5 * var8;
      int var70 = var6 * var7;
      int var34 = var62 + var70;
      var1[var62 + this.field31205] = var1[var62 + 1];
      var1[var62 + 1] = 0.0;
      var1[var70 + this.field31205] = var1[var70 + 1];
      var1[var70 + 1] = 0.0;
      var1[var34 + this.field31205] = var1[var34 + 1];
      var1[var34 + 1] = 0.0;
      var1[var70 + this.field31205 + 1] = 0.0;
      var1[var34 + this.field31205 + 1] = 0.0;
   }

   private void method22893(Class2381 var1) {
      long var4 = 2L * this.field31206;
      long var6 = this.field31204 / 2L;
      long var8 = this.field31202 / 2L;
      long var10 = this.field31204 * var4;
      long var12 = var4;

      for (long var14 = this.field31202 - 1L; var14 >= 1L; var14--) {
         long var16 = var14 * this.field31208;
         long var18 = 2L * var16;

         for (long var20 = 0L; var20 < this.field31204; var20++) {
            long var22 = var20 * this.field31210;
            long var24 = 2L * var22;

            for (long var26 = 0L; var26 < this.field31206; var26 += 2L) {
               long var28 = var16 + var22 + var26;
               long var30 = var18 + var24 + var26;
               var1.method9687(var30, var1.method9653(var28));
               var1.method9687(var28, 0.0);
               var1.method9687(++var30, var1.method9653(++var28));
               var1.method9687(var28, 0.0);
            }
         }
      }

      for (long var49 = 1L; var49 < this.field31204; var49++) {
         long var50 = (this.field31204 - var49) * this.field31210;
         long var56 = (this.field31204 - var49) * var12;

         for (long var61 = 0L; var61 < this.field31206; var61 += 2L) {
            long var69 = var50 + var61;
            long var77 = var56 + var61;
            var1.method9687(var77, var1.method9653(var69));
            var1.method9687(var69, 0.0);
            var1.method9687(++var77, var1.method9653(++var69));
            var1.method9687(var69, 0.0);
         }
      }

      int var32 = Class7008.method21726();
      if (var32 > 1 && this.field31215 && this.field31202 >= (long)var32) {
         Future[] var33 = new Future[var32];
         long var62 = this.field31202 / (long)var32;

         for (int var34 = 0; var34 < var32; var34++) {
            long var86 = (long)var34 * var62;
            long var37 = var34 == var32 - 1 ? this.field31202 : var86 + var62;
            var33[var34] = Class7008.method21729(new Class738(this, var86, var37, var10, var12, var4, var1));
         }

         try {
            Class7008.method21730(var33);
         } catch (InterruptedException var47) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var47);
         } catch (ExecutionException var48) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var48);
         }

         for (int var84 = 0; var84 < var32; var84++) {
            long var87 = (long)var84 * var62;
            long var89 = var84 == var32 - 1 ? this.field31202 : var87 + var62;
            var33[var84] = Class7008.method21729(new Class1446(this, var87, var89, var10, var6, var12, var1));
         }

         try {
            Class7008.method21730(var33);
         } catch (InterruptedException var45) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var45);
         } catch (ExecutionException var46) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var46);
         }

         for (int var85 = 0; var85 < var32; var85++) {
            long var88 = (long)var85 * var62;
            long var90 = var85 == var32 - 1 ? this.field31202 : var88 + var62;
            var33[var85] = Class7008.method21729(new Class545(this, var88, var90, var10, var6, var12, var1));
         }

         try {
            Class7008.method21730(var33);
         } catch (InterruptedException var43) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var43);
         } catch (ExecutionException var44) {
            Logger.getLogger(Class7274.class.getName()).log(Level.SEVERE, null, var44);
         }
      } else {
         for (long var39 = 0L; var39 < this.field31202; var39++) {
            long var51 = (this.field31202 - var39) % this.field31202 * var10;
            long var63 = var39 * var10;

            for (long var41 = 0L; var41 < this.field31204; var41++) {
               long var57 = (this.field31204 - var41) % this.field31204 * var12;
               long var66 = var41 * var12;

               for (long var35 = 1L; var35 < this.field31206; var35 += 2L) {
                  long var71 = var51 + var57 + var4 - var35;
                  long var79 = var63 + var66 + var35;
                  var1.method9687(var71, -var1.method9653(var79 + 2L));
                  var1.method9687(var71 - 1L, var1.method9653(var79 + 1L));
               }
            }
         }

         for (long var91 = 0L; var91 < this.field31202; var91++) {
            long var64 = (this.field31202 - var91) % this.field31202 * var10;
            long var67 = var91 * var10;

            for (long var94 = 1L; var94 < var6; var94++) {
               long var58 = var67 + (this.field31204 - var94) * var12;
               long var72 = var64 + var94 * var12 + this.field31206;
               long var80 = var58 + this.field31206;
               long var52 = var58 + 1L;
               var1.method9687(var72, var1.method9653(var52));
               var1.method9687(var80, var1.method9653(var52));
               var1.method9687(var72 + 1L, -var1.method9653(var58));
               var1.method9687(var80 + 1L, var1.method9653(var58));
            }
         }

         for (long var92 = 0L; var92 < this.field31202; var92++) {
            long var53 = (this.field31202 - var92) % this.field31202 * var10;
            long var59 = var92 * var10;

            for (long var95 = 1L; var95 < var6; var95++) {
               long var73 = var53 + (this.field31204 - var95) * var12;
               long var81 = var59 + var95 * var12;
               var1.method9687(var73, var1.method9653(var81));
               var1.method9687(var73 + 1L, -var1.method9653(var81 + 1L));
            }
         }
      }

      for (long var93 = 1L; var93 < var8; var93++) {
         long var74 = var93 * var10;
         long var82 = (this.field31202 - var93) * var10;
         long var54 = var6 * var12;
         long var60 = var74 + var54;
         long var65 = var82 + var54;
         var1.method9687(var74 + this.field31206, var1.method9653(var82 + 1L));
         var1.method9687(var82 + this.field31206, var1.method9653(var82 + 1L));
         var1.method9687(var74 + this.field31206 + 1L, -var1.method9653(var82));
         var1.method9687(var82 + this.field31206 + 1L, var1.method9653(var82));
         var1.method9687(var60 + this.field31206, var1.method9653(var65 + 1L));
         var1.method9687(var65 + this.field31206, var1.method9653(var65 + 1L));
         var1.method9687(var60 + this.field31206 + 1L, -var1.method9653(var65));
         var1.method9687(var65 + this.field31206 + 1L, var1.method9653(var65));
         var1.method9687(var82, var1.method9653(var74));
         var1.method9687(var82 + 1L, -var1.method9653(var74 + 1L));
         var1.method9687(var65, var1.method9653(var60));
         var1.method9687(var65 + 1L, -var1.method9653(var60 + 1L));
      }

      var1.method9687(this.field31206, var1.method9653(1L));
      var1.method9687(1L, 0.0);
      long var75 = var6 * var12;
      long var83 = var8 * var10;
      long var55 = var75 + var83;
      var1.method9687(var75 + this.field31206, var1.method9653(var75 + 1L));
      var1.method9687(var75 + 1L, 0.0);
      var1.method9687(var83 + this.field31206, var1.method9653(var83 + 1L));
      var1.method9687(var83 + 1L, 0.0);
      var1.method9687(var55 + this.field31206, var1.method9653(var55 + 1L));
      var1.method9687(var55 + 1L, 0.0);
      var1.method9687(var83 + this.field31206 + 1L, 0.0);
      var1.method9687(var55 + this.field31206 + 1L, 0.0);
   }

   // $VF: synthetic method
   public static int method22894(Class7274 var0) {
      return var0.field31207;
   }

   // $VF: synthetic method
   public static int method22895(Class7274 var0) {
      return var0.field31203;
   }

   // $VF: synthetic method
   public static int method22896(Class7274 var0) {
      return var0.field31209;
   }

   // $VF: synthetic method
   public static Class7990 method22897(Class7274 var0) {
      return var0.field31213;
   }

   // $VF: synthetic method
   public static int method22898(Class7274 var0) {
      return var0.field31205;
   }

   // $VF: synthetic method
   public static Class7990 method22899(Class7274 var0) {
      return var0.field31212;
   }

   // $VF: synthetic method
   public static int method22900(Class7274 var0) {
      return var0.field31201;
   }

   // $VF: synthetic method
   public static Class7990 method22901(Class7274 var0) {
      return var0.field31211;
   }

   // $VF: synthetic method
   public static long method22902(Class7274 var0) {
      return var0.field31208;
   }

   // $VF: synthetic method
   public static long method22903(Class7274 var0) {
      return var0.field31204;
   }

   // $VF: synthetic method
   public static long method22904(Class7274 var0) {
      return var0.field31210;
   }

   // $VF: synthetic method
   public static long method22905(Class7274 var0) {
      return var0.field31206;
   }

   // $VF: synthetic method
   public static long method22906(Class7274 var0) {
      return var0.field31202;
   }
}
