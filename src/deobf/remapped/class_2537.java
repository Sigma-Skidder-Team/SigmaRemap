package remapped;

import java.util.Properties;
import org.newdawn.slick.SlickException;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class class_2537 {
   public int field_12581;
   public String field_12580;
   public String field_12578;
   public int field_12584;
   public int field_12582;
   public int field_12587;
   public int field_12583;
   private String field_12588;
   public Properties field_12579;

   public class_2537(class_8485 var1, Element var2) throws SlickException {
      this.field_12586 = var1;
      this.field_12580 = var2.getAttribute("name");
      this.field_12578 = var2.getAttribute("type");
      this.field_12584 = Integer.parseInt(var2.getAttribute("x"));
      this.field_12582 = Integer.parseInt(var2.getAttribute("y"));
      this.field_12587 = Integer.parseInt(var2.getAttribute("width"));
      this.field_12583 = Integer.parseInt(var2.getAttribute("height"));
      Element var5 = (Element)var2.getElementsByTagName("image").item(0);
      if (var5 != null) {
         this.field_12588 = var5.getAttribute("source");
      }

      Element var6 = (Element)var2.getElementsByTagName("properties").item(0);
      if (var6 != null) {
         NodeList var7 = var6.getElementsByTagName("property");
         if (var7 != null) {
            this.field_12579 = new Properties();

            for (int var8 = 0; var8 < var7.getLength(); var8++) {
               Element var9 = (Element)var7.item(var8);
               String var10 = var9.getAttribute("name");
               String var11 = var9.getAttribute("value");
               this.field_12579.setProperty(var10, var11);
            }
         }
      }
   }
}
