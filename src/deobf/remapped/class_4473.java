package remapped;

import org.newdawn.slick.svg.ParsingException;
import org.w3c.dom.Element;

public class class_4473 implements class_850 {
   @Override
   public boolean method_3699(Element var1) {
      return var1.getNodeName().equals("use");
   }

   @Override
   public void method_3700(class_1181 var1, Element var2, class_4226 var3, class_4508 var4) throws ParsingException {
      String var7 = var2.getAttributeNS("http://www.w3.org/1999/xlink", "href");
      String var8 = class_6263.method_28572(var7);
      class_384 var9 = var3.method_19686(var8);
      if (var9 != null) {
         class_4508 var10 = class_6263.method_28569(var2);
         class_4508 var11 = var10.method_20950(var9.method_1874());
         class_791 var12 = class_6263.method_28567(var2);
         class_3316 var13 = var9.method_1871().method_15207(var11);
         var12.method_3515("fill", var9.method_1873().method_3518("fill"));
         var12.method_3515("stroke", var9.method_1873().method_3518("stroke"));
         var12.method_3515("opacity", var9.method_1873().method_3518("opacity"));
         var12.method_3515("stroke-width", var9.method_1873().method_3518("stroke-width"));
         class_384 var14 = new class_384(var9.method_1872(), var13, var12, var11);
         var3.method_19675(var14);
      } else {
         throw new class_4815(var2, "Unable to locate referenced element: " + var8);
      }
   }
}
