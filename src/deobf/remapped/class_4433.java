package remapped;

import java.util.Random;

public class class_4433 extends class_6414 implements class_3978 {
   private static String[] field_21642;

   public class_4433(class_3073 var1) {
      super(var1);
   }

   @Override
   public boolean method_18358(class_6163 var1, class_1331 var2, class_2522 var3, boolean var4) {
      if (!var1.method_28262(var2.method_6081()).method_8369(var1, var2)) {
         return false;
      } else {
         for (class_1331 var8 : class_1331.method_6076(var2.method_6104(-1, -1, -1), var2.method_6104(1, 1, 1))) {
            if (var1.method_28262(var8).method_8349(class_2351.field_11769)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean method_18357(World var1, Random var2, class_1331 var3, class_2522 var4) {
      return true;
   }

   @Override
   public void method_18359(class_6331 var1, Random var2, class_1331 var3, class_2522 var4) {
      boolean var7 = false;
      boolean var8 = false;

      for (class_1331 var10 : class_1331.method_6076(var3.method_6104(-1, -1, -1), var3.method_6104(1, 1, 1))) {
         class_2522 var11 = var1.method_28262(var10);
         if (var11.method_8350(class_4783.field_23209)) {
            var8 = true;
         }

         if (var11.method_8350(class_4783.field_23598)) {
            var7 = true;
         }

         if (var8 && var7) {
            break;
         }
      }

      if (var8 && var7) {
         var1.method_7513(var3, !var2.nextBoolean() ? class_4783.field_23598.method_29260() : class_4783.field_23209.method_29260(), 3);
      } else if (!var8) {
         if (var7) {
            var1.method_7513(var3, class_4783.field_23598.method_29260(), 3);
         }
      } else {
         var1.method_7513(var3, class_4783.field_23209.method_29260(), 3);
      }
   }
}
