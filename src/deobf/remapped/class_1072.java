package remapped;

import java.util.Random;

public class class_1072 extends class_6143 {
   private static String[] field_5856;
   private final class_6414 field_5857;

   public class_1072(class_6414 var1, class_3073 var2) {
      super(var2);
      this.field_5857 = var1;
   }

   @Override
   public void method_10760(class_2522 var1, class_6486 var2, class_1331 var3, class_2522 var4, boolean var5) {
      this.method_28562(var1, var2, var3);
   }

   @Override
   public void method_10797(class_2522 var1, class_6331 var2, class_1331 var3, Random var4) {
      if (!method_28561(var1, var2, var3)) {
         var2.method_7513(var3, this.field_5857.method_29260().method_10308(field_31998, Boolean.valueOf(false)), 2);
      }
   }

   @Override
   public class_2522 method_10763(class_2522 var1, class_240 var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      if (var2 == class_240.field_802 && !var1.method_8309(var4, var5)) {
         return class_4783.field_23184.method_29260();
      } else {
         this.method_28562(var1, var4, var5);
         if (var1.<Boolean>method_10313(field_31998)) {
            var4.method_43362().method_14011(var5, class_8532.field_43674, class_8532.field_43674.method_10711(var4));
         }

         return super.method_10763(var1, var2, var3, var4, var5, var6);
      }
   }
}
