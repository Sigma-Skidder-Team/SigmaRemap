package mapped;

import java.util.StringTokenizer;

import org.w3c.dom.Element;

public class Class8885 {
   public static final String field40206 = "http://www.inkscape.org/namespaces/inkscape";
   public static final String field40207 = "http://sodipodi.sourceforge.net/DTD/sodipodi-0.dtd";
   public static final String field40208 = "http://www.w3.org/1999/xlink";

   public static Class6615 method32331(Element var0) {
      String var3 = method32332(var0);
      Class6616 var4 = new Class6616(var3, var0);
      var4.method20114("id", var0.getAttribute("id"));
      var4.method20114("fill", method32333(var0, "fill"));
      var4.method20114("stroke", method32333(var0, "stroke"));
      var4.method20114("opacity", method32333(var0, "opacity"));
      var4.method20114("stroke-dasharray", method32333(var0, "stroke-dasharray"));
      var4.method20114("stroke-dashoffset", method32333(var0, "stroke-dashoffset"));
      var4.method20114("stroke-miterlimit", method32333(var0, "stroke-miterlimit"));
      var4.method20114("stroke-opacity", method32333(var0, "stroke-opacity"));
      var4.method20114("stroke-width", method32333(var0, "stroke-width"));
      return var4;
   }

   public static String method32332(Element var0) {
      String var3 = var0.getAttributeNS("http://www.inkscape.org/namespaces/inkscape", "label");
      return var3 != null && !var3.equals("") ? var3 : var0.getAttribute("id");
   }

   public static String method32333(Element var0, String var1) {
      String var4 = var0.getAttribute(var1);
      if (var4 != null && var4.length() > 0) {
         return var4;
      } else {
         String var5 = var0.getAttribute("style");
         return method32334(var5, var1);
      }
   }

   public static String method32334(String var0, String var1) {
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

   public static Class8412 method32335(Element var0) {
      return method32336(var0, "transform");
   }

   public static Class8412 method32336(Element var0, String var1) {
      String var4 = var0.getAttribute(var1);
      if (var4 == null) {
         return new Class8412();
      } else if (var4.equals("")) {
         return new Class8412();
      } else if (var4.startsWith("translate")) {
         var4 = var4.substring(0, var4.length() - 1);
         var4 = var4.substring("translate(".length());
         StringTokenizer var13 = new StringTokenizer(var4, ", ");
         float var14 = Float.parseFloat(var13.nextToken());
         float var15 = Float.parseFloat(var13.nextToken());
         return Class8412.method29534(var14, var15);
      } else if (!var4.startsWith("matrix")) {
         return new Class8412();
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
         return new Class8412(var5);
      }
   }

   public static float method32337(Element var0, String var1) throws Class2453 {
      String var4 = var0.getAttribute(var1);
      if (var4 == null || var4.equals("")) {
         var4 = var0.getAttributeNS("http://sodipodi.sourceforge.net/DTD/sodipodi-0.dtd", var1);
      }

      try {
         return Float.parseFloat(var4);
      } catch (NumberFormatException var6) {
         throw new Class2453(var0, "Invalid value for: " + var1, var6);
      }
   }

   public static String method32338(String var0) {
      return var0.length() >= 2 ? var0.substring(1, var0.length()) : "";
   }
}
