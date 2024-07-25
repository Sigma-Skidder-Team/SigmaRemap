package remapped;

import java.util.Random;

public class class_402 extends class_6414 {
   private static String[] field_1676;
   public static final class_4190 field_1675 = class_1653.field_8593;

   public class_402(class_3073 var1) {
      super(var1);
   }

   @Override
   public boolean method_10768(class_2522 var1) {
      return true;
   }

   @Override
   public class_2522 method_29302(class_353 var1) {
      return this.method_29260().method_8309(var1.method_21862(), var1.method_21858())
         ? super.method_29302(var1)
         : class_6414.method_29277(this.method_29260(), class_4783.field_23592.method_29260(), var1.method_21862(), var1.method_21858());
   }

   @Override
   public class_2522 method_10763(class_2522 var1, class_240 var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      if (var2 == class_240.field_817 && !var1.method_8309(var4, var5)) {
         var4.method_43367().method_14011(var5, this, 1);
      }

      return super.method_10763(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void method_10797(class_2522 var1, class_6331 var2, class_1331 var3, Random var4) {
      class_1653.method_7376(var1, var2, var3);
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, class_1331 var3) {
      class_2522 var6 = var2.method_28262(var3.method_6081());
      return !var6.method_8362().method_24499() || var6.method_8360() instanceof class_1645;
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return field_1675;
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, class_1331 var3, class_2929 var4) {
      return false;
   }
}
