package remapped;

import java.util.Random;
import javax.annotation.Nullable;

public abstract class class_2373 extends class_9060 {
   @Override
   public boolean method_41607(class_6331 var1, class_6541 var2, BlockPos var3, class_2522 var4, Random var5) {
      for (int var8 = 0; var8 >= -1; var8--) {
         for (int var9 = 0; var9 >= -1; var9--) {
            if (method_10854(var4, var1, var3, var8, var9)) {
               return this.method_10853(var1, var2, var3, var4, var5, var8, var9);
            }
         }
      }

      return super.method_41607(var1, var2, var3, var4, var5);
   }

   @Nullable
   public abstract class_5927<class_1297, ?> method_10855(Random var1);

   public boolean method_10853(class_6331 var1, class_6541 var2, BlockPos var3, class_2522 var4, Random var5, int var6, int var7) {
      class_5927 var10 = this.method_10855(var5);
      if (var10 != null) {
         ((class_1297)var10.field_30062).method_5885();
         class_2522 var11 = class_4783.field_23184.method_29260();
         var1.method_7513(var3.method_6104(var6, 0, var7), var11, 4);
         var1.method_7513(var3.method_6104(var6 + 1, 0, var7), var11, 4);
         var1.method_7513(var3.method_6104(var6, 0, var7 + 1), var11, 4);
         var1.method_7513(var3.method_6104(var6 + 1, 0, var7 + 1), var11, 4);
         if (!var10.method_27104(var1, var2, var5, var3.method_6104(var6, 0, var7))) {
            var1.method_7513(var3.method_6104(var6, 0, var7), var4, 4);
            var1.method_7513(var3.method_6104(var6 + 1, 0, var7), var4, 4);
            var1.method_7513(var3.method_6104(var6, 0, var7 + 1), var4, 4);
            var1.method_7513(var3.method_6104(var6 + 1, 0, var7 + 1), var4, 4);
            return false;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   public static boolean method_10854(class_2522 var0, class_6163 var1, BlockPos var2, int var3, int var4) {
      class_6414 var7 = var0.method_8360();
      return var7 == var1.method_28262(var2.method_6104(var3, 0, var4)).method_8360()
         && var7 == var1.method_28262(var2.method_6104(var3 + 1, 0, var4)).method_8360()
         && var7 == var1.method_28262(var2.method_6104(var3, 0, var4 + 1)).method_8360()
         && var7 == var1.method_28262(var2.method_6104(var3 + 1, 0, var4 + 1)).method_8360();
   }
}
