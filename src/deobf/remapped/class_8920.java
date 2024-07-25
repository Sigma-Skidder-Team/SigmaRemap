package remapped;

import java.util.ResourceBundle;

public class class_8920 implements class_2676 {
   private final ResourceBundle field_45733;

   public class_8920(String var1) {
      this.field_45733 = ResourceBundle.getBundle(var1);
   }

   public String 醧敤랾樽鷏뼢(String var1) {
      return !this.field_45733.containsKey(var1) ? null : this.field_45733.getString(var1);
   }

   public ResourceBundle method_41021() {
      return this.field_45733;
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (var1 instanceof class_8920) {
         class_8920 var4 = (class_8920)var1;
         if (!var4.method_41020(this)) {
            return false;
         } else {
            ResourceBundle var5 = this.method_41021();
            ResourceBundle var6 = var4.method_41021();
            return var5 != null ? var5.equals(var6) : var6 == null;
         }
      } else {
         return false;
      }
   }

   public boolean method_41020(Object var1) {
      return var1 instanceof class_8920;
   }

   @Override
   public int hashCode() {
      byte var3 = 59;
      byte var4 = 1;
      ResourceBundle var5 = this.method_41021();
      return var4 * 59 + (var5 != null ? var5.hashCode() : 43);
   }

   @Override
   public String toString() {
      return "TranslationRegistry.ResourceBundleProvider(bundle=" + this.method_41021() + ")";
   }
}
