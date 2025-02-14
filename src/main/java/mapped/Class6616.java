package mapped;

import org.w3c.dom.Element;

public class Class6616 extends Class6615 {
   private static String[] field29116;
   private Element field29117;

   public Class6616(String var1, Element var2) {
      super(var1);
      this.field29117 = var2;
   }

   @Override
   public String method20117(String var1) {
      String var4 = super.method20117(var1);
      if (var4 == null) {
         var4 = this.field29117.getAttribute(var1);
      }

      return var4;
   }

   public Element method20123() {
      return this.field29117;
   }
}
