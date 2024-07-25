package remapped;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class class_4125 {
   public static class_8095 method_19163(String var0, class_8709 var1) throws IOException {
      return method_19159(class_8975.method_41153(var0), null, null, var1);
   }

   public static class_8095 method_19161(String var0) throws IOException {
      return method_19159(class_8975.method_41153(var0), null, null, null);
   }

   public static class_8095 method_19155(File var0) throws IOException {
      return method_19159(new FileInputStream(var0), null, null, null);
   }

   public static class_8095 method_19160(InputStream var0, class_8709 var1) throws IOException {
      return method_19159(var0, null, null, var1);
   }

   public static class_8095 method_19157(InputStream var0) throws IOException {
      return method_19159(var0, null, null, null);
   }

   public static class_8095 method_19162(String var0, class_997 var1) throws IOException {
      return method_19159(class_8975.method_41153(var0), var1, null, null);
   }

   public static class_8095 method_19156(File var0, class_997 var1) throws IOException {
      return method_19159(new FileInputStream(var0), var1, null, null);
   }

   public static class_8095 method_19158(InputStream var0, class_997 var1) throws IOException {
      return method_19159(var0, var1, null, null);
   }

   public static class_8095 method_19159(InputStream var0, class_997 var1, class_8095 var2, class_8709 var3) throws IOException {
      if (var1 == null) {
         var1 = new class_4427();
      }

      try {
         DocumentBuilder var6 = DocumentBuilderFactory.newInstance().newDocumentBuilder();
         Document var7 = var6.parse(var0);
         Element var8 = var7.getDocumentElement();
         if (!var8.getNodeName().equals("system")) {
            throw new IOException("Not a particle system file");
         } else {
            if (var2 == null) {
               var2 = new class_8095("org/newdawn/slick/data/particle.tga", 2000, var3);
            }

            boolean var9 = "true".equals(var8.getAttribute("additive"));
            if (var9) {
               var2.method_36747(1);
            } else {
               var2.method_36747(2);
            }

            boolean var10 = "true".equals(var8.getAttribute("points"));
            var2.method_36750(var10);
            NodeList var11 = var8.getElementsByTagName("emitter");

            for (int var12 = 0; var12 < var11.getLength(); var12++) {
               Element var13 = (Element)var11.item(var12);
               class_487 var14 = ((class_997)var1).method_4333("new");
               method_19153(var13, var14);
               var2.method_36752(var14);
            }

            var2.method_36753(false);
            return var2;
         }
      } catch (IOException var15) {
         class_2598.method_11785(var15);
         throw var15;
      } catch (Exception var16) {
         class_2598.method_11785(var16);
         throw new IOException("Unable to load particle system config");
      }
   }

   public static void method_19164(File var0, class_8095 var1) throws IOException {
      method_19165(new FileOutputStream(var0), var1);
   }

   public static void method_19165(OutputStream var0, class_8095 var1) throws IOException {
      try {
         DocumentBuilder var4 = DocumentBuilderFactory.newInstance().newDocumentBuilder();
         Document var5 = var4.newDocument();
         Element var6 = var5.createElement("system");
         var6.setAttribute("additive", "" + (var1.method_36761() == 1));
         var6.setAttribute("points", "" + var1.method_36760());
         var5.appendChild(var6);

         for (int var7 = 0; var7 < var1.method_36770(); var7++) {
            class_3377 var8 = var1.method_36778(var7);
            if (!(var8 instanceof class_487)) {
               throw new RuntimeException("Only ConfigurableEmitter instances can be stored");
            }

            Element var9 = method_19154(var5, (class_487)var8);
            var6.appendChild(var9);
         }

         StreamResult var12 = new StreamResult(new OutputStreamWriter(var0, "utf-8"));
         DOMSource var13 = new DOMSource(var5);
         TransformerFactory var14 = TransformerFactory.newInstance();
         Transformer var10 = var14.newTransformer();
         var10.setOutputProperty("indent", "yes");
         var10.transform(var13, var12);
      } catch (Exception var11) {
         class_2598.method_11785(var11);
         throw new IOException("Unable to save configured particle system");
      }
   }

   public static class_487 method_19150(String var0) throws IOException {
      return method_19149(class_8975.method_41153(var0), null);
   }

   public static class_487 method_19146(File var0) throws IOException {
      return method_19149(new FileInputStream(var0), null);
   }

   public static class_487 method_19148(InputStream var0) throws IOException {
      return method_19149(var0, null);
   }

   public static class_487 method_19151(String var0, class_997 var1) throws IOException {
      return method_19149(class_8975.method_41153(var0), var1);
   }

   public static class_487 method_19147(File var0, class_997 var1) throws IOException {
      return method_19149(new FileInputStream(var0), var1);
   }

   public static class_487 method_19149(InputStream var0, class_997 var1) throws IOException {
      if (var1 == null) {
         var1 = new class_421();
      }

      try {
         DocumentBuilder var4 = DocumentBuilderFactory.newInstance().newDocumentBuilder();
         Document var5 = var4.parse(var0);
         if (!var5.getDocumentElement().getNodeName().equals("emitter")) {
            throw new IOException("Not a particle emitter file");
         } else {
            class_487 var6 = ((class_997)var1).method_4333("new");
            method_19153(var5.getDocumentElement(), var6);
            return var6;
         }
      } catch (IOException var7) {
         class_2598.method_11785(var7);
         throw var7;
      } catch (Exception var8) {
         class_2598.method_11785(var8);
         throw new IOException("Unable to load emitter");
      }
   }

   public static void method_19144(File var0, class_487 var1) throws IOException {
      method_19145(new FileOutputStream(var0), var1);
   }

   public static void method_19145(OutputStream var0, class_487 var1) throws IOException {
      try {
         DocumentBuilder var4 = DocumentBuilderFactory.newInstance().newDocumentBuilder();
         Document var5 = var4.newDocument();
         var5.appendChild(method_19154(var5, var1));
         StreamResult var6 = new StreamResult(new OutputStreamWriter(var0, "utf-8"));
         DOMSource var7 = new DOMSource(var5);
         TransformerFactory var8 = TransformerFactory.newInstance();
         Transformer var9 = var8.newTransformer();
         var9.setOutputProperty("indent", "yes");
         var9.transform(var7, var6);
      } catch (Exception var10) {
         class_2598.method_11785(var10);
         throw new IOException("Failed to save emitter");
      }
   }

   private static Element method_19143(Element var0, String var1) {
      NodeList var4 = var0.getElementsByTagName(var1);
      return var4.getLength() != 0 ? (Element)var4.item(0) : null;
   }

   private static void method_19153(Element var0, class_487 var1) {
      var1.field_3014 = var0.getAttribute("name");
      var1.method_2305(var0.getAttribute("imageName"));
      String var4 = var0.getAttribute("renderType");
      var1.field_3013 = 1;
      if (var4.equals("quads")) {
         var1.field_3013 = 3;
      }

      if (var4.equals("points")) {
         var1.field_3013 = 2;
      }

      String var5 = var0.getAttribute("useOriented");
      if (var5 != null) {
         var1.field_3054 = "true".equals(var5);
      }

      String var6 = var0.getAttribute("useAdditive");
      if (var6 != null) {
         var1.field_3046 = "true".equals(var6);
      }

      method_19167(method_19143(var0, "spawnInterval"), var1.field_3053);
      method_19167(method_19143(var0, "spawnCount"), var1.field_3048);
      method_19167(method_19143(var0, "initialLife"), var1.field_3018);
      method_19167(method_19143(var0, "initialSize"), var1.field_3041);
      method_19167(method_19143(var0, "xOffset"), var1.field_3021);
      method_19167(method_19143(var0, "yOffset"), var1.field_3045);
      method_19167(method_19143(var0, "initialDistance"), var1.field_3024);
      method_19167(method_19143(var0, "speed"), var1.field_3050);
      method_19167(method_19143(var0, "length"), var1.field_3035);
      method_19167(method_19143(var0, "emitCount"), var1.field_3027);
      method_19168(method_19143(var0, "spread"), var1.field_3049);
      method_19168(method_19143(var0, "angularOffset"), var1.field_3044);
      method_19168(method_19143(var0, "growthFactor"), var1.field_3043);
      method_19168(method_19143(var0, "gravityFactor"), var1.field_3031);
      method_19168(method_19143(var0, "windFactor"), var1.field_3023);
      method_19168(method_19143(var0, "startAlpha"), var1.field_3037);
      method_19168(method_19143(var0, "endAlpha"), var1.field_3039);
      method_19168(method_19143(var0, "alpha"), var1.field_3017);
      method_19168(method_19143(var0, "size"), var1.field_3015);
      method_19168(method_19143(var0, "velocity"), var1.field_3026);
      method_19168(method_19143(var0, "scaleY"), var1.field_3020);
      Element var7 = method_19143(var0, "color");
      NodeList var8 = var7.getElementsByTagName("step");
      var1.field_3032.clear();

      for (int var9 = 0; var9 < var8.getLength(); var9++) {
         Element var10 = (Element)var8.item(var9);
         float var11 = Float.parseFloat(var10.getAttribute("offset"));
         float var12 = Float.parseFloat(var10.getAttribute("r"));
         float var13 = Float.parseFloat(var10.getAttribute("g"));
         float var14 = Float.parseFloat(var10.getAttribute("b"));
         var1.method_2306(var11, new class_8709(var12, var13, var14, 1.0F));
      }

      var1.method_2296();
   }

   private static Element method_19154(Document var0, class_487 var1) {
      Element var4 = var0.createElement("emitter");
      var4.setAttribute("name", var1.field_3014);
      var4.setAttribute("imageName", var1.field_3040 != null ? var1.field_3040 : "");
      var4.setAttribute("useOriented", !var1.field_3054 ? "false" : "true");
      var4.setAttribute("useAdditive", !var1.field_3046 ? "false" : "true");
      if (var1.field_3013 == 1) {
         var4.setAttribute("renderType", "inherit");
      }

      if (var1.field_3013 == 2) {
         var4.setAttribute("renderType", "points");
      }

      if (var1.field_3013 == 3) {
         var4.setAttribute("renderType", "quads");
      }

      var4.appendChild(method_19152(var0, "spawnInterval", var1.field_3053));
      var4.appendChild(method_19152(var0, "spawnCount", var1.field_3048));
      var4.appendChild(method_19152(var0, "initialLife", var1.field_3018));
      var4.appendChild(method_19152(var0, "initialSize", var1.field_3041));
      var4.appendChild(method_19152(var0, "xOffset", var1.field_3021));
      var4.appendChild(method_19152(var0, "yOffset", var1.field_3045));
      var4.appendChild(method_19152(var0, "initialDistance", var1.field_3024));
      var4.appendChild(method_19152(var0, "speed", var1.field_3050));
      var4.appendChild(method_19152(var0, "length", var1.field_3035));
      var4.appendChild(method_19152(var0, "emitCount", var1.field_3027));
      var4.appendChild(method_19169(var0, "spread", var1.field_3049));
      var4.appendChild(method_19169(var0, "angularOffset", var1.field_3044));
      var4.appendChild(method_19169(var0, "growthFactor", var1.field_3043));
      var4.appendChild(method_19169(var0, "gravityFactor", var1.field_3031));
      var4.appendChild(method_19169(var0, "windFactor", var1.field_3023));
      var4.appendChild(method_19169(var0, "startAlpha", var1.field_3037));
      var4.appendChild(method_19169(var0, "endAlpha", var1.field_3039));
      var4.appendChild(method_19169(var0, "alpha", var1.field_3017));
      var4.appendChild(method_19169(var0, "size", var1.field_3015));
      var4.appendChild(method_19169(var0, "velocity", var1.field_3026));
      var4.appendChild(method_19169(var0, "scaleY", var1.field_3020));
      Element var5 = var0.createElement("color");
      ArrayList var6 = var1.field_3032;

      for (int var7 = 0; var7 < var6.size(); var7++) {
         class_9551 var8 = (class_9551)var6.get(var7);
         Element var9 = var0.createElement("step");
         var9.setAttribute("offset", "" + var8.field_48593);
         var9.setAttribute("r", "" + var8.field_48594.field_44663);
         var9.setAttribute("g", "" + var8.field_48594.field_44649);
         var9.setAttribute("b", "" + var8.field_48594.field_44648);
         var5.appendChild(var9);
      }

      var4.appendChild(var5);
      return var4;
   }

   private static Element method_19152(Document var0, String var1, class_1368 var2) {
      Element var5 = var0.createElement(var1);
      var5.setAttribute("min", "" + var2.method_6335());
      var5.setAttribute("max", "" + var2.method_6333());
      var5.setAttribute("enabled", "" + var2.method_6331());
      return var5;
   }

   private static Element method_19169(Document var0, String var1, class_6948 var2) {
      Element var5 = var0.createElement(var1);
      if (!(var2 instanceof class_7202)) {
         if (!(var2 instanceof class_7526)) {
            if (!(var2 instanceof class_2437)) {
               class_2598.method_11777("unkown value type ignored: " + var2.getClass());
            } else {
               var5.setAttribute("type", "linear");
               var5.setAttribute("min", "" + ((class_2437)var2).method_11105());
               var5.setAttribute("max", "" + ((class_2437)var2).method_11111());
               var5.setAttribute("active", "" + ((class_2437)var2).method_11108());
               ArrayList var6 = ((class_2437)var2).method_11107();

               for (int var7 = 0; var7 < var6.size(); var7++) {
                  class_1440 var8 = (class_1440)var6.get(var7);
                  Element var9 = var0.createElement("point");
                  var9.setAttribute("x", "" + var8.field_7766);
                  var9.setAttribute("y", "" + var8.field_7765);
                  var5.appendChild(var9);
               }
            }
         } else {
            var5.setAttribute("type", "random");
            var5.setAttribute("value", "" + ((class_7526)var2).method_34296());
         }
      } else {
         var5.setAttribute("type", "simple");
         var5.setAttribute("value", "" + var2.method_31784(0.0F));
      }

      return var5;
   }

   private static void method_19167(Element var0, class_1368 var1) {
      if (var0 != null) {
         var1.method_6338(Float.parseFloat(var0.getAttribute("min")));
         var1.method_6332(Float.parseFloat(var0.getAttribute("max")));
         var1.method_6334("true".equals(var0.getAttribute("enabled")));
      }
   }

   private static void method_19168(Element var0, class_6948 var1) {
      if (var0 != null) {
         String var4 = var0.getAttribute("type");
         String var5 = var0.getAttribute("value");
         if (var4 != null && var4.length() != 0) {
            if (!var4.equals("simple")) {
               if (!var4.equals("random")) {
                  if (!var4.equals("linear")) {
                     class_2598.method_11777("unkown type detected: " + var4);
                  } else {
                     String var6 = var0.getAttribute("min");
                     String var7 = var0.getAttribute("max");
                     String var8 = var0.getAttribute("active");
                     NodeList var9 = var0.getElementsByTagName("point");
                     ArrayList var10 = new ArrayList();

                     for (int var11 = 0; var11 < var9.getLength(); var11++) {
                        Element var12 = (Element)var9.item(var11);
                        float var13 = Float.parseFloat(var12.getAttribute("x"));
                        float var14 = Float.parseFloat(var12.getAttribute("y"));
                        var10.add(new class_1440(var13, var14));
                     }

                     ((class_2437)var1).method_11104(var10);
                     ((class_2437)var1).method_11103(Integer.parseInt(var6));
                     ((class_2437)var1).method_11110(Integer.parseInt(var7));
                     ((class_2437)var1).method_11106("true".equals(var8));
                  }
               } else {
                  ((class_7526)var1).method_34294(Float.parseFloat(var5));
               }
            } else {
               ((class_7202)var1).method_32964(Float.parseFloat(var5));
            }
         } else if (!(var1 instanceof class_7202)) {
            if (!(var1 instanceof class_7526)) {
               class_2598.method_11777("problems reading element, skipping: " + var0);
            } else {
               ((class_7526)var1).method_34294(Float.parseFloat(var5));
            }
         } else {
            ((class_7202)var1).method_32964(Float.parseFloat(var5));
         }
      }
   }
}
