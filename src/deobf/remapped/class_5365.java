package remapped;

import javax.annotation.Nullable;

public class class_5365 extends class_7947 implements class_2593 {
   private static String[] field_27372;
   public static final class_6720 field_27374 = class_6023.field_30719;
   public static final class_4190 field_27375 = class_6414.method_29292(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   public static final class_4190 field_27376 = class_6414.method_29292(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   public static final class_4190 field_27373 = class_6414.method_29292(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   public class_5365(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_27374, Boolean.valueOf(false)).method_10308(field_40671, class_9249.field_47216));
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      switch ((class_9249)var1.method_10313(field_40671)) {
         case field_47215:
         default:
            return field_27373;
         case field_47219:
            return field_27376;
         case field_47216:
            return field_27375;
      }
   }

   @Nullable
   @Override
   public class_2522 method_29302(class_353 var1) {
      class_4774 var4 = var1.method_21862().method_28258(var1.method_21858());
      boolean var5 = var4.method_22005() == class_8532.field_43674;
      return super.method_29302(var1).method_10308(field_27374, Boolean.valueOf(var5));
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      if (var1.<Boolean>method_10313(field_27374)) {
         var4.method_43362().method_14011(var5, class_8532.field_43674, class_8532.field_43674.method_10711(var4));
      }

      return super.method_10763(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_27374).method_10162(field_40671);
   }

   @Override
   public class_4774 method_10762(class_2522 var1) {
      return !var1.<Boolean>method_10313(field_27374) ? super.method_10762(var1) : class_8532.field_43674.method_17649(false);
   }

   @Override
   public boolean method_10793(class_2522 var1, class_6163 var2, class_1331 var3, class_2929 var4) {
      return false;
   }
}
