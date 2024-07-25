package remapped;

import java.util.List;

public class class_7374 extends class_3893 {
   private static String[] field_37683;

   public class_7374(class_7238 var1, class_8039 var2, class_8039 var3) {
      this.field_37681 = var1;
      this.field_37680 = var2;
      this.field_37682 = var3;
   }

   @Override
   public void method_18023() {
      this.method_18028(class_8039.field_41157);
      if (this.field_37680 == null) {
         this.method_18028(this.field_37682);
      } else {
         this.method_18030(this.field_37680, this.field_37682);
      }

      this.method_18025(var2 -> {
         int var5 = var2.<Integer>method_23248(class_8039.field_41157, 0);
         List var6 = var2.<List>method_23248(var1, 0);
         this.field_37681.method_33131(var5, var6, var2.method_23255());
      });
   }
}
