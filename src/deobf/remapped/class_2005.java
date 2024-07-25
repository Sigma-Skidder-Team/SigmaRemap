package remapped;

public class class_2005 extends class_3893 {
   private static String[] field_10179;

   public class_2005(class_3672 var1, class_8039 var2, class_8039 var3) {
      this.field_10176 = var1;
      this.field_10178 = var2;
      this.field_10177 = var3;
   }

   @Override
   public void method_18023() {
      this.method_18028(class_8039.field_41179);
      this.method_18028(class_8039.field_41161);
      this.method_18028(this.field_10178);
      this.method_18028(this.field_10178);
      this.method_18028(this.field_10178);
      this.method_18028(class_8039.field_41146);
      this.method_18028(class_8039.field_41146);
      this.method_18028(class_8039.field_41146);
      this.method_18028(class_8039.field_41146);
      this.method_18028(class_8039.field_41179);
      this.method_18025(var2 -> {
         int var5 = var2.<Integer>method_23248(class_8039.field_41179, 0);
         if (var5 != -1) {
            class_6452 var6 = class_3672.method_17032(this.field_10176).method_19008().method_28203();
            if (var5 == var6.method_29413() || var5 == var6.method_29416()) {
               int var7 = var2.<Integer>method_23261(class_8039.field_41157);
               var2.method_23257(class_8039.field_41157, 0, class_3672.method_17032(this.field_10176).method_19008().method_28217(var7));
            } else if (var5 == var6.method_29415()) {
               class_3672.method_17033(this.field_10176).method_23451(var2.<class_9530>method_23261(var1));
            }

            int var8 = class_3672.method_17032(this.field_10176).method_19008().method_28202(var5);
            if (var8 != var5) {
               var2.method_23257(class_8039.field_41179, 0, var8);
            }
         }
      });
   }
}
