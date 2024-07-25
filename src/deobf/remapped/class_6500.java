package remapped;

import org.newdawn.slick.util.xml.SlickXMLException;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

public class class_6500 {
   private Element field_33086;
   private class_9099 field_33087;
   private String field_33088;

   public class_6500(Element var1) {
      this.field_33086 = var1;
      this.field_33088 = this.field_33086.getTagName();
   }

   public String[] method_29631() {
      NamedNodeMap var3 = this.field_33086.getAttributes();
      String[] var4 = new String[var3.getLength()];

      for (int var5 = 0; var5 < var4.length; var5++) {
         var4[var5] = var3.item(var5).getNodeName();
      }

      return var4;
   }

   public String method_29643() {
      return this.field_33088;
   }

   public String method_29634(String var1) {
      return this.field_33086.getAttribute(var1);
   }

   public String method_29635(String var1, String var2) {
      String var5 = this.field_33086.getAttribute(var1);
      return var5 != null && var5.length() != 0 ? var5 : var2;
   }

   public int method_29636(String var1) throws SlickXMLException {
      try {
         return Integer.parseInt(this.method_29634(var1));
      } catch (NumberFormatException var5) {
         throw new class_7178("Value read: '" + this.method_29634(var1) + "' is not an integer", var5);
      }
   }

   public int method_29637(String var1, int var2) throws SlickXMLException {
      try {
         return Integer.parseInt(this.method_29635(var1, "" + var2));
      } catch (NumberFormatException var6) {
         throw new class_7178("Value read: '" + this.method_29635(var1, "" + var2) + "' is not an integer", var6);
      }
   }

   public double method_29641(String var1) throws SlickXMLException {
      try {
         return Double.parseDouble(this.method_29634(var1));
      } catch (NumberFormatException var5) {
         throw new class_7178("Value read: '" + this.method_29634(var1) + "' is not a double", var5);
      }
   }

   public double method_29642(String var1, double var2) throws SlickXMLException {
      try {
         return Double.parseDouble(this.method_29635(var1, "" + var2));
      } catch (NumberFormatException var7) {
         throw new class_7178("Value read: '" + this.method_29635(var1, "" + var2) + "' is not a double", var7);
      }
   }

   public boolean method_29639(String var1) throws SlickXMLException {
      String var4 = this.method_29634(var1);
      if (!var4.equalsIgnoreCase("true")) {
         if (!var4.equalsIgnoreCase("false")) {
            throw new class_7178("Value read: '" + this.method_29634(var1) + "' is not a boolean");
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   public boolean method_29640(String var1, boolean var2) throws SlickXMLException {
      String var5 = this.method_29635(var1, "" + var2);
      if (!var5.equalsIgnoreCase("true")) {
         if (!var5.equalsIgnoreCase("false")) {
            throw new class_7178("Value read: '" + this.method_29635(var1, "" + var2) + "' is not a boolean");
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   public String method_29638() {
      String var3 = "";
      NodeList var4 = this.field_33086.getChildNodes();

      for (int var5 = 0; var5 < var4.getLength(); var5++) {
         if (var4.item(var5) instanceof Text) {
            var3 = var3 + var4.item(var5).getNodeValue();
         }
      }

      return var3;
   }

   public class_9099 method_29633() {
      if (this.field_33087 == null) {
         NodeList var3 = this.field_33086.getChildNodes();
         this.field_33087 = new class_9099();

         for (int var4 = 0; var4 < var3.getLength(); var4++) {
            if (var3.item(var4) instanceof Element) {
               this.field_33087.method_41937(new class_6500((Element)var3.item(var4)));
            }
         }

         return this.field_33087;
      } else {
         return this.field_33087;
      }
   }

   public class_9099 method_29630(String var1) {
      class_9099 var4 = new class_9099();
      class_9099 var5 = this.method_29633();

      for (int var6 = 0; var6 < var5.method_41941(); var6++) {
         if (var5.method_41939(var6).method_29643().equals(var1)) {
            var4.method_41937(var5.method_41939(var6));
         }
      }

      return var4;
   }

   @Override
   public String toString() {
      String var3 = "[XML " + this.method_29643();
      String[] var4 = this.method_29631();

      for (int var5 = 0; var5 < var4.length; var5++) {
         var3 = var3 + " " + var4[var5] + "=" + this.method_29634(var4[var5]);
      }

      return var3 + "]";
   }
}
