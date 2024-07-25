package remapped;

import java.util.ArrayList;
import java.util.StringTokenizer;
import org.newdawn.slick.svg.ParsingException;
import org.w3c.dom.Element;

public class class_7136 implements class_850 {
   private static class_453 method_32774(Element var0, StringTokenizer var1) throws ParsingException {
      boolean var4 = false;
      new ArrayList();
      boolean var6 = false;
      boolean var7 = false;
      class_453 var8 = null;

      while (var1.hasMoreTokens()) {
         try {
            String var9 = var1.nextToken();
            if (var9.equals("L")) {
               float var10 = Float.parseFloat(var1.nextToken());
               float var11 = Float.parseFloat(var1.nextToken());
               var8.method_2181(var10, var11);
            } else if (var9.equals("z")) {
               var8.method_2180();
            } else if (var9.equals("M")) {
               if (!var6) {
                  var6 = true;
                  float var17 = Float.parseFloat(var1.nextToken());
                  float var20 = Float.parseFloat(var1.nextToken());
                  var8 = new class_453(var17, var20);
               } else {
                  var7 = true;
                  float var18 = Float.parseFloat(var1.nextToken());
                  float var21 = Float.parseFloat(var1.nextToken());
                  var8.method_2182(var18, var21);
               }
            } else if (var9.equals("C")) {
               var7 = true;
               float var19 = Float.parseFloat(var1.nextToken());
               float var22 = Float.parseFloat(var1.nextToken());
               float var12 = Float.parseFloat(var1.nextToken());
               float var13 = Float.parseFloat(var1.nextToken());
               float var14 = Float.parseFloat(var1.nextToken());
               float var15 = Float.parseFloat(var1.nextToken());
               var8.method_2177(var14, var15, var19, var22, var12, var13);
            }
         } catch (NumberFormatException var16) {
            throw new class_4815(var0.getAttribute("id"), "Invalid token in points list", var16);
         }
      }

      return !var7 ? null : var8;
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
      class_453 var10 = method_32774(var2, var9);
      class_791 var11 = class_6263.method_28567(var2);
      if (var10 != null) {
         class_3316 var12 = var10.method_15207(var7);
         var3.method_19675(new class_384(4, var12, var11, var7));
      }
   }

   @Override
   public boolean method_3699(Element var1) {
      return var1.getNodeName().equals("path") && !"arc".equals(var1.getAttributeNS("http://sodipodi.sourceforge.net/DTD/sodipodi-0.dtd", "type"));
   }
}
