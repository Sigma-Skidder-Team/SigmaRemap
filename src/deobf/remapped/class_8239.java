package remapped;

import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.IntStream;

public class class_8239 extends class_3133<class_5194> {
   public static final class_2522 field_42314 = class_4783.field_23829.method_29260();
   public static final class_2522 field_42313 = class_4783.field_23813.method_29260();
   private static final class_2522 field_42316 = class_4783.field_23184.method_29260();
   private static final class_2522 field_42315 = class_4783.field_23709.method_29260();
   private static final class_2522 field_42312 = class_4783.field_23496.method_29260();
   private class_6830 field_42317;
   private class_6830 field_42318;
   private long field_42319;

   public class_8239(Codec<class_5194> var1) {
      super(var1);
   }

   public void method_37733(
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
      double var17 = 0.0;
      double var19 = 0.0;
      class_2921 var21 = new class_2921();
      float var22 = var3.method_28865(var21.method_13362(var4, 63, var5));
      double var23 = Math.min(Math.abs(var7), this.field_42317.method_31321((double)var4 * 0.1, (double)var5 * 0.1, false) * 15.0);
      if (var23 > 1.8) {
         double var38 = 0.09765625;
         double var40 = Math.abs(this.field_42318.method_31321((double)var4 * 0.09765625, (double)var5 * 0.09765625, false));
         var17 = var23 * var23 * 1.2;
         double var42 = Math.ceil(var40 * 40.0) + 14.0;
         if (var17 > var42) {
            var17 = var42;
         }

         if (var22 > 0.1F) {
            var17 -= 2.0;
         }

         if (!(var17 > 2.0)) {
            var17 = 0.0;
         } else {
            var19 = (double)var11 - var17 - 7.0;
            var17 += (double)var11;
         }
      }

      int var25 = var4 & 15;
      int var26 = var5 & 15;
      class_4139 var27 = var3.method_28875().method_9460();
      class_2522 var28 = var27.method_19216();
      class_2522 var29 = var27.method_19215();
      class_2522 var30 = var28;
      class_2522 var31 = var29;
      int var32 = (int)(var7 / 3.0 + 3.0 + var1.nextDouble() * 0.25);
      int var33 = -1;
      int var34 = 0;
      int var35 = 2 + var1.nextInt(4);
      int var36 = var11 + 18 + var1.nextInt(10);

      for (int var37 = Math.max(var6, (int)var17 + 1); var37 >= 0; var37--) {
         var21.method_13362(var25, var37, var26);
         if (var2.method_28262(var21).method_8345() && var37 < (int)var17 && var1.nextDouble() > 0.01) {
            var2.method_27348(var21, field_42314, false);
         } else if (var2.method_28262(var21).method_8362() == class_5371.field_27439
            && var37 > (int)var19
            && var37 < var11
            && var19 != 0.0
            && var1.nextDouble() > 0.15) {
            var2.method_27348(var21, field_42314, false);
         }

         class_2522 var44 = var2.method_28262(var21);
         if (!var44.method_8345()) {
            if (var44.method_8350(var9.method_8360())) {
               if (var33 != -1) {
                  if (var33 > 0) {
                     var33--;
                     var2.method_27348(var21, var30, false);
                     if (var33 == 0 && var30.method_8350(class_4783.field_23216) && var32 > 1) {
                        var33 = var1.nextInt(4) + Math.max(0, var37 - 63);
                        var30 = !var30.method_8350(class_4783.field_23814) ? class_4783.field_23459.method_29260() : class_4783.field_23160.method_29260();
                     }
                  }
               } else {
                  if (var32 > 0) {
                     if (var37 >= var11 - 4 && var37 <= var11 + 1) {
                        var31 = var29;
                        var30 = var28;
                     }
                  } else {
                     var31 = field_42316;
                     var30 = var9;
                  }

                  if (var37 < var11 && (var31 == null || var31.method_8345())) {
                     if (!(var3.method_28865(var21.method_13362(var4, var37, var5)) < 0.15F)) {
                        var31 = var10;
                     } else {
                        var31 = field_42312;
                     }
                  }

                  var33 = var32;
                  if (var37 < var11 - 1) {
                     if (var37 >= var11 - 7 - var32) {
                        var2.method_27348(var21, var30, false);
                     } else {
                        var31 = field_42316;
                        var30 = var9;
                        var2.method_27348(var21, field_42315, false);
                     }
                  } else {
                     var2.method_27348(var21, var31, false);
                  }
               }
            } else if (var44.method_8350(class_4783.field_23829) && var34 <= var35 && var37 > var36) {
               var2.method_27348(var21, field_42313, false);
               var34++;
            }
         } else {
            var33 = -1;
         }
      }
   }

   @Override
   public void method_14499(long var1) {
      if (this.field_42319 != var1 || this.field_42317 == null || this.field_42318 == null) {
         class_8679 var5 = new class_8679(var1);
         this.field_42317 = new class_6830(var5, IntStream.rangeClosed(-3, 0));
         this.field_42318 = new class_6830(var5, ImmutableList.of(0));
      }

      this.field_42319 = var1;
   }
}
