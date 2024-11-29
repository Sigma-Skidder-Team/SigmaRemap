package mapped;

import java.util.Properties;

public class Class6615 {
   public static final String field29104 = "id";
   public static final String field29105 = "fill";
   public static final String field29106 = "stroke";
   public static final String field29107 = "opacity";
   public static final String field29108 = "stroke-width";
   public static final String field29109 = "stroke-miterlimit";
   public static final String field29110 = "stroke-dasharray";
   public static final String field29111 = "stroke-dashoffset";
   public static final String field29112 = "stroke-opacity";
   public static final String field29113 = "none";
   private String field29114 = "";
   private Properties field29115 = new Properties();

   public Class6615(String var1) {
      this.field29114 = var1;
      this.method20114("stroke-width", "1");
   }

   private String method20113(String var1) {
      if (!var1.equals("")) {
         if (!var1.equals("white")) {
            return !var1.equals("black") ? var1 : "#000000";
         } else {
            return "#ffffff";
         }
      } else {
         return "#000000";
      }
   }

   public void method20114(String var1, String var2) {
      if (var2 == null) {
         var2 = "";
      }

      if (var1.equals("fill")) {
         var2 = this.method20113(var2);
      }

      if (var1.equals("stroke-opacity") && var2.equals("0")) {
         this.field29115.setProperty("stroke", "none");
      }

      if (var1.equals("stroke-width")) {
         if (var2.equals("")) {
            var2 = "1";
         }

         if (var2.endsWith("px")) {
            var2 = var2.substring(0, var2.length() - 2);
         }
      }

      if (var1.equals("stroke")) {
         if ("none".equals(this.field29115.getProperty("stroke"))) {
            return;
         }

         if ("".equals(this.field29115.getProperty("stroke"))) {
            return;
         }

         var2 = this.method20113(var2);
      }

      this.field29115.setProperty(var1, var2);
   }

   public boolean method20115(String var1) {
      return this.method20117(var1).startsWith("#");
   }

   public String method20116() {
      return this.field29114;
   }

   public String method20117(String var1) {
      return this.field29115.getProperty(var1);
   }

   public Color method20118(String var1) {
      if (this.method20115(var1)) {
         int var4 = Integer.parseInt(this.method20117(var1).substring(1), 16);
         return new Color(var4);
      } else {
         throw new RuntimeException("Attribute " + var1 + " is not specified as a color:" + this.method20117(var1));
      }
   }

   public String method20119(String var1) {
      String var4 = this.method20117(var1);
      return var4.length() >= 7 ? var4.substring(5, var4.length() - 1) : "";
   }

   public float method20120(String var1) {
      String var4 = this.method20117(var1);
      if (var4 == null) {
         return 0.0F;
      } else {
         try {
            return Float.parseFloat(var4);
         } catch (NumberFormatException var6) {
            throw new RuntimeException("Attribute " + var1 + " is not specified as a float:" + this.method20117(var1));
         }
      }
   }

   public boolean method20121() {
      return this.method20115("fill");
   }

   public boolean method20122() {
      return this.method20115("stroke") && this.method20120("stroke-width") > 0.0F;
   }
}
