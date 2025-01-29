package mapped;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.newdawn.slick.Color;
import org.newdawn.slick.util.Log;
import lol.ResourceLoader;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Class7590 {
   private final Class9466 field32577;
   public int field32578;
   public String field32579;
   public int field32580;
   public int field32581 = Integer.MAX_VALUE;
   public int field32582;
   public int field32583;
   public Class7386 field32584;
   public int field32585;
   public int field32586;
   private HashMap field32587 = new HashMap();
   public int field32588 = 0;
   public int field32589 = 0;

   public Class7590(Class9466 var1, Element var2, boolean var3) throws Class2451 {
      this.field32577 = var1;
      this.field32579 = var2.getAttribute("name");
      this.field32580 = Integer.parseInt(var2.getAttribute("firstgid"));
      String var6 = var2.getAttribute("source");
      if (var6 != null && !var6.equals("")) {
         try {
            InputStream var7 = ResourceLoader.getResourceAsStream(var1.method36462() + "/" + var6);
            DocumentBuilder var8 = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document var9 = var8.parse(var7);
            Element var10 = var9.getDocumentElement();
            var2 = var10;
         } catch (Exception var27) {
            Log.error(var27);
            throw new Class2451("Unable to load or parse sourced tileset: " + this.field32577.field43984 + "/" + var6);
         }
      }

      String var28 = var2.getAttribute("tilewidth");
      String var29 = var2.getAttribute("tileheight");
      if (var28.length() != 0 && var29.length() != 0) {
         this.field32582 = Integer.parseInt(var28);
         this.field32583 = Integer.parseInt(var29);
         String var30 = var2.getAttribute("spacing");
         if (var30 != null && !var30.equals("")) {
            this.field32588 = Integer.parseInt(var30);
         }

         String var31 = var2.getAttribute("margin");
         if (var31 != null && !var31.equals("")) {
            this.field32589 = Integer.parseInt(var31);
         }

         NodeList var11 = var2.getElementsByTagName("image");
         Element var12 = (Element)var11.item(0);
         String var13 = var12.getAttribute("source");
         Color var14 = null;
         String var15 = var12.getAttribute("trans");
         if (var15 != null && var15.length() > 0) {
            int var16 = Integer.parseInt(var15, 16);
            var14 = new Color(var16);
         }

         if (var3) {
            Image var32 = new Image(var1.method36462() + "/" + var13, false, 2, var14);
            this.method24852(var32);
         }

         NodeList var33 = var2.getElementsByTagName("tile");

         for (int var17 = 0; var17 < var33.getLength(); var17++) {
            Element var18 = (Element)var33.item(var17);
            int var19 = Integer.parseInt(var18.getAttribute("id"));
            var19 += this.field32580;
            Properties var20 = new Properties();
            Element var21 = (Element)var18.getElementsByTagName("properties").item(0);
            NodeList var22 = var21.getElementsByTagName("property");

            for (int var23 = 0; var23 < var22.getLength(); var23++) {
               Element var24 = (Element)var22.item(var23);
               String var25 = var24.getAttribute("name");
               String var26 = var24.getAttribute("value");
               var20.setProperty(var25, var26);
            }

            this.field32587.put(new Integer(var19), var20);
         }
      } else {
         throw new Class2451("TiledMap requires that the map be created with tilesets that use a single image.  Check the WiKi for more complete information.");
      }
   }

   public int method24848() {
      return this.field32582;
   }

   public int method24849() {
      return this.field32583;
   }

   public int method24850() {
      return this.field32588;
   }

   public int method24851() {
      return this.field32589;
   }

   public void method24852(Image var1) {
      this.field32584 = new Class7386(var1, this.field32582, this.field32583, this.field32588, this.field32589);
      this.field32585 = this.field32584.method23505();
      this.field32586 = this.field32584.method23506();
      if (this.field32585 <= 0) {
         this.field32585 = 1;
      }

      if (this.field32586 <= 0) {
         this.field32586 = 1;
      }

      this.field32581 = this.field32585 * this.field32586 + this.field32580 - 1;
   }

   public Properties method24853(int var1) {
      return (Properties)this.field32587.get(new Integer(var1));
   }

   public int method24854(int var1) {
      return var1 % this.field32585;
   }

   public int method24855(int var1) {
      return var1 / this.field32585;
   }

   public void method24856(int var1) {
      this.field32581 = var1;
   }

   public boolean method24857(int var1) {
      return var1 >= this.field32580 && var1 <= this.field32581;
   }
}
