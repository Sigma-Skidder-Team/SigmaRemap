package mapped;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Class9186 {
   private int field42188;
   private int field42189;
   private long field42190;
   private long field42191;
   private Class9049 field42192;
   private Class9049 field42193;
   private boolean field42194 = false;
   private boolean field42195 = false;

   public Class9186(long var1, long var3) {
      if (var1 > 1L && var3 > 1L) {
         this.field42188 = (int)var1;
         this.field42189 = (int)var3;
         this.field42190 = var1;
         this.field42191 = var3;
         if (var1 * var3 >= Class7796.method25893()) {
            this.field42195 = true;
         }

         if (Class7796.method25908(var1) && Class7796.method25908(var3)) {
            this.field42194 = true;
         }

         Class7796.method25902(var1 * var3 > (long)Class2373.method9693());
         this.field42193 = new Class9049(var1);
         if (var1 != var3) {
            this.field42192 = new Class9049(var3);
         } else {
            this.field42192 = this.field42193;
         }
      } else {
         throw new IllegalArgumentException("rows and columns must be greater than 1");
      }
   }

   public void method34363(double[] var1) {
      int var4 = Class7008.method21726();
      if (this.field42194) {
         if (var4 > 1 && this.field42195) {
            this.method34369(-1, var1, true);
            this.method34372(-1, var1, true);
         } else {
            this.method34375(-1, var1, true);

            for (int var5 = 0; var5 < this.field42188; var5++) {
               this.field42192.method33648(var1, var5 * this.field42189);
            }
         }

         this.method34378(var1);
      } else {
         if (var4 > 1 && this.field42195 && this.field42188 >= var4 && this.field42189 >= var4) {
            Future[] var16 = new Future[var4];
            int var17 = this.field42188 / var4;

            for (int var20 = 0; var20 < var4; var20++) {
               int var8 = var20 * var17;
               int var9 = var20 == var4 - 1 ? this.field42188 : var8 + var17;
               var16[var20] = Class7008.method21729(new Class481(this, var8, var9, var1));
            }

            try {
               Class7008.method21730(var16);
            } catch (InterruptedException var12) {
               Logger.getLogger(Class9186.class.getName()).log(Level.SEVERE, null, var12);
            } catch (ExecutionException var13) {
               Logger.getLogger(Class9186.class.getName()).log(Level.SEVERE, null, var13);
            }

            var17 = this.field42189 / var4;

            for (int var21 = 0; var21 < var4; var21++) {
               int var22 = var21 * var17;
               int var23 = var21 == var4 - 1 ? this.field42189 : var22 + var17;
               var16[var21] = Class7008.method21729(new Class749(this, var22, var23, var1));
            }

            try {
               Class7008.method21730(var16);
            } catch (InterruptedException var10) {
               Logger.getLogger(Class9186.class.getName()).log(Level.SEVERE, null, var10);
            } catch (ExecutionException var11) {
               Logger.getLogger(Class9186.class.getName()).log(Level.SEVERE, null, var11);
            }
         } else {
            for (int var14 = 0; var14 < this.field42188; var14++) {
               this.field42192.method33648(var1, var14 * this.field42189);
            }

            double[] var15 = new double[this.field42188];

            for (int var6 = 0; var6 < this.field42189; var6++) {
               for (int var7 = 0; var7 < this.field42188; var7++) {
                  var15[var7] = var1[var7 * this.field42189 + var6];
               }

               this.field42193.method33646(var15);

               for (int var19 = 0; var19 < this.field42188; var19++) {
                  var1[var19 * this.field42189 + var6] = var15[var19];
               }
            }
         }

         this.method34378(var1);
      }
   }

   public void method34364(Class2381 var1) {
      int var4 = Class7008.method21726();
      if (this.field42194) {
         if (var4 > 1 && this.field42195) {
            this.method34370(-1, var1, true);
            this.method34373(-1, var1, true);
         } else {
            this.method34376(-1, var1, true);

            for (long var5 = 0L; var5 < this.field42190; var5++) {
               this.field42192.method33649(var1, var5 * this.field42191);
            }
         }

         this.method34379(var1);
      } else {
         if (var4 > 1 && this.field42195 && this.field42190 >= (long)var4 && this.field42191 >= (long)var4) {
            Future[] var22 = new Future[var4];
            long var23 = this.field42190 / (long)var4;

            for (int var10 = 0; var10 < var4; var10++) {
               long var11 = (long)var10 * var23;
               long var13 = var10 == var4 - 1 ? this.field42190 : var11 + var23;
               var22[var10] = Class7008.method21729(new Class339(this, var11, var13, var1));
            }

            try {
               Class7008.method21730(var22);
            } catch (InterruptedException var19) {
               Logger.getLogger(Class9186.class.getName()).log(Level.SEVERE, null, var19);
            } catch (ExecutionException var20) {
               Logger.getLogger(Class9186.class.getName()).log(Level.SEVERE, null, var20);
            }

            var23 = this.field42191 / (long)var4;

            for (int var25 = 0; var25 < var4; var25++) {
               long var26 = (long)var25 * var23;
               long var27 = var25 == var4 - 1 ? this.field42191 : var26 + var23;
               var22[var25] = Class7008.method21729(new Class454(this, var26, var27, var1));
            }

            try {
               Class7008.method21730(var22);
            } catch (InterruptedException var17) {
               Logger.getLogger(Class9186.class.getName()).log(Level.SEVERE, null, var17);
            } catch (ExecutionException var18) {
               Logger.getLogger(Class9186.class.getName()).log(Level.SEVERE, null, var18);
            }
         } else {
            for (long var21 = 0L; var21 < this.field42190; var21++) {
               this.field42192.method33649(var1, var21 * this.field42191);
            }

            Class2381 var7 = new Class2381(this.field42190, false);

            for (long var8 = 0L; var8 < this.field42191; var8++) {
               for (long var15 = 0L; var15 < this.field42190; var15++) {
                  var7.method9687(var15, var1.method9653(var15 * this.field42191 + var8));
               }

               this.field42193.method33647(var7);

               for (long var28 = 0L; var28 < this.field42190; var28++) {
                  var1.method9687(var28 * this.field42191 + var8, var7.method9653(var28));
               }
            }
         }

         this.method34379(var1);
      }
   }

   public void method34365(double[][] var1) {
      int var4 = Class7008.method21726();
      if (this.field42194) {
         if (var4 > 1 && this.field42195) {
            this.method34371(-1, var1, true);
            this.method34374(-1, var1, true);
         } else {
            this.method34377(-1, var1, true);

            for (int var5 = 0; var5 < this.field42188; var5++) {
               this.field42192.method33646(var1[var5]);
            }
         }

         this.method34380(var1);
      } else {
         if (var4 > 1 && this.field42195 && this.field42188 >= var4 && this.field42189 >= var4) {
            Future[] var16 = new Future[var4];
            int var17 = this.field42188 / var4;

            for (int var20 = 0; var20 < var4; var20++) {
               int var8 = var20 * var17;
               int var9 = var20 == var4 - 1 ? this.field42188 : var8 + var17;
               var16[var20] = Class7008.method21729(new Class393(this, var8, var9, var1));
            }

            try {
               Class7008.method21730(var16);
            } catch (InterruptedException var12) {
               Logger.getLogger(Class9186.class.getName()).log(Level.SEVERE, null, var12);
            } catch (ExecutionException var13) {
               Logger.getLogger(Class9186.class.getName()).log(Level.SEVERE, null, var13);
            }

            var17 = this.field42189 / var4;

            for (int var21 = 0; var21 < var4; var21++) {
               int var22 = var21 * var17;
               int var23 = var21 == var4 - 1 ? this.field42189 : var22 + var17;
               var16[var21] = Class7008.method21729(new Class446(this, var22, var23, var1));
            }

            try {
               Class7008.method21730(var16);
            } catch (InterruptedException var10) {
               Logger.getLogger(Class9186.class.getName()).log(Level.SEVERE, null, var10);
            } catch (ExecutionException var11) {
               Logger.getLogger(Class9186.class.getName()).log(Level.SEVERE, null, var11);
            }
         } else {
            for (int var14 = 0; var14 < this.field42188; var14++) {
               this.field42192.method33646(var1[var14]);
            }

            double[] var15 = new double[this.field42188];

            for (int var6 = 0; var6 < this.field42189; var6++) {
               for (int var7 = 0; var7 < this.field42188; var7++) {
                  var15[var7] = var1[var7][var6];
               }

               this.field42193.method33646(var15);

               for (int var19 = 0; var19 < this.field42188; var19++) {
                  var1[var19][var6] = var15[var19];
               }
            }
         }

         this.method34380(var1);
      }
   }

   public void method34366(double[] var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field42194) {
         if (var5 > 1 && this.field42195) {
            this.method34369(1, var1, var2);
            this.method34372(1, var1, var2);
         } else {
            this.method34375(1, var1, var2);

            for (int var6 = 0; var6 < this.field42188; var6++) {
               this.field42192.method33652(var1, var6 * this.field42189, var2);
            }
         }

         this.method34378(var1);
      } else {
         if (var5 > 1 && this.field42195 && this.field42188 >= var5 && this.field42189 >= var5) {
            Future[] var17 = new Future[var5];
            int var18 = this.field42188 / var5;

            for (int var21 = 0; var21 < var5; var21++) {
               int var9 = var21 * var18;
               int var10 = var21 == var5 - 1 ? this.field42188 : var9 + var18;
               var17[var21] = Class7008.method21729(new Class1511(this, var9, var10, var1, var2));
            }

            try {
               Class7008.method21730(var17);
            } catch (InterruptedException var13) {
               Logger.getLogger(Class9186.class.getName()).log(Level.SEVERE, null, var13);
            } catch (ExecutionException var14) {
               Logger.getLogger(Class9186.class.getName()).log(Level.SEVERE, null, var14);
            }

            var18 = this.field42189 / var5;

            for (int var22 = 0; var22 < var5; var22++) {
               int var23 = var22 * var18;
               int var24 = var22 == var5 - 1 ? this.field42189 : var23 + var18;
               var17[var22] = Class7008.method21729(new Class1418(this, var23, var24, var1, var2));
            }

            try {
               Class7008.method21730(var17);
            } catch (InterruptedException var11) {
               Logger.getLogger(Class9186.class.getName()).log(Level.SEVERE, null, var11);
            } catch (ExecutionException var12) {
               Logger.getLogger(Class9186.class.getName()).log(Level.SEVERE, null, var12);
            }
         } else {
            for (int var15 = 0; var15 < this.field42188; var15++) {
               this.field42192.method33652(var1, var15 * this.field42189, var2);
            }

            double[] var16 = new double[this.field42188];

            for (int var7 = 0; var7 < this.field42189; var7++) {
               for (int var8 = 0; var8 < this.field42188; var8++) {
                  var16[var8] = var1[var8 * this.field42189 + var7];
               }

               this.field42193.method33650(var16, var2);

               for (int var20 = 0; var20 < this.field42188; var20++) {
                  var1[var20 * this.field42189 + var7] = var16[var20];
               }
            }
         }

         this.method34378(var1);
      }
   }

   public void method34367(Class2381 var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field42194) {
         if (var5 > 1 && this.field42195) {
            this.method34370(1, var1, var2);
            this.method34373(1, var1, var2);
         } else {
            this.method34376(1, var1, var2);

            for (long var6 = 0L; var6 < this.field42190; var6++) {
               this.field42192.method33653(var1, var6 * this.field42191, var2);
            }
         }

         this.method34379(var1);
      } else {
         if (var5 > 1 && this.field42195 && this.field42190 >= (long)var5 && this.field42191 >= (long)var5) {
            Future[] var23 = new Future[var5];
            long var24 = this.field42190 / (long)var5;

            for (int var11 = 0; var11 < var5; var11++) {
               long var12 = (long)var11 * var24;
               long var14 = var11 == var5 - 1 ? this.field42190 : var12 + var24;
               var23[var11] = Class7008.method21729(new Class1455(this, var12, var14, var1, var2));
            }

            try {
               Class7008.method21730(var23);
            } catch (InterruptedException var20) {
               Logger.getLogger(Class9186.class.getName()).log(Level.SEVERE, null, var20);
            } catch (ExecutionException var21) {
               Logger.getLogger(Class9186.class.getName()).log(Level.SEVERE, null, var21);
            }

            var24 = this.field42191 / (long)var5;

            for (int var26 = 0; var26 < var5; var26++) {
               long var27 = (long)var26 * var24;
               long var28 = var26 == var5 - 1 ? this.field42191 : var27 + var24;
               var23[var26] = Class7008.method21729(new Class1429(this, var27, var28, var1, var2));
            }

            try {
               Class7008.method21730(var23);
            } catch (InterruptedException var18) {
               Logger.getLogger(Class9186.class.getName()).log(Level.SEVERE, null, var18);
            } catch (ExecutionException var19) {
               Logger.getLogger(Class9186.class.getName()).log(Level.SEVERE, null, var19);
            }
         } else {
            for (long var22 = 0L; var22 < this.field42190; var22++) {
               this.field42192.method33653(var1, var22 * this.field42191, var2);
            }

            Class2381 var8 = new Class2381(this.field42190, false);

            for (long var9 = 0L; var9 < this.field42191; var9++) {
               for (long var16 = 0L; var16 < this.field42190; var16++) {
                  var8.method9687(var16, var1.method9653(var16 * this.field42191 + var9));
               }

               this.field42193.method33651(var8, var2);

               for (long var29 = 0L; var29 < this.field42190; var29++) {
                  var1.method9687(var29 * this.field42191 + var9, var8.method9653(var29));
               }
            }
         }

         this.method34379(var1);
      }
   }

   public void method34368(double[][] var1, boolean var2) {
      int var5 = Class7008.method21726();
      if (this.field42194) {
         if (var5 > 1 && this.field42195) {
            this.method34371(1, var1, var2);
            this.method34374(1, var1, var2);
         } else {
            this.method34377(1, var1, var2);

            for (int var6 = 0; var6 < this.field42188; var6++) {
               this.field42192.method33650(var1[var6], var2);
            }
         }

         this.method34380(var1);
      } else {
         if (var5 > 1 && this.field42195 && this.field42188 >= var5 && this.field42189 >= var5) {
            Future[] var17 = new Future[var5];
            int var18 = this.field42188 / var5;

            for (int var21 = 0; var21 < var5; var21++) {
               int var9 = var21 * var18;
               int var10 = var21 == var5 - 1 ? this.field42188 : var9 + var18;
               var17[var21] = Class7008.method21729(new Class638(this, var9, var10, var1, var2));
            }

            try {
               Class7008.method21730(var17);
            } catch (InterruptedException var13) {
               Logger.getLogger(Class9186.class.getName()).log(Level.SEVERE, null, var13);
            } catch (ExecutionException var14) {
               Logger.getLogger(Class9186.class.getName()).log(Level.SEVERE, null, var14);
            }

            var18 = this.field42189 / var5;

            for (int var22 = 0; var22 < var5; var22++) {
               int var23 = var22 * var18;
               int var24 = var22 == var5 - 1 ? this.field42189 : var23 + var18;
               var17[var22] = Class7008.method21729(new Class648(this, var23, var24, var1, var2));
            }

            try {
               Class7008.method21730(var17);
            } catch (InterruptedException var11) {
               Logger.getLogger(Class9186.class.getName()).log(Level.SEVERE, null, var11);
            } catch (ExecutionException var12) {
               Logger.getLogger(Class9186.class.getName()).log(Level.SEVERE, null, var12);
            }
         } else {
            for (int var15 = 0; var15 < this.field42188; var15++) {
               this.field42192.method33650(var1[var15], var2);
            }

            double[] var16 = new double[this.field42188];

            for (int var7 = 0; var7 < this.field42189; var7++) {
               for (int var8 = 0; var8 < this.field42188; var8++) {
                  var16[var8] = var1[var8][var7];
               }

               this.field42193.method33650(var16, var2);

               for (int var20 = 0; var20 < this.field42188; var20++) {
                  var1[var20][var7] = var16[var20];
               }
            }
         }

         this.method34380(var1);
      }
   }

   private void method34369(int var1, double[] var2, boolean var3) {
      int var6 = Class9044.method33603(this.field42189, Class7008.method21726());
      int var7 = 4 * this.field42188;
      if (this.field42189 == 2) {
         var7 >>= 1;
      } else if (this.field42189 < 2) {
         var7 >>= 2;
      }

      int var8 = var7;
      int var9 = var6;
      Future[] var10 = new Future[var6];

      for (int var11 = 0; var11 < var9; var11++) {
         var10[var11] = Class7008.method21729(new Class690(this, var8, var1, var11, var9, var2, var3));
      }

      try {
         Class7008.method21730(var10);
      } catch (InterruptedException var13) {
         Logger.getLogger(Class9186.class.getName()).log(Level.SEVERE, null, var13);
      } catch (ExecutionException var14) {
         Logger.getLogger(Class9186.class.getName()).log(Level.SEVERE, null, var14);
      }
   }

   private void method34370(int var1, Class2381 var2, boolean var3) {
      int var6 = (int)Class9044.method33604(this.field42191, (long)Class7008.method21726());
      long var7 = 4L * this.field42190;
      if (this.field42191 == 2L) {
         var7 >>= 1;
      } else if (this.field42191 < 2L) {
         var7 >>= 2;
      }

      long var9 = var7;
      int var11 = var6;
      Future[] var12 = new Future[var6];

      for (int var13 = 0; var13 < var11; var13++) {
         long var14 = (long)var13;
         var12[var13] = Class7008.method21729(new Class460(this, var9, var1, var14, var11, var2, var3));
      }

      try {
         Class7008.method21730(var12);
      } catch (InterruptedException var16) {
         Logger.getLogger(Class9186.class.getName()).log(Level.SEVERE, null, var16);
      } catch (ExecutionException var17) {
         Logger.getLogger(Class9186.class.getName()).log(Level.SEVERE, null, var17);
      }
   }

   private void method34371(int var1, double[][] var2, boolean var3) {
      int var6 = Class9044.method33603(this.field42189, Class7008.method21726());
      int var7 = 4 * this.field42188;
      if (this.field42189 == 2) {
         var7 >>= 1;
      } else if (this.field42189 < 2) {
         var7 >>= 2;
      }

      int var8 = var7;
      int var9 = var6;
      Future[] var10 = new Future[var6];

      for (int var11 = 0; var11 < var9; var11++) {
         var10[var11] = Class7008.method21729(new Class613(this, var8, var1, var11, var9, var2, var3));
      }

      try {
         Class7008.method21730(var10);
      } catch (InterruptedException var13) {
         Logger.getLogger(Class9186.class.getName()).log(Level.SEVERE, null, var13);
      } catch (ExecutionException var14) {
         Logger.getLogger(Class9186.class.getName()).log(Level.SEVERE, null, var14);
      }
   }

   private void method34372(int var1, double[] var2, boolean var3) {
      int var6 = Class7008.method21726() > this.field42188 ? this.field42188 : Class7008.method21726();
      Future[] var7 = new Future[var6];

      for (int var8 = 0; var8 < var6; var8++) {
         var7[var8] = Class7008.method21729(new Class409(this, var1, var8, var6, var2, var3));
      }

      try {
         Class7008.method21730(var7);
      } catch (InterruptedException var10) {
         Logger.getLogger(Class9186.class.getName()).log(Level.SEVERE, null, var10);
      } catch (ExecutionException var11) {
         Logger.getLogger(Class9186.class.getName()).log(Level.SEVERE, null, var11);
      }
   }

   private void method34373(int var1, Class2381 var2, boolean var3) {
      int var6 = (int)((long)Class7008.method21726() > this.field42190 ? this.field42190 : (long)Class7008.method21726());
      Future[] var7 = new Future[var6];

      for (int var8 = 0; var8 < var6; var8++) {
         long var9 = (long)var8;
         var7[var8] = Class7008.method21729(new Class516(this, var1, var9, var6, var2, var3));
      }

      try {
         Class7008.method21730(var7);
      } catch (InterruptedException var11) {
         Logger.getLogger(Class9186.class.getName()).log(Level.SEVERE, null, var11);
      } catch (ExecutionException var12) {
         Logger.getLogger(Class9186.class.getName()).log(Level.SEVERE, null, var12);
      }
   }

   private void method34374(int var1, double[][] var2, boolean var3) {
      int var6 = Class7008.method21726() > this.field42188 ? this.field42188 : Class7008.method21726();
      Future[] var7 = new Future[var6];

      for (int var8 = 0; var8 < var6; var8++) {
         var7[var8] = Class7008.method21729(new Class610(this, var1, var8, var6, var2, var3));
      }

      try {
         Class7008.method21730(var7);
      } catch (InterruptedException var10) {
         Logger.getLogger(Class9186.class.getName()).log(Level.SEVERE, null, var10);
      } catch (ExecutionException var11) {
         Logger.getLogger(Class9186.class.getName()).log(Level.SEVERE, null, var11);
      }
   }

   private void method34375(int var1, double[] var2, boolean var3) {
      int var6 = 4 * this.field42188;
      if (this.field42189 != 2) {
         if (this.field42189 < 2) {
            var6 >>= 2;
         }
      } else {
         var6 >>= 1;
      }

      double[] var7 = new double[var6];
      if (this.field42189 <= 2) {
         if (this.field42189 == 2) {
            for (int var8 = 0; var8 < this.field42188; var8++) {
               int var10 = var8 * this.field42189;
               var7[var8] = var2[var10];
               var7[this.field42188 + var8] = var2[var10 + 1];
            }

            if (var1 != -1) {
               this.field42193.method33652(var7, 0, var3);
               this.field42193.method33652(var7, this.field42188, var3);
            } else {
               this.field42193.method33648(var7, 0);
               this.field42193.method33648(var7, this.field42188);
            }

            for (int var12 = 0; var12 < this.field42188; var12++) {
               int var18 = var12 * this.field42189;
               var2[var18] = var7[var12];
               var2[var18 + 1] = var7[this.field42188 + var12];
            }
         }
      } else if (var1 != -1) {
         for (int var13 = 0; var13 < this.field42189; var13 += 4) {
            for (int var9 = 0; var9 < this.field42188; var9++) {
               int var19 = var9 * this.field42189 + var13;
               int var11 = this.field42188 + var9;
               var7[var9] = var2[var19];
               var7[var11] = var2[var19 + 1];
               var7[var11 + this.field42188] = var2[var19 + 2];
               var7[var11 + 2 * this.field42188] = var2[var19 + 3];
            }

            this.field42193.method33652(var7, 0, var3);
            this.field42193.method33652(var7, this.field42188, var3);
            this.field42193.method33652(var7, 2 * this.field42188, var3);
            this.field42193.method33652(var7, 3 * this.field42188, var3);

            for (int var15 = 0; var15 < this.field42188; var15++) {
               int var20 = var15 * this.field42189 + var13;
               int var23 = this.field42188 + var15;
               var2[var20] = var7[var15];
               var2[var20 + 1] = var7[var23];
               var2[var20 + 2] = var7[var23 + this.field42188];
               var2[var20 + 3] = var7[var23 + 2 * this.field42188];
            }
         }
      } else {
         for (int var14 = 0; var14 < this.field42189; var14 += 4) {
            for (int var16 = 0; var16 < this.field42188; var16++) {
               int var21 = var16 * this.field42189 + var14;
               int var24 = this.field42188 + var16;
               var7[var16] = var2[var21];
               var7[var24] = var2[var21 + 1];
               var7[var24 + this.field42188] = var2[var21 + 2];
               var7[var24 + 2 * this.field42188] = var2[var21 + 3];
            }

            this.field42193.method33648(var7, 0);
            this.field42193.method33648(var7, this.field42188);
            this.field42193.method33648(var7, 2 * this.field42188);
            this.field42193.method33648(var7, 3 * this.field42188);

            for (int var17 = 0; var17 < this.field42188; var17++) {
               int var22 = var17 * this.field42189 + var14;
               int var25 = this.field42188 + var17;
               var2[var22] = var7[var17];
               var2[var22 + 1] = var7[var25];
               var2[var22 + 2] = var7[var25 + this.field42188];
               var2[var22 + 3] = var7[var25 + 2 * this.field42188];
            }
         }
      }
   }

   private void method34376(int var1, Class2381 var2, boolean var3) {
      long var6 = 4L * this.field42190;
      if (this.field42191 != 2L) {
         if (this.field42191 < 2L) {
            var6 >>= 2;
         }
      } else {
         var6 >>= 1;
      }

      Class2381 var8 = new Class2381(var6);
      if (this.field42191 <= 2L) {
         if (this.field42191 == 2L) {
            for (long var9 = 0L; var9 < this.field42190; var9++) {
               long var13 = var9 * this.field42191;
               var8.method9687(var9, var2.method9653(var13));
               var8.method9687(this.field42190 + var9, var2.method9653(var13 + 1L));
            }

            if (var1 != -1) {
               this.field42193.method33653(var8, 0L, var3);
               this.field42193.method33653(var8, this.field42190, var3);
            } else {
               this.field42193.method33649(var8, 0L);
               this.field42193.method33649(var8, this.field42190);
            }

            for (long var17 = 0L; var17 < this.field42190; var17++) {
               long var23 = var17 * this.field42191;
               var2.method9687(var23, var8.method9653(var17));
               var2.method9687(var23 + 1L, var8.method9653(this.field42190 + var17));
            }
         }
      } else if (var1 != -1) {
         for (long var18 = 0L; var18 < this.field42191; var18 += 4L) {
            for (long var11 = 0L; var11 < this.field42190; var11++) {
               long var24 = var11 * this.field42191 + var18;
               long var15 = this.field42190 + var11;
               var8.method9687(var11, var2.method9653(var24));
               var8.method9687(var15, var2.method9653(var24 + 1L));
               var8.method9687(var15 + this.field42190, var2.method9653(var24 + 2L));
               var8.method9687(var15 + 2L * this.field42190, var2.method9653(var24 + 3L));
            }

            this.field42193.method33653(var8, 0L, var3);
            this.field42193.method33653(var8, this.field42190, var3);
            this.field42193.method33653(var8, 2L * this.field42190, var3);
            this.field42193.method33653(var8, 3L * this.field42190, var3);

            for (long var20 = 0L; var20 < this.field42190; var20++) {
               long var25 = var20 * this.field42191 + var18;
               long var28 = this.field42190 + var20;
               var2.method9687(var25, var8.method9653(var20));
               var2.method9687(var25 + 1L, var8.method9653(var28));
               var2.method9687(var25 + 2L, var8.method9653(var28 + this.field42190));
               var2.method9687(var25 + 3L, var8.method9653(var28 + 2L * this.field42190));
            }
         }
      } else {
         for (long var19 = 0L; var19 < this.field42191; var19 += 4L) {
            for (long var21 = 0L; var21 < this.field42190; var21++) {
               long var26 = var21 * this.field42191 + var19;
               long var29 = this.field42190 + var21;
               var8.method9687(var21, var2.method9653(var26));
               var8.method9687(var29, var2.method9653(var26 + 1L));
               var8.method9687(var29 + this.field42190, var2.method9653(var26 + 2L));
               var8.method9687(var29 + 2L * this.field42190, var2.method9653(var26 + 3L));
            }

            this.field42193.method33649(var8, 0L);
            this.field42193.method33649(var8, this.field42190);
            this.field42193.method33649(var8, 2L * this.field42190);
            this.field42193.method33649(var8, 3L * this.field42190);

            for (long var22 = 0L; var22 < this.field42190; var22++) {
               long var27 = var22 * this.field42191 + var19;
               long var30 = this.field42190 + var22;
               var2.method9687(var27, var8.method9653(var22));
               var2.method9687(var27 + 1L, var8.method9653(var30));
               var2.method9687(var27 + 2L, var8.method9653(var30 + this.field42190));
               var2.method9687(var27 + 3L, var8.method9653(var30 + 2L * this.field42190));
            }
         }
      }
   }

   private void method34377(int var1, double[][] var2, boolean var3) {
      int var6 = 4 * this.field42188;
      if (this.field42189 != 2) {
         if (this.field42189 < 2) {
            var6 >>= 2;
         }
      } else {
         var6 >>= 1;
      }

      double[] var7 = new double[var6];
      if (this.field42189 <= 2) {
         if (this.field42189 == 2) {
            for (int var8 = 0; var8 < this.field42188; var8++) {
               var7[var8] = var2[var8][0];
               var7[this.field42188 + var8] = var2[var8][1];
            }

            if (var1 != -1) {
               this.field42193.method33652(var7, 0, var3);
               this.field42193.method33652(var7, this.field42188, var3);
            } else {
               this.field42193.method33648(var7, 0);
               this.field42193.method33648(var7, this.field42188);
            }

            for (int var11 = 0; var11 < this.field42188; var11++) {
               var2[var11][0] = var7[var11];
               var2[var11][1] = var7[this.field42188 + var11];
            }
         }
      } else if (var1 != -1) {
         for (int var12 = 0; var12 < this.field42189; var12 += 4) {
            for (int var9 = 0; var9 < this.field42188; var9++) {
               int var10 = this.field42188 + var9;
               var7[var9] = var2[var9][var12];
               var7[var10] = var2[var9][var12 + 1];
               var7[var10 + this.field42188] = var2[var9][var12 + 2];
               var7[var10 + 2 * this.field42188] = var2[var9][var12 + 3];
            }

            this.field42193.method33652(var7, 0, var3);
            this.field42193.method33652(var7, this.field42188, var3);
            this.field42193.method33652(var7, 2 * this.field42188, var3);
            this.field42193.method33652(var7, 3 * this.field42188, var3);

            for (int var14 = 0; var14 < this.field42188; var14++) {
               int var17 = this.field42188 + var14;
               var2[var14][var12] = var7[var14];
               var2[var14][var12 + 1] = var7[var17];
               var2[var14][var12 + 2] = var7[var17 + this.field42188];
               var2[var14][var12 + 3] = var7[var17 + 2 * this.field42188];
            }
         }
      } else {
         for (int var13 = 0; var13 < this.field42189; var13 += 4) {
            for (int var15 = 0; var15 < this.field42188; var15++) {
               int var18 = this.field42188 + var15;
               var7[var15] = var2[var15][var13];
               var7[var18] = var2[var15][var13 + 1];
               var7[var18 + this.field42188] = var2[var15][var13 + 2];
               var7[var18 + 2 * this.field42188] = var2[var15][var13 + 3];
            }

            this.field42193.method33648(var7, 0);
            this.field42193.method33648(var7, this.field42188);
            this.field42193.method33648(var7, 2 * this.field42188);
            this.field42193.method33648(var7, 3 * this.field42188);

            for (int var16 = 0; var16 < this.field42188; var16++) {
               int var19 = this.field42188 + var16;
               var2[var16][var13] = var7[var16];
               var2[var16][var13 + 1] = var7[var19];
               var2[var16][var13 + 2] = var7[var19 + this.field42188];
               var2[var16][var13 + 3] = var7[var19 + 2 * this.field42188];
            }
         }
      }
   }

   private void method34378(double[] var1) {
      for (int var4 = 0; var4 <= this.field42188 / 2; var4++) {
         int var5 = (this.field42188 - var4) % this.field42188;
         int var6 = var4 * this.field42189;
         int var7 = var5 * this.field42189;

         for (int var8 = 0; var8 <= this.field42189 / 2; var8++) {
            int var9 = (this.field42189 - var8) % this.field42189;
            double var10 = var1[var6 + var8];
            double var12 = var1[var7 + var8];
            double var14 = var1[var6 + var9];
            double var16 = var1[var7 + var9];
            double var18 = (var10 + var16 - (var12 + var14)) / 2.0;
            var1[var6 + var8] = var10 - var18;
            var1[var7 + var8] = var12 + var18;
            var1[var6 + var9] = var14 + var18;
            var1[var7 + var9] = var16 - var18;
         }
      }
   }

   private void method34379(Class2381 var1) {
      for (long var4 = 0L; var4 <= this.field42190 / 2L; var4++) {
         long var6 = (this.field42190 - var4) % this.field42190;
         long var8 = var4 * this.field42191;
         long var10 = var6 * this.field42191;

         for (long var12 = 0L; var12 <= this.field42191 / 2L; var12++) {
            long var14 = (this.field42191 - var12) % this.field42191;
            double var16 = var1.method9653(var8 + var12);
            double var18 = var1.method9653(var10 + var12);
            double var20 = var1.method9653(var8 + var14);
            double var22 = var1.method9653(var10 + var14);
            double var24 = (var16 + var22 - (var18 + var20)) / 2.0;
            var1.method9687(var8 + var12, var16 - var24);
            var1.method9687(var10 + var12, var18 + var24);
            var1.method9687(var8 + var14, var20 + var24);
            var1.method9687(var10 + var14, var22 - var24);
         }
      }
   }

   private void method34380(double[][] var1) {
      for (int var4 = 0; var4 <= this.field42188 / 2; var4++) {
         int var5 = (this.field42188 - var4) % this.field42188;

         for (int var6 = 0; var6 <= this.field42189 / 2; var6++) {
            int var7 = (this.field42189 - var6) % this.field42189;
            double var8 = var1[var4][var6];
            double var10 = var1[var5][var6];
            double var12 = var1[var4][var7];
            double var14 = var1[var5][var7];
            double var16 = (var8 + var14 - (var10 + var12)) / 2.0;
            var1[var4][var6] = var8 - var16;
            var1[var5][var6] = var10 + var16;
            var1[var4][var7] = var12 + var16;
            var1[var5][var7] = var14 - var16;
         }
      }
   }

   // $VF: synthetic method
   public static int method34381(Class9186 var0) {
      return var0.field42189;
   }

   // $VF: synthetic method
   public static Class9049 method34382(Class9186 var0) {
      return var0.field42192;
   }

   // $VF: synthetic method
   public static int method34383(Class9186 var0) {
      return var0.field42188;
   }

   // $VF: synthetic method
   public static Class9049 method34384(Class9186 var0) {
      return var0.field42193;
   }

   // $VF: synthetic method
   public static long method34385(Class9186 var0) {
      return var0.field42191;
   }

   // $VF: synthetic method
   public static long method34386(Class9186 var0) {
      return var0.field42190;
   }
}
