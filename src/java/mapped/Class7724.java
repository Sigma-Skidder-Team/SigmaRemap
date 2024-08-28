package mapped;

import java.util.Properties;

import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class Class7724 {
   public int field33160;
   public String field33161;
   public String field33162;
   public int field33163;
   public int field33164;
   public int field33165;
   public int field33166;
   private String field33167;
   public Properties field33168;
   public final Class9466 field33169;

   public Class7724(Class9466 var1, Element var2) throws Class2451 {
      this.field33169 = var1;
      this.field33161 = var2.getAttribute("name");
      this.field33162 = var2.getAttribute("type");
      this.field33163 = Integer.parseInt(var2.getAttribute("x"));
      this.field33164 = Integer.parseInt(var2.getAttribute("y"));
      this.field33165 = Integer.parseInt(var2.getAttribute("width"));
      this.field33166 = Integer.parseInt(var2.getAttribute("height"));
      Element var5 = (Element)var2.getElementsByTagName("image").item(0);
      if (var5 != null) {
         this.field33167 = var5.getAttribute("source");
      }

      Element var6 = (Element)var2.getElementsByTagName("properties").item(0);
      if (var6 != null) {
         NodeList var7 = var6.getElementsByTagName("property");
         if (var7 != null) {
            this.field33168 = new Properties();

            for (int var8 = 0; var8 < var7.getLength(); var8++) {
               Element var9 = (Element)var7.item(var8);
               String var10 = var9.getAttribute("name");
               String var11 = var9.getAttribute("value");
               this.field33168.setProperty(var10, var11);
            }
         }
      }
   }

   // $VF: synthetic method
   public static String method25543(Class7724 var0) {
      return var0.field33167;
   }
}
