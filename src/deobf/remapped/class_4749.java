package remapped;

import java.util.Random;

public class class_4749 extends class_3333 {
   private static String[] field_23010;

   public class_4749(class_3073 var1) {
      super(var1);
   }

   @Override
   public void method_29298(class_6486 var1, class_704 var2, class_1331 var3, class_2522 var4, class_3757 var5, class_6098 var6) {
      super.method_29298(var1, var2, var3, var4, var5, var6);
      if (class_2931.method_13423(class_3668.field_17870, var6) == 0) {
         if (var1.method_22572().method_40242()) {
            var1.method_7508(var3, false);
            return;
         }

         class_5371 var9 = var1.method_28262(var3.method_6100()).method_8362();
         if (var9.method_24502() || var9.method_24494()) {
            var1.method_29594(var3, class_4783.field_23900.method_29260());
         }
      }
   }

   @Override
   public void method_10783(class_2522 var1, class_6331 var2, class_1331 var3, Random var4) {
      if (var2.method_25266(class_2957.field_14440, var3) > 11 - var1.method_8320(var2, var3)) {
         this.method_21930(var1, var2, var3);
      }
   }

   public void method_21930(class_2522 var1, class_6486 var2, class_1331 var3) {
      if (!var2.method_22572().method_40242()) {
         var2.method_29594(var3, class_4783.field_23900.method_29260());
         var2.method_29520(var3, class_4783.field_23900, var3);
      } else {
         var2.method_7508(var3, false);
      }
   }

   @Override
   public class_718 method_10780(class_2522 var1) {
      return class_718.field_3913;
   }
}
