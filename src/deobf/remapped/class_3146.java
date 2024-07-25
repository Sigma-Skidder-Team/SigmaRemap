package remapped;

import java.util.logging.Level;

public class class_3146 implements class_6224 {
   public class_3146(class_1144 var1, class_2291[] var2, class_6224 var3, String var4, class_1144 var5) {
      this.field_15651 = var1;
      this.field_15649 = var2;
      this.field_15650 = var3;
      this.field_15647 = var4;
      this.field_15652 = var5;
   }

   @Override
   public void method_28452(Object... var1) {
      Object var4 = var1[0];
      class_5773 var5;
      if (!(var4 instanceof Exception)) {
         if (!(var4 instanceof String)) {
            var5 = new class_5773("probe error");
         } else {
            var5 = new class_5773("probe error: " + (String)var4);
         }
      } else {
         var5 = new class_5773("probe error", (Exception)var4);
      }

      var5.field_29160 = this.field_15649[0].field_11434;
      this.field_15650.method_28452();
      if (class_1144.method_5064().isLoggable(Level.FINE)) {
         class_1144.method_5064().fine(String.format("probe transport \"%s\" failed because of error: %s", this.field_15647, var4));
      }

      this.field_15652.method_19325("upgradeError", new Object[]{var5});
   }
}
