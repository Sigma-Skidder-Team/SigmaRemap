package remapped;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class class_6383 extends class_872 {
   private String field_32596 = null;
   private static final Pattern field_32595 = Pattern.compile("^\\s*const\\s*(float|int)\\s*([A-Za-z0-9_]+)\\s*=\\s*(-?[0-9\\.]+f?F?)\\s*;\\s*(//.*)?$");

   public class_6383(String var1, String var2, String var3, String var4, String[] var5, String var6) {
      super(var1, var3, var4, var5, var6);
      this.field_32596 = var2;
   }

   @Override
   public String method_31391() {
      return "const " + this.field_32596 + " " + this.method_31405() + " = " + this.method_31403() + "; // Shader option " + this.method_31403();
   }

   @Override
   public boolean method_31407(String var1) {
      Matcher var4 = field_32595.matcher(var1);
      if (var4.matches()) {
         String var5 = var4.group(2);
         return var5.matches(this.method_31405());
      } else {
         return false;
      }
   }

   public static class_6843 method_29170(String var0, String var1) {
      Matcher var4 = field_32595.matcher(var0);
      if (var4.matches()) {
         String var5 = var4.group(1);
         String var6 = var4.group(2);
         String var7 = var4.group(3);
         String var8 = var4.group(4);
         String var9 = class_8251.method_37831(var8, "[", "]");
         if (var9 != null && var9.length() > 0) {
            var8 = var8.replace(var9, "").trim();
         }

         String[] var10 = method_3768(var7, var9);
         if (var6 != null && var6.length() > 0) {
            var1 = class_8251.method_37832(var1, "/shaders/");
            return new class_6383(var6, var5, var8, var7, var10, var1);
         } else {
            return null;
         }
      } else {
         return null;
      }
   }
}
