package remapped;

import org.newdawn.slick.svg.ParsingException;
import org.w3c.dom.Element;

public class class_3325 implements class_850 {
   @Override
   public void method_3700(class_1181 var1, Element var2, class_4226 var3, class_4508 var4) throws ParsingException {
      class_4508 var7 = class_6263.method_28569(var2);
      var7 = new class_4508(var4, var7);
      float var8 = class_6263.method_28568(var2, "cx");
      float var9 = class_6263.method_28568(var2, "cy");
      float var10 = class_6263.method_28568(var2, "rx");
      float var11 = class_6263.method_28568(var2, "ry");
      class_9609 var12 = new class_9609(var8, var9, var10, var11);
      class_3316 var13 = var12.method_15207(var7);
      class_791 var14 = class_6263.method_28567(var2);
      var14.method_3515("cx", "" + var8);
      var14.method_3515("cy", "" + var9);
      var14.method_3515("rx", "" + var10);
      var14.method_3515("ry", "" + var11);
      var3.method_19675(new class_384(1, var13, var14, var7));
   }

   @Override
   public boolean method_3699(Element var1) {
      return !var1.getNodeName().equals("ellipse")
         ? var1.getNodeName().equals("path") && "arc".equals(var1.getAttributeNS("http://sodipodi.sourceforge.net/DTD/sodipodi-0.dtd", "type"))
         : true;
   }
}
