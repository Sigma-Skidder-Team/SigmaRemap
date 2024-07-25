package remapped;

import javax.annotation.Nullable;

public class class_5613 extends class_6414 implements class_2593 {
   private static String[] field_28502;
   public static final class_6162 field_28506 = class_380.field_1543;
   public static final class_6720 field_28505 = class_6023.field_30719;
   public static final class_4190 field_28503 = class_6414.method_29292(0.0, 0.0, 0.0, 3.0, 16.0, 16.0);
   public static final class_4190 field_28504 = class_6414.method_29292(13.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   public static final class_4190 field_28500 = class_6414.method_29292(0.0, 0.0, 0.0, 16.0, 16.0, 3.0);
   public static final class_4190 field_28501 = class_6414.method_29292(0.0, 0.0, 13.0, 16.0, 16.0, 16.0);

   public class_5613(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_28506, Direction.field_818).method_10308(field_28505, Boolean.valueOf(false)));
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      switch ((Direction)var1.method_10313(field_28506)) {
         case field_818:
            return field_28501;
         case field_800:
            return field_28500;
         case field_809:
            return field_28504;
         case field_804:
         default:
            return field_28503;
      }
   }

   private boolean method_25470(class_6163 var1, BlockPos var2, Direction var3) {
      class_2522 var6 = var1.method_28262(var2);
      return var6.method_8308(var1, var2, var3);
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, BlockPos var3) {
      Direction var6 = var1.<Direction>method_10313(field_28506);
      return this.method_25470(var2, var3.method_6098(var6.method_1046()), var6);
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, BlockPos var5, BlockPos var6) {
      if (var2.method_1046() == var1.<Direction>method_10313(field_28506) && !var1.method_8309(var4, var5)) {
         return class_4783.field_23184.method_29260();
      } else {
         if (var1.<Boolean>method_10313(field_28505)) {
            var4.method_43362().method_14011(var5, class_8532.field_43674, class_8532.field_43674.method_10711(var4));
         }

         return super.method_10763(var1, var2, var3, var4, var5, var6);
      }
   }

   @Nullable
   @Override
   public class_2522 method_29302(class_353 var1) {
      if (!var1.method_1783()) {
         class_2522 var4 = var1.method_21862().method_28262(var1.method_21858().method_6098(var1.method_21857().method_1046()));
         if (var4.method_8350(this) && var4.<Direction>method_10313(field_28506) == var1.method_21857()) {
            return null;
         }
      }

      class_2522 var12 = this.method_29260();
      World var5 = var1.method_21862();
      BlockPos var6 = var1.method_21858();
      class_4774 var7 = var1.method_21862().method_28258(var1.method_21858());

      for (Direction var11 : var1.method_1786()) {
         if (var11.method_1029().method_42629()) {
            var12 = var12.method_10308(field_28506, var11.method_1046());
            if (var12.method_8309(var5, var6)) {
               return var12.method_10308(field_28505, Boolean.valueOf(var7.method_22005() == class_8532.field_43674));
            }
         }
      }

      return null;
   }

   @Override
   public class_2522 method_10785(class_2522 var1, class_6631 var2) {
      return var1.method_10308(field_28506, var2.method_30489(var1.<Direction>method_10313(field_28506)));
   }

   @Override
   public class_2522 method_10773(class_2522 var1, class_9022 var2) {
      return var1.method_8318(var2.method_41390(var1.<Direction>method_10313(field_28506)));
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_28506, field_28505);
   }

   @Override
   public class_4774 method_10762(class_2522 var1) {
      return !var1.<Boolean>method_10313(field_28505) ? super.method_10762(var1) : class_8532.field_43674.method_17649(false);
   }
}
