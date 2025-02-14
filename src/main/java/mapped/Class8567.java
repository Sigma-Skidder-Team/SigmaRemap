package mapped;

import java.util.HashMap;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.newdawn.slick.util.ResourceLoader;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Class8567 {
   private Image field38522;
   private HashMap field38523 = new HashMap();

   public Class8567(String var1, String var2) throws Class2451 {
      this.field38522 = new Image(var1, false, 2);

      try {
         DocumentBuilder var5 = DocumentBuilderFactory.newInstance().newDocumentBuilder();
         Document var6 = var5.parse(ResourceLoader.getResourceAsStream(var2));
         NodeList var7 = var6.getElementsByTagName("sprite");

         for (int var8 = 0; var8 < var7.getLength(); var8++) {
            Element var9 = (Element)var7.item(var8);
            String var10 = var9.getAttribute("name");
            int var11 = Integer.parseInt(var9.getAttribute("x"));
            int var12 = Integer.parseInt(var9.getAttribute("y"));
            int var13 = Integer.parseInt(var9.getAttribute("width"));
            int var14 = Integer.parseInt(var9.getAttribute("height"));
            this.field38523.put(var10, this.field38522.method23551(var11, var12, var13, var14));
         }
      } catch (Exception var15) {
         throw new Class2451("Failed to parse sprite sheet XML", var15);
      }
   }

   public Image method30624(String var1) {
      return (Image)this.field38523.get(var1);
   }
}
