package mapped;

import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

public class Class8952 {
   private Element field40465;
   private Class9630 field40466;
   private String field40467;

   public Class8952(Element var1) {
      this.field40465 = var1;
      this.field40467 = this.field40465.getTagName();
   }

   public String[] method32703() {
      NamedNodeMap var3 = this.field40465.getAttributes();
      String[] var4 = new String[var3.getLength()];

      for (int var5 = 0; var5 < var4.length; var5++) {
         var4[var5] = var3.item(var5).getNodeName();
      }

      return var4;
   }

   public String method32704() {
      return this.field40467;
   }

   public String method32705(String var1) {
      return this.field40465.getAttribute(var1);
   }

   public String method32706(String var1, String var2) {
      String var5 = this.field40465.getAttribute(var1);
      return var5 != null && var5.length() != 0 ? var5 : var2;
   }

   public int method32707(String var1) throws Class2452 {
      try {
         return Integer.parseInt(this.method32705(var1));
      } catch (NumberFormatException var5) {
         throw new Class2452("Value read: '" + this.method32705(var1) + "' is not an integer", var5);
      }
   }

   public int method32708(String var1, int var2) throws Class2452 {
      try {
         return Integer.parseInt(this.method32706(var1, "" + var2));
      } catch (NumberFormatException var6) {
         throw new Class2452("Value read: '" + this.method32706(var1, "" + var2) + "' is not an integer", var6);
      }
   }

   public double method32709(String var1) throws Class2452 {
      try {
         return Double.parseDouble(this.method32705(var1));
      } catch (NumberFormatException var5) {
         throw new Class2452("Value read: '" + this.method32705(var1) + "' is not a double", var5);
      }
   }

   public double method32710(String var1, double var2) throws Class2452 {
      try {
         return Double.parseDouble(this.method32706(var1, "" + var2));
      } catch (NumberFormatException var7) {
         throw new Class2452("Value read: '" + this.method32706(var1, "" + var2) + "' is not a double", var7);
      }
   }

   public boolean method32711(String var1) throws Class2452 {
      String var4 = this.method32705(var1);
      if (!var4.equalsIgnoreCase("true")) {
         if (!var4.equalsIgnoreCase("false")) {
            throw new Class2452("Value read: '" + this.method32705(var1) + "' is not a boolean");
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   public boolean method32712(String var1, boolean var2) throws Class2452 {
      String var5 = this.method32706(var1, "" + var2);
      if (!var5.equalsIgnoreCase("true")) {
         if (!var5.equalsIgnoreCase("false")) {
            throw new Class2452("Value read: '" + this.method32706(var1, "" + var2) + "' is not a boolean");
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   public String method32713() {
      String var3 = "";
      NodeList var4 = this.field40465.getChildNodes();

      for (int var5 = 0; var5 < var4.getLength(); var5++) {
         if (var4.item(var5) instanceof Text) {
            var3 = var3 + var4.item(var5).getNodeValue();
         }
      }

      return var3;
   }

   public Class9630 method32714() {
      if (this.field40466 == null) {
         NodeList var3 = this.field40465.getChildNodes();
         this.field40466 = new Class9630();

         for (int var4 = 0; var4 < var3.getLength(); var4++) {
            if (var3.item(var4) instanceof Element) {
               this.field40466.method37540(new Class8952((Element)var3.item(var4)));
            }
         }

         return this.field40466;
      } else {
         return this.field40466;
      }
   }

   public Class9630 method32715(String var1) {
      Class9630 var4 = new Class9630();
      Class9630 var5 = this.method32714();

      for (int var6 = 0; var6 < var5.method37541(); var6++) {
         if (var5.method37542(var6).method32704().equals(var1)) {
            var4.method37540(var5.method37542(var6));
         }
      }

      return var4;
   }

   @Override
   public String toString() {
      String var3 = "[XML " + this.method32704();
      String[] var4 = this.method32703();

      for (int var5 = 0; var5 < var4.length; var5++) {
         var3 = var3 + " " + var4[var5] + "=" + this.method32705(var4[var5]);
      }

      return var3 + "]";
   }
}
