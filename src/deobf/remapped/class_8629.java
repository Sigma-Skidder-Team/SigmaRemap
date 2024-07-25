package remapped;

import java.util.Random;

public class class_8629 extends class_4590 {
   private static String[] field_44268;
   private final class_6414 field_44269;

   public class_8629(class_6414 var1, class_3073 var2) {
      super(var2);
      this.field_44269 = var1;
   }

   @Override
   public void method_10760(class_2522 var1, World var2, BlockPos var3, class_2522 var4, boolean var5) {
      this.method_28562(var1, var2, var3);
   }

   @Override
   public void method_10797(class_2522 var1, class_6331 var2, BlockPos var3, Random var4) {
      if (!method_28561(var1, var2, var3)) {
         var2.method_7513(
            var3,
            this.field_44269
               .method_29260()
               .method_10308(field_31998, Boolean.valueOf(false))
               .method_10308(field_22314, var1.<Direction>method_10313(field_22314)),
            2
         );
      }
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, BlockPos var5, BlockPos var6) {
      if (var2.method_1046() == var1.<Direction>method_10313(field_22314) && !var1.method_8309(var4, var5)) {
         return class_4783.field_23184.method_29260();
      } else {
         if (var1.<Boolean>method_10313(field_31998)) {
            var4.method_43362().method_14011(var5, class_8532.field_43674, class_8532.field_43674.method_10711(var4));
         }

         this.method_28562(var1, var4, var5);
         return super.method_10763(var1, var2, var3, var4, var5, var6);
      }
   }
}
