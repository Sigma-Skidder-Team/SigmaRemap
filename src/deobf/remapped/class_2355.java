package remapped;

public class class_2355 extends class_3893 {
   private static String[] field_11826;

   public class_2355(class_8710 var1, int var2, int var3) {
      this.field_11828 = var1;
      this.field_11829 = var2;
      this.field_11827 = var3;
   }

   @Override
   public void method_18023() {
      this.method_18028(class_8039.field_41179);
      this.method_18028(class_8710.method_40035(this.field_11828));
      this.method_18028(class_8039.field_41179);
      this.method_18025(var3 -> {
         int var6 = var3.<Integer>method_23248(class_8039.field_41179, 0);
         int var7 = var3.<Integer>method_23248(class_8039.field_41179, 1);
         if (var6 != var1) {
            if (var6 == var2) {
               var3.method_23257(class_8039.field_41179, 1, class_8710.method_40043(this.field_11828).method_19008().method_28217(var7));
            }
         } else {
            var3.method_23257(class_8039.field_41179, 1, class_8710.method_40043(this.field_11828).method_19008().method_28210(var7));
         }
      });
   }
}
