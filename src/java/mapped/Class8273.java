package mapped;

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

import lol.Log;
import lol.ResourceLoader;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Class8273 {
   public static Class9365 method28882(String var0, Color var1) throws IOException {
      return method28890(ResourceLoader.getResourceAsStream(var0), null, null, var1);
   }

   public static Class9365 method28883(String var0) throws IOException {
      return method28890(ResourceLoader.getResourceAsStream(var0), null, null, null);
   }

   public static Class9365 method28884(File var0) throws IOException {
      return method28890(new FileInputStream(var0), null, null, null);
   }

   public static Class9365 method28885(InputStream var0, Color var1) throws IOException {
      return method28890(var0, null, null, var1);
   }

   public static Class9365 method28886(InputStream var0) throws IOException {
      return method28890(var0, null, null, null);
   }

   public static Class9365 method28887(String var0, Class5998 var1) throws IOException {
      return method28890(ResourceLoader.getResourceAsStream(var0), var1, null, null);
   }

   public static Class9365 method28888(File var0, Class5998 var1) throws IOException {
      return method28890(new FileInputStream(var0), var1, null, null);
   }

   public static Class9365 method28889(InputStream var0, Class5998 var1) throws IOException {
      return method28890(var0, var1, null, null);
   }

   public static Class9365 method28890(InputStream var0, Class5998 var1, Class9365 var2, Color var3) throws IOException {
      if (var1 == null) {
         var1 = new Class5999();
      }

      try {
         DocumentBuilder var6 = DocumentBuilderFactory.newInstance().newDocumentBuilder();
         Document var7 = var6.parse(var0);
         Element var8 = var7.getDocumentElement();
         if (!var8.getNodeName().equals("system")) {
            throw new IOException("Not a particle system file");
         } else {
            if (var2 == null) {
               var2 = new Class9365("org/newdawn/slick/data/particle.tga", 2000, var3);
            }

            boolean var9 = "true".equals(var8.getAttribute("additive"));
            if (var9) {
               var2.method35474(1);
            } else {
               var2.method35474(2);
            }

            boolean var10 = "true".equals(var8.getAttribute("points"));
            var2.method35469(var10);
            NodeList var11 = var8.getElementsByTagName("emitter");

            for (int var12 = 0; var12 < var11.getLength(); var12++) {
               Element var13 = (Element)var11.item(var12);
               Class6134 var14 = ((Class5998)var1).method18609("new");
               method28902(var13, var14);
               var2.method35477(var14);
            }

            var2.method35468(false);
            return var2;
         }
      } catch (IOException var15) {
         Log.method25661(var15);
         throw var15;
      } catch (Exception var16) {
         Log.method25661(var16);
         throw new IOException("Unable to load particle system config");
      }
   }

   public static void method28891(File var0, Class9365 var1) throws IOException {
      method28892(new FileOutputStream(var0), var1);
   }

   public static void method28892(OutputStream var0, Class9365 var1) throws IOException {
      try {
         DocumentBuilder var4 = DocumentBuilderFactory.newInstance().newDocumentBuilder();
         Document var5 = var4.newDocument();
         Element var6 = var5.createElement("system");
         var6.setAttribute("additive", "" + (var1.method35472() == 1));
         var6.setAttribute("points", "" + var1.method35470());
         var5.appendChild(var6);

         for (int var7 = 0; var7 < var1.method35475(); var7++) {
            Class6135 var8 = var1.method35476(var7);
            if (!(var8 instanceof Class6134)) {
               throw new RuntimeException("Only ConfigurableEmitter instances can be stored");
            }

            Element var9 = method28903(var5, (Class6134)var8);
            var6.appendChild(var9);
         }

         StreamResult var12 = new StreamResult(new OutputStreamWriter(var0, "utf-8"));
         DOMSource var13 = new DOMSource(var5);
         TransformerFactory var14 = TransformerFactory.newInstance();
         Transformer var10 = var14.newTransformer();
         var10.setOutputProperty("indent", "yes");
         var10.transform(var13, var12);
      } catch (Exception var11) {
         Log.method25661(var11);
         throw new IOException("Unable to save configured particle system");
      }
   }

   public static Class6134 method28893(String var0) throws IOException {
      return method28898(ResourceLoader.getResourceAsStream(var0), null);
   }

   public static Class6134 method28894(File var0) throws IOException {
      return method28898(new FileInputStream(var0), null);
   }

   public static Class6134 method28895(InputStream var0) throws IOException {
      return method28898(var0, null);
   }

   public static Class6134 method28896(String var0, Class5998 var1) throws IOException {
      return method28898(ResourceLoader.getResourceAsStream(var0), var1);
   }

   public static Class6134 method28897(File var0, Class5998 var1) throws IOException {
      return method28898(new FileInputStream(var0), var1);
   }

   public static Class6134 method28898(InputStream var0, Class5998 var1) throws IOException {
      if (var1 == null) {
         var1 = new Class5997();
      }

      try {
         DocumentBuilder var4 = DocumentBuilderFactory.newInstance().newDocumentBuilder();
         Document var5 = var4.parse(var0);
         if (!var5.getDocumentElement().getNodeName().equals("emitter")) {
            throw new IOException("Not a particle emitter file");
         } else {
            Class6134 var6 = ((Class5998)var1).method18609("new");
            method28902(var5.getDocumentElement(), var6);
            return var6;
         }
      } catch (IOException var7) {
         Log.method25661(var7);
         throw var7;
      } catch (Exception var8) {
         Log.method25661(var8);
         throw new IOException("Unable to load emitter");
      }
   }

   public static void method28899(File var0, Class6134 var1) throws IOException {
      method28900(new FileOutputStream(var0), var1);
   }

   public static void method28900(OutputStream var0, Class6134 var1) throws IOException {
      try {
         DocumentBuilder var4 = DocumentBuilderFactory.newInstance().newDocumentBuilder();
         Document var5 = var4.newDocument();
         var5.appendChild(method28903(var5, var1));
         StreamResult var6 = new StreamResult(new OutputStreamWriter(var0, "utf-8"));
         DOMSource var7 = new DOMSource(var5);
         TransformerFactory var8 = TransformerFactory.newInstance();
         Transformer var9 = var8.newTransformer();
         var9.setOutputProperty("indent", "yes");
         var9.transform(var7, var6);
      } catch (Exception var10) {
         Log.method25661(var10);
         throw new IOException("Failed to save emitter");
      }
   }

   private static Element method28901(Element var0, String var1) {
      NodeList var4 = var0.getElementsByTagName(var1);
      return var4.getLength() != 0 ? (Element)var4.item(0) : null;
   }

   private static void method28902(Element var0, Class6134 var1) {
      var1.field27508 = var0.getAttribute("name");
      var1.method18936(var0.getAttribute("imageName"));
      String var4 = var0.getAttribute("renderType");
      var1.field27505 = 1;
      if (var4.equals("quads")) {
         var1.field27505 = 3;
      }

      if (var4.equals("points")) {
         var1.field27505 = 2;
      }

      String var5 = var0.getAttribute("useOriented");
      if (var5 != null) {
         var1.field27506 = "true".equals(var5);
      }

      String var6 = var0.getAttribute("useAdditive");
      if (var6 != null) {
         var1.field27507 = "true".equals(var6);
      }

      method28906(method28901(var0, "spawnInterval"), var1.field27483);
      method28906(method28901(var0, "spawnCount"), var1.field27484);
      method28906(method28901(var0, "initialLife"), var1.field27485);
      method28906(method28901(var0, "initialSize"), var1.field27486);
      method28906(method28901(var0, "xOffset"), var1.field27487);
      method28906(method28901(var0, "yOffset"), var1.field27488);
      method28906(method28901(var0, "initialDistance"), var1.field27491);
      method28906(method28901(var0, "speed"), var1.field27492);
      method28906(method28901(var0, "length"), var1.field27496);
      method28906(method28901(var0, "emitCount"), var1.field27504);
      method28907(method28901(var0, "spread"), var1.field27489);
      method28907(method28901(var0, "angularOffset"), var1.field27490);
      method28907(method28901(var0, "growthFactor"), var1.field27493);
      method28907(method28901(var0, "gravityFactor"), var1.field27494);
      method28907(method28901(var0, "windFactor"), var1.field27495);
      method28907(method28901(var0, "startAlpha"), var1.field27498);
      method28907(method28901(var0, "endAlpha"), var1.field27499);
      method28907(method28901(var0, "alpha"), var1.field27500);
      method28907(method28901(var0, "size"), var1.field27501);
      method28907(method28901(var0, "velocity"), var1.field27502);
      method28907(method28901(var0, "scaleY"), var1.field27503);
      Element var7 = method28901(var0, "color");
      NodeList var8 = var7.getElementsByTagName("step");
      var1.field27497.clear();

      for (int var9 = 0; var9 < var8.getLength(); var9++) {
         Element var10 = (Element)var8.item(var9);
         float var11 = Float.parseFloat(var10.getAttribute("offset"));
         float var12 = Float.parseFloat(var10.getAttribute("r"));
         float var13 = Float.parseFloat(var10.getAttribute("g"));
         float var14 = Float.parseFloat(var10.getAttribute("b"));
         var1.method18951(var11, new Color(var12, var13, var14, 1.0F));
      }

      var1.method18947();
   }

   private static Element method28903(Document var0, Class6134 var1) {
      Element var4 = var0.createElement("emitter");
      var4.setAttribute("name", var1.field27508);
      var4.setAttribute("imageName", var1.field27509 != null ? var1.field27509 : "");
      var4.setAttribute("useOriented", !var1.field27506 ? "false" : "true");
      var4.setAttribute("useAdditive", !var1.field27507 ? "false" : "true");
      if (var1.field27505 == 1) {
         var4.setAttribute("renderType", "inherit");
      }

      if (var1.field27505 == 2) {
         var4.setAttribute("renderType", "points");
      }

      if (var1.field27505 == 3) {
         var4.setAttribute("renderType", "quads");
      }

      var4.appendChild(method28904(var0, "spawnInterval", var1.field27483));
      var4.appendChild(method28904(var0, "spawnCount", var1.field27484));
      var4.appendChild(method28904(var0, "initialLife", var1.field27485));
      var4.appendChild(method28904(var0, "initialSize", var1.field27486));
      var4.appendChild(method28904(var0, "xOffset", var1.field27487));
      var4.appendChild(method28904(var0, "yOffset", var1.field27488));
      var4.appendChild(method28904(var0, "initialDistance", var1.field27491));
      var4.appendChild(method28904(var0, "speed", var1.field27492));
      var4.appendChild(method28904(var0, "length", var1.field27496));
      var4.appendChild(method28904(var0, "emitCount", var1.field27504));
      var4.appendChild(method28905(var0, "spread", var1.field27489));
      var4.appendChild(method28905(var0, "angularOffset", var1.field27490));
      var4.appendChild(method28905(var0, "growthFactor", var1.field27493));
      var4.appendChild(method28905(var0, "gravityFactor", var1.field27494));
      var4.appendChild(method28905(var0, "windFactor", var1.field27495));
      var4.appendChild(method28905(var0, "startAlpha", var1.field27498));
      var4.appendChild(method28905(var0, "endAlpha", var1.field27499));
      var4.appendChild(method28905(var0, "alpha", var1.field27500));
      var4.appendChild(method28905(var0, "size", var1.field27501));
      var4.appendChild(method28905(var0, "velocity", var1.field27502));
      var4.appendChild(method28905(var0, "scaleY", var1.field27503));
      Element var5 = var0.createElement("color");
      ArrayList var6 = var1.field27497;

      for (int var7 = 0; var7 < var6.size(); var7++) {
         Class9745 var8 = (Class9745)var6.get(var7);
         Element var9 = var0.createElement("step");
         var9.setAttribute("offset", "" + var8.field45494);
         var9.setAttribute("r", "" + var8.field45495.r);
         var9.setAttribute("g", "" + var8.field45495.g);
         var9.setAttribute("b", "" + var8.field45495.b);
         var5.appendChild(var9);
      }

      var4.appendChild(var5);
      return var4;
   }

   private static Element method28904(Document var0, String var1, Class7089 var2) {
      Element var5 = var0.createElement(var1);
      var5.setAttribute("min", "" + var2.method22066());
      var5.setAttribute("max", "" + var2.method22064());
      var5.setAttribute("enabled", "" + var2.method22062());
      return var5;
   }

   private static Element method28905(Document var0, String var1, Class7686 var2) {
      Element var5 = var0.createElement(var1);
      if (!(var2 instanceof Class7687)) {
         if (!(var2 instanceof Class7688)) {
            if (!(var2 instanceof Class7685)) {
               Log.method25663("unkown value type ignored: " + var2.getClass());
            } else {
               var5.setAttribute("type", "linear");
               var5.setAttribute("min", "" + ((Class7685)var2).method25303());
               var5.setAttribute("max", "" + ((Class7685)var2).method25301());
               var5.setAttribute("active", "" + ((Class7685)var2).method25299());
               ArrayList var6 = ((Class7685)var2).method25297();

               for (int var7 = 0; var7 < var6.size(); var7++) {
                  Class2532 var8 = (Class2532)var6.get(var7);
                  Element var9 = var0.createElement("point");
                  var9.setAttribute("x", "" + var8.field16737);
                  var9.setAttribute("y", "" + var8.field16738);
                  var5.appendChild(var9);
               }
            }
         } else {
            var5.setAttribute("type", "random");
            var5.setAttribute("value", "" + ((Class7688)var2).method25307());
         }
      } else {
         var5.setAttribute("type", "simple");
         var5.setAttribute("value", "" + var2.method25298(0.0F));
      }

      return var5;
   }

   private static void method28906(Element var0, Class7089 var1) {
      if (var0 != null) {
         var1.method22067(Float.parseFloat(var0.getAttribute("min")));
         var1.method22065(Float.parseFloat(var0.getAttribute("max")));
         var1.method22063("true".equals(var0.getAttribute("enabled")));
      }
   }

   private static void method28907(Element var0, Class7686 var1) {
      if (var0 != null) {
         String var4 = var0.getAttribute("type");
         String var5 = var0.getAttribute("value");
         if (var4 != null && var4.length() != 0) {
            if (!var4.equals("simple")) {
               if (!var4.equals("random")) {
                  if (!var4.equals("linear")) {
                     Log.method25663("unkown type detected: " + var4);
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
                        var10.add(new Class2532(var13, var14));
                     }

                     ((Class7685)var1).method25296(var10);
                     ((Class7685)var1).method25304(Integer.parseInt(var6));
                     ((Class7685)var1).method25302(Integer.parseInt(var7));
                     ((Class7685)var1).method25300("true".equals(var8));
                  }
               } else {
                  ((Class7688)var1).method25306(Float.parseFloat(var5));
               }
            } else {
               ((Class7687)var1).method25305(Float.parseFloat(var5));
            }
         } else if (!(var1 instanceof Class7687)) {
            if (!(var1 instanceof Class7688)) {
               Log.method25663("problems reading element, skipping: " + var0);
            } else {
               ((Class7688)var1).method25306(Float.parseFloat(var5));
            }
         } else {
            ((Class7687)var1).method25305(Float.parseFloat(var5));
         }
      }
   }
}
