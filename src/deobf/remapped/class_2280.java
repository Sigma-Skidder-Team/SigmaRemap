package remapped;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.newdawn.slick.SlickException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class class_2280 {
   private final class_8485 field_11397;
   public int field_11392;
   public String field_11399;
   public int field_11398;
   public int field_11401 = Integer.MAX_VALUE;
   public int field_11394;
   public int field_11403;
   public class_1888 field_11404;
   public int field_11393;
   public int field_11400;
   private HashMap field_11402 = new HashMap();
   public int field_11395 = 0;
   public int field_11391 = 0;

   public class_2280(class_8485 var1, Element var2, boolean var3) throws SlickException {
      this.field_11397 = var1;
      this.field_11399 = var2.getAttribute("name");
      this.field_11398 = Integer.parseInt(var2.getAttribute("firstgid"));
      String var6 = var2.getAttribute("source");
      if (var6 != null && !var6.equals("")) {
         try {
            InputStream var7 = class_8975.method_41153(var1.method_39113() + "/" + var6);
            DocumentBuilder var8 = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document var9 = var8.parse(var7);
            Element var10 = var9.getDocumentElement();
            var2 = var10;
         } catch (Exception var27) {
            class_2598.method_11785(var27);
            throw new class_1162("Unable to load or parse sourced tileset: " + this.field_11397.field_43480 + "/" + var6);
         }
      }

      String var28 = var2.getAttribute("tilewidth");
      String var29 = var2.getAttribute("tileheight");
      if (var28.length() != 0 && var29.length() != 0) {
         this.field_11394 = Integer.parseInt(var28);
         this.field_11403 = Integer.parseInt(var29);
         String var30 = var2.getAttribute("spacing");
         if (var30 != null && !var30.equals("")) {
            this.field_11395 = Integer.parseInt(var30);
         }

         String var31 = var2.getAttribute("margin");
         if (var31 != null && !var31.equals("")) {
            this.field_11391 = Integer.parseInt(var31);
         }

         NodeList var11 = var2.getElementsByTagName("image");
         Element var12 = (Element)var11.item(0);
         String var13 = var12.getAttribute("source");
         class_8709 var14 = null;
         String var15 = var12.getAttribute("trans");
         if (var15 != null && var15.length() > 0) {
            int var16 = Integer.parseInt(var15, 16);
            var14 = new class_8709(var16);
         }

         if (var3) {
            class_8112 var32 = new class_8112(var1.method_39113() + "/" + var13, false, 2, var14);
            this.method_10513(var32);
         }

         NodeList var33 = var2.getElementsByTagName("tile");

         for (int var17 = 0; var17 < var33.getLength(); var17++) {
            Element var18 = (Element)var33.item(var17);
            int var19 = Integer.parseInt(var18.getAttribute("id"));
            var19 += this.field_11398;
            Properties var20 = new Properties();
            Element var21 = (Element)var18.getElementsByTagName("properties").item(0);
            NodeList var22 = var21.getElementsByTagName("property");

            for (int var23 = 0; var23 < var22.getLength(); var23++) {
               Element var24 = (Element)var22.item(var23);
               String var25 = var24.getAttribute("name");
               String var26 = var24.getAttribute("value");
               var20.setProperty(var25, var26);
            }

            this.field_11402.put(new Integer(var19), var20);
         }
      } else {
         throw new class_1162("TiledMap requires that the map be created with tilesets that use a single image.  Check the WiKi for more complete information.");
      }
   }

   public int method_10515() {
      return this.field_11394;
   }

   public int method_10511() {
      return this.field_11403;
   }

   public int method_10514() {
      return this.field_11395;
   }

   public int method_10510() {
      return this.field_11391;
   }

   public void method_10513(class_8112 var1) {
      this.field_11404 = new class_1888(var1, this.field_11394, this.field_11403, this.field_11395, this.field_11391);
      this.field_11393 = this.field_11404.method_8427();
      this.field_11400 = this.field_11404.method_8425();
      if (this.field_11393 <= 0) {
         this.field_11393 = 1;
      }

      if (this.field_11400 <= 0) {
         this.field_11400 = 1;
      }

      this.field_11401 = this.field_11393 * this.field_11400 + this.field_11398 - 1;
   }

   public Properties method_10506(int var1) {
      return (Properties)this.field_11402.get(new Integer(var1));
   }

   public int method_10509(int var1) {
      return var1 % this.field_11393;
   }

   public int method_10512(int var1) {
      return var1 / this.field_11393;
   }

   public void method_10507(int var1) {
      this.field_11401 = var1;
   }

   public boolean method_10508(int var1) {
      return var1 >= this.field_11398 && var1 <= this.field_11401;
   }
}
