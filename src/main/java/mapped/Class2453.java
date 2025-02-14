package mapped;

import org.w3c.dom.Element;

public class Class2453 extends Class2451 {
   public Class2453(String var1, String var2, Throwable var3) {
      super("(" + var1 + ") " + var2, var3);
   }

   public Class2453(Element var1, String var2, Throwable var3) {
      super("(" + var1.getAttribute("id") + ") " + var2, var3);
   }

   public Class2453(String var1, String var2) {
      super("(" + var1 + ") " + var2);
   }

   public Class2453(Element var1, String var2) {
      super("(" + var1.getAttribute("id") + ") " + var2);
   }
}
