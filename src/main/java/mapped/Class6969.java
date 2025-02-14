package mapped;

import java.io.InputStream;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;


import org.newdawn.slick.util.ResourceLoader;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Class6969 implements Class6968 {
   public static int field30177 = 1;
   private static ArrayList field30178 = new ArrayList();
   private Class7710 field30179;

   public static void method21499(Class6650 var0) {
      field30178.add(var0);
   }

   public static Class7710 method21500(String var0, boolean var1) throws Class2451 {
      return method21502(ResourceLoader.getResourceAsStream(var0), var1);
   }

   public static Class7710 method21501(String var0) throws Class2451 {
      return method21502(ResourceLoader.getResourceAsStream(var0), false);
   }

   public static Class7710 method21502(InputStream var0, boolean var1) throws Class2451 {
      return new Class6969().method21504(var0, var1);
   }

   private Class6969() {
   }

   private Class7710 method21503(InputStream var1) throws Class2451 {
      return this.method21504(var1, false);
   }

   private Class7710 method21504(InputStream var1, boolean var2) throws Class2451 {
      try {
         DocumentBuilderFactory var5 = DocumentBuilderFactory.newInstance();
         var5.setValidating(false);
         var5.setNamespaceAware(true);
         DocumentBuilder var6 = var5.newDocumentBuilder();
         var6.setEntityResolver(new Class7706(this));
         Document var7 = var6.parse(var1);
         Element var8 = var7.getDocumentElement();
         String var9 = var8.getAttribute("width");

         while (Character.isLetter(var9.charAt(var9.length() - 1))) {
            var9 = var9.substring(0, var9.length() - 1);
         }

         String var10 = var8.getAttribute("height");

         while (Character.isLetter(var10.charAt(var10.length() - 1))) {
            var10 = var10.substring(0, var10.length() - 1);
         }

         float var11 = Float.parseFloat(var9);
         float var12 = Float.parseFloat(var10);
         this.field30179 = new Class7710(var11, var12);
         if (!var2) {
            var12 = 0.0F;
         }

         this.method21498(var8, Class8412.method29534(0.0F, -var12));
         return this.field30179;
      } catch (Exception var13) {
         throw new Class2451("Failed to load inkscape document", var13);
      }
   }

   @Override
   public void method21498(Element var1, Class8412 var2) throws Class2453 {
      NodeList var5 = var1.getChildNodes();

      for (int var6 = 0; var6 < var5.getLength(); var6++) {
         if (var5.item(var6) instanceof Element) {
            this.method21505((Element)var5.item(var6), var2);
         }
      }
   }

   private void method21505(Element var1, Class8412 var2) throws Class2453 {
      for (int var5 = 0; var5 < field30178.size(); var5++) {
         Class6650 var6 = (Class6650)field30178.get(var5);
         if (var6.method20303(var1)) {
            var6.method20302(this, var1, this.field30179, var2);
         }
      }
   }

   static {
      method21499(new Class6653());
      method21499(new Class6655());
      method21499(new Class6658());
      method21499(new Class6656());
      method21499(new Class6657());
      method21499(new Class6654());
      method21499(new Class6652());
      method21499(new Class6651());
   }
}
