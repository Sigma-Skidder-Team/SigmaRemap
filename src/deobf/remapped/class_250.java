package remapped;

import java.util.Random;

public abstract class class_250 extends class_2985 {
   public class_250(class_3073 var1) {
      super(var1);
   }

   private static boolean method_1092(class_2522 var0, class_4924 var1, class_1331 var2) {
      class_1331 var5 = var2.method_6081();
      class_2522 var6 = var1.method_28262(var5);
      if (var6.method_8350(class_4783.field_23552) && var6.<Integer>method_10313(class_163.field_493) == 1) {
         return true;
      } else if (var6.method_8364().method_21996() != 8) {
         int var7 = class_2309.method_10626(var1, var0, var2, var6, var5, class_240.field_817, var6.method_8320(var1, var5));
         return var7 < var1.method_28255();
      } else {
         return false;
      }
   }

   private static boolean method_1091(class_2522 var0, class_4924 var1, class_1331 var2) {
      class_1331 var5 = var2.method_6081();
      return method_1092(var0, var1, var2) && !var1.method_28258(var5).method_22007(class_6503.field_33094);
   }

   @Override
   public void method_10783(class_2522 var1, class_6331 var2, class_1331 var3, Random var4) {
      if (method_1092(var1, var2, var3)) {
         if (var2.method_22573(var3.method_6081()) >= 9) {
            class_2522 var7 = this.method_29260();

            for (int var8 = 0; var8 < 4; var8++) {
               class_1331 var9 = var3.method_6104(var4.nextInt(3) - 1, var4.nextInt(5) - 3, var4.nextInt(3) - 1);
               if (var2.method_28262(var9).method_8350(class_4783.field_23592) && method_1091(var7, var2, var9)) {
                  var2.method_29594(
                     var9, var7.method_10308(field_14686, Boolean.valueOf(var2.method_28262(var9.method_6081()).method_8350(class_4783.field_23552)))
                  );
               }
            }
         }
      } else {
         var2.method_29594(var3, class_4783.field_23592.method_29260());
      }
   }
}
