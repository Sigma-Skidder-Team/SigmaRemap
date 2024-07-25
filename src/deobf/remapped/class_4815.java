package remapped;

import org.w3c.dom.Element;

public class class_4815 extends class_1162 {
   public class_4815(String var1, String var2, Throwable var3) {
      super("(" + var1 + ") " + var2, var3);
   }

   public class_4815(Element var1, String var2, Throwable var3) {
      super("(" + var1.getAttribute("id") + ") " + var2, var3);
   }

   public class_4815(String var1, String var2) {
      super("(" + var1 + ") " + var2);
   }

   public class_4815(Element var1, String var2) {
      super("(" + var1.getAttribute("id") + ") " + var2);
   }
}
