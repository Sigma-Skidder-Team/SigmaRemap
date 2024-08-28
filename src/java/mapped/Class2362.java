package mapped;

import java.io.Serializable;

public class Class2362 implements Serializable, Cloneable {
   public static final long field16178 = 2777097312029690941L;
   private static final boolean field16179 = false;
   public int field16180;
   public int field16181;
   public double[][] field16182;
   private static final double field16183 = 1.0E-10;

   public Class2362(int var1, int var2) {
      this.field16182 = new double[var1][var2];
      this.field16180 = var1;
      this.field16181 = var2;

      for (int var5 = 0; var5 < var1; var5++) {
         for (int var7 = 0; var7 < var2; var7++) {
            this.field16182[var5][var7] = 0.0;
         }
      }

      int var6;
      if (var1 >= var2) {
         var6 = var2;
      } else {
         var6 = var1;
      }

      for (int var8 = 0; var8 < var6; var8++) {
         this.field16182[var8][var8] = 1.0;
      }
   }

   public Class2362(int var1, int var2, double[] var3) {
      this.field16182 = new double[var1][var2];
      this.field16180 = var1;
      this.field16181 = var2;

      for (int var6 = 0; var6 < var1; var6++) {
         for (int var7 = 0; var7 < var2; var7++) {
            this.field16182[var6][var7] = var3[var6 * var2 + var7];
         }
      }
   }

   public Class2362(Class2362 var1) {
      this.field16180 = var1.field16180;
      this.field16181 = var1.field16181;
      this.field16182 = new double[this.field16180][this.field16181];

      for (int var4 = 0; var4 < this.field16180; var4++) {
         for (int var5 = 0; var5 < this.field16181; var5++) {
            this.field16182[var4][var5] = var1.field16182[var4][var5];
         }
      }
   }

   public final void method9286(Class2362 var1) {
      if (this.field16181 == var1.field16180 && this.field16181 == var1.field16181) {
         double[][] var4 = new double[this.field16180][this.field16181];

         for (int var5 = 0; var5 < this.field16180; var5++) {
            for (int var6 = 0; var6 < this.field16181; var6++) {
               var4[var5][var6] = 0.0;

               for (int var7 = 0; var7 < this.field16181; var7++) {
                  var4[var5][var6] = var4[var5][var6] + this.field16182[var5][var7] * var1.field16182[var7][var6];
               }
            }
         }

         this.field16182 = var4;
      } else {
         throw new Class2467(Class8148.method28252("GMatrix0"));
      }
   }

   public final void method9287(Class2362 var1, Class2362 var2) {
      if (var1.field16181 == var2.field16180 && this.field16180 == var1.field16180 && this.field16181 == var2.field16181) {
         double[][] var5 = new double[this.field16180][this.field16181];

         for (int var6 = 0; var6 < var1.field16180; var6++) {
            for (int var7 = 0; var7 < var2.field16181; var7++) {
               var5[var6][var7] = 0.0;

               for (int var8 = 0; var8 < var1.field16181; var8++) {
                  var5[var6][var7] = var5[var6][var7] + var1.field16182[var6][var8] * var2.field16182[var8][var7];
               }
            }
         }

         this.field16182 = var5;
      } else {
         throw new Class2467(Class8148.method28252("GMatrix1"));
      }
   }

   public final void method9288(Class2405 var1, Class2405 var2) {
      if (this.field16180 < var1.method10097()) {
         throw new Class2467(Class8148.method28252("GMatrix2"));
      } else if (this.field16181 < var2.method10097()) {
         throw new Class2467(Class8148.method28252("GMatrix3"));
      } else {
         for (int var5 = 0; var5 < var1.method10097(); var5++) {
            for (int var6 = 0; var6 < var2.method10097(); var6++) {
               this.field16182[var5][var6] = var1.field16368[var5] * var2.field16368[var6];
            }
         }
      }
   }

   public final void method9289(Class2362 var1) {
      if (this.field16180 != var1.field16180) {
         throw new Class2467(Class8148.method28252("GMatrix4"));
      } else if (this.field16181 != var1.field16181) {
         throw new Class2467(Class8148.method28252("GMatrix5"));
      } else {
         for (int var4 = 0; var4 < this.field16180; var4++) {
            for (int var5 = 0; var5 < this.field16181; var5++) {
               this.field16182[var4][var5] = this.field16182[var4][var5] + var1.field16182[var4][var5];
            }
         }
      }
   }

   public final void method9290(Class2362 var1, Class2362 var2) {
      if (var2.field16180 == var1.field16180) {
         if (var2.field16181 != var1.field16181) {
            throw new Class2467(Class8148.method28252("GMatrix7"));
         } else if (this.field16181 == var1.field16181 && this.field16180 == var1.field16180) {
            for (int var5 = 0; var5 < this.field16180; var5++) {
               for (int var6 = 0; var6 < this.field16181; var6++) {
                  this.field16182[var5][var6] = var1.field16182[var5][var6] + var2.field16182[var5][var6];
               }
            }
         } else {
            throw new Class2467(Class8148.method28252("GMatrix8"));
         }
      } else {
         throw new Class2467(Class8148.method28252("GMatrix6"));
      }
   }

   public final void method9291(Class2362 var1) {
      if (this.field16180 != var1.field16180) {
         throw new Class2467(Class8148.method28252("GMatrix9"));
      } else if (this.field16181 != var1.field16181) {
         throw new Class2467(Class8148.method28252("GMatrix28"));
      } else {
         for (int var4 = 0; var4 < this.field16180; var4++) {
            for (int var5 = 0; var5 < this.field16181; var5++) {
               this.field16182[var4][var5] = this.field16182[var4][var5] - var1.field16182[var4][var5];
            }
         }
      }
   }

   public final void method9292(Class2362 var1, Class2362 var2) {
      if (var2.field16180 == var1.field16180) {
         if (var2.field16181 != var1.field16181) {
            throw new Class2467(Class8148.method28252("GMatrix11"));
         } else if (this.field16180 == var1.field16180 && this.field16181 == var1.field16181) {
            for (int var5 = 0; var5 < this.field16180; var5++) {
               for (int var6 = 0; var6 < this.field16181; var6++) {
                  this.field16182[var5][var6] = var1.field16182[var5][var6] - var2.field16182[var5][var6];
               }
            }
         } else {
            throw new Class2467(Class8148.method28252("GMatrix12"));
         }
      } else {
         throw new Class2467(Class8148.method28252("GMatrix10"));
      }
   }

   public final void method9293() {
      for (int var3 = 0; var3 < this.field16180; var3++) {
         for (int var4 = 0; var4 < this.field16181; var4++) {
            this.field16182[var3][var4] = -this.field16182[var3][var4];
         }
      }
   }

   public final void method9294(Class2362 var1) {
      if (this.field16180 == var1.field16180 && this.field16181 == var1.field16181) {
         for (int var4 = 0; var4 < this.field16180; var4++) {
            for (int var5 = 0; var5 < this.field16181; var5++) {
               this.field16182[var4][var5] = -var1.field16182[var4][var5];
            }
         }
      } else {
         throw new Class2467(Class8148.method28252("GMatrix13"));
      }
   }

   public final void method9295() {
      for (int var3 = 0; var3 < this.field16180; var3++) {
         for (int var5 = 0; var5 < this.field16181; var5++) {
            this.field16182[var3][var5] = 0.0;
         }
      }

      int var4;
      if (this.field16180 >= this.field16181) {
         var4 = this.field16181;
      } else {
         var4 = this.field16180;
      }

      for (int var6 = 0; var6 < var4; var6++) {
         this.field16182[var6][var6] = 1.0;
      }
   }

   public final void method9296() {
      for (int var3 = 0; var3 < this.field16180; var3++) {
         for (int var4 = 0; var4 < this.field16181; var4++) {
            this.field16182[var3][var4] = 0.0;
         }
      }
   }

   public final void method9297() {
      for (int var3 = 0; var3 < this.field16180; var3++) {
         for (int var5 = 0; var5 < this.field16181; var5++) {
            this.field16182[var3][var5] = -this.field16182[var3][var5];
         }
      }

      int var4;
      if (this.field16180 >= this.field16181) {
         var4 = this.field16181;
      } else {
         var4 = this.field16180;
      }

      for (int var6 = 0; var6 < var4; var6++) {
         this.field16182[var6][var6]++;
      }
   }

   public final void method9298() {
      this.method9337(this);
   }

   public final void method9299(Class2362 var1) {
      this.method9337(var1);
   }

   public final void method9300(int var1, int var2, int var3, int var4, int var5, int var6, Class2362 var7) {
      if (this == var7) {
         double[][] var10 = new double[var3][var4];

         for (int var11 = 0; var11 < var3; var11++) {
            for (int var12 = 0; var12 < var4; var12++) {
               var10[var11][var12] = this.field16182[var1 + var11][var2 + var12];
            }
         }

         for (int var13 = 0; var13 < var3; var13++) {
            for (int var15 = 0; var15 < var4; var15++) {
               var7.field16182[var5 + var13][var6 + var15] = var10[var13][var15];
            }
         }
      } else {
         for (int var14 = 0; var14 < var3; var14++) {
            for (int var16 = 0; var16 < var4; var16++) {
               var7.field16182[var5 + var14][var6 + var16] = this.field16182[var1 + var14][var2 + var16];
            }
         }
      }
   }

   public final void method9301(int var1, int var2) {
      double[][] var5 = new double[var1][var2];
      int var6;
      if (this.field16180 >= var1) {
         var6 = var1;
      } else {
         var6 = this.field16180;
      }

      int var7;
      if (this.field16181 >= var2) {
         var7 = var2;
      } else {
         var7 = this.field16181;
      }

      for (int var8 = 0; var8 < var6; var8++) {
         for (int var9 = 0; var9 < var7; var9++) {
            var5[var8][var9] = this.field16182[var8][var9];
         }
      }

      this.field16180 = var1;
      this.field16181 = var2;
      this.field16182 = var5;
   }

   public final void method9302(double[] var1) {
      for (int var4 = 0; var4 < this.field16180; var4++) {
         for (int var5 = 0; var5 < this.field16181; var5++) {
            this.field16182[var4][var5] = var1[this.field16181 * var4 + var5];
         }
      }
   }

   public final void method9303(Class2372 var1) {
      if (this.field16181 < 3 || this.field16180 < 3) {
         this.field16181 = 3;
         this.field16180 = 3;
         this.field16182 = new double[this.field16180][this.field16181];
      }

      this.field16182[0][0] = (double)var1.field16222;
      this.field16182[0][1] = (double)var1.field16223;
      this.field16182[0][2] = (double)var1.field16224;
      this.field16182[1][0] = (double)var1.field16225;
      this.field16182[1][1] = (double)var1.field16226;
      this.field16182[1][2] = (double)var1.field16227;
      this.field16182[2][0] = (double)var1.field16228;
      this.field16182[2][1] = (double)var1.field16229;
      this.field16182[2][2] = (double)var1.field16230;

      for (int var4 = 3; var4 < this.field16180; var4++) {
         for (int var5 = 3; var5 < this.field16181; var5++) {
            this.field16182[var4][var5] = 0.0;
         }
      }
   }

   public final void method9304(Class2363 var1) {
      if (this.field16180 < 3 || this.field16181 < 3) {
         this.field16182 = new double[3][3];
         this.field16180 = 3;
         this.field16181 = 3;
      }

      this.field16182[0][0] = var1.field16185;
      this.field16182[0][1] = var1.field16186;
      this.field16182[0][2] = var1.field16187;
      this.field16182[1][0] = var1.field16188;
      this.field16182[1][1] = var1.field16189;
      this.field16182[1][2] = var1.field16190;
      this.field16182[2][0] = var1.field16191;
      this.field16182[2][1] = var1.field16192;
      this.field16182[2][2] = var1.field16193;

      for (int var4 = 3; var4 < this.field16180; var4++) {
         for (int var5 = 3; var5 < this.field16181; var5++) {
            this.field16182[var4][var5] = 0.0;
         }
      }
   }

   public final void method9305(Class2404 var1) {
      if (this.field16180 < 4 || this.field16181 < 4) {
         this.field16182 = new double[4][4];
         this.field16180 = 4;
         this.field16181 = 4;
      }

      this.field16182[0][0] = (double)var1.field16350;
      this.field16182[0][1] = (double)var1.field16351;
      this.field16182[0][2] = (double)var1.field16352;
      this.field16182[0][3] = (double)var1.field16353;
      this.field16182[1][0] = (double)var1.field16354;
      this.field16182[1][1] = (double)var1.field16355;
      this.field16182[1][2] = (double)var1.field16356;
      this.field16182[1][3] = (double)var1.field16357;
      this.field16182[2][0] = (double)var1.field16358;
      this.field16182[2][1] = (double)var1.field16359;
      this.field16182[2][2] = (double)var1.field16360;
      this.field16182[2][3] = (double)var1.field16361;
      this.field16182[3][0] = (double)var1.field16362;
      this.field16182[3][1] = (double)var1.field16363;
      this.field16182[3][2] = (double)var1.field16364;
      this.field16182[3][3] = (double)var1.field16365;

      for (int var4 = 4; var4 < this.field16180; var4++) {
         for (int var5 = 4; var5 < this.field16181; var5++) {
            this.field16182[var4][var5] = 0.0;
         }
      }
   }

   public final void method9306(Class2417 var1) {
      if (this.field16180 < 4 || this.field16181 < 4) {
         this.field16182 = new double[4][4];
         this.field16180 = 4;
         this.field16181 = 4;
      }

      this.field16182[0][0] = var1.field16402;
      this.field16182[0][1] = var1.field16403;
      this.field16182[0][2] = var1.field16404;
      this.field16182[0][3] = var1.field16405;
      this.field16182[1][0] = var1.field16406;
      this.field16182[1][1] = var1.field16407;
      this.field16182[1][2] = var1.field16408;
      this.field16182[1][3] = var1.field16409;
      this.field16182[2][0] = var1.field16410;
      this.field16182[2][1] = var1.field16411;
      this.field16182[2][2] = var1.field16412;
      this.field16182[2][3] = var1.field16413;
      this.field16182[3][0] = var1.field16414;
      this.field16182[3][1] = var1.field16415;
      this.field16182[3][2] = var1.field16416;
      this.field16182[3][3] = var1.field16417;

      for (int var4 = 4; var4 < this.field16180; var4++) {
         for (int var5 = 4; var5 < this.field16181; var5++) {
            this.field16182[var4][var5] = 0.0;
         }
      }
   }

   public final void method9307(Class2362 var1) {
      if (this.field16180 < var1.field16180 || this.field16181 < var1.field16181) {
         this.field16180 = var1.field16180;
         this.field16181 = var1.field16181;
         this.field16182 = new double[this.field16180][this.field16181];
      }

      for (int var4 = 0; var4 < Math.min(this.field16180, var1.field16180); var4++) {
         for (int var5 = 0; var5 < Math.min(this.field16181, var1.field16181); var5++) {
            this.field16182[var4][var5] = var1.field16182[var4][var5];
         }
      }

      for (int var6 = var1.field16180; var6 < this.field16180; var6++) {
         for (int var7 = var1.field16181; var7 < this.field16181; var7++) {
            this.field16182[var6][var7] = 0.0;
         }
      }
   }

   public final int method9308() {
      return this.field16180;
   }

   public final int method9309() {
      return this.field16181;
   }

   public final double method9310(int var1, int var2) {
      return this.field16182[var1][var2];
   }

   public final void method9311(int var1, int var2, double var3) {
      this.field16182[var1][var2] = var3;
   }

   public final void method9312(int var1, double[] var2) {
      for (int var5 = 0; var5 < this.field16181; var5++) {
         var2[var5] = this.field16182[var1][var5];
      }
   }

   public final void method9313(int var1, Class2405 var2) {
      if (var2.method10097() < this.field16181) {
         var2.method10089(this.field16181);
      }

      for (int var5 = 0; var5 < this.field16181; var5++) {
         var2.field16368[var5] = this.field16182[var1][var5];
      }
   }

   public final void method9314(int var1, double[] var2) {
      for (int var5 = 0; var5 < this.field16180; var5++) {
         var2[var5] = this.field16182[var5][var1];
      }
   }

   public final void method9315(int var1, Class2405 var2) {
      if (var2.method10097() < this.field16180) {
         var2.method10089(this.field16180);
      }

      for (int var5 = 0; var5 < this.field16180; var5++) {
         var2.field16368[var5] = this.field16182[var5][var1];
      }
   }

   public final void method9316(Class2363 var1) {
      if (this.field16180 >= 3 && this.field16181 >= 3) {
         var1.field16185 = this.field16182[0][0];
         var1.field16186 = this.field16182[0][1];
         var1.field16187 = this.field16182[0][2];
         var1.field16188 = this.field16182[1][0];
         var1.field16189 = this.field16182[1][1];
         var1.field16190 = this.field16182[1][2];
         var1.field16191 = this.field16182[2][0];
         var1.field16192 = this.field16182[2][1];
         var1.field16193 = this.field16182[2][2];
      } else {
         var1.method9411();
         if (this.field16181 > 0) {
            if (this.field16180 > 0) {
               var1.field16185 = this.field16182[0][0];
               if (this.field16180 > 1) {
                  var1.field16188 = this.field16182[1][0];
                  if (this.field16180 > 2) {
                     var1.field16191 = this.field16182[2][0];
                  }
               }
            }

            if (this.field16181 > 1) {
               if (this.field16180 > 0) {
                  var1.field16186 = this.field16182[0][1];
                  if (this.field16180 > 1) {
                     var1.field16189 = this.field16182[1][1];
                     if (this.field16180 > 2) {
                        var1.field16192 = this.field16182[2][1];
                     }
                  }
               }

               if (this.field16181 > 2 && this.field16180 > 0) {
                  var1.field16187 = this.field16182[0][2];
                  if (this.field16180 > 1) {
                     var1.field16190 = this.field16182[1][2];
                     if (this.field16180 > 2) {
                        var1.field16193 = this.field16182[2][2];
                     }
                  }
               }
            }
         }
      }
   }

   public final void method9317(Class2372 var1) {
      if (this.field16180 >= 3 && this.field16181 >= 3) {
         var1.field16222 = (float)this.field16182[0][0];
         var1.field16223 = (float)this.field16182[0][1];
         var1.field16224 = (float)this.field16182[0][2];
         var1.field16225 = (float)this.field16182[1][0];
         var1.field16226 = (float)this.field16182[1][1];
         var1.field16227 = (float)this.field16182[1][2];
         var1.field16228 = (float)this.field16182[2][0];
         var1.field16229 = (float)this.field16182[2][1];
         var1.field16230 = (float)this.field16182[2][2];
      } else {
         var1.method9609();
         if (this.field16181 > 0) {
            if (this.field16180 > 0) {
               var1.field16222 = (float)this.field16182[0][0];
               if (this.field16180 > 1) {
                  var1.field16225 = (float)this.field16182[1][0];
                  if (this.field16180 > 2) {
                     var1.field16228 = (float)this.field16182[2][0];
                  }
               }
            }

            if (this.field16181 > 1) {
               if (this.field16180 > 0) {
                  var1.field16223 = (float)this.field16182[0][1];
                  if (this.field16180 > 1) {
                     var1.field16226 = (float)this.field16182[1][1];
                     if (this.field16180 > 2) {
                        var1.field16229 = (float)this.field16182[2][1];
                     }
                  }
               }

               if (this.field16181 > 2 && this.field16180 > 0) {
                  var1.field16224 = (float)this.field16182[0][2];
                  if (this.field16180 > 1) {
                     var1.field16227 = (float)this.field16182[1][2];
                     if (this.field16180 > 2) {
                        var1.field16230 = (float)this.field16182[2][2];
                     }
                  }
               }
            }
         }
      }
   }

   public final void method9318(Class2417 var1) {
      if (this.field16180 >= 4 && this.field16181 >= 4) {
         var1.field16402 = this.field16182[0][0];
         var1.field16403 = this.field16182[0][1];
         var1.field16404 = this.field16182[0][2];
         var1.field16405 = this.field16182[0][3];
         var1.field16406 = this.field16182[1][0];
         var1.field16407 = this.field16182[1][1];
         var1.field16408 = this.field16182[1][2];
         var1.field16409 = this.field16182[1][3];
         var1.field16410 = this.field16182[2][0];
         var1.field16411 = this.field16182[2][1];
         var1.field16412 = this.field16182[2][2];
         var1.field16413 = this.field16182[2][3];
         var1.field16414 = this.field16182[3][0];
         var1.field16415 = this.field16182[3][1];
         var1.field16416 = this.field16182[3][2];
         var1.field16417 = this.field16182[3][3];
      } else {
         var1.method10328();
         if (this.field16181 > 0) {
            if (this.field16180 > 0) {
               var1.field16402 = this.field16182[0][0];
               if (this.field16180 > 1) {
                  var1.field16406 = this.field16182[1][0];
                  if (this.field16180 > 2) {
                     var1.field16410 = this.field16182[2][0];
                     if (this.field16180 > 3) {
                        var1.field16414 = this.field16182[3][0];
                     }
                  }
               }
            }

            if (this.field16181 > 1) {
               if (this.field16180 > 0) {
                  var1.field16403 = this.field16182[0][1];
                  if (this.field16180 > 1) {
                     var1.field16407 = this.field16182[1][1];
                     if (this.field16180 > 2) {
                        var1.field16411 = this.field16182[2][1];
                        if (this.field16180 > 3) {
                           var1.field16415 = this.field16182[3][1];
                        }
                     }
                  }
               }

               if (this.field16181 > 2) {
                  if (this.field16180 > 0) {
                     var1.field16404 = this.field16182[0][2];
                     if (this.field16180 > 1) {
                        var1.field16408 = this.field16182[1][2];
                        if (this.field16180 > 2) {
                           var1.field16412 = this.field16182[2][2];
                           if (this.field16180 > 3) {
                              var1.field16416 = this.field16182[3][2];
                           }
                        }
                     }
                  }

                  if (this.field16181 > 3 && this.field16180 > 0) {
                     var1.field16405 = this.field16182[0][3];
                     if (this.field16180 > 1) {
                        var1.field16409 = this.field16182[1][3];
                        if (this.field16180 > 2) {
                           var1.field16413 = this.field16182[2][3];
                           if (this.field16180 > 3) {
                              var1.field16417 = this.field16182[3][3];
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public final void method9319(Class2404 var1) {
      if (this.field16180 >= 4 && this.field16181 >= 4) {
         var1.field16350 = (float)this.field16182[0][0];
         var1.field16351 = (float)this.field16182[0][1];
         var1.field16352 = (float)this.field16182[0][2];
         var1.field16353 = (float)this.field16182[0][3];
         var1.field16354 = (float)this.field16182[1][0];
         var1.field16355 = (float)this.field16182[1][1];
         var1.field16356 = (float)this.field16182[1][2];
         var1.field16357 = (float)this.field16182[1][3];
         var1.field16358 = (float)this.field16182[2][0];
         var1.field16359 = (float)this.field16182[2][1];
         var1.field16360 = (float)this.field16182[2][2];
         var1.field16361 = (float)this.field16182[2][3];
         var1.field16362 = (float)this.field16182[3][0];
         var1.field16363 = (float)this.field16182[3][1];
         var1.field16364 = (float)this.field16182[3][2];
         var1.field16365 = (float)this.field16182[3][3];
      } else {
         var1.method10038();
         if (this.field16181 > 0) {
            if (this.field16180 > 0) {
               var1.field16350 = (float)this.field16182[0][0];
               if (this.field16180 > 1) {
                  var1.field16354 = (float)this.field16182[1][0];
                  if (this.field16180 > 2) {
                     var1.field16358 = (float)this.field16182[2][0];
                     if (this.field16180 > 3) {
                        var1.field16362 = (float)this.field16182[3][0];
                     }
                  }
               }
            }

            if (this.field16181 > 1) {
               if (this.field16180 > 0) {
                  var1.field16351 = (float)this.field16182[0][1];
                  if (this.field16180 > 1) {
                     var1.field16355 = (float)this.field16182[1][1];
                     if (this.field16180 > 2) {
                        var1.field16359 = (float)this.field16182[2][1];
                        if (this.field16180 > 3) {
                           var1.field16363 = (float)this.field16182[3][1];
                        }
                     }
                  }
               }

               if (this.field16181 > 2) {
                  if (this.field16180 > 0) {
                     var1.field16352 = (float)this.field16182[0][2];
                     if (this.field16180 > 1) {
                        var1.field16356 = (float)this.field16182[1][2];
                        if (this.field16180 > 2) {
                           var1.field16360 = (float)this.field16182[2][2];
                           if (this.field16180 > 3) {
                              var1.field16364 = (float)this.field16182[3][2];
                           }
                        }
                     }
                  }

                  if (this.field16181 > 3 && this.field16180 > 0) {
                     var1.field16353 = (float)this.field16182[0][3];
                     if (this.field16180 > 1) {
                        var1.field16357 = (float)this.field16182[1][3];
                        if (this.field16180 > 2) {
                           var1.field16361 = (float)this.field16182[2][3];
                           if (this.field16180 > 3) {
                              var1.field16365 = (float)this.field16182[3][3];
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   public final void method9320(Class2362 var1) {
      int var4;
      if (this.field16181 >= var1.field16181) {
         var4 = var1.field16181;
      } else {
         var4 = this.field16181;
      }

      int var5;
      if (this.field16180 >= var1.field16180) {
         var5 = var1.field16180;
      } else {
         var5 = this.field16180;
      }

      for (int var6 = 0; var6 < var5; var6++) {
         for (int var7 = 0; var7 < var4; var7++) {
            var1.field16182[var6][var7] = this.field16182[var6][var7];
         }
      }

      for (int var8 = var5; var8 < var1.field16180; var8++) {
         for (int var10 = 0; var10 < var1.field16181; var10++) {
            var1.field16182[var8][var10] = 0.0;
         }
      }

      for (int var11 = var4; var11 < var1.field16181; var11++) {
         for (int var9 = 0; var9 < var5; var9++) {
            var1.field16182[var9][var11] = 0.0;
         }
      }
   }

   public final void method9321(int var1, double[] var2) {
      for (int var5 = 0; var5 < this.field16181; var5++) {
         this.field16182[var1][var5] = var2[var5];
      }
   }

   public final void method9322(int var1, Class2405 var2) {
      for (int var5 = 0; var5 < this.field16181; var5++) {
         this.field16182[var1][var5] = var2.field16368[var5];
      }
   }

   public final void method9323(int var1, double[] var2) {
      for (int var5 = 0; var5 < this.field16180; var5++) {
         this.field16182[var5][var1] = var2[var5];
      }
   }

   public final void method9324(int var1, Class2405 var2) {
      for (int var5 = 0; var5 < this.field16180; var5++) {
         this.field16182[var5][var1] = var2.field16368[var5];
      }
   }

   public final void method9325(Class2362 var1, Class2362 var2) {
      if (var1.field16180 == var2.field16181 && this.field16180 == var1.field16181 && this.field16181 == var2.field16180) {
         if (var1 != this && var2 != this) {
            for (int var9 = 0; var9 < this.field16180; var9++) {
               for (int var10 = 0; var10 < this.field16181; var10++) {
                  this.field16182[var9][var10] = 0.0;

                  for (int var11 = 0; var11 < var1.field16180; var11++) {
                     this.field16182[var9][var10] = this.field16182[var9][var10] + var1.field16182[var11][var9] * var2.field16182[var10][var11];
                  }
               }
            }
         } else {
            double[][] var5 = new double[this.field16180][this.field16181];

            for (int var6 = 0; var6 < this.field16180; var6++) {
               for (int var7 = 0; var7 < this.field16181; var7++) {
                  var5[var6][var7] = 0.0;

                  for (int var8 = 0; var8 < var1.field16180; var8++) {
                     var5[var6][var7] = var5[var6][var7] + var1.field16182[var8][var6] * var2.field16182[var7][var8];
                  }
               }
            }

            this.field16182 = var5;
         }
      } else {
         throw new Class2467(Class8148.method28252("GMatrix14"));
      }
   }

   public final void method9326(Class2362 var1, Class2362 var2) {
      if (var1.field16181 == var2.field16181 && this.field16181 == var2.field16180 && this.field16180 == var1.field16180) {
         if (var1 != this && var2 != this) {
            for (int var9 = 0; var9 < this.field16180; var9++) {
               for (int var10 = 0; var10 < this.field16181; var10++) {
                  this.field16182[var9][var10] = 0.0;

                  for (int var11 = 0; var11 < var1.field16181; var11++) {
                     this.field16182[var9][var10] = this.field16182[var9][var10] + var1.field16182[var9][var11] * var2.field16182[var10][var11];
                  }
               }
            }
         } else {
            double[][] var5 = new double[this.field16180][this.field16181];

            for (int var6 = 0; var6 < this.field16180; var6++) {
               for (int var7 = 0; var7 < this.field16181; var7++) {
                  var5[var6][var7] = 0.0;

                  for (int var8 = 0; var8 < var1.field16181; var8++) {
                     var5[var6][var7] = var5[var6][var7] + var1.field16182[var6][var8] * var2.field16182[var7][var8];
                  }
               }
            }

            this.field16182 = var5;
         }
      } else {
         throw new Class2467(Class8148.method28252("GMatrix15"));
      }
   }

   public final void method9327(Class2362 var1, Class2362 var2) {
      if (var1.field16180 == var2.field16180 && this.field16181 == var2.field16181 && this.field16180 == var1.field16181) {
         if (var1 != this && var2 != this) {
            for (int var9 = 0; var9 < this.field16180; var9++) {
               for (int var10 = 0; var10 < this.field16181; var10++) {
                  this.field16182[var9][var10] = 0.0;

                  for (int var11 = 0; var11 < var1.field16180; var11++) {
                     this.field16182[var9][var10] = this.field16182[var9][var10] + var1.field16182[var11][var9] * var2.field16182[var11][var10];
                  }
               }
            }
         } else {
            double[][] var5 = new double[this.field16180][this.field16181];

            for (int var6 = 0; var6 < this.field16180; var6++) {
               for (int var7 = 0; var7 < this.field16181; var7++) {
                  var5[var6][var7] = 0.0;

                  for (int var8 = 0; var8 < var1.field16180; var8++) {
                     var5[var6][var7] = var5[var6][var7] + var1.field16182[var8][var6] * var2.field16182[var8][var7];
                  }
               }
            }

            this.field16182 = var5;
         }
      } else {
         throw new Class2467(Class8148.method28252("GMatrix16"));
      }
   }

   public final void method9328() {
      if (this.field16180 == this.field16181) {
         for (int var3 = 0; var3 < this.field16180; var3++) {
            for (int var5 = 0; var5 < var3; var5++) {
               double var6 = this.field16182[var3][var5];
               this.field16182[var3][var5] = this.field16182[var5][var3];
               this.field16182[var5][var3] = var6;
            }
         }
      } else {
         int var8 = this.field16180;
         this.field16180 = this.field16181;
         this.field16181 = var8;
         double[][] var4 = new double[this.field16180][this.field16181];

         for (int var9 = 0; var9 < this.field16180; var9++) {
            for (int var10 = 0; var10 < this.field16181; var10++) {
               var4[var9][var10] = this.field16182[var10][var9];
            }
         }

         this.field16182 = var4;
      }
   }

   public final void method9329(Class2362 var1) {
      if (this.field16180 == var1.field16181 && this.field16181 == var1.field16180) {
         if (var1 == this) {
            this.method9328();
         } else {
            for (int var4 = 0; var4 < this.field16180; var4++) {
               for (int var5 = 0; var5 < this.field16181; var5++) {
                  this.field16182[var4][var5] = var1.field16182[var5][var4];
               }
            }
         }
      } else {
         throw new Class2467(Class8148.method28252("GMatrix17"));
      }
   }

   @Override
   public String toString() {
      StringBuffer var3 = new StringBuffer(this.field16180 * this.field16181 * 8);

      for (int var4 = 0; var4 < this.field16180; var4++) {
         for (int var5 = 0; var5 < this.field16181; var5++) {
            var3.append(this.field16182[var4][var5]).append(" ");
         }

         var3.append("\n");
      }

      return var3.toString();
   }

   private static void method9330(Class2362 var0) {
      for (int var3 = 0; var3 < var0.field16180; var3++) {
         for (int var4 = 0; var4 < var0.field16181; var4++) {
            if (!(Math.abs(var0.field16182[var3][var4]) < 1.0E-10)) {
               System.out.print(" " + var0.field16182[var3][var4]);
            } else {
               System.out.print(" 0.0     ");
            }
         }

         System.out.print("\n");
      }
   }

   @Override
   public int hashCode() {
      long var3 = 1L;
      var3 = 31L * var3 + (long)this.field16180;
      var3 = 31L * var3 + (long)this.field16181;

      for (int var5 = 0; var5 < this.field16180; var5++) {
         for (int var6 = 0; var6 < this.field16181; var6++) {
            var3 = 31L * var3 + Class9832.method38797(this.field16182[var5][var6]);
         }
      }

      return (int)(var3 ^ var3 >> 32);
   }

   public boolean equals(Class2362 var1) {
      try {
         if (this.field16180 == var1.field16180 && this.field16181 == var1.field16181) {
            for (int var4 = 0; var4 < this.field16180; var4++) {
               for (int var5 = 0; var5 < this.field16181; var5++) {
                  if (this.field16182[var4][var5] != var1.field16182[var4][var5]) {
                     return false;
                  }
               }
            }

            return true;
         } else {
            return false;
         }
      } catch (NullPointerException var6) {
         return false;
      }
   }

   @Override
   public boolean equals(Object var1) {
      try {
         Class2362 var4 = (Class2362)var1;
         if (this.field16180 == var4.field16180 && this.field16181 == var4.field16181) {
            for (int var5 = 0; var5 < this.field16180; var5++) {
               for (int var6 = 0; var6 < this.field16181; var6++) {
                  if (this.field16182[var5][var6] != var4.field16182[var5][var6]) {
                     return false;
                  }
               }
            }

            return true;
         } else {
            return false;
         }
      } catch (ClassCastException var7) {
         return false;
      } catch (NullPointerException var8) {
         return false;
      }
   }

   /** @deprecated */
   public boolean method9331(Class2362 var1, float var2) {
      return this.method9332(var1, (double)var2);
   }

   public boolean method9332(Class2362 var1, double var2) {
      if (this.field16180 == var1.field16180 && this.field16181 == var1.field16181) {
         for (int var6 = 0; var6 < this.field16180; var6++) {
            for (int var7 = 0; var7 < this.field16181; var7++) {
               double var8 = this.field16182[var6][var7] - var1.field16182[var6][var7];
               if ((!(var8 < 0.0) ? var8 : -var8) > var2) {
                  return false;
               }
            }
         }

         return true;
      } else {
         return false;
      }
   }

   public final double method9333() {
      int var3;
      if (this.field16180 >= this.field16181) {
         var3 = this.field16181;
      } else {
         var3 = this.field16180;
      }

      double var4 = 0.0;

      for (int var6 = 0; var6 < var3; var6++) {
         var4 += this.field16182[var6][var6];
      }

      return var4;
   }

   public final int method9334(Class2362 var1, Class2362 var2, Class2362 var3) {
      if (this.field16181 != var3.field16181 || this.field16181 != var3.field16180) {
         throw new Class2467(Class8148.method28252("GMatrix18"));
      } else if (this.field16180 != var1.field16180 || this.field16180 != var1.field16181) {
         throw new Class2467(Class8148.method28252("GMatrix25"));
      } else if (this.field16180 == var2.field16180 && this.field16181 == var2.field16181) {
         if (this.field16180 == 2 && this.field16181 == 2 && this.field16182[1][0] == 0.0) {
            var1.method9295();
            var3.method9295();
            if (this.field16182[0][1] != 0.0) {
               double[] var6 = new double[1];
               double[] var7 = new double[1];
               double[] var8 = new double[1];
               double[] var9 = new double[1];
               double[] var10 = new double[]{this.field16182[0][0], this.field16182[1][1]};
               method9354(this.field16182[0][0], this.field16182[0][1], this.field16182[1][1], var10, var6, var8, var7, var9, 0);
               method9348(0, var1, var8, var6);
               method9343(0, var3, var9, var7);
               return 2;
            } else {
               return 2;
            }
         } else {
            return method9340(this, var1, var2, var3);
         }
      } else {
         throw new Class2467(Class8148.method28252("GMatrix26"));
      }
   }

   public final int method9335(Class2362 var1, Class2405 var2) {
      int var5 = var1.field16180 * var1.field16181;
      double[] var6 = new double[var5];
      int[] var7 = new int[1];
      int[] var8 = new int[var1.field16180];
      if (this.field16180 != this.field16181) {
         throw new Class2467(Class8148.method28252("GMatrix19"));
      } else if (this.field16180 != var1.field16180) {
         throw new Class2467(Class8148.method28252("GMatrix27"));
      } else if (this.field16181 != var1.field16181) {
         throw new Class2467(Class8148.method28252("GMatrix27"));
      } else if (var1.field16180 != var2.method10097()) {
         throw new Class2467(Class8148.method28252("GMatrix20"));
      } else {
         for (int var9 = 0; var9 < this.field16180; var9++) {
            for (int var10 = 0; var10 < this.field16181; var10++) {
               var6[var9 * this.field16181 + var10] = this.field16182[var9][var10];
            }
         }

         if (!method9338(var1.field16180, var6, var8, var7)) {
            throw new Class2500(Class8148.method28252("GMatrix21"));
         } else {
            for (int var11 = 0; var11 < this.field16180; var11++) {
               for (int var13 = 0; var13 < this.field16181; var13++) {
                  var1.field16182[var11][var13] = var6[var11 * this.field16181 + var13];
               }
            }

            for (int var12 = 0; var12 < var1.field16180; var12++) {
               var2.field16368[var12] = (double)var8[var12];
            }

            return var7[0];
         }
      }
   }

   public final void method9336(double var1) {
      int var5;
      if (this.field16180 >= this.field16181) {
         var5 = this.field16181;
      } else {
         var5 = this.field16180;
      }

      for (int var6 = 0; var6 < this.field16180; var6++) {
         for (int var7 = 0; var7 < this.field16181; var7++) {
            this.field16182[var6][var7] = 0.0;
         }
      }

      for (int var8 = 0; var8 < var5; var8++) {
         this.field16182[var8][var8] = var1;
      }
   }

   public final void method9337(Class2362 var1) {
      int var4 = var1.field16180 * var1.field16181;
      double[] var5 = new double[var4];
      double[] var6 = new double[var4];
      int[] var7 = new int[var1.field16180];
      int[] var8 = new int[1];
      if (var1.field16180 != var1.field16181) {
         throw new Class2467(Class8148.method28252("GMatrix22"));
      } else {
         for (int var9 = 0; var9 < this.field16180; var9++) {
            for (int var10 = 0; var10 < this.field16181; var10++) {
               var5[var9 * this.field16181 + var10] = var1.field16182[var9][var10];
            }
         }

         if (!method9338(var1.field16180, var5, var7, var8)) {
            throw new Class2500(Class8148.method28252("GMatrix21"));
         } else {
            for (int var11 = 0; var11 < var4; var11++) {
               var6[var11] = 0.0;
            }

            for (int var12 = 0; var12 < this.field16181; var12++) {
               var6[var12 + var12 * this.field16181] = 1.0;
            }

            method9339(var1.field16180, var5, var7, var6);

            for (int var13 = 0; var13 < this.field16180; var13++) {
               for (int var14 = 0; var14 < this.field16181; var14++) {
                  this.field16182[var13][var14] = var6[var13 * this.field16181 + var14];
               }
            }
         }
      }
   }

   public static boolean method9338(int var0, double[] var1, int[] var2, int[] var3) {
      double[] var6 = new double[var0];
      int var7 = 0;
      int var8 = 0;
      var3[0] = 1;
      int var9 = var0;

      while (var9-- != 0) {
         double var12 = 0.0;
         int var11 = var0;

         while (var11-- != 0) {
            double var14 = var1[var7++];
            var14 = Math.abs(var14);
            if (var14 > var12) {
               var12 = var14;
            }
         }

         if (var12 == 0.0) {
            return false;
         }

         var6[var8++] = 1.0 / var12;
      }

      byte var10 = 0;

      for (int var26 = 0; var26 < var0; var26++) {
         for (int var23 = 0; var23 < var26; var23++) {
            int var17 = var10 + var0 * var23 + var26;
            double var18 = var1[var17];
            int var20 = var23;
            int var21 = var10 + var0 * var23;

            for (int var22 = var10 + var26; var20-- != 0; var22 += var0) {
               var18 -= var1[var21] * var1[var22];
               var21++;
            }

            var1[var17] = var18;
         }

         double var27 = 0.0;
         int var16 = -1;

         for (int var24 = var26; var24 < var0; var24++) {
            int var32 = var10 + var0 * var24 + var26;
            double var34 = var1[var32];
            int var35 = var26;
            int var37 = var10 + var0 * var24;

            for (int var39 = var10 + var26; var35-- != 0; var39 += var0) {
               var34 -= var1[var37] * var1[var39];
               var37++;
            }

            var1[var32] = var34;
            double var29;
            if ((var29 = var6[var24] * Math.abs(var34)) >= var27) {
               var27 = var29;
               var16 = var24;
            }
         }

         if (var16 < 0) {
            throw new RuntimeException(Class8148.method28252("GMatrix24"));
         }

         if (var26 != var16) {
            int var36 = var0;
            int var38 = var10 + var0 * var16;
            int var40 = var10 + var0 * var26;

            while (var36-- != 0) {
               double var30 = var1[var38];
               var1[var38++] = var1[var40];
               var1[var40++] = var30;
            }

            var6[var16] = var6[var26];
            var3[0] = -var3[0];
         }

         var2[var26] = var16;
         if (var1[var10 + var0 * var26 + var26] == 0.0) {
            return false;
         }

         if (var26 != var0 - 1) {
            double var31 = 1.0 / var1[var10 + var0 * var26 + var26];
            int var33 = var10 + var0 * (var26 + 1) + var26;

            for (int var25 = var0 - 1 - var26; var25-- != 0; var33 += var0) {
               var1[var33] *= var31;
            }
         }
      }

      return true;
   }

   public static void method9339(int var0, double[] var1, int[] var2, double[] var3) {
      int var6 = 0;

      for (int var7 = 0; var7 < var0; var7++) {
         int var8 = var7;
         int var9 = -1;

         for (int var10 = 0; var10 < var0; var10++) {
            int var11 = var2[var6 + var10];
            double var12 = var3[var8 + var0 * var11];
            var3[var8 + var0 * var11] = var3[var8 + var0 * var10];
            if (var9 < 0) {
               if (var12 != 0.0) {
                  var9 = var10;
               }
            } else {
               int var14 = var10 * var0;

               for (int var15 = var9; var15 <= var10 - 1; var15++) {
                  var12 -= var1[var14 + var15] * var3[var8 + var0 * var15];
               }
            }

            var3[var8 + var0 * var10] = var12;
         }

         for (int var19 = 0; var19 < var0; var19++) {
            int var16 = var0 - 1 - var19;
            int var20 = var0 * var16;
            double var17 = 0.0;

            for (int var21 = 1; var21 <= var19; var21++) {
               var17 += var1[var20 + var0 - var21] * var3[var8 + var0 * (var0 - var21)];
            }

            var3[var8 + var0 * var16] = (var3[var8 + var0 * var16] - var17) / var1[var20 + var16];
         }
      }
   }

   public static int method9340(Class2362 var0, Class2362 var1, Class2362 var2, Class2362 var3) {
      Class2362 var6 = new Class2362(var0.field16180, var0.field16181);
      Class2362 var7 = new Class2362(var0.field16180, var0.field16181);
      Class2362 var8 = new Class2362(var0.field16180, var0.field16181);
      Class2362 var9 = new Class2362(var0);
      int var10;
      int var11;
      if (var9.field16180 < var9.field16181) {
         var10 = var9.field16180;
         var11 = var9.field16180;
      } else {
         var10 = var9.field16181;
         var11 = var9.field16181 - 1;
      }

      int var12;
      if (var9.field16180 <= var9.field16181) {
         var12 = var9.field16181;
      } else {
         var12 = var9.field16180;
      }

      double[] var13 = new double[var12];
      double[] var14 = new double[var10];
      double[] var15 = new double[var11];
      boolean var16 = false;
      var1.method9295();
      var3.method9295();
      int var17 = var9.field16180;
      int var18 = var9.field16181;

      for (int var19 = 0; var19 < var10; var19++) {
         if (var17 > 1) {
            double var21 = 0.0;

            for (int var20 = 0; var20 < var17; var20++) {
               var21 += var9.field16182[var20 + var19][var19] * var9.field16182[var20 + var19][var19];
            }

            var21 = Math.sqrt(var21);
            if (var9.field16182[var19][var19] != 0.0) {
               var13[0] = var9.field16182[var19][var19] + method9356(var21, var9.field16182[var19][var19]);
            } else {
               var13[0] = var21;
            }

            for (int var33 = 1; var33 < var17; var33++) {
               var13[var33] = var9.field16182[var19 + var33][var19];
            }

            double var23 = 0.0;

            for (int var34 = 0; var34 < var17; var34++) {
               var23 += var13[var34] * var13[var34];
            }

            var23 = 2.0 / var23;

            for (int var25 = var19; var25 < var9.field16180; var25++) {
               for (int var26 = var19; var26 < var9.field16180; var26++) {
                  var7.field16182[var25][var26] = -var23 * var13[var25 - var19] * var13[var26 - var19];
               }
            }

            for (int var35 = var19; var35 < var9.field16180; var35++) {
               var7.field16182[var35][var35]++;
            }

            double var27 = 0.0;

            for (int var36 = var19; var36 < var9.field16180; var36++) {
               var27 += var7.field16182[var19][var36] * var9.field16182[var36][var19];
            }

            var9.field16182[var19][var19] = var27;

            for (int var54 = var19; var54 < var9.field16180; var54++) {
               for (int var63 = var19 + 1; var63 < var9.field16181; var63++) {
                  var6.field16182[var54][var63] = 0.0;

                  for (int var37 = var19; var37 < var9.field16181; var37++) {
                     var6.field16182[var54][var63] = var6.field16182[var54][var63] + var7.field16182[var54][var37] * var9.field16182[var37][var63];
                  }
               }
            }

            for (int var55 = var19; var55 < var9.field16180; var55++) {
               for (int var64 = var19 + 1; var64 < var9.field16181; var64++) {
                  var9.field16182[var55][var64] = var6.field16182[var55][var64];
               }
            }

            for (int var56 = var19; var56 < var9.field16180; var56++) {
               for (int var65 = 0; var65 < var9.field16181; var65++) {
                  var6.field16182[var56][var65] = 0.0;

                  for (int var38 = var19; var38 < var9.field16181; var38++) {
                     var6.field16182[var56][var65] = var6.field16182[var56][var65] + var7.field16182[var56][var38] * var1.field16182[var38][var65];
                  }
               }
            }

            for (int var57 = var19; var57 < var9.field16180; var57++) {
               for (int var66 = 0; var66 < var9.field16181; var66++) {
                  var1.field16182[var57][var66] = var6.field16182[var57][var66];
               }
            }

            var17--;
         }

         if (var18 > 2) {
            double var49 = 0.0;

            for (int var39 = 1; var39 < var18; var39++) {
               var49 += var9.field16182[var19][var19 + var39] * var9.field16182[var19][var19 + var39];
            }

            var49 = Math.sqrt(var49);
            if (var9.field16182[var19][var19 + 1] != 0.0) {
               var13[0] = var9.field16182[var19][var19 + 1] + method9356(var49, var9.field16182[var19][var19 + 1]);
            } else {
               var13[0] = var49;
            }

            for (int var40 = 1; var40 < var18 - 1; var40++) {
               var13[var40] = var9.field16182[var19][var19 + var40 + 1];
            }

            double var52 = 0.0;

            for (int var41 = 0; var41 < var18 - 1; var41++) {
               var52 += var13[var41] * var13[var41];
            }

            var52 = 2.0 / var52;

            for (int var58 = var19 + 1; var58 < var18; var58++) {
               for (int var67 = var19 + 1; var67 < var9.field16181; var67++) {
                  var8.field16182[var58][var67] = -var52 * var13[var58 - var19 - 1] * var13[var67 - var19 - 1];
               }
            }

            for (int var42 = var19 + 1; var42 < var9.field16181; var42++) {
               var8.field16182[var42][var42]++;
            }

            double var72 = 0.0;

            for (int var43 = var19; var43 < var9.field16181; var43++) {
               var72 += var8.field16182[var43][var19 + 1] * var9.field16182[var19][var43];
            }

            var9.field16182[var19][var19 + 1] = var72;

            for (int var59 = var19 + 1; var59 < var9.field16180; var59++) {
               for (int var68 = var19 + 1; var68 < var9.field16181; var68++) {
                  var6.field16182[var59][var68] = 0.0;

                  for (int var44 = var19 + 1; var44 < var9.field16181; var44++) {
                     var6.field16182[var59][var68] = var6.field16182[var59][var68] + var8.field16182[var44][var68] * var9.field16182[var59][var44];
                  }
               }
            }

            for (int var60 = var19 + 1; var60 < var9.field16180; var60++) {
               for (int var69 = var19 + 1; var69 < var9.field16181; var69++) {
                  var9.field16182[var60][var69] = var6.field16182[var60][var69];
               }
            }

            for (int var61 = 0; var61 < var9.field16180; var61++) {
               for (int var70 = var19 + 1; var70 < var9.field16181; var70++) {
                  var6.field16182[var61][var70] = 0.0;

                  for (int var45 = var19 + 1; var45 < var9.field16181; var45++) {
                     var6.field16182[var61][var70] = var6.field16182[var61][var70] + var8.field16182[var45][var70] * var3.field16182[var61][var45];
                  }
               }
            }

            for (int var62 = 0; var62 < var9.field16180; var62++) {
               for (int var71 = var19 + 1; var71 < var9.field16181; var71++) {
                  var3.field16182[var62][var71] = var6.field16182[var62][var71];
               }
            }

            var18--;
         }
      }

      for (int var46 = 0; var46 < var10; var46++) {
         var14[var46] = var9.field16182[var46][var46];
      }

      for (int var47 = 0; var47 < var11; var47++) {
         var15[var47] = var9.field16182[var47][var47 + 1];
      }

      if (var9.field16180 == 2 && var9.field16181 == 2) {
         double[] var29 = new double[1];
         double[] var30 = new double[1];
         double[] var31 = new double[1];
         double[] var32 = new double[1];
         method9354(var14[0], var15[0], var14[1], var14, var31, var29, var32, var30, 0);
         method9348(0, var1, var29, var31);
         method9343(0, var3, var30, var32);
         return 2;
      } else {
         method9341(0, var15.length - 1, var14, var15, var1, var3);
         return var14.length;
      }
   }

   public static void method9341(int var0, int var1, double[] var2, double[] var3, Class2362 var4, Class2362 var5) {
      double[] var8 = new double[1];
      double[] var9 = new double[1];
      double[] var10 = new double[1];
      double[] var11 = new double[1];
      new Class2362(var4.field16181, var5.field16180);
      double var13 = 1.0;
      double var15 = -1.0;
      boolean var17 = false;
      double var18 = 0.0;
      double var20 = 0.0;

      for (int var22 = 0; var22 < 2 && !var17; var22++) {
         int var23;
         for (var23 = var0; var23 <= var1; var23++) {
            if (var23 == var0) {
               int var27;
               if (var3.length != var2.length) {
                  var27 = var1 + 1;
               } else {
                  var27 = var1;
               }

               double var28 = method9353(var2[var27 - 1], var3[var1], var2[var27]);
               var18 = (Math.abs(var2[var23]) - var28) * (method9356(var13, var2[var23]) + var28 / var2[var23]);
               var20 = var3[var23];
            }

            double var25 = method9355(var18, var20, var11, var9);
            if (var23 != var0) {
               var3[var23 - 1] = var25;
            }

            var18 = var9[0] * var2[var23] + var11[0] * var3[var23];
            var3[var23] = var9[0] * var3[var23] - var11[0] * var2[var23];
            var20 = var11[0] * var2[var23 + 1];
            var2[var23 + 1] = var9[0] * var2[var23 + 1];
            method9343(var23, var5, var9, var11);
            var25 = method9355(var18, var20, var10, var8);
            var2[var23] = var25;
            var18 = var8[0] * var3[var23] + var10[0] * var2[var23 + 1];
            var2[var23 + 1] = var8[0] * var2[var23 + 1] - var10[0] * var3[var23];
            if (var23 < var1) {
               var20 = var10[0] * var3[var23 + 1];
               var3[var23 + 1] = var8[0] * var3[var23 + 1];
            }

            method9348(var23, var4, var8, var10);
         }

         if (var2.length == var3.length) {
            double var32 = method9355(var18, var20, var11, var9);
            var18 = var9[0] * var2[var23] + var11[0] * var3[var23];
            var3[var23] = var9[0] * var3[var23] - var11[0] * var2[var23];
            var2[var23 + 1] = var9[0] * var2[var23 + 1];
            method9343(var23, var5, var9, var11);
         }

         while (var1 - var0 > 1 && Math.abs(var3[var1]) < 4.89E-15) {
            var1--;
         }

         for (int var24 = var1 - 2; var24 > var0; var24--) {
            if (Math.abs(var3[var24]) < 4.89E-15) {
               method9341(var24 + 1, var1, var2, var3, var4, var5);
               var1 = var24 - 1;

               while (var1 - var0 > 1 && Math.abs(var3[var1]) < 4.89E-15) {
                  var1--;
               }
            }
         }

         if (var1 - var0 <= 1 && Math.abs(var3[var0 + 1]) < 4.89E-15) {
            var17 = true;
         }
      }

      if (Math.abs(var3[1]) < 4.89E-15) {
         method9354(var2[var0], var3[var0], var2[var0 + 1], var2, var10, var8, var11, var9, 0);
         var3[var0] = 0.0;
         var3[var0 + 1] = 0.0;
      }

      method9348(var0, var4, var8, var10);
      method9343(var0, var5, var9, var11);
   }

   private static void method9342(double[] var0, double[] var1) {
      System.out.println("\ns =" + var0[0] + " " + var0[1] + " " + var0[2]);
      System.out.println("e =" + var1[0] + " " + var1[1]);
   }

   private static void method9343(int var0, Class2362 var1, double[] var2, double[] var3) {
      for (int var6 = 0; var6 < var1.field16180; var6++) {
         double var7 = var1.field16182[var6][var0];
         var1.field16182[var6][var0] = var2[0] * var7 + var3[0] * var1.field16182[var6][var0 + 1];
         var1.field16182[var6][var0 + 1] = -var3[0] * var7 + var2[0] * var1.field16182[var6][var0 + 1];
      }
   }

   private static void method9344(double[] var0, double[] var1, int var2, Class2362 var3) {
      double[] var6 = new double[1];
      double[] var7 = new double[1];
      Class2362 var8 = new Class2362(var3.field16180, var3.field16181);
      Class2362 var9 = new Class2362(var3.field16180, var3.field16181);
      double var10 = var1[var2];
      double var12 = var0[var2];

      int var14;
      for (var14 = var2; var14 > 0; var14--) {
         double var15 = method9355(var10, var12, var7, var6);
         var10 = -var1[var14 - 1] * var7[0];
         var12 = var0[var14 - 1];
         var0[var14] = var15;
         var1[var14 - 1] = var1[var14 - 1] * var6[0];
         method9346(var14, var2 + 1, var3, var6, var7, var8, var9);
      }

      var0[var14 + 1] = method9355(var10, var12, var7, var6);
      method9346(var14, var2 + 1, var3, var6, var7, var8, var9);
   }

   private static void method9345(double[] var0, double[] var1, int var2, Class2362 var3) {
      double[] var6 = new double[1];
      double[] var7 = new double[1];
      Class2362 var8 = new Class2362(var3.field16180, var3.field16181);
      Class2362 var9 = new Class2362(var3.field16180, var3.field16181);
      double var10 = var1[var2];
      double var12 = var0[var2 + 1];

      int var14;
      for (var14 = var2; var14 < var3.field16181 - 2; var14++) {
         double var15 = method9355(var12, var10, var7, var6);
         var10 = -var1[var14 + 1] * var7[0];
         var12 = var0[var14 + 2];
         var0[var14 + 1] = var15;
         var1[var14 + 1] = var1[var14 + 1] * var6[0];
         method9347(var2, var14 + 1, var3, var6, var7, var8, var9);
      }

      var0[var14 + 1] = method9355(var12, var10, var7, var6);
      method9347(var2, var14 + 1, var3, var6, var7, var8, var9);
   }

   private static void method9346(int var0, int var1, Class2362 var2, double[] var3, double[] var4, Class2362 var5, Class2362 var6) {
      for (int var9 = 0; var9 < var2.field16180; var9++) {
         double var10 = var2.field16182[var9][var0];
         var2.field16182[var9][var0] = var3[0] * var10 - var4[0] * var2.field16182[var9][var1];
         var2.field16182[var9][var1] = var4[0] * var10 + var3[0] * var2.field16182[var9][var1];
      }

      System.out.println("topr    =" + var0);
      System.out.println("bottomr =" + var1);
      System.out.println("cosr =" + var3[0]);
      System.out.println("sinr =" + var4[0]);
      System.out.println("\nm =");
      method9330(var6);
      System.out.println("\nv =");
      method9330(var5);
      var6.method9287(var6, var5);
      System.out.println("\nt*m =");
      method9330(var6);
   }

   private static void method9347(int var0, int var1, Class2362 var2, double[] var3, double[] var4, Class2362 var5, Class2362 var6) {
      for (int var9 = 0; var9 < var2.field16181; var9++) {
         double var10 = var2.field16182[var0][var9];
         var2.field16182[var0][var9] = var3[0] * var10 - var4[0] * var2.field16182[var1][var9];
         var2.field16182[var1][var9] = var4[0] * var10 + var3[0] * var2.field16182[var1][var9];
      }

      System.out.println("\nm=");
      method9330(var6);
      System.out.println("\nu=");
      method9330(var5);
      var6.method9287(var5, var6);
      System.out.println("\nt*m=");
      method9330(var6);
   }

   private static void method9348(int var0, Class2362 var1, double[] var2, double[] var3) {
      for (int var6 = 0; var6 < var1.field16181; var6++) {
         double var7 = var1.field16182[var0][var6];
         var1.field16182[var0][var6] = var2[0] * var7 + var3[0] * var1.field16182[var0 + 1][var6];
         var1.field16182[var0 + 1][var6] = -var3[0] * var7 + var2[0] * var1.field16182[var0 + 1][var6];
      }
   }

   private static void method9349(Class2362 var0, Class2362 var1, Class2362 var2) {
      Class2362 var5 = new Class2362(var0.field16181, var0.field16180);
      var5.method9287(var1, var5);
      var5.method9287(var5, var2);
      System.out.println("\n m = \n" + toString(var5));
   }

   private static String toString(Class2362 var0) {
      StringBuffer var3 = new StringBuffer(var0.field16180 * var0.field16181 * 8);

      for (int var4 = 0; var4 < var0.field16180; var4++) {
         for (int var5 = 0; var5 < var0.field16181; var5++) {
            if (!(Math.abs(var0.field16182[var4][var5]) < 1.0E-9)) {
               var3.append(var0.field16182[var4][var5]).append(" ");
            } else {
               var3.append("0.0000 ");
            }
         }

         var3.append("\n");
      }

      return var3.toString();
   }

   private static void method9350(double[] var0, double[] var1, Class2362 var2, Class2362 var3) {
      Class2362 var6 = new Class2362(var2.field16181, var3.field16180);
      System.out.println(" \ns = ");

      for (int var7 = 0; var7 < var0.length; var7++) {
         System.out.println(" " + var0[var7]);
      }

      System.out.println(" \ne = ");

      for (int var8 = 0; var8 < var1.length; var8++) {
         System.out.println(" " + var1[var8]);
      }

      System.out.println(" \nu  = \n" + var2.toString());
      System.out.println(" \nv  = \n" + var3.toString());
      var6.method9295();

      for (int var9 = 0; var9 < var0.length; var9++) {
         var6.field16182[var9][var9] = var0[var9];
      }

      for (int var10 = 0; var10 < var1.length; var10++) {
         var6.field16182[var10][var10 + 1] = var1[var10];
      }

      System.out.println(" \nm  = \n" + var6.toString());
      var6.method9327(var2, var6);
      var6.method9326(var6, var3);
      System.out.println(" \n u.transpose*m*v.transpose  = \n" + var6.toString());
   }

   public static double method9351(double var0, double var2) {
      return !(var0 > var2) ? var2 : var0;
   }

   public static double method9352(double var0, double var2) {
      return !(var0 < var2) ? var2 : var0;
   }

   public static double method9353(double var0, double var2, double var4) {
      double var8 = Math.abs(var0);
      double var10 = Math.abs(var2);
      double var12 = Math.abs(var4);
      double var14 = method9352(var8, var12);
      double var16 = method9351(var8, var12);
      double var38;
      if (var14 != 0.0) {
         if (!(var10 < var16)) {
            double var18 = var16 / var10;
            if (var18 != 0.0) {
               double var20 = var14 / var16 + 1.0;
               double var22 = (var16 - var14) / var16;
               double var24 = var20 * var18;
               double var26 = var22 * var18;
               double var28 = 1.0 / (Math.sqrt(var24 * var24 + 1.0) + Math.sqrt(var26 * var26 + 1.0));
               var38 = var14 * var28 * var18;
               var38 += var38;
            } else {
               var38 = var14 * var16 / var10;
            }
         } else {
            double var33 = var14 / var16 + 1.0;
            double var34 = (var16 - var14) / var16;
            double var35 = var10 / var16;
            double var32 = var35 * var35;
            double var37 = 2.0 / (Math.sqrt(var33 * var33 + var32) + Math.sqrt(var34 * var34 + var32));
            var38 = var14 * var37;
         }
      } else {
         var38 = 0.0;
         if (var16 != 0.0) {
            double var36 = method9352(var16, var10) / method9351(var16, var10);
         }
      }

      return var38;
   }

   public static int method9354(double var0, double var2, double var4, double[] var6, double[] var7, double[] var8, double[] var9, double[] var10, int var11) {
      double var14 = 2.0;
      double var16 = 1.0;
      double var18 = var6[0];
      double var20 = var6[1];
      double var22 = 0.0;
      double var24 = 0.0;
      double var26 = 0.0;
      double var28 = 0.0;
      double var30 = 0.0;
      double var32 = var0;
      double var34 = Math.abs(var0);
      double var36 = var4;
      double var38 = Math.abs(var4);
      byte var40 = 1;
      boolean var41;
      if (!(var38 > var34)) {
         var41 = false;
      } else {
         var41 = true;
      }

      if (var41) {
         var40 = 3;
         var32 = var4;
         var36 = var0;
         double var47 = var34;
         var34 = var38;
         var38 = var47;
      }

      double var44 = Math.abs(var2);
      if (var44 != 0.0) {
         boolean var46 = true;
         if (var44 > var34) {
            var40 = 2;
            if (var34 / var44 < 1.0E-10) {
               var46 = false;
               var18 = var44;
               if (!(var38 > 1.0)) {
                  var20 = var34 / var44 * var38;
               } else {
                  var20 = var34 / (var44 / var38);
               }

               var22 = 1.0;
               var26 = var36 / var2;
               var28 = 1.0;
               var24 = var32 / var2;
            }
         }

         if (var46) {
            double var49 = var34 - var38;
            double var51;
            if (var49 != var34) {
               var51 = var49 / var34;
            } else {
               var51 = 1.0;
            }

            double var53 = var2 / var32;
            double var55 = 2.0 - var51;
            double var57 = var53 * var53;
            double var59 = var55 * var55;
            double var61 = Math.sqrt(var59 + var57);
            double var63;
            if (var51 != 0.0) {
               var63 = Math.sqrt(var51 * var51 + var57);
            } else {
               var63 = Math.abs(var53);
            }

            double var65 = (var61 + var63) * 0.5;
            if (var44 > var34) {
               var40 = 2;
               if (var34 / var44 < 1.0E-10) {
                  var46 = false;
                  var18 = var44;
                  if (!(var38 > 1.0)) {
                     var20 = var34 / var44 * var38;
                  } else {
                     var20 = var34 / (var44 / var38);
                  }

                  var22 = 1.0;
                  var26 = var36 / var2;
                  var28 = 1.0;
                  var24 = var32 / var2;
               }
            }

            if (var46) {
               var49 = var34 - var38;
               if (var49 != var34) {
                  var51 = var49 / var34;
               } else {
                  var51 = 1.0;
               }

               var53 = var2 / var32;
               var55 = 2.0 - var51;
               var57 = var53 * var53;
               var59 = var55 * var55;
               var61 = Math.sqrt(var59 + var57);
               if (var51 != 0.0) {
                  var63 = Math.sqrt(var51 * var51 + var57);
               } else {
                  var63 = Math.abs(var53);
               }

               var65 = (var61 + var63) * 0.5;
               var20 = var38 / var65;
               var18 = var34 * var65;
               if (var57 != 0.0) {
                  var55 = (var53 / (var61 + var55) + var53 / (var63 + var51)) * (var65 + 1.0);
               } else if (var51 != 0.0) {
                  var55 = var2 / method9356(var49, var32) + var53 / var55;
               } else {
                  var55 = method9356(var14, var32) * method9356(var16, var2);
               }

               var51 = Math.sqrt(var55 * var55 + 4.0);
               var24 = 2.0 / var51;
               var28 = var55 / var51;
               var22 = (var24 + var28 * var53) / var65;
               var26 = var36 / var32 * var28 / var65;
            }
         }

         if (!var41) {
            var8[0] = var22;
            var7[0] = var26;
            var10[0] = var24;
            var9[0] = var28;
         } else {
            var8[0] = var28;
            var7[0] = var24;
            var10[0] = var26;
            var9[0] = var22;
         }

         if (var40 == 1) {
            var30 = method9356(var16, var10[0]) * method9356(var16, var8[0]) * method9356(var16, var0);
         }

         if (var40 == 2) {
            var30 = method9356(var16, var9[0]) * method9356(var16, var8[0]) * method9356(var16, var2);
         }

         if (var40 == 3) {
            var30 = method9356(var16, var9[0]) * method9356(var16, var7[0]) * method9356(var16, var4);
         }

         var6[var11] = method9356(var18, var30);
         double var67 = var30 * method9356(var16, var0) * method9356(var16, var4);
         var6[var11 + 1] = method9356(var20, var67);
      } else {
         var6[1] = var38;
         var6[0] = var34;
         var22 = 1.0;
         var24 = 1.0;
         var26 = 0.0;
         var28 = 0.0;
      }

      return 0;
   }

   public static double method9355(double var0, double var2, double[] var4, double[] var5) {
      double var14;
      double var16;
      double var18;
      if (var2 != 0.0) {
         if (var0 != 0.0) {
            double var8 = var0;
            double var10 = var2;
            double var12 = method9351(Math.abs(var0), Math.abs(var2));
            if (!(var12 >= 4.994797680505588E145)) {
               if (!(var12 <= 2.002083095183101E-146)) {
                  var14 = Math.sqrt(var0 * var0 + var2 * var2);
                  var16 = var0 / var14;
                  var18 = var2 / var14;
               } else {
                  int var23;
                  for (var23 = 0; var12 <= 2.002083095183101E-146; var12 = method9351(Math.abs(var8), Math.abs(var10))) {
                     var23++;
                     var8 *= 4.994797680505588E145;
                     var10 *= 4.994797680505588E145;
                  }

                  var14 = Math.sqrt(var8 * var8 + var10 * var10);
                  var16 = var8 / var14;
                  var18 = var10 / var14;

                  for (int var24 = 1; var24 <= var23; var24++) {
                     var14 *= 2.002083095183101E-146;
                  }
               }
            } else {
               int var20;
               for (var20 = 0; var12 >= 4.994797680505588E145; var12 = method9351(Math.abs(var8), Math.abs(var10))) {
                  var20++;
                  var8 *= 2.002083095183101E-146;
                  var10 *= 2.002083095183101E-146;
               }

               var14 = Math.sqrt(var8 * var8 + var10 * var10);
               var16 = var8 / var14;
               var18 = var10 / var14;

               for (int var22 = 1; var22 <= var20; var22++) {
                  var14 *= 4.994797680505588E145;
               }
            }

            if (Math.abs(var0) > Math.abs(var2) && var16 < 0.0) {
               var16 = -var16;
               var18 = -var18;
               var14 = -var14;
            }
         } else {
            var16 = 0.0;
            var18 = 1.0;
            var14 = var2;
         }
      } else {
         var16 = 1.0;
         var18 = 0.0;
         var14 = var0;
      }

      var4[0] = var18;
      var5[0] = var16;
      return var14;
   }

   public static double method9356(double var0, double var2) {
      double var6 = !(var0 >= 0.0) ? -var0 : var0;
      return !(var2 >= 0.0) ? -var6 : var6;
   }

   @Override
   public Object clone() {
      Class2362 var3 = null;

      try {
         var3 = (Class2362)super.clone();
      } catch (CloneNotSupportedException var6) {
         throw new InternalError();
      }

      var3.field16182 = new double[this.field16180][this.field16181];

      for (int var4 = 0; var4 < this.field16180; var4++) {
         for (int var5 = 0; var5 < this.field16181; var5++) {
            var3.field16182[var4][var5] = this.field16182[var4][var5];
         }
      }

      return var3;
   }
}
