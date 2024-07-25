package remapped;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class class_872 extends class_6843 {
   private static final Pattern field_4513 = Pattern.compile("^\\s*#define\\s+(\\w+)\\s+(-?[0-9\\.Ff]+|\\w+)\\s*(//.*)?$");

   public class_872(String var1, String var2, String var3, String[] var4, String var5) {
      super(var1, var2, var3, var4, var3, var5);
      this.method_31400(this.method_31383().length > 1);
   }

   @Override
   public String method_31391() {
      return "#define " + this.method_31405() + " " + this.method_31403() + " // Shader option " + this.method_31403();
   }

   @Override
   public String method_31395(String var1) {
      String var4 = class_6588.method_30244("prefix." + this.method_31405(), "");
      String var5 = super.method_31395(var1);
      String var6 = class_6588.method_30244("suffix." + this.method_31405(), "");
      return var4 + var5 + var6;
   }

   @Override
   public String method_31381(String var1) {
      String var4 = var1.toLowerCase();
      return !var4.equals("false") && !var4.equals("off") ? "§a" : "§c";
   }

   @Override
   public boolean method_31407(String var1) {
      Matcher var4 = field_4513.matcher(var1);
      if (var4.matches()) {
         String var5 = var4.group(1);
         return var5.matches(this.method_31405());
      } else {
         return false;
      }
   }

   public static class_6843 method_3769(String var0, String var1) {
      Matcher var4 = field_4513.matcher(var0);
      if (var4.matches()) {
         String var5 = var4.group(1);
         String var6 = var4.group(2);
         String var7 = var4.group(3);
         String var8 = class_8251.method_37831(var7, "[", "]");
         if (var8 != null && var8.length() > 0) {
            var7 = var7.replace(var8, "").trim();
         }

         String[] var9 = method_3768(var6, var8);
         if (var5 != null && var5.length() > 0) {
            var1 = class_8251.method_37832(var1, "/shaders/");
            return new class_872(var5, var7, var6, var9, var1);
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public static String[] method_3768(String var0, String var1) {
      String[] var4 = new String[]{var0};
      if (var1 != null) {
         var1 = var1.trim();
         var1 = class_8251.method_37832(var1, "[");
         var1 = class_8251.method_37822(var1, "]");
         var1 = var1.trim();
         if (var1.length() > 0) {
            String[] var5 = Config.method_14302(var1, " ");
            if (var5.length > 0) {
               if (!Arrays.<String>asList(var5).contains(var0)) {
                  var5 = (String[]) Config.method_14442(var5, var0, 0);
               }

               return var5;
            } else {
               return var4;
            }
         } else {
            return var4;
         }
      } else {
         return var4;
      }
   }
}
