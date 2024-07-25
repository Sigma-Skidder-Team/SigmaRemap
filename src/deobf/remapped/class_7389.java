package remapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class class_7389 extends class_3133<class_5194> {
   private static final class_2522 field_37727 = class_4783.field_23264.method_29260();
   private static final class_2522 field_37725 = class_4783.field_23486.method_29260();
   private static final class_2522 field_37733 = class_4783.field_23344.method_29260();
   private static final class_2522 field_37728 = class_4783.field_23243.method_29260();
   private static final class_2522 field_37730 = class_4783.field_23330.method_29260();
   private static final class_2522 field_37729 = class_4783.field_23659.method_29260();
   private static final class_2522 field_37726 = class_4783.field_23229.method_29260();
   public class_2522[] field_37731;
   public long field_37732;
   public class_6830 field_37734;
   public class_6830 field_37724;
   public class_6830 field_37723;

   public class_7389(Codec<class_5194> var1) {
      super(var1);
   }

   public void method_33650(
      Random var1,
      class_5990 var2,
      class_6325 var3,
      int var4,
      int var5,
      int var6,
      double var7,
      class_2522 var9,
      class_2522 var10,
      int var11,
      long var12,
      class_5194 var14
   ) {
      int var17 = var4 & 15;
      int var18 = var5 & 15;
      class_2522 var19 = field_37727;
      class_4139 var20 = var3.method_28875().method_9460();
      class_2522 var21 = var20.method_19216();
      class_2522 var22 = var20.method_19215();
      class_2522 var23 = var21;
      int var24 = (int)(var7 / 3.0 + 3.0 + var1.nextDouble() * 0.25);
      boolean var25 = Math.cos(var7 / 3.0 * Math.PI) > 0.0;
      int var26 = -1;
      boolean var27 = false;
      int var28 = 0;
      class_2921 var29 = new class_2921();

      for (int var30 = var6; var30 >= 0; var30--) {
         if (var28 < 15) {
            var29.method_13362(var17, var30, var18);
            class_2522 var31 = var2.method_28262(var29);
            if (!var31.method_8345()) {
               if (var31.method_8350(var9.method_8360())) {
                  if (var26 != -1) {
                     if (var26 > 0) {
                        var26--;
                        if (!var27) {
                           var2.method_27348(var29, this.method_33648(var4, var30, var5), false);
                        } else {
                           var2.method_27348(var29, field_37725, false);
                        }
                     }
                  } else {
                     var27 = false;
                     if (var24 > 0) {
                        if (var30 >= var11 - 4 && var30 <= var11 + 1) {
                           var19 = field_37727;
                           var23 = var21;
                        }
                     } else {
                        var19 = class_4783.field_23184.method_29260();
                        var23 = var9;
                     }

                     if (var30 < var11 && (var19 == null || var19.method_8345())) {
                        var19 = var10;
                     }

                     var26 = var24 + Math.max(0, var30 - var11);
                     if (var30 < var11 - 1) {
                        var2.method_27348(var29, var23, false);
                        class_6414 var33 = var23.method_8360();
                        if (var33 == class_4783.field_23264
                           || var33 == class_4783.field_23486
                           || var33 == class_4783.field_23908
                           || var33 == class_4783.field_23840
                           || var33 == class_4783.field_23243
                           || var33 == class_4783.field_23857
                           || var33 == class_4783.field_23625
                           || var33 == class_4783.field_23198
                           || var33 == class_4783.field_23229
                           || var33 == class_4783.field_23387
                           || var33 == class_4783.field_23816
                           || var33 == class_4783.field_23793
                           || var33 == class_4783.field_23330
                           || var33 == class_4783.field_23773
                           || var33 == class_4783.field_23659
                           || var33 == class_4783.field_23711) {
                           var2.method_27348(var29, field_37725, false);
                        }
                     } else if (var30 <= var11 + 3 + var24) {
                        var2.method_27348(var29, var22, false);
                        var27 = true;
                     } else {
                        class_2522 var32;
                        if (var30 < 64 || var30 > 127) {
                           var32 = field_37725;
                        } else if (!var25) {
                           var32 = this.method_33648(var4, var30, var5);
                        } else {
                           var32 = field_37733;
                        }

                        var2.method_27348(var29, var32, false);
                     }
                  }

                  var28++;
               }
            } else {
               var26 = -1;
            }
         }
      }
   }

   @Override
   public void method_14499(long var1) {
      if (this.field_37732 != var1 || this.field_37731 == null) {
         this.method_33649(var1);
      }

      if (this.field_37732 != var1 || this.field_37734 == null || this.field_37724 == null) {
         class_8679 var5 = new class_8679(var1);
         this.field_37734 = new class_6830(var5, IntStream.rangeClosed(-3, 0));
         this.field_37724 = new class_6830(var5, ImmutableList.of(0));
      }

      this.field_37732 = var1;
   }

   public void method_33649(long var1) {
      this.field_37731 = new class_2522[64];
      Arrays.fill(this.field_37731, field_37733);
      class_8679 var5 = new class_8679(var1);
      this.field_37723 = new class_6830(var5, ImmutableList.of(0));

      for (int var14 = 0; var14 < 64; var14++) {
         var14 += var5.nextInt(5) + 1;
         if (var14 < 64) {
            this.field_37731[var14] = field_37725;
         }
      }

      int var15 = var5.nextInt(4) + 2;

      for (int var7 = 0; var7 < var15; var7++) {
         int var8 = var5.nextInt(3) + 1;
         int var9 = var5.nextInt(64);

         for (int var10 = 0; var9 + var10 < 64 && var10 < var8; var10++) {
            this.field_37731[var9 + var10] = field_37728;
         }
      }

      int var16 = var5.nextInt(4) + 2;

      for (int var17 = 0; var17 < var16; var17++) {
         int var19 = var5.nextInt(3) + 2;
         int var22 = var5.nextInt(64);

         for (int var11 = 0; var22 + var11 < 64 && var11 < var19; var11++) {
            this.field_37731[var22 + var11] = field_37730;
         }
      }

      int var18 = var5.nextInt(4) + 2;

      for (int var20 = 0; var20 < var18; var20++) {
         int var23 = var5.nextInt(3) + 1;
         int var25 = var5.nextInt(64);

         for (int var12 = 0; var25 + var12 < 64 && var12 < var23; var12++) {
            this.field_37731[var25 + var12] = field_37729;
         }
      }

      int var21 = var5.nextInt(3) + 3;
      int var24 = 0;

      for (int var26 = 0; var26 < var21; var26++) {
         boolean var27 = true;
         var24 += var5.nextInt(16) + 4;

         for (int var13 = 0; var24 + var13 < 64 && var13 < 1; var13++) {
            this.field_37731[var24 + var13] = field_37727;
            if (var24 + var13 > 1 && var5.nextBoolean()) {
               this.field_37731[var24 + var13 - 1] = field_37726;
            }

            if (var24 + var13 < 63 && var5.nextBoolean()) {
               this.field_37731[var24 + var13 + 1] = field_37726;
            }
         }
      }
   }

   public class_2522 method_33648(int var1, int var2, int var3) {
      int var6 = (int)Math.round(this.field_37723.method_31321((double)var1 / 512.0, (double)var3 / 512.0, false) * 2.0);
      return this.field_37731[(var2 + var6 + 64) % 64];
   }
}
