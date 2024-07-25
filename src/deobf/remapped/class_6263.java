package remapped;

import java.util.StringTokenizer;
import org.newdawn.slick.svg.ParsingException;
import org.w3c.dom.Element;

public class class_6263 {
   public static final String field_32006 = "http://www.inkscape.org/namespaces/inkscape";
   public static final String field_32007 = "http://sodipodi.sourceforge.net/DTD/sodipodi-0.dtd";
   public static final String field_32008 = "http://www.w3.org/1999/xlink";

   public static class_791 method_28567(Element var0) {
      String var3 = method_28571(var0);
      class_3951 var4 = new class_3951(var3, var0);
      var4.method_3515("id", var0.getAttribute("id"));
      var4.method_3515("fill", method_28574(var0, "fill"));
      var4.method_3515("stroke", method_28574(var0, "stroke"));
      var4.method_3515("opacity", method_28574(var0, "opacity"));
      var4.method_3515("stroke-dasharray", method_28574(var0, "stroke-dasharray"));
      var4.method_3515("stroke-dashoffset", method_28574(var0, "stroke-dashoffset"));
      var4.method_3515("stroke-miterlimit", method_28574(var0, "stroke-miterlimit"));
      var4.method_3515("stroke-opacity", method_28574(var0, "stroke-opacity"));
      var4.method_3515("stroke-width", method_28574(var0, "stroke-width"));
      return var4;
   }

   public static String method_28571(Element var0) {
      String var3 = var0.getAttributeNS("http://www.inkscape.org/namespaces/inkscape", "label");
      return var3 != null && !var3.equals("") ? var3 : var0.getAttribute("id");
   }

   public static String method_28574(Element var0, String var1) {
      String var4 = var0.getAttribute(var1);
      if (var4 != null && var4.length() > 0) {
         return var4;
      } else {
         String var5 = var0.getAttribute("style");
         return method_28566(var5, var1);
      }
   }

   public static String method_28566(String var0, String var1) {
      if (var0 == null) {
         return "";
      } else {
         StringTokenizer var4 = new StringTokenizer(var0, ";");

         while (var4.hasMoreTokens()) {
            String var5 = var4.nextToken();
            String var6 = var5.substring(0, var5.indexOf(58));
            if (var6.equals(var1)) {
               return var5.substring(var5.indexOf(58) + 1);
            }
         }

         return "";
      }
   }

   public static class_4508 method_28569(Element var0) {
      return method_28570(var0, "transform");
   }

   public static class_4508 method_28570(Element var0, String var1) {
      String var4 = var0.getAttribute(var1);
      if (var4 == null) {
         return new class_4508();
      } else if (var4.equals("")) {
         return new class_4508();
      } else if (var4.startsWith("translate")) {
         var4 = var4.substring(0, var4.length() - 1);
         var4 = var4.substring("translate(".length());
         StringTokenizer var13 = new StringTokenizer(var4, ", ");
         float var14 = Float.parseFloat(var13.nextToken());
         float var15 = Float.parseFloat(var13.nextToken());
         return class_4508.method_20944(var14, var15);
      } else if (!var4.startsWith("matrix")) {
         return new class_4508();
      } else {
         float[] var5 = new float[6];
         var4 = var4.substring(0, var4.length() - 1);
         var4 = var4.substring("matrix(".length());
         StringTokenizer var6 = new StringTokenizer(var4, ", ");
         float[] var7 = new float[6];

         for (int var8 = 0; var8 < var7.length; var8++) {
            var7[var8] = Float.parseFloat(var6.nextToken());
         }

         var5[0] = var7[0];
         var5[1] = var7[2];
         var5[2] = var7[4];
         var5[3] = var7[1];
         var5[4] = var7[3];
         var5[5] = var7[5];
         return new class_4508(var5);
      }
   }

   public static float method_28568(Element var0, String var1) throws ParsingException {
      String var4 = var0.getAttribute(var1);
      if (var4 == null || var4.equals("")) {
         var4 = var0.getAttributeNS("http://sodipodi.sourceforge.net/DTD/sodipodi-0.dtd", var1);
      }

      try {
         return Float.parseFloat(var4);
      } catch (NumberFormatException var6) {
         throw new class_4815(var0, "Invalid value for: " + var1, var6);
      }
   }

   public static String method_28572(String var0) {
      return var0.length() >= 2 ? var0.substring(1, var0.length()) : "";
   }
}
