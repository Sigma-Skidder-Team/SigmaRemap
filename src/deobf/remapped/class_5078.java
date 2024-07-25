package remapped;

import java.util.ArrayList;
import java.util.Properties;
import org.newdawn.slick.SlickException;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class class_5078 {
   public int field_26226;
   public String field_26227;
   public ArrayList field_26230;
   public int field_26231;
   public int field_26229;
   public Properties field_26225;

   public class_5078(class_8485 var1, Element var2) throws SlickException {
      this.field_26228 = var1;
      this.field_26227 = var2.getAttribute("name");
      this.field_26231 = Integer.parseInt(var2.getAttribute("width"));
      this.field_26229 = Integer.parseInt(var2.getAttribute("height"));
      this.field_26230 = new ArrayList();
      Element var5 = (Element)var2.getElementsByTagName("properties").item(0);
      if (var5 != null) {
         NodeList var6 = var5.getElementsByTagName("property");
         if (var6 != null) {
            this.field_26225 = new Properties();

            for (int var7 = 0; var7 < var6.getLength(); var7++) {
               Element var8 = (Element)var6.item(var7);
               String var9 = var8.getAttribute("name");
               String var10 = var8.getAttribute("value");
               this.field_26225.setProperty(var9, var10);
            }
         }
      }

      NodeList var11 = var2.getElementsByTagName("object");

      for (int var12 = 0; var12 < var11.getLength(); var12++) {
         Element var13 = (Element)var11.item(var12);
         class_2537 var14 = new class_2537(var1, var13);
         var14.field_12581 = var12;
         this.field_26230.add(var14);
      }
   }
}
