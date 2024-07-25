package remapped;

import java.util.Objects;
import java.util.Optional;

public class class_8579 extends class_2451 {
   private static String[] field_43967;

   public class_8579(class_317 var1) {
      super(var1);
   }

   @Override
   public class_6910 method_11237(class_4734 var1) {
      World var4 = var1.method_21862();
      BlockPos var5 = var1.method_21858();
      BlockPos var6 = var5.method_6098(var1.method_21857());
      if (!method_39459(var1.method_21867(), var4, var5)) {
         class_2522 var7 = var4.method_28262(var5);
         boolean var8 = var7.method_8308(var4, var5, var1.method_21857());
         if (var8 && method_39460(var1.method_21867(), var4, var6, var1.method_21857())) {
            if (!var4.field_33055) {
               var4.method_43364(2005, var6, 0);
            }

            return class_6910.method_31659(var4.field_33055);
         } else {
            return class_6910.field_35521;
         }
      } else {
         if (!var4.field_33055) {
            var4.method_43364(2005, var5, 0);
         }

         return class_6910.method_31659(var4.field_33055);
      }
   }

   public static boolean method_39459(ItemStack var0, World var1, BlockPos var2) {
      class_2522 var5 = var1.method_28262(var2);
      if (var5.method_8360() instanceof class_3978) {
         class_3978 var6 = (class_3978)var5.method_8360();
         if (var6.method_18358(var1, var2, var5, var1.field_33055)) {
            if (var1 instanceof class_6331) {
               if (var6.method_18357(var1, var1.field_33033, var2, var5)) {
                  var6.method_18359((class_6331)var1, var1.field_33033, var2, var5);
               }

               var0.method_27970(1);
            }

            return true;
         }
      }

      return false;
   }

   public static boolean method_39460(ItemStack var0, World var1, BlockPos var2, Direction var3) {
      if (var1.method_28262(var2).method_8350(class_4783.field_23900) && var1.method_28258(var2).method_21996() == 8) {
         if (!(var1 instanceof class_6331)) {
            return true;
         } else {
            label110:
            for (int var6 = 0; var6 < 128; var6++) {
               BlockPos var7 = var2;
               class_2522 var8 = class_4783.field_23563.method_29260();

               for (int var9 = 0; var9 < var6 / 16; var9++) {
                  var7 = var7.method_6104(field_12172.nextInt(3) - 1, (field_12172.nextInt(3) - 1) * field_12172.nextInt(3) / 2, field_12172.nextInt(3) - 1);
                  if (var1.method_28262(var7).method_8306(var1, var7)) {
                     continue label110;
                  }
               }

               Optional var11 = var1.method_2754(var7);
               if (Objects.equals(var11, Optional.<class_5621<class_6325>>of(class_8606.field_44103))
                  || Objects.equals(var11, Optional.<class_5621<class_6325>>of(class_8606.field_44087))) {
                  if (var6 == 0 && var3 != null && var3.method_1029().method_42629()) {
                     var8 = class_2351.field_11804.method_10606(var1.field_33033).method_29260().method_10308(class_4590.field_22314, var3);
                  } else if (field_12172.nextInt(4) == 0) {
                     var8 = class_2351.field_11763.method_10606(field_12172).method_29260();
                  }
               }

               if (var8.method_8360().method_29299(class_2351.field_11804)) {
                  for (int var10 = 0; !var8.method_8309(var1, var7) && var10 < 4; var10++) {
                     var8 = var8.method_10308(class_4590.field_22314, class_9594.field_48893.method_44313(field_12172));
                  }
               }

               if (var8.method_8309(var1, var7)) {
                  class_2522 var12 = var1.method_28262(var7);
                  if (var12.method_8350(class_4783.field_23900) && var1.method_28258(var7).method_21996() == 8) {
                     var1.method_7513(var7, var8, 3);
                  } else if (var12.method_8350(class_4783.field_23563) && field_12172.nextInt(10) == 0) {
                     ((class_3978)class_4783.field_23563).method_18359((class_6331)var1, field_12172, var7, var12);
                  }
               }
            }

            var0.method_27970(1);
            return true;
         }
      } else {
         return false;
      }
   }

   public static void method_39458(class_9379 var0, BlockPos var1, int var2) {
      if (var2 == 0) {
         var2 = 15;
      }

      class_2522 var5 = var0.method_28262(var1);
      if (!var5.method_8345()) {
         double var6 = 0.5;
         double var8;
         if (!var5.method_8350(class_4783.field_23900)) {
            if (!var5.method_8321(var0, var1)) {
               var8 = var5.method_8334(var0, var1).method_19495(class_9249.field_47216);
            } else {
               var1 = var1.method_6081();
               var2 *= 3;
               var6 = 3.0;
               var8 = 1.0;
            }
         } else {
            var2 *= 3;
            var8 = 1.0;
            var6 = 3.0;
         }

         var0.method_43361(
            class_3090.field_15361, (double)var1.getX() + 0.5, (double)var1.method_12165() + 0.5, (double)var1.method_12185() + 0.5, 0.0, 0.0, 0.0
         );

         for (int var10 = 0; var10 < var2; var10++) {
            double var11 = field_12172.nextGaussian() * 0.02;
            double var13 = field_12172.nextGaussian() * 0.02;
            double var15 = field_12172.nextGaussian() * 0.02;
            double var17 = 0.5 - var6;
            double var19 = (double)var1.getX() + var17 + field_12172.nextDouble() * var6 * 2.0;
            double var21 = (double)var1.method_12165() + field_12172.nextDouble() * var8;
            double var23 = (double)var1.method_12185() + var17 + field_12172.nextDouble() * var6 * 2.0;
            if (!var0.method_28262(new BlockPos(var19, var21, var23).method_6100()).method_8345()) {
               var0.method_43361(class_3090.field_15361, var19, var21, var23, var11, var13, var15);
            }
         }
      }
   }
}
