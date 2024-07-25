package remapped;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public class class_6056 {
   private int field_30979;
   private long field_30976;
   private int field_30982;
   private long field_30972;
   private int field_30970;
   private long field_30974;
   private int field_30969;
   private long field_30978;
   private int field_30971;
   private long field_30973;
   private class_6816 field_30975;
   private class_6816 field_30968;
   private class_6816 field_30980;
   private boolean field_30977 = false;
   private boolean field_30981 = false;

   public class_6056(long var1, long var3, long var5) {
      if (var1 > 1L && var3 > 1L && var5 > 1L) {
         this.field_30979 = (int)var1;
         this.field_30982 = (int)var3;
         this.field_30970 = (int)var5;
         this.field_30976 = var1;
         this.field_30972 = var3;
         this.field_30974 = var5;
         this.field_30969 = (int)(var3 * var5);
         this.field_30971 = (int)var5;
         this.field_30978 = var3 * var5;
         this.field_30973 = var5;
         if (var1 * var3 * var5 >= class_2751.method_12537()) {
            this.field_30981 = true;
         }

         if (class_2751.method_12439(var1) && class_2751.method_12439(var3) && class_2751.method_12439(var5)) {
            this.field_30977 = true;
         }

         class_2751.method_12507(var1 * var3 * var5 > (long)class_7975.method_36102());
         this.field_30975 = new class_6816(var1);
         if (var1 != var3) {
            this.field_30968 = new class_6816(var3);
         } else {
            this.field_30968 = this.field_30975;
         }

         if (var1 != var5) {
            if (var3 != var5) {
               this.field_30980 = new class_6816(var5);
            } else {
               this.field_30980 = this.field_30968;
            }
         } else {
            this.field_30980 = this.field_30975;
         }
      } else {
         throw new IllegalArgumentException("slices, rows and columns must be greater than 1");
      }
   }

   public void method_27651(double[] var1) {
      int var4 = class_1266.method_5693();
      if (this.field_30977) {
         if (var4 > 1 && this.field_30981) {
            this.method_27675(-1, var1, true);
            this.method_27657(-1, var1, true);
         } else {
            this.method_27654(-1, var1, true);
            this.method_27668(-1, var1, true);
         }

         this.method_27682(var1);
      } else {
         if (var4 > 1 && this.field_30981 && this.field_30979 >= var4 && this.field_30982 >= var4 && this.field_30970 >= var4) {
            Future[] var19 = new Future[var4];
            int var22 = this.field_30979 / var4;

            for (int var26 = 0; var26 < var4; var26++) {
               int var30 = var26 * var22;
               int var36 = var26 == var4 - 1 ? this.field_30979 : var30 + var22;
               var19[var26] = class_1266.method_5694(new class_8684(this, var30, var36, var1));
            }

            try {
               class_1266.method_5696(var19);
            } catch (InterruptedException var15) {
               Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var15);
            } catch (ExecutionException var16) {
               Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var16);
            }

            for (int var27 = 0; var27 < var4; var27++) {
               int var31 = var27 * var22;
               int var37 = var27 == var4 - 1 ? this.field_30979 : var31 + var22;
               var19[var27] = class_1266.method_5694(new class_7793(this, var31, var37, var1));
            }

            try {
               class_1266.method_5696(var19);
            } catch (InterruptedException var13) {
               Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var13);
            } catch (ExecutionException var14) {
               Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var14);
            }

            var22 = this.field_30982 / var4;

            for (int var28 = 0; var28 < var4; var28++) {
               int var32 = var28 * var22;
               int var38;
               if (var28 == var4 - 1) {
                  var38 = this.field_30982;
               } else {
                  var38 = var32 + var22;
               }

               var19[var28] = class_1266.method_5694(new class_364(this, var32, var38, var1));
            }

            try {
               class_1266.method_5696(var19);
            } catch (InterruptedException var11) {
               Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var11);
            } catch (ExecutionException var12) {
               Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var12);
            }
         } else {
            for (int var5 = 0; var5 < this.field_30979; var5++) {
               int var6 = var5 * this.field_30969;

               for (int var7 = 0; var7 < this.field_30982; var7++) {
                  this.field_30980.method_31276(var1, var6 + var7 * this.field_30971);
               }
            }

            double[] var17 = new double[this.field_30982];

            for (int var20 = 0; var20 < this.field_30979; var20++) {
               int var24 = var20 * this.field_30969;

               for (int var8 = 0; var8 < this.field_30970; var8++) {
                  for (int var9 = 0; var9 < this.field_30982; var9++) {
                     int var10 = var24 + var9 * this.field_30971 + var8;
                     var17[var9] = var1[var10];
                  }

                  this.field_30968.method_31275(var17);

                  for (int var33 = 0; var33 < this.field_30982; var33++) {
                     int var39 = var24 + var33 * this.field_30971 + var8;
                     var1[var39] = var17[var33];
                  }
               }
            }

            var17 = new double[this.field_30979];

            for (int var21 = 0; var21 < this.field_30982; var21++) {
               int var25 = var21 * this.field_30971;

               for (int var29 = 0; var29 < this.field_30970; var29++) {
                  for (int var34 = 0; var34 < this.field_30979; var34++) {
                     int var40 = var34 * this.field_30969 + var25 + var29;
                     var17[var34] = var1[var40];
                  }

                  this.field_30975.method_31275(var17);

                  for (int var35 = 0; var35 < this.field_30979; var35++) {
                     int var41 = var35 * this.field_30969 + var25 + var29;
                     var1[var41] = var17[var35];
                  }
               }
            }
         }

         this.method_27682(var1);
      }
   }

   public void method_27650(class_1702 var1) {
      int var4 = class_1266.method_5693();
      if (this.field_30977) {
         if (var4 > 1 && this.field_30981) {
            this.method_27674(-1, var1, true);
            this.method_27656(-1, var1, true);
         } else {
            this.method_27653(-1, var1, true);
            this.method_27667(-1, var1, true);
         }

         this.method_27681(var1);
      } else {
         if (var4 > 1 && this.field_30981 && this.field_30976 >= (long)var4 && this.field_30972 >= (long)var4 && this.field_30974 >= (long)var4) {
            Future[] var32 = new Future[var4];
            long var34 = this.field_30976 / (long)var4;

            for (int var8 = 0; var8 < var4; var8++) {
               long var38 = (long)var8 * var34;
               long var11 = var8 == var4 - 1 ? this.field_30976 : var38 + var34;
               var32[var8] = class_1266.method_5694(new class_493(this, var38, var11, var1));
            }

            try {
               class_1266.method_5696(var32);
            } catch (InterruptedException var29) {
               Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var29);
            } catch (ExecutionException var30) {
               Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var30);
            }

            for (int var36 = 0; var36 < var4; var36++) {
               long var39 = (long)var36 * var34;
               long var41 = var36 == var4 - 1 ? this.field_30976 : var39 + var34;
               var32[var36] = class_1266.method_5694(new class_4626(this, var39, var41, var1));
            }

            try {
               class_1266.method_5696(var32);
            } catch (InterruptedException var27) {
               Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var27);
            } catch (ExecutionException var28) {
               Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var28);
            }

            var34 = this.field_30972 / (long)var4;

            for (int var37 = 0; var37 < var4; var37++) {
               long var40 = (long)var37 * var34;
               long var42;
               if (var37 == var4 - 1) {
                  var42 = this.field_30972;
               } else {
                  var42 = var40 + var34;
               }

               var32[var37] = class_1266.method_5694(new class_2149(this, var40, var42, var1));
            }

            try {
               class_1266.method_5696(var32);
            } catch (InterruptedException var25) {
               Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var25);
            } catch (ExecutionException var26) {
               Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var26);
            }
         } else {
            for (long var13 = 0L; var13 < this.field_30976; var13++) {
               long var15 = var13 * (long)this.field_30969;

               for (long var9 = 0L; var9 < this.field_30972; var9++) {
                  this.field_30980.method_31274(var1, var15 + var9 * (long)this.field_30971);
               }
            }

            class_1702 var5 = new class_1702(this.field_30972, false);

            for (long var6 = 0L; var6 < this.field_30976; var6++) {
               long var17 = var6 * (long)this.field_30969;

               for (long var19 = 0L; var19 < this.field_30974; var19++) {
                  for (long var21 = 0L; var21 < this.field_30972; var21++) {
                     long var23 = var17 + var21 * (long)this.field_30971 + var19;
                     var5.method_36114(var21, var1.method_36107(var23));
                  }

                  this.field_30968.method_31273(var5);

                  for (long var45 = 0L; var45 < this.field_30972; var45++) {
                     long var48 = var17 + var45 * (long)this.field_30971 + var19;
                     var1.method_36114(var48, var5.method_36107(var45));
                  }
               }
            }

            var5 = new class_1702(this.field_30976, false);

            for (long var33 = 0L; var33 < this.field_30972; var33++) {
               long var43 = var33 * (long)this.field_30971;

               for (long var44 = 0L; var44 < this.field_30974; var44++) {
                  for (long var46 = 0L; var46 < this.field_30976; var46++) {
                     long var49 = var46 * (long)this.field_30969 + var43 + var44;
                     var5.method_36114(var46, var1.method_36107(var49));
                  }

                  this.field_30975.method_31273(var5);

                  for (long var47 = 0L; var47 < this.field_30976; var47++) {
                     long var50 = var47 * (long)this.field_30969 + var43 + var44;
                     var1.method_36114(var50, var5.method_36107(var47));
                  }
               }
            }
         }

         this.method_27681(var1);
      }
   }

   public void method_27652(double[][][] var1) {
      int var4 = class_1266.method_5693();
      if (this.field_30977) {
         if (var4 > 1 && this.field_30981) {
            this.method_27676(-1, var1, true);
            this.method_27658(-1, var1, true);
         } else {
            this.method_27655(-1, var1, true);
            this.method_27669(-1, var1, true);
         }

         this.method_27683(var1);
      } else {
         if (var4 > 1 && this.field_30981 && this.field_30979 >= var4 && this.field_30982 >= var4 && this.field_30970 >= var4) {
            Future[] var18 = new Future[var4];
            int var21 = this.field_30979 / var4;

            for (int var24 = 0; var24 < var4; var24++) {
               int var30 = var24 * var21;
               int var9 = var24 == var4 - 1 ? this.field_30979 : var30 + var21;
               var18[var24] = class_1266.method_5694(new class_1949(this, var30, var9, var1));
            }

            try {
               class_1266.method_5696(var18);
            } catch (InterruptedException var14) {
               Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var14);
            } catch (ExecutionException var15) {
               Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var15);
            }

            for (int var25 = 0; var25 < var4; var25++) {
               int var31 = var25 * var21;
               int var33 = var25 == var4 - 1 ? this.field_30979 : var31 + var21;
               var18[var25] = class_1266.method_5694(new class_7343(this, var31, var33, var1));
            }

            try {
               class_1266.method_5696(var18);
            } catch (InterruptedException var12) {
               Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var12);
            } catch (ExecutionException var13) {
               Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var13);
            }

            var21 = this.field_30982 / var4;

            for (int var26 = 0; var26 < var4; var26++) {
               int var32 = var26 * var21;
               int var34 = var26 == var4 - 1 ? this.field_30982 : var32 + var21;
               var18[var26] = class_1266.method_5694(new class_9094(this, var32, var34, var1));
            }

            try {
               class_1266.method_5696(var18);
            } catch (InterruptedException var10) {
               Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var10);
            } catch (ExecutionException var11) {
               Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var11);
            }
         } else {
            for (int var5 = 0; var5 < this.field_30979; var5++) {
               for (int var6 = 0; var6 < this.field_30982; var6++) {
                  this.field_30980.method_31275(var1[var5][var6]);
               }
            }

            double[] var16 = new double[this.field_30982];

            for (int var19 = 0; var19 < this.field_30979; var19++) {
               for (int var7 = 0; var7 < this.field_30970; var7++) {
                  for (int var8 = 0; var8 < this.field_30982; var8++) {
                     var16[var8] = var1[var19][var8][var7];
                  }

                  this.field_30968.method_31275(var16);

                  for (int var27 = 0; var27 < this.field_30982; var27++) {
                     var1[var19][var27][var7] = var16[var27];
                  }
               }
            }

            var16 = new double[this.field_30979];

            for (int var20 = 0; var20 < this.field_30982; var20++) {
               for (int var23 = 0; var23 < this.field_30970; var23++) {
                  for (int var28 = 0; var28 < this.field_30979; var28++) {
                     var16[var28] = var1[var28][var20][var23];
                  }

                  this.field_30975.method_31275(var16);

                  for (int var29 = 0; var29 < this.field_30979; var29++) {
                     var1[var29][var20][var23] = var16[var29];
                  }
               }
            }
         }

         this.method_27683(var1);
      }
   }

   public void method_27663(double[] var1, boolean var2) {
      int var5 = class_1266.method_5693();
      if (this.field_30977) {
         if (var5 > 1 && this.field_30981) {
            this.method_27675(1, var1, var2);
            this.method_27657(1, var1, var2);
         } else {
            this.method_27654(1, var1, var2);
            this.method_27668(1, var1, var2);
         }

         this.method_27682(var1);
      } else {
         if (var5 > 1 && this.field_30981 && this.field_30979 >= var5 && this.field_30982 >= var5 && this.field_30970 >= var5) {
            Future[] var20 = new Future[var5];
            int var23 = this.field_30979 / var5;

            for (int var27 = 0; var27 < var5; var27++) {
               int var31 = var27 * var23;
               int var37 = var27 == var5 - 1 ? this.field_30979 : var31 + var23;
               var20[var27] = class_1266.method_5694(new class_6116(this, var31, var37, var1, var2));
            }

            try {
               class_1266.method_5696(var20);
            } catch (InterruptedException var16) {
               Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var16);
            } catch (ExecutionException var17) {
               Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var17);
            }

            for (int var28 = 0; var28 < var5; var28++) {
               int var32 = var28 * var23;
               int var38 = var28 == var5 - 1 ? this.field_30979 : var32 + var23;
               var20[var28] = class_1266.method_5694(new class_2752(this, var32, var38, var1, var2));
            }

            try {
               class_1266.method_5696(var20);
            } catch (InterruptedException var14) {
               Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var14);
            } catch (ExecutionException var15) {
               Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var15);
            }

            var23 = this.field_30982 / var5;

            for (int var29 = 0; var29 < var5; var29++) {
               int var33 = var29 * var23;
               int var39 = var29 == var5 - 1 ? this.field_30982 : var33 + var23;
               var20[var29] = class_1266.method_5694(new class_9509(this, var33, var39, var1, var2));
            }

            try {
               class_1266.method_5696(var20);
            } catch (InterruptedException var12) {
               Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var12);
            } catch (ExecutionException var13) {
               Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var13);
            }
         } else {
            for (int var6 = 0; var6 < this.field_30979; var6++) {
               int var7 = var6 * this.field_30969;

               for (int var8 = 0; var8 < this.field_30982; var8++) {
                  this.field_30980.method_31282(var1, var7 + var8 * this.field_30971, var2);
               }
            }

            double[] var18 = new double[this.field_30982];

            for (int var21 = 0; var21 < this.field_30979; var21++) {
               int var25 = var21 * this.field_30969;

               for (int var9 = 0; var9 < this.field_30970; var9++) {
                  for (int var10 = 0; var10 < this.field_30982; var10++) {
                     int var11 = var25 + var10 * this.field_30971 + var9;
                     var18[var10] = var1[var11];
                  }

                  this.field_30968.method_31283(var18, var2);

                  for (int var34 = 0; var34 < this.field_30982; var34++) {
                     int var40 = var25 + var34 * this.field_30971 + var9;
                     var1[var40] = var18[var34];
                  }
               }
            }

            var18 = new double[this.field_30979];

            for (int var22 = 0; var22 < this.field_30982; var22++) {
               int var26 = var22 * this.field_30971;

               for (int var30 = 0; var30 < this.field_30970; var30++) {
                  for (int var35 = 0; var35 < this.field_30979; var35++) {
                     int var41 = var35 * this.field_30969 + var26 + var30;
                     var18[var35] = var1[var41];
                  }

                  this.field_30975.method_31283(var18, var2);

                  for (int var36 = 0; var36 < this.field_30979; var36++) {
                     int var42 = var36 * this.field_30969 + var26 + var30;
                     var1[var42] = var18[var36];
                  }
               }
            }
         }

         this.method_27682(var1);
      }
   }

   public void method_27662(class_1702 var1, boolean var2) {
      int var5 = class_1266.method_5693();
      if (this.field_30977) {
         if (var5 > 1 && this.field_30981) {
            this.method_27674(1, var1, var2);
            this.method_27656(1, var1, var2);
         } else {
            this.method_27653(1, var1, var2);
            this.method_27667(1, var1, var2);
         }

         this.method_27681(var1);
      } else {
         if (var5 > 1 && this.field_30981 && this.field_30976 >= (long)var5 && this.field_30972 >= (long)var5 && this.field_30974 >= (long)var5) {
            Future[] var33 = new Future[var5];
            long var35 = this.field_30976 / (long)var5;

            for (int var9 = 0; var9 < var5; var9++) {
               long var39 = (long)var9 * var35;
               long var12 = var9 == var5 - 1 ? this.field_30976 : var39 + var35;
               var33[var9] = class_1266.method_5694(new class_8556(this, var39, var12, var1, var2));
            }

            try {
               class_1266.method_5696(var33);
            } catch (InterruptedException var30) {
               Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var30);
            } catch (ExecutionException var31) {
               Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var31);
            }

            for (int var37 = 0; var37 < var5; var37++) {
               long var40 = (long)var37 * var35;
               long var42 = var37 == var5 - 1 ? this.field_30976 : var40 + var35;
               var33[var37] = class_1266.method_5694(new class_626(this, var40, var42, var1, var2));
            }

            try {
               class_1266.method_5696(var33);
            } catch (InterruptedException var28) {
               Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var28);
            } catch (ExecutionException var29) {
               Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var29);
            }

            var35 = this.field_30972 / (long)var5;

            for (int var38 = 0; var38 < var5; var38++) {
               long var41 = (long)var38 * var35;
               long var43 = var38 == var5 - 1 ? this.field_30972 : var41 + var35;
               var33[var38] = class_1266.method_5694(new class_4547(this, var41, var43, var1, var2));
            }

            try {
               class_1266.method_5696(var33);
            } catch (InterruptedException var26) {
               Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var26);
            } catch (ExecutionException var27) {
               Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var27);
            }
         } else {
            for (long var14 = 0L; var14 < this.field_30976; var14++) {
               long var16 = var14 * this.field_30978;

               for (long var10 = 0L; var10 < this.field_30972; var10++) {
                  this.field_30980.method_31280(var1, var16 + var10 * this.field_30973, var2);
               }
            }

            class_1702 var6 = new class_1702(this.field_30972, false);

            for (long var7 = 0L; var7 < this.field_30976; var7++) {
               long var18 = var7 * this.field_30978;

               for (long var20 = 0L; var20 < this.field_30974; var20++) {
                  for (long var22 = 0L; var22 < this.field_30972; var22++) {
                     long var24 = var18 + var22 * this.field_30973 + var20;
                     var6.method_36114(var22, var1.method_36107(var24));
                  }

                  this.field_30968.method_31281(var6, var2);

                  for (long var46 = 0L; var46 < this.field_30972; var46++) {
                     long var49 = var18 + var46 * this.field_30973 + var20;
                     var1.method_36114(var49, var6.method_36107(var46));
                  }
               }
            }

            var6 = new class_1702(this.field_30976, false);

            for (long var34 = 0L; var34 < this.field_30972; var34++) {
               long var44 = var34 * this.field_30973;

               for (long var45 = 0L; var45 < this.field_30974; var45++) {
                  for (long var47 = 0L; var47 < this.field_30976; var47++) {
                     long var50 = var47 * this.field_30978 + var44 + var45;
                     var6.method_36114(var47, var1.method_36107(var50));
                  }

                  this.field_30975.method_31281(var6, var2);

                  for (long var48 = 0L; var48 < this.field_30976; var48++) {
                     long var51 = var48 * this.field_30978 + var44 + var45;
                     var1.method_36114(var51, var6.method_36107(var48));
                  }
               }
            }
         }

         this.method_27681(var1);
      }
   }

   public void method_27664(double[][][] var1, boolean var2) {
      int var5 = class_1266.method_5693();
      if (this.field_30977) {
         if (var5 > 1 && this.field_30981) {
            this.method_27676(1, var1, var2);
            this.method_27658(1, var1, var2);
         } else {
            this.method_27655(1, var1, var2);
            this.method_27669(1, var1, var2);
         }

         this.method_27683(var1);
      } else {
         if (var5 > 1 && this.field_30981 && this.field_30979 >= var5 && this.field_30982 >= var5 && this.field_30970 >= var5) {
            Future[] var19 = new Future[var5];
            int var22 = this.field_30979 / var5;

            for (int var25 = 0; var25 < var5; var25++) {
               int var31 = var25 * var22;
               int var10 = var25 == var5 - 1 ? this.field_30979 : var31 + var22;
               var19[var25] = class_1266.method_5694(new class_1760(this, var31, var10, var1, var2));
            }

            try {
               class_1266.method_5696(var19);
            } catch (InterruptedException var15) {
               Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var15);
            } catch (ExecutionException var16) {
               Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var16);
            }

            for (int var26 = 0; var26 < var5; var26++) {
               int var32 = var26 * var22;
               int var34 = var26 == var5 - 1 ? this.field_30979 : var32 + var22;
               var19[var26] = class_1266.method_5694(new class_6407(this, var32, var34, var1, var2));
            }

            try {
               class_1266.method_5696(var19);
            } catch (InterruptedException var13) {
               Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var13);
            } catch (ExecutionException var14) {
               Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var14);
            }

            var22 = this.field_30982 / var5;

            for (int var27 = 0; var27 < var5; var27++) {
               int var33 = var27 * var22;
               int var35 = var27 == var5 - 1 ? this.field_30982 : var33 + var22;
               var19[var27] = class_1266.method_5694(new class_1520(this, var33, var35, var1, var2));
            }

            try {
               class_1266.method_5696(var19);
            } catch (InterruptedException var11) {
               Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var11);
            } catch (ExecutionException var12) {
               Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var12);
            }
         } else {
            for (int var6 = 0; var6 < this.field_30979; var6++) {
               for (int var7 = 0; var7 < this.field_30982; var7++) {
                  this.field_30980.method_31283(var1[var6][var7], var2);
               }
            }

            double[] var17 = new double[this.field_30982];

            for (int var20 = 0; var20 < this.field_30979; var20++) {
               for (int var8 = 0; var8 < this.field_30970; var8++) {
                  for (int var9 = 0; var9 < this.field_30982; var9++) {
                     var17[var9] = var1[var20][var9][var8];
                  }

                  this.field_30968.method_31283(var17, var2);

                  for (int var28 = 0; var28 < this.field_30982; var28++) {
                     var1[var20][var28][var8] = var17[var28];
                  }
               }
            }

            var17 = new double[this.field_30979];

            for (int var21 = 0; var21 < this.field_30982; var21++) {
               for (int var24 = 0; var24 < this.field_30970; var24++) {
                  for (int var29 = 0; var29 < this.field_30979; var29++) {
                     var17[var29] = var1[var29][var21][var24];
                  }

                  this.field_30975.method_31283(var17, var2);

                  for (int var30 = 0; var30 < this.field_30979; var30++) {
                     var1[var30][var21][var24] = var17[var30];
                  }
               }
            }
         }

         this.method_27683(var1);
      }
   }

   private void method_27654(int var1, double[] var2, boolean var3) {
      int var6 = 4 * this.field_30982;
      if (this.field_30970 == 2) {
         var6 >>= 1;
      }

      double[] var7 = new double[var6];
      if (var1 != -1) {
         for (int var8 = 0; var8 < this.field_30979; var8++) {
            int var9 = var8 * this.field_30969;

            for (int var10 = 0; var10 < this.field_30982; var10++) {
               this.field_30980.method_31282(var2, var9 + var10 * this.field_30971, var3);
            }

            if (this.field_30970 <= 2) {
               if (this.field_30970 == 2) {
                  for (int var17 = 0; var17 < this.field_30982; var17++) {
                     int var27 = var9 + var17 * this.field_30971;
                     var7[var17] = var2[var27];
                     var7[this.field_30982 + var17] = var2[var27 + 1];
                  }

                  this.field_30968.method_31282(var7, 0, var3);
                  this.field_30968.method_31282(var7, this.field_30982, var3);

                  for (int var18 = 0; var18 < this.field_30982; var18++) {
                     int var28 = var9 + var18 * this.field_30971;
                     var2[var28] = var7[var18];
                     var2[var28 + 1] = var7[this.field_30982 + var18];
                  }
               }
            } else {
               for (byte var16 = 0; var16 < this.field_30970; var16 += 4) {
                  for (int var11 = 0; var11 < this.field_30982; var11++) {
                     int var12 = var9 + var11 * this.field_30971 + var16;
                     int var13 = this.field_30982 + var11;
                     var7[var11] = var2[var12];
                     var7[var13] = var2[var12 + 1];
                     var7[var13 + this.field_30982] = var2[var12 + 2];
                     var7[var13 + 2 * this.field_30982] = var2[var12 + 3];
                  }

                  this.field_30968.method_31282(var7, 0, var3);
                  this.field_30968.method_31282(var7, this.field_30982, var3);
                  this.field_30968.method_31282(var7, 2 * this.field_30982, var3);
                  this.field_30968.method_31282(var7, 3 * this.field_30982, var3);

                  for (int var23 = 0; var23 < this.field_30982; var23++) {
                     int var26 = var9 + var23 * this.field_30971 + var16;
                     int var33 = this.field_30982 + var23;
                     var2[var26] = var7[var23];
                     var2[var26 + 1] = var7[var33];
                     var2[var26 + 2] = var7[var33 + this.field_30982];
                     var2[var26 + 3] = var7[var33 + 2 * this.field_30982];
                  }
               }
            }
         }
      } else {
         for (int var14 = 0; var14 < this.field_30979; var14++) {
            int var15 = var14 * this.field_30969;

            for (int var19 = 0; var19 < this.field_30982; var19++) {
               this.field_30980.method_31276(var2, var15 + var19 * this.field_30971);
            }

            if (this.field_30970 <= 2) {
               if (this.field_30970 == 2) {
                  for (int var21 = 0; var21 < this.field_30982; var21++) {
                     int var31 = var15 + var21 * this.field_30971;
                     var7[var21] = var2[var31];
                     var7[this.field_30982 + var21] = var2[var31 + 1];
                  }

                  this.field_30968.method_31276(var7, 0);
                  this.field_30968.method_31276(var7, this.field_30982);

                  for (int var22 = 0; var22 < this.field_30982; var22++) {
                     int var32 = var15 + var22 * this.field_30971;
                     var2[var32] = var7[var22];
                     var2[var32 + 1] = var7[this.field_30982 + var22];
                  }
               }
            } else {
               for (byte var20 = 0; var20 < this.field_30970; var20 += 4) {
                  for (int var24 = 0; var24 < this.field_30982; var24++) {
                     int var29 = var15 + var24 * this.field_30971 + var20;
                     int var34 = this.field_30982 + var24;
                     var7[var24] = var2[var29];
                     var7[var34] = var2[var29 + 1];
                     var7[var34 + this.field_30982] = var2[var29 + 2];
                     var7[var34 + 2 * this.field_30982] = var2[var29 + 3];
                  }

                  this.field_30968.method_31276(var7, 0);
                  this.field_30968.method_31276(var7, this.field_30982);
                  this.field_30968.method_31276(var7, 2 * this.field_30982);
                  this.field_30968.method_31276(var7, 3 * this.field_30982);

                  for (int var25 = 0; var25 < this.field_30982; var25++) {
                     int var30 = var15 + var25 * this.field_30971 + var20;
                     int var35 = this.field_30982 + var25;
                     var2[var30] = var7[var25];
                     var2[var30 + 1] = var7[var35];
                     var2[var30 + 2] = var7[var35 + this.field_30982];
                     var2[var30 + 3] = var7[var35 + 2 * this.field_30982];
                  }
               }
            }
         }
      }
   }

   private void method_27653(int var1, class_1702 var2, boolean var3) {
      long var6 = 4L * this.field_30972;
      if (this.field_30974 == 2L) {
         var6 >>= 1;
      }

      class_1702 var8 = new class_1702(var6);
      if (var1 != -1) {
         for (long var9 = 0L; var9 < this.field_30976; var9++) {
            long var11 = var9 * this.field_30978;

            for (long var13 = 0L; var13 < this.field_30972; var13++) {
               this.field_30980.method_31280(var2, var11 + var13 * this.field_30973, var3);
            }

            if (this.field_30974 <= 2L) {
               if (this.field_30974 == 2L) {
                  for (long var24 = 0L; var24 < this.field_30972; var24++) {
                     long var34 = var11 + var24 * this.field_30973;
                     var8.method_36114(var24, var2.method_36107(var34));
                     var8.method_36114(this.field_30972 + var24, var2.method_36107(var34 + 1L));
                  }

                  this.field_30968.method_31280(var8, 0L, var3);
                  this.field_30968.method_31280(var8, this.field_30972, var3);

                  for (long var25 = 0L; var25 < this.field_30972; var25++) {
                     long var35 = var11 + var25 * this.field_30973;
                     var2.method_36114(var35, var8.method_36107(var25));
                     var2.method_36114(var35 + 1L, var8.method_36107(this.field_30972 + var25));
                  }
               }
            } else {
               for (long var23 = 0L; var23 < this.field_30974; var23 += 4L) {
                  for (long var15 = 0L; var15 < this.field_30972; var15++) {
                     long var17 = var11 + var15 * this.field_30973 + var23;
                     long var19 = this.field_30972 + var15;
                     var8.method_36114(var15, var2.method_36107(var17));
                     var8.method_36114(var19, var2.method_36107(var17 + 1L));
                     var8.method_36114(var19 + this.field_30972, var2.method_36107(var17 + 2L));
                     var8.method_36114(var19 + 2L * this.field_30972, var2.method_36107(var17 + 3L));
                  }

                  this.field_30968.method_31280(var8, 0L, var3);
                  this.field_30968.method_31280(var8, this.field_30972, var3);
                  this.field_30968.method_31280(var8, 2L * this.field_30972, var3);
                  this.field_30968.method_31280(var8, 3L * this.field_30972, var3);

                  for (long var30 = 0L; var30 < this.field_30972; var30++) {
                     long var33 = var11 + var30 * this.field_30973 + var23;
                     long var40 = this.field_30972 + var30;
                     var2.method_36114(var33, var8.method_36107(var30));
                     var2.method_36114(var33 + 1L, var8.method_36107(var40));
                     var2.method_36114(var33 + 2L, var8.method_36107(var40 + this.field_30972));
                     var2.method_36114(var33 + 3L, var8.method_36107(var40 + 2L * this.field_30972));
                  }
               }
            }
         }
      } else {
         for (long var21 = 0L; var21 < this.field_30976; var21++) {
            long var22 = var21 * this.field_30978;

            for (long var26 = 0L; var26 < this.field_30972; var26++) {
               this.field_30980.method_31274(var2, var22 + var26 * this.field_30973);
            }

            if (this.field_30974 <= 2L) {
               if (this.field_30974 == 2L) {
                  for (long var28 = 0L; var28 < this.field_30972; var28++) {
                     long var38 = var22 + var28 * this.field_30973;
                     var8.method_36114(var28, var2.method_36107(var38));
                     var8.method_36114(this.field_30972 + var28, var2.method_36107(var38 + 1L));
                  }

                  this.field_30968.method_31274(var8, 0L);
                  this.field_30968.method_31274(var8, this.field_30972);

                  for (long var29 = 0L; var29 < this.field_30972; var29++) {
                     long var39 = var22 + var29 * this.field_30973;
                     var2.method_36114(var39, var8.method_36107(var29));
                     var2.method_36114(var39 + 1L, var8.method_36107(this.field_30972 + var29));
                  }
               }
            } else {
               for (long var27 = 0L; var27 < this.field_30974; var27 += 4L) {
                  for (long var31 = 0L; var31 < this.field_30972; var31++) {
                     long var36 = var22 + var31 * this.field_30973 + var27;
                     long var41 = this.field_30972 + var31;
                     var8.method_36114(var31, var2.method_36107(var36));
                     var8.method_36114(var41, var2.method_36107(var36 + 1L));
                     var8.method_36114(var41 + this.field_30972, var2.method_36107(var36 + 2L));
                     var8.method_36114(var41 + 2L * this.field_30972, var2.method_36107(var36 + 3L));
                  }

                  this.field_30968.method_31274(var8, 0L);
                  this.field_30968.method_31274(var8, this.field_30972);
                  this.field_30968.method_31274(var8, 2L * this.field_30972);
                  this.field_30968.method_31274(var8, 3L * this.field_30972);

                  for (long var32 = 0L; var32 < this.field_30972; var32++) {
                     long var37 = var22 + var32 * this.field_30973 + var27;
                     long var42 = this.field_30972 + var32;
                     var2.method_36114(var37, var8.method_36107(var32));
                     var2.method_36114(var37 + 1L, var8.method_36107(var42));
                     var2.method_36114(var37 + 2L, var8.method_36107(var42 + this.field_30972));
                     var2.method_36114(var37 + 3L, var8.method_36107(var42 + 2L * this.field_30972));
                  }
               }
            }
         }
      }
   }

   private void method_27655(int var1, double[][][] var2, boolean var3) {
      int var6 = 4 * this.field_30982;
      if (this.field_30974 == 2L) {
         var6 >>= 1;
      }

      double[] var7 = new double[var6];
      if (var1 != -1) {
         for (int var8 = 0; var8 < this.field_30979; var8++) {
            for (int var9 = 0; var9 < this.field_30982; var9++) {
               this.field_30980.method_31283(var2[var8][var9], var3);
            }

            if (this.field_30970 <= 2) {
               if (this.field_30970 == 2) {
                  for (int var14 = 0; var14 < this.field_30982; var14++) {
                     var7[var14] = var2[var8][var14][0];
                     var7[this.field_30982 + var14] = var2[var8][var14][1];
                  }

                  this.field_30968.method_31282(var7, 0, var3);
                  this.field_30968.method_31282(var7, this.field_30982, var3);

                  for (int var15 = 0; var15 < this.field_30982; var15++) {
                     var2[var8][var15][0] = var7[var15];
                     var2[var8][var15][1] = var7[this.field_30982 + var15];
                  }
               }
            } else {
               for (byte var13 = 0; var13 < this.field_30970; var13 += 4) {
                  for (int var10 = 0; var10 < this.field_30982; var10++) {
                     int var11 = this.field_30982 + var10;
                     var7[var10] = var2[var8][var10][var13];
                     var7[var11] = var2[var8][var10][var13 + 1];
                     var7[var11 + this.field_30982] = var2[var8][var10][var13 + 2];
                     var7[var11 + 2 * this.field_30982] = var2[var8][var10][var13 + 3];
                  }

                  this.field_30968.method_31282(var7, 0, var3);
                  this.field_30968.method_31282(var7, this.field_30982, var3);
                  this.field_30968.method_31282(var7, 2 * this.field_30982, var3);
                  this.field_30968.method_31282(var7, 3 * this.field_30982, var3);

                  for (int var20 = 0; var20 < this.field_30982; var20++) {
                     int var23 = this.field_30982 + var20;
                     var2[var8][var20][var13] = var7[var20];
                     var2[var8][var20][var13 + 1] = var7[var23];
                     var2[var8][var20][var13 + 2] = var7[var23 + this.field_30982];
                     var2[var8][var20][var13 + 3] = var7[var23 + 2 * this.field_30982];
                  }
               }
            }
         }
      } else {
         for (int var12 = 0; var12 < this.field_30979; var12++) {
            for (int var16 = 0; var16 < this.field_30982; var16++) {
               this.field_30980.method_31275(var2[var12][var16]);
            }

            if (this.field_30970 <= 2) {
               if (this.field_30970 == 2) {
                  for (int var18 = 0; var18 < this.field_30982; var18++) {
                     var7[var18] = var2[var12][var18][0];
                     var7[this.field_30982 + var18] = var2[var12][var18][1];
                  }

                  this.field_30968.method_31276(var7, 0);
                  this.field_30968.method_31276(var7, this.field_30982);

                  for (int var19 = 0; var19 < this.field_30982; var19++) {
                     var2[var12][var19][0] = var7[var19];
                     var2[var12][var19][1] = var7[this.field_30982 + var19];
                  }
               }
            } else {
               for (byte var17 = 0; var17 < this.field_30970; var17 += 4) {
                  for (int var21 = 0; var21 < this.field_30982; var21++) {
                     int var24 = this.field_30982 + var21;
                     var7[var21] = var2[var12][var21][var17];
                     var7[var24] = var2[var12][var21][var17 + 1];
                     var7[var24 + this.field_30982] = var2[var12][var21][var17 + 2];
                     var7[var24 + 2 * this.field_30982] = var2[var12][var21][var17 + 3];
                  }

                  this.field_30968.method_31276(var7, 0);
                  this.field_30968.method_31276(var7, this.field_30982);
                  this.field_30968.method_31276(var7, 2 * this.field_30982);
                  this.field_30968.method_31276(var7, 3 * this.field_30982);

                  for (int var22 = 0; var22 < this.field_30982; var22++) {
                     int var25 = this.field_30982 + var22;
                     var2[var12][var22][var17] = var7[var22];
                     var2[var12][var22][var17 + 1] = var7[var25];
                     var2[var12][var22][var17 + 2] = var7[var25 + this.field_30982];
                     var2[var12][var22][var17 + 3] = var7[var25 + 2 * this.field_30982];
                  }
               }
            }
         }
      }
   }

   private void method_27668(int var1, double[] var2, boolean var3) {
      int var6 = 4 * this.field_30979;
      if (this.field_30970 == 2) {
         var6 >>= 1;
      }

      double[] var7 = new double[var6];
      if (var1 != -1) {
         if (this.field_30970 <= 2) {
            if (this.field_30970 == 2) {
               for (int var8 = 0; var8 < this.field_30982; var8++) {
                  int var9 = var8 * this.field_30971;

                  for (int var10 = 0; var10 < this.field_30979; var10++) {
                     int var12 = var10 * this.field_30969 + var9;
                     var7[var10] = var2[var12];
                     var7[this.field_30979 + var10] = var2[var12 + 1];
                  }

                  this.field_30975.method_31282(var7, 0, var3);
                  this.field_30975.method_31282(var7, this.field_30979, var3);

                  for (int var20 = 0; var20 < this.field_30979; var20++) {
                     int var28 = var20 * this.field_30969 + var9;
                     var2[var28] = var7[var20];
                     var2[var28 + 1] = var7[this.field_30979 + var20];
                  }
               }
            }
         } else {
            for (int var14 = 0; var14 < this.field_30982; var14++) {
               int var17 = var14 * this.field_30971;

               for (byte var21 = 0; var21 < this.field_30970; var21 += 4) {
                  for (int var11 = 0; var11 < this.field_30979; var11++) {
                     int var29 = var11 * this.field_30969 + var17 + var21;
                     int var13 = this.field_30979 + var11;
                     var7[var11] = var2[var29];
                     var7[var13] = var2[var29 + 1];
                     var7[var13 + this.field_30979] = var2[var29 + 2];
                     var7[var13 + 2 * this.field_30979] = var2[var29 + 3];
                  }

                  this.field_30975.method_31282(var7, 0, var3);
                  this.field_30975.method_31282(var7, this.field_30979, var3);
                  this.field_30975.method_31282(var7, 2 * this.field_30979, var3);
                  this.field_30975.method_31282(var7, 3 * this.field_30979, var3);

                  for (int var25 = 0; var25 < this.field_30979; var25++) {
                     int var30 = var25 * this.field_30969 + var17 + var21;
                     int var35 = this.field_30979 + var25;
                     var2[var30] = var7[var25];
                     var2[var30 + 1] = var7[var35];
                     var2[var30 + 2] = var7[var35 + this.field_30979];
                     var2[var30 + 3] = var7[var35 + 2 * this.field_30979];
                  }
               }
            }
         }
      } else if (this.field_30970 <= 2) {
         if (this.field_30970 == 2) {
            for (int var15 = 0; var15 < this.field_30982; var15++) {
               int var18 = var15 * this.field_30971;

               for (int var22 = 0; var22 < this.field_30979; var22++) {
                  int var31 = var22 * this.field_30969 + var18;
                  var7[var22] = var2[var31];
                  var7[this.field_30979 + var22] = var2[var31 + 1];
               }

               this.field_30975.method_31276(var7, 0);
               this.field_30975.method_31276(var7, this.field_30979);

               for (int var23 = 0; var23 < this.field_30979; var23++) {
                  int var32 = var23 * this.field_30969 + var18;
                  var2[var32] = var7[var23];
                  var2[var32 + 1] = var7[this.field_30979 + var23];
               }
            }
         }
      } else {
         for (int var16 = 0; var16 < this.field_30982; var16++) {
            int var19 = var16 * this.field_30971;

            for (byte var24 = 0; var24 < this.field_30970; var24 += 4) {
               for (int var26 = 0; var26 < this.field_30979; var26++) {
                  int var33 = var26 * this.field_30969 + var19 + var24;
                  int var36 = this.field_30979 + var26;
                  var7[var26] = var2[var33];
                  var7[var36] = var2[var33 + 1];
                  var7[var36 + this.field_30979] = var2[var33 + 2];
                  var7[var36 + 2 * this.field_30979] = var2[var33 + 3];
               }

               this.field_30975.method_31276(var7, 0);
               this.field_30975.method_31276(var7, this.field_30979);
               this.field_30975.method_31276(var7, 2 * this.field_30979);
               this.field_30975.method_31276(var7, 3 * this.field_30979);

               for (int var27 = 0; var27 < this.field_30979; var27++) {
                  int var34 = var27 * this.field_30969 + var19 + var24;
                  int var37 = this.field_30979 + var27;
                  var2[var34] = var7[var27];
                  var2[var34 + 1] = var7[var37];
                  var2[var34 + 2] = var7[var37 + this.field_30979];
                  var2[var34 + 3] = var7[var37 + 2 * this.field_30979];
               }
            }
         }
      }
   }

   private void method_27667(int var1, class_1702 var2, boolean var3) {
      long var6 = 4L * this.field_30976;
      if (this.field_30974 == 2L) {
         var6 >>= 1;
      }

      class_1702 var8 = new class_1702(var6);
      if (var1 != -1) {
         if (this.field_30974 <= 2L) {
            if (this.field_30974 == 2L) {
               for (long var9 = 0L; var9 < this.field_30972; var9++) {
                  long var11 = var9 * this.field_30973;

                  for (long var13 = 0L; var13 < this.field_30976; var13++) {
                     long var17 = var13 * this.field_30978 + var11;
                     var8.method_36114(var13, var2.method_36107(var17));
                     var8.method_36114(this.field_30976 + var13, var2.method_36107(var17 + 1L));
                  }

                  this.field_30975.method_31280(var8, 0L, var3);
                  this.field_30975.method_31280(var8, this.field_30976, var3);

                  for (long var27 = 0L; var27 < this.field_30976; var27++) {
                     long var35 = var27 * this.field_30978 + var11;
                     var2.method_36114(var35, var8.method_36107(var27));
                     var2.method_36114(var35 + 1L, var8.method_36107(this.field_30976 + var27));
                  }
               }
            }
         } else {
            for (long var21 = 0L; var21 < this.field_30972; var21++) {
               long var24 = var21 * this.field_30973;

               for (long var28 = 0L; var28 < this.field_30974; var28 += 4L) {
                  for (long var15 = 0L; var15 < this.field_30976; var15++) {
                     long var36 = var15 * this.field_30978 + var24 + var28;
                     long var19 = this.field_30976 + var15;
                     var8.method_36114(var15, var2.method_36107(var36));
                     var8.method_36114(var19, var2.method_36107(var36 + 1L));
                     var8.method_36114(var19 + this.field_30976, var2.method_36107(var36 + 2L));
                     var8.method_36114(var19 + 2L * this.field_30976, var2.method_36107(var36 + 3L));
                  }

                  this.field_30975.method_31280(var8, 0L, var3);
                  this.field_30975.method_31280(var8, this.field_30976, var3);
                  this.field_30975.method_31280(var8, 2L * this.field_30976, var3);
                  this.field_30975.method_31280(var8, 3L * this.field_30976, var3);

                  for (long var32 = 0L; var32 < this.field_30976; var32++) {
                     long var37 = var32 * this.field_30978 + var24 + var28;
                     long var42 = this.field_30976 + var32;
                     var2.method_36114(var37, var8.method_36107(var32));
                     var2.method_36114(var37 + 1L, var8.method_36107(var42));
                     var2.method_36114(var37 + 2L, var8.method_36107(var42 + this.field_30976));
                     var2.method_36114(var37 + 3L, var8.method_36107(var42 + 2L * this.field_30976));
                  }
               }
            }
         }
      } else if (this.field_30974 <= 2L) {
         if (this.field_30974 == 2L) {
            for (long var22 = 0L; var22 < this.field_30972; var22++) {
               long var25 = var22 * this.field_30973;

               for (long var29 = 0L; var29 < this.field_30976; var29++) {
                  long var38 = var29 * this.field_30978 + var25;
                  var8.method_36114(var29, var2.method_36107(var38));
                  var8.method_36114(this.field_30976 + var29, var2.method_36107(var38 + 1L));
               }

               this.field_30975.method_31274(var8, 0L);
               this.field_30975.method_31274(var8, this.field_30976);

               for (long var30 = 0L; var30 < this.field_30976; var30++) {
                  long var39 = var30 * this.field_30978 + var25;
                  var2.method_36114(var39, var8.method_36107(var30));
                  var2.method_36114(var39 + 1L, var8.method_36107(this.field_30976 + var30));
               }
            }
         }
      } else {
         for (long var23 = 0L; var23 < this.field_30972; var23++) {
            long var26 = var23 * this.field_30973;

            for (long var31 = 0L; var31 < this.field_30974; var31 += 4L) {
               for (long var33 = 0L; var33 < this.field_30976; var33++) {
                  long var40 = var33 * this.field_30978 + var26 + var31;
                  long var43 = this.field_30976 + var33;
                  var8.method_36114(var33, var2.method_36107(var40));
                  var8.method_36114(var43, var2.method_36107(var40 + 1L));
                  var8.method_36114(var43 + this.field_30976, var2.method_36107(var40 + 2L));
                  var8.method_36114(var43 + 2L * this.field_30976, var2.method_36107(var40 + 3L));
               }

               this.field_30975.method_31274(var8, 0L);
               this.field_30975.method_31274(var8, this.field_30976);
               this.field_30975.method_31274(var8, 2L * this.field_30976);
               this.field_30975.method_31274(var8, 3L * this.field_30976);

               for (long var34 = 0L; var34 < this.field_30976; var34++) {
                  long var41 = var34 * this.field_30978 + var26 + var31;
                  long var44 = this.field_30976 + var34;
                  var2.method_36114(var41, var8.method_36107(var34));
                  var2.method_36114(var41 + 1L, var8.method_36107(var44));
                  var2.method_36114(var41 + 2L, var8.method_36107(var44 + this.field_30976));
                  var2.method_36114(var41 + 3L, var8.method_36107(var44 + 2L * this.field_30976));
               }
            }
         }
      }
   }

   private void method_27669(int var1, double[][][] var2, boolean var3) {
      int var6 = 4 * this.field_30979;
      if (this.field_30970 == 2) {
         var6 >>= 1;
      }

      double[] var7 = new double[var6];
      if (var1 != -1) {
         if (this.field_30970 <= 2) {
            if (this.field_30970 == 2) {
               for (int var8 = 0; var8 < this.field_30982; var8++) {
                  for (int var9 = 0; var9 < this.field_30979; var9++) {
                     var7[var9] = var2[var9][var8][0];
                     var7[this.field_30979 + var9] = var2[var9][var8][1];
                  }

                  this.field_30975.method_31282(var7, 0, var3);
                  this.field_30975.method_31282(var7, this.field_30979, var3);

                  for (int var15 = 0; var15 < this.field_30979; var15++) {
                     var2[var15][var8][0] = var7[var15];
                     var2[var15][var8][1] = var7[this.field_30979 + var15];
                  }
               }
            }
         } else {
            for (int var12 = 0; var12 < this.field_30982; var12++) {
               for (byte var16 = 0; var16 < this.field_30970; var16 += 4) {
                  for (int var10 = 0; var10 < this.field_30979; var10++) {
                     int var11 = this.field_30979 + var10;
                     var7[var10] = var2[var10][var12][var16];
                     var7[var11] = var2[var10][var12][var16 + 1];
                     var7[var11 + this.field_30979] = var2[var10][var12][var16 + 2];
                     var7[var11 + 2 * this.field_30979] = var2[var10][var12][var16 + 3];
                  }

                  this.field_30975.method_31282(var7, 0, var3);
                  this.field_30975.method_31282(var7, this.field_30979, var3);
                  this.field_30975.method_31282(var7, 2 * this.field_30979, var3);
                  this.field_30975.method_31282(var7, 3 * this.field_30979, var3);

                  for (int var20 = 0; var20 < this.field_30979; var20++) {
                     int var23 = this.field_30979 + var20;
                     var2[var20][var12][var16] = var7[var20];
                     var2[var20][var12][var16 + 1] = var7[var23];
                     var2[var20][var12][var16 + 2] = var7[var23 + this.field_30979];
                     var2[var20][var12][var16 + 3] = var7[var23 + 2 * this.field_30979];
                  }
               }
            }
         }
      } else if (this.field_30970 <= 2) {
         if (this.field_30970 == 2) {
            for (int var13 = 0; var13 < this.field_30982; var13++) {
               for (int var17 = 0; var17 < this.field_30979; var17++) {
                  var7[var17] = var2[var17][var13][0];
                  var7[this.field_30979 + var17] = var2[var17][var13][1];
               }

               this.field_30975.method_31276(var7, 0);
               this.field_30975.method_31276(var7, this.field_30979);

               for (int var18 = 0; var18 < this.field_30979; var18++) {
                  var2[var18][var13][0] = var7[var18];
                  var2[var18][var13][1] = var7[this.field_30979 + var18];
               }
            }
         }
      } else {
         for (int var14 = 0; var14 < this.field_30982; var14++) {
            for (byte var19 = 0; var19 < this.field_30970; var19 += 4) {
               for (int var21 = 0; var21 < this.field_30979; var21++) {
                  int var24 = this.field_30979 + var21;
                  var7[var21] = var2[var21][var14][var19];
                  var7[var24] = var2[var21][var14][var19 + 1];
                  var7[var24 + this.field_30979] = var2[var21][var14][var19 + 2];
                  var7[var24 + 2 * this.field_30979] = var2[var21][var14][var19 + 3];
               }

               this.field_30975.method_31276(var7, 0);
               this.field_30975.method_31276(var7, this.field_30979);
               this.field_30975.method_31276(var7, 2 * this.field_30979);
               this.field_30975.method_31276(var7, 3 * this.field_30979);

               for (int var22 = 0; var22 < this.field_30979; var22++) {
                  int var25 = this.field_30979 + var22;
                  var2[var22][var14][var19] = var7[var22];
                  var2[var22][var14][var19 + 1] = var7[var25];
                  var2[var22][var14][var19 + 2] = var7[var25 + this.field_30979];
                  var2[var22][var14][var19 + 3] = var7[var25 + 2 * this.field_30979];
               }
            }
         }
      }
   }

   private void method_27675(int var1, double[] var2, boolean var3) {
      int var6 = class_1266.method_5693() > this.field_30979 ? this.field_30979 : class_1266.method_5693();
      int var7 = 4 * this.field_30982;
      if (this.field_30970 == 2) {
         var7 >>= 1;
      }

      int var8 = var7;
      Future[] var9 = new Future[var6];

      for (int var10 = 0; var10 < var6; var10++) {
         var9[var10] = class_1266.method_5694(new class_1281(this, var8, var1, var10, var6, var2, var3));
      }

      try {
         class_1266.method_5696(var9);
      } catch (InterruptedException var12) {
         Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var12);
      } catch (ExecutionException var13) {
         Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var13);
      }
   }

   private void method_27674(int var1, class_1702 var2, boolean var3) {
      int var6 = (int)((long)class_1266.method_5693() > this.field_30976 ? this.field_30976 : (long)class_1266.method_5693());
      long var7 = 4L * this.field_30972;
      if (this.field_30974 == 2L) {
         var7 >>= 1;
      }

      long var9 = var7;
      Future[] var11 = new Future[var6];

      for (int var12 = 0; var12 < var6; var12++) {
         long var13 = (long)var12;
         var11[var12] = class_1266.method_5694(new class_6929(this, var9, var1, var13, var6, var2, var3));
      }

      try {
         class_1266.method_5696(var11);
      } catch (InterruptedException var15) {
         Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var15);
      } catch (ExecutionException var16) {
         Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var16);
      }
   }

   private void method_27676(int var1, double[][][] var2, boolean var3) {
      int var6 = class_1266.method_5693() > this.field_30979 ? this.field_30979 : class_1266.method_5693();
      int var7 = 4 * this.field_30982;
      if (this.field_30970 == 2) {
         var7 >>= 1;
      }

      int var8 = var7;
      Future[] var9 = new Future[var6];

      for (int var10 = 0; var10 < var6; var10++) {
         var9[var10] = class_1266.method_5694(new class_6289(this, var8, var1, var10, var6, var2, var3));
      }

      try {
         class_1266.method_5696(var9);
      } catch (InterruptedException var12) {
         Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var12);
      } catch (ExecutionException var13) {
         Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var13);
      }
   }

   private void method_27657(int var1, double[] var2, boolean var3) {
      int var6 = class_1266.method_5693() > this.field_30982 ? this.field_30982 : class_1266.method_5693();
      int var7 = 4 * this.field_30979;
      if (this.field_30970 == 2) {
         var7 >>= 1;
      }

      int var8 = var7;
      Future[] var9 = new Future[var6];

      for (int var10 = 0; var10 < var6; var10++) {
         var9[var10] = class_1266.method_5694(new class_6787(this, var8, var1, var10, var6, var2, var3));
      }

      try {
         class_1266.method_5696(var9);
      } catch (InterruptedException var12) {
         Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var12);
      } catch (ExecutionException var13) {
         Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var13);
      }
   }

   private void method_27656(int var1, class_1702 var2, boolean var3) {
      int var6 = (int)((long)class_1266.method_5693() > this.field_30972 ? this.field_30972 : (long)class_1266.method_5693());
      long var7 = 4L * this.field_30976;
      if (this.field_30974 == 2L) {
         var7 >>= 1;
      }

      long var9 = var7;
      Future[] var11 = new Future[var6];

      for (int var12 = 0; var12 < var6; var12++) {
         long var13 = (long)var12;
         var11[var12] = class_1266.method_5694(new class_2306(this, var9, var1, var13, var6, var2, var3));
      }

      try {
         class_1266.method_5696(var11);
      } catch (InterruptedException var15) {
         Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var15);
      } catch (ExecutionException var16) {
         Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var16);
      }
   }

   private void method_27658(int var1, double[][][] var2, boolean var3) {
      int var6 = class_1266.method_5693() > this.field_30982 ? this.field_30982 : class_1266.method_5693();
      int var7 = 4 * this.field_30979;
      if (this.field_30970 == 2) {
         var7 >>= 1;
      }

      int var8 = var7;
      Future[] var9 = new Future[var6];

      for (int var10 = 0; var10 < var6; var10++) {
         var9[var10] = class_1266.method_5694(new class_4742(this, var8, var1, var10, var6, var2, var3));
      }

      try {
         class_1266.method_5696(var9);
      } catch (InterruptedException var12) {
         Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var12);
      } catch (ExecutionException var13) {
         Logger.getLogger(class_6056.class.getName()).log(Level.SEVERE, null, var13);
      }
   }

   private void method_27682(double[] var1) {
      for (int var4 = 0; var4 <= this.field_30979 / 2; var4++) {
         int var5 = (this.field_30979 - var4) % this.field_30979;
         int var6 = var4 * this.field_30969;
         int var7 = var5 * this.field_30969;

         for (int var8 = 0; var8 <= this.field_30982 / 2; var8++) {
            int var9 = (this.field_30982 - var8) % this.field_30982;
            int var10 = var8 * this.field_30971;
            int var11 = var9 * this.field_30971;

            for (int var12 = 0; var12 <= this.field_30970 / 2; var12++) {
               int var13 = (this.field_30970 - var12) % this.field_30970;
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

   private void method_27681(class_1702 var1) {
      for (long var4 = 0L; var4 <= this.field_30976 / 2L; var4++) {
         long var6 = (this.field_30976 - var4) % this.field_30976;
         long var8 = var4 * this.field_30978;
         long var10 = var6 * this.field_30978;

         for (long var12 = 0L; var12 <= this.field_30972 / 2L; var12++) {
            long var14 = (this.field_30972 - var12) % this.field_30972;
            long var16 = var12 * this.field_30973;
            long var18 = var14 * this.field_30973;

            for (long var20 = 0L; var20 <= this.field_30974 / 2L; var20++) {
               long var22 = (this.field_30974 - var20) % this.field_30974;
               long var24 = var8 + var18 + var20;
               long var26 = var8 + var16 + var22;
               long var28 = var10 + var16 + var20;
               long var30 = var10 + var18 + var22;
               long var32 = var10 + var18 + var20;
               long var34 = var10 + var16 + var22;
               long var36 = var8 + var16 + var20;
               long var38 = var8 + var18 + var22;
               double var40 = var1.method_36107(var24);
               double var42 = var1.method_36107(var26);
               double var44 = var1.method_36107(var28);
               double var46 = var1.method_36107(var30);
               double var48 = var1.method_36107(var32);
               double var50 = var1.method_36107(var34);
               double var52 = var1.method_36107(var36);
               double var54 = var1.method_36107(var38);
               var1.method_36114(var36, (var40 + var42 + var44 - var46) / 2.0);
               var1.method_36114(var28, (var48 + var50 + var52 - var54) / 2.0);
               var1.method_36114(var24, (var52 + var54 + var48 - var50) / 2.0);
               var1.method_36114(var32, (var44 + var46 + var40 - var42) / 2.0);
               var1.method_36114(var26, (var54 + var52 + var50 - var48) / 2.0);
               var1.method_36114(var34, (var46 + var44 + var42 - var40) / 2.0);
               var1.method_36114(var38, (var42 + var40 + var46 - var44) / 2.0);
               var1.method_36114(var30, (var50 + var48 + var54 - var52) / 2.0);
            }
         }
      }
   }

   private void method_27683(double[][][] var1) {
      for (int var4 = 0; var4 <= this.field_30979 / 2; var4++) {
         int var5 = (this.field_30979 - var4) % this.field_30979;

         for (int var6 = 0; var6 <= this.field_30982 / 2; var6++) {
            int var7 = (this.field_30982 - var6) % this.field_30982;

            for (int var8 = 0; var8 <= this.field_30970 / 2; var8++) {
               int var9 = (this.field_30970 - var8) % this.field_30970;
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
}
