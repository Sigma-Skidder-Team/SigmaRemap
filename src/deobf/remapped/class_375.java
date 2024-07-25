package remapped;

import javax.annotation.Nullable;

public class class_375 extends class_4314 implements class_2593 {
   private static String[] field_1525;
   public static final class_6720 field_1524 = class_6023.field_30719;
   public static final class_4190 field_1526 = class_6414.method_29292(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   public class_375(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_1524, Boolean.valueOf(true)));
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_1524);
   }

   @Override
   public class_3757 method_3281(class_6163 var1) {
      return new class_3756();
   }

   @Override
   public class_7537 method_10788(class_2522 var1) {
      return class_7537.field_38467;
   }

   @Override
   public class_4774 method_10762(class_2522 var1) {
      return !var1.<Boolean>method_10313(field_1524) ? super.method_10762(var1) : class_8532.field_43674.method_17649(false);
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, BlockPos var5, BlockPos var6) {
      if (var1.<Boolean>method_10313(field_1524)) {
         var4.method_43362().method_14011(var5, class_8532.field_43674, class_8532.field_43674.method_10711(var4));
      }

      return super.method_10763(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, BlockPos var3, class_214 var4) {
      return field_1526;
   }

   @Override
   public void method_29257(World var1, BlockPos var2, class_2522 var3, class_5834 var4, ItemStack var5) {
      if (var5.method_28018()) {
         class_3757 var8 = var1.method_28260(var2);
         if (var8 instanceof class_1100) {
            ((class_1100)var8).method_4887(var5.method_28008());
         }
      }
   }

   @Nullable
   @Override
   public class_2522 method_29302(class_353 var1) {
      class_4774 var4 = var1.method_21862().method_28258(var1.method_21858());
      return this.method_29260().method_10308(field_1524, Boolean.valueOf(var4.method_22007(class_6503.field_33094) && var4.method_21996() == 8));
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, BlockPos var3, class_2929 var4) {
      return false;
   }
}
