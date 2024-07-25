package remapped;

public final class class_8473 {
   private class_1621 field_43416;
   private class_1621 field_43418;

   public class_8473(class_1621 var1, class_1621 var2) {
      if (var1 != null && var2 != null) {
         this.field_43416 = var1;
         this.field_43418 = var2;
      } else {
         throw new NullPointerException("Nodes must be provided.");
      }
   }

   public class_1621 method_38998() {
      return this.field_43416;
   }

   public class_1621 method_38999() {
      return this.field_43418;
   }

   @Override
   public String toString() {
      return "<NodeTuple keyNode=" + this.field_43416.toString() + "; valueNode=" + this.field_43418.toString() + ">";
   }
}
