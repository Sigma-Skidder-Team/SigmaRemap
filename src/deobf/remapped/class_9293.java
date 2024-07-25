package remapped;

import java.util.ArrayList;
import org.newdawn.slick.svg.ParsingException;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class class_9293 implements class_850 {
   @Override
   public boolean method_3699(Element var1) {
      return var1.getNodeName().equals("defs");
   }

   @Override
   public void method_3700(class_1181 var1, Element var2, class_4226 var3, class_4508 var4) throws ParsingException {
      NodeList var7 = var2.getElementsByTagName("pattern");

      for (int var8 = 0; var8 < var7.getLength(); var8++) {
         Element var9 = (Element)var7.item(var8);
         NodeList var10 = var9.getElementsByTagName("image");
         if (var10.getLength() != 0) {
            Element var11 = (Element)var10.item(0);
            String var12 = var9.getAttribute("id");
            String var13 = var11.getAttributeNS("http://www.w3.org/1999/xlink", "href");
            var3.method_19683(var12, var13);
         } else {
            class_2598.method_11777("Pattern 1981 does not specify an image. Only image patterns are supported.");
         }
      }

      NodeList var24 = var2.getElementsByTagName("linearGradient");
      ArrayList var25 = new ArrayList();

      for (int var26 = 0; var26 < var24.getLength(); var26++) {
         Element var28 = (Element)var24.item(var26);
         String var31 = var28.getAttribute("id");
         class_1993 var33 = new class_1993(var31, false);
         var33.method_9257(class_6263.method_28570(var28, "gradientTransform"));
         if (this.method_42766(var28.getAttribute("x1")) > 0) {
            var33.method_9242(Float.parseFloat(var28.getAttribute("x1")));
         }

         if (this.method_42766(var28.getAttribute("x2")) > 0) {
            var33.method_9245(Float.parseFloat(var28.getAttribute("x2")));
         }

         if (this.method_42766(var28.getAttribute("y1")) > 0) {
            var33.method_9249(Float.parseFloat(var28.getAttribute("y1")));
         }

         if (this.method_42766(var28.getAttribute("y2")) > 0) {
            var33.method_9259(Float.parseFloat(var28.getAttribute("y2")));
         }

         String var14 = var28.getAttributeNS("http://www.w3.org/1999/xlink", "href");
         if (this.method_42766(var14) > 0) {
            var33.method_9247(var14.substring(1));
            var25.add(var33);
         } else {
            NodeList var15 = var28.getElementsByTagName("stop");

            for (int var16 = 0; var16 < var15.getLength(); var16++) {
               Element var17 = (Element)var15.item(var16);
               float var18 = Float.parseFloat(var17.getAttribute("offset"));
               String var19 = class_6263.method_28566(var17.getAttribute("style"), "stop-color");
               String var20 = class_6263.method_28566(var17.getAttribute("style"), "stop-opacity");
               int var21 = Integer.parseInt(var19.substring(1), 16);
               class_8709 var22 = new class_8709(var21);
               var22.field_44645 = Float.parseFloat(var20);
               var33.method_9251(var18, var22);
            }

            var33.method_9256();
         }

         var3.method_19682(var31, var33);
      }

      NodeList var27 = var2.getElementsByTagName("radialGradient");

      for (int var29 = 0; var29 < var27.getLength(); var29++) {
         Element var32 = (Element)var27.item(var29);
         String var34 = var32.getAttribute("id");
         class_1993 var35 = new class_1993(var34, true);
         var35.method_9257(class_6263.method_28570(var32, "gradientTransform"));
         if (this.method_42766(var32.getAttribute("cx")) > 0) {
            var35.method_9242(Float.parseFloat(var32.getAttribute("cx")));
         }

         if (this.method_42766(var32.getAttribute("cy")) > 0) {
            var35.method_9249(Float.parseFloat(var32.getAttribute("cy")));
         }

         if (this.method_42766(var32.getAttribute("fx")) > 0) {
            var35.method_9245(Float.parseFloat(var32.getAttribute("fx")));
         }

         if (this.method_42766(var32.getAttribute("fy")) > 0) {
            var35.method_9259(Float.parseFloat(var32.getAttribute("fy")));
         }

         if (this.method_42766(var32.getAttribute("r")) > 0) {
            var35.method_9254(Float.parseFloat(var32.getAttribute("r")));
         }

         String var36 = var32.getAttributeNS("http://www.w3.org/1999/xlink", "href");
         if (this.method_42766(var36) <= 0) {
            NodeList var37 = var32.getElementsByTagName("stop");

            for (int var38 = 0; var38 < var37.getLength(); var38++) {
               Element var39 = (Element)var37.item(var38);
               float var40 = Float.parseFloat(var39.getAttribute("offset"));
               String var41 = class_6263.method_28566(var39.getAttribute("style"), "stop-color");
               String var42 = class_6263.method_28566(var39.getAttribute("style"), "stop-opacity");
               int var43 = Integer.parseInt(var41.substring(1), 16);
               class_8709 var23 = new class_8709(var43);
               var23.field_44645 = Float.parseFloat(var42);
               var35.method_9251(var40, var23);
            }

            var35.method_9256();
         } else {
            var35.method_9247(var36.substring(1));
            var25.add(var35);
         }

         var3.method_19682(var34, var35);
      }

      for (int var30 = 0; var30 < var25.size(); var30++) {
         ((class_1993)var25.get(var30)).method_9260(var3);
         ((class_1993)var25.get(var30)).method_9256();
      }
   }

   private int method_42766(String var1) {
      return var1 != null ? var1.length() : 0;
   }
}
