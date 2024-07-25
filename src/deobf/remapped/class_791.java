package remapped;

import java.util.Properties;

public class class_791 {
   public static final String field_4242 = "id";
   public static final String field_4249 = "fill";
   public static final String field_4247 = "stroke";
   public static final String field_4250 = "opacity";
   public static final String field_4243 = "stroke-width";
   public static final String field_4245 = "stroke-miterlimit";
   public static final String field_4251 = "stroke-dasharray";
   public static final String field_4246 = "stroke-dashoffset";
   public static final String field_4244 = "stroke-opacity";
   public static final String field_4248 = "none";
   private String field_4254 = "";
   private Properties field_4253 = new Properties();

   public class_791(String var1) {
      this.field_4254 = var1;
      this.method_3515("stroke-width", "1");
   }

   private String method_3517(String var1) {
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

   public void method_3515(String var1, String var2) {
      if (var2 == null) {
         var2 = "";
      }

      if (var1.equals("fill")) {
         var2 = this.method_3517(var2);
      }

      if (var1.equals("stroke-opacity") && var2.equals("0")) {
         this.field_4253.setProperty("stroke", "none");
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
         if ("none".equals(this.field_4253.getProperty("stroke"))) {
            return;
         }

         if ("".equals(this.field_4253.getProperty("stroke"))) {
            return;
         }

         var2 = this.method_3517(var2);
      }

      this.field_4253.setProperty(var1, var2);
   }

   public boolean method_3510(String var1) {
      return this.method_3518(var1).startsWith("#");
   }

   public String method_3508() {
      return this.field_4254;
   }

   public String method_3518(String var1) {
      return this.field_4253.getProperty(var1);
   }

   public class_8709 method_3511(String var1) {
      if (this.method_3510(var1)) {
         int var4 = Integer.parseInt(this.method_3518(var1).substring(1), 16);
         return new class_8709(var4);
      } else {
         throw new RuntimeException("Attribute " + var1 + " is not specified as a color:" + this.method_3518(var1));
      }
   }

   public String method_3514(String var1) {
      String var4 = this.method_3518(var1);
      return var4.length() >= 7 ? var4.substring(5, var4.length() - 1) : "";
   }

   public float method_3509(String var1) {
      String var4 = this.method_3518(var1);
      if (var4 == null) {
         return 0.0F;
      } else {
         try {
            return Float.parseFloat(var4);
         } catch (NumberFormatException var6) {
            throw new RuntimeException("Attribute " + var1 + " is not specified as a float:" + this.method_3518(var1));
         }
      }
   }

   public boolean method_3512() {
      return this.method_3510("fill");
   }

   public boolean method_3516() {
      return this.method_3510("stroke") && this.method_3509("stroke-width") > 0.0F;
   }
}
