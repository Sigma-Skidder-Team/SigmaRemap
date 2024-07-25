package remapped;

import java.util.StringTokenizer;
import org.newdawn.slick.svg.ParsingException;
import org.w3c.dom.Element;

public class class_7759 implements class_850 {
   private static int method_35203(class_6714 var0, Element var1, StringTokenizer var2) throws ParsingException {
      int var5 = 0;

      while (var2.hasMoreTokens()) {
         String var6 = var2.nextToken();
         if (!var6.equals("L")) {
            if (var6.equals("z")) {
               break;
            }

            if (!var6.equals("M")) {
               if (var6.equals("C")) {
                  return 0;
               }

               String var7 = var6;
               String var8 = var2.nextToken();

               try {
                  float var9 = Float.parseFloat(var7);
                  float var10 = Float.parseFloat(var8);
                  var0.method_30834(var9, var10);
                  var5++;
               } catch (NumberFormatException var11) {
                  throw new class_4815(var1.getAttribute("id"), "Invalid token in points list", var11);
               }
            }
         }
      }

      return var5;
   }

   @Override
   public void method_3700(class_1181 var1, Element var2, class_4226 var3, class_4508 var4) throws ParsingException {
      class_4508 var7 = class_6263.method_28569(var2);
      var7 = new class_4508(var4, var7);
      float var11;
      float var12;
      float var13;
      float var14;
      if (!var2.getNodeName().equals("line")) {
         String var8 = var2.getAttribute("d");
         StringTokenizer var9 = new StringTokenizer(var8, ", ");
         class_6714 var10 = new class_6714();
         if (method_35203(var10, var2, var9) != 2) {
            return;
         }

         var11 = var10.method_15229(0)[0];
         var13 = var10.method_15229(0)[1];
         var12 = var10.method_15229(1)[0];
         var14 = var10.method_15229(1)[1];
      } else {
         var11 = Float.parseFloat(var2.getAttribute("x1"));
         var12 = Float.parseFloat(var2.getAttribute("x2"));
         var13 = Float.parseFloat(var2.getAttribute("y1"));
         var14 = Float.parseFloat(var2.getAttribute("y2"));
      }

      float[] var17 = new float[]{var11, var13, var12, var14};
      float[] var18 = new float[4];
      var7.method_20952(var17, 0, var18, 0, 2);
      class_7133 var19 = new class_7133(var18[0], var18[1], var18[2], var18[3]);
      class_791 var15 = class_6263.method_28567(var2);
      var15.method_3515("x1", "" + var11);
      var15.method_3515("x2", "" + var12);
      var15.method_3515("y1", "" + var13);
      var15.method_3515("y2", "" + var14);
      var3.method_19675(new class_384(2, var19, var15, var7));
   }

   @Override
   public boolean method_3699(Element var1) {
      return !var1.getNodeName().equals("line")
         ? var1.getNodeName().equals("path") && !"arc".equals(var1.getAttributeNS("http://sodipodi.sourceforge.net/DTD/sodipodi-0.dtd", "type"))
         : true;
   }
}
