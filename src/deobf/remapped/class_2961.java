package remapped;

import java.util.List;
import java.util.Random;

public class class_2961 extends class_250 implements class_3978 {
   private static String[] field_14455;

   public class_2961(class_3073 var1) {
      super(var1);
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
      BlockPos var7 = var3.method_6081();
      class_2522 var8 = class_4783.field_23868.method_29260();

      label61:
      for (int var9 = 0; var9 < 128; var9++) {
         BlockPos var10 = var7;

         for (int var11 = 0; var11 < var9 / 16; var11++) {
            var10 = var10.method_6104(var2.nextInt(3) - 1, (var2.nextInt(3) - 1) * var2.nextInt(3) / 2, var2.nextInt(3) - 1);
            if (!var1.method_28262(var10.method_6100()).method_8350(this) || var1.method_28262(var10).method_8306(var1, var10)) {
               continue label61;
            }
         }

         class_2522 var16 = var1.method_28262(var10);
         if (var16.method_8350(var8.method_8360()) && var2.nextInt(10) == 0) {
            ((class_3978)var8.method_8360()).method_18359(var1, var2, var10, var16);
         }

         if (var16.method_8345()) {
            class_2522 var12;
            if (var2.nextInt(8) != 0) {
               var12 = var8;
            } else {
               List var13 = var1.method_22561(var10).method_28875().method_9461();
               if (var13.isEmpty()) {
                  continue;
               }

               class_5927 var14 = (class_5927)var13.get(0);
               class_2446 var15 = (class_2446)var14.field_30065;
               var12 = var15.method_11181(var2, var10, var14.method_27102());
            }

            if (var12.method_8309(var1, var10)) {
               var1.method_7513(var10, var12, 3);
            }
         }
      }
   }
}
