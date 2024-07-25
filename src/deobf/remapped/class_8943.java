package remapped;

import java.util.ArrayList;
import java.util.StringTokenizer;
import org.newdawn.slick.svg.ParsingException;
import org.w3c.dom.Element;

public class class_8943 implements class_850 {
   private static int method_41082(class_6714 var0, Element var1, StringTokenizer var2) throws ParsingException {
      int var5 = 0;
      new ArrayList();
      boolean var7 = false;
      boolean var8 = false;

      while (var2.hasMoreTokens()) {
         String var9 = var2.nextToken();
         if (!var9.equals("L")) {
            if (var9.equals("z")) {
               var8 = true;
               break;
            }

            if (var9.equals("M")) {
               if (var7) {
                  return 0;
               }

               var7 = true;
            } else {
               if (var9.equals("C")) {
                  return 0;
               }

               String var10 = var9;
               String var11 = var2.nextToken();

               try {
                  float var12 = Float.parseFloat(var10);
                  float var13 = Float.parseFloat(var11);
                  var0.method_30834(var12, var13);
                  var5++;
               } catch (NumberFormatException var14) {
                  throw new class_4815(var1.getAttribute("id"), "Invalid token in points list", var14);
               }
            }
         }
      }

      var0.method_30833(var8);
      return var5;
   }

   @Override
   public void method_3700(class_1181 var1, Element var2, class_4226 var3, class_4508 var4) throws ParsingException {
      class_4508 var7 = class_6263.method_28569(var2);
      var7 = new class_4508(var4, var7);
      String var8 = var2.getAttribute("points");
      if (var2.getNodeName().equals("path")) {
         var8 = var2.getAttribute("d");
      }

      StringTokenizer var9 = new StringTokenizer(var8, ", ");
      class_6714 var10 = new class_6714();
      int var11 = method_41082(var10, var2, var9);
      class_791 var12 = class_6263.method_28567(var2);
      if (var11 > 3) {
         class_3316 var13 = var10.method_15207(var7);
         var3.method_19675(new class_384(5, var13, var12, var7));
      }
   }

   @Override
   public boolean method_3699(Element var1) {
      return !var1.getNodeName().equals("polygon")
         ? var1.getNodeName().equals("path") && !"arc".equals(var1.getAttributeNS("http://sodipodi.sourceforge.net/DTD/sodipodi-0.dtd", "type"))
         : true;
   }
}
