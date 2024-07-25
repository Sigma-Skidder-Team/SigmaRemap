package remapped;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public class class_3381 {
   private int field_16657;
   private long field_16665;
   private int field_16670;
   private long field_16667;
   private int field_16659;
   private long field_16668;
   private int field_16662;
   private long field_16661;
   private int field_16663;
   private long field_16669;
   private class_5298 field_16655;
   private class_5298 field_16658;
   private class_5298 field_16666;
   private boolean field_16664 = false;
   private boolean field_16660 = false;

   public class_3381(long var1, long var3, long var5) {
      if (var1 > 1L && var3 > 1L && var5 > 1L) {
         this.field_16657 = (int)var1;
         this.field_16670 = (int)var3;
         this.field_16659 = (int)var5;
         this.field_16665 = var1;
         this.field_16667 = var3;
         this.field_16668 = var5;
         this.field_16662 = (int)(var3 * var5);
         this.field_16663 = (int)var5;
         this.field_16661 = var3 * var5;
         this.field_16669 = var5;
         if (var1 * var3 * var5 >= class_2751.method_12537()) {
            this.field_16660 = true;
         }

         if (class_2751.method_12439(var1) && class_2751.method_12439(var3) && class_2751.method_12439(var5)) {
            this.field_16664 = true;
         }

         class_2751.method_12507(2L * var1 * var3 * var5 > (long)class_7975.method_36102());
         this.field_16655 = new class_5298(var1);
         if (var1 != var3) {
            this.field_16658 = new class_5298(var3);
         } else {
            this.field_16658 = this.field_16655;
         }

         if (var1 != var5) {
            if (var3 != var5) {
               this.field_16666 = new class_5298(var5);
            } else {
               this.field_16666 = this.field_16658;
            }
         } else {
            this.field_16666 = this.field_16655;
         }
      } else {
         throw new IllegalArgumentException("slices, rows and columns must be greater than 1");
      }
   }

   public void method_15608(float[] var1) {
      int var4 = class_1266.method_5693();
      if (this.field_16664) {
         int var5 = this.field_16659;
         this.field_16659 = 2 * this.field_16659;
         this.field_16662 = this.field_16670 * this.field_16659;
         this.field_16663 = this.field_16659;
         if (var4 > 1 && this.field_16660) {
            this.method_15620(0, -1, var1, true);
            this.method_15618(-1, var1, true);
         } else {
            this.method_15613(0, -1, var1, true);
            this.method_15601(-1, var1, true);
         }

         this.field_16659 = var5;
         this.field_16662 = this.field_16670 * this.field_16659;
         this.field_16663 = this.field_16659;
      } else {
         this.field_16662 = 2 * this.field_16670 * this.field_16659;
         this.field_16663 = 2 * this.field_16659;
         if (var4 > 1 && this.field_16660 && this.field_16657 >= var4 && this.field_16670 >= var4 && this.field_16659 >= var4) {
            Future[] var22 = new Future[var4];
            int var25 = this.field_16657 / var4;

            for (int var29 = 0; var29 < var4; var29++) {
               int var33 = var29 * var25;
               int var37 = var29 == var4 - 1 ? this.field_16657 : var33 + var25;
               var22[var29] = class_1266.method_5694(new class_2466(this, var33, var37, var1));
            }

            try {
               class_1266.method_5696(var22);
            } catch (InterruptedException var17) {
               Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var17);
            } catch (ExecutionException var18) {
               Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var18);
            }

            for (int var30 = 0; var30 < var4; var30++) {
               int var34 = var30 * var25;
               int var38 = var30 == var4 - 1 ? this.field_16657 : var34 + var25;
               var22[var30] = class_1266.method_5694(new class_7823(this, var34, var38, var1));
            }

            try {
               class_1266.method_5696(var22);
            } catch (InterruptedException var15) {
               Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var15);
            } catch (ExecutionException var16) {
               Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var16);
            }

            var25 = this.field_16670 / var4;

            for (int var31 = 0; var31 < var4; var31++) {
               int var35 = var31 * var25;
               int var39 = var31 == var4 - 1 ? this.field_16670 : var35 + var25;
               var22[var31] = class_1266.method_5694(new class_2936(this, var35, var39, var1));
            }

            try {
               class_1266.method_5696(var22);
            } catch (InterruptedException var13) {
               Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var13);
            } catch (ExecutionException var14) {
               Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var14);
            }
         } else {
            for (int var19 = 0; var19 < this.field_16657; var19++) {
               int var6 = var19 * this.field_16662;

               for (int var7 = 0; var7 < this.field_16670; var7++) {
                  this.field_16666.method_24186(var1, var6 + var7 * this.field_16663);
               }
            }

            float[] var20 = new float[2 * this.field_16670];

            for (int var23 = 0; var23 < this.field_16657; var23++) {
               int var27 = var23 * this.field_16662;

               for (int var8 = 0; var8 < this.field_16659; var8++) {
                  int var9 = 2 * var8;

                  for (int var10 = 0; var10 < this.field_16670; var10++) {
                     int var11 = var27 + var9 + var10 * this.field_16663;
                     int var12 = 2 * var10;
                     var20[var12] = var1[var11];
                     var20[var12 + 1] = var1[var11 + 1];
                  }

                  this.field_16658.method_24185(var20);

                  for (int var40 = 0; var40 < this.field_16670; var40++) {
                     int var43 = var27 + var9 + var40 * this.field_16663;
                     int var46 = 2 * var40;
                     var1[var43] = var20[var46];
                     var1[var43 + 1] = var20[var46 + 1];
                  }
               }
            }

            var20 = new float[2 * this.field_16657];

            for (int var24 = 0; var24 < this.field_16670; var24++) {
               int var28 = var24 * this.field_16663;

               for (int var32 = 0; var32 < this.field_16659; var32++) {
                  int var36 = 2 * var32;

                  for (int var41 = 0; var41 < this.field_16657; var41++) {
                     int var44 = var41 * this.field_16662 + var28 + var36;
                     int var47 = 2 * var41;
                     var20[var47] = var1[var44];
                     var20[var47 + 1] = var1[var44 + 1];
                  }

                  this.field_16655.method_24185(var20);

                  for (int var42 = 0; var42 < this.field_16657; var42++) {
                     int var45 = var42 * this.field_16662 + var28 + var36;
                     int var48 = 2 * var42;
                     var1[var45] = var20[var48];
                     var1[var45 + 1] = var20[var48 + 1];
                  }
               }
            }
         }

         this.field_16662 = this.field_16670 * this.field_16659;
         this.field_16663 = this.field_16659;
      }
   }

   public void method_15607(class_4330 var1) {
      if (!var1.method_36106() && !var1.method_36112()) {
         this.method_15608(var1.method_20155());
      } else {
         int var4 = class_1266.method_5693();
         if (this.field_16664) {
            long var5 = this.field_16668;
            this.field_16668 = 2L * this.field_16668;
            this.field_16661 = this.field_16667 * this.field_16668;
            this.field_16669 = this.field_16668;
            if (var4 > 1 && this.field_16660) {
               this.method_15622(0L, -1, var1, true);
               this.method_15617(-1, var1, true);
            } else {
               this.method_15615(0L, -1, var1, true);
               this.method_15600(-1, var1, true);
            }

            this.field_16668 = var5;
            this.field_16661 = this.field_16667 * this.field_16668;
            this.field_16669 = this.field_16668;
         } else {
            this.field_16661 = 2L * this.field_16667 * this.field_16668;
            this.field_16669 = 2L * this.field_16668;
            if (var4 > 1 && this.field_16660 && this.field_16665 >= (long)var4 && this.field_16667 >= (long)var4 && this.field_16668 >= (long)var4) {
               Future[] var37 = new Future[var4];
               long var39 = this.field_16665 / (long)var4;

               for (int var10 = 0; var10 < var4; var10++) {
                  long var43 = (long)var10 * var39;
                  long var13 = var10 == var4 - 1 ? this.field_16665 : var43 + var39;
                  var37[var10] = class_1266.method_5694(new class_9029(this, var43, var13, var1));
               }

               try {
                  class_1266.method_5696(var37);
               } catch (InterruptedException var33) {
                  Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var33);
               } catch (ExecutionException var34) {
                  Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var34);
               }

               for (int var41 = 0; var41 < var4; var41++) {
                  long var44 = (long)var41 * var39;
                  long var46 = var41 == var4 - 1 ? this.field_16665 : var44 + var39;
                  var37[var41] = class_1266.method_5694(new class_5003(this, var44, var46, var1));
               }

               try {
                  class_1266.method_5696(var37);
               } catch (InterruptedException var31) {
                  Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var31);
               } catch (ExecutionException var32) {
                  Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var32);
               }

               var39 = this.field_16667 / (long)var4;

               for (int var42 = 0; var42 < var4; var42++) {
                  long var45 = (long)var42 * var39;
                  long var47 = var42 == var4 - 1 ? this.field_16667 : var45 + var39;
                  var37[var42] = class_1266.method_5694(new class_2051(this, var45, var47, var1));
               }

               try {
                  class_1266.method_5696(var37);
               } catch (InterruptedException var29) {
                  Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var29);
               } catch (ExecutionException var30) {
                  Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var30);
               }
            } else {
               for (long var35 = 0L; var35 < this.field_16665; var35++) {
                  long var15 = var35 * this.field_16661;

                  for (long var11 = 0L; var11 < this.field_16667; var11++) {
                     this.field_16666.method_24184(var1, var15 + var11 * this.field_16669);
                  }
               }

               class_4330 var7 = new class_4330(2L * this.field_16667, false);

               for (long var8 = 0L; var8 < this.field_16665; var8++) {
                  long var17 = var8 * this.field_16661;

                  for (long var19 = 0L; var19 < this.field_16668; var19++) {
                     long var21 = 2L * var19;

                     for (long var23 = 0L; var23 < this.field_16667; var23++) {
                        long var25 = var17 + var21 + var23 * this.field_16669;
                        long var27 = 2L * var23;
                        var7.method_36123(var27, var1.method_36133(var25));
                        var7.method_36123(var27 + 1L, var1.method_36133(var25 + 1L));
                     }

                     this.field_16658.method_24183(var7);

                     for (long var51 = 0L; var51 < this.field_16667; var51++) {
                        long var54 = var17 + var21 + var51 * this.field_16669;
                        long var57 = 2L * var51;
                        var1.method_36123(var54, var7.method_36133(var57));
                        var1.method_36123(var54 + 1L, var7.method_36133(var57 + 1L));
                     }
                  }
               }

               var7 = new class_4330(2L * this.field_16665, false);

               for (long var38 = 0L; var38 < this.field_16667; var38++) {
                  long var48 = var38 * this.field_16669;

                  for (long var49 = 0L; var49 < this.field_16668; var49++) {
                     long var50 = 2L * var49;

                     for (long var52 = 0L; var52 < this.field_16665; var52++) {
                        long var55 = var52 * this.field_16661 + var48 + var50;
                        long var58 = 2L * var52;
                        var7.method_36123(var58, var1.method_36133(var55));
                        var7.method_36123(var58 + 1L, var1.method_36133(var55 + 1L));
                     }

                     this.field_16655.method_24183(var7);

                     for (long var53 = 0L; var53 < this.field_16665; var53++) {
                        long var56 = var53 * this.field_16661 + var48 + var50;
                        long var59 = 2L * var53;
                        var1.method_36123(var56, var7.method_36133(var59));
                        var1.method_36123(var56 + 1L, var7.method_36133(var59 + 1L));
                     }
                  }
               }
            }

            this.field_16661 = this.field_16667 * this.field_16668;
            this.field_16669 = this.field_16668;
         }
      }
   }

   public void method_15609(float[][][] var1) {
      int var4 = class_1266.method_5693();
      if (this.field_16664) {
         int var5 = this.field_16659;
         this.field_16659 = 2 * this.field_16659;
         this.field_16662 = this.field_16670 * this.field_16659;
         this.field_16663 = this.field_16659;
         if (var4 > 1 && this.field_16660) {
            this.method_15621(0, -1, var1, true);
            this.method_15619(-1, var1, true);
         } else {
            this.method_15614(0, -1, var1, true);
            this.method_15602(-1, var1, true);
         }

         this.field_16659 = var5;
         this.field_16662 = this.field_16670 * this.field_16659;
         this.field_16663 = this.field_16659;
      } else if (var4 > 1 && this.field_16660 && this.field_16657 >= var4 && this.field_16670 >= var4 && this.field_16659 >= var4) {
         Future[] var20 = new Future[var4];
         int var23 = this.field_16657 / var4;

         for (int var26 = 0; var26 < var4; var26++) {
            int var30 = var26 * var23;
            int var36 = var26 == var4 - 1 ? this.field_16657 : var30 + var23;
            var20[var26] = class_1266.method_5694(new class_8498(this, var30, var36, var1));
         }

         try {
            class_1266.method_5696(var20);
         } catch (InterruptedException var15) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var15);
         } catch (ExecutionException var16) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var16);
         }

         for (int var27 = 0; var27 < var4; var27++) {
            int var31 = var27 * var23;
            int var37 = var27 == var4 - 1 ? this.field_16657 : var31 + var23;
            var20[var27] = class_1266.method_5694(new class_4366(this, var31, var37, var1));
         }

         try {
            class_1266.method_5696(var20);
         } catch (InterruptedException var13) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var13);
         } catch (ExecutionException var14) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var14);
         }

         var23 = this.field_16670 / var4;

         for (int var28 = 0; var28 < var4; var28++) {
            int var32 = var28 * var23;
            int var38 = var28 == var4 - 1 ? this.field_16670 : var32 + var23;
            var20[var28] = class_1266.method_5694(new class_5423(this, var32, var38, var1));
         }

         try {
            class_1266.method_5696(var20);
         } catch (InterruptedException var11) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var11);
         } catch (ExecutionException var12) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var12);
         }
      } else {
         for (int var17 = 0; var17 < this.field_16657; var17++) {
            for (int var6 = 0; var6 < this.field_16670; var6++) {
               this.field_16666.method_24185(var1[var17][var6]);
            }
         }

         float[] var18 = new float[2 * this.field_16670];

         for (int var21 = 0; var21 < this.field_16657; var21++) {
            for (int var7 = 0; var7 < this.field_16659; var7++) {
               int var8 = 2 * var7;

               for (int var9 = 0; var9 < this.field_16670; var9++) {
                  int var10 = 2 * var9;
                  var18[var10] = var1[var21][var9][var8];
                  var18[var10 + 1] = var1[var21][var9][var8 + 1];
               }

               this.field_16658.method_24185(var18);

               for (int var33 = 0; var33 < this.field_16670; var33++) {
                  int var39 = 2 * var33;
                  var1[var21][var33][var8] = var18[var39];
                  var1[var21][var33][var8 + 1] = var18[var39 + 1];
               }
            }
         }

         var18 = new float[2 * this.field_16657];

         for (int var22 = 0; var22 < this.field_16670; var22++) {
            for (int var25 = 0; var25 < this.field_16659; var25++) {
               int var29 = 2 * var25;

               for (int var34 = 0; var34 < this.field_16657; var34++) {
                  int var40 = 2 * var34;
                  var18[var40] = var1[var34][var22][var29];
                  var18[var40 + 1] = var1[var34][var22][var29 + 1];
               }

               this.field_16655.method_24185(var18);

               for (int var35 = 0; var35 < this.field_16657; var35++) {
                  int var41 = 2 * var35;
                  var1[var35][var22][var29] = var18[var41];
                  var1[var35][var22][var29 + 1] = var18[var41 + 1];
               }
            }
         }
      }
   }

   public void method_15584(float[] var1, boolean var2) {
      int var5 = class_1266.method_5693();
      if (this.field_16664) {
         int var6 = this.field_16659;
         this.field_16659 = 2 * this.field_16659;
         this.field_16662 = this.field_16670 * this.field_16659;
         this.field_16663 = this.field_16659;
         if (var5 > 1 && this.field_16660) {
            this.method_15620(0, 1, var1, var2);
            this.method_15618(1, var1, var2);
         } else {
            this.method_15613(0, 1, var1, var2);
            this.method_15601(1, var1, var2);
         }

         this.field_16659 = var6;
         this.field_16662 = this.field_16670 * this.field_16659;
         this.field_16663 = this.field_16659;
      } else {
         this.field_16662 = 2 * this.field_16670 * this.field_16659;
         this.field_16663 = 2 * this.field_16659;
         if (var5 > 1 && this.field_16660 && this.field_16657 >= var5 && this.field_16670 >= var5 && this.field_16659 >= var5) {
            Future[] var23 = new Future[var5];
            int var26 = this.field_16657 / var5;

            for (int var30 = 0; var30 < var5; var30++) {
               int var34 = var30 * var26;
               int var38 = var30 == var5 - 1 ? this.field_16657 : var34 + var26;
               var23[var30] = class_1266.method_5694(new class_6002(this, var34, var38, var1, var2));
            }

            try {
               class_1266.method_5696(var23);
            } catch (InterruptedException var18) {
               Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var18);
            } catch (ExecutionException var19) {
               Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var19);
            }

            for (int var31 = 0; var31 < var5; var31++) {
               int var35 = var31 * var26;
               int var39 = var31 == var5 - 1 ? this.field_16657 : var35 + var26;
               var23[var31] = class_1266.method_5694(new class_2881(this, var35, var39, var1, var2));
            }

            try {
               class_1266.method_5696(var23);
            } catch (InterruptedException var16) {
               Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var16);
            } catch (ExecutionException var17) {
               Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var17);
            }

            var26 = this.field_16670 / var5;

            for (int var32 = 0; var32 < var5; var32++) {
               int var36 = var32 * var26;
               int var40 = var32 == var5 - 1 ? this.field_16670 : var36 + var26;
               var23[var32] = class_1266.method_5694(new class_3067(this, var36, var40, var1, var2));
            }

            try {
               class_1266.method_5696(var23);
            } catch (InterruptedException var14) {
               Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var14);
            } catch (ExecutionException var15) {
               Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var15);
            }
         } else {
            for (int var20 = 0; var20 < this.field_16657; var20++) {
               int var7 = var20 * this.field_16662;

               for (int var8 = 0; var8 < this.field_16670; var8++) {
                  this.field_16666.method_24215(var1, var7 + var8 * this.field_16663, var2);
               }
            }

            float[] var21 = new float[2 * this.field_16670];

            for (int var24 = 0; var24 < this.field_16657; var24++) {
               int var28 = var24 * this.field_16662;

               for (int var9 = 0; var9 < this.field_16659; var9++) {
                  int var10 = 2 * var9;

                  for (int var11 = 0; var11 < this.field_16670; var11++) {
                     int var12 = var28 + var10 + var11 * this.field_16663;
                     int var13 = 2 * var11;
                     var21[var13] = var1[var12];
                     var21[var13 + 1] = var1[var12 + 1];
                  }

                  this.field_16658.method_24216(var21, var2);

                  for (int var41 = 0; var41 < this.field_16670; var41++) {
                     int var44 = var28 + var10 + var41 * this.field_16663;
                     int var47 = 2 * var41;
                     var1[var44] = var21[var47];
                     var1[var44 + 1] = var21[var47 + 1];
                  }
               }
            }

            var21 = new float[2 * this.field_16657];

            for (int var25 = 0; var25 < this.field_16670; var25++) {
               int var29 = var25 * this.field_16663;

               for (int var33 = 0; var33 < this.field_16659; var33++) {
                  int var37 = 2 * var33;

                  for (int var42 = 0; var42 < this.field_16657; var42++) {
                     int var45 = var42 * this.field_16662 + var29 + var37;
                     int var48 = 2 * var42;
                     var21[var48] = var1[var45];
                     var21[var48 + 1] = var1[var45 + 1];
                  }

                  this.field_16655.method_24216(var21, var2);

                  for (int var43 = 0; var43 < this.field_16657; var43++) {
                     int var46 = var43 * this.field_16662 + var29 + var37;
                     int var49 = 2 * var43;
                     var1[var46] = var21[var49];
                     var1[var46 + 1] = var21[var49 + 1];
                  }
               }
            }
         }

         this.field_16662 = this.field_16670 * this.field_16659;
         this.field_16663 = this.field_16659;
      }
   }

   public void method_15583(class_4330 var1, boolean var2) {
      if (!var1.method_36106() && !var1.method_36112()) {
         this.method_15584(var1.method_20155(), var2);
      } else {
         int var5 = class_1266.method_5693();
         if (this.field_16664) {
            long var6 = this.field_16668;
            this.field_16668 = 2L * this.field_16668;
            this.field_16661 = this.field_16667 * this.field_16668;
            this.field_16669 = this.field_16668;
            if (var5 > 1 && this.field_16660) {
               this.method_15622(0L, 1, var1, var2);
               this.method_15617(1, var1, var2);
            } else {
               this.method_15615(0L, 1, var1, var2);
               this.method_15600(1, var1, var2);
            }

            this.field_16668 = var6;
            this.field_16661 = this.field_16667 * this.field_16668;
            this.field_16669 = this.field_16668;
         } else {
            this.field_16661 = 2L * this.field_16667 * this.field_16668;
            this.field_16669 = 2L * this.field_16668;
            if (var5 > 1 && this.field_16660 && this.field_16665 >= (long)var5 && this.field_16667 >= (long)var5 && this.field_16668 >= (long)var5) {
               Future[] var38 = new Future[var5];
               long var40 = this.field_16665 / (long)var5;

               for (int var11 = 0; var11 < var5; var11++) {
                  long var44 = (long)var11 * var40;
                  long var14 = var11 == var5 - 1 ? this.field_16665 : var44 + var40;
                  var38[var11] = class_1266.method_5694(new class_8945(this, var44, var14, var1, var2));
               }

               try {
                  class_1266.method_5696(var38);
               } catch (InterruptedException var34) {
                  Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var34);
               } catch (ExecutionException var35) {
                  Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var35);
               }

               for (int var42 = 0; var42 < var5; var42++) {
                  long var45 = (long)var42 * var40;
                  long var47 = var42 == var5 - 1 ? this.field_16665 : var45 + var40;
                  var38[var42] = class_1266.method_5694(new class_2512(this, var45, var47, var1, var2));
               }

               try {
                  class_1266.method_5696(var38);
               } catch (InterruptedException var32) {
                  Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var32);
               } catch (ExecutionException var33) {
                  Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var33);
               }

               var40 = this.field_16667 / (long)var5;

               for (int var43 = 0; var43 < var5; var43++) {
                  long var46 = (long)var43 * var40;
                  long var48 = var43 == var5 - 1 ? this.field_16667 : var46 + var40;
                  var38[var43] = class_1266.method_5694(new class_7592(this, var46, var48, var1, var2));
               }

               try {
                  class_1266.method_5696(var38);
               } catch (InterruptedException var30) {
                  Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var30);
               } catch (ExecutionException var31) {
                  Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var31);
               }
            } else {
               for (long var36 = 0L; var36 < this.field_16665; var36++) {
                  long var16 = var36 * this.field_16661;

                  for (long var12 = 0L; var12 < this.field_16667; var12++) {
                     this.field_16666.method_24213(var1, var16 + var12 * this.field_16669, var2);
                  }
               }

               class_4330 var8 = new class_4330(2L * this.field_16667, false);

               for (long var9 = 0L; var9 < this.field_16665; var9++) {
                  long var18 = var9 * this.field_16661;

                  for (long var20 = 0L; var20 < this.field_16668; var20++) {
                     long var22 = 2L * var20;

                     for (long var24 = 0L; var24 < this.field_16667; var24++) {
                        long var26 = var18 + var22 + var24 * this.field_16669;
                        long var28 = 2L * var24;
                        var8.method_36123(var28, var1.method_36133(var26));
                        var8.method_36123(var28 + 1L, var1.method_36133(var26 + 1L));
                     }

                     this.field_16658.method_24214(var8, var2);

                     for (long var52 = 0L; var52 < this.field_16667; var52++) {
                        long var55 = var18 + var22 + var52 * this.field_16669;
                        long var58 = 2L * var52;
                        var1.method_36123(var55, var8.method_36133(var58));
                        var1.method_36123(var55 + 1L, var8.method_36133(var58 + 1L));
                     }
                  }
               }

               var8 = new class_4330(2L * this.field_16665, false);

               for (long var39 = 0L; var39 < this.field_16667; var39++) {
                  long var49 = var39 * this.field_16669;

                  for (long var50 = 0L; var50 < this.field_16668; var50++) {
                     long var51 = 2L * var50;

                     for (long var53 = 0L; var53 < this.field_16665; var53++) {
                        long var56 = var53 * this.field_16661 + var49 + var51;
                        long var59 = 2L * var53;
                        var8.method_36123(var59, var1.method_36133(var56));
                        var8.method_36123(var59 + 1L, var1.method_36133(var56 + 1L));
                     }

                     this.field_16655.method_24214(var8, var2);

                     for (long var54 = 0L; var54 < this.field_16665; var54++) {
                        long var57 = var54 * this.field_16661 + var49 + var51;
                        long var60 = 2L * var54;
                        var1.method_36123(var57, var8.method_36133(var60));
                        var1.method_36123(var57 + 1L, var8.method_36133(var60 + 1L));
                     }
                  }
               }
            }

            this.field_16661 = this.field_16667 * this.field_16668;
            this.field_16669 = this.field_16668;
         }
      }
   }

   public void method_15585(float[][][] var1, boolean var2) {
      int var5 = class_1266.method_5693();
      if (this.field_16664) {
         int var6 = this.field_16659;
         this.field_16659 = 2 * this.field_16659;
         this.field_16662 = this.field_16670 * this.field_16659;
         this.field_16663 = this.field_16659;
         if (var5 > 1 && this.field_16660) {
            this.method_15621(0, 1, var1, var2);
            this.method_15619(1, var1, var2);
         } else {
            this.method_15614(0, 1, var1, var2);
            this.method_15602(1, var1, var2);
         }

         this.field_16659 = var6;
         this.field_16662 = this.field_16670 * this.field_16659;
         this.field_16663 = this.field_16659;
      } else if (var5 > 1 && this.field_16660 && this.field_16657 >= var5 && this.field_16670 >= var5 && this.field_16659 >= var5) {
         Future[] var21 = new Future[var5];
         int var24 = this.field_16657 / var5;

         for (int var27 = 0; var27 < var5; var27++) {
            int var31 = var27 * var24;
            int var37 = var27 == var5 - 1 ? this.field_16657 : var31 + var24;
            var21[var27] = class_1266.method_5694(new class_190(this, var31, var37, var1, var2));
         }

         try {
            class_1266.method_5696(var21);
         } catch (InterruptedException var16) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var16);
         } catch (ExecutionException var17) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var17);
         }

         for (int var28 = 0; var28 < var5; var28++) {
            int var32 = var28 * var24;
            int var38 = var28 == var5 - 1 ? this.field_16657 : var32 + var24;
            var21[var28] = class_1266.method_5694(new class_7052(this, var32, var38, var1, var2));
         }

         try {
            class_1266.method_5696(var21);
         } catch (InterruptedException var14) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var14);
         } catch (ExecutionException var15) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var15);
         }

         var24 = this.field_16670 / var5;

         for (int var29 = 0; var29 < var5; var29++) {
            int var33 = var29 * var24;
            int var39 = var29 == var5 - 1 ? this.field_16670 : var33 + var24;
            var21[var29] = class_1266.method_5694(new class_2193(this, var33, var39, var1, var2));
         }

         try {
            class_1266.method_5696(var21);
         } catch (InterruptedException var12) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var12);
         } catch (ExecutionException var13) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var13);
         }
      } else {
         for (int var18 = 0; var18 < this.field_16657; var18++) {
            for (int var7 = 0; var7 < this.field_16670; var7++) {
               this.field_16666.method_24216(var1[var18][var7], var2);
            }
         }

         float[] var19 = new float[2 * this.field_16670];

         for (int var22 = 0; var22 < this.field_16657; var22++) {
            for (int var8 = 0; var8 < this.field_16659; var8++) {
               int var9 = 2 * var8;

               for (int var10 = 0; var10 < this.field_16670; var10++) {
                  int var11 = 2 * var10;
                  var19[var11] = var1[var22][var10][var9];
                  var19[var11 + 1] = var1[var22][var10][var9 + 1];
               }

               this.field_16658.method_24216(var19, var2);

               for (int var34 = 0; var34 < this.field_16670; var34++) {
                  int var40 = 2 * var34;
                  var1[var22][var34][var9] = var19[var40];
                  var1[var22][var34][var9 + 1] = var19[var40 + 1];
               }
            }
         }

         var19 = new float[2 * this.field_16657];

         for (int var23 = 0; var23 < this.field_16670; var23++) {
            for (int var26 = 0; var26 < this.field_16659; var26++) {
               int var30 = 2 * var26;

               for (int var35 = 0; var35 < this.field_16657; var35++) {
                  int var41 = 2 * var35;
                  var19[var41] = var1[var35][var23][var30];
                  var19[var41 + 1] = var1[var35][var23][var30 + 1];
               }

               this.field_16655.method_24216(var19, var2);

               for (int var36 = 0; var36 < this.field_16657; var36++) {
                  int var42 = 2 * var36;
                  var1[var36][var23][var30] = var19[var42];
                  var1[var36][var23][var30 + 1] = var19[var42 + 1];
               }
            }
         }
      }
   }

   public void method_15634(float[] var1) {
      if (!this.field_16664) {
         throw new IllegalArgumentException("slices, rows and columns must be power of two numbers");
      } else {
         int var4 = class_1266.method_5693();
         if (var4 > 1 && this.field_16660) {
            this.method_15595(1, -1, var1, true);
            this.method_15618(-1, var1, true);
            this.method_15587(1, var1);
         } else {
            this.method_15592(1, -1, var1, true);
            this.method_15601(-1, var1, true);
            this.method_15587(1, var1);
         }
      }
   }

   public void method_15633(class_4330 var1) {
      if (!this.field_16664) {
         throw new IllegalArgumentException("slices, rows and columns must be power of two numbers");
      } else {
         int var4 = class_1266.method_5693();
         if (var4 > 1 && this.field_16660) {
            this.method_15597(1L, -1, var1, true);
            this.method_15617(-1, var1, true);
            this.method_15586(1, var1);
         } else {
            this.method_15594(1L, -1, var1, true);
            this.method_15600(-1, var1, true);
            this.method_15586(1, var1);
         }
      }
   }

   public void method_15635(float[][][] var1) {
      if (!this.field_16664) {
         throw new IllegalArgumentException("slices, rows and columns must be power of two numbers");
      } else {
         int var4 = class_1266.method_5693();
         if (var4 > 1 && this.field_16660) {
            this.method_15596(1, -1, var1, true);
            this.method_15619(-1, var1, true);
            this.method_15588(1, var1);
         } else {
            this.method_15593(1, -1, var1, true);
            this.method_15602(-1, var1, true);
            this.method_15588(1, var1);
         }
      }
   }

   public void method_15611(float[] var1) {
      if (!this.field_16664) {
         this.method_15627(var1);
      } else {
         int var4 = class_1266.method_5693();
         if (var4 > 1 && this.field_16660) {
            this.method_15620(1, -1, var1, true);
            this.method_15618(-1, var1, true);
            this.method_15587(1, var1);
         } else {
            this.method_15613(1, -1, var1, true);
            this.method_15601(-1, var1, true);
            this.method_15587(1, var1);
         }

         this.method_15641(var1);
      }
   }

   public void method_15610(class_4330 var1) {
      if (!this.field_16664) {
         this.method_15626(var1);
      } else {
         int var4 = class_1266.method_5693();
         if (var4 > 1 && this.field_16660) {
            this.method_15622(1L, -1, var1, true);
            this.method_15617(-1, var1, true);
            this.method_15586(1, var1);
         } else {
            this.method_15615(1L, -1, var1, true);
            this.method_15600(-1, var1, true);
            this.method_15586(1, var1);
         }

         this.method_15640(var1);
      }
   }

   public void method_15612(float[][][] var1) {
      if (!this.field_16664) {
         this.method_15628(var1);
      } else {
         int var4 = class_1266.method_5693();
         if (var4 > 1 && this.field_16660) {
            this.method_15621(1, -1, var1, true);
            this.method_15619(-1, var1, true);
            this.method_15588(1, var1);
         } else {
            this.method_15614(1, -1, var1, true);
            this.method_15602(-1, var1, true);
            this.method_15588(1, var1);
         }

         this.method_15642(var1);
      }
   }

   public void method_15590(float[] var1, boolean var2) {
      if (!this.field_16664) {
         throw new IllegalArgumentException("slices, rows and columns must be power of two numbers");
      } else {
         int var5 = class_1266.method_5693();
         if (var5 > 1 && this.field_16660) {
            this.method_15587(-1, var1);
            this.method_15618(1, var1, var2);
            this.method_15595(1, 1, var1, var2);
         } else {
            this.method_15587(-1, var1);
            this.method_15601(1, var1, var2);
            this.method_15592(1, 1, var1, var2);
         }
      }
   }

   public void method_15589(class_4330 var1, boolean var2) {
      if (!this.field_16664) {
         throw new IllegalArgumentException("slices, rows and columns must be power of two numbers");
      } else {
         int var5 = class_1266.method_5693();
         if (var5 > 1 && this.field_16660) {
            this.method_15586(-1, var1);
            this.method_15617(1, var1, var2);
            this.method_15597(1L, 1, var1, var2);
         } else {
            this.method_15586(-1, var1);
            this.method_15600(1, var1, var2);
            this.method_15594(1L, 1, var1, var2);
         }
      }
   }

   public void method_15591(float[][][] var1, boolean var2) {
      if (!this.field_16664) {
         throw new IllegalArgumentException("slices, rows and columns must be power of two numbers");
      } else {
         int var5 = class_1266.method_5693();
         if (var5 > 1 && this.field_16660) {
            this.method_15588(-1, var1);
            this.method_15619(1, var1, var2);
            this.method_15596(1, 1, var1, var2);
         } else {
            this.method_15588(-1, var1);
            this.method_15602(1, var1, var2);
            this.method_15593(1, 1, var1, var2);
         }
      }
   }

   public void method_15605(float[] var1, boolean var2) {
      if (!this.field_16664) {
         this.method_15631(var1, var2);
      } else {
         int var5 = class_1266.method_5693();
         if (var5 > 1 && this.field_16660) {
            this.method_15620(1, 1, var1, var2);
            this.method_15618(1, var1, var2);
            this.method_15587(1, var1);
         } else {
            this.method_15613(1, 1, var1, var2);
            this.method_15601(1, var1, var2);
            this.method_15587(1, var1);
         }

         this.method_15641(var1);
      }
   }

   public void method_15604(class_4330 var1, boolean var2) {
      if (!this.field_16664) {
         this.method_15630(var1, var2);
      } else {
         int var5 = class_1266.method_5693();
         if (var5 > 1 && this.field_16660) {
            this.method_15622(1L, 1, var1, var2);
            this.method_15617(1, var1, var2);
            this.method_15586(1, var1);
         } else {
            this.method_15615(1L, 1, var1, var2);
            this.method_15600(1, var1, var2);
            this.method_15586(1, var1);
         }

         this.method_15640(var1);
      }
   }

   public void method_15606(float[][][] var1, boolean var2) {
      if (!this.field_16664) {
         this.method_15632(var1, var2);
      } else {
         int var5 = class_1266.method_5693();
         if (var5 > 1 && this.field_16660) {
            this.method_15621(1, 1, var1, var2);
            this.method_15619(1, var1, var2);
            this.method_15588(1, var1);
         } else {
            this.method_15614(1, 1, var1, var2);
            this.method_15602(1, var1, var2);
            this.method_15588(1, var1);
         }

         this.method_15642(var1);
      }
   }

   private void method_15628(float[][][] var1) {
      float[] var4 = new float[2 * this.field_16670];
      int var5 = this.field_16670 / 2 + 1;
      int var6 = 2 * this.field_16659;
      int var7;
      if (this.field_16670 % 2 == 0) {
         var7 = this.field_16670 / 2;
      } else {
         var7 = (this.field_16670 + 1) / 2;
      }

      int var8 = class_1266.method_5693();
      if (var8 > 1 && this.field_16660 && this.field_16657 >= var8 && this.field_16659 >= var8 && var5 >= var8) {
         Future[] var28 = new Future[var8];
         int var32 = this.field_16657 / var8;

         for (int var37 = 0; var37 < var8; var37++) {
            int var45 = var37 * var32;
            int var53 = var37 == var8 - 1 ? this.field_16657 : var45 + var32;
            var28[var37] = class_1266.method_5694(new class_8304(this, var45, var53, var1));
         }

         try {
            class_1266.method_5696(var28);
         } catch (InterruptedException var22) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var22);
         } catch (ExecutionException var23) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var23);
         }

         for (int var38 = 0; var38 < var8; var38++) {
            int var46 = var38 * var32;
            int var54 = var38 == var8 - 1 ? this.field_16657 : var46 + var32;
            var28[var38] = class_1266.method_5694(new class_8546(this, var46, var54, var1));
         }

         try {
            class_1266.method_5696(var28);
         } catch (InterruptedException var20) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var20);
         } catch (ExecutionException var21) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var21);
         }

         var32 = var5 / var8;

         for (int var39 = 0; var39 < var8; var39++) {
            int var47 = var39 * var32;
            int var55 = var39 == var8 - 1 ? var5 : var47 + var32;
            var28[var39] = class_1266.method_5694(new class_1408(this, var47, var55, var1));
         }

         try {
            class_1266.method_5696(var28);
         } catch (InterruptedException var18) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var18);
         } catch (ExecutionException var19) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var19);
         }

         var32 = this.field_16657 / var8;

         for (int var40 = 0; var40 < var8; var40++) {
            int var48 = var40 * var32;
            int var56 = var40 == var8 - 1 ? this.field_16657 : var48 + var32;
            var28[var40] = class_1266.method_5694(new class_5707(this, var48, var56, var7, var6, var1));
         }

         try {
            class_1266.method_5696(var28);
         } catch (InterruptedException var16) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var16);
         } catch (ExecutionException var17) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var17);
         }
      } else {
         for (int var9 = 0; var9 < this.field_16657; var9++) {
            for (int var10 = 0; var10 < this.field_16670; var10++) {
               this.field_16666.method_24160(var1[var9][var10]);
            }
         }

         for (int var25 = 0; var25 < this.field_16657; var25++) {
            for (int var29 = 0; var29 < this.field_16659; var29++) {
               int var11 = 2 * var29;

               for (int var12 = 0; var12 < this.field_16670; var12++) {
                  int var13 = 2 * var12;
                  var4[var13] = var1[var25][var12][var11];
                  var4[var13 + 1] = var1[var25][var12][var11 + 1];
               }

               this.field_16658.method_24185(var4);

               for (int var41 = 0; var41 < this.field_16670; var41++) {
                  int var49 = 2 * var41;
                  var1[var25][var41][var11] = var4[var49];
                  var1[var25][var41][var11 + 1] = var4[var49 + 1];
               }
            }
         }

         var4 = new float[2 * this.field_16657];

         for (int var26 = 0; var26 < var5; var26++) {
            for (int var30 = 0; var30 < this.field_16659; var30++) {
               int var35 = 2 * var30;

               for (int var42 = 0; var42 < this.field_16657; var42++) {
                  int var50 = 2 * var42;
                  var4[var50] = var1[var42][var26][var35];
                  var4[var50 + 1] = var1[var42][var26][var35 + 1];
               }

               this.field_16655.method_24185(var4);

               for (int var43 = 0; var43 < this.field_16657; var43++) {
                  int var51 = 2 * var43;
                  var1[var43][var26][var35] = var4[var51];
                  var1[var43][var26][var35 + 1] = var4[var51 + 1];
               }
            }
         }

         for (int var27 = 0; var27 < this.field_16657; var27++) {
            int var31 = (this.field_16657 - var27) % this.field_16657;

            for (int var36 = 1; var36 < var7; var36++) {
               int var44 = this.field_16670 - var36;

               for (int var52 = 0; var52 < this.field_16659; var52++) {
                  int var14 = 2 * var52;
                  int var15 = var6 - var14;
                  var1[var31][var44][var15 % var6] = var1[var27][var36][var14];
                  var1[var31][var44][(var15 + 1) % var6] = -var1[var27][var36][var14 + 1];
               }
            }
         }
      }
   }

   private void method_15632(float[][][] var1, boolean var2) {
      float[] var5 = new float[2 * this.field_16670];
      int var6 = this.field_16670 / 2 + 1;
      int var7 = 2 * this.field_16659;
      int var8;
      if (this.field_16670 % 2 == 0) {
         var8 = this.field_16670 / 2;
      } else {
         var8 = (this.field_16670 + 1) / 2;
      }

      int var9 = class_1266.method_5693();
      if (var9 > 1 && this.field_16660 && this.field_16657 >= var9 && this.field_16659 >= var9 && var6 >= var9) {
         Future[] var29 = new Future[var9];
         int var33 = this.field_16657 / var9;

         for (int var38 = 0; var38 < var9; var38++) {
            int var46 = var38 * var33;
            int var54 = var38 == var9 - 1 ? this.field_16657 : var46 + var33;
            var29[var38] = class_1266.method_5694(new class_1989(this, var46, var54, var1, var2));
         }

         try {
            class_1266.method_5696(var29);
         } catch (InterruptedException var23) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var23);
         } catch (ExecutionException var24) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var24);
         }

         for (int var39 = 0; var39 < var9; var39++) {
            int var47 = var39 * var33;
            int var55 = var39 == var9 - 1 ? this.field_16657 : var47 + var33;
            var29[var39] = class_1266.method_5694(new class_5207(this, var47, var55, var1, var2));
         }

         try {
            class_1266.method_5696(var29);
         } catch (InterruptedException var21) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var21);
         } catch (ExecutionException var22) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var22);
         }

         var33 = var6 / var9;

         for (int var40 = 0; var40 < var9; var40++) {
            int var48 = var40 * var33;
            int var56 = var40 == var9 - 1 ? var6 : var48 + var33;
            var29[var40] = class_1266.method_5694(new class_5439(this, var48, var56, var1, var2));
         }

         try {
            class_1266.method_5696(var29);
         } catch (InterruptedException var19) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var19);
         } catch (ExecutionException var20) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var20);
         }

         var33 = this.field_16657 / var9;

         for (int var41 = 0; var41 < var9; var41++) {
            int var49 = var41 * var33;
            int var57 = var41 == var9 - 1 ? this.field_16657 : var49 + var33;
            var29[var41] = class_1266.method_5694(new class_4311(this, var49, var57, var8, var7, var1));
         }

         try {
            class_1266.method_5696(var29);
         } catch (InterruptedException var17) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var17);
         } catch (ExecutionException var18) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var18);
         }
      } else {
         for (int var10 = 0; var10 < this.field_16657; var10++) {
            for (int var11 = 0; var11 < this.field_16670; var11++) {
               this.field_16666.method_24171(var1[var10][var11], var2);
            }
         }

         for (int var26 = 0; var26 < this.field_16657; var26++) {
            for (int var30 = 0; var30 < this.field_16659; var30++) {
               int var12 = 2 * var30;

               for (int var13 = 0; var13 < this.field_16670; var13++) {
                  int var14 = 2 * var13;
                  var5[var14] = var1[var26][var13][var12];
                  var5[var14 + 1] = var1[var26][var13][var12 + 1];
               }

               this.field_16658.method_24216(var5, var2);

               for (int var42 = 0; var42 < this.field_16670; var42++) {
                  int var50 = 2 * var42;
                  var1[var26][var42][var12] = var5[var50];
                  var1[var26][var42][var12 + 1] = var5[var50 + 1];
               }
            }
         }

         var5 = new float[2 * this.field_16657];

         for (int var27 = 0; var27 < var6; var27++) {
            for (int var31 = 0; var31 < this.field_16659; var31++) {
               int var36 = 2 * var31;

               for (int var43 = 0; var43 < this.field_16657; var43++) {
                  int var51 = 2 * var43;
                  var5[var51] = var1[var43][var27][var36];
                  var5[var51 + 1] = var1[var43][var27][var36 + 1];
               }

               this.field_16655.method_24216(var5, var2);

               for (int var44 = 0; var44 < this.field_16657; var44++) {
                  int var52 = 2 * var44;
                  var1[var44][var27][var36] = var5[var52];
                  var1[var44][var27][var36 + 1] = var5[var52 + 1];
               }
            }
         }

         for (int var28 = 0; var28 < this.field_16657; var28++) {
            int var32 = (this.field_16657 - var28) % this.field_16657;

            for (int var37 = 1; var37 < var8; var37++) {
               int var45 = this.field_16670 - var37;

               for (int var53 = 0; var53 < this.field_16659; var53++) {
                  int var15 = 2 * var53;
                  int var16 = var7 - var15;
                  var1[var32][var45][var16 % var7] = var1[var28][var37][var15];
                  var1[var32][var45][(var16 + 1) % var7] = -var1[var28][var37][var15 + 1];
               }
            }
         }
      }
   }

   private void method_15627(float[] var1) {
      int var4 = 2 * this.field_16659;
      float[] var5 = new float[var4];
      int var6 = this.field_16670 / 2 + 1;
      int var7;
      if (this.field_16670 % 2 == 0) {
         var7 = this.field_16670 / 2;
      } else {
         var7 = (this.field_16670 + 1) / 2;
      }

      int var8 = 2 * this.field_16662;
      int var9 = 2 * this.field_16663;
      int var10 = this.field_16657 / 2;
      int var11 = class_1266.method_5693();
      if (var11 > 1 && this.field_16660 && var10 >= var11 && this.field_16659 >= var11 && var6 >= var11) {
         Future[] var42 = new Future[var11];
         int var46 = var10 / var11;

         for (int var53 = 0; var53 < var11; var53++) {
            int var58 = this.field_16657 - 1 - var53 * var46;
            int var68 = var53 == var11 - 1 ? var10 + 1 : var58 - var46;
            var42[var53] = class_1266.method_5694(new class_8486(this, var4, var58, var68, var8, var1, var9));
         }

         try {
            class_1266.method_5696(var42);
         } catch (InterruptedException var35) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var35);
         } catch (ExecutionException var36) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var36);
         }

         float[][][] var54 = new float[var10 + 1][this.field_16670][var4];

         for (int var59 = 0; var59 < var11; var59++) {
            int var69 = var59 * var46;
            int var78 = var59 == var11 - 1 ? var10 + 1 : var69 + var46;
            var42[var59] = class_1266.method_5694(new class_7710(this, var69, var78, var1, var54));
         }

         try {
            class_1266.method_5696(var42);
         } catch (InterruptedException var33) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var33);
         } catch (ExecutionException var34) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var34);
         }

         for (int var60 = 0; var60 < var11; var60++) {
            int var70 = var60 * var46;
            int var79 = var60 == var11 - 1 ? var10 + 1 : var70 + var46;
            var42[var60] = class_1266.method_5694(new class_294(this, var70, var79, var8, var54, var1, var9, var4));
         }

         try {
            class_1266.method_5696(var42);
         } catch (InterruptedException var31) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var31);
         } catch (ExecutionException var32) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var32);
         }

         var46 = this.field_16657 / var11;

         for (int var61 = 0; var61 < var11; var61++) {
            int var71 = var61 * var46;
            int var80 = var61 == var11 - 1 ? this.field_16657 : var71 + var46;
            var42[var61] = class_1266.method_5694(new class_3544(this, var71, var80, var8, var9, var1));
         }

         try {
            class_1266.method_5696(var42);
         } catch (InterruptedException var29) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var29);
         } catch (ExecutionException var30) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var30);
         }

         var46 = var6 / var11;

         for (int var62 = 0; var62 < var11; var62++) {
            int var72 = var62 * var46;
            int var81 = var62 == var11 - 1 ? var6 : var72 + var46;
            var42[var62] = class_1266.method_5694(new class_7345(this, var72, var81, var9, var8, var1));
         }

         try {
            class_1266.method_5696(var42);
         } catch (InterruptedException var27) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var27);
         } catch (ExecutionException var28) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var28);
         }

         var46 = this.field_16657 / var11;

         for (int var63 = 0; var63 < var11; var63++) {
            int var73 = var63 * var46;
            int var82 = var63 == var11 - 1 ? this.field_16657 : var73 + var46;
            var42[var63] = class_1266.method_5694(new class_6309(this, var73, var82, var8, var7, var9, var4, var1));
         }

         try {
            class_1266.method_5696(var42);
         } catch (InterruptedException var25) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var25);
         } catch (ExecutionException var26) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var26);
         }
      } else {
         for (int var12 = this.field_16657 - 1; var12 >= 0; var12--) {
            int var13 = var12 * this.field_16662;
            int var14 = var12 * var8;

            for (int var15 = this.field_16670 - 1; var15 >= 0; var15--) {
               System.arraycopy(var1, var13 + var15 * this.field_16663, var5, 0, this.field_16659);
               this.field_16666.method_24160(var5);
               System.arraycopy(var5, 0, var1, var14 + var15 * var9, var4);
            }
         }

         var5 = new float[2 * this.field_16670];

         for (int var39 = 0; var39 < this.field_16657; var39++) {
            int var43 = var39 * var8;

            for (int var50 = 0; var50 < this.field_16659; var50++) {
               int var55 = 2 * var50;

               for (int var16 = 0; var16 < this.field_16670; var16++) {
                  int var17 = 2 * var16;
                  int var18 = var43 + var16 * var9 + var55;
                  var5[var17] = var1[var18];
                  var5[var17 + 1] = var1[var18 + 1];
               }

               this.field_16658.method_24185(var5);

               for (int var64 = 0; var64 < this.field_16670; var64++) {
                  int var74 = 2 * var64;
                  int var83 = var43 + var64 * var9 + var55;
                  var1[var83] = var5[var74];
                  var1[var83 + 1] = var5[var74 + 1];
               }
            }
         }

         var5 = new float[2 * this.field_16657];

         for (int var40 = 0; var40 < var6; var40++) {
            int var44 = var40 * var9;

            for (int var51 = 0; var51 < this.field_16659; var51++) {
               int var56 = 2 * var51;

               for (int var65 = 0; var65 < this.field_16657; var65++) {
                  int var75 = 2 * var65;
                  int var84 = var65 * var8 + var44 + var56;
                  var5[var75] = var1[var84];
                  var5[var75 + 1] = var1[var84 + 1];
               }

               this.field_16655.method_24185(var5);

               for (int var66 = 0; var66 < this.field_16657; var66++) {
                  int var76 = 2 * var66;
                  int var85 = var66 * var8 + var44 + var56;
                  var1[var85] = var5[var76];
                  var1[var85 + 1] = var5[var76 + 1];
               }
            }
         }

         for (int var41 = 0; var41 < this.field_16657; var41++) {
            int var45 = (this.field_16657 - var41) % this.field_16657;
            int var52 = var45 * var8;
            int var57 = var41 * var8;

            for (int var67 = 1; var67 < var7; var67++) {
               int var77 = this.field_16670 - var67;
               int var86 = var77 * var9;
               int var19 = var67 * var9;
               int var20 = var52 + var86;

               for (int var21 = 0; var21 < this.field_16659; var21++) {
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

   private void method_15626(class_4330 var1) {
      long var4 = 2L * this.field_16668;
      class_4330 var6 = new class_4330(var4);
      long var7 = this.field_16667 / 2L + 1L;
      long var9;
      if (this.field_16667 % 2L == 0L) {
         var9 = this.field_16667 / 2L;
      } else {
         var9 = (this.field_16667 + 1L) / 2L;
      }

      long var11 = 2L * this.field_16661;
      long var13 = 2L * this.field_16669;
      long var15 = this.field_16665 / 2L;
      int var17 = class_1266.method_5693();
      if (var17 > 1 && this.field_16660 && var15 >= (long)var17 && this.field_16668 >= (long)var17 && var7 >= (long)var17) {
         Future[] var18 = new Future[var17];
         long var19 = var15 / (long)var17;

         for (int var21 = 0; var21 < var17; var21++) {
            long var74 = this.field_16665 - 1L - (long)var21 * var19;
            long var78 = var21 == var17 - 1 ? var15 + 1L : var74 - var19;
            var18[var21] = class_1266.method_5694(new class_8791(this, var4, var74, var78, var11, var1, var13));
         }

         try {
            class_1266.method_5696(var18);
         } catch (InterruptedException var63) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var63);
         } catch (ExecutionException var64) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var64);
         }

         class_4330 var70 = new class_4330((var15 + 1L) * this.field_16667 * var4);

         for (int var26 = 0; var26 < var17; var26++) {
            long var27 = (long)var26 * var19;
            long var29 = var26 == var17 - 1 ? var15 + 1L : var27 + var19;
            var18[var26] = class_1266.method_5694(new class_5829(this, var27, var29, var1, var70, var4));
         }

         try {
            class_1266.method_5696(var18);
         } catch (InterruptedException var61) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var61);
         } catch (ExecutionException var62) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var62);
         }

         for (int var79 = 0; var79 < var17; var79++) {
            long var83 = (long)var79 * var19;
            long var87 = var79 == var17 - 1 ? var15 + 1L : var83 + var19;
            var18[var79] = class_1266.method_5694(new class_393(this, var83, var87, var11, var70, var4, var1, var13));
         }

         try {
            class_1266.method_5696(var18);
         } catch (InterruptedException var59) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var59);
         } catch (ExecutionException var60) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var60);
         }

         var19 = this.field_16665 / (long)var17;

         for (int var80 = 0; var80 < var17; var80++) {
            long var84 = (long)var80 * var19;
            long var88 = var80 == var17 - 1 ? this.field_16665 : var84 + var19;
            var18[var80] = class_1266.method_5694(new class_6193(this, var84, var88, var11, var13, var1));
         }

         try {
            class_1266.method_5696(var18);
         } catch (InterruptedException var57) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var57);
         } catch (ExecutionException var58) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var58);
         }

         var19 = var7 / (long)var17;

         for (int var81 = 0; var81 < var17; var81++) {
            long var85 = (long)var81 * var19;
            long var89 = var81 == var17 - 1 ? var7 : var85 + var19;
            var18[var81] = class_1266.method_5694(new class_6655(this, var85, var89, var13, var11, var1));
         }

         try {
            class_1266.method_5696(var18);
         } catch (InterruptedException var55) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var55);
         } catch (ExecutionException var56) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var56);
         }

         var19 = this.field_16665 / (long)var17;

         for (int var82 = 0; var82 < var17; var82++) {
            long var86 = (long)var82 * var19;
            long var90 = var82 == var17 - 1 ? this.field_16665 : var86 + var19;
            var18[var82] = class_1266.method_5694(new class_6996(this, var86, var90, var11, var9, var13, var4, var1));
         }

         try {
            class_1266.method_5696(var18);
         } catch (InterruptedException var53) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var53);
         } catch (ExecutionException var54) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var54);
         }
      } else {
         for (long var31 = this.field_16665 - 1L; var31 >= 0L; var31--) {
            long var33 = var31 * this.field_16661;
            long var22 = var31 * var11;

            for (long var24 = this.field_16667 - 1L; var24 >= 0L; var24--) {
               class_3685.method_17117(var1, var33 + var24 * this.field_16669, var6, 0L, this.field_16668);
               this.field_16666.method_24158(var6);
               class_3685.method_17117(var6, 0L, var1, var22 + var24 * var13, var4);
            }
         }

         var6 = new class_4330(2L * this.field_16667, false);

         for (long var91 = 0L; var91 < this.field_16665; var91++) {
            long var94 = var91 * var11;

            for (long var71 = 0L; var71 < this.field_16668; var71++) {
               long var75 = 2L * var71;

               for (long var35 = 0L; var35 < this.field_16667; var35++) {
                  long var37 = 2L * var35;
                  long var39 = var94 + var35 * var13 + var75;
                  var6.method_36123(var37, var1.method_36133(var39));
                  var6.method_36123(var37 + 1L, var1.method_36133(var39 + 1L));
               }

               this.field_16658.method_24183(var6);

               for (long var97 = 0L; var97 < this.field_16667; var97++) {
                  long var101 = 2L * var97;
                  long var105 = var94 + var97 * var13 + var75;
                  var1.method_36123(var105, var6.method_36133(var101));
                  var1.method_36123(var105 + 1L, var6.method_36133(var101 + 1L));
               }
            }
         }

         var6 = new class_4330(2L * this.field_16665, false);

         for (long var92 = 0L; var92 < var7; var92++) {
            long var95 = var92 * var13;

            for (long var72 = 0L; var72 < this.field_16668; var72++) {
               long var76 = 2L * var72;

               for (long var98 = 0L; var98 < this.field_16665; var98++) {
                  long var102 = 2L * var98;
                  long var106 = var98 * var11 + var95 + var76;
                  var6.method_36123(var102, var1.method_36133(var106));
                  var6.method_36123(var102 + 1L, var1.method_36133(var106 + 1L));
               }

               this.field_16655.method_24183(var6);

               for (long var99 = 0L; var99 < this.field_16665; var99++) {
                  long var103 = 2L * var99;
                  long var107 = var99 * var11 + var95 + var76;
                  var1.method_36123(var107, var6.method_36133(var103));
                  var1.method_36123(var107 + 1L, var6.method_36133(var103 + 1L));
               }
            }
         }

         for (long var93 = 0L; var93 < this.field_16665; var93++) {
            long var96 = (this.field_16665 - var93) % this.field_16665;
            long var73 = var96 * var11;
            long var77 = var93 * var11;

            for (long var100 = 1L; var100 < var9; var100++) {
               long var104 = this.field_16667 - var100;
               long var108 = var104 * var13;
               long var41 = var100 * var13;
               long var43 = var73 + var108;

               for (long var45 = 0L; var45 < this.field_16668; var45++) {
                  long var47 = 2L * var45;
                  long var49 = var4 - var47;
                  long var51 = var77 + var41 + var47;
                  var1.method_36123(var43 + var49 % var4, var1.method_36133(var51));
                  var1.method_36123(var43 + (var49 + 1L) % var4, -var1.method_36133(var51 + 1L));
               }
            }
         }
      }
   }

   private void method_15631(float[] var1, boolean var2) {
      int var5 = 2 * this.field_16659;
      float[] var6 = new float[var5];
      int var7 = this.field_16670 / 2 + 1;
      int var8;
      if (this.field_16670 % 2 == 0) {
         var8 = this.field_16670 / 2;
      } else {
         var8 = (this.field_16670 + 1) / 2;
      }

      int var9 = 2 * this.field_16662;
      int var10 = 2 * this.field_16663;
      int var11 = this.field_16657 / 2;
      int var12 = class_1266.method_5693();
      if (var12 > 1 && this.field_16660 && var11 >= var12 && this.field_16659 >= var12 && var7 >= var12) {
         Future[] var43 = new Future[var12];
         int var47 = var11 / var12;

         for (int var54 = 0; var54 < var12; var54++) {
            int var59 = this.field_16657 - 1 - var54 * var47;
            int var69 = var54 == var12 - 1 ? var11 + 1 : var59 - var47;
            var43[var54] = class_1266.method_5694(new class_2086(this, var5, var59, var69, var9, var1, var2, var10));
         }

         try {
            class_1266.method_5696(var43);
         } catch (InterruptedException var36) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var36);
         } catch (ExecutionException var37) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var37);
         }

         float[][][] var55 = new float[var11 + 1][this.field_16670][var5];

         for (int var60 = 0; var60 < var12; var60++) {
            int var70 = var60 * var47;
            int var79 = var60 == var12 - 1 ? var11 + 1 : var70 + var47;
            var43[var60] = class_1266.method_5694(new class_9540(this, var70, var79, var1, var55, var2));
         }

         try {
            class_1266.method_5696(var43);
         } catch (InterruptedException var34) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var34);
         } catch (ExecutionException var35) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var35);
         }

         for (int var61 = 0; var61 < var12; var61++) {
            int var71 = var61 * var47;
            int var80 = var61 == var12 - 1 ? var11 + 1 : var71 + var47;
            var43[var61] = class_1266.method_5694(new class_2665(this, var71, var80, var9, var55, var1, var10, var5));
         }

         try {
            class_1266.method_5696(var43);
         } catch (InterruptedException var32) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var32);
         } catch (ExecutionException var33) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var33);
         }

         var47 = this.field_16657 / var12;

         for (int var62 = 0; var62 < var12; var62++) {
            int var72 = var62 * var47;
            int var81 = var62 == var12 - 1 ? this.field_16657 : var72 + var47;
            var43[var62] = class_1266.method_5694(new class_4353(this, var72, var81, var9, var10, var1, var2));
         }

         try {
            class_1266.method_5696(var43);
         } catch (InterruptedException var30) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var30);
         } catch (ExecutionException var31) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var31);
         }

         var47 = var7 / var12;

         for (int var63 = 0; var63 < var12; var63++) {
            int var73 = var63 * var47;
            int var82 = var63 == var12 - 1 ? var7 : var73 + var47;
            var43[var63] = class_1266.method_5694(new class_6552(this, var73, var82, var10, var9, var1, var2));
         }

         try {
            class_1266.method_5696(var43);
         } catch (InterruptedException var28) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var28);
         } catch (ExecutionException var29) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var29);
         }

         var47 = this.field_16657 / var12;

         for (int var64 = 0; var64 < var12; var64++) {
            int var74 = var64 * var47;
            int var83 = var64 == var12 - 1 ? this.field_16657 : var74 + var47;
            var43[var64] = class_1266.method_5694(new class_5223(this, var74, var83, var9, var8, var10, var5, var1));
         }

         try {
            class_1266.method_5696(var43);
         } catch (InterruptedException var26) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var26);
         } catch (ExecutionException var27) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var27);
         }
      } else {
         for (int var13 = this.field_16657 - 1; var13 >= 0; var13--) {
            int var14 = var13 * this.field_16662;
            int var15 = var13 * var9;

            for (int var16 = this.field_16670 - 1; var16 >= 0; var16--) {
               System.arraycopy(var1, var14 + var16 * this.field_16663, var6, 0, this.field_16659);
               this.field_16666.method_24171(var6, var2);
               System.arraycopy(var6, 0, var1, var15 + var16 * var10, var5);
            }
         }

         var6 = new float[2 * this.field_16670];

         for (int var40 = 0; var40 < this.field_16657; var40++) {
            int var44 = var40 * var9;

            for (int var51 = 0; var51 < this.field_16659; var51++) {
               int var56 = 2 * var51;

               for (int var17 = 0; var17 < this.field_16670; var17++) {
                  int var18 = 2 * var17;
                  int var19 = var44 + var17 * var10 + var56;
                  var6[var18] = var1[var19];
                  var6[var18 + 1] = var1[var19 + 1];
               }

               this.field_16658.method_24216(var6, var2);

               for (int var65 = 0; var65 < this.field_16670; var65++) {
                  int var75 = 2 * var65;
                  int var84 = var44 + var65 * var10 + var56;
                  var1[var84] = var6[var75];
                  var1[var84 + 1] = var6[var75 + 1];
               }
            }
         }

         var6 = new float[2 * this.field_16657];

         for (int var41 = 0; var41 < var7; var41++) {
            int var45 = var41 * var10;

            for (int var52 = 0; var52 < this.field_16659; var52++) {
               int var57 = 2 * var52;

               for (int var66 = 0; var66 < this.field_16657; var66++) {
                  int var76 = 2 * var66;
                  int var85 = var66 * var9 + var45 + var57;
                  var6[var76] = var1[var85];
                  var6[var76 + 1] = var1[var85 + 1];
               }

               this.field_16655.method_24216(var6, var2);

               for (int var67 = 0; var67 < this.field_16657; var67++) {
                  int var77 = 2 * var67;
                  int var86 = var67 * var9 + var45 + var57;
                  var1[var86] = var6[var77];
                  var1[var86 + 1] = var6[var77 + 1];
               }
            }
         }

         for (int var42 = 0; var42 < this.field_16657; var42++) {
            int var46 = (this.field_16657 - var42) % this.field_16657;
            int var53 = var46 * var9;
            int var58 = var42 * var9;

            for (int var68 = 1; var68 < var8; var68++) {
               int var78 = this.field_16670 - var68;
               int var87 = var78 * var10;
               int var20 = var68 * var10;
               int var21 = var53 + var87;

               for (int var22 = 0; var22 < this.field_16659; var22++) {
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

   private void method_15630(class_4330 var1, boolean var2) {
      long var5 = 2L * this.field_16668;
      class_4330 var7 = new class_4330(var5);
      long var8 = this.field_16667 / 2L + 1L;
      long var10;
      if (this.field_16667 % 2L == 0L) {
         var10 = this.field_16667 / 2L;
      } else {
         var10 = (this.field_16667 + 1L) / 2L;
      }

      long var12 = 2L * this.field_16661;
      long var14 = 2L * this.field_16669;
      long var16 = this.field_16665 / 2L;
      int var18 = class_1266.method_5693();
      if (var18 > 1 && this.field_16660 && var16 >= (long)var18 && this.field_16668 >= (long)var18 && var8 >= (long)var18) {
         Future[] var19 = new Future[var18];
         long var20 = var16 / (long)var18;

         for (int var22 = 0; var22 < var18; var22++) {
            long var75 = this.field_16665 - 1L - (long)var22 * var20;
            long var79 = var22 == var18 - 1 ? var16 + 1L : var75 - var20;
            var19[var22] = class_1266.method_5694(new class_4752(this, var5, var75, var79, var12, var1, var2, var14));
         }

         try {
            class_1266.method_5696(var19);
         } catch (InterruptedException var64) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var64);
         } catch (ExecutionException var65) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var65);
         }

         class_4330 var71 = new class_4330((var16 + 1L) * this.field_16667 * var5);

         for (int var27 = 0; var27 < var18; var27++) {
            long var28 = (long)var27 * var20;
            long var30 = var27 == var18 - 1 ? var16 + 1L : var28 + var20;
            var19[var27] = class_1266.method_5694(new class_2673(this, var28, var30, var1, var71, var5, var2));
         }

         try {
            class_1266.method_5696(var19);
         } catch (InterruptedException var62) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var62);
         } catch (ExecutionException var63) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var63);
         }

         for (int var80 = 0; var80 < var18; var80++) {
            long var84 = (long)var80 * var20;
            long var88 = var80 == var18 - 1 ? var16 + 1L : var84 + var20;
            var19[var80] = class_1266.method_5694(new class_7016(this, var84, var88, var12, var71, var5, var1, var14));
         }

         try {
            class_1266.method_5696(var19);
         } catch (InterruptedException var60) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var60);
         } catch (ExecutionException var61) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var61);
         }

         var20 = this.field_16665 / (long)var18;

         for (int var81 = 0; var81 < var18; var81++) {
            long var85 = (long)var81 * var20;
            long var89 = var81 == var18 - 1 ? this.field_16665 : var85 + var20;
            var19[var81] = class_1266.method_5694(new class_2030(this, var85, var89, var12, var14, var1, var2));
         }

         try {
            class_1266.method_5696(var19);
         } catch (InterruptedException var58) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var58);
         } catch (ExecutionException var59) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var59);
         }

         var20 = var8 / (long)var18;

         for (int var82 = 0; var82 < var18; var82++) {
            long var86 = (long)var82 * var20;
            long var90 = var82 == var18 - 1 ? var8 : var86 + var20;
            var19[var82] = class_1266.method_5694(new class_2424(this, var86, var90, var14, var12, var1, var2));
         }

         try {
            class_1266.method_5696(var19);
         } catch (InterruptedException var56) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var56);
         } catch (ExecutionException var57) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var57);
         }

         var20 = this.field_16665 / (long)var18;

         for (int var83 = 0; var83 < var18; var83++) {
            long var87 = (long)var83 * var20;
            long var91 = var83 == var18 - 1 ? this.field_16665 : var87 + var20;
            var19[var83] = class_1266.method_5694(new class_2585(this, var87, var91, var12, var10, var14, var5, var1));
         }

         try {
            class_1266.method_5696(var19);
         } catch (InterruptedException var54) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var54);
         } catch (ExecutionException var55) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var55);
         }
      } else {
         for (long var32 = this.field_16665 - 1L; var32 >= 0L; var32--) {
            long var34 = var32 * this.field_16661;
            long var23 = var32 * var12;

            for (long var25 = this.field_16667 - 1L; var25 >= 0L; var25--) {
               class_3685.method_17117(var1, var34 + var25 * this.field_16669, var7, 0L, this.field_16668);
               this.field_16666.method_24169(var7, var2);
               class_3685.method_17117(var7, 0L, var1, var23 + var25 * var14, var5);
            }
         }

         var7 = new class_4330(2L * this.field_16667, false);

         for (long var92 = 0L; var92 < this.field_16665; var92++) {
            long var95 = var92 * var12;

            for (long var72 = 0L; var72 < this.field_16668; var72++) {
               long var76 = 2L * var72;

               for (long var36 = 0L; var36 < this.field_16667; var36++) {
                  long var38 = 2L * var36;
                  long var40 = var95 + var36 * var14 + var76;
                  var7.method_36123(var38, var1.method_36133(var40));
                  var7.method_36123(var38 + 1L, var1.method_36133(var40 + 1L));
               }

               this.field_16658.method_24214(var7, var2);

               for (long var98 = 0L; var98 < this.field_16667; var98++) {
                  long var102 = 2L * var98;
                  long var106 = var95 + var98 * var14 + var76;
                  var1.method_36123(var106, var7.method_36133(var102));
                  var1.method_36123(var106 + 1L, var7.method_36133(var102 + 1L));
               }
            }
         }

         var7 = new class_4330(2L * this.field_16665, false);

         for (long var93 = 0L; var93 < var8; var93++) {
            long var96 = var93 * var14;

            for (long var73 = 0L; var73 < this.field_16668; var73++) {
               long var77 = 2L * var73;

               for (long var99 = 0L; var99 < this.field_16665; var99++) {
                  long var103 = 2L * var99;
                  long var107 = var99 * var12 + var96 + var77;
                  var7.method_36123(var103, var1.method_36133(var107));
                  var7.method_36123(var103 + 1L, var1.method_36133(var107 + 1L));
               }

               this.field_16655.method_24214(var7, var2);

               for (long var100 = 0L; var100 < this.field_16665; var100++) {
                  long var104 = 2L * var100;
                  long var108 = var100 * var12 + var96 + var77;
                  var1.method_36123(var108, var7.method_36133(var104));
                  var1.method_36123(var108 + 1L, var7.method_36133(var104 + 1L));
               }
            }
         }

         for (long var94 = 0L; var94 < this.field_16665; var94++) {
            long var97 = (this.field_16665 - var94) % this.field_16665;
            long var74 = var97 * var12;
            long var78 = var94 * var12;

            for (long var101 = 1L; var101 < var10; var101++) {
               long var105 = this.field_16667 - var101;
               long var109 = var105 * var14;
               long var42 = var101 * var14;
               long var44 = var74 + var109;

               for (long var46 = 0L; var46 < this.field_16668; var46++) {
                  long var48 = 2L * var46;
                  long var50 = var5 - var48;
                  long var52 = var78 + var42 + var48;
                  var1.method_36123(var44 + var50 % var5, var1.method_36133(var52));
                  var1.method_36123(var44 + (var50 + 1L) % var5, -var1.method_36133(var52 + 1L));
               }
            }
         }
      }
   }

   private void method_15592(int var1, int var2, float[] var3, boolean var4) {
      int var7 = this.field_16657;
      if (var7 < this.field_16670) {
         var7 = this.field_16670;
      }

      var7 *= 8;
      if (this.field_16659 != 4) {
         if (this.field_16659 < 4) {
            var7 >>= 2;
         }
      } else {
         var7 >>= 1;
      }

      float[] var8 = new float[var7];
      if (var2 != -1) {
         for (int var9 = 0; var9 < this.field_16657; var9++) {
            int var10 = var9 * this.field_16662;
            if (var1 == 0) {
               for (int var11 = 0; var11 < this.field_16670; var11++) {
                  this.field_16666.method_24215(var3, var10 + var11 * this.field_16663, var4);
               }
            }

            if (this.field_16659 <= 4) {
               if (this.field_16659 != 4) {
                  if (this.field_16659 == 2) {
                     for (int var24 = 0; var24 < this.field_16670; var24++) {
                        int var40 = var10 + var24 * this.field_16663;
                        int var51 = 2 * var24;
                        var8[var51] = var3[var40];
                        var8[var51 + 1] = var3[var40 + 1];
                     }

                     this.field_16658.method_24215(var8, 0, var4);

                     for (int var25 = 0; var25 < this.field_16670; var25++) {
                        int var41 = var10 + var25 * this.field_16663;
                        int var52 = 2 * var25;
                        var3[var41] = var8[var52];
                        var3[var41 + 1] = var8[var52 + 1];
                     }
                  }
               } else {
                  for (int var22 = 0; var22 < this.field_16670; var22++) {
                     int var38 = var10 + var22 * this.field_16663;
                     int var49 = 2 * var22;
                     int var60 = 2 * this.field_16670 + 2 * var22;
                     var8[var49] = var3[var38];
                     var8[var49 + 1] = var3[var38 + 1];
                     var8[var60] = var3[var38 + 2];
                     var8[var60 + 1] = var3[var38 + 3];
                  }

                  this.field_16658.method_24215(var8, 0, var4);
                  this.field_16658.method_24215(var8, 2 * this.field_16670, var4);

                  for (int var23 = 0; var23 < this.field_16670; var23++) {
                     int var39 = var10 + var23 * this.field_16663;
                     int var50 = 2 * var23;
                     int var61 = 2 * this.field_16670 + 2 * var23;
                     var3[var39] = var8[var50];
                     var3[var39 + 1] = var8[var50 + 1];
                     var3[var39 + 2] = var8[var61];
                     var3[var39 + 3] = var8[var61 + 1];
                  }
               }
            } else {
               for (byte var21 = 0; var21 < this.field_16659; var21 += 8) {
                  for (int var12 = 0; var12 < this.field_16670; var12++) {
                     int var13 = var10 + var12 * this.field_16663 + var21;
                     int var14 = 2 * var12;
                     int var15 = 2 * this.field_16670 + 2 * var12;
                     int var16 = var15 + 2 * this.field_16670;
                     int var17 = var16 + 2 * this.field_16670;
                     var8[var14] = var3[var13];
                     var8[var14 + 1] = var3[var13 + 1];
                     var8[var15] = var3[var13 + 2];
                     var8[var15 + 1] = var3[var13 + 3];
                     var8[var16] = var3[var13 + 4];
                     var8[var16 + 1] = var3[var13 + 5];
                     var8[var17] = var3[var13 + 6];
                     var8[var17 + 1] = var3[var13 + 7];
                  }

                  this.field_16658.method_24215(var8, 0, var4);
                  this.field_16658.method_24215(var8, 2 * this.field_16670, var4);
                  this.field_16658.method_24215(var8, 4 * this.field_16670, var4);
                  this.field_16658.method_24215(var8, 6 * this.field_16670, var4);

                  for (int var34 = 0; var34 < this.field_16670; var34++) {
                     int var37 = var10 + var34 * this.field_16663 + var21;
                     int var48 = 2 * var34;
                     int var59 = 2 * this.field_16670 + 2 * var34;
                     int var66 = var59 + 2 * this.field_16670;
                     int var69 = var66 + 2 * this.field_16670;
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
               for (int var26 = 0; var26 < this.field_16670; var26++) {
                  this.field_16666.method_24155(var3, var10 + var26 * this.field_16663, var4);
               }
            }
         }
      } else {
         for (int var19 = 0; var19 < this.field_16657; var19++) {
            int var20 = var19 * this.field_16662;
            if (var1 != 0) {
               for (int var28 = 0; var28 < this.field_16670; var28++) {
                  this.field_16666.method_24205(var3, var20 + var28 * this.field_16663);
               }
            } else {
               for (int var27 = 0; var27 < this.field_16670; var27++) {
                  this.field_16666.method_24186(var3, var20 + var27 * this.field_16663);
               }
            }

            if (this.field_16659 <= 4) {
               if (this.field_16659 != 4) {
                  if (this.field_16659 == 2) {
                     for (int var32 = 0; var32 < this.field_16670; var32++) {
                        int var46 = var20 + var32 * this.field_16663;
                        int var57 = 2 * var32;
                        var8[var57] = var3[var46];
                        var8[var57 + 1] = var3[var46 + 1];
                     }

                     this.field_16658.method_24186(var8, 0);

                     for (int var33 = 0; var33 < this.field_16670; var33++) {
                        int var47 = var20 + var33 * this.field_16663;
                        int var58 = 2 * var33;
                        var3[var47] = var8[var58];
                        var3[var47 + 1] = var8[var58 + 1];
                     }
                  }
               } else {
                  for (int var30 = 0; var30 < this.field_16670; var30++) {
                     int var44 = var20 + var30 * this.field_16663;
                     int var55 = 2 * var30;
                     int var64 = 2 * this.field_16670 + 2 * var30;
                     var8[var55] = var3[var44];
                     var8[var55 + 1] = var3[var44 + 1];
                     var8[var64] = var3[var44 + 2];
                     var8[var64 + 1] = var3[var44 + 3];
                  }

                  this.field_16658.method_24186(var8, 0);
                  this.field_16658.method_24186(var8, 2 * this.field_16670);

                  for (int var31 = 0; var31 < this.field_16670; var31++) {
                     int var45 = var20 + var31 * this.field_16663;
                     int var56 = 2 * var31;
                     int var65 = 2 * this.field_16670 + 2 * var31;
                     var3[var45] = var8[var56];
                     var3[var45 + 1] = var8[var56 + 1];
                     var3[var45 + 2] = var8[var65];
                     var3[var45 + 3] = var8[var65 + 1];
                  }
               }
            } else {
               for (byte var29 = 0; var29 < this.field_16659; var29 += 8) {
                  for (int var35 = 0; var35 < this.field_16670; var35++) {
                     int var42 = var20 + var35 * this.field_16663 + var29;
                     int var53 = 2 * var35;
                     int var62 = 2 * this.field_16670 + 2 * var35;
                     int var67 = var62 + 2 * this.field_16670;
                     int var70 = var67 + 2 * this.field_16670;
                     var8[var53] = var3[var42];
                     var8[var53 + 1] = var3[var42 + 1];
                     var8[var62] = var3[var42 + 2];
                     var8[var62 + 1] = var3[var42 + 3];
                     var8[var67] = var3[var42 + 4];
                     var8[var67 + 1] = var3[var42 + 5];
                     var8[var70] = var3[var42 + 6];
                     var8[var70 + 1] = var3[var42 + 7];
                  }

                  this.field_16658.method_24186(var8, 0);
                  this.field_16658.method_24186(var8, 2 * this.field_16670);
                  this.field_16658.method_24186(var8, 4 * this.field_16670);
                  this.field_16658.method_24186(var8, 6 * this.field_16670);

                  for (int var36 = 0; var36 < this.field_16670; var36++) {
                     int var43 = var20 + var36 * this.field_16663 + var29;
                     int var54 = 2 * var36;
                     int var63 = 2 * this.field_16670 + 2 * var36;
                     int var68 = var63 + 2 * this.field_16670;
                     int var71 = var68 + 2 * this.field_16670;
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

   private void method_15594(long var1, int var3, class_4330 var4, boolean var5) {
      long var8 = this.field_16665;
      if (var8 < this.field_16667) {
         var8 = this.field_16667;
      }

      var8 *= 8L;
      if (this.field_16668 != 4L) {
         if (this.field_16668 < 4L) {
            var8 >>= 2;
         }
      } else {
         var8 >>= 1;
      }

      class_4330 var10 = new class_4330(var8);
      if (var3 != -1) {
         for (long var11 = 0L; var11 < this.field_16665; var11++) {
            long var13 = var11 * this.field_16661;
            if (var1 == 0L) {
               for (long var15 = 0L; var15 < this.field_16667; var15++) {
                  this.field_16666.method_24213(var4, var13 + var15 * this.field_16669, var5);
               }
            }

            if (this.field_16668 <= 4L) {
               if (this.field_16668 != 4L) {
                  if (this.field_16668 == 2L) {
                     for (long var35 = 0L; var35 < this.field_16667; var35++) {
                        long var51 = var13 + var35 * this.field_16669;
                        long var62 = 2L * var35;
                        var10.method_36123(var62, var4.method_36133(var51));
                        var10.method_36123(var62 + 1L, var4.method_36133(var51 + 1L));
                     }

                     this.field_16658.method_24213(var10, 0L, var5);

                     for (long var36 = 0L; var36 < this.field_16667; var36++) {
                        long var52 = var13 + var36 * this.field_16669;
                        long var63 = 2L * var36;
                        var4.method_36123(var52, var10.method_36133(var63));
                        var4.method_36123(var52 + 1L, var10.method_36133(var63 + 1L));
                     }
                  }
               } else {
                  for (long var33 = 0L; var33 < this.field_16667; var33++) {
                     long var49 = var13 + var33 * this.field_16669;
                     long var60 = 2L * var33;
                     long var71 = 2L * this.field_16667 + 2L * var33;
                     var10.method_36123(var60, var4.method_36133(var49));
                     var10.method_36123(var60 + 1L, var4.method_36133(var49 + 1L));
                     var10.method_36123(var71, var4.method_36133(var49 + 2L));
                     var10.method_36123(var71 + 1L, var4.method_36133(var49 + 3L));
                  }

                  this.field_16658.method_24213(var10, 0L, var5);
                  this.field_16658.method_24213(var10, 2L * this.field_16667, var5);

                  for (long var34 = 0L; var34 < this.field_16667; var34++) {
                     long var50 = var13 + var34 * this.field_16669;
                     long var61 = 2L * var34;
                     long var72 = 2L * this.field_16667 + 2L * var34;
                     var4.method_36123(var50, var10.method_36133(var61));
                     var4.method_36123(var50 + 1L, var10.method_36133(var61 + 1L));
                     var4.method_36123(var50 + 2L, var10.method_36133(var72));
                     var4.method_36123(var50 + 3L, var10.method_36133(var72 + 1L));
                  }
               }
            } else {
               for (long var32 = 0L; var32 < this.field_16668; var32 += 8L) {
                  for (long var17 = 0L; var17 < this.field_16667; var17++) {
                     long var19 = var13 + var17 * this.field_16669 + var32;
                     long var21 = 2L * var17;
                     long var23 = 2L * this.field_16667 + 2L * var17;
                     long var25 = var23 + 2L * this.field_16667;
                     long var27 = var25 + 2L * this.field_16667;
                     var10.method_36123(var21, var4.method_36133(var19));
                     var10.method_36123(var21 + 1L, var4.method_36133(var19 + 1L));
                     var10.method_36123(var23, var4.method_36133(var19 + 2L));
                     var10.method_36123(var23 + 1L, var4.method_36133(var19 + 3L));
                     var10.method_36123(var25, var4.method_36133(var19 + 4L));
                     var10.method_36123(var25 + 1L, var4.method_36133(var19 + 5L));
                     var10.method_36123(var27, var4.method_36133(var19 + 6L));
                     var10.method_36123(var27 + 1L, var4.method_36133(var19 + 7L));
                  }

                  this.field_16658.method_24213(var10, 0L, var5);
                  this.field_16658.method_24213(var10, 2L * this.field_16667, var5);
                  this.field_16658.method_24213(var10, 4L * this.field_16667, var5);
                  this.field_16658.method_24213(var10, 6L * this.field_16667, var5);

                  for (long var45 = 0L; var45 < this.field_16667; var45++) {
                     long var48 = var13 + var45 * this.field_16669 + var32;
                     long var59 = 2L * var45;
                     long var70 = 2L * this.field_16667 + 2L * var45;
                     long var77 = var70 + 2L * this.field_16667;
                     long var80 = var77 + 2L * this.field_16667;
                     var4.method_36123(var48, var10.method_36133(var59));
                     var4.method_36123(var48 + 1L, var10.method_36133(var59 + 1L));
                     var4.method_36123(var48 + 2L, var10.method_36133(var70));
                     var4.method_36123(var48 + 3L, var10.method_36133(var70 + 1L));
                     var4.method_36123(var48 + 4L, var10.method_36133(var77));
                     var4.method_36123(var48 + 5L, var10.method_36133(var77 + 1L));
                     var4.method_36123(var48 + 6L, var10.method_36133(var80));
                     var4.method_36123(var48 + 7L, var10.method_36133(var80 + 1L));
                  }
               }
            }

            if (var1 != 0L) {
               for (long var37 = 0L; var37 < this.field_16667; var37++) {
                  this.field_16666.method_24153(var4, var13 + var37 * this.field_16669, var5);
               }
            }
         }
      } else {
         for (long var30 = 0L; var30 < this.field_16665; var30++) {
            long var31 = var30 * this.field_16661;
            if (var1 != 0L) {
               for (long var39 = 0L; var39 < this.field_16667; var39++) {
                  this.field_16666.method_24203(var4, var31 + var39 * this.field_16669);
               }
            } else {
               for (long var38 = 0L; var38 < this.field_16667; var38++) {
                  this.field_16666.method_24184(var4, var31 + var38 * this.field_16669);
               }
            }

            if (this.field_16668 <= 4L) {
               if (this.field_16668 != 4L) {
                  if (this.field_16668 == 2L) {
                     for (long var43 = 0L; var43 < this.field_16667; var43++) {
                        long var57 = var31 + var43 * this.field_16669;
                        long var68 = 2L * var43;
                        var10.method_36123(var68, var4.method_36133(var57));
                        var10.method_36123(var68 + 1L, var4.method_36133(var57 + 1L));
                     }

                     this.field_16658.method_24184(var10, 0L);

                     for (long var44 = 0L; var44 < this.field_16667; var44++) {
                        long var58 = var31 + var44 * this.field_16669;
                        long var69 = 2L * var44;
                        var4.method_36123(var58, var10.method_36133(var69));
                        var4.method_36123(var58 + 1L, var10.method_36133(var69 + 1L));
                     }
                  }
               } else {
                  for (long var41 = 0L; var41 < this.field_16667; var41++) {
                     long var55 = var31 + var41 * this.field_16669;
                     long var66 = 2L * var41;
                     long var75 = 2L * this.field_16667 + 2L * var41;
                     var10.method_36123(var66, var4.method_36133(var55));
                     var10.method_36123(var66 + 1L, var4.method_36133(var55 + 1L));
                     var10.method_36123(var75, var4.method_36133(var55 + 2L));
                     var10.method_36123(var75 + 1L, var4.method_36133(var55 + 3L));
                  }

                  this.field_16658.method_24184(var10, 0L);
                  this.field_16658.method_24184(var10, 2L * this.field_16667);

                  for (long var42 = 0L; var42 < this.field_16667; var42++) {
                     long var56 = var31 + var42 * this.field_16669;
                     long var67 = 2L * var42;
                     long var76 = 2L * this.field_16667 + 2L * var42;
                     var4.method_36123(var56, var10.method_36133(var67));
                     var4.method_36123(var56 + 1L, var10.method_36133(var67 + 1L));
                     var4.method_36123(var56 + 2L, var10.method_36133(var76));
                     var4.method_36123(var56 + 3L, var10.method_36133(var76 + 1L));
                  }
               }
            } else {
               for (long var40 = 0L; var40 < this.field_16668; var40 += 8L) {
                  for (long var46 = 0L; var46 < this.field_16667; var46++) {
                     long var53 = var31 + var46 * this.field_16669 + var40;
                     long var64 = 2L * var46;
                     long var73 = 2L * this.field_16667 + 2L * var46;
                     long var78 = var73 + 2L * this.field_16667;
                     long var81 = var78 + 2L * this.field_16667;
                     var10.method_36123(var64, var4.method_36133(var53));
                     var10.method_36123(var64 + 1L, var4.method_36133(var53 + 1L));
                     var10.method_36123(var73, var4.method_36133(var53 + 2L));
                     var10.method_36123(var73 + 1L, var4.method_36133(var53 + 3L));
                     var10.method_36123(var78, var4.method_36133(var53 + 4L));
                     var10.method_36123(var78 + 1L, var4.method_36133(var53 + 5L));
                     var10.method_36123(var81, var4.method_36133(var53 + 6L));
                     var10.method_36123(var81 + 1L, var4.method_36133(var53 + 7L));
                  }

                  this.field_16658.method_24184(var10, 0L);
                  this.field_16658.method_24184(var10, 2L * this.field_16667);
                  this.field_16658.method_24184(var10, 4L * this.field_16667);
                  this.field_16658.method_24184(var10, 6L * this.field_16667);

                  for (long var47 = 0L; var47 < this.field_16667; var47++) {
                     long var54 = var31 + var47 * this.field_16669 + var40;
                     long var65 = 2L * var47;
                     long var74 = 2L * this.field_16667 + 2L * var47;
                     long var79 = var74 + 2L * this.field_16667;
                     long var82 = var79 + 2L * this.field_16667;
                     var4.method_36123(var54, var10.method_36133(var65));
                     var4.method_36123(var54 + 1L, var10.method_36133(var65 + 1L));
                     var4.method_36123(var54 + 2L, var10.method_36133(var74));
                     var4.method_36123(var54 + 3L, var10.method_36133(var74 + 1L));
                     var4.method_36123(var54 + 4L, var10.method_36133(var79));
                     var4.method_36123(var54 + 5L, var10.method_36133(var79 + 1L));
                     var4.method_36123(var54 + 6L, var10.method_36133(var82));
                     var4.method_36123(var54 + 7L, var10.method_36133(var82 + 1L));
                  }
               }
            }
         }
      }
   }

   private void method_15613(int var1, int var2, float[] var3, boolean var4) {
      int var7 = this.field_16657;
      if (var7 < this.field_16670) {
         var7 = this.field_16670;
      }

      var7 *= 8;
      if (this.field_16659 != 4) {
         if (this.field_16659 < 4) {
            var7 >>= 2;
         }
      } else {
         var7 >>= 1;
      }

      float[] var8 = new float[var7];
      if (var2 != -1) {
         for (int var9 = 0; var9 < this.field_16657; var9++) {
            int var10 = var9 * this.field_16662;
            if (var1 != 0) {
               for (int var21 = 0; var21 < this.field_16670; var21++) {
                  this.field_16666.method_24207(var3, var10 + var21 * this.field_16663, var4);
               }
            } else {
               for (int var11 = 0; var11 < this.field_16670; var11++) {
                  this.field_16666.method_24215(var3, var10 + var11 * this.field_16663, var4);
               }
            }

            if (this.field_16659 <= 4) {
               if (this.field_16659 != 4) {
                  if (this.field_16659 == 2) {
                     for (int var25 = 0; var25 < this.field_16670; var25++) {
                        int var40 = var10 + var25 * this.field_16663;
                        int var51 = 2 * var25;
                        var8[var51] = var3[var40];
                        var8[var51 + 1] = var3[var40 + 1];
                     }

                     this.field_16658.method_24215(var8, 0, var4);

                     for (int var26 = 0; var26 < this.field_16670; var26++) {
                        int var41 = var10 + var26 * this.field_16663;
                        int var52 = 2 * var26;
                        var3[var41] = var8[var52];
                        var3[var41 + 1] = var8[var52 + 1];
                     }
                  }
               } else {
                  for (int var23 = 0; var23 < this.field_16670; var23++) {
                     int var38 = var10 + var23 * this.field_16663;
                     int var49 = 2 * var23;
                     int var60 = 2 * this.field_16670 + 2 * var23;
                     var8[var49] = var3[var38];
                     var8[var49 + 1] = var3[var38 + 1];
                     var8[var60] = var3[var38 + 2];
                     var8[var60 + 1] = var3[var38 + 3];
                  }

                  this.field_16658.method_24215(var8, 0, var4);
                  this.field_16658.method_24215(var8, 2 * this.field_16670, var4);

                  for (int var24 = 0; var24 < this.field_16670; var24++) {
                     int var39 = var10 + var24 * this.field_16663;
                     int var50 = 2 * var24;
                     int var61 = 2 * this.field_16670 + 2 * var24;
                     var3[var39] = var8[var50];
                     var3[var39 + 1] = var8[var50 + 1];
                     var3[var39 + 2] = var8[var61];
                     var3[var39 + 3] = var8[var61 + 1];
                  }
               }
            } else {
               for (byte var22 = 0; var22 < this.field_16659; var22 += 8) {
                  for (int var12 = 0; var12 < this.field_16670; var12++) {
                     int var13 = var10 + var12 * this.field_16663 + var22;
                     int var14 = 2 * var12;
                     int var15 = 2 * this.field_16670 + 2 * var12;
                     int var16 = var15 + 2 * this.field_16670;
                     int var17 = var16 + 2 * this.field_16670;
                     var8[var14] = var3[var13];
                     var8[var14 + 1] = var3[var13 + 1];
                     var8[var15] = var3[var13 + 2];
                     var8[var15 + 1] = var3[var13 + 3];
                     var8[var16] = var3[var13 + 4];
                     var8[var16 + 1] = var3[var13 + 5];
                     var8[var17] = var3[var13 + 6];
                     var8[var17 + 1] = var3[var13 + 7];
                  }

                  this.field_16658.method_24215(var8, 0, var4);
                  this.field_16658.method_24215(var8, 2 * this.field_16670, var4);
                  this.field_16658.method_24215(var8, 4 * this.field_16670, var4);
                  this.field_16658.method_24215(var8, 6 * this.field_16670, var4);

                  for (int var34 = 0; var34 < this.field_16670; var34++) {
                     int var37 = var10 + var34 * this.field_16663 + var22;
                     int var48 = 2 * var34;
                     int var59 = 2 * this.field_16670 + 2 * var34;
                     int var66 = var59 + 2 * this.field_16670;
                     int var69 = var66 + 2 * this.field_16670;
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
         for (int var19 = 0; var19 < this.field_16657; var19++) {
            int var20 = var19 * this.field_16662;
            if (var1 != 0) {
               for (int var28 = 0; var28 < this.field_16670; var28++) {
                  this.field_16666.method_24205(var3, var20 + var28 * this.field_16663);
               }
            } else {
               for (int var27 = 0; var27 < this.field_16670; var27++) {
                  this.field_16666.method_24186(var3, var20 + var27 * this.field_16663);
               }
            }

            if (this.field_16659 <= 4) {
               if (this.field_16659 != 4) {
                  if (this.field_16659 == 2) {
                     for (int var32 = 0; var32 < this.field_16670; var32++) {
                        int var46 = var20 + var32 * this.field_16663;
                        int var57 = 2 * var32;
                        var8[var57] = var3[var46];
                        var8[var57 + 1] = var3[var46 + 1];
                     }

                     this.field_16658.method_24186(var8, 0);

                     for (int var33 = 0; var33 < this.field_16670; var33++) {
                        int var47 = var20 + var33 * this.field_16663;
                        int var58 = 2 * var33;
                        var3[var47] = var8[var58];
                        var3[var47 + 1] = var8[var58 + 1];
                     }
                  }
               } else {
                  for (int var30 = 0; var30 < this.field_16670; var30++) {
                     int var44 = var20 + var30 * this.field_16663;
                     int var55 = 2 * var30;
                     int var64 = 2 * this.field_16670 + 2 * var30;
                     var8[var55] = var3[var44];
                     var8[var55 + 1] = var3[var44 + 1];
                     var8[var64] = var3[var44 + 2];
                     var8[var64 + 1] = var3[var44 + 3];
                  }

                  this.field_16658.method_24186(var8, 0);
                  this.field_16658.method_24186(var8, 2 * this.field_16670);

                  for (int var31 = 0; var31 < this.field_16670; var31++) {
                     int var45 = var20 + var31 * this.field_16663;
                     int var56 = 2 * var31;
                     int var65 = 2 * this.field_16670 + 2 * var31;
                     var3[var45] = var8[var56];
                     var3[var45 + 1] = var8[var56 + 1];
                     var3[var45 + 2] = var8[var65];
                     var3[var45 + 3] = var8[var65 + 1];
                  }
               }
            } else {
               for (byte var29 = 0; var29 < this.field_16659; var29 += 8) {
                  for (int var35 = 0; var35 < this.field_16670; var35++) {
                     int var42 = var20 + var35 * this.field_16663 + var29;
                     int var53 = 2 * var35;
                     int var62 = 2 * this.field_16670 + 2 * var35;
                     int var67 = var62 + 2 * this.field_16670;
                     int var70 = var67 + 2 * this.field_16670;
                     var8[var53] = var3[var42];
                     var8[var53 + 1] = var3[var42 + 1];
                     var8[var62] = var3[var42 + 2];
                     var8[var62 + 1] = var3[var42 + 3];
                     var8[var67] = var3[var42 + 4];
                     var8[var67 + 1] = var3[var42 + 5];
                     var8[var70] = var3[var42 + 6];
                     var8[var70 + 1] = var3[var42 + 7];
                  }

                  this.field_16658.method_24186(var8, 0);
                  this.field_16658.method_24186(var8, 2 * this.field_16670);
                  this.field_16658.method_24186(var8, 4 * this.field_16670);
                  this.field_16658.method_24186(var8, 6 * this.field_16670);

                  for (int var36 = 0; var36 < this.field_16670; var36++) {
                     int var43 = var20 + var36 * this.field_16663 + var29;
                     int var54 = 2 * var36;
                     int var63 = 2 * this.field_16670 + 2 * var36;
                     int var68 = var63 + 2 * this.field_16670;
                     int var71 = var68 + 2 * this.field_16670;
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

   private void method_15615(long var1, int var3, class_4330 var4, boolean var5) {
      long var8 = this.field_16665;
      if (var8 < this.field_16667) {
         var8 = this.field_16667;
      }

      var8 *= 8L;
      if (this.field_16668 != 4L) {
         if (this.field_16668 < 4L) {
            var8 >>= 2;
         }
      } else {
         var8 >>= 1;
      }

      class_4330 var10 = new class_4330(var8);
      if (var3 != -1) {
         for (long var11 = 0L; var11 < this.field_16665; var11++) {
            long var13 = var11 * this.field_16661;
            if (var1 != 0L) {
               for (long var32 = 0L; var32 < this.field_16667; var32++) {
                  this.field_16666.method_24206(var4, var13 + var32 * this.field_16669, var5);
               }
            } else {
               for (long var15 = 0L; var15 < this.field_16667; var15++) {
                  this.field_16666.method_24213(var4, var13 + var15 * this.field_16669, var5);
               }
            }

            if (this.field_16668 <= 4L) {
               if (this.field_16668 != 4L) {
                  if (this.field_16668 == 2L) {
                     for (long var36 = 0L; var36 < this.field_16667; var36++) {
                        long var51 = var13 + var36 * this.field_16669;
                        long var62 = 2L * var36;
                        var10.method_36123(var62, var4.method_36133(var51));
                        var10.method_36123(var62 + 1L, var4.method_36133(var51 + 1L));
                     }

                     this.field_16658.method_24213(var10, 0L, var5);

                     for (long var37 = 0L; var37 < this.field_16667; var37++) {
                        long var52 = var13 + var37 * this.field_16669;
                        long var63 = 2L * var37;
                        var4.method_36123(var52, var10.method_36133(var63));
                        var4.method_36123(var52 + 1L, var10.method_36133(var63 + 1L));
                     }
                  }
               } else {
                  for (long var34 = 0L; var34 < this.field_16667; var34++) {
                     long var49 = var13 + var34 * this.field_16669;
                     long var60 = 2L * var34;
                     long var71 = 2L * this.field_16667 + 2L * var34;
                     var10.method_36123(var60, var4.method_36133(var49));
                     var10.method_36123(var60 + 1L, var4.method_36133(var49 + 1L));
                     var10.method_36123(var71, var4.method_36133(var49 + 2L));
                     var10.method_36123(var71 + 1L, var4.method_36133(var49 + 3L));
                  }

                  this.field_16658.method_24213(var10, 0L, var5);
                  this.field_16658.method_24213(var10, 2L * this.field_16667, var5);

                  for (long var35 = 0L; var35 < this.field_16667; var35++) {
                     long var50 = var13 + var35 * this.field_16669;
                     long var61 = 2L * var35;
                     long var72 = 2L * this.field_16667 + 2L * var35;
                     var4.method_36123(var50, var10.method_36133(var61));
                     var4.method_36123(var50 + 1L, var10.method_36133(var61 + 1L));
                     var4.method_36123(var50 + 2L, var10.method_36133(var72));
                     var4.method_36123(var50 + 3L, var10.method_36133(var72 + 1L));
                  }
               }
            } else {
               for (long var33 = 0L; var33 < this.field_16668; var33 += 8L) {
                  for (long var17 = 0L; var17 < this.field_16667; var17++) {
                     long var19 = var13 + var17 * this.field_16669 + var33;
                     long var21 = 2L * var17;
                     long var23 = 2L * this.field_16667 + 2L * var17;
                     long var25 = var23 + 2L * this.field_16667;
                     long var27 = var25 + 2L * this.field_16667;
                     var10.method_36123(var21, var4.method_36133(var19));
                     var10.method_36123(var21 + 1L, var4.method_36133(var19 + 1L));
                     var10.method_36123(var23, var4.method_36133(var19 + 2L));
                     var10.method_36123(var23 + 1L, var4.method_36133(var19 + 3L));
                     var10.method_36123(var25, var4.method_36133(var19 + 4L));
                     var10.method_36123(var25 + 1L, var4.method_36133(var19 + 5L));
                     var10.method_36123(var27, var4.method_36133(var19 + 6L));
                     var10.method_36123(var27 + 1L, var4.method_36133(var19 + 7L));
                  }

                  this.field_16658.method_24213(var10, 0L, var5);
                  this.field_16658.method_24213(var10, 2L * this.field_16667, var5);
                  this.field_16658.method_24213(var10, 4L * this.field_16667, var5);
                  this.field_16658.method_24213(var10, 6L * this.field_16667, var5);

                  for (long var45 = 0L; var45 < this.field_16667; var45++) {
                     long var48 = var13 + var45 * this.field_16669 + var33;
                     long var59 = 2L * var45;
                     long var70 = 2L * this.field_16667 + 2L * var45;
                     long var77 = var70 + 2L * this.field_16667;
                     long var80 = var77 + 2L * this.field_16667;
                     var4.method_36123(var48, var10.method_36133(var59));
                     var4.method_36123(var48 + 1L, var10.method_36133(var59 + 1L));
                     var4.method_36123(var48 + 2L, var10.method_36133(var70));
                     var4.method_36123(var48 + 3L, var10.method_36133(var70 + 1L));
                     var4.method_36123(var48 + 4L, var10.method_36133(var77));
                     var4.method_36123(var48 + 5L, var10.method_36133(var77 + 1L));
                     var4.method_36123(var48 + 6L, var10.method_36133(var80));
                     var4.method_36123(var48 + 7L, var10.method_36133(var80 + 1L));
                  }
               }
            }
         }
      } else {
         for (long var30 = 0L; var30 < this.field_16665; var30++) {
            long var31 = var30 * this.field_16661;
            if (var1 != 0L) {
               for (long var39 = 0L; var39 < this.field_16667; var39++) {
                  this.field_16666.method_24203(var4, var31 + var39 * this.field_16669);
               }
            } else {
               for (long var38 = 0L; var38 < this.field_16667; var38++) {
                  this.field_16666.method_24184(var4, var31 + var38 * this.field_16669);
               }
            }

            if (this.field_16668 <= 4L) {
               if (this.field_16668 != 4L) {
                  if (this.field_16668 == 2L) {
                     for (long var43 = 0L; var43 < this.field_16667; var43++) {
                        long var57 = var31 + var43 * this.field_16669;
                        long var68 = 2L * var43;
                        var10.method_36123(var68, var4.method_36133(var57));
                        var10.method_36123(var68 + 1L, var4.method_36133(var57 + 1L));
                     }

                     this.field_16658.method_24184(var10, 0L);

                     for (long var44 = 0L; var44 < this.field_16667; var44++) {
                        long var58 = var31 + var44 * this.field_16669;
                        long var69 = 2L * var44;
                        var4.method_36123(var58, var10.method_36133(var69));
                        var4.method_36123(var58 + 1L, var10.method_36133(var69 + 1L));
                     }
                  }
               } else {
                  for (long var41 = 0L; var41 < this.field_16667; var41++) {
                     long var55 = var31 + var41 * this.field_16669;
                     long var66 = 2L * var41;
                     long var75 = 2L * this.field_16667 + 2L * var41;
                     var10.method_36123(var66, var4.method_36133(var55));
                     var10.method_36123(var66 + 1L, var4.method_36133(var55 + 1L));
                     var10.method_36123(var75, var4.method_36133(var55 + 2L));
                     var10.method_36123(var75 + 1L, var4.method_36133(var55 + 3L));
                  }

                  this.field_16658.method_24184(var10, 0L);
                  this.field_16658.method_24184(var10, 2L * this.field_16667);

                  for (long var42 = 0L; var42 < this.field_16667; var42++) {
                     long var56 = var31 + var42 * this.field_16669;
                     long var67 = 2L * var42;
                     long var76 = 2L * this.field_16667 + 2L * var42;
                     var4.method_36123(var56, var10.method_36133(var67));
                     var4.method_36123(var56 + 1L, var10.method_36133(var67 + 1L));
                     var4.method_36123(var56 + 2L, var10.method_36133(var76));
                     var4.method_36123(var56 + 3L, var10.method_36133(var76 + 1L));
                  }
               }
            } else {
               for (long var40 = 0L; var40 < this.field_16668; var40 += 8L) {
                  for (long var46 = 0L; var46 < this.field_16667; var46++) {
                     long var53 = var31 + var46 * this.field_16669 + var40;
                     long var64 = 2L * var46;
                     long var73 = 2L * this.field_16667 + 2L * var46;
                     long var78 = var73 + 2L * this.field_16667;
                     long var81 = var78 + 2L * this.field_16667;
                     var10.method_36123(var64, var4.method_36133(var53));
                     var10.method_36123(var64 + 1L, var4.method_36133(var53 + 1L));
                     var10.method_36123(var73, var4.method_36133(var53 + 2L));
                     var10.method_36123(var73 + 1L, var4.method_36133(var53 + 3L));
                     var10.method_36123(var78, var4.method_36133(var53 + 4L));
                     var10.method_36123(var78 + 1L, var4.method_36133(var53 + 5L));
                     var10.method_36123(var81, var4.method_36133(var53 + 6L));
                     var10.method_36123(var81 + 1L, var4.method_36133(var53 + 7L));
                  }

                  this.field_16658.method_24184(var10, 0L);
                  this.field_16658.method_24184(var10, 2L * this.field_16667);
                  this.field_16658.method_24184(var10, 4L * this.field_16667);
                  this.field_16658.method_24184(var10, 6L * this.field_16667);

                  for (long var47 = 0L; var47 < this.field_16667; var47++) {
                     long var54 = var31 + var47 * this.field_16669 + var40;
                     long var65 = 2L * var47;
                     long var74 = 2L * this.field_16667 + 2L * var47;
                     long var79 = var74 + 2L * this.field_16667;
                     long var82 = var79 + 2L * this.field_16667;
                     var4.method_36123(var54, var10.method_36133(var65));
                     var4.method_36123(var54 + 1L, var10.method_36133(var65 + 1L));
                     var4.method_36123(var54 + 2L, var10.method_36133(var74));
                     var4.method_36123(var54 + 3L, var10.method_36133(var74 + 1L));
                     var4.method_36123(var54 + 4L, var10.method_36133(var79));
                     var4.method_36123(var54 + 5L, var10.method_36133(var79 + 1L));
                     var4.method_36123(var54 + 6L, var10.method_36133(var82));
                     var4.method_36123(var54 + 7L, var10.method_36133(var82 + 1L));
                  }
               }
            }
         }
      }
   }

   private void method_15593(int var1, int var2, float[][][] var3, boolean var4) {
      int var7 = this.field_16657;
      if (var7 < this.field_16670) {
         var7 = this.field_16670;
      }

      var7 *= 8;
      if (this.field_16659 != 4) {
         if (this.field_16659 < 4) {
            var7 >>= 2;
         }
      } else {
         var7 >>= 1;
      }

      float[] var8 = new float[var7];
      if (var2 != -1) {
         for (int var9 = 0; var9 < this.field_16657; var9++) {
            if (var1 == 0) {
               for (int var10 = 0; var10 < this.field_16670; var10++) {
                  this.field_16666.method_24216(var3[var9][var10], var4);
               }
            }

            if (this.field_16659 <= 4) {
               if (this.field_16659 != 4) {
                  if (this.field_16659 == 2) {
                     for (int var21 = 0; var21 < this.field_16670; var21++) {
                        int var37 = 2 * var21;
                        var8[var37] = var3[var9][var21][0];
                        var8[var37 + 1] = var3[var9][var21][1];
                     }

                     this.field_16658.method_24215(var8, 0, var4);

                     for (int var22 = 0; var22 < this.field_16670; var22++) {
                        int var38 = 2 * var22;
                        var3[var9][var22][0] = var8[var38];
                        var3[var9][var22][1] = var8[var38 + 1];
                     }
                  }
               } else {
                  for (int var19 = 0; var19 < this.field_16670; var19++) {
                     int var35 = 2 * var19;
                     int var46 = 2 * this.field_16670 + 2 * var19;
                     var8[var35] = var3[var9][var19][0];
                     var8[var35 + 1] = var3[var9][var19][1];
                     var8[var46] = var3[var9][var19][2];
                     var8[var46 + 1] = var3[var9][var19][3];
                  }

                  this.field_16658.method_24215(var8, 0, var4);
                  this.field_16658.method_24215(var8, 2 * this.field_16670, var4);

                  for (int var20 = 0; var20 < this.field_16670; var20++) {
                     int var36 = 2 * var20;
                     int var47 = 2 * this.field_16670 + 2 * var20;
                     var3[var9][var20][0] = var8[var36];
                     var3[var9][var20][1] = var8[var36 + 1];
                     var3[var9][var20][2] = var8[var47];
                     var3[var9][var20][3] = var8[var47 + 1];
                  }
               }
            } else {
               for (byte var18 = 0; var18 < this.field_16659; var18 += 8) {
                  for (int var11 = 0; var11 < this.field_16670; var11++) {
                     int var12 = 2 * var11;
                     int var13 = 2 * this.field_16670 + 2 * var11;
                     int var14 = var13 + 2 * this.field_16670;
                     int var15 = var14 + 2 * this.field_16670;
                     var8[var12] = var3[var9][var11][var18];
                     var8[var12 + 1] = var3[var9][var11][var18 + 1];
                     var8[var13] = var3[var9][var11][var18 + 2];
                     var8[var13 + 1] = var3[var9][var11][var18 + 3];
                     var8[var14] = var3[var9][var11][var18 + 4];
                     var8[var14 + 1] = var3[var9][var11][var18 + 5];
                     var8[var15] = var3[var9][var11][var18 + 6];
                     var8[var15 + 1] = var3[var9][var11][var18 + 7];
                  }

                  this.field_16658.method_24215(var8, 0, var4);
                  this.field_16658.method_24215(var8, 2 * this.field_16670, var4);
                  this.field_16658.method_24215(var8, 4 * this.field_16670, var4);
                  this.field_16658.method_24215(var8, 6 * this.field_16670, var4);

                  for (int var31 = 0; var31 < this.field_16670; var31++) {
                     int var34 = 2 * var31;
                     int var45 = 2 * this.field_16670 + 2 * var31;
                     int var52 = var45 + 2 * this.field_16670;
                     int var55 = var52 + 2 * this.field_16670;
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
               for (int var23 = 0; var23 < this.field_16670; var23++) {
                  this.field_16666.method_24156(var3[var9][var23], var4);
               }
            }
         }
      } else {
         for (int var17 = 0; var17 < this.field_16657; var17++) {
            if (var1 != 0) {
               for (int var25 = 0; var25 < this.field_16670; var25++) {
                  this.field_16666.method_24205(var3[var17][var25], 0);
               }
            } else {
               for (int var24 = 0; var24 < this.field_16670; var24++) {
                  this.field_16666.method_24185(var3[var17][var24]);
               }
            }

            if (this.field_16659 <= 4) {
               if (this.field_16659 != 4) {
                  if (this.field_16659 == 2) {
                     for (int var29 = 0; var29 < this.field_16670; var29++) {
                        int var43 = 2 * var29;
                        var8[var43] = var3[var17][var29][0];
                        var8[var43 + 1] = var3[var17][var29][1];
                     }

                     this.field_16658.method_24186(var8, 0);

                     for (int var30 = 0; var30 < this.field_16670; var30++) {
                        int var44 = 2 * var30;
                        var3[var17][var30][0] = var8[var44];
                        var3[var17][var30][1] = var8[var44 + 1];
                     }
                  }
               } else {
                  for (int var27 = 0; var27 < this.field_16670; var27++) {
                     int var41 = 2 * var27;
                     int var50 = 2 * this.field_16670 + 2 * var27;
                     var8[var41] = var3[var17][var27][0];
                     var8[var41 + 1] = var3[var17][var27][1];
                     var8[var50] = var3[var17][var27][2];
                     var8[var50 + 1] = var3[var17][var27][3];
                  }

                  this.field_16658.method_24186(var8, 0);
                  this.field_16658.method_24186(var8, 2 * this.field_16670);

                  for (int var28 = 0; var28 < this.field_16670; var28++) {
                     int var42 = 2 * var28;
                     int var51 = 2 * this.field_16670 + 2 * var28;
                     var3[var17][var28][0] = var8[var42];
                     var3[var17][var28][1] = var8[var42 + 1];
                     var3[var17][var28][2] = var8[var51];
                     var3[var17][var28][3] = var8[var51 + 1];
                  }
               }
            } else {
               for (byte var26 = 0; var26 < this.field_16659; var26 += 8) {
                  for (int var32 = 0; var32 < this.field_16670; var32++) {
                     int var39 = 2 * var32;
                     int var48 = 2 * this.field_16670 + 2 * var32;
                     int var53 = var48 + 2 * this.field_16670;
                     int var56 = var53 + 2 * this.field_16670;
                     var8[var39] = var3[var17][var32][var26];
                     var8[var39 + 1] = var3[var17][var32][var26 + 1];
                     var8[var48] = var3[var17][var32][var26 + 2];
                     var8[var48 + 1] = var3[var17][var32][var26 + 3];
                     var8[var53] = var3[var17][var32][var26 + 4];
                     var8[var53 + 1] = var3[var17][var32][var26 + 5];
                     var8[var56] = var3[var17][var32][var26 + 6];
                     var8[var56 + 1] = var3[var17][var32][var26 + 7];
                  }

                  this.field_16658.method_24186(var8, 0);
                  this.field_16658.method_24186(var8, 2 * this.field_16670);
                  this.field_16658.method_24186(var8, 4 * this.field_16670);
                  this.field_16658.method_24186(var8, 6 * this.field_16670);

                  for (int var33 = 0; var33 < this.field_16670; var33++) {
                     int var40 = 2 * var33;
                     int var49 = 2 * this.field_16670 + 2 * var33;
                     int var54 = var49 + 2 * this.field_16670;
                     int var57 = var54 + 2 * this.field_16670;
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

   private void method_15614(int var1, int var2, float[][][] var3, boolean var4) {
      int var7 = this.field_16657;
      if (var7 < this.field_16670) {
         var7 = this.field_16670;
      }

      var7 *= 8;
      if (this.field_16659 != 4) {
         if (this.field_16659 < 4) {
            var7 >>= 2;
         }
      } else {
         var7 >>= 1;
      }

      float[] var8 = new float[var7];
      if (var2 != -1) {
         for (int var9 = 0; var9 < this.field_16657; var9++) {
            if (var1 != 0) {
               for (int var18 = 0; var18 < this.field_16670; var18++) {
                  this.field_16666.method_24207(var3[var9][var18], 0, var4);
               }
            } else {
               for (int var10 = 0; var10 < this.field_16670; var10++) {
                  this.field_16666.method_24216(var3[var9][var10], var4);
               }
            }

            if (this.field_16659 <= 4) {
               if (this.field_16659 != 4) {
                  if (this.field_16659 == 2) {
                     for (int var22 = 0; var22 < this.field_16670; var22++) {
                        int var37 = 2 * var22;
                        var8[var37] = var3[var9][var22][0];
                        var8[var37 + 1] = var3[var9][var22][1];
                     }

                     this.field_16658.method_24215(var8, 0, var4);

                     for (int var23 = 0; var23 < this.field_16670; var23++) {
                        int var38 = 2 * var23;
                        var3[var9][var23][0] = var8[var38];
                        var3[var9][var23][1] = var8[var38 + 1];
                     }
                  }
               } else {
                  for (int var20 = 0; var20 < this.field_16670; var20++) {
                     int var35 = 2 * var20;
                     int var46 = 2 * this.field_16670 + 2 * var20;
                     var8[var35] = var3[var9][var20][0];
                     var8[var35 + 1] = var3[var9][var20][1];
                     var8[var46] = var3[var9][var20][2];
                     var8[var46 + 1] = var3[var9][var20][3];
                  }

                  this.field_16658.method_24215(var8, 0, var4);
                  this.field_16658.method_24215(var8, 2 * this.field_16670, var4);

                  for (int var21 = 0; var21 < this.field_16670; var21++) {
                     int var36 = 2 * var21;
                     int var47 = 2 * this.field_16670 + 2 * var21;
                     var3[var9][var21][0] = var8[var36];
                     var3[var9][var21][1] = var8[var36 + 1];
                     var3[var9][var21][2] = var8[var47];
                     var3[var9][var21][3] = var8[var47 + 1];
                  }
               }
            } else {
               for (byte var19 = 0; var19 < this.field_16659; var19 += 8) {
                  for (int var11 = 0; var11 < this.field_16670; var11++) {
                     int var12 = 2 * var11;
                     int var13 = 2 * this.field_16670 + 2 * var11;
                     int var14 = var13 + 2 * this.field_16670;
                     int var15 = var14 + 2 * this.field_16670;
                     var8[var12] = var3[var9][var11][var19];
                     var8[var12 + 1] = var3[var9][var11][var19 + 1];
                     var8[var13] = var3[var9][var11][var19 + 2];
                     var8[var13 + 1] = var3[var9][var11][var19 + 3];
                     var8[var14] = var3[var9][var11][var19 + 4];
                     var8[var14 + 1] = var3[var9][var11][var19 + 5];
                     var8[var15] = var3[var9][var11][var19 + 6];
                     var8[var15 + 1] = var3[var9][var11][var19 + 7];
                  }

                  this.field_16658.method_24215(var8, 0, var4);
                  this.field_16658.method_24215(var8, 2 * this.field_16670, var4);
                  this.field_16658.method_24215(var8, 4 * this.field_16670, var4);
                  this.field_16658.method_24215(var8, 6 * this.field_16670, var4);

                  for (int var31 = 0; var31 < this.field_16670; var31++) {
                     int var34 = 2 * var31;
                     int var45 = 2 * this.field_16670 + 2 * var31;
                     int var52 = var45 + 2 * this.field_16670;
                     int var55 = var52 + 2 * this.field_16670;
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
         for (int var17 = 0; var17 < this.field_16657; var17++) {
            if (var1 != 0) {
               for (int var25 = 0; var25 < this.field_16670; var25++) {
                  this.field_16666.method_24204(var3[var17][var25]);
               }
            } else {
               for (int var24 = 0; var24 < this.field_16670; var24++) {
                  this.field_16666.method_24185(var3[var17][var24]);
               }
            }

            if (this.field_16659 <= 4) {
               if (this.field_16659 != 4) {
                  if (this.field_16659 == 2) {
                     for (int var29 = 0; var29 < this.field_16670; var29++) {
                        int var43 = 2 * var29;
                        var8[var43] = var3[var17][var29][0];
                        var8[var43 + 1] = var3[var17][var29][1];
                     }

                     this.field_16658.method_24186(var8, 0);

                     for (int var30 = 0; var30 < this.field_16670; var30++) {
                        int var44 = 2 * var30;
                        var3[var17][var30][0] = var8[var44];
                        var3[var17][var30][1] = var8[var44 + 1];
                     }
                  }
               } else {
                  for (int var27 = 0; var27 < this.field_16670; var27++) {
                     int var41 = 2 * var27;
                     int var50 = 2 * this.field_16670 + 2 * var27;
                     var8[var41] = var3[var17][var27][0];
                     var8[var41 + 1] = var3[var17][var27][1];
                     var8[var50] = var3[var17][var27][2];
                     var8[var50 + 1] = var3[var17][var27][3];
                  }

                  this.field_16658.method_24186(var8, 0);
                  this.field_16658.method_24186(var8, 2 * this.field_16670);

                  for (int var28 = 0; var28 < this.field_16670; var28++) {
                     int var42 = 2 * var28;
                     int var51 = 2 * this.field_16670 + 2 * var28;
                     var3[var17][var28][0] = var8[var42];
                     var3[var17][var28][1] = var8[var42 + 1];
                     var3[var17][var28][2] = var8[var51];
                     var3[var17][var28][3] = var8[var51 + 1];
                  }
               }
            } else {
               for (byte var26 = 0; var26 < this.field_16659; var26 += 8) {
                  for (int var32 = 0; var32 < this.field_16670; var32++) {
                     int var39 = 2 * var32;
                     int var48 = 2 * this.field_16670 + 2 * var32;
                     int var53 = var48 + 2 * this.field_16670;
                     int var56 = var53 + 2 * this.field_16670;
                     var8[var39] = var3[var17][var32][var26];
                     var8[var39 + 1] = var3[var17][var32][var26 + 1];
                     var8[var48] = var3[var17][var32][var26 + 2];
                     var8[var48 + 1] = var3[var17][var32][var26 + 3];
                     var8[var53] = var3[var17][var32][var26 + 4];
                     var8[var53 + 1] = var3[var17][var32][var26 + 5];
                     var8[var56] = var3[var17][var32][var26 + 6];
                     var8[var56 + 1] = var3[var17][var32][var26 + 7];
                  }

                  this.field_16658.method_24186(var8, 0);
                  this.field_16658.method_24186(var8, 2 * this.field_16670);
                  this.field_16658.method_24186(var8, 4 * this.field_16670);
                  this.field_16658.method_24186(var8, 6 * this.field_16670);

                  for (int var33 = 0; var33 < this.field_16670; var33++) {
                     int var40 = 2 * var33;
                     int var49 = 2 * this.field_16670 + 2 * var33;
                     int var54 = var49 + 2 * this.field_16670;
                     int var57 = var54 + 2 * this.field_16670;
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

   private void method_15601(int var1, float[] var2, boolean var3) {
      int var6 = this.field_16657;
      if (var6 < this.field_16670) {
         var6 = this.field_16670;
      }

      var6 *= 8;
      if (this.field_16659 != 4) {
         if (this.field_16659 < 4) {
            var6 >>= 2;
         }
      } else {
         var6 >>= 1;
      }

      float[] var7 = new float[var6];
      if (var1 != -1) {
         if (this.field_16659 <= 4) {
            if (this.field_16659 != 4) {
               if (this.field_16659 == 2) {
                  for (int var8 = 0; var8 < this.field_16670; var8++) {
                     int var9 = var8 * this.field_16663;

                     for (int var10 = 0; var10 < this.field_16657; var10++) {
                        int var12 = var10 * this.field_16662 + var9;
                        int var13 = 2 * var10;
                        var7[var13] = var2[var12];
                        var7[var13 + 1] = var2[var12 + 1];
                     }

                     this.field_16655.method_24215(var7, 0, var3);

                     for (int var28 = 0; var28 < this.field_16657; var28++) {
                        int var40 = var28 * this.field_16662 + var9;
                        int var51 = 2 * var28;
                        var2[var40] = var7[var51];
                        var2[var40 + 1] = var7[var51 + 1];
                     }
                  }
               }
            } else {
               for (int var18 = 0; var18 < this.field_16670; var18++) {
                  int var23 = var18 * this.field_16663;

                  for (int var29 = 0; var29 < this.field_16657; var29++) {
                     int var41 = var29 * this.field_16662 + var23;
                     int var52 = 2 * var29;
                     int var14 = 2 * this.field_16657 + 2 * var29;
                     var7[var52] = var2[var41];
                     var7[var52 + 1] = var2[var41 + 1];
                     var7[var14] = var2[var41 + 2];
                     var7[var14 + 1] = var2[var41 + 3];
                  }

                  this.field_16655.method_24215(var7, 0, var3);
                  this.field_16655.method_24215(var7, 2 * this.field_16657, var3);

                  for (int var30 = 0; var30 < this.field_16657; var30++) {
                     int var42 = var30 * this.field_16662 + var23;
                     int var53 = 2 * var30;
                     int var62 = 2 * this.field_16657 + 2 * var30;
                     var2[var42] = var7[var53];
                     var2[var42 + 1] = var7[var53 + 1];
                     var2[var42 + 2] = var7[var62];
                     var2[var42 + 3] = var7[var62 + 1];
                  }
               }
            }
         } else {
            for (int var19 = 0; var19 < this.field_16670; var19++) {
               int var24 = var19 * this.field_16663;

               for (byte var31 = 0; var31 < this.field_16659; var31 += 8) {
                  for (int var11 = 0; var11 < this.field_16657; var11++) {
                     int var43 = var11 * this.field_16662 + var24 + var31;
                     int var54 = 2 * var11;
                     int var63 = 2 * this.field_16657 + 2 * var11;
                     int var15 = var63 + 2 * this.field_16657;
                     int var16 = var15 + 2 * this.field_16657;
                     var7[var54] = var2[var43];
                     var7[var54 + 1] = var2[var43 + 1];
                     var7[var63] = var2[var43 + 2];
                     var7[var63 + 1] = var2[var43 + 3];
                     var7[var15] = var2[var43 + 4];
                     var7[var15 + 1] = var2[var43 + 5];
                     var7[var16] = var2[var43 + 6];
                     var7[var16 + 1] = var2[var43 + 7];
                  }

                  this.field_16655.method_24215(var7, 0, var3);
                  this.field_16655.method_24215(var7, 2 * this.field_16657, var3);
                  this.field_16655.method_24215(var7, 4 * this.field_16657, var3);
                  this.field_16655.method_24215(var7, 6 * this.field_16657, var3);

                  for (int var37 = 0; var37 < this.field_16657; var37++) {
                     int var44 = var37 * this.field_16662 + var24 + var31;
                     int var55 = 2 * var37;
                     int var64 = 2 * this.field_16657 + 2 * var37;
                     int var69 = var64 + 2 * this.field_16657;
                     int var72 = var69 + 2 * this.field_16657;
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
      } else if (this.field_16659 <= 4) {
         if (this.field_16659 != 4) {
            if (this.field_16659 == 2) {
               for (int var20 = 0; var20 < this.field_16670; var20++) {
                  int var25 = var20 * this.field_16663;

                  for (int var32 = 0; var32 < this.field_16657; var32++) {
                     int var45 = var32 * this.field_16662 + var25;
                     int var56 = 2 * var32;
                     var7[var56] = var2[var45];
                     var7[var56 + 1] = var2[var45 + 1];
                  }

                  this.field_16655.method_24186(var7, 0);

                  for (int var33 = 0; var33 < this.field_16657; var33++) {
                     int var46 = var33 * this.field_16662 + var25;
                     int var57 = 2 * var33;
                     var2[var46] = var7[var57];
                     var2[var46 + 1] = var7[var57 + 1];
                  }
               }
            }
         } else {
            for (int var21 = 0; var21 < this.field_16670; var21++) {
               int var26 = var21 * this.field_16663;

               for (int var34 = 0; var34 < this.field_16657; var34++) {
                  int var47 = var34 * this.field_16662 + var26;
                  int var58 = 2 * var34;
                  int var65 = 2 * this.field_16657 + 2 * var34;
                  var7[var58] = var2[var47];
                  var7[var58 + 1] = var2[var47 + 1];
                  var7[var65] = var2[var47 + 2];
                  var7[var65 + 1] = var2[var47 + 3];
               }

               this.field_16655.method_24186(var7, 0);
               this.field_16655.method_24186(var7, 2 * this.field_16657);

               for (int var35 = 0; var35 < this.field_16657; var35++) {
                  int var48 = var35 * this.field_16662 + var26;
                  int var59 = 2 * var35;
                  int var66 = 2 * this.field_16657 + 2 * var35;
                  var2[var48] = var7[var59];
                  var2[var48 + 1] = var7[var59 + 1];
                  var2[var48 + 2] = var7[var66];
                  var2[var48 + 3] = var7[var66 + 1];
               }
            }
         }
      } else {
         for (int var22 = 0; var22 < this.field_16670; var22++) {
            int var27 = var22 * this.field_16663;

            for (byte var36 = 0; var36 < this.field_16659; var36 += 8) {
               for (int var38 = 0; var38 < this.field_16657; var38++) {
                  int var49 = var38 * this.field_16662 + var27 + var36;
                  int var60 = 2 * var38;
                  int var67 = 2 * this.field_16657 + 2 * var38;
                  int var70 = var67 + 2 * this.field_16657;
                  int var73 = var70 + 2 * this.field_16657;
                  var7[var60] = var2[var49];
                  var7[var60 + 1] = var2[var49 + 1];
                  var7[var67] = var2[var49 + 2];
                  var7[var67 + 1] = var2[var49 + 3];
                  var7[var70] = var2[var49 + 4];
                  var7[var70 + 1] = var2[var49 + 5];
                  var7[var73] = var2[var49 + 6];
                  var7[var73 + 1] = var2[var49 + 7];
               }

               this.field_16655.method_24186(var7, 0);
               this.field_16655.method_24186(var7, 2 * this.field_16657);
               this.field_16655.method_24186(var7, 4 * this.field_16657);
               this.field_16655.method_24186(var7, 6 * this.field_16657);

               for (int var39 = 0; var39 < this.field_16657; var39++) {
                  int var50 = var39 * this.field_16662 + var27 + var36;
                  int var61 = 2 * var39;
                  int var68 = 2 * this.field_16657 + 2 * var39;
                  int var71 = var68 + 2 * this.field_16657;
                  int var74 = var71 + 2 * this.field_16657;
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

   private void method_15600(int var1, class_4330 var2, boolean var3) {
      long var6 = this.field_16665;
      if (var6 < this.field_16667) {
         var6 = this.field_16667;
      }

      var6 *= 8L;
      if (this.field_16668 != 4L) {
         if (this.field_16668 < 4L) {
            var6 >>= 2;
         }
      } else {
         var6 >>= 1;
      }

      class_4330 var8 = new class_4330(var6);
      if (var1 != -1) {
         if (this.field_16668 <= 4L) {
            if (this.field_16668 != 4L) {
               if (this.field_16668 == 2L) {
                  for (long var9 = 0L; var9 < this.field_16667; var9++) {
                     long var11 = var9 * this.field_16669;

                     for (long var13 = 0L; var13 < this.field_16665; var13++) {
                        long var17 = var13 * this.field_16661 + var11;
                        long var19 = 2L * var13;
                        var8.method_36123(var19, var2.method_36133(var17));
                        var8.method_36123(var19 + 1L, var2.method_36133(var17 + 1L));
                     }

                     this.field_16655.method_24213(var8, 0L, var3);

                     for (long var38 = 0L; var38 < this.field_16665; var38++) {
                        long var50 = var38 * this.field_16661 + var11;
                        long var61 = 2L * var38;
                        var2.method_36123(var50, var8.method_36133(var61));
                        var2.method_36123(var50 + 1L, var8.method_36133(var61 + 1L));
                     }
                  }
               }
            } else {
               for (long var28 = 0L; var28 < this.field_16667; var28++) {
                  long var33 = var28 * this.field_16669;

                  for (long var39 = 0L; var39 < this.field_16665; var39++) {
                     long var51 = var39 * this.field_16661 + var33;
                     long var62 = 2L * var39;
                     long var21 = 2L * this.field_16665 + 2L * var39;
                     var8.method_36123(var62, var2.method_36133(var51));
                     var8.method_36123(var62 + 1L, var2.method_36133(var51 + 1L));
                     var8.method_36123(var21, var2.method_36133(var51 + 2L));
                     var8.method_36123(var21 + 1L, var2.method_36133(var51 + 3L));
                  }

                  this.field_16655.method_24213(var8, 0L, var3);
                  this.field_16655.method_24213(var8, 2L * this.field_16665, var3);

                  for (long var40 = 0L; var40 < this.field_16665; var40++) {
                     long var52 = var40 * this.field_16661 + var33;
                     long var63 = 2L * var40;
                     long var72 = 2L * this.field_16665 + 2L * var40;
                     var2.method_36123(var52, var8.method_36133(var63));
                     var2.method_36123(var52 + 1L, var8.method_36133(var63 + 1L));
                     var2.method_36123(var52 + 2L, var8.method_36133(var72));
                     var2.method_36123(var52 + 3L, var8.method_36133(var72 + 1L));
                  }
               }
            }
         } else {
            for (long var29 = 0L; var29 < this.field_16667; var29++) {
               long var34 = var29 * this.field_16669;

               for (long var41 = 0L; var41 < this.field_16668; var41 += 8L) {
                  for (long var15 = 0L; var15 < this.field_16665; var15++) {
                     long var53 = var15 * this.field_16661 + var34 + var41;
                     long var64 = 2L * var15;
                     long var73 = 2L * this.field_16665 + 2L * var15;
                     long var23 = var73 + 2L * this.field_16665;
                     long var25 = var23 + 2L * this.field_16665;
                     var8.method_36123(var64, var2.method_36133(var53));
                     var8.method_36123(var64 + 1L, var2.method_36133(var53 + 1L));
                     var8.method_36123(var73, var2.method_36133(var53 + 2L));
                     var8.method_36123(var73 + 1L, var2.method_36133(var53 + 3L));
                     var8.method_36123(var23, var2.method_36133(var53 + 4L));
                     var8.method_36123(var23 + 1L, var2.method_36133(var53 + 5L));
                     var8.method_36123(var25, var2.method_36133(var53 + 6L));
                     var8.method_36123(var25 + 1L, var2.method_36133(var53 + 7L));
                  }

                  this.field_16655.method_24213(var8, 0L, var3);
                  this.field_16655.method_24213(var8, 2L * this.field_16665, var3);
                  this.field_16655.method_24213(var8, 4L * this.field_16665, var3);
                  this.field_16655.method_24213(var8, 6L * this.field_16665, var3);

                  for (long var47 = 0L; var47 < this.field_16665; var47++) {
                     long var54 = var47 * this.field_16661 + var34 + var41;
                     long var65 = 2L * var47;
                     long var74 = 2L * this.field_16665 + 2L * var47;
                     long var79 = var74 + 2L * this.field_16665;
                     long var82 = var79 + 2L * this.field_16665;
                     var2.method_36123(var54, var8.method_36133(var65));
                     var2.method_36123(var54 + 1L, var8.method_36133(var65 + 1L));
                     var2.method_36123(var54 + 2L, var8.method_36133(var74));
                     var2.method_36123(var54 + 3L, var8.method_36133(var74 + 1L));
                     var2.method_36123(var54 + 4L, var8.method_36133(var79));
                     var2.method_36123(var54 + 5L, var8.method_36133(var79 + 1L));
                     var2.method_36123(var54 + 6L, var8.method_36133(var82));
                     var2.method_36123(var54 + 7L, var8.method_36133(var82 + 1L));
                  }
               }
            }
         }
      } else if (this.field_16668 <= 4L) {
         if (this.field_16668 != 4L) {
            if (this.field_16668 == 2L) {
               for (long var30 = 0L; var30 < this.field_16667; var30++) {
                  long var35 = var30 * this.field_16669;

                  for (long var42 = 0L; var42 < this.field_16665; var42++) {
                     long var55 = var42 * this.field_16661 + var35;
                     long var66 = 2L * var42;
                     var8.method_36123(var66, var2.method_36133(var55));
                     var8.method_36123(var66 + 1L, var2.method_36133(var55 + 1L));
                  }

                  this.field_16655.method_24184(var8, 0L);

                  for (long var43 = 0L; var43 < this.field_16665; var43++) {
                     long var56 = var43 * this.field_16661 + var35;
                     long var67 = 2L * var43;
                     var2.method_36123(var56, var8.method_36133(var67));
                     var2.method_36123(var56 + 1L, var8.method_36133(var67 + 1L));
                  }
               }
            }
         } else {
            for (long var31 = 0L; var31 < this.field_16667; var31++) {
               long var36 = var31 * this.field_16669;

               for (long var44 = 0L; var44 < this.field_16665; var44++) {
                  long var57 = var44 * this.field_16661 + var36;
                  long var68 = 2L * var44;
                  long var75 = 2L * this.field_16665 + 2L * var44;
                  var8.method_36123(var68, var2.method_36133(var57));
                  var8.method_36123(var68 + 1L, var2.method_36133(var57 + 1L));
                  var8.method_36123(var75, var2.method_36133(var57 + 2L));
                  var8.method_36123(var75 + 1L, var2.method_36133(var57 + 3L));
               }

               this.field_16655.method_24184(var8, 0L);
               this.field_16655.method_24184(var8, 2L * this.field_16665);

               for (long var45 = 0L; var45 < this.field_16665; var45++) {
                  long var58 = var45 * this.field_16661 + var36;
                  long var69 = 2L * var45;
                  long var76 = 2L * this.field_16665 + 2L * var45;
                  var2.method_36123(var58, var8.method_36133(var69));
                  var2.method_36123(var58 + 1L, var8.method_36133(var69 + 1L));
                  var2.method_36123(var58 + 2L, var8.method_36133(var76));
                  var2.method_36123(var58 + 3L, var8.method_36133(var76 + 1L));
               }
            }
         }
      } else {
         for (long var32 = 0L; var32 < this.field_16667; var32++) {
            long var37 = var32 * this.field_16669;

            for (long var46 = 0L; var46 < this.field_16668; var46 += 8L) {
               for (long var48 = 0L; var48 < this.field_16665; var48++) {
                  long var59 = var48 * this.field_16661 + var37 + var46;
                  long var70 = 2L * var48;
                  long var77 = 2L * this.field_16665 + 2L * var48;
                  long var80 = var77 + 2L * this.field_16665;
                  long var83 = var80 + 2L * this.field_16665;
                  var8.method_36123(var70, var2.method_36133(var59));
                  var8.method_36123(var70 + 1L, var2.method_36133(var59 + 1L));
                  var8.method_36123(var77, var2.method_36133(var59 + 2L));
                  var8.method_36123(var77 + 1L, var2.method_36133(var59 + 3L));
                  var8.method_36123(var80, var2.method_36133(var59 + 4L));
                  var8.method_36123(var80 + 1L, var2.method_36133(var59 + 5L));
                  var8.method_36123(var83, var2.method_36133(var59 + 6L));
                  var8.method_36123(var83 + 1L, var2.method_36133(var59 + 7L));
               }

               this.field_16655.method_24184(var8, 0L);
               this.field_16655.method_24184(var8, 2L * this.field_16665);
               this.field_16655.method_24184(var8, 4L * this.field_16665);
               this.field_16655.method_24184(var8, 6L * this.field_16665);

               for (long var49 = 0L; var49 < this.field_16665; var49++) {
                  long var60 = var49 * this.field_16661 + var37 + var46;
                  long var71 = 2L * var49;
                  long var78 = 2L * this.field_16665 + 2L * var49;
                  long var81 = var78 + 2L * this.field_16665;
                  long var84 = var81 + 2L * this.field_16665;
                  var2.method_36123(var60, var8.method_36133(var71));
                  var2.method_36123(var60 + 1L, var8.method_36133(var71 + 1L));
                  var2.method_36123(var60 + 2L, var8.method_36133(var78));
                  var2.method_36123(var60 + 3L, var8.method_36133(var78 + 1L));
                  var2.method_36123(var60 + 4L, var8.method_36133(var81));
                  var2.method_36123(var60 + 5L, var8.method_36133(var81 + 1L));
                  var2.method_36123(var60 + 6L, var8.method_36133(var84));
                  var2.method_36123(var60 + 7L, var8.method_36133(var84 + 1L));
               }
            }
         }
      }
   }

   private void method_15602(int var1, float[][][] var2, boolean var3) {
      int var6 = this.field_16657;
      if (var6 < this.field_16670) {
         var6 = this.field_16670;
      }

      var6 *= 8;
      if (this.field_16659 != 4) {
         if (this.field_16659 < 4) {
            var6 >>= 2;
         }
      } else {
         var6 >>= 1;
      }

      float[] var7 = new float[var6];
      if (var1 != -1) {
         if (this.field_16659 <= 4) {
            if (this.field_16659 != 4) {
               if (this.field_16659 == 2) {
                  for (int var8 = 0; var8 < this.field_16670; var8++) {
                     for (int var9 = 0; var9 < this.field_16657; var9++) {
                        int var11 = 2 * var9;
                        var7[var11] = var2[var9][var8][0];
                        var7[var11 + 1] = var2[var9][var8][1];
                     }

                     this.field_16655.method_24215(var7, 0, var3);

                     for (int var21 = 0; var21 < this.field_16657; var21++) {
                        int var33 = 2 * var21;
                        var2[var21][var8][0] = var7[var33];
                        var2[var21][var8][1] = var7[var33 + 1];
                     }
                  }
               }
            } else {
               for (int var16 = 0; var16 < this.field_16670; var16++) {
                  for (int var22 = 0; var22 < this.field_16657; var22++) {
                     int var34 = 2 * var22;
                     int var12 = 2 * this.field_16657 + 2 * var22;
                     var7[var34] = var2[var22][var16][0];
                     var7[var34 + 1] = var2[var22][var16][1];
                     var7[var12] = var2[var22][var16][2];
                     var7[var12 + 1] = var2[var22][var16][3];
                  }

                  this.field_16655.method_24215(var7, 0, var3);
                  this.field_16655.method_24215(var7, 2 * this.field_16657, var3);

                  for (int var23 = 0; var23 < this.field_16657; var23++) {
                     int var35 = 2 * var23;
                     int var44 = 2 * this.field_16657 + 2 * var23;
                     var2[var23][var16][0] = var7[var35];
                     var2[var23][var16][1] = var7[var35 + 1];
                     var2[var23][var16][2] = var7[var44];
                     var2[var23][var16][3] = var7[var44 + 1];
                  }
               }
            }
         } else {
            for (int var17 = 0; var17 < this.field_16670; var17++) {
               for (byte var24 = 0; var24 < this.field_16659; var24 += 8) {
                  for (int var10 = 0; var10 < this.field_16657; var10++) {
                     int var36 = 2 * var10;
                     int var45 = 2 * this.field_16657 + 2 * var10;
                     int var13 = var45 + 2 * this.field_16657;
                     int var14 = var13 + 2 * this.field_16657;
                     var7[var36] = var2[var10][var17][var24];
                     var7[var36 + 1] = var2[var10][var17][var24 + 1];
                     var7[var45] = var2[var10][var17][var24 + 2];
                     var7[var45 + 1] = var2[var10][var17][var24 + 3];
                     var7[var13] = var2[var10][var17][var24 + 4];
                     var7[var13 + 1] = var2[var10][var17][var24 + 5];
                     var7[var14] = var2[var10][var17][var24 + 6];
                     var7[var14 + 1] = var2[var10][var17][var24 + 7];
                  }

                  this.field_16655.method_24215(var7, 0, var3);
                  this.field_16655.method_24215(var7, 2 * this.field_16657, var3);
                  this.field_16655.method_24215(var7, 4 * this.field_16657, var3);
                  this.field_16655.method_24215(var7, 6 * this.field_16657, var3);

                  for (int var30 = 0; var30 < this.field_16657; var30++) {
                     int var37 = 2 * var30;
                     int var46 = 2 * this.field_16657 + 2 * var30;
                     int var51 = var46 + 2 * this.field_16657;
                     int var54 = var51 + 2 * this.field_16657;
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
      } else if (this.field_16659 <= 4) {
         if (this.field_16659 != 4) {
            if (this.field_16659 == 2) {
               for (int var18 = 0; var18 < this.field_16670; var18++) {
                  for (int var25 = 0; var25 < this.field_16657; var25++) {
                     int var38 = 2 * var25;
                     var7[var38] = var2[var25][var18][0];
                     var7[var38 + 1] = var2[var25][var18][1];
                  }

                  this.field_16655.method_24186(var7, 0);

                  for (int var26 = 0; var26 < this.field_16657; var26++) {
                     int var39 = 2 * var26;
                     var2[var26][var18][0] = var7[var39];
                     var2[var26][var18][1] = var7[var39 + 1];
                  }
               }
            }
         } else {
            for (int var19 = 0; var19 < this.field_16670; var19++) {
               for (int var27 = 0; var27 < this.field_16657; var27++) {
                  int var40 = 2 * var27;
                  int var47 = 2 * this.field_16657 + 2 * var27;
                  var7[var40] = var2[var27][var19][0];
                  var7[var40 + 1] = var2[var27][var19][1];
                  var7[var47] = var2[var27][var19][2];
                  var7[var47 + 1] = var2[var27][var19][3];
               }

               this.field_16655.method_24186(var7, 0);
               this.field_16655.method_24186(var7, 2 * this.field_16657);

               for (int var28 = 0; var28 < this.field_16657; var28++) {
                  int var41 = 2 * var28;
                  int var48 = 2 * this.field_16657 + 2 * var28;
                  var2[var28][var19][0] = var7[var41];
                  var2[var28][var19][1] = var7[var41 + 1];
                  var2[var28][var19][2] = var7[var48];
                  var2[var28][var19][3] = var7[var48 + 1];
               }
            }
         }
      } else {
         for (int var20 = 0; var20 < this.field_16670; var20++) {
            for (byte var29 = 0; var29 < this.field_16659; var29 += 8) {
               for (int var31 = 0; var31 < this.field_16657; var31++) {
                  int var42 = 2 * var31;
                  int var49 = 2 * this.field_16657 + 2 * var31;
                  int var52 = var49 + 2 * this.field_16657;
                  int var55 = var52 + 2 * this.field_16657;
                  var7[var42] = var2[var31][var20][var29];
                  var7[var42 + 1] = var2[var31][var20][var29 + 1];
                  var7[var49] = var2[var31][var20][var29 + 2];
                  var7[var49 + 1] = var2[var31][var20][var29 + 3];
                  var7[var52] = var2[var31][var20][var29 + 4];
                  var7[var52 + 1] = var2[var31][var20][var29 + 5];
                  var7[var55] = var2[var31][var20][var29 + 6];
                  var7[var55 + 1] = var2[var31][var20][var29 + 7];
               }

               this.field_16655.method_24186(var7, 0);
               this.field_16655.method_24186(var7, 2 * this.field_16657);
               this.field_16655.method_24186(var7, 4 * this.field_16657);
               this.field_16655.method_24186(var7, 6 * this.field_16657);

               for (int var32 = 0; var32 < this.field_16657; var32++) {
                  int var43 = 2 * var32;
                  int var50 = 2 * this.field_16657 + 2 * var32;
                  int var53 = var50 + 2 * this.field_16657;
                  int var56 = var53 + 2 * this.field_16657;
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

   private void method_15595(int var1, int var2, float[] var3, boolean var4) {
      int var7 = class_6806.method_31195(class_1266.method_5693(), this.field_16657);
      int var8 = this.field_16657;
      if (var8 < this.field_16670) {
         var8 = this.field_16670;
      }

      var8 *= 8;
      if (this.field_16659 == 4) {
         var8 >>= 1;
      } else if (this.field_16659 < 4) {
         var8 >>= 2;
      }

      int var9 = var8;
      Future[] var10 = new Future[var7];

      for (int var11 = 0; var11 < var7; var11++) {
         var10[var11] = class_1266.method_5694(new class_8288(this, var9, var2, var11, var7, var1, var3, var4));
      }

      try {
         class_1266.method_5696(var10);
      } catch (InterruptedException var13) {
         Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var13);
      } catch (ExecutionException var14) {
         Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var14);
      }
   }

   private void method_15597(long var1, int var3, class_4330 var4, boolean var5) {
      int var8 = (int)class_6806.method_31196((long)class_1266.method_5693(), this.field_16665);
      long var9 = this.field_16665;
      if (var9 < this.field_16667) {
         var9 = this.field_16667;
      }

      var9 *= 8L;
      if (this.field_16668 == 4L) {
         var9 >>= 1;
      } else if (this.field_16668 < 4L) {
         var9 >>= 2;
      }

      long var11 = var9;
      Future[] var13 = new Future[var8];

      for (int var14 = 0; var14 < var8; var14++) {
         long var15 = (long)var14;
         var13[var14] = class_1266.method_5694(new class_5725(this, var11, var3, var15, var8, var1, var4, var5));
      }

      try {
         class_1266.method_5696(var13);
      } catch (InterruptedException var18) {
         Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var18);
      } catch (ExecutionException var19) {
         Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var19);
      }
   }

   private void method_15620(int var1, int var2, float[] var3, boolean var4) {
      int var7 = class_6806.method_31195(class_1266.method_5693(), this.field_16657);
      int var8 = this.field_16657;
      if (var8 < this.field_16670) {
         var8 = this.field_16670;
      }

      var8 *= 8;
      if (this.field_16659 == 4) {
         var8 >>= 1;
      } else if (this.field_16659 < 4) {
         var8 >>= 2;
      }

      int var9 = var8;
      Future[] var10 = new Future[var7];

      for (int var11 = 0; var11 < var7; var11++) {
         var10[var11] = class_1266.method_5694(new class_8687(this, var9, var2, var11, var7, var1, var3, var4));
      }

      try {
         class_1266.method_5696(var10);
      } catch (InterruptedException var13) {
         Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var13);
      } catch (ExecutionException var14) {
         Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var14);
      }
   }

   private void method_15622(long var1, int var3, class_4330 var4, boolean var5) {
      int var8 = (int)class_6806.method_31196((long)class_1266.method_5693(), this.field_16665);
      long var9 = this.field_16665;
      if (var9 < this.field_16667) {
         var9 = this.field_16667;
      }

      var9 *= 8L;
      if (this.field_16668 == 4L) {
         var9 >>= 1;
      } else if (this.field_16668 < 4L) {
         var9 >>= 2;
      }

      long var11 = var9;
      Future[] var13 = new Future[var8];

      for (int var14 = 0; var14 < var8; var14++) {
         long var15 = (long)var14;
         var13[var14] = class_1266.method_5694(new class_1524(this, var11, var3, var15, var8, var1, var4, var5));
      }

      try {
         class_1266.method_5696(var13);
      } catch (InterruptedException var18) {
         Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var18);
      } catch (ExecutionException var19) {
         Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var19);
      }
   }

   private void method_15596(int var1, int var2, float[][][] var3, boolean var4) {
      int var7 = class_6806.method_31195(class_1266.method_5693(), this.field_16657);
      int var8 = this.field_16657;
      if (var8 < this.field_16670) {
         var8 = this.field_16670;
      }

      var8 *= 8;
      if (this.field_16659 == 4) {
         var8 >>= 1;
      } else if (this.field_16659 < 4) {
         var8 >>= 2;
      }

      int var9 = var8;
      Future[] var10 = new Future[var7];

      for (int var11 = 0; var11 < var7; var11++) {
         var10[var11] = class_1266.method_5694(new class_3863(this, var9, var2, var11, var7, var1, var3, var4));
      }

      try {
         class_1266.method_5696(var10);
      } catch (InterruptedException var13) {
         Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var13);
      } catch (ExecutionException var14) {
         Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var14);
      }
   }

   private void method_15621(int var1, int var2, float[][][] var3, boolean var4) {
      int var7 = class_6806.method_31195(class_1266.method_5693(), this.field_16657);
      int var8 = this.field_16657;
      if (var8 < this.field_16670) {
         var8 = this.field_16670;
      }

      var8 *= 8;
      if (this.field_16659 == 4) {
         var8 >>= 1;
      } else if (this.field_16659 < 4) {
         var8 >>= 2;
      }

      int var9 = var8;
      Future[] var10 = new Future[var7];

      for (int var11 = 0; var11 < var7; var11++) {
         var10[var11] = class_1266.method_5694(new class_1781(this, var9, var2, var11, var7, var1, var3, var4));
      }

      try {
         class_1266.method_5696(var10);
      } catch (InterruptedException var13) {
         Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var13);
      } catch (ExecutionException var14) {
         Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var14);
      }
   }

   private void method_15618(int var1, float[] var2, boolean var3) {
      int var6 = class_6806.method_31195(class_1266.method_5693(), this.field_16670);
      int var7 = this.field_16657;
      if (var7 < this.field_16670) {
         var7 = this.field_16670;
      }

      var7 *= 8;
      if (this.field_16659 == 4) {
         var7 >>= 1;
      } else if (this.field_16659 < 4) {
         var7 >>= 2;
      }

      int var8 = var7;
      Future[] var9 = new Future[var6];

      for (int var10 = 0; var10 < var6; var10++) {
         var9[var10] = class_1266.method_5694(new class_3285(this, var8, var1, var10, var6, var2, var3));
      }

      try {
         class_1266.method_5696(var9);
      } catch (InterruptedException var12) {
         Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var12);
      } catch (ExecutionException var13) {
         Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var13);
      }
   }

   private void method_15617(int var1, class_4330 var2, boolean var3) {
      int var6 = (int)class_6806.method_31196((long)class_1266.method_5693(), this.field_16667);
      long var7 = this.field_16665;
      if (var7 < this.field_16667) {
         var7 = this.field_16667;
      }

      var7 *= 8L;
      if (this.field_16668 == 4L) {
         var7 >>= 1;
      } else if (this.field_16668 < 4L) {
         var7 >>= 2;
      }

      long var9 = var7;
      Future[] var11 = new Future[var6];

      for (int var12 = 0; var12 < var6; var12++) {
         long var13 = (long)var12;
         var11[var12] = class_1266.method_5694(new class_7336(this, var9, var1, var13, var6, var2, var3));
      }

      try {
         class_1266.method_5696(var11);
      } catch (InterruptedException var16) {
         Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var16);
      } catch (ExecutionException var17) {
         Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var17);
      }
   }

   private void method_15619(int var1, float[][][] var2, boolean var3) {
      int var6 = class_6806.method_31195(class_1266.method_5693(), this.field_16670);
      int var7 = this.field_16657;
      if (var7 < this.field_16670) {
         var7 = this.field_16670;
      }

      var7 *= 8;
      if (this.field_16659 == 4) {
         var7 >>= 1;
      } else if (this.field_16659 < 4) {
         var7 >>= 2;
      }

      int var8 = var7;
      Future[] var9 = new Future[var6];

      for (int var10 = 0; var10 < var6; var10++) {
         var9[var10] = class_1266.method_5694(new class_7724(this, var8, var1, var10, var6, var2, var3));
      }

      try {
         class_1266.method_5696(var9);
      } catch (InterruptedException var12) {
         Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var12);
      } catch (ExecutionException var13) {
         Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var13);
      }
   }

   private void method_15587(int var1, float[] var2) {
      int var5 = this.field_16657 >> 1;
      int var6 = this.field_16670 >> 1;
      if (var1 >= 0) {
         for (int var7 = 1; var7 < var5; var7++) {
            int var9 = this.field_16657 - var7;
            int var10 = var9 * this.field_16662;
            int var11 = var7 * this.field_16662;
            var2[var10] = 0.5F * (var2[var11] - var2[var10]);
            var2[var11] -= var2[var10];
            var2[var10 + 1] = 0.5F * (var2[var11 + 1] + var2[var10 + 1]);
            var2[var11 + 1] = var2[var11 + 1] - var2[var10 + 1];
            int var12 = var9 * this.field_16662 + var6 * this.field_16663;
            int var13 = var7 * this.field_16662 + var6 * this.field_16663;
            var2[var12] = 0.5F * (var2[var13] - var2[var12]);
            var2[var13] -= var2[var12];
            var2[var12 + 1] = 0.5F * (var2[var13 + 1] + var2[var12 + 1]);
            var2[var13 + 1] = var2[var13 + 1] - var2[var12 + 1];

            for (int var8 = 1; var8 < var6; var8++) {
               int var15 = this.field_16670 - var8;
               var10 = var9 * this.field_16662 + var15 * this.field_16663;
               var11 = var7 * this.field_16662 + var8 * this.field_16663;
               var2[var10] = 0.5F * (var2[var11] - var2[var10]);
               var2[var11] -= var2[var10];
               var2[var10 + 1] = 0.5F * (var2[var11 + 1] + var2[var10 + 1]);
               var2[var11 + 1] = var2[var11 + 1] - var2[var10 + 1];
               var12 = var7 * this.field_16662 + var15 * this.field_16663;
               var13 = var9 * this.field_16662 + var8 * this.field_16663;
               var2[var12] = 0.5F * (var2[var13] - var2[var12]);
               var2[var13] -= var2[var12];
               var2[var12 + 1] = 0.5F * (var2[var13 + 1] + var2[var12 + 1]);
               var2[var13 + 1] = var2[var13 + 1] - var2[var12 + 1];
            }
         }

         for (int var17 = 1; var17 < var6; var17++) {
            int var52 = this.field_16670 - var17;
            int var22 = var52 * this.field_16663;
            int var27 = var17 * this.field_16663;
            var2[var22] = 0.5F * (var2[var27] - var2[var22]);
            var2[var27] -= var2[var22];
            var2[var22 + 1] = 0.5F * (var2[var27 + 1] + var2[var22 + 1]);
            var2[var27 + 1] = var2[var27 + 1] - var2[var22 + 1];
            int var32 = var5 * this.field_16662 + var52 * this.field_16663;
            int var37 = var5 * this.field_16662 + var17 * this.field_16663;
            var2[var32] = 0.5F * (var2[var37] - var2[var32]);
            var2[var37] -= var2[var32];
            var2[var32 + 1] = 0.5F * (var2[var37 + 1] + var2[var32 + 1]);
            var2[var37 + 1] = var2[var37 + 1] - var2[var32 + 1];
         }
      } else {
         for (int var16 = 1; var16 < var5; var16++) {
            int var20 = this.field_16657 - var16;
            int var23 = var16 * this.field_16662;
            int var28 = var20 * this.field_16662;
            int var33 = var16 * this.field_16662 + var6 * this.field_16663;
            int var38 = var20 * this.field_16662 + var6 * this.field_16663;
            float var14 = var2[var23] - var2[var28];
            var2[var23] += var2[var28];
            var2[var28] = var14;
            var14 = var2[var28 + 1] - var2[var23 + 1];
            var2[var23 + 1] = var2[var23 + 1] + var2[var28 + 1];
            var2[var28 + 1] = var14;
            var14 = var2[var33] - var2[var38];
            var2[var33] += var2[var38];
            var2[var38] = var14;
            var14 = var2[var38 + 1] - var2[var33 + 1];
            var2[var33 + 1] = var2[var33 + 1] + var2[var38 + 1];
            var2[var38 + 1] = var14;

            for (int var18 = 1; var18 < var6; var18++) {
               int var53 = this.field_16670 - var18;
               var23 = var16 * this.field_16662 + var18 * this.field_16663;
               var28 = var20 * this.field_16662 + var53 * this.field_16663;
               var14 = var2[var23] - var2[var28];
               var2[var23] += var2[var28];
               var2[var28] = var14;
               var14 = var2[var28 + 1] - var2[var23 + 1];
               var2[var23 + 1] = var2[var23 + 1] + var2[var28 + 1];
               var2[var28 + 1] = var14;
               var33 = var20 * this.field_16662 + var18 * this.field_16663;
               var38 = var16 * this.field_16662 + var53 * this.field_16663;
               var14 = var2[var33] - var2[var38];
               var2[var33] += var2[var38];
               var2[var38] = var14;
               var14 = var2[var38 + 1] - var2[var33 + 1];
               var2[var33 + 1] = var2[var33 + 1] + var2[var38 + 1];
               var2[var38 + 1] = var14;
            }
         }

         for (int var19 = 1; var19 < var6; var19++) {
            int var54 = this.field_16670 - var19;
            int var25 = var19 * this.field_16663;
            int var30 = var54 * this.field_16663;
            float var48 = var2[var25] - var2[var30];
            var2[var25] += var2[var30];
            var2[var30] = var48;
            var48 = var2[var30 + 1] - var2[var25 + 1];
            var2[var25 + 1] = var2[var25 + 1] + var2[var30 + 1];
            var2[var30 + 1] = var48;
            int var35 = var5 * this.field_16662 + var19 * this.field_16663;
            int var40 = var5 * this.field_16662 + var54 * this.field_16663;
            var48 = var2[var35] - var2[var40];
            var2[var35] += var2[var40];
            var2[var40] = var48;
            var48 = var2[var40 + 1] - var2[var35 + 1];
            var2[var35 + 1] = var2[var35 + 1] + var2[var40 + 1];
            var2[var40 + 1] = var48;
         }
      }
   }

   private void method_15586(int var1, class_4330 var2) {
      long var5 = this.field_16665 >> 1;
      long var7 = this.field_16667 >> 1;
      if (var1 >= 0) {
         for (long var9 = 1L; var9 < var5; var9++) {
            long var13 = this.field_16665 - var9;
            long var15 = var13 * this.field_16661;
            long var17 = var9 * this.field_16661;
            var2.method_36123(var15, 0.5F * (var2.method_36133(var17) - var2.method_36133(var15)));
            var2.method_36123(var17, var2.method_36133(var17) - var2.method_36133(var15));
            var2.method_36123(var15 + 1L, 0.5F * (var2.method_36133(var17 + 1L) + var2.method_36133(var15 + 1L)));
            var2.method_36123(var17 + 1L, var2.method_36133(var17 + 1L) - var2.method_36133(var15 + 1L));
            long var19 = var13 * this.field_16661 + var7 * this.field_16669;
            long var21 = var9 * this.field_16661 + var7 * this.field_16669;
            var2.method_36123(var19, 0.5F * (var2.method_36133(var21) - var2.method_36133(var19)));
            var2.method_36123(var21, var2.method_36133(var21) - var2.method_36133(var19));
            var2.method_36123(var19 + 1L, 0.5F * (var2.method_36133(var21 + 1L) + var2.method_36133(var19 + 1L)));
            var2.method_36123(var21 + 1L, var2.method_36133(var21 + 1L) - var2.method_36133(var19 + 1L));

            for (long var11 = 1L; var11 < var7; var11++) {
               long var24 = this.field_16667 - var11;
               var15 = var13 * this.field_16661 + var24 * this.field_16669;
               var17 = var9 * this.field_16661 + var11 * this.field_16669;
               var2.method_36123(var15, 0.5F * (var2.method_36133(var17) - var2.method_36133(var15)));
               var2.method_36123(var17, var2.method_36133(var17) - var2.method_36133(var15));
               var2.method_36123(var15 + 1L, 0.5F * (var2.method_36133(var17 + 1L) + var2.method_36133(var15 + 1L)));
               var2.method_36123(var17 + 1L, var2.method_36133(var17 + 1L) - var2.method_36133(var15 + 1L));
               var19 = var9 * this.field_16661 + var24 * this.field_16669;
               var21 = var13 * this.field_16661 + var11 * this.field_16669;
               var2.method_36123(var19, 0.5F * (var2.method_36133(var21) - var2.method_36133(var19)));
               var2.method_36123(var21, var2.method_36133(var21) - var2.method_36133(var19));
               var2.method_36123(var19 + 1L, 0.5F * (var2.method_36133(var21 + 1L) + var2.method_36133(var19 + 1L)));
               var2.method_36123(var21 + 1L, var2.method_36133(var21 + 1L) - var2.method_36133(var19 + 1L));
            }
         }

         for (long var27 = 1L; var27 < var7; var27++) {
            long var62 = this.field_16667 - var27;
            long var32 = var62 * this.field_16669;
            long var37 = var27 * this.field_16669;
            var2.method_36123(var32, 0.5F * (var2.method_36133(var37) - var2.method_36133(var32)));
            var2.method_36123(var37, var2.method_36133(var37) - var2.method_36133(var32));
            var2.method_36123(var32 + 1L, 0.5F * (var2.method_36133(var37 + 1L) + var2.method_36133(var32 + 1L)));
            var2.method_36123(var37 + 1L, var2.method_36133(var37 + 1L) - var2.method_36133(var32 + 1L));
            long var42 = var5 * this.field_16661 + var62 * this.field_16669;
            long var47 = var5 * this.field_16661 + var27 * this.field_16669;
            var2.method_36123(var42, 0.5F * (var2.method_36133(var47) - var2.method_36133(var42)));
            var2.method_36123(var47, var2.method_36133(var47) - var2.method_36133(var42));
            var2.method_36123(var42 + 1L, 0.5F * (var2.method_36133(var47 + 1L) + var2.method_36133(var42 + 1L)));
            var2.method_36123(var47 + 1L, var2.method_36133(var47 + 1L) - var2.method_36133(var42 + 1L));
         }
      } else {
         for (long var26 = 1L; var26 < var5; var26++) {
            long var30 = this.field_16665 - var26;
            long var33 = var26 * this.field_16661;
            long var38 = var30 * this.field_16661;
            long var43 = var26 * this.field_16661 + var7 * this.field_16669;
            long var48 = var30 * this.field_16661 + var7 * this.field_16669;
            float var23 = var2.method_36133(var33) - var2.method_36133(var38);
            var2.method_36123(var33, var2.method_36133(var33) + var2.method_36133(var38));
            var2.method_36123(var38, var23);
            var23 = var2.method_36133(var38 + 1L) - var2.method_36133(var33 + 1L);
            var2.method_36123(var33 + 1L, var2.method_36133(var33 + 1L) + var2.method_36133(var38 + 1L));
            var2.method_36123(var38 + 1L, var23);
            var23 = var2.method_36133(var43) - var2.method_36133(var48);
            var2.method_36123(var43, var2.method_36133(var43) + var2.method_36133(var48));
            var2.method_36123(var48, var23);
            var23 = var2.method_36133(var48 + 1L) - var2.method_36133(var43 + 1L);
            var2.method_36123(var43 + 1L, var2.method_36133(var43 + 1L) + var2.method_36133(var48 + 1L));
            var2.method_36123(var48 + 1L, var23);

            for (long var28 = 1L; var28 < var7; var28++) {
               long var63 = this.field_16667 - var28;
               var33 = var26 * this.field_16661 + var28 * this.field_16669;
               var38 = var30 * this.field_16661 + var63 * this.field_16669;
               var23 = var2.method_36133(var33) - var2.method_36133(var38);
               var2.method_36123(var33, var2.method_36133(var33) + var2.method_36133(var38));
               var2.method_36123(var38, var23);
               var23 = var2.method_36133(var38 + 1L) - var2.method_36133(var33 + 1L);
               var2.method_36123(var33 + 1L, var2.method_36133(var33 + 1L) + var2.method_36133(var38 + 1L));
               var2.method_36123(var38 + 1L, var23);
               var43 = var30 * this.field_16661 + var28 * this.field_16669;
               var48 = var26 * this.field_16661 + var63 * this.field_16669;
               var23 = var2.method_36133(var43) - var2.method_36133(var48);
               var2.method_36123(var43, var2.method_36133(var43) + var2.method_36133(var48));
               var2.method_36123(var48, var23);
               var23 = var2.method_36133(var48 + 1L) - var2.method_36133(var43 + 1L);
               var2.method_36123(var43 + 1L, var2.method_36133(var43 + 1L) + var2.method_36133(var48 + 1L));
               var2.method_36123(var48 + 1L, var23);
            }
         }

         for (long var29 = 1L; var29 < var7; var29++) {
            long var64 = this.field_16667 - var29;
            long var35 = var29 * this.field_16669;
            long var40 = var64 * this.field_16669;
            float var58 = var2.method_36133(var35) - var2.method_36133(var40);
            var2.method_36123(var35, var2.method_36133(var35) + var2.method_36133(var40));
            var2.method_36123(var40, var58);
            var58 = var2.method_36133(var40 + 1L) - var2.method_36133(var35 + 1L);
            var2.method_36123(var35 + 1L, var2.method_36133(var35 + 1L) + var2.method_36133(var40 + 1L));
            var2.method_36123(var40 + 1L, var58);
            long var45 = var5 * this.field_16661 + var29 * this.field_16669;
            long var50 = var5 * this.field_16661 + var64 * this.field_16669;
            var58 = var2.method_36133(var45) - var2.method_36133(var50);
            var2.method_36123(var45, var2.method_36133(var45) + var2.method_36133(var50));
            var2.method_36123(var50, var58);
            var58 = var2.method_36133(var50 + 1L) - var2.method_36133(var45 + 1L);
            var2.method_36123(var45 + 1L, var2.method_36133(var45 + 1L) + var2.method_36133(var50 + 1L));
            var2.method_36123(var50 + 1L, var58);
         }
      }
   }

   private void method_15588(int var1, float[][][] var2) {
      int var5 = this.field_16657 >> 1;
      int var6 = this.field_16670 >> 1;
      if (var1 >= 0) {
         for (int var7 = 1; var7 < var5; var7++) {
            int var9 = this.field_16657 - var7;
            var2[var9][0][0] = 0.5F * (var2[var7][0][0] - var2[var9][0][0]);
            var2[var7][0][0] = var2[var7][0][0] - var2[var9][0][0];
            var2[var9][0][1] = 0.5F * (var2[var7][0][1] + var2[var9][0][1]);
            var2[var7][0][1] = var2[var7][0][1] - var2[var9][0][1];
            var2[var9][var6][0] = 0.5F * (var2[var7][var6][0] - var2[var9][var6][0]);
            var2[var7][var6][0] = var2[var7][var6][0] - var2[var9][var6][0];
            var2[var9][var6][1] = 0.5F * (var2[var7][var6][1] + var2[var9][var6][1]);
            var2[var7][var6][1] = var2[var7][var6][1] - var2[var9][var6][1];

            for (int var8 = 1; var8 < var6; var8++) {
               int var11 = this.field_16670 - var8;
               var2[var9][var11][0] = 0.5F * (var2[var7][var8][0] - var2[var9][var11][0]);
               var2[var7][var8][0] = var2[var7][var8][0] - var2[var9][var11][0];
               var2[var9][var11][1] = 0.5F * (var2[var7][var8][1] + var2[var9][var11][1]);
               var2[var7][var8][1] = var2[var7][var8][1] - var2[var9][var11][1];
               var2[var7][var11][0] = 0.5F * (var2[var9][var8][0] - var2[var7][var11][0]);
               var2[var9][var8][0] = var2[var9][var8][0] - var2[var7][var11][0];
               var2[var7][var11][1] = 0.5F * (var2[var9][var8][1] + var2[var7][var11][1]);
               var2[var9][var8][1] = var2[var9][var8][1] - var2[var7][var11][1];
            }
         }

         for (int var13 = 1; var13 < var6; var13++) {
            int var28 = this.field_16670 - var13;
            var2[0][var28][0] = 0.5F * (var2[0][var13][0] - var2[0][var28][0]);
            var2[0][var13][0] = var2[0][var13][0] - var2[0][var28][0];
            var2[0][var28][1] = 0.5F * (var2[0][var13][1] + var2[0][var28][1]);
            var2[0][var13][1] = var2[0][var13][1] - var2[0][var28][1];
            var2[var5][var28][0] = 0.5F * (var2[var5][var13][0] - var2[var5][var28][0]);
            var2[var5][var13][0] = var2[var5][var13][0] - var2[var5][var28][0];
            var2[var5][var28][1] = 0.5F * (var2[var5][var13][1] + var2[var5][var28][1]);
            var2[var5][var13][1] = var2[var5][var13][1] - var2[var5][var28][1];
         }
      } else {
         for (int var12 = 1; var12 < var5; var12++) {
            int var16 = this.field_16657 - var12;
            float var10 = var2[var12][0][0] - var2[var16][0][0];
            var2[var12][0][0] = var2[var12][0][0] + var2[var16][0][0];
            var2[var16][0][0] = var10;
            var10 = var2[var16][0][1] - var2[var12][0][1];
            var2[var12][0][1] = var2[var12][0][1] + var2[var16][0][1];
            var2[var16][0][1] = var10;
            var10 = var2[var12][var6][0] - var2[var16][var6][0];
            var2[var12][var6][0] = var2[var12][var6][0] + var2[var16][var6][0];
            var2[var16][var6][0] = var10;
            var10 = var2[var16][var6][1] - var2[var12][var6][1];
            var2[var12][var6][1] = var2[var12][var6][1] + var2[var16][var6][1];
            var2[var16][var6][1] = var10;

            for (int var14 = 1; var14 < var6; var14++) {
               int var29 = this.field_16670 - var14;
               var10 = var2[var12][var14][0] - var2[var16][var29][0];
               var2[var12][var14][0] = var2[var12][var14][0] + var2[var16][var29][0];
               var2[var16][var29][0] = var10;
               var10 = var2[var16][var29][1] - var2[var12][var14][1];
               var2[var12][var14][1] = var2[var12][var14][1] + var2[var16][var29][1];
               var2[var16][var29][1] = var10;
               var10 = var2[var16][var14][0] - var2[var12][var29][0];
               var2[var16][var14][0] = var2[var16][var14][0] + var2[var12][var29][0];
               var2[var12][var29][0] = var10;
               var10 = var2[var12][var29][1] - var2[var16][var14][1];
               var2[var16][var14][1] = var2[var16][var14][1] + var2[var12][var29][1];
               var2[var12][var29][1] = var10;
            }
         }

         for (int var15 = 1; var15 < var6; var15++) {
            int var30 = this.field_16670 - var15;
            float var24 = var2[0][var15][0] - var2[0][var30][0];
            var2[0][var15][0] = var2[0][var15][0] + var2[0][var30][0];
            var2[0][var30][0] = var24;
            var24 = var2[0][var30][1] - var2[0][var15][1];
            var2[0][var15][1] = var2[0][var15][1] + var2[0][var30][1];
            var2[0][var30][1] = var24;
            var24 = var2[var5][var15][0] - var2[var5][var30][0];
            var2[var5][var15][0] = var2[var5][var15][0] + var2[var5][var30][0];
            var2[var5][var30][0] = var24;
            var24 = var2[var5][var30][1] - var2[var5][var15][1];
            var2[var5][var15][1] = var2[var5][var15][1] + var2[var5][var30][1];
            var2[var5][var30][1] = var24;
         }
      }
   }

   private void method_15642(float[][][] var1) {
      int var4 = 2 * this.field_16659;
      int var5 = this.field_16670 / 2;
      int var6 = this.field_16657 / 2;
      int var7 = class_1266.method_5693();
      if (var7 > 1 && this.field_16660 && this.field_16657 >= var7) {
         Future[] var22 = new Future[var7];
         int var26 = this.field_16657 / var7;

         for (int var30 = 0; var30 < var7; var30++) {
            int var35 = var30 * var26;
            int var38 = var30 == var7 - 1 ? this.field_16657 : var35 + var26;
            var22[var30] = class_1266.method_5694(new class_8322(this, var35, var38, var4, var1));
         }

         try {
            class_1266.method_5696(var22);
         } catch (InterruptedException var18) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var18);
         } catch (ExecutionException var19) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var19);
         }

         for (int var31 = 0; var31 < var7; var31++) {
            int var36 = var31 * var26;
            int var39 = var31 == var7 - 1 ? this.field_16657 : var36 + var26;
            var22[var31] = class_1266.method_5694(new class_7561(this, var36, var39, var5, var1));
         }

         try {
            class_1266.method_5696(var22);
         } catch (InterruptedException var16) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var16);
         } catch (ExecutionException var17) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var17);
         }

         for (int var32 = 0; var32 < var7; var32++) {
            int var37 = var32 * var26;
            int var40 = var32 == var7 - 1 ? this.field_16657 : var37 + var26;
            var22[var32] = class_1266.method_5694(new class_5509(this, var37, var40, var5, var1));
         }

         try {
            class_1266.method_5696(var22);
         } catch (InterruptedException var14) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var14);
         } catch (ExecutionException var15) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var15);
         }
      } else {
         for (int var8 = 0; var8 < this.field_16657; var8++) {
            int var9 = (this.field_16657 - var8) % this.field_16657;

            for (int var10 = 0; var10 < this.field_16670; var10++) {
               int var11 = (this.field_16670 - var10) % this.field_16670;

               for (byte var12 = 1; var12 < this.field_16659; var12 += 2) {
                  int var13 = var4 - var12;
                  var1[var9][var11][var13] = -var1[var8][var10][var12 + 2];
                  var1[var9][var11][var13 - 1] = var1[var8][var10][var12 + 1];
               }
            }
         }

         for (int var20 = 0; var20 < this.field_16657; var20++) {
            int var24 = (this.field_16657 - var20) % this.field_16657;

            for (int var28 = 1; var28 < var5; var28++) {
               int var33 = this.field_16670 - var28;
               var1[var24][var28][this.field_16659] = var1[var20][var33][1];
               var1[var20][var33][this.field_16659] = var1[var20][var33][1];
               var1[var24][var28][this.field_16659 + 1] = -var1[var20][var33][0];
               var1[var20][var33][this.field_16659 + 1] = var1[var20][var33][0];
            }
         }

         for (int var21 = 0; var21 < this.field_16657; var21++) {
            int var25 = (this.field_16657 - var21) % this.field_16657;

            for (int var29 = 1; var29 < var5; var29++) {
               int var34 = this.field_16670 - var29;
               var1[var25][var34][0] = var1[var21][var29][0];
               var1[var25][var34][1] = -var1[var21][var29][1];
            }
         }
      }

      for (int var23 = 1; var23 < var6; var23++) {
         int var27 = this.field_16657 - var23;
         var1[var23][0][this.field_16659] = var1[var27][0][1];
         var1[var27][0][this.field_16659] = var1[var27][0][1];
         var1[var23][0][this.field_16659 + 1] = -var1[var27][0][0];
         var1[var27][0][this.field_16659 + 1] = var1[var27][0][0];
         var1[var23][var5][this.field_16659] = var1[var27][var5][1];
         var1[var27][var5][this.field_16659] = var1[var27][var5][1];
         var1[var23][var5][this.field_16659 + 1] = -var1[var27][var5][0];
         var1[var27][var5][this.field_16659 + 1] = var1[var27][var5][0];
         var1[var27][0][0] = var1[var23][0][0];
         var1[var27][0][1] = -var1[var23][0][1];
         var1[var27][var5][0] = var1[var23][var5][0];
         var1[var27][var5][1] = -var1[var23][var5][1];
      }

      var1[0][0][this.field_16659] = var1[0][0][1];
      var1[0][0][1] = 0.0F;
      var1[0][var5][this.field_16659] = var1[0][var5][1];
      var1[0][var5][1] = 0.0F;
      var1[var6][0][this.field_16659] = var1[var6][0][1];
      var1[var6][0][1] = 0.0F;
      var1[var6][var5][this.field_16659] = var1[var6][var5][1];
      var1[var6][var5][1] = 0.0F;
      var1[var6][0][this.field_16659 + 1] = 0.0F;
      var1[var6][var5][this.field_16659 + 1] = 0.0F;
   }

   private void method_15641(float[] var1) {
      int var4 = 2 * this.field_16659;
      int var5 = this.field_16670 / 2;
      int var6 = this.field_16657 / 2;
      int var7 = this.field_16670 * var4;
      int var8 = var4;

      for (int var9 = this.field_16657 - 1; var9 >= 1; var9--) {
         int var10 = var9 * this.field_16662;
         int var11 = 2 * var10;

         for (int var12 = 0; var12 < this.field_16670; var12++) {
            int var13 = var12 * this.field_16663;
            int var14 = 2 * var13;

            for (byte var15 = 0; var15 < this.field_16659; var15 += 2) {
               int var16 = var10 + var13 + var15;
               int var17 = var11 + var14 + var15;
               var1[var17] = var1[var16];
               var1[var16] = 0.0F;
               var16++;
               var17++;
               var1[var17] = var1[var16];
               var1[var16] = 0.0F;
            }
         }
      }

      for (int var27 = 1; var27 < this.field_16670; var27++) {
         int var29 = (this.field_16670 - var27) * this.field_16663;
         int var35 = (this.field_16670 - var27) * var8;

         for (byte var40 = 0; var40 < this.field_16659; var40 += 2) {
            int var56 = var29 + var40;
            int var64 = var35 + var40;
            var1[var64] = var1[var56];
            var1[var56] = 0.0F;
            var56++;
            var64++;
            var1[var64] = var1[var56];
            var1[var56] = 0.0F;
         }
      }

      int var28 = class_1266.method_5693();
      if (var28 > 1 && this.field_16660 && this.field_16657 >= var28) {
         Future[] var44 = new Future[var28];
         int var54 = this.field_16657 / var28;

         for (int var71 = 0; var71 < var28; var71++) {
            int var19 = var71 * var54;
            int var20 = var71 == var28 - 1 ? this.field_16657 : var19 + var54;
            var44[var71] = class_1266.method_5694(new class_329(this, var19, var20, var7, var8, var4, var1));
         }

         try {
            class_1266.method_5696(var44);
         } catch (InterruptedException var25) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var25);
         } catch (ExecutionException var26) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var26);
         }

         for (int var72 = 0; var72 < var28; var72++) {
            int var74 = var72 * var54;
            int var76 = var72 == var28 - 1 ? this.field_16657 : var74 + var54;
            var44[var72] = class_1266.method_5694(new class_1776(this, var74, var76, var7, var5, var8, var1));
         }

         try {
            class_1266.method_5696(var44);
         } catch (InterruptedException var23) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var23);
         } catch (ExecutionException var24) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var24);
         }

         for (int var73 = 0; var73 < var28; var73++) {
            int var75 = var73 * var54;
            int var77 = var73 == var28 - 1 ? this.field_16657 : var75 + var54;
            var44[var73] = class_1266.method_5694(new class_8412(this, var75, var77, var7, var5, var8, var1));
         }

         try {
            class_1266.method_5696(var44);
         } catch (InterruptedException var21) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var21);
         } catch (ExecutionException var22) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var22);
         }
      } else {
         for (int var41 = 0; var41 < this.field_16657; var41++) {
            int var30 = (this.field_16657 - var41) % this.field_16657 * var7;
            int var46 = var41 * var7;

            for (int var51 = 0; var51 < this.field_16670; var51++) {
               int var36 = (this.field_16670 - var51) % this.field_16670 * var8;
               int var49 = var51 * var8;

               for (byte var18 = 1; var18 < this.field_16659; var18 += 2) {
                  int var58 = var30 + var36 + var4 - var18;
                  int var66 = var46 + var49 + var18;
                  var1[var58] = -var1[var66 + 2];
                  var1[var58 - 1] = var1[var66 + 1];
               }
            }
         }

         for (int var42 = 0; var42 < this.field_16657; var42++) {
            int var47 = (this.field_16657 - var42) % this.field_16657 * var7;
            int var50 = var42 * var7;

            for (int var52 = 1; var52 < var5; var52++) {
               int var37 = var50 + (this.field_16670 - var52) * var8;
               int var59 = var47 + var52 * var8 + this.field_16659;
               int var67 = var37 + this.field_16659;
               int var31 = var37 + 1;
               var1[var59] = var1[var31];
               var1[var67] = var1[var31];
               var1[var59 + 1] = -var1[var37];
               var1[var67 + 1] = var1[var37];
            }
         }

         for (int var43 = 0; var43 < this.field_16657; var43++) {
            int var32 = (this.field_16657 - var43) % this.field_16657 * var7;
            int var38 = var43 * var7;

            for (int var53 = 1; var53 < var5; var53++) {
               int var60 = var32 + (this.field_16670 - var53) * var8;
               int var68 = var38 + var53 * var8;
               var1[var60] = var1[var68];
               var1[var60 + 1] = -var1[var68 + 1];
            }
         }
      }

      for (int var45 = 1; var45 < var6; var45++) {
         int var61 = var45 * var7;
         int var69 = (this.field_16657 - var45) * var7;
         int var33 = var5 * var8;
         int var39 = var61 + var33;
         int var48 = var69 + var33;
         var1[var61 + this.field_16659] = var1[var69 + 1];
         var1[var69 + this.field_16659] = var1[var69 + 1];
         var1[var61 + this.field_16659 + 1] = -var1[var69];
         var1[var69 + this.field_16659 + 1] = var1[var69];
         var1[var39 + this.field_16659] = var1[var48 + 1];
         var1[var48 + this.field_16659] = var1[var48 + 1];
         var1[var39 + this.field_16659 + 1] = -var1[var48];
         var1[var48 + this.field_16659 + 1] = var1[var48];
         var1[var69] = var1[var61];
         var1[var69 + 1] = -var1[var61 + 1];
         var1[var48] = var1[var39];
         var1[var48 + 1] = -var1[var39 + 1];
      }

      var1[this.field_16659] = var1[1];
      var1[1] = 0.0F;
      int var62 = var5 * var8;
      int var70 = var6 * var7;
      int var34 = var62 + var70;
      var1[var62 + this.field_16659] = var1[var62 + 1];
      var1[var62 + 1] = 0.0F;
      var1[var70 + this.field_16659] = var1[var70 + 1];
      var1[var70 + 1] = 0.0F;
      var1[var34 + this.field_16659] = var1[var34 + 1];
      var1[var34 + 1] = 0.0F;
      var1[var70 + this.field_16659 + 1] = 0.0F;
      var1[var34 + this.field_16659 + 1] = 0.0F;
   }

   private void method_15640(class_4330 var1) {
      long var4 = 2L * this.field_16668;
      long var6 = this.field_16667 / 2L;
      long var8 = this.field_16665 / 2L;
      long var10 = this.field_16667 * var4;
      long var12 = var4;

      for (long var14 = this.field_16665 - 1L; var14 >= 1L; var14--) {
         long var16 = var14 * this.field_16661;
         long var18 = 2L * var16;

         for (long var20 = 0L; var20 < this.field_16667; var20++) {
            long var22 = var20 * this.field_16669;
            long var24 = 2L * var22;

            for (long var26 = 0L; var26 < this.field_16668; var26 += 2L) {
               long var28 = var16 + var22 + var26;
               long var30 = var18 + var24 + var26;
               var1.method_36123(var30, var1.method_36133(var28));
               var1.method_36123(var28, 0.0F);
               var1.method_36123(++var30, var1.method_36133(++var28));
               var1.method_36123(var28, 0.0F);
            }
         }
      }

      for (long var49 = 1L; var49 < this.field_16667; var49++) {
         long var50 = (this.field_16667 - var49) * this.field_16669;
         long var56 = (this.field_16667 - var49) * var12;

         for (long var61 = 0L; var61 < this.field_16668; var61 += 2L) {
            long var69 = var50 + var61;
            long var77 = var56 + var61;
            var1.method_36123(var77, var1.method_36133(var69));
            var1.method_36123(var69, 0.0F);
            var1.method_36123(++var77, var1.method_36133(++var69));
            var1.method_36123(var69, 0.0F);
         }
      }

      int var32 = class_1266.method_5693();
      if (var32 > 1 && this.field_16660 && this.field_16665 >= (long)var32) {
         Future[] var33 = new Future[var32];
         long var62 = this.field_16665 / (long)var32;

         for (int var34 = 0; var34 < var32; var34++) {
            long var86 = (long)var34 * var62;
            long var37 = var34 == var32 - 1 ? this.field_16665 : var86 + var62;
            var33[var34] = class_1266.method_5694(new class_470(this, var86, var37, var10, var12, var4, var1));
         }

         try {
            class_1266.method_5696(var33);
         } catch (InterruptedException var47) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var47);
         } catch (ExecutionException var48) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var48);
         }

         for (int var84 = 0; var84 < var32; var84++) {
            long var87 = (long)var84 * var62;
            long var89 = var84 == var32 - 1 ? this.field_16665 : var87 + var62;
            var33[var84] = class_1266.method_5694(new class_9345(this, var87, var89, var10, var6, var12, var1));
         }

         try {
            class_1266.method_5696(var33);
         } catch (InterruptedException var45) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var45);
         } catch (ExecutionException var46) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var46);
         }

         for (int var85 = 0; var85 < var32; var85++) {
            long var88 = (long)var85 * var62;
            long var90 = var85 == var32 - 1 ? this.field_16665 : var88 + var62;
            var33[var85] = class_1266.method_5694(new class_3329(this, var88, var90, var10, var6, var12, var1));
         }

         try {
            class_1266.method_5696(var33);
         } catch (InterruptedException var43) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var43);
         } catch (ExecutionException var44) {
            Logger.getLogger(class_3381.class.getName()).log(Level.SEVERE, null, var44);
         }
      } else {
         for (long var39 = 0L; var39 < this.field_16665; var39++) {
            long var51 = (this.field_16665 - var39) % this.field_16665 * var10;
            long var63 = var39 * var10;

            for (long var41 = 0L; var41 < this.field_16667; var41++) {
               long var57 = (this.field_16667 - var41) % this.field_16667 * var12;
               long var66 = var41 * var12;

               for (long var35 = 1L; var35 < this.field_16668; var35 += 2L) {
                  long var71 = var51 + var57 + var4 - var35;
                  long var79 = var63 + var66 + var35;
                  var1.method_36123(var71, -var1.method_36133(var79 + 2L));
                  var1.method_36123(var71 - 1L, var1.method_36133(var79 + 1L));
               }
            }
         }

         for (long var91 = 0L; var91 < this.field_16665; var91++) {
            long var64 = (this.field_16665 - var91) % this.field_16665 * var10;
            long var67 = var91 * var10;

            for (long var94 = 1L; var94 < var6; var94++) {
               long var58 = var67 + (this.field_16667 - var94) * var12;
               long var72 = var64 + var94 * var12 + this.field_16668;
               long var80 = var58 + this.field_16668;
               long var52 = var58 + 1L;
               var1.method_36123(var72, var1.method_36133(var52));
               var1.method_36123(var80, var1.method_36133(var52));
               var1.method_36123(var72 + 1L, -var1.method_36133(var58));
               var1.method_36123(var80 + 1L, var1.method_36133(var58));
            }
         }

         for (long var92 = 0L; var92 < this.field_16665; var92++) {
            long var53 = (this.field_16665 - var92) % this.field_16665 * var10;
            long var59 = var92 * var10;

            for (long var95 = 1L; var95 < var6; var95++) {
               long var73 = var53 + (this.field_16667 - var95) * var12;
               long var81 = var59 + var95 * var12;
               var1.method_36123(var73, var1.method_36133(var81));
               var1.method_36123(var73 + 1L, -var1.method_36133(var81 + 1L));
            }
         }
      }

      for (long var93 = 1L; var93 < var8; var93++) {
         long var74 = var93 * var10;
         long var82 = (this.field_16665 - var93) * var10;
         long var54 = var6 * var12;
         long var60 = var74 + var54;
         long var65 = var82 + var54;
         var1.method_36123(var74 + this.field_16668, var1.method_36133(var82 + 1L));
         var1.method_36123(var82 + this.field_16668, var1.method_36133(var82 + 1L));
         var1.method_36123(var74 + this.field_16668 + 1L, -var1.method_36133(var82));
         var1.method_36123(var82 + this.field_16668 + 1L, var1.method_36133(var82));
         var1.method_36123(var60 + this.field_16668, var1.method_36133(var65 + 1L));
         var1.method_36123(var65 + this.field_16668, var1.method_36133(var65 + 1L));
         var1.method_36123(var60 + this.field_16668 + 1L, -var1.method_36133(var65));
         var1.method_36123(var65 + this.field_16668 + 1L, var1.method_36133(var65));
         var1.method_36123(var82, var1.method_36133(var74));
         var1.method_36123(var82 + 1L, -var1.method_36133(var74 + 1L));
         var1.method_36123(var65, var1.method_36133(var60));
         var1.method_36123(var65 + 1L, -var1.method_36133(var60 + 1L));
      }

      var1.method_36123(this.field_16668, var1.method_36133(1L));
      var1.method_36123(1L, 0.0F);
      long var75 = var6 * var12;
      long var83 = var8 * var10;
      long var55 = var75 + var83;
      var1.method_36123(var75 + this.field_16668, var1.method_36133(var75 + 1L));
      var1.method_36123(var75 + 1L, 0.0F);
      var1.method_36123(var83 + this.field_16668, var1.method_36133(var83 + 1L));
      var1.method_36123(var83 + 1L, 0.0F);
      var1.method_36123(var55 + this.field_16668, var1.method_36133(var55 + 1L));
      var1.method_36123(var55 + 1L, 0.0F);
      var1.method_36123(var83 + this.field_16668 + 1L, 0.0F);
      var1.method_36123(var55 + this.field_16668 + 1L, 0.0F);
   }
}
