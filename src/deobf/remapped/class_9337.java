package remapped;

import javax.annotation.Nullable;

public class class_9337 extends class_6414 implements class_2593 {
   private static String[] field_47662;
   public static final class_6720 field_47664 = class_6023.field_30742;
   public static final class_6720 field_47661 = class_6023.field_30719;
   public static final class_4190 field_47663 = class_3370.method_15530(
      class_6414.method_29292(5.0, 0.0, 5.0, 11.0, 7.0, 11.0), class_6414.method_29292(6.0, 7.0, 6.0, 10.0, 9.0, 10.0)
   );
   public static final class_4190 field_47660 = class_3370.method_15530(
      class_6414.method_29292(5.0, 1.0, 5.0, 11.0, 8.0, 11.0), class_6414.method_29292(6.0, 8.0, 6.0, 10.0, 10.0, 10.0)
   );

   public class_9337(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_47664, Boolean.valueOf(false)).method_10308(field_47661, Boolean.valueOf(false)));
   }

   @Nullable
   @Override
   public class_2522 method_29302(class_353 var1) {
      class_4774 var4 = var1.method_21862().method_28258(var1.method_21858());

      for (Direction var8 : var1.method_1786()) {
         if (var8.method_1029() == class_9249.field_47216) {
            class_2522 var9 = this.method_29260().method_10308(field_47664, Boolean.valueOf(var8 == Direction.field_817));
            if (var9.method_8309(var1.method_21862(), var1.method_21858())) {
               return var9.method_10308(field_47661, Boolean.valueOf(var4.method_22005() == class_8532.field_43674));
            }
         }
      }

      return null;
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      return !var1.<Boolean>method_10313(field_47664) ? field_47663 : field_47660;
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_47664, field_47661);
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, BlockPos var3) {
      Direction var6 = method_43109(var1).method_1046();
      return class_6414.method_29266(var2, var3.method_6098(var6), var6.method_1046());
   }

   public static Direction method_43109(class_2522 var0) {
      return !var0.<Boolean>method_10313(field_47664) ? Direction.field_817 : Direction.field_802;
   }

   @Override
   public class_718 method_10780(class_2522 var1) {
      return class_718.field_3916;
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, BlockPos var5, BlockPos var6) {
      if (var1.<Boolean>method_10313(field_47661)) {
         var4.method_43362().method_14011(var5, class_8532.field_43674, class_8532.field_43674.method_10711(var4));
      }

      return method_43109(var1).method_1046() == var2 && !var1.method_8309(var4, var5)
         ? class_4783.field_23184.method_29260()
         : super.method_10763(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public class_4774 method_10762(class_2522 var1) {
      return !var1.<Boolean>method_10313(field_47661) ? super.method_10762(var1) : class_8532.field_43674.method_17649(false);
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, BlockPos var3, class_2929 var4) {
      return false;
   }
}
