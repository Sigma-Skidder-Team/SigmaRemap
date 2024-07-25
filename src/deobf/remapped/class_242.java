package remapped;

import java.util.Random;

public class class_242 extends class_6414 implements class_3978 {
   private static String[] field_825;

   public class_242(class_3073 var1) {
      super(var1);
   }

   private static boolean method_1057(class_2522 var0, class_4924 var1, BlockPos var2) {
      BlockPos var5 = var2.method_6081();
      class_2522 var6 = var1.method_28262(var5);
      int var7 = class_2309.method_10626(var1, var0, var2, var6, var5, Direction.field_817, var6.method_8320(var1, var5));
      return var7 < var1.method_28255();
   }

   @Override
   public void method_10783(class_2522 var1, class_6331 var2, BlockPos var3, Random var4) {
      if (!method_1057(var1, var2, var3)) {
         var2.method_29594(var3, class_4783.field_23700.method_29260());
      }
   }

   @Override
   public boolean method_18358(class_6163 var1, BlockPos var2, class_2522 var3, boolean var4) {
      return var1.method_28262(var2.method_6081()).method_8345();
   }

   @Override
   public boolean method_18357(World var1, Random var2, BlockPos var3, class_2522 var4) {
      return true;
   }

   @Override
   public void method_18359(class_6331 var1, Random var2, BlockPos var3, class_2522 var4) {
      class_2522 var7 = var1.method_28262(var3);
      BlockPos var8 = var3.method_6081();
      if (!var7.method_8350(class_4783.field_23598)) {
         if (var7.method_8350(class_4783.field_23209)) {
            class_7056.method_32447(var1, var2, var8, class_4952.field_25630, 3, 1);
            class_7056.method_32447(var1, var2, var8, class_4952.field_25635, 3, 1);
            if (var2.nextInt(8) == 0) {
               class_2672.method_12040(var1, var2, var8, 3, 1, 2);
            }
         }
      } else {
         class_7056.method_32447(var1, var2, var8, class_4952.field_25623, 3, 1);
      }
   }
}
