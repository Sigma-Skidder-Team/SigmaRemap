package remapped;

import java.util.logging.Level;

public class class_4662 implements class_6224 {
   public class_4662(class_1144 var1, class_2291[] var2, class_6224 var3) {
      this.field_22738 = var1;
      this.field_22740 = var2;
      this.field_22739 = var3;
   }

   @Override
   public void method_28452(Object... var1) {
      class_2291 var4 = (class_2291)var1[0];
      if (this.field_22740[0] != null && !var4.field_11434.equals(this.field_22740[0].field_11434)) {
         if (class_1144.method_5064().isLoggable(Level.FINE)) {
            class_1144.method_5064().fine(String.format("'%s' works - aborting '%s'", var4.field_11434, this.field_22740[0].field_11434));
         }

         this.field_22739.method_28452();
      }
   }
}
