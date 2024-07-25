package remapped;

import javax.annotation.Nullable;

public class class_6261 extends class_6414 implements class_2593 {
   private static String[] field_31997;
   public static final class_6720 field_31998 = class_6023.field_30719;
   private static final class_4190 field_31999 = class_6414.method_29292(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   public class_6261(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_31998, Boolean.valueOf(true)));
   }

   public void method_28562(class_2522 var1, class_9379 var2, class_1331 var3) {
      if (!method_28561(var1, var2, var3)) {
         var2.method_43367().method_14011(var3, this, 60 + var2.method_43360().nextInt(40));
      }
   }

   public static boolean method_28561(class_2522 var0, class_6163 var1, class_1331 var2) {
      if (var0.<Boolean>method_10313(field_31998)) {
         return true;
      } else {
         for (class_240 var8 : class_240.values()) {
            if (var1.method_28258(var2.method_6098(var8)).method_22007(class_6503.field_33094)) {
               return true;
            }
         }

         return false;
      }
   }

   @Nullable
   @Override
   public class_2522 method_29302(class_353 var1) {
      class_4774 var4 = var1.method_21862().method_28258(var1.method_21858());
      return this.method_29260().method_10308(field_31998, Boolean.valueOf(var4.method_22007(class_6503.field_33094) && var4.method_21996() == 8));
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return field_31999;
   }

   @Override
   public class_2522 method_10763(class_2522 var1, class_240 var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      if (var1.<Boolean>method_10313(field_31998)) {
         var4.method_43362().method_14011(var5, class_8532.field_43674, class_8532.field_43674.method_10711(var4));
      }

      return var2 == class_240.field_802 && !this.method_10787(var1, var4, var5)
         ? class_4783.field_23184.method_29260()
         : super.method_10763(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, class_1331 var3) {
      class_1331 var6 = var3.method_6100();
      return var2.method_28262(var6).method_8308(var2, var6, class_240.field_817);
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_31998);
   }

   @Override
   public class_4774 method_10762(class_2522 var1) {
      return !var1.<Boolean>method_10313(field_31998) ? super.method_10762(var1) : class_8532.field_43674.method_17649(false);
   }
}
