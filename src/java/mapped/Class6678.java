package mapped;

import net.optifine.Config;
import net.optifine.shaders.Shaders;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class6678 extends Class6679 {
   private static final Pattern field29276 = Pattern.compile("^\\s*#define\\s+(\\w+)\\s+(-?[0-9\\.Ff]+|\\w+)\\s*(//.*)?$");

   public Class6678(String var1, String var2, String var3, String[] var4, String var5) {
      super(var1, var2, var3, var4, var3, var5);
      this.method20383(this.method20388().length > 1);
   }

   @Override
   public String method20360() {
      return "#define " + this.method20366() + " " + this.method20370() + " // Shader option " + this.method20370();
   }

   @Override
   public String method20361(String var1) {
      String var4 = Shaders.method33144("prefix." + this.method20366(), "");
      String var5 = super.method20361(var1);
      String var6 = Shaders.method33144("suffix." + this.method20366(), "");
      return var4 + var5 + var6;
   }

   @Override
   public String method20362(String var1) {
      String var4 = var1.toLowerCase();
      return !var4.equals("false") && !var4.equals("off") ? "§a" : "§c";
   }

   @Override
   public boolean method20363(String var1) {
      Matcher var4 = field29276.matcher(var1);
      if (var4.matches()) {
         String var5 = var4.group(1);
         return var5.matches(this.method20366());
      } else {
         return false;
      }
   }

   public static Class6679 method20364(String var0, String var1) {
      Matcher var4 = field29276.matcher(var0);
      if (var4.matches()) {
         String var5 = var4.group(1);
         String var6 = var4.group(2);
         String var7 = var4.group(3);
         String var8 = Class9402.method35773(var7, "[", "]");
         if (var8 != null && var8.length() > 0) {
            var7 = var7.replace(var8, "").trim();
         }

         String[] var9 = method20365(var6, var8);
         if (var5 != null && var5.length() > 0) {
            var1 = Class9402.method35762(var1, "/shaders/");
            return new Class6678(var5, var7, var6, var9, var1);
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public static String[] method20365(String var0, String var1) {
      String[] var4 = new String[]{var0};
      if (var1 != null) {
         var1 = var1.trim();
         var1 = Class9402.method35762(var1, "[");
         var1 = Class9402.method35763(var1, "]");
         var1 = var1.trim();
         if (var1.length() > 0) {
            String[] var5 = Config.method26903(var1, " ");
            if (var5.length > 0) {
               if (!Arrays.<String>asList(var5).contains(var0)) {
                  var5 = (String[]) Config.method26949(var5, var0, 0);
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
