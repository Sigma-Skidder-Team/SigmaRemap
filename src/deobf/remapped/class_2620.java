package remapped;

import javax.annotation.Nullable;

public class class_2620 extends class_380 {
   private static String[] field_12919;
   public static final class_7360<class_1895> field_12920 = class_6023.field_30757;

   public class_2620(class_3073 var1) {
      super(var1);
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, class_1331 var3) {
      return method_11867(var2, var3, method_11868(var1).method_1046());
   }

   public static boolean method_11867(class_4924 var0, class_1331 var1, Direction var2) {
      class_1331 var5 = var1.method_6098(var2);
      return var0.method_28262(var5).method_8308(var0, var5, var2.method_1046());
   }

   @Nullable
   @Override
   public class_2522 method_29302(class_353 var1) {
      for (Direction var7 : var1.method_1786()) {
         class_2522 var8;
         if (var7.method_1029() != class_9249.field_47216) {
            var8 = this.method_29260().method_10308(field_12920, class_1895.field_9680).method_10308(field_1543, var7.method_1046());
         } else {
            var8 = this.method_29260()
               .method_10308(field_12920, var7 != Direction.field_817 ? class_1895.field_9677 : class_1895.field_9679)
               .method_10308(field_1543, var1.method_21863());
         }

         if (var8.method_8309(var1.method_21862(), var1.method_21858())) {
            return var8;
         }
      }

      return null;
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      return method_11868(var1).method_1046() == var2 && !var1.method_8309(var4, var5)
         ? class_4783.field_23184.method_29260()
         : super.method_10763(var1, var2, var3, var4, var5, var6);
   }

   public static Direction method_11868(class_2522 var0) {
      switch ((class_1895)var0.method_10313(field_12920)) {
         case field_9679:
            return Direction.field_802;
         case field_9677:
            return Direction.field_817;
         default:
            return var0.<Direction>method_10313(field_1543);
      }
   }
}
