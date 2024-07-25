package remapped;

import java.util.HashMap;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.newdawn.slick.SlickException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class class_5061 {
   private class_8112 field_26171;
   private HashMap field_26172 = new HashMap();

   public class_5061(String var1, String var2) throws SlickException {
      this.field_26171 = new class_8112(var1, false, 2);

      try {
         DocumentBuilder var5 = DocumentBuilderFactory.newInstance().newDocumentBuilder();
         Document var6 = var5.parse(class_8975.method_41153(var2));
         NodeList var7 = var6.getElementsByTagName("sprite");

         for (int var8 = 0; var8 < var7.getLength(); var8++) {
            Element var9 = (Element)var7.item(var8);
            String var10 = var9.getAttribute("name");
            int var11 = Integer.parseInt(var9.getAttribute("x"));
            int var12 = Integer.parseInt(var9.getAttribute("y"));
            int var13 = Integer.parseInt(var9.getAttribute("width"));
            int var14 = Integer.parseInt(var9.getAttribute("height"));
            this.field_26172.put(var10, this.field_26171.method_36858(var11, var12, var13, var14));
         }
      } catch (Exception var15) {
         throw new class_1162("Failed to parse sprite sheet XML", var15);
      }
   }

   public class_8112 method_23321(String var1) {
      return (class_8112)this.field_26172.get(var1);
   }
}
