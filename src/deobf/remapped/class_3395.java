package remapped;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class class_3395 extends class_6335 {
   private static final Pattern field_16726 = Pattern.compile("^\\s*const\\s*bool\\s*([A-Za-z0-9_]+)\\s*=\\s*(true|false)\\s*;\\s*(//.*)?$");

   public class_3395(String var1, String var2, String var3, String var4) {
      super(var1, var2, var3, var4);
   }

   @Override
   public String method_31391() {
      return "const bool " + this.method_31405() + " = " + this.method_31403() + "; // Shader option " + this.method_31403();
   }

   public static class_6843 method_15686(String var0, String var1) {
      Matcher var4 = field_16726.matcher(var0);
      if (var4.matches()) {
         String var5 = var4.group(1);
         String var6 = var4.group(2);
         String var7 = var4.group(3);
         if (var5 != null && var5.length() > 0) {
            var1 = class_8251.method_37832(var1, "/shaders/");
            class_3395 var8 = new class_3395(var5, var7, var6, var1);
            var8.method_31400(false);
            return var8;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   @Override
   public boolean method_31407(String var1) {
      Matcher var4 = field_16726.matcher(var1);
      if (var4.matches()) {
         String var5 = var4.group(1);
         return var5.matches(this.method_31405());
      } else {
         return false;
      }
   }

   @Override
   public boolean method_31399() {
      return false;
   }
}
