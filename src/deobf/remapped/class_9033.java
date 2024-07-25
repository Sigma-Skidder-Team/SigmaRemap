package remapped;

import org.newdawn.slick.svg.ParsingException;
import org.w3c.dom.Element;

public class class_9033 implements class_850 {
   @Override
   public void method_3700(class_1181 var1, Element var2, class_4226 var3, class_4508 var4) throws ParsingException {
      class_4508 var7 = class_6263.method_28569(var2);
      var7 = new class_4508(var4, var7);
      float var8 = Float.parseFloat(var2.getAttribute("width"));
      float var9 = Float.parseFloat(var2.getAttribute("height"));
      float var10 = Float.parseFloat(var2.getAttribute("x"));
      float var11 = Float.parseFloat(var2.getAttribute("y"));
      class_2783 var12 = new class_2783(var10, var11, var8 + 1.0F, var9 + 1.0F);
      class_3316 var13 = var12.method_15207(var7);
      class_791 var14 = class_6263.method_28567(var2);
      var14.method_3515("width", "" + var8);
      var14.method_3515("height", "" + var9);
      var14.method_3515("x", "" + var10);
      var14.method_3515("y", "" + var11);
      var3.method_19675(new class_384(3, var13, var14, var7));
   }

   @Override
   public boolean method_3699(Element var1) {
      return var1.getNodeName().equals("rect");
   }
}
