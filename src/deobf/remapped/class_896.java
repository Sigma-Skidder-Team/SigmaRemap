package remapped;

import java.util.Random;

public class class_896 extends class_6414 {
   private static String[] field_4604;
   public static final class_4190 field_4605 = class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);

   public class_896(class_3073 var1) {
      super(var1);
   }

   @Override
   public class_4190 method_10775(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return field_4605;
   }

   @Override
   public class_4190 method_10774(class_2522 var1, class_6163 var2, class_1331 var3) {
      return class_3370.method_15524();
   }

   @Override
   public class_4190 method_10757(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return class_3370.method_15524();
   }

   @Override
   public void method_10797(class_2522 var1, class_6331 var2, class_1331 var3, Random var4) {
      class_6644.method_30519(var2, var3.method_6081(), false);
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      if (var2 == Direction.field_817 && var3.method_8350(class_4783.field_23900)) {
         var4.method_43367().method_14011(var5, this, 20);
      }

      return super.method_10763(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void method_10760(class_2522 var1, World var2, class_1331 var3, class_2522 var4, boolean var5) {
      var2.method_43367().method_14011(var3, this, 20);
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, class_1331 var3, class_2929 var4) {
      return false;
   }
}
