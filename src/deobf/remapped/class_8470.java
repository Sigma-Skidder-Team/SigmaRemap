package remapped;

import java.util.Arrays;
import net.sourceforge.jaad.aac.AACException;

public class class_8470 implements class_6924, class_3471, class_7663 {
   private final boolean field_43292;
   public final class_8965 field_43299;
   public int field_43345;
   public int field_43308;
   public boolean field_43365;
   public int field_43399;
   public boolean[] field_43401 = new boolean[2];
   public int field_43354;
   public int field_43327;
   public int field_43339;
   public int field_43317;
   public int field_43390;
   public int field_43302;
   public int field_43353;
   public int[] field_43379 = new int[4];
   public int[] field_43362 = new int[2];
   public int[] field_43319 = new int[64];
   public int[][] field_43347 = new int[2][64];
   public int[] field_43356 = new int[64];
   public int[][] field_43359 = new int[4][64];
   public int[] field_43334 = new int[64];
   public int[] field_43340 = new int[2];
   public int[] field_43305 = new int[2];
   public int[] field_43355 = new int[2];
   public int[] field_43296 = new int[2];
   public int[] field_43378 = new int[2];
   public int[] field_43381 = new int[2];
   public int[] field_43312 = new int[2];
   public int[][] field_43361 = new int[2][6];
   public int[][] field_43290 = new int[2][3];
   public int[][] field_43357 = new int[2][6];
   public int[] field_43289 = new int[2];
   public float[][][] field_43298 = new float[2][5][64];
   public float[][][] field_43322 = new float[2][5][64];
   public int[] field_43328 = new int[2];
   public int[][][] field_43383 = new int[2][64][5];
   public int[][] field_43337 = new int[2][64];
   public float[][][] field_43341 = new float[2][64][5];
   public float[][][] field_43349 = new float[2][64][5];
   public int[][][] field_43323 = new int[2][64][2];
   public float[][][] field_43402 = new float[2][64][2];
   public float[][][] field_43335 = new float[2][64][2];
   public int[][] field_43331 = new int[2][64];
   public int[] field_43351 = new int[2];
   public int[] field_43382 = new int[2];
   public int[][] field_43336 = new int[2][5];
   public int[][] field_43332 = new int[2][5];
   public float[][] field_43330 = new float[2][64];
   public float[][] field_43338 = new float[2][64];
   public int field_43352;
   public int[] field_43310 = new int[64];
   public int[] field_43350 = new int[64];
   public int[][] field_43396 = new int[2][64];
   public int[][] field_43315 = new int[2][64];
   public int[] field_43320 = new int[2];
   public int[] field_43377 = new int[2];
   public int field_43333;
   public int field_43393;
   public int field_43295;
   public int field_43342;
   public boolean field_43358;
   public int field_43346;
   public int[] field_43397 = new int[2];
   public int field_43307;
   public int field_43376;
   public int field_43311;
   public int field_43297;
   public boolean field_43392;
   public int field_43300;
   public int field_43314;
   public boolean field_43372;
   public class_7358[] field_43329 = new class_7358[2];
   public class_7124[] field_43394 = new class_7124[2];
   public float[][][][] field_43391 = new float[2][40][64][2];
   public int field_43294;
   public int field_43395;
   public int field_43293;
   public int field_43316;
   public class_2942 field_43313;
   public boolean field_43375;
   public boolean field_43360;
   public boolean field_43309;
   public int field_43321;
   public int field_43363;
   public int field_43374;
   public boolean field_43398;
   public int field_43380;
   public int field_43324;
   public int field_43343;
   public int field_43344;
   public boolean field_43367;
   public int field_43318;
   public int field_43303;
   public int field_43388;
   public boolean field_43389;
   public boolean field_43400;
   public int field_43386;
   public boolean[] field_43371 = new boolean[2];
   public boolean[] field_43403 = new boolean[2];
   public boolean field_43364;
   public int field_43291;
   public int field_43385;
   public boolean field_43373;
   public int[] field_43369 = new int[2];
   public int[][] field_43384 = new int[2][9];
   public int[][] field_43326 = new int[2][9];
   public int[][] field_43304 = new int[2][9];
   public int[] field_43306 = new int[2];
   public int[] field_43368 = new int[2];
   public int[] field_43348 = new int[2];
   public int[] field_43387 = new int[2];
   public int[] field_43366 = new int[2];
   public int[][] field_43325 = new int[2][9];
   public int[][] field_43370 = new int[2][3];

   public class_8470(boolean var1, boolean var2, class_8965 var3, boolean var4) {
      this.field_43292 = var4;
      this.field_43372 = var2;
      this.field_43299 = var3;
      this.field_43344 = 2;
      this.field_43367 = true;
      this.field_43318 = 2;
      this.field_43303 = 2;
      this.field_43388 = 2;
      this.field_43389 = true;
      this.field_43400 = true;
      this.field_43380 = 5;
      this.field_43398 = true;
      this.field_43386 = 1;
      this.field_43397[0] = -1;
      this.field_43397[1] = -1;
      this.field_43314 = 0;
      this.field_43392 = true;
      this.field_43293 = 8;
      this.field_43316 = 2;
      this.field_43376 = 0;
      this.field_43311 = 0;
      this.field_43297 = 0;
      this.field_43333 = -1;
      if (!var1) {
         this.field_43294 = 32;
         this.field_43395 = 16;
      } else {
         this.field_43294 = 30;
         this.field_43395 = 15;
      }

      this.field_43328[0] = 0;
      this.field_43328[1] = 0;
      if (!var2) {
         this.field_43329[0] = new class_7358(32);
         this.field_43394[0] = new class_7124(!var4 ? 64 : 32);
         this.field_43394[1] = null;
      } else {
         this.field_43329[0] = new class_7358(32);
         this.field_43329[1] = new class_7358(32);
         this.field_43394[0] = new class_7124(!var4 ? 64 : 32);
         this.field_43394[1] = new class_7124(!var4 ? 64 : 32);
      }
   }

   public void method_38973() {
      if (this.field_43329[0] != null) {
         this.field_43329[0].method_33518();
      }

      if (this.field_43329[1] != null) {
         this.field_43329[1].method_33518();
      }

      if (this.field_43394[0] != null) {
         this.field_43394[0].method_32731();
      }

      if (this.field_43394[1] != null) {
         this.field_43394[1].method_32731();
      }

      int var3;
      for (var3 = 0; var3 < 5; var3++) {
         if (this.field_43298[0][var3] != null) {
            Arrays.fill(this.field_43298[0][var3], 0.0F);
         }

         if (this.field_43298[1][var3] != null) {
            Arrays.fill(this.field_43298[1][var3], 0.0F);
         }

         if (this.field_43322[0][var3] != null) {
            Arrays.fill(this.field_43322[0][var3], 0.0F);
         }

         if (this.field_43322[1][var3] != null) {
            Arrays.fill(this.field_43322[1][var3], 0.0F);
         }
      }

      for (int var4 = 0; var4 < 40; var4++) {
         for (int var5 = 0; var5 < 64; var5++) {
            this.field_43391[0][var4][var3][0] = 0.0F;
            this.field_43391[0][var4][var3][1] = 0.0F;
            this.field_43391[1][var4][var3][0] = 0.0F;
            this.field_43391[1][var4][var3][1] = 0.0F;
         }
      }

      this.field_43328[0] = 0;
      this.field_43328[1] = 0;
      this.field_43314 = 0;
      this.field_43392 = true;
      this.field_43381[0] = 0;
      this.field_43381[1] = 0;
      this.field_43344 = 2;
      this.field_43367 = true;
      this.field_43318 = 2;
      this.field_43303 = 2;
      this.field_43388 = 2;
      this.field_43389 = true;
      this.field_43400 = true;
      this.field_43380 = 5;
      this.field_43398 = true;
      this.field_43386 = 1;
      this.field_43397[0] = -1;
      this.field_43397[1] = -1;
      this.field_43376 = 0;
      this.field_43311 = 0;
      this.field_43297 = 0;
      this.field_43333 = -1;
      this.field_43289[0] = 0;
      this.field_43289[1] = 0;

      for (int var6 = 0; var6 < 49; var6++) {
         this.field_43337[0][var6] = 0;
         this.field_43331[0][var6] = 0;
         this.field_43337[1][var6] = 0;
         this.field_43331[1][var6] = 0;
         this.field_43315[0][var6] = 0;
         this.field_43315[1][var6] = 0;
      }

      this.field_43403[0] = false;
      this.field_43403[1] = false;
   }

   public void method_38978() {
      if (this.field_43380 == this.field_43333
         && this.field_43324 == this.field_43393
         && this.field_43344 == this.field_43342
         && this.field_43367 == this.field_43358
         && this.field_43343 == this.field_43295
         && this.field_43318 == this.field_43346) {
         this.field_43392 = false;
      } else {
         this.field_43392 = true;
      }

      this.field_43333 = this.field_43380;
      this.field_43393 = this.field_43324;
      this.field_43342 = this.field_43344;
      this.field_43358 = this.field_43367;
      this.field_43295 = this.field_43343;
      this.field_43346 = this.field_43318;
   }

   public int method_38955(int var1, int var2, int var3, int var4, boolean var5, int var6) {
      int var9 = 0;
      this.field_43354 = class_2015.method_9350(var1, var3, this.field_43299);
      int var10 = class_2015.method_9344(var2, this.field_43299, this.field_43354);
      if (this.field_43299.method_41132() < 48000) {
         if (this.field_43299.method_41132() > 32000) {
            if (var10 - this.field_43354 > 45) {
               var9++;
            }
         } else if (var10 - this.field_43354 > 48) {
            var9++;
         }
      } else if (var10 - this.field_43354 > 32) {
         var9++;
      }

      if (var4 != 0) {
         var9 += class_2015.method_9349(this, this.field_43354, var10, var4, var5);
      } else {
         var9 += class_2015.method_9347(this, this.field_43354, var10, var5);
      }

      var9 += class_2015.method_9345(this, var6, var10);
      return var9 <= 0 ? 0 : 1;
   }

   public int method_38964(class_7390 var1, int var2) throws AACException {
      int var5 = 0;
      int var6 = 0;
      long var7 = (long)var1.method_33665();
      int var9 = var1.method_33662(4);
      if (var9 == 14) {
         this.field_43363 = var1.method_33662(10);
      }

      int var10 = this.field_43380;
      int var11 = this.field_43386;
      int var12 = this.field_43324;
      int var13 = this.field_43344;
      boolean var14 = this.field_43367;
      int var15 = this.field_43343;
      this.field_43309 = var1.method_33660();
      if (this.field_43309) {
         this.method_38958(var1);
      }

      this.method_38978();
      if (this.field_43314 == 0) {
         var5 = 1;
      } else {
         if (this.field_43392 || this.field_43309 && this.field_43365) {
            int var16 = this.method_38955(this.field_43380, this.field_43324, this.field_43386, this.field_43344, this.field_43367, this.field_43343);
            if (var16 > 0) {
               this.method_38955(var10, var12, var11, var13, var14, var15);
            }
         }

         if (var5 == 0) {
            var5 = this.method_38954(var1);
            if (var5 > 0 && (this.field_43392 || this.field_43309 && this.field_43365)) {
               this.method_38955(var10, var12, var11, var13, var14, var15);
            }
         }
      }

      int var17 = (int)((long)var1.method_33665() - var7);
      if (8 * var2 < var17) {
         throw new class_5060("frame overread");
      } else {
         for (var6 = 8 * var2 - var17; var6 > 7; var6 -= 8) {
            var1.method_33662(8);
         }

         var1.method_33662(var6);
         return var5;
      }
   }

   private void method_38958(class_7390 var1) throws AACException {
      this.field_43314++;
      this.field_43398 = var1.method_33660();
      this.field_43380 = var1.method_33662(4);
      this.field_43324 = var1.method_33662(4);
      this.field_43343 = var1.method_33662(3);
      var1.method_33662(2);
      boolean var4 = var1.method_33660();
      boolean var5 = var1.method_33660();
      if (!var4) {
         this.field_43344 = 2;
         this.field_43367 = true;
         this.field_43318 = 2;
      } else {
         this.field_43344 = var1.method_33662(2);
         this.field_43367 = var1.method_33660();
         this.field_43318 = var1.method_33662(2);
      }

      if (!var5) {
         this.field_43303 = 2;
         this.field_43388 = 2;
         this.field_43389 = true;
         this.field_43400 = true;
      } else {
         this.field_43303 = var1.method_33662(2);
         this.field_43388 = var1.method_33662(2);
         this.field_43389 = var1.method_33660();
         this.field_43400 = var1.method_33660();
      }
   }

   private int method_38954(class_7390 var1) throws AACException {
      this.field_43308 = this.field_43386 == 0 ? 1 : 2;
      if (!this.field_43372) {
         int var4;
         if ((var4 = this.method_38960(var1)) > 0) {
            return var4;
         }
      } else {
         int var5;
         if ((var5 = this.method_38963(var1)) > 0) {
            return var5;
         }
      }

      return 0;
   }

   private int method_38960(class_7390 var1) throws AACException {
      if (var1.method_33660()) {
         var1.method_33662(4);
      }

      int var4;
      if ((var4 = this.method_38969(var1, 0)) <= 0) {
         this.method_38959(var1, 0);
         this.method_38967(var1, 0);
         this.method_38957(var1, 0);
         this.method_38966(var1, 0);
         class_5659.method_25617(this, 0);
         Arrays.fill(this.field_43396[0], 0, 64, 0);
         Arrays.fill(this.field_43396[1], 0, 64, 0);
         this.field_43371[0] = var1.method_33660();
         if (this.field_43371[0]) {
            this.method_38974(var1, 0);
         }

         this.field_43364 = var1.method_33660();
         if (this.field_43364) {
            boolean var5 = false;
            int var6 = var1.method_33662(4);
            if (var6 == 15) {
               var6 += var1.method_33662(8);
            }

            int var7 = 8 * var6;

            while (var7 > 7) {
               int var8 = 0;
               this.field_43291 = var1.method_33662(2);
               var8 += 2;
               if (this.field_43291 == 2) {
                  if (var5) {
                     this.field_43291 = 3;
                  } else {
                     var5 = true;
                  }
               }

               var8 += this.method_38968(var1, this.field_43291, var7);
               if (var8 > var7) {
                  return 1;
               }

               var7 -= var8;
            }

            if (var7 > 0) {
               var1.method_33662(var7);
            }
         }

         return 0;
      } else {
         return var4;
      }
   }

   private int method_38963(class_7390 var1) throws AACException {
      if (var1.method_33660()) {
         var1.method_33662(4);
         var1.method_33662(4);
      }

      this.field_43373 = var1.method_33660();
      if (!this.field_43373) {
         int[] var4 = new int[6];
         int[] var5 = new int[3];
         int var6 = this.field_43378[0];
         int var7 = this.field_43312[0];
         int var8 = this.field_43369[0];

         for (int var9 = 0; var9 < var6; var9++) {
            var4[var9] = this.field_43361[0][var9];
         }

         for (int var16 = 0; var16 < var7; var16++) {
            var5[var16] = this.field_43290[0][var16];
         }

         int var10;
         if ((var10 = this.method_38969(var1, 0)) > 0) {
            return var10;
         }

         if ((var10 = this.method_38969(var1, 1)) > 0) {
            this.field_43369[0] = var8;
            this.field_43378[0] = var6;
            this.field_43312[0] = var7;

            for (int var17 = 0; var17 < 6; var17++) {
               this.field_43361[0][var17] = var4[var17];
            }

            for (int var18 = 0; var18 < 3; var18++) {
               this.field_43290[0][var18] = var5[var18];
            }

            return var10;
         }

         this.method_38959(var1, 0);
         this.method_38959(var1, 1);
         this.method_38967(var1, 0);
         this.method_38967(var1, 1);
         this.method_38957(var1, 0);
         this.method_38957(var1, 1);
         this.method_38966(var1, 0);
         this.method_38966(var1, 1);
         Arrays.fill(this.field_43396[0], 0, 64, 0);
         Arrays.fill(this.field_43396[1], 0, 64, 0);
         this.field_43371[0] = var1.method_33660();
         if (this.field_43371[0]) {
            this.method_38974(var1, 0);
         }

         this.field_43371[1] = var1.method_33660();
         if (this.field_43371[1]) {
            this.method_38974(var1, 1);
         }
      } else {
         int var23;
         if ((var23 = this.method_38969(var1, 0)) > 0) {
            return var23;
         }

         this.field_43369[1] = this.field_43369[0];
         this.field_43378[1] = this.field_43378[0];
         this.field_43312[1] = this.field_43312[0];
         this.field_43306[1] = this.field_43306[0];

         for (int var19 = 0; var19 <= this.field_43378[0]; var19++) {
            this.field_43361[1][var19] = this.field_43361[0][var19];
            this.field_43357[1][var19] = this.field_43357[0][var19];
         }

         for (int var20 = 0; var20 <= this.field_43312[0]; var20++) {
            this.field_43290[1][var20] = this.field_43290[0][var20];
         }

         this.method_38959(var1, 0);
         this.method_38959(var1, 1);
         this.method_38967(var1, 0);

         for (int var21 = 0; var21 < this.field_43353; var21++) {
            this.field_43336[1][var21] = this.field_43336[0][var21];
         }

         this.method_38957(var1, 0);
         this.method_38966(var1, 0);
         this.method_38957(var1, 1);
         this.method_38966(var1, 1);
         Arrays.fill(this.field_43396[0], 0, 64, 0);
         Arrays.fill(this.field_43396[1], 0, 64, 0);
         this.field_43371[0] = var1.method_33660();
         if (this.field_43371[0]) {
            this.method_38974(var1, 0);
         }

         this.field_43371[1] = var1.method_33660();
         if (this.field_43371[1]) {
            this.method_38974(var1, 1);
         }
      }

      class_5659.method_25617(this, 0);
      class_5659.method_25617(this, 1);
      if (this.field_43373) {
         class_5659.method_25614(this);
      }

      this.field_43364 = var1.method_33660();
      if (this.field_43364) {
         int var12 = var1.method_33662(4);
         if (var12 == 15) {
            var12 += var1.method_33662(8);
         }

         int var11 = 8 * var12;

         while (var11 > 7) {
            int var13 = 0;
            this.field_43291 = var1.method_33662(2);
            var13 += 2;
            var13 += this.method_38968(var1, this.field_43291, var11);
            if (var13 > var11) {
               return 1;
            }

            var11 -= var13;
         }

         if (var11 > 0) {
            var1.method_33662(var11);
         }
      }

      return 0;
   }

   private int method_38970(int var1) {
      int[] var4 = new int[]{0, 0, 1, 2, 2, 3, 3, 3, 3, 4};
      return var1 < 10 && var1 >= 0 ? var4[var1] : 0;
   }

   private int method_38969(class_7390 var1, int var2) throws AACException {
      int var5 = 0;
      int var6 = this.field_43378[var2];
      int var7 = this.field_43312[var2];
      int var8 = this.field_43369[var2];
      this.field_43369[var2] = var1.method_33662(2);
      switch (this.field_43369[var2]) {
         case 0:
            int var17 = var1.method_33662(2);
            var5 = Math.min(1 << var17, 5);
            var17 = var1.method_33655();

            for (int var21 = 0; var21 < var5; var21++) {
               this.field_43357[var2][var21] = var17;
            }

            this.field_43340[var2] = 0;
            this.field_43305[var2] = this.field_43395;
            this.field_43355[var2] = var5 - 1;
            this.field_43296[var2] = 0;
            break;
         case 1:
            int var23 = var1.method_33662(2) + this.field_43395;
            var5 = var1.method_33662(2) + 1;

            for (int var26 = 0; var26 < var5 - 1; var26++) {
               this.field_43384[var2][var26] = 2 * var1.method_33662(2) + 2;
            }

            int var16 = this.method_38970(var5 + 1);
            this.field_43306[var2] = var1.method_33662(var16);

            for (int var20 = 0; var20 < var5; var20++) {
               this.field_43357[var2][var5 - var20 - 1] = var1.method_33655();
            }

            this.field_43340[var2] = 0;
            this.field_43305[var2] = var23;
            this.field_43355[var2] = 0;
            this.field_43296[var2] = var5 - 1;
            break;
         case 2:
            int var22 = var1.method_33662(2);
            var5 = var1.method_33662(2) + 1;

            for (int var25 = 0; var25 < var5 - 1; var25++) {
               this.field_43384[var2][var25] = 2 * var1.method_33662(2) + 2;
            }

            int var15 = this.method_38970(var5 + 1);
            this.field_43306[var2] = var1.method_33662(var15);

            for (int var19 = 0; var19 < var5; var19++) {
               this.field_43357[var2][var19] = var1.method_33655();
            }

            this.field_43340[var2] = var22;
            this.field_43305[var2] = this.field_43395;
            this.field_43355[var2] = var5 - 1;
            this.field_43296[var2] = 0;
            break;
         case 3:
            int var11 = var1.method_33662(2);
            int var13 = var1.method_33662(2) + this.field_43395;
            this.field_43387[var2] = var1.method_33662(2);
            this.field_43366[var2] = var1.method_33662(2);
            var5 = Math.min(5, this.field_43387[var2] + this.field_43366[var2] + 1);

            for (int var12 = 0; var12 < this.field_43387[var2]; var12++) {
               this.field_43326[var2][var12] = 2 * var1.method_33662(2) + 2;
            }

            for (int var24 = 0; var24 < this.field_43366[var2]; var24++) {
               this.field_43304[var2][var24] = 2 * var1.method_33662(2) + 2;
            }

            int var9 = this.method_38970(this.field_43387[var2] + this.field_43366[var2] + 2);
            this.field_43306[var2] = var1.method_33662(var9);

            for (int var10 = 0; var10 < var5; var10++) {
               this.field_43357[var2][var10] = var1.method_33655();
            }

            this.field_43340[var2] = var11;
            this.field_43305[var2] = var13;
            this.field_43355[var2] = this.field_43387[var2];
            this.field_43296[var2] = this.field_43366[var2];
      }

      if (this.field_43369[var2] == 3) {
         this.field_43378[var2] = Math.min(var5, 5);
      } else {
         this.field_43378[var2] = Math.min(var5, 4);
      }

      if (this.field_43378[var2] <= 0) {
         return 1;
      } else {
         if (this.field_43378[var2] > 1) {
            this.field_43312[var2] = 2;
         } else {
            this.field_43312[var2] = 1;
         }

         int var14;
         if ((var14 = class_1015.method_4499(this, var2)) > 0) {
            this.field_43369[var2] = var8;
            this.field_43378[var2] = var6;
            this.field_43312[var2] = var7;
            return var14;
         } else {
            class_1015.method_4500(this, var2);
            return 0;
         }
      }
   }

   private void method_38959(class_7390 var1, int var2) throws AACException {
      for (int var5 = 0; var5 < this.field_43378[var2]; var5++) {
         this.field_43325[var2][var5] = var1.method_33655();
      }

      for (int var6 = 0; var6 < this.field_43312[var2]; var6++) {
         this.field_43370[var2][var6] = var1.method_33655();
      }
   }

   private void method_38967(class_7390 var1, int var2) throws AACException {
      for (int var5 = 0; var5 < this.field_43353; var5++) {
         this.field_43336[var2][var5] = var1.method_33662(2);
      }
   }

   private int method_38968(class_7390 var1, int var2, int var3) throws AACException {
      switch (var2) {
         case 2:
            if (this.field_43313 == null) {
               this.field_43313 = new class_2942(this.field_43299, this.field_43294);
            }

            if (this.field_43360) {
               this.field_43313.field_14342 = false;
            }

            int var6 = this.field_43313.method_13464(var1);
            if (!this.field_43375 && this.field_43313.field_14342) {
               this.field_43375 = true;
            }

            if (this.field_43313.field_14342) {
               this.field_43360 = false;
            }

            return var6;
         default:
            this.field_43385 = var1.method_33662(6);
            return 6;
      }
   }

   private void method_38974(class_7390 var1, int var2) throws AACException {
      for (int var5 = 0; var5 < this.field_43390; var5++) {
         this.field_43396[var2][var5] = var1.method_33655();
      }
   }

   private void method_38957(class_7390 var1, int var2) throws AACException {
      byte var5 = 0;
      if (this.field_43378[var2] == 1 && this.field_43369[var2] == 0) {
         this.field_43401[var2] = false;
      } else {
         this.field_43401[var2] = this.field_43398;
      }

      int[][] var6;
      int[][] var7;
      if (this.field_43373 && var2 == 1) {
         var5 = 1;
         if (!this.field_43401[var2]) {
            var6 = field_38949;
            var7 = field_38952;
         } else {
            var6 = field_38950;
            var7 = field_38951;
         }
      } else {
         var5 = 0;
         if (!this.field_43401[var2]) {
            var6 = field_38948;
            var7 = field_38947;
         } else {
            var6 = field_38946;
            var7 = field_38943;
         }
      }

      for (int var8 = 0; var8 < this.field_43378[var2]; var8++) {
         if (this.field_43325[var2][var8] != 0) {
            for (int var11 = 0; var11 < this.field_43362[this.field_43357[var2][var8]]; var11++) {
               this.field_43383[var2][var11][var8] = this.method_38965(var1, var6) << var5;
            }
         } else {
            if (this.field_43373 && var2 == 1) {
               if (!this.field_43401[var2]) {
                  this.field_43383[var2][0][var8] = var1.method_33662(6) << var5;
               } else {
                  this.field_43383[var2][0][var8] = var1.method_33662(5) << var5;
               }
            } else if (!this.field_43401[var2]) {
               this.field_43383[var2][0][var8] = var1.method_33662(7) << var5;
            } else {
               this.field_43383[var2][0][var8] = var1.method_33662(6) << var5;
            }

            for (int var9 = 1; var9 < this.field_43362[this.field_43357[var2][var8]]; var9++) {
               this.field_43383[var2][var9][var8] = this.method_38965(var1, var7) << var5;
            }
         }
      }

      class_5659.method_25616(this, var2);
   }

   private void method_38966(class_7390 var1, int var2) throws AACException {
      byte var5 = 0;
      int[][] var6;
      int[][] var7;
      if (this.field_43373 && var2 == 1) {
         var5 = 1;
         var6 = field_38944;
         var7 = field_38951;
      } else {
         var5 = 0;
         var6 = field_38945;
         var7 = field_38943;
      }

      for (int var8 = 0; var8 < this.field_43312[var2]; var8++) {
         if (this.field_43370[var2][var8] != 0) {
            for (int var11 = 0; var11 < this.field_43353; var11++) {
               this.field_43323[var2][var11][var8] = this.method_38965(var1, var6) << var5;
            }
         } else {
            if (this.field_43373 && var2 == 1) {
               this.field_43323[var2][0][var8] = var1.method_33662(5) << var5;
            } else {
               this.field_43323[var2][0][var8] = var1.method_33662(5) << var5;
            }

            for (int var9 = 1; var9 < this.field_43353; var9++) {
               this.field_43323[var2][var9][var8] = this.method_38965(var1, var7) << var5;
            }
         }
      }

      class_5659.method_25613(this, var2);
   }

   private int method_38965(class_7390 var1, int[][] var2) throws AACException {
      int var5 = 0;

      while (var5 >= 0) {
         int var6 = var1.method_33655();
         var5 = var2[var5][var6];
      }

      return var5 + 64;
   }

   private int method_38972(int var1) {
      this.field_43307 = this.field_43327;
      this.field_43297 = this.field_43339;
      this.field_43311 = this.field_43376;
      this.field_43381[var1] = this.field_43378[var1];
      if (this.field_43378[var1] <= 0) {
         return 19;
      } else {
         this.field_43289[var1] = this.field_43357[var1][this.field_43378[var1] - 1];

         for (int var4 = 0; var4 < 49; var4++) {
            this.field_43337[var1][var4] = this.field_43383[var1][var4][this.field_43378[var1] - 1];
            this.field_43331[var1][var4] = this.field_43323[var1][var4][this.field_43312[var1] - 1];
         }

         for (int var5 = 0; var5 < 49; var5++) {
            this.field_43315[var1][var5] = this.field_43396[var1][var5];
         }

         this.field_43403[var1] = this.field_43371[var1];
         if (this.field_43351[var1] != this.field_43378[var1]) {
            this.field_43397[var1] = -1;
         } else {
            this.field_43397[var1] = 0;
         }

         return 0;
      }
   }

   private void method_38956(int var1) {
      for (int var4 = 0; var4 < this.field_43293; var4++) {
         for (int var5 = 0; var5 < 64; var5++) {
            this.field_43391[var1][var4][var5][0] = this.field_43391[var1][var4 + this.field_43294][var5][0];
            this.field_43391[var1][var4][var5][1] = this.field_43391[var1][var4 + this.field_43294][var5][1];
         }
      }

      for (int var6 = this.field_43293; var6 < 40; var6++) {
         for (int var7 = 0; var7 < 64; var7++) {
            this.field_43391[var1][var6][var7][0] = 0.0F;
            this.field_43391[var1][var6][var7][1] = 0.0F;
         }
      }
   }

   private int method_38961(float[] var1, float[][][] var2, int var3, boolean var4) {
      int var7 = 0;
      this.field_43376 = 0;
      if (!var4) {
         this.field_43329[var3].method_33519(this, var1, this.field_43391[var3], this.field_43293, this.field_43327);
      } else {
         this.field_43329[var3].method_33519(this, var1, this.field_43391[var3], this.field_43293, 32);
      }

      if (!var4) {
         class_5793.method_26217(this, this.field_43391[var3], this.field_43391[var3], var3);
         var7 = class_5625.method_25505(this, this.field_43391[var3], var3);
         if (var7 > 0) {
            var4 = true;
         }
      }

      if (!this.field_43365 && !var4) {
         for (int var13 = 0; var13 < this.field_43294; var13++) {
            int var10;
            int var11;
            int var12;
            if (var13 >= this.field_43361[var3][0]) {
               var10 = this.field_43327;
               var11 = this.field_43339;
               var12 = this.field_43376;
            } else {
               var10 = this.field_43307;
               var11 = this.field_43297;
               var12 = this.field_43311;
            }

            for (int var15 = 0; var15 < var10 + var12; var15++) {
               var2[var13][var15][0] = this.field_43391[var3][var13 + this.field_43316][var15][0];
               var2[var13][var15][1] = this.field_43391[var3][var13 + this.field_43316][var15][1];
            }

            for (int var16 = var10 + var12; var16 < var10 + var11; var16++) {
               var2[var13][var16][0] = this.field_43391[var3][var13 + this.field_43316][var16][0];
               var2[var13][var16][1] = this.field_43391[var3][var13 + this.field_43316][var16][1];
            }

            for (int var17 = Math.max(var10 + var12, var10 + var11); var17 < 64; var17++) {
               var2[var13][var17][0] = 0.0F;
               var2[var13][var17][1] = 0.0F;
            }
         }
      } else {
         for (int var8 = 0; var8 < this.field_43294; var8++) {
            for (int var9 = 0; var9 < 32; var9++) {
               var2[var8][var9][0] = this.field_43391[var3][var8 + this.field_43316][var9][0];
               var2[var8][var9][1] = this.field_43391[var3][var8 + this.field_43316][var9][1];
            }

            for (int var14 = 32; var14 < 64; var14++) {
               var2[var8][var14][0] = 0.0F;
               var2[var8][var14][1] = 0.0F;
            }
         }
      }

      return var7;
   }

   public int method_38976(float[] var1, float[] var2, boolean var3) {
      boolean var6 = false;
      int var7 = 0;
      float[][][] var8 = new float[32][64][2];
      if (!this.field_43372) {
         return 21;
      } else {
         if (this.field_43399 != 0 || this.field_43314 == 0) {
            var6 = true;
            if (this.field_43399 != 0 && this.field_43392) {
               this.field_43333 = -1;
            }
         }

         if (!var3) {
            this.field_43365 = false;
         } else {
            this.field_43365 = true;
         }

         this.field_43399 = this.field_43399 + this.method_38961(var1, var8, 0, var6);
         if (!this.field_43292) {
            this.field_43394[0].method_32734(this, var8, var1);
         } else {
            this.field_43394[0].method_32733(this, var8, var1);
         }

         this.field_43399 = this.field_43399 + this.method_38961(var2, var8, 1, var6);
         if (!this.field_43292) {
            this.field_43394[1].method_32734(this, var8, var2);
         } else {
            this.field_43394[1].method_32733(this, var8, var2);
         }

         if (this.field_43309) {
            this.field_43365 = false;
         }

         if (this.field_43314 != 0 && this.field_43399 == 0) {
            var7 = this.method_38972(0);
            if (var7 != 0) {
               return var7;
            }

            var7 = this.method_38972(1);
            if (var7 != 0) {
               return var7;
            }
         }

         this.method_38956(0);
         this.method_38956(1);
         this.field_43300++;
         return 0;
      }
   }

   public int method_38975(float[] var1, boolean var2) {
      boolean var5 = false;
      int var6 = 0;
      float[][][] var7 = new float[32][64][2];
      if (this.field_43372) {
         return 21;
      } else {
         if (this.field_43399 != 0 || this.field_43314 == 0) {
            var5 = true;
            if (this.field_43399 != 0 && this.field_43392) {
               this.field_43333 = -1;
            }
         }

         if (!var2) {
            this.field_43365 = false;
         } else {
            this.field_43365 = true;
         }

         this.field_43399 = this.field_43399 + this.method_38961(var1, var7, 0, var5);
         if (!this.field_43292) {
            this.field_43394[0].method_32734(this, var7, var1);
         } else {
            this.field_43394[0].method_32733(this, var7, var1);
         }

         if (this.field_43309) {
            this.field_43365 = false;
         }

         if (this.field_43314 != 0 && this.field_43399 == 0) {
            var6 = this.method_38972(0);
            if (var6 != 0) {
               return var6;
            }
         }

         this.method_38956(0);
         this.field_43300++;
         return 0;
      }
   }

   public int method_38962(float[] var1, float[] var2, boolean var3) {
      boolean var6 = false;
      int var7 = 0;
      float[][][] var8 = new float[38][64][2];
      float[][][] var9 = new float[38][64][2];
      if (this.field_43372) {
         return 21;
      } else {
         if (this.field_43399 != 0 || this.field_43314 == 0) {
            var6 = true;
            if (this.field_43399 != 0 && this.field_43392) {
               this.field_43333 = -1;
            }
         }

         if (!var3) {
            this.field_43365 = false;
         } else {
            this.field_43365 = true;
         }

         if (this.field_43394[1] == null) {
            this.field_43394[1] = new class_7124(!this.field_43292 ? 64 : 32);
         }

         this.field_43399 = this.field_43399 + this.method_38961(var1, var8, 0, var6);

         for (int var10 = this.field_43294; var10 < this.field_43294 + 6; var10++) {
            for (int var11 = 0; var11 < 5; var11++) {
               var8[var10][var11][0] = this.field_43391[0][this.field_43316 + var10][var11][0];
               var8[var10][var11][1] = this.field_43391[0][this.field_43316 + var10][var11][1];
            }
         }

         this.field_43313.method_13458(var8, var9);
         if (!this.field_43292) {
            this.field_43394[0].method_32734(this, var8, var1);
            this.field_43394[1].method_32734(this, var9, var2);
         } else {
            this.field_43394[0].method_32733(this, var8, var1);
            this.field_43394[1].method_32733(this, var9, var2);
         }

         if (this.field_43309) {
            this.field_43365 = false;
         }

         if (this.field_43314 != 0 && this.field_43399 == 0) {
            var7 = this.method_38972(0);
            if (var7 != 0) {
               return var7;
            }
         }

         this.method_38956(0);
         this.field_43300++;
         return 0;
      }
   }

   public boolean method_38971() {
      return this.field_43375;
   }
}
