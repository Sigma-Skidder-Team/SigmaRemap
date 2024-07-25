package remapped;

import org.newdawn.slick.svg.ParsingException;
import org.w3c.dom.Element;

public class class_1916 implements class_850 {
   @Override
   public boolean method_3699(Element var1) {
      return var1.getNodeName().equals("g");
   }

   @Override
   public void method_3700(class_1181 var1, Element var2, class_4226 var3, class_4508 var4) throws ParsingException {
      class_4508 var7 = class_6263.method_28569(var2);
      var7 = new class_4508(var4, var7);
      var1.method_5223(var2, var7);
   }
}
