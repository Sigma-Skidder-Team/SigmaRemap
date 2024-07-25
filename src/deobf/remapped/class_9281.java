package remapped;

import java.util.Random;

public class class_9281 extends class_6414 {
   private static String[] field_47344;
   public static final class_7044 field_47342 = class_6023.field_30686;
   public static final class_4190 field_47343 = class_6414.method_29292(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   public class_9281(class_3073 var1) {
      super(var1);
      this.method_29284(this.field_32751.method_36446().method_10308(field_47342, Integer.valueOf(0)));
   }

   @Override
   public class_4190 method_10769(class_2522 var1, class_6163 var2, class_1331 var3, class_214 var4) {
      return field_47343;
   }

   @Override
   public void method_10797(class_2522 var1, class_6331 var2, class_1331 var3, Random var4) {
      if (!var1.method_8309(var2, var3)) {
         var2.method_7510(var3, true);
      }
   }

   @Override
   public void method_10783(class_2522 var1, class_6331 var2, class_1331 var3, Random var4) {
      if (var2.method_22548(var3.method_6081())) {
         int var7 = 1;

         while (var2.method_28262(var3.method_6101(var7)).method_8350(this)) {
            var7++;
         }

         if (var7 < 3) {
            int var8 = var1.<Integer>method_10313(field_47342);
            if (var8 != 15) {
               var2.method_7513(var3, var1.method_10308(field_47342, Integer.valueOf(var8 + 1)), 4);
            } else {
               var2.method_29594(var3.method_6081(), this.method_29260());
               var2.method_7513(var3, var1.method_10308(field_47342, Integer.valueOf(0)), 4);
            }
         }
      }
   }

   @Override
   public class_2522 method_10763(class_2522 var1, Direction var2, class_2522 var3, class_9379 var4, class_1331 var5, class_1331 var6) {
      if (!var1.method_8309(var4, var5)) {
         var4.method_43367().method_14011(var5, this, 1);
      }

      return super.method_10763(var1, var2, var3, var4, var5, var6);
   }

   @Override
   public boolean method_10787(class_2522 var1, class_4924 var2, class_1331 var3) {
      class_2522 var6 = var2.method_28262(var3.method_6100());
      if (var6.method_8360() == this) {
         return true;
      } else {
         if (var6.method_8350(class_4783.field_23259)
            || var6.method_8350(class_4783.field_23592)
            || var6.method_8350(class_4783.field_23577)
            || var6.method_8350(class_4783.field_23201)
            || var6.method_8350(class_4783.field_23216)
            || var6.method_8350(class_4783.field_23814)) {
            class_1331 var7 = var3.method_6100();

            for (Direction var9 : class_9594.field_48893) {
               class_2522 var10 = var2.method_28262(var7.method_6098(var9));
               class_4774 var11 = var2.method_28258(var7.method_6098(var9));
               if (var11.method_22007(class_6503.field_33094) || var10.method_8350(class_4783.field_23320)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   public void method_29282(class_2203<class_6414, class_2522> var1) {
      var1.method_10162(field_47342);
   }
}
