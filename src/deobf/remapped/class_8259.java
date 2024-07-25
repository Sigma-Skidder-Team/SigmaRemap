package remapped;

import java.util.Random;

public class class_8259 extends class_2830 implements class_3978 {
   private static String[] field_42373;
   public static final class_4190 field_42374 = class_6414.method_29292(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);

   public class_8259(class_3073 var1) {
      super(var1);
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      return field_42374;
   }

   @Override
   public void method_10783(class_2522 var1, class_6331 var2, BlockPos var3, Random var4) {
      if (var4.nextInt(25) == 0) {
         int var7 = 5;
         byte var8 = 4;

         for (BlockPos var10 : BlockPos.method_6076(var3.method_6104(-4, -1, -4), var3.method_6104(4, 1, 4))) {
            if (var2.method_28262(var10).method_8350(this)) {
               if (--var7 <= 0) {
                  return;
               }
            }
         }

         BlockPos var11 = var3.method_6104(var4.nextInt(3) - 1, var4.nextInt(2) - var4.nextInt(2), var4.nextInt(3) - 1);

         for (int var12 = 0; var12 < 4; var12++) {
            if (var2.method_22548(var11) && var1.method_8309(var2, var11)) {
               var3 = var11;
            }

            var11 = var3.method_6104(var4.nextInt(3) - 1, var4.nextInt(2) - var4.nextInt(2), var4.nextInt(3) - 1);
         }

         if (var2.method_22548(var11) && var1.method_8309(var2, var11)) {
            var2.method_7513(var11, var1, 2);
         }
      }
   }

   @Override
   public boolean method_12870(class_2522 var1, class_6163 var2, BlockPos var3) {
      return var1.method_8321(var2, var3);
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, BlockPos var3) {
      BlockPos var6 = var3.method_6100();
      class_2522 var7 = var2.method_28262(var6);
      return var7.method_8349(class_2351.field_11782) ? true : var2.method_25261(var3, 0) < 13 && this.method_12870(var7, var2, var6);
   }

   public boolean method_37869(class_6331 var1, BlockPos var2, class_2522 var3, Random var4) {
      var1.method_7508(var2, false);
      class_5927 var7;
      if (this != class_4783.field_23729) {
         if (this != class_4783.field_23594) {
            var1.method_7513(var2, var3, 3);
            return false;
         }

         var7 = class_7024.field_36128;
      } else {
         var7 = class_7024.field_36033;
      }

      if (!var7.method_27104(var1, var1.method_28945().method_10189(), var4, var2)) {
         var1.method_7513(var2, var3, 3);
         return false;
      } else {
         return true;
      }
   }

   @Override
   public boolean method_18358(class_6163 var1, BlockPos var2, class_2522 var3, boolean var4) {
      return true;
   }

   @Override
   public boolean method_18357(World var1, Random var2, BlockPos var3, class_2522 var4) {
      return (double)var2.nextFloat() < 0.4;
   }

   @Override
   public void method_18359(class_6331 var1, Random var2, BlockPos var3, class_2522 var4) {
      this.method_37869(var1, var3, var4, var2);
   }
}
