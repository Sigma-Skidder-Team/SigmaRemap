package remapped;

import java.io.InputStream;
import java.util.ArrayList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.svg.ParsingException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class class_8249 implements class_1181 {
   public static int field_42342 = 1;
   private static ArrayList field_42339 = new ArrayList();
   private class_4226 field_42341;

   public static void method_37789(class_850 var0) {
      field_42339.add(var0);
   }

   public static class_4226 method_37792(String var0, boolean var1) throws SlickException {
      return method_37790(class_8975.method_41153(var0), var1);
   }

   public static class_4226 method_37791(String var0) throws SlickException {
      return method_37790(class_8975.method_41153(var0), false);
   }

   public static class_4226 method_37790(InputStream var0, boolean var1) throws SlickException {
      return new class_8249().method_37794(var0, var1);
   }

   private class_8249() {
   }

   private class_4226 method_37793(InputStream var1) throws SlickException {
      return this.method_37794(var1, false);
   }

   private class_4226 method_37794(InputStream var1, boolean var2) throws SlickException {
      try {
         DocumentBuilderFactory var5 = DocumentBuilderFactory.newInstance();
         var5.setValidating(false);
         var5.setNamespaceAware(true);
         DocumentBuilder var6 = var5.newDocumentBuilder();
         var6.setEntityResolver(new class_7758(this));
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
         this.field_42341 = new class_4226(var11, var12);
         if (!var2) {
            var12 = 0.0F;
         }

         this.method_5223(var8, class_4508.method_20944(0.0F, -var12));
         return this.field_42341;
      } catch (Exception var13) {
         throw new class_1162("Failed to load inkscape document", var13);
      }
   }

   @Override
   public void method_5223(Element var1, class_4508 var2) throws ParsingException {
      NodeList var5 = var1.getChildNodes();

      for (int var6 = 0; var6 < var5.getLength(); var6++) {
         if (var5.item(var6) instanceof Element) {
            this.method_37795((Element)var5.item(var6), var2);
         }
      }
   }

   private void method_37795(Element var1, class_4508 var2) throws ParsingException {
      for (int var5 = 0; var5 < field_42339.size(); var5++) {
         class_850 var6 = (class_850)field_42339.get(var5);
         if (var6.method_3699(var1)) {
            var6.method_3700(this, var1, this.field_42341, var2);
         }
      }
   }

   static {
      method_37789(new class_9033());
      method_37789(new class_3325());
      method_37789(new class_8943());
      method_37789(new class_7136());
      method_37789(new class_7759());
      method_37789(new class_1916());
      method_37789(new class_9293());
      method_37789(new class_4473());
   }
}
