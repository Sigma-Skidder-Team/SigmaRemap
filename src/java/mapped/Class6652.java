package mapped;

import java.util.ArrayList;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Class6652 implements Class6650 {
   @Override
   public boolean method20303(Element var1) {
      return var1.getNodeName().equals("defs");
   }

   @Override
   public void method20302(Class6968 var1, Element var2, Class7710 var3, Class8412 var4) throws Class2453 {
      NodeList var7 = var2.getElementsByTagName("pattern");

      for (int var8 = 0; var8 < var7.getLength(); var8++) {
         Element var9 = (Element)var7.item(var8);
         NodeList var10 = var9.getElementsByTagName("image");
         if (var10.getLength() != 0) {
            Element var11 = (Element)var10.item(0);
            String var12 = var9.getAttribute("id");
            String var13 = var11.getAttributeNS("http://www.w3.org/1999/xlink", "href");
            var3.method25470(var12, var13);
         } else {
            Log.method25663("Pattern 1981 does not specify an image. Only image patterns are supported.");
         }
      }

      NodeList var24 = var2.getElementsByTagName("linearGradient");
      ArrayList var25 = new ArrayList();

      for (int var26 = 0; var26 < var24.getLength(); var26++) {
         Element var28 = (Element)var24.item(var26);
         String var31 = var28.getAttribute("id");
         Class7462 var33 = new Class7462(var31, false);
         var33.method24134(Class8885.method32336(var28, "gradientTransform"));
         if (this.method20304(var28.getAttribute("x1")) > 0) {
            var33.method24141(Float.parseFloat(var28.getAttribute("x1")));
         }

         if (this.method20304(var28.getAttribute("x2")) > 0) {
            var33.method24142(Float.parseFloat(var28.getAttribute("x2")));
         }

         if (this.method20304(var28.getAttribute("y1")) > 0) {
            var33.method24143(Float.parseFloat(var28.getAttribute("y1")));
         }

         if (this.method20304(var28.getAttribute("y2")) > 0) {
            var33.method24144(Float.parseFloat(var28.getAttribute("y2")));
         }

         String var14 = var28.getAttributeNS("http://www.w3.org/1999/xlink", "href");
         if (this.method20304(var14) > 0) {
            var33.method24136(var14.substring(1));
            var25.add(var33);
         } else {
            NodeList var15 = var28.getElementsByTagName("stop");

            for (int var16 = 0; var16 < var15.getLength(); var16++) {
               Element var17 = (Element)var15.item(var16);
               float var18 = Float.parseFloat(var17.getAttribute("offset"));
               String var19 = Class8885.method32334(var17.getAttribute("style"), "stop-color");
               String var20 = Class8885.method32334(var17.getAttribute("style"), "stop-opacity");
               int var21 = Integer.parseInt(var19.substring(1), 16);
               Color var22 = new Color(var21);
               var22.field16458 = Float.parseFloat(var20);
               var33.method24150(var18, var22);
            }

            var33.method24139();
         }

         var3.method25471(var31, var33);
      }

      NodeList var27 = var2.getElementsByTagName("radialGradient");

      for (int var29 = 0; var29 < var27.getLength(); var29++) {
         Element var32 = (Element)var27.item(var29);
         String var34 = var32.getAttribute("id");
         Class7462 var35 = new Class7462(var34, true);
         var35.method24134(Class8885.method32336(var32, "gradientTransform"));
         if (this.method20304(var32.getAttribute("cx")) > 0) {
            var35.method24141(Float.parseFloat(var32.getAttribute("cx")));
         }

         if (this.method20304(var32.getAttribute("cy")) > 0) {
            var35.method24143(Float.parseFloat(var32.getAttribute("cy")));
         }

         if (this.method20304(var32.getAttribute("fx")) > 0) {
            var35.method24142(Float.parseFloat(var32.getAttribute("fx")));
         }

         if (this.method20304(var32.getAttribute("fy")) > 0) {
            var35.method24144(Float.parseFloat(var32.getAttribute("fy")));
         }

         if (this.method20304(var32.getAttribute("r")) > 0) {
            var35.method24140(Float.parseFloat(var32.getAttribute("r")));
         }

         String var36 = var32.getAttributeNS("http://www.w3.org/1999/xlink", "href");
         if (this.method20304(var36) <= 0) {
            NodeList var37 = var32.getElementsByTagName("stop");

            for (int var38 = 0; var38 < var37.getLength(); var38++) {
               Element var39 = (Element)var37.item(var38);
               float var40 = Float.parseFloat(var39.getAttribute("offset"));
               String var41 = Class8885.method32334(var39.getAttribute("style"), "stop-color");
               String var42 = Class8885.method32334(var39.getAttribute("style"), "stop-opacity");
               int var43 = Integer.parseInt(var41.substring(1), 16);
               Color var23 = new Color(var43);
               var23.field16458 = Float.parseFloat(var42);
               var35.method24150(var40, var23);
            }

            var35.method24139();
         } else {
            var35.method24136(var36.substring(1));
            var25.add(var35);
         }

         var3.method25471(var34, var35);
      }

      for (int var30 = 0; var30 < var25.size(); var30++) {
         ((Class7462)var25.get(var30)).method24137(var3);
         ((Class7462)var25.get(var30)).method24139();
      }
   }

   private int method20304(String var1) {
      return var1 != null ? var1.length() : 0;
   }
}
