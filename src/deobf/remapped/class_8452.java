package remapped;

import com.google.common.primitives.Ints;

public class class_8452 extends class_3893 {
   private static String[] field_43217;

   public class_8452(class_8633 var1) {
      this.field_43218 = var1;
   }

   @Override
   public void method_18023() {
      this.method_18028(class_8039.field_41133);
      this.method_18025(var0 -> {
         String var3 = var0.<String>method_23242(class_8039.field_41171);
         Integer var4;
         if (var3.length() >= 19 && (var4 = Ints.tryParse(var3.substring(18))) != null) {
            var0.method_23236(class_8039.field_41157, var4);
         } else {
            var0.method_23245();
         }
      });
   }
}
