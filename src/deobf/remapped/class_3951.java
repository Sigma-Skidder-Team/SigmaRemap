package remapped;

import org.w3c.dom.Element;

public class class_3951 extends class_791 {
   private static String[] field_19172;
   private Element field_19171;

   public class_3951(String var1, Element var2) {
      super(var1);
      this.field_19171 = var2;
   }

   @Override
   public String method_3518(String var1) {
      String var4 = super.method_3518(var1);
      if (var4 == null) {
         var4 = this.field_19171.getAttribute(var1);
      }

      return var4;
   }

   public Element method_18258() {
      return this.field_19171;
   }
}
