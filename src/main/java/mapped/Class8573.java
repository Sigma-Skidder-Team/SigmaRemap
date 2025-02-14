package mapped;

import java.util.ArrayList;
import java.util.Properties;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Class8573 {
   public int field38538;
   public String field38539;
   public ArrayList field38540;
   public int field38541;
   public int field38542;
   public Properties field38543;
   public final Class9466 field38544;

   public Class8573(Class9466 var1, Element var2) throws Class2451 {
      this.field38544 = var1;
      this.field38539 = var2.getAttribute("name");
      this.field38541 = Integer.parseInt(var2.getAttribute("width"));
      this.field38542 = Integer.parseInt(var2.getAttribute("height"));
      this.field38540 = new ArrayList();
      Element var5 = (Element)var2.getElementsByTagName("properties").item(0);
      if (var5 != null) {
         NodeList var6 = var5.getElementsByTagName("property");
         if (var6 != null) {
            this.field38543 = new Properties();

            for (int var7 = 0; var7 < var6.getLength(); var7++) {
               Element var8 = (Element)var6.item(var7);
               String var9 = var8.getAttribute("name");
               String var10 = var8.getAttribute("value");
               this.field38543.setProperty(var9, var10);
            }
         }
      }

      NodeList var11 = var2.getElementsByTagName("object");

      for (int var12 = 0; var12 < var11.getLength(); var12++) {
         Element var13 = (Element)var11.item(var12);
         Class7724 var14 = new Class7724(var1, var13);
         var14.field33160 = var12;
         this.field38540.add(var14);
      }
   }
}
