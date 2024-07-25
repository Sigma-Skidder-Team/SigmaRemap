package remapped;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class class_6335 extends class_6843 {
   private static final Pattern field_32357 = Pattern.compile("^\\s*(//)?\\s*#define\\s+([A-Za-z0-9_]+)\\s*(//.*)?$");
   private static final Pattern field_32356 = Pattern.compile("^\\s*#if(n)?def\\s+([A-Za-z0-9_]+)(\\s*)?$");

   public class_6335(String var1, String var2, String var3, String var4) {
      super(var1, var2, var3, new String[]{"false", "true"}, var3, var4);
   }

   @Override
   public String method_31391() {
      return !method_29007(this.method_31403())
         ? "//#define " + this.method_31405() + " // Shader option OFF"
         : "#define " + this.method_31405() + " // Shader option ON";
   }

   @Override
   public String method_31395(String var1) {
      String var4 = super.method_31395(var1);
      if (var4 == var1) {
         return !method_29007(var1) ? class_3458.method_15902() : class_3458.method_15907();
      } else {
         return var4;
      }
   }

   @Override
   public String method_31381(String var1) {
      return !method_29007(var1) ? "§c" : "§a";
   }

   public static class_6843 method_29008(String var0, String var1) {
      Matcher var4 = field_32357.matcher(var0);
      if (var4.matches()) {
         String var5 = var4.group(1);
         String var6 = var4.group(2);
         String var7 = var4.group(3);
         if (var6 != null && var6.length() > 0) {
            boolean var8 = class_3111.equals(var5, "//");
            boolean var9 = !var8;
            var1 = class_8251.method_37832(var1, "/shaders/");
            return new class_6335(var6, var7, String.valueOf(var9), var1);
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   @Override
   public boolean method_31407(String var1) {
      Matcher var4 = field_32357.matcher(var1);
      if (var4.matches()) {
         String var5 = var4.group(2);
         return var5.matches(this.method_31405());
      } else {
         return false;
      }
   }

   @Override
   public boolean method_31399() {
      return true;
   }

   @Override
   public boolean method_31379(String var1) {
      Matcher var4 = field_32356.matcher(var1);
      if (var4.matches()) {
         String var5 = var4.group(2);
         if (var5.equals(this.method_31405())) {
            return true;
         }
      }

      return false;
   }

   public static boolean method_29007(String var0) {
      return Boolean.valueOf(var0);
   }
}
